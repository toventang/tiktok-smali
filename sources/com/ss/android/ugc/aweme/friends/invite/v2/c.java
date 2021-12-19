package com.ss.android.ugc.aweme.friends.invite.v2;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import h.f.b.l;

public final class c implements u<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    private final DmtStatusView f96981a;

    static {
        Covode.recordClassIndex(61558);
    }

    public c(DmtStatusView dmtStatusView) {
        l.d(dmtStatusView, "");
        this.f96981a = dmtStatusView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.u
    public final /* synthetic */ void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            this.f96981a.f();
        } else if (this.f96981a.j()) {
            this.f96981a.d();
        }
    }
}
