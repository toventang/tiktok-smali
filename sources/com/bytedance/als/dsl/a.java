package com.bytedance.als.dsl;

import android.app.Fragment;
import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

public final class a extends Fragment implements m {

    /* renamed from: a  reason: collision with root package name */
    private final n f6459a = new n(this);

    /* renamed from: b  reason: collision with root package name */
    private HashMap f6460b;

    static {
        Covode.recordClassIndex(3107);
    }

    @Override // androidx.lifecycle.m
    public final i getLifecycle() {
        return this.f6459a;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f6459a.a(i.a.ON_DESTROY);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f6460b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public final void onPause() {
        super.onPause();
        this.f6459a.a(i.a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        this.f6459a.a(i.a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        this.f6459a.a(i.a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        this.f6459a.a(i.a.ON_STOP);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f6459a.a(i.a.ON_CREATE);
    }
}
