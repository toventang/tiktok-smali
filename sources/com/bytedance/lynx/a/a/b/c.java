package com.bytedance.lynx.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.a.a.e.a;
import com.bytedance.lynx.hybrid.h.b;
import h.f.b.g;
import h.f.b.l;

public class c extends b {
    private boolean blockBackPress;
    private a containerBgColor;
    private boolean disableBackPress;
    private boolean disableHardwareAccelerate;
    private String fallbackUrl;
    private boolean hideLoading;
    private a loadingBgColor;
    private String url;

    static {
        Covode.recordClassIndex(25035);
    }

    public c() {
        this(null, 1, null);
    }

    public final boolean getBlockBackPress() {
        return this.blockBackPress;
    }

    public final a getContainerBgColor() {
        return this.containerBgColor;
    }

    public final boolean getDisableBackPress() {
        return this.disableBackPress;
    }

    public final boolean getDisableHardwareAccelerate() {
        return this.disableHardwareAccelerate;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final boolean getHideLoading() {
        return this.hideLoading;
    }

    public final a getLoadingBgColor() {
        return this.loadingBgColor;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setBlockBackPress(boolean z) {
        this.blockBackPress = z;
    }

    public final void setContainerBgColor(a aVar) {
        this.containerBgColor = aVar;
    }

    public final void setDisableBackPress(boolean z) {
        this.disableBackPress = z;
    }

    public final void setDisableHardwareAccelerate(boolean z) {
        this.disableHardwareAccelerate = z;
    }

    public final void setHideLoading(boolean z) {
        this.hideLoading = z;
    }

    public final void setLoadingBgColor(a aVar) {
        this.loadingBgColor = aVar;
    }

    public final void setFallbackUrl(String str) {
        l.c(str, "");
        this.fallbackUrl = str;
    }

    public final void setUrl(String str) {
        l.c(str, "");
        this.url = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(com.bytedance.lynx.hybrid.a.c cVar) {
        super(cVar);
        l.c(cVar, "");
        this.url = "";
        this.fallbackUrl = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(com.bytedance.lynx.hybrid.a.c cVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? com.bytedance.lynx.hybrid.a.c.UNKNOWN : cVar);
    }
}
