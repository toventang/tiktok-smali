package com.bytedance.android.live.slot;

import androidx.lifecycle.u;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements u {

    /* renamed from: a  reason: collision with root package name */
    private final BottomLeftSlotWidget f12771a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f12772b;

    static {
        Covode.recordClassIndex(7101);
    }

    g(BottomLeftSlotWidget bottomLeftSlotWidget, IIconSlot.SlotViewModel slotViewModel) {
        this.f12771a = bottomLeftSlotWidget;
        this.f12772b = slotViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        BottomLeftSlotWidget bottomLeftSlotWidget = this.f12771a;
        String str = (String) obj;
        if (Boolean.TRUE.equals(this.f12772b.f12713a.getValue()) && bottomLeftSlotWidget.f12618e != null) {
            bottomLeftSlotWidget.f12618e.setText(str);
        }
    }
}
