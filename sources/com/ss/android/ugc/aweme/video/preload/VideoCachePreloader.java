package com.ss.android.ugc.aweme.video.preload;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.video.preload.api.i;
import com.ss.android.ugc.aweme.video.preload.g;
import com.ss.android.ugc.aweme.video.preload.i;
import com.ss.android.ugc.playerkit.model.v;
import com.ss.android.ugc.playerkit.model.x;
import com.toutiao.proxyserver.ae;
import com.toutiao.proxyserver.c.c;
import com.toutiao.proxyserver.h;
import com.toutiao.proxyserver.j;
import com.toutiao.proxyserver.l;
import com.toutiao.proxyserver.m;
import com.toutiao.proxyserver.n;
import com.toutiao.proxyserver.o;
import com.toutiao.proxyserver.q;
import com.toutiao.proxyserver.s;
import com.toutiao.proxyserver.t;
import com.toutiao.proxyserver.u;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoCachePreloader implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f143505a = VideoCachePreloader.class.getSimpleName();
    private static File n;
    private static final String o = i.a.VideoCache.getCacheDirName();
    private static File r;

    /* renamed from: b  reason: collision with root package name */
    public e f143506b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f143507c;

    /* renamed from: d  reason: collision with root package name */
    public final IVideoPreloadConfig f143508d = o.a();

    /* renamed from: e  reason: collision with root package name */
    public Map<String, v> f143509e = Collections.synchronizedMap(new LinkedHashMap<String, v>() {
        /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93900);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, v> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: f  reason: collision with root package name */
    public Map<String, List<v>> f143510f = Collections.synchronizedMap(new LinkedHashMap<String, List<v>>() {
        /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass4 */

        static {
            Covode.recordClassIndex(93905);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<v>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: g  reason: collision with root package name */
    public Map<String, List<com.toutiao.proxyserver.b.b>> f143511g = Collections.synchronizedMap(new LinkedHashMap<String, List<com.toutiao.proxyserver.b.b>>() {
        /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass5 */

        static {
            Covode.recordClassIndex(93906);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<com.toutiao.proxyserver.b.b>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    });

    /* renamed from: h  reason: collision with root package name */
    HashMap<String, List<x>> f143512h = new LinkedHashMap<String, List<x>>() {
        /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass6 */

        static {
            Covode.recordClassIndex(93907);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, List<x>> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public HashMap<String, com.toutiao.proxyserver.b.a> f143513i = new LinkedHashMap<String, com.toutiao.proxyserver.b.a>() {
        /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass7 */

        static {
            Covode.recordClassIndex(93908);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.Map$Entry] */
        /* access modifiers changed from: protected */
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, com.toutiao.proxyserver.b.a> entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<Object> f143514j;

    /* renamed from: k  reason: collision with root package name */
    public final List<WeakReference<f>> f143515k = new CopyOnWriteArrayList();

    /* renamed from: l  reason: collision with root package name */
    public WeakReference<e> f143516l;

    /* renamed from: m  reason: collision with root package name */
    public x f143517m = null;
    private b p;
    private boolean q;

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(k kVar) {
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(Map<String, String> map) {
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean f() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final File e() {
        return n;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean a(List<com.ss.android.ugc.playerkit.simapicommon.a.i> list, int i2, List<com.ss.android.ugc.playerkit.simapicommon.a.i> list2, int i3) {
        if (!a()) {
            return false;
        }
        if (this.f143508d.isPlayerPreferchCaption() && list != null && !list.isEmpty()) {
            for (com.ss.android.ugc.playerkit.simapicommon.a.i iVar : list) {
                if (iVar != null) {
                    this.p.a(iVar, i2);
                }
            }
        }
        if (!this.f143508d.isPlayerPreferchTtsAudio() || list2 == null || list2.isEmpty()) {
            return true;
        }
        if (this.f143508d.playerPreferchTtsAudioSize() > 0) {
            i3 = this.f143508d.playerPreferchTtsAudioSize();
        }
        for (com.ss.android.ugc.playerkit.simapicommon.a.i iVar2 : list2) {
            if (iVar2 != null) {
                this.p.a(iVar2, i3);
            }
        }
        return true;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final VideoCachePreloader f143524a = new VideoCachePreloader();

        static {
            Covode.recordClassIndex(93911);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void b() {
        if (a()) {
            this.p.a(2);
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final String d() {
        if (u.f154997l) {
            return "ttnet";
        }
        return "okhttp";
    }

    static {
        Covode.recordClassIndex(93899);
    }

    private void h() {
        int i2;
        if (u.f154997l) {
            i2 = this.f143508d.getExperiment().VideoCacheTTnetPreloadTimeoutExperiment();
        } else {
            i2 = 30000;
        }
        t.a().a((long) i2);
    }

    private void i() {
        int i2;
        if (u.f154997l) {
            i2 = this.f143508d.getExperiment().VideoCacheTTnetProxyTimeoutExperiment();
        } else {
            i2 = 10000;
        }
        com.toutiao.proxyserver.v.a().a((long) i2);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean a() {
        if (this.p != null) {
            return true;
        }
        g();
        try {
            b bVar = new b();
            this.p = bVar;
            bVar.start();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void c() {
        if (a()) {
            this.p.a(3);
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public Queue<a> f143525a = new LinkedBlockingQueue();

        /* renamed from: b  reason: collision with root package name */
        public Queue<a> f143526b = new LinkedBlockingQueue();

        /* renamed from: d  reason: collision with root package name */
        private boolean f143528d = true;

        /* renamed from: e  reason: collision with root package name */
        private final Queue<a> f143529e = new ArrayBlockingQueue(10);

        /* renamed from: f  reason: collision with root package name */
        private c f143530f = new c(this);

        static {
            Covode.recordClassIndex(93912);
        }

        private static void a() {
            if (com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug() && Thread.currentThread() == Looper.getMainLooper().getThread()) {
                throw new IllegalStateException("cannot run on the main thread!");
            }
        }

        public final void run() {
            MethodCollector.i(5967);
            while (this.f143528d) {
                synchronized (this) {
                    try {
                        if (!this.f143526b.isEmpty() && VideoCachePreloader.this.f143508d.canPreload()) {
                            a();
                            while (true) {
                                a poll = this.f143526b.poll();
                                if (poll == null) {
                                    break;
                                } else if (VideoCachePreloader.this.f143507c) {
                                    final com.ss.android.ugc.playerkit.simapicommon.a.i iVar = poll.f143542h;
                                    final int i2 = poll.f143538d;
                                    poll.f143541g = new q() {
                                        /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.b.AnonymousClass1 */

                                        /* renamed from: a  reason: collision with root package name */
                                        com.ss.android.ugc.playerkit.videoview.a.c f143531a;

                                        static {
                                            Covode.recordClassIndex(93913);
                                        }

                                        @Override // com.toutiao.proxyserver.q
                                        public final String c() {
                                            if (this.f143531a == null) {
                                                a();
                                            }
                                            com.ss.android.ugc.playerkit.videoview.a.c cVar = this.f143531a;
                                            if (cVar != null) {
                                                return cVar.f148910c;
                                            }
                                            return null;
                                        }

                                        @Override // com.toutiao.proxyserver.q
                                        public final String[] a() {
                                            if (this.f143531a == null) {
                                                this.f143531a = VideoCachePreloader.this.f143508d.createVideoUrlProcessor().a(iVar, com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType());
                                            }
                                            com.ss.android.ugc.playerkit.videoview.a.c cVar = this.f143531a;
                                            if (cVar != null) {
                                                return cVar.f148908a;
                                            }
                                            return null;
                                        }

                                        @Override // com.toutiao.proxyserver.q
                                        public final int b() {
                                            if (this.f143531a == null) {
                                                a();
                                            }
                                            int i2 = i2;
                                            if (this.f143531a == null) {
                                                return i2;
                                            }
                                            int PlayerAbPreloadSizeOffsetThresholdExp = VideoCachePreloader.this.f143508d.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                                            if (this.f143531a.f148911d != null) {
                                                if (this.f143531a.f148911d.getSize() <= i2 || this.f143531a.f148911d.getSize() - i2 > PlayerAbPreloadSizeOffsetThresholdExp) {
                                                    return i2;
                                                }
                                                return this.f143531a.f148911d.getSize();
                                            } else if (iVar.getSize() <= ((long) i2) || iVar.getSize() - ((long) i2) > ((long) PlayerAbPreloadSizeOffsetThresholdExp)) {
                                                return i2;
                                            } else {
                                                return (int) iVar.getSize();
                                            }
                                        }
                                    };
                                    b(poll);
                                } else {
                                    com.ss.android.ugc.playerkit.videoview.a.c a2 = VideoCachePreloader.this.f143508d.createVideoUrlProcessor().a(poll.f143542h, com.ss.android.ugc.playerkit.model.c.f148702a.getPlayerType());
                                    if (a2 != null) {
                                        poll.f143537c = a2.f148908a;
                                        poll.f143536b = a2.f148910c;
                                        poll.f143542h = null;
                                        b(poll);
                                    }
                                }
                            }
                        }
                        while (!this.f143525a.isEmpty()) {
                            a poll2 = this.f143525a.poll();
                            if (poll2 != null) {
                                int i3 = poll2.f143535a;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                        t.a().a(poll2.f143536b);
                                    } else if (i3 == 2) {
                                        t.a().b();
                                    } else if (i3 == 3) {
                                        t.a().b();
                                        if (u.f154986a != null) {
                                            com.toutiao.proxyserver.g.b.a(new Runnable() {
                                                /* class com.toutiao.proxyserver.g.AnonymousClass1 */

                                                static {
                                                    Covode.recordClassIndex(103138);
                                                }

                                                public final void run() {
                                                    g gVar = g.this;
                                                    t.a().b();
                                                    Context context = u.f154990e;
                                                    if (context != null) {
                                                        c.a(context).b(1);
                                                    }
                                                    for (File file : gVar.f154855a.listFiles()) {
                                                        try {
                                                            g.a(file);
                                                        } catch (Throwable unused) {
                                                        }
                                                    }
                                                }
                                            });
                                        }
                                        if (u.f154987b != null) {
                                            h hVar = u.f154987b;
                                            t.a().b();
                                            Context context = u.f154990e;
                                            if (context != null) {
                                                com.toutiao.proxyserver.c.c.a(context).b(0);
                                            }
                                            hVar.f154873i.removeCallbacks(hVar.f154872h);
                                            hVar.f154871g.execute(new Runnable() {
                                                /* class com.toutiao.proxyserver.h.AnonymousClass6 */

                                                static {
                                                    Covode.recordClassIndex(103150);
                                                }

                                                public final void run() {
                                                    h.this.a(0);
                                                }
                                            });
                                        }
                                    } else if (i3 == 4) {
                                        t.a().b();
                                        this.f143528d = false;
                                    }
                                } else if (poll2.f143541g == null) {
                                    if (poll2.f143537c != null && poll2.f143537c.length > 0) {
                                        ArrayList arrayList = new ArrayList();
                                        String[] strArr = poll2.f143537c;
                                        for (String str : strArr) {
                                            if (com.toutiao.proxyserver.g.b.a(str)) {
                                                arrayList.add(str);
                                            }
                                        }
                                        String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                                        if (poll2.f143538d <= 0) {
                                            t.a().a(false, t.f154953h.f154951b, poll2.f143536b, (List<com.toutiao.proxyserver.net.c>) null, strArr2);
                                        } else {
                                            int PlayerAbPreloadSizeOffsetThresholdExp = VideoCachePreloader.this.f143508d.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
                                            if (poll2.f143539e > poll2.f143538d && poll2.f143539e - poll2.f143538d <= PlayerAbPreloadSizeOffsetThresholdExp) {
                                                poll2.f143538d = poll2.f143539e;
                                            }
                                            t.a f2 = t.a().f();
                                            f2.f154980b = poll2.f143536b;
                                            f2.f154979a = poll2.f143538d;
                                            f2.f154981c = strArr2;
                                            f2.a();
                                        }
                                    }
                                } else if (poll2.f143538d <= 0) {
                                    t.a().a(false, t.f154953h.f154951b, poll2.f143536b, (List<com.toutiao.proxyserver.net.c>) null, poll2.f143541g);
                                } else {
                                    t.a f3 = t.a().f();
                                    f3.f154979a = poll2.f143538d;
                                    f3.f154982d = poll2.f143541g;
                                    f3.a();
                                }
                                a();
                                poll2.f143537c = null;
                                poll2.f143536b = null;
                                poll2.f143535a = -1;
                                poll2.f143542h = null;
                                poll2.f143538d = -1;
                                poll2.f143540f = false;
                                this.f143529e.offer(poll2);
                            }
                        }
                        try {
                            wait();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(5967);
                        throw th;
                    }
                }
            }
            MethodCollector.o(5967);
        }

        /* access modifiers changed from: package-private */
        public final void a(a aVar) {
            this.f143530f.a(aVar);
        }

        /* access modifiers changed from: package-private */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public int f143535a;

            /* renamed from: b  reason: collision with root package name */
            public String f143536b;

            /* renamed from: c  reason: collision with root package name */
            public String[] f143537c;

            /* renamed from: d  reason: collision with root package name */
            public int f143538d = -1;

            /* renamed from: e  reason: collision with root package name */
            public int f143539e = -1;

            /* renamed from: f  reason: collision with root package name */
            public boolean f143540f;

            /* renamed from: g  reason: collision with root package name */
            public q f143541g;

            /* renamed from: h  reason: collision with root package name */
            public com.ss.android.ugc.playerkit.simapicommon.a.i f143542h;

            static {
                Covode.recordClassIndex(93914);
            }

            a() {
            }
        }

        private void b(a aVar) {
            a();
            if (aVar != null) {
                this.f143525a.offer(aVar);
                notify();
            }
        }

        public final void a(int i2) {
            a b2 = b(i2);
            b2.f143540f = true;
            this.f143530f.a(b2);
        }

        b() {
        }

        private a b(int i2) {
            com.ss.android.ugc.aweme.cf.a.b.a(VideoCachePreloader.f143505a, "pool: " + this.f143529e.size());
            a poll = this.f143529e.poll();
            if (poll == null) {
                poll = new a();
            }
            poll.f143536b = null;
            poll.f143535a = i2;
            poll.f143537c = null;
            return poll;
        }

        public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2) {
            if (iVar != null) {
                a(a(0, iVar, i2));
            }
        }

        /* access modifiers changed from: package-private */
        public final a a(int i2, com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i3) {
            com.ss.android.ugc.aweme.cf.a.b.a(VideoCachePreloader.f143505a, "pool: " + this.f143529e.size());
            a poll = this.f143529e.poll();
            if (poll == null) {
                poll = new a();
            }
            poll.f143535a = i2;
            poll.f143542h = iVar;
            poll.f143538d = i3;
            if (iVar != null) {
                poll.f143539e = (int) iVar.getSize();
            }
            return poll;
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f143547a;

        /* renamed from: b  reason: collision with root package name */
        private b.a f143548b;

        static {
            Covode.recordClassIndex(93916);
        }

        public final void run() {
            MethodCollector.i(5333);
            synchronized (this.f143547a) {
                try {
                    b.a aVar = this.f143548b;
                    if (!aVar.f143540f) {
                        this.f143547a.f143526b.add(aVar);
                    } else {
                        this.f143547a.f143526b.clear();
                        this.f143547a.f143525a.clear();
                        this.f143547a.f143525a.offer(aVar);
                    }
                    this.f143547a.notify();
                } finally {
                    MethodCollector.o(5333);
                }
            }
        }

        public d(b bVar, b.a aVar) {
            this.f143547a = bVar;
            this.f143548b = aVar;
        }
    }

    private h j() {
        long a2;
        h hVar;
        IOException e2;
        File file;
        Application application = com.ss.android.ugc.playerkit.simapicommon.a.f148866a;
        if (application == null) {
            return null;
        }
        File file2 = r;
        if (file2 == null) {
            if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                com.ss.android.ugc.aweme.lancet.d.f107194b = application.getCacheDir();
            }
            File file3 = com.ss.android.ugc.aweme.lancet.d.f107194b;
            if (this.f143508d.getStorageManager().a()) {
                file3 = this.f143508d.getStorageManager().a(application, i.a.PREFER_PRIVATE);
            }
            if (com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                file3 = com.ss.android.ugc.playerkit.d.a.a(application);
            }
            if (file3 == null) {
                return null;
            }
            file2 = new File(file3, o);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            r = file2;
        }
        long j2 = 104857600;
        int VideoCacheMaxCacheSizeExperiment = this.f143508d.getExperiment().VideoCacheMaxCacheSizeExperiment();
        if (VideoCacheMaxCacheSizeExperiment > 0) {
            j2 = (long) (VideoCacheMaxCacheSizeExperiment * 1048576);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            a2 = j2;
        } else {
            a2 = (com.ss.android.ugc.playerkit.d.b.a() * 1048576) / 8;
        }
        if (this.f143508d.getStorageManager().a() && (file = r) != null) {
            a2 = file.getFreeSpace() / 8;
        }
        if (a2 <= j2) {
            if (a2 < 10485760) {
                j2 = 10485760;
            } else {
                j2 = a2;
            }
        }
        n = file2;
        try {
            hVar = new h(file2);
            try {
                hVar.f154869e = j2;
                hVar.a();
            } catch (IOException e3) {
                e2 = e3;
            }
        } catch (IOException e4) {
            e2 = e4;
            hVar = null;
            e2.printStackTrace();
            return hVar;
        }
        return hVar;
    }

    public final void g() {
        h j2;
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.q && (j2 = j()) != null) {
            if (this.f143508d.getExperiment().PlayerPreloadLazyGetUrlsExperiment().booleanValue() || com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                z = true;
            } else {
                z = false;
            }
            this.f143507c = z;
            int VideoSpeedQueueSizeExperiment = this.f143508d.getExperiment().VideoSpeedQueueSizeExperiment();
            if (this.f143508d.getSpeedManager().a() != VideoSpeedQueueSizeExperiment && VideoSpeedQueueSizeExperiment > 0) {
                this.f143508d.getSpeedManager().a(VideoSpeedQueueSizeExperiment);
                this.f143508d.getSpeedManager().b(VideoSpeedQueueSizeExperiment);
            }
            s.f154950a = 1;
            t.f154953h.f154952c = new LinkedBlockingQueue();
            u.B = com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
            u.o = 10;
            u.A = this.f143508d.getExperiment().VideoCacheWriteAsynchronousExperiment().booleanValue();
            u.x = 1;
            u.z = this.f143508d.getExperiment().UseVideoCacheHttpDnsExperiment().booleanValue();
            u.f154998m = this.f143508d.getPlayerCommonParamManager().b();
            u.w = this.f143508d.getPlayerCommonParamManager().a();
            u.p = this.f143508d.getExperiment().CheckVideoCacheRequestHeaderExperiment().booleanValue();
            u.q = this.f143508d.getExperiment().PreloadLocalCachePathVideoPlayExperiment().booleanValue();
            u.t = this.f143508d.getExperiment().VideoCacheAutoAdjustPreloadMaxExperiment().booleanValue();
            u.n = this.f143508d.getExperiment().VideoCacheReadBuffersizeExperiment();
            u.r = this.f143508d.getExperiment().PlayerAbUseLastIf403Exp().booleanValue();
            if (this.f143508d.getExperiment().PlayUse2UrlExperiment() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            u.s = z2;
            if (this.f143508d.getExperiment().PlayeAbUserHttp2Exp() == 1 || com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                z3 = true;
            } else {
                z3 = false;
            }
            u.u = z3;
            com.toutiao.proxyserver.f.c.f154840c = 300;
            if (this.f143508d.getExperiment().UseTTNetExperiment() == 1) {
                u.f154997l = true;
            } else {
                u.f154997l = false;
            }
            u.v = this.f143508d.getMusicService().a();
            com.toutiao.proxyserver.e.c.f154828a = new com.toutiao.proxyserver.e.a() {
                /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass8 */

                static {
                    Covode.recordClassIndex(93909);
                }

                @Override // com.toutiao.proxyserver.e.a
                public final void a(String str, String str2, String str3) {
                    if (!com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                        com.ss.android.ugc.aweme.cf.a.b.a(str, str2);
                    }
                    JSONObject a2 = VideoCachePreloader.a(str, str2, str3);
                    if (a2 != null) {
                        com.ss.android.ugc.playerkit.simapicommon.a.d().d("VideoCache", a2);
                    }
                }

                @Override // com.toutiao.proxyserver.e.a
                public final void b(String str, String str2, String str3) {
                    if (!com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                        com.ss.android.ugc.aweme.cf.a.b.a(str, str2);
                    }
                    JSONObject a2 = VideoCachePreloader.a(str, str2, str3);
                    if (a2 != null) {
                        com.ss.android.ugc.playerkit.simapicommon.a.d().i("VideoCache", a2);
                    }
                }

                @Override // com.toutiao.proxyserver.e.a
                public final void c(String str, String str2, String str3) {
                    if (!com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                        com.ss.android.ugc.aweme.cf.a.b.a(str, str2);
                    }
                    JSONObject a2 = VideoCachePreloader.a(str, str2, str3);
                    if (a2 != null) {
                        com.ss.android.ugc.playerkit.simapicommon.a.d().w("VideoCache", a2);
                    }
                }

                @Override // com.toutiao.proxyserver.e.a
                public final void d(String str, String str2, String str3) {
                    if (!com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug()) {
                        com.ss.android.ugc.aweme.cf.a.b.a(str, str2);
                    }
                    JSONObject a2 = VideoCachePreloader.a(str, str2, str3);
                    if (a2 != null) {
                        com.ss.android.ugc.playerkit.simapicommon.a.d().e("VideoCache", a2);
                    }
                }
            };
            u.y = new com.toutiao.proxyserver.e.b() {
                /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(93910);
                }
            };
            com.toutiao.proxyserver.e.c.f154829b = true;
            u.f154994i = new m() {
                /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(93901);
                }

                @Override // com.toutiao.proxyserver.m
                public final void a(int i2, String str, String str2) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("video_cache_error_code", i2);
                        if (str.length() > 1500) {
                            str = str.substring(0, 1500);
                        }
                        jSONObject.put("video_cache_msg", str);
                        jSONObject.put("video_cache_use_ttnet", u.f154997l);
                        com.ss.android.ugc.aweme.cf.a.b.a(str2, i2 + jSONObject.toString());
                        com.ss.android.ugc.playerkit.simapicommon.a.b().monitorCommonLog("video_cache_error_report", jSONObject);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            };
            u.f154995j = new l() {
                /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass11 */

                static {
                    Covode.recordClassIndex(93902);
                }

                @Override // com.toutiao.proxyserver.l
                public final void a(int i2, String str) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", i2);
                        jSONObject.put("url", str);
                        com.ss.android.ugc.playerkit.simapicommon.a.b().monitorCommonLog("aweme_media_play_video_data_download", "aweme_media_play_video_data_download", jSONObject);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            };
            u.f154993h = new n() {
                /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(93903);
                }

                @Override // com.toutiao.proxyserver.n
                public final void a(com.toutiao.proxyserver.b.a aVar) {
                    if (aVar.f154781a != null && aVar.f154784d >= 0 && aVar.f154783c > 0) {
                        VideoCachePreloader.this.f143513i.put(aVar.f154781a, aVar);
                    }
                }
            };
            u.f154992g = new o() {
                /* class com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(93904);
                }

                @Override // com.toutiao.proxyserver.o
                public final void a(boolean z, String str, int i2, int i3, String str2) {
                    com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
                    com.ss.android.ugc.playerkit.simapicommon.a.f148867b.execute(new q(this, z, str, i2, i3, str2));
                }

                @Override // com.toutiao.proxyserver.o
                public final void a() {
                    com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
                }

                @Override // com.toutiao.proxyserver.o
                public final void b() {
                    if (VideoCachePreloader.this.f143514j != null) {
                        VideoCachePreloader.this.f143514j.get();
                    }
                }

                @Override // com.toutiao.proxyserver.o
                public final void a(com.toutiao.proxyserver.b.b bVar) {
                    List<x> list;
                    if (bVar.f154785a != null && bVar.f154788d >= 0 && bVar.f154787c > 0) {
                        if (VideoCachePreloader.this.f143517m == null || !TextUtils.equals(VideoCachePreloader.this.f143517m.f148849a, bVar.f154785a)) {
                            VideoCachePreloader videoCachePreloader = VideoCachePreloader.this;
                            String str = bVar.f154785a;
                            x xVar = null;
                            if (!TextUtils.isEmpty(str) && (list = videoCachePreloader.f143512h.get(str)) != null && list.size() > 0) {
                                xVar = list.get(list.size() - 1);
                            }
                            videoCachePreloader.f143517m = xVar;
                        }
                        if (VideoCachePreloader.this.f143517m != null) {
                            x xVar2 = VideoCachePreloader.this.f143517m;
                            com.ss.android.ugc.playerkit.model.e eVar = new com.ss.android.ugc.playerkit.model.e();
                            eVar.f148720c = bVar.f154787c;
                            eVar.f148718a = bVar.f154785a;
                            eVar.f148721d = bVar.f154788d;
                            eVar.f148719b = bVar.f154786b;
                            h.f.b.l.c(eVar, "");
                            if (xVar2.f148851c == null) {
                                xVar2.f148851c = new ArrayList<>();
                            }
                            ArrayList<com.ss.android.ugc.playerkit.model.e> arrayList = xVar2.f148851c;
                            if (arrayList != null) {
                                arrayList.add(eVar);
                            }
                            List<com.toutiao.proxyserver.b.b> list2 = VideoCachePreloader.this.f143511g.get(bVar.f154785a);
                            if (list2 == null) {
                                list2 = new ArrayList<>();
                                VideoCachePreloader.this.f143511g.put(bVar.f154785a, list2);
                            }
                            list2.add(bVar);
                        }
                    }
                }

                /* JADX WARNING: Removed duplicated region for block: B:13:0x0093  */
                /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
                @Override // com.toutiao.proxyserver.o
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void a(com.toutiao.proxyserver.b.c r6) {
                    /*
                    // Method dump skipped, instructions count: 200
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.VideoCachePreloader.AnonymousClass3.a(com.toutiao.proxyserver.b.c):void");
                }

                @Override // com.toutiao.proxyserver.o
                public final void a(JSONObject jSONObject) {
                    com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
                    com.ss.android.ugc.playerkit.simapicommon.a.f148867b.execute(new p(this, jSONObject));
                }

                @Override // com.toutiao.proxyserver.o
                public final void a(j jVar, int i2, String str) {
                    e eVar;
                    com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
                    if (VideoCachePreloader.this.f143516l != null && (eVar = VideoCachePreloader.this.f143516l.get()) != null) {
                        eVar.a(jVar, i2, str);
                    }
                }

                @Override // com.toutiao.proxyserver.o
                public final void a(String str, int i2, int i3) {
                    com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
                    for (WeakReference<f> weakReference : VideoCachePreloader.this.f143515k) {
                        f fVar = weakReference.get();
                        if (fVar != null) {
                            fVar.a(str, (long) i2, (long) i3);
                        }
                    }
                }

                @Override // com.toutiao.proxyserver.o
                public final void a(String str, int i2, String str2) {
                    e eVar;
                    com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
                    if (VideoCachePreloader.this.f143516l != null && (eVar = VideoCachePreloader.this.f143516l.get()) != null) {
                        eVar.a(str, i2, str2);
                    }
                }

                @Override // com.toutiao.proxyserver.o
                public final void a(int i2, long j2, long j3) {
                    long j4 = j2;
                    if (i2 <= 0) {
                        return;
                    }
                    if (j4 <= 0 || VideoCachePreloader.this.f143508d.getExperiment().VideoNetworkSpeedAlgorithmExperiment() != 2) {
                        if (VideoCachePreloader.this.f143508d.getExperiment().VideoDownloadSpeedCostTimeExperiment() != 1) {
                            j4 = j3;
                        }
                        if (j4 > 0) {
                            double d2 = (double) i2;
                            Double.isNaN(d2);
                            double d3 = (double) j4;
                            Double.isNaN(d3);
                            VideoCachePreloader.this.f143508d.getSpeedManager().a((8.0d * d2) / (d3 / 1000.0d), d2, j4);
                            Integer a2 = VideoCachePreloader.this.f143508d.getMLServiceSpeedModel().a();
                            if (a2 != null) {
                                if (VideoCachePreloader.this.f143506b == null) {
                                    VideoCachePreloader.this.f143506b = new e(VideoCachePreloader.this.f143508d.getSpeedManager(), a2.intValue());
                                }
                                VideoCachePreloader.this.f143506b.a();
                            }
                            com.ss.android.ugc.playerkit.simapicommon.a.a().isDebug();
                            return;
                        }
                        return;
                    }
                    VideoCachePreloader.this.f143508d.getSpeedManager().b();
                }
            };
            com.toutiao.proxyserver.v.a().b();
            u.a(j2, com.ss.android.ugc.playerkit.simapicommon.a.f148866a);
            h();
            i();
            this.q = true;
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final HandlerThread f143544a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f143545b;

        /* renamed from: c  reason: collision with root package name */
        private final b f143546c;

        static {
            Covode.recordClassIndex(93915);
        }

        public final void a(b.a aVar) {
            this.f143545b.post(new d(this.f143546c, aVar));
        }

        c(b bVar) {
            HandlerThread handlerThread = new HandlerThread("preload-schedule-thread");
            this.f143544a = handlerThread;
            handlerThread.start();
            this.f143545b = new Handler(handlerThread.getLooper());
            this.f143546c = bVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final int c(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (iVar != null) {
            return (int) ae.b.f154780a.a(iVar.getBitRatedRatioUri());
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final List<v> g(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return this.f143510f.get(iVar.getBitRatedRatioUri());
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final List<x> h(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        return this.f143512h.get(iVar.getBitRatedRatioUri());
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean b(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (iVar == null) {
            return false;
        }
        return a(iVar);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void d(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (a()) {
            b bVar = this.p;
            bVar.a(bVar.a(1, iVar, -1));
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final v f(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        try {
            return this.f143509e.get(iVar.getBitRatedRatioUri());
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final long b(String str) {
        com.toutiao.proxyserver.c.a a2;
        com.toutiao.proxyserver.c.c cVar = t.a().f154957c;
        if (cVar == null || TextUtils.isEmpty(str) || (a2 = cVar.a(com.toutiao.proxyserver.g.a.a(str), 0)) == null) {
            return 0;
        }
        return (long) a2.f154804c;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final long a(String str) {
        File e2;
        h hVar = t.a().f154958d;
        if (!(hVar == null || TextUtils.isEmpty(str) || (e2 = hVar.e(com.toutiao.proxyserver.g.a.a(str))) == null)) {
            long length = e2.length();
            if (length > 0) {
                return length;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final m e(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        try {
            List<com.toutiao.proxyserver.b.b> list = this.f143511g.get(iVar.getBitRatedRatioUri());
            if (list == null || list.size() <= 0) {
                return null;
            }
            m mVar = new m();
            mVar.f143730c = list.size();
            for (com.toutiao.proxyserver.b.b bVar : list) {
                if (bVar != null) {
                    mVar.f143728a += bVar.f154788d;
                    mVar.f143729b += bVar.f154787c;
                }
            }
            return mVar;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(f fVar) {
        Iterator<WeakReference<f>> it = this.f143515k.iterator();
        if (!it.hasNext() || it.next().get() != fVar) {
            this.f143515k.add(new WeakReference<>(fVar));
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar) {
        if (iVar == null || ae.b.f154780a.a(iVar.getBitRatedRatioUri()) <= 0) {
            return false;
        }
        return true;
    }

    static class e extends com.ss.android.ugc.aweme.video.preload.c.a {
        static {
            Covode.recordClassIndex(93917);
        }

        e(com.ss.android.ugc.aweme.video.preload.api.e eVar, int i2) {
            super(new r(eVar), i2);
        }
    }

    public static JSONObject a(String str, String str2, String str3) {
        JSONObject jSONObject;
        if (!com.ss.android.ugc.playerkit.simapicommon.a.d().isEnabled()) {
            return null;
        }
        jSONObject = new JSONObject();
        try {
            jSONObject.put("tag", str);
            jSONObject.put("msg", str2);
            jSONObject.put("vid", str3);
            return jSONObject;
        } catch (JSONException e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final /* synthetic */ Object a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, String[] strArr) {
        if (this.f143508d.getCacheHelper().a()) {
            String a2 = this.f143508d.getCacheHelper().a(iVar.getSourceId());
            if (this.f143508d.getCacheHelper().b(a2)) {
                iVar.getSourceId();
                return a2;
            }
        }
        return com.toutiao.proxyserver.v.a().a(str, false, strArr);
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final void a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, String str, boolean z, d dVar) {
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.video.preload.g
    public final boolean a(com.ss.android.ugc.playerkit.simapicommon.a.i iVar, int i2, n nVar, g.a aVar) {
        if (!a()) {
            return false;
        }
        this.p.a(iVar, i2);
        return true;
    }
}
