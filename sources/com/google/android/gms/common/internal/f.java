package com.google.android.gms.common.internal;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

public abstract class f implements DialogInterface.OnClickListener {
    static {
        Covode.recordClassIndex(31400);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public void onClick(DialogInterface dialogInterface, int i2) {
        try {
            a();
        } catch (ActivityNotFoundException unused) {
        } finally {
            dialogInterface.dismiss();
        }
    }
}
