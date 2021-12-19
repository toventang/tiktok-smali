package com.ss.android.ugc.aweme.ftc.components.effect;

import android.text.TextUtils;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import dmt.av.video.o;

final /* synthetic */ class aj implements u {

    /* renamed from: a  reason: collision with root package name */
    private final f f97822a;

    static {
        Covode.recordClassIndex(62173);
    }

    aj(f fVar) {
        this.f97822a = fVar;
    }

    @Override // androidx.lifecycle.u
    public final void onChanged(Object obj) {
        f fVar = this.f97822a;
        o oVar = (o) obj;
        if (oVar != null && oVar.f156924c == 0 && !TextUtils.isEmpty(oVar.f156922a) && oVar.f156923b > 0) {
            CharSequence charSequence = oVar.f156922a;
            long j2 = oVar.f156923b;
            if (fVar.n != null) {
                fVar.n.setVisibility(0);
                fVar.n.postDelayed(new ak(fVar), j2);
            }
            if (fVar.o != null) {
                fVar.o.setText(charSequence);
            }
        }
    }
}
