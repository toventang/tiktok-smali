package com.bytedance.android.livesdk.qa;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.api.a.b;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.cz;
import com.bytedance.android.livesdk.j.di;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.model.message.bj;
import com.bytedance.android.livesdk.model.message.bk;
import com.bytedance.android.livesdk.model.message.bm;
import com.bytedance.android.livesdk.model.message.bn;
import com.bytedance.android.livesdk.model.message.bo;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.WidgetExtendsKt;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.au;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import h.z;

public final class QuestionCardWidget extends LiveRecyclableWidget implements au, OnMessageListener {

    /* renamed from: e  reason: collision with root package name */
    public static final a f20289e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f20290a;

    /* renamed from: b  reason: collision with root package name */
    Dialog f20291b;

    /* renamed from: c  reason: collision with root package name */
    public bj f20292c;

    /* renamed from: d  reason: collision with root package name */
    public at f20293d;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20294f;

    /* renamed from: g  reason: collision with root package name */
    private long f20295g;

    /* renamed from: h  reason: collision with root package name */
    private IMessageManager f20296h;

    /* renamed from: i  reason: collision with root package name */
    private long f20297i;

    /* renamed from: j  reason: collision with root package name */
    private long f20298j;

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f20299a = new b();

        static {
            Covode.recordClassIndex(11977);
        }

        b() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f20300a = new c();

        static {
            Covode.recordClassIndex(11978);
        }

        c() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static final class q<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        public static final q f20307a = new q();

        static {
            Covode.recordClassIndex(11992);
        }

        q() {
        }

        @Override // f.a.d.f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(11975);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bhm;
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.k, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onStateChanged(androidx.lifecycle.m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(11976);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void c() {
        if (com.bytedance.android.live.m.c.b(this.dataChannel)) {
            e();
        } else {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20314a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f20315b;

        static {
            Covode.recordClassIndex(11995);
        }

        t(QuestionCardWidget questionCardWidget, View view) {
            this.f20314a = questionCardWidget;
            this.f20315b = view;
        }

        public final void run() {
            DataChannel dataChannel = this.f20314a.dataChannel;
            if (dataChannel != null) {
                dataChannel.b(com.bytedance.android.livesdk.aq.e.class, Integer.valueOf(this.f20315b.getHeight()));
            }
        }
    }

    public final void a() {
        if (this.f20292c != null) {
            f();
        }
        this.f20292c = null;
        this.f20295g = 0;
        d();
    }

    private final void d() {
        if (isShowing()) {
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(cz.class, false);
            }
            hide();
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.b(com.bytedance.android.livesdk.aq.e.class, (Object) 0);
            }
        }
    }

