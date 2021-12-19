package com.bytedance.scene;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.d.k;
import com.bytedance.scene.t;

public final class u extends Fragment implements t.a {

    /* renamed from: a  reason: collision with root package name */
    private final t f43039a = t.f43033a.a();

    static {
        Covode.recordClassIndex(26378);
    }

    @Override // com.bytedance.scene.t.a
    public final t a() {
        return this.f43039a;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public static u a(Activity activity, String str, boolean z, boolean z2) {
        String str2 = str + "_ScopeHolderFragment";
        FragmentManager fragmentManager = activity.getFragmentManager();
        u uVar = (u) fragmentManager.findFragmentByTag(str2);
        if (uVar != null) {
            if (!z) {
                return uVar;
            }
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            beginTransaction.remove(uVar);
            k.a(fragmentManager, beginTransaction, z2);
        }
        u uVar2 = new u();
        FragmentTransaction beginTransaction2 = fragmentManager.beginTransaction();
        beginTransaction2.add(uVar2, str2);
        k.a(fragmentManager, beginTransaction2, z2);
        return uVar2;
    }
}
