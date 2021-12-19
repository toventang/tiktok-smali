package com.ss.android.ugc.aweme.commercialize.e_commerce.pdp.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.d;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

public abstract class b extends d implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f73825a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f73826b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f73827c = new Object();

    static {
        Covode.recordClassIndex(45466);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f73825a;
    }

    private void c() {
        ((e) generatedComponent()).a((d) this);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.f73825a == null) {
            this.f73825a = e.a(super.getContext(), this);
            c();
        }
    }

    private e b() {
        if (this.f73826b == null) {
            synchronized (this.f73827c) {
                if (this.f73826b == null) {
                    this.f73826b = new e(this);
                }
            }
        }
        return this.f73826b;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(e.a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f73825a;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
