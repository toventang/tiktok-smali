package com.zhihu.matisse.internal.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.entity.c;
import java.util.ArrayList;

public class SelectedPreviewActivity extends a {
    static {
        Covode.recordClassIndex(103892);
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e
    public void onResume() {
        a.b(this);
        super.onResume();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, androidx.appcompat.app.d
    public void onStop() {
        a.d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // com.zhihu.matisse.internal.ui.a, androidx.core.app.d, androidx.fragment.app.e, androidx.appcompat.app.d
    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        super.onCreate(bundle);
        if (!c.a.f156445a.p) {
            setResult(0);
            finish();
            return;
        }
        Bundle bundleExtra = getIntent().getBundleExtra("extra_default_bundle");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        ArrayList parcelableArrayList = bundleExtra.getParcelableArrayList("state_selection");
        this.f156451d.a(parcelableArrayList);
        this.f156451d.notifyDataSetChanged();
        if (this.f156449b.f156437f) {
            this.f156452e.setCheckedNum(1);
        } else {
            this.f156452e.setChecked(true);
        }
        this.f156456i = 0;
        a((Item) parcelableArrayList.get(0));
    }
}
