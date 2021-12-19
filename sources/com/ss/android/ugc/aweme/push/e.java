package com.ss.android.ugc.aweme.push;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.TextView;
import b.i;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout;
import com.bytedance.lighten.a.v;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.feed.ui.d;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.push.c;
import com.ss.android.ugc.aweme.share.c.b;
import com.ss.android.ugc.aweme.utils.ew;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class e extends PopupWindow implements View.OnClickListener, com.bytedance.ies.dmt.ui.frameworkui.a, b {
    private String A;
    private Long B;
    private String C;

    /* renamed from: a  reason: collision with root package name */
    public int f118892a = 5000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f118893b = false;

    /* renamed from: c  reason: collision with root package name */
    public a f118894c;

    /* renamed from: d  reason: collision with root package name */
    public long f118895d = 0;

    /* renamed from: e  reason: collision with root package name */
    public Activity f118896e;

    /* renamed from: f  reason: collision with root package name */
    public View f118897f;

    /* renamed from: g  reason: collision with root package name */
    public String f118898g;

    /* renamed from: h  reason: collision with root package name */
    public String f118899h;

    /* renamed from: i  reason: collision with root package name */
    public String f118900i;

    /* renamed from: j  reason: collision with root package name */
    public String f118901j;

    /* renamed from: k  reason: collision with root package name */
    public String f118902k;

    /* renamed from: l  reason: collision with root package name */
    public String f118903l;

    /* renamed from: m  reason: collision with root package name */
    public Boolean f118904m = false;
    public String n;
    public String o;
    public Map<String, String> p = new HashMap();
    private PullUpLayout q;
    private View r;
    private View s;
    private SmartAvatarImageView t;
    private SmartAvatarImageView u;
    private LiveCircleView v;
    private d w;
    private TextView x;
    private TextView y;
    private String z;

    static {
        Covode.recordClassIndex(77239);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void b() {
    }

    private void f() {
        d dVar = this.w;
        if (dVar != null) {
            dVar.c();
        }
    }

    private void g() {
        d dVar = this.w;
        if (dVar != null) {
            dVar.d();
        }
    }

    private Boolean e() {
        return Boolean.valueOf(!TextUtils.equals("author", this.z));
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void d() {
        if (isShowing() && !this.f118893b) {
            try {
                Activity activity = this.f118896e;
                if (activity != null && !activity.isFinishing()) {
                    this.q.a(0.0f, true);
                    g();
                    dismiss();
                }
            } catch (Exception unused) {
            }
            this.f118896e = null;
            IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 0, false);
        }
    }

    /* access modifiers changed from: package-private */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        boolean f118906a;

        static {
            Covode.recordClassIndex(77241);
        }

        public final void run() {
            if (!this.f118906a && System.currentTimeMillis() >= e.this.f118895d && e.this.isShowing()) {
                f.a(e.this.f118904m.booleanValue(), e.this.f118899h, e.this.f118901j, "others", e.this.f118902k, e.this.f118903l, e.this.f118900i);
                f.a(e.this.f118899h, e.this.f118901j, e.this.f118903l, "Android", e.this.f118898g, e.this.n, e.this.o, new StringBuilder().append(e.this.f118892a).toString(), e.this.p);
                e.this.d();
            }
        }

        private a() {
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }
    }

    public e() {
        super(com.bytedance.ies.ugc.appcontext.d.a());
        MethodCollector.i(2842);
        View inflate = ((LayoutInflater) a(com.bytedance.ies.ugc.appcontext.d.a(), "layout_inflater")).inflate(R.layout.a0b, (ViewGroup) null);
        this.r = inflate;
        View findViewById = inflate.findViewById(R.id.dp0);
        this.f118897f = findViewById;
        findViewById.setOnClickListener(this);
        this.t = (SmartAvatarImageView) inflate.findViewById(R.id.bu0);
        this.u = (SmartAvatarImageView) inflate.findViewById(R.id.bu4);
        this.v = (LiveCircleView) inflate.findViewById(R.id.cc_);
        this.s = inflate.findViewById(R.id.wt);
        SmartAvatarImageView smartAvatarImageView = this.u;
        this.w = new d(smartAvatarImageView, smartAvatarImageView, this.v);
        this.x = (TextView) inflate.findViewById(R.id.f9l);
        this.y = (TextView) inflate.findViewById(R.id.f2q);
        PullUpLayout pullUpLayout = (PullUpLayout) inflate.findViewById(R.id.ddo);
        this.q = pullUpLayout;
        pullUpLayout.a(this.f118897f);
        this.q.setPullUpListener(this);
        this.q.setInternalTouchEventListener(new PullUpLayout.b() {
            /* class com.ss.android.ugc.aweme.push.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(77240);
            }

            @Override // com.bytedance.ies.dmt.ui.frameworkui.PullUpLayout.b
            public final void a(MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    e.this.f118893b = true;
                    if (e.this.f118894c != null) {
                        e.this.f118894c.f118906a = true;
                    }
                } else if (action == 1) {
                    e.this.f118893b = false;
                    e.this.f118895d = System.currentTimeMillis() + ((long) e.this.f118892a);
                    e.this.f118894c.f118906a = false;
                    e.this.f118897f.postDelayed(e.this.f118894c, (long) e.this.f118892a);
                } else if (action == 2) {
                    e.this.f118893b = true;
                }
            }
        });
        this.f118894c = new a(this, (byte) 0);
        setBackgroundDrawable(new ColorDrawable(0));
        setContentView(this.r);
        setWidth(n.a(com.bytedance.ies.ugc.appcontext.d.a()));
        setHeight(-2);
        update();
        setAnimationStyle(R.style.a17);
        MethodCollector.o(2842);
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a
    public final void a() {
        this.f118893b = false;
        if (isShowing()) {
            f.a(this.f118904m.booleanValue(), this.f118899h, this.f118901j, "draw", this.f118902k, this.f118903l, this.f118900i);
            f.a(this.f118899h, this.f118901j, this.f118903l, "Android", this.f118898g, this.n, this.o, new StringBuilder().append(this.f118892a).toString(), this.p);
            d();
        }
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void c() {
        MethodCollector.i(2881);
        this.q.a();
        Activity activity = this.f118896e;
        if (activity != null && !activity.isFinishing() && !isShowing()) {
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = this.f118892a;
            this.f118895d = currentTimeMillis + ((long) i2);
            this.q.postDelayed(this.f118894c, (long) i2);
            if (this.r.getParent() != null) {
                ((ViewGroup) this.r.getParent()).removeView(this.r);
            }
            try {
                if (e().booleanValue()) {
                    this.s.setVisibility(0);
                    this.t.setVisibility(4);
                    f();
                } else {
                    this.s.setVisibility(4);
                    this.t.setVisibility(0);
                }
                IMService.createIIMServicebyMonsterPlugin(false).setInnerPushSwitch(getClass().getName(), 1, true);
                View decorView = this.f118896e.getWindow().getDecorView();
                int i3 = Build.VERSION.SDK_INT;
                showAtLocation(decorView, 48, 0, -n.e(com.bytedance.ies.ugc.appcontext.d.a()));
                boolean booleanValue = this.f118904m.booleanValue();
                String str = this.f118899h;
                String str2 = this.f118901j;
                String str3 = this.f118902k;
                String str4 = this.f118903l;
                String str5 = this.A;
                String str6 = this.f118900i;
                String str7 = "livesdk_live_show";
                if (!booleanValue) {
                    str7 = "livesdk_anchor_push_show";
                }
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "inner_push").a("enter_from_merge", "inner_push").a("room_id", str).a("inner_push_type", str3).a("anchor_id", str2).a("gd_label", str4).a("is_subscribe", str5).a("action_type", "click");
                l.b(a2, "");
                ew.a(str6, a2);
                r.a(str7, a2.f66730a);
                String str8 = this.f118899h;
                String str9 = this.f118901j;
                String str10 = this.f118903l;
                String str11 = this.f118898g;
                String str12 = this.n;
                String str13 = this.o;
                r.a("inner_push_show", new com.ss.android.ugc.aweme.app.f.d().a("rule_id", str12).a("push_label", str10).a("push_channel", "Android").a("room_id", str8).a("anchor_id", str9).a("o_url", str11).a("user_id", str13).a(this.p).f66730a);
                try {
                    c a3 = c.f118852c.a();
                    Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
                    Long valueOf2 = Long.valueOf(Long.parseLong(this.n));
                    Long l2 = this.B;
                    String str14 = this.f118903l;
                    String str15 = this.f118898g;
                    i<BaseResponse> reportLiveInnerPush = a3.f118853a.reportLiveInnerPush(valueOf, valueOf2, l2, this.C, str14, str15);
                    if (reportLiveInnerPush != null) {
                        reportLiveInnerPush.c(c.C3045c.f118855a);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                f();
                MethodCollector.o(2881);
                return;
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        MethodCollector.o(2881);
    }

    @Override // com.ss.android.ugc.aweme.share.c.b
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    private static Boolean b(String str) {
        return Boolean.valueOf(str.startsWith("sslocal://live"));
    }

    private static String a(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("room_id");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    private static String c(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("user_id");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    private static String d(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("inner_push_type");
        if (TextUtils.isEmpty(queryParameter)) {
            return "official";
        }
        return queryParameter;
    }

    private static String e(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("gd_label");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    private static String f(String str) {
        String queryParameter = Uri.parse(str).getQueryParameter("is_subscribe");
        if (TextUtils.isEmpty(queryParameter)) {
            return "";
        }
        return queryParameter;
    }

    public final void onClick(View view) {
        Activity activity;
        String str;
        ClickAgent.onClick(view);
        if (view.getId() == R.id.dp0 && !com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (activity = this.f118896e) != null) {
            String str2 = this.f118898g;
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            if (str2.contains("enter_from")) {
                str2 = a(str2, "enter_from", "inner_push");
                buildUpon = Uri.parse(str2).buildUpon();
            } else {
                buildUpon.appendQueryParameter("enter_from", "inner_push");
            }
            if (str2.contains("enter_from_merge")) {
                str2 = a(str2, "enter_from_merge", "inner_push");
                buildUpon = Uri.parse(str2).buildUpon();
            } else {
                buildUpon.appendQueryParameter("enter_from_merge", "inner_push");
            }
            if (!str2.contains("enter_method")) {
                buildUpon.appendQueryParameter("enter_method", "inner_push");
            }
            SmartRouter.buildRoute(activity, buildUpon.toString()).open();
            boolean booleanValue = this.f118904m.booleanValue();
            String str3 = this.f118899h;
            String str4 = this.f118901j;
            String str5 = this.f118902k;
            String str6 = this.f118903l;
            String str7 = this.f118900i;
            if (!booleanValue) {
                str = "livesdk_anchor_push_click";
            } else {
                str = "livesdk_click_push";
            }
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("inner_push_type", str5).a("enter_method", "inner_push").a("enter_from_merge", "inner_push").a("room_id", str3).a("anchor_id", str4).a("gd_label", str6);
            l.b(a2, "");
            ew.a(str7, a2);
            r.a(str, a2.f66730a);
            f.a(this.f118904m.booleanValue(), this.f118899h, this.f118901j, "others", this.f118902k, this.f118903l, this.f118900i);
            String str8 = this.f118899h;
            String str9 = this.f118901j;
            String str10 = this.f118903l;
            String str11 = this.f118898g;
            String str12 = this.n;
            r.a("inner_push_click", new com.ss.android.ugc.aweme.app.f.d().a("rule_id", str12).a("push_label", str10).a("push_channel", "Android").a("room_id", str8).a("anchor_id", str9).a("o_url", str11).a("user_id", this.o).a(this.p).f66730a);
            f.a(this.f118899h, this.f118901j, this.f118903l, "Android", this.f118898g, this.n, this.o, new StringBuilder().append(this.f118892a).toString(), this.p);
            d();
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(2858);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(2858);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private static String a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replaceAll("(" + str2 + "=[^&]*)", str2 + "=" + str3);
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, com.ss.android.ugc.aweme.notice.api.bean.e eVar) {
        if (e().booleanValue()) {
            v a2 = com.bytedance.lighten.a.r.a(str3).a("LivePopupView");
            a2.E = this.u;
            a2.c();
        } else {
            v a3 = com.bytedance.lighten.a.r.a(str3).a("Avatar");
            a3.E = this.t;
            a3.c();
        }
        this.f118900i = str6;
        this.z = str5;
        this.x.setText(str);
        this.y.setText(str2);
        this.f118898g = str4;
        this.f118899h = a(str4);
        this.f118904m = b(str4);
        this.f118901j = c(str4);
        this.f118902k = d(str4);
        this.f118903l = e(str4);
        this.A = f(str4);
        this.o = com.ss.android.ugc.aweme.account.b.g().getCurUserId();
        if (eVar != null) {
            this.n = String.valueOf(eVar.getRid());
            this.B = Long.valueOf(eVar.getGid());
            HashMap hashMap = new HashMap();
            try {
                JSONObject jSONObject = new JSONObject(eVar.getExtraStr());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.optString(next));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            this.p = hashMap;
            this.C = "frontier";
            return;
        }
        this.n = "";
        this.B = 0L;
        this.p = null;
        this.C = "gcm";
    }
}
