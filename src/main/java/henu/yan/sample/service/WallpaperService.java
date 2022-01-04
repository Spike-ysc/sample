package henu.yan.sample.service;

import henu.yan.sample.model.Wallpaper;
import henu.yan.sample.repository.WallpaperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@CacheConfig(cacheNames = "wallpaper_cache")    //使用的Ehcache策略，定义在ehcache.xml中
@Service
public class WallpaperService {
    @Autowired
    WallpaperRepository wallpaperRepository;
//    private final WallpaperRepository wallpaperRepository;

//    public WallpaperService(WallpaperRepository wallpaperRepository){
//        this.wallpaperRepository = wallpaperRepository;
//    }


    @Cacheable  //缓存该方法
    public Slice<Wallpaper> queryPageByCategoryAndPurity(List<String> category, List<String> purity, Integer pageNo, Integer pageSize){
        return wallpaperRepository.findAllByCategoryInAndPurityIn(category, purity, PageRequest.of(pageNo, pageSize));
    }


    @Cacheable  //缓存该方法
    public Slice<Wallpaper> queryPageByTags(String tags, List<String> category, List<String> purity, Integer pageNo, Integer pageSize){
        return wallpaperRepository.findAllByTagsContainingAndCategoryInAndPurityIn(tags, category, purity, PageRequest.of(pageNo, pageSize));
    }
    @Cacheable//缓存该方法
    public Slice<Wallpaper> queryPageByColors(String colors, List<String> category, List<String> purity, Integer pageNo, Integer pageSize){
        return wallpaperRepository.findAllByColorsStartingWithAndCategoryInAndPurityIn(colors, category, purity, PageRequest.of(pageNo, pageSize));
    }

    @Cacheable//缓存该方法
    public Slice<Wallpaper> queryPageByColorsDim(String colors, List<String> category, List<String> purity, Integer pageNo, Integer pageSize){
        return wallpaperRepository.findAllByColorsContainingAndCategoryInAndPurityIn(colors, category, purity, PageRequest.of(pageNo, pageSize));
    }
    @Cacheable//缓存该方法
    public Slice<Wallpaper> queryPageByTime(List<String> category, List<String> purity, Integer pageNo, Integer pageSize){
        return wallpaperRepository.findAllByCategoryInAndPurityInOrderByUploadTimeDesc(category, purity, PageRequest.of(pageNo, pageSize));
    }

//    @Cacheable//缓存该方法
    //不缓存防止无法更新最新数据
    public List<Wallpaper> querySqlByUploadTime(List<String> category, List<String> purity, Integer page, Integer size){
        Integer offset = page * size;
        return wallpaperRepository.findSQLByUploadTime(category, purity, offset, size);
    }

}
