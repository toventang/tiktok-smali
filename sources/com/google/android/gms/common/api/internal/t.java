package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.e;

public final class t {
    static {
        Covode.recordClassIndex(31323);
    }

    public static <TResult> void a(Status status, TResult tresult, i<TResult> iVar) {
        if (status.c()) {
            iVar.a((Object) tresult);
        } else {
            iVar.a((Exception) new e(status));
        }
    }
}
