package com.ss.android.ugc.aweme.comment.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.i;

final /* synthetic */ class d implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f72704a;

    static {
        Covode.recordClassIndex(44798);
    }

    d(b bVar) {
        this.f72704a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        float floatValue;
        b bVar = this.f72704a;
        Float f2 = (Float) obj;
        if (bVar.o != null) {
            if (f2 == null) {
                floatValue = 0.0f;
            } else {
                floatValue = f2.floatValue();
            }
            bVar.o.setTranslationX(((float) i.b(bVar.getContext())) * floatValue);
            bVar.o.setAlpha(1.0f - floatValue);
        }
    }
}
