package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.share.c.b;
import com.ss.android.ugc.aweme.share.ui.SharePublishLayout;
import com.ss.android.ugc.aweme.sharer.ui.bar.MicroShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.zhiliaoapp.musically.R;

public abstract class d extends PopupWindow implements com.bytedance.ies.dmt.ui.frameworkui.a, b {

    /* renamed from: a  reason: collision with root package name */
    protected View f123424a;

    /* renamed from: b  reason: collision with root package name */
    protected RemoteImageView f123425b;

    /* renamed from: c  reason: collision with root package name */
    protected Activity f123426c;

    /* renamed from: d  reason: collision with root package name */
    LinearLayout f123427d;

    /* renamed from: e  reason: collision with root package name */
    a f123428e;

    /* renamed from: f  reason: collision with root package name */
    public int f123429f = 4000;

    /* renamed from: g  reason: collision with root package name */
    protected SharePublishLayout f123430g;

    /* renamed from: h  reason: collision with root package name */
    boolean f123431h;

    /* renamed from: i  reason: collision with root package name */
    protected LinearLayout f123432i;

    /* renamed from: j  reason: collision with root package name */
    protected e f123433j;

    /* renamed from: k  reason: collision with root package name */
    protected Aweme f123434k;

    /* renamed from: l  reason: collision with root package name */
    protected MicroShareChannelBar f123435l;

    /* renamed from: m  reason: collision with root package name */
    public long f123436m;
    private View n;
    private RemoteImageView o;
    private TextView p;
    private View q;
    private int r = 49;
    private int s = 59;
    private int t = 23;
    private int u = 23;

    static {
        Covode.recordClassIndex(81054);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public void b() {
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public void a() {
        f();
    }

    public final void f() {
        this.f123431h = false;
        d();
    }

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f123441a;

        static {
            Covode.recordClassIndex(81055);
        }

        public final void run() {
            if (!this.f123441a && System.currentTimeMillis() >= d.this.f123436m) {
                d.this.d();
            }
        }

        private a() {
        }

        /* synthetic */ a(d dVar, byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void d() {
        if (isShowing() && !this.f123431h) {
            try {
                Activity activity = this.f123426c;
                if (activity != null && !activity.isFinishing()) {
                    this.f123430g.a(0.0f, true);
                    dismiss();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
        View decorView = this.f123426c.getWindow().getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        showAtLocation(decorView, 48, 0, -n.e(this.f123426c));
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void c() {
        this.f123430g.a();
        Activity activity = this.f123426c;
        if (activity != null && !activity.isFinishing() && !isShowing()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = this.f123429f;
            this.f123436m = currentTimeMillis + ((long) i2);
            this.f123430g.postDelayed(this.f123428e, (long) i2);
            if (this.f123424a.getParent() != null) {
                ((ViewGroup) this.f123424a.getParent()).removeView(this.f123424a);
            }
            try {
                e();
            } catch (WindowManager.BadTokenException e2) {
                e2.printStackTrace();
            }
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("enter_method", "publish_then_share");
            r.a("share_panel_show", aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        if (this.f123434k != null) {
            AwemeService.b().a(this.f123434k);
            t.a(t.a(), this.f123426c, u.a("aweme://aweme/detail/" + this.f123434k.getAid()).a("profile_enterprise_type", this.f123434k.getEnterpriseType()).a("query_aweme_mode", "from_local").a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").a());
            AVExternalServiceImpl.a().publishService().setPublishStatus(11);
            dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public final void a(Aweme aweme) {
        this.f123434k = aweme;
        if (aweme.getVideo() != null) {
            com.ss.android.ugc.aweme.base.e.a(this.f123425b, aweme.getVideo().getCover(), (int) n.b(this.f123426c, (float) this.r), (int) n.b(this.f123426c, (float) this.s));
        }
    }

    public d(Activity activity, e eVar) {
        super(activity);
        this.f123426c = activity;
        this.f123433j = eVar;
        this.f123424a = LayoutInflater.from(activity).inflate(R.layout.azz, (ViewGroup) null);
        this.f123428e = new a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.f123424a);
        setWidth(n.a(this.f123426c));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a17);
        View view = this.f123424a;
        this.f123425b = (RemoteImageView) view.findViewById(R.id.by5);
        this.f123427d = (LinearLayout) view.findViewById(R.id.dp0);
        this.f123430g = (SharePublishLayout) view.findViewById(R.id.ddo);
        this.o = (RemoteImageView) view.findViewById(R.id.bvo);
        this.p = (TextView) view.findViewById(R.id.exa);
        this.n = view.findViewById(R.id.cer);
        this.q = view.findViewById(R.id.cad);
        this.f123432i = (LinearLayout) view.findViewById(R.id.ced);
        this.f123430g.a(this.f123427d);
        this.f123430g.setPullUpListener(this);
        this.f123427d.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f123425b.setOnClickListener(new e(this));
        this.f123435l = (MicroShareChannelBar) ((ViewStub) view.findViewById(R.id.e1q)).inflate().findViewById(R.id.e1p);
        this.f123430g.setInternalTouchEventListener(new f(this));
    }
}
