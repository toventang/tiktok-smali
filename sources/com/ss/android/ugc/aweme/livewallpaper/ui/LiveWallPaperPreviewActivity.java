package com.ss.android.ugc.aweme.livewallpaper.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.SeekBar;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.activity.processor.x;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.livewallpaper.a;
import com.ss.android.ugc.aweme.livewallpaper.f.d;
import com.ss.android.ugc.aweme.livewallpaper.f.f;
import com.ss.android.ugc.aweme.livewallpaper.f.h;
import com.ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.zhiliaoapp.musically.R;

public class LiveWallPaperPreviewActivity extends a implements SurfaceHolder.Callback {

    /* renamed from: a  reason: collision with root package name */
    SurfaceView f108946a;

    /* renamed from: b  reason: collision with root package name */
    TuxIconView f108947b;

    /* renamed from: c  reason: collision with root package name */
    TuxIconView f108948c;

    /* renamed from: d  reason: collision with root package name */
    public LiveWallPaperBean f108949d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.livewallpaper.a f108950e;

    /* renamed from: f  reason: collision with root package name */
    public float f108951f;

    /* renamed from: g  reason: collision with root package name */
    public String f108952g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f108953h;

    static {
        Covode.recordClassIndex(69757);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        float f2;
        LiveWallPaperBean liveWallPaperBean = this.f108949d;
        if (liveWallPaperBean.isShouldMute()) {
            f2 = 0.0f;
        } else {
            f2 = this.f108951f;
        }
        liveWallPaperBean.setVolume(f2);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        d.f108899e.a("paper_set");
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

    public void exit(View view) {
        finish();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f108950e.a();
    }

    public void showSettingDialog(View view) {
        new o().a(this, this.f108949d.isShouldMute(), "Preview", new SeekBar.OnSeekBarChangeListener() {
            /* class com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity.AnonymousClass3 */

            static {
                Covode.recordClassIndex(69761);
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
                if (z) {
                    LiveWallPaperPreviewActivity.this.f108951f = f.a(i2);
                    LiveWallPaperPreviewActivity.this.f108950e.a(LiveWallPaperPreviewActivity.this.f108951f);
                }
            }
        });
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f108950e.a(surfaceHolder, this.f108949d.getVideoPath(), this.f108949d.getWidth(), this.f108949d.getHeight());
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", true);
        x xVar = new x((byte) 0);
        xVar.f65555a = false;
        xVar.f65562h = false;
        xVar.f65561g = R.color.us;
        activityConfiguration(new b(xVar));
        super.onCreate(bundle);
        this.f108949d = (LiveWallPaperBean) getIntent().getParcelableExtra("live_wall_paper");
        this.f108953h = getIntent().getBooleanExtra("hide_more_button", false);
        this.f108952g = a(getIntent(), "from");
        if (this.f108949d == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
            return;
        }
        setContentView(R.layout.bkh);
        this.f108946a = (SurfaceView) findViewById(R.id.e04);
        this.f108947b = (TuxIconView) findViewById(R.id.bz1);
        this.f108948c = (TuxIconView) findViewById(R.id.d85);
        View findViewById = findViewById(R.id.qb);
        if (findViewById != null) {
            findViewById.setOnClickListener(new c(this));
        }
        View findViewById2 = findViewById(R.id.f75);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new d(this));
        }
        View findViewById3 = findViewById(R.id.bz1);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new e(this));
        }
        View findViewById4 = findViewById(R.id.d85);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new f(this));
        }
        e.b(findViewById(R.id.e_f));
        this.f108946a.getHolder().addCallback(this);
        com.ss.android.ugc.aweme.livewallpaper.a a2 = f.a(this, (a.AbstractC2787a) null);
        this.f108950e = a2;
        a2.a(this.f108949d);
        if (this.f108953h) {
            this.f108947b.setVisibility(8);
        }
        this.f108951f = f.a(h.f());
        a();
        r.a("enter_wallpaper_preview", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f108952g).f66730a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.livewallpaper.ui.LiveWallPaperPreviewActivity", "onCreate", false);
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
        if (i2 == 100 && f.a(this, getPackageName())) {
            Context applicationContext = getApplicationContext();
            if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(applicationContext).a(R.string.he_).a();
            f.a(this.f108949d.getId(), this.f108952g);
            f.a(0, "");
            finish();
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        this.f108950e.a(surfaceHolder, i3, i4);
    }
}
