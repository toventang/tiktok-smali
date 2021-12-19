package com.bytedance.lynx.hybrid.resource.c;

import android.os.FileObserver;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lynx.hybrid.resource.j;
import h.a.n;
import h.f.b.l;
import h.z;
import java.io.ByteArrayInputStream;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final C1002a f41068d = new C1002a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, byte[]> f41069a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, com.bytedance.lynx.hybrid.resource.d.e> f41070b;

    /* renamed from: c  reason: collision with root package name */
    public final ConcurrentHashMap<String, FileObserver> f41071c;

    static {
        Covode.recordClassIndex(25177);
    }

    /* renamed from: com.bytedance.lynx.hybrid.resource.c.a$a  reason: collision with other inner class name */
    public static final class C1002a {
        static {
            Covode.recordClassIndex(25178);
        }

        private C1002a() {
        }

        public /* synthetic */ C1002a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f41072a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f41073b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(25179);
        }
    }

    private a() {
        this.f41070b = new ConcurrentHashMap<>();
        this.f41071c = new ConcurrentHashMap<>();
    }

    public static final class d<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f41075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f41076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f41077c;

        static {
            Covode.recordClassIndex(25181);
        }

        public d(a aVar, List list, String str) {
            this.f41075a = aVar;
            this.f41076b = list;
            this.f41077c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            LruCache<String, byte[]> lruCache;
            try {
                if ((!this.f41076b.isEmpty()) && (lruCache = this.f41075a.f41069a) != null) {
                    lruCache.put(this.f41077c, n.c((Collection<Byte>) this.f41076b));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return z.f158842a;
        }
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final byte[] a(String str) {
        boolean z;
        LruCache<String, byte[]> lruCache;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (lruCache = this.f41069a) != null) {
            return lruCache.get(str);
        }
        return null;
    }

    public final com.bytedance.lynx.hybrid.resource.d.e b(String str) {
        byte[] bArr;
        MethodCollector.i(10545);
        l.c(str, "");
        com.bytedance.lynx.hybrid.resource.d.e eVar = this.f41070b.get(str);
        if (eVar == null) {
            MethodCollector.o(10545);
            return null;
        }
        l.a((Object) eVar, "");
        j a2 = a(new j(eVar.f41131m, false, null, 0, 2046), eVar);
        a2.f41214b = str;
        LruCache<String, byte[]> lruCache = this.f41069a;
        if (!(lruCache == null || (bArr = lruCache.get(str)) == null)) {
            a2.t = new ByteArrayInputStream(bArr);
        }
        MethodCollector.o(10545);
        return a2;
    }

    public static final class c extends LruCache<String, byte[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f41074a;

        static {
            Covode.recordClassIndex(25180);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i2, int i3) {
            super(i3);
            this.f41074a = i2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.LruCache
        public final /* bridge */ /* synthetic */ int sizeOf(String str, byte[] bArr) {
            byte[] bArr2 = bArr;
            if (bArr2 != null) {
                return bArr2.length;
            }
            return 0;
        }
    }

    public static final class e extends FileObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f41078a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f41079b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.bytedance.lynx.hybrid.resource.d.e f41080c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f41081d = 1536;

        static {
            Covode.recordClassIndex(25182);
        }

        public final void onEvent(int i2, String str) {
            if (i2 == 512 || i2 == 1024) {
                a aVar = this.f41078a;
                String str2 = this.f41079b;
                l.c(str2, "");
                if (str2.length() != 0) {
                    aVar.f41070b.remove(str2);
                    LruCache<String, byte[]> lruCache = aVar.f41069a;
                    if (lruCache != null) {
                        lruCache.remove(str2);
                    }
                    aVar.f41071c.remove(str2);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(a aVar, String str, com.bytedance.lynx.hybrid.resource.d.e eVar, String str2) {
            super(str2, 1536);
            this.f41078a = aVar;
            this.f41079b = str;
            this.f41080c = eVar;
        }
    }

    private static j a(j jVar, com.bytedance.lynx.hybrid.resource.d.e eVar) {
        l.c(jVar, "");
        l.c(eVar, "");
        jVar.n = eVar.n;
        jVar.o = eVar.o;
        jVar.p = eVar.p;
        jVar.q = eVar.q;
        jVar.r = eVar.r;
        jVar.s = eVar.s;
        jVar.t = eVar.t;
        jVar.u = eVar.u;
        if (eVar instanceof j) {
            j jVar2 = (j) eVar;
            jVar.d(jVar2.f41219g);
            jVar.f41214b = jVar2.f41214b;
            jVar.f41220h = jVar2.f41220h;
        }
        jVar.f(eVar.v);
        jVar.w = eVar.w;
        jVar.e(eVar.f41127i);
        jVar.a(eVar.f41129k);
        jVar.f41128j = eVar.f41128j;
        return jVar;
    }
}
