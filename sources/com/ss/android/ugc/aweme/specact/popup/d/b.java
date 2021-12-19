package com.ss.android.ugc.aweme.specact.popup.d;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;

public final class b extends PopupWindow implements View.OnClickListener, com.bytedance.ies.dmt.ui.frameworkui.a {

    /* renamed from: i  reason: collision with root package name */
    public static boolean f134625i;

    /* renamed from: j  reason: collision with root package name */
    public static final C3500b f134626j = new C3500b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f134627a = 5000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f134628b;

    /* renamed from: c  reason: collision with root package name */
    public long f134629c;

    /* renamed from: d  reason: collision with root package name */
    public a f134630d;

    /* renamed from: e  reason: collision with root package name */
    public View f134631e;

    /* renamed from: f  reason: collision with root package name */
    public PullUpLayout f134632f;

    /* renamed from: g  reason: collision with root package name */
    public View f134633g;

    /* renamed from: h  reason: collision with root package name */
    public final Activity f134634h;

    /* renamed from: k  reason: collision with root package name */
    private ImageView f134635k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f134636l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f134637m;
    private ImageView n;
    private TextView o;
    private final a p;

    /* access modifiers changed from: package-private */
    public interface a extends Runnable {
        static {
            Covode.recordClassIndex(87962);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(87961);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.popup.d.b$b  reason: collision with other inner class name */
    public static final class C3500b {
        static {
            Covode.recordClassIndex(87963);
        }

        private C3500b() {
        }

        public /* synthetic */ C3500b(byte b2) {
            this();
        }
    }

    public final void dismiss() {
        f134625i = false;
        super.dismiss();
    }

    private final void d() {
        com.ss.android.ugc.aweme.specact.popup.e.a.a(this.f134634h, this.p.f134623d);
    }

    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134638a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f134639b;

        static {
            Covode.recordClassIndex(87964);
        }

        @Override // com.ss.android.ugc.aweme.specact.popup.d.b.a
        public final void a() {
            this.f134639b = true;
        }

        @Override // com.ss.android.ugc.aweme.specact.popup.d.b.a
        public final void b() {
            this.f134639b = false;
        }

        public final void run() {
            if (!this.f134639b && System.currentTimeMillis() >= this.f134638a.f134629c && this.f134638a.isShowing()) {
                this.f134638a.c();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f134638a = bVar;
        }
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void a() {
        this.f134628b = false;
        if (isShowing()) {
            r.a("watch_task_push_click", new com.ss.android.ugc.aweme.app.f.d().a("button_name", "close").f66730a);
            c();
        }
    }

    public final void c() {
        if (isShowing() && !this.f134628b) {
            try {
                if (!this.f134634h.isFinishing()) {
                    PullUpLayout pullUpLayout = this.f134632f;
                    if (pullUpLayout == null) {
                        l.a("mPullUpLayout");
                    }
                    pullUpLayout.a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    static final class d implements PullUpLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f134640a;

        static {
            Covode.recordClassIndex(87965);
        }

        d(b bVar) {
            this.f134640a = bVar;
        }

        @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout.b
        public final void a(MotionEvent motionEvent) {
            l.b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f134640a.f134628b = true;
                this.f134640a.f134630d.a();
            } else if (action == 1) {
                this.f134640a.f134628b = false;
                this.f134640a.f134629c = System.currentTimeMillis() + ((long) this.f134640a.f134627a);
                this.f134640a.f134630d.b();
                View view = this.f134640a.f134633g;
                if (view == null) {
                    l.a("mRootView");
                }
                view.postDelayed(this.f134640a.f134630d, (long) this.f134640a.f134627a);
            } else if (action == 2) {
                this.f134640a.f134628b = true;
            }
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        l.d(view, "");
        int id = view.getId();
        if (id == R.id.dqk) {
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                r.a("watch_task_push_click", new com.ss.android.ugc.aweme.app.f.d().a("button_name", "ok").f66730a);
                d();
                c();
            }
        } else if (id == R.id.bck) {
            r.a("watch_task_push_click", new com.ss.android.ugc.aweme.app.f.d().a("button_name", "ok").f66730a);
            d();
            c();
        } else if (id == R.id.a7x) {
            r.a("watch_task_push_click", new com.ss.android.ugc.aweme.app.f.d().a("button_name", "close").f66730a);
            c();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(11763);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(11763);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Activity activity, a aVar) {
        super(activity);
        l.d(activity, "");
        l.d(aVar, "");
        MethodCollector.i(11610);
        this.f134634h = activity;
        this.p = aVar;
        Object a2 = a(com.bytedance.ies.ugc.appcontext.d.a(), "layout_inflater");
        if (a2 != null) {
            View inflate = ((LayoutInflater) a2).inflate(R.layout.b1c, (ViewGroup) null);
            l.b(inflate, "");
            this.f134631e = inflate;
            View findViewById = inflate.findViewById(R.id.ddo);
            l.b(findViewById, "");
            this.f134632f = (PullUpLayout) findViewById;
            View findViewById2 = inflate.findViewById(R.id.dqk);
            l.b(findViewById2, "");
            this.f134633g = findViewById2;
            View findViewById3 = inflate.findViewById(R.id.bix);
            l.b(findViewById3, "");
            this.f134635k = (ImageView) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.title_tv);
            l.b(findViewById4, "");
            this.f134636l = (TextView) findViewById4;
            View findViewById5 = inflate.findViewById(R.id.message_tv);
            l.b(findViewById5, "");
            this.f134637m = (TextView) findViewById5;
            View findViewById6 = inflate.findViewById(R.id.a7x);
            l.b(findViewById6, "");
            this.n = (ImageView) findViewById6;
            View findViewById7 = inflate.findViewById(R.id.bck);
            l.b(findViewById7, "");
            TextView textView = (TextView) findViewById7;
            this.o = textView;
            if (textView == null) {
                l.a("mGoTv");
            }
            textView.setOnClickListener(this);
            ImageView imageView = this.n;
            if (imageView == null) {
                l.a("mCloseTv");
            }
            imageView.setOnClickListener(this);
            View view = this.f134633g;
            if (view == null) {
                l.a("mRootView");
            }
            view.setOnClickListener(this);
            PullUpLayout pullUpLayout = this.f134632f;
            if (pullUpLayout == null) {
                l.a("mPullUpLayout");
            }
            View view2 = this.f134633g;
            if (view2 == null) {
                l.a("mRootView");
            }
            pullUpLayout.a(view2);
            PullUpLayout pullUpLayout2 = this.f134632f;
            if (pullUpLayout2 == null) {
                l.a("mPullUpLayout");
            }
            pullUpLayout2.setPullUpListener(this);
            PullUpLayout pullUpLayout3 = this.f134632f;
            if (pullUpLayout3 == null) {
                l.a("mPullUpLayout");
            }
            pullUpLayout3.setInternalTouchEventListener(new d(this));
            TextView textView2 = this.f134636l;
            if (textView2 == null) {
                l.a("mTitleTv");
            }
            textView2.setText(aVar.f134620a);
            TextView textView3 = this.f134637m;
            if (textView3 == null) {
                l.a("mMessageTv");
            }
            textView3.setText(aVar.f134621b);
            if (aVar.f134622c) {
                TextView textView4 = this.o;
                if (textView4 == null) {
                    l.a("mGoTv");
                }
                textView4.setVisibility(0);
                ImageView imageView2 = this.n;
                if (imageView2 == null) {
                    l.a("mCloseTv");
                }
                imageView2.setVisibility(8);
            } else {
                TextView textView5 = this.o;
                if (textView5 == null) {
                    l.a("mGoTv");
                }
                textView5.setVisibility(8);
                ImageView imageView3 = this.n;
                if (imageView3 == null) {
                    l.a("mCloseTv");
                }
                imageView3.setVisibility(0);
            }
            if (aVar.f134624e != -1) {
                ImageView imageView4 = this.f134635k;
                if (imageView4 == null) {
                    l.a("mIconImg");
                }
                imageView4.setImageResource(aVar.f134624e);
            }
            this.f134630d = new c(this);
            setBackgroundDrawable(new ColorDrawable(0));
            setContentView(this.f134631e);
            setWidth(n.a(com.bytedance.ies.ugc.appcontext.d.a()));
            setHeight(-2);
            update();
            setAnimationStyle(R.style.a17);
            MethodCollector.o(11610);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        MethodCollector.o(11610);
        throw nullPointerException;
    }
}
