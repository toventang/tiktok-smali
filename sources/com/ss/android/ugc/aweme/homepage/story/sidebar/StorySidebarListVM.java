package com.ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.page.f;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.homepage.story.IHomepageStoryApi;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class StorySidebarListVM extends BaseDetailShareVM<o, n, Long> implements com.ss.android.ugc.aweme.story.api.a {
    public static final a p = new a((byte) 0);

    /* renamed from: m  reason: collision with root package name */
    long f99450m;
    public StorySidebarListCell n;
    public final Set<String> o = new LinkedHashSet();
    private List<Long> q = z.INSTANCE;
    private List<? extends Aweme> r = z.INSTANCE;
    private final Set<String> s = new HashSet();
    private boolean t;

    /* access modifiers changed from: package-private */
    public static final class d extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StorySidebarListVM this$0;

        static {
            Covode.recordClassIndex(63397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(StorySidebarListVM storySidebarListVM, h.c.d dVar) {
            super(dVar);
            this.this$0 = storySidebarListVM;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, this);
        }
    }

    static {
        Covode.recordClassIndex(63393);
    }

    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final int a(String str) {
        l.d(str, "");
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 40;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(63394);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new o();
    }

    public final boolean j() {
        if (this.f99450m < ((long) this.q.size())) {
            return true;
        }
        return false;
    }

    private final List<String> k() {
        int i2 = (int) this.f99450m;
        List<Long> subList = this.q.subList(i2, Math.min(IHomepageStoryApi.a.f99233a + i2, this.q.size()));
        ArrayList arrayList = new ArrayList(n.a((Iterable) subList, 10));
        Iterator<T> it = subList.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        return arrayList;
    }

    static final class c extends m implements h.f.a.b<o, o> {
        final /* synthetic */ int $position;

        static {
            Covode.recordClassIndex(63396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(int i2) {
            super(1);
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            return o.a(oVar2, null, null, this.$position, 3);
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* synthetic */ Long a(com.ss.android.ugc.aweme.feed.param.b bVar) {
        l.d(bVar, "");
        return Long.valueOf(this.f99450m);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.ies.powerlist.b.a] */
    @Override // com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM
    public final /* synthetic */ Aweme b(n nVar) {
        n nVar2 = nVar;
        l.d(nVar2, "");
        return nVar2.f99486a;
    }

    @Override // com.ss.android.ugc.aweme.story.api.a
    public final void c(int i2) {
        a((h.f.a.b) new c(i2));
    }

    static final class b extends m implements h.f.a.b<o, o> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(63395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            return o.a(oVar2, this.$newListState, null, 0, 6);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<o, o> {
        final /* synthetic */ List $data;

        static {
            Covode.recordClassIndex(63398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(List list) {
            super(1);
            this.$data = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            o oVar2 = oVar;
            l.d(oVar2, "");
            return o.a(oVar2, null, new com.bytedance.assem.arch.extensions.a(Integer.valueOf(this.$data.size())), 0, 5);
        }
    }

    static final class f extends m implements h.f.a.b<o, o> {
        final /* synthetic */ List $data;

        static {
            Covode.recordClassIndex(63399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list) {
            super(1);
            this.$data = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ o invoke(o oVar) {
            int i2;
            o oVar2 = oVar;
            l.d(oVar2, "");
            List<ITEM> list = oVar2.f99487a.f28670d;
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            return o.a(oVar2, null, new com.bytedance.assem.arch.extensions.a(Integer.valueOf(this.$data.size() - i2)), 0, 5);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Long>> dVar) {
        this.s.clear();
        List<n> a2 = a(this.r);
        com.ss.android.ugc.aweme.story.j.a.b("SidebarListVM", "onRefresh, preload list size: " + this.r.size() + ", actual size: " + a2.size() + ", next cursor: " + this.f99450m);
        if (!j()) {
            return f.a.a(a2);
        }
        if (a2.isEmpty()) {
            return a(this.f99450m, dVar);
        }
        a((h.f.a.b) new f(a2));
        return f.a.a(null, h.c.b.a.b.a(this.f99450m), a2, 1);
    }

    private final List<n> a(List<? extends Aweme> list) {
        String str;
        String uid;
        ArrayList arrayList = new ArrayList();
        for (T t2 : list) {
            if (!com.ss.android.ugc.aweme.homepage.story.c.b.a((Aweme) t2)) {
                arrayList.add(t2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            User author = ((Aweme) obj).getAuthor();
            if (!(author == null || (uid = author.getUid()) == null || uid.length() == 0 || this.s.contains(uid))) {
                arrayList2.add(obj);
            }
        }
        ArrayList<Aweme> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
        for (Aweme aweme : arrayList3) {
            Set<String> set = this.s;
            User author2 = aweme.getAuthor();
            if (author2 == null || (str = author2.getUid()) == null) {
                str = "";
            }
            set.add(str);
            arrayList4.add(new n(aweme));
        }
        return arrayList4;
    }

    public final void a(float f2) {
        if (((double) f2) < 0.9d) {
            this.t = false;
            StorySidebarListCell storySidebarListCell = this.n;
            if (storySidebarListCell != null) {
                storySidebarListCell.onAnimateUpdate(f2);
            }
        } else if (!this.t) {
            this.t = true;
            StorySidebarListCell storySidebarListCell2 = this.n;
            if (storySidebarListCell2 != null) {
                storySidebarListCell2.onAnimateFinish();
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<n> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new b(aVar));
    }

    private void b(List<Long> list, List<? extends Aweme> list2) {
        l.d(list, "");
        l.d(list2, "");
        this.f99450m = (long) list2.size();
        this.r = list2;
        this.q = list;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* synthetic */ Object a(Object obj, h.c.d dVar) {
        return a(((Number) obj).longValue(), dVar);
    }

    private final com.bytedance.ies.powerlist.page.f<Long> a(int i2, List<n> list) {
        this.f99450m += (long) i2;
        a((h.f.a.b) new e(list));
        if (j()) {
            return f.a.a(null, Long.valueOf(this.f99450m), list, 1);
        }
        com.ss.android.ugc.aweme.story.j.a.b("SidebarListVM", "on loadmore complete");
        return f.a.a(list);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[Catch:{ Exception -> 0x00c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r8, h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Long>> r10) {
        /*
        // Method dump skipped, instructions count: 248
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarListVM.a(long, h.c.d):java.lang.Object");
    }

    public final void a(List<Long> list, List<? extends Aweme> list2) {
        l.d(list, "");
        l.d(list2, "");
        b(list, list2);
        g();
        com.ss.android.ugc.aweme.story.j.a.b("SidebarListVM", "manually refresh called with uidList size: " + list.size() + ", cache size: " + list2.size());
    }
}
