package com.ss.android.ugc.aweme.profile.widgets.navbar;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.widgets.navbar.b.d;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    public final List<d> f117974a;

    static {
        Covode.recordClassIndex(76486);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b) && l.a(this.f117974a, ((b) obj).f117974a);
        }
        return true;
    }

    public final int hashCode() {
        List<d> list = this.f117974a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ProfileNavBarState(startAreaActionList=" + this.f117974a + ")";
    }

    public /* synthetic */ b() {
        this(z.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.profile.widgets.navbar.b.d> */
    /* JADX WARN: Multi-variable type inference failed */
    private b(List<? extends d> list) {
        l.d(list, "");
        this.f117974a = list;
    }
}
