package com.bytedance.ies.uikit.a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

public abstract class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private d<e> f35363a = new d<>();

    /* renamed from: f  reason: collision with root package name */
    public boolean f35364f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f35365g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f35366h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f35367i = true;

    static {
        Covode.recordClassIndex(21170);
    }

    public boolean ab_() {
        return this.f35365g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f35365g = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (!this.f35363a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35363a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f35365g = false;
        this.f35366h = true;
        if (!this.f35363a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35363a.iterator();
            while (it.hasNext()) {
                e next = it.next();
                if (next != null) {
                    next.a();
                }
            }
            this.f35363a.f26927a.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f35364f = true;
        if (!this.f35363a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35363a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f35364f = false;
        if (!this.f35363a.f26927a.isEmpty()) {
            Iterator<e> it = this.f35363a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35364f = false;
        this.f35365g = false;
        this.f35366h = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putBoolean("WORKAROUND_FOR_BUG_19917_KEY", true);
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f35365g = true;
    }
}
