package com.ss.android.ugc.aweme.ecommerce.delivery.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.d;
import h.f.a.b;
import h.f.b.l;
import h.z;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f85830a;

    static {
        Covode.recordClassIndex(53706);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof a) && l.a(this.f85830a, ((a) obj).f85830a);
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f85830a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ShipToInfo(shipToInfo=" + this.f85830a + ")";
    }

    public /* synthetic */ a() {
        this(null);
    }

    public final d a() {
        Object obj = this.f85830a;
        if (!(obj instanceof d)) {
            obj = null;
        }
        return (d) obj;
    }

    public final List<Region> b() {
        Object obj = this.f85830a;
        if (!(obj instanceof List)) {
            obj = null;
        }
        return (List) obj;
    }

    public a(Object obj) {
        this.f85830a = obj;
    }

    public final z a(b<? super d, z> bVar) {
        l.d(bVar, "");
        d a2 = a();
        if (a2 != null) {
            return bVar.invoke(a2);
        }
        return null;
    }
}
