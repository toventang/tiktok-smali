package com.bytedance.android.live.broadcast.preview;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ae implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f8104a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f8105b;

    static {
        Covode.recordClassIndex(4032);
    }

    ae(v.a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f8104a = aVar;
        this.f8105b = slotViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        v.a aVar = this.f8104a;
        Drawable drawable = (Drawable) obj;
        if (Boolean.TRUE.equals(this.f8105b.f12713a.getValue())) {
            aVar.f8302c.getIconView().setImageDrawable(drawable);
        }
    }
}
