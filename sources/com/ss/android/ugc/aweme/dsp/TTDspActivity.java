package com.ss.android.ugc.aweme.dsp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.a.c;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.utils.ez;
import com.ss.android.ugc.aweme.utils.fc;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class TTDspActivity extends com.bytedance.ies.foundation.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f83229a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private SparseArray f83230b;

    static {
        Covode.recordClassIndex(51889);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f83230b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f83230b == null) {
            this.f83230b = new SparseArray();
        }
        View view = (View) this.f83230b.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f83230b.put(i2, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.TTDspActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.TTDspActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.TTDspActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51890);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void finish() {
        super.finish();
        String a2 = a(getIntent(), "enter_method");
        if (a2 != null) {
            int hashCode = a2.hashCode();
            if (hashCode != -1167692212) {
                if (hashCode != 975440483 || !a2.equals("metab_music")) {
                    return;
                }
            } else if (!a2.equals("homepage_music_cover")) {
                return;
            }
            c.a(this);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
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

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.TTDspActivity", "onCreate", true);
        super.onCreate(bundle);
        String a2 = a(getIntent(), "enter_method");
        if (a2 != null) {
            int hashCode = a2.hashCode();
            if (hashCode != -1167692212) {
                if (hashCode == 975440483 && a2.equals("metab_music")) {
                    c.a(this, 0);
                }
            } else if (a2.equals("homepage_music_cover") && !MSAdaptionService.c().a((Context) this)) {
                if (Build.VERSION.SDK_INT >= 30) {
                    c.a(this, 1);
                } else {
                    c.a(this, 0);
                }
            }
        }
        setContentView(R.layout.alr);
        i supportFragmentManager = getSupportFragmentManager();
        n a3 = supportFragmentManager.a();
        l.b(a3, "");
        Fragment a4 = supportFragmentManager.a("music_dsp_fragment_tag");
        if (a4 == null) {
            String a5 = a(getIntent(), "enter_from");
            Bundle bundle2 = new Bundle();
            bundle2.putString("enter_from", a5);
            bundle2.putString("enter_method", a2);
            a4 = new b();
            a4.setArguments(bundle2);
        }
        a3.b(R.id.b4y, a4, "music_dsp_fragment_tag");
        a3.b();
        o.a((Activity) this);
        ez.a(this);
        fc.a(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.dsp.TTDspActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
