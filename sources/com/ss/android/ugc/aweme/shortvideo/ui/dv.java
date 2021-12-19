package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class dv implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131699a;

    static {
        Covode.recordClassIndex(86251);
    }

    dv(cj cjVar) {
        this.f131699a = cjVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f131699a.B.setChecked(false);
        dialogInterface.dismiss();
    }
}
