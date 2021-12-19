package com.bytedance.ies.dmt.ui.dialog;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final a f33442a;

    static {
        Covode.recordClassIndex(19953);
    }

    g(a aVar) {
        this.f33442a = aVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        a aVar = this.f33442a;
        if (!aVar.f33395f) {
            a.a(dialogInterface);
        }
        if (aVar.f33392c != null) {
            aVar.f33392c.onClick(dialogInterface, i2);
        }
    }
}
