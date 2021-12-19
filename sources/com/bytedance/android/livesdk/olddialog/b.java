package com.bytedance.android.livesdk.olddialog;

import androidx.lifecycle.u;
import com.bytedance.android.livesdk.az;
import com.bytedance.android.livesdk.olddialog.viewmodel.GiftDialogViewModel;
import com.bytedance.android.livesdk.service.a.b;
import com.bytedance.android.livesdk.service.b.d;
import com.bytedance.android.livesdk.service.c.a.e;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements u {

    /* renamed from: a  reason: collision with root package name */
    private final a f20009a;

    static {
        Covode.recordClassIndex(11819);
    }

    b(a aVar) {
        this.f20009a = aVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        a aVar = this.f20009a;
        d dVar = (d) obj;
        dVar.f21293i = aVar.f19997c.f20016b;
        dVar.f21294j = aVar.f19998d;
        if (dVar.f21285a == GiftDialogViewModel.a.GIFT) {
            e eVar = e.f21319i;
            long j2 = dVar.f21286b;
            boolean z = dVar.f21295k;
            String str = aVar.f19998d;
            String str2 = dVar.f21296l;
            String str3 = dVar.o;
            Boolean.valueOf(b.a.C0448a.f21165a.f21164a);
            eVar.a(j2, false, z, str, str2, str3);
        }
        if (aVar.p != null) {
            aVar.p.c(az.class, dVar);
        }
    }
}
