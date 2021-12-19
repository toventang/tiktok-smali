package com.ss.android.ugc.aweme.discover.ui;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.b;
import com.ss.android.ugc.aweme.search.theme.c;
import com.ss.android.ugc.aweme.utils.ix;

final /* synthetic */ class ar implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ap f82324a;

    static {
        Covode.recordClassIndex(51236);
    }

    ar(ap apVar) {
        this.f82324a = apVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ap apVar = this.f82324a;
        c cVar = (c) obj;
        c.a aVar = cVar.f121707d;
        if (aVar != null) {
            apVar.f82318l = TextUtils.equals("dark", cVar.f121704a);
            int i2 = aVar.f121709a;
            if (i2 == 1) {
                Integer a2 = ix.a(apVar.f82315e);
                if (a2 != null) {
                    apVar.f82319m = a2.intValue();
                }
                Integer a3 = ix.a(apVar.f82314d);
                if (a3 != null) {
                    apVar.n = a3.intValue();
                }
            } else if (i2 == 2 && aVar.f121710b != null) {
                float floatValue = aVar.f121710b.floatValue();
                apVar.f82315e.setBackgroundColor(((Integer) apVar.o.evaluate(floatValue, Integer.valueOf(apVar.f82319m), Integer.valueOf(apVar.a(cVar)))).intValue());
                apVar.f82314d.setBackgroundColor(((Integer) apVar.o.evaluate(floatValue, Integer.valueOf(apVar.n), Integer.valueOf(cVar.f121705b))).intValue());
                if (floatValue >= 0.5f && floatValue <= 1.0f) {
                    apVar.f82314d.setSelectedTabIndicatorColor(apVar.a());
                    apVar.f82314d.setCustomTabViewResId(apVar.b());
                    apVar.f82314d.setupWithViewPager(apVar.f82313c);
                    b.a(apVar.f82314d);
                }
            }
        }
    }
}
