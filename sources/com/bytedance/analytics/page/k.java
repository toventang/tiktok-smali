package com.bytedance.analytics.page;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class k extends i.b {

    /* renamed from: a  reason: collision with root package name */
    public static final k f6594a = new k();

    static {
        Covode.recordClassIndex(3172);
    }

    private k() {
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentDestroyed(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentDestroyed(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentDetached(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentDetached(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentPaused(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentPaused(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentResumed(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentResumed(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentStarted(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentStarted(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentStopped(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentStopped(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentViewDestroyed(i iVar, Fragment fragment) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentViewDestroyed(iVar, fragment);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentActivityCreated(i iVar, Fragment fragment, Bundle bundle) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentActivityCreated(iVar, fragment, bundle);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentAttached(i iVar, Fragment fragment, Context context) {
        l.d(iVar, "");
        l.d(fragment, "");
        l.d(context, "");
        super.onFragmentAttached(iVar, fragment, context);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentCreated(i iVar, Fragment fragment, Bundle bundle) {
        l.d(iVar, "");
        l.d(fragment, "");
        super.onFragmentCreated(iVar, fragment, bundle);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentPreAttached(i iVar, Fragment fragment, Context context) {
        l.d(iVar, "");
        l.d(fragment, "");
        l.d(context, "");
        super.onFragmentPreAttached(iVar, fragment, context);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentSaveInstanceState(i iVar, Fragment fragment, Bundle bundle) {
        l.d(iVar, "");
        l.d(fragment, "");
        l.d(bundle, "");
        super.onFragmentSaveInstanceState(iVar, fragment, bundle);
    }

    @Override // androidx.fragment.app.i.b
    public final void onFragmentViewCreated(i iVar, Fragment fragment, View view, Bundle bundle) {
        l.d(iVar, "");
        l.d(fragment, "");
        l.d(view, "");
        super.onFragmentViewCreated(iVar, fragment, view, bundle);
    }
}
