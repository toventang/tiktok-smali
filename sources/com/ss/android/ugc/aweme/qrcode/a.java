package com.ss.android.ugc.aweme.qrcode;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.b;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

public abstract class a extends com.bytedance.ies.foundation.fragment.a implements b<Object> {

    /* renamed from: e  reason: collision with root package name */
    private ContextWrapper f119700e;

    /* renamed from: f  reason: collision with root package name */
    private volatile e f119701f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f119702g = new Object();

    static {
        Covode.recordClassIndex(77756);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f119700e;
    }

    a() {
    }

    private void e() {
        ((h) generatedComponent()).a((QRCodeFragment) this);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return d().generatedComponent();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    private void c() {
        if (this.f119700e == null) {
            this.f119700e = e.a(super.getContext(), this);
            e();
        }
    }

    private e d() {
        if (this.f119701f == null) {
            synchronized (this.f119702g) {
                if (this.f119701f == null) {
                    this.f119701f = new e(this);
                }
            }
        }
        return this.f119701f;
    }

    @Override // com.bytedance.ies.foundation.fragment.a, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        c();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return LayoutInflater.from(e.a(super.onGetLayoutInflater(bundle), this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        boolean z;
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f119700e;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c();
    }
}
