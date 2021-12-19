package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.a;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.d.ah;
import com.bytedance.tux.button.TuxButton;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.activity.ChatRoomActivity;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.a;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class p extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public View f102727j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.extensions.i f102728k = new com.bytedance.assem.arch.extensions.i(bQ_(), new c(this, "init_config"));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f102729l;

    /* renamed from: m  reason: collision with root package name */
    private TuxButton f102730m;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(65806);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b invoke(com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b bVar) {
            l.c(bVar, "");
            return bVar;
        }
    }

    static {
        Covode.recordClassIndex(65804);
    }

    /* access modifiers changed from: package-private */
    public final b.d u() {
        return (b.d) this.f102728k.getValue();
    }

    public final ContactListViewModel v() {
        return (ContactListViewModel) this.f102729l.getValue();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(65805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    public static final class c extends m implements h.f.a.a<b.d> {
        final /* synthetic */ String $identify;
        final /* synthetic */ com.bytedance.assem.arch.core.a $this_hierarchyData;

        static {
            Covode.recordClassIndex(65807);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(com.bytedance.assem.arch.core.a aVar, String str) {
            super(0);
            this.$this_hierarchyData = aVar;
            this.$identify = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$d, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b.d invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.$this_hierarchyData
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bx_()
                com.bytedance.assem.arch.core.d r2 = r0.f25533f
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b$d> r1 = com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b.d.class
                java.lang.String r0 = r3.$identify
                java.lang.Object r0 = r2.a(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.p.c.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f102735a;

        static {
            Covode.recordClassIndex(65814);
        }

        i(p pVar) {
            this.f102735a = pVar;
        }

        public final void run() {
            int i2;
            View view = this.f102735a.f102727j;
            if (view == null) {
                l.a("widget");
            }
            if (this.f102735a.v().i().size() > 0) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    public final void x() {
        View view = this.f102727j;
        if (view == null) {
            l.a("widget");
        }
        view.postDelayed(new i(this), 50);
        TuxButton tuxButton = this.f102730m;
        if (tuxButton == null) {
            l.a("button");
        }
        tuxButton.setText(u().getEntry().sendBtnText(v().l()));
    }

    public p() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ContactListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f102729l = bVar;
    }

    /* access modifiers changed from: package-private */
    public final void w() {
        List<IMUser> m2 = v().m();
        com.ss.android.ugc.aweme.im.service.m.a.c("GroupCreateFragment", "creating chat, selected size: " + m2.size());
        int size = m2.size();
        if (size == 0) {
            x();
        } else if (size != 1) {
            e.a.a();
            ArrayList arrayList = new ArrayList(n.a((Iterable) m2, 10));
            Iterator<T> it = m2.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUid());
            }
            com.ss.android.ugc.aweme.im.sdk.group.a.e.a(arrayList, new h(this));
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.b(v().m()));
        } else {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(0, a.C0745a.a().a(b.a.b(m2.get(0).getUid())), "private", null);
            ChatRoomActivity.a.a(a.b.a(ar_(), m2.get(0)).b(0).f103883a);
            androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this);
            if (b2 != null) {
                b2.finish();
            }
        }
    }

    public static final class d implements com.bytedance.im.core.a.a.b<List<? extends ah>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f102731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f102732b;

        static {
            Covode.recordClassIndex(65808);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(List<? extends ah> list) {
            androidx.fragment.app.e activity = this.f102732b.getActivity();
            if (activity != null) {
                activity.setResult(2095);
                activity.finish();
            }
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(com.bytedance.im.core.d.u uVar) {
            androidx.fragment.app.e activity;
            if (uVar == null || (activity = this.f102732b.getActivity()) == null) {
                com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
                this.f102731a.a(false);
                return;
            }
            com.ss.android.ugc.aweme.im.sdk.group.a.a.b.a(com.bytedance.ies.ugc.appcontext.d.a(), uVar);
            activity.finish();
        }

        d(p pVar, Fragment fragment) {
            this.f102731a = pVar;
            this.f102732b = fragment;
        }
    }

    static final class f extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(65810);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.this$0, AnonymousClass1.f102734a);
            return z.f158842a;
        }
    }

    public final void a(boolean z) {
        TuxButton tuxButton = this.f102730m;
        if (tuxButton == null) {
            l.a("button");
        }
        tuxButton.setLoading(z);
        v().f102769k = z;
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<com.bytedance.im.core.d.h, z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(65813);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.im.core.d.h hVar) {
            com.bytedance.im.core.d.h hVar2 = hVar;
            if (hVar2 == null) {
                this.this$0.a(false);
            } else {
                ChatRoomActivity.a.a(a.b.a(this.this$0.ar_(), com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.a(hVar2)).b(3).a(hVar2.getConversationId()).b("create_group").f103883a);
                androidx.fragment.app.e b2 = com.bytedance.assem.arch.extensions.b.b(this.this$0);
                if (b2 != null) {
                    b2.finish();
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        ContactListViewModel v;
        l.d(view, "");
        com.bytedance.assem.arch.extensions.d.a(this, new f(this));
        LinearLayout linearLayout = (LinearLayout) s().findViewById(R.id.w1);
        l.b(linearLayout, "");
        this.f102727j = linearLayout;
        TuxButton tuxButton = (TuxButton) s().findViewById(R.id.dyg);
        tuxButton.setOnClickListener(new e(this));
        l.b(tuxButton, "");
        this.f102730m = tuxButton;
        a(v, com.bytedance.assem.arch.viewModel.l.a(v().f25686c), null, new g(this));
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f102733a;

        static {
            Covode.recordClassIndex(65809);
        }

        e(p pVar) {
            this.f102733a = pVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u.a(view, 500)) {
                p pVar = this.f102733a;
                if (!pVar.v().f102769k) {
                    pVar.a(true);
                    int i2 = q.f102736a[pVar.u().getEntry().ordinal()];
                    if (i2 == 1) {
                        Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) pVar);
                        if (a2 != null) {
                            e.a.a();
                            String uid = pVar.v().f102768j.getUid();
                            l.b(uid, "");
                            long parseLong = Long.parseLong(uid);
                            String conversationId = pVar.u().getConversationId();
                            List<IMUser> k2 = pVar.v().k();
                            d dVar = new d(pVar, a2);
                            l.d(conversationId, "");
                            l.d(k2, "");
                            l.d(dVar, "");
                            if (conversationId.length() != 0) {
                                com.bytedance.ies.im.core.api.b.b a3 = b.a.a(conversationId);
                                ArrayList arrayList = new ArrayList(n.a((Iterable) k2, 10));
                                Iterator<T> it = k2.iterator();
                                while (it.hasNext()) {
                                    arrayList.add(it.next().getUid());
                                }
                                HashMap hashMap = new HashMap();
                                JSONObject jSONObject = new JSONObject();
                                JSONObject jSONObject2 = new JSONObject();
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject2.put("source_app_id", com.bytedance.ies.ugc.appcontext.d.n);
                                jSONObject3.put("im_user_id", parseLong);
                                jSONObject.put("invitee", jSONObject2);
                                jSONObject.put("invitor", jSONObject3);
                                jSONObject.put("source_type", 6);
                                String jSONObject4 = jSONObject.toString();
                                l.b(jSONObject4, "");
                                hashMap.put("invitation", jSONObject4);
                                a3.a(arrayList, hashMap, dVar);
                            }
                            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.b(com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.b(pVar.v().k()));
                        }
                    } else if (i2 == 2) {
                        pVar.w();
                    }
                }
            }
        }
    }

    static final class g extends m implements h.f.a.m<com.bytedance.assem.arch.core.p, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(65812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(p pVar) {
            super(2);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.core.p pVar, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b bVar) {
            l.d(pVar, "");
            l.d(bVar, "");
            this.this$0.x();
            return z.f158842a;
        }
    }
}
