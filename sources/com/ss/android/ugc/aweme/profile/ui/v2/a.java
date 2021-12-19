package com.ss.android.ugc.aweme.profile.ui.v2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.ui.al;
import dagger.hilt.a.b;
import dagger.hilt.a.c;
import dagger.hilt.android.internal.managers.e;

public abstract class a extends al implements b<Object> {
    private ContextWrapper u;
    private volatile e v;
    private final Object w = new Object();

    static {
        Covode.recordClassIndex(75704);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.u;
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.u == null) {
            this.u = e.a(super.getContext(), this);
            generatedComponent();
        }
    }

    private e b() {
        if (this.v == null) {
            synchronized (this.w) {
                if (this.v == null) {
                    this.v = new e(this);
                }
            }
        }
        return this.v;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.al, androidx.fragment.app.Fragment
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
        ContextWrapper contextWrapper = this.u;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
