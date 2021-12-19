package com.ss.android.ugc.aweme.commercialize.preview.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

public abstract class b extends Fragment implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f75060a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f75061b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f75062c = new Object();

    static {
        Covode.recordClassIndex(46284);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f75060a;
    }

    private void c() {
        ((a) generatedComponent()).a((AdsPreviewFragment) this);
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.f75060a == null) {
            this.f75060a = e.a(super.getContext(), this);
            c();
        }
    }

    private e b() {
        if (this.f75061b == null) {
            synchronized (this.f75062c) {
                if (this.f75061b == null) {
                    this.f75061b = new e(this);
                }
            }
        }
        return this.f75061b;
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
        ContextWrapper contextWrapper = this.f75060a;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
