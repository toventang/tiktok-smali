package com.ss.android.ugc.aweme.comment.supporterpanel;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.sheet.c;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class j extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: l  reason: collision with root package name */
    public static boolean f72409l;

    /* renamed from: m  reason: collision with root package name */
    public static final a f72410m = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.b f72411a;

    /* renamed from: b  reason: collision with root package name */
    public k f72412b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f72413c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f72414d;

    /* renamed from: e  reason: collision with root package name */
    public String f72415e;

    /* renamed from: f  reason: collision with root package name */
    public f.a.b.b f72416f;

    /* renamed from: g  reason: collision with root package name */
    public f f72417g;

    /* renamed from: h  reason: collision with root package name */
    public final com.bytedance.ies.ugc.aweme.network.f f72418h = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d();

    /* renamed from: i  reason: collision with root package name */
    public TuxDualBallView f72419i;

    /* renamed from: j  reason: collision with root package name */
    public RecyclerView f72420j;

    /* renamed from: k  reason: collision with root package name */
    public LinearLayout f72421k;
    private SparseArray n;

    static {
        Covode.recordClassIndex(44642);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(44643);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.supporterpanel.j$a$a  reason: collision with other inner class name */
        public static final class DialogInterface$OnDismissListenerC1625a implements DialogInterface.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Aweme f72422a;

            static {
                Covode.recordClassIndex(44644);
            }

            public DialogInterface$OnDismissListenerC1625a(Aweme aweme) {
                this.f72422a = aweme;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                String str2;
                Aweme aweme = this.f72422a;
                if (j.f72409l) {
                    str = "click_close_button";
                } else {
                    str = "click_on_video";
                }
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                String str3 = null;
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("group_id", str2);
                if (aweme != null) {
                    str3 = aweme.getAuthorUid();
                }
                r.a("exit_top_gift_list", a2.a("author_id", str3).a("exit_method", str).f66730a);
                j.f72409l = false;
            }
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(44645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(0);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.f();
            return z.f158842a;
        }
    }

    public final com.ss.android.ugc.aweme.comment.b b() {
        com.ss.android.ugc.aweme.comment.b bVar = this.f72411a;
        if (bVar == null) {
            l.a("mCommentInputManager");
        }
        return bVar;
    }

    public final TuxDualBallView c() {
        TuxDualBallView tuxDualBallView = this.f72419i;
        if (tuxDualBallView == null) {
            l.a("tuxDualBallView");
        }
        return tuxDualBallView;
    }

    public final void e() {
        LinearLayout linearLayout = this.f72421k;
        if (linearLayout == null) {
            l.a("errorView");
        }
        linearLayout.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a aVar = new TuxNavBar.a();
        g gVar = new g();
        String string = getString(R.string.hay);
        l.b(string, "");
        TuxNavBar.a a2 = aVar.a(gVar.a(string));
        com.bytedance.tux.navigation.a.b a3 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark);
        a3.f45194b = true;
        return a2.b(a3.a((h.f.a.a<z>) new b(this)));
    }

    public final void d() {
        VGGETSupporterPanelService vGGETSupporterPanelService = (VGGETSupporterPanelService) this.f72418h.a(VGGETSupporterPanelService.class);
        TuxDualBallView tuxDualBallView = this.f72419i;
        if (tuxDualBallView == null) {
            l.a("tuxDualBallView");
        }
        tuxDualBallView.b();
        vGGETSupporterPanelService.getSupporterPanel(this.f72415e).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new c(this));
    }

    public final void f() {
        f72409l = true;
        c.C1111c cVar = c.C1111c.f45283a;
        l.c(this, "");
        l.c(cVar, "");
        com.bytedance.tux.sheet.sheet.a c2 = a.b.c(this);
        if (c2 != null) {
            a.b.a(c2.getDialog(), cVar);
            c2.onCancel(c2.getDialog());
            c2.dismissAllowingStateLoss();
        }
    }

    public static final class c implements f.a.z<f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f72423a;

        static {
            Covode.recordClassIndex(44646);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(j jVar) {
            this.f72423a = jVar;
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            this.f72423a.f72416f = bVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f72423a.c().c();
            this.f72423a.e();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(f fVar) {
            List<a> list;
            f fVar2 = fVar;
            l.d(fVar2, "");
            this.f72423a.c().c();
            if (fVar2.f72377a == 0) {
                e eVar = fVar2.f72379c;
                if (eVar == null || (list = eVar.f72376b) == null || !(!list.isEmpty())) {
                    this.f72423a.f();
                    this.f72423a.b().a("", "");
                    return;
                }
                this.f72423a.f72417g = fVar2;
                j jVar = this.f72423a;
                k kVar = jVar.f72412b;
                if (kVar == null) {
                    l.a("adapter");
                }
                jVar.a(kVar, fVar2, true);
                return;
            }
            this.f72423a.e();
        }
    }

    private static Integer a(e eVar) {
        List<a> list;
        int i2;
        if (eVar == null || (list = eVar.f72376b) == null) {
            return null;
        }
        int size = list.size();
        if (eVar.f72375a != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        return Integer.valueOf(size + i2);
    }

    static final class d extends m implements h.f.a.b<a, z> {
        final /* synthetic */ j this$0;

        static {
            Covode.recordClassIndex(44647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(j jVar) {
            super(1);
            this.this$0 = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(a aVar) {
            a aVar2 = aVar;
            l.d(aVar2, "");
            h hVar = new h();
            com.ss.android.ugc.aweme.comment.b b2 = this.this$0.b();
            l.d(b2, "");
            hVar.f72381a = b2;
            hVar.f72384d = this.this$0.f72414d;
            hVar.f72382b = aVar2.f72354a;
            hVar.f72385e = aVar2.f72356c;
            com.bytedance.tux.sheet.sheet.a aVar3 = this.this$0.f72413c;
            if (aVar3 != null) {
                aVar3.a(hVar);
            }
            return z.f158842a;
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f72424a;

        static {
            Covode.recordClassIndex(44648);
        }

        e(j jVar) {
            this.f72424a = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinearLayout linearLayout = this.f72424a.f72421k;
            if (linearLayout == null) {
                l.a("errorView");
            }
            linearLayout.setVisibility(8);
            this.f72424a.c().b();
            this.f72424a.d();
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f72425a;

        static {
            Covode.recordClassIndex(44649);
        }

        f(j jVar) {
            this.f72425a = jVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "supporter_panel").a("enter_method", "send_button");
            Aweme aweme = this.f72425a.f72414d;
            String str2 = null;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str);
            Aweme aweme2 = this.f72425a.f72414d;
            if (aweme2 != null) {
                str2 = aweme2.getAuthorUid();
            }
            r.a("click_send_gift_button", a3.a("author_id", str2).f66730a);
            this.f72425a.b().a("", "");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Aweme aweme = this.f72414d;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.f72415e = str;
        View findViewById = view.findViewById(R.id.ef6);
        l.b(findViewById, "");
        this.f72420j = (RecyclerView) findViewById;
        View findViewById2 = view.findViewById(R.id.ef7);
        l.b(findViewById2, "");
        this.f72419i = (TuxDualBallView) findViewById2;
        View findViewById3 = view.findViewById(R.id.ef3);
        l.b(findViewById3, "");
        this.f72421k = (LinearLayout) findViewById3;
        k kVar = new k();
        this.f72412b = kVar;
        kVar.f72427b = new d(this);
        RecyclerView recyclerView = this.f72420j;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        k kVar2 = this.f72412b;
        if (kVar2 == null) {
            l.a("adapter");
        }
        recyclerView.setAdapter(kVar2);
        RecyclerView recyclerView2 = this.f72420j;
        if (recyclerView2 == null) {
            l.a("recyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        if (this.f72417g == null) {
            d();
        } else {
            k kVar3 = this.f72412b;
            if (kVar3 == null) {
                l.a("adapter");
            }
            f fVar = this.f72417g;
            if (fVar == null) {
                l.b();
            }
            a(kVar3, fVar, false);
        }
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ef4);
        l.b(tuxTextView, "");
        tuxTextView.setClickable(true);
        tuxTextView.setOnClickListener(new e(this));
        ((NiceWidthTextView) view.findViewById(R.id.ef8)).setOnClickListener(new f(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ii, viewGroup, false);
    }

    public final void a(k kVar, f fVar, boolean z) {
        g gVar;
        List<a> list;
        String str;
        String str2;
        e eVar = fVar.f72379c;
        String str3 = null;
        if (eVar != null) {
            gVar = eVar.f72375a;
        } else {
            gVar = null;
        }
        kVar.f72426a = gVar;
        if (z) {
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "gift_summary_stripe").a("enter_method", "click");
            Aweme aweme = this.f72414d;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str);
            Aweme aweme2 = this.f72414d;
            if (aweme2 != null) {
                str3 = aweme2.getAuthorUid();
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str3).a("num_results", a(eVar));
            if (gVar != null) {
                str2 = "premium";
            } else {
                str2 = "";
            }
            r.a("show_top_gift_list", a4.a("banner", str2).f66730a);
        }
        if (!(eVar == null || (list = eVar.f72376b) == null)) {
            kVar.a(list);
        }
        kVar.notifyDataSetChanged();
        RecyclerView recyclerView = this.f72420j;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        recyclerView.setVisibility(0);
    }
}
