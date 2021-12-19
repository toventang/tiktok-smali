package com.ss.android.ugc.aweme.main;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.c.a.a.a.b;
import com.bytedance.covode.number.Covode;

public class as extends n {

    /* renamed from: b  reason: collision with root package name */
    Handler f109166b = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(69906);
    }

    @Override // androidx.lifecycle.n, androidx.lifecycle.i
    public final i.b a() {
        return super.a();
    }

    private static boolean b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(l lVar) {
        super.b(lVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(l lVar) {
        super.a(lVar);
    }

    public as(m mVar) {
        super(mVar);
    }

    @Override // androidx.lifecycle.n, androidx.lifecycle.i
    public final void a(l lVar) {
        a(new at(this, lVar));
    }

    private void a(Runnable runnable) {
        if (b()) {
            runnable.run();
            return;
        }
        this.f109166b.post(runnable);
        b.a(new IllegalAccessError("should be in main thread"), "should call in main thread");
    }

    @Override // androidx.lifecycle.n, androidx.lifecycle.i
    public final void b(l lVar) {
        a(new au(this, lVar));
    }
}
