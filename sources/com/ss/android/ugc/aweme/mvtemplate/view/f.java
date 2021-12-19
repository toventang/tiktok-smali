package com.ss.android.ugc.aweme.mvtemplate.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.status.TuxStatusView;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.mvtemplate.api.MovieDetailAPi;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ui.cr;
import com.ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class f extends com.ss.android.ugc.aweme.challenge.ui.b implements a, org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: m  reason: collision with root package name */
    public static final a f112188m = new a((byte) 0);
    private String N;
    private String O;
    private MvModel P;
    private String Q;
    private String R;
    private boolean S;
    private final h.h T = h.i.a((h.f.a.a) new b(this));
    private final h.h U = h.i.a((h.f.a.a) new m(this));
    private boolean V;
    private SparseArray W;

    /* renamed from: d  reason: collision with root package name */
    public String f112189d;

    /* renamed from: e  reason: collision with root package name */
    public Integer f112190e;

    /* renamed from: j  reason: collision with root package name */
    public c f112191j;

    /* renamed from: k  reason: collision with root package name */
    public String f112192k;

    /* renamed from: l  reason: collision with root package name */
    public final LogPbBean f112193l = new LogPbBean();
    private final h.h n = h.i.a((h.f.a.a) new e(this));
    private final h.h o = h.i.a((h.f.a.a) new l(this));
    private final h.h p = h.i.a((h.f.a.a) new C2866f(this));
    private final h.h q = h.i.a((h.f.a.a) new d(this));
    private com.ss.android.ugc.aweme.bu.a.a r;
    private float s;
    private float t;
    private String u;

    static {
        Covode.recordClassIndex(72076);
    }

    private final View d() {
        return (View) this.n.getValue();
    }

    private final TextView e() {
        return (TextView) this.o.getValue();
    }

    private final TuxStatusView g() {
        return (TuxStatusView) this.p.getValue();
    }

    private final View j() {
        return (View) this.q.getValue();
    }

    private final com.ss.android.ugc.aweme.v.a.c m() {
        return (com.ss.android.ugc.aweme.v.a.c) this.T.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String a(int i2) {
        return "movie";
    }

    public final View b(int i2) {
        if (this.W == null) {
            this.W = new SparseArray();
        }
        View view = (View) this.W.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.W.put(i2, findViewById);
        return findViewById;
    }

    public final g b() {
        return (g) this.U.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new org.greenrobot.eventbus.g(f.class, "onVideoEvent", ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final int h() {
        return R.layout.a18;
    }

    @r
    public final void onVideoEvent(ag agVar) {
        h.f.b.l.d(agVar, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72077);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String i() {
        String str = this.f112189d;
        if (str == null) {
            return "";
        }
        return str;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.v.a.c> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72078);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.v.a.c invoke() {
            return this.this$0.b().a();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72080);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.requireActivity().findViewById(R.id.bez);
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<View> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72081);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.this$0.requireActivity().findViewById(R.id.e9v);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.f$f  reason: collision with other inner class name */
    static final class C2866f extends h.f.b.m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72082);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2866f(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.b(R.id.e_o);
        }
    }

    static final /* synthetic */ class g extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(72083);
        }

        g(f fVar) {
            super(0, fVar, f.class, "refresh", "refresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((f) this.receiver).c();
            return z.f158842a;
        }
    }

    static final /* synthetic */ class h extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(72084);
        }

        h(f fVar) {
            super(0, fVar, f.class, "refresh", "refresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((f) this.receiver).c();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class k extends h.f.b.j implements h.f.a.a<z> {
        static {
            Covode.recordClassIndex(72087);
        }

        k(f fVar) {
            super(0, fVar, f.class, "refresh", "refresh()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ((f) this.receiver).c();
            return z.f158842a;
        }
    }

    static final class l extends h.f.b.m implements h.f.a.a<TextView> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72088);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.this$0.requireActivity().findViewById(R.id.f159973com);
        }
    }

    private static boolean q() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.W;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class m extends h.f.b.m implements h.f.a.a<g> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ g invoke() {
            Context requireContext = this.this$0.requireContext();
            h.f.b.l.b(requireContext, "");
            String str = this.this$0.f112189d;
            if (str == null) {
                str = "";
            }
            h.f.b.l.d(requireContext, "");
            h.f.b.l.d(str, "");
            return new b(requireContext, str);
        }
    }

    private static boolean r() {
        if (com.ss.android.ugc.aweme.lancet.j.f107226e && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107226e;
        }
        boolean q2 = q();
        com.ss.android.ugc.aweme.lancet.j.f107226e = q2;
        return q2;
    }

    static final class j extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(72086);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            String str;
            this.this$0.c();
            c cVar = this.this$0.f112191j;
            if (cVar == null) {
                h.f.b.l.a("mHotFragment");
            }
            cVar.j();
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            Integer num = this.this$0.f112190e;
            if (num != null && num.intValue() == 1) {
                str = "jianying_mv_page";
            } else {
                str = "mv_page";
            }
            com.ss.android.ugc.aweme.common.r.a("refresh_page", dVar.a("enter_from", str).f66730a);
            return z.f158842a;
        }
    }

    public final void c() {
        getContext();
        if (!r()) {
            ((SpringLayout) b(R.id.e8p)).setRefreshing(false);
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (!this.V) {
                g().setVisibility(0);
                g().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new k(this)));
                return;
            }
            return;
        }
        if (!this.V) {
            g().setVisibility(0);
            g().a();
        }
        com.ss.android.ugc.aweme.bu.a.a aVar = this.r;
        if (aVar != null) {
            Object[] objArr = new Object[6];
            objArr[0] = "";
            objArr[1] = this.f112189d;
            objArr[2] = this.f112190e;
            objArr[3] = null;
            objArr[4] = this.Q;
            String str = this.R;
            if (str == null) {
                h.f.b.l.a("cutSameSdkVersion");
            }
            objArr[5] = str;
            aVar.a(objArr);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final androidx.fragment.app.l l() {
        this.I = new ArrayList();
        this.J = new ArrayList();
        this.f70119a = new ArrayList();
        boolean z = false;
        Fragment a2 = getChildFragmentManager().a(com.ss.android.ugc.aweme.detail.a.v + 0);
        boolean z2 = a2 instanceof c;
        c cVar = a2;
        if (!z2) {
            String str = this.f112189d;
            d dVar = new d();
            h.f.b.l.d("movie", "");
            h.f.b.l.d("", "");
            h.f.b.l.d("from_detail_activity", "");
            h.f.b.l.d(dVar, "");
            c cVar2 = new c();
            Bundle bundle = new Bundle();
            bundle.putInt(c.K, 20);
            bundle.putString(c.L, "movie");
            bundle.putString(c.M, str);
            bundle.putBoolean("extra_challenge_is_hashtag", false);
            bundle.putString("extra_challenge_hashtag_name", "");
            bundle.putString(c.N, "from_detail_activity");
            cVar2.setArguments(bundle);
            cVar2.G = dVar;
            c cVar3 = cVar2;
            if (this.G == 0) {
                z = true;
            }
            cVar3.z = z;
            cVar3.A = true;
            cVar = cVar2;
        }
        Objects.requireNonNull(cVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailAwemeListFragment");
        this.f112191j = (c) cVar;
        List list = this.I;
        c cVar4 = this.f112191j;
        if (cVar4 == null) {
            h.f.b.l.a("mHotFragment");
        }
        list.add(cVar4);
        List list2 = this.J;
        c cVar5 = this.f112191j;
        if (cVar5 == null) {
            h.f.b.l.a("mHotFragment");
        }
        list2.add(cVar5);
        this.f70119a.add(20);
        return new cr(getChildFragmentManager(), this.J, this.f70119a);
    }

    static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f112195a;

        static {
            Covode.recordClassIndex(72085);
        }

        i(f fVar) {
            this.f112195a = fVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            androidx.fragment.app.e activity = this.f112195a.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final com.ss.android.ugc.aweme.g.a.g a(ViewGroup viewGroup) {
        h.f.b.l.d(viewGroup, "");
        return m().a(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        if (bundle == null || (str = bundle.getString("mv_id")) == null) {
            str = "";
        }
        this.f112189d = str;
        this.H = false;
        if (bundle == null || (str2 = bundle.getString("enter_method")) == null) {
            str2 = "";
        }
        this.u = str2;
        if (bundle == null || (str3 = bundle.getString("enter_from")) == null) {
            str3 = "";
        }
        this.N = str3;
        if (bundle == null || (str4 = bundle.getString("group_id")) == null) {
            str4 = "";
        }
        this.f112192k = str4;
        if (bundle != null) {
            num = Integer.valueOf(bundle.getInt(StringSet.type, 0));
        } else {
            num = null;
        }
        this.f112190e = num;
        this.Q = null;
        String cutsameSdkVersion = AVExternalServiceImpl.a().configService().shortVideoConfig().cutsameSdkVersion();
        h.f.b.l.b(cutsameSdkVersion, "");
        this.R = cutsameSdkVersion;
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f112194a;

        static {
            Covode.recordClassIndex(72079);
        }

        c(f fVar) {
            this.f112194a = fVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            ClickAgent.onClick(view);
            IMovieReuseService a2 = MovieReuseServiceImpl.a();
            f fVar = this.f112194a;
            String str4 = fVar.f112189d;
            Integer num = this.f112194a.f112190e;
            if (num != null) {
                num.intValue();
            }
            a2.b(fVar, str4);
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            Integer num2 = this.f112194a.f112190e;
            String str5 = "jianying_mv_page";
            if (num2 != null && num2.intValue() == 1) {
                str = str5;
            } else {
                str = "mv_page";
            }
            com.ss.android.ugc.aweme.app.f.d a3 = dVar.a("shoot_way", str);
            Integer num3 = this.f112194a.f112190e;
            if (num3 == null || num3.intValue() != 1) {
                str5 = "mv_page";
            }
            com.ss.android.ugc.aweme.app.f.d a4 = a3.a("enter_from", str5);
            Integer num4 = this.f112194a.f112190e;
            if (num4 != null && num4.intValue() == 1) {
                str2 = "click_jianying_mv_publish";
            } else {
                str2 = "click_mv_publish";
            }
            com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_method", str2).a("mv_id", this.f112194a.f112189d).a("log_pb", ac.a.f91473a.a(this.f112194a.f112193l)).a("group_id", this.f112194a.f112192k);
            Integer num5 = this.f112194a.f112190e;
            if (num5 != null && num5.intValue() == 1) {
                str3 = "jianying_mv";
            } else {
                str3 = "mv";
            }
            com.ss.android.ugc.aweme.common.r.a("shoot", a5.a("content_type", str3).a("content_source", "upload").f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.mvtemplate.view.a
    public final void a(Exception exc) {
        h.f.b.l.d(exc, "");
        SpringLayout springLayout = (SpringLayout) b(R.id.e8p);
        if (springLayout != null) {
            springLayout.setRefreshing(false);
        }
        if (ab_()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (this.V) {
                g().setVisibility(8);
                return;
            }
            g().setVisibility(0);
            g().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new g(this)));
        }
    }

    @Override // com.ss.android.ugc.aweme.mvtemplate.view.a
    public final void a(com.ss.android.ugc.aweme.mvtemplate.a.d dVar) {
        String str;
        String imprId;
        String extra;
        String str2;
        String str3 = "";
        h.f.b.l.d(dVar, str3);
        SpringLayout springLayout = (SpringLayout) b(R.id.e8p);
        if (springLayout != null) {
            springLayout.setRefreshing(false);
        }
        if (ab_()) {
            if (dVar.f112139c == null && dVar.f112140d == null) {
                this.V = false;
                new com.bytedance.tux.g.b(this).e(R.string.de8).b();
                g().setVisibility(0);
                g().setStatus(com.ss.android.ugc.aweme.tux.a.g.a.a(new TuxStatusView.c(), new h(this)));
                return;
            }
            this.P = dVar.f112139c;
            String str4 = null;
            if (CommerceMediaServiceImpl.f().a()) {
                try {
                    MvModel mvModel = this.P;
                    if (mvModel == null || (extra = mvModel.getExtra()) == null || extra.length() == 0) {
                        d().setVisibility(8);
                    } else {
                        MvModel mvModel2 = this.P;
                        if (mvModel2 != null) {
                            str2 = mvModel2.getExtra();
                        } else {
                            str2 = null;
                        }
                        if (!new JSONObject(str2).optBoolean("is_commerce_music", false)) {
                            d().setVisibility(8);
                        }
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            c cVar = this.f112191j;
            if (cVar == null) {
                h.f.b.l.a("mHotFragment");
            }
            cVar.I = dVar.f112139c;
            c cVar2 = this.f112191j;
            if (cVar2 == null) {
                h.f.b.l.a("mHotFragment");
            }
            cVar2.J = this.f112192k;
            this.V = true;
            g().setVisibility(8);
            Integer num = this.f112190e;
            int i2 = MovieDetailAPi.f112155a;
            if (num != null && num.intValue() == i2) {
                TextView textView = this.z;
                h.f.b.l.b(textView, str3);
                com.ss.android.ugc.aweme.mvtemplate.a.e eVar = dVar.f112140d;
                if (eVar != null) {
                    str4 = eVar.f112146e;
                }
                textView.setText(str4);
            } else {
                TextView textView2 = this.z;
                h.f.b.l.b(textView2, str3);
                MvModel mvModel3 = dVar.f112139c;
                if (mvModel3 != null) {
                    str4 = mvModel3.getName();
                }
                textView2.setText(str4);
            }
            b().a(dVar);
            LogPbBean logPbBean = dVar.f112141e;
            if (!(logPbBean == null || (imprId = logPbBean.getImprId()) == null)) {
                str3 = imprId;
            }
            this.O = str3;
            this.f112193l.setImprId(str3);
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.N).a("log_pb", ac.a.f91473a.a(this.f112193l)).a("group_id", this.f112192k).a("mv_id", this.f112189d).a("enter_method", this.u);
            Integer num2 = this.f112190e;
            if (num2 != null && num2.intValue() == 1) {
                str = "jianying_mv";
            } else {
                str = "mv";
            }
            com.ss.android.ugc.aweme.common.r.a("enter_mv_detail", a2.a("mv_type", str).f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void a(float f2, float f3) {
        this.S = com.ss.android.ugc.aweme.detail.m.a(f2, f3, this.S, this);
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void b(int i2, int i3) {
        super.b(i2, i3);
        float f2 = 0.0f;
        if (this.t == 0.0f && e().getVisibility() == 0) {
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            int a2 = h.g.a.a(TypedValue.applyDimension(1, 58.0f, system.getDisplayMetrics())) + e().getBottom();
            View view = this.A;
            h.f.b.l.b(view, "");
            this.t = (float) (a2 - view.getBottom());
        }
        if (this.s == 0.0f) {
            int bottom = j().getBottom();
            View view2 = this.A;
            h.f.b.l.b(view2, "");
            this.s = (float) (bottom - view2.getBottom());
        }
        float f3 = (float) i2;
        float f4 = this.t;
        float f5 = (f3 - f4) / (this.s - f4);
        if (((double) f5) > 0.2d) {
            f2 = f5;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        View view3 = this.A;
        h.f.b.l.b(view3, "");
        view3.setAlpha(f2);
        TextView textView = this.z;
        h.f.b.l.b(textView, "");
        View j2 = j();
        float f6 = this.s;
        h.f.b.l.d(textView, "");
        h.f.b.l.d(j2, "");
        textView.setAlpha(f2);
        j2.setAlpha(1.0f - (f3 / f6));
        this.S = com.ss.android.ugc.aweme.detail.m.a(f2, this.S, this);
    }

    @Override // com.ss.android.ugc.aweme.challenge.ui.b, com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        h.f.b.l.d(view, "");
        b().a(view);
        com.ss.android.ugc.aweme.v.a.c m2 = m();
        View findViewById = view.findViewById(R.id.e9y);
        h.f.b.l.b(findViewById, "");
        m2.a((RelativeLayout) findViewById);
        super.onViewCreated(view, bundle);
        if (TextUtils.isEmpty(this.f112189d)) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.bu.a.a aVar = new com.ss.android.ugc.aweme.bu.a.a();
        this.r = aVar;
        aVar.a_(this);
        ((AutoRTLImageView) b(R.id.qb)).setOnClickListener(new i(this));
        if (d().getVisibility() == 0) {
            d().setOnClickListener(new c(this));
        }
        if (com.ss.android.ugc.aweme.tux.a.b.a.a()) {
            ((SpringLayout) b(R.id.e8p)).setOnRefreshListener(new j(this));
        } else {
            ((SpringLayout) b(R.id.e8p)).setNestedHeader(null);
            ((SpringLayout) b(R.id.e8p)).setScrollMode(com.bytedance.tux.widget.spring.g.NONE);
            ((SpringLayout) b(R.id.e8p)).setOverScrollMode(com.bytedance.tux.widget.spring.e.NONE);
        }
        c();
    }
}
