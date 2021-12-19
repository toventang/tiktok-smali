package com.ss.android.ugc.aweme.compliance.business.policynotice.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Window;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.aweme.views.o;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class a extends o implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public boolean f77106a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.compliance.api.model.i f77107b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f77108c = new Handler();

    static {
        Covode.recordClassIndex(47652);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(a.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    public final void dismiss() {
        EventBus.a().b(this);
        super.dismiss();
        if (this.f77106a) {
            v.O().y();
            this.f77106a = false;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77111a;

        static {
            Covode.recordClassIndex(47658);
        }

        d(a aVar) {
            this.f77111a = aVar;
        }

        public final void run() {
            if (this.f77111a.isShowing()) {
                com.ss.android.ugc.aweme.video.i O = v.O();
                l.b(O, "");
                if (O.o()) {
                    v.O().B();
                    this.f77111a.f77106a = true;
                    return;
                }
                this.f77111a.a();
            }
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.video.i O = v.O();
        l.b(O, "");
        if (O.o()) {
            v.O().B();
            this.f77106a = true;
            return;
        }
        this.f77108c.postDelayed(new d(this), 1000);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a$a  reason: collision with other inner class name */
    static final class C1770a extends m implements h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(47653);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1770a(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
            com.ss.android.ugc.aweme.compliance.api.model.j jVar2 = jVar;
            l.d(jVar2, "");
            this.this$0.a(jVar2);
            return z.f158842a;
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            a();
        }
    }

    public final void a(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77107b, jVar);
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.b();
        dismiss();
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        if (TextUtils.equals(jVar.f91311b.optString("eventName"), "cancel_post_success")) {
            dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77109a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.j f77110b;

        static {
            Covode.recordClassIndex(47655);
        }

        c(a aVar, com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
            this.f77109a = aVar;
            this.f77110b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.compliance.api.model.j jVar = this.f77110b;
            Context context = this.f77109a.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(jVar, context, new h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a.c.AnonymousClass1 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(47656);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
                    com.ss.android.ugc.aweme.compliance.api.model.j jVar2 = jVar;
                    l.d(jVar2, "");
                    this.this$0.f77109a.a(jVar2);
                    return z.f158842a;
                }
            }, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.a.c.AnonymousClass2 */
                final /* synthetic */ c this$0;

                static {
                    Covode.recordClassIndex(47657);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f77109a.dismiss();
                    return z.f158842a;
                }
            });
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77110b.f76668a, this.f77109a.f77107b.getBusiness(), this.f77109a.f77107b.getStyle());
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        View decorView;
        super.onCreate(bundle);
        setContentView(R.layout.un);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (!(window2 == null || (decorView = window2.getDecorView()) == null)) {
            decorView.setPadding(0, 0, 0, 0);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setGravity(80);
        }
        if (!l.a((Object) this.f77107b.isSubPopUp(), (Object) true)) {
            setCancelable(false);
            setCanceledOnTouchOutside(false);
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.title);
        tuxTextView.setText(this.f77107b.getTitle());
        tuxTextView.setTuxFont(23);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.adh);
        Context context = tuxTextView2.getContext();
        l.b(context, "");
        tuxTextView2.setText(com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(context, this.f77107b.getBody(), this.f77107b.getPolicyLinkList(), new C1770a(this), new b(this)));
        tuxTextView2.setHighlightColor(androidx.core.content.b.c(tuxTextView2.getContext(), R.color.c9));
        tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77107b.getBusiness(), this.f77107b.getStyle());
        TuxTextView tuxTextView3 = (TuxTextView) findViewById(R.id.a0s);
        tuxTextView3.setTuxFont(43);
        a(tuxTextView3, this.f77107b.getActions().get(0));
        if (this.f77107b.getActions().size() > 1) {
            TuxTextView tuxTextView4 = (TuxTextView) findViewById(R.id.a0t);
            tuxTextView4.setVisibility(0);
            a(tuxTextView4, this.f77107b.getActions().get(1));
        } else {
            TuxTextView tuxTextView5 = (TuxTextView) findViewById(R.id.a0t);
            l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(8);
        }
        EventBus.a(EventBus.a(), this);
    }

    private final void a(TuxTextView tuxTextView, com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(jVar.f76668a);
            tuxTextView.setOnClickListener(new c(this, jVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, com.ss.android.ugc.aweme.compliance.api.model.i iVar) {
        super(context, R.style.zo, true, true, false);
        l.d(context, "");
        l.d(iVar, "");
        this.f77107b = iVar;
    }
}
