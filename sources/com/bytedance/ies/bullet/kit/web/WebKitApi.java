package com.bytedance.ies.bullet.kit.web;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.h;
import com.bytedance.ies.bullet.c.c.i;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.bullet.kit.web.a.f;
import com.bytedance.ies.bullet.kit.web.a.g;
import com.bytedance.ies.bullet.service.base.web.m;
import com.bytedance.ies.bullet.service.base.web.n;
import com.bytedance.webx.e.a.e;
import h.f.b.l;
import java.util.List;

public final class WebKitApi extends IWebKitApi<j> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32396a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Class<j> f32397b = j.class;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32398c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.ies.bullet.c.e.a.b f32399d;

    /* renamed from: e  reason: collision with root package name */
    private e f32400e;

    static {
        Covode.recordClassIndex(19175);
    }

    @Override // com.bytedance.ies.bullet.c.c.o, com.bytedance.ies.bullet.c.c.d
    public final boolean e() {
        return true;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(19176);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final com.bytedance.ies.bullet.c.e.a.b b() {
        return this.f32399d;
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final void c() {
        Application application;
        if (!this.f32398c) {
            int i2 = Build.VERSION.SDK_INT;
            com.bytedance.ies.bullet.c.e.a.b bVar = this.f32399d;
            if (bVar != null) {
                bVar.c(com.bytedance.ies.bullet.c.a.a.class);
            }
            com.bytedance.ies.bullet.c.e.a.b bVar2 = this.f32399d;
            if (bVar2 != null && (application = (Application) bVar2.c(Application.class)) != null) {
                com.bytedance.ies.bullet.service.base.web.d dVar = (com.bytedance.ies.bullet.service.base.web.d) b_(com.bytedance.ies.bullet.service.base.web.d.class);
                if (dVar != null) {
                    m mVar = new m();
                    n nVar = new n();
                    nVar.f32651b = new d(this);
                    mVar.f32649a = nVar;
                    dVar.a(application, mVar);
                }
                this.f32398c = true;
            }
        }
    }

    public static final class b implements h<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f32401a;

        static {
            Covode.recordClassIndex(19177);
        }

        b(Object obj) {
            this.f32401a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.g' to match base method */
        @Override // com.bytedance.ies.bullet.c.c.h
        public final /* synthetic */ e a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.c(bVar, "");
            return ((f) this.f32401a).a();
        }
    }

    public static final class c implements com.bytedance.ies.bullet.c.c.l<f, d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f32402a;

        static {
            Covode.recordClassIndex(19178);
        }

        c(Object obj) {
            this.f32402a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.m' to match base method */
        @Override // com.bytedance.ies.bullet.c.c.l
        public final /* synthetic */ f a(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.c(bVar, "");
            return ((g) this.f32402a).k(bVar);
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.e' to match base method */
        @Override // com.bytedance.ies.bullet.c.c.l
        public final /* synthetic */ d b(com.bytedance.ies.bullet.c.e.a.b bVar) {
            l.c(bVar, "");
            return ((g) this.f32402a).l(bVar);
        }
    }

    public static final class d implements n.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WebKitApi f32403a;

        static {
            Covode.recordClassIndex(19179);
        }

        d(WebKitApi webKitApi) {
            this.f32403a = webKitApi;
        }

        @Override // com.bytedance.ies.bullet.service.base.web.n.a
        public final WebView a(Context context) {
            l.c(context, "");
            return WebKitApi.a(context);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final com.bytedance.ies.bullet.c.c.l<f, d> a(Object obj) {
        l.c(obj, "");
        if (obj instanceof g) {
            return new c(obj);
        }
        return null;
    }

    public static SSWebView a(Context context) {
        l.c(context, "");
        try {
            com.bytedance.webx.d a2 = ((e) com.bytedance.webx.g.a("webx_webkit", e.class)).a(context, SSWebView.class);
            l.a((Object) a2, "");
            return (SSWebView) a2;
        } catch (Throwable unused) {
            return new SSWebView(context, null, 6, (byte) 0);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final h<e> b(Object obj) {
        l.c(obj, "");
        if (obj instanceof f) {
            return new b(obj);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final /* synthetic */ void a(i iVar) {
        l.c(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.c.c.d
    public final /* synthetic */ void a(com.bytedance.ies.bullet.c.c.g gVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.c(bVar, "");
        this.f32400e = (e) gVar;
        this.f32399d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public j a(z zVar, List<String> list, com.bytedance.ies.bullet.c.f fVar, com.bytedance.ies.bullet.c.e.a.b bVar) {
        l.c(zVar, "");
        l.c(list, "");
        l.c(fVar, "");
        l.c(bVar, "");
        c();
        return new j(this, zVar, list, fVar, bVar);
    }
}
