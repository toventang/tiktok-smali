package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;

/* renamed from: com.google.android.gms.internal.auth-api.z  reason: invalid package */
public final class z extends g<ad> {

    /* renamed from: a  reason: collision with root package name */
    public final a.C1203a f50580a;

    static {
        Covode.recordClassIndex(31539);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Bundle p() {
        a.C1203a aVar = this.f50580a;
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", aVar.f49695b);
        bundle.putBoolean("force_save_dialog", aVar.f49696c);
        bundle.putString("log_session_id", aVar.f49697d);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof ad) {
            return queryLocalInterface;
        }
        return new ac(iBinder);
    }

    public z(Context context, Looper looper, d dVar, a.C1203a aVar, i.b bVar, i.c cVar) {
        super(context, looper, 68, dVar, bVar, cVar);
        this.f50580a = new a.C1203a.C1204a(aVar == null ? a.C1203a.f49694a : aVar).a(n.a()).a();
    }
}
