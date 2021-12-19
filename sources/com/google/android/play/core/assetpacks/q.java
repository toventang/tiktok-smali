package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.tasks.m;

final class q extends m<Void> {

    /* renamed from: c  reason: collision with root package name */
    final int f53076c;

    /* renamed from: d  reason: collision with root package name */
    final String f53077d;

    /* renamed from: e  reason: collision with root package name */
    final int f53078e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r f53079f;

    static {
        Covode.recordClassIndex(32771);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(r rVar, m<Void> mVar, int i2, String str, int i3) {
        super(rVar, mVar);
        this.f53079f = rVar;
        this.f53076c = i2;
        this.f53077d = str;
        this.f53078e = i3;
    }

    @Override // com.google.android.play.core.assetpacks.m, com.google.android.play.core.b.cc
    public final void a(Bundle bundle) {
        this.f53079f.f53084d.a();
        int i2 = bundle.getInt("error_code");
        r.f53080a.b("onError(%d), retrying notifyModuleCompleted...", Integer.valueOf(i2));
        int i3 = this.f53078e;
        if (i3 > 0) {
            this.f53079f.a(this.f53076c, this.f53077d, i3 - 1);
        }
    }
}
