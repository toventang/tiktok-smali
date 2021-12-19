package com.google.android.play.core.assetpacks;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.c;
import com.google.android.play.core.b.ca;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public final class i extends c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f53056a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f53057b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m f53058c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f53059d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r f53060e;

    static {
        Covode.recordClassIndex(32763);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(r rVar, m mVar, int i2, String str, m mVar2, int i3) {
        super(mVar);
        this.f53060e = rVar;
        this.f53056a = i2;
        this.f53057b = str;
        this.f53058c = mVar2;
        this.f53059d = i3;
    }

    @Override // com.google.android.play.core.b.c
    public final void a() {
        try {
            ((ca) this.f53060e.f53084d.f53166k).b(this.f53060e.f53082b, r.b(this.f53056a, this.f53057b), r.b(), new q(this.f53060e, this.f53058c, this.f53056a, this.f53057b, this.f53059d));
        } catch (RemoteException unused) {
            r.f53080a.c("notifyModuleCompleted", new Object[0]);
        }
    }
}
