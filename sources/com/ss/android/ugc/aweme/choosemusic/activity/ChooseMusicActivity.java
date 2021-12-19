package com.ss.android.ugc.aweme.choosemusic.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.legacy.widget.Space;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.choosemusic.c.v;
import com.ss.android.ugc.aweme.choosemusic.model.ChooseMusicWithSceneViewModel;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.choosemusic.utils.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.music.b.d;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.performance.OpenMusicPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;

public class ChooseMusicActivity extends a implements c {

    /* renamed from: a  reason: collision with root package name */
    public TuxTextView f70327a;

    /* renamed from: b  reason: collision with root package name */
    public ViewPagerBottomSheetBehavior f70328b;

    /* renamed from: c  reason: collision with root package name */
    public int f70329c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f70330d;

    /* renamed from: e  reason: collision with root package name */
    public d f70331e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f70332f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f70333g;

    /* renamed from: h  reason: collision with root package name */
    private IAVPerformance f70334h = AVExternalServiceImpl.a().provideAVPerformance();

    static {
        Covode.recordClassIndex(43376);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.a
    public void onBackPressed() {
        b();
        super.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        return new Analysis().setLabelName("music_homepage");
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        KeyboardUtils.c(this.f70327a);
        overridePendingTransition(0, R.anim.ah);
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        this.f70334h.end(OpenMusicPanelPerformanceMonitor.f114756a, "animation_finished");
    }

    private boolean c() {
        if (AccountService.a().e().isChildrenMode() || this.f70333g) {
            return false;
        }
        try {
            if (!com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getEnableLocalMusicEntrance().booleanValue()) {
                return false;
            }
            return true;
        } catch (com.bytedance.ies.a e2) {
            e2.printStackTrace();
        }
    }

    public final void b() {
        if (((ChooseMusicWithSceneViewModel) ae.a(this, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70573b) {
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
        this.f70334h.pause(this, "music_select", a(getIntent(), "creation_id"), a(getIntent(), "shoot_way"));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", true);
        super.onResume();
        if (this.f70329c == 2) {
            b.f70718a = "video_shoot_page";
        } else {
            b.f70718a = "video_edit_page";
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onResume", false);
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

    public final void a() {
        this.f70332f = (TextView) findViewById(R.id.f6a);
        if (!c() || !this.f70331e.a()) {
            this.f70332f.setVisibility(8);
            return;
        }
        this.f70332f.setVisibility(0);
        if (this.f70330d) {
            this.f70332f.setAlpha(0.5f);
            this.f70332f.setOnClickListener(com.ss.android.ugc.aweme.choosemusic.widgets.a.a.a(new c(this)));
            return;
        }
        this.f70332f.setOnClickListener(com.ss.android.ugc.aweme.choosemusic.widgets.a.a.a(new d(this)));
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        String str;
        com.bytedance.helios.sdk.utils.a.e(this);
        String str2 = ((ChooseMusicWithSceneViewModel) ae.a(this, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70575d;
        com.ss.android.ugc.aweme.shortvideo.c curMusic = AVExternalServiceImpl.a().publishService().getCurMusic();
        if (curMusic != null) {
            str = curMusic.getMid();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str2) && !TextUtils.equals(str, str2)) {
            r.a("mission_requirement_modified", new com.ss.android.ugc.aweme.app.f.d().a("value", 1).a("mission_id", ((ChooseMusicWithSceneViewModel) ae.a(this, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70576e).f66730a);
            ((ChooseMusicWithSceneViewModel) ae.a(this, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70575d = null;
            ((ChooseMusicWithSceneViewModel) ae.a(this, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70576e = null;
        }
        super.onDestroy();
        this.f70334h.leave(this, "music_select");
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f70334h.step(OpenMusicPanelPerformanceMonitor.f114756a, "choose_music_created");
        this.f70334h.enter(this, "music_select");
        overridePendingTransition(R.anim.af, 0);
        setContentView(R.layout.b4);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.f9l);
        this.f70327a = tuxTextView;
        tuxTextView.setText(a(getIntent(), "title"));
        this.f70331e = new d(this, findViewById(R.id.dqk));
        this.f70333g = getIntent().getBooleanExtra("hide_local_music", false);
        this.f70330d = getIntent().getBooleanExtra("long_video", false);
        a();
        findViewById(R.id.qb).setOnClickListener(new a(this));
        Bundle bundleExtra = getIntent().getBundleExtra("arguments");
        Context context = BadParcelableCrashOptimizer.getContext();
        if (bundleExtra != null) {
            if (context != null) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            ((ChooseMusicWithSceneViewModel) ae.a(this, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70575d = bundleExtra.getString("mission_music_id");
            ((ChooseMusicWithSceneViewModel) ae.a(this, (ad.b) null).a(ChooseMusicWithSceneViewModel.class)).f70576e = bundleExtra.getString("mission_id");
        }
        ((Space) findViewById(R.id.e7k)).setMinimumHeight(i.b());
        ViewPagerBottomSheetBehavior a2 = ViewPagerBottomSheetBehavior.a(findViewById(R.id.akq));
        this.f70328b = a2;
        a2.f68175k = new ViewPagerBottomSheetBehavior.a() {
            /* class com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43377);
            }

            @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.a
            public final void a(View view, float f2) {
                ChooseMusicActivity.this.f70331e.a(f2);
            }

            @Override // com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.ViewPagerBottomSheetBehavior.a
            public final void a(View view, int i2) {
                if (i2 == 5) {
                    ChooseMusicActivity.this.b();
                    ChooseMusicActivity chooseMusicActivity = ChooseMusicActivity.this;
                    chooseMusicActivity.finish();
                    chooseMusicActivity.overridePendingTransition(0, 0);
                }
            }
        };
        this.f70328b.f68168d = true;
        this.f70328b.b(i.a(this) + i.e(this));
        androidx.fragment.app.i supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.a(R.id.b94) == null) {
            this.f70329c = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE", 1);
            AVExternalServiceImpl.a().publishService().setMusicChooseType(this.f70329c);
            String a3 = a(getIntent(), "challenge");
            String a4 = a(getIntent(), "creation_id");
            String a5 = a(getIntent(), "shoot_way");
            MusicModel musicModel = (MusicModel) getIntent().getSerializableExtra("music_model");
            boolean booleanExtra = getIntent().getBooleanExtra("music_allow_clear", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("music_is_photomv", false);
            supportFragmentManager.a().a(R.id.b94, v.a(this.f70329c, a3, musicModel, d.a.BtnConfirm, booleanExtra, booleanExtra2, bundleExtra, a5, a4, this.f70330d ? 1 : 0)).b();
            this.f70331e.a(new b(this, supportFragmentManager, a3, musicModel, booleanExtra, booleanExtra2, bundleExtra, a5, a4));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity", "onCreate", false);
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
