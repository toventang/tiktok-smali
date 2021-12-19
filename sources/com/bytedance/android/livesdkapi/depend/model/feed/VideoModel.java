package com.bytedance.android.livesdkapi.depend.model.feed;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class VideoModel {
    private static final a DEFAULT_COVER_TYPE = a.LARGE;
    @c(a = "allow_cache")
    private boolean allowCache;
    @c(a = "avg_color")
    private int avgColor;
    @c(a = "cover_medium")
    private ImageModel coverMediumModel;
    @c(a = "cover")
    private ImageModel coverModel;
    @c(a = "cover_thumb")
    private ImageModel coverThumbModel;
    @c(a = "download_url")
    private List<String> downloadList;
    @c(a = "duration")
    private double duration;
    @c(a = "dynamic_cover")
    private ImageModel dynamicCoverModel;
    @c(a = "height")
    private int height;
    private a mCoverType = DEFAULT_COVER_TYPE;
    @c(a = "preload_size")
    private int preloadSize = 512000;
    @c(a = "quality_info")
    private List<Object> qualityInfo;
    @c(a = "uri")
    private String uri;
    @c(a = "url_list")
    private List<String> urlList;
    @c(a = "width")
    private int width;

    public List<Object> getBitRate() {
        return this.qualityInfo;
    }

    public ImageModel getCoverMediumModel() {
        return this.coverMediumModel;
    }

    public ImageModel getCoverModel() {
        return this.coverModel;
    }

    public ImageModel getCoverThumbModel() {
        return this.coverThumbModel;
    }

    public a getCoverType() {
        return this.mCoverType;
    }

    public List<String> getDownloadList() {
        return this.downloadList;
    }

    public double getDuration() {
        return this.duration;
    }

    public ImageModel getDynamicCoverModel() {
        return this.dynamicCoverModel;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPreloadSize() {
        return this.preloadSize;
    }

    public List<Object> getQualityInfo() {
        return this.qualityInfo;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowCache() {
        return this.allowCache;
    }

    static {
        Covode.recordClassIndex(13644);
    }

    public String getUnbitratedUri() {
        if (TextUtils.isEmpty(getUri())) {
            return "";
        }
        return getUri();
    }

    public enum a {
        LARGE,
        MEDIUM,
        THUMB;

        static {
            Covode.recordClassIndex(13645);
        }
    }

    public void setAllowCache(boolean z) {
        this.allowCache = z;
    }

    public void setCoverMediumModel(ImageModel imageModel) {
        this.coverMediumModel = imageModel;
    }

    public void setCoverModel(ImageModel imageModel) {
        this.coverModel = imageModel;
    }

    public void setCoverThumbModel(ImageModel imageModel) {
        this.coverThumbModel = imageModel;
    }

    public void setCoverType(a aVar) {
        this.mCoverType = aVar;
    }

    public void setDownloadList(List<String> list) {
        this.downloadList = list;
    }

    public void setDuration(double d2) {
        this.duration = d2;
    }

    public void setDynamicCoverModel(ImageModel imageModel) {
        this.dynamicCoverModel = imageModel;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setPreloadSize(int i2) {
        this.preloadSize = i2;
    }

    public void setQualityInfo(List<Object> list) {
        this.qualityInfo = list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }
}
