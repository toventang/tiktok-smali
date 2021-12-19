package com.bytedance.lynx.hybrid.e;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.a.i;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.f;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class b implements i {

    /* renamed from: i  reason: collision with root package name */
    public static final C0994b f40937i = new C0994b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f40938a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.bytedance.lynx.hybrid.d.a> f40939b;

    /* renamed from: c  reason: collision with root package name */
    public final f f40940c;

    /* renamed from: d  reason: collision with root package name */
    public final com.lynx.tasm.provider.b f40941d;

    /* renamed from: e  reason: collision with root package name */
    public final List<com.lynx.tasm.behavior.a> f40942e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, com.bytedance.lynx.hybrid.g.b> f40943f;

    /* renamed from: g  reason: collision with root package name */
    public final a f40944g;

    /* renamed from: h  reason: collision with root package name */
    public final h.f.a.b<LynxEnv, z> f40945h;

    static {
        Covode.recordClassIndex(25093);
    }

    /* renamed from: com.bytedance.lynx.hybrid.e.b$b  reason: collision with other inner class name */
    public static final class C0994b {
        static {
            Covode.recordClassIndex(25096);
        }

        private C0994b() {
        }

        public /* synthetic */ C0994b(byte b2) {
            this();
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f40946a = true;

        /* renamed from: b  reason: collision with root package name */
        public final List<com.bytedance.lynx.hybrid.d.a> f40947b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public f f40948c;

        /* renamed from: d  reason: collision with root package name */
        public com.lynx.tasm.provider.b f40949d;

        /* renamed from: e  reason: collision with root package name */
        public final List<com.lynx.tasm.behavior.a> f40950e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public final Map<String, com.bytedance.lynx.hybrid.g.b> f40951f = new LinkedHashMap();

        /* renamed from: g  reason: collision with root package name */
        public a f40952g;

        /* renamed from: h  reason: collision with root package name */
        public h.f.a.b<? super LynxEnv, z> f40953h = C0993a.f40955a;

        /* renamed from: i  reason: collision with root package name */
        public Application f40954i;

        static {
            Covode.recordClassIndex(25094);
        }

        /* renamed from: com.bytedance.lynx.hybrid.e.b$a$a  reason: collision with other inner class name */
        static final class C0993a extends m implements h.f.a.b<LynxEnv, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0993a f40955a = new C0993a();

            static {
                Covode.recordClassIndex(25095);
            }

            C0993a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ z invoke(LynxEnv lynxEnv) {
                l.c(lynxEnv, "");
                return z.f158842a;
            }
        }

        public final void a(List<? extends com.lynx.tasm.behavior.a> list) {
            l.c(list, "");
            this.f40950e.addAll(list);
        }

        public a(Application application) {
            l.c(application, "");
            this.f40954i = application;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: h.f.a.b<? super com.lynx.tasm.LynxEnv, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    private b(Application application, boolean z, List<com.bytedance.lynx.hybrid.d.a> list, f fVar, com.lynx.tasm.provider.b bVar, List<com.lynx.tasm.behavior.a> list2, Map<String, com.bytedance.lynx.hybrid.g.b> map, a aVar, h.f.a.b<? super LynxEnv, z> bVar2) {
        this.f40938a = z;
        this.f40939b = list;
        this.f40940c = fVar;
        this.f40941d = bVar;
        this.f40942e = list2;
        this.f40943f = map;
        this.f40944g = aVar;
        this.f40945h = bVar2;
        l.c(application, "");
        d.f40959a = application;
    }

    public /* synthetic */ b(Application application, boolean z, List list, f fVar, com.lynx.tasm.provider.b bVar, List list2, Map map, a aVar, h.f.a.b bVar2, byte b2) {
        this(application, z, list, fVar, bVar, list2, map, aVar, bVar2);
    }
}
