package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;

public final class VideoInfo {
    private final UrlModel cover;
    @c(a = "link_info")
    private final LinkInfo linkInfo;

    static {
        Covode.recordClassIndex(64094);
    }

    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, UrlModel urlModel, LinkInfo linkInfo2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = videoInfo.cover;
        }
        if ((i2 & 2) != 0) {
            linkInfo2 = videoInfo.linkInfo;
        }
        return videoInfo.copy(urlModel, linkInfo2);
    }

    public final UrlModel component1() {
        return this.cover;
    }

    public final LinkInfo component2() {
        return this.linkInfo;
    }

    public final VideoInfo copy(UrlModel urlModel, LinkInfo linkInfo2) {
        l.d(urlModel, "");
        l.d(linkInfo2, "");
        return new VideoInfo(urlModel, linkInfo2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return l.a(this.cover, videoInfo.cover) && l.a(this.linkInfo, videoInfo.linkInfo);
    }

    public final int hashCode() {
        UrlModel urlModel = this.cover;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        LinkInfo linkInfo2 = this.linkInfo;
        if (linkInfo2 != null) {
            i2 = linkInfo2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "VideoInfo(cover=" + this.cover + ", linkInfo=" + this.linkInfo + ")";
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final LinkInfo getLinkInfo() {
        return this.linkInfo;
    }

    public VideoInfo(UrlModel urlModel, LinkInfo linkInfo2) {
        l.d(urlModel, "");
        l.d(linkInfo2, "");
        this.cover = urlModel;
        this.linkInfo = linkInfo2;
    }
}
