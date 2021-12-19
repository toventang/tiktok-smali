package com.ss.android.ugc.aweme.comment.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class e implements u {

    /* renamed from: a  reason: collision with root package name */
    private final b f72745a;

    static {
        Covode.recordClassIndex(44822);
    }

    e(b bVar) {
        this.f72745a = bVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        b bVar = this.f72745a;
        Boolean bool = (Boolean) obj;
        if (bool == null || !bool.booleanValue()) {
            bVar.f72551d.setEnabled(true);
        } else {
            bVar.f72551d.setEnabled(false);
        }
    }
}
