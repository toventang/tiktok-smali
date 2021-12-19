package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public final class b extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    Dialog f50289a;

    /* renamed from: b  reason: collision with root package name */
    DialogInterface.OnCancelListener f50290b;

    static {
        Covode.recordClassIndex(31346);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f50290b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f50289a == null) {
            setShowsDialog(false);
        }
        return this.f50289a;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
