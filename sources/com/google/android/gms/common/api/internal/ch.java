package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.d.g;
import java.util.concurrent.atomic.AtomicReference;

public abstract class ch extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: b  reason: collision with root package name */
    private final Handler f50157b;

    /* renamed from: d  reason: collision with root package name */
    protected volatile boolean f50158d;

    /* renamed from: e  reason: collision with root package name */
    protected final AtomicReference<cj> f50159e;

    /* renamed from: f  reason: collision with root package name */
    protected final GoogleApiAvailability f50160f;

    static {
        Covode.recordClassIndex(31280);
    }

    /* access modifiers changed from: protected */
    public abstract void a(ConnectionResult connectionResult, int i2);

    /* access modifiers changed from: protected */
    public abstract void e();

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void b() {
        super.b();
        this.f50158d = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void d() {
        super.d();
        this.f50158d = false;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        this.f50159e.set(null);
        e();
    }

    protected ch(j jVar) {
        this(jVar, GoogleApiAvailability.getInstance());
    }

    private static int a(cj cjVar) {
        if (cjVar == null) {
            return -1;
        }
        return cjVar.f50163a;
    }

    public void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, null), a(this.f50159e.get()));
        f();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void a(Bundle bundle) {
        cj cjVar;
        super.a(bundle);
        if (bundle != null) {
            AtomicReference<cj> atomicReference = this.f50159e;
            if (bundle.getBoolean("resolving_error", false)) {
                cjVar = new cj(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                cjVar = null;
            }
            atomicReference.set(cjVar);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b(Bundle bundle) {
        super.b(bundle);
        cj cjVar = this.f50159e.get();
        if (cjVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cjVar.f50163a);
            bundle.putInt("failed_status", cjVar.f50164b.f49942b);
            bundle.putParcelable("failed_resolution", cjVar.f50164b.f49943c);
        }
    }

    private ch(j jVar, GoogleApiAvailability googleApiAvailability) {
        super(jVar);
        this.f50159e = new AtomicReference<>(null);
        this.f50157b = new g(Looper.getMainLooper());
        this.f50160f = googleApiAvailability;
    }

    public final void b(ConnectionResult connectionResult, int i2) {
        cj cjVar = new cj(connectionResult, i2);
        if (this.f50159e.compareAndSet(null, cjVar)) {
            this.f50157b.post(new ci(this, cjVar));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r3 != false) goto L_0x003b;
     */
    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r7, int r8, android.content.Intent r9) {
        /*
        // Method dump skipped, instructions count: 103
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.ch.a(int, int, android.content.Intent):void");
    }
}
