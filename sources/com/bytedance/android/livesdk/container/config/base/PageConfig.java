package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.live.b.g;
import com.bytedance.android.livesdk.container.a.a;
import com.bytedance.android.livesdk.container.config.live.LivePageConfig;
import com.bytedance.android.livesdk.container.j.c;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Field;

public final class PageConfig extends HybridConfig {
    private LivePageConfig extraConfig;
    @a(a = "hide_nav_bar")
    private boolean hideNavBar;
    @a(a = "hide_status_bar")
    private boolean hideStatusBar;
    @a(a = "nav_bar_color")
    private HColor navBarColor;
    @a(a = "nav_btn_type")
    private String navBtnType;
    @a(a = "show_closeall")
    private boolean showCloseAll;
    @a(a = "status_bar_bg_color")
    private HColor statusBgColor;
    @a(a = "status_font_mode")
    private String statusFontMode;
    @a(a = "title")
    private String title;
    @a(a = "title_color")
    private HColor titleColor;
    @a(a = "trans_status_bar")
    private boolean transStatusBar;

    static {
        Covode.recordClassIndex(9294);
    }

    public PageConfig() {
        this(null, 1, null);
    }

    public final LivePageConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final boolean getHideNavBar() {
        return this.hideNavBar;
    }

    public final boolean getHideStatusBar() {
        return this.hideStatusBar;
    }

    public final HColor getNavBarColor() {
        return this.navBarColor;
    }

    public final String getNavBtnType() {
        return this.navBtnType;
    }

    public final boolean getShowCloseAll() {
        return this.showCloseAll;
    }

    public final HColor getStatusBgColor() {
        return this.statusBgColor;
    }

    public final String getStatusFontMode() {
        return this.statusFontMode;
    }

    public final String getTitle() {
        return this.title;
    }

    public final HColor getTitleColor() {
        return this.titleColor;
    }

    public final boolean getTransStatusBar() {
        return this.transStatusBar;
    }

    public final void setExtraConfig(LivePageConfig livePageConfig) {
        this.extraConfig = livePageConfig;
    }

    public final void setHideNavBar(boolean z) {
        this.hideNavBar = z;
    }

    public final void setHideStatusBar(boolean z) {
        this.hideStatusBar = z;
    }

    public final void setNavBarColor(HColor hColor) {
        this.navBarColor = hColor;
    }

    public final void setNavBtnType(String str) {
        this.navBtnType = str;
    }

    public final void setShowCloseAll(boolean z) {
        this.showCloseAll = z;
    }

    public final void setStatusBgColor(HColor hColor) {
        this.statusBgColor = hColor;
    }

    public final void setStatusFontMode(String str) {
        this.statusFontMode = str;
    }

    public final void setTitleColor(HColor hColor) {
        this.titleColor = hColor;
    }

    public final void setTransStatusBar(boolean z) {
        this.transStatusBar = z;
    }

    public final void setTitle(String str) {
        l.d(str, "");
        this.title = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.container.config.base.HybridConfig
    public final void checkSchema(Uri uri) {
        com.bytedance.android.livesdk.container.i.a<?> lynxCustomReport;
        com.bytedance.android.livesdk.container.i.a<WebView> webViewCustomReport;
        l.d(uri, "");
        super.checkSchema(uri);
        if (com.bytedance.android.livesdk.container.j.a.f16803c.contains(uri.getHost())) {
            return;
        }
        if (getEngineType() == com.bytedance.android.livesdk.container.d.a.WEB_VIEW) {
            g gVar = (g) com.bytedance.android.live.t.a.a(g.class);
            if (gVar != null && (webViewCustomReport = gVar.getWebViewCustomReport()) != null) {
                String uri2 = uri.toString();
                l.b(uri2, "");
                webViewCustomReport.c(uri2);
                return;
            }
            return;
        }
        g gVar2 = (g) com.bytedance.android.live.t.a.a(g.class);
        if (gVar2 != null && (lynxCustomReport = gVar2.getLynxCustomReport()) != null) {
            String uri3 = uri.toString();
            l.b(uri3, "");
            lynxCustomReport.c(uri3);
        }
    }

    public PageConfig(Uri uri) {
        super(uri);
        String a2;
        String queryParameter;
        String a3;
        String queryParameter2;
        this.title = "";
        if (uri != null) {
            setOriginUri(uri.toString());
            Class<PageConfig> cls = PageConfig.class;
            while (true) {
                if (cls == null) {
                    break;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                l.b(declaredFields, "");
                for (Field field : declaredFields) {
                    a aVar = (a) field.getAnnotation(a.class);
                    if (!(aVar == null || (queryParameter2 = uri.getQueryParameter((a3 = aVar.a()))) == null)) {
                        l.b(queryParameter2, "");
                        l.b(field, "");
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        l.b(type, "");
                        field.set(this, c.a(uri, a3, queryParameter2, type));
                    }
                }
                cls = cls.getSuperclass();
            }
            Class<LivePageConfig> cls2 = LivePageConfig.class;
            LivePageConfig newInstance = cls2.newInstance();
            do {
                Field[] declaredFields2 = cls2.getDeclaredFields();
                l.b(declaredFields2, "");
                for (Field field2 : declaredFields2) {
                    a aVar2 = (a) field2.getAnnotation(a.class);
                    if (!(aVar2 == null || (queryParameter = uri.getQueryParameter((a2 = aVar2.a()))) == null)) {
                        l.b(queryParameter, "");
                        l.b(field2, "");
                        field2.setAccessible(true);
                        Class<?> type2 = field2.getType();
                        l.b(type2, "");
                        field2.set(newInstance, c.a(uri, a2, queryParameter, type2));
                    }
                }
                cls2 = cls2.getSuperclass();
            } while (cls2 != null);
            this.extraConfig = newInstance;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageConfig(Uri uri, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? null : uri);
    }
}
