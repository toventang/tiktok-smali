package com.google.android.gms.common.api.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.i;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.s;

/* access modifiers changed from: package-private */
public final class bu extends s<A, ResultT> {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ s.a f50117c;

    static {
        Covode.recordClassIndex(31264);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.s
    public final void a(A a2, i<ResultT> iVar) {
        this.f50117c.f50272a.a(a2, iVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bu(s.a aVar, Feature[] featureArr, boolean z) {
        super(featureArr, z, (byte) 0);
        this.f50117c = aVar;
    }
}
