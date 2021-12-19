package com.ss.android.ugc.aweme.profile.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.b;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

public abstract class aj extends b implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f116864a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f116865b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f116866c = new Object();

    static {
        Covode.recordClassIndex(75473);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f116864a;
    }

    aj() {
    }

    private void c() {
        ((cn) generatedComponent()).a((bm) this);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.f116864a == null) {
            this.f116864a = e.a(super.getContext(), this);
            c();
        }
    }

    private e b() {
        if (this.f116865b == null) {
            synchronized (this.f116866c) {
                if (this.f116865b == null) {
                    this.f116865b = new e(this);
                }
            }
        }
        return this.f116865b;
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

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f116864a;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
