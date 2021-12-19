package com.ss.android.ad.splash.core;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.core.e.c;
import com.ss.android.ad.splash.core.e.f;
import com.ss.android.ad.splash.core.e.m;
import com.ss.android.ad.splash.core.g.a;
import com.ss.android.ad.splash.core.g.b;
import com.ss.android.ad.splash.core.i.c;
import com.ss.android.ad.splash.core.j.d;
import com.ss.android.ad.splash.core.j.e;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.g;
import com.ss.android.ad.splash.f.i;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ad.splash.f.o;
import com.ss.android.ad.splash.f.q;
import com.ss.android.ad.splash.p;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends RelativeLayout implements i, q.a {
    public q A = new q(this);
    public int B = 0;
    public int C = 1;
    AlphaAnimation D;
    GestureDetector E;
    GestureDetector F;
    GestureDetector.SimpleOnGestureListener G;
    a H;
    public AnimatorSet I;
    public ValueAnimator J;
    b K;
    public g L;
    public boolean M = false;
    public boolean N = false;
    private final long O = 300;
    private LinearLayout P;
    private ViewStub Q;
    private BDASplashImageView R;
    private RelativeLayout S;
    private ImageView T;
    private TextView U;
    private com.ss.android.ad.splash.core.j.a V;
    private long W = System.currentTimeMillis();

    /* renamed from: a  reason: collision with root package name */
    RelativeLayout f58350a;
    private boolean aa;
    private String ab;
    private String ac;
    private Timer ad;
    private Space ae;
    private boolean af = true;
    private boolean ag = false;

    /* renamed from: b  reason: collision with root package name */
    public FrameLayout f58351b;

    /* renamed from: c  reason: collision with root package name */
    Space f58352c;

    /* renamed from: d  reason: collision with root package name */
    public ImageView f58353d;

    /* renamed from: e  reason: collision with root package name */
    public TextView f58354e;

    /* renamed from: f  reason: collision with root package name */
    public BDASplashVideoView f58355f;

    /* renamed from: g  reason: collision with root package name */
    public RelativeLayout f58356g;

    /* renamed from: h  reason: collision with root package name */
    TextView f58357h;

    /* renamed from: i  reason: collision with root package name */
    public LinearLayout f58358i;

    /* renamed from: j  reason: collision with root package name */
    public FrameLayout f58359j;

    /* renamed from: k  reason: collision with root package name */
    TextView f58360k;

    /* renamed from: l  reason: collision with root package name */
    public com.ss.android.ad.splash.core.j.c f58361l;

    /* renamed from: m  reason: collision with root package name */
    public d f58362m;
    public ImageView n;
    com.ss.android.ad.splash.core.j.b o;
    public TextView p;
    public View q;
    View r;
    public boolean s;
    long t;
    public int u = -1;
    boolean v;
    public boolean w = true;
    public boolean x;
    public com.ss.android.ad.splash.core.e.b y;
    public p z;

    static {
        Covode.recordClassIndex(36238);
    }

    public final boolean a(MotionEvent motionEvent) {
        a aVar;
        b bVar = this.K;
        if (bVar != null && bVar.a()) {
            int action = motionEvent.getAction();
            if (action == 0) {
                bVar.f58563f.set(motionEvent.getX(), motionEvent.getY());
            } else if (action == 1 || action == 3) {
                float x2 = motionEvent.getX() - bVar.f58563f.x;
                float y2 = motionEvent.getY() - bVar.f58563f.y;
                if (Math.abs(x2) <= Math.abs(y2) && y2 < 0.0f && Math.abs(y2) >= ((float) bVar.f58564g)) {
                    bVar.f58562e.a();
                    return true;
                }
            }
        }
        GestureDetector gestureDetector = this.F;
        if (gestureDetector != null && gestureDetector.onTouchEvent(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() != 1 || (aVar = this.H) == null || !aVar.a(motionEvent)) {
            return this.M;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(final com.ss.android.ad.splash.core.e.b bVar) {
        if (bVar.g()) {
            ViewGroup.LayoutParams layoutParams = this.f58352c.getLayoutParams();
            layoutParams.height = j.a();
            this.f58352c.setLayoutParams(layoutParams);
            this.f58352c.setVisibility(4);
            this.f58353d.setVisibility(8);
        } else {
            this.f58352c.setVisibility(8);
            this.f58353d.setVisibility(0);
        }
        f fVar = bVar.f58438a;
        String b2 = j.b(fVar);
        if (l.a(b2) || h.f58576e == null) {
            return false;
        }
        AnonymousClass15 r12 = new p() {
            /* class com.ss.android.ad.splash.core.c.AnonymousClass15 */

            static {
                Covode.recordClassIndex(36245);
            }

            @Override // com.ss.android.ad.splash.p
            public final void c() {
                c.this.a();
                c.this.z.a();
            }

            @Override // com.ss.android.ad.splash.p
            public final void a() {
                c.this.b(1);
                c cVar = c.this;
                cVar.a(cVar.y.c());
            }

            @Override // com.ss.android.ad.splash.p
            public final void b() {
                if (h.a().p) {
                    c.this.a(false);
                    return;
                }
                c.this.a();
                c.this.z.a(bVar);
            }
        };
        if (TextUtils.isEmpty(fVar.f58481e)) {
            h.f58576e.a(this.R, b2, bVar.f58450m, r12);
        } else {
            h.f58576e.a(this.R, b2, bVar.f58450m, fVar.f58481e, r12);
        }
        try {
            if (bVar.q == 0 || bVar.q == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f58440c));
                String str = "not_real_time";
                if (bVar.C) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (h.X != -1) {
                    jSONObject.put("awemelaunch", h.X == 1 ? 1 : 2);
                }
                jSONObject.put("ad_sequence", v.a().p());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.put("is_ad_event", "1");
                if (!l.a(bVar.f58447j)) {
                    jSONObject2.put("log_extra", bVar.f58447j);
                }
                jSONObject2.put("ad_fetch_time", bVar.f58439b);
                h.a(bVar.f58441d, "splash_ad", "show", jSONObject2);
                c.a aVar = new c.a();
                aVar.f58598a = j.a((com.ss.android.ad.splash.c.a) bVar);
                com.ss.android.ad.splash.core.i.c a2 = aVar.a();
                if (h.a().f58910b) {
                    h.g().a(null, "show", bVar.f58441d, bVar.x, bVar.f58447j, true, -1, null, a2);
                } else {
                    h.g().a(null, bVar.f58441d, bVar.x, bVar.f58447j, true, -1, null, a2);
                }
            }
            this.R.f58292a = bVar;
            this.R.setInteraction(this.z);
            this.R.setVisibility(0);
            return true;
        } catch (Exception unused) {
            a();
            this.z.a();
            return false;
        }
    }

    public final void a(com.ss.android.ad.splash.core.e.b bVar, float f2, float f3, boolean z2) {
        a(bVar, f2, f3, z2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r4 == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r0.e() != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r4) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.c.a(boolean):void");
    }

    public final void a(com.ss.android.ad.splash.core.e.b bVar, float f2, float f3) {
        com.ss.android.ad.splash.f.a.a(bVar.f58441d, "click ad");
        String str = this.s ? "click_normal_area" : "";
        c.a aVar = new c.a();
        aVar.f58461a = 0;
        c.a a2 = aVar.a((int) f2, (int) f3);
        a2.f58464d = this.s;
        a2.f58463c = str;
        if (this.z.a(bVar, a2.a())) {
            a();
        }
    }

    public final void a(com.ss.android.ad.splash.core.e.b bVar, float f2, float f3, boolean z2, String str) {
        com.ss.android.ad.splash.f.a.a(bVar.f58441d, "click ad");
        c.a aVar = new c.a();
        aVar.f58462b = z2;
        c.a a2 = aVar.a((int) f2, (int) f3);
        if (!TextUtils.isEmpty(str)) {
            a2.f58469i = str;
        }
        if (this.v) {
            a2.f58467g = this.C;
            com.ss.android.ad.splash.core.j.c cVar = this.f58361l;
            if (!(cVar == null || cVar.getBDAVideoController() == null)) {
                a2.f58468h = (long) this.f58361l.getBDAVideoController().f();
            }
        }
        if (this.z.b(bVar, a2.a())) {
            a();
            this.u = 1;
            if (this.L != null) {
                i();
            }
            com.ss.android.ad.splash.core.j.c cVar2 = this.f58361l;
            if (cVar2 != null && cVar2.getBDAVideoController() != null) {
                this.f58361l.setBreakReason(this.u);
                this.f58361l.getBDAVideoController().b();
            }
        }
    }

    public final boolean d() {
        if (this.B > 1) {
            return true;
        }
        return false;
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        this.f58358i.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            /* class com.ss.android.ad.splash.core.c.AnonymousClass9 */

            /* renamed from: b  reason: collision with root package name */
            private int f58409b;

            static {
                Covode.recordClassIndex(36270);
            }

            private void a(int i2) {
                m mVar = c.this.y.L;
                boolean z = true;
                if (mVar == null || !mVar.a(1)) {
                    z = false;
                }
                if (!h.a().q || !z) {
                    c.this.f58358i.setTranslationY(c.this.f58358i.getTranslationY() + ((float) i2));
                } else {
                    a(c.this.f58353d, i2);
                    a(c.this.f58354e, i2);
                    c.this.f58359j.setPadding(c.this.f58359j.getPaddingLeft(), c.this.f58359j.getPaddingTop() + i2, c.this.f58359j.getPaddingRight(), c.this.f58359j.getPaddingBottom());
                }
                c.this.f58358i.removeOnLayoutChangeListener(this);
            }

            private static void a(View view, int i2) {
                if (view.getVisibility() == 0) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.topMargin += i2;
                    view.setLayoutParams(marginLayoutParams);
                }
            }

            /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Context context;
                boolean contains;
                boolean b2;
                int a2;
                if (c.this.f58358i != null) {
                    this.f58409b++;
                    int[] iArr = {0, 0};
                    c.this.f58358i.getLocationOnScreen(iArr);
                    int i10 = iArr[1];
                    int paddingTop = c.this.f58358i.getPaddingTop();
                    LinearLayout linearLayout = c.this.f58358i;
                    if (linearLayout == null || (context = linearLayout.getContext()) == null) {
                        a2 = 0;
                    } else {
                        String lowerCase = Build.BRAND.toLowerCase();
                        switch (lowerCase.hashCode()) {
                            case -1206476313:
                                if (lowerCase.equals("huawei")) {
                                    if (com.ss.android.ad.splash.f.c.f58946b == null) {
                                        com.ss.android.ad.splash.f.c.f58946b = Arrays.asList("GLK-AL00");
                                    }
                                    contains = com.ss.android.ad.splash.f.c.f58946b.contains(Build.MODEL);
                                    break;
                                }
                                contains = false;
                                break;
                            case -759499589:
                                if (lowerCase.equals("xiaomi")) {
                                }
                                contains = false;
                                break;
                            case 3418016:
                                if (lowerCase.equals("oppo")) {
                                }
                                contains = false;
                                break;
                            case 3620012:
                                if (lowerCase.equals("vivo")) {
                                }
                                contains = false;
                                break;
                            case 97536331:
                                if (lowerCase.equals("flyme")) {
                                }
                                contains = false;
                                break;
                            default:
                                contains = false;
                                break;
                        }
                        if (contains) {
                            b2 = true;
                        } else if (com.ss.android.ad.splash.f.c.a("huawei") || com.ss.android.ad.splash.f.c.a("honor")) {
                            b2 = com.ss.android.ad.splash.f.c.b(linearLayout);
                        } else if (com.ss.android.ad.splash.f.c.a("oppo")) {
                            b2 = linearLayout.getContext().getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
                        } else if (com.ss.android.ad.splash.f.c.a("vivo")) {
                            b2 = com.ss.android.ad.splash.f.c.c(linearLayout);
                        } else if (com.ss.android.ad.splash.f.c.a("xiaomi")) {
                            b2 = com.ss.android.ad.splash.f.c.d(linearLayout);
                        } else if (com.ss.android.ad.splash.f.c.a("flyme")) {
                            b2 = com.ss.android.ad.splash.f.c.e(linearLayout);
                        } else if (Build.VERSION.SDK_INT >= 28) {
                            b2 = com.ss.android.ad.splash.f.c.f(linearLayout);
                        } else {
                            b2 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(b2);
                        com.ss.android.ad.splash.f.c.f58945a = valueOf;
                        if (valueOf.booleanValue()) {
                            com.ss.android.ad.splash.f.g.b("has notch");
                            if (Build.VERSION.SDK_INT >= 28) {
                                Activity i11 = com.ss.android.ad.splash.f.c.i(linearLayout);
                                if (i11 == null) {
                                    com.ss.android.ad.splash.f.g.b("failed to get activity");
                                } else {
                                    int i12 = i11.getWindow().getAttributes().layoutInDisplayCutoutMode;
                                    if (i12 == 2) {
                                        com.ss.android.ad.splash.f.g.b("layout mode never");
                                    } else if (i12 == 1) {
                                        com.ss.android.ad.splash.f.g.b("layout mode short edges");
                                        if (com.ss.android.ad.splash.f.c.g(linearLayout) || com.ss.android.ad.splash.f.c.h(linearLayout)) {
                                            a2 = com.ss.android.ad.splash.f.c.a(linearLayout);
                                            if (com.ss.android.ad.splash.f.c.f58945a.booleanValue() && a2 == 0 && i10 == 0) {
                                                a2 = i.a(context);
                                            }
                                        }
                                    } else {
                                        com.ss.android.ad.splash.f.g.b("layout mode default");
                                        if (com.ss.android.ad.splash.f.c.h(linearLayout)) {
                                            a2 = com.ss.android.ad.splash.f.c.a(linearLayout);
                                            a2 = i.a(context);
                                        }
                                    }
                                }
                            } else if (com.ss.android.ad.splash.f.c.g(linearLayout) || com.ss.android.ad.splash.f.c.h(linearLayout)) {
                                a2 = com.ss.android.ad.splash.f.c.a(linearLayout);
                                a2 = i.a(context);
                            }
                        } else {
                            com.ss.android.ad.splash.f.g.b("no notch");
                            if (!h.a().f58915g && com.ss.android.ad.splash.f.c.h(linearLayout)) {
                                a2 = com.ss.android.ad.splash.f.c.a(linearLayout);
                                a2 = i.a(context);
                            }
                        }
                        a2 = 0;
                        a2 = i.a(context);
                    }
                    com.ss.android.ad.splash.f.g.b("screenY:" + i10 + " paddingTop:" + paddingTop + " safeInsetTop:" + a2);
                    if (i10 + paddingTop < a2) {
                        int i13 = (a2 - i10) - paddingTop;
                        com.ss.android.ad.splash.f.g.b("adjust translationY:" + i13 + ". triedTimes:" + this.f58409b);
                        a(i13);
                    } else {
                        com.ss.android.ad.splash.f.g.b("no need to adjust translationY. triedTimes:" + this.f58409b);
                    }
                    if (this.f58409b >= 3) {
                        a(0);
                    }
                }
            }
        });
    }

    public final void h() {
        this.A.removeMessages(1);
        this.A.sendEmptyMessageDelayed(1, this.t);
    }

    private void j() {
        if (this.ad == null) {
            Timer timer = new Timer();
            this.ad = timer;
            timer.scheduleAtFixedRate(new TimerTask() {
                /* class com.ss.android.ad.splash.core.c.AnonymousClass17 */

                static {
                    Covode.recordClassIndex(36247);
                }

                public final void run() {
                    Message obtainMessage = c.this.A.obtainMessage();
                    obtainMessage.what = 2;
                    c.this.A.sendMessage(obtainMessage);
                }
            }, (this.t % 1000) + 1000, 1000);
        }
    }

    public final void i() {
        AnonymousClass22 r1 = new Runnable() {
            /* class com.ss.android.ad.splash.core.c.AnonymousClass22 */

            static {
                Covode.recordClassIndex(36253);
            }

            public final void run() {
                c.this.L.b();
            }
        };
        if (h.a().f58919k) {
            post(r1);
        } else {
            r1.run();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.ss.android.ad.splash.f.g.b("Detached!");
        k();
        h.h().i();
    }

    @Override // com.ss.android.ad.splash.core.i
    public final void b() {
        com.ss.android.ad.splash.core.j.c cVar = this.f58361l;
        if (cVar != null && cVar.getBDAVideoController() != null) {
            this.f58361l.getBDAVideoController().a(this.w);
        }
    }

    public final void g() {
        com.ss.android.ad.splash.core.j.c cVar;
        com.ss.android.ad.splash.f.a.a(this.y.f58441d, "skip ad");
        if (!this.v || (cVar = this.f58361l) == null) {
            this.z.a(this.y, -1);
        } else {
            cVar.setBreakReason(2);
            this.f58361l.a();
        }
        if (this.L != null) {
            this.u = 2;
            i();
        }
        a();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!h.a().p) {
            j();
        }
        com.ss.android.ad.splash.f.g.b("setSplashShowTime: ");
        n.a().a(System.currentTimeMillis());
        this.z.b();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.ad.splash.core.c.AnonymousClass18 */

            static {
                Covode.recordClassIndex(36248);
            }

            public final boolean onPreDraw() {
                if (c.this.y != null && c.this.y.q == 0 && c.this.y.f58450m == 0) {
                    c.this.b(0);
                }
                c.this.getViewTreeObserver().removeOnPreDrawListener(this);
                if (!h.a().p) {
                    c.this.h();
                }
                c.this.z.b(c.this.y);
                return true;
            }
        });
        k.a().a(this.y.f58441d, 1000);
    }

    private void k() {
        BDASplashImageView bDASplashImageView = this.R;
        if (bDASplashImageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) bDASplashImageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.R.setImageBitmap(null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        com.ss.android.ad.splash.core.video2.f.a().b();
        com.ss.android.ad.splash.core.j.c cVar = this.f58361l;
        if (cVar != null) {
            cVar.b();
        }
        g gVar = this.L;
        if (gVar != null) {
            gVar.j();
            this.L = null;
            this.f58355f = null;
        }
        if (this.ad != null) {
            com.ss.android.ad.splash.f.g.b("splash_count_down. detach: timer canceled");
            this.ad.cancel();
            this.ad = null;
        }
        AlphaAnimation alphaAnimation = this.D;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.D = null;
        }
        d dVar = this.f58362m;
        if (dVar != null) {
            dVar.a();
        }
        this.v = false;
        AnimatorSet animatorSet = this.I;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.I = null;
        }
        ValueAnimator valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.J = null;
        }
    }

    private void l() {
        if (this.L != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            hashMap.put("duration", Long.toString((long) this.L.f()));
            hashMap.put("percent", Integer.valueOf(com.ss.android.ad.splash.f.m.a((long) this.L.f(), (long) this.L.g())));
            hashMap.put("break_reason", 9);
            hashMap2.put("break_reason", 9);
            hashMap2.put("play_order", 1);
            com.ss.android.ad.splash.core.c.b.a();
            com.ss.android.ad.splash.core.c.b.a(this.y, 0, "play_break", hashMap, hashMap2);
            h.h().g();
        }
    }

    public final void a() {
        this.x = true;
        if (h.a().p) {
            this.A.removeMessages(1);
        }
    }

    public final void e() {
        this.p.setVisibility(0);
        this.p.setTextSize(1, 15.0f);
        this.p.setTextColor(-1);
        this.p.setY((float) this.f58350a.getBottom());
        this.p.setGravity(17);
        this.p.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.q.setAlpha(0.0f);
        this.q.setVisibility(0);
        this.q.setY(((float) this.f58350a.getBottom()) - o.a(getContext(), 50.0f));
    }

    @Override // com.ss.android.ad.splash.core.i
    public final void c() {
        com.ss.android.ad.splash.f.g.b("on background");
        g gVar = this.L;
        if (gVar != null) {
            gVar.a(true);
        }
        com.ss.android.ad.splash.core.j.c cVar = this.f58361l;
        if (cVar != null && cVar.getBDAVideoController() != null) {
            g bDAVideoController = this.f58361l.getBDAVideoController();
            bDAVideoController.a(true);
            if (bDAVideoController.e()) {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put("percent", Integer.valueOf(com.ss.android.ad.splash.f.m.a((long) bDAVideoController.f(), (long) bDAVideoController.g())));
                hashMap.put("is_ad_event", "1");
                hashMap.put("ad_fetch_time", Long.valueOf(this.y.f58439b));
                hashMap.put("break_reason", 7);
                if (!l.a(this.y.f58447j)) {
                    hashMap.put("log_extra", this.y.f58447j);
                }
                hashMap2.put("position", Integer.valueOf(2 - this.C));
                hashMap2.put("duration", Long.toString((long) bDAVideoController.f()));
                hashMap2.put("break_reason", 7);
                hashMap2.put("play_order", 1);
                com.ss.android.ad.splash.core.c.b.a();
                com.ss.android.ad.splash.core.c.b.a(this.y, 0, "play_break", hashMap, hashMap2);
            }
        }
    }

    public final void setSplashAdInteraction(p pVar) {
        this.z = pVar;
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ad.splash.core.video2.b b(final com.ss.android.ad.splash.core.e.b bVar) {
        return new com.ss.android.ad.splash.core.video2.c() {
            /* class com.ss.android.ad.splash.core.c.AnonymousClass21 */

            static {
                Covode.recordClassIndex(36252);
            }

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void c() {
                h.h().e();
            }

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void e() {
                h.h().f();
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void b() {
                c.this.a();
                c.this.z.a();
            }

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void d() {
                com.ss.android.ad.splash.core.e.b bVar = c.this.y;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("play_order", 1);
                com.ss.android.ad.splash.core.c.b.a();
                com.ss.android.ad.splash.core.c.b.a(bVar, 0, "resume", hashMap, hashMap2);
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void a() {
                int i2 = 2;
                c.this.b(2);
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.f58440c);
                    String str = "not_real_time";
                    if (bVar.C) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    jSONObject.putOpt("play_order", 1);
                    if (h.X != -1) {
                        if (h.X == 1) {
                            i2 = 1;
                        }
                        jSONObject.put("awemelaunch", i2);
                    }
                    jSONObject.put("ad_sequence", v.a().p());
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    if (!l.a(bVar.f58447j)) {
                        jSONObject2.put("log_extra", bVar.f58447j);
                    }
                    jSONObject2.put("ad_fetch_time", bVar.f58439b);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject2 = null;
                }
                h.a(bVar.f58441d, "splash_ad", "play", jSONObject2);
                if (bVar.r != null) {
                    c.a aVar = new c.a();
                    aVar.f58598a = j.a((com.ss.android.ad.splash.c.a) bVar);
                    com.ss.android.ad.splash.core.i.c a2 = aVar.a();
                    if (h.a().f58910b) {
                        h.g().a(null, "play", bVar.f58441d, bVar.r.f58522a, bVar.f58447j, true, -1, null, a2);
                    } else {
                        h.g().c(null, bVar.f58441d, bVar.r.f58522a, bVar.f58447j, true, -1, null, a2);
                    }
                }
                com.ss.android.ad.splash.core.i.a h2 = h.h();
                long g2 = (long) c.this.L.g();
                c.this.L.c();
                c.this.L.d();
                h2.a(g2);
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void b(int i2) {
                c.this.a((long) i2);
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void c(int i2) {
                super.c(i2);
                c.this.N = true;
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void a(int i2) {
                if (c.this.x && h.a().f58920l) {
                    return;
                }
                if (h.a().p) {
                    c.this.a(true);
                    return;
                }
                c.this.a();
                c.this.a(i2);
                c.this.z.a(bVar);
            }

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void d(int i2) {
                com.ss.android.ad.splash.core.e.b bVar = c.this.y;
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                hashMap.put("duration", Integer.valueOf(i2));
                hashMap2.put("play_order", 1);
                com.ss.android.ad.splash.core.c.b.a();
                com.ss.android.ad.splash.core.c.b.a(bVar, 0, "pause", hashMap, hashMap2);
            }

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void d(int i2, int i3) {
                h.h().c();
                a(i2, i3, "third_quartile");
            }

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void b(int i2, int i3) {
                h.h().a();
                a(i2, i3, "first_quartile");
            }

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void c(int i2, int i3) {
                h.h().b();
                a(i2, i3, "midpoint");
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void a(int i2, int i3) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = (long) i2;
                    jSONObject.put("duration", Long.toString(j2));
                    jSONObject.put("percent", com.ss.android.ad.splash.f.m.a(j2, (long) i3));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f58439b);
                    jSONObject.put("break_reason", c.this.u);
                    if (!l.a(bVar.f58447j)) {
                        jSONObject.put("log_extra", bVar.f58447j);
                    }
                    jSONObject2.put("break_reason", c.this.u);
                    jSONObject2.putOpt("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject = null;
                }
                h.a(bVar.f58441d, "splash_ad", "play_break", jSONObject);
                if (c.this.u != 1) {
                    h.h().g();
                }
            }

            private void a(int i2, int i3, String str) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    long j2 = (long) i3;
                    jSONObject.put("duration", Long.toString(j2));
                    jSONObject.put("percent", com.ss.android.ad.splash.f.m.a((long) i2, j2));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f58439b);
                    if (!TextUtils.isEmpty(bVar.f58447j)) {
                        jSONObject.put("log_extra", bVar.f58447j);
                    }
                } catch (Throwable unused) {
                }
                h.a(bVar.f58441d, "splash_ad", str, jSONObject);
            }
        };
    }

    private boolean e(int i2) {
        if (!this.v || this.C != 1 || i2 <= 5) {
            return true;
        }
        return false;
    }

    private void setSkipClickListener(com.ss.android.ad.splash.core.e.b bVar) {
        this.f58359j.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.c.AnonymousClass19 */

            static {
                Covode.recordClassIndex(36249);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                c.this.g();
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void setImageTouchListener(final com.ss.android.ad.splash.core.e.b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ad.splash.core.c.AnonymousClass20 */

            static {
                Covode.recordClassIndex(36251);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if ((c.this.getTouchDelegate() == null || !c.this.getTouchDelegate().onTouchEvent(motionEvent)) && !c.this.a(motionEvent) && motionEvent.getAction() == 1) {
                    c.this.a(bVar, motionEvent.getRawX(), motionEvent.getRawY());
                }
                return true;
            }
        });
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 4 || i2 == 8) {
            k();
        }
    }

    public static ObjectAnimator b(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    private void setupWifiPreloadHindLayout(com.ss.android.ad.splash.core.e.b bVar) {
        String str = bVar.M;
        if (!TextUtils.isEmpty(str)) {
            this.f58354e.setVisibility(0);
            this.f58354e.setText(str);
        }
    }

    public final ObjectAnimator a(View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "y", view.getY(), view.getY() - o.a(getContext(), 30.0f));
        ofFloat.setDuration(300L);
        return ofFloat;
    }

    public final void onWindowFocusChanged(boolean z2) {
        g gVar;
        super.onWindowFocusChanged(z2);
        com.ss.android.ad.splash.f.a.a(0, "hasWindowFocus: ".concat(String.valueOf(z2)));
        if (h.a().f58920l && z2 != this.af && (gVar = this.L) != null && !this.x) {
            this.af = z2;
            if (z2) {
                gVar.i();
            } else {
                gVar.h();
            }
        }
    }

    private GradientDrawable c(int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f2 = (float) i2;
        gradientDrawable.setCornerRadii(new float[]{o.a(getContext(), f2), o.a(getContext(), f2), o.a(getContext(), f2), o.a(getContext(), f2), o.a(getContext(), f2), o.a(getContext(), f2), o.a(getContext(), f2), o.a(getContext(), f2)});
        return gradientDrawable;
    }

    private void setupAdLabelLayout(com.ss.android.ad.splash.core.e.b bVar) {
        com.ss.android.ad.splash.core.e.g gVar = bVar.K;
        if (gVar != null) {
            if (!TextUtils.isEmpty(gVar.f58485d)) {
                this.f58360k.setText(gVar.f58485d);
            }
            if (!TextUtils.isEmpty(gVar.f58484c)) {
                this.f58360k.setTextColor(j.a(gVar.f58484c, "#ffffff"));
            }
            if (!TextUtils.isEmpty(gVar.f58482a)) {
                GradientDrawable c2 = c(2);
                c2.setColor(j.a(gVar.f58482a, "#32222222"));
                int i2 = Build.VERSION.SDK_INT;
                this.f58360k.setBackground(c2);
            }
        }
    }

    public final void b(int i2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bda_splash_render_duration", System.currentTimeMillis() - this.W);
            com.ss.android.ad.splash.b.a.a().a("bda_splash_render_duration", i2, jSONObject, null);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void setupSkipButtonHitArea(com.ss.android.ad.splash.core.e.b bVar) {
        m mVar = bVar.L;
        boolean z2 = true;
        if (mVar != null) {
            if (!mVar.a(1)) {
                z2 = false;
                if (mVar == null) {
                    return;
                }
            }
            if (this.f58359j.getVisibility() == 0 && this.f58359j.getParent() != null) {
                if (z2) {
                    int a2 = (int) o.a(getContext(), (float) mVar.f58499b);
                    int a3 = (int) o.a(getContext(), (float) mVar.f58500c);
                    j.a(this.U, a2, a2, a3, a3);
                    this.f58359j.setOnTouchListener(new View.OnTouchListener() {
                        /* class com.ss.android.ad.splash.core.c.AnonymousClass10 */

                        static {
                            Covode.recordClassIndex(36240);
                        }

                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            if (c.this.getTouchDelegate() == null || !c.this.getTouchDelegate().onTouchEvent(motionEvent)) {
                                return false;
                            }
                            return true;
                        }
                    });
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    int a4 = ((int) o.a(getContext(), (float) mVar.f58500c)) + 0;
                    this.f58359j.setPaddingRelative(a4, (int) o.a(getContext(), 14.0f), (int) o.a(getContext(), 16.0f), ((int) o.a(getContext(), (float) mVar.f58499b)) + 0);
                    this.f58359j.setLayoutParams(layoutParams);
                    this.f58359j.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ad.splash.core.c.AnonymousClass11 */

                        static {
                            Covode.recordClassIndex(36241);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                        }
                    });
                    this.U.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ad.splash.core.c.AnonymousClass13 */

                        static {
                            Covode.recordClassIndex(36243);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            c.this.g();
                        }
                    });
                    return;
                }
                j.a(this.f58359j, mVar.f58499b, mVar.f58499b, mVar.f58500c, mVar.f58500c);
                int i2 = Build.VERSION.SDK_INT;
                this.f58358i.setPaddingRelative(0, 0, 0, mVar.f58499b);
            }
        }
    }

    private void setupSkipLayout(com.ss.android.ad.splash.core.e.b bVar) {
        this.B = (int) (this.t / 1000);
        this.V.setText(new StringBuilder().append(this.B).toString());
        this.V.setDuration(this.t);
        m mVar = bVar.L;
        if (mVar == null || TextUtils.isEmpty(mVar.f58503f)) {
            this.f58359j.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10, -1);
            int a2 = (int) o.a(getContext(), 16.0f);
            layoutParams.setMargins(0, (int) o.a(getContext(), 16.0f), a2, 0);
            int i2 = Build.VERSION.SDK_INT;
            layoutParams.addRule(21, -1);
            layoutParams.setMarginStart(0);
            layoutParams.setMarginEnd(a2);
            this.f58354e.setLayoutParams(layoutParams);
            return;
        }
        this.f58359j.setVisibility(0);
        this.ab = mVar.f58503f;
        this.aa = mVar.f58504g;
        this.ac = mVar.f58498a;
        this.U.setText(d(this.B));
        if (!TextUtils.isEmpty(mVar.f58501d)) {
            this.U.setTextColor(j.a(mVar.f58501d, "#ffffff"));
            this.V.setTextColor(j.a(mVar.f58501d, "#ffffff"));
        }
        if (!TextUtils.isEmpty(mVar.f58502e)) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            GradientDrawable c2 = c(12);
            int a3 = j.a(mVar.f58502e, "#32222222");
            c2.setColor(a3);
            gradientDrawable.setColor(a3);
            int i3 = Build.VERSION.SDK_INT;
            this.U.setBackground(c2);
            this.V.setBackground(gradientDrawable);
        }
        setSkipClickListener(bVar);
    }

    public final void b(long j2) {
        Timer timer = this.ad;
        if (timer != null) {
            timer.cancel();
        }
        long j3 = j2 + h.a().n;
        this.t = j3;
        int i2 = (int) (j3 / 1000);
        this.B = i2;
        this.U.setText(d(i2));
        h();
        this.ad = null;
        j();
    }

    private CharSequence d(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        com.ss.android.ad.splash.core.e.g gVar = this.y.K;
        if (gVar != null) {
            if (gVar.f58483b == 3) {
                if (this.y.n()) {
                    return a(this.ab, " | ", 14, "#4DFFFFFF", com.a.a("%02d%s", new Object[]{Integer.valueOf(i2), this.ac}), 18);
                } else if (!this.y.o()) {
                    return this.ab;
                } else {
                    if (i2 > ((int) (this.t / 1000)) - this.y.p()) {
                        return a("Ad", " | ", 14, "#4DFFFFFF", com.a.a("%02d%s", new Object[]{Integer.valueOf(i2), this.ac}), 18);
                    }
                    return a(this.ab, " | ", 14, "#4DFFFFFF", com.a.a("%02d%s", new Object[]{Integer.valueOf(i2), this.ac}), 18);
                }
            } else if (gVar.f58483b == 2) {
                if (!this.aa || !e(i2)) {
                    return this.ab;
                }
                String a2 = com.a.a("%d%s", new Object[]{Integer.valueOf(i2), this.ac});
                if (this.y.g()) {
                    return a(a2, " | ", 13, "#66222222", this.ab, 16);
                }
                return a(a2, " | ", 13, "#66F8F8F8", this.ab, 16);
            }
        }
        if (!this.aa) {
            return this.ab;
        }
        if (j.a(getContext())) {
            return com.a.a("%s %s%s", new Object[]{this.ab, Integer.valueOf(i2), this.ac});
        }
        return com.a.a("%s%s %s", new Object[]{Integer.valueOf(i2), this.ac, this.ab});
    }

    public final void a(int i2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("play_order", 1);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("duration", Long.toString((long) i2));
            jSONObject.put("percent", Integer.toString(100));
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("ad_fetch_time", this.y.f58439b);
            if (!l.a(this.y.f58447j)) {
                jSONObject.put("log_extra", this.y.f58447j);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            jSONObject = null;
        }
        h.a(this.y.f58441d, "splash_ad", "play_over", jSONObject);
        if (this.y.r != null) {
            c.a aVar = new c.a();
            aVar.f58598a = j.a((com.ss.android.ad.splash.c.a) this.y);
            com.ss.android.ad.splash.core.i.c a2 = aVar.a();
            if (h.a().f58910b) {
                h.g().a(null, "play_over", this.y.f58441d, this.y.r.f58523b, this.y.f58447j, true, -1, null, a2);
            } else {
                h.g().d(null, this.y.f58441d, this.y.r.f58523b, this.y.f58447j, true, -1, null, a2);
            }
        }
        h.h().d();
    }

    public final void a(long j2) {
        if (h.a().p) {
            d dVar = new d(this, j2);
            int i2 = Build.VERSION.SDK_INT;
            if (isAttachedToWindow()) {
                dVar.run();
            } else {
                post(dVar);
            }
        }
    }

    public c(Context context) {
        super(context);
        float a2;
        MethodCollector.i(1428);
        if (h.A != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), h.A).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Exception unused) {
            }
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        this.P = linearLayout;
        addView(linearLayout);
        ViewStub viewStub = new ViewStub(context);
        this.Q = viewStub;
        viewStub.setLayoutParams(new LinearLayout.LayoutParams(-1, 27));
        this.Q.setLayoutResource(R.layout.b1l);
        this.Q.setVisibility(8);
        this.P.addView(this.Q);
        this.f58350a = new RelativeLayout(context);
        this.f58350a.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        Space space = new Space(context);
        this.f58352c = space;
        space.setId(R.id.e88);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12, -1);
        this.f58352c.setLayoutParams(layoutParams);
        this.f58352c.setBackgroundColor(getResources().getColor(R.color.pj));
        this.f58352c.setVisibility(4);
        this.f58351b = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, this.f58352c.getId());
        this.f58351b.setLayoutParams(layoutParams2);
        this.R = new BDASplashImageView(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        this.R.setScaleType(ImageView.ScaleType.FIT_XY);
        this.R.setVisibility(8);
        this.R.setLayoutParams(layoutParams3);
        this.f58355f = new BDASplashVideoView(context);
        this.f58355f.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f58355f.setVisibility(8);
        this.f58361l = new com.ss.android.ad.splash.core.j.c(context);
        this.f58361l.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f58361l.setVisibility(8);
        this.f58362m = new d(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams((int) o.a(context, 140.0f), (int) o.a(context, 170.0f));
        layoutParams4.bottomMargin = (int) o.a(context, 148.0f);
        layoutParams4.addRule(12);
        layoutParams4.addRule(14);
        this.f58362m.setLayoutParams(layoutParams4);
        this.f58362m.setVisibility(8);
        this.f58356g = new RelativeLayout(context);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, (int) o.a(context, 60.0f));
        layoutParams5.gravity = 80;
        this.f58356g.setLayoutParams(layoutParams5);
        this.f58356g.setBackgroundColor(getResources().getColor(R.color.pd));
        this.f58356g.setVisibility(8);
        this.S = new RelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(13, -1);
        this.S.setLayoutParams(layoutParams6);
        this.f58357h = new TextView(context);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(15, -1);
        this.f58357h.setEllipsize(TextUtils.TruncateAt.END);
        this.f58357h.setLines(1);
        this.f58357h.setMaxWidth((int) o.a(context, 200.0f));
        this.f58357h.setText(R.string.g35);
        this.f58357h.setTextColor(getResources().getColor(R.color.pj));
        this.f58357h.setTextSize(1, 20.0f);
        this.f58357h.setLayoutParams(layoutParams7);
        this.f58357h.setId(R.id.e8b);
        this.S.addView(this.f58357h);
        this.T = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(15, -1);
        layoutParams8.addRule(1, this.f58357h.getId());
        layoutParams8.setMargins((int) o.a(context, 4.0f), 0, 0, 0);
        this.T.setPadding(0, (int) o.a(context, 1.0f), 0, 0);
        this.T.setImageDrawable(getResources().getDrawable(2131233854));
        this.T.setLayoutParams(layoutParams8);
        this.S.addView(this.T);
        this.f58356g.addView(this.S);
        this.f58353d = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams9.addRule(20, -1);
        layoutParams9.addRule(10, -1);
        int a3 = (int) o.a(context, 14.0f);
        layoutParams9.setMargins(a3, (int) o.a(context, 14.0f), 0, 0);
        int i3 = Build.VERSION.SDK_INT;
        layoutParams9.setMarginStart(a3);
        layoutParams9.setMarginEnd(0);
        this.f58353d.setVisibility(8);
        this.f58353d.setLayoutParams(layoutParams9);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.bk6);
        this.o = new com.ss.android.ad.splash.core.j.b(context);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams((int) o.a(context, 209.0f), (int) o.a(context, 44.0f));
        layoutParams10.bottomMargin = (int) o.a(context, 100.0f);
        layoutParams10.addRule(12);
        layoutParams10.addRule(14);
        this.o.setLayoutParams(layoutParams10);
        this.o.setVisibility(8);
        this.f58358i = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-1, -2);
        this.f58358i.setOrientation(0);
        this.f58358i.setLayoutParams(layoutParams11);
        if (!h.a().q) {
            this.f58358i.setFitsSystemWindows(true);
        }
        this.ae = new Space(context);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(0, 1);
        layoutParams12.weight = 1.0f;
        this.ae.setLayoutParams(layoutParams12);
        this.f58359j = new FrameLayout(context);
        RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, (int) o.a(context, 36.0f));
        int i4 = Build.VERSION.SDK_INT;
        layoutParams13.addRule(21, -1);
        layoutParams13.addRule(10, -1);
        if (h.a().f58915g) {
            a2 = o.a(context, 10.0f);
        } else {
            a2 = o.a(context, 16.0f);
        }
        int i5 = (int) a2;
        layoutParams13.setMargins(0, (int) o.a(context, 8.0f), i5, 0);
        int i6 = Build.VERSION.SDK_INT;
        layoutParams13.setMarginStart(0);
        layoutParams13.setMarginEnd(i5);
        this.f58359j.setLayoutParams(layoutParams13);
        this.f58359j.setVisibility(8);
        this.f58359j.setId(R.id.e8d);
        this.U = new TextView(context);
        FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-2, (int) o.a(context, 24.0f));
        this.U.setBackgroundResource(R.drawable.bk2);
        int i7 = Build.VERSION.SDK_INT;
        this.U.setPaddingRelative((int) o.a(context, 10.0f), 0, (int) o.a(context, 10.0f), 0);
        layoutParams14.gravity = 17;
        this.U.setGravity(17);
        this.U.setTextSize(1, 12.0f);
        this.U.setLayoutParams(layoutParams14);
        this.f58359j.addView(this.U);
        this.f58354e = new TextView(context);
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-2, -2);
        int a4 = (int) o.a(context, 9.0f);
        layoutParams15.setMargins(0, (int) o.a(context, 17.0f), a4, 0);
        int i8 = Build.VERSION.SDK_INT;
        layoutParams15.setMarginStart(0);
        layoutParams15.setMarginEnd(a4);
        int i9 = Build.VERSION.SDK_INT;
        this.f58354e.setPaddingRelative(3, 3, 3, 3);
        this.f58354e.setTextColor(Color.parseColor("#ffffff"));
        this.f58354e.setShadowLayer(12.0f, 0.0f, 0.0f, Color.parseColor("#7f000000"));
        this.f58354e.setTextSize(1, 12.0f);
        this.f58354e.setVisibility(8);
        this.f58354e.setLayoutParams(layoutParams15);
        this.V = new com.ss.android.ad.splash.core.j.a(context);
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams((int) o.a(context, 40.0f), (int) o.a(context, 40.0f));
        int a5 = (int) o.a(context, 44.0f);
        layoutParams16.setMargins(0, (int) o.a(context, 30.0f), a5, 0);
        int i10 = Build.VERSION.SDK_INT;
        layoutParams16.setMarginStart(0);
        layoutParams16.setMarginEnd(a5);
        this.V.setLayoutParams(layoutParams16);
        this.V.setGravity(17);
        this.V.setTextSize(1, 18.0f);
        this.V.setVisibility(8);
        this.f58360k = new TextView(context);
        int i11 = Build.VERSION.SDK_INT;
        this.f58360k.setPaddingRelative((int) o.a(context, 4.0f), (int) o.a(context, 2.0f), (int) o.a(context, 4.0f), (int) o.a(context, 2.0f));
        this.f58360k.setTextSize(1, 10.0f);
        this.f58360k.setVisibility(8);
        TextView textView = new TextView(context);
        this.p = textView;
        textView.setVisibility(8);
        View view = new View(context);
        this.q = view;
        view.setBackgroundResource(R.drawable.a_j);
        this.q.setVisibility(8);
        this.q.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) o.a(context, 50.0f)));
        View view2 = new View(getContext());
        this.r = view2;
        view2.setBackgroundResource(R.drawable.bjy);
        this.r.setVisibility(8);
        this.r.setLayoutParams(new RelativeLayout.LayoutParams(-1, (int) o.a(getContext(), 105.0f)));
        this.P.addView(this.f58350a);
        this.f58351b.addView(this.f58361l);
        this.f58351b.addView(this.R);
        this.f58351b.addView(this.f58355f);
        this.f58351b.addView(this.f58356g);
        this.f58350a.addView(this.f58351b);
        this.f58350a.addView(this.f58352c);
        this.f58350a.addView(this.r);
        this.f58358i.addView(this.f58353d);
        this.f58358i.addView(this.ae);
        this.f58350a.addView(this.f58358i);
        this.f58350a.addView(this.o);
        this.f58350a.addView(this.f58362m);
        this.f58350a.addView(this.q);
        this.f58350a.addView(this.p);
        if (h.v != 0) {
            this.f58354e.setText(h.v);
        } else {
            this.f58354e.setText(R.string.g3_);
        }
        if (h.y != 0) {
            this.U.setText(h.y);
        } else {
            this.U.setText(R.string.g37);
        }
        if (h.w != 0) {
            this.U.setBackgroundResource(h.w);
        }
        if (h.O == 1) {
            this.R.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.af = true;
        MethodCollector.o(1428);
    }

    @Override // com.ss.android.ad.splash.f.q.a
    public final void a(Message message) {
        if (message.what == 1) {
            if (!this.x && h.a().f58920l && !h.a().p) {
                l();
            }
            a(false);
        } else if (message.what == 2) {
            int i2 = this.B - 1;
            this.B = i2;
            com.ss.android.ad.splash.f.g.b("splash count down. display seconds left: " + this.B);
            if (i2 == 0) {
                Timer timer = this.ad;
                if (timer != null) {
                    timer.cancel();
                    this.ad = null;
                    return;
                }
                return;
            }
            if (this.U.getVisibility() == 0 && this.aa) {
                this.U.setText(d(i2));
            }
            if (this.V.getVisibility() == 0) {
                this.V.setText(String.valueOf(i2));
            }
            if (this.p.getVisibility() == 0 && this.y.U == 5) {
                this.p.setText(a(this.y.V, String.valueOf(i2)));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void setupUIWidgets(com.ss.android.ad.splash.core.e.b bVar) {
        int i2;
        float a2;
        int i3;
        float a3;
        setupSkipLayout(bVar);
        setupWifiPreloadHindLayout(bVar);
        setupAdLabelLayout(bVar);
        com.ss.android.ad.splash.core.e.g gVar = bVar.K;
        if (gVar != null) {
            com.ss.android.ad.splash.f.a.a(0, "new splash style，position:" + gVar.f58483b);
            o.a(this.f58354e);
            o.a(this.f58360k);
            o.a(this.f58359j);
            int i4 = gVar.f58483b;
            if (i4 != 0) {
                if (i4 == 1) {
                    o.a(this.f58354e, this.f58358i);
                    o.a(this.f58359j, this.f58358i);
                    this.f58360k.setVisibility(0);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 8388693;
                    if (bVar.n == 3 && this.f58356g.getVisibility() == 0) {
                        i2 = this.f58356g.getLayoutParams().height;
                    } else {
                        i2 = 0;
                    }
                    int a4 = (int) o.a(getContext(), 16.0f);
                    layoutParams.setMargins(0, 0, a4, ((int) o.a(getContext(), 20.0f)) + i2);
                    int i5 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginStart(0);
                    layoutParams.setMarginEnd(a4);
                    this.f58360k.setLayoutParams(layoutParams);
                    o.a(this.f58360k, this.f58351b);
                } else if (i4 == 2) {
                    if (!TextUtils.isEmpty(this.f58360k.getText())) {
                        this.f58360k.setVisibility(0);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, (int) o.a(getContext(), 18.0f));
                        if (this.f58354e.getVisibility() != 0) {
                            if (this.v) {
                                a3 = o.a(getContext(), 12.0f);
                            } else {
                                a3 = o.a(getContext(), 20.0f);
                            }
                            i3 = (int) a3;
                        } else {
                            i3 = 0;
                        }
                        layoutParams2.setMargins(0, 0, i3, 0);
                        int i6 = Build.VERSION.SDK_INT;
                        layoutParams2.setMarginStart(0);
                        layoutParams2.setMarginEnd(i3);
                        this.f58360k.setLayoutParams(layoutParams2);
                        this.f58360k.setTextSize(1, 12.0f);
                        int i7 = Build.VERSION.SDK_INT;
                        this.f58360k.setPaddingRelative((int) o.a(getContext(), 4.0f), 0, (int) o.a(getContext(), 0.0f), 0);
                        this.f58360k.setBackgroundColor(Color.parseColor("#00222222"));
                        this.f58360k.setShadowLayer(2.0f, 0.0f, 1.0f, Color.parseColor("#66000000"));
                        o.a(this.f58360k, this.f58358i);
                    }
                    if (this.f58354e.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, (int) o.a(getContext(), 18.0f));
                        if (this.v) {
                            a2 = o.a(getContext(), 12.0f);
                        } else {
                            a2 = o.a(getContext(), 20.0f);
                        }
                        int i8 = (int) a2;
                        layoutParams3.setMargins(0, 0, i8, 0);
                        int i9 = Build.VERSION.SDK_INT;
                        layoutParams3.setMarginStart(0);
                        layoutParams3.setMarginEnd(i8);
                        this.f58354e.setLayoutParams(layoutParams3);
                        this.f58354e.setTextSize(1, 12.0f);
                        this.f58354e.setShadowLayer(2.0f, 0.0f, 1.0f, Color.parseColor("#66000000"));
                        if (!TextUtils.isEmpty(gVar.f58484c)) {
                            this.f58354e.setTextColor(j.a(gVar.f58484c, "#ffffff"));
                        }
                        int i10 = Build.VERSION.SDK_INT;
                        this.f58354e.setPaddingRelative((int) o.a(getContext(), 6.0f), 0, (int) o.a(getContext(), 0.0f), 0);
                        this.f58354e.setText("|  " + ((Object) this.f58354e.getText()));
                        o.a(this.f58354e, this.f58358i);
                    }
                    if (this.f58359j.getVisibility() == 0) {
                        if (!bVar.N) {
                            this.U.setTextSize(1, 16.0f);
                        }
                        o.a(this.f58359j, this.f58350a);
                        int h2 = j.h();
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, (int) o.a(getContext(), 30.0f));
                        layoutParams4.addRule(12, -1);
                        int a5 = (int) o.a(getContext(), 15.0f);
                        if (bVar.g()) {
                            if (h.b() != null && "13".equals(h.b().a())) {
                                h2 += (int) o.a(getContext(), 5.5f);
                            }
                            layoutParams4.setMargins(0, 0, a5, h2);
                        } else {
                            layoutParams4.setMargins(0, 0, a5, (int) o.a(getContext(), 35.0f));
                        }
                        int i11 = Build.VERSION.SDK_INT;
                        layoutParams4.addRule(21, -1);
                        layoutParams4.setMarginStart(0);
                        layoutParams4.setMarginEnd(a5);
                        this.f58359j.setLayoutParams(layoutParams4);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -1);
                        this.U.setMinimumWidth((int) o.a(getContext(), 64.0f));
                        this.U.setLayoutParams(layoutParams5);
                        m mVar = bVar.L;
                        if (mVar != null && !TextUtils.isEmpty(mVar.f58502e)) {
                            GradientDrawable c2 = c(16);
                            c2.setColor(j.a(mVar.f58502e, "#32222222"));
                            if (bVar.g()) {
                                c2.setStroke((int) o.a(getContext(), 0.5f), Color.parseColor("#66222222"));
                            } else {
                                c2.setStroke((int) o.a(getContext(), 0.5f), Color.parseColor("#99FAFAFA"));
                            }
                            int i12 = Build.VERSION.SDK_INT;
                            this.U.setBackground(c2);
                        }
                    }
                    if (this.f58353d.getVisibility() == 0) {
                        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                        int a6 = (int) o.a(getContext(), 14.0f);
                        layoutParams6.setMargins(a6, 0, 0, 0);
                        int i13 = Build.VERSION.SDK_INT;
                        layoutParams6.setMarginStart(a6);
                        layoutParams6.setMarginEnd(0);
                        this.f58353d.setLayoutParams(layoutParams6);
                    }
                    if (this.v) {
                        com.ss.android.ad.splash.f.a.a(this.y.f58441d, "interactive splash ad, adding volume button");
                        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams((int) o.a(getContext(), 16.0f), (int) o.a(getContext(), 16.0f));
                        layoutParams7.rightMargin = (int) o.a(getContext(), 15.0f);
                        layoutParams7.gravity = 15;
                        this.n.setLayoutParams(layoutParams7);
                        o.a(this.n, this.f58358i);
                        this.n.setOnClickListener(new com.ss.android.ad.splash.core.a.a() {
                            /* class com.ss.android.ad.splash.core.c.AnonymousClass16 */

                            static {
                                Covode.recordClassIndex(36246);
                            }

                            @Override // com.ss.android.ad.splash.core.a.a
                            public final void a() {
                                c cVar = c.this;
                                cVar.w = !cVar.w;
                                if (c.this.w) {
                                    c.this.n.setImageResource(R.drawable.bk6);
                                } else {
                                    c.this.n.setImageResource(R.drawable.bk8);
                                }
                                if (c.this.f58361l != null) {
                                    c.this.f58361l.setMute(c.this.w);
                                }
                                HashMap hashMap = new HashMap(1);
                                hashMap.put("position", Integer.valueOf(2 - c.this.C));
                                com.ss.android.ad.splash.core.c.b.a();
                                com.ss.android.ad.splash.core.c.b.a(c.this.y, 0, "click_sound_switch", null, hashMap);
                            }
                        });
                    }
                    if (this.f58358i != null) {
                        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
                        layoutParams8.setMargins(0, (int) o.a(getContext(), 35.0f), 0, 0);
                        int i14 = Build.VERSION.SDK_INT;
                        layoutParams8.setMarginStart(0);
                        layoutParams8.setMarginEnd(0);
                        this.f58358i.setOrientation(0);
                        this.f58358i.setLayoutParams(layoutParams8);
                    }
                } else if (i4 != 3) {
                    o.a(this.f58354e, this.f58358i);
                    o.a(this.f58359j, this.f58358i);
                    if (gVar.f58483b != 0) {
                        this.f58360k.setVisibility(8);
                    }
                } else {
                    com.ss.android.ad.splash.f.a.a(0, "xigua TV style, is clickable: " + bVar.n() + ", is skippable: " + bVar.o());
                    if (bVar.n() || bVar.o()) {
                        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-2, (int) o.a(getContext(), 40.0f));
                        int a7 = (int) o.a(getContext(), 44.0f);
                        layoutParams9.setMargins(0, (int) o.a(getContext(), 30.0f), a7, 0);
                        int i15 = Build.VERSION.SDK_INT;
                        layoutParams9.setMarginStart(0);
                        layoutParams9.setMarginEnd(a7);
                        this.f58359j.setLayoutParams(layoutParams9);
                        this.U.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                        GradientDrawable c3 = c(20);
                        m mVar2 = bVar.L;
                        if (mVar2 == null || TextUtils.isEmpty(mVar2.f58502e)) {
                            c3.setAlpha(153);
                            c3.setColor(-16777216);
                        } else {
                            c3.setColor(j.a(mVar2.f58502e, "#32222222"));
                        }
                        int a8 = (int) o.a(getContext(), 14.0f);
                        int a9 = (int) o.a(getContext(), 8.0f);
                        int a10 = (int) o.a(getContext(), 14.0f);
                        int a11 = (int) o.a(getContext(), 7.0f);
                        int i16 = Build.VERSION.SDK_INT;
                        this.U.setPaddingRelative(a8, a9, a10, a11);
                        this.U.setBackground(c3);
                        this.U.setTextSize(1, 18.0f);
                        o.a(this.f58359j, this.f58358i);
                    } else {
                        this.V.setVisibility(0);
                        o.a(this.V, this.f58358i);
                    }
                    if (!TextUtils.isEmpty(gVar.f58485d) && (bVar.n() || !bVar.o())) {
                        this.f58360k.setVisibility(0);
                        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams((int) o.a(getContext(), 40.0f), (int) o.a(getContext(), 22.0f));
                        layoutParams10.gravity = 8388691;
                        int a12 = (int) o.a(getContext(), 8.0f);
                        layoutParams10.setMargins(a12, 0, 0, (int) o.a(getContext(), 8.0f));
                        int i17 = Build.VERSION.SDK_INT;
                        layoutParams10.setMarginStart(a12);
                        layoutParams10.setMarginEnd(0);
                        this.f58360k.setGravity(17);
                        GradientDrawable c4 = c(4);
                        if (!TextUtils.isEmpty(gVar.f58482a)) {
                            c4.setColor(j.a(gVar.f58482a, "#32222222"));
                        } else {
                            c4.setColor(-16777216);
                            c4.setAlpha(153);
                        }
                        int i18 = Build.VERSION.SDK_INT;
                        this.f58360k.setBackground(c4);
                        if (!TextUtils.isEmpty(gVar.f58484c)) {
                            this.f58360k.setTextColor(j.a(gVar.f58484c, "#ffffff"));
                        } else {
                            this.f58360k.setTextColor(-1);
                        }
                        this.f58360k.setTextSize(1, 12.0f);
                        this.f58360k.setText(gVar.f58485d);
                        this.f58360k.setLayoutParams(layoutParams10);
                        o.a(this.f58360k, this.f58351b);
                    }
                }
            } else if (TextUtils.isEmpty(gVar.f58485d)) {
                o.a(this.f58354e, this.f58358i);
                o.a(this.f58359j, this.f58358i);
            } else {
                o.a(true, this.f58360k);
                o.a(false, this.f58359j, this.f58354e);
                this.f58360k.setTextSize(1, 12.0f);
                this.f58360k.setOnClickListener(new View.OnClickListener() {
                    /* class com.ss.android.ad.splash.core.c.AnonymousClass14 */

                    static {
                        Covode.recordClassIndex(36244);
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        HashMap hashMap = new HashMap(1);
                        hashMap.put("refer", "adtag");
                        com.ss.android.ad.splash.core.c.b.a();
                        com.ss.android.ad.splash.core.c.b.a(c.this.y, 0, "otherclick", hashMap, null);
                    }
                });
                float a13 = (float) ((int) o.a(getContext(), 1.0f));
                this.f58360k.setShadowLayer(a13, 0.0f, a13, Color.argb(31, 0, 0, 0));
                o.a(true, this.r);
                LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams11.gravity = 16;
                layoutParams11.topMargin = (int) o.a(getContext(), 7.0f);
                int i19 = Build.VERSION.SDK_INT;
                layoutParams11.setMarginEnd((int) o.a(getContext(), 13.0f));
                TextView textView = this.f58360k;
                LinearLayout linearLayout = this.f58358i;
                if (textView != null) {
                    textView.setLayoutParams(layoutParams11);
                }
                o.a(textView, linearLayout);
            }
        }
        setupSkipButtonHitArea(bVar);
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("%", str2);
    }

    static void a(View view, AlphaAnimation alphaAnimation) {
        if (view != null && view.getVisibility() == 0) {
            view.startAnimation(alphaAnimation);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (r3 != 4) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onKeyDown(int r10, android.view.KeyEvent r11) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.c.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    private SpannableString a(String str, String str2, int i2, String str3, String str4, int i3) {
        SpannableString spannableString = new SpannableString(str + str2 + str4);
        spannableString.setSpan(new AbsoluteSizeSpan(18, true), 0, str.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i2, true), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor(str3)), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(i3, true), str.length() + str2.length(), spannableString.length(), 33);
        int max = Math.max(18, Math.max(i2, i3));
        spannableString.setSpan(new e((int) o.a(getContext(), (float) ((-Math.abs(max - 18)) / 2))), 0, str.length(), 33);
        spannableString.setSpan(new e((int) o.a(getContext(), (float) ((-Math.abs(max - i2)) / 2))), str.length(), str.length() + str2.length(), 33);
        spannableString.setSpan(new e((int) o.a(getContext(), (float) ((-Math.abs(max - i3)) / 2))), str.length() + str2.length(), spannableString.length(), 33);
        return spannableString;
    }
}
