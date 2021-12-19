package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public Fragment f48676a;

    /* renamed from: b  reason: collision with root package name */
    public android.app.Fragment f48677b;

    static {
        Covode.recordClassIndex(29349);
    }

    public final Activity a() {
        Fragment fragment = this.f48676a;
        if (fragment != null) {
            return fragment.getActivity();
        }
        return this.f48677b.getActivity();
    }

    public s(android.app.Fragment fragment) {
        ae.a(fragment, "fragment");
        this.f48677b = fragment;
    }

    public s(Fragment fragment) {
        ae.a(fragment, "fragment");
        this.f48676a = fragment;
    }

    public final void a(Intent intent, int i2) {
        Fragment fragment = this.f48676a;
        if (fragment != null) {
            fragment.startActivityForResult(intent, i2);
        } else {
            this.f48677b.startActivityForResult(intent, i2);
        }
    }
}
