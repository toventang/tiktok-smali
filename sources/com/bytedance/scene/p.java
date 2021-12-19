package com.bytedance.scene;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.k;
import com.bytedance.scene.j;
import com.bytedance.scene.q;
import com.bytedance.scene.r;
import com.bytedance.scene.t;

public final class p<T extends j & r> implements m {

    /* renamed from: a  reason: collision with root package name */
    private final int f43017a;

    /* renamed from: b  reason: collision with root package name */
    private final z f43018b;

    /* renamed from: c  reason: collision with root package name */
    private final T f43019c;

    /* renamed from: d  reason: collision with root package name */
    private final t.a f43020d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f43021e;

    /* renamed from: f  reason: collision with root package name */
    private final q<T> f43022f = new q<>();

    static {
        Covode.recordClassIndex(26369);
    }

    @Override // com.bytedance.scene.m
    public final void a() {
        this.f43022f.a();
    }

    @Override // com.bytedance.scene.m
    public final void b() {
        this.f43022f.b();
    }

    @Override // com.bytedance.scene.m
    public final void c() {
        this.f43022f.c();
    }

    @Override // com.bytedance.scene.m
    public final void d() {
        this.f43022f.d();
    }

    @Override // com.bytedance.scene.m
    public final void e() {
        this.f43022f.e();
    }

    @Override // com.bytedance.scene.m
    public final void a(Bundle bundle) {
        if (this.f43021e) {
            bundle.putString("SCENE", this.f43019c.getClass().getName());
            q<T> qVar = this.f43022f;
            k.a(bundle, "outState can't be null");
            if (qVar.f43024b == q.a.NONE) {
                throw new IllegalStateException("invoke onActivityCreated() first, current state " + qVar.f43024b.toString());
            } else if (qVar.f43025c) {
                qVar.f43023a.d(bundle);
            } else {
                throw new IllegalArgumentException("cant invoke onSaveInstanceState when not support restore");
            }
        }
    }

    @Override // com.bytedance.scene.m
    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2 = bundle;
        ViewGroup viewGroup = (ViewGroup) this.f43018b.a(this.f43017a);
        q<T> qVar = this.f43022f;
        T t = this.f43019c;
        t.a aVar = this.f43020d;
        boolean z = this.f43021e;
        if (!z) {
            bundle2 = null;
        }
        qVar.a(activity, viewGroup, t, aVar, z, bundle2);
    }

    public p(int i2, z zVar, T t, t.a aVar, boolean z) {
        this.f43017a = i2;
        this.f43018b = zVar;
        this.f43019c = t;
        this.f43020d = aVar;
        this.f43021e = z;
    }
}
