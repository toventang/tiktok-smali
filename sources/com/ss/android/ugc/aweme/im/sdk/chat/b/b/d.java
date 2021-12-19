package com.ss.android.ugc.aweme.im.sdk.chat.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final h f100125a = i.a((h.f.a.a) a.f100132a);

    /* renamed from: b  reason: collision with root package name */
    static final ConcurrentHashMap<String, List<f>> f100126b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    static Map<String, f> f100127c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final d f100128d = new d();

    /* renamed from: e  reason: collision with root package name */
    private static int f100129e = Math.max(6, Runtime.getRuntime().availableProcessors());

    /* renamed from: f  reason: collision with root package name */
    private static final ExecutorService f100130f;

    /* renamed from: g  reason: collision with root package name */
    private static final h f100131g = i.a((h.f.a.a) b.f100133a);

    private d() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f100132a = new a();

        static {
            Covode.recordClassIndex(63823);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(c.a().f100117a);
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f100133a = new b();

        static {
            Covode.recordClassIndex(63824);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(c.a().f100118b);
        }
    }

    static {
        Covode.recordClassIndex(63822);
        int i2 = f100129e;
        f100130f = new ThreadPoolExecutor(i2, i2, 30, TimeUnit.SECONDS, new PriorityBlockingQueue());
    }

    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f100134a;

        static {
            Covode.recordClassIndex(63825);
        }

        c(f fVar) {
            this.f100134a = fVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.chat.b.b.e
        public final void a(h hVar) {
            l.d(hVar, "");
            hVar.f100145b = 2;
            f fVar = this.f100134a;
            ai aiVar = fVar.f100135a.get();
            if (aiVar != null) {
                l.b(aiVar, "");
                List<h> list = fVar.f100136b;
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t.f100145b != 2) {
                        arrayList.add(t);
                    }
                }
                if (arrayList.isEmpty()) {
                    d.f100127c.remove(aiVar.getUuid());
                    List<f> list2 = d.f100126b.get(aiVar.getConversationId());
                    if (list2 != null) {
                        list2.remove(fVar);
                    }
                    com.ss.android.ugc.aweme.im.service.m.a.b("MediaPreloader", "removeAndCheck preloadJobs remove: " + aiVar.getUuid());
                }
            }
        }
    }

    private static boolean a(f fVar) {
        ai aiVar = fVar.f100135a.get();
        if (aiVar == null) {
            return false;
        }
        l.b(aiVar, "");
        if (f100127c.get(aiVar.getUuid()) == null) {
            Map<String, f> map = f100127c;
            String uuid = aiVar.getUuid();
            l.b(uuid, "");
            map.put(uuid, fVar);
            com.ss.android.ugc.aweme.im.service.m.a.b("MediaPreloader", "tryDownloadImage add to preloadJobs: " + aiVar.getUuid());
            f100130f.execute(new g(fVar, new c(fVar)));
            return true;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("MediaPreloader", "tryDownloadImage " + aiVar.getUuid() + " job exists");
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0062 A[LOOP:1: B:17:0x005c->B:19:0x0062, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.util.List<com.bytedance.im.core.d.ai> r8) {
        /*
        // Method dump skipped, instructions count: 130
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.b.b.d.b(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.q.b(r4.getImageType()) == false) goto L_0x010e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fc A[LOOP:3: B:44:0x00f6->B:46:0x00fc, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0016 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.List<com.bytedance.im.core.d.ai> r14) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.b.b.d.a(java.util.List):void");
    }
}
