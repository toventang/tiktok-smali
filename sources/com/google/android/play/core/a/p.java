package com.google.android.play.core.a;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bw;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public class p<T> extends bw {

    /* renamed from: a  reason: collision with root package name */
    final b f52721a;

    /* renamed from: b  reason: collision with root package name */
    final m<T> f52722b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s f52723c;

    static {
        Covode.recordClassIndex(32650);
    }

    p(s sVar, b bVar, m<T> mVar) {
        this.f52723c = sVar;
        this.f52721a = bVar;
        this.f52722b = mVar;
    }

    @Override // com.google.android.play.core.b.bx
    public void a(Bundle bundle) {
        this.f52723c.f52728b.a();
        this.f52721a.d("onRequestInfo", new Object[0]);
    }

    @Override // com.google.android.play.core.b.bx
    public void b(Bundle bundle) {
        this.f52723c.f52728b.a();
        this.f52721a.d("onCompleteUpdate", new Object[0]);
    }
}
