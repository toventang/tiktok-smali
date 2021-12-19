package com.bytedance.sdk.a.e;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.a.e.g;
import com.google.android.gms.auth.api.credentials.d;
import com.google.android.gms.auth.api.credentials.e;
import java.lang.ref.SoftReference;

public abstract class b implements h {

    /* renamed from: a  reason: collision with root package name */
    protected d f43167a;

    /* renamed from: b  reason: collision with root package name */
    protected SoftReference<Activity> f43168b;

    /* renamed from: c  reason: collision with root package name */
    protected SoftReference<c> f43169c;

    /* renamed from: d  reason: collision with root package name */
    public g.a f43170d;

    static {
        Covode.recordClassIndex(26470);
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    private boolean d() {
        SoftReference<c> softReference = this.f43169c;
        if (softReference == null || softReference.get() == null) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.a.e.h
    public final void b() {
        SoftReference<Activity> softReference = this.f43168b;
        if (softReference != null) {
            softReference.clear();
        }
        SoftReference<c> softReference2 = this.f43169c;
        if (softReference2 != null) {
            softReference2.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        SoftReference<Activity> softReference = this.f43168b;
        if (softReference == null || softReference.get() == null || this.f43168b.get().isFinishing()) {
            return false;
        }
        return true;
    }

    public final void a(c cVar) {
        this.f43169c = new SoftReference<>(cVar);
    }

    b(Activity activity) {
        this.f43167a = new d(activity, e.f49765e);
        this.f43168b = new SoftReference<>(activity);
    }

    /* access modifiers changed from: package-private */
    public final void a(a aVar) {
        if (d()) {
            this.f43169c.get().a(aVar);
        }
        if (this.f43170d != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result", 1);
            this.f43170d.a(c(), bundle);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, String str) {
        a(i2, 0, str);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, int i3, String str) {
        if (d()) {
            this.f43169c.get().a(i2, i3);
        }
        if (this.f43170d != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("result", 0);
            bundle.putInt("error_code", i2);
            bundle.putInt("gsl_status_code", i3);
            bundle.putString("error_message", str);
            this.f43170d.a(c(), bundle);
        }
    }
}
