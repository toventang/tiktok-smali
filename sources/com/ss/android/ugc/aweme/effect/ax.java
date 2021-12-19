package com.ss.android.ugc.aweme.effect;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ax implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final ac f88825a;

    static {
        Covode.recordClassIndex(55877);
    }

    ax(ac acVar) {
        this.f88825a = acVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        ac acVar = this.f88825a;
        dialogInterface.dismiss();
        acVar.S = 1;
        acVar.c();
        acVar.j();
    }
}
