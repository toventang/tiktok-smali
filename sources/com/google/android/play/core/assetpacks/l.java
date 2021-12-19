package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.c;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public final class l extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f53070a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f53071b;

    static {
        Covode.recordClassIndex(32766);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    l(r rVar, m mVar, m mVar2) {
        super(mVar);
        this.f53071b = rVar;
        this.f53070a = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((ca) this.f53071b.f53085e.f53166k).b(this.f53071b.f53082b, r.b(), new p(this.f53071b, this.f53070a));
        } catch (RemoteException unused) {
            r.f53080a.c("keepAlive", new Object[0]);
        }
    }
}
