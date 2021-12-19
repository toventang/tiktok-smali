package com.ss.android.ugc.aweme.music;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.video.preload.VideoCachePreloader;
import com.ss.android.ugc.aweme.video.preload.e;
import com.ss.android.ugc.aweme.video.preload.f;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.musicprovider.MusicPreloaderService;
import com.toutiao.proxyserver.j;
import h.f.a.q;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

public final class MusicPreloaderServiceImpl implements MusicPreloaderService {

    /* renamed from: a  reason: collision with root package name */
    private final h f111074a = i.a((h.f.a.a) b.f111077a);

    /* renamed from: b  reason: collision with root package name */
    private final h f111075b = i.a((h.f.a.a) a.f111076a);

    static {
        Covode.recordClassIndex(71278);
    }

    private ConcurrentHashMap<q<String, Long, Long, z>, f> c() {
        return (ConcurrentHashMap) this.f111074a.getValue();
    }

    private ConcurrentHashMap<com.ss.android.ugc.musicprovider.c, e> d() {
        return (ConcurrentHashMap) this.f111075b.getValue();
    }

    static final class a extends m implements h.f.a.a<ConcurrentHashMap<com.ss.android.ugc.musicprovider.c, e>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f111076a = new a();

        static {
            Covode.recordClassIndex(71279);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<com.ss.android.ugc.musicprovider.c, e> invoke() {
            return new ConcurrentHashMap();
        }
    }

    static final class b extends m implements h.f.a.a<ConcurrentHashMap<q<? super String, ? super Long, ? super Long, ? extends z>, f>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f111077a = new b();

        static {
            Covode.recordClassIndex(71280);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConcurrentHashMap<q<? super String, ? super Long, ? super Long, ? extends z>, f> invoke() {
            return new ConcurrentHashMap();
        }
    }

    @Override // com.ss.android.ugc.musicprovider.MusicPreloaderService
    public final void a() {
        VideoCachePreloader.a.f143524a.g();
    }

    public static MusicPreloaderService b() {
        MethodCollector.i(3167);
        Object a2 = com.ss.android.ugc.b.a(MusicPreloaderService.class, false);
        if (a2 != null) {
            MusicPreloaderService musicPreloaderService = (MusicPreloaderService) a2;
            MethodCollector.o(3167);
            return musicPreloaderService;
        }
        if (com.ss.android.ugc.b.cP == null) {
            synchronized (MusicPreloaderService.class) {
                try {
                    if (com.ss.android.ugc.b.cP == null) {
                        com.ss.android.ugc.b.cP = new MusicPreloaderServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3167);
                    throw th;
                }
            }
        }
        MusicPreloaderServiceImpl musicPreloaderServiceImpl = (MusicPreloaderServiceImpl) com.ss.android.ugc.b.cP;
        MethodCollector.o(3167);
        return musicPreloaderServiceImpl;
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.musicprovider.c f111078a;

        static {
            Covode.recordClassIndex(71281);
        }

        c(com.ss.android.ugc.musicprovider.c cVar) {
            this.f111078a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.video.preload.e
        public final void a(j jVar, int i2, String str) {
            l.d(jVar, "");
            l.d(str, "");
            this.f111078a.a(jVar, i2, str);
        }

        @Override // com.ss.android.ugc.aweme.video.preload.e
        public final void a(String str, int i2, String str2) {
            l.d(str, "");
            l.d(str2, "");
            this.f111078a.a(str, i2, str2);
        }
    }

    @Override // com.ss.android.ugc.musicprovider.MusicPreloaderService
    public final void a(com.ss.android.ugc.musicprovider.c cVar) {
        l.d(cVar, "");
        c cVar2 = new c(cVar);
        d().put(cVar, cVar2);
        VideoCachePreloader.a.f143524a.f143516l = new WeakReference<>(cVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.q<? super java.lang.String, ? super java.lang.Long, ? super java.lang.Long, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.musicprovider.MusicPreloaderService
    public final void a(q<? super String, ? super Long, ? super Long, z> qVar) {
        l.d(qVar, "");
        d dVar = new d(qVar);
        c().put(qVar, dVar);
        s.b().a(dVar);
    }

    @Override // com.ss.android.ugc.musicprovider.MusicPreloaderService
    public final void b(com.ss.android.ugc.musicprovider.c cVar) {
        l.d(cVar, "");
        e remove = d().remove(cVar);
        if (remove != null) {
            VideoCachePreloader videoCachePreloader = VideoCachePreloader.a.f143524a;
            if (videoCachePreloader.f143516l != null && videoCachePreloader.f143516l.get() == remove) {
                videoCachePreloader.f143516l = null;
            }
        }
    }

    @Override // com.ss.android.ugc.musicprovider.MusicPreloaderService
    public final void b(q<? super String, ? super Long, ? super Long, z> qVar) {
        l.d(qVar, "");
        f remove = c().remove(qVar);
        VideoCachePreloader videoCachePreloader = VideoCachePreloader.a.f143524a;
        ArrayList arrayList = new ArrayList();
        for (WeakReference<f> weakReference : videoCachePreloader.f143515k) {
            if (weakReference.get() == remove) {
                arrayList.add(weakReference);
            }
        }
        videoCachePreloader.f143515k.removeAll(arrayList);
    }

    static final class d implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f111079a;

        static {
            Covode.recordClassIndex(71282);
        }

        d(q qVar) {
            this.f111079a = qVar;
        }

        @Override // com.ss.android.ugc.aweme.video.preload.f
        public final void a(String str, long j2, long j3) {
            q qVar = this.f111079a;
            l.b(str, "");
            qVar.invoke(str, Long.valueOf(j2), Long.valueOf(j3));
        }
    }
}
