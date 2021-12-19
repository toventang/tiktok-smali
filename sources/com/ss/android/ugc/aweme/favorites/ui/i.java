package com.ss.android.ugc.aweme.favorites.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.f.a;
import dagger.hilt.a.b;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

/* access modifiers changed from: package-private */
public abstract class i extends a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f90893a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f90894b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f90895c = new Object();

    static {
        Covode.recordClassIndex(57135);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f90893a;
    }

    i() {
    }

    private void c() {
        ((ab) generatedComponent()).a((y) this);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.f90893a == null) {
            this.f90893a = e.a(super.getContext(), this);
            c();
        }
    }

    private e b() {
        if (this.f90894b == null) {
            synchronized (this.f90895c) {
                if (this.f90894b == null) {
                    this.f90894b = new e(this);
                }
            }
        }
        return this.f90894b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(e.a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f90893a;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
