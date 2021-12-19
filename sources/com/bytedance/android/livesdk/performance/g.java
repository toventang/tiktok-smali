package com.bytedance.android.livesdk.performance;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveFluencyEnterDurationSetting;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.f.b.m;
import h.h;
import java.util.LinkedHashMap;
import java.util.Map;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final long f20230a = LiveFluencyEnterDurationSetting.INSTANCE.getValue();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<String, h<b>> f20231b;

    /* renamed from: c  reason: collision with root package name */
    public static String f20232c = "";

    /* renamed from: d  reason: collision with root package name */
    public static boolean f20233d;

    /* renamed from: e  reason: collision with root package name */
    public static final g f20234e = new g();

    /* renamed from: f  reason: collision with root package name */
    private static final h f20235f = com.bytedance.android.livesdkapi.m.d.a(a.f20262a);

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, h<p>> f20236g;

    public static Handler a() {
        return (Handler) f20235f.getValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Handler> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20262a = new a();

        static {
            Covode.recordClassIndex(11958);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20264a;

        static {
            Covode.recordClassIndex(11960);
        }

        public c(b bVar) {
            this.f20264a = bVar;
        }

        public final void run() {
            this.f20264a.b();
            g.f20232c = "preview_period";
            g.g();
        }
    }

    public static void c() {
        h();
        f20232c = "audience_link_period";
        g();
    }

    public static void e() {
        h();
        f20232c = "pk_period";
        g();
    }

    public static void f() {
        h();
        f20232c = "broadcast_link_period";
        g();
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20263a;

        static {
            Covode.recordClassIndex(11959);
        }

        public b(b bVar) {
            this.f20263a = bVar;
        }

        public final void run() {
            this.f20263a.b();
            if (g.f20232c.length() == 0) {
                g.f20232c = "broadcast_period";
                g.g();
            }
        }
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20265a;

        static {
            Covode.recordClassIndex(11961);
        }

        d(b bVar) {
            this.f20265a = bVar;
        }

        public final void run() {
            this.f20265a.b();
            if (g.f20232c.length() == 0) {
                g.f20232c = "watch_period";
                g.g();
            }
        }
    }

    public static void d() {
        String str;
        h();
        if (f20233d) {
            str = "broadcast_period";
        } else {
            str = "watch_period";
        }
        f20232c = str;
        g();
    }

    public static void b() {
        b value;
        f20233d = false;
        h<b> hVar = f20231b.get("watch_enter");
        if (hVar != null && (value = hVar.getValue()) != null) {
            value.f20200c = false;
            value.a();
            a().postDelayed(new d(value), f20230a);
        }
    }

    public static void g() {
        p value;
        b value2;
        h<b> hVar = f20231b.get(f20232c);
        if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
            value2.f20200c = f20233d;
        }
        h<p> hVar2 = f20236g.get(f20232c);
        if (hVar2 != null && (value = hVar2.getValue()) != null) {
            a().removeCallbacks(value);
            a().post(value);
        }
    }

    public static void h() {
        b value;
        p value2;
        h<p> hVar = f20236g.get(f20232c);
        if (!(hVar == null || (value2 = hVar.getValue()) == null)) {
            a().removeCallbacks(value2);
        }
        h<b> hVar2 = f20231b.get(f20232c);
        if (hVar2 != null && (value = hVar2.getValue()) != null) {
            value.b();
        }
    }

    public static void i() {
        a().removeCallbacksAndMessages(null);
        for (Map.Entry<String, h<b>> entry : f20231b.entrySet()) {
            if (entry.getValue().isInitialized() && entry.getValue().getValue().f20201d) {
                entry.getValue().getValue().b();
            }
        }
        f20232c = "";
    }

    static {
        Covode.recordClassIndex(11932);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f20231b = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        f20236g = linkedHashMap2;
        linkedHashMap.put("watch_enter", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass1.f20237a));
        linkedHashMap.put("watch_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass12.f20240a));
        linkedHashMap.put("watch_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass19.f20247a));
        linkedHashMap.put("broadcast_enter", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass20.f20249a));
        linkedHashMap.put("broadcast_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass21.f20250a));
        linkedHashMap.put("preview_enter", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass22.f20251a));
        linkedHashMap.put("preview_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass23.f20252a));
        linkedHashMap.put("broadcast_link_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass24.f20253a));
        linkedHashMap.put("audience_link_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass25.f20254a));
        linkedHashMap.put("pk_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass2.f20248a));
        linkedHashMap.put("gift_play", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass3.f20255a));
        linkedHashMap.put("panel_gift_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass4.f20256a));
        linkedHashMap.put("panel_hourly_rank_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass5.f20257a));
        linkedHashMap.put("panel_broadcast_link_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass6.f20258a));
        linkedHashMap.put("panel_public_screen_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass7.f20259a));
        linkedHashMap.put("panel_beauty_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass8.f20260a));
        linkedHashMap.put("panel_filter_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass9.f20261a));
        linkedHashMap.put("panel_sticker_slide", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass10.f20238a));
        linkedHashMap2.put("watch_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass11.f20239a));
        linkedHashMap2.put("broadcast_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass13.f20241a));
        linkedHashMap2.put("preview_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass14.f20242a));
        linkedHashMap2.put("broadcast_link_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass15.f20243a));
        linkedHashMap2.put("audience_link_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass16.f20244a));
        linkedHashMap2.put("pk_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass17.f20245a));
        linkedHashMap2.put("broadcast_period", com.bytedance.android.livesdkapi.m.d.a(AnonymousClass18.f20246a));
    }

    public static void a(RecyclerView recyclerView) {
        b bVar;
        l.d(recyclerView, "");
        h<b> hVar = f20231b.get("panel_gift_slide");
        if (hVar != null) {
            bVar = hVar.getValue();
        } else {
            bVar = null;
        }
        recyclerView.a(new c(bVar));
    }
}
