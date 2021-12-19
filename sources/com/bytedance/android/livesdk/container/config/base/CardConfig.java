package com.bytedance.android.livesdk.container.config.base;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.android.live.b.g;
import com.bytedance.android.livesdk.container.config.live.LiveCardConfig;
import com.bytedance.android.livesdk.container.i.a;
import com.bytedance.android.livesdk.container.j.c;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.lang.reflect.Field;

public final class CardConfig extends HybridConfig {
    private LiveCardConfig extraConfig;

    static {
        Covode.recordClassIndex(9292);
    }

    public CardConfig() {
        this(null, 1, null);
    }

    public final LiveCardConfig getExtraConfig() {
        return this.extraConfig;
    }

    public final void setExtraConfig(LiveCardConfig liveCardConfig) {
        this.extraConfig = liveCardConfig;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.container.config.base.HybridConfig
    public final void checkSchema(Uri uri) {
        a<?> lynxCustomReport;
        a<WebView> webViewCustomReport;
        l.d(uri, "");
        super.checkSchema(uri);
        if (com.bytedance.android.livesdk.container.j.a.f16805e.contains(uri.getHost())) {
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

    public CardConfig(Uri uri) {
        super(uri);
        String a2;
        String queryParameter;
        String a3;
        String queryParameter2;
        if (uri != null) {
            Class<CardConfig> cls = CardConfig.class;
            while (true) {
                if (cls == null) {
                    break;
                }
                Field[] declaredFields = cls.getDeclaredFields();
                l.b(declaredFields, "");
                for (Field field : declaredFields) {
                    com.bytedance.android.livesdk.container.a.a aVar = (com.bytedance.android.livesdk.container.a.a) field.getAnnotation(com.bytedance.android.livesdk.container.a.a.class);
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
            Class<LiveCardConfig> cls2 = LiveCardConfig.class;
            LiveCardConfig newInstance = cls2.newInstance();
            do {
                Field[] declaredFields2 = cls2.getDeclaredFields();
                l.b(declaredFields2, "");
                for (Field field2 : declaredFields2) {
                    com.bytedance.android.livesdk.container.a.a aVar2 = (com.bytedance.android.livesdk.container.a.a) field2.getAnnotation(com.bytedance.android.livesdk.container.a.a.class);
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
        setHideLoading(true);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardConfig(Uri uri, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? null : uri);
    }
}
