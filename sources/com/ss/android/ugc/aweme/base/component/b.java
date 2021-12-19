package com.ss.android.ugc.aweme.base.component;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.analysis.c;
import java.lang.ref.WeakReference;

public final class b extends i.b {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<c> f68061a;

    static {
        Covode.recordClassIndex(41921);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentResumed(i iVar, Fragment fragment) {
        super.onFragmentResumed(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentStopped(i iVar, Fragment fragment) {
        super.onFragmentStopped(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentAttached(i iVar, Fragment fragment, Context context) {
        super.onFragmentAttached(iVar, fragment, context);
        if (fragment instanceof c) {
            this.f68061a = new WeakReference<>(fragment);
        }
    }
}
