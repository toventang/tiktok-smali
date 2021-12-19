package com.ss.android.ugc.b.a.a;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.a.b;

public abstract class a extends b {

    /* renamed from: a  reason: collision with root package name */
    private SparseArray<c> f145539a;

    static {
        Covode.recordClassIndex(95153);
    }

    public abstract SparseArray<c> G();

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).aR();
        }
        super.onDestroy();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).J();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).q();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).aS();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).aT();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).I();
        }
        SparseArray<c> sparseArray = this.f145539a;
        if (sparseArray != null) {
            sparseArray.clear();
            this.f145539a = null;
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).a(bundle);
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        this.f145539a = G();
        for (int i2 = 0; i2 < this.f145539a.size(); i2++) {
            this.f145539a.valueAt(i2).a(activity, this);
        }
        super.onAttach(activity);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
