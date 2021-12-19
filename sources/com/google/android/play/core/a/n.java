package com.google.android.play.core.a;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bv;
import com.google.android.play.core.b.c;
import com.google.android.play.core.tasks.m;

final class n extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f52715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f52716b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s f52717c;

    static {
        Covode.recordClassIndex(32648);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    n(s sVar, m mVar, String str, m mVar2) {
        super(mVar);
        this.f52717c = sVar;
        this.f52715a = str;
        this.f52716b = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((bv) this.f52717c.f52728b.f53166k).a(this.f52717c.f52729c, s.a(this.f52717c, this.f52715a), new r(this.f52717c, this.f52716b, this.f52715a));
        } catch (RemoteException e2) {
            s.f52726a.c("requestUpdateInfo(%s)", this.f52715a);
            this.f52716b.b(new RuntimeException(e2));
        }
    }
}
