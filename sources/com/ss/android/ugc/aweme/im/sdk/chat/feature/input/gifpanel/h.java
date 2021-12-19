package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.fragment.a;
import dagger.hilt.a.b;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

public abstract class h extends a implements b<Object> {

    /* renamed from: e  reason: collision with root package name */
    private ContextWrapper f100760e;

    /* renamed from: f  reason: collision with root package name */
    private volatile e f100761f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f100762g = new Object();

    static {
        Covode.recordClassIndex(64464);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f100760e;
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return d().generatedComponent();
    }

    @Override // com.bytedance.ies.foundation.fragment.a
    private void c() {
        if (this.f100760e == null) {
            this.f100760e = e.a(super.getContext(), this);
            generatedComponent();
        }
    }

    private e d() {
        if (this.f100761f == null) {
            synchronized (this.f100762g) {
                if (this.f100761f == null) {
                    this.f100761f = new e(this);
                }
            }
        }
        return this.f100761f;
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
        ContextWrapper contextWrapper = this.f100760e;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        c();
    }
}
