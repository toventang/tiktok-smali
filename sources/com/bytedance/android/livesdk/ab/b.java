package com.bytedance.android.livesdk.ab;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.android.livesdk.ab.b.a;
import com.bytedance.android.livesdk.ab.b.c;
import com.bytedance.android.livesdk.ab.b.d;
import com.bytedance.android.livesdk.ab.b.e;
import com.bytedance.android.livesdk.ab.b.f;
import com.bytedance.android.livesdk.ab.c.g;
import com.bytedance.android.livesdk.ab.c.j;
import com.bytedance.android.livesdk.ab.c.l;
import com.bytedance.android.livesdk.ab.c.o;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import h.a.ag;
import h.f.b.m;
import h.h;
import h.i;
import h.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static final h f13436b = i.a((h.f.a.a) c.f13446a);

    /* renamed from: c  reason: collision with root package name */
    public static final h f13437c = i.a((h.f.a.a) C0284b.f13445a);

    /* renamed from: d  reason: collision with root package name */
    public static final a f13438d = new a((byte) 0);

    /* renamed from: h  reason: collision with root package name */
    private static final Map<Class<? extends Object>, com.bytedance.android.livesdk.ab.b.b<? extends Object>> f13439h = ag.a(v.a(o.class, new com.bytedance.android.livesdk.ab.b.i()), v.a(l.class, new f()), v.a(com.bytedance.android.livesdk.ab.c.e.class, new a()), v.a(com.bytedance.android.livesdk.ab.c.f.class, new c()), v.a(g.class, new d()), v.a(com.bytedance.android.livesdk.ab.c.h.class, new e()));

    /* renamed from: i  reason: collision with root package name */
    private static final com.bytedance.android.livesdk.ab.b.h f13440i = new com.bytedance.android.livesdk.ab.b.h();

    /* renamed from: a  reason: collision with root package name */
    public final String f13441a;

    /* renamed from: e  reason: collision with root package name */
    private final List<Object> f13442e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f13443f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    private final boolean f13444g;

    public static final class a {
        static {
            Covode.recordClassIndex(7471);
        }

        public static Handler a() {
            return (Handler) b.f13436b.getValue();
        }

        public static ExecutorService b() {
            return (ExecutorService) b.f13437c.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static b b(String str) {
            h.f.b.l.d(str, "");
            return new b(str, false);
        }

        public static b a(String str) {
            h.f.b.l.d(str, "");
            return new b(str, true);
        }
    }

    public final void a(Object obj) {
        if (obj != null) {
            this.f13442e.add(obj);
        }
    }

    public final b a(String str, String str2) {
        h.f.b.l.d(str, "");
        a(str, (Object) str2);
        return this;
    }

    public final b a(String str, Number number) {
        h.f.b.l.d(str, "");
        a(str, (Object) number);
        return this;
    }

    public final b a(String str, long j2) {
        h.f.b.l.d(str, "");
        a(str, (Object) Long.valueOf(j2));
        return this;
    }

    public final b a(String str, Boolean bool) {
        h.f.b.l.d(str, "");
        a(str, (Object) bool);
        return this;
    }

    public final b a(String str, Float f2) {
        h.f.b.l.d(str, "");
        if (f2 != null && !Float.isNaN(f2.floatValue()) && !Float.isInfinite(f2.floatValue())) {
            this.f13443f.put(str, String.valueOf(f2.floatValue()));
        }
        return this;
    }

    public final b a(String str, Double d2) {
        h.f.b.l.d(str, "");
        if (d2 != null && !Double.isNaN(d2.doubleValue()) && !Double.isInfinite(d2.doubleValue())) {
            this.f13443f.put(str, String.valueOf(d2.doubleValue()));
        }
        return this;
    }

    public final b a(Map<String, String> map) {
        if (map != null) {
            this.f13443f.putAll(map);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13447a;

        static {
            Covode.recordClassIndex(7474);
        }

        d(b bVar) {
            this.f13447a = bVar;
        }

        public final void run() {
            this.f13447a.c();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f13448a;

        static {
            Covode.recordClassIndex(7475);
        }

        e(b bVar) {
            this.f13448a = bVar;
        }

        public final void run() {
            this.f13448a.c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.ab.b$b  reason: collision with other inner class name */
    static final class C0284b extends m implements h.f.a.a<ExecutorService> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0284b f13445a = new C0284b();

        static {
            Covode.recordClassIndex(7472);
        }

        C0284b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ExecutorService invoke() {
            return com.ss.android.ugc.aweme.cw.g.a(com.ss.android.ugc.aweme.cw.l.a(com.ss.android.ugc.aweme.cw.o.SERIAL).a());
        }
    }

    public final Map<String, String> d() {
        a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap);
        return linkedHashMap;
    }

    static final class c extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13446a = new c();

        static {
            Covode.recordClassIndex(7473);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            HandlerThread handlerThread = new HandlerThread("live_logger");
            handlerThread.start();
            return new Handler(handlerThread.getLooper());
        }
    }

    public final b a() {
        a((com.bytedance.android.livesdk.ab.c.h) DataChannelGlobal.f34575d.b(j.class));
        return this;
    }

    public final void b() {
        if (ThreadPoolOptExperiment.INSTANCE.isEnableLog()) {
            a.b().submit(new d(this));
        } else {
            a.a().post(new e(this));
        }
    }

    static {
        Covode.recordClassIndex(7470);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dd, code lost:
        if (h.m.p.a("us", r3, true) != false) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
        // Method dump skipped, instructions count: 303
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.ab.b.c():void");
    }

    private final b a(com.bytedance.android.livesdk.ab.c.h hVar) {
        a((Object) hVar);
        return this;
    }

    public final b b(String str) {
        a("event_belong", str);
        return this;
    }

    public final b c(String str) {
        a("event_type", str);
        return this;
    }

    public final b d(String str) {
        a("event_page", str);
        return this;
    }

    public final b e(String str) {
        a("event_module", str);
        return this;
    }

    public final b f(String str) {
        a("action_type", str);
        return this;
    }

    public final b g(String str) {
        a("anchor_id", str);
        return this;
    }

    public final b h(String str) {
        a("room_id", str);
        return this;
    }

    private final void b(Map<String, String> map) {
        for (T t : this.f13442e) {
            com.bytedance.android.livesdk.ab.b.b<? extends Object> bVar = f13439h.get(t.getClass());
            if (!(bVar instanceof com.bytedance.android.livesdk.ab.b.b)) {
                bVar = null;
            }
            com.bytedance.android.livesdk.ab.b.b<? extends Object> bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.a(map, t);
            }
        }
    }

    public final b a(com.bytedance.android.livesdk.ab.c.e eVar) {
        a((Object) eVar);
        return this;
    }

    public final b a(com.bytedance.android.livesdk.ab.c.f fVar) {
        a((Object) fVar);
        return this;
    }

    public final b a(g gVar) {
        a((Object) gVar);
        return this;
    }

    public final b a(DataChannel dataChannel) {
        com.bytedance.android.livesdk.ab.c.h hVar;
        if (dataChannel != null) {
            hVar = (com.bytedance.android.livesdk.ab.c.h) dataChannel.b(com.bytedance.android.livesdk.ab.c.i.class);
        } else {
            hVar = null;
        }
        a(hVar);
        return this;
    }

    public final b a(String str) {
        a("live_type", str);
        return this;
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f13443f.put(str, obj.toString());
        }
    }

    public b(String str, boolean z) {
        h.f.b.l.d(str, "");
        this.f13441a = str;
        this.f13444g = z;
    }

    public final b a(String str, int i2) {
        h.f.b.l.d(str, "");
        a(str, (Object) Integer.valueOf(i2));
        return this;
    }
}
