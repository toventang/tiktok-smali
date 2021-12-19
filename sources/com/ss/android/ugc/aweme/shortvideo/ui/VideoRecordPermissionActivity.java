package com.ss.android.ugc.aweme.shortvideo.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.df.s;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.experiment.gt;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.port.in.bb;
import com.ss.android.ugc.aweme.port.in.k;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.eq;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.b;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.d;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.e;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.g;
import com.ss.android.ugc.aweme.shortvideo.util.ToolSafeHandler;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.ss.android.ugc.aweme.ttep.ac;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.tools.d.a.c;
import com.ss.android.ugc.tools.view.widget.k;
import com.zhiliaoapp.musically.R;
import java.util.List;

public class VideoRecordPermissionActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    ToolSafeHandler f131241a = new ToolSafeHandler(this);

    /* renamed from: b  reason: collision with root package name */
    boolean f131242b = gs.a();

    /* renamed from: c  reason: collision with root package name */
    boolean f131243c = gt.a();

    /* renamed from: d  reason: collision with root package name */
    private Runnable f131244d = null;

    static {
        Covode.recordClassIndex(85975);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onResume() {
        com.bytedance.helios.sdk.utils.a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    private void c() {
        if (this.f131242b || this.f131243c) {
            d();
        } else {
            e();
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onDestroy() {
        com.bytedance.helios.sdk.utils.a.e(this);
        super.onDestroy();
        c.a(this);
    }

    public void onEnterAnimationComplete() {
        super.onEnterAnimationComplete();
        Runnable runnable = this.f131244d;
        if (runnable != null) {
            runnable.run();
            this.f131244d = null;
        }
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a
    public void onPause() {
        com.bytedance.helios.sdk.utils.a.c(this);
        super.onPause();
        aa.f131372a = getClass();
    }

    static void a() {
        gr.a("camera_error", "1");
    }

    private void d() {
        Intent intent = getIntent();
        String[] a2 = e.a(intent);
        if (f.a(a2)) {
            this.f131241a.a(new gf(this));
        } else if (ac.a(intent) || !this.f131243c) {
            b(a2);
        } else {
            a(a2);
        }
    }

    private void e() {
        com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.a a2 = com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.c.a(getIntent());
        if (a2.a(this)) {
            this.f131241a.a(new gv(this));
        } else if (com.ss.android.ugc.aweme.port.in.c.D.c().a()) {
            dmt.av.video.e.a.a(this);
            a2.a(this, new gw(this));
        } else {
            this.f131241a.a(new gh(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        Dialog b2 = new a.C0731a(this).b(R.string.v_).b(R.string.va, (DialogInterface.OnClickListener) new gk(this), false).a(R.string.asi, (DialogInterface.OnClickListener) new gl(this), false).a().b();
        b2.setOnCancelListener(new gm(this));
        k.a(b2);
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

    private static Context a(VideoRecordPermissionActivity videoRecordPermissionActivity) {
        Context applicationContext = videoRecordPermissionActivity.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public static boolean b(Intent intent) {
        if (intent == null || !intent.getBooleanExtra("enter_record_from_other_platform", false)) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.powerpage.b, com.bytedance.ies.powerpage.a
    public void onNewIntent(Intent intent) {
        c.a(this, intent, (Bundle) null);
        if (b(intent)) {
            c();
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        getIntent();
        c.a(this, bundle);
    }

    private void b(String[] strArr) {
        g.a(this, strArr, g.a(this), new gr(this), gs.f131832a, new gt(this));
    }

    private void a(String[] strArr) {
        d dVar = new d(this);
        dVar.f131866c = new gg(this, strArr, dVar);
        dVar.f131867d = new gp(this, strArr);
        b.c(f.b(strArr), this);
        dVar.show();
        this.f131244d = new gq(this, strArr, dVar);
        com.ss.android.ugc.aweme.j.a.a(this, 7);
    }

    public static boolean a(Intent intent) {
        if (intent == null || !"main".equals(a(intent, "from"))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(final boolean z) {
        com.ss.android.ugc.aweme.port.in.c.H.a(new bb.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity.AnonymousClass1 */

            static {
                Covode.recordClassIndex(85976);
            }

            @Override // com.ss.android.ugc.aweme.port.in.bb.a
            public final void onSuccess() {
                VideoRecordPermissionActivity videoRecordPermissionActivity = VideoRecordPermissionActivity.this;
                boolean z = z;
                b.a.f132249a.step("av_video_record_init", "startVideoRecordActivity");
                if (!videoRecordPermissionActivity.isFinishing() && !videoRecordPermissionActivity.isDestroyed()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (!videoRecordPermissionActivity.isDestroyed()) {
                        s.b(gi.f131818a);
                        com.ss.android.ugc.aweme.port.in.c.a(eq.a());
                        com.ss.android.ugc.aweme.shortvideo.util.f.a(videoRecordPermissionActivity, videoRecordPermissionActivity.getIntent(), new gj(videoRecordPermissionActivity, z));
                        return;
                    }
                }
                gr.a("camera_error", "2");
            }
        });
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", true);
        super.onCreate(bundle);
        b.a.f132249a.start("av_video_record_init", "startToolPermissionActivity");
        c.a(this, getIntent(), bundle);
        com.ss.android.ugc.aweme.utils.d.a("tools_performance_permission", new com.ss.android.ugc.tools.f.b().a("scene", "permission_enter").f149193a);
        com.ss.android.ugc.aweme.port.in.c.b();
        boolean booleanExtra = getIntent().getBooleanExtra("enter_record_directly_from_system", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("recreate_record_activity_support", false);
        if (booleanExtra) {
            gr.a("camera_error", "2", "recording");
            finish();
        } else {
            com.ss.android.ugc.aweme.port.in.k kVar = k.a.f115657a;
            kVar.a();
            if (kVar.f115648a) {
                new com.ss.android.ugc.aweme.tux.a.i.a(a(this)).a(R.string.fam).a();
                gr.a("camera_error", "2", "living");
                finish();
            } else if (b(getIntent()) && com.ss.android.ugc.aweme.port.in.c.a()) {
                gr.a("camera_error", "2", "recording");
                finish();
            } else if (a(getIntent()) || b(getIntent()) || !com.ss.android.ugc.aweme.port.in.c.a() || booleanExtra2) {
                if (com.ss.android.ugc.aweme.port.in.g.a().o().c()) {
                    if (StoryPublishServiceImpl.a().isStoryPublishing()) {
                        AVExternalServiceImpl.a().storyService().showPublishingToast(this);
                        q.a("record", new ar().a("event", "isPublishing").a());
                        gr.a("camera_error", "2", "publishing");
                        finish();
                    }
                } else if (StoryPublishServiceImpl.a().isPublishing(this)) {
                    AVExternalServiceImpl.a().storyService().showPublishingToast(this);
                    q.a("record", new ar().a("event", "isPublishing").a());
                    gr.a("camera_error", "2", "publishing");
                    finish();
                }
                c();
            } else {
                com.ss.android.ugc.tools.utils.q.a("Recording status:" + com.ss.android.ugc.aweme.port.in.c.b() + " recreatedSupport: " + booleanExtra2);
                q.a("record", new ar().a("event", "isRecording").a("user_info", com.ss.android.ugc.aweme.port.in.c.b()).a());
                z zVar = com.ss.android.ugc.aweme.port.in.c.u;
                if (zVar == null || zVar.e() == null || !zVar.e().l()) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(a(this)).a(R.string.c0q).a();
                    gr.a("camera_error", "2", "recording");
                } else {
                    new com.ss.android.ugc.aweme.tux.a.i.a(a(this)).a(R.string.fam).a();
                    gr.a("camera_error", "2", "recording");
                }
                finish();
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordPermissionActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z a(boolean z, List list) {
        Intent intent = getIntent();
        if (!z) {
            intent.putExtra("translation_type", 1);
        }
        com.ss.android.ugc.aweme.shortvideo.util.f.a(this, getIntent(), list);
        finish();
        return h.z.f158842a;
    }

    /* access modifiers changed from: package-private */
    public final void a(String[] strArr, d dVar) {
        com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.b.a(strArr, this);
        com.ss.android.ugc.aweme.port.in.c.C.b().a(this, new gu(this, dVar), strArr);
    }
}
