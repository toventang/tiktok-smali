package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;

public final class h implements a {
    static {
        Covode.recordClassIndex(31122);
    }

    @Override // com.google.android.gms.auth.api.signin.a
    public final k<Status> b(i iVar) {
        return i.a(iVar, iVar.b(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.a
    public final Intent a(i iVar) {
        return i.a(iVar.b(), ((g) iVar.a(com.google.android.gms.auth.api.a.f49685b)).f49867a);
    }
}
