package com.bytedance.lynx.a.a.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.c;
import h.f.b.g;
import h.f.b.l;

public final class a extends c {
    private boolean hideNavBar;
    private boolean hideStatusBar;
    private com.bytedance.lynx.a.a.e.a navBarColor;
    private String navBtnType;
    private boolean showCloseAll;
    private com.bytedance.lynx.a.a.e.a statusBgColor;
    private String statusFontMode;
    private String title;
    private com.bytedance.lynx.a.a.e.a titleColor;
    private boolean transStatusBar;
    private boolean useWebTitle;

    static {
        Covode.recordClassIndex(25033);
    }

    public a() {
        this(null, 1, null);
    }

    public final boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final boolean getHideStatusBar() {
        return this.hideStatusBar;
    }

    public final com.bytedance.lynx.a.a.e.a getNavBarColor() {
        return this.navBarColor;
    }

    public final String getNavBtnType() {
        return this.navBtnType;
    }

    public final boolean getShowCloseAll() {
        return this.showCloseAll;
    }

    public final com.bytedance.lynx.a.a.e.a getStatusBgColor() {
        return this.statusBgColor;
    }

    public final String getStatusFontMode() {
        return this.statusFontMode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final com.bytedance.lynx.a.a.e.a getTitleColor() {
        return this.titleColor;
    }

    public final boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public final boolean getUseWebTitle() {
        return this.useWebTitle;
    }

    public final void setHideNavBar(boolean z) {
        this.hideNavBar = z;
    }

    public final void setHideStatusBar(boolean z) {
        this.hideStatusBar = z;
    }

    public final void setNavBarColor(com.bytedance.lynx.a.a.e.a aVar) {
        this.navBarColor = aVar;
    }

    public final void setNavBtnType(String str) {
        this.navBtnType = str;
    }

    public final void setShowCloseAll(boolean z) {
        this.showCloseAll = z;
    }

    public final void setStatusBgColor(com.bytedance.lynx.a.a.e.a aVar) {
        this.statusBgColor = aVar;
    }

    public final void setStatusFontMode(String str) {
        this.statusFontMode = str;
    }

    public final void setTitleColor(com.bytedance.lynx.a.a.e.a aVar) {
        this.titleColor = aVar;
    }

    public final void setTransStatusBar(boolean z) {
        this.transStatusBar = z;
    }

    public final void setUseWebTitle(boolean z) {
        this.useWebTitle = z;
    }

    public final void setTitle(String str) {
        l.c(str, "");
        this.title = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(cVar);
        l.c(cVar, "");
        this.title = "";
        this.useWebTitle = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? c.UNKNOWN : cVar);
    }
}
