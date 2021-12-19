package com.ss.android.ugc.aweme.feed.ui;

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
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.c.b;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;

public final class bg extends PopupWindow implements View.OnClickListener, com.bytedance.ies.dmt.ui.frameworkui.a, b {

    /* renamed from: a  reason: collision with root package name */
    public int f94344a = 4000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f94345b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f94346c;

    /* renamed from: d  reason: collision with root package name */
    public long f94347d = 0;

    /* renamed from: e  reason: collision with root package name */
    public View f94348e;

    /* renamed from: f  reason: collision with root package name */
    public Activity f94349f;

    /* renamed from: g  reason: collision with root package name */
    public RelativeLayout f94350g;

    /* renamed from: h  reason: collision with root package name */
    public RemoteImageView f94351h;

    /* renamed from: i  reason: collision with root package name */
    public Aweme f94352i;

    /* renamed from: j  reason: collision with root package name */
    private PullUpLayout f94353j;

    static {
        Covode.recordClassIndex(59933);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void b() {
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void a() {
        this.f94345b = false;
        d();
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f94355a;

        static {
            Covode.recordClassIndex(59935);
        }

        public final void run() {
            if (!this.f94355a && System.currentTimeMillis() >= bg.this.f94347d) {
                bg.this.d();
            }
        }

        private a() {
        }

        /* synthetic */ a(bg bgVar, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void d() {
        if (isShowing() && !this.f94345b) {
            try {
                Activity activity = this.f94349f;
                if (activity != null && !activity.isFinishing()) {
                    this.f94353j.a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f94349f = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void c() {
        MethodCollector.i(12249);
        this.f94353j.a();
        Activity activity = this.f94349f;
        if (activity != null && !activity.isFinishing() && !isShowing()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = this.f94344a;
            this.f94347d = currentTimeMillis + ((long) i2);
            this.f94353j.postDelayed(this.f94346c, (long) i2);
            if (this.f94348e.getParent() != null) {
                ((ViewGroup) this.f94348e.getParent()).removeView(this.f94348e);
            }
            try {
                View decorView = this.f94349f.getWindow().getDecorView();
                int i3 = Build.VERSION.SDK_INT;
                showAtLocation(decorView, 48, 0, -n.e(d.a()));
                MethodCollector.o(12249);
                return;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        MethodCollector.o(12249);
    }

    public bg() {
        super(d.a());
        MethodCollector.i(11952);
        View inflate = ((LayoutInflater) a(d.a(), "layout_inflater")).inflate(R.layout.b00, (ViewGroup) null);
        this.f94348e = inflate;
        this.f94351h = (RemoteImageView) inflate.findViewById(R.id.by5);
        this.f94350g = (RelativeLayout) inflate.findViewById(R.id.dp0);
        PullUpLayout pullUpLayout = (PullUpLayout) inflate.findViewById(R.id.ddo);
        this.f94353j = pullUpLayout;
        pullUpLayout.a(this.f94350g);
        this.f94353j.setPullUpListener(this);
        this.f94351h.setOnClickListener(this);
        this.f94353j.setInternalTouchEventListener(new PullUpLayout.b() {
            /* class com.ss.android.ugc.aweme.feed.ui.bg.AnonymousClass1 */

            static {
                Covode.recordClassIndex(59934);
            }

            @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout.b
            public final void a(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    bg.this.f94345b = true;
                    if (bg.this.f94346c != null) {
                        bg.this.f94346c.f94355a = true;
                    }
                } else if (action == 1) {
                    bg.this.f94345b = false;
                    bg.this.f94347d = System.currentTimeMillis() + ((long) bg.this.f94344a);
                    bg.this.f94346c.f94355a = false;
                    bg.this.f94350g.postDelayed(bg.this.f94346c, (long) bg.this.f94344a);
                } else if (action == 2) {
                    bg.this.f94345b = true;
                }
            }
        });
        this.f94346c = new a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f94348e);
        setWidth(n.a(d.a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a17);
        MethodCollector.o(11952);
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        if (view.getId() == R.id.by5) {
            t.a(t.a(), this.f94349f, u.a("aweme://aweme/detail/" + this.f94352i.getAid()).a("refer", "upload").a());
            AVExternalServiceImpl.a().publishService().setPublishStatus(11);
            d();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(12091);
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
                    MethodCollector.o(12091);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
