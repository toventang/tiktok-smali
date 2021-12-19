package com.ss.android.ugc.aweme.ce;

import android.app.Fragment;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.ce.b;

public final class a extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    b.AbstractC1579b f69811a;

    static {
        Covode.recordClassIndex(43041);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestPermissions(getArguments().getStringArray("permissions"), 1);
    }

    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i2, strArr, iArr);
        b.AbstractC1579b bVar = this.f69811a;
        if (bVar != null) {
            bVar.a(strArr, iArr);
        }
        getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
    }
}
