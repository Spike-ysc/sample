package henu.yan.sample.repository;

import henu.yan.sample.model.Wallpaper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface WallpaperRepository extends PagingAndSortingRepository<Wallpaper, Integer> {

    /**
     * 根据图片ID获取壁纸，并按浏览次数由高到低排序
     * @param imgKey 图片ID
     * @param p 分页
     * @return 返回该ID的壁纸列表
     */
    @RestResource(path = "imgKey", rel = "imgKey")
    List<Wallpaper> findAllByImgKeyEqualsOrderByViewsDesc(String imgKey, Pageable p);

    /**
     * 获取不同纯度的壁纸，并按浏览次数由高到低排序
     * @param purity 纯度类型
     * @param p 分页
     * @return 返回该纯度的壁纸列表
     */
    @RestResource(path = "purity", rel = "purity")
    List<Wallpaper> findAllByPurityEqualsOrderByViewsDesc(String purity, Pageable p);

    /**
     * 获取不同种类的壁纸，并按浏览次数由高到低排序
     * @param category 壁纸种类
     * @param p 分页
     * @return 返回该种类的壁纸列表
     */
    @RestResource(path = "category", rel = "category")
    List<Wallpaper> findAllByCategoryEqualsOrderByViewsDesc(String category, Pageable p);

    /**
     *  按壁纸纯度和壁纸种类获取壁纸，并按浏览次数由高到低排序
     * @param purity 壁纸纯度，可多个
     * @param category 壁纸种类，可多个
     * @param p 分页
     * @return 返回该壁纸纯度和壁纸种类的壁纸
     */
    @RestResource(path = "type", rel = "type")
    Page<Wallpaper> findAllByPurityInAndCategoryInOrderByViewsDesc(List<String> purity, List<String>  category, Pageable p);

    /**
     * 获取用户上传的所有壁纸，并按浏览次数由高到低排序
     * @param uploader 用户ID
     * @param p 分页
     * @return 返回该用户的所有壁纸
     */
    @RestResource(path = "uploader", rel = "uploader")
    List<Wallpaper> findAllByUploaderEqualsOrderByViewsDesc(String uploader, Pageable p);

    /**
     *  获取不同分辨率的壁纸，并按浏览次数由高到低排序
     * @param imgSize 壁纸分辨率
     * @param p 分页
     * @return 返回该分辨率下的所有壁纸
     */
    @RestResource(path = "imgSize", rel = "imgSize")
    List<Wallpaper> findAllByImgSizeEqualsOrderByViewsDesc(String imgSize, Pageable p);

    /**
     * 返回不同格式的壁纸，主要为JPG和PNG，并按浏览次数由高到低排序
     * @param imgType 壁纸格式
     * @param p 分页
     * @return 返回该格式的所有壁纸
     */
    @RestResource(path = "imgType", rel = "imgType")
    List<Wallpaper> findAllByImgTypeEqualsOrderByViewsDesc(String imgType, Pageable p);

    /**
     * 模糊搜索符合tags的壁纸，并按浏览次数由高到低排序
     * @param tags  tags关键字
     * @param p 分页
     * @return  含有tags关键字的壁纸
     */
    @RestResource(path = "tags", rel = "tags")
    List<Wallpaper> findAllByTagsContainingOrderByViewsDesc(String tags, Pageable p);

    /**
     * 获取不同颜色的壁纸，并按浏览次数由高到低排序
     * @param colors 壁纸颜色，十六进制表示
     * @param p 分页
     * @return 返回该颜色的所有壁纸
     */
    @RestResource(path = "colors", rel = "colors")
    List<Wallpaper> findAllByColorsContainingOrderByViewsDesc(String colors, Pageable p);

    /**
     * 按点亮次数由高到低排序壁纸
     * @param p 分页
     * @return 返回按点亮次数由高到低排列的壁纸
     */
    @RestResource(path = "starOrder", rel = "starOrder")
    List<Wallpaper> findAllByOrderByStarDesc(Pageable p);

    /**
     * 按上传时间由高到低排序壁纸
     * @param p 分页
     * @return 返回按上传时间由高到低排列的壁纸
     */
    @RestResource(path = "timeOrder", rel = "timeOrder")
    List<Wallpaper> findAllByOrderByUploadTimeDesc(Pageable p);

    /**
     * 按观看次数由高到低排序壁纸
     * @param p 分页
     * @return 返回按观看次数由高到低排列的壁纸
     */
    @RestResource(path = "viewOrder", rel = "viewOrder")
    List<Wallpaper> findAllByOrderByViewsDesc(Pageable p);
    /**
     * 按收藏次数由高到低排序壁纸
     * @param p 分页
     * @return 返回按收藏次数由高到低排列的壁纸
     */
    @RestResource(path = "favoritesOrder", rel = "favoritesOrder")
    List<Wallpaper> findAllByOrderByFavoritesDesc(Pageable p);


}
