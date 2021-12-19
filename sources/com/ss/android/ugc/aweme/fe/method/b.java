package com.ss.android.ugc.aweme.fe.method;

import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.fe.method.a;

/* access modifiers changed from: package-private */
public final /* synthetic */ class b implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    private final a.C2200a f91235a;

    static {
        Covode.recordClassIndex(57417);
    }

    b(a.C2200a aVar) {
        this.f91235a = aVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a.C2200a aVar = this.f91235a;
        if (aVar.f91213a.get() != null) {
            aVar.f91213a.get().a();
        }
    }
}
