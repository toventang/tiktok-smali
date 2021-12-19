package com.ss.android.ugc.aweme.account.login.v2.ui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.common.r;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class n {

    /* renamed from: e  reason: collision with root package name */
    public static final a f65087e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public long f65088a = System.currentTimeMillis();

    /* renamed from: b  reason: collision with root package name */
    final h f65089b = i.a((h.f.a.a) b.f65092a);

    /* renamed from: c  reason: collision with root package name */
    public final View f65090c;

    /* renamed from: d  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.account.view.b f65091d;

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f65096a = new e();

        static {
            Covode.recordClassIndex(40008);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(40003);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(40004);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<PrivateAccountUserSettingsApi> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f65092a = new b();

        static {
            Covode.recordClassIndex(40005);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ PrivateAccountUserSettingsApi invoke() {
            return RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(PrivateAccountUserSettingsApi.class);
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final f f65097a = new f();

        static {
            Covode.recordClassIndex(40009);
        }

        f() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            ((Throwable) obj).getMessage();
        }
    }

    public static final class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f65094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f65095b;

        static {
            Covode.recordClassIndex(40007);
        }

        public final void onClick(View view) {
            l.d(view, "");
            SmartRouter.buildRoute(this.f65094a, m.a()).open();
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(this.f65095b);
            textPaint.setFakeBoldText(true);
            textPaint.setUnderlineText(false);
        }

        d(Context context, int i2) {
            this.f65094a = context;
            this.f65095b = i2;
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ n f65093a;

        static {
            Covode.recordClassIndex(40006);
        }

        c(n nVar) {
            this.f65093a = nVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            r.a("private_notify_exit", new com.ss.android.ugc.aweme.app.f.d().a("result", "get_started").a("stay_time", System.currentTimeMillis() - this.f65093a.f65088a).f66730a);
            this.f65093a.f65091d.a();
        }
    }

    public n(View view, com.ss.android.ugc.aweme.account.view.b bVar) {
        l.d(view, "");
        l.d(bVar, "");
        this.f65090c = view;
        this.f65091d = bVar;
    }
}
