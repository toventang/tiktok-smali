package com.ss.android.ugc.aweme.ftc.components.effect;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class z implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final f f97891a;

    static {
        Covode.recordClassIndex(62218);
    }

    z(f fVar) {
        this.f97891a = fVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        f fVar = this.f97891a;
        dialogInterface.dismiss();
        fVar.S = 1;
        fVar.b();
        fVar.h();
    }
}
