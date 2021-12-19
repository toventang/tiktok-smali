package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.c;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.tasks.m;

final class h extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53050a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f53051b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f53052c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f53053d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m f53054e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r f53055f;

    static {
        Covode.recordClassIndex(32762);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(r rVar, m mVar, int i2, String str, String str2, int i3, m mVar2) {
        super(mVar);
        this.f53055f = rVar;
        this.f53050a = i2;
        this.f53051b = str;
        this.f53052c = str2;
        this.f53053d = i3;
        this.f53054e = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((ca) this.f53055f.f53084d.f53166k).a(this.f53055f.f53082b, r.c(this.f53050a, this.f53051b, this.f53052c, this.f53053d), r.b(), new m(this.f53055f, this.f53054e, (char) 0));
        } catch (RemoteException unused) {
            r.f53080a.c("notifyChunkTransferred", new Object[0]);
        }
    }
}
