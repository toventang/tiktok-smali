package com.ss.android.ugc.aweme.im.sdk.chat.ui.view;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.sdk.chat.b.c.g;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.t;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.m.p;
import h.z;
import java.util.HashMap;

public final class StrangerChatRiskHint extends LinearLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final a f101252c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public a f101253a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a f101254b;

    /* renamed from: d  reason: collision with root package name */
    private final h f101255d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap f101256e;

    static {
        Covode.recordClassIndex(64769);
    }

    public StrangerChatRiskHint(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final View a(int i2) {
        if (this.f101256e == null) {
            this.f101256e = new HashMap();
        }
        View view = (View) this.f101256e.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f101256e.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final Keva getKeva() {
        return (Keva) this.f101255d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(64770);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class e extends m implements h.f.a.a<Keva> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f101263a = new e();

        static {
            Covode.recordClassIndex(64776);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("im_strange_chat_risk");
        }
    }

    public final void a() {
        com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar = this.f101254b;
        if (aVar != null && aVar.getConversationId() != null) {
            getKeva().storeBoolean(getKey(), true);
        }
    }

    public final String getKey() {
        String str;
        StringBuilder sb = new StringBuilder("im_stranger_receiver_risk_hint_");
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        String str2 = null;
        if (curUser != null) {
            str = curUser.getUid();
        } else {
            str = null;
        }
        StringBuilder append = sb.append(str).append('_');
        com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar = this.f101254b;
        if (aVar != null) {
            str2 = aVar.getConversationId();
        }
        return append.append(str2).toString();
    }

    private final void b() {
        MethodCollector.i(6549);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.a8u, this);
        ((TuxTextView) a(R.id.y9)).setOnClickListener(new b(this));
        ((TuxTextView) a(R.id.xr)).setOnClickListener(new c(this));
        String string = getContext().getString(R.string.b9y);
        l.b(string, "");
        String string2 = getContext().getString(R.string.b9x, string);
        l.b(string2, "");
        com.bytedance.tux.f.d dVar = new com.bytedance.tux.f.d(string2);
        dVar.a(41);
        int a2 = p.a((CharSequence) string2, string, 0, false, 6);
        dVar.setSpan(new d(this, androidx.core.content.b.c(getContext(), R.color.bx)), a2, string.length() + a2, 34);
        dVar.setSpan(new com.bytedance.tux.f.a.b(42, true), a2, string.length() + a2, 34);
        TuxTextView tuxTextView = (TuxTextView) a(R.id.edl);
        l.b(tuxTextView, "");
        tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        TuxTextView tuxTextView2 = (TuxTextView) a(R.id.edl);
        l.b(tuxTextView2, "");
        tuxTextView2.setHighlightColor(androidx.core.content.b.c(getContext(), R.color.c9));
        TuxTextView tuxTextView3 = (TuxTextView) a(R.id.edl);
        l.b(tuxTextView3, "");
        tuxTextView3.setText(dVar);
        MethodCollector.o(6549);
    }

    public static final class d extends ClickableSpan {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StrangerChatRiskHint f101261a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f101262b;

        static {
            Covode.recordClassIndex(64775);
        }

        public final void updateDrawState(TextPaint textPaint) {
            l.d(textPaint, "");
            textPaint.setColor(this.f101262b);
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            g.a a2;
            l.d(view, "");
            StrangerChatRiskHint strangerChatRiskHint = this.f101261a;
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar = strangerChatRiskHint.f101254b;
            if (aVar != null && (a2 = g.a(aVar)) != null) {
                Context context = strangerChatRiskHint.getContext();
                l.b(context, "");
                Activity a3 = com.ss.android.ugc.aweme.share.improve.c.b.a(context);
                if (a3 != null) {
                    g.a(a2, a3, "4");
                }
                com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.d(a2.f100202b, "click_share_button");
                com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(aVar, "report");
            }
        }

        d(StrangerChatRiskHint strangerChatRiskHint, int i2) {
            this.f101261a = strangerChatRiskHint;
            this.f101262b = i2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StrangerChatRiskHint f101258a;

        static {
            Covode.recordClassIndex(64772);
        }

        c(StrangerChatRiskHint strangerChatRiskHint) {
            this.f101258a = strangerChatRiskHint;
        }

        static final class b<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f101260a = new b();

            static {
                Covode.recordClassIndex(64774);
            }

            b() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Throwable th = (Throwable) obj;
                com.ss.android.ugc.aweme.im.service.m.a.e("StrangerChatRiskHint", "postChatStrangeUnLimit error");
                l.b(th, "");
                com.ss.android.ugc.aweme.im.service.m.a.a(th);
            }
        }

        static final class a<T> implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final a f101259a = new a();

            static {
                Covode.recordClassIndex(64773);
            }

            a() {
            }

            @Override // f.a.d.f
            public final /* synthetic */ void accept(Object obj) {
                Integer num;
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse == null || baseResponse.status_code != 0) {
                    StringBuilder sb = new StringBuilder("postChatStrangeUnLimit status_code: ");
                    if (baseResponse != null) {
                        num = Integer.valueOf(baseResponse.status_code);
                    } else {
                        num = null;
                    }
                    com.ss.android.ugc.aweme.im.service.m.a.a("StrangerChatRiskHint", sb.append(num).toString());
                }
            }
        }

        public final void onClick(View view) {
            h.f.a.b<com.ss.android.ugc.aweme.im.sdk.chat.data.e.a, z> bVar;
            String str;
            String str2;
            t<BaseResponse> b2;
            IMUser fromUser;
            IMUser fromUser2;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar = this.f101258a.f101254b;
            if (aVar != null) {
                this.f101258a.a();
                com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar2 = this.f101258a.f101254b;
                if (aVar2 == null || (fromUser2 = aVar2.getFromUser()) == null || (str = fromUser2.getUid()) == null) {
                    str = "";
                }
                com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar3 = this.f101258a.f101254b;
                if (aVar3 == null || (fromUser = aVar3.getFromUser()) == null || (str2 = fromUser.getSecUid()) == null) {
                    str2 = "";
                }
                String conversationId = aVar.getConversationId();
                l.d(str, "");
                l.d(str2, "");
                l.d(conversationId, "");
                t<BaseResponse> postChatStrangeUnLimit = com.ss.android.ugc.aweme.im.sdk.common.data.api.b.a().postChatStrangeUnLimit(str, str2, conversationId);
                if (!(postChatStrangeUnLimit == null || (b2 = postChatStrangeUnLimit.b(f.a.h.a.b(f.a.k.a.f158006c))) == null)) {
                    b2.a(a.f101259a, b.f101260a);
                }
                com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(aVar, "accept");
            }
            a aVar4 = this.f101258a.f101253a;
            if (aVar4 != null && (bVar = aVar4.f101265b) != null) {
                bVar.invoke(com.ss.android.ugc.aweme.im.sdk.chat.data.e.a.Input);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StrangerChatRiskHint f101257a;

        static {
            Covode.recordClassIndex(64771);
        }

        b(StrangerChatRiskHint strangerChatRiskHint) {
            this.f101257a = strangerChatRiskHint;
        }

        public final void onClick(View view) {
            h.f.a.a<z> aVar;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.im.sdk.chat.feature.single.a.a aVar2 = this.f101257a.f101254b;
            if (aVar2 != null) {
                a.C0745a.a().c(aVar2.getConversationId(), null);
                this.f101257a.a();
                com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(aVar2, "delete");
            }
            a aVar3 = this.f101257a.f101253a;
            if (aVar3 != null && (aVar = aVar3.f101264a) != null) {
                aVar.invoke();
            }
        }
    }

    private /* synthetic */ StrangerChatRiskHint(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private StrangerChatRiskHint(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(6560);
        this.f101255d = i.a((h.f.a.a) e.f101263a);
        b();
        MethodCollector.o(6560);
    }
}
