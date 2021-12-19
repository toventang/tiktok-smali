package com.ss.android.ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ad.splash.c.a;
import com.ss.android.ad.splash.core.e.c;
import com.ss.android.ad.splash.core.i.c;
import com.ss.android.ad.splash.core.video.b;
import com.ss.android.ad.splash.core.video.c;
import com.ss.android.ad.splash.core.video.f;
import com.ss.android.ad.splash.core.video.g;
import com.ss.android.ad.splash.core.video2.BDASplashVideoView;
import com.ss.android.ad.splash.core.video2.f;
import com.ss.android.ad.splash.f.j;
import com.ss.android.ad.splash.f.l;
import com.ss.android.ad.splash.f.m;
import com.ss.android.ad.splash.f.o;
import com.ss.android.ad.splash.f.q;
import com.ss.android.ad.splash.p;
import com.zhiliaoapp.musically.R;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends RelativeLayout implements i, q.a {
    boolean A = false;
    private long B = 0;
    private Space C;
    private TextView D;
    private Timer E;

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ad.splash.core.e.b f58300a;

    /* renamed from: b  reason: collision with root package name */
    public BDASplashImageView f58301b;

    /* renamed from: c  reason: collision with root package name */
    ImageView f58302c;

    /* renamed from: d  reason: collision with root package name */
    Space f58303d;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup f58304e;

    /* renamed from: f  reason: collision with root package name */
    TextView f58305f;

    /* renamed from: g  reason: collision with root package name */
    ImageView f58306g;

    /* renamed from: h  reason: collision with root package name */
    RotateAnimation f58307h;

    /* renamed from: i  reason: collision with root package name */
    ViewGroup f58308i;

    /* renamed from: j  reason: collision with root package name */
    FrameLayout f58309j;

    /* renamed from: k  reason: collision with root package name */
    TextView f58310k;

    /* renamed from: l  reason: collision with root package name */
    public View f58311l;

    /* renamed from: m  reason: collision with root package name */
    TextView f58312m;
    public g n;
    public p o;
    public q p = new q(this);
    boolean q = false;
    long r = 0;
    public boolean s = false;
    FrameLayout t;
    TextView u;
    TextView v;
    BDASplashVideoView w;
    public com.ss.android.ad.splash.core.video2.g x;
    public int y = -1;
    int z = -1;

    static {
        Covode.recordClassIndex(36217);
    }

    @Override // com.ss.android.ad.splash.core.i
    public final void b() {
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        n.a().a(System.currentTimeMillis());
        this.o.b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.ss.android.ad.splash.f.g.b("Detached!");
        e();
        h.h().i();
    }

    private void d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        int a2 = (int) o.a(getContext(), 9.0f);
        layoutParams.setMargins(0, (int) o.a(getContext(), 14.0f), a2, 0);
        int i2 = Build.VERSION.SDK_INT;
        layoutParams.addRule(21);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(a2);
        this.f58310k.setLayoutParams(layoutParams);
    }

    @Override // com.ss.android.ad.splash.core.i
    public final void c() {
        com.ss.android.ad.splash.f.g.b("on background");
        g gVar = this.n;
        if (!(gVar == null || gVar.f58804d == null)) {
            c cVar = gVar.f58804d;
            if (cVar.f58741a != null) {
                cVar.f58741a.j();
            }
        }
        com.ss.android.ad.splash.core.video2.g gVar2 = this.x;
        if (gVar2 != null && gVar2.e()) {
            this.x.a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.ss.android.ad.splash.core.b.AnonymousClass6 */

            static {
                Covode.recordClassIndex(36229);
            }

            public final boolean onPreDraw() {
                b.this.getViewTreeObserver().removeOnPreDrawListener(this);
                b bVar = b.this;
                if (bVar.q) {
                    bVar.p.removeMessages(1);
                    bVar.p.sendEmptyMessageDelayed(1, bVar.r);
                    bVar.a();
                }
                b.this.o.b(b.this.f58300a);
                return true;
            }
        });
        if (this.A && this.E == null) {
            Timer timer = new Timer();
            this.E = timer;
            timer.scheduleAtFixedRate(new TimerTask() {
                /* class com.ss.android.ad.splash.core.b.AnonymousClass7 */

                static {
                    Covode.recordClassIndex(36230);
                }

                public final void run() {
                    Message obtainMessage = b.this.p.obtainMessage();
                    obtainMessage.what = 2;
                    b.this.p.sendMessage(obtainMessage);
                }
            }, (this.r % 1000) + 1000, 1000);
        }
        com.ss.android.ad.splash.f.g.b("onAttachedToWindow");
        k.a().a(this.f58300a.f58441d, 1000);
    }

    private void e() {
        g gVar = this.n;
        if (gVar != null) {
            gVar.d();
            this.n = null;
        }
        RotateAnimation rotateAnimation = this.f58307h;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
            this.f58307h = null;
        }
        BDASplashImageView bDASplashImageView = this.f58301b;
        if (bDASplashImageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) bDASplashImageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f58301b.setImageBitmap(null);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        f.a().b();
        com.ss.android.ad.splash.core.video2.g gVar2 = this.x;
        if (gVar2 != null) {
            gVar2.j();
            this.x = null;
            this.w = null;
        }
        if (this.E != null) {
            com.ss.android.ad.splash.f.g.b("splash_count_down. detach: timer canceled");
            this.E.cancel();
            this.E = null;
        }
    }

    public final void setSplashAdInteraction(p pVar) {
        this.o = pVar;
    }

    /* access modifiers changed from: package-private */
    public final com.ss.android.ad.splash.core.video2.b c(final com.ss.android.ad.splash.core.e.b bVar) {
        return new com.ss.android.ad.splash.core.video2.c() {
            /* class com.ss.android.ad.splash.core.b.AnonymousClass5 */

            static {
                Covode.recordClassIndex(36228);
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void b() {
                b.this.o.a();
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void a() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.f58440c);
                    String str = "not_real_time";
                    if (bVar.C) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    int i2 = 1;
                    jSONObject.putOpt("play_order", 1);
                    if (h.X != -1) {
                        if (h.X != 1) {
                            i2 = 2;
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
                    aVar.f58598a = j.a((a) bVar);
                    com.ss.android.ad.splash.core.i.c a2 = aVar.a();
                    if (h.a().f58910b) {
                        h.g().a(b.this.f58301b, "play", bVar.f58441d, bVar.r.f58522a, bVar.f58447j, true, -1, null, a2);
                    } else {
                        h.g().c(b.this.f58301b, bVar.f58441d, bVar.r.f58522a, bVar.f58447j, true, -1, null, a2);
                    }
                }
                com.ss.android.ad.splash.core.i.a h2 = h.h();
                long g2 = (long) b.this.x.g();
                b.this.x.c();
                b.this.x.d();
                h2.a(g2);
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void a(int i2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("duration", Long.toString((long) i2));
                    jSONObject.put("percent", Integer.toString(100));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f58439b);
                    if (!l.a(bVar.f58447j)) {
                        jSONObject.put("log_extra", bVar.f58447j);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject = null;
                }
                h.a(bVar.f58441d, "splash_ad", "play_over", jSONObject);
                if (bVar.r != null) {
                    c.a aVar = new c.a();
                    aVar.f58598a = j.a((a) bVar);
                    com.ss.android.ad.splash.core.i.c a2 = aVar.a();
                    if (h.a().f58910b) {
                        h.g().a(b.this.f58301b, "play_over", bVar.f58441d, bVar.r.f58523b, bVar.f58447j, true, -1, null, a2);
                    } else {
                        h.g().d(b.this.f58301b, bVar.f58441d, bVar.r.f58523b, bVar.f58447j, true, -1, null, a2);
                    }
                }
                h.h().d();
                b.this.o.a(bVar);
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

            @Override // com.ss.android.ad.splash.core.video2.c
            public final void d(int i2, int i3) {
                h.h().c();
                a(i2, i3, "third_quartile");
            }

            @Override // com.ss.android.ad.splash.core.video2.b, com.ss.android.ad.splash.core.video2.c
            public final void a(int i2, int i3) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = (long) i2;
                    jSONObject.put("duration", Long.toString(j2));
                    jSONObject.put("percent", m.a(j2, (long) i3));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f58439b);
                    jSONObject.put("break_reason", b.this.y);
                    if (!l.a(bVar.f58447j)) {
                        jSONObject.put("log_extra", bVar.f58447j);
                    }
                    jSONObject2.put("break_reason", b.this.y);
                    jSONObject2.putOpt("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject = null;
                }
                h.a(bVar.f58441d, "splash_ad", "play_break", jSONObject);
                if (b.this.y != 1) {
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
                    jSONObject.put("percent", m.a((long) i2, j2));
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

    /* access modifiers changed from: package-private */
    public final void setImageTouchListener(final com.ss.android.ad.splash.core.e.b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ad.splash.core.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(36218);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                if ((b.this.getTouchDelegate() == null || !b.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (b.this.s) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    c.a aVar = new c.a();
                    aVar.f58461a = 0;
                    c.a a2 = aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    a2.f58464d = b.this.s;
                    a2.f58463c = str;
                    b.this.o.a(bVar, a2.a());
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void setSplashAdListener(final com.ss.android.ad.splash.core.e.b bVar) {
        this.n.f58805e = new b.a() {
            /* class com.ss.android.ad.splash.core.b.AnonymousClass14 */

            static {
                Covode.recordClassIndex(36223);
            }

            @Override // com.ss.android.ad.splash.core.video.b.a
            public final void a() {
                b.this.o.a();
            }

            @Override // com.ss.android.ad.splash.core.video.b.a
            public final void b() {
                b.this.o.a(bVar, -1);
            }

            @Override // com.ss.android.ad.splash.core.video.b.a
            public final void c() {
                b.this.o.a(bVar);
            }

            @Override // com.ss.android.ad.splash.core.video.b.a
            public final void a(long j2) {
                com.ss.android.ad.splash.f.g.b("Video play Complete ".concat(String.valueOf(j2)));
                b.this.o.a(bVar);
            }

            @Override // com.ss.android.ad.splash.core.video.b.a
            public final void a(int i2, int i3) {
                c.a aVar = new c.a();
                aVar.f58462b = true;
                b.this.o.b(bVar, aVar.a(i2, i3).a());
            }
        };
    }

    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        if (i2 == 4 || i2 == 8) {
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setSkipClickListener(final com.ss.android.ad.splash.core.e.b bVar) {
        this.t.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.b.AnonymousClass12 */

            static {
                Covode.recordClassIndex(36221);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (b.this.n != null) {
                    b.this.n.c();
                }
                if (b.this.x != null) {
                    b.this.y = 2;
                    b.this.x.b();
                }
                b.this.o.a(bVar, -1);
            }
        });
        this.f58304e.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ad.splash.core.b.AnonymousClass13 */

            static {
                Covode.recordClassIndex(36222);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (b.this.n != null) {
                    b.this.n.c();
                }
                if (b.this.x != null) {
                    b.this.y = 2;
                    b.this.x.b();
                }
                if (h.x) {
                    b bVar = b.this;
                    bVar.f58305f.setVisibility(4);
                    bVar.f58306g.setVisibility(0);
                    bVar.f58307h = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                    bVar.f58307h.setDuration(800);
                    bVar.f58307h.setRepeatCount(-1);
                    bVar.f58307h.setRepeatMode(1);
                    bVar.f58307h.setInterpolator(new LinearInterpolator());
                    bVar.f58306g.startAnimation(bVar.f58307h);
                }
                b.this.o.a(bVar, -1);
            }
        });
    }

    static String a(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (h.y != 0) {
            return com.a.a("%ds %s", new Object[]{Integer.valueOf(i2), h.r.getResources().getString(h.y)});
        }
        return com.a.a("%ds %s", new Object[]{Integer.valueOf(i2), h.r.getResources().getString(R.string.g37)});
    }

    /* access modifiers changed from: package-private */
    public final void setSkipAndWifiPreloadLayout(com.ss.android.ad.splash.core.e.b bVar) {
        if (bVar.v()) {
            if (bVar.o == 1) {
                this.t.setVisibility(0);
            } else {
                this.t.setVisibility(8);
            }
            if (h.D) {
                this.v.setVisibility(0);
            }
            this.D.setVisibility(0);
            a(bVar.v(), bVar.g());
            return;
        }
        if (bVar.o == 1) {
            this.f58304e.setVisibility(0);
        } else {
            this.f58304e.setVisibility(8);
            d();
        }
        if (h.D) {
            this.f58310k.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setSplashInfoStyle(com.ss.android.ad.splash.core.e.b bVar) {
        if (!bVar.v()) {
            if (!bVar.g() && h.B == 1) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                int a2 = (int) o.a(getContext(), 10.0f);
                layoutParams.setMargins(0, 0, a2, (int) o.a(getContext(), 10.0f));
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.addRule(21);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(a2);
                this.f58304e.setLayoutParams(layoutParams);
                d();
            } else if (bVar.o != 1) {
                d();
            }
        }
    }

    @Override // com.ss.android.ad.splash.f.q.a
    public final void a(Message message) {
        if (message.what == 1) {
            com.ss.android.ad.splash.f.g.b("display timeout");
            Timer timer = this.E;
            if (timer != null) {
                timer.cancel();
                this.E = null;
            }
            this.o.a(this.f58300a);
        } else if (message.what == 2) {
            int i2 = this.z - 1;
            this.z = i2;
            com.ss.android.ad.splash.f.g.b("splash count down. display seconds left: ".concat(String.valueOf(i2)));
            if (i2 == 0) {
                Timer timer2 = this.E;
                if (timer2 != null) {
                    timer2.cancel();
                    this.E = null;
                    return;
                }
                return;
            }
            String a2 = a(i2);
            this.f58305f.setText(a2);
            this.u.setText(a2);
        }
    }

    public b(Context context) {
        super(context);
        MethodCollector.i(2415);
        inflate(getContext(), R.layout.b1n, this);
        if (h.A != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), h.A).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Throwable unused) {
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (o.d(getContext())) {
            findViewById(R.id.e87).setVisibility(0);
        }
        try {
            this.f58301b = (BDASplashImageView) findViewById(R.id.e8i);
            try {
                this.w = (BDASplashVideoView) findViewById(R.id.e8h);
                this.f58303d = (Space) findViewById(R.id.rf);
                this.f58310k = (TextView) findViewById(R.id.gh);
                this.f58311l = findViewById(R.id.e8a);
                this.f58312m = (TextView) findViewById(R.id.e8c);
                this.f58304e = (ViewGroup) findViewById(R.id.ep);
                this.f58305f = (TextView) findViewById(R.id.gf);
                this.f58302c = (ImageView) findViewById(R.id.gk);
                this.t = (FrameLayout) findViewById(R.id.d1);
                this.u = (TextView) findViewById(R.id.d2);
                this.C = (Space) findViewById(R.id.d0);
                this.v = (TextView) findViewById(R.id.d4);
                this.D = (TextView) findViewById(R.id.d3);
                if (h.v != 0) {
                    this.f58310k.setText(h.v);
                    this.v.setText(h.v);
                } else {
                    this.f58310k.setText(R.string.g3_);
                    this.v.setText(R.string.g3_);
                }
                if (h.y != 0) {
                    this.f58305f.setText(h.y);
                } else {
                    this.f58305f.setText(R.string.g37);
                }
                if (h.w != 0) {
                    this.f58305f.setBackgroundResource(h.w);
                    this.u.setBackgroundResource(h.w);
                }
                this.f58306g = (ImageView) findViewById(R.id.ge);
                if (h.C != 0) {
                    this.f58306g.setImageResource(h.C);
                } else {
                    this.f58306g.setImageResource(2131233863);
                }
                this.f58308i = (ViewGroup) findViewById(R.id.e8g);
                this.f58309j = (FrameLayout) findViewById(R.id.e8f);
                if (this.f58301b != null && h.O == 1) {
                    this.f58301b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                MethodCollector.o(2415);
            } catch (ClassCastException e2) {
                RuntimeException runtimeException = new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(R.id.e8h).getClass().getClassLoader(), e2);
                MethodCollector.o(2415);
                throw runtimeException;
            }
        } catch (ClassCastException e3) {
            RuntimeException runtimeException2 = new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(R.id.e8i).getClass().getClassLoader(), e3);
            MethodCollector.o(2415);
            throw runtimeException2;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(final com.ss.android.ad.splash.core.e.b bVar) {
        int i2;
        try {
            boolean g2 = bVar.g();
            a(bVar.v(), g2);
            if (g2) {
                ViewGroup.LayoutParams layoutParams = this.f58303d.getLayoutParams();
                layoutParams.height = j.a();
                this.f58303d.setLayoutParams(layoutParams);
                this.f58303d.setVisibility(4);
                this.f58302c.setVisibility(8);
            } else {
                this.f58303d.setVisibility(8);
                this.f58302c.setVisibility(0);
            }
            if (h.D && bVar.f58450m == 1) {
                if (bVar.v()) {
                    this.v.setVisibility(0);
                } else {
                    this.f58310k.setVisibility(0);
                }
            }
            com.ss.android.ad.splash.core.e.f fVar = bVar.f58438a;
            String b2 = j.b(fVar);
            if (l.a(b2)) {
                return false;
            }
            if (h.f58576e == null) {
                return false;
            }
            if (TextUtils.isEmpty(fVar.f58481e)) {
                h.f58576e.a(this.f58301b, b2, bVar.f58450m, new p() {
                    /* class com.ss.android.ad.splash.core.b.AnonymousClass3 */

                    static {
                        Covode.recordClassIndex(36226);
                    }

                    @Override // com.ss.android.ad.splash.p
                    public final void a() {
                    }

                    @Override // com.ss.android.ad.splash.p
                    public final void c() {
                        b.this.o.a();
                    }

                    @Override // com.ss.android.ad.splash.p
                    public final void b() {
                        b.this.o.a(bVar);
                    }
                });
            } else {
                h.f58576e.a(this.f58301b, b2, bVar.f58450m, fVar.f58481e, new p() {
                    /* class com.ss.android.ad.splash.core.b.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(36227);
                    }

                    @Override // com.ss.android.ad.splash.p
                    public final void a() {
                    }

                    @Override // com.ss.android.ad.splash.p
                    public final void c() {
                        b.this.o.a();
                    }

                    @Override // com.ss.android.ad.splash.p
                    public final void b() {
                        b.this.o.a(bVar);
                    }
                });
            }
            if (bVar.q == 0 || bVar.q == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f58440c));
                String str = "not_real_time";
                if (bVar.C) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (h.X != -1) {
                    if (h.X == 1) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                    jSONObject.put("awemelaunch", i2);
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
                aVar.f58598a = j.a((a) bVar);
                com.ss.android.ad.splash.core.i.c a2 = aVar.a();
                if (h.a().f58910b) {
                    h.g().a(this.f58301b, "show", bVar.f58441d, bVar.x, bVar.f58447j, true, -1, null, a2);
                } else {
                    h.g().a(this.f58301b, bVar.f58441d, bVar.x, bVar.f58447j, true, -1, null, a2);
                }
            }
            this.f58301b.f58292a = bVar;
            this.f58301b.setInteraction(this.o);
            this.f58301b.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.o.a();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(final com.ss.android.ad.splash.core.e.b bVar) {
        boolean z2;
        boolean z3;
        if (bVar.r == null || bVar.f58438a == null) {
            return false;
        }
        String str = "real_time";
        if (h.Z) {
            this.w.setVisibility(0);
            int i2 = getResources().getDisplayMetrics().heightPixels;
            if (bVar.g()) {
                i2 -= j.a();
                this.f58302c.setVisibility(8);
            } else {
                this.f58302c.setVisibility(0);
            }
            com.ss.android.ad.splash.core.e.p pVar = bVar.r;
            int i3 = bVar.f58438a.f58479c;
            int i4 = pVar.f58528g;
            if (i3 == 0 || i4 == 0) {
                return false;
            }
            boolean b2 = b(bVar);
            com.ss.android.ad.splash.core.video2.g a2 = j.a(this.w);
            this.x = a2;
            a2.a(c(bVar));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i5 = (i2 - ((int) (((float) i4) * (((float) i2) / ((float) i3))))) / 2;
            layoutParams.topMargin = i5;
            layoutParams.bottomMargin = i5;
            this.w.setSurfaceLayoutParams(layoutParams);
            String b3 = j.b(pVar);
            if (l.a(b3)) {
                return false;
            }
            if (!this.x.a(b3, pVar.f58530i) || !b2) {
                z3 = false;
            } else {
                z3 = true;
            }
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            setOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.b.AnonymousClass9 */

                static {
                    Covode.recordClassIndex(36232);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        c.a aVar = new c.a();
                        aVar.f58462b = false;
                        boolean b2 = b.this.o.b(bVar, aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                        if (b.this.x != null && b2) {
                            b.this.y = 1;
                            b.this.x.b();
                        }
                    }
                    return true;
                }
            });
            this.w.setTextureViewOnTouchListener(new View.OnTouchListener() {
                /* class com.ss.android.ad.splash.core.b.AnonymousClass10 */

                static {
                    Covode.recordClassIndex(36219);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        c.a aVar = new c.a();
                        aVar.f58462b = true;
                        boolean b2 = b.this.o.b(bVar, aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                        if (b.this.x != null && b2) {
                            b.this.y = 1;
                            b.this.x.b();
                        }
                    }
                    return true;
                }
            });
            if (z3) {
                f.a().a(bVar, h.r);
                f.a().a(this.x, bVar.O, bVar.c());
                a();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!bVar.C) {
                        str = "not_real_time";
                    }
                    jSONObject.putOpt("show_type", str);
                    jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f58440c));
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    jSONObject2.putOpt("log_extra", bVar.f58447j);
                    jSONObject2.putOpt("ad_fetch_time", Long.valueOf(bVar.f58439b));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                    jSONObject2 = null;
                }
                h.a(bVar.f58441d, "splash_ad", "banner_show", jSONObject2);
            }
            return z3;
        }
        this.f58308i.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f58308i.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.f58308i.setLayoutParams(layoutParams2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i6 = displayMetrics.heightPixels;
        if (bVar.g()) {
            i6 -= j.a();
            this.f58302c.setVisibility(8);
        } else {
            this.f58302c.setVisibility(0);
        }
        com.ss.android.ad.splash.core.e.p pVar2 = bVar.r;
        int i7 = bVar.f58438a.f58479c;
        int i8 = pVar2.f58528g;
        if (i7 == 0 || i8 == 0) {
            return false;
        }
        boolean b4 = b(bVar);
        int i9 = (int) (((float) i8) * (((float) i6) / ((float) i7)));
        this.n = new g(h.r, this.f58309j);
        setSplashAdListener(bVar);
        String b5 = j.b(pVar2);
        if (l.a(b5)) {
            return false;
        }
        f.a aVar = new f.a();
        aVar.f58788a = b5;
        aVar.f58789b = pVar2.f58525d;
        aVar.f58790c = bVar.f58441d;
        aVar.f58791d = displayMetrics.widthPixels;
        aVar.f58792e = i9;
        aVar.f58793f = pVar2.f58522a;
        aVar.f58794g = bVar.f58447j;
        aVar.f58795h = (i6 - i9) / 2;
        aVar.f58798k = bVar.f58440c;
        aVar.f58796i = false;
        aVar.f58797j = false;
        aVar.n = bVar.v();
        aVar.p = bVar.T;
        aVar.q = j.a((a) bVar);
        com.ss.android.ad.splash.core.video.f a3 = aVar.a();
        this.n.f58806f = bVar.C;
        if (!this.n.a(a3) || !b4) {
            z2 = false;
        } else {
            z2 = true;
        }
        setSkipAndWifiPreloadLayout(bVar);
        setSkipClickListener(bVar);
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.ss.android.ad.splash.core.b.AnonymousClass11 */

            static {
                Covode.recordClassIndex(36220);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (b.this.n != null) {
                        b.this.n.c();
                    }
                    c.a aVar = new c.a();
                    aVar.f58462b = false;
                    b.this.o.b(bVar, aVar.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).a());
                }
                return true;
            }
        });
        if (z2) {
            a();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            try {
                if (!bVar.C) {
                    str = "not_real_time";
                }
                jSONObject3.putOpt("show_type", str);
                jSONObject3.putOpt("show_expected", Integer.valueOf(bVar.f58440c));
                jSONObject4.putOpt("ad_extra_data", jSONObject3);
                jSONObject4.putOpt("is_ad_event", "1");
                jSONObject4.putOpt("log_extra", bVar.f58447j);
                jSONObject4.putOpt("ad_fetch_time", Long.valueOf(bVar.f58439b));
            } catch (JSONException e3) {
                e3.printStackTrace();
                jSONObject4 = null;
            }
            h.a(bVar.f58441d, "splash_ad", "banner_show", jSONObject4);
        }
        return z2;
    }

    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 == 24) {
            com.ss.android.ad.splash.core.video2.f.a().c();
        } else if (i2 == 25) {
            com.ss.android.ad.splash.core.video2.f.a().c();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z2, boolean z3) {
        if (z2) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.C.getLayoutParams();
            layoutParams.height = j.h() - 4;
            this.C.setLayoutParams(layoutParams);
            int i2 = Build.VERSION.SDK_INT;
            this.t.setPaddingRelative(4, 4, 0, 4);
            if (!z3) {
                this.u.setBackgroundResource(R.drawable.bju);
                this.u.setTextColor(getResources().getColor(R.color.pa));
            } else {
                this.u.setBackgroundResource(R.drawable.bjt);
                this.u.setTextColor(getResources().getColor(R.color.pb));
            }
            this.D.setVisibility(0);
        }
    }
}
