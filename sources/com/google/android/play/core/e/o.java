package com.google.android.play.core.e;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.aq;
import com.google.android.play.core.b.c;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public final class o extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53337a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f53338b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t f53339c;

    static {
        Covode.recordClassIndex(32943);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(t tVar, m mVar, int i2, m mVar2) {
        super(mVar);
        this.f53339c = tVar;
        this.f53337a = i2;
        this.f53338b = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((aq) this.f53339c.f53345c.f53166k).a(this.f53339c.f53344b, this.f53337a, t.a(), new p(this.f53339c, this.f53338b));
        } catch (RemoteException e2) {
            t.f53342a.c("cancelInstall(%d)", Integer.valueOf(this.f53337a));
            this.f53338b.b(new RuntimeException(e2));
        }
    }
}
