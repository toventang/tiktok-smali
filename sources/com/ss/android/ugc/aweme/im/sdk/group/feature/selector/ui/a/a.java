package com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.i;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerList;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.v;
import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.ShareGroupCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.b;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.ContactListCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.IndexCell;
import com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.ContactListViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class a extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public PowerList f102696j;

    /* renamed from: k  reason: collision with root package name */
    private final i f102697k = new i(bQ_(), new c(this, "init_config"));

    /* renamed from: l  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f102698l;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b, com.ss.android.ugc.aweme.im.sdk.group.feature.selector.viewmodel.b> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(65768);
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
        Covode.recordClassIndex(65766);
    }

    /* access modifiers changed from: package-private */
    public final b.d u() {
        return (b.d) this.f102697k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a$a  reason: collision with other inner class name */
    public static final class C2587a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(65767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2587a(h.k.c cVar) {
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
            Covode.recordClassIndex(65769);
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.a.c.invoke():java.lang.Object");
        }
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(ContactListViewModel.class);
        C2587a aVar = new C2587a(a2);
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
        this.f102698l = bVar;
    }

    public static final class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102702a;

        static {
            Covode.recordClassIndex(65771);
        }

        e(a aVar) {
            this.f102702a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            h hVar = (h) com.bytedance.assem.arch.service.d.c(this.f102702a, ab.a(h.class));
            if (hVar != null) {
                hVar.v();
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102701a;

        static {
            Covode.recordClassIndex(65770);
        }

        d(a aVar) {
            this.f102701a = aVar;
        }

        public final void onClick(View view) {
            androidx.fragment.app.i fragmentManager;
            ClickAgent.onClick(view);
            a aVar = this.f102701a;
            com.ss.android.ugc.aweme.im.service.m.a.c("GroupCreateFragment", "enterJoinedGroupListFragment onClick");
            Fragment a2 = com.bytedance.assem.arch.extensions.b.a((androidx.lifecycle.m) aVar);
            if (a2 != null && (fragmentManager = a2.getFragmentManager()) != null) {
                com.ss.android.ugc.aweme.im.service.m.a.c("GroupCreateFragment", "enterJoinedGroupListFragment onTransfer");
                n a3 = fragmentManager.a();
                a3.a(R.anim.dq, 0, 0, R.anim.dx);
                a3.b(R.id.b5g, new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.b.a());
                a3.a("GroupCreateFragment");
                a3.b();
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        PowerList powerList = (PowerList) s().findViewById(R.id.ad4);
        l.b(powerList, "");
        this.f102696j = powerList;
        if (powerList == null) {
            l.a("contactPowerList");
        }
        powerList.a(ContactListCell.class, IndexCell.class, ShareGroupCell.class);
        powerList.setItemAnimator(null);
        powerList.a(new e(this));
        f.a.a(this, (ContactListViewModel) this.f102698l.getValue(), b.f102703a, com.bytedance.assem.arch.viewModel.l.a(), new f(this), 4);
        com.bytedance.assem.arch.service.d.a(this, ab.a(h.class), c.f102706a, d.f102707a, new g(this));
    }

    static final class g extends m implements h.f.a.m<com.bytedance.assem.arch.extensions.a<? extends Boolean>, String, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65773);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar, String str) {
            String str2 = str;
            l.d(aVar, "");
            PowerList powerList = this.this$0.f102696j;
            if (powerList == null) {
                l.a("contactPowerList");
            }
            int i2 = 0;
            if (!(str2 == null || str2.length() == 0)) {
                i2 = 8;
            }
            powerList.setVisibility(i2);
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends List<? extends IMUser>>, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(65772);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends List<? extends IMUser>> aVar) {
            Context ar_;
            String string;
            MethodCollector.i(7385);
            com.bytedance.assem.arch.extensions.a<? extends List<? extends IMUser>> aVar2 = aVar;
            l.d(pVar, "");
            l.d(aVar2, "");
            a aVar3 = this.this$0;
            T t = aVar2.f25631b;
            PowerList powerList = aVar3.f102696j;
            if (powerList == null) {
                l.a("contactPowerList");
            }
            powerList.getState().a();
            if (aVar3.u().getEntry().getShowJoinedGroupsHeader()) {
                PowerList powerList2 = aVar3.f102696j;
                if (powerList2 == null) {
                    l.a("contactPowerList");
                }
                if (powerList2.getHeaderCount() <= 0) {
                    PowerList powerList3 = aVar3.f102696j;
                    if (powerList3 == null) {
                        l.a("contactPowerList");
                    }
                    View inflate = LayoutInflater.from(powerList3.getContext()).inflate(R.layout.a54, (ViewGroup) null);
                    inflate.setOnClickListener(new d(aVar3));
                    PowerList powerList4 = aVar3.f102696j;
                    if (powerList4 == null) {
                        l.a("contactPowerList");
                    }
                    powerList4.a(0, inflate);
                    l.b(inflate, "");
                    v.a(inflate);
                }
            }
            int i2 = 0;
            for (Object obj : t) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    h.a.n.a();
                }
                IMUser iMUser = (IMUser) obj;
                if (i2 == 0 || (!l.a((Object) ((IMUser) t.get(i2 - 1)).getInitialLetter(), (Object) iMUser.getInitialLetter()))) {
                    PowerList powerList5 = aVar3.f102696j;
                    if (powerList5 == null) {
                        l.a("contactPowerList");
                    }
                    com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList5.getState();
                    String initialLetter = iMUser.getInitialLetter();
                    l.b(initialLetter, "");
                    state.a(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.e(initialLetter));
                }
                PowerList powerList6 = aVar3.f102696j;
                if (powerList6 == null) {
                    l.a("contactPowerList");
                }
                powerList6.getState().a(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.b(iMUser));
                i2 = i3;
            }
            if (!(!com.ss.android.ugc.aweme.im.sdk.common.controller.c.c.a() || aVar3.u().getEntry() != com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.a.ADD_MEMBER || aVar3.u().getConversationId().length() == 0 || (ar_ = aVar3.ar_()) == null || (string = ar_.getString(R.string.c8n)) == null)) {
                PowerList powerList7 = aVar3.f102696j;
                if (powerList7 == null) {
                    l.a("contactPowerList");
                }
                com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state2 = powerList7.getState();
                l.b(string, "");
                state2.a(new com.ss.android.ugc.aweme.im.sdk.group.feature.selector.ui.view.e(string));
                state2.a(new com.ss.android.ugc.aweme.im.sdk.group.feature.invite.ui.view.b(aVar3.u().getConversationId()));
            }
            z zVar = z.f158842a;
            MethodCollector.o(7385);
            return zVar;
        }
    }
}
