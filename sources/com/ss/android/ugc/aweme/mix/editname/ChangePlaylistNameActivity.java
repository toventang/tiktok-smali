package com.ss.android.ugc.aweme.mix.editname;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.mix.editname.h;

public final class ChangePlaylistNameActivity extends com.ss.android.ugc.aweme.mix.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f109914a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f109915b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f109916c = "";

    /* renamed from: d  reason: collision with root package name */
    private long f109917d;

    /* renamed from: e  reason: collision with root package name */
    private String f109918e = "";

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f109919f;

    static {
        Covode.recordClassIndex(70427);
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f109919f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this.f109919f == null) {
            this.f109919f = new SparseArray();
        }
        View view = (View) this.f109919f.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f109919f.put(i2, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(70428);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
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

    @Override // com.ss.android.ugc.aweme.mix.a
    public final Fragment a() {
        Intent intent = getIntent();
        if (intent != null) {
            String a2 = a(intent, "user_last_name");
            String str = "";
            if (a2 == null) {
                a2 = str;
            }
            this.f109915b = a2;
            String a3 = a(intent, "mix_id");
            if (a3 == null) {
                a3 = str;
            }
            this.f109916c = a3;
            this.f109917d = intent.getLongExtra("moderated_rename_timestamp", 0);
            String a4 = a(intent, "enter_from");
            if (a4 != null) {
                str = a4;
            }
            this.f109918e = str;
        }
        return h.c.a(2, this.f109915b, this.f109916c, null, Long.valueOf(this.f109917d), this.f109918e, 8);
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.ss.android.ugc.aweme.mix.a, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mix.editname.ChangePlaylistNameActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
