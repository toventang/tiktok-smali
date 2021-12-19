package com.ss.android.ugc.aweme.search.p;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.lynx.container.SinglePageLynxViewContainer;
import com.ss.android.ugc.aweme.search.i.c;
import com.ss.android.ugc.aweme.search.j;
import com.ss.android.ugc.aweme.search.k.ad;
import com.ss.android.ugc.aweme.search.k.am;
import com.ss.android.ugc.aweme.search.k.q;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import h.p;
import h.v;

public final class a implements c {
    static {
        Covode.recordClassIndex(79178);
    }

    @Override // com.ss.android.ugc.aweme.search.i.c
    public final void a(com.ss.android.ugc.aweme.search.i.a aVar) {
        View view;
        ad c2;
        String str = "";
        l.d(aVar, str);
        View view2 = aVar.f121151e;
        String str2 = null;
        if (view2 != null) {
            view = view2.findViewById(R.id.arc);
        } else {
            view = null;
        }
        if (!(view instanceof SinglePageLynxViewContainer)) {
            view = null;
        }
        SinglePageLynxViewContainer singlePageLynxViewContainer = (SinglePageLynxViewContainer) view;
        if (singlePageLynxViewContainer != null) {
            q a2 = am.a();
            if (!(a2 == null || (c2 = a2.c()) == null)) {
                str2 = c2.f121172a;
            }
            String a3 = j.a(aVar.f121150d);
            p[] pVarArr = new p[3];
            if (str2 == null) {
                str2 = str;
            }
            pVarArr[0] = v.a("search_id", str2);
            pVarArr[1] = v.a("search_type", a3);
            String str3 = aVar.f121149c;
            if (str3 != null) {
                str = str3;
            }
            pVarArr[2] = v.a("use_scenario", str);
            singlePageLynxViewContainer.a(aVar.f121148b, ag.a(pVarArr));
        }
    }
}
