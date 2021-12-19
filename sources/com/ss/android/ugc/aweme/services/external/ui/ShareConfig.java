package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.ad;
import h.f.b.l;
import java.util.List;

public final class ShareConfig {
    private String appName;
    private String file;
    private List<String> imageList;
    private final ad shareContext;
    private final int type;
    private List<String> videoList;

    static {
        Covode.recordClassIndex(79717);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getFile() {
        return this.file;
    }

    public final List<String> getImageList() {
        return this.imageList;
    }

    public final ad getShareContext() {
        return this.shareContext;
    }

    public final int getType() {
        return this.type;
    }

    public final List<String> getVideoList() {
        return this.videoList;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setFile(String str) {
        this.file = str;
    }

    public final void setImageList(List<String> list) {
        this.imageList = list;
    }

    public final void setVideoList(List<String> list) {
        this.videoList = list;
    }

    public ShareConfig(ad adVar, int i2) {
        l.d(adVar, "");
        this.shareContext = adVar;
        this.type = i2;
    }
}
