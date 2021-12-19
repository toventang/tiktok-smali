package com.ss.android.ugc.aweme.feed.assem.videocomment;

import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.adapter.ck;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.y;
import h.z;

public final class b extends com.ss.android.ugc.aweme.feed.assem.base.a<b> {
    static final /* synthetic */ h.k.i[] u = {new y(b.class, "commentVM", "getCommentVM()Lcom/ss/android/ugc/aweme/feed/assem/videocomment/VideoCommentVM;", 0)};
    private final h.h A;
    private final h.h B;
    private final h.h C;
    private com.ss.android.ugc.aweme.cp.c D;
    private SparseArray E;
    public TextView v;
    public View w;
    public ImageView x;
    public ImageView y;
    private final h.h.d z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.videocomment.b$b  reason: collision with other inner class name */
    public static final class C2251b extends h.f.b.m implements h.f.a.b<n, n> {
        public static final C2251b INSTANCE = new C2251b();

        static {
            Covode.recordClassIndex(58674);
        }

        public C2251b() {
            super(1);
        }

        public final n invoke(n nVar) {
            h.f.b.l.c(nVar, "");
            return nVar;
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ck, ck> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(58675);
        }

        public c() {
            super(1);
        }

        public final ck invoke(ck ckVar) {
            h.f.b.l.c(ckVar, "");
            return ckVar;
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(58678);
        }

        public f() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    public static final class i extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final i INSTANCE = new i();

        static {
            Covode.recordClassIndex(58681);
        }

        public i() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    static {
        Covode.recordClassIndex(58672);
    }

    private final VideoViewModel H() {
        return (VideoViewModel) this.A.getValue();
    }

    private final VideoEventDispatchViewModel I() {
        return (VideoEventDispatchViewModel) this.C.getValue();
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.sz;
    }

    public final VideoCommentVM F() {
        return (VideoCommentVM) this.z.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.E == null) {
            this.E = new SparseArray();
        }
        View view = (View) this.E.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s2 = s();
        if (s2 == null) {
            return null;
        }
        View findViewById = s2.findViewById(R.id.dlk);
        this.E.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class d extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<ck>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(58676);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<ck> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(58677);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final g INSTANCE = new g();

        static {
            Covode.recordClassIndex(58679);
        }

        public g() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final h INSTANCE = new h();

        static {
            Covode.recordClassIndex(58680);
        }

        public h() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final j INSTANCE = new j();

        static {
            Covode.recordClassIndex(58682);
        }

        public j() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final k INSTANCE = new k();

        static {
            Covode.recordClassIndex(58683);
        }

        public k() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(58673);
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
        VideoCommentVM F;
        VideoCommentVM F2;
        super.x();
        f.a.a(this, F(), c.f92609a, (com.bytedance.assem.arch.viewModel.k) null, m.f92598a, 6);
        a(F, d.f92610a, e.f92611a, com.bytedance.assem.arch.viewModel.l.a(F().f25686c), null, n.f92599a);
        f.a.a(this, F(), f.f92612a, (com.bytedance.assem.arch.viewModel.k) null, o.f92600a, 6);
        a(F2, g.f92613a, h.f92614a, com.bytedance.assem.arch.viewModel.l.a(F().f25686c), null, l.f92597a);
    }

    public b() {
        i.c cVar = i.c.f25720a;
        h.k.c a2 = ab.a(VideoCommentVM.class);
        this.z = com.bytedance.ext_power_list.k.a(this, a2, cVar == null ? i.c.f25720a : cVar, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), C2251b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
        this.A = new com.bytedance.ext_power_list.g(ab.a(VideoViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
        this.B = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, g.INSTANCE, h.INSTANCE, f.INSTANCE);
        this.C = new com.bytedance.ext_power_list.g(ab.a(VideoEventDispatchViewModel.class), this, j.INSTANCE, k.INSTANCE, i.INSTANCE);
    }

    static final class s implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92604a;

        static {
            Covode.recordClassIndex(58691);
        }

        s(b bVar) {
            this.f92604a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f92604a;
            h.f.b.l.b(view, "");
            bVar.e(view);
        }
    }

    static final class t implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92605a;

        static {
            Covode.recordClassIndex(58692);
        }

