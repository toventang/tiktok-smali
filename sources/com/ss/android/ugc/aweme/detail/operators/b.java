package com.ss.android.ugc.aweme.detail.operators;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.CommonListViewModel;
import com.bytedance.jedi.arch.ext.list.ListViewModel;
import com.bytedance.jedi.arch.i;
import com.bytedance.jedi.arch.q;
import com.bytedance.widget.Widget;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.music.ui.viewmodel.MusicAwemeListState;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import java.util.Objects;

public final class b implements aa {

    /* renamed from: a  reason: collision with root package name */
    public boolean f79787a;

    /* renamed from: b  reason: collision with root package name */
    public final CommonListViewModel<Object, MusicAwemeListState> f79788b;

    /* renamed from: c  reason: collision with root package name */
    private q f79789c;

    public static final class a extends m implements h.f.a.b<i, z> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(49626);
        }

        public a() {
            super(1);
        }

        @Override // h.f.a.b
        public final void invoke(i iVar) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.operators.b$b  reason: collision with other inner class name */
    public static final class C1861b extends m implements h.f.a.m<i, Throwable, z> {
        public static final C1861b INSTANCE = new C1861b();

        static {
            Covode.recordClassIndex(49627);
        }

        public C1861b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* bridge */ /* synthetic */ z invoke(i iVar, Throwable th) {
            invoke(iVar, th);
            return z.f158842a;
        }

        public final void invoke(i iVar, Throwable th) {
            l.c(th, "");
        }
    }

    static {
        Covode.recordClassIndex(49625);
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadLatest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean cannotLoadMore() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean deleteItem(String str) {
        l.d(str, "");
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final int getPageType(int i2) {
        return 4000;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isDataEmpty() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void unInit() {
    }

    public static final class c implements com.bytedance.jedi.arch.ext.list.c<Object, i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f79790a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79791b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79792c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<i, z> f79793d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<i, Throwable, z> f79794e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<i, List<? extends Object>, z> f79795f;

        static {
            Covode.recordClassIndex(49628);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<i, z> a() {
            return this.f79793d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, Throwable, z> b() {
            return this.f79794e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, List<? extends Object>, z> c() {
            return this.f79795f;
        }

        public c(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f79790a = bVar;
            this.f79791b = mVar;
            this.f79792c = mVar2;
            this.f79793d = bVar;
            this.f79794e = mVar;
            this.f79795f = mVar2;
        }
    }

    public static final class d implements com.bytedance.jedi.arch.ext.list.c<Object, i> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f79796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79797b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.m f79798c;

        /* renamed from: d  reason: collision with root package name */
        private final h.f.a.b<i, z> f79799d;

        /* renamed from: e  reason: collision with root package name */
        private final h.f.a.m<i, Throwable, z> f79800e;

        /* renamed from: f  reason: collision with root package name */
        private final h.f.a.m<i, List<? extends Object>, z> f79801f;

        static {
            Covode.recordClassIndex(49629);
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.b<i, z> a() {
            return this.f79799d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, Throwable, z> b() {
            return this.f79800e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.c
        public final h.f.a.m<i, List<? extends Object>, z> c() {
            return this.f79801f;
        }

        public d(h.f.a.b bVar, h.f.a.m mVar, h.f.a.m mVar2) {
            this.f79796a = bVar;
            this.f79797b = mVar;
            this.f79798c = mVar2;
            this.f79799d = bVar;
            this.f79800e = mVar;
            this.f79801f = mVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final /* bridge */ /* synthetic */ Object getViewModel() {
        return this.f79788b;
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean isLoading() {
        return this.f79787a;
    }

    public b(CommonListViewModel<Object, MusicAwemeListState> commonListViewModel) {
        this.f79788b = commonListViewModel;
    }

    static final class f extends m implements h.f.a.b<i, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(1);
            this.this$0 = bVar;
            this.$listview = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(i iVar) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            iVar2.withState(this.this$0.f79788b, new h.f.a.b<MusicAwemeListState, z>(this) {
                /* class com.ss.android.ugc.aweme.detail.operators.b.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(49633);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(MusicAwemeListState musicAwemeListState) {
                    l.d(musicAwemeListState, "");
                    this.this$0.$listview.aO_();
                    this.this$0.this$0.f79787a = true;
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void bindView(ad adVar) {
        l.d(adVar, "");
        CommonListViewModel<Object, MusicAwemeListState> commonListViewModel = this.f79788b;
        if (commonListViewModel != null) {
            q qVar = this.f79789c;
            if (qVar == null) {
                l.a("jediView");
            }
            ListViewModel.a(commonListViewModel, qVar, (com.bytedance.jedi.arch.ext.list.a) null, new c(a.INSTANCE, C1861b.INSTANCE, new e(this, adVar)), new d(new f(this, adVar), new h(this, adVar), new g(this, adVar)), 242);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final boolean init(Fragment fragment) {
        l.d(fragment, "");
        if (this.f79788b == null) {
            return false;
        }
        this.f79789c = new JediWidget();
        View view = fragment.getView();
        if (view == null) {
            l.b();
        }
        com.bytedance.widget.c a2 = c.a.a(fragment, view);
        q qVar = this.f79789c;
        if (qVar == null) {
            l.a("jediView");
        }
        Objects.requireNonNull(qVar, "null cannot be cast to non-null type com.bytedance.widget.Widget");
        a2.a((Widget) qVar);
        return true;
    }

    static final class e extends m implements h.f.a.m<i, List<? extends Object>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49630);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = bVar;
            this.$listview = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, List<? extends Object> list) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            iVar2.withState(this.this$0.f79788b, new h.f.a.b<MusicAwemeListState, z>(this) {
                /* class com.ss.android.ugc.aweme.detail.operators.b.e.AnonymousClass1 */
                final /* synthetic */ e this$0;

                static {
                    Covode.recordClassIndex(49631);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(MusicAwemeListState musicAwemeListState) {
                    MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                    l.d(musicAwemeListState2, "");
                    com.bytedance.jedi.arch.ext.list.b bVar = musicAwemeListState2.getSubstate().getPayload().f39459a;
                    List<Object> list = musicAwemeListState2.getSubstate().getList();
                    Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                    this.this$0.$listview.a(list, bVar.f39447a);
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.m<i, List<? extends Object>, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = bVar;
            this.$listview = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, List<? extends Object> list) {
            i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(list, "");
            iVar2.withState(this.this$0.f79788b, new h.f.a.b<MusicAwemeListState, z>(this) {
                /* class com.ss.android.ugc.aweme.detail.operators.b.g.AnonymousClass1 */
                final /* synthetic */ g this$0;

                static {
                    Covode.recordClassIndex(49635);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(MusicAwemeListState musicAwemeListState) {
                    MusicAwemeListState musicAwemeListState2 = musicAwemeListState;
                    l.d(musicAwemeListState2, "");
                    com.bytedance.jedi.arch.ext.list.b bVar = musicAwemeListState2.getSubstate().getPayload().f39459a;
                    List<Object> list = musicAwemeListState2.getSubstate().getList();
                    Objects.requireNonNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.ss.android.ugc.aweme.feed.model.Aweme>");
                    this.this$0.$listview.b(list, bVar.f39447a);
                    return z.f158842a;
                }
            });
            this.this$0.f79787a = false;
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.m<i, Throwable, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.common.e.c $listview;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(49636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, com.ss.android.ugc.aweme.common.e.c cVar) {
            super(2);
            this.this$0 = bVar;
            this.$listview = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(i iVar, Throwable th) {
            Throwable th2 = th;
            l.d(iVar, "");
            l.d(th2, "");
            this.$listview.c(new Exception(th2));
            this.this$0.f79787a = false;
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.operators.aa
    public final void request(int i2, com.ss.android.ugc.aweme.feed.param.b bVar, int i3, boolean z) {
        CommonListViewModel<Object, MusicAwemeListState> commonListViewModel;
        l.d(bVar, "");
        if (i2 == 1) {
            CommonListViewModel<Object, MusicAwemeListState> commonListViewModel2 = this.f79788b;
            if (commonListViewModel2 != null) {
                commonListViewModel2.k();
            }
        } else if (i2 == 4 && (commonListViewModel = this.f79788b) != null) {
            commonListViewModel.l();
        }
    }
}
