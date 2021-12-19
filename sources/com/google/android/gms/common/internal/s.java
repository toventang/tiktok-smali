package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.a;

public final class s<T extends IInterface> extends g<T> {

    /* renamed from: a  reason: collision with root package name */
    public final a.h<T> f50431a;

    static {
        Covode.recordClassIndex(31423);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String b() {
        return this.f50431a.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String a() {
        return this.f50431a.a();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final T a(IBinder iBinder) {
        return this.f50431a.c();
    }
}
