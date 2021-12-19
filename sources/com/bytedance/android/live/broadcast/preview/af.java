package com.bytedance.android.live.broadcast.preview;

import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class af implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f8106a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f8107b;

    static {
        Covode.recordClassIndex(4033);
    }

    af(v.a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f8106a = aVar;
        this.f8107b = slotViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        v.a aVar = this.f8106a;
        String str = (String) obj;
        if (Boolean.TRUE.equals(this.f8107b.f12713a.getValue())) {
            aVar.f8302c.getTextView().setText(str);
        }
    }
}
