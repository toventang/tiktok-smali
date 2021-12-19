package com.ss.android.ugc.aweme.commercialize.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.a.a;
import com.bytedance.x.b.f;
import com.bytedance.x.b.g;
import com.ss.android.ugc.aweme.commercialize.log.a.a;
import com.ss.android.ugc.aweme.commercialize.model.ai;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.l.k;
import h.p;
import h.v;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f75484a = new h();

    private h() {
    }

    static {
        Covode.recordClassIndex(46574);
    }

    public static final class c implements RawURLGetter.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f75488a;

        static {
            Covode.recordClassIndex(46577);
        }

        public c(AwemeRawAd awemeRawAd) {
            this.f75488a = awemeRawAd;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.track.RawURLGetter.a
        public final void a(int i2, boolean z, Exception exc) {
            String str;
            if (!z) {
                a.b b2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a().b(this.f75488a);
                b2.f74715a = "draw_ad";
                b2.f74716b = "load_failed";
                p[] pVarArr = new p[3];
                pVarArr[0] = v.a("error_message", "vast_clickthru_bad_response");
                pVarArr[1] = v.a("error_code", Integer.valueOf(i2));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = v.a("error_detail", str);
                b2.a(ag.a(pVarArr)).c();
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "load_failed", this.f75488a).b("ad_event_type", "debug").a("error_message", "vast_clickthru_bad_response").a("error_code", Integer.valueOf(i2));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a2.a("error_detail", str2).c();
            }
        }
    }

    public static final class a extends m implements h.f.a.b<com.bytedance.x.b.b, h.l.h<? extends g>> {
        static {
            Covode.recordClassIndex(46575);
        }

        public a() {
            super(1);
        }

        public final h.l.h<g> invoke(com.bytedance.x.b.b bVar) {
            List<g> list;
            h.l.h<g> t;
            if (bVar == null || (list = bVar.clickList) == null || (t = n.t(list)) == null) {
                return h.l.c.f158758a;
            }
            return t;
        }
    }

    private static g c(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            return null;
        }
        return b(awemeRawAd);
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<String, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f75489a = new d();

        static {
            Covode.recordClassIndex(46578);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Boolean invoke(String str) {
            boolean z;
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
    }

    public static final boolean a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        ai omVast;
        if (aweme == null || !aweme.isAd() || (awemeRawAd = aweme.getAwemeRawAd()) == null || (omVast = awemeRawAd.getOmVast()) == null || omVast.providerType != 3) {
            return false;
        }
        return true;
    }

    private static g b(AwemeRawAd awemeRawAd) {
        h.l.h hVar;
        ai omVast;
        f fVar;
        List<com.bytedance.x.b.b> list;
        if (awemeRawAd == null || (omVast = awemeRawAd.getOmVast()) == null || (fVar = omVast.vast) == null || (list = fVar.creativeList) == null) {
            hVar = h.l.c.f158758a;
        } else {
            hVar = k.d(n.t(list), new a());
        }
        return (g) k.d(hVar);
    }

    public static final void a(AwemeRawAd awemeRawAd) {
        g b2;
        boolean z;
        String str;
        if (awemeRawAd != null && (b2 = b(awemeRawAd)) != null) {
            Set<String> set = b2.clickTracking;
            if (set == null || set.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Set<String> set2 = b2.clickTracking;
                l.b(set2, "");
                Iterator a2 = k.a(n.t(set2), (h.f.a.b) d.f75489a).a();
                while (a2.hasNext()) {
                    String str2 = (String) a2.next();
                    long currentTimeMillis = System.currentTimeMillis();
                    l.b(str2, "");
                    RawURLGetter.a(str2, new b(str2, currentTimeMillis, awemeRawAd));
                }
                return;
            }
            ai omVast = awemeRawAd.getOmVast();
            if (omVast != null && omVast.providerType == 2 && (str = b2.clickThrough) != null && str.length() != 0) {
                String str3 = b2.clickThrough;
                l.b(str3, "");
                RawURLGetter.a(str3, new c(awemeRawAd));
            }
        }
    }

    public static final String b(Aweme aweme) {
        g c2;
        if (!(aweme == null || (c2 = c(aweme)) == null)) {
            String str = c2.clickThrough;
            if (str != null && str.length() != 0) {
                return c2.clickThrough;
            }
            Set<String> set = c2.clickTracking;
            if (set != null && !set.isEmpty()) {
                Set<String> set2 = c2.clickTracking;
                l.b(set2, "");
                return (String) k.d(k.e(n.t(set2)));
            }
        }
        return null;
    }

    public static final class b implements RawURLGetter.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f75485a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f75486b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AwemeRawAd f75487c;

        static {
            Covode.recordClassIndex(46576);
        }

        public b(String str, long j2, AwemeRawAd awemeRawAd) {
            this.f75485a = str;
            this.f75486b = j2;
            this.f75487c = awemeRawAd;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.track.RawURLGetter.a
        public final void a(int i2, boolean z, Exception exc) {
            String str;
            if (!z) {
                a.b b2 = com.ss.android.ugc.aweme.commercialize.log.a.a.a().b(this.f75487c);
                b2.f74715a = "draw_ad";
                b2.f74716b = "load_failed";
                p[] pVarArr = new p[3];
                pVarArr[0] = v.a("error_message", "vast_click_tracker_bad_response");
                pVarArr[1] = v.a("error_code", Integer.valueOf(i2));
                String str2 = null;
                if (exc != null) {
                    str = exc.getMessage();
                } else {
                    str = null;
                }
                pVarArr[2] = v.a("error_detail", str);
                b2.a(ag.a(pVarArr)).c();
                a.C0791a a2 = com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "load_failed", this.f75487c).b("ad_event_type", "debug").a("error_message", "vast_click_tracker_bad_response").a("error_code", Integer.valueOf(i2));
                if (exc != null) {
                    str2 = exc.getMessage();
                }
                a2.a("error_detail", str2).c();
            }
            String str3 = this.f75485a;
            String valueOf = String.valueOf(i2);
            long j2 = this.f75486b;
            AwemeRawAd awemeRawAd = this.f75487c;
            a.b a3 = com.ss.android.ugc.aweme.commercialize.log.a.a.a(str3, valueOf, j2);
            a3.f74720f = "track_url";
            a3.f74715a = "track_ad";
            a3.b("click").b(awemeRawAd).d();
        }
    }
}
