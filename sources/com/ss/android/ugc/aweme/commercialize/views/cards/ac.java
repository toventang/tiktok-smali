package com.ss.android.ugc.aweme.commercialize.views.cards;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.commercialize.depend.b;
import com.ss.android.ugc.aweme.commercialize.depend.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import h.z;
import java.util.concurrent.Callable;

public final class ac implements ah {

    /* renamed from: a  reason: collision with root package name */
    public static final ac f76047a = new ac();

    private ac() {
    }

    static {
        Covode.recordClassIndex(46910);
    }

    /* access modifiers changed from: package-private */
    public static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f76048a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Aweme f76049b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f76050c;

        static {
            Covode.recordClassIndex(46911);
        }

        a(d dVar, Aweme aweme, String str) {
            this.f76048a = dVar;
            this.f76049b = aweme;
            this.f76050c = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AwemeRawAd awemeRawAd;
            d dVar = this.f76048a;
            if (dVar == null) {
                dVar = new d();
            }
            String str = null;
            Aweme aweme = this.f76049b;
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                str = awemeRawAd.getCreativeIdStr();
            }
            dVar.a("creativeId", str);
            r.a(this.f76050c, dVar.f66730a);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void b(Aweme aweme) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_init_commerce_card", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void c(Aweme aweme) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_preload_ad_half_web_page", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void d(Aweme aweme) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_show_ad_half_web_page", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void e(Aweme aweme) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_show_success", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void f(Aweme aweme) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_release", null);
        }
    }

    private static boolean g(Aweme aweme) {
        t a2 = b.f73781b.a();
        if (a2 == null || !a2.p(aweme) || !ad.a()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void a(Aweme aweme) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_view_holder_selected", null);
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void b(Aweme aweme, String str) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_show_failed", new d().a("errMsg", str));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void a(Aweme aweme, long j2) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_view_holder_unselected", new d().a("currentPosition", String.valueOf(j2)));
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.views.cards.ah
    public final void a(Aweme aweme, String str) {
        if (g(aweme)) {
            a(aweme, "ad_half_web_show_cancel", new d().a("errMsg", str));
        }
    }

    private static void a(Aweme aweme, String str, d dVar) {
        i.b(new a(dVar, aweme, str), i.f4824a);
    }
}
