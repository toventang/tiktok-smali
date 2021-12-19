package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.live.b.g;
import com.bytedance.android.livesdk.container.a.a;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public abstract class HybridConfig implements Serializable {
    @a(a = "container_bg_color")
    private HColor containerBgColor;
    @a(a = "disable_back_press")
    private boolean disableBackPress;
    @a(a = "disable_builtin")
    private boolean disableBuiltin;
    @a(a = "disable_offline")
    private boolean disableOffline;
    @a(a = "enable_canvas")
    private boolean enableCanvas;
    private com.bytedance.android.livesdk.container.d.a engineType;
    @a(a = "fallback_url")
    private String fallbackUrl;
    @a(a = "hide_loading")
    private boolean hideLoading;
    @a(a = "initial_data")
    private String initialData;
    @a(a = "loading_bg_color")
    private HColor loadingBgColor;
    private String originUri;
    @a(a = "url")
    private String url;

    static {
        Covode.recordClassIndex(9293);
    }

    public HybridConfig() {
        this(null, 1, null);
    }

    public final HColor getContainerBgColor() {
        return this.containerBgColor;
    }

    public final boolean getDisableBackPress() {
        return this.disableBackPress;
    }

    public final boolean getDisableBuiltin() {
        return this.disableBuiltin;
    }

    public final boolean getDisableOffline() {
        return this.disableOffline;
    }

    public final boolean getEnableCanvas() {
        return this.enableCanvas;
    }

    public final com.bytedance.android.livesdk.container.d.a getEngineType() {
        return this.engineType;
    }

    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final boolean getHideLoading() {
        return this.hideLoading;
    }

    public final String getInitialData() {
        return this.initialData;
    }

    public final HColor getLoadingBgColor() {
        return this.loadingBgColor;
    }

    public final String getOriginUri() {
        return this.originUri;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setContainerBgColor(HColor hColor) {
        this.containerBgColor = hColor;
    }

    public final void setDisableBackPress(boolean z) {
        this.disableBackPress = z;
    }

    public final void setDisableBuiltin(boolean z) {
        this.disableBuiltin = z;
    }

    public final void setDisableOffline(boolean z) {
        this.disableOffline = z;
    }

    public final void setEnableCanvas(boolean z) {
        this.enableCanvas = z;
    }

    public final void setHideLoading(boolean z) {
        this.hideLoading = z;
    }

    public final void setLoadingBgColor(HColor hColor) {
        this.loadingBgColor = hColor;
    }

    public final void setOriginUri(String str) {
        this.originUri = str;
    }

    public final void setEngineType(com.bytedance.android.livesdk.container.d.a aVar) {
        l.d(aVar, "");
        this.engineType = aVar;
    }

    public final void setFallbackUrl(String str) {
        l.d(str, "");
        this.fallbackUrl = str;
    }

    public final void setInitialData(String str) {
        l.d(str, "");
        this.initialData = str;
    }

    public final void setUrl(String str) {
        l.d(str, "");
        this.url = str;
    }

    public HybridConfig(Uri uri) {
        com.bytedance.android.livesdk.container.d.a aVar;
        this.engineType = com.bytedance.android.livesdk.container.d.a.WEB_VIEW;
        this.url = "";
        this.fallbackUrl = "";
        this.initialData = "";
        if (uri != null) {
            this.originUri = uri.toString();
            if (com.bytedance.android.livesdk.container.j.a.f16802b.contains(uri.getHost())) {
                aVar = com.bytedance.android.livesdk.container.d.a.LYNX;
            } else {
                aVar = com.bytedance.android.livesdk.container.d.a.WEB_VIEW;
            }
            this.engineType = aVar;
            checkSchema(uri);
        }
    }

    /* access modifiers changed from: protected */
    public void checkSchema(Uri uri) {
        com.bytedance.android.livesdk.container.i.a<?> lynxCustomReport;
        com.bytedance.android.livesdk.container.i.a<WebView> webViewCustomReport;
        l.d(uri, "");
        if (com.bytedance.android.livesdk.container.j.a.f16801a.contains(uri.getHost())) {
            return;
        }
        if (this.engineType == com.bytedance.android.livesdk.container.d.a.WEB_VIEW) {
            g gVar = (g) com.bytedance.android.live.t.a.a(g.class);
            if (gVar != null && (webViewCustomReport = gVar.getWebViewCustomReport()) != null) {
                String uri2 = uri.toString();
                l.b(uri2, "");
                webViewCustomReport.b(uri2);
                return;
            }
            return;
        }
        g gVar2 = (g) com.bytedance.android.live.t.a.a(g.class);
        if (gVar2 != null && (lynxCustomReport = gVar2.getLynxCustomReport()) != null) {
            String uri3 = uri.toString();
            l.b(uri3, "");
            lynxCustomReport.b(uri3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HybridConfig(Uri uri, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? null : uri);
    }
}
