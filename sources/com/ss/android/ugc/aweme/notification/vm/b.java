package com.ss.android.ugc.aweme.notification.vm;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.f.b.l;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<MusNotice> f114223a;

    /* renamed from: b  reason: collision with root package name */
    public final List<MusNotice> f114224b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f114225c;

    static {
        Covode.recordClassIndex(73438);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return l.a(this.f114223a, bVar.f114223a) && l.a(this.f114224b, bVar.f114224b) && this.f114225c == bVar.f114225c;
    }

    public final int hashCode() {
        List<MusNotice> list = this.f114223a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<MusNotice> list2 = this.f114224b;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        int i3 = (hashCode + i2) * 31;
        boolean z = this.f114225c;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "InboxCombineAdapterData(data=" + this.f114223a + ", bottomData=" + this.f114224b + ", bottomHasMore=" + this.f114225c + ")";
    }

    public b(List<MusNotice> list, List<MusNotice> list2, boolean z) {
        l.d(list, "");
        l.d(list2, "");
        this.f114223a = list;
        this.f114224b = list2;
        this.f114225c = z;
    }
}
