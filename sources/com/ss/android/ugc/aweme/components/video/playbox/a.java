package com.ss.android.ugc.aweme.components.video.playbox;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.q;
import h.r;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public View f78133a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f78134b;

    /* renamed from: c  reason: collision with root package name */
    public RelativeLayout f78135c;

    /* renamed from: d  reason: collision with root package name */
    private Context f78136d;

    /* renamed from: e  reason: collision with root package name */
    private final ViewGroup f78137e;

    static {
        Covode.recordClassIndex(48444);
    }

    private final ViewGroup b() {
        Activity a2 = a(this.f78136d);
        if (a2 != null) {
            return (ViewGroup) a2.findViewById(16908290);
        }
        return null;
    }

    public final boolean a() {
        Activity a2;
        Window window;
        MethodCollector.i(13079);
        if (!this.f78134b) {
            MethodCollector.o(13079);
            return false;
        }
        this.f78134b = false;
        Context context = this.f78136d;
        a(context, true);
        Activity a3 = a(context);
        if (!(a3 == null || (window = a3.getWindow()) == null)) {
            window.clearFlags(1024);
            View decorView = window.getDecorView();
            if (decorView != null) {
                int i2 = Build.VERSION.SDK_INT;
                decorView.setSystemUiVisibility(1792);
            }
        }
        if (b(this.f78136d) && (a2 = a(this.f78136d)) != null) {
            a2.setRequestedOrientation(-1);
        }
        ViewGroup b2 = b();
        if (b2 != null) {
            b2.removeView(this.f78135c);
        }
        this.f78135c.removeAllViews();
        this.f78137e.addView(this.f78133a, new ViewGroup.LayoutParams(-1, -1));
        this.f78137e.requestLayout();
        MethodCollector.o(13079);
        return true;
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78139a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f78140b;

        static {
            Covode.recordClassIndex(48446);
        }

        b(a aVar, Activity activity) {
            this.f78139a = aVar;
            this.f78140b = activity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f78139a.a();
        }
    }

    private static Activity a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private boolean b(Context context) {
        Activity a2 = a(context);
        if (a2 == null) {
            return false;
        }
        try {
            PackageManager packageManager = a2.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ActivityInfo activityInfo = packageManager.getActivityInfo(a2.getComponentName(), 128);
            l.b(activityInfo, "");
            if (activityInfo == null || (activityInfo.configChanges & 128) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean a(View view) {
        Activity activity;
        ImageView imageView;
        Activity a2;
        Window window;
        MethodCollector.i(12992);
        if (this.f78134b) {
            MethodCollector.o(12992);
            return false;
        }
        this.f78134b = true;
        this.f78133a = view;
        this.f78135c.setFocusableInTouchMode(true);
        this.f78135c.requestFocus();
        Context context = this.f78136d;
        while (true) {
            if (context != null) {
                if (!(context instanceof Activity)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = (Activity) context;
                    break;
                }
            } else {
                break;
            }
        }
        activity = null;
        a(activity, false);
        Activity a3 = a(activity);
        if (!(a3 == null || (window = a3.getWindow()) == null)) {
            window.setFlags(1024, 1024);
            View decorView = window.getDecorView();
            if (decorView != null) {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = Build.VERSION.SDK_INT;
                decorView.setSystemUiVisibility(5894);
            }
        }
        try {
            if (b(activity) && (a2 = a(activity)) != null) {
                a2.setRequestedOrientation(0);
            }
            this.f78137e.removeView(this.f78133a);
            ViewGroup b2 = b();
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (b2 != null) {
                b2.addView(this.f78135c, layoutParams);
            }
            this.f78135c.addView(this.f78133a, new FrameLayout.LayoutParams(-1, -1));
            this.f78135c.setBackgroundColor(-16777216);
            LayoutInflater.from(activity).inflate(R.layout.va, this.f78135c);
            if (!(activity == null || (imageView = (ImageView) activity.findViewById(R.id.xv)) == null)) {
                imageView.setOnClickListener(new b(this, activity));
            }
            MethodCollector.o(12992);
            return true;
        } catch (Throwable th) {
            q.m223constructorimpl(r.a(th));
            MethodCollector.o(12992);
            return false;
        }
    }

    public static final class c extends RelativeLayout {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f78141a;

        static {
            Covode.recordClassIndex(48447);
        }

        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Context context, Context context2) {
            super(context2);
            this.f78141a = context;
            MethodCollector.i(12880);
            MethodCollector.o(12880);
        }
    }

    public a(Context context, ViewGroup viewGroup) {
        l.d(context, "");
        l.d(viewGroup, "");
        c cVar = new c(context, context);
        cVar.setOnKeyListener(new View$OnKeyListenerC1814a(this));
        this.f78135c = cVar;
        this.f78136d = context;
        this.f78137e = viewGroup;
    }

    private final void a(Context context, boolean z) {
        Method method;
        String str;
        try {
            Activity a2 = a(context);
            if (a2 != null && (method = a2.getClass().getMethod("getSupportActionBar", new Class[0])) != null) {
                method.setAccessible(true);
                Object invoke = method.invoke(a2, new Object[0]);
                if (invoke != null) {
                    Method method2 = invoke.getClass().getMethod("setShowHideAnimationEnabled", Boolean.TYPE);
                    l.b(method2, "");
                    method2.setAccessible(true);
                    method2.invoke(invoke, false);
                    Class<?> cls = invoke.getClass();
                    if (z) {
                        str = "show";
                    } else {
                        str = "hide";
                    }
                    Method method3 = cls.getMethod(str, new Class[0]);
                    l.b(method3, "");
                    method3.setAccessible(true);
                    method3.invoke(invoke, new Object[0]);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.components.video.playbox.a$a  reason: collision with other inner class name */
    static final class View$OnKeyListenerC1814a implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f78138a;

        static {
            Covode.recordClassIndex(48445);
        }

        View$OnKeyListenerC1814a(a aVar) {
            this.f78138a = aVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (!this.f78138a.f78134b) {
                return false;
            }
            l.b(keyEvent, "");
            if (keyEvent.getAction() != 1 || i2 != 4) {
                return false;
            }
            this.f78138a.a();
            return true;
        }
    }
}
