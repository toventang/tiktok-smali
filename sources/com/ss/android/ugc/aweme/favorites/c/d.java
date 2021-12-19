package com.ss.android.ugc.aweme.favorites.c;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ag;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.favorites.viewmodel.VideoCollectionContentViewModel;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.k.k;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class d extends com.bytedance.assem.arch.d.a {

    /* renamed from: j  reason: collision with root package name */
    final h.h f90481j;

    /* renamed from: k  reason: collision with root package name */
    private final com.bytedance.assem.arch.viewModel.b f90482k;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.favorites.viewmodel.d, com.ss.android.ugc.aweme.favorites.viewmodel.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(56798);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.favorites.viewmodel.d invoke(com.ss.android.ugc.aweme.favorites.viewmodel.d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    public interface c extends com.bytedance.assem.arch.service.c {
        static {
            Covode.recordClassIndex(56799);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(56796);
    }

    public final VideoCollectionContentViewModel u() {
        return (VideoCollectionContentViewModel) this.f90482k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.c.d$d  reason: collision with other inner class name */
    static final class C2185d extends m implements h.f.a.a<c> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(56800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2185d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c invoke() {
            return com.bytedance.assem.arch.service.d.b(this.this$0, ab.a(c.class));
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ TuxStatusView $statusView;

        static {
            Covode.recordClassIndex(56804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(TuxStatusView tuxStatusView) {
            super(0);
            this.$statusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$statusView.a();
            this.$statusView.setVisibility(0);
            return z.f158842a;
        }
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(56797);
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

    public d() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.d dVar = i.d.f25721a;
        h.k.c a2 = ab.a(VideoCollectionContentViewModel.class);
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
        this.f90482k = bVar;
        this.f90481j = h.i.a((h.f.a.a) new C2185d(this));
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f90483a;

        static {
            Covode.recordClassIndex(56801);
        }

        e(d dVar) {
            this.f90483a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((c) this.f90483a.f90481j.getValue()).a();
        }
    }

    static final class h extends m implements h.f.a.b<Throwable, z> {
        final /* synthetic */ TuxStatusView $statusView;
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(56805);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(d dVar, TuxStatusView tuxStatusView) {
            super(1);
            this.this$0 = dVar;
            this.$statusView = tuxStatusView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Throwable th) {
            l.d(th, "");
            this.$statusView.setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h.f.a.a<z>(this) {
                /* class com.ss.android.ugc.aweme.favorites.c.d.h.AnonymousClass1 */
                final /* synthetic */ h this$0;

                static {
                    Covode.recordClassIndex(56806);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ z invoke() {
                    this.this$0.this$0.u().b(true);
                    return z.f158842a;
                }
            }));
            this.$statusView.setVisibility(0);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        View findViewById = view.findViewById(R.id.e_o);
        l.b(findViewById, "");
        TuxStatusView tuxStatusView = (TuxStatusView) findViewById;
        View findViewById2 = view.findViewById(R.id.edo);
        l.b(findViewById2, "");
        TextView textView = (TextView) view.findViewById(R.id.f8d);
        l.b(textView, "");
        String string = view.getContext().getString(R.string.btj);
        l.b(string, "");
        String a2 = com.a.a(string, Arrays.copyOf(new Object[]{"0"}, 1));
        l.b(a2, "");
        textView.setText(a2);
        textView.setOnClickListener(new e(this));
        Context context = view.getContext();
        VideoCollectionContentViewModel u = u();
        k kVar = e.f90485a;
        f fVar = new f(findViewById2, tuxStatusView, context, textView);
        AssemViewModel.a(u, kVar, null, new h(this, tuxStatusView), new g(tuxStatusView), fVar, 2);
    }

    static final class f extends m implements h.f.a.b<List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a>, z> {
        final /* synthetic */ Context $context;
        final /* synthetic */ TuxStatusView $statusView;
        final /* synthetic */ TextView $submit;
        final /* synthetic */ View $submitLayout;

        static {
            Covode.recordClassIndex(56802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view, TuxStatusView tuxStatusView, Context context, TextView textView) {
            super(1);
            this.$submitLayout = view;
            this.$statusView = tuxStatusView;
            this.$context = context;
            this.$submit = textView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a> list) {
            String str;
            String string;
            List<? extends com.ss.android.ugc.aweme.favorites.viewmodel.a> list2 = list;
            l.d(list2, "");
            if (list2.isEmpty()) {
                this.$submitLayout.setVisibility(8);
                TuxStatusView tuxStatusView = this.$statusView;
                TuxStatusView.c cVar = new TuxStatusView.c();
                String string2 = this.$context.getString(R.string.btw);
                l.b(string2, "");
                TuxStatusView.c a2 = cVar.a(string2);
                String string3 = this.$context.getString(R.string.btv);
                l.b(string3, "");
                tuxStatusView.setStatus(a2.a((CharSequence) string3).a(com.bytedance.tux.c.c.a(AnonymousClass1.f90484a)));
                this.$statusView.setVisibility(0);
            } else {
                this.$submitLayout.setVisibility(0);
                this.$statusView.setVisibility(8);
            }
            ArrayList arrayList = new ArrayList();
            for (T t : list2) {
                if (t.f91002b == 2) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            TextView textView = this.$submit;
            l.b(textView, "");
            textView.setEnabled(!arrayList2.isEmpty());
            TextView textView2 = this.$submit;
            l.b(textView2, "");
            Context context = this.$context;
            if (context == null || (string = context.getString(R.string.btj)) == null) {
                str = null;
            } else {
                str = com.a.a(string, Arrays.copyOf(new Object[]{String.valueOf(arrayList2.size())}, 1));
                l.b(str, "");
            }
            textView2.setText(str);
            return z.f158842a;
        }
    }
}
