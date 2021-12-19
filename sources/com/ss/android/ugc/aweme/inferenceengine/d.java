package com.ss.android.ugc.aweme.inferenceengine;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.ml.h;

public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f104507a = false;

    static {
        Covode.recordClassIndex(66927);
    }

    @Override // com.ss.android.ml.h
    public final void a(Throwable th) {
        if (f104507a) {
            Log.getStackTraceString(th);
        }
    }
}
