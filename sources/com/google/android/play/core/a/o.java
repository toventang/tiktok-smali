package com.google.android.play.core.a;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bv;
import com.google.android.play.core.b.c;
import com.google.android.play.core.tasks.m;

final class o extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52718a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f52719b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s f52720c;

    static {
        Covode.recordClassIndex(32649);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    o(s sVar, m mVar, m mVar2, String str) {
        super(mVar);
        this.f52720c = sVar;
        this.f52718a = mVar2;
        this.f52719b = str;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((bv) this.f52720c.f52728b.f53166k).b(this.f52720c.f52729c, s.b(), new q(this.f52720c, this.f52718a));
        } catch (RemoteException e2) {
            s.f52726a.c("completeUpdate(%s)", this.f52719b);
            this.f52718a.b(new RuntimeException(e2));
        }
    }
}
