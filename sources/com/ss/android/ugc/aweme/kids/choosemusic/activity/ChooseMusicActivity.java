package com.ss.android.ugc.aweme.kids.choosemusic.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.n;
import androidx.legacy.widget.Space;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public class ChooseMusicActivity extends a implements c {

    /* renamed from: a  reason: collision with root package name */
    public TextView f105487a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f105488b;

    /* renamed from: c  reason: collision with root package name */
    public ViewPagerBottomSheetBehavior f105489c;

    /* renamed from: d  reason: collision with root package name */
    private int f105490d;

    static {
        Covode.recordClassIndex(67588);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        a();
        super.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        return new Analysis().setLabelName("music_homepage");
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        KeyboardUtils.c(this.f105487a);
        overridePendingTransition(0, R.anim.ah);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        AVExternalServiceImpl.a().provideAVPerformance().leave(this, "music_select");
    }

    public final void a() {
        if (this.f105488b) {
            AVExternalServiceImpl.a().publishService().setCurMusic(null);
            Intent intent = new Intent();
            intent.putExtra("is_cancel_current_choose_music", true);
            setResult(-1, intent);
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        AVExternalServiceImpl.a().provideAVPerformance().pause(this, "music_select", a(getIntent(), "creation_id"), a(getIntent(), "shoot_way"));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
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
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        AVExternalServiceImpl.a().provideAVPerformance().enter(this, "music_select");
        overridePendingTransition(R.anim.af, 0);
        setContentView(R.layout.adg);
        TextView textView = (TextView) findViewById(R.id.f9l);
        this.f105487a = textView;
        textView.setText(a(getIntent(), "title"));
        findViewById(R.id.qb).setOnClickListener(new a(this));
        Bundle bundleExtra = getIntent().getBundleExtra("arguments");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (!(bundleExtra == null || context == null)) {
            bundleExtra.setClassLoader(context.getClassLoader());
        }
        ((Space) findViewById(R.id.e7k)).setMinimumHeight(i.b());
        ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.a(findViewById(R.id.akq));
        this.f105489c = a2;
        a2.f68175k = new ViewPagerBottomSheetBehavior.a() {
            /* class com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(67589);
            }

            @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.a
            public final void a(View view, float f2) {
            }

            @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.a
            public final void a(View view, int i2) {
                if (i2 == 5) {
                    ChooseMusicActivity.this.a();
                    ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                    chooseMusicActivity.finish();
                    chooseMusicActivity.overridePendingTransition(0, 0);
                }
            }
        };
        this.f105489c.f68168d = true;
        this.f105489c.b(i.a(this) + i.e(this));
        androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.a(R.id.b94) == null) {
            this.f105490d = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            AVExternalServiceImpl.a().publishService().setMusicChooseType(this.f105490d);
            String a3 = a(getIntent(), "challenge");
            String a4 = a(getIntent(), "creation_id");
            String a5 = a(getIntent(), "shoot_way");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("music_is_photomv", false);
            n a6 = supportFragmentManager.a();
            int i2 = this.f105490d;
            com.ss.android.ugc.aweme.kids.choosemusic.c.i iVar = new com.ss.android.ugc.aweme.kids.choosemusic.c.i();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", i2);
            bundle2.putSerializable("challenge", a3);
            bundle2.putSerializable("music_model", (MusicModel) getIntent().getSerializableExtra("music_model"));
            bundle2.putBoolean("music_allow_clear", booleanExtra);
            bundle2.putString("creation_id", a4);
            bundle2.putString("shoot_way", a5);
            bundle2.putBoolean("music_is_photomv", booleanExtra2);
            if (bundleExtra != null) {
                bundle2.putAll(bundleExtra);
            }
            iVar.setArguments(bundle2);
            a6.a(R.id.b94, iVar).b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 10086 && i3 == -1) {
            setResult(-1, intent);
            finish();
        }
    }
}
