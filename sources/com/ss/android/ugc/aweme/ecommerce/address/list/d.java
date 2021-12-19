package com.ss.android.ugc.aweme.ecommerce.address.list;

import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter;
import h.f.b.l;

public final class d extends j.e<Object> {
    static {
        Covode.recordClassIndex(52798);
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
        if ((obj instanceof com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d) && (obj2 instanceof com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d)) {
            return l.a((Object) ((com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d) obj).f85925b.f84298a, (Object) ((com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d) obj2).f85925b.f84298a);
        }
        if (!(obj instanceof AddressAdapter.a) || !(obj2 instanceof AddressAdapter.a)) {
            return l.a(obj, obj2);
        }
        return l.a(obj.getClass(), obj2.getClass());
    }
}
