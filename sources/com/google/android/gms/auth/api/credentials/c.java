package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;

public interface c {
    static {
        Covode.recordClassIndex(31068);
    }

    PendingIntent a(i iVar, HintRequest hintRequest);

    k<Status> a(i iVar, Credential credential);

    k<b> a(i iVar, CredentialRequest credentialRequest);
}
