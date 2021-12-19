package com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.b;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.List;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final List<i> f84855a;

    static {
        Covode.recordClassIndex(53005);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof j) && l.a(this.f84855a, ((j) obj).f84855a);
        }
        return true;
    }

    public final int hashCode() {
        List<i> list = this.f84855a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SummaryVO(billItems=" + this.f84855a + ")";
    }

    public j(List<i> list) {
        l.d(list, "");
        this.f84855a = list;
    }
}
