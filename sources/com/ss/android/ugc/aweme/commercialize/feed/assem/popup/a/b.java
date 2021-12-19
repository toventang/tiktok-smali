package com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.f;
import com.bytedance.assem.arch.viewModel.i;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.k;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.q;
import com.lynx.tasm.r;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.a;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AbsAdPopUpWebPageVM;
import com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.AdPopUpWebPageVM;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView;
import com.ss.android.ugc.aweme.commercialize.utils.ac;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorLynxModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.f.b.y;
import h.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class b extends a<b> {
    static final /* synthetic */ h.k.i[] t = {new y(b.class, "popUpVM", "getPopUpVM()Lcom/ss/android/ugc/aweme/commercialize/feed/assem/popup/viewmodel/AdPopUpWebPageVM;", 0)};
    private final h.h.d u;
    private final AdPopUpWebPageView.a v = new c(this);
    private final AdPopUpWebPageView.d w = new j(this);
    private final AdPopUpWebPageView.c x = new d(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.b$b  reason: collision with other inner class name */
    public static final class C1676b extends m implements h.f.a.b<com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.a, com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.a> {
        public static final C1676b INSTANCE = new C1676b();

        static {
            Covode.recordClassIndex(45714);
        }

        public C1676b() {
            super(1);
        }

        public final com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.a invoke(com.ss.android.ugc.aweme.commercialize.feed.assem.popup.viewmodel.a aVar) {
            l.c(aVar, "");
            return aVar;
        }
    }

    static {
        Covode.recordClassIndex(45712);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final AdPopUpWebPageVM D() {
        return (AdPopUpWebPageVM) this.u.a(this, t[0]);
    }

    @Override // com.bytedance.assem.arch.b.v, com.bytedance.assem.arch.b.w
    public final void z() {
        super.z();
        I();
    }

    public static final class d implements AdPopUpWebPageView.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f74121a;

        static {
            Covode.recordClassIndex(45716);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.c
        public final void a() {
            ((AbsAdPopUpWebPageVM) this.f74121a.D()).f74135k = "back";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(b bVar) {
            this.f74121a = bVar;
        }
    }

    @Override // com.bytedance.assem.arch.b.w
    public final void B() {
        super.B();
        ((AbsAdPopUpWebPageVM) D()).f74136l = System.currentTimeMillis();
    }

    public static final class a extends m implements h.f.a.a<String> {
        final /* synthetic */ h.k.c $viewModelClass;

        static {
            Covode.recordClassIndex(45713);
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

    public static final class j implements AdPopUpWebPageView.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f74127a;

        static {
            Covode.recordClassIndex(45722);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.d
        public final void a() {
            ((AbsAdPopUpWebPageVM) this.f74127a.D()).f74135k = "button";
            this.f74127a.E().h();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(b bVar) {
            this.f74127a = bVar;
        }
    }

    @Override // com.bytedance.assem.arch.b.w
    public final void C() {
        super.C();
        D();
        AdPopUpWebPageVM.a(System.currentTimeMillis() - ((AbsAdPopUpWebPageVM) D()).f74136l);
    }

    public b() {
        h.k.c a2 = ab.a(AdPopUpWebPageVM.class);
        this.u = k.a(this, a2, i.c.f25720a, new a(a2), k.b.f28699a, k.a(this), C1676b.INSTANCE, null, null, k.b(this), k.c(this));
    }

    public static final class c implements AdPopUpWebPageView.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f74120a;

        static {
            Covode.recordClassIndex(45715);
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(String str) {
            l.d(str, "");
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a() {
            AwemeRawAd awemeRawAd;
            Aweme aweme;
            Aweme aweme2;
            AdPopUpWebPageVM K = this.f74120a.D();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.commercialize.feed.popupwebview.d(true));
            K.a(AbsAdPopUpWebPageVM.b.f74139a);
            K.a(AbsAdPopUpWebPageVM.c.f74140a);
            ((AbsAdPopUpWebPageVM) K).f74136l = System.currentTimeMillis();
            VideoItemParams videoItemParams = (VideoItemParams) K.g();
            AwemeRawAd awemeRawAd2 = null;
            if (videoItemParams == null || (aweme2 = videoItemParams.mAweme) == null) {
                awemeRawAd = null;
            } else {
                awemeRawAd = aweme2.getAwemeRawAd();
            }
            if (K.a(awemeRawAd)) {
                VideoItemParams videoItemParams2 = (VideoItemParams) K.g();
                if (!(videoItemParams2 == null || (aweme = videoItemParams2.mAweme) == null)) {
                    awemeRawAd2 = aweme.getAwemeRawAd();
                }
                com.bytedance.ies.ugc.aweme.rich.a.a.a("landing_ad", "detail_show", awemeRawAd2).b();
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(b bVar) {
            this.f74120a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void b(int i2) {
            this.f74120a.E().g();
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2) {
            this.f74120a.D().h();
            ((AbsAdPopUpWebPageVM) this.f74120a.D()).f74135k = null;
        }

        @Override // com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageView.a
        public final void a(int i2, Boolean bool) {
            this.f74120a.D().i();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.a
    public final void J() {
        Aweme aweme;
        Fragment fragment;
        String str;
        String str2;
        String str3;
        AnchorLynxModel anchorLynxModel;
        Fragment fragment2;
        Context context;
        Aweme aweme2;
        List<AnchorCommonStruct> anchors;
        String str4;
        MethodCollector.i(9552);
        VideoItemParams videoItemParams = (VideoItemParams) D().g();
        if (videoItemParams == null || (aweme = videoItemParams.mAweme) == null) {
            MethodCollector.o(9552);
            return;
        }
        VideoItemParams videoItemParams2 = (VideoItemParams) D().g();
        if (videoItemParams2 == null || (fragment = videoItemParams2.fragment) == null) {
            MethodCollector.o(9552);
            return;
        }
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity == null) {
            MethodCollector.o(9552);
            return;
        }
        l.b(activity, "");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            str = awemeRawAd.getSource();
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
            if (awemeRawAd2 != null) {
                str2 = awemeRawAd2.getSource();
            } else {
                str2 = null;
            }
        } else {
            AwemeRawAd awemeRawAd3 = aweme.getAwemeRawAd();
            if (awemeRawAd3 == null || (str2 = awemeRawAd3.getWebTitle()) == null) {
                str2 = "";
            }
        }
        ac.a aVar = new ac.a();
        AwemeRawAd awemeRawAd4 = aweme.getAwemeRawAd();
        if (awemeRawAd4 == null || (str3 = awemeRawAd4.getWebUrl()) == null) {
            str3 = "";
        }
        ac.a a2 = aVar.a(str3).a(fragment).a(hh.b());
        if (str2 == null) {
            str2 = "";
        }
        ac.a a3 = a2.b(str2).a(a(aweme, fragment)).a(aweme.getAwemeRawAd());
        AdPopUpWebPageVM K = D();
        VideoItemParams videoItemParams3 = (VideoItemParams) K.g();
        if (videoItemParams3 != null && (fragment2 = videoItemParams3.fragment) != null && (context = fragment2.getContext()) != null) {
            l.b(context, "");
            VideoItemParams videoItemParams4 = (VideoItemParams) K.g();
            if (videoItemParams4 != null && (aweme2 = videoItemParams4.mAweme) != null && (anchors = aweme2.getAnchors()) != null) {
                Iterator<AnchorCommonStruct> it = anchors.iterator();
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    AnchorCommonStruct next = it.next();
                    i2++;
                    if (next.getType() == 24) {
                        com.google.gson.l a4 = q.a(next.getExtra());
                        l.b(a4, "");
                        if (l.a(new com.google.gson.f().a(a4.j().c("is_schema_lynx"), new AdPopUpWebPageVM.c().type), (Object) true)) {
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("is_lynx_landing_page", true);
                            bundle.putBoolean("hide_nav_bar", true);
                            bundle.putBoolean("hide_status_bar", false);
                            bundle.putBoolean("bundle_nav_bar_status_padding", true);
                            bundle.putBoolean("need_bottom_out", true);
                            com.google.gson.l a5 = q.a(next.getExtra());
                            l.b(a5, "");
                            List list = (List) new com.google.gson.f().a(a5.j().c("gecko_channel"), new AdPopUpWebPageVM.b().type);
                            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                                str4 = (String) list.get(0);
                            } else {
                                str4 = "";
                            }
                            bundle.putString("lynx_channel_name", str4);
                            bundle.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(n.a(context), 1073741824));
                            bundle.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(n.b(context) - hh.b(), 1073741824));
                            String schema = next.getSchema();
                            if (schema == null) {
                                schema = "";
                            }
                            Uri parse = Uri.parse(schema);
                            l.b(parse, "");
                            String str5 = "1";
                            if (parse.isHierarchical()) {
                                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                                if (TextUtils.equals(parse.getQueryParameter("async_layout"), str5)) {
                                    bundle.putBoolean("preset_safe_point", true);
                                    bundle.putInt("thread_strategy", r.PART_ON_LAYOUT.id());
                                }
                            }
                            if (anchors.size() == 1) {
                                str5 = "0";
                            } else if (i2 != 0) {
                                str5 = "2";
                            }
                            String schema2 = next.getSchema();
                            if (schema2 == null) {
                                schema2 = "";
                            }
                            Uri.Builder buildUpon = Uri.parse(schema2).buildUpon();
                            String id = next.getId();
                            if (anchors.size() != 1) {
                                z = false;
                            }
                            String uri = buildUpon.appendQueryParameter("extra", K.a(aweme2, id, z, str5)).build().toString();
                            l.b(uri, "");
                            anchorLynxModel = new AnchorLynxModel(uri, bundle);
                        }
                    }
                }
            }
        }
        anchorLynxModel = null;
        ac a6 = a3.a(anchorLynxModel).a();
        AdPopUpWebPageView.a aVar2 = this.v;
        AdPopUpWebPageView.c cVar = this.x;
        AdPopUpWebPageView adPopUpWebPageView = ((a) this).r;
        if (adPopUpWebPageView == null) {
            adPopUpWebPageView = new AdPopUpWebPageView(activity, (byte) 0);
            adPopUpWebPageView.setId(R.id.g3);
            adPopUpWebPageView.setParams(a6);
            adPopUpWebPageView.setMBehaviorCallback(aVar2);
            adPopUpWebPageView.setKeyDownCallBack(cVar);
            View s = s();
            if (s != null) {
                ((ViewGroup) s).addView(adPopUpWebPageView);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(9552);
                throw nullPointerException;
            }
        }
        ((a) this).r = adPopUpWebPageView;
        AdPopUpWebPageView adPopUpWebPageView2 = ((a) this).r;
        if (adPopUpWebPageView2 != null) {
            adPopUpWebPageView2.setTitleBarCallback(this.w);
            MethodCollector.o(9552);
            return;
        }
        MethodCollector.o(9552);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.b.i
    public final /* synthetic */ void a(VideoItemParams videoItemParams) {
        l.d(videoItemParams, "");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.a, com.bytedance.assem.arch.b.i
    public final /* synthetic */ boolean c(VideoItemParams videoItemParams) {
        return c(videoItemParams);
    }

    @Override // com.bytedance.assem.arch.b.v, com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.a
    public final void c(View view) {
        l.d(view, "");
        f.a.a(this, G(), c.f74128a, (com.bytedance.assem.arch.viewModel.k) null, f.f74123a, 6);
        f.a.a(this, H(), d.f74129a, (com.bytedance.assem.arch.viewModel.k) null, g.f74124a, 6);
        f.a.a(this, D(), e.f74130a, (com.bytedance.assem.arch.viewModel.k) null, h.f74125a, 6);
        f.a.a(this, D(), f.f74131a, (com.bytedance.assem.arch.viewModel.k) null, i.f74126a, 6);
        f.a.a(this, F(), g.f74132a, (com.bytedance.assem.arch.viewModel.k) null, e.f74122a, 6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008b, code lost:
        if (r5 != null) goto L_0x0014;
     */
    @Override // com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.feed.model.VideoItemParams r9) {
        /*
        // Method dump skipped, instructions count: 142
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.assem.popup.a.b.a(com.ss.android.ugc.aweme.feed.model.VideoItemParams):boolean");
    }

    static final class f extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends z>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f74123a = new f();

        static {
            Covode.recordClassIndex(45718);
        }

        f() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.I();
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends z>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f74122a = new e();

        static {
            Covode.recordClassIndex(45717);
        }

        e() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            AdPopUpWebPageView adPopUpWebPageView = ((a) bVar2).r;
            if (adPopUpWebPageView != null && adPopUpWebPageView.g()) {
                bVar2.E().g();
            }
            return z.f158842a;
        }
    }

    static final class h extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends z>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f74125a = new h();

        static {
            Covode.recordClassIndex(45720);
        }

        h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends z> aVar) {
            b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.E().h();
            return z.f158842a;
        }
    }

    static final class i extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f74126a = new i();

        static {
            Covode.recordClassIndex(45721);
        }

        i() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar) {
            T t;
            b bVar2 = bVar;
            com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2 = aVar;
            l.d(bVar2, "");
            if (!(aVar2 == null || (t = aVar2.f25631b) == null)) {
                bVar2.F().a(t.booleanValue());
            }
            return z.f158842a;
        }
    }

    static final class g extends m implements h.f.a.m<b, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f74124a = new g();

        static {
            Covode.recordClassIndex(45719);
        }

        g() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(b bVar, com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b> aVar) {
            T t;
            AdPopUpWebPageView adPopUpWebPageView;
            b bVar2 = bVar;
            com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.commercialize.feed.popupwebview.b> aVar2 = aVar;
            l.d(bVar2, "");
            bVar2.J();
            if (!(aVar2 == null || (t = aVar2.f25631b) == null || (adPopUpWebPageView = ((a) bVar2).r) == null || adPopUpWebPageView.g())) {
                bVar2.s().setVisibility(0);
                adPopUpWebPageView.getActionMode().f74368f = t.f74375d;
                adPopUpWebPageView.a(new a.n(adPopUpWebPageView, bVar2, t));
            }
            return z.f158842a;
        }
    }
}
