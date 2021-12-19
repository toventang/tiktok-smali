package com.ss.android.ugc.aweme.im.sdk.chat.feature.reply.feature.feed;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.f.b;
import dagger.hilt.android.internal.managers.e;

public abstract class c extends b implements dagger.hilt.a.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f100996a;

    /* renamed from: b  reason: collision with root package name */
    private volatile e f100997b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f100998c = new Object();

    static {
        Covode.recordClassIndex(64601);
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        return this.f100996a;
    }

    @Override // dagger.hilt.a.b
    public final Object generatedComponent() {
        return b().generatedComponent();
    }

    private void a() {
        if (this.f100996a == null) {
            this.f100996a = e.a(super.getContext(), this);
            generatedComponent();
        }
    }

    private e b() {
        if (this.f100997b == null) {
            synchronized (this.f100998c) {
                if (this.f100997b == null) {
                    this.f100997b = new e(this);
                }
            }
        }
        return this.f100997b;
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
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
        ContextWrapper contextWrapper = this.f100996a;
        if (contextWrapper == null || e.a(contextWrapper) == activity) {
            z = true;
        } else {
            z = false;
        }
        dagger.hilt.a.c.a(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a();
    }
}
