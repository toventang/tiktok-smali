package com.bytedance.ies.bullet.kit.a;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.f;
import com.bytedance.ies.bullet.service.base.resourceloader.config.h;
import com.bytedance.ies.bullet.service.base.resourceloader.config.i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.j;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class g {

    /* renamed from: c  reason: collision with root package name */
    public static final a f32248c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Map<IResourceLoaderService, i> f32249a;

    /* renamed from: b  reason: collision with root package name */
    public Application f32250b;

    /* renamed from: d  reason: collision with root package name */
    private i f32251d;

    static {
        Covode.recordClassIndex(18907);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(18908);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final g f32252a = new g((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f32253b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(18909);
        }
    }

    public static final class c implements com.bytedance.ies.bullet.service.base.resourceloader.config.d {

        /* renamed from: a  reason: collision with root package name */
        private IResourceLoaderService f32254a;

        static {
            Covode.recordClassIndex(18910);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
        public final void a(j jVar, List<String> list, f fVar) {
            l.c(jVar, "");
            l.c(list, "");
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
        public final boolean a_(String str, String str2, String str3) {
            l.c(str, "");
            l.c(str2, "");
            l.c(str3, "");
            return false;
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
        public final String b(String str, String str2, String str3) {
            l.c(str, "");
            l.c(str2, "");
            l.c(str3, "");
            return "";
        }

        c() {
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
        public final void a(IResourceLoaderService iResourceLoaderService) {
            this.f32254a = iResourceLoaderService;
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.d
        public final Map<String, String> a(String str, String str2) {
            l.c(str, "");
            l.c(str2, "");
            return new LinkedHashMap();
        }
    }

    public static final class d implements com.bytedance.ies.bullet.service.base.resourceloader.config.c {
        static {
            Covode.recordClassIndex(18911);
        }

        @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.c
        public final void a(String str, boolean z, j jVar, h hVar) {
            l.c(str, "");
            l.c(jVar, "");
        }

        d() {
        }
    }

    private g() {
        this.f32251d = new i("", "", n.c(""), "", "", "", new GeckoConfig("", "", new c(), false, false, 24, null), null, new d(), null, 1664);
        this.f32249a = new LinkedHashMap();
    }

    public /* synthetic */ g(byte b2) {
        this();
    }

    public final i a(IResourceLoaderService iResourceLoaderService) {
        i iVar = this.f32249a.get(iResourceLoaderService);
        if (iVar == null) {
            return this.f32251d;
        }
        return iVar;
    }
}
