package henu.yan.sample.controller;

import henu.yan.sample.model.Wallpaper;
import henu.yan.sample.service.WallpaperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WallpaperController {
    @Autowired
    WallpaperService wallpaperService;

    @GetMapping("/api/wallpaper/type-list")
    public Slice<Wallpaper> wallpaperByCategoryAndPurity(
            @RequestParam("category") List<String> category,
            @RequestParam("purity") List<String> purity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size){
        Slice<Wallpaper> wallpapers = wallpaperService.queryPageByCategoryAndPurity(category, purity, page, size);
        return wallpapers;
    }

    @GetMapping("/api/wallpaper/tag-list")
    public Slice<Wallpaper> wallpaperByTags(
            @RequestParam("tags") String tags,
            @RequestParam("category") List<String> category,
            @RequestParam("purity") List<String> purity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size){
        Slice<Wallpaper> wallpapers = wallpaperService.queryPageByTags(tags, category, purity, page, size);
        return wallpapers;
    }

    @GetMapping("/api/wallpaper/color-list")
    public Slice<Wallpaper> wallpaperByColors(
            @RequestParam("colors") String colors,
            @RequestParam("category") List<String> category,
            @RequestParam("purity") List<String> purity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size){
        Slice<Wallpaper> wallpapers = wallpaperService.queryPageByColors(colors, category, purity, page, size);
        return wallpapers;
    }

    @GetMapping("/api/wallpaper/color-list-dim")
    public Slice<Wallpaper> wallpaperByColorsDim(
            @RequestParam("colors") String colors,
            @RequestParam("category") List<String> category,
            @RequestParam("purity") List<String> purity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size){
        Slice<Wallpaper> wallpapers = wallpaperService.queryPageByColorsDim(colors, category, purity, page, size);
        return wallpapers;
    }

    @GetMapping("/api/wallpaper/time")
    public Slice<Wallpaper> wallpaperByTime(
            @RequestParam("category") List<String> category,
            @RequestParam("purity") List<String> purity,
            @RequestParam("page") Integer page,
            @RequestParam("size") Integer size){
        Slice<Wallpaper> wallpapers = wallpaperService.queryPageByTime( category, purity, page, size);
        return wallpapers;
    }

    @GetMapping("/api/wallpaper/upload-time")
    public List<Wallpaper> wallpapersUploadTime(
            @RequestParam(value = "category", defaultValue = "Anime") List<String> category,
            @RequestParam(value = "purity", defaultValue = "SFW") List<String> purity,
            @RequestParam(value = "page", defaultValue = "0") Integer page,
            @RequestParam(value = "size", defaultValue = "24") Integer size){
        return  wallpaperService.querySqlByUploadTime(category, purity, page, size);
    }
}
