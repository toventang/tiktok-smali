package com.bytedance.android.livesdk.ah;

import android.content.DialogInterface;
import android.view.KeyEvent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class i implements DialogInterface.OnKeyListener {

    /* renamed from: a  reason: collision with root package name */
    static final DialogInterface.OnKeyListener f13736a = new i();

    static {
        Covode.recordClassIndex(7643);
    }

    private i() {
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return false;
        }
        if (keyEvent.getAction() == 1) {
            dialogInterface.cancel();
        }
        return true;
    }
}
