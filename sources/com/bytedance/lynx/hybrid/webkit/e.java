package com.bytedance.lynx.hybrid.webkit;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.f;
import com.bytedance.lynx.hybrid.a.h;
import com.bytedance.lynx.hybrid.a.n;
import com.bytedance.lynx.hybrid.h.a;
import com.bytedance.lynx.hybrid.j.b;
import com.bytedance.lynx.hybrid.service.IResourceService;
import com.bytedance.lynx.hybrid.service.b.c;
import com.bytedance.lynx.hybrid.service.b.d;
import com.bytedance.lynx.hybrid.webkit.a;
import com.bytedance.webx.e.a.c;
import com.ss.android.ugc.tiktok.security.b.i;
import h.f.b.l;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class e extends c implements h {

    /* renamed from: a  reason: collision with root package name */
    public final d f41299a;

    /* renamed from: b  reason: collision with root package name */
    private final d f41300b;

    /* renamed from: c  reason: collision with root package name */
    private Uri f41301c;

    /* renamed from: d  reason: collision with root package name */
    private String f41302d;

    /* renamed from: e  reason: collision with root package name */
    private IResourceService f41303e;

    /* renamed from: f  reason: collision with root package name */
    private f f41304f;

    /* renamed from: g  reason: collision with root package name */
    private n f41305g;

    /* renamed from: h  reason: collision with root package name */
    private com.bytedance.lynx.hybrid.service.f f41306h;

    /* renamed from: i  reason: collision with root package name */
    private a f41307i;

    static {
        Covode.recordClassIndex(25308);
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    public final com.bytedance.lynx.hybrid.service.f getBridgeService$hybrid_web_release() {
        return this.f41306h;
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final a getHybridContext() {
        return this.f41307i;
    }

    public final d getInitParams$hybrid_web_release() {
        return this.f41299a;
    }

    public final d getService$hybrid_web_release() {
        return this.f41300b;
    }

    public final f getWebKitLifeCycle$hybrid_web_release() {
        return this.f41304f;
    }

    public final String getWebUrl$hybrid_web_release() {
        return this.f41302d;
    }

    @Override // com.bytedance.webx.e.a.c
    public final void onAttachedToWindow() {
        com.bytedance.android.monitorV2.webview.n.a().t(this);
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final void b() {
        if (!TextUtils.isEmpty(this.f41302d)) {
            String str = this.f41302d;
            if (str == null) {
                l.a();
            }
            a(str);
            return;
        }
        com.bytedance.lynx.hybrid.j.c.a("please set url at WebKitInitParam(url=\"\")", b.E, (String) null, 4);
    }

    @Override // com.bytedance.webx.e.a.c
    public final boolean canGoBack() {
        if (!super.canGoBack() || !i.a(this)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.lynx.hybrid.a.h, com.bytedance.webx.e.a.c
    public final void destroy() {
        f fVar = this.f41304f;
        if (fVar != null) {
            fVar.c();
        }
        com.bytedance.lynx.hybrid.service.f fVar2 = this.f41306h;
        if (fVar2 != null) {
            fVar2.a();
        }
        com.bytedance.android.monitorV2.webview.n.a().l(this);
        super.destroy();
    }

    @Override // com.bytedance.webx.e.a.c
    public final void goBack() {
        if (!i.b(this)) {
            com.bytedance.android.monitorV2.webview.n.a().p(this);
            super.goBack();
        }
    }

    @Override // com.bytedance.webx.e.a.c
    public final void reload() {
        a.C1006a.a(this, this.f41299a.f41294f);
        f fVar = this.f41304f;
        if (fVar != null) {
            String str = this.f41302d;
            if (str == null) {
                str = "";
            }
            fVar.a(this, str);
        }
        com.bytedance.android.monitorV2.webview.n.a().n(this);
        super.reload();
    }

    public final void setBridgeService$hybrid_web_release(com.bytedance.lynx.hybrid.service.f fVar) {
        this.f41306h = fVar;
    }

    public final void setWebKitLifeCycle$hybrid_web_release(f fVar) {
        this.f41304f = fVar;
    }

    public final void setWebUrl$hybrid_web_release(String str) {
        this.f41302d = str;
    }

    public final void setHybridContext(com.bytedance.lynx.hybrid.h.a aVar) {
        l.c(aVar, "");
        this.f41307i = aVar;
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final void updateData(Map<String, ? extends Object> map) {
        l.c(map, "");
        l.c(map, "");
    }

    @Override // com.bytedance.lynx.hybrid.a.h
    public final void a(String str) {
        l.c(str, "");
        f fVar = this.f41304f;
        if (fVar != null) {
            fVar.a(this, str);
        }
        e(str);
    }

    @Override // com.bytedance.webx.e.a.c
    public final void loadUrl(String str) {
        String a2 = i.f149045a.a(this, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        a.C1006a.a(this, this.f41299a.f41294f);
        com.bytedance.android.monitorV2.webview.n.a().g(this, str);
        super.loadUrl(str);
    }

    public final void setJsBridge(Context context) {
        com.bytedance.lynx.hybrid.service.f fVar;
        com.bytedance.lynx.hybrid.service.d dVar = (com.bytedance.lynx.hybrid.service.d) c.a.a().a(com.bytedance.lynx.hybrid.service.d.class);
        if (dVar != null) {
            fVar = dVar.a();
        } else {
            fVar = null;
        }
        this.f41306h = fVar;
        if (fVar != null) {
            fVar.a(context, this, this.f41305g);
        }
    }

    private final void e(String str) {
        this.f41302d = str;
        a.C1006a.a(this, this.f41299a.f41294f);
        d dVar = this.f41299a;
        if (dVar.f41296h != null) {
            b bVar = dVar.f41296h;
            if (bVar != null) {
                new c(str, dVar.f41295g);
                c a2 = bVar.a();
                if (a2 != null) {
                    Map<String, String> map = a2.f41288b;
                    if (map == null || map.isEmpty()) {
                        loadUrl(a2.f41287a);
                    } else {
                        a(a2.f41287a, a2.f41288b, new com.bytedance.webx.c[0]);
                    }
                }
            }
        } else {
            loadUrl(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.lynx.hybrid.a.h
    public final void a(String str, List<? extends Object> list) {
        Object h2;
        l.c(str, "");
        com.bytedance.lynx.hybrid.service.f fVar = this.f41306h;
        if (fVar != null) {
            JSONObject jSONObject = null;
            if (!(list == null || (h2 = h.a.n.h((List) list)) == 0)) {
                if (h2 instanceof JSONObject) {
                    jSONObject = h2;
                }
                jSONObject = jSONObject;
            }
            fVar.a(str, jSONObject);
        }
    }

    @Override // android.webkit.WebView, com.bytedance.webx.e.a.c
    public final void loadUrl(String str, Map map) {
        String a2 = i.f149045a.a(this, str);
        if (!TextUtils.isEmpty(a2)) {
            str = a2;
        }
        a.C1006a.a(this, this.f41299a.f41294f);
        com.bytedance.android.monitorV2.webview.n.a().g(this, str);
        super.loadUrl(str, map);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(Context context, com.bytedance.lynx.hybrid.h.a aVar, d dVar, d dVar2, f fVar) {
        super(context);
        l.c(context, "");
        l.c(aVar, "");
        l.c(dVar, "");
        l.c(dVar2, "");
        this.f41307i = aVar;
        this.f41300b = dVar2;
        this.f41304f = fVar;
        this.f41303e = (IResourceService) dVar2.a(IResourceService.class);
        this.f41299a = dVar;
        Uri uri = dVar.f41297i;
        if (uri != null) {
            this.f41301c = uri;
            this.f41302d = uri.getQueryParameter("url");
        }
        n nVar = (n) getHybridContext().a(n.class);
        if (nVar != null) {
            this.f41305g = nVar;
        }
    }
}
