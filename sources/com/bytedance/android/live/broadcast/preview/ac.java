package com.bytedance.android.live.broadcast.preview;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ac implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f8100a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f8101b;

    static {
        Covode.recordClassIndex(4030);
    }

    ac(v.a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f8100a = aVar;
        this.f8101b = slotViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        v.a aVar = this.f8100a;
        IIconSlot.SlotViewModel slotViewModel = this.f8101b;
        Boolean bool = (Boolean) obj;
        if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue())) {
            int i2 = 0;
            if (bool == null) {
                bool = false;
            }
            if (slotViewModel.f12720h.getValue() == null && TextUtils.isEmpty(slotViewModel.f12715c.getValue())) {
                aVar.f8302c.b();
                View redDotView = aVar.f8302c.getRedDotView();
                if (!bool.booleanValue()) {
                    i2 = 8;
                }
                redDotView.setVisibility(i2);
            }
        }
    }
}
