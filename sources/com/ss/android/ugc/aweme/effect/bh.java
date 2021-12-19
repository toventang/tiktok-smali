package com.ss.android.ugc.aweme.effect;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.o;

public final /* synthetic */ class bh implements u {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88870a;

    static {
        Covode.recordClassIndex(55903);
    }

    public bh(ac acVar) {
        this.f88870a = acVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        ac acVar = this.f88870a;
        o oVar = (o) obj;
        if (oVar != null && oVar.f156924c == 0 && !TextUtils.isEmpty(oVar.f156922a) && oVar.f156923b > 0) {
            CharSequence charSequence = oVar.f156922a;
            long j2 = oVar.f156923b;
            if (acVar.n != null) {
                acVar.n.setVisibility(0);
                acVar.n.postDelayed(new bi(acVar), j2);
            }
            if (acVar.o != null) {
                acVar.o.setText(charSequence);
            }
        }
    }
}
