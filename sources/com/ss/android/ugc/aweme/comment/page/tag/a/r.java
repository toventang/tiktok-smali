package com.ss.android.ugc.aweme.comment.page.tag.a;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ad;
import androidx.lifecycle.ag;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.comment.page.tag.FriendsListCell;
import com.ss.android.ugc.aweme.comment.page.tag.SectionCell;
import com.ss.android.ugc.aweme.comment.page.tag.k;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Collection;
import java.util.List;

public final class r extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    public PowerList f72206j;

    /* renamed from: k  reason: collision with root package name */
    public TuxStatusView f72207k;

    /* renamed from: l  reason: collision with root package name */
    public Boolean f72208l;

    /* renamed from: m  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f72209m;
    private final h.h n;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d, com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(44486);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d invoke(com.ss.android.ugc.aweme.comment.page.tag.viewmodel.d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(44484);
    }

    private final VideoTagFriendsListViewModel v() {
        return (VideoTagFriendsListViewModel) this.f72209m.getValue();
    }

    static final class h extends m implements h.f.a.a<ad.b> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(44493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ad.b invoke() {
            ad.b a2 = dagger.hilt.android.internal.b.a.a(com.bytedance.assem.arch.extensions.b.b(this.this$0));
            if (a2 == null) {
                l.b();
            }
            return a2;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(44485);
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

    public final void u() {
        TuxStatusView.c cVar = (TuxStatusView.c) this.n.getValue();
        if (cVar != null) {
            TuxStatusView tuxStatusView = this.f72207k;
            if (tuxStatusView == null) {
                l.a("statusView");
            }
            tuxStatusView.setStatus(cVar);
            TuxStatusView tuxStatusView2 = this.f72207k;
            if (tuxStatusView2 == null) {
                l.a("statusView");
            }
            tuxStatusView2.setVisibility(0);
        }
    }

    static final class c extends m implements h.f.a.a<TuxStatusView.c> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(44487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(r rVar) {
            super(0);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView.c invoke() {
            String str;
            String str2;
            Resources resources;
            Resources resources2;
            TuxStatusView.c cVar = new TuxStatusView.c();
            Context ar_ = this.this$0.ar_();
            if (ar_ == null || (resources2 = ar_.getResources()) == null || (str = resources2.getString(R.string.h32)) == null) {
                str = "";
            }
            l.b(str, "");
            TuxStatusView.c a2 = cVar.a(str);
            Context ar_2 = this.this$0.ar_();
            if (ar_2 == null || (resources = ar_2.getResources()) == null || (str2 = resources.getString(R.string.vm)) == null) {
                str2 = "";
            }
            l.b(str2, "");
            return a2.a((CharSequence) str2).a(com.bytedance.tux.c.c.a(AnonymousClass1.f72210a));
        }
    }

    public r() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h hVar = new h(this);
        h.k.c a2 = ab.a(VideoTagFriendsListViewModel.class);
        a aVar = new a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(dVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), hVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(dVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), hVar, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (dVar == null || l.a(dVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), hVar, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.f72209m = bVar;
        this.n = h.i.a((h.f.a.a) new c(this));
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f72211a;

        static {
            Covode.recordClassIndex(44489);
        }

        d(r rVar) {
            this.f72211a = rVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            d dVar = (d) com.bytedance.assem.arch.service.d.c(this.f72211a, ab.a(d.class));
            if (dVar != null) {
                dVar.a();
            }
        }
    }

    public static final /* synthetic */ PowerList a(r rVar) {
        PowerList powerList = rVar.f72206j;
        if (powerList == null) {
            l.a("friendsList");
        }
        return powerList;
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        TuxStatusView tuxStatusView = (TuxStatusView) s().findViewById(R.id.e_o);
        l.b(tuxStatusView, "");
        this.f72207k = tuxStatusView;
        if (tuxStatusView == null) {
            l.a("statusView");
        }
        tuxStatusView.a();
        tuxStatusView.setVisibility(0);
        PowerList powerList = (PowerList) s().findViewById(R.id.b_5);
        l.b(powerList, "");
        this.f72206j = powerList;
        if (powerList == null) {
            l.a("friendsList");
        }
        powerList.a(FriendsListCell.class, SectionCell.class);
        powerList.setItemAnimator(null);
        powerList.a(new d(this));
        VideoTagFriendsListViewModel v = v();
        v.f72288l.clear();
        Aweme aweme = v.g().getAweme();
        if (aweme != null && (true ^ TextUtils.isEmpty(aweme.getAid()))) {
            String aid = aweme.getAid();
            l.b(aid, "");
            v.p.a().a(Long.parseLong(aid)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(new VideoTagFriendsListViewModel.n(v), VideoTagFriendsListViewModel.o.f72300a);
        }
        b.i b2 = b.i.b(new VideoTagFriendsListViewModel.f(v), b.i.f4824a);
        l.b(b2, "");
        b2.a(new VideoTagFriendsListViewModel.p(v), b.i.f4826c, null);
        f.a.a(this, v(), s.f72212a, com.bytedance.assem.arch.viewModel.l.a(), new e(this), 4);
        com.bytedance.assem.arch.service.d.a(this, ab.a(d.class), t.f72213a, u.f72214a, new f(this));
        f.a.a(this, v(), v.f72215a, com.bytedance.assem.arch.viewModel.l.a(), new g(this), 4);
    }

    static final class g extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends IMUser>, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(44492);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(r rVar) {
            super(2);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar) {
            T t;
            com.bytedance.assem.arch.extensions.a<? extends IMUser> aVar2 = aVar;
            l.d(pVar, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                r.a(this.this$0).getState().b(new com.ss.android.ugc.aweme.comment.page.tag.g(t));
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<com.bytedance.assem.arch.extensions.a<? extends Boolean>, String, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(44491);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(r rVar) {
            super(2);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar, String str) {
            boolean z;
            int i2;
            String str2 = str;
            l.d(aVar, "");
            PowerList a2 = r.a(this.this$0);
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            a2.setVisibility(i2);
            if (str2 == null || str2.length() == 0) {
                if (l.a((Object) this.this$0.f72208l, (Object) true)) {
                    TuxStatusView tuxStatusView = this.this$0.f72207k;
                    if (tuxStatusView == null) {
                        l.a("statusView");
                    } else {
                        tuxStatusView.setVisibility(8);
                    }
                } else if (l.a((Object) this.this$0.f72208l, (Object) false)) {
                    this.this$0.u();
                }
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<p, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a>, z> {
        final /* synthetic */ r this$0;

        static {
            Covode.recordClassIndex(44490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(r rVar) {
            super(2);
            this.this$0 = rVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a> aVar) {
            T t;
            int i2;
            int size;
            Context ar_;
            String string;
            Context ar_2;
            Context ar_3;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.comment.page.tag.viewmodel.a> aVar2 = aVar;
            l.d(pVar, "");
            r rVar = this.this$0;
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                PowerList powerList = rVar.f72206j;
                if (powerList == null) {
                    l.a("friendsList");
                }
                powerList.getState().a();
                int i3 = 0;
                if (com.bytedance.common.utility.collection.b.a((Collection) t.f72317d)) {
                    PowerList powerList2 = rVar.f72206j;
                    if (powerList2 == null) {
                        l.a("friendsList");
                    }
                    powerList2.setVisibility(8);
                    rVar.f72208l = false;
                    rVar.u();
                } else {
                    TuxStatusView tuxStatusView = rVar.f72207k;
                    if (tuxStatusView == null) {
                        l.a("statusView");
                    } else {
                        tuxStatusView.setVisibility(8);
                    }
                    rVar.f72208l = true;
                    int i4 = -1;
                    if (com.bytedance.common.utility.collection.b.a((Collection) t.f72314a)) {
                        i2 = -1;
                    } else {
                        i2 = 0;
                    }
                    if (com.bytedance.common.utility.collection.b.a((Collection) t.f72315b)) {
                        size = -1;
                    } else {
                        size = t.f72314a.size();
                    }
                    if (!com.bytedance.common.utility.collection.b.a((Collection) t.f72316c)) {
                        i4 = t.f72317d.size() - t.f72316c.size();
                    }
                    List<IMUser> list = t.f72317d;
                    if (list != null) {
                        for (T t2 : list) {
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                n.a();
                            }
                            T t3 = t2;
                            if (i3 != i2 ? i3 != size ? i3 != i4 || (ar_ = rVar.ar_()) == null || (string = ar_.getString(R.string.bzl)) == null : (ar_2 = rVar.ar_()) == null || (string = ar_2.getString(R.string.cgf)) == null : (ar_3 = rVar.ar_()) == null || (string = ar_3.getString(R.string.ch_)) == null) {
                                string = "";
                            }
                            l.b(string, "");
                            if (!TextUtils.isEmpty(string)) {
                                PowerList powerList3 = rVar.f72206j;
                                if (powerList3 == null) {
                                    l.a("friendsList");
                                }
                                powerList3.getState().a(new k(string));
                            }
                            PowerList powerList4 = rVar.f72206j;
                            if (powerList4 == null) {
                                l.a("friendsList");
                            }
                            powerList4.getState().a(new com.ss.android.ugc.aweme.comment.page.tag.g(t3));
                            i3 = i5;
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }
}
