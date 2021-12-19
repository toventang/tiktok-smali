package com.bytedance.android.livesdk.g;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.bf;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final /* synthetic */ class c implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    private final b f17821a;

    static {
        Covode.recordClassIndex(9893);
    }

    c(b bVar) {
        this.f17821a = bVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        b bVar = this.f17821a;
        bf.a().b();
        if (bVar.f17819g != null) {
            bVar.f17819g.onShow(bVar);
        }
    }
}
