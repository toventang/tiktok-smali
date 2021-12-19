package com.ss.android.ugc.aweme.feed.assem.review;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.h;
import h.k.i;
import h.z;

public final class b extends com.ss.android.ugc.aweme.feed.assem.base.a<b> {
    static final /* synthetic */ i[] u = {new y(b.class, "videoReviewStatusVM", "getVideoReviewStatusVM()Lcom/ss/android/ugc/aweme/feed/assem/review/VideoReviewStatusVM;", 0)};
    private SparseArray A;
    final h v;
    private final h.h.d w;
    private final h x;
    private final h y;
    private final h z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.review.b$b  reason: collision with other inner class name */
    public static final class C2247b extends m implements h.f.a.b<a, a> {
        public static final C2247b INSTANCE = new C2247b();

        static {
            Covode.recordClassIndex(58500);
        }

        public C2247b() {
            super(1);
        }

        public final a invoke(a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(58498);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.tq;
    }

    public final View F() {
        return (View) this.x.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.A == null) {
            this.A = new SparseArray();
        }
        View view = (View) this.A.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.A.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public final TuxIconView H() {
        return (TuxIconView) this.y.getValue();
    }

    public final TuxIconView I() {
        return (TuxIconView) this.z.getValue();
    }

    static final class e extends m implements h.f.a.a<View> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.B();
        }
    }

    static final class c extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58501);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.F().findViewById(R.id.fh4);
        }
    }

    static final class d extends m implements h.f.a.a<TuxIconView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58502);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxIconView invoke() {
            return this.this$0.F().findViewById(R.id.fh5);
        }
    }

    static final class f extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(58504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.this$0.F().findViewById(R.id.fh6);
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58499);
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

    @Override // com.bytedance.assem.arch.b.v
    public final void x() {
        VideoReviewStatusVM videoReviewStatusVM;
        a(videoReviewStatusVM, com.bytedance.assem.arch.viewModel.l.a(((VideoReviewStatusVM) this.w.a(this, u[0])).f25686c), null, g.f92429a);
    }

    public b() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoReviewStatusVM.class);
        this.w = k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, k.a(this), C2247b.INSTANCE, null, null, k.b(this), k.c(this));
        this.x = h.i.a((h.f.a.a) new e(this));
        this.y = h.i.a((h.f.a.a) new d(this));
        this.v = h.i.a((h.f.a.a) new f(this));
        this.z = h.i.a((h.f.a.a) new c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        o.a(F(), 8);
    }

    static final class g extends m implements h.f.a.m<b, a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f92429a = new g();

        static {
            Covode.recordClassIndex(58505);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, a aVar) {
            b bVar2 = bVar;
            final a aVar2 = aVar;
            l.d(bVar2, "");
            l.d(aVar2, "");
            if (!VideoReviewStatusVM.f92419k.contains(Integer.valueOf(aVar2.f92422a)) || TextUtils.isEmpty(aVar2.f92425d)) {
                o.a(bVar2.F(), 8);
            } else {
                o.a(bVar2.F(), 0);
                if (aVar2.f92423b != -1) {
                    bVar2.F().setBackgroundColor(androidx.core.content.b.c(bVar2.F().getContext(), aVar2.f92423b));
                }
                if (aVar2.f92424c != -1) {
                    bVar2.H().setVisibility(0);
                    bVar2.H().setIconRes(aVar2.f92424c);
                } else {
                    bVar2.H().setVisibility(8);
                }
                ((TextView) bVar2.v.getValue()).setText(aVar2.f92425d);
                if (aVar2.f92426e.length() == 0) {
                    bVar2.I().setVisibility(8);
                    bVar2.F().setOnClickListener(AnonymousClass1.f92430a);
                } else {
                    bVar2.I().setVisibility(0);
                    bVar2.F().setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.feed.assem.review.b.g.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(58507);
                        }

                        public final void onClick(View view) {
                            h.f.a.m<View, String, z> mVar;
                            ClickAgent.onClick(view);
                            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && (mVar = aVar2.f92428g) != null) {
                                l.b(view, "");
                                mVar.invoke(view, aVar2.f92426e);
                            }
                        }
                    });
                }
                h.f.a.b<String, z> bVar3 = aVar2.f92427f;
                if (bVar3 != null) {
                    bVar3.invoke(aVar2.f92426e);
                }
            }
            return z.f158842a;
        }
    }
}
