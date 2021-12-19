package com.ss.android.ugc.aweme.commercialize.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import com.ss.android.ugc.aweme.commercialize.log.i;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.a.ag;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.l.k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f75480a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f75481b = i.a((h.f.a.a) a.f75482a);

    public static Map<Aweme, Integer> a() {
        return (Map) f75481b.getValue();
    }

    private g() {
    }

    static final class a extends m implements h.f.a.a<Map<Aweme, Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f75482a = new a();

        static {
            Covode.recordClassIndex(46568);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<Aweme, Integer> invoke() {
            if (com.ss.android.ugc.aweme.feed.experiment.m.a()) {
                return Collections.synchronizedMap(new WeakHashMap());
            }
            return new WeakHashMap();
        }
    }

    static {
        Covode.recordClassIndex(46567);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<Map.Entry<? extends Aweme, ? extends Integer>, Aweme> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f75483a = new d();

        static {
            Covode.recordClassIndex(46571);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Aweme invoke(Map.Entry<? extends Aweme, ? extends Integer> entry) {
            Map.Entry<? extends Aweme, ? extends Integer> entry2 = entry;
            l.d(entry2, "");
            return entry2.getKey();
        }
    }

    public static final boolean d(Aweme aweme) {
        if (aweme == null || !f75480a.g(aweme)) {
            return false;
        }
        return true;
    }

    private final boolean g(Aweme aweme) {
        if ((i(aweme) & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean b(Aweme aweme) {
        if ((i(aweme) & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final void a(Aweme aweme) {
        if (aweme != null && com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            f(aweme);
            Map<Aweme, Integer> a2 = a();
            l.b(a2, "");
            a2.put(aweme, 0);
        }
    }

    public static final boolean e(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (!com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme) || aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || !awemeRawAd.useEffectivePlayAction()) {
            return false;
        }
        return true;
    }

    public static final long f(Aweme aweme) {
        float f2;
        AwemeRawAd awemeRawAd;
        Float effectivePlayTime;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (effectivePlayTime = awemeRawAd.getEffectivePlayTime()) == null) {
            f2 = 3.0f;
        } else {
            f2 = effectivePlayTime.floatValue();
        }
        return h.g.a.b((double) (f2 * 1000.0f));
    }

    private final void h(Aweme aweme) {
        Map<Aweme, Integer> a2 = a();
        l.b(a2, "");
        a2.put(aweme, Integer.valueOf(i(aweme) | 1));
    }

    private static int i(Aweme aweme) {
        Integer num;
        if (aweme == null || (num = a().get(aweme)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final void c(Aweme aweme) {
        Map<Aweme, Integer> a2 = a();
        l.b(a2, "");
        a2.put(aweme, Integer.valueOf(i(aweme) | 2));
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<Aweme, Boolean> {
        final /* synthetic */ String $creativeId;

        static {
            Covode.recordClassIndex(46572);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str) {
            super(1);
            this.$creativeId = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(Aweme aweme) {
            String str;
            boolean z;
            Aweme aweme2 = aweme;
            l.b(aweme2, "");
            AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
            if (awemeRawAd != null) {
                str = awemeRawAd.getCreativeIdStr();
            } else {
                str = null;
            }
            if (!l.a((Object) str, (Object) this.$creativeId) || g.f75480a.b(aweme2)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public static final void a(String str) {
        l.d(str, "");
        Map<Aweme, Integer> a2 = a();
        l.b(a2, "");
        for (Aweme aweme : k.g(k.a(k.e(ag.f(a2), d.f75483a), (h.f.a.b) new e(str)))) {
            l.b(aweme, "");
            aweme.getDesc();
            if (e(aweme)) {
                a(aweme, "click");
                f75480a.c(aweme);
            }
            f75480a.h(aweme);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.m<a.b, Boolean, a.b> {
        final /* synthetic */ AwemeRawAd $this_apply;

        static {
            Covode.recordClassIndex(46570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(AwemeRawAd awemeRawAd) {
            super(2);
            this.$this_apply = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ a.b invoke(a.b bVar, Boolean bool) {
            a.b a2;
            a.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$this_apply);
            } else {
                a2 = bVar2.a(this.$this_apply);
            }
            l.b(a2, "");
            return a2;
        }
    }

    public static final class f extends m implements h.f.a.m<a.b, Boolean, a.b> {
        final /* synthetic */ AwemeRawAd $this_apply;

        static {
            Covode.recordClassIndex(46573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(AwemeRawAd awemeRawAd) {
            super(2);
            this.$this_apply = awemeRawAd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ a.b invoke(a.b bVar, Boolean bool) {
            a.b a2;
            a.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$this_apply);
            } else {
                a2 = bVar2.a(this.$this_apply);
            }
            l.b(a2, "");
            return a2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.m<a.b, Boolean, a.b> {
        final /* synthetic */ Aweme $aweme;

        static {
            Covode.recordClassIndex(46569);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Aweme aweme) {
            super(2);
            this.$aweme = aweme;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ a.b invoke(a.b bVar, Boolean bool) {
            a.b a2;
            a.b bVar2 = bVar;
            boolean booleanValue = bool.booleanValue();
            l.d(bVar2, "");
            if (booleanValue) {
                a2 = bVar2.b(this.$aweme.getAwemeRawAd());
            } else {
                a2 = bVar2.a(this.$aweme.getAwemeRawAd());
            }
            l.b(a2, "");
            return a2;
        }
    }

    private static void a(AwemeRawAd awemeRawAd, JSONObject jSONObject) {
        if (awemeRawAd != null) {
            e.a("draw_ad", "trueview_play", jSONObject, awemeRawAd);
        }
    }

    public static final void a(Aweme aweme, long j2) {
        if (aweme != null && com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            long f2 = f(aweme);
            aweme.getDesc();
            if (j2 >= f2 && !f75480a.b(aweme)) {
                if (e(aweme)) {
                    a(aweme, "play");
                } else {
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        com.ss.android.ugc.aweme.commercialize.track.f.a("play_valid", awemeRawAd.getEffectivePlayTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), new c(awemeRawAd));
                    }
                }
            }
            a().remove(aweme);
        }
    }

    public static void a(Aweme aweme, String str) {
        if (e(aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("trueview_play_type", str);
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            i.a aVar = new i.a();
            aVar.f74815a = aweme.getAwemeRawAd();
            aVar.f74819e = hashMap;
            JSONObject a2 = aVar.a();
            l.b(a2, "");
            a(awemeRawAd, a2);
        } else {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            i.a aVar2 = new i.a();
            aVar2.f74815a = aweme.getAwemeRawAd();
            JSONObject a3 = aVar2.a();
            l.b(a3, "");
            a(awemeRawAd2, a3);
        }
        if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null) {
                l.b();
            }
            com.ss.android.ugc.aweme.commercialize.track.f.a("play_valid", awemeRawAd3.getEffectivePlayTrackUrlList(), awemeRawAd3.getCreativeId(), awemeRawAd3.getLogExtra(), new b(aweme));
            a.C0791a a4 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "trueview_play", awemeRawAd3);
            if (!e(aweme)) {
                str = null;
            }
            a4.a("trueview_play_type", str).c();
        }
    }
}
