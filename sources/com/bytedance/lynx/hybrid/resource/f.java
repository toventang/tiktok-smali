package com.bytedance.lynx.hybrid.resource;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.e;
import com.bytedance.lynx.hybrid.resource.config.g;
import com.bytedance.lynx.hybrid.resource.config.i;
import com.bytedance.lynx.hybrid.resource.config.j;
import com.bytedance.lynx.hybrid.service.IResourceService;
import h.a.n;
import h.f.b.l;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final a f41149c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    Map<IResourceService, com.bytedance.lynx.hybrid.resource.config.c> f41150a;

    /* renamed from: b  reason: collision with root package name */
    public Application f41151b;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.lynx.hybrid.resource.config.c f41152d;

    static {
        Covode.recordClassIndex(25214);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(25215);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final f f41155a = new f((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f41156b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(25216);
        }
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private IResourceService f41159a;

        static {
            Covode.recordClassIndex(25217);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.e
        public final void a(j jVar, List<String> list, g gVar) {
            l.c(jVar, "");
            l.c(list, "");
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.e
        public final boolean a(String str, String str2, String str3) {
            l.c(str, "");
            l.c(str2, "");
            l.c(str3, "");
            return false;
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.e
        public final String b(String str, String str2, String str3) {
            l.c(str, "");
            l.c(str2, "");
            l.c(str3, "");
            return "";
        }

        c() {
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.e
        public final void a(IResourceService iResourceService) {
            this.f41159a = iResourceService;
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.e
        public final Map<String, String> a(String str, String str2) {
            l.c(str, "");
            l.c(str2, "");
            return new LinkedHashMap();
        }
    }

    public static final class d implements com.bytedance.lynx.hybrid.resource.config.d {
        static {
            Covode.recordClassIndex(25218);
        }

        @Override // com.bytedance.lynx.hybrid.resource.config.d
        public final void a(String str, boolean z, j jVar, i iVar) {
            l.c(str, "");
            l.c(jVar, "");
        }

        d() {
        }
    }

    private f() {
        List c2 = n.c("");
        GeckoConfig geckoConfig = new GeckoConfig("", "", false, false, 12, null);
        geckoConfig.setGeckoDepender(new c());
        com.bytedance.lynx.hybrid.resource.config.c cVar = new com.bytedance.lynx.hybrid.resource.config.c("", c2, geckoConfig, null, null, 56);
        cVar.f41089a = new d();
        this.f41152d = cVar;
        this.f41150a = new LinkedHashMap();
    }

    public /* synthetic */ f(byte b2) {
        this();
    }

    public final com.bytedance.lynx.hybrid.resource.config.c a(IResourceService iResourceService) {
        if (iResourceService == null) {
            com.bytedance.lynx.hybrid.j.c.a("getConfig service is null,return placeholder", com.bytedance.lynx.hybrid.j.b.E, "ResLoaderConfigManager");
        }
        com.bytedance.lynx.hybrid.resource.config.c cVar = this.f41150a.get(iResourceService);
        if (cVar == null) {
            return this.f41152d;
        }
        return cVar;
    }
}
