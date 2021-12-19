package com.bytedance.android.live.broadcast.preview;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.u;
import com.bytedance.android.live.broadcast.preview.v;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class ab implements u {

    /* renamed from: a  reason: collision with root package name */
    private final v.a f8098a;

    /* renamed from: b  reason: collision with root package name */
    private final IIconSlot.SlotViewModel f8099b;

    static {
        Covode.recordClassIndex(4029);
    }

    ab(v.a aVar, IIconSlot.SlotViewModel slotViewModel) {
        this.f8098a = aVar;
        this.f8099b = slotViewModel;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        v.a aVar = this.f8098a;
        Drawable drawable = (Drawable) obj;
        if (Boolean.TRUE.equals(this.f8099b.f12713a.getValue())) {
            aVar.f8302c.b();
            aVar.f8302c.getAlertImageView().setVisibility(drawable == null ? 8 : 0);
            aVar.f8302c.getAlertImageView().setImageDrawable(drawable);
        }
    }
}
