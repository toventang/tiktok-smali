package com.ss.android.ugc.aweme.relation.recommend;

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

public abstract class d extends a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f120411a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f120412b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f120413c = new Object();

    static {
        Covode.recordClassIndex(78360);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f120411a;
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.f120411a == null) {
            this.f120411a = e.a(super.getContext(), this);
            generatedComponent();
        }
    }

    private e b() {
        if (this.f120412b == null) {
            synchronized (this.f120413c) {
                if (this.f120412b == null) {
                    this.f120412b = new e(this);
                }
            }
        }
        return this.f120412b;
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
        ContextWrapper contextWrapper = this.f120411a;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