        t(b bVar) {
            this.f92605a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f92605a;
            h.f.b.l.b(view, "");
            bVar.e(view);
        }
    }

    static final class u implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f92606a;

        static {
            Covode.recordClassIndex(58693);
        }

        u(b bVar) {
            this.f92606a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b bVar = this.f92606a;
            h.f.b.l.b(view, "");
            bVar.e(view);
        }
    }

    public static final /* synthetic */ ImageView a(b bVar) {
        ImageView imageView = bVar.x;
        if (imageView == null) {
            h.f.b.l.a("commentGiftIconView");
        }
        return imageView;
    }

    public static final /* synthetic */ TextView b(b bVar) {
        TextView textView = bVar.v;
        if (textView == null) {
            h.f.b.l.a("commentCountView");
        }
        return textView;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        h.f.b.l.d(videoItemParams, "");
        B().setVisibility(0);
        com.ss.android.ugc.aweme.cp.c cVar = this.D;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        h.f.b.l.d(view, "");
        B().setVisibility(8);
        View findViewById = view.findViewById(R.id.a_2);
        h.f.b.l.b(findViewById, "");
        this.v = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.a_0);
        h.f.b.l.b(findViewById2, "");
        this.w = findViewById2;
        View findViewById3 = view.findViewById(R.id.a_h);
        h.f.b.l.b(findViewById3, "");
        this.y = (ImageView) findViewById3;
        View findViewById4 = view.findViewById(R.id.a_f);
        h.f.b.l.b(findViewById4, "");
        this.x = (ImageView) findViewById4;
        if (com.ss.android.ugc.aweme.im.service.c.k.a()) {
            TextView textView = this.v;
            if (textView == null) {
                h.f.b.l.a("commentCountView");
            }
            com.ss.android.ugc.aweme.common.f.d.a(textView, 14);
        }
        com.ss.android.ugc.aweme.cp.c cVar = new com.ss.android.ugc.aweme.cp.c();
        cVar.f78251a = s();
        View view2 = this.w;
        if (view2 == null) {
            h.f.b.l.a("commentLayout");
        }
        cVar.f78252b = view2;
        TextView textView2 = this.v;
        if (textView2 == null) {
            h.f.b.l.a("commentCountView");
        }
        cVar.f78254d = textView2;
        ImageView imageView = this.y;
        if (imageView == null) {
            h.f.b.l.a("commentImageView");
        }
        cVar.f78253c = imageView;
        this.D = cVar;
        View view3 = this.w;
        if (view3 == null) {
            h.f.b.l.a("commentLayout");
        }
        view3.setOnTouchListener(new com.ss.android.ugc.aweme.ai.a(0.6f));
        View view4 = this.w;
        if (view4 == null) {
            h.f.b.l.a("commentLayout");
        }
        view4.setOnClickListener(new s(this));
        B().setOnClickListener(new t(this));
        TextView textView3 = this.v;
        if (textView3 == null) {
            h.f.b.l.a("commentCountView");
        }
        textView3.setOnClickListener(new u(this));
        f.a.b(this, H(), k.f92617a, com.bytedance.assem.arch.viewModel.l.a(), v.f92607a, 4);
        f.a.b(this, H(), l.f92618a, com.bytedance.assem.arch.viewModel.l.a(), w.f92608a, 4);
        f.a.b(this, (VideoPlayViewModel) this.B.getValue(), m.f92619a, com.bytedance.assem.arch.viewModel.l.a(), p.f92601a, 4);
        f.a.b(this, I(), i.f92615a, com.bytedance.assem.arch.viewModel.l.a(), q.f92602a, 4);
        f.a.b(this, I(), j.f92616a, com.bytedance.assem.arch.viewModel.l.a(), r.f92603a, 4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013c, code lost:
        if (r0.isAllowComment() == true) goto L_0x0144;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.view.View r7) {
        /*
        // Method dump skipped, instructions count: 396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videocomment.b.e(android.view.View):void");
    }

    static final class m extends h.f.b.m implements h.f.a.m<b, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f92598a = new m();

        static {
            Covode.recordClassIndex(58685);
        }

        m() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, Integer num) {
            b bVar2 = bVar;
            int intValue = num.intValue();
            h.f.b.l.d(bVar2, "");
            View view = bVar2.w;
            if (view == null) {
                h.f.b.l.a("commentLayout");
            }
            view.setVisibility(intValue);
            return z.f158842a;
        }
    }

    static final class o extends h.f.b.m implements h.f.a.m<b, Drawable, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f92600a = new o();

        static {
            Covode.recordClassIndex(58687);
        }

        o() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, Drawable drawable) {
            b bVar2 = bVar;
            Drawable drawable2 = drawable;
            h.f.b.l.d(bVar2, "");
            ImageView imageView = bVar2.y;
            if (imageView == null) {
                h.f.b.l.a("commentImageView");
            }
            imageView.setImageDrawable(drawable2);
            return z.f158842a;
        }
    }

    static final class v extends h.f.b.m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f92607a = new v();

        static {
            Covode.recordClassIndex(58694);
        }

        v() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            VideoCommentVM F = bVar2.F();
            F.a(new VideoCommentVM.c(F));
            return z.f158842a;
        }
    }

    static final class w extends h.f.b.m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Integer>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f92608a = new w();

        static {
            Covode.recordClassIndex(58695);
        }

        w() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Integer> aVar) {
            b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            VideoCommentVM F = bVar2.F();
            F.b(new VideoCommentVM.a(F));
            return z.f158842a;
        }
    }

    static final class p extends h.f.b.m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Float>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f92601a = new p();

        static {
            Covode.recordClassIndex(58688);
        }

        p() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Float> aVar) {
            T t;
            b bVar2 = bVar;
            com.bytedance.assem.arch.extensions.a<? extends Float> aVar2 = aVar;
            h.f.b.l.d(bVar2, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || t.floatValue() <= 80.0f)) {
                VideoCommentVM F = bVar2.F();
                F.b(new VideoCommentVM.b(F));
            }
            return z.f158842a;
        }
    }

    static final class q extends h.f.b.m implements h.f.a.m<b, ag, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f92602a = new q();

        static {
            Covode.recordClassIndex(58689);
        }

        q() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, ag agVar) {
            String str;
            b bVar2 = bVar;
            ag agVar2 = agVar;
            h.f.b.l.d(bVar2, "");
            if (agVar2 != null && agVar2.f93450a == 14) {
                Object obj = agVar2.f93451b;
                Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (h.f.b.l.a(obj, (Object) str)) {
                    bVar2.F().c(((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme);
                }
            }
            return z.f158842a;
        }
    }

    static final class r extends h.f.b.m implements h.f.a.m<b, com.ss.android.ugc.aweme.comment.c.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f92603a = new r();

        static {
            Covode.recordClassIndex(58690);
        }

        r() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.ss.android.ugc.aweme.comment.c.c cVar) {
            Integer num;
            Object obj;
            b bVar2 = bVar;
            com.ss.android.ugc.aweme.comment.c.c cVar2 = cVar;
            h.f.b.l.d(bVar2, "");
            Integer[] numArr = {3, 4, 8};
            Object[] objArr = null;
            if (cVar2 != null) {
                num = Integer.valueOf(cVar2.f71746a);
            } else {
                num = null;
            }
            if (h.a.i.a(numArr, num)) {
                if (cVar2 != null) {
                    obj = cVar2.f71747b;
                } else {
                    obj = null;
                }
                if (obj instanceof Object[]) {
                    objArr = obj;
                }
                Object[] objArr2 = objArr;
                if (objArr2 != null && objArr2.length == 2) {
                    bVar2.F().c(((VideoItemParams) com.bytedance.assem.arch.b.l.a(bVar2)).mAweme);
                }
            }
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.q<b, String, Integer, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f92597a = new l();

        static {
            Covode.recordClassIndex(58684);
        }

        l() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(b bVar, String str, Integer num) {
            b bVar2 = bVar;
            String str2 = str;
            int intValue = num.intValue();
            h.f.b.l.d(bVar2, "");
            h.f.b.l.d(str2, "");
            b.b(bVar2).setVisibility(intValue);
            b.b(bVar2).setText(str2);
            return z.f158842a;
        }
    }

    static final class n extends h.f.b.m implements h.f.a.q<b, Integer, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f92599a = new n();

        static {
            Covode.recordClassIndex(58686);
        }

        n() {
            super(3);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // h.f.a.q
        public final /* synthetic */ z invoke(b bVar, Integer num, Boolean bool) {
            b bVar2 = bVar;
            int intValue = num.intValue();
            boolean booleanValue = bool.booleanValue();
            h.f.b.l.d(bVar2, "");
            b.a(bVar2).setVisibility(intValue);
            if (booleanValue && intValue == 0) {
                b.a(bVar2).setAlpha(0.0f);
                b.a(bVar2).animate().alpha(1.0f).setDuration(600).start();
            }
            return z.f158842a;
        }
    }
}
