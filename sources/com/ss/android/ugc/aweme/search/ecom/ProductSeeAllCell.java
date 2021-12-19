package com.ss.android.ugc.aweme.search.ecom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;

public final class ProductSeeAllCell extends PowerCell<d> {
    static {
        Covode.recordClassIndex(78850);
    }

    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProductSeeAllCell f121032a;

        static {
            Covode.recordClassIndex(78851);
        }

        a(ProductSeeAllCell productSeeAllCell) {
            this.f121032a = productSeeAllCell;
        }

        public final void onClick(View view) {
            h.f.a.a<z> aVar;
            ClickAgent.onClick(view);
            d dVar = (d) this.f121032a.f34234d;
            if (dVar != null && (aVar = dVar.f121061a) != null) {
                aVar.invoke();
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aw5, viewGroup, false);
        a2.setOnClickListener(new a(this));
        l.b(a2, "");
        return a2;
    }
}