    private final void e() {
        View view;
        if (com.bytedance.android.live.m.c.b(this.dataChannel) && !this.f20294f && this.f20292c != null && (view = getView()) != null) {
            h.f.b.l.b(view, "");
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.c(cz.class, true);
            }
            show();
            view.post(new t(this, view));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onUnload() {
        com.bytedance.android.livesdk.utils.p.b(this.f20291b);
        at atVar = this.f20293d;
        if (atVar != null) {
            atVar.dismiss();
        }
        if (this.f20292c != null) {
            f();
        }
        this.f20292c = null;
        this.f20295g = 0;
        IMessageManager iMessageManager = this.f20296h;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
    }

    private final void f() {
        long uptimeMillis = SystemClock.uptimeMillis();
        this.f20298j = uptimeMillis;
        int i2 = (int) (uptimeMillis - this.f20297i);
        Long l2 = null;
        if (this.f20290a) {
            com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_anchor_qa_card_show_duration").a("question_like", this.f20295g);
            bj bjVar = this.f20292c;
            if (bjVar != null) {
                l2 = Long.valueOf(bjVar.f19332a);
            }
            a2.a("question_id", (Number) l2).a("duration", i2).a().b();
            return;
        }
        com.bytedance.android.livesdk.ab.b a3 = b.a.a("livesdk_qa_card_show_duration");
        bj bjVar2 = this.f20292c;
        if (bjVar2 != null) {
            l2 = Long.valueOf(bjVar2.f19332a);
        }
        a3.a("question_id", (Number) l2).a("duration", i2).a().b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r6 = this;
            boolean r0 = r6.f20290a
            if (r0 == 0) goto L_0x003f
            com.bytedance.android.livesdk.model.message.bj r5 = r6.f20292c
            if (r5 == 0) goto L_0x003f
            com.bytedance.android.live.network.e r1 = com.bytedance.android.live.network.e.a()
            java.lang.Class<com.bytedance.android.livesdk.qa.QAApi> r0 = com.bytedance.android.livesdk.qa.QAApi.class
            java.lang.Object r4 = r1.a(r0)
            com.bytedance.android.livesdk.qa.QAApi r4 = (com.bytedance.android.livesdk.qa.QAApi) r4
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.dataChannel
            if (r1 == 0) goto L_0x0043
            java.lang.Class<com.bytedance.android.livesdk.j.di> r0 = com.bytedance.android.livesdk.j.di.class
            java.lang.Object r0 = r1.b(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            h.f.b.l.b()
        L_0x0025:
            long r2 = r0.longValue()
            long r0 = r5.f19332a
            f.a.t r1 = r4.endAnswer(r2, r0)
            com.bytedance.android.livesdk.util.rxutils.f r0 = new com.bytedance.android.livesdk.util.rxutils.f
            r0.<init>()
            f.a.t r2 = r1.a(r0)
            com.bytedance.android.livesdk.qa.QuestionCardWidget$b r1 = com.bytedance.android.livesdk.qa.QuestionCardWidget.b.f20299a
            com.bytedance.android.livesdk.qa.QuestionCardWidget$c r0 = com.bytedance.android.livesdk.qa.QuestionCardWidget.c.f20300a
            r2.a(r1, r0)
        L_0x003f:
            r6.a()
            return
        L_0x0043:
            r0 = 0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.qa.QuestionCardWidget.b():void");
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20302a;

        static {
            Covode.recordClassIndex(11980);
        }

        e(QuestionCardWidget questionCardWidget) {
            this.f20302a = questionCardWidget;
        }

        public final void onClick(View view) {
            aa.a(this.f20302a.dataChannel, "qa_card");
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ QuestionCardWidget this$0;

        static {
            Covode.recordClassIndex(11982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(QuestionCardWidget questionCardWidget) {
            super(1);
            this.this$0 = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.a();
            }
            return z.f158842a;
        }
    }

    static final class h extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ QuestionCardWidget this$0;

        static {
            Covode.recordClassIndex(11983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(QuestionCardWidget questionCardWidget) {
            super(1);
            this.this$0 = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                this.this$0.a();
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ QuestionCardWidget this$0;

        static {
            Covode.recordClassIndex(11984);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(QuestionCardWidget questionCardWidget) {
            super(1);
            this.this$0 = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.a(false);
            return z.f158842a;
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20304a;

        static {
            Covode.recordClassIndex(11985);
        }

        j(QuestionCardWidget questionCardWidget) {
            this.f20304a = questionCardWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f20304a.a(!((com.bytedance.android.livesdk.chatroom.c.s) obj).f15147b);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ QuestionCardWidget this$0;

        static {
            Covode.recordClassIndex(11989);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(QuestionCardWidget questionCardWidget) {
            super(1);
            this.this$0 = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.c();
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        if (z) {
            e();
        } else {
            d();
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20305a;

        static {
            Covode.recordClassIndex(11986);
        }

        k(QuestionCardWidget questionCardWidget) {
            this.f20305a = questionCardWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.bytedance.android.live.liveinteract.api.b.k kVar = (com.bytedance.android.live.liveinteract.api.b.k) obj;
            int a2 = b.a.a().a();
            if (a2 == 2 || a2 == 0) {
                QuestionCardWidget questionCardWidget = this.f20305a;
                h.f.b.l.b(kVar, "");
                questionCardWidget.b(kVar.f9998a);
            }
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.android.livesdk.chatroom.c.p, z> {
        final /* synthetic */ QuestionCardWidget this$0;

        static {
            Covode.recordClassIndex(11987);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(QuestionCardWidget questionCardWidget) {
            super(1);
            this.this$0 = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.android.livesdk.chatroom.c.p pVar) {
            com.bytedance.android.livesdk.chatroom.c.p pVar2 = pVar;
            h.f.b.l.d(pVar2, "");
            QuestionCardWidget questionCardWidget = this.this$0;
            if (pVar2 != null) {
                if (pVar2.f15136a == 1) {
                    questionCardWidget.b(false);
                } else if (pVar2.f15136a == 0) {
                    questionCardWidget.b(true);
                }
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<af, z> {
        final /* synthetic */ QuestionCardWidget this$0;

        static {
            Covode.recordClassIndex(11988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(QuestionCardWidget questionCardWidget) {
            super(1);
            this.this$0 = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(af afVar) {
            af afVar2 = afVar;
            h.f.b.l.d(afVar2, "");
            this.this$0.a(afVar2.f20351a, afVar2.f20352b);
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<af, z> {
        final /* synthetic */ QuestionCardWidget this$0;

        static {
            Covode.recordClassIndex(11990);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(QuestionCardWidget questionCardWidget) {
            super(1);
            this.this$0 = questionCardWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(af afVar) {
            af afVar2 = afVar;
            h.f.b.l.d(afVar2, "");
            long j2 = afVar2.f20351a.f19332a;
            bj bjVar = this.this$0.f20292c;
            if (bjVar != null && j2 == bjVar.f19332a) {
                this.this$0.b();
            }
            return z.f158842a;
        }
    }

    static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20306a;

        static {
            Covode.recordClassIndex(11991);
        }

        p(QuestionCardWidget questionCardWidget) {
            this.f20306a = questionCardWidget;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f20306a.a(((ai) ((com.bytedance.android.live.network.response.d) obj).data).f20358c.f20351a, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bj f20309b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f20310c;

        static {
            Covode.recordClassIndex(11993);
        }

        r(QuestionCardWidget questionCardWidget, bj bjVar, long j2) {
            this.f20308a = questionCardWidget;
            this.f20309b = bjVar;
            this.f20310c = j2;
        }

        public final void onClick(View view) {
            QuestionCardWidget questionCardWidget = this.f20308a;
            User user = this.f20309b.f19336e;
            h.f.b.l.b(user, "");
            questionCardWidget.a(user, "head");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20311a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ bj f20312b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f20313c;

        static {
            Covode.recordClassIndex(11994);
        }

        s(QuestionCardWidget questionCardWidget, bj bjVar, long j2) {
            this.f20311a = questionCardWidget;
            this.f20312b = bjVar;
            this.f20313c = j2;
        }

        public final void onClick(View view) {
            QuestionCardWidget questionCardWidget = this.f20311a;
            User user = this.f20312b.f19336e;
            h.f.b.l.b(user, "");
            questionCardWidget.a(user, StringSet.name);
        }
    }

    public final void b(boolean z) {
        this.f20294f = z;
        a(!z);
        c(!z);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.c(br.class);
        }
    }

    static final class f implements View.OnLongClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20303a;

        static {
            Covode.recordClassIndex(11981);
        }

        f(QuestionCardWidget questionCardWidget) {
            this.f20303a = questionCardWidget;
        }

        public final boolean onLongClick(View view) {
            androidx.fragment.app.i iVar;
            at atVar;
            bj bjVar = this.f20303a.f20292c;
            if (bjVar == null) {
                return true;
            }
            this.f20303a.dataChannel.a(ad.class, bjVar);
            this.f20303a.dataChannel.a(au.class, "qa_card");
            this.f20303a.f20293d = new at();
            DataChannel dataChannel = this.f20303a.dataChannel;
            if (dataChannel == null || (iVar = (androidx.fragment.app.i) dataChannel.b(ao.class)) == null || (atVar = this.f20303a.f20293d) == null) {
                return true;
            }
            atVar.show(iVar, "QuestionCardWidget");
            return true;
        }
    }

    private final void c(boolean z) {
        if (this.context != null) {
            if (z) {
                com.bytedance.android.live.p.l lVar = com.bytedance.android.live.p.l.QUESTION;
                DataChannel dataChannel = this.dataChannel;
                Context context = this.context;
                h.f.b.l.b(context, "");
                lVar.load(dataChannel, new aw(context));
                com.bytedance.android.live.p.l.QUESTION.setEnableClick(this.dataChannel, true);
                return;
            }
            com.bytedance.android.live.p.l.QUESTION.unload(this.dataChannel);
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20301a;

        static {
            Covode.recordClassIndex(11979);
        }

        d(QuestionCardWidget questionCardWidget) {
            this.f20301a = questionCardWidget;
        }

        public final void onClick(View view) {
            if (this.f20301a.f20290a) {
                b.a.a("livesdk_anchor_qa_card_close").a().b();
            } else {
                b.a.a("livesdk_audience_qa_card_close").a().b();
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.aS;
            h.f.b.l.b(bVar, "");
            Boolean a2 = bVar.a();
            h.f.b.l.b(a2, "");
            if (!a2.booleanValue() || !this.f20301a.f20290a) {
                this.f20301a.b();
                return;
            }
            com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.aS;
            h.f.b.l.b(bVar2, "");
            com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
            QuestionCardWidget questionCardWidget = this.f20301a;
            questionCardWidget.f20291b = com.bytedance.android.livesdk.utils.p.a(new b.a(questionCardWidget.context).a(R.string.dtn).b(R.string.dto).a(R.string.dtp, (DialogInterface.OnClickListener) new u(questionCardWidget), false).b(R.string.dxk, (DialogInterface.OnClickListener) v.f20317a, false).a());
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof com.bytedance.android.livesdk.ac.b.a)) {
            iMessage = null;
        }
        com.bytedance.android.livesdk.ac.b.a aVar = (com.bytedance.android.livesdk.ac.b.a) iMessage;
        if (aVar != null) {
            if (aVar instanceof bn) {
                long j2 = ((bn) aVar).f19342a;
                bj bjVar = this.f20292c;
                if (bjVar != null && j2 == bjVar.f19332a) {
                    a();
                }
            } else if (aVar instanceof bk) {
                bk bkVar = (bk) aVar;
                long j3 = bkVar.f19337a;
                bj bjVar2 = this.f20292c;
                if (bjVar2 != null && j3 == bjVar2.f19332a) {
                    a();
                }
                long j4 = bkVar.f19338f;
                com.bytedance.android.livesdk.at.f b2 = com.bytedance.android.livesdk.userservice.u.a().b();
                h.f.b.l.b(b2, "");
                if (j4 == b2.c()) {
                    com.bytedance.android.livesdk.utils.ao.a(y.e(), (int) R.string.eli);
                }
            } else if (aVar instanceof bo) {
                bo boVar = (bo) aVar;
                Boolean valueOf = Boolean.valueOf(boVar.f19343a);
                h.f.b.l.b(valueOf, "");
                aa.a(this.dataChannel, valueOf.booleanValue());
                com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
                Boolean valueOf2 = Boolean.valueOf(boVar.f19343a);
                h.f.b.l.b(valueOf2, "");
                a2.a(new e(valueOf2.booleanValue()));
                Boolean valueOf3 = Boolean.valueOf(boVar.f19343a);
                h.f.b.l.b(valueOf3, "");
                c(valueOf3.booleanValue());
                c();
            } else if (aVar instanceof bm) {
                bj bjVar3 = ((bm) aVar).f19341a;
                h.f.b.l.b(bjVar3, "");
                a(bjVar3, 0);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        IMessageManager iMessageManager;
        ImageView imageView;
        DataChannel dataChannel;
        Boolean bool;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f20290a = z;
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.a((androidx.lifecycle.m) this, com.bytedance.android.livesdk.j.z.class, (h.f.a.b) new i(this));
        }
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.chatroom.c.s.class).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(WidgetExtendsKt.autoDispose(this))).a(new j(this));
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.a((androidx.lifecycle.m) this, f.class, (h.f.a.b) new m(this));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.a((androidx.lifecycle.m) this, a.class, (h.f.a.b) new n(this));
        }
        if (this.f20290a && (dataChannel = this.dataChannel) != null) {
            dataChannel.a((androidx.lifecycle.m) this, an.class, (h.f.a.b) new o(this));
        }
        ((com.bytedance.android.livesdk.util.rxutils.autodispose.z) com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.live.liveinteract.api.b.k.class).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(WidgetExtendsKt.autoDispose(this))).a(new k(this));
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.b((androidx.lifecycle.m) this, com.bytedance.android.live.liveinteract.api.t.class, (h.f.a.b) new l(this));
        }
        DataChannel dataChannel7 = this.dataChannel;
        if (dataChannel7 != null) {
            dataChannel7.b((androidx.lifecycle.m) this, com.bytedance.android.livesdk.aq.a.class, (h.f.a.b) new g(this));
        }
        DataChannel dataChannel8 = this.dataChannel;
        if (dataChannel8 != null) {
            dataChannel8.b((androidx.lifecycle.m) this, com.bytedance.android.livesdk.aq.c.class, (h.f.a.b) new h(this));
        }
        DataChannel dataChannel9 = this.dataChannel;
        Long l2 = null;
        if (dataChannel9 == null || (iMessageManager = (IMessageManager) dataChannel9.b(cg.class)) == null) {
            iMessageManager = null;
        } else {
            if (!this.f20290a) {
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.QUESTION_SLIDE_DOWN_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.QUESTION_SELECT_MESSAGE.getIntType(), this);
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.QUESTION_SWITCH_MESSAGE.getIntType(), this);
            }
            iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.QUESTION_DELETE_MESSAGE.getIntType(), this);
        }
        this.f20296h = iMessageManager;
        if (!this.f20290a) {
            QAApi qAApi = (QAApi) com.bytedance.android.live.network.e.a().a(QAApi.class);
            DataChannel dataChannel10 = this.dataChannel;
            if (dataChannel10 == null || (l2 = (Long) dataChannel10.b(di.class)) == null) {
                h.f.b.l.b();
            }
            qAApi.queryQuestion(l2.longValue(), 0, 0, 0).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new p(this), q.f20307a);
        }
        View view = getView();
        if (view != null && (imageView = (ImageView) view.findViewById(R.id.a81)) != null) {
            if (!this.f20290a) {
                imageView.setImageResource(2131234689);
            }
            imageView.setOnClickListener(new d(this));
            View view2 = getView();
            if (view2 != null) {
                view2.setOnClickListener(new e(this));
                view2.setOnLongClickListener(new f(this));
            }
        }
    }

    static final class v implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final v f20317a = new v();

        static {
            Covode.recordClassIndex(11997);
        }

        v() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    static final class u implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ QuestionCardWidget f20316a;

        static {
            Covode.recordClassIndex(11996);
        }

        u(QuestionCardWidget questionCardWidget) {
            this.f20316a = questionCardWidget;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            this.f20316a.b();
            dialogInterface.dismiss();
        }
    }

    public final void a(User user, String str) {
        long j2;
        String str2;
        com.bytedance.android.livesdk.an.a a2 = com.bytedance.android.livesdk.an.a.a();
        UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId(), str);
        bj bjVar = this.f20292c;
        if (bjVar != null) {
            j2 = bjVar.f19332a;
        } else {
            j2 = 0;
        }
        userProfileEvent.msgId = j2;
        bj bjVar2 = this.f20292c;
        if (bjVar2 != null) {
            str2 = bjVar2.f19333b;
        } else {
            str2 = null;
        }
        userProfileEvent.content = str2;
        userProfileEvent.chatType = "3";
        userProfileEvent.mReportType = "report_question";
        userProfileEvent.setClickUserPosition("qa_card");
        a2.a(userProfileEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final h.z a(com.bytedance.android.livesdk.model.message.bj r9, long r10) {
        /*
        // Method dump skipped, instructions count: 296
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.qa.QuestionCardWidget.a(com.bytedance.android.livesdk.model.message.bj, long):h.z");
    }
}
