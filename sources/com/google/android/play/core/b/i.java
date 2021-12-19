package com.google.android.play.core.b;

import android.os.IBinder;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

final class i extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IBinder f53151a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f53152b;

    static {
        Covode.recordClassIndex(32848);
    }

    i(k kVar, IBinder iBinder) {
        this.f53152b = kVar;
        this.f53151a = iBinder;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        l lVar = this.f53152b.f53154a;
        lVar.f53166k = lVar.f53162g.a(this.f53151a);
        l lVar2 = this.f53152b.f53154a;
        lVar2.f53157b.d("linkToDeath", new Object[0]);
        try {
            lVar2.f53166k.asBinder().linkToDeath(lVar2.f53164i, 0);
        } catch (RemoteException unused) {
            lVar2.f53157b.c("linkToDeath failed", new Object[0]);
        }
        this.f53152b.f53154a.f53160e = false;
        for (c cVar : this.f53152b.f53154a.f53159d) {
            cVar.run();
        }
        this.f53152b.f53154a.f53159d.clear();
    }
}
