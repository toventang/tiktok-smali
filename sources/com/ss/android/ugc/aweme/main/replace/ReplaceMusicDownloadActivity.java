package com.ss.android.ugc.aweme.main.replace;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.main.replace.d;
import com.ss.android.ugc.aweme.shortvideo.view.d;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.video.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ReplaceMusicDownloadActivity extends a {
    private SparseArray _$_findViewCache;

    static {
        Covode.recordClassIndex(69995);
    }

    public final void ReplaceMusicDownloadActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public final View _$_findCachedViewById(int i2) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this._$_findViewCache.put(i2, findViewById);
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

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public final void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(this);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public final void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onResume", false);
    }

    public static void com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(ReplaceMusicDownloadActivity replaceMusicDownloadActivity) {
        replaceMusicDownloadActivity.ReplaceMusicDownloadActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                replaceMusicDownloadActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    public static void com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop(ReplaceMusicDownloadActivity replaceMusicDownloadActivity) {
        com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop(replaceMusicDownloadActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                replaceMusicDownloadActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public final void onCreate(Bundle bundle) {
        String string;
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onCreate", true);
        super.onCreate(bundle);
        String com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(getIntent(), "aweme_id");
        if (TextUtils.isEmpty(com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onCreate", false);
            return;
        }
        d dVar = new d();
        if (com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            l.b();
        }
        l.d(com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, "");
        l.d(this, "");
        l.d("", "");
        dVar.f109292a = this;
        dVar.f109293b = "";
        if (!in.d()) {
            if (!e.e()) {
                Activity activity = dVar.f109292a;
                if (activity == null) {
                    l.a("mContext");
                }
                new b(activity).e(R.string.fhc).b();
            } else if (e.f() < 20971520) {
                Activity activity2 = dVar.f109292a;
                if (activity2 == null) {
                    l.a("mContext");
                }
                new b(activity2).e(R.string.fhc).b();
            } else {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (g2.isLogin()) {
                    if (!j.f107229h || !j.b() || j.c()) {
                        j.f107229h = d.a();
                    }
                    if (!j.f107229h) {
                        Activity activity3 = dVar.f109292a;
                        if (activity3 == null) {
                            l.a("mContext");
                        }
                        new b(activity3).e(R.string.de9).b();
                    } else {
                        if (dVar.f109294c == null) {
                            Activity activity4 = dVar.f109292a;
                            if (activity4 == null) {
                                l.a("mContext");
                            }
                            Activity activity5 = dVar.f109292a;
                            if (activity5 == null) {
                                l.a("mContext");
                            } else {
                                Resources resources = activity5.getResources();
                                if (resources != null) {
                                    string = resources.getString(R.string.bdz);
                                    dVar.f109294c = d.a(activity4, string);
                                }
                            }
                            string = null;
                            dVar.f109294c = d.a(activity4, string);
                        }
                        d dVar2 = dVar.f109294c;
                        if (dVar2 != null) {
                            dVar2.setIndeterminate(false);
                        }
                        d dVar3 = dVar.f109294c;
                        if (dVar3 != null) {
                            dVar3.setProgress(0);
                        }
                        com.ss.android.b.a.a.a.a(new d.c(dVar, com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra));
                    }
                }
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadActivity", "onCreate", false);
    }

    public static String com_ss_android_ugc_aweme_main_replace_ReplaceMusicDownloadActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
