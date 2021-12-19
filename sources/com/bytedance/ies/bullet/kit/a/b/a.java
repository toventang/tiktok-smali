package com.bytedance.ies.bullet.kit.a.b;

import android.os.FileObserver;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.a.f;
import com.bytedance.ies.bullet.service.base.ap;
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
    public static final C0687a f32211d = new C0687a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LruCache<String, byte[]> f32212a;

    /* renamed from: b  reason: collision with root package name */
    final ConcurrentHashMap<String, ap> f32213b;

    /* renamed from: c  reason: collision with root package name */
    final ConcurrentHashMap<String, FileObserver> f32214c;

    static {
        Covode.recordClassIndex(18893);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.a.b.a$a  reason: collision with other inner class name */
    public static final class C0687a {
        static {
            Covode.recordClassIndex(18894);
        }

        private C0687a() {
        }

        public /* synthetic */ C0687a(byte b2) {
            this();
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f32215a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f32216b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(18895);
        }
    }

    private a() {
        this.f32213b = new ConcurrentHashMap<>();
        this.f32214c = new ConcurrentHashMap<>();
    }

    public static final class d<V> implements Callable<z> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f32218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f32219b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f32220c;

        static {
            Covode.recordClassIndex(18897);
        }

        public d(a aVar, List list, String str) {
            this.f32218a = aVar;
            this.f32219b = list;
            this.f32220c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ z call() {
            LruCache<String, byte[]> lruCache;
            try {
                if ((!this.f32219b.isEmpty()) && (lruCache = this.f32218a.f32212a) != null) {
                    lruCache.put(this.f32220c, n.c((Collection<Byte>) this.f32219b));
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
        if (!z && (lruCache = this.f32212a) != null) {
            return lruCache.get(str);
        }
        return null;
    }

    public final ap b(String str) {
        byte[] bArr;
        MethodCollector.i(10496);
        l.c(str, "");
        ap apVar = this.f32213b.get(str);
        if (apVar == null) {
            MethodCollector.o(10496);
            return null;
        }
        l.a((Object) apVar, "");
        f a2 = a(new f(apVar.n, false, null, 0, 2046), apVar);
        a2.f32241b = str;
        LruCache<String, byte[]> lruCache = this.f32212a;
        if (!(lruCache == null || (bArr = lruCache.get(str)) == null)) {
            a2.u = new ByteArrayInputStream(bArr);
        }
        MethodCollector.o(10496);
        return a2;
    }

    public static final class c extends LruCache<String, byte[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f32217a;

        static {
            Covode.recordClassIndex(18896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i2, int i3) {
            super(i3);
            this.f32217a = i2;
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
        final /* synthetic */ a f32221a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f32222b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ap f32223c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f32224d = 1536;

        static {
            Covode.recordClassIndex(18898);
        }

        public final void onEvent(int i2, String str) {
            if (i2 == 512 || i2 == 1024) {
                a aVar = this.f32221a;
                String str2 = this.f32222b;
                l.c(str2, "");
                if (str2.length() != 0) {
                    aVar.f32213b.remove(str2);
                    LruCache<String, byte[]> lruCache = aVar.f32212a;
                    if (lruCache != null) {
                        lruCache.remove(str2);
                    }
                    aVar.f32214c.remove(str2);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, String str, ap apVar, String str2) {
            super(str2, 1536);
            this.f32221a = aVar;
            this.f32222b = str;
            this.f32223c = apVar;
        }
    }

    public final void a(String str, ap apVar) {
        String str2;
        l.c(str, "");
        l.c(apVar, "");
        if (str.length() != 0 && (str2 = apVar.o) != null && str2.length() != 0) {
            try {
                e eVar = new e(this, str, apVar, apVar.o);
                this.f32213b.put(str, apVar);
                FileObserver fileObserver = this.f32214c.get(str);
                if (fileObserver != null) {
                    fileObserver.stopWatching();
                }
                eVar.startWatching();
                this.f32214c.put(str, eVar);
            } catch (Throwable unused) {
            }
        }
    }

    private static f a(f fVar, ap apVar) {
        l.c(fVar, "");
        l.c(apVar, "");
        fVar.o = apVar.o;
        fVar.p = apVar.p;
        fVar.q = apVar.q;
        fVar.r = apVar.r;
        fVar.s = apVar.s;
        fVar.t = apVar.t;
        fVar.u = apVar.u;
        fVar.v = apVar.v;
        if (apVar instanceof f) {
            f fVar2 = (f) apVar;
            fVar.d(fVar2.f32246g);
            fVar.f32241b = fVar2.f32241b;
            fVar.f32247h = fVar2.f32247h;
        }
        fVar.f(apVar.w);
        fVar.x = apVar.x;
        fVar.e(apVar.f32560i);
        fVar.b(apVar.f32563l);
        fVar.a(apVar.f32562k);
        fVar.f32561j = apVar.f32561j;
        return fVar;
    }
}
