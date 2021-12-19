package com.ss.android.ugc.aweme.profile.widgets.follow;

import com.bytedance.assem.arch.service.a;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.ui.dd;
import h.f.b.l;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    public final dd f117781a;

    static {
        Covode.recordClassIndex(76276);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && l.a(this.f117781a, ((d) obj).f117781a);
        }
        return true;
    }

    public final int hashCode() {
        dd ddVar = this.f117781a;
        if (ddVar != null) {
            return ddVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "FollowProfileData(extraBtnHelper=" + this.f117781a + ")";
    }

    public /* synthetic */ d() {
        this(null);
    }

    public d(dd ddVar) {
        this.f117781a = ddVar;
    }
}
