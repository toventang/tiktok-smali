package com.google.android.gms.internal.p000authapi;

import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.auth-api.ab  reason: invalid package */
public interface ab extends IInterface {
    static {
        Covode.recordClassIndex(31511);
    }

    void a();

    void a(Status status);

    void a(Status status, Credential credential);
}
