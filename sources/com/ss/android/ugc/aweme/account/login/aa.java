package com.ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.cj;
import com.ss.android.ugc.aweme.common.r;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class aa extends e {

    /* renamed from: l  reason: collision with root package name */
    public static final a f63317l = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f63318a = true;

    /* renamed from: k  reason: collision with root package name */
    public final TPLoginMethod f63319k;

    static {
        Covode.recordClassIndex(39019);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(39020);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.e
    public final void dismiss() {
        super.dismiss();
        com.ss.android.ugc.aweme.account.f.a.b(this);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa f63324a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f63325b;

        static {
            Covode.recordClassIndex(39023);
        }

        d(aa aaVar, Context context) {
            this.f63324a = aaVar;
            this.f63325b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63324a.dismiss();
        }
    }

    static final class e implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa f63326a;

        static {
            Covode.recordClassIndex(39024);
        }

        e(aa aaVar) {
            this.f63326a = aaVar;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            if (this.f63326a.f63318a) {
                q.b(new BaseLoginMethod(null, null, null, null, null, null, null, null, null, 511, null));
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa f63320a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f63321b;

        static {
            Covode.recordClassIndex(39021);
        }

        b(aa aaVar, Context context) {
            this.f63320a = aaVar;
            this.f63321b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63320a.f63318a = false;
            this.f63320a.f63413g = true;
            if (this.f63320a.isShowing()) {
                this.f63320a.dismiss();
            }
            aa aaVar = this.f63320a;
            aaVar.a(aaVar.f63319k.getPlatform());
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ aa f63322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f63323b;

        static {
            Covode.recordClassIndex(39022);
        }

        c(aa aaVar, Context context) {
            this.f63322a = aaVar;
            this.f63323b = context;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63322a.f63413g = true;
            this.f63322a.f63318a = false;
            r.a("switch_login_account", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_method", this.f63322a.f63411e).a("enter_from", this.f63322a.f63410d).f62575a);
            this.f63322a.dismiss();
            cj.g().retryLogin(true);
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.e
    public final void a(Context context) {
        MethodCollector.i(9400);
        l.d(context, "");
        if (this.f63319k == null) {
            MethodCollector.o(9400);
            return;
        }
        this.f63415i = getLayoutInflater().inflate(R.layout.g0, (ViewGroup) null);
        View view = this.f63415i;
        if (view != null) {
            com.ss.android.ugc.aweme.base.e.b((RemoteImageView) view.findViewById(R.id.or), this.f63319k.getUserInfo().getAvatarUrl(), -1, -1);
            View findViewById = view.findViewById(R.id.cis);
            l.b(findViewById, "");
            ((TextView) findViewById).setText(context.getString(R.string.aoj, this.f63319k.getUserInfo().getUserName()));
            view.findViewById(R.id.cis).setOnClickListener(new b(this, context));
            view.findViewById(R.id.egx).setOnClickListener(new c(this, context));
            view.findViewById(R.id.e4z).setOnClickListener(new d(this, context));
        }
        setContentView(this.f63415i);
        com.ss.android.ugc.aweme.account.f.a.a(this);
        setOnDismissListener(new e(this));
        MethodCollector.o(9400);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aa(Activity activity, Bundle bundle, TPLoginMethod tPLoginMethod) {
        super(activity, bundle);
        l.d(activity, "");
        l.d(bundle, "");
        this.f63319k = tPLoginMethod;
        a(activity);
    }
}
