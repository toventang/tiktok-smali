package com.bytedance.android.livesdk.ah;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnClickListener f13735a = new h();

    static {
        Covode.recordClassIndex(7642);
    }

    private h() {
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        dialogInterface.cancel();
    }
}
