package com.google.android.gms.internal.c;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.c;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import java.util.HashSet;
import java.util.Set;

public final class b extends g<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f50588a;

    static {
        Covode.recordClassIndex(31553);
    }

    public b(Context context, Looper looper, d dVar, c cVar, i.b bVar, i.c cVar2) {
        super(context, looper, 16, dVar, bVar, cVar2);
        if (cVar == null) {
            this.f50588a = new Bundle();
            return;
        }
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.g, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int e() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final boolean i() {
        String str;
        Set set;
        d dVar = ((g) this).r;
        if (dVar.f50382a != null) {
            str = dVar.f50382a.name;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d.b bVar = dVar.f50385d.get(com.google.android.gms.auth.api.b.f49704a);
        if (bVar == null || bVar.f50402a.isEmpty()) {
            set = dVar.f50383b;
        } else {
            set = new HashSet(dVar.f50383b);
            set.addAll(bVar.f50402a);
        }
        if (!set.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.c
    public final Bundle p() {
        return this.f50588a;
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof c) {
            return queryLocalInterface;
        }
        return new d(iBinder);
    }
}
