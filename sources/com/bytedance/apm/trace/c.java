package com.bytedance.apm.trace;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.apm.agent.monitor.MonitorTool;
import com.bytedance.apm.agent.tracing.AutoPageTraceHelper;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.trace.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.d;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.lang.ref.WeakReference;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public long f25349a = -1;

    /* renamed from: b  reason: collision with root package name */
    public String f25350b;

    /* renamed from: c  reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f25351c;

    /* renamed from: d  reason: collision with root package name */
    public Runnable f25352d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f25353e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public long f25354f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f25355g;

    static {
        Covode.recordClassIndex(14749);
    }

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void b(Activity activity) {
    }

    @Override // com.bytedance.services.apm.api.d
    public final void l_() {
    }

    public final void a(long j2) {
        this.f25354f = j2;
        this.f25355g = true;
        ActivityLifeObserver.getInstance().register(this);
    }

    @Override // com.bytedance.services.apm.api.d
    public final void c(Activity activity) {
        this.f25349a = 0;
        try {
            if (this.f25351c != null) {
                activity.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.f25351c);
                this.f25351c = null;
            }
            Runnable runnable = this.f25352d;
            if (runnable != null) {
                this.f25353e.removeCallbacks(runnable);
                this.f25352d = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.services.apm.api.d
    public final void a(Activity activity, Bundle bundle) {
        if (!MainServiceImpl.createIMainServicebyMonsterPlugin(false).isMainPage(activity)) {
            int i2 = Build.VERSION.SDK_INT;
            if (this.f25355g) {
                try {
                    this.f25349a = System.currentTimeMillis();
                    String canonicalName = activity.getClass().getCanonicalName();
                    this.f25350b = canonicalName;
                    final Integer a2 = a.a(canonicalName);
                    if (a2 != null) {
                        final WeakReference weakReference = new WeakReference(activity.getWindow().getDecorView());
                        this.f25351c = new ViewTreeObserver.OnGlobalLayoutListener() {
                            /* class com.bytedance.apm.trace.c.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(14750);
                            }

                            public final void onGlobalLayout() {
                                View findViewById;
                                if (weakReference.get() != null && (findViewById = ((View) weakReference.get()).findViewById(a2.intValue())) != null && findViewById.getVisibility() == 0 && findViewById.getWidth() > 0) {
                                    ViewTreeObserver viewTreeObserver = ((View) weakReference.get()).getViewTreeObserver();
                                    if (viewTreeObserver.isAlive() && c.this.f25351c != null) {
                                        viewTreeObserver.removeOnGlobalLayoutListener(c.this.f25351c);
                                    }
                                    if (c.this.f25352d != null) {
                                        c.this.f25353e.removeCallbacks(c.this.f25352d);
                                        c.this.f25352d = null;
                                    }
                                    c.this.f25351c = null;
                                    if (c.this.f25349a > 0) {
                                        long currentTimeMillis = System.currentTimeMillis();
                                        long j2 = currentTimeMillis - c.this.f25349a;
                                        c.this.f25349a = 0;
                                        if (j2 < c.this.f25354f && j2 > 0) {
                                            AutoPageTraceHelper.reportViewIdStats(currentTimeMillis, c.this.f25350b);
                                            MonitorTool.reportTraceTime(c.this.f25350b, "activityOnCreateToViewShow", j2);
                                        }
                                    }
                                }
                            }
                        };
                        ((View) weakReference.get()).getViewTreeObserver().addOnGlobalLayoutListener(this.f25351c);
                        AnonymousClass2 r3 = new Runnable() {
                            /* class com.bytedance.apm.trace.c.AnonymousClass2 */

                            static {
                                Covode.recordClassIndex(14751);
                            }

                            public final void run() {
                                if (c.this.f25351c != null && weakReference.get() != null) {
                                    ((View) weakReference.get()).getViewTreeObserver().removeOnGlobalLayoutListener(c.this.f25351c);
                                }
                            }
                        };
                        this.f25352d = r3;
                        this.f25353e.postDelayed(r3, this.f25354f);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
