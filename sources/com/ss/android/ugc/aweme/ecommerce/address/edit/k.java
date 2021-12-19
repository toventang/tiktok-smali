package com.ss.android.ugc.aweme.ecommerce.address.edit;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.a.a;
import h.f.b.l;

public final class k extends j.e<Object> {
    static {
        Covode.recordClassIndex(52695);
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
        if (!(obj instanceof a) || !(obj2 instanceof a)) {
            return l.a(obj, obj2);
        }
        return l.a((Object) ((a) obj).f84261a.f84310d, (Object) ((a) obj2).f84261a.f84310d);
    }
}
