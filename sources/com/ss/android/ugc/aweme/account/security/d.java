package com.ss.android.ugc.aweme.account.security;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.security.SafeInfoNoticeApi;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.m.p;
import java.util.List;

public final class d extends PopupWindow {

    /* renamed from: h  reason: collision with root package name */
    public static final a f65311h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public LinearLayout f65312a;

    /* renamed from: b  reason: collision with root package name */
    public TextView f65313b;

    /* renamed from: c  reason: collision with root package name */
    public int f65314c;

    /* renamed from: d  reason: collision with root package name */
    public String f65315d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f65316e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f65317f;

    /* renamed from: g  reason: collision with root package name */
    public final View f65318g;

    /* renamed from: i  reason: collision with root package name */
    private TuxIconView f65319i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f65320j = true;

    /* renamed from: k  reason: collision with root package name */
    private String f65321k;

    /* renamed from: l  reason: collision with root package name */
    private String f65322l;

    /* renamed from: m  reason: collision with root package name */
    private String f65323m;
    private SpannableStringBuilder n;
    private Boolean o;

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65324a = new b();

        static {
            Covode.recordClassIndex(40160);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(40158);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40159);
        }

        private a() {
        }

        public static boolean a() {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                if (g3.isChildrenMode() || !Keva.getRepo("account_security_keva_name").getBoolean(a("safe_info_need_show_"), false)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(String str) {
            StringBuilder append = new StringBuilder().append(str);
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            return append.append(g2.getCurUserId()).toString();
        }
    }

    public static final class h implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65330a;

        static {
            Covode.recordClassIndex(40166);
        }

        public final void onGlobalLayout() {
            ViewTreeObserver viewTreeObserver = this.f65330a.f65313b.getViewTreeObserver();
            l.b(viewTreeObserver, "");
            viewTreeObserver.removeOnGlobalLayoutListener(this);
            if (this.f65330a.f65313b.getLineCount() > 3) {
                ViewGroup.LayoutParams layoutParams = this.f65330a.f65312a.getLayoutParams();
                layoutParams.height = (int) n.b(this.f65330a.f65317f, 84.0f);
                this.f65330a.f65312a.setLayoutParams(layoutParams);
                this.f65330a.f65313b.getLayoutParams().height = (int) n.b(this.f65330a.f65317f, 68.0f);
                androidx.core.widget.h.a(this.f65330a.f65313b, 2, 13, 1, 2);
                this.f65330a.getContentView().measure(0, 0);
                this.f65330a.f65314c = 0;
                try {
                    this.f65330a.dismiss();
                } catch (Exception unused) {
                }
                this.f65330a.a();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        h(d dVar) {
            this.f65330a = dVar;
        }
    }

    public final void a() {
        if (!isShowing()) {
            if (this.f65314c == 0) {
                int[] iArr = new int[2];
                this.f65318g.getLocationOnScreen(iArr);
                getContentView().measure(0, 0);
                int i2 = iArr[1];
                View contentView = getContentView();
                l.b(contentView, "");
                this.f65314c = i2 - contentView.getMeasuredHeight();
            }
            showAtLocation(this.f65318g, 0, 0, this.f65314c);
            if (this.f65320j) {
                this.f65320j = false;
                r.a("security_alert_notify", new com.ss.android.ugc.aweme.app.f.d().a("aid", String.valueOf(com.bytedance.ies.ugc.appcontext.d.n)).a("notice_id", this.f65323m).a("notice_type", this.f65321k).a("notice_model", this.f65322l).f66730a);
            }
        }
    }

    private final void b() {
        int a2;
        if (this.n != null) {
            if (TextUtils.equals(this.f65322l, "can_not_cancel")) {
                this.f65319i.setIconRes(R.raw.icon_chevron_right_ltr);
                this.f65319i.setOnClickListener(new View$OnClickListenerC1460d(this));
            } else {
                this.f65319i.setIconRes(2131232367);
                this.f65319i.setOnClickListener(new e(this));
            }
            List<b> list = this.f65316e;
            if (list == null || !(!list.isEmpty())) {
                this.f65313b.setText(this.n);
                this.f65313b.setOnClickListener(new g(this));
            } else {
                List<b> list2 = this.f65316e;
                if (list2 == null) {
                    l.b();
                }
                for (b bVar : list2) {
                    String str = bVar.f65308a;
                    if (!(str == null || (a2 = p.a((CharSequence) String.valueOf(this.n), str)) == -1)) {
                        SpannableStringBuilder spannableStringBuilder = this.n;
                        if (spannableStringBuilder == null) {
                            l.b();
                        }
                        if (a2 < spannableStringBuilder.length()) {
                            int length = str.length() + a2;
                            SpannableStringBuilder spannableStringBuilder2 = this.n;
                            if (spannableStringBuilder2 == null) {
                                l.b();
                            }
                            if (length <= spannableStringBuilder2.length()) {
                                i iVar = new i(this, bVar);
                                SpannableStringBuilder spannableStringBuilder3 = this.n;
                                if (spannableStringBuilder3 == null) {
                                    l.b();
                                }
                                spannableStringBuilder3.setSpan(iVar, a2, str.length() + a2, 33);
                            }
                        }
                    }
                }
                this.f65313b.setText(this.n);
                this.f65313b.setMovementMethod(LinkMovementMethod.getInstance());
                this.f65313b.setHighlightColor(androidx.core.content.b.c(this.f65317f, R.color.c9));
                List<b> list3 = this.f65316e;
                if (list3 == null) {
                    l.b();
                }
                if (list3.size() == 1) {
                    this.f65313b.setOnClickListener(new f(this));
                }
            }
            this.f65313b.getViewTreeObserver().addOnGlobalLayoutListener(new h(this));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f65325a = new c();

        static {
            Covode.recordClassIndex(40161);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.security.d$d  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1460d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65326a;

        static {
            Covode.recordClassIndex(40162);
        }

        View$OnClickListenerC1460d(d dVar) {
            this.f65326a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d dVar = this.f65326a;
            dVar.a(dVar.f65315d);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65329a;

        static {
            Covode.recordClassIndex(40165);
        }

        g(d dVar) {
            this.f65329a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d dVar = this.f65329a;
            dVar.a(dVar.f65315d);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65327a;

        static {
            Covode.recordClassIndex(40163);
        }

        e(d dVar) {
            this.f65327a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Keva.getRepo("account_security_keva_name").storeBoolean(a.a("safe_info_need_show_"), false);
            try {
                this.f65327a.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65328a;

        static {
            Covode.recordClassIndex(40164);
        }

        f(d dVar) {
            this.f65328a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            d dVar = this.f65328a;
            List<b> list = dVar.f65316e;
            if (list == null) {
                l.b();
            }
            dVar.a(list.get(0).f65309b);
        }
    }

    public static final class i extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f65331a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f65332b;

        static {
            Covode.recordClassIndex(40167);
        }

        public final void onClick(View view) {
            l.d(view, "");
            List<b> list = this.f65331a.f65316e;
            if (list == null) {
                l.b();
            }
            if (list.size() != 1) {
                this.f65331a.a(this.f65332b.f65309b);
            }
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            super.updateDrawState(textPaint);
            textPaint.setColor(androidx.core.content.b.c(this.f65331a.f65317f, R.color.bh));
            textPaint.setUnderlineText(false);
            textPaint.setFakeBoldText(true);
        }

        i(d dVar, b bVar) {
            this.f65331a = dVar;
            this.f65332b = bVar;
        }
    }

    public final void a(String str) {
        if (this.f65323m != null) {
            SafeInfoNoticeApi a2 = SafeInfoNoticeApi.a.a();
            String str2 = this.f65323m;
            if (str2 == null) {
                l.b();
            }
            String str3 = this.f65321k;
            if (str3 == null) {
                str3 = "";
            }
            a2.safeInfoConfirm(str2, str3).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(b.f65324a, c.f65325a);
            Keva.getRepo("account_security_keva_name").storeBoolean(a.a("safe_info_need_show_"), false);
            try {
                dismiss();
            } catch (Exception unused) {
            }
            this.f65320j = true;
        }
        Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
        if (p.a(this.f65321k, "unbind_email", false)) {
            SmartRouter.buildRoute(j2, str).open();
        } else if (j2 != null && str != null) {
            Intent a3 = com.ss.android.ugc.aweme.crossplatform.a.b.a(j2, str + "&notice_id=" + this.f65323m);
            l.b(a3, "");
            a3.setClass(j2, CrossPlatformActivity.class);
            a3.putExtra("hide_nav_bar", true);
            com.ss.android.ugc.tiktok.security.a.a.a(a3, j2);
            j2.startActivity(a3);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, View view) {
        super(context);
        l.d(context, "");
        l.d(view, "");
        MethodCollector.i(3492);
        this.f65317f = context;
        this.f65318g = view;
        setContentView(LayoutInflater.from(context).inflate(R.layout.an0, (ViewGroup) null));
        View findViewById = getContentView().findViewById(R.id.c6q);
        l.b(findViewById, "");
        this.f65312a = (LinearLayout) findViewById;
        View findViewById2 = getContentView().findViewById(R.id.f3q);
        l.b(findViewById2, "");
        this.f65313b = (TextView) findViewById2;
        View findViewById3 = getContentView().findViewById(R.id.bzf);
        l.b(findViewById3, "");
        this.f65319i = (TuxIconView) findViewById3;
        a aVar = (a) new com.google.gson.f().a(Keva.getRepo("account_security_keva_name").getString(a.a("safe_info_"), ""), a.class);
        if (aVar != null) {
            this.f65322l = aVar.f65306f;
            this.f65321k = aVar.f65305e;
            this.f65323m = aVar.f65301a;
            this.n = new SpannableStringBuilder(aVar.f65302b);
            this.f65315d = aVar.f65307g;
            this.f65316e = aVar.f65303c;
            this.o = Boolean.valueOf(aVar.f65304d);
        }
        b();
        setWidth(-1);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        MethodCollector.o(3492);
    }
}
