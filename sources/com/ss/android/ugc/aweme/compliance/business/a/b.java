package com.ss.android.ugc.aweme.compliance.business.a;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.business.a.c;
import com.ss.android.ugc.aweme.compliance.business.setting.a.a;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class b extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    public static final a f76709b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f76710a;

    /* renamed from: c  reason: collision with root package name */
    private final int f76711c = ((int) n.b(com.ss.android.ugc.aweme.a.a(), 20.0f));

    static {
        Covode.recordClassIndex(47420);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47421);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void show() {
        super.show();
        com.bytedance.ies.dmt.ui.dialog.a.a(true, findViewById(R.id.dqe));
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (getWindow() != null) {
            Window window = getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setLayout(n.a(getContext()) - (this.f76711c * 2), -2);
            }
        }
    }

    public final void a() {
        int i2;
        if (!this.f76710a) {
            Context context = getContext();
            TextView textView = (TextView) findViewById(R.id.f2z);
            View$OnClickListenerC1747b bVar = new View$OnClickListenerC1747b(this);
            c cVar = new c(this);
            String string = context.getString(R.string.atf);
            String string2 = context.getString(R.string.ate);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.ati, string, string2));
            int c2 = androidx.core.content.b.c(context, R.color.a2);
            a.C1773a aVar = new a.C1773a(c2, bVar);
            a.C1773a aVar2 = new a.C1773a(c2, cVar);
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            int indexOf = spannableStringBuilder2.indexOf(string);
            int indexOf2 = spannableStringBuilder2.indexOf(string2);
            spannableStringBuilder.setSpan(aVar, indexOf, string.length() + indexOf, 34);
            spannableStringBuilder.setSpan(aVar2, indexOf2, string2.length() + indexOf2, 34);
            textView.setHighlightColor(androidx.core.content.b.c(context, R.color.c9));
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        } else {
            Context context2 = getContext();
            TextView textView2 = (TextView) findViewById(R.id.f2z);
            d dVar = new d(this);
            e eVar = new e(this);
            f fVar = new f(this);
            String string3 = context2.getString(R.string.atf);
            String string4 = context2.getString(R.string.ate);
            String string5 = context2.getString(R.string.atd);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(context2.getString(R.string.ath, string3, string4, string5));
            int c3 = androidx.core.content.b.c(context2, R.color.a2);
            a.C1773a aVar3 = new a.C1773a(c3, dVar);
            a.C1773a aVar4 = new a.C1773a(c3, eVar);
            a.C1773a aVar5 = new a.C1773a(c3, fVar);
            String spannableStringBuilder4 = spannableStringBuilder3.toString();
            int indexOf3 = spannableStringBuilder4.indexOf(string3);
            int indexOf4 = spannableStringBuilder4.indexOf(string4);
            int indexOf5 = spannableStringBuilder4.indexOf(string5);
            if (indexOf3 >= 0) {
                i2 = 34;
                spannableStringBuilder3.setSpan(aVar3, indexOf3, string3.length() + indexOf3, 34);
            } else {
                i2 = 34;
            }
            if (indexOf4 >= 0) {
                spannableStringBuilder3.setSpan(aVar4, indexOf4, string4.length() + indexOf4, i2);
            }
            if (indexOf5 >= 0) {
                spannableStringBuilder3.setSpan(aVar5, indexOf5, string5.length() + indexOf5, i2);
            }
            textView2.setHighlightColor(androidx.core.content.b.c(context2, R.color.c9));
            textView2.setText(spannableStringBuilder3);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.xr);
        l.b(tuxTextView, "");
        tuxTextView.setText(getContext().getString(R.string.atg));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.b$b  reason: collision with other inner class name */
    public static final class View$OnClickListenerC1747b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76712a;

        static {
            Covode.recordClassIndex(47422);
        }

        View$OnClickListenerC1747b(b bVar) {
            this.f76712a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76712a.a("terms-of-use");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76713a;

        static {
            Covode.recordClassIndex(47423);
        }

        c(b bVar) {
            this.f76713a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76713a.a("privacy-policy");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76714a;

        static {
            Covode.recordClassIndex(47424);
        }

        d(b bVar) {
            this.f76714a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76714a.a("terms-of-use");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76715a;

        static {
            Covode.recordClassIndex(47425);
        }

        e(b bVar) {
            this.f76715a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76715a.a("privacy-policy");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76716a;

        static {
            Covode.recordClassIndex(47426);
        }

        f(b bVar) {
            this.f76716a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76716a.a("cookie-policy-eu");
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f76717a;

        static {
            Covode.recordClassIndex(47427);
        }

        g(b bVar) {
            this.f76717a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76717a.dismiss();
            c.a.a().a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context, R.style.zo);
        l.d(context, "");
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = com.bytedance.ies.dmt.ui.dialog.a.f33386h;
            }
            if (window != null) {
                window.addFlags(2);
                window.setAttributes(attributes);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.xn);
        setCancelable(false);
        a();
        ((TuxTextView) findViewById(R.id.xr)).setOnClickListener(new g(this));
    }

    public final void a(String str) {
        int i2;
        com.ss.android.common.util.g gVar = new com.ss.android.common.util.g(com.ss.android.ugc.aweme.compliance.business.setting.a.b.a(str));
        gVar.a("lang", LocalServiceImpl.a().a(getContext()));
        int hashCode = str.hashCode();
        if (hashCode != -1694110974) {
            if (hashCode != -565301353) {
                if (hashCode == -498638057 && str.equals("privacy-policy")) {
                    i2 = R.string.ate;
                    SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.a()).withParam("title", getContext().getString(i2)).open();
                }
            } else if (str.equals("terms-of-use")) {
                i2 = R.string.atf;
                SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.a()).withParam("title", getContext().getString(i2)).open();
            }
        } else if (str.equals("cookie-policy-eu")) {
            i2 = R.string.atd;
            SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.a()).withParam("title", getContext().getString(i2)).open();
        }
        i2 = 0;
        SmartRouter.buildRoute(getContext(), "aweme://webview").withParam("url", gVar.a()).withParam("title", getContext().getString(i2)).open();
    }
}
