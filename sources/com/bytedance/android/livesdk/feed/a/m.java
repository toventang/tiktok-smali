package com.bytedance.android.livesdk.feed.a;

import androidx.lifecycle.u;
import com.bytedance.android.live.base.model.user.b;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class m implements u {

    /* renamed from: a  reason: collision with root package name */
    private final d f17264a;

    static {
        Covode.recordClassIndex(9581);
    }

    m(d dVar) {
        this.f17264a = dVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        d dVar = this.f17264a;
        if (dVar.f17236g && !dVar.f17240k) {
            dVar.f17232c.a("enter_auto");
        }
        if (obj == b.a.Login && !dVar.f17240k) {
            com.bytedance.android.live.core.e.b value = ((PagingViewModel) dVar.f17232c).f9211b.getValue();
            Boolean value2 = dVar.f17232c.f9213d.getValue();
            boolean z = true;
            boolean z2 = value != null && value.b();
            if (value2 != null && !value2.booleanValue()) {
                z = false;
            }
            if (z2 && z) {
                dVar.f17232c.a("enter_auto");
            }
        }
    }
}
