package com.google.firebase.iid;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.a;
import com.google.android.gms.c.h;
import java.io.IOException;

final /* synthetic */ class ak implements a {

    /* renamed from: a  reason: collision with root package name */
    static final a f54411a = new ak();

    static {
        Covode.recordClassIndex(33780);
    }

    private ak() {
    }

    @Override // com.google.android.gms.c.a
    public final Object a(h hVar) {
        if (hVar.b()) {
            return hVar.d();
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(hVar.e())).length();
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }
}
