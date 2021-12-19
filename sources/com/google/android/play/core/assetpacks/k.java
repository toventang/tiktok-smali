package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.c;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.tasks.m;

final class k extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53064a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f53065b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f53066c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f53067d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ m f53068e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r f53069f;

    static {
        Covode.recordClassIndex(32765);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(r rVar, m mVar, int i2, String str, String str2, int i3, m mVar2) {
        super(mVar);
        this.f53069f = rVar;
        this.f53064a = i2;
        this.f53065b = str;
        this.f53066c = str2;
        this.f53067d = i3;
        this.f53068e = mVar2;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((ca) this.f53069f.f53084d.f53166k).d(this.f53069f.f53082b, r.c(this.f53064a, this.f53065b, this.f53066c, this.f53067d), r.b(), new n(this.f53069f, this.f53068e));
        } catch (RemoteException e2) {
            r.f53080a.b("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f53065b, this.f53066c, Integer.valueOf(this.f53067d), Integer.valueOf(this.f53064a));
            this.f53068e.b(new RuntimeException(e2));
        }
    }
}
