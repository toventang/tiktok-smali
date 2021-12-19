package com.ss.android.ugc.aweme.duet.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.IDuetDownloadService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.duet.ui.a;
import com.ss.android.ugc.aweme.duet.ui.f;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.shortvideo.DuetDownloadService;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class d extends com.ss.android.ugc.aweme.challenge.ui.b implements h {

    /* renamed from: l  reason: collision with root package name */
    public static final a f84147l = new a((byte) 0);
    private final h.h N = h.i.a((h.f.a.a) new C2009d(this));
    private final h.h O = h.i.a((h.f.a.a) new f(this));
    private SparseArray P;

    /* renamed from: d  reason: collision with root package name */
    public String f84148d;

    /* renamed from: e  reason: collision with root package name */
    public String f84149e;

    /* renamed from: j  reason: collision with root package name */
    public String f84150j;

    /* renamed from: k  reason: collision with root package name */
    public a f84151k;

    /* renamed from: m  reason: collision with root package name */
    private String f84152m;
    private String n;
    private com.ss.android.ugc.aweme.duet.b.a o;
    private final h.h p = h.i.a((h.f.a.a) new b(this));
    private float q;
    private float r;
    private boolean s;
    private final h.h t = h.i.a((h.f.a.a) new e(this));
    private final h.h u = h.i.a((h.f.a.a) new k(this));

    static {
        Covode.recordClassIndex(52461);
    }

    private final e c() {
        return (e) this.p.getValue();
    }

    private final View d() {
        return (View) this.t.getValue();
    }

    private final TextView e() {
        return (TextView) this.u.getValue();
    }

    private final TuxStatusView g() {
        return (TuxStatusView) this.O.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.detail.a
    public final boolean H() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String a(int i2) {
        return "duet_page";
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final int h() {
        return R.layout.b43;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(52462);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String i() {
        String str = this.f84148d;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.d$d  reason: collision with other inner class name */
    static final class C2009d extends m implements h.f.a.a<View> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(52466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2009d(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.requireActivity().findViewById(R.id.bez);
        }
    }

    static final class e extends m implements h.f.a.a<View> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(52467);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.requireActivity().findViewById(R.id.e9v);
        }
    }

    static final class f extends m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(52468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.requireActivity().findViewById(R.id.e_o);
        }
    }

    static final class k extends m implements h.f.a.a<TextView> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(52473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.requireActivity().findViewById(R.id.ar1);
        }
    }

    private static boolean j() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.P;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class b extends m implements h.f.a.a<e> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(52463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ e invoke() {
            androidx.fragment.app.e requireActivity = this.this$0.requireActivity();
            l.b(requireActivity, "");
            AnonymousClass1 r1 = new h.f.a.a<String>(this) {
                /* class com.ss.android.ugc.aweme.duet.ui.d.b.AnonymousClass1 */
                final /* synthetic */ b this$0;

                static {
                    Covode.recordClassIndex(52464);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // h.f.a.a
                public final /* synthetic */ String invoke() {
                    String str = this.this$0.this$0.f84150j;
                    if (str == null) {
                        l.b();
                    }
                    return str;
                }
            };
            l.d(requireActivity, "");
            l.d(r1, "");
            return new f(requireActivity, r1);
        }
    }

    static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(52469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            d.a(this.this$0).j();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends m implements h.f.a.a<z> {
        final /* synthetic */ d this$0;

        static {
            Covode.recordClassIndex(52472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(d dVar) {
            super(0);
            this.this$0 = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.this$0.b();
            d.a(this.this$0).j();
            return z.f158842a;
        }
    }

    private static boolean m() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean j2 = j();
        com.ss.android.ugc.aweme.lancet.j.f107226e = j2;
        return j2;
    }

    public final void b() {
        g().setVisibility(0);
        getContext();
        if (!m()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            g().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new j(this)));
            return;
        }
        g().a();
        com.ss.android.ugc.aweme.duet.b.a aVar = this.o;
        if (aVar == null) {
            l.a("detailPresenter");
        }
        aVar.a(this.f84150j);
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final androidx.fragment.app.l l() {
        String str;
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.f70119a = new ArrayList();
        boolean z = false;
        Fragment a2 = getChildFragmentManager().a(com.ss.android.ugc.aweme.detail.a.v + 0);
        boolean z2 = a2 instanceof a;
        a aVar = a2;
        if (!z2) {
            String str2 = this.f84150j;
            if (str2 == null) {
                l.b();
            }
            String str3 = this.f84148d;
            String str4 = this.f84150j;
            if (str4 == null) {
                l.b();
            }
            b bVar = new b(str4);
            l.d("duet_page", "");
            l.d(str2, "");
            l.d("", "");
            l.d("duet_page", "");
            l.d(bVar, "");
            a aVar2 = new a();
            Bundle bundle = new Bundle();
            bundle.putInt(a.I, 24);
            bundle.putString(a.J, "duet_page");
            bundle.putString(a.K, str2);
            String[] strArr = new String[2];
            strArr[0] = a.C2008a.a(str2);
            if (str3 != null) {
                str = a.C2008a.a(str3);
            } else {
                str = null;
            }
            strArr[1] = str;
            bundle.putString("top_aweme_ids", n.a(n.b(strArr), ", ", "[", "]", 0, (CharSequence) null, (h.f.a.b) null, 56));
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            bundle.putString("extra_challenge_hashtag_name", "");
            bundle.putString(a.L, "duet_page");
            aVar2.setArguments(bundle);
            aVar2.G = bVar;
            a aVar3 = aVar2;
            if (this.G == 0) {
                z = true;
            }
            aVar3.z = z;
            aVar3.A = true;
            aVar = aVar2;
        }
        Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.duet.ui.DuetAwemeListFragment");
        this.f84151k = (a) aVar;
        List list = this.I;
        a aVar4 = this.f84151k;
        if (aVar4 == null) {
            l.a("mListFragment");
        }
        list.add(aVar4);
        List list2 = this.J;
        a aVar5 = this.f84151k;
        if (aVar5 == null) {
            l.a("mListFragment");
        }
        list2.add(aVar5);
        this.f70119a.add(20);
        return new cr(getChildFragmentManager(), this.J, this.f70119a);
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f84155a;

        static {
            Covode.recordClassIndex(52471);
        }

        i(d dVar) {
            this.f84155a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f84155a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final /* synthetic */ a a(d dVar) {
        a aVar = dVar.f84151k;
        if (aVar == null) {
            l.a("mListFragment");
        }
        return aVar;
    }

    static final class h extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f84154a = new h();

        static {
            Covode.recordClassIndex(52470);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_no_video;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final com.ss.android.ugc.aweme.g.a.g a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        Context requireContext = requireContext();
        l.b(requireContext, "");
        return new com.ss.android.ugc.aweme.detail.a.b(requireContext, viewGroup);
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f84153a;

        static {
            Covode.recordClassIndex(52465);
        }

        c(d dVar) {
            this.f84153a = dVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Map<String, String> a2 = ag.a(v.a("group_id", this.f84153a.f84148d), v.a("author_id", this.f84153a.f84149e), v.a("enter_from", "duet_page"));
            IDuetDownloadService a3 = DuetDownloadService.a();
            String str = this.f84153a.f84150j;
            if (str == null) {
                l.b();
            }
            androidx.fragment.app.e requireActivity = this.f84153a.requireActivity();
            l.b(requireActivity, "");
            a3.a(str, requireActivity, "duet_page", a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String string;
        String str4 = "";
        if (bundle == null || (str = bundle.getString("enter_method")) == null) {
            str = str4;
        }
        this.f84152m = str;
        if (bundle == null || (str2 = bundle.getString("enter_from")) == null) {
            str2 = str4;
        }
        this.n = str2;
        String str5 = null;
        if (bundle != null) {
            str3 = bundle.getString("id");
        } else {
            str3 = null;
        }
        this.f84148d = str3;
        if (bundle != null) {
            str5 = bundle.getString("author_id");
        }
        this.f84149e = str5;
        if (!(bundle == null || (string = bundle.getString("origin_item_id")) == null)) {
            str4 = string;
        }
        this.f84150j = str4;
    }

    @Override // com.ss.android.ugc.aweme.duet.ui.h
    public final void a(com.ss.android.ugc.aweme.duet.a.c cVar) {
        l.d(cVar, "");
        if (ab_()) {
            if (cVar.f84126c == null || TextUtils.isEmpty(cVar.f84126c.getUri())) {
                g().setVisibility(0);
                TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(h.f84154a));
                String string = getString(R.string.har);
                l.b(string, "");
                g().setStatus(a2.a((CharSequence) string));
                return;
            }
            this.s = true;
            g().setVisibility(8);
            c().a(cVar);
            f.a a3 = f.a.C2010a.a(cVar.f84128e);
            if (a3 == null) {
                return;
            }
            if (a3 == f.a.REMIND_DUET_NOT_ALLOWED || a3 == f.a.REMIND_SOUND_NOT_READY) {
                d().setVisibility(8);
                bV_();
                return;
            }
            d().setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.duet.ui.h
    public final void a(Exception exc) {
        l.d(exc, "");
        if (ab_()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (this.s) {
                g().setVisibility(8);
                return;
            }
            g().setVisibility(0);
            g().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new g(this)));
        }
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        c().a(view);
        super.onViewCreated(view, bundle);
        d().setOnClickListener(new c(this));
        com.ss.android.ugc.aweme.duet.b.a aVar = new com.ss.android.ugc.aweme.duet.b.a();
        this.o = aVar;
        aVar.a_(this);
        if (this.P == null) {
            this.P = new SparseArray();
        }
        View view2 = (View) this.P.get(R.id.qb);
        if (view2 == null) {
            View view3 = getView();
            if (view3 == null) {
                view2 = null;
            } else {
                view2 = view3.findViewById(R.id.qb);
                this.P.put(R.id.qb, view2);
            }
        }
        ((AutoRTLImageView) view2).setOnClickListener(new i(this));
        b();
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void b(int i2, int i3) {
        super.b(i2, i3);
        float f2 = 0.0f;
        if (this.q == 0.0f && e().getVisibility() == 0) {
            int bottom = e().getBottom();
            View view = this.A;
            l.b(view, "");
            this.q = (float) (bottom - view.getBottom());
        }
        if (this.r == 0.0f) {
            int bottom2 = ((View) this.N.getValue()).getBottom();
            View view2 = this.A;
            l.b(view2, "");
            this.r = (float) (bottom2 - view2.getBottom());
        }
        float f3 = this.q;
        float f4 = (((float) i2) - f3) / (this.r - f3);
        if (((double) f4) > 0.2d) {
            f2 = f4;
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
        }
        View view3 = this.A;
        l.b(view3, "");
        view3.setAlpha(f2);
    }
}
