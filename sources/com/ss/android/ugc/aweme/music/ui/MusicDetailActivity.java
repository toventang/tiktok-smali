package com.ss.android.ugc.aweme.music.ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.n;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.analysis.c;
import com.ss.android.ugc.aweme.base.a.g;
import com.ss.android.ugc.aweme.base.f;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bl.IBenchmarkService;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.setting.bj;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public class MusicDetailActivity extends a implements c, g, f {

    /* renamed from: a  reason: collision with root package name */
    private String f111780a;

    /* renamed from: b  reason: collision with root package name */
    private String f111781b;

    /* renamed from: c  reason: collision with root package name */
    private String f111782c;

    /* renamed from: d  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.base.a.a> f111783d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    private String f111784e;

    /* renamed from: f  reason: collision with root package name */
    private String f111785f;

    /* renamed from: g  reason: collision with root package name */
    private String f111786g;

    /* renamed from: h  reason: collision with root package name */
    private String f111787h;

    /* renamed from: i  reason: collision with root package name */
    private int f111788i;

    /* renamed from: j  reason: collision with root package name */
    private String f111789j;

    /* renamed from: k  reason: collision with root package name */
    private String f111790k = "";

    static {
        Covode.recordClassIndex(71874);
    }

    @Override // com.ss.android.ugc.aweme.base.f
    public final String c() {
        return "single_song";
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        com.ss.android.ugc.aweme.push.a.a(this);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
        IBenchmarkService c2 = BenchmarkServiceImpl.c();
        if (c2 != null) {
            c2.a(4);
        }
    }

    @Override // com.ss.android.ugc.aweme.analysis.c
    public final Analysis F() {
        long j2;
        Exception e2;
        long j3 = 0;
        try {
            j2 = Long.parseLong(this.f111784e);
            try {
                j3 = Long.parseLong(this.f111780a);
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Exception e4) {
            e2 = e4;
            j2 = 0;
            e2.printStackTrace();
            return new Analysis().setLabelName("single_song").setExt_value(j2).setValue(j3);
        }
        return new Analysis().setLabelName("single_song").setExt_value(j2).setValue(j3);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStop() {
        com.bytedance.helios.sdk.utils.a.d(this);
        super.onStop();
        IBenchmarkService c2 = BenchmarkServiceImpl.c();
        if (c2 != null) {
            c2.a();
        }
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

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void unRegisterActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        List<com.ss.android.ugc.aweme.base.a.a> list = this.f111783d;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.a.g
    public void registerActivityOnKeyDownListener(com.ss.android.ugc.aweme.base.a.a aVar) {
        if (!this.f111783d.contains(aVar)) {
            this.f111783d.add(aVar);
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", true);
        com.ss.android.ugc.aweme.cc.c.a("single_song");
        x xVar = new x((byte) 0);
        xVar.f65555a = true;
        xVar.f65561g = R.color.nd;
        activityConfiguration(new r(xVar));
        super.onCreate(bundle);
        if (bj.a()) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.alb);
        View findViewById = findViewById(R.id.e_f);
        if (findViewById != null) {
            e.b(findViewById);
            o.b(this);
        }
        this.f111786g = a(getIntent(), "partnerName");
        this.f111787h = a(getIntent(), "partnerMusicId");
        this.f111784e = a(getIntent(), "id");
        this.f111785f = a(getIntent(), "process_id");
        this.f111780a = a(getIntent(), "aweme_id");
        this.f111781b = a(getIntent(), "extra_music_from");
        this.f111782c = a(getIntent(), "previous_page_position");
        String a2 = a(getIntent(), "sticker_id");
        String a3 = a(getIntent(), "from_token");
        this.f111788i = getIntent().getIntExtra("extra_video_length", 0);
        this.f111789j = a(getIntent(), "extra_track_info");
        String a4 = a(getIntent(), "shoot_enter_from");
        this.f111790k = a(getIntent(), "banner_id");
        int intExtra = getIntent().getIntExtra("is_bundled", 0);
        int intExtra2 = getIntent().getIntExtra("click_reason", 0);
        String a5 = com.bytedance.ies.powerpreload.task.e.a(getIntent());
        Long valueOf = Long.valueOf(getIntent().getLongExtra("EXTRA_PRELOAD_PAGE_START_TIME", -1));
        if (!TextUtils.isEmpty(this.f111784e) || !TextUtils.isEmpty(this.f111787h)) {
            if (TextUtils.isEmpty(this.f111785f)) {
                this.f111785f = "";
            }
            i supportFragmentManager = getSupportFragmentManager();
            n a6 = supportFragmentManager.a();
            Fragment a7 = supportFragmentManager.a("music_detail_fragment_tag");
            if (a7 == null) {
                String str = this.f111784e;
                String str2 = this.f111780a;
                String str3 = this.f111781b;
                String str4 = this.f111782c;
                String str5 = this.f111787h;
                String str6 = this.f111786g;
                String str7 = this.f111785f;
                int i2 = this.f111788i;
                String str8 = this.f111790k;
                String str9 = this.f111789j;
                Bundle bundle2 = new Bundle(3);
                bundle2.putString("id", str);
                bundle2.putString("partnerName", str6);
                bundle2.putString("partnerMusicId", str5);
                bundle2.putString("aweme_id", str2);
                bundle2.putString("sticker_id", a2);
                bundle2.putString("extra_music_from", str3);
                bundle2.putString("extra_previous_page_position", str4);
                bundle2.putInt("click_reason", intExtra2);
                bundle2.putString("from_token", a3);
                bundle2.putString("process_id", str7);
                bundle2.putInt("extra_video_length", i2);
                bundle2.putString("extra_track_info", str9);
                bundle2.putString("banner_id", str8);
                l.c(bundle2, "");
                if (a5 != null) {
                    bundle2.putString("PRELOAD_TRACE_INFO_LIFECYCLE_KEY", a5);
                }
                bundle2.putLong("EXTRA_PRELOAD_PAGE_START_TIME", valueOf.longValue());
                if (a4 == null) {
                    a4 = "";
                }
                bundle2.putString("shoot_enter_from", a4);
                bundle2.putInt("is_bundled", intExtra);
                a7 = new ah();
                a7.setArguments(bundle2);
            }
            a7.setUserVisibleHint(true);
            a6.b(R.id.ad7, a7, "music_detail_fragment_tag");
            a6.b();
        } else {
            finish();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        for (com.ss.android.ugc.aweme.base.a.a aVar : this.f111783d) {
            if (aVar.onKeyDown(i2, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, com.bytedance.ies.powerpage.a
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 10086 && i3 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
