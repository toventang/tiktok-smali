package com.ss.android.ugc.aweme.comment.supporterpanel;

import android.os.Bundle;
import android.os.Handler;
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
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.f;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.status.loading.TuxDualBallView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.supporterpanel.i;
import com.ss.android.ugc.aweme.comment.ui.bz;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class h extends Fragment implements com.bytedance.tux.navigation.a {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.comment.b f72381a;

    /* renamed from: b  reason: collision with root package name */
    public c f72382b;

    /* renamed from: c  reason: collision with root package name */
    public String f72383c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f72384d;

    /* renamed from: e  reason: collision with root package name */
    public String f72385e;

    /* renamed from: f  reason: collision with root package name */
    public final f f72386f = RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d();

    /* renamed from: g  reason: collision with root package name */
    public f.a.b.b f72387g;

    /* renamed from: h  reason: collision with root package name */
    public VGGifterPanelService f72388h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f72389i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f72390j = true;

    /* renamed from: k  reason: collision with root package name */
    public long f72391k;

    /* renamed from: l  reason: collision with root package name */
    public LinearLayoutManager f72392l;

    /* renamed from: m  reason: collision with root package name */
    public i f72393m;
    public LinearLayout n;
    public LinearLayout o;
    public TuxDualBallView p;
    private RecyclerView q;
    private RecyclerView.n r;
    private SparseArray s;

    static {
        Covode.recordClassIndex(44626);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(44627);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            a.b.b(this.this$0);
            return z.f158842a;
        }
    }

    public final TuxDualBallView b() {
        TuxDualBallView tuxDualBallView = this.p;
        if (tuxDualBallView == null) {
            l.a("tuxDualBallView");
        }
        return tuxDualBallView;
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final void c() {
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        if (recyclerView.getVisibility() != 0) {
            LinearLayout linearLayout = this.n;
            if (linearLayout == null) {
                l.a("errorView");
            }
            linearLayout.setVisibility(0);
        }
    }

    public final void d() {
        TuxDualBallView tuxDualBallView = this.p;
        if (tuxDualBallView == null) {
            l.a("tuxDualBallView");
        }
        tuxDualBallView.b();
        VGGifterPanelService vGGifterPanelService = this.f72388h;
        if (vGGifterPanelService == null) {
            l.a("api");
        }
        a(vGGifterPanelService);
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_chevron_left_ltr);
        a2.f45194b = true;
        return aVar.a(a2.a((h.f.a.a<z>) new a(this))).a(new g().a("Gifters"));
    }

    public static final class b implements f.a.z<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f72394a;

        static {
            Covode.recordClassIndex(44628);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(h hVar) {
            this.f72394a = hVar;
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
            this.f72394a.f72387g = bVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            this.f72394a.b().c();
            this.f72394a.c();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(b bVar) {
            Integer num;
            String str;
            b bVar2 = bVar;
            l.d(bVar2, "");
            this.f72394a.b().c();
            if (bVar2.f72357a == 0) {
                LinearLayout linearLayout = this.f72394a.o;
                if (linearLayout == null) {
                    l.a("gifterPanelView");
                }
                linearLayout.setVisibility(0);
                i a2 = h.a(this.f72394a);
                if (a2.f72400b && a2.f72399a.size() != 0) {
                    a2.f72399a.remove(a2.f72399a.size() - 1);
                    a2.notifyItemRemoved(a2.f72399a.size());
                    a2.f72400b = false;
                }
                List<d> list = bVar2.f72359c;
                if (list != null) {
                    i a3 = h.a(this.f72394a);
                    l.d(list, "");
                    new Handler().post(new i.f(a3, list));
                }
                this.f72394a.f72390j = bVar2.f72360d;
                Long l2 = bVar2.f72361e;
                if (l2 != null) {
                    this.f72394a.f72391k = l2.longValue();
                }
                if (!this.f72394a.f72389i) {
                    h hVar = this.f72394a;
                    List<d> list2 = bVar2.f72359c;
                    String str2 = null;
                    if (list2 != null) {
                        num = Integer.valueOf(list2.size());
                    } else {
                        num = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a4 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", hVar.f72385e).a("enter_method", "click");
                    Aweme aweme = hVar.f72384d;
                    if (aweme != null) {
                        str = aweme.getAid();
                    } else {
                        str = null;
                    }
                    com.ss.android.ugc.aweme.app.f.d a5 = a4.a("group_id", str);
                    Aweme aweme2 = hVar.f72384d;
                    if (aweme2 != null) {
                        str2 = aweme2.getAuthorUid();
                    }
                    r.a("show_gifters_list", a5.a("author_id", str2).a("num_results", num).f66730a);
                } else if (!this.f72394a.f72390j) {
                    new Handler().post(new i.g(h.a(this.f72394a)));
                }
            } else {
                this.f72394a.c();
            }
        }
    }

    public static final class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f72397a;

        static {
            Covode.recordClassIndex(44631);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        e(h hVar) {
            this.f72397a = hVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            Integer num;
            l.d(recyclerView, "");
            super.a(recyclerView, i2);
            RecyclerView.i layoutManager = recyclerView.getLayoutManager();
            Integer num2 = null;
            if (layoutManager != null) {
                num = Integer.valueOf(layoutManager.A());
            } else {
                num = null;
            }
            LinearLayoutManager linearLayoutManager = this.f72397a.f72392l;
            if (linearLayoutManager == null || (num2 = Integer.valueOf(linearLayoutManager.m())) == null) {
                l.b();
            }
            int intValue = num2.intValue() + 1;
            if (num != null && num.intValue() == intValue && this.f72397a.f72390j && !h.a(this.f72397a).f72400b) {
                h hVar = this.f72397a;
                hVar.f72389i = true;
                i iVar = hVar.f72393m;
                if (iVar == null) {
                    l.a("adapter");
                }
                if (!iVar.f72400b) {
                    iVar.f72400b = true;
                    new Handler().post(new i.h(iVar));
                }
                VGGifterPanelService vGGifterPanelService = hVar.f72388h;
                if (vGGifterPanelService == null) {
                    l.a("api");
                }
                hVar.a(vGGifterPanelService);
            }
        }
    }

    public static final /* synthetic */ i a(h hVar) {
        i iVar = hVar.f72393m;
        if (iVar == null) {
            l.a("adapter");
        }
        return iVar;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f72395a;

        static {
            Covode.recordClassIndex(44629);
        }

        c(h hVar) {
            this.f72395a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LinearLayout linearLayout = this.f72395a.n;
            if (linearLayout == null) {
                l.a("errorView");
            }
            linearLayout.setVisibility(8);
            this.f72395a.b().b();
            this.f72395a.d();
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f72396a;

        static {
            Covode.recordClassIndex(44630);
        }

        d(h hVar) {
            this.f72396a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            c cVar = this.f72396a.f72382b;
            if (cVar != null) {
                long j2 = cVar.f72362a;
                com.ss.android.ugc.aweme.comment.b bVar = this.f72396a.f72381a;
                if (bVar == null) {
                    l.a("mCommentInputManager");
                }
                if (bVar.n()) {
                    Bundle a2 = bVar.a((CharSequence) "");
                    a2.putBoolean("showGiftPanel", true);
                    bVar.s.f71913e = "";
                    bVar.s.f71914f = Long.valueOf(j2);
                    bz a3 = bz.a(bVar.f71469c.p(), bVar.f(), bVar.f71475i, a2);
                    bVar.a("");
                    bVar.a(a3);
                    bVar.d();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(VGGifterPanelService vGGifterPanelService) {
        Long l2;
        String str = this.f72383c;
        c cVar = this.f72382b;
        if (cVar != null) {
            l2 = Long.valueOf(cVar.f72362a);
        } else {
            l2 = null;
        }
        vGGifterPanelService.getGifterPanel(str, l2, Long.valueOf(this.f72391k)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        TuxTextView tuxTextView;
        SmartAvatarImageView smartAvatarImageView;
        UrlModel urlModel;
        List<String> urlList;
        String str2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Aweme aweme = this.f72384d;
        String str3 = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        this.f72383c = str;
        View findViewById = view.findViewById(R.id.bc5);
        l.b(findViewById, "");
        this.p = (TuxDualBallView) findViewById;
        View findViewById2 = view.findViewById(R.id.bc1);
        l.b(findViewById2, "");
        this.n = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.bc4);
        l.b(findViewById3, "");
        this.o = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.bc6);
        l.b(findViewById4, "");
        this.q = (RecyclerView) findViewById4;
        this.f72393m = new i();
        RecyclerView recyclerView = this.q;
        if (recyclerView == null) {
            l.a("recyclerView");
        }
        i iVar = this.f72393m;
        if (iVar == null) {
            l.a("adapter");
        }
        recyclerView.setAdapter(iVar);
        getContext();
        this.f72392l = new LinearLayoutManager();
        RecyclerView recyclerView2 = this.q;
        if (recyclerView2 == null) {
            l.a("recyclerView");
        }
        recyclerView2.setLayoutManager(this.f72392l);
        this.r = new e(this);
        RecyclerView recyclerView3 = this.q;
        if (recyclerView3 == null) {
            l.a("recyclerView");
        }
        RecyclerView.n nVar = this.r;
        if (nVar == null) {
            l.a("scrollListener");
        }
        recyclerView3.a(nVar);
        View view2 = getView();
        if (view2 != null) {
            tuxTextView = (TuxTextView) view2.findViewById(R.id.bbf);
        } else {
            tuxTextView = null;
        }
        View view3 = getView();
        if (view3 != null) {
            smartAvatarImageView = (SmartAvatarImageView) view3.findViewById(R.id.bbc);
        } else {
            smartAvatarImageView = null;
        }
        if (tuxTextView != null) {
            c cVar = this.f72382b;
            if (cVar != null) {
                str2 = cVar.f72363b;
            } else {
                str2 = null;
            }
            tuxTextView.setText(str2);
        }
        if (smartAvatarImageView != null) {
            c cVar2 = this.f72382b;
            if (!(cVar2 == null || (urlModel = cVar2.f72366e) == null || (urlList = urlModel.getUrlList()) == null)) {
                str3 = urlList.get(0);
            }
            smartAvatarImageView.setImageURI(str3);
            smartAvatarImageView.setOnClickListener(new d(this));
        }
        Object a2 = this.f72386f.a(VGGifterPanelService.class);
        l.b(a2, "");
        this.f72388h = (VGGifterPanelService) a2;
        d();
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.bc2);
        l.b(tuxTextView2, "");
        tuxTextView2.setClickable(true);
        tuxTextView2.setOnClickListener(new c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.ic, viewGroup, false);
    }
}
