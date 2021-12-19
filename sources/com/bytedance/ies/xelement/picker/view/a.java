package com.bytedance.ies.xelement.picker.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.picker.e.e;
import com.zhiliaoapp.musically.R;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public ViewGroup f37294a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f37295b;

    /* renamed from: c  reason: collision with root package name */
    public e f37296c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f37297d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f37298e;

    /* renamed from: f  reason: collision with root package name */
    protected int f37299f = 80;

    /* renamed from: g  reason: collision with root package name */
    public Dialog f37300g;

    /* renamed from: h  reason: collision with root package name */
    protected View f37301h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f37302i;

    /* renamed from: j  reason: collision with root package name */
    private Context f37303j;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f37304k;

    /* renamed from: l  reason: collision with root package name */
    private Animation f37305l;

    /* renamed from: m  reason: collision with root package name */
    private Animation f37306m;
    private boolean n = true;
    private View.OnKeyListener o = new View.OnKeyListener() {
        /* class com.bytedance.ies.xelement.picker.view.a.AnonymousClass4 */

        static {
            Covode.recordClassIndex(22428);
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (i2 != 4 || keyEvent.getAction() != 0 || !a.this.d()) {
                return false;
            }
            a.this.e();
            return true;
        }
    };
    private final View.OnTouchListener p = new View.OnTouchListener() {
        /* class com.bytedance.ies.xelement.picker.view.a.AnonymousClass5 */

        static {
            Covode.recordClassIndex(22429);
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return false;
            }
            a.this.e();
            return false;
        }
    };

    static {
        Covode.recordClassIndex(22424);
    }

    /* access modifiers changed from: protected */
    public abstract com.bytedance.ies.xelement.picker.c.a a();

    public boolean h() {
        return false;
    }

    public final void f() {
        a().f37259d.post(new Runnable() {
            /* class com.bytedance.ies.xelement.picker.view.a.AnonymousClass3 */

            static {
                Covode.recordClassIndex(22427);
            }

            public final void run() {
                MethodCollector.i(7773);
                a.this.a().f37259d.removeView(a.this.f37295b);
                a.this.f37298e = false;
                a.this.f37297d = false;
                if (a.this.f37296c != null) {
                    a.this.f37296c.a();
                }
                MethodCollector.o(7773);
            }
        });
    }

    public final void g() {
        Dialog dialog = this.f37300g;
        if (dialog != null) {
            dialog.setCancelable(a().x);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.f37306m = AnimationUtils.loadAnimation(this.f37303j, com.bytedance.ies.xelement.picker.g.a.a(this.f37299f, true));
        this.f37305l = AnimationUtils.loadAnimation(this.f37303j, com.bytedance.ies.xelement.picker.g.a.a(this.f37299f, false));
    }

    public final boolean d() {
        if (h()) {
            return false;
        }
        if (this.f37295b.getParent() != null || this.f37298e) {
            return true;
        }
        return false;
    }

    public final void e() {
        if (h()) {
            Dialog dialog = this.f37300g;
            if (dialog != null) {
                dialog.dismiss();
            }
        } else if (!this.f37297d) {
            if (this.n) {
                this.f37305l.setAnimationListener(new Animation.AnimationListener() {
                    /* class com.bytedance.ies.xelement.picker.view.a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(22426);
                    }

                    public final void onAnimationRepeat(Animation animation) {
                    }

                    public final void onAnimationStart(Animation animation) {
                    }

                    public final void onAnimationEnd(Animation animation) {
                        a.this.f();
                    }
                });
                this.f37294a.startAnimation(this.f37305l);
            } else {
                f();
            }
            this.f37297d = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        ViewGroup viewGroup;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater from = LayoutInflater.from(this.f37303j);
        if (h()) {
            ViewGroup viewGroup2 = (ViewGroup) com.a.a(from, R.layout.ak5, null, false);
            this.f37304k = viewGroup2;
            viewGroup2.setBackgroundColor(0);
            this.f37294a = (ViewGroup) this.f37304k.findViewById(R.id.adx);
            layoutParams.leftMargin = 30;
            layoutParams.rightMargin = 30;
            this.f37294a.setLayoutParams(layoutParams);
            if (this.f37304k != null) {
                Dialog dialog = new Dialog(this.f37303j, R.style.w8);
                this.f37300g = dialog;
                dialog.setCancelable(a().x);
                this.f37300g.setContentView(this.f37304k);
                Window window = this.f37300g.getWindow();
                if (window != null) {
                    window.setWindowAnimations(R.style.zp);
                    window.setGravity(17);
                }
                this.f37300g.setOnDismissListener(new DialogInterface.OnDismissListener() {
                    /* class com.bytedance.ies.xelement.picker.view.a.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(22430);
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        if (a.this.f37296c != null) {
                            a.this.f37296c.a();
                        }
                    }
                });
            }
        } else {
            if (a().f37259d == null) {
                a().f37259d = (ViewGroup) ((Activity) this.f37303j).getWindow().getDecorView();
            }
            ViewGroup viewGroup3 = (ViewGroup) com.a.a(from, R.layout.ak5, a().f37259d, false);
            this.f37295b = viewGroup3;
            viewGroup3.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            if (a().u != -1) {
                this.f37295b.setBackgroundColor(a().u);
            }
            ViewGroup viewGroup4 = (ViewGroup) this.f37295b.findViewById(R.id.adx);
            this.f37294a = viewGroup4;
            viewGroup4.setLayoutParams(layoutParams);
        }
        if (h()) {
            viewGroup = this.f37304k;
        } else {
            viewGroup = this.f37295b;
        }
        viewGroup.setFocusable(true);
        viewGroup.setFocusableInTouchMode(true);
        viewGroup.setOnKeyListener(this.o);
        this.f37296c = new e() {
            /* class com.bytedance.ies.xelement.picker.view.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(22425);
            }

            @Override // com.bytedance.ies.xelement.picker.e.e
            public final void a() {
                if (!a.this.f37302i && a.this.a().f37256a != null) {
                    a.this.a().f37256a.a();
                }
            }
        };
    }

    public final View a(int i2) {
        return this.f37294a.findViewById(i2);
    }

    public a(Context context) {
        this.f37303j = context;
    }

    /* access modifiers changed from: protected */
    public final a a(boolean z) {
        ViewGroup viewGroup = this.f37295b;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.d0z);
            if (z) {
                findViewById.setOnTouchListener(this.p);
            } else {
                findViewById.setOnTouchListener(null);
            }
        }
        return this;
    }

    public final void a(View view) {
        Dialog dialog;
        if (h() && (dialog = this.f37300g) != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            this.f37294a.setLayoutParams(layoutParams);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.zq);
                window.setGravity(80);
                window.setDimAmount(0.3f);
            }
        }
        this.f37301h = view;
        if (h()) {
            Dialog dialog2 = this.f37300g;
            if (dialog2 != null) {
                dialog2.show();
                WindowManager.LayoutParams attributes = this.f37300g.getWindow().getAttributes();
                attributes.width = -1;
                this.f37300g.getWindow().setAttributes(attributes);
            }
        } else if (!d()) {
            this.f37298e = true;
            a().f37259d.addView(this.f37295b);
            if (this.n) {
                this.f37294a.startAnimation(this.f37306m);
            }
            this.f37295b.requestFocus();
        }
    }
}
