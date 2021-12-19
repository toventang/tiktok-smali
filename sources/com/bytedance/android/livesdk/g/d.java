package com.bytedance.android.livesdk.g;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.bf;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f17822a;

    static {
        Covode.recordClassIndex(9894);
    }

    d(b bVar) {
        this.f17822a = bVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        b bVar = this.f17822a;
        bf.a().c();
        if (bVar.f17820h != null) {
            bVar.f17820h.onDismiss(bVar);
        }
    }
}
