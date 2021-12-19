package com.ss.android.ugc.awemepushlib.g;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.l;
import androidx.customview.a.a;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.awemepushlib.interaction.i;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

public final class a extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final androidx.customview.a.a f145397a;

    /* renamed from: b  reason: collision with root package name */
    final ViewConfiguration f145398b;

    /* renamed from: c  reason: collision with root package name */
    View f145399c;

    /* renamed from: d  reason: collision with root package name */
    final Handler f145400d;

    /* renamed from: e  reason: collision with root package name */
    final long f145401e;

    /* renamed from: f  reason: collision with root package name */
    final int f145402f;

    /* renamed from: g  reason: collision with root package name */
    final long f145403g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f145404h;

    /* renamed from: i  reason: collision with root package name */
    final ImageView f145405i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f145406j;

    /* renamed from: k  reason: collision with root package name */
    int f145407k;

    /* renamed from: l  reason: collision with root package name */
    JSONObject f145408l;

    /* renamed from: m  reason: collision with root package name */
    final Runnable f145409m;
    final Runnable n;
    AbstractC3867a o;
    private boolean p;
    private final Intent q;
    private final com.ss.android.ugc.awemepushlib.c.b r;
    private float s;
    private float t;
    private b u;

    /* renamed from: com.ss.android.ugc.awemepushlib.g.a$a  reason: collision with other inner class name */
    public interface AbstractC3867a {
        static {
            Covode.recordClassIndex(95078);
        }
    }

    static {
        Covode.recordClassIndex(95072);
    }

    public final void computeScroll() {
        if (this.f145397a.c()) {
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        try {
            this.f145397a.b();
        } catch (Throwable unused) {
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.p) {
            this.f145400d.post(new Runnable() {
                /* class com.ss.android.ugc.awemepushlib.g.a.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(95075);
                }

                public final void run() {
                    a.this.f145399c.setTranslationY((float) (-a.this.f145399c.getHeight()));
                    a.this.f145399c.animate().translationY(0.0f).setInterpolator(new OvershootInterpolator()).setDuration(300).start();
                    a.this.f145400d.postDelayed(a.this.f145409m, a.this.f145403g);
                    i.a(a.this.getContext(), "news_notify_anim_push_show", a.this.f145401e, (long) a.this.f145402f, a.this.f145408l);
                }
            });
            this.p = false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f145399c.animate().translationY((float) (-this.f145399c.getHeight())).setDuration(300).start();
        this.f145400d.postDelayed(this.n, 300);
    }

    final class b implements Runnable {
        static {
            Covode.recordClassIndex(95079);
        }

        public final void run() {
            if (!a.this.f145404h || !a.this.f145406j) {
                a.this.performClick();
                return;
            }
            ViewGroup.LayoutParams layoutParams = a.this.getLayoutParams();
            if (layoutParams instanceof WindowManager.LayoutParams) {
                try {
                    ((WindowManager.LayoutParams) layoutParams).flags = 128;
                    ((WindowManager) a(a.this.getContext(), "window")).updateViewLayout(a.this, layoutParams);
                    a.this.f145400d.post(new Runnable() {
                        /* class com.ss.android.ugc.awemepushlib.g.a.b.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(95080);
                        }

                        public final void run() {
                            a.this.performClick();
                        }
                    });
                } catch (Throwable unused) {
                }
            }
        }

        private b() {
        }

        /* synthetic */ b(a aVar, byte b2) {
            this();
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(7644);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                    try {
                        new com.bytedance.platform.godzilla.b.b.b().a();
                        com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                            } catch (Exception e2) {
                                d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                    } finally {
                        MethodCollector.o(7644);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void setDismissListener(AbstractC3867a aVar) {
        this.o = aVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f145397a.a(motionEvent);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        l.a(getContext()).a("app_notify_ame", i2);
    }

    private static String b(int i2) {
        if (i2 > 9) {
            return String.valueOf(i2);
        }
        return "0".concat(String.valueOf(i2));
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        Context context = getContext();
        Intent intent = this.q;
        com.ss.android.ugc.tiktok.security.a.a.a(intent, context);
        context.startActivity(intent);
        a(com.ss.android.ugc.awemepushlib.c.b.getShortMsgID(this.f145401e));
        this.f145400d.removeCallbacks(this.f145409m);
        a();
        com.ss.android.ugc.awemepushlib.interaction.i.a(getContext(), "news_notify_anim_push_click", this.f145401e, (long) this.f145402f, this.f145408l);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f145400d.removeCallbacks(this.f145409m);
        this.f145397a.b(motionEvent);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.s = x;
            this.t = y;
            this.u = new b(this, (byte) 0);
        } else if (actionMasked == 1) {
            if (Math.abs(x - this.s) >= ((float) this.f145398b.getScaledTouchSlop()) || Math.abs(y - this.t) >= ((float) this.f145398b.getScaledTouchSlop())) {
                this.u = null;
            } else {
                b bVar = this.u;
                if (bVar != null) {
                    bVar.run();
                }
            }
            this.u = null;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.u = null;
            }
        } else if (Math.abs(x - this.s) >= ((float) this.f145398b.getScaledTouchSlop()) || Math.abs(y - this.t) >= ((float) this.f145398b.getScaledTouchSlop())) {
            this.u = null;
        }
        return true;
    }

    public a(Context context, int i2, com.ss.android.ugc.awemepushlib.c.b bVar, Bitmap bitmap, Intent intent, long j2, int i3) {
        this(context, i2, bVar, bitmap, intent, j2, i3, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private a(Context context, int i2, com.ss.android.ugc.awemepushlib.c.b bVar, Bitmap bitmap, Intent intent, long j2, int i3, byte b2) {
        super(context);
        int i4;
        int i5;
        int i6;
        long j3 = j2;
        MethodCollector.i(7649);
        this.p = true;
        this.f145400d = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
            /* class com.ss.android.ugc.awemepushlib.g.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(95073);
            }

            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
            }
        });
        this.f145409m = new Runnable() {
            /* class com.ss.android.ugc.awemepushlib.g.a.AnonymousClass4 */

            static {
                Covode.recordClassIndex(95076);
            }

            public final void run() {
                a.this.a();
            }
        };
        this.n = new Runnable() {
            /* class com.ss.android.ugc.awemepushlib.g.a.AnonymousClass5 */

            static {
                Covode.recordClassIndex(95077);
            }

            public final void run() {
                try {
                    if (a.this.f145405i != null) {
                        a.this.f145405i.setImageDrawable(null);
                    }
                } catch (Throwable unused) {
                }
                if (a.this.f145406j) {
                    try {
                        Context applicationContext = a.this.getContext().getApplicationContext();
                        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c) {
                            if (applicationContext == null) {
                                applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                            }
                        }
                        WindowManager windowManager = (WindowManager) a(applicationContext, "window");
                        a aVar = a.this;
                        if (!((Boolean) com.bytedance.helios.sdk.a.a(windowManager, new Object[]{aVar}, 102801, "void", false, null).first).booleanValue()) {
                            windowManager.removeView(aVar);
                            com.bytedance.helios.sdk.a.a(null, windowManager, new Object[]{aVar}, 102801, "com_ss_android_ugc_awemepushlib_widget_AnimatablePushView$5_android_view_WindowManager_removeView(Landroid/view/WindowManager;Landroid/view/View;)V");
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }

            private static Object a(Context context, String str) {
                Object obj;
                MethodCollector.i(9035);
                if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                    if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                        try {
                            new com.bytedance.platform.godzilla.b.b.b().a();
                            com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                            obj = context.getSystemService(str);
                        } catch (Throwable unused) {
                        }
                    }
                    obj = context.getSystemService(str);
                } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
                    synchronized (ClipboardManager.class) {
                        try {
                            obj = context.getSystemService(str);
                            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                                try {
                                    Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                    declaredField.setAccessible(true);
                                    declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                                } catch (Exception e2) {
                                    d.a(e2, "ClipboardManager Handler Reflect Fail");
                                }
                            }
                            com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                        } finally {
                            MethodCollector.o(9035);
                        }
                    }
                } else {
                    obj = context.getSystemService(str);
                }
                return obj;
            }
        };
        this.q = intent;
        this.f145402f = i2;
        this.r = bVar;
        this.f145407k = i3;
        this.f145401e = bVar.id;
        this.f145403g = j3 <= 0 ? 5000 : j3;
        this.f145404h = "oppo".equalsIgnoreCase(Build.BRAND);
        this.f145406j = true;
        try {
            JSONObject jSONObject = new JSONObject();
            this.f145408l = jSONObject;
            jSONObject.put("isWindowMode", 1);
            JSONObject jSONObject2 = this.f145408l;
            if (intent.getBooleanExtra("message_with_pic", false)) {
                i5 = 1;
            } else {
                i5 = 0;
            }
            jSONObject2.put("with_pic", i5);
            JSONObject jSONObject3 = this.f145408l;
            if (intent.getBooleanExtra("message_download_pic", false)) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            jSONObject3.put("download_pic", i6);
        } catch (Throwable unused) {
        }
        String str = bVar.title;
        str = TextUtils.isEmpty(str) ? context.getString(R.string.uh) : str;
        if (!this.f145404h || com.ss.android.ugc.awemepushlib.manager.a.a().f145508j > 0) {
            int i7 = this.f145407k;
            if ((i7 == 11 || i7 == 21) && bitmap != null && !bVar.functionalPush) {
                Calendar instance = Calendar.getInstance();
                LayoutInflater from = LayoutInflater.from(context);
                if (this.f145407k == 11) {
                    i4 = R.layout.aqw;
                } else {
                    i4 = R.layout.aqx;
                }
                View a2 = com.a.a(from, i4, this, false);
                this.f145399c = a2;
                if (this.f145407k == 21) {
                    ((TextView) a2.findViewById(R.id.title)).setText(str);
                }
                ((TextView) this.f145399c.findViewById(R.id.time)).setText(b(instance.get(11)) + ":" + b(instance.get(12)));
                ((TextView) this.f145399c.findViewById(R.id.fad)).setText(bVar.text);
                ((TextView) this.f145399c.findViewById(R.id.title)).setText(str);
            } else {
                View a3 = com.a.a(LayoutInflater.from(context), R.layout.amg, this, false);
                this.f145399c = a3;
                ((TextView) a3.findViewById(R.id.title)).setText(str);
                ((TextView) this.f145399c.findViewById(R.id.ak7)).setText(bVar.text);
            }
        } else {
            this.f145399c = com.a.a(LayoutInflater.from(context), R.layout.ams, this, false);
            ((TextView) this.f145399c.findViewById(R.id.time)).setText(new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date()));
            ((TextView) this.f145399c.findViewById(R.id.title)).setText(str);
            ((TextView) this.f145399c.findViewById(R.id.ak7)).setText(bVar.text);
        }
        addView(this.f145399c);
        ImageView imageView = (ImageView) findViewById(R.id.bmk);
        this.f145405i = imageView;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setImageResource(R.drawable.ao7);
        }
        this.f145397a = androidx.customview.a.a.a(this, new a.AbstractC0038a() {
            /* class com.ss.android.ugc.awemepushlib.g.a.AnonymousClass2 */

            static {
                Covode.recordClassIndex(95074);
            }

            @Override // androidx.customview.a.a.AbstractC0038a
            public final int c(View view, int i2) {
                return i2;
            }

            @Override // androidx.customview.a.a.AbstractC0038a
            public final int a(View view) {
                return view.getWidth();
            }

            @Override // androidx.customview.a.a.AbstractC0038a
            public final boolean b(View view, int i2) {
                if (view == a.this.f145399c) {
                    return true;
                }
                return false;
            }

            @Override // androidx.customview.a.a.AbstractC0038a
            public final void a(View view, float f2, float f3) {
                int i2;
                if (Math.abs(f2) > ((float) (a.this.f145398b.getScaledMaximumFlingVelocity() / 5)) || ((float) Math.abs(view.getLeft())) >= ((float) a.this.getWidth()) * 0.2f) {
                    androidx.customview.a.a aVar = a.this.f145397a;
                    if (f2 > 0.0f) {
                        i2 = a.this.getWidth();
                    } else {
                        i2 = -a.this.getWidth();
                    }
                    aVar.a(view, i2, 0);
                    a aVar2 = a.this;
                    aVar2.a(com.ss.android.ugc.awemepushlib.c.b.getShortMsgID(aVar2.f145401e));
                    a.this.f145400d.postDelayed(a.this.n, 300);
                } else {
                    a.this.f145397a.a(view, 0, 0);
                    a.this.f145400d.postDelayed(a.this.f145409m, 5000);
                }
                a.this.postInvalidate();
            }

            @Override // androidx.customview.a.a.AbstractC0038a
            public final void a(View view, int i2, int i3, int i4, int i5) {
                a.this.setAlpha(1.0f - (((float) Math.abs(i2)) / ((float) a.this.getWidth())));
            }
        });
        this.f145398b = ViewConfiguration.get(context);
        setOnClickListener(this);
        MethodCollector.o(7649);
    }
}
