package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;

public final class i extends d {

    /* renamed from: a  reason: collision with root package name */
    Dialog f50305a;

    /* renamed from: b  reason: collision with root package name */
    DialogInterface.OnCancelListener f50306b;

    static {
        Covode.recordClassIndex(31359);
    }

    @Override // androidx.fragment.app.d
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f50306b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f50305a == null) {
            this.mShowsDialog = false;
        }
        return this.f50305a;
    }

    @Override // androidx.fragment.app.d
    public final void show(androidx.fragment.app.i iVar, String str) {
        super.show(iVar, str);
    }
}
