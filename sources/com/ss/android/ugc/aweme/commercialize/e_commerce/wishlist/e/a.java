package com.ss.android.ugc.aweme.commercialize.e_commerce.wishlist.e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.b;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

public abstract class a extends com.ss.android.ugc.aweme.base.f.a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f73873a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f73874b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f73875c = new Object();

    static {
        Covode.recordClassIndex(45511);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f73873a;
    }

    private void c() {
        ((c) generatedComponent()).a((b) this);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.f73873a == null) {
            this.f73873a = e.a(super.getContext(), this);
            c();
        }
    }

    private e b() {
        if (this.f73874b == null) {
            synchronized (this.f73875c) {
                if (this.f73874b == null) {
                    this.f73874b = new e(this);
                }
            }
        }
        return this.f73874b;
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
        ContextWrapper contextWrapper = this.f73873a;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
