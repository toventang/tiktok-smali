package com.bytedance.android.livesdk.qa;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Spannable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.j.br;
import com.bytedance.android.livesdk.j.cg;
import com.bytedance.android.livesdk.j.df;
import com.bytedance.android.livesdk.j.dn;
import com.bytedance.android.livesdk.j.ee;
import com.bytedance.android.livesdk.j.ef;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.utils.ak;
import com.bytedance.android.livesdk.v;
import com.bytedance.android.livesdk.widget.LiveLoadingView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class y extends v implements OnMessageListener {

    /* renamed from: i  reason: collision with root package name */
    public static final a f20525i = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public i f20526a;

    /* renamed from: b  reason: collision with root package name */
    public int f20527b;

    /* renamed from: c  reason: collision with root package name */
    public int f20528c;

    /* renamed from: d  reason: collision with root package name */
    int f20529d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f20530e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f20531f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20532g;

    /* renamed from: h  reason: collision with root package name */
    public String f20533h = "";

    /* renamed from: j  reason: collision with root package name */
    private final h.h f20534j = com.bytedance.android.livesdkapi.m.d.a(new s(this));

    /* renamed from: k  reason: collision with root package name */
    private f.a.b.a f20535k;

    /* renamed from: l  reason: collision with root package name */
    private Runnable f20536l;

    /* renamed from: m  reason: collision with root package name */
    private final ak.a f20537m = ak.a.PANEL_QA;
    private HashMap n;

    static {
        Covode.recordClassIndex(12113);
    }

    @Override // com.bytedance.android.livesdk.v
    public final void a() {
        HashMap hashMap = this.n;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final View a_(int i2) {
        if (this.n == null) {
            this.n = new HashMap();
        }
        View view = (View) this.n.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.n.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final QuestionViewModel d() {
        return (QuestionViewModel) this.f20534j.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(12114);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final ak.a c_() {
        return this.f20537m;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20539a;

        static {
            Covode.recordClassIndex(12116);
        }

        c(y yVar) {
            this.f20539a = yVar;
        }

        static final class a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ androidx.fragment.app.i $it1$inlined;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(12117);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(androidx.fragment.app.i iVar, c cVar) {
                super(0);
                this.$it1$inlined = iVar;
                this.this$0 = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.f20539a.dismiss();
                return z.f158842a;
            }
        }

        public final void onClick(View view) {
            com.bytedance.android.livesdk.event.b bVar;
            androidx.fragment.app.i iVar;
            DataChannel dataChannel = this.f20539a.p;
            if (dataChannel == null || (bVar = (com.bytedance.android.livesdk.event.b) dataChannel.b(ef.class)) == null) {
                bVar = new com.bytedance.android.livesdk.event.b(false);
            }
            if (!bVar.f17179a) {
                DataChannel dataChannel2 = this.f20539a.p;
                if (dataChannel2 != null && (iVar = (androidx.fragment.app.i) dataChannel2.b(ao.class)) != null) {
                    DataChannel dataChannel3 = this.f20539a.p;
                    if (dataChannel3 != null) {
                        dataChannel3.a(b.class, new d(this.f20539a.f20528c, this.f20539a.f20527b, this.f20539a.f20530e, this.f20539a.f20533h));
                    }
                    c cVar = new c();
                    a aVar = new a(iVar, this);
                    h.f.b.l.d(aVar, "");
                    cVar.f20430f = aVar;
                    cVar.show(iVar, "QADialog");
                }
            } else if (bVar.f17180b) {
                com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.eq3);
            } else {
                com.bytedance.android.livesdk.utils.ao.a(com.bytedance.android.live.core.f.y.e(), (int) R.string.eq2);
            }
        }
    }

    static final class s extends h.f.b.m implements h.f.a.a<QuestionViewModel> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12133);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(y yVar) {
            super(0);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ QuestionViewModel invoke() {
            return ae.a(this.this$0, (ad.b) null).a(QuestionViewModel.class);
        }
    }

    static final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.bytedance.android.livesdk.model.message.g f20545a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ y f20546b;

        static {
            Covode.recordClassIndex(12132);
        }

        r(com.bytedance.android.livesdk.model.message.g gVar, y yVar) {
            this.f20545a = gVar;
            this.f20546b = yVar;
        }

        public final void run() {
            LinearLayout linearLayout = (LinearLayout) this.f20546b.a_(R.id.flu);
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.android.livesdk.v
    public final v.b b() {
        v.b bVar = new v.b(R.layout.b7v);
        bVar.f22374a = 0;
        bVar.f22375b = R.style.a2m;
        bVar.f22380g = 80;
        double b2 = (double) com.bytedance.android.live.core.f.y.b();
        Double.isNaN(b2);
        bVar.f22382i = (int) (b2 * 0.73d);
        return bVar;
    }

    public final void e() {
        QuestionViewModel d2 = d();
        h.f.b.l.b(d2, "");
        androidx.h.f fVar = new androidx.h.f(d2.f20321k, d2.f20322l);
        fVar.f3107b = androidx.a.a.a.a.f785c;
        d2.f20319i = fVar.a();
        d2.f20319i.observe(this, new t(this));
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        super.onDestroyView();
        View view = getView();
        if (view != null) {
            view.removeCallbacks(this.f20536l);
        }
        DataChannel dataChannel = this.p;
        if (!(dataChannel == null || (iMessageManager2 = (IMessageManager) dataChannel.b(cg.class)) == null)) {
            iMessageManager2.removeMessageListener(this);
        }
        DataChannel dataChannel2 = this.p;
        if (!(dataChannel2 == null || (iMessageManager = (IMessageManager) dataChannel2.b(cg.class)) == null)) {
            i iVar = this.f20526a;
            if (iVar == null) {
                h.f.b.l.a("mAdapter");
            }
            iMessageManager.removeMessageListener(iVar);
        }
        a();
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20538a;

        static {
            Covode.recordClassIndex(12115);
        }

        b(y yVar) {
            this.f20538a = yVar;
        }

        public final void onClick(View view) {
            this.f20538a.dismiss();
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20542a;

        static {
            Covode.recordClassIndex(12120);
        }

        f(y yVar) {
            this.f20542a = yVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (!((e) obj).f20465a) {
                this.f20542a.dismiss();
            }
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<af, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12121);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(af afVar) {
            h.f.b.l.d(afVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    static final class j<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20544a;

        static {
            Covode.recordClassIndex(12124);
        }

        j(y yVar) {
            this.f20544a = yVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            y.a(this.f20544a).a((androidx.h.i) ((androidx.h.i) obj));
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12125);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.e();
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.dismiss();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20547a;

        static {
            Covode.recordClassIndex(12134);
        }

        t(y yVar) {
            this.f20547a = yVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            y.a(this.f20547a).a((androidx.h.i) ((androidx.h.i) obj));
        }
    }

    public static final /* synthetic */ i a(y yVar) {
        i iVar = yVar.f20526a;
        if (iVar == null) {
            h.f.b.l.a("mAdapter");
        }
        return iVar;
    }

    static final class h extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12122);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            if (com.bytedance.android.live.m.c.b(this.this$0.p)) {
                this.this$0.e();
            } else {
                this.this$0.dismiss();
            }
            return z.f158842a;
        }
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20543a;

        static {
            Covode.recordClassIndex(12123);
        }

        i(y yVar) {
            this.f20543a = yVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i iVar;
            DataChannel dataChannel = this.f20543a.p;
            if (dataChannel != null && (iVar = (androidx.fragment.app.i) dataChannel.b(ao.class)) != null) {
                new ax().show(iVar, "QADialog");
            }
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<af, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(af afVar) {
            af afVar2 = afVar;
            h.f.b.l.d(afVar2, "");
            y.a(this.this$0).a(afVar2.f20351a.f19332a);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<Long, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Long l2) {
            y.a(this.this$0).b(l2.longValue());
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<af, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(af afVar) {
            af afVar2 = afVar;
            h.f.b.l.d(afVar2, "");
            y.a(this.this$0).a(afVar2.f20351a.f19332a);
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<Long, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12131);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Long l2) {
            y.a(this.this$0).b(l2.longValue());
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<z, z> {
        final /* synthetic */ y this$0;

        static {
            Covode.recordClassIndex(12126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(y yVar) {
            super(1);
            this.this$0 = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(z zVar) {
            h.f.b.l.d(zVar, "");
            this.this$0.dismiss();
            if (y.a(this.this$0).p != null) {
                y.a(this.this$0).p.dismiss();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!(iMessage instanceof com.bytedance.android.livesdk.model.message.g)) {
            iMessage = null;
        }
        com.bytedance.android.livesdk.model.message.g gVar = (com.bytedance.android.livesdk.model.message.g) iMessage;
        if (gVar != null) {
            Spannable a2 = com.bytedance.android.livesdk.chatroom.f.c.a(gVar.O.f23218j, "");
            if (com.bytedance.android.livesdk.utils.p.a(a2) && a2 != null) {
                View view = getView();
                if (view != null) {
                    view.removeCallbacks(this.f20536l);
                }
                LinearLayout linearLayout = (LinearLayout) a_(R.id.flu);
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                LiveTextView liveTextView = (LiveTextView) a_(R.id.flw);
                if (liveTextView != null) {
                    liveTextView.setText(a2);
                }
                this.f20536l = new r(gVar, this);
                View view2 = getView();
                if (view2 != null) {
                    view2.postDelayed(this.f20536l, TimeUnit.SECONDS.toMillis(gVar.f19624h));
                }
            }
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20540a;

        static {
            Covode.recordClassIndex(12118);
        }

        d(y yVar) {
            this.f20540a = yVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            int i2;
            String str;
            List<af> list;
            List<af> list2;
            int i3 = 0;
            if (obj == com.bytedance.android.live.core.e.b.f9010c) {
                LiveLoadingView liveLoadingView = (LiveLoadingView) this.f20540a.a_(R.id.e_o);
                h.f.b.l.b(liveLoadingView, "");
                liveLoadingView.setVisibility(0);
                return;
            }
            LiveLoadingView liveLoadingView2 = (LiveLoadingView) this.f20540a.a_(R.id.e_o);
            h.f.b.l.b(liveLoadingView2, "");
            liveLoadingView2.setVisibility(8);
            y yVar = this.f20540a;
            ae aeVar = yVar.d().f20320j;
            if (aeVar == null || (list2 = aeVar.n) == null) {
                i2 = 0;
            } else {
                i2 = list2.size();
            }
            yVar.f20527b = i2;
            ae aeVar2 = yVar.d().f20320j;
            if (!(aeVar2 == null || (list = aeVar2.f20335m) == null)) {
                i3 = list.size();
            }
            yVar.f20528c = i3;
            yVar.f20529d = yVar.f20527b + yVar.f20528c;
            if (yVar.f20531f) {
                com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_anchor_qa_list_show").a("show_answered_question_cnt", yVar.f20527b).a("show_not_answered_question_cnt", yVar.f20528c).a("show_question_cnt", yVar.f20529d).a("enter_from", yVar.f20533h);
                if (yVar.f20530e) {
                    str = "1";
                } else {
                    str = "0";
                }
                a2.a("is_qa_list_end", str).b();
            }
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y f20541a;

        static {
            Covode.recordClassIndex(12119);
        }

        e(y yVar) {
            this.f20541a = yVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            androidx.fragment.app.i iVar;
            androidx.fragment.app.i iVar2;
            if (!((Boolean) obj).booleanValue()) {
                if (this.f20541a.f20531f) {
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar = com.bytedance.android.livesdk.ap.a.cd;
                    h.f.b.l.b(bVar, "");
                    Boolean a2 = bVar.a();
                    h.f.b.l.b(a2, "");
                    if (a2.booleanValue()) {
                        DataChannel dataChannel = this.f20541a.p;
                        if (!(dataChannel == null || (iVar2 = (androidx.fragment.app.i) dataChannel.b(ao.class)) == null)) {
                            new ay().show(iVar2, "QADialog");
                        }
                        com.bytedance.android.livesdk.ap.b<Boolean> bVar2 = com.bytedance.android.livesdk.ap.a.cd;
                        h.f.b.l.b(bVar2, "");
                        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar2, (Object) false);
                        return;
                    }
                }
                if (this.f20541a.f20532g) {
                    com.bytedance.android.livesdk.ap.b<Boolean> bVar3 = com.bytedance.android.livesdk.ap.a.ce;
                    h.f.b.l.b(bVar3, "");
                    Boolean a3 = bVar3.a();
                    h.f.b.l.b(a3, "");
                    if (a3.booleanValue()) {
                        DataChannel dataChannel2 = this.f20541a.p;
                        if (!(dataChannel2 == null || (iVar = (androidx.fragment.app.i) dataChannel2.b(ao.class)) == null)) {
                            new ay().show(iVar, "QADialog");
                        }
                        com.bytedance.android.livesdk.ap.b<Boolean> bVar4 = com.bytedance.android.livesdk.ap.a.ce;
                        h.f.b.l.b(bVar4, "");
                        com.bytedance.android.livesdk.ap.c.a((com.bytedance.android.livesdk.ao.c) bVar4, (Object) false);
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.d, com.bytedance.android.livesdk.v
    public final void onDismiss(DialogInterface dialogInterface) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        String str;
        List<af> list;
        List<af> list2;
        super.onDismiss(dialogInterface);
        DataChannel dataChannel = this.p;
        boolean z3 = false;
        if (dataChannel != null) {
            dataChannel.b(com.bytedance.android.live.m.d.class, (Object) false);
        }
        f.a.b.a aVar = this.f20535k;
        if (aVar != null) {
            aVar.a();
        }
        if (this.f20531f) {
            com.bytedance.android.live.p.l.QUESTION.hideRedDot(this.p);
        }
        ae aeVar = d().f20320j;
        if (aeVar == null || (list2 = aeVar.n) == null) {
            i2 = 0;
        } else {
            i2 = list2.size();
        }
        this.f20527b = i2;
        ae aeVar2 = d().f20320j;
        if (aeVar2 == null || (list = aeVar2.f20335m) == null) {
            i3 = 0;
        } else {
            i3 = list.size();
        }
        this.f20528c = i3;
        this.f20529d = this.f20527b + i3;
        ae aeVar3 = d().f20320j;
        if (aeVar3 != null) {
            z = aeVar3.r;
        } else {
            z = false;
        }
        ae aeVar4 = d().f20320j;
        if (aeVar4 != null) {
            z2 = aeVar4.q;
        } else {
            z2 = false;
        }
        if (z && z2) {
            z3 = true;
        }
        this.f20530e = z3;
        com.bytedance.android.livesdk.ab.b a2 = b.a.a("livesdk_qa_list_show").a(this.p).a("answered_question_cnt", this.f20527b).a("not_answered_question_cnt", this.f20528c).a("question_cnt", this.f20529d).a("qa_list_enter_from", this.f20533h);
        if (this.f20530e) {
            str = "1";
        } else {
            str = "0";
        }
        a2.a("is_qa_list_end", str).b();
    }

    @Override // com.bytedance.android.livesdk.v, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        boolean z2;
        Room room;
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        IMessageManager iMessageManager3;
        User user;
        ba userAttr;
        Boolean bool;
        h.f.b.l.d(view, "");
        super.onViewCreated(view, bundle);
        DataChannel dataChannel = this.p;
        if (dataChannel == null || (str = (String) dataChannel.b(au.class)) == null) {
            str = "";
        }
        this.f20533h = str;
        DataChannel dataChannel2 = this.p;
        if (dataChannel2 == null || (bool = (Boolean) dataChannel2.b(ee.class)) == null) {
            z = false;
        } else {
            z = bool.booleanValue();
        }
        this.f20531f = z;
        DataChannel dataChannel3 = this.p;
        if (dataChannel3 == null || (user = (User) dataChannel3.b(dn.class)) == null || (userAttr = user.getUserAttr()) == null) {
            z2 = false;
        } else {
            z2 = userAttr.f19030b;
        }
        this.f20532g = z2;
        DataChannel dataChannel4 = this.p;
        if (!(dataChannel4 == null || (room = (Room) dataChannel4.b(df.class)) == null)) {
            i iVar = new i(this.p, this.f20533h);
            iVar.a((PagingViewModel) d());
            iVar.f20466j = Boolean.valueOf(this.f20531f);
            iVar.f20467k = this.f20532g;
            iVar.f9140h = false;
            iVar.notifyDataSetChanged();
            iVar.a(false);
            this.f20526a = iVar;
            if (!this.f20531f) {
                ImageView imageView = (ImageView) a_(R.id.cnk);
                h.f.b.l.b(imageView, "");
                imageView.setVisibility(8);
                f.a.b.a aVar = new f.a.b.a();
                aVar.a(com.bytedance.android.livesdk.an.a.a().a(e.class).d(new f(this)));
                this.f20535k = aVar;
                DataChannel dataChannel5 = this.p;
                if (dataChannel5 != null) {
                    dataChannel5.a((androidx.lifecycle.m) this, ab.class, (h.f.a.b) new k(this)).a((androidx.lifecycle.m) this, br.class, (h.f.a.b) new l(this));
                }
                DataChannel dataChannel6 = this.p;
                if (dataChannel6 != null) {
                    dataChannel6.a((androidx.lifecycle.m) this, an.class, (h.f.a.b) new m(this)).a((androidx.lifecycle.m) this, ac.class, (h.f.a.b) new n(this));
                }
                com.bytedance.android.live.core.d.c.a("live_Q&A_audicence_show", 0, ag.c(h.v.a("isQAOPen", Boolean.valueOf(com.bytedance.android.live.m.c.b(this.p))), h.v.a("isQAReducedVersion", Boolean.valueOf(aa.a(this.p)))));
            } else {
                DataChannel dataChannel7 = this.p;
                if (dataChannel7 != null) {
                    dataChannel7.a((androidx.lifecycle.m) this, com.bytedance.android.live.broadcast.api.a.class, (h.f.a.b) new o(this)).a((androidx.lifecycle.m) this, an.class, (h.f.a.b) new p(this)).a((androidx.lifecycle.m) this, ac.class, (h.f.a.b) new q(this));
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) a_(R.id.m7);
                h.f.b.l.b(constraintLayout, "");
                constraintLayout.setVisibility(8);
                DataChannel dataChannel8 = this.p;
                if (dataChannel8 != null) {
                    dataChannel8.a((androidx.lifecycle.m) this, f.class, (h.f.a.b) new g(this));
                }
                DataChannel dataChannel9 = this.p;
                if (dataChannel9 != null) {
                    dataChannel9.a((androidx.lifecycle.m) this, a.class, (h.f.a.b) new h(this));
                }
            }
            d().a(room, this.f20531f, this.f20532g);
            i iVar2 = this.f20526a;
            if (iVar2 == null) {
                h.f.b.l.a("mAdapter");
            }
            iVar2.f20468l = room;
            ((ImageView) a_(R.id.cnk)).setOnClickListener(new i(this));
            QuestionViewModel d2 = d();
            h.f.b.l.b(d2, "");
            if (d2.f20319i == null) {
                d2.f20319i = new androidx.h.f(d2.f20321k, d2.f20322l).a();
            }
            d2.f20319i.observe(this, new j(this));
            RecyclerView recyclerView = (RecyclerView) a_(R.id.adn);
            i iVar3 = this.f20526a;
            if (iVar3 == null) {
                h.f.b.l.a("mAdapter");
            }
            recyclerView.setAdapter(iVar3);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            DataChannel dataChannel10 = this.p;
            if (!(dataChannel10 == null || (iMessageManager3 = (IMessageManager) dataChannel10.b(cg.class)) == null)) {
                iMessageManager3.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.BOTTOM_MESSAGE.getIntType(), this);
            }
            DataChannel dataChannel11 = this.p;
            if (!(dataChannel11 == null || (iMessageManager2 = (IMessageManager) dataChannel11.b(cg.class)) == null)) {
                int intType = com.bytedance.android.livesdk.model.message.a.a.QUESTION_DELETE_MESSAGE.getIntType();
                i iVar4 = this.f20526a;
                if (iVar4 == null) {
                    h.f.b.l.a("mAdapter");
                }
                iMessageManager2.addMessageListener(intType, iVar4);
            }
            DataChannel dataChannel12 = this.p;
            if (!(dataChannel12 == null || (iMessageManager = (IMessageManager) dataChannel12.b(cg.class)) == null)) {
                iMessageManager.addMessageListener(com.bytedance.android.livesdk.model.message.a.a.QUESTION_DELETE_MESSAGE.getIntType(), this);
            }
        }
        ((ImageView) a_(R.id.a7k)).setOnClickListener(new b(this));
        ((ConstraintLayout) a_(R.id.m7)).setOnClickListener(new c(this));
        d().f9212c.observe(this, new d(this));
        if (this.f20531f || this.f20532g) {
            QuestionViewModel d3 = d();
            h.f.b.l.b(d3, "");
            d3.f9213d.observe(this, new e(this));
        }
    }
}
