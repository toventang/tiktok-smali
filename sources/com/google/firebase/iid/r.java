package com.google.firebase.iid;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.a;
import com.google.android.gms.c.h;
import java.io.IOException;

/* access modifiers changed from: package-private */
public final /* synthetic */ class r implements a {

    /* renamed from: a  reason: collision with root package name */
    private final q f54485a;

    static {
        Covode.recordClassIndex(33814);
    }

    r(q qVar) {
        this.f54485a = qVar;
    }

    @Override // com.google.android.gms.c.a
    public final Object a(h hVar) {
        Bundle bundle = (Bundle) hVar.a(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if ("RST".equals(string3)) {
                throw new IOException("INSTANCE_ID_RESET");
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                String.valueOf(String.valueOf(bundle)).length();
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
