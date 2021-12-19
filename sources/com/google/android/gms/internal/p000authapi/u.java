package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.b;
import com.google.android.gms.auth.api.credentials.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.r;

/* renamed from: com.google.android.gms.internal.auth-api.u  reason: invalid package */
public final class u implements c {
    static {
        Covode.recordClassIndex(31534);
    }

    @Override // com.google.android.gms.auth.api.credentials.c
    public final k<Status> a(i iVar, Credential credential) {
        r.a(iVar, "client must not be null");
        r.a(credential, "credential must not be null");
        return iVar.b(new v(iVar, credential));
    }

    @Override // com.google.android.gms.auth.api.credentials.c
    public final k<b> a(i iVar, CredentialRequest credentialRequest) {
        r.a(iVar, "client must not be null");
        r.a(credentialRequest, "request must not be null");
        return iVar.a(new t(iVar, credentialRequest));
    }

    @Override // com.google.android.gms.auth.api.credentials.c
    public final PendingIntent a(i iVar, HintRequest hintRequest) {
        String str;
        r.a(iVar, "client must not be null");
        r.a(hintRequest, "request must not be null");
        a.C1203a aVar = ((z) iVar.a(a.f49684a)).f50580a;
        Context b2 = iVar.b();
        String str2 = aVar.f49697d;
        r.a(b2, "context must not be null");
        r.a(hintRequest, "request must not be null");
        String str3 = aVar.f49695b;
        if (TextUtils.isEmpty(str2)) {
            str = n.a();
        } else {
            str = (String) r.a((Object) str2);
        }
        Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", str3);
        putExtra.putExtra("logSessionId", str);
        Parcel obtain = Parcel.obtain();
        hintRequest.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        putExtra.putExtra("com.google.android.gms.credentials.HintRequest", marshall);
        return PendingIntent.getActivity(b2, LiveNetAdaptiveHurryTimeSetting.DEFAULT, putExtra, 134217728);
    }
}
