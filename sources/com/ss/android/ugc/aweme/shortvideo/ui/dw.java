package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class dw implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final cj f131700a;

    static {
        Covode.recordClassIndex(86252);
    }

    dw(cj cjVar) {
        this.f131700a = cjVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.f131700a.B.setChecked(true);
        dialogInterface.dismiss();
    }
}
