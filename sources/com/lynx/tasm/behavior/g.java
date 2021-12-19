package com.lynx.tasm.behavior;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.core.a;
import com.lynx.tasm.utils.m;
import java.lang.ref.WeakReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<j> f55874a;

    /* renamed from: b  reason: collision with root package name */
    public float f55875b;

    /* renamed from: c  reason: collision with root package name */
    public i f55876c;

    /* renamed from: d  reason: collision with root package name */
    public int f55877d;

    /* renamed from: e  reason: collision with root package name */
    public int f55878e;

    /* renamed from: f  reason: collision with root package name */
    public Rect f55879f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public int f55880g;

    /* renamed from: h  reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f55881h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f55882i;

    static {
        Covode.recordClassIndex(34936);
    }

    public final void c() {
        if (this.f55882i) {
            if (!m.a()) {
                m.a(new Runnable() {
                    /* class com.lynx.tasm.behavior.g.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(34940);
                    }

                    public final void run() {
                        g.this.d();
                    }
                });
            } else {
                d();
            }
            this.f55882i = false;
        }
    }

    public final void d() {
        i iVar;
        j jVar = this.f55874a.get();
        if (jVar == null) {
            LLog.a(3, "Lynx", "The LynxView to which KeyboardEvent belongs has stopped");
            return;
        }
        LLog.a("Lynx", "KeyboardEvent for LynxView " + jVar.hashCode() + "stopping");
        try {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f55881h;
            if (onGlobalLayoutListener != null && (iVar = this.f55876c) != null) {
                iVar.b(onGlobalLayoutListener);
                this.f55876c.c();
            }
        } catch (Exception unused) {
        }
    }

    public final void a() {
        j jVar = this.f55874a.get();
        if (jVar == null) {
            LLog.a(3, "Lynx", "KeyboardEvent can not start because context has been freed");
        } else if (this.f55882i) {
            LLog.a("Lynx", "KeyboardEvent for LynxView " + jVar.hashCode() + "already started");
        } else {
            if (!m.a()) {
                m.a(new Runnable() {
                    /* class com.lynx.tasm.behavior.g.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34937);
                    }

                    public final void run() {
                        g.this.b();
                    }
                });
            } else {
                b();
            }
            this.f55882i = true;
        }
    }

    public final void b() {
        j jVar = this.f55874a.get();
        if (jVar == null) {
            LLog.a(3, "Lynx", "KeyboardEvent can not start because context has been freed");
            return;
        }
        LLog.a("Lynx", "KeyboardEvent for LynxView " + jVar.hashCode() + "starting");
        if (this.f55876c == null) {
            this.f55876c = new i(jVar.a());
        }
        final View decorView = ((Activity) jVar.a()).getWindow().getDecorView();
        AnonymousClass2 r1 = new ViewTreeObserver.OnGlobalLayoutListener() {
            /* class com.lynx.tasm.behavior.g.AnonymousClass2 */

            static {
                Covode.recordClassIndex(34938);
            }

            public final void onGlobalLayout() {
                LLog.a(3, "Lynx", "onGlobalLayout invoked.");
                a.a().execute(new Runnable() {
                    /* class com.lynx.tasm.behavior.g.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(34939);
                    }

                    public final void run() {
                        boolean z;
                        int i2;
                        String str;
                        try {
                            g.this.f55876c.getWindow().getDecorView().getWindowVisibleDisplayFrame(g.this.f55879f);
                            int i3 = g.this.f55879f.bottom - g.this.f55879f.top;
                            if (g.this.f55877d == 0) {
                                g.this.f55877d = decorView.getHeight();
                            }
                            if (g.this.f55878e == 0) {
                                g.this.f55878e = g.this.f55876c.getWindow().getDecorView().getHeight();
                            }
                            int i4 = g.this.f55877d;
                            int i5 = g.this.f55878e;
                            double d2 = (double) i3;
                            double d3 = (double) i4;
                            Double.isNaN(d2);
                            Double.isNaN(d3);
                            double d4 = d2 / d3;
                            if (d4 < 0.4d) {
                                g.this.f55876c.getWindow().getDecorView().requestLayout();
                                return;
                            }
                            int i6 = 0;
                            if (d4 < 0.8d) {
                                z = true;
                                i6 = (int) (((float) (i4 - i3)) / g.this.f55875b);
                                i2 = (int) (((float) (i5 - i3)) / g.this.f55875b);
                            } else {
                                z = false;
                                i2 = 0;
                            }
                            LLog.a("Lynx", "KeyboardEvent visible = " + z + ", height = " + i6 + ", compatHeight = " + i2);
                            if (i6 != g.this.f55880g) {
                                j jVar = g.this.f55874a.get();
                                if (!(jVar == null || jVar.f55897e == null)) {
                                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                                    if (z) {
                                        str = "on";
                                    } else {
                                        str = "off";
                                    }
                                    javaOnlyArray.pushString(str);
                                    javaOnlyArray.pushInt(i6);
                                    javaOnlyArray.pushInt(i2);
                                    jVar.a("keyboardstatuschanged", javaOnlyArray);
                                }
                                g.this.f55880g = i6;
                            }
                        } catch (Exception e2) {
                            LLog.d("Lynx", e2.getMessage());
                        }
                    }
                });
            }
        };
        this.f55881h = r1;
        this.f55876c.a(r1);
        this.f55876c.b();
    }

    public g(j jVar) {
        LLog.a("Lynx", "KeyboardEvent initialized.");
        this.f55874a = new WeakReference<>(jVar);
        this.f55875b = jVar.a().getResources().getDisplayMetrics().density;
    }
}
