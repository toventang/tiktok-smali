package com.google.android.play.core.e;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.ar;
import com.google.android.play.core.tasks.m;

/* access modifiers changed from: package-private */
public class s<T> extends ar {

    /* renamed from: a  reason: collision with root package name */
    final m<T> f53340a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t f53341b;

    static {
        Covode.recordClassIndex(32947);
    }

    s(t tVar, m<T> mVar) {
        this.f53341b = tVar;
        this.f53340a = mVar;
    }

    @Override // com.google.android.play.core.b.as
    public void a(int i2, Bundle bundle) {
        this.f53341b.f53345c.a();
        t.f53342a.d("onStartInstall(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.b.as
    public void b(int i2, Bundle bundle) {
        this.f53341b.f53345c.a();
        t.f53342a.d("onCancelInstall(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.b.as
    public void c(int i2, Bundle bundle) {
        this.f53341b.f53345c.a();
        t.f53342a.d("onGetSession(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.b.as
    public final void b() {
        this.f53341b.f53345c.a();
        t.f53342a.d("onDeferredUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.b.as
    public final void c() {
        this.f53341b.f53345c.a();
        t.f53342a.d("onDeferredInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.b.as
    public final void e() {
        this.f53341b.f53345c.a();
        t.f53342a.d("onDeferredLanguageUninstall", new Object[0]);
    }

    @Override // com.google.android.play.core.b.as
    public final void d() {
        this.f53341b.f53345c.a();
        t.f53342a.d("onDeferredLanguageInstall", new Object[0]);
    }

    @Override // com.google.android.play.core.b.as
    public final void a(Bundle bundle) {
        this.f53341b.f53345c.a();
        int i2 = bundle.getInt("error_code");
        t.f53342a.b("onError(%d)", Integer.valueOf(i2));
        this.f53340a.b(new a(i2));
    }

    @Override // com.google.android.play.core.b.as
    public final void a() {
        this.f53341b.f53345c.a();
        t.f53342a.d("onGetSessionStates", new Object[0]);
    }

    @Override // com.google.android.play.core.b.as
    public final void a(int i2) {
        this.f53341b.f53345c.a();
        t.f53342a.d("onCompleteInstall(%d)", Integer.valueOf(i2));
    }

    @Override // com.google.android.play.core.b.as
    public final void f() {
        this.f53341b.f53345c.a();
        t.f53342a.d("onCompleteInstallForAppUpdate", new Object[0]);
    }

    @Override // com.google.android.play.core.b.as
    public final void g() {
        this.f53341b.f53345c.a();
        t.f53342a.d("onGetSplitsForAppUpdate", new Object[0]);
    }
}
