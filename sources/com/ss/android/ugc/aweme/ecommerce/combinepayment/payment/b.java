package com.ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e;
import com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.h;
import h.f.b.l;

public final class b extends j.e<Object> {
    static {
        Covode.recordClassIndex(53352);
    }

    @Override // androidx.recyclerview.widget.j.e
    public final boolean b(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        return l.a(obj, obj2);
    }

    @Override // androidx.recyclerview.widget.j.e
    public final boolean a(Object obj, Object obj2) {
        l.d(obj, "");
        l.d(obj2, "");
        if ((obj instanceof h) && (obj2 instanceof h)) {
            return com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(((h) obj).f85254a, ((h) obj2).f85254a);
        }
        if (!(obj instanceof e) || !(obj2 instanceof e)) {
            return l.a(obj, obj2);
        }
        e eVar = (e) obj;
        e eVar2 = (e) obj2;
        if (!l.a((Object) eVar.f85250b.f85288a, (Object) eVar2.f85250b.f85288a) || !com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.l.a(eVar.f85251c, eVar2.f85251c)) {
            return false;
        }
        return true;
    }
}
