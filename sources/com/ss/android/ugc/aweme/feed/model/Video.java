package com.ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.model.VideoTag;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class Video implements Serializable {
    @c(a = "ai_static_cover")
    public UrlModel aiCover;
    @c(a = "ai_dynamic_cover")
    public UrlModel aiDynamicCover;
    @c(a = "ai_dynamic_cover_bak")
    public UrlModel aiDynamicCoverBak;
    @c(a = "animated_cover")
    public UrlModel animatedCover;
    @c(a = "bit_rate")
    public List<BitRate> bitRate;
    public int[] cachedOuterCoverSize;
    public UrlModel cachedOuterCoverUrl;
    @c(a = "caption_download_addr")
    public UrlModel captionDownloadAddr;
    @c(a = "cla_info")
    public CaptionModel captionModel;
    @c(a = "cover")
    public UrlModel cover;
    @c(a = "video_model")
    public String dVideoModel;
    @c(a = "download_addr")
    public UrlModel downloadAddr;
    @c(a = "token_auth")
    public PlayTokenAuth drmTokenAuth;
    @c(a = "dynamic_cover")
    public UrlModel dynamicCover;
    @c(a = "is_drm_source")
    public boolean enableIntertrustDrm;
    @c(a = "play_addr_h264")
    public VideoUrlModel h264PlayAddr;
    @c(a = "height")
    public int height;
    @c(a = "is_callback")
    public boolean isCallback;
    @c(a = "cover_is_custom")
    public boolean isCustomCover;
    @c(a = "is_long_video")
    public boolean isLongVideo;
    @c(a = "meta")
    public String meta;
    @c(a = "misc_download_addrs")
    public String miscDownloadAddrs;
    @c(a = "need_set_token")
    public boolean needSetCookie;
    @c(a = "new_download_addr")
    public UrlModel newDownloadAddr;
    @c(a = "origin_cover")
    public UrlModel originCover;
    @c(a = "real_duration")
    public int pilotLength;
    @c(a = "play_addr")
    public VideoUrlModel playAddr;
    @c(a = "play_addr_bytevc1")
    public VideoUrlModel playAddrBytevc1;
    @c(a = "ratio")
    public String ratio;
    @c(a = "ui_alike_download_addr")
    public UrlModel uiAlikeAddr;
    public String videoAdTag;
    @c(a = "duration")
    public int videoLength;
    @c(a = "tag")
    public VideoTag videoTag;
    @c(a = "tags")
    public List<VideoTag> videoTags;
    @c(a = "width")
    public int width;

    static {
        Covode.recordClassIndex(59466);
    }

    public boolean isLowBr() {
        return false;
    }

    public boolean enableIntertrustDrm() {
        return this.enableIntertrustDrm;
    }

    public UrlModel getAiCover() {
        return this.aiCover;
    }

    public UrlModel getAiDynamicCover() {
        return this.aiDynamicCover;
    }

    public UrlModel getAiDynamicCoverBak() {
        return this.aiDynamicCoverBak;
    }

    public UrlModel getAnimatedCover() {
        return this.animatedCover;
    }

    public List<BitRate> getBitRate() {
        return this.bitRate;
    }

    public int[] getCachedOuterCoverSize() {
        return this.cachedOuterCoverSize;
    }

    public UrlModel getCachedOuterCoverUrl() {
        return this.cachedOuterCoverUrl;
    }

    public UrlModel getCaptionDownloadAddr() {
        return this.captionDownloadAddr;
    }

    public CaptionModel getCaptionModel() {
        return this.captionModel;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDownloadAddr() {
        return this.downloadAddr;
    }

    public PlayTokenAuth getDrmTokenAuth() {
        return this.drmTokenAuth;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public VideoUrlModel getH264PlayAddr() {
        return this.h264PlayAddr;
    }

    public int getHeight() {
        return this.height;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getMiscDownloadAddrs() {
        return this.miscDownloadAddrs;
    }

    public UrlModel getNewDownloadAddr() {
        return this.newDownloadAddr;
    }

    public int getPilotLength() {
        return this.pilotLength;
    }

    public String getRatio() {
        return this.ratio;
    }

    public UrlModel getUIAlikeDownloadAddr() {
        return this.uiAlikeAddr;
    }

    public String getVideoAdTag() {
        return this.videoAdTag;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public String getVideoModelStr() {
        return this.dVideoModel;
    }

    public VideoTag getVideoTag() {
        return this.videoTag;
    }

    public List<VideoTag> getVideoTags() {
        return this.videoTags;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isCallback() {
        return this.isCallback;
    }

    public boolean isCustomCover() {
        return this.isCustomCover;
    }

    public boolean isLongVideo() {
        return this.isLongVideo;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public VideoUrlModel getProperPlayAddr() {
        return getPlayAddr();
    }

    public boolean isCoverValid() {
        return isUrlModelValid(this.cover);
    }

    public boolean isOriginCoverValid() {
        return isUrlModelValid(this.originCover);
    }

    public String getVideoId() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getVid();
        }
        return null;
    }

    public String getVideoIdApiHost() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        PlayTokenAuth playTokenAuth = this.drmTokenAuth;
        if (playTokenAuth != null) {
            return playTokenAuth.getToken();
        }
        return null;
    }

    public UrlModel getOriginCover() {
        if (isOriginCoverValid() || !isCoverValid()) {
            return this.originCover;
        }
        return this.cover;
    }

    public VideoUrlModel getPlayAddrBytevc1() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setBytevc1(true);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        return this.playAddrBytevc1;
    }

    public VideoUrlModel getPlayAddrH264() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null) {
            videoUrlModel.setBytevc1(false);
            this.playAddr.setRatio(this.ratio);
        }
        return this.playAddr;
    }

    private void checkBitRateAndDurationCopy() {
        List<BitRate> list;
        List<BitRate> list2;
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (!(videoUrlModel == null || videoUrlModel.getBitRate() == (list2 = this.bitRate))) {
            this.playAddrBytevc1.setBitRate(list2);
            this.playAddrBytevc1.setDuration((double) this.videoLength);
            this.playAddrBytevc1.setBytevc1(true);
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null && videoUrlModel2.getBitRate() != (list = this.bitRate)) {
            this.playAddr.setBitRate(list);
            this.playAddr.setDuration((double) this.videoLength);
            this.playAddr.setBytevc1(false);
        }
    }

    public VideoUrlModel getPlayAddr() {
        checkBitRateAndDurationCopy();
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setBytevc1(true);
            this.playAddrBytevc1.setRatio(this.ratio);
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setBytevc1(false);
            this.playAddr.setRatio(this.ratio);
        }
        if (checkVideo(this.playAddrBytevc1)) {
            return this.playAddrBytevc1;
        }
        return this.playAddr;
    }

    public String toString() {
        return "Video{playAddr=" + this.playAddr + ", playAddrBytevc1=" + this.playAddrBytevc1 + ", cover=" + this.cover + ", dynamicCover=" + this.dynamicCover + ", originCover=" + this.originCover + ", height=" + this.height + ", width=" + this.width + ", ratio='" + this.ratio + '\'' + ", downloadAddr=" + this.downloadAddr + ", videoLength=" + this.videoLength + ", bitRate=" + this.bitRate + ", newDownloadAddr=" + this.newDownloadAddr + ", needSetCookie=" + this.needSetCookie + ", misc_download_addrs=" + this.miscDownloadAddrs + ", isCallback=" + this.isCallback + ", isLongVideo=" + this.isLongVideo + ", meta=" + this.meta + '}';
    }

    public void setAiDynamicCover(UrlModel urlModel) {
        this.aiDynamicCover = urlModel;
    }

    public void setAiDynamicCoverBak(UrlModel urlModel) {
        this.aiDynamicCoverBak = urlModel;
    }

    public void setAnimatedCover(UrlModel urlModel) {
        this.animatedCover = urlModel;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setCachedOuterCoverSize(int[] iArr) {
        this.cachedOuterCoverSize = iArr;
    }

    public void setCachedOuterCoverUrl(UrlModel urlModel) {
        this.cachedOuterCoverUrl = urlModel;
    }

    public void setCallback(boolean z) {
        this.isCallback = z;
    }

    public void setCaptionModel(CaptionModel captionModel2) {
        this.captionModel = captionModel2;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDownloadAddr(UrlModel urlModel) {
        this.downloadAddr = urlModel;
    }

    public void setDrmTokenAuth(PlayTokenAuth playTokenAuth) {
        this.drmTokenAuth = playTokenAuth;
    }

    public void setDuration(double d2) {
        this.videoLength = (int) d2;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.enableIntertrustDrm = z;
    }

    public void setHeight(int i2) {
        this.height = i2;
    }

    public void setMeta(String str) {
        this.meta = str;
    }

    public void setMiscDownloadAddrs(String str) {
        this.miscDownloadAddrs = str;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setNewDownloadAddr(UrlModel urlModel) {
        this.newDownloadAddr = urlModel;
    }

    public void setOriginCover(UrlModel urlModel) {
        this.originCover = urlModel;
    }

    public void setPlayAddr(VideoUrlModel videoUrlModel) {
        this.playAddr = videoUrlModel;
    }

    public void setPlayAddrBytevc1(VideoUrlModel videoUrlModel) {
        this.playAddrBytevc1 = videoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVideoLength(int i2) {
        this.videoLength = i2;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoTag(VideoTag videoTag2) {
        this.videoTag = videoTag2;
    }

    public void setVideoTags(List<VideoTag> list) {
        this.videoTags = list;
    }

    public void setWidth(int i2) {
        this.width = i2;
    }

    private static boolean isUrlModelValid(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public void setVideoAdTag(String str) {
        this.videoAdTag = str;
        VideoUrlModel videoUrlModel = this.playAddr;
        if (videoUrlModel != null) {
            videoUrlModel.setVideoAdTag(str);
        }
        VideoUrlModel videoUrlModel2 = this.playAddrBytevc1;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setVideoAdTag(str);
        }
        VideoUrlModel videoUrlModel3 = this.h264PlayAddr;
        if (videoUrlModel3 != null) {
            videoUrlModel3.setVideoAdTag(str);
        }
    }

    public boolean checkVideo(UrlModel urlModel) {
        List<String> urlList;
        if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null || urlList.isEmpty())) {
            Iterator<String> it = urlList.iterator();
            while (it.hasNext()) {
                if (TextUtils.isEmpty(it.next())) {
                    it.remove();
                }
            }
            if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public void setRationAndSourceId(String str) {
        VideoUrlModel videoUrlModel = this.playAddrBytevc1;
        if (videoUrlModel != null) {
            videoUrlModel.setRatio(this.ratio).setSourceId(str);
            this.playAddrBytevc1.setBytevc1(true);
        }
        VideoUrlModel videoUrlModel2 = this.playAddr;
        if (videoUrlModel2 != null) {
            videoUrlModel2.setRatio(this.ratio).setSourceId(str);
            this.playAddr.setBytevc1(false);
        }
    }
}
