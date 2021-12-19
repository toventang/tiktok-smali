package com.ss.android.ugc.aweme.music.assem.list.cell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.common.a.h;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final PowerList f111197a;

    /* renamed from: b  reason: collision with root package name */
    public final h.a f111198b;

    static {
        Covode.recordClassIndex(71406);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f111197a, aVar.f111197a) && l.a(this.f111198b, aVar.f111198b);
    }

    public final int hashCode() {
        PowerList powerList = this.f111197a;
        int i2 = 0;
        int hashCode = (powerList != null ? powerList.hashCode() : 0) * 31;
        h.a aVar = this.f111198b;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FooterItem(list=" + this.f111197a + ", listener=" + this.f111198b + ")";
    }

    public a(PowerList powerList, h.a aVar) {
        l.d(powerList, "");
        l.d(aVar, "");
        this.f111197a = powerList;
        this.f111198b = aVar;
    }
}
