package com.bytedance.router;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;

public class FakeFragment extends Fragment {
    private OnActivityResultCallback mCallback;

    static {
        Covode.recordClassIndex(26102);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mCallback = null;
    }

    public void setCallback(OnActivityResultCallback onActivityResultCallback) {
        this.mCallback = onActivityResultCallback;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        OnActivityResultCallback onActivityResultCallback = this.mCallback;
        if (onActivityResultCallback != null) {
            onActivityResultCallback.onActivityResult(i2, i3, intent);
            this.mCallback = null;
        }
        e activity = getActivity();
        if (activity != null) {
            activity.getSupportFragmentManager().a().a(this).d();
        }
    }
}
