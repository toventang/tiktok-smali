package com.ss.android.ugc.aweme.search.e;

import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.c;
import com.ss.android.ugc.aweme.search.k.q;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.du;
import com.ss.android.ugc.aweme.utils.gu;
import h.f.b.l;
import org.json.JSONObject;

public final class b {
    static {
        Covode.recordClassIndex(78826);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f121001a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f121002b;

        static {
            Covode.recordClassIndex(78827);
        }

        a(a aVar, String str) {
            this.f121001a = aVar;
            this.f121002b = str;
        }

        public final void run() {
            ad adVar;
            String str;
            Integer num;
            String str2;
            String str3;
            q a2 = am.a();
            String str4 = null;
            if (a2 != null) {
                adVar = a2.c();
            } else {
                adVar = null;
            }
            SearchResultActivity a3 = gu.a();
            JSONObject b2 = du.b(this.f121002b);
            if (b2 == null || (str = b2.optString("search_bonus_id")) == null) {
                str = "";
            }
            if (a3 == null || (num = ((SearchIntermediateViewModel) ae.a(a3, (ad.b) null).a(SearchIntermediateViewModel.class)).getSearchTabIndex().getValue()) == null) {
                num = -1;
            }
            l.b(num, "");
            int intValue = num.intValue();
            a aVar = this.f121001a;
            if (adVar != null) {
                str2 = adVar.f121172a;
            } else {
                str2 = null;
            }
            c a4 = aVar.a(str2);
            if (adVar != null) {
                str3 = adVar.f121172a;
            } else {
                str3 = null;
            }
            c d2 = a4.d(str3);
            if (adVar != null) {
                str4 = adVar.f121173b;
            }
            c f2 = ((c) d2.b(str4).o(j.a(a3))).f(j.b(intValue));
            f2.c("search_bonus_id", str);
            f2.f();
        }
    }

    public static final void a(a aVar, String str) {
        l.d(aVar, "");
        ai.a(new a(aVar, str), "BoltsUtils");
    }
}
