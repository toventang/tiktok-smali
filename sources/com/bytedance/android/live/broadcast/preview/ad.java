package com.bytedance.android.live.broadcast.preview;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ad implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f8102a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f8103b;

    static {
        Covode.recordClassIndex(4031);
    }

    ad(v.a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f8102a = aVar;
        this.f8103b = slotViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        v.a aVar = this.f8102a;
        IIconSlot.SlotViewModel slotViewModel = this.f8103b;
        String str = (String) obj;
        if (Boolean.TRUE.equals(slotViewModel.f12713a.getValue()) && slotViewModel.f12720h.getValue() == null) {
            aVar.f8302c.b();
            aVar.f8302c.getAlertText().setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
            aVar.f8302c.getAlertText().setText(str);
        }
    }
}
