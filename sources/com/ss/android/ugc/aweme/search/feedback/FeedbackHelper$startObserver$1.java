package com.ss.android.ugc.aweme.search.feedback;

import androidx.fragment.app.e;
import androidx.lifecycle.i;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.b;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.search.n.d;
import com.ss.android.ugc.aweme.search.n.h;
import com.ss.android.ugc.aweme.search.survey.a;
import com.ss.android.ugc.aweme.utils.eg;
import h.f.b.l;

public final class FeedbackHelper$startObserver$1 implements eg {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f121120a;

    static {
        Covode.recordClassIndex(78895);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        eg.a.onCreate(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        eg.a.onDestroy(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        eg.a.onPause(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_START)
    public final void onStart() {
        eg.a.onStart(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    @v(a = i.a.ON_STOP)
    public final void onStop() {
        eg.a.onStop(this);
    }

    @Override // com.ss.android.ugc.aweme.utils.eg
    public final void onResume() {
        ad adVar;
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        String str5;
        if (a.f121122b) {
            a.f121122b = false;
            e eVar = this.f121120a;
            if (eVar != null) {
                q a2 = am.a(eVar.hashCode());
                String str6 = null;
                if (a2 != null) {
                    adVar = a2.c();
                } else {
                    adVar = null;
                }
                a aVar = new a();
                if (adVar != null) {
                    str = adVar.f121172a;
                } else {
                    str = null;
                }
                c a3 = aVar.a(str);
                int i3 = -1;
                if (a2 != null) {
                    i2 = a2.a();
                } else {
                    i2 = -1;
                }
                c f2 = a3.f(j.a(i2));
                if (adVar != null) {
                    str2 = adVar.f121173b;
                } else {
                    str2 = null;
                }
                b o = f2.b(str2).o(j.a(eVar));
                l.d("close", "");
                o.a("button_type", "close");
                Integer num = a.f121121a;
                if (num != null) {
                    i3 = num.intValue();
                }
                o.a("is_from_survey_card", i3);
                if (adVar != null) {
                    str3 = adVar.f121173b;
                } else {
                    str3 = null;
                }
                com.ss.android.ugc.aweme.metrics.c a4 = o.a("search_keyword_a", str3);
                if (adVar != null) {
                    str4 = adVar.f121172a;
                } else {
                    str4 = null;
                }
                com.ss.android.ugc.aweme.metrics.c a5 = a4.a("search_id_a", str4);
                h b2 = d.a.b();
                if (b2 != null) {
                    str5 = b2.getSearchKeyword();
                } else {
                    str5 = null;
                }
                com.ss.android.ugc.aweme.metrics.c a6 = a5.a("search_keyword_a_x", str5);
                h b3 = d.a.b();
                if (b3 != null) {
                    str6 = b3.getSearchId();
                }
                a6.a("search_id_a_x", str6).f();
            }
        }
    }

    FeedbackHelper$startObserver$1(e eVar) {
        this.f121120a = eVar;
    }
}
