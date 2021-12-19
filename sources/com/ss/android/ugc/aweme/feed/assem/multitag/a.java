package com.ss.android.ugc.aweme.feed.assem.multitag;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.anchor.multi.ui.FeedMultiTagLayout;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.assem.multitag.VideoFeedMultiTagVM;
import com.ss.android.ugc.aweme.feed.i.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.z;
import java.util.Objects;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "tagVM", "getTagVM()Lcom/ss/android/ugc/aweme/feed/assem/multitag/VideoFeedMultiTagVM;", 0)};
    public FeedMultiTagLayout v;
    private final h.h.d w;
    private final h.h x;
    private SparseArray y;

    public static final class b extends m implements h.f.a.b<e, e> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58285);
        }

        public b() {
            super(1);
        }

        public final e invoke(e eVar) {
            l.c(eVar, "");
            return eVar;
        }
    }

    public static final class c extends m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58286);
        }

        public c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            l.c(ckVar, "");
            return ckVar;
        }
    }

    static {
        Covode.recordClassIndex(58283);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.aj5;
    }

    public final VideoFeedMultiTagVM F() {
        return (VideoFeedMultiTagVM) this.w.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.y == null) {
            this.y = new SparseArray();
        }
        View view = (View) this.y.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.y.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class d extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58287);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58288);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.multitag.a$a  reason: collision with other inner class name */
    public static final class C2239a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2239a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        super.x();
        f.a.a(this, F(), b.f92271a, (k) null, f.f92267a, 6);
        f.a.a(this, F(), c.f92272a, (k) null, g.f92268a, 6);
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoFeedMultiTagVM.class);
        this.w = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2239a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.x = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    static final class h<T> implements s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92269a;

        static {
            Covode.recordClassIndex(58291);
        }

        h(a aVar) {
            this.f92269a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.feed.i.s
        public final /* synthetic */ void a(Object obj) {
            DataCenter dataCenter;
            VideoItemParams videoItemParams = (VideoItemParams) this.f92269a.F().g();
            if (videoItemParams != null && (dataCenter = videoItemParams.dataCenter) != null) {
                dataCenter.a("feed_internal_event", obj);
            }
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        FeedMultiTagLayout feedMultiTagLayout = (FeedMultiTagLayout) view.findViewById(R.id.b1p);
        this.v = feedMultiTagLayout;
        if (feedMultiTagLayout != null) {
            feedMultiTagLayout.setOnInternalEventListener(new h(this));
        }
        f.a.a(this, (VideoViewModel) this.x.getValue(), d.f92273a, com.bytedance.assem.arch.viewModel.l.a(), i.f92270a, 4);
    }

    static final class g extends m implements h.f.a.m<a, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f92268a = new g();

        static {
            Covode.recordClassIndex(58290);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Integer num) {
            a aVar2 = aVar;
            int intValue = num.intValue();
            l.d(aVar2, "");
            if (intValue == 0) {
                FeedMultiTagLayout feedMultiTagLayout = aVar2.v;
                if (feedMultiTagLayout != null) {
                    feedMultiTagLayout.c();
                }
            } else {
                FeedMultiTagLayout feedMultiTagLayout2 = aVar2.v;
                if (feedMultiTagLayout2 != null) {
                    feedMultiTagLayout2.a();
                }
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<a, String, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f92267a = new f();

        static {
            Covode.recordClassIndex(58289);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, String str) {
            String str2;
            VideoItemParams videoItemParams;
            JSONObject jSONObject;
            FeedMultiTagLayout feedMultiTagLayout;
            a aVar2 = aVar;
            l.d(aVar2, "");
            Aweme h2 = aVar2.F().h();
            if (!(h2 == null || (str2 = aVar2.F().p) == null || (videoItemParams = (VideoItemParams) aVar2.F().g()) == null || (jSONObject = videoItemParams.mRequestId) == null || (feedMultiTagLayout = aVar2.v) == null)) {
                Context ar_ = aVar2.ar_();
                Objects.requireNonNull(ar_, "null cannot be cast to non-null type android.app.Activity");
                aVar2.F().a(new VideoFeedMultiTagVM.a(feedMultiTagLayout.a(h2, (Activity) ar_, str2, jSONObject)));
            }
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92270a = new i();

        static {
            Covode.recordClassIndex(58292);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            String anchorWikiOfflineText;
            FeedMultiTagLayout feedMultiTagLayout;
            a aVar3 = aVar;
            l.d(aVar3, "");
            Aweme h2 = aVar3.F().h();
            if (!(h2 == null || (anchorWikiOfflineText = h2.getAnchorWikiOfflineText()) == null || anchorWikiOfflineText.length() == 0 || (feedMultiTagLayout = aVar3.v) == null)) {
                new com.bytedance.tux.g.b(feedMultiTagLayout).a(h2.getAnchorWikiOfflineText()).b();
                h2.setAnchorWikiOfflineText("");
            }
            com.ss.android.ugc.aweme.feed.x.c.a(h2, aVar3.ar_(), Integer.valueOf(((FeedBaseViewModel) aVar3.F()).o));
            FeedMultiTagLayout feedMultiTagLayout2 = aVar3.v;
            if (feedMultiTagLayout2 != null) {
                feedMultiTagLayout2.l();
            }
            return z.f158842a;
        }
    }
}
