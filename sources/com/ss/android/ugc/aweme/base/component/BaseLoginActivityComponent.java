package com.ss.android.ugc.aweme.base.component;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;

public abstract class BaseLoginActivityComponent implements au, e {
    static {
        Covode.recordClassIndex(41917);
    }

    @v(a = i.a.ON_DESTROY)
    public void onDestroy() {
    }

    @Override // androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.component.e
    public void a(Activity activity, String str, String str2, Bundle bundle, f fVar) {
        if (activity instanceof m) {
            ((m) activity).getLifecycle().a(this);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }

    @Override // com.ss.android.ugc.aweme.base.component.e
    public void a(Fragment fragment, String str, String str2, Bundle bundle, f fVar) {
        fragment.getLifecycle().a(this);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }
}
