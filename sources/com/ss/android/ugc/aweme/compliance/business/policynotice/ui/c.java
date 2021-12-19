package com.ss.android.ugc.aweme.compliance.business.policynotice.ui;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.compliance.api.c.f;
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

public final class c extends LinearLayout implements f, i, j {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.compliance.api.model.i f77122a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f77123b;

    /* renamed from: c  reason: collision with root package name */
    private TuxTextView f77124c;

    /* renamed from: d  reason: collision with root package name */
    private TuxTextView f77125d;

    /* renamed from: e  reason: collision with root package name */
    private TuxTextView f77126e;

    static {
        Covode.recordClassIndex(47675);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(61, new g(c.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c$c  reason: collision with other inner class name */
    static final class C1772c extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(47680);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1772c(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a();
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.f
    public final int getToastVisibility() {
        return getVisibility();
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77129a;

        static {
            Covode.recordClassIndex(47681);
        }

        d(c cVar) {
            this.f77129a = cVar;
        }

        public final void run() {
            c cVar = this.f77129a;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, (float) this.f77129a.getHeight(), 0.0f));
            animationSet.setDuration(300);
            cVar.startAnimation(animationSet);
            this.f77129a.setVisibility(0);
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(c.a(this.f77129a).getBusiness(), c.a(this.f77129a).getStyle());
        }
    }

    public final void a() {
        EventBus.a().b(this);
        setVisibility(8);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) getHeight()));
        animationSet.setDuration(300);
        startAnimation(animationSet);
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(47679);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(1);
            this.this$0 = cVar;
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

    public static final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.i a(c cVar) {
        com.ss.android.ugc.aweme.compliance.api.model.i iVar = cVar.f77122a;
        if (iVar == null) {
            l.a("mPolicyNotice");
        }
        return iVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(5113);
        MethodCollector.o(5113);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    public final void a(com.ss.android.ugc.aweme.compliance.api.model.j r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.compliance.api.model.i r1 = r2.f77122a
            if (r1 != 0) goto L_0x0009
            java.lang.String r0 = "mPolicyNotice"
            h.f.b.l.a(r0)
        L_0x0009:
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(r1, r3)
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.b()
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c.a(com.ss.android.ugc.aweme.compliance.api.model.j):void");
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        if (TextUtils.equals(jVar.f91311b.optString("eventName"), "cancel_post_success")) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77127a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.model.j f77128b;

        static {
            Covode.recordClassIndex(47676);
        }

        a(c cVar, com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
            this.f77127a = cVar;
            this.f77128b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.compliance.api.model.j jVar = this.f77128b;
            Context context = this.f77127a.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(jVar, context, new h.f.a.b<com.ss.android.ugc.aweme.compliance.api.model.j, z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(47677);
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
                    this.this$0.f77127a.a(jVar2);
                    return z.f158842a;
                }
            }, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(47678);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f77127a.a();
                    return z.f158842a;
                }
            });
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(this.f77128b.f76668a, c.a(this.f77127a).getBusiness(), c.a(this.f77127a).getStyle());
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.c.f
    public final void setValues(com.ss.android.ugc.aweme.compliance.api.model.i iVar) {
        MethodCollector.i(5101);
        l.d(iVar, "");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.ux, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.exf);
        l.b(findViewById, "");
        this.f77123b = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.a0s);
        l.b(findViewById2, "");
        this.f77124c = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.a0t);
        l.b(findViewById3, "");
        this.f77125d = (TuxTextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.f1y);
        l.b(findViewById4, "");
        this.f77126e = (TuxTextView) findViewById4;
        addView(inflate);
        EventBus.a(EventBus.a(), this);
        this.f77122a = iVar;
        TuxTextView tuxTextView = this.f77123b;
        if (tuxTextView == null) {
            l.a("mContent");
        }
        Context context = tuxTextView.getContext();
        l.b(context, "");
        com.ss.android.ugc.aweme.compliance.api.model.i iVar2 = this.f77122a;
        if (iVar2 == null) {
            l.a("mPolicyNotice");
        }
        String body = iVar2.getBody();
        com.ss.android.ugc.aweme.compliance.api.model.i iVar3 = this.f77122a;
        if (iVar3 == null) {
            l.a("mPolicyNotice");
        }
        tuxTextView.setText(com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(context, body, iVar3.getPolicyLinkList(), new b(this), new C1772c(this)));
        tuxTextView.setHighlightColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.c9));
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = this.f77124c;
        if (tuxTextView2 == null) {
            l.a("mButton1");
        }
        com.ss.android.ugc.aweme.compliance.api.model.i iVar4 = this.f77122a;
        if (iVar4 == null) {
            l.a("mPolicyNotice");
        }
        a(tuxTextView2, iVar4.getActions().get(0));
        com.ss.android.ugc.aweme.compliance.api.model.i iVar5 = this.f77122a;
        if (iVar5 == null) {
            l.a("mPolicyNotice");
        }
        if (iVar5.getActions().size() > 1) {
            TuxTextView tuxTextView3 = this.f77126e;
            if (tuxTextView3 == null) {
                l.a("mLine");
            }
            tuxTextView3.setVisibility(0);
            TuxTextView tuxTextView4 = this.f77125d;
            if (tuxTextView4 == null) {
                l.a("mButton2");
            }
            tuxTextView4.setVisibility(0);
            TuxTextView tuxTextView5 = this.f77125d;
            if (tuxTextView5 == null) {
                l.a("mButton2");
            }
            com.ss.android.ugc.aweme.compliance.api.model.i iVar6 = this.f77122a;
            if (iVar6 == null) {
                l.a("mPolicyNotice");
            }
            a(tuxTextView5, iVar6.getActions().get(1));
        } else {
            TuxTextView tuxTextView6 = this.f77126e;
            if (tuxTextView6 == null) {
                l.a("mLine");
            }
            tuxTextView6.setVisibility(8);
            TuxTextView tuxTextView7 = this.f77125d;
            if (tuxTextView7 == null) {
                l.a("mButton2");
            }
            tuxTextView7.setVisibility(8);
        }
        setVisibility(4);
        post(new d(this));
        MethodCollector.o(5101);
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    private final void a(TuxTextView tuxTextView, com.ss.android.ugc.aweme.compliance.api.model.j jVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(jVar.f76668a);
        }
        if (jVar.f76669b) {
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(43);
                tuxTextView.setTextColorRes(R.attr.be);
            } else {
                return;
            }
        } else if (tuxTextView != null) {
            tuxTextView.setTuxFont(41);
        } else {
            return;
        }
        tuxTextView.setOnClickListener(new a(this, jVar));
    }
}
