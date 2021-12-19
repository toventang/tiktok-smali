package com.ss.android.ugc.aweme.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.foundation.activity.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.l.b;
import com.zhiliaoapp.musically.R;

public class PushCameraBlurActivity extends a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f66493a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f66494b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f66495c;

    /* renamed from: d  reason: collision with root package name */
    private String f66496d;

    static {
        Covode.recordClassIndex(40869);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d
    public void onStart() {
        com.bytedance.helios.sdk.utils.a.a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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
        if (this.f66494b) {
            final RecordConfig build = new RecordConfig.Builder().showStickerPanel(true).shootWay("camera_blur").build();
            AVExternalServiceImpl.a().asyncService(this, "camera_blur", new SimpleServiceLoadCallback() {
                /* class com.ss.android.ugc.aweme.app.PushCameraBlurActivity.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(40873);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j2) {
                    asyncAVService.uiService().recordService().startRecord(PushCameraBlurActivity.this, build);
                    PushCameraBlurActivity.this.finish();
                }
            });
        } else if (this.f66495c && !j.a(this.f66496d)) {
            b bVar = new b();
            bVar.f128655i = new b.a() {
                /* class com.ss.android.ugc.aweme.app.PushCameraBlurActivity.AnonymousClass5 */

                static {
                    Covode.recordClassIndex(40874);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.l.b.a
                public final void a() {
                    PushCameraBlurActivity.this.finish();
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.l.b.a
                public final void b() {
                    PushCameraBlurActivity.this.finish();
                }
            };
            bVar.a(this.f66496d, this, "push");
        }
    }

    @Override // androidx.core.app.d, androidx.fragment.app.e, com.bytedance.ies.foundation.activity.a, androidx.appcompat.app.d, com.bytedance.ies.powerpage.a
    public void onCreate(Bundle bundle) {
        com.bytedance.helios.sdk.utils.a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", true);
        activityConfiguration(ae.f66556a);
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f66493a = intent.getBooleanExtra("show_dialog", false);
        this.f66494b = intent.getBooleanExtra("show_effect", false);
        this.f66495c = intent.getBooleanExtra("show_duet", false);
        String a2 = a(intent, "aid");
        this.f66496d = a2;
        if (a2 == null) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
            return;
        }
        if (this.f66493a) {
            setContentView(R.layout.c5);
            Dialog b2 = new a.C0731a(this).a(R.string.dmh).b(R.string.dmf).b(R.string.c5x, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.ugc.aweme.app.PushCameraBlurActivity.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(40871);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    PushCameraBlurActivity.this.finish();
                }
            }, false).a(R.string.ss, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                /* class com.ss.android.ugc.aweme.app.PushCameraBlurActivity.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(40870);
                }

                public final void onClick(DialogInterface dialogInterface, int i2) {
                    PushCameraBlurActivity.this.a();
                    dialogInterface.dismiss();
                }
            }, false).a().b();
            b2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                /* class com.ss.android.ugc.aweme.app.PushCameraBlurActivity.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(40872);
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    PushCameraBlurActivity.this.finish();
                }
            });
            b2.setCanceledOnTouchOutside(true);
            b2.show();
        } else {
            a();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.app.PushCameraBlurActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
