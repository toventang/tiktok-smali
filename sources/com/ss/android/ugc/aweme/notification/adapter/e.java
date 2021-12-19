package com.ss.android.ugc.aweme.notification.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.adapter.f;
import com.ss.android.ugc.aweme.notification.h.as;
import com.ss.android.ugc.aweme.notification.h.ax;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.notification.vm.d;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public final class e extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f113180f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public DmtStatusView f113181a;

    /* renamed from: b  reason: collision with root package name */
    public k<User> f113182b;

    /* renamed from: c  reason: collision with root package name */
    public as.b f113183c;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f113184d;

    /* renamed from: e  reason: collision with root package name */
    public final Fragment f113185e;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f113186g = com.ss.android.ugc.aweme.notification.b.a.a(new i(this));

    /* renamed from: h  reason: collision with root package name */
    private final h.h f113187h = com.ss.android.ugc.aweme.notification.b.a.a(c.f113191a);

    /* renamed from: i  reason: collision with root package name */
    private final f f113188i = new f(new d(this));

    static {
        Covode.recordClassIndex(72760);
    }

    public final NotificationVM a() {
        return (NotificationVM) this.f113186g.getValue();
    }

    public final List<MusNotice> b() {
        return (List) this.f113187h.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72761);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends j.a {

        /* renamed from: a  reason: collision with root package name */
        public final List<MusNotice> f113189a;

        /* renamed from: b  reason: collision with root package name */
        public final List<MusNotice> f113190b;

        static {
            Covode.recordClassIndex(72762);
        }

        @Override // androidx.recyclerview.widget.j.a
        public final int a() {
            return this.f113189a.size();
        }

        @Override // androidx.recyclerview.widget.j.a
        public final int b() {
            return this.f113190b.size();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends MusNotice> list, List<? extends MusNotice> list2) {
            l.d(list, "");
            l.d(list2, "");
            this.f113189a = list;
            this.f113190b = list2;
        }

        @Override // androidx.recyclerview.widget.j.a
        public final boolean b(int i2, int i3) {
            if (this.f113189a.get(i2).getUniqueId() == this.f113190b.get(i3).getUniqueId()) {
                return true;
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.j.a
        public final boolean c(int i2, int i3) {
            return l.a(this.f113189a.get(i2), this.f113190b.get(i3));
        }
    }

    static final class c extends m implements h.f.a.a<List<MusNotice>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113191a = new c();

        static {
            Covode.recordClassIndex(72763);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ List<MusNotice> invoke() {
            return new ArrayList();
        }
    }

    public static final class d implements f.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f113192a;

        static {
            Covode.recordClassIndex(72764);
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final List<MusNotice> a() {
            return this.f113192a.b();
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final /* synthetic */ BaseNotificationVM b() {
            return this.f113192a.a();
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final Fragment c() {
            return this.f113192a.f113185e;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final DmtStatusView d() {
            DmtStatusView dmtStatusView = this.f113192a.f113181a;
            if (dmtStatusView == null) {
                l.a("statusView");
            }
            return dmtStatusView;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final k<User> e() {
            k<User> kVar = this.f113192a.f113182b;
            if (kVar == null) {
                l.a("recommendListener");
            }
            return kVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final as.b f() {
            as.b bVar = this.f113192a.f113183c;
            if (bVar == null) {
                l.a("turnOnQAListener");
            }
            return bVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final void g() {
            com.ss.android.ugc.aweme.notification.vm.c j2 = this.f113192a.a().j();
            if (!(j2 instanceof com.ss.android.ugc.aweme.notification.vm.d)) {
                j2 = null;
            }
            com.ss.android.ugc.aweme.notification.vm.d dVar = (com.ss.android.ugc.aweme.notification.vm.d) j2;
            if (dVar != null) {
                com.ss.android.ugc.aweme.common.f.b("NotificationTLModel", "expand start");
                f.a.b.b a2 = t.a(new d.c(dVar)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new d.C2926d(dVar), d.e.f114263a);
                l.b(a2, "");
                f.a.j.a.a(a2, dVar.g());
            }
            com.ss.android.ugc.aweme.notification.utils.e.c(this.f113192a.a().b());
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(e eVar) {
            this.f113192a = eVar;
        }

        @Override // com.ss.android.ugc.aweme.notification.adapter.f.a
        public final void a(int i2) {
            this.f113192a.a().j().a(i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.e$e  reason: collision with other inner class name */
    static final class C2891e extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2891e f113193a = new C2891e();

        static {
            Covode.recordClassIndex(72765);
        }

        C2891e() {
            super(0);
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            com.bytedance.ies.ugc.appcontext.d.a();
            if (!com.ss.android.ugc.aweme.lancet.j.f107229h || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107229h = a();
            }
            return Boolean.valueOf(com.ss.android.ugc.aweme.lancet.j.f107229h);
        }
    }

    public static final class g extends m implements h.f.a.a<j.d> {
        final /* synthetic */ List $newList;
        final /* synthetic */ List $oldList;

        static {
            Covode.recordClassIndex(72767);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(List list, List list2) {
            super(0);
            this.$oldList = list;
            this.$newList = list2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j.d invoke() {
            return j.a(new b(this.$oldList, this.$newList), true);
        }
    }

    static final class i extends m implements h.f.a.a<NotificationVM> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(72769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.a.a(this.this$0.f113185e);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return b().get(i2).getUniqueId();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return g.a(b().get(i2));
    }

    static final class f extends m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(72766);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar) {
            super(1);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (l.a((Object) bool, (Object) true)) {
                this.this$0.a().j().j();
            }
            return z.f158842a;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.notification.h.a)) {
            viewHolder = null;
        }
        com.ss.android.ugc.aweme.notification.h.a aVar = (com.ss.android.ugc.aweme.notification.h.a) viewHolder;
        if (aVar != null) {
            aVar.d();
        }
    }

    public static final class h extends m implements h.f.a.b<j.d, z> {
        final /* synthetic */ h.f.a.a $callback;
        final /* synthetic */ List $newList;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(72768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(e eVar, List list, h.f.a.a aVar) {
            super(1);
            this.this$0 = eVar;
            this.$newList = list;
            this.$callback = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(j.d dVar) {
            j.d dVar2 = dVar;
            if (dVar2 == null || this.this$0.f113184d) {
                com.ss.android.ugc.aweme.common.f.c("NotificationAdapter", "submitListByDiffer but data changed again");
            } else {
                this.this$0.b().clear();
                this.this$0.b().addAll(this.$newList);
                dVar2.a(this.this$0);
                h.f.a.a aVar = this.$callback;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            return z.f158842a;
        }
    }

    public e(Fragment fragment) {
        l.d(fragment, "");
        this.f113185e = fragment;
        setHasStableIds(com.ss.android.ugc.aweme.notification.e.a.a().f113374a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        RecyclerView.ViewHolder viewHolder2;
        BaseNotice baseNotice;
        int a2;
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        com.ss.android.ugc.aweme.inbox.d.e.e();
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.notification.h.a)) {
            viewHolder2 = null;
        } else {
            viewHolder2 = viewHolder;
        }
        com.ss.android.ugc.aweme.notification.h.a aVar = (com.ss.android.ugc.aweme.notification.h.a) viewHolder2;
        if (aVar != null) {
            aVar.bY_();
        }
        if (!(viewHolder instanceof com.ss.android.ugc.aweme.notification.h.k)) {
            viewHolder = null;
        }
        com.ss.android.ugc.aweme.notification.h.k kVar = (com.ss.android.ugc.aweme.notification.h.k) viewHolder;
        if (kVar != null && (baseNotice = kVar.f113648j) != null && com.ss.android.ugc.aweme.notification.e.a.a().f113375b && !a().j().d() && !(!l.a((Object) a().j().e().getValue(), (Object) true)) && (a2 = n.a((List) b(), (Object) baseNotice)) > 0 && b().size() - a2 <= 10) {
            com.ss.android.ugc.aweme.notification.e.d.a(C2891e.f113193a, new f(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof com.ss.android.ugc.aweme.notification.h.j) {
            com.ss.android.ugc.aweme.notification.h.j jVar = (com.ss.android.ugc.aweme.notification.h.j) viewHolder;
            jVar.f113487h = NotificationVM.a.a(jVar.f113642a);
            return;
        }
        this.f113188i.a(viewHolder, i2);
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(1784);
        l.d(viewGroup, "");
        if (i2 == 9999) {
            viewHolder = new com.ss.android.ugc.aweme.notification.h.j(f.a((int) R.layout.ka, viewGroup), eVar.f113185e);
        } else if (i2 != 99999) {
            viewHolder = eVar.f113188i.a(viewGroup, i2);
        } else {
            viewHolder = new ax(f.a((int) R.layout.kg, viewGroup));
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(1784);
        return viewHolder;
    }
}
