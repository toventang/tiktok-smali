package com.ss.android.ugc.aweme.download.component_api.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ce.b;
import com.ss.android.ugc.aweme.download.component_api.b.c;
import com.ss.android.ugc.aweme.download.component_api.c.d;
import java.lang.ref.WeakReference;

public class DownloadDelegateActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    protected Intent f83089a;

    static {
        Covode.recordClassIndex(51793);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        a.e(this);
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        a.c(this);
        super.onPause();
    }

    public void onResume() {
        a.b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        a.a(this);
        super.onStart();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: protected */
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

    public static void a(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    public void onCreate(Bundle bundle) {
        a.a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", true);
        super.onCreate(bundle);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
        Intent intent = getIntent();
        this.f83089a = intent;
        if (intent != null) {
            if (intent.getIntExtra(StringSet.type, 0) != 1) {
                a(this);
            } else {
                final String a2 = a(this.f83089a, "permission_id_key");
                String[] stringArrayExtra = this.f83089a.getStringArrayExtra("permission_content_key");
                if (stringArrayExtra == null || stringArrayExtra.length <= 0) {
                    a(this);
                } else {
                    final AnonymousClass1 r2 = new c() {
                        /* class com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity.AnonymousClass1 */

                        /* renamed from: c  reason: collision with root package name */
                        private WeakReference<Activity> f83092c;

                        static {
                            Covode.recordClassIndex(51794);
                        }

                        @Override // com.ss.android.ugc.aweme.download.component_api.b.c
                        public final void a() {
                            d.a a2;
                            String str = a2;
                            if (!TextUtils.isEmpty(str) && (a2 = d.a(str)) != null) {
                                a2.a();
                            }
                            DownloadDelegateActivity.a(this.f83092c.get());
                        }

                        @Override // com.ss.android.ugc.aweme.download.component_api.b.c
                        public final void b() {
                            String str = a2;
                            if (!TextUtils.isEmpty(str)) {
                                d.a(str);
                            }
                            DownloadDelegateActivity.a(this.f83092c.get());
                        }

                        {
                            this.f83092c = new WeakReference<>(DownloadDelegateActivity.this);
                        }
                    };
                    if (Build.VERSION.SDK_INT >= 23) {
                        try {
                            b.a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new b.AbstractC1579b() {
                                /* class com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity.AnonymousClass2 */

                                static {
                                    Covode.recordClassIndex(51795);
                                }

                                @Override // com.ss.android.ugc.aweme.ce.b.AbstractC1579b
                                public final void a(String[] strArr, int[] iArr) {
                                    if (iArr.length <= 0 || iArr[0] != 0) {
                                        r2.b();
                                    } else {
                                        r2.a();
                                    }
                                }
                            });
                        } catch (Exception unused) {
                        }
                    }
                    r2.a();
                }
            }
            this.f83089a = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.download.component_api.activity.DownloadDelegateActivity", "onCreate", false);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
