package com.facebook.m;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public final class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private a f48935a;

    static {
        Covode.recordClassIndex(29494);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f48935a.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f48935a = new a(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        this.f48935a.a(i2, i3, intent);
    }
}
