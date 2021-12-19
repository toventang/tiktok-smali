package com.ss.android.ugc.aweme.video.preload;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.cf.a.c;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.aweme.video.preload.n;
import com.ss.android.ugc.playerkit.b;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.android.ugc.playerkit.model.x;
import com.ss.android.ugc.playerkit.simapicommon.a.i;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VideoPreloadManager implements i {

    /* renamed from: a  reason: collision with root package name */
    public g f143549a;

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f143550b;

    /* renamed from: c  reason: collision with root package name */
    public String f143551c;

    /* renamed from: d  reason: collision with root package name */
    public LruCache<String, Long> f143552d = new LruCache<>(1048576);

    /* renamed from: e  reason: collision with root package name */
    private final IVideoPreloadConfig f143553e = o.a();

    /* renamed from: f  reason: collision with root package name */
    private h f143554f;

    /* renamed from: g  reason: collision with root package name */
    private Handler f143555g;

    static {
        Covode.recordClassIndex(93918);
    }

    /* access modifiers changed from: package-private */
    public static abstract class a implements Runnable {
        static {
            Covode.recordClassIndex(93924);
        }

        /* access modifiers changed from: package-private */
        public abstract boolean a();

        private a() {
        }

        public void run() {
            a();
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean a(i iVar) {
        if (iVar != null) {
            if (iVar.getHitBitrate() == null) {
                iVar.setHitBitrate(com.ss.android.ugc.playerkit.session.a.f148854a.e(iVar.getSourceId()));
            }
            if (TextUtils.isEmpty(iVar.getDashVideoId())) {
                iVar.setDashVideoId(com.ss.android.ugc.playerkit.session.a.f148854a.g(iVar.getSourceId()));
            }
        }
        return h().a(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean a(i iVar, int i2, n nVar, g.a aVar, List<i> list, List<i> list2, int i3) {
        if (!b.a(iVar)) {
            return false;
        }
        return a(new a(i2, iVar, nVar, aVar, list, 0, list2, i3) {
            /* class com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f143556a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f143557b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n f143558c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g.a f143559d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List f143560e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int f143561f = 0;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ List f143562g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ int f143563h;

            static {
                Covode.recordClassIndex(93919);
            }

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.a
            public final boolean a() {
                VideoPreloadManager.this.a();
                boolean a2 = VideoPreloadManager.this.h().a(this.f143557b, Math.max(this.f143556a, 0), this.f143558c, this.f143559d);
                boolean a3 = VideoPreloadManager.this.h().a(this.f143560e, this.f143561f, this.f143562g, this.f143563h);
                if (a2) {
                    VideoPreloadManager.this.f143552d.put(this.f143557b.getUri(), 0L);
                }
                if (a3) {
                    List list = this.f143560e;
                    if (list != null && !list.isEmpty()) {
                        for (com.ss.android.ugc.playerkit.simapicommon.a.g gVar : this.f143560e) {
                            if (gVar != null) {
                                VideoPreloadManager.this.f143552d.put(gVar.getUri(), 0L);
                            }
                        }
                    }
                    List list2 = this.f143562g;
                    if (list2 != null && !list2.isEmpty()) {
                        for (com.ss.android.ugc.playerkit.simapicommon.a.g gVar2 : this.f143562g) {
                            if (gVar2 != null) {
                                VideoPreloadManager.this.f143552d.put(gVar2.getUri(), 0L);
                            }
                        }
                    }
                }
                if (!a2 || !a3) {
                    return false;
                }
                return true;
            }

            {
                this.f143556a = r3;
                this.f143557b = r4;
                this.f143558c = r5;
                this.f143559d = r6;
                this.f143560e = r7;
                this.f143562g = r9;
                this.f143563h = r10;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean a(i iVar, int i2, List list, List list2, int i3) {
        return a(iVar, i2, n.b.f143760b, null, list, list2, i3);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean a(i iVar, int i2, n nVar) {
        return b(iVar, i2, nVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final g e() {
        return h();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void c() {
        a(new a() {
            /* class com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.AnonymousClass3 */

            static {
                Covode.recordClassIndex(93921);
            }

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.a
            public final boolean a() {
                VideoPreloadManager.this.h().c();
                return false;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void d() {
        h().b();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final String f() {
        return h().d();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean g() {
        return h().f();
    }

    private synchronized h i() {
        h hVar;
        MethodCollector.i(7752);
        if (this.f143554f == null) {
            this.f143554f = new h() {
                /* class com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.AnonymousClass4 */

                /* renamed from: a  reason: collision with root package name */
                Map<i.a, g> f143568a = new HashMap();

                static {
                    Covode.recordClassIndex(93922);
                }

                @Override // com.ss.android.ugc.aweme.video.preload.h
                public final g a(i.a aVar) {
                    if (this.f143568a.containsKey(aVar)) {
                        return this.f143568a.get(aVar);
                    }
                    g gVar = (g) c.a(aVar.type);
                    gVar.a();
                    this.f143568a.put(aVar, gVar);
                    return gVar;
                }
            };
        }
        hVar = this.f143554f;
        MethodCollector.o(7752);
        return hVar;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final File b() {
        return h().e();
    }

    private synchronized Handler j() {
        Handler handler;
        IVideoPreloadConfig iVideoPreloadConfig;
        MethodCollector.i(7805);
        if (this.f143555g == null && (iVideoPreloadConfig = this.f143553e) != null && iVideoPreloadConfig.useSyncPreloadStyle()) {
            HandlerThread handlerThread = new HandlerThread("VideoPreloadHandlerThread");
            handlerThread.start();
            this.f143555g = new Handler(handlerThread.getLooper());
        }
        handler = this.f143555g;
        MethodCollector.o(7805);
        return handler;
    }

    public final g h() {
        MethodCollector.i(7814);
        g gVar = this.f143549a;
        if (gVar != null) {
            MethodCollector.o(7814);
            return gVar;
        }
        synchronized (this) {
            try {
                if (this.f143549a == null) {
                    g a2 = i().a(this.f143553e.getExperiment().PreloadTypeExperiment());
                    this.f143549a = a2;
                    this.f143551c = a2.d();
                    Map<String, String> map = this.f143550b;
                    if (map != null) {
                        this.f143549a.a(map);
                    }
                }
            } catch (Throwable th) {
                MethodCollector.o(7814);
                throw th;
            }
        }
        g gVar2 = this.f143549a;
        MethodCollector.o(7814);
        return gVar2;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean a() {
        return h().a();
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void a(k kVar) {
        h().a(kVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final int d(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return c(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean f(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return g(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean g(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return a(iVar, 0, n.b.f143760b);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void i(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        h().d(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final long a(String str) {
        return h().a(str);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final long b(String str) {
        return h().b(str);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void h(final com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        a(new a() {
            /* class com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.AnonymousClass2 */

            static {
                Covode.recordClassIndex(93920);
            }

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.a
            public final boolean a() {
                if (VideoPreloadManager.this.f143552d.get(iVar.getUri()) != null) {
                    com.ss.android.ugc.playerkit.simapicommon.a.b().monitorStatusRate("aweme_media_play_stastics_log", 0, null);
                } else {
                    com.ss.android.ugc.playerkit.simapicommon.a.b().monitorStatusRate("aweme_media_play_stastics_log", 1, null);
                }
                return false;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final m j(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (iVar != null) {
            return h().e(iVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final List<x> k(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return h().h(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final List<v> l(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return h().g(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final v m(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return h().f(iVar);
    }

    private boolean a(a aVar) {
        IVideoPreloadConfig iVideoPreloadConfig = this.f143553e;
        if (iVideoPreloadConfig == null || !iVideoPreloadConfig.useSyncPreloadStyle()) {
            return aVar.a();
        }
        if (j() == null) {
            return true;
        }
        j().post(aVar);
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final long e(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (iVar != null) {
            return h().b(iVar.getBitRatedRatioUri());
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final g a(i.a aVar) {
        return i().a(aVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean b(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (!a(iVar) || !h().b(iVar)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final int c(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (iVar != null) {
            if (iVar.getHitBitrate() == null) {
                iVar.setHitBitrate(com.ss.android.ugc.playerkit.session.a.f148854a.e(iVar.getSourceId()));
            }
            if (TextUtils.isEmpty(iVar.getDashVideoId())) {
                iVar.setDashVideoId(com.ss.android.ugc.playerkit.session.a.f148854a.g(iVar.getSourceId()));
            }
        }
        return h().c(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void a(f fVar) {
        if (fVar != null) {
            a();
            if (this.f143549a != null) {
                h().a(fVar);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void a(final Map<String, String> map) {
        a(new a() {
            /* class com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.AnonymousClass5 */

            static {
                Covode.recordClassIndex(93923);
            }

            /* access modifiers changed from: package-private */
            @Override // com.ss.android.ugc.aweme.video.preload.VideoPreloadManager.a
            public final boolean a() {
                if (VideoPreloadManager.this.f143549a == null) {
                    VideoPreloadManager.this.f143550b = map;
                    return false;
                }
                VideoPreloadManager.this.h().a(map);
                return false;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final Object a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, String[] strArr) {
        return h().a(iVar, str, strArr);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final boolean b(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, n nVar) {
        return a(iVar, i2, nVar, null, null, null, 0);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.i
    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, d dVar) {
        h().a(iVar, str, true, dVar);
    }
}
