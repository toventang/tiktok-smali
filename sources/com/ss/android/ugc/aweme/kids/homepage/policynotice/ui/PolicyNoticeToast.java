package com.ss.android.ugc.aweme.kids.homepage.policynotice.ui;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.cg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;

public final class PolicyNoticeToast extends LinearLayout implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a f106642a;

    /* renamed from: b  reason: collision with root package name */
    private TuxTextView f106643b;

    /* renamed from: c  reason: collision with root package name */
    private TuxTextView f106644c;

    /* renamed from: d  reason: collision with root package name */
    private TuxTextView f106645d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f106646e;

    static {
        Covode.recordClassIndex(68143);
    }

    public PolicyNoticeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(89, new g(PolicyNoticeToast.class, "onJsBroadCastEvent", com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ PolicyNoticeToast this$0;

        static {
            Covode.recordClassIndex(68148);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(PolicyNoticeToast policyNoticeToast) {
            super(0);
            this.this$0 = policyNoticeToast;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.a();
            return z.f158842a;
        }
    }

    public final int getToastVisibility() {
        return getVisibility();
    }

    static final class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PolicyNoticeToast f106649a;

        static {
            Covode.recordClassIndex(68149);
        }

        d(PolicyNoticeToast policyNoticeToast) {
            this.f106649a = policyNoticeToast;
        }

        public final void run() {
            PolicyNoticeToast policyNoticeToast = this.f106649a;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, (float) this.f106649a.getHeight(), 0.0f));
            animationSet.setDuration(300);
            policyNoticeToast.startAnimation(animationSet);
            this.f106649a.setVisibility(0);
        }
    }

    public final void a() {
        cg.b(this);
        setVisibility(8);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) getHeight()));
        animationSet.setDuration(300);
        startAnimation(animationSet);
    }

    static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z> {
        final /* synthetic */ PolicyNoticeToast this$0;

        static {
            Covode.recordClassIndex(68147);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(PolicyNoticeToast policyNoticeToast) {
            super(1);
            this.this$0 = policyNoticeToast;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
            l.d(bVar2, "");
            this.this$0.a(bVar2);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PolicyNoticeToast f106647a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b f106648b;

        static {
            Covode.recordClassIndex(68144);
        }

        a(PolicyNoticeToast policyNoticeToast, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
            this.f106647a = policyNoticeToast;
            this.f106648b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar = this.f106648b;
            Context context = this.f106647a.getContext();
            l.b(context, "");
            com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(bVar, context, new h.f.a.b<com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b, z>(this) {
                /* class com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast.a.AnonymousClass1 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(68145);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
                    com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar2 = bVar;
                    l.d(bVar2, "");
                    this.this$0.f106647a.a(bVar2);
                    return z.f158842a;
                }
            }, new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeToast.a.AnonymousClass2 */
                final /* synthetic */ a this$0;

                static {
                    Covode.recordClassIndex(68146);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.f106647a.a();
                    return z.f158842a;
                }
            });
        }
    }

    public final void a(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar = this.f106642a;
        if (aVar == null) {
            l.a("mPolicyNotice");
        }
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(aVar, bVar);
        Context context = getContext();
        l.b(context, "");
        com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(context);
        a();
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(com.ss.android.ugc.aweme.kids.homepage.policynotice.c.a aVar) {
        l.d(aVar, "");
        if (TextUtils.equals(aVar.f106614b.optString("eventName"), "cancel_post_success")) {
            a();
        }
    }

    public final void setValues(com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar) {
        MethodCollector.i(11185);
        l.d(aVar, "");
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.aca, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.exf);
        l.b(findViewById, "");
        this.f106643b = (TuxTextView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.a0s);
        l.b(findViewById2, "");
        this.f106644c = (TuxTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.a0t);
        l.b(findViewById3, "");
        this.f106645d = (TuxTextView) findViewById3;
        View findViewById4 = inflate.findViewById(R.id.f1y);
        l.b(findViewById4, "");
        this.f106646e = (TextView) findViewById4;
        addView(inflate);
        cg.a(this);
        this.f106642a = aVar;
        TuxTextView tuxTextView = this.f106643b;
        if (tuxTextView == null) {
            l.a("mContent");
        }
        Context context = tuxTextView.getContext();
        l.b(context, "");
        com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar2 = this.f106642a;
        if (aVar2 == null) {
            l.a("mPolicyNotice");
        }
        String body = aVar2.getBody();
        com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar3 = this.f106642a;
        if (aVar3 == null) {
            l.a("mPolicyNotice");
        }
        tuxTextView.setText(com.ss.android.ugc.aweme.kids.homepage.policynotice.a.a(context, body, aVar3.getPolicyLinkList(), new b(this), new c(this)));
        tuxTextView.setHighlightColor(androidx.core.content.b.c(tuxTextView.getContext(), R.color.c9));
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = this.f106644c;
        if (tuxTextView2 == null) {
            l.a("mButton1");
        }
        com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar4 = this.f106642a;
        if (aVar4 == null) {
            l.a("mPolicyNotice");
        }
        a(tuxTextView2, aVar4.getActions().get(0));
        com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar5 = this.f106642a;
        if (aVar5 == null) {
            l.a("mPolicyNotice");
        }
        if (aVar5.getActions().size() > 1) {
            TextView textView = this.f106646e;
            if (textView == null) {
                l.a("mLine");
            }
            textView.setVisibility(0);
            TuxTextView tuxTextView3 = this.f106645d;
            if (tuxTextView3 == null) {
                l.a("mButton2");
            }
            tuxTextView3.setVisibility(0);
            TuxTextView tuxTextView4 = this.f106645d;
            if (tuxTextView4 == null) {
                l.a("mButton2");
            }
            com.ss.android.ugc.aweme.kids.homepage.policynotice.response.a aVar6 = this.f106642a;
            if (aVar6 == null) {
                l.a("mPolicyNotice");
            }
            a(tuxTextView4, aVar6.getActions().get(1));
        } else {
            TextView textView2 = this.f106646e;
            if (textView2 == null) {
                l.a("mLine");
            }
            textView2.setVisibility(8);
            TuxTextView tuxTextView5 = this.f106645d;
            if (tuxTextView5 == null) {
                l.a("mButton2");
            }
            tuxTextView5.setVisibility(8);
        }
        setVisibility(4);
        post(new d(this));
        MethodCollector.o(11185);
    }

    private final void a(TuxTextView tuxTextView, com.ss.android.ugc.aweme.kids.homepage.policynotice.response.b bVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(bVar.f106622a);
        }
        if (bVar.f106623b) {
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
        tuxTextView.setOnClickListener(new a(this, bVar));
    }

    private /* synthetic */ PolicyNoticeToast(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PolicyNoticeToast(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(11344);
        MethodCollector.o(11344);
    }
}
