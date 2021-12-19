package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.c;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.tasks.m;

final class j extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53061a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f53062b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f53063c;

    static {
        Covode.recordClassIndex(32764);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    j(r rVar, m mVar, int i2, m mVar2) {
        super(mVar);
        this.f53063c = rVar;
        this.f53061a = i2;
        this.f53062b = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((ca) this.f53063c.f53084d.f53166k).c(this.f53063c.f53082b, r.b(this.f53061a), r.b(), new m(this.f53063c, this.f53062b, (short) 0));
        } catch (RemoteException unused) {
            r.f53080a.c("notifySessionFailed", new Object[0]);
        }
    }
}
