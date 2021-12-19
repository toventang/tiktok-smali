package com.ss.android.ugc.aweme.crossplatform.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.a.b;

public abstract class AbsActivityContainer implements au, b, m {
    static {
        Covode.recordClassIndex(48759);
    }

    public abstract void a(Intent intent);

    /* access modifiers changed from: protected */
    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(b bVar);

    public abstract void a(Runnable runnable);

    /* access modifiers changed from: protected */
    public abstract boolean a();

    public abstract boolean a(String str, int i2);

    /* access modifiers changed from: protected */
    public abstract void b();

    public abstract void b(b bVar);

    /* access modifiers changed from: protected */
    public void i() {
    }

    /* access modifiers changed from: protected */
    public abstract void j();

    /* access modifiers changed from: protected */
    public abstract void k();

    public abstract void l();

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
    }
}
