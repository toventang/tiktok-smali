package com.bytedance.android.live.slot;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class f implements u {

    /* renamed from: a  reason: collision with root package name */
    private final BottomLeftSlotWidget f12768a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f12769b;

    /* renamed from: c  reason: collision with root package name */
    private final IIconSlot f12770c;

    static {
        Covode.recordClassIndex(7100);
    }

    f(BottomLeftSlotWidget bottomLeftSlotWidget, IIconSlot.SlotViewModel slotViewModel, IIconSlot iIconSlot) {
        this.f12768a = bottomLeftSlotWidget;
        this.f12769b = slotViewModel;
        this.f12770c = iIconSlot;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        BottomLeftSlotWidget bottomLeftSlotWidget = this.f12768a;
        IIconSlot.SlotViewModel slotViewModel = this.f12769b;
        IIconSlot iIconSlot = this.f12770c;
        if (!Boolean.TRUE.equals(slotViewModel.f12714b.getValue()) || TextUtils.isEmpty(slotViewModel.o)) {
            bottomLeftSlotWidget.f12619f.d();
            bottomLeftSlotWidget.f12619f.setVisibility(8);
            bottomLeftSlotWidget.f12614a.setVisibility(0);
        } else if (Boolean.FALSE.equals(obj)) {
            bottomLeftSlotWidget.f12619f.d();
            bottomLeftSlotWidget.f12619f.setVisibility(8);
            bottomLeftSlotWidget.f12614a.setVisibility(0);
        } else {
            if (bottomLeftSlotWidget.f12619f.f5109b.g()) {
                bottomLeftSlotWidget.f12619f.d();
            }
            bottomLeftSlotWidget.f12619f.setVisibility(0);
            bottomLeftSlotWidget.f12614a.setVisibility(4);
            bottomLeftSlotWidget.f12619f.setImageAssetsFolder(slotViewModel.n);
            bottomLeftSlotWidget.f12619f.setAnimation(slotViewModel.o);
            bottomLeftSlotWidget.f12619f.a(iIconSlot.b());
            bottomLeftSlotWidget.f12619f.a();
        }
    }
}
