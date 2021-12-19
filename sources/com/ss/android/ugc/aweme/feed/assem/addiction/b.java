package com.ss.android.ugc.aweme.feed.assem.addiction;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.commercialize.utils.az;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.z;
import java.util.Arrays;
import java.util.Date;

public final class b extends com.ss.android.ugc.aweme.feed.assem.base.a<b> {
    static final /* synthetic */ h.k.i[] u = {new y(b.class, "antiAddictionVM", "getAntiAddictionVM()Lcom/ss/android/ugc/aweme/feed/assem/addiction/VideoAntiAddictionVM;", 0)};
    public static final f w = new f((byte) 0);
    public ViewGroup v;
    private final h.h.d x;
    private final h.h y = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), this, d.INSTANCE, e.INSTANCE, c.INSTANCE);
    private SparseArray z;

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.b$b  reason: collision with other inner class name */
    public static final class C2219b extends m implements h.f.a.b<e, e> {
        public static final C2219b INSTANCE = new C2219b();

        static {
            Covode.recordClassIndex(57922);
        }

        public C2219b() {
            super(1);
        }

        public final e invoke(e eVar) {
            l.c(eVar, "");
            return eVar;
        }
    }

    public static final class c extends m implements h.f.a.b<bd, bd> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(57923);
        }

        public c() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            l.c(bdVar, "");
            return bdVar;
        }
    }

    static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final h f91992a = new h();

        static {
            Covode.recordClassIndex(57928);
        }

        h() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(57920);
    }

    @Override // com.bytedance.assem.arch.b.x
    public final int C() {
        return R.layout.rs;
    }

    public final VideoAntiAddictionVM F() {
        return (VideoAntiAddictionVM) this.x.a(this, u[0]);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final View G() {
        if (this.z == null) {
            this.z = new SparseArray();
        }
        View view = (View) this.z.get(R.id.dlk);
        if (view != null) {
            return view;
        }
        View s = s();
        if (s == null) {
            return null;
        }
        View findViewById = s.findViewById(R.id.dlk);
        this.z.put(R.id.dlk, findViewById);
        return findViewById;
    }

    public static final class f {
        static {
            Covode.recordClassIndex(57926);
        }

        private f() {
        }

        public /* synthetic */ f(byte b2) {
            this();
        }
    }

    public static final class d extends m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(57924);
        }

        public d() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class e extends m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(57925);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final void a() {
        super.a();
        F().a((Context) null);
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(57921);
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
        super.x();
        f.a.a(this, F(), c.f91996a, (com.bytedance.assem.arch.viewModel.k) null, g.f91991a, 6);
    }

    static final class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f91995a;

        static {
            Covode.recordClassIndex(57931);
        }

        k(b bVar) {
            this.f91995a = bVar;
        }

        public final void run() {
            if (this.f91995a.v != null) {
                az d2 = com.ss.android.ugc.aweme.commercialize.g.d();
                ViewGroup viewGroup = this.f91995a.v;
                ViewGroup viewGroup2 = this.f91995a.v;
                if (viewGroup2 == null) {
                    l.b();
                }
                d2.a(viewGroup, -viewGroup2.getHeight(), 360, false);
            }
        }
    }

    public b() {
        h.k.c a2 = ab.a(VideoAntiAddictionVM.class);
        this.x = com.bytedance.ext_power_list.k.a(this, a2, i.c.f25720a, new a(a2), k.b.f28699a, com.bytedance.ext_power_list.k.a(this), C2219b.INSTANCE, null, null, com.bytedance.ext_power_list.k.b(this), com.bytedance.ext_power_list.k.c(this));
    }

    static final class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f91994a;

        static {
            Covode.recordClassIndex(57930);
        }

        j(b bVar) {
            this.f91994a = bVar;
        }

        public final void run() {
            String str;
            Resources resources;
            if (this.f91994a.v != null) {
                ViewGroup viewGroup = this.f91994a.v;
                if (viewGroup == null) {
                    l.b();
                }
                View findViewById = viewGroup.findViewById(R.id.evb);
                l.b(findViewById, "");
                TextView textView = (TextView) findViewById;
                String obj = textView.getText().toString();
                if (!TextUtils.isEmpty(obj)) {
                    Context ar_ = this.f91994a.ar_();
                    if (ar_ == null || (resources = ar_.getResources()) == null || (str = resources.getString(R.string.rl)) == null) {
                        str = "";
                    }
                    Date date = new Date(System.currentTimeMillis());
                    this.f91994a.F();
                    String format = VideoAntiAddictionVM.h().format(date);
                    if (format == null) {
                        format = "";
                    }
                    String a2 = com.a.a(str, Arrays.copyOf(new Object[]{format, obj}, 2));
                    l.b(a2, "");
                    textView.setText(a2);
                    com.ss.android.ugc.aweme.commercialize.g.d().a(this.f91994a.v, 0, 360, true);
                    if (o.a(this.f91994a.v)) {
                        this.f91994a.F().f91986m = true;
                    }
                    com.ss.android.ugc.aweme.compliance.api.a.b().c();
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ void b(VideoItemParams videoItemParams) {
        b(videoItemParams);
    }

    @Override // com.ss.android.ugc.aweme.feed.assem.base.a
    public final void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
        super.b(videoItemParams);
        F().a(ar_());
    }

    @Override // com.bytedance.assem.arch.b.v
    public final void c(View view) {
        l.d(view, "");
        if (!(view instanceof ViewGroup)) {
            view = null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        this.v = viewGroup;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        ViewGroup viewGroup2 = this.v;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(h.f91992a);
        }
        f.a.a(this, (VideoPlayViewModel) this.y.getValue(), d.f91997a, (com.bytedance.assem.arch.viewModel.k) null, i.f91993a, 6);
    }

    static final class i extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends z>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f91993a = new i();

        static {
            Covode.recordClassIndex(57929);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            if (!bVar2.F().f91985l && !bVar2.F().f91986m && o.a(bVar2.v) && o.a(bVar2.v)) {
                Handler handler = new Handler();
                handler.postDelayed(new j(bVar2), 100);
                handler.postDelayed(new k(bVar2), 7000);
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.m<b, a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f91991a = new g();

        static {
            Covode.recordClassIndex(57927);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e4, code lost:
            if (r2 != null) goto L_0x00d8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00dd  */
        @Override // h.f.a.m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke(com.ss.android.ugc.aweme.feed.assem.addiction.b r9, com.ss.android.ugc.aweme.feed.assem.addiction.a r10) {
            /*
            // Method dump skipped, instructions count: 249
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.addiction.b.g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
