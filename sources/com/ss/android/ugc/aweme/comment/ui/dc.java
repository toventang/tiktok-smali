package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.page.f;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.comment.adapter.LikeCell;
import com.ss.android.ugc.aweme.comment.adapter.LikeLoadMoreCell;
import com.ss.android.ugc.aweme.comment.adapter.LikeNoMoreLimitCell;
import com.ss.android.ugc.aweme.comment.adapter.af;
import com.ss.android.ugc.aweme.comment.adapter.ag;
import com.ss.android.ugc.aweme.comment.adapter.ah;
import com.ss.android.ugc.aweme.comment.model.LikeListResponse;
import com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.i;
import h.m.p;
import h.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dc extends com.ss.android.ugc.aweme.base.f.a implements com.ss.android.ugc.aweme.comment.f.f {

    /* renamed from: k  reason: collision with root package name */
    public static final a f72707k = new a((byte) 0);
    private static final int s;

    /* renamed from: a  reason: collision with root package name */
    public Aweme f72708a;

    /* renamed from: b  reason: collision with root package name */
    public long f72709b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.i.h f72710c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.f.e f72711d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f72712e = true;

    /* renamed from: j  reason: collision with root package name */
    public ah f72713j = new ah();

    /* renamed from: l  reason: collision with root package name */
    private String f72714l;

    /* renamed from: m  reason: collision with root package name */
    private int f72715m;
    private final h.h n = i.a((h.f.a.a) new e(this));
    private boolean o;
    private final h.h p = i.a((h.f.a.a) new g(this));
    private final h.h q = i.a((h.f.a.a) new b(this));
    private final f r;
    private SparseArray t;

    private final TuxStatusView e() {
        return (TuxStatusView) this.p.getValue();
    }

    private final TuxTextView g() {
        return (TuxTextView) this.q.getValue();
    }

    public final View a(int i2) {
        if (this.t == null) {
            this.t = new SparseArray();
        }
        View view = (View) this.t.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.t.put(i2, findViewById);
        return findViewById;
    }

    public final LikeListVM a() {
        return (LikeListVM) this.n.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void c(boolean z) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44802);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static dc a(androidx.fragment.app.e eVar, com.ss.android.ugc.aweme.comment.i.h hVar, Aweme aweme, com.ss.android.ugc.aweme.comment.f.e eVar2) {
            l.d(eVar, "");
            l.d(hVar, "");
            l.d(aweme, "");
            l.d(eVar2, "");
            dc dcVar = new dc();
            Bundle bundle = new Bundle();
            bundle.putSerializable("id", hVar);
            dcVar.setArguments(bundle);
            dcVar.f72710c = hVar;
            dcVar.f72711d = eVar2;
            dcVar.f72708a = aweme;
            dcVar.f72709b = LikeListVM.a.a(eVar).a(aweme);
            return dcVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void i() {
        d(false);
    }

    static final class b extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ dc this$0;

        static {
            Covode.recordClassIndex(44803);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(dc dcVar) {
            super(0);
            this.this$0 = dcVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.a(R.id.aw0);
        }
    }

    static final class e extends m implements h.f.a.a<LikeListVM> {
        final /* synthetic */ dc this$0;

        static {
            Covode.recordClassIndex(44806);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(dc dcVar) {
            super(0);
            this.this$0 = dcVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LikeListVM invoke() {
            androidx.fragment.app.e requireActivity = this.this$0.requireActivity();
            l.b(requireActivity, "");
            return LikeListVM.a.a(requireActivity);
        }
    }

    static final class g extends m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ dc this$0;

        static {
            Covode.recordClassIndex(44808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(dc dcVar) {
            super(0);
            this.this$0 = dcVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.a(R.id.e_o);
        }
    }

    private final String b() {
        String aid;
        Aweme aweme = this.f72708a;
        if (aweme == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final RecyclerView c() {
        return (RecyclerView) a(R.id.cb4);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void h() {
        if (this.o) {
            d(true);
        }
        j();
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    private final void k() {
        String str;
        String b2 = b();
        Aweme aweme = this.f72708a;
        com.ss.android.ugc.aweme.comment.i.h hVar = this.f72710c;
        if (hVar == null || (str = hVar.getEnterFrom()) == null) {
            str = "";
        }
        this.f72713j = new ah(b2, aweme, str);
    }

    static {
        Covode.recordClassIndex(44801);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        s = h.g.a.a(TypedValue.applyDimension(1, 64.0f, system.getDisplayMetrics()));
    }

    public dc() {
        com.bytedance.ies.powerlist.page.config.c cVar = new com.bytedance.ies.powerlist.page.config.c();
        cVar.f34356a = 10;
        cVar.f34357b = false;
        this.r = new f(this, cVar.a(LikeLoadMoreCell.class));
    }

    private final void j() {
        ArrayList arrayList;
        List<User> likeList;
        if (ab_()) {
            a().a(b());
            LikeListResponse k2 = a().k();
            if (this.f72712e || k2 != null) {
                com.ss.android.ugc.aweme.comment.f.e eVar = this.f72711d;
                if (eVar != null) {
                    eVar.a(this);
                }
                if (k2 == null || (likeList = k2.getLikeList()) == null) {
                    arrayList = z.INSTANCE;
                } else {
                    ArrayList arrayList2 = new ArrayList(n.a((Iterable) likeList, 10));
                    Iterator<T> it = likeList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new af(it.next(), this.f72713j, false));
                    }
                    arrayList = arrayList2;
                }
                PowerList powerList = (PowerList) a(R.id.cb4);
                l.b(powerList, "");
                powerList.getState().b(arrayList);
                this.r.f34367c.e();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final String d() {
        long a2;
        Context context = getContext();
        if (context == null) {
            context = com.bytedance.ies.ugc.appcontext.d.a();
        }
        l.b(context, "");
        String string = context.getResources().getString(R.string.bo_);
        l.b(string, "");
        if (!ab_()) {
            a2 = this.f72709b;
        } else {
            a2 = a().a(this.f72708a);
        }
        String a3 = com.ss.android.ugc.aweme.i18n.b.a(a2);
        l.b(a3, "");
        return p.a(string, "%d", a3, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(com.ss.android.ugc.aweme.comment.f.e eVar) {
        l.d(eVar, "");
        this.f72711d = eVar;
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dc f72716a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f72717b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f72718c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f72719d;

        static {
            Covode.recordClassIndex(44804);
        }

        c(dc dcVar, h.c.d dVar, List list, z.e eVar) {
            this.f72716a = dcVar;
            this.f72717b = dVar;
            this.f72718c = list;
            this.f72719d = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f72716a.a((LikeListResponse) obj, null, this.f72717b, this.f72718c, this.f72719d.element);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(com.ss.android.ugc.aweme.comment.i.h hVar) {
        this.f72710c = hVar;
        k();
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dc f72720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.c.d f72721b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f72722c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z.e f72723d;

        static {
            Covode.recordClassIndex(44805);
        }

        d(dc dcVar, h.c.d dVar, List list, z.e eVar) {
            this.f72720a = dcVar;
            this.f72721b = dVar;
            this.f72722c = list;
            this.f72723d = eVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            LikeListResponse k2 = this.f72720a.a().k();
            if (k2 != null) {
                this.f72720a.a(k2, null, this.f72721b, this.f72722c, this.f72723d.element);
            } else {
                this.f72720a.a(null, th, this.f72721b, this.f72722c, this.f72723d.element);
            }
        }
    }

    public static final class f extends com.bytedance.ies.powerlist.page.config.b<List<? extends User>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dc f72724a;

        static {
            Covode.recordClassIndex(44807);
        }

        @Override // com.bytedance.ies.powerlist.page.config.d
        public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<List<User>>> dVar) {
            l.d(dVar, "");
            if (this.f72724a.ab_()) {
                if (this.f72724a.f72712e) {
                    this.f72724a.f72712e = false;
                    this.f72724a.a(dVar, h.a.z.INSTANCE);
                    return;
                }
                LikeListResponse k2 = this.f72724a.a().k();
                if (k2 != null) {
                    this.f72724a.a(k2, null, dVar, h.a.z.INSTANCE, null);
                } else {
                    com.ss.android.ugc.aweme.comment.util.i.b("LikeListFragment", "configList onRefresh unknown error");
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(dc dcVar, com.bytedance.ies.powerlist.page.config.c cVar) {
            super(cVar);
            this.f72724a = dcVar;
        }

        @Override // com.bytedance.ies.powerlist.page.config.d
        public final /* synthetic */ void b(h.c.d dVar, Object obj) {
            List<? extends User> list = (List) obj;
            l.d(dVar, "");
            l.d(list, "");
            if (this.f72724a.ab_()) {
                this.f72724a.a(dVar, list);
            }
        }
    }

    static final class h<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ dc f72725a;

        static {
            Covode.recordClassIndex(44809);
        }

        h(dc dcVar) {
            this.f72725a = dcVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            User user = (User) obj;
            PowerList powerList = (PowerList) this.f72725a.a(R.id.cb4);
            l.b(powerList, "");
            com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state = powerList.getState();
            l.b(user, "");
            state.b(new af(user, this.f72725a.f72713j, false));
            com.ss.android.ugc.aweme.comment.f.e eVar = this.f72725a.f72711d;
            if (eVar != null) {
                eVar.a(this.f72725a);
            }
        }
    }

    private final void d(boolean z) {
        if (ab_() && (!l.a(Boolean.valueOf(z), a().j().getValue()))) {
            if (z) {
                a().i().clear();
            }
            a().j().setValue(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        int i2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("id");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof com.ss.android.ugc.aweme.comment.i.h)) {
            serializable = null;
        }
        com.ss.android.ugc.aweme.comment.i.h hVar = (com.ss.android.ugc.aweme.comment.i.h) serializable;
        this.f72710c = hVar;
        if (hVar != null) {
            str = hVar.getInsertLikeUserIds();
        }
        this.f72714l = str;
        com.ss.android.ugc.aweme.comment.i.h hVar2 = this.f72710c;
        if (hVar2 != null) {
            i2 = hVar2.getLikeUserCount();
        } else {
            i2 = 0;
        }
        this.f72715m = i2;
        k();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(Aweme aweme) {
        String str;
        b();
        if (aweme != null) {
            aweme.getAid();
        }
        String b2 = b();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!l.a((Object) b2, (Object) str)) {
            this.f72712e = true;
        }
        this.f72708a = aweme;
        k();
    }

    @Override // com.ss.android.ugc.aweme.comment.f.f
    public final void a(boolean z) {
        this.o = z;
        d(z);
    }

    private final int a(List<String> list, List<? extends User> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            PowerList powerList = (PowerList) a(R.id.cb4);
            l.b(powerList, "");
            if (powerList.getHeight() > 0) {
                Iterator<T> it = list2.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (list.contains(it.next().getUid())) {
                        i2++;
                    }
                }
                int min = Math.min(list2.size(), Math.max(list.size(), this.f72715m) - (list.size() - i2));
                PowerList powerList2 = (PowerList) a(R.id.cb4);
                l.b(powerList2, "");
                double height = (double) powerList2.getHeight();
                double d2 = (double) s;
                Double.isNaN(height);
                Double.isNaN(d2);
                if (min < h.g.a.a(height / d2)) {
                    return min;
                }
            }
        }
        return 0;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.f.a
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((PowerList) a(R.id.cb4)).a(LikeCell.class);
        ((PowerList) a(R.id.cb4)).a(LikeNoMoreLimitCell.class);
        ((PowerList) a(R.id.cb4)).a(this.r);
        a().g().observe(this, new h(this));
        if (this.o) {
            d(true);
        }
        j();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.c.d<? super com.bytedance.ies.powerlist.page.f<java.util.List<com.ss.android.ugc.aweme.profile.model.User>>> r9, java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User> r10) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.dc.a(h.c.d, java.util.List):void");
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ig, viewGroup, false);
    }

    public final void a(LikeListResponse likeListResponse, Throwable th, h.c.d<? super com.bytedance.ies.powerlist.page.f<List<User>>> dVar, List<? extends User> list, List<String> list2) {
        boolean z;
        if (ab_()) {
            TuxStatusView e2 = e();
            l.b(e2, "");
            e2.setVisibility(8);
            Exception exc = null;
            if (likeListResponse != null) {
                com.ss.android.ugc.aweme.comment.f.e eVar = this.f72711d;
                if (eVar != null) {
                    eVar.a(this);
                }
                ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getUid());
                }
                ArrayList arrayList2 = arrayList;
                List<User> likeList = likeListResponse.getLikeList();
                if (likeList == null) {
                    likeList = h.a.z.INSTANCE;
                }
                int a2 = a(list2, likeList);
                ArrayList arrayList3 = new ArrayList();
                for (T t2 : likeList) {
                    if (!arrayList2.contains(t2.getUid())) {
                        arrayList3.add(t2);
                    }
                }
                ArrayList arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList4.size();
                for (int i2 = 0; i2 < size; i2++) {
                    User user = (User) arrayList4.get(i2);
                    ah ahVar = this.f72713j;
                    if (i2 >= 0 && a2 > i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList5.add(new af(user, ahVar, z));
                }
                if (!likeListResponse.getHasMore() || !(!arrayList5.isEmpty())) {
                    if (!likeListResponse.getHasMore() && likeListResponse.isShowLimit()) {
                        arrayList5.add(new ag());
                    }
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(arrayList5)));
                } else {
                    dVar.resumeWith(q.m223constructorimpl(f.a.a(null, likeList, arrayList5, 1)));
                }
                if (likeList.isEmpty()) {
                    TuxTextView g2 = g();
                    l.b(g2, "");
                    g2.setVisibility(0);
                }
            } else if (list.isEmpty()) {
                TuxTextView g3 = g();
                l.b(g3, "");
                g3.setVisibility(0);
                dVar.resumeWith(q.m223constructorimpl(f.a.a(null, h.a.z.INSTANCE, h.a.z.INSTANCE, 1)));
            } else {
                if (th instanceof Exception) {
                    exc = th;
                }
                Exception exc2 = exc;
                if (exc2 == null) {
                    exc2 = new IllegalStateException("unknown error");
                }
                dVar.resumeWith(q.m223constructorimpl(f.a.a(exc2)));
            }
        }
    }
}
