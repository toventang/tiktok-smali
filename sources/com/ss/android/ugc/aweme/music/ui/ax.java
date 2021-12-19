package com.ss.android.ugc.aweme.music.ui;

import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

final /* synthetic */ class ax implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ah f111904a;

    static {
        Covode.recordClassIndex(71927);
    }

    ax(ah ahVar) {
        this.f111904a = ahVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ah ahVar = this.f111904a;
        Boolean bool = (Boolean) obj;
        if (ahVar.q != null) {
            ahVar.q.setImageResource(bool.booleanValue() ? R.drawable.b1a : 2131233128);
        }
        if (ahVar.s != null) {
            ahVar.s.setText(bool.booleanValue() ? R.string.pp : R.string.pj);
            if (ahVar.p != null && ahVar.p.getVisibility() == 0) {
                ahVar.a(ahVar.getActivity());
            }
        }
        if (!bool.booleanValue() && ahVar.ao != null && ahVar.ao.isShowing()) {
            ahVar.ao.dismiss();
        }
    }
}
