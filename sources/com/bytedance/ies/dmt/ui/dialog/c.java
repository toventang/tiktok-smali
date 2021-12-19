package com.bytedance.ies.dmt.ui.dialog;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f33415a;

    static {
        Covode.recordClassIndex(19939);
    }

    c(a aVar) {
        this.f33415a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        a aVar = this.f33415a;
        if (!aVar.f33396g) {
            a.a(dialogInterface);
        }
        if (aVar.f33393d != null) {
            aVar.f33393d.onClick(dialogInterface, i2);
        }
    }
}
