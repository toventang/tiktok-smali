package com.bytedance.android.livesdk.ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import f.a.b.b;

public class a extends Fragment {
    private final f.a.b.a compositeDisposable = new f.a.b.a();
    public boolean mStatusActive;
    public boolean mStatusDestroyed;
    protected boolean mStatusViewValid;

    static {
        Covode.recordClassIndex(12828);
    }

    public boolean isViewValid() {
        return this.mStatusViewValid;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mStatusViewValid = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mStatusActive = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mStatusActive = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mStatusViewValid = false;
        this.mStatusDestroyed = true;
        this.compositeDisposable.a();
    }

    /* access modifiers changed from: protected */
    public void register(b bVar) {
        this.compositeDisposable.a(bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mStatusActive = false;
        this.mStatusViewValid = false;
        this.mStatusDestroyed = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mStatusViewValid = true;
    }
}
