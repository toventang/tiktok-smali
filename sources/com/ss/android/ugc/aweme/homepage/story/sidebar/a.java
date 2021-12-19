package com.ss.android.ugc.aweme.homepage.story.sidebar;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.ag;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.p;
import com.bytedance.assem.arch.extensions.u;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.assem.arch.viewModel.k;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.h.i;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.homepage.story.feed.StorySidebarFeedVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.g;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.z;

public final class a extends com.bytedance.assem.arch.d.b implements IAccountService.b, c {
    private final com.bytedance.assem.arch.viewModel.b o;
    private TuxTextView p;

    public static final class b extends m implements h.f.a.b<com.ss.android.ugc.aweme.homepage.story.feed.d, com.ss.android.ugc.aweme.homepage.story.feed.d> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(63404);
        }

        public b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.homepage.story.feed.d invoke(com.ss.android.ugc.aweme.homepage.story.feed.d dVar) {
            l.c(dVar, "");
            return dVar;
        }
    }

    static {
        Covode.recordClassIndex(63402);
    }

    public final StorySidebarFeedVM u() {
        return (StorySidebarFeedVM) this.o.getValue();
    }

    @Override // com.ss.android.ugc.aweme.homepage.story.sidebar.c
    public final StorySidebarFeedVM v() {
        return u();
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void f() {
        super.f();
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.a(this);
    }

    @Override // com.bytedance.assem.arch.core.a, com.bytedance.assem.arch.core.p
    public final void p() {
        super.p();
        com.ss.android.ugc.aweme.account.b.a();
        com.ss.android.ugc.aweme.account.b.f62864a.b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.a$a  reason: collision with other inner class name */
    public static final class C2431a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(63403);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2431a(h.k.c cVar) {
            super(0);
            this.$viewModelClass = cVar;
        }

        @Override // h.f.a.a
        public final String invoke() {
            return "assem_" + h.f.a.a(this.$viewModelClass).getName();
        }
    }

    static final class c extends m implements h.f.a.a<z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(63405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.u().a("pull down inside sidebar");
            com.ss.android.ugc.aweme.homepage.story.feed.e eVar = this.this$0.u().f99373j;
            String str = eVar.f99409a;
            String str2 = eVar.f99410b;
            String str3 = eVar.f99411c;
            String str4 = eVar.f99412d;
            l.d(str, "");
            l.d(str2, "");
            l.d(str3, "");
            r.a("westwindow_refresh", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).a("enter_method", str2).a("notice_type", str3).a("author_id", str4).f66730a);
            return z.f158842a;
        }
    }

    public static final class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f99451a;

        static {
            Covode.recordClassIndex(63407);
        }

        public final void onGlobalLayout() {
            int height;
            int i2;
            ViewTreeObserver viewTreeObserver = this.f99451a.s().getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
            a aVar = this.f99451a;
            int[] iArr = new int[2];
            View findViewById = aVar.s().findViewById(R.id.dyy);
            findViewById.getLocationOnScreen(iArr);
            int i3 = iArr[0];
            l.b(findViewById, "");
            int width = i3 + (findViewById.getWidth() / 2);
            int i4 = iArr[1];
            if (com.ss.android.ugc.aweme.homepage.experiment.a.b()) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                height = h.g.a.a(TypedValue.applyDimension(1, 94.0f, system.getDisplayMetrics()));
            } else {
                height = findViewById.getHeight() + StorySidebarListCell.f99443k + (StorySidebarListCell.f99441b / 2);
            }
            int i5 = i4 + height;
            Context context = aVar.s().getContext();
            l.b(context, "");
            if (i.a(context)) {
                Context context2 = aVar.s().getContext();
                l.b(context2, "");
                i2 = (com.bytedance.tux.h.f.a(context2) * 2) - width;
            } else {
                i2 = -width;
            }
            g.f137757a.a(new int[]{i2, i5});
        }

        e(a aVar) {
            this.f99451a = aVar;
        }
    }

    public a() {
        com.bytedance.assem.arch.viewModel.b bVar;
        i.a aVar = i.a.f25718a;
        h.k.c a2 = ab.a(StorySidebarFeedVM.class);
        C2431a aVar2 = new C2431a(a2);
        b bVar2 = b.INSTANCE;
        if (l.a(aVar, i.a.f25718a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, true), u.c(this, true), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, true), u.d(this, true));
        } else if (l.a(aVar, i.d.f25721a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.b((com.bytedance.assem.arch.core.a) this, false), u.c(this, false), u.c.f25670a, bVar2, u.a((com.bytedance.assem.arch.core.a) this, false), u.d(this, false));
        } else if (aVar == null || l.a(aVar, i.b.f25719a)) {
            bVar = new com.bytedance.assem.arch.viewModel.b(a2, aVar2, u.j.f25671a, u.a((androidx.lifecycle.m) this, false), u.a((ag) this, false), u.c.f25670a, bVar2, u.b(this), u.c(this));
        } else {
            throw new IllegalArgumentException("Don't support this VMScope here.");
        }
        this.o = bVar;
    }

    static final class f extends m implements h.f.a.b<Assembler, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(63408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(1);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            l.d(assembler2, "");
            assembler2.b(this.this$0, AnonymousClass1.f99452a);
            assembler2.b(this.this$0, AnonymousClass2.f99453a);
            return z.f158842a;
        }
    }

    @Override // com.bytedance.assem.arch.core.p
    public final void b(View view) {
        l.d(view, "");
        ViewTreeObserver viewTreeObserver = s().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new e(this));
        }
        com.bytedance.assem.arch.extensions.d.a(this, new f(this));
        view.setClickable(true);
        this.p = (TuxTextView) s().findViewById(R.id.ey2);
        if (com.ss.android.ugc.aweme.homepage.experiment.a.b()) {
            TuxTextView tuxTextView = this.p;
            if (tuxTextView != null) {
                tuxTextView.setText(R.string.g9l);
            }
        } else {
            TuxTextView tuxTextView2 = this.p;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(R.string.g9k);
            }
        }
        ((SpringLayout) view.findViewById(R.id.dk8)).setOnRefreshListener(new c(this));
        f.a.a(this, u(), b.f99454a, (k) null, new d(view), 6);
    }

    static final class d extends m implements h.f.a.m<p, Integer, z> {
        final /* synthetic */ View $containerView;

        static {
            Covode.recordClassIndex(63406);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(2);
            this.$containerView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(p pVar, Integer num) {
            int intValue = num.intValue();
            l.d(pVar, "");
            if ((intValue & 2) > 0) {
                ((SpringLayout) this.$containerView.findViewById(R.id.dk8)).setRefreshing(false);
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountService.b
    public final void onAccountResult(int i2, boolean z, int i3, User user) {
        androidx.fragment.app.e b2;
        if (z && (b2 = com.bytedance.assem.arch.extensions.b.b(this)) != null && !b2.isFinishing()) {
            u().a("new log in");
        }
    }
}
