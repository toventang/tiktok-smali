package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.live.b.g;
import com.bytedance.android.livesdk.container.a.a;
import com.bytedance.android.livesdk.container.config.live.LivePopupConfig;
import com.bytedance.android.livesdk.container.d.b;
import com.bytedance.android.livesdk.container.j.c;
import com.bytedance.android.livesdk.container.type.HColor;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Field;

public final class PopupConfig extends HybridConfig {
    @a(a = "transition_animation")
    private String animation;
    @a(a = "dialog_transition_animation")
    private String dialogAnimation;
    @a(a = "disable_mask_click_close")
    private boolean disableMaskClose;
    private LivePopupConfig extraConfig;
    @a(a = "gravity")
    private String gravity;
    @a(a = "height")
    private int height;
    @a(a = "mask_bg_color")
    private HColor maskBgColor;
    @a(a = "enable_pull_down_close")
    private boolean pullDownClose;
    @a(a = "radius")
    private int radius;
    @a(a = "show_mask")
    private boolean showMask;
    @a(a = "width")
    private int width;

    static {
        Covode.recordClassIndex(9295);
    }

    public PopupConfig() {
        this(null, 1, null);
    }

    public final String getAnimation() {
        return this.animation;
    }

    public final String getDialogAnimation() {
        return this.dialogAnimation;
    }

    public final boolean getDisableMaskClose() {
        return this.disableMaskClose;
    }

    public final LivePopupConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final String getGravity() {
        return this.gravity;
    }

    public final int getHeight() {
        return this.height;
    }

    public final HColor getMaskBgColor() {
        return this.maskBgColor;
    }

    public final boolean getPullDownClose() {
        return this.pullDownClose;
    }

    public final int getRadius() {
        return this.radius;
    }

    public final boolean getShowMask() {
        return this.showMask;
    }

    public final int getWidth() {
        return this.width;
    }

    private final void adjustValues() {
        if (l.a((Object) this.gravity, (Object) "center")) {
            if (this.width == b.a.C0338b.f16787a) {
                this.width = b.a.C0338b.f16789c;
            }
            if (this.height == b.a.C0338b.f16788b) {
                this.height = b.a.C0338b.f16790d;
            }
        }
    }

    public final void setDisableMaskClose(boolean z) {
        this.disableMaskClose = z;
    }

    public final void setExtraConfig(LivePopupConfig livePopupConfig) {
        this.extraConfig = livePopupConfig;
    }

    public final void setHeight(int i2) {
        this.height = i2;
    }

    public final void setMaskBgColor(HColor hColor) {
        this.maskBgColor = hColor;
    }

    public final void setPullDownClose(boolean z) {
        this.pullDownClose = z;
    }

    public final void setRadius(int i2) {
        this.radius = i2;
    }

    public final void setShowMask(boolean z) {
        this.showMask = z;
    }

    public final void setWidth(int i2) {
        this.width = i2;
    }

    public final void setAnimation(String str) {
        l.d(str, "");
        this.animation = str;
    }

    public final void setDialogAnimation(String str) {
        l.d(str, "");
        this.dialogAnimation = str;
    }

    public final void setGravity(String str) {
        l.d(str, "");
        this.gravity = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.container.config.base.HybridConfig
    public final void checkSchema(Uri uri) {
        com.bytedance.android.livesdk.container.i.a<?> lynxCustomReport;
        com.bytedance.android.livesdk.container.i.a<WebView> webViewCustomReport;
        l.d(uri, "");
        super.checkSchema(uri);
        if (com.bytedance.android.livesdk.container.j.a.f16804d.contains(uri.getHost())) {
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

    public PopupConfig(Uri uri) {
        super(uri);
        String a2;
        String queryParameter;
        String a3;
        String queryParameter2;
        this.gravity = "bottom";
        this.width = b.a.C0338b.f16787a;
        this.height = b.a.C0338b.f16788b;
        this.radius = b.a.C0337a.f16786a;
        this.animation = "auto";
        this.dialogAnimation = "none";
        if (uri != null) {
            setOriginUri(uri.toString());
            Class<PopupConfig> cls = PopupConfig.class;
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
            Class<LivePopupConfig> cls2 = LivePopupConfig.class;
            LivePopupConfig newInstance = cls2.newInstance();
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
            adjustValues();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PopupConfig(Uri uri, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? null : uri);
    }
}
