package com.bytedance.ies.dmt.ui.dialog;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f33414a;

    static {
        Covode.recordClassIndex(19938);
    }

    b(a aVar) {
        this.f33414a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        a aVar = this.f33414a;
        if (!aVar.f33394e) {
            a.a(dialogInterface);
        }
        if (aVar.f33391b != null) {
            aVar.f33391b.onClick(dialogInterface, i2);
        }
    }
}
