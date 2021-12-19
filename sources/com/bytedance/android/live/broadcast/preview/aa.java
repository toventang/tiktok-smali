package com.bytedance.android.live.broadcast.preview;

import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.broadcast.x;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.live.slot.ab;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class aa implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f8095a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f8096b;

    /* renamed from: c  reason: collision with root package name */
    private final ab f8097c;

    static {
        Covode.recordClassIndex(4028);
    }

    aa(v.a aVar, IIconSlot.SlotViewModel slotViewModel, ab abVar) {
        this.f8095a = aVar;
        this.f8096b = slotViewModel;
        this.f8097c = abVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        v.a aVar = this.f8095a;
        IIconSlot.SlotViewModel slotViewModel = this.f8096b;
        ab abVar = this.f8097c;
        if (!Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
            return;
        }
        if (aVar.f8301b.b(x.class) == i.SCREEN_RECORD || !Boolean.TRUE.equals(obj)) {
            aVar.f8302c.setVisibility(8);
            return;
        }
        aVar.f8302c.setVisibility(0);
        abVar.a("before_live");
    }
}
