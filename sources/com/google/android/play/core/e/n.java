package com.google.android.play.core.e;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.aq;
import com.google.android.play.core.b.c;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public final class n extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53334a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f53335b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ t f53336c;

    static {
        Covode.recordClassIndex(32942);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(t tVar, m mVar, int i2, m mVar2) {
        super(mVar);
        this.f53336c = tVar;
        this.f53334a = i2;
        this.f53335b = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((aq) this.f53336c.f53345c.f53166k).a(this.f53336c.f53344b, this.f53334a, new q(this.f53336c, this.f53335b));
        } catch (RemoteException e2) {
            t.f53342a.c("getSessionState(%d)", Integer.valueOf(this.f53334a));
            this.f53335b.b(new RuntimeException(e2));
        }
    }
}
