package com.ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.account.login.I18nSignUpActivity;
import com.ss.android.ugc.aweme.account.n.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public static final C1404a f63245a = new C1404a((byte) 0);

    static {
        Covode.recordClassIndex(38976);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.a$a  reason: collision with other inner class name */
    public static final class C1404a {
        static {
            Covode.recordClassIndex(38977);
        }

        private C1404a() {
        }

        public /* synthetic */ C1404a(byte b2) {
            this();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63252a;

        static {
            Covode.recordClassIndex(38981);
        }

        d(a aVar) {
            this.f63252a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f63252a.dismiss();
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63248a;

        static {
            Covode.recordClassIndex(38978);
        }

        b(a aVar) {
            this.f63248a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity activity = this.f63248a.f63408b;
            l.b(activity, "");
            m.a(activity).withParam(this.f63248a.f63409c).open();
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f63250a;

        static {
            Covode.recordClassIndex(38979);
        }

        c(a aVar) {
            this.f63250a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            new Handler().postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.account.login.a.c.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f63251a;

                static {
                    Covode.recordClassIndex(38980);
                }

                {
                    this.f63251a = r1;
                }

                public final void run() {
                    Activity activity = this.f63251a.f63250a.f63408b;
                    l.b(activity, "");
                    I18nSignUpActivity.a.a(activity, this.f63251a.f63250a.f63409c, true, false, false);
                }
            }, 300);
            this.f63250a.f63414h = true;
            this.f63250a.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.login.e
    public final void a(Context context) {
        MethodCollector.i(9606);
        l.d(context, "");
        this.f63415i = getLayoutInflater().inflate(R.layout.fy, (ViewGroup) null);
        View view = this.f63415i;
        if (view != null) {
            this.f63409c.putBoolean("age_gate_block", true);
            view.findViewById(R.id.aeu).setOnClickListener(new b(this));
            view.findViewById(R.id.cit).setOnClickListener(new c(this));
            view.findViewById(R.id.e4z).setOnClickListener(new d(this));
        }
        setContentView(this.f63415i);
        com.ss.android.ugc.aweme.account.f.a.a(this);
        MethodCollector.o(9606);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Activity activity, Bundle bundle) {
        super(activity, bundle);
        l.d(activity, "");
        l.d(bundle, "");
        a(activity);
    }
}
