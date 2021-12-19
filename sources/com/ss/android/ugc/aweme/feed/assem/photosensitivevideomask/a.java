package com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask;

import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.i.ah;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.video.v;
import com.zhiliaoapp.musically.R;
import h.f.a.s;
import h.f.b.ab;
import h.f.b.y;
import h.z;

public final class a extends com.ss.android.ugc.aweme.feed.assem.base.a<a> {
    static final /* synthetic */ h.k.i[] u = {new y(a.class, "maskVM", "getMaskVM()Lcom/ss/android/ugc/aweme/feed/assem/photosensitivevideomask/PhotosensitiveVideoMaskVM;", 0)};
    private final h.h A = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
    private final h.h.d B;
    private SparseArray C;
    public TextView v;
    public TextView w;
    public TextView x;
    public TextView y;
    private final h.h z = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);

    public static final class b extends h.f.b.m implements h.f.a.b<j, j> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(58387);
        }

        public b() {
            super(1);
        }

        public final j invoke(j jVar) {
            h.f.b.l.c(jVar, "");
            return jVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58388);
        }

        public c() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58391);
        }

        public f() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    static {
        Covode.recordClassIndex(58385);
    }

    private final VideoViewModel H() {
        return (VideoViewModel) this.A.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.s9;
    }

    public final PhotosensitiveVideoMaskVM F() {
        return (PhotosensitiveVideoMaskVM) this.B.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.C == null) {
            this.C = new SparseArray();
        }
        View view = (View) this.C.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.C.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58389);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58390);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58392);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58393);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.a$a  reason: collision with other inner class name */
    public static final class C2242a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2242a(h.k.c cVar) {
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
        f.a.a(this, F(), b.f92352a, (com.bytedance.assem.arch.viewModel.k) null, i.f92344a, 6);
        PhotosensitiveVideoMaskVM F = F();
        a(F, c.f92353a, d.f92354a, e.f92355a, f.f92356a, com.bytedance.assem.arch.viewModel.l.a(F.f25686c), null, j.f92345a);
    }

    public a() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(PhotosensitiveVideoMaskVM.class);
        this.B = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new C2242a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
    }

    static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextView f92346a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f92347b;

        static {
            Covode.recordClassIndex(58396);
        }

        k(TextView textView, a aVar) {
            this.f92346a = textView;
            this.f92347b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scenario", "photosensitive");
            Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92347b)).mAweme;
            h.f.b.l.b(aweme, "");
            r.a("tns_mask_layer_click_skip", a2.a("group_id", aweme.getAid()).f66730a);
            com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) 1, (int) ((h.f.a.a<z>) null));
            new com.ss.android.ugc.aweme.tux.a.i.a(this.f92346a.getContext()).a(R.string.dqk).a();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.ug.guide.a());
            this.f92347b.F().i();
        }
    }

    static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f92348a;

        static {
            Covode.recordClassIndex(58397);
        }

        l(a aVar) {
            this.f92348a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scenario", "photosensitive");
            Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92348a)).mAweme;
            h.f.b.l.b(aweme, "");
            r.a("tns_mask_layer_click_watch", a2.a("group_id", aweme.getAid()).f66730a);
            com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) 2, (int) ((h.f.a.a<z>) null));
            this.f92348a.F().h();
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        B().setVisibility(8);
        View findViewById = view.findViewById(R.id.adh);
        h.f.b.l.b(findViewById, "");
        this.v = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.title);
        h.f.b.l.b(findViewById2, "");
        this.w = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.button);
        h.f.b.l.b(findViewById3, "");
        this.x = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.a0s);
        h.f.b.l.b(findViewById4, "");
        TextView textView = (TextView) findViewById4;
        this.y = textView;
        if (textView == null) {
            h.f.b.l.a("negativeBtn");
        }
        textView.setText(R.string.dqd);
        textView.setOnClickListener(new k(textView, this));
        TextView textView2 = this.x;
        if (textView2 == null) {
            h.f.b.l.a("positiveBtn");
        }
        textView2.setText(R.string.dqf);
        textView2.setOnClickListener(new l(this));
        ((ImageView) view.findViewById(R.id.bi7)).setImageResource(2131231746);
        f.a.b(this, (VideoPlayViewModel) this.z.getValue(), g.f92357a, com.bytedance.assem.arch.viewModel.l.a(), m.f92349a, 4);
        f.a.b(this, H(), h.f92358a, (com.bytedance.assem.arch.viewModel.k) null, n.f92350a, 6);
        f.a.b(this, H(), i.f92359a, (com.bytedance.assem.arch.viewModel.k) null, o.f92351a, 6);
    }

    static final class n extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92350a = new n();

        static {
            Covode.recordClassIndex(58399);
        }

        n() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            if (aVar2 != null) {
                if (com.ss.android.ugc.aweme.utils.y.i(((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)).mAweme)) {
                    aVar3.F().i();
                } else {
                    aVar3.F().h();
                }
            }
            return z.f158842a;
        }
    }

    static final class i extends h.f.b.m implements h.f.a.m<a, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92344a = new i();

        static {
            Covode.recordClassIndex(58394);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, Integer num) {
            Aweme aweme;
            Aweme aweme2;
            a aVar2 = aVar;
            int intValue = num.intValue();
            h.f.b.l.d(aVar2, "");
            aVar2.B().setVisibility(intValue);
            if (intValue == 0) {
                String str = null;
                if (com.ss.android.ugc.aweme.compliance.api.a.d().h() == 1) {
                    com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                    VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2);
                    if (!(videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null)) {
                        str = aweme2.getAid();
                    }
                    r.a("tns_show_photosensitive_removed", dVar.a("group_id", str).f66730a);
                } else {
                    com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("scenario", "photosensitive");
                    VideoItemParams videoItemParams2 = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2);
                    if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                        str = aweme.getAid();
                    }
                    r.a("tns_show_mask_layer", a2.a("group_id", str).f66730a);
                }
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92349a = new m();

        static {
            Covode.recordClassIndex(58398);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            h.f.b.l.d(aVar2, "");
            if (com.ss.android.ugc.aweme.utils.y.f(((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)).mAweme) && aVar3.B().getVisibility() == 0) {
                aVar3.F();
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)).mAweme;
                h.f.b.l.b(aweme, "");
                h.f.b.l.d(aweme, "");
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.aW(aweme)) {
                    com.ss.android.ugc.aweme.ad.feed.b.e a2 = com.ss.android.ugc.aweme.ad.feed.b.b.a();
                    if (a2 != null) {
                        a2.c();
                    }
                } else {
                    v.O().B();
                }
                String aid = aweme.getAid();
                h.f.b.l.b(aid, "");
                com.ss.android.ugc.d.a.c.a(new ah(true, aid));
            }
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92351a = new o();

        static {
            Covode.recordClassIndex(58400);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends String> aVar2) {
            int i2;
            a aVar3 = aVar;
            com.bytedance.assem.arch.extensions.a<? extends String> aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (aVar4 != null) {
                T t = aVar4.f25631b;
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)).mAweme;
                h.f.b.l.b(aweme, "");
                if (!(!h.f.b.l.a((Object) t, (Object) aweme.getAid())) && com.ss.android.ugc.aweme.utils.y.i(((VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)).mAweme) && com.ss.android.ugc.aweme.compliance.api.a.d().h() == 0 && ((i2 = com.ss.android.ugc.aweme.compliance.api.a.d().i()) == 2 || i2 == 1)) {
                    com.ss.android.ugc.aweme.compliance.api.a.d().a((IComplianceBusinessService) i2, (int) ((h.f.a.a<z>) null));
                }
            }
            return z.f158842a;
        }
    }

    static final class j extends h.f.b.m implements s<a, String, String, Integer, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f92345a = new j();

        static {
            Covode.recordClassIndex(58395);
        }

        j() {
            super(5);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.s
        public final /* synthetic */ z invoke(a aVar, String str, String str2, Integer num, Integer num2) {
            a aVar2 = aVar;
            String str3 = str;
            String str4 = str2;
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            h.f.b.l.d(aVar2, "");
            TextView textView = aVar2.v;
            if (textView == null) {
                h.f.b.l.a("contentTextView");
            }
            textView.setText(str3);
            TextView textView2 = aVar2.w;
            if (textView2 == null) {
                h.f.b.l.a("titleTextView");
            }
            textView2.setText(str4);
            TextView textView3 = aVar2.x;
            if (textView3 == null) {
                h.f.b.l.a("positiveBtn");
            }
            textView3.setVisibility(intValue);
            TextView textView4 = aVar2.y;
            if (textView4 == null) {
                h.f.b.l.a("negativeBtn");
            }
            textView4.setVisibility(intValue2);
            return z.f158842a;
        }
    }
}
