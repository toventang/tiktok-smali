package com.ss.android.ugc.aweme.kids.profile;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.n;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.aa;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.widget.c;
import com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.kids.profile.e;
import com.ss.android.ugc.aweme.kids.profile.utils.MyProfileReportWidget;
import com.ss.android.ugc.aweme.kids.profile.utils.a;
import com.ss.android.ugc.aweme.kids.profile.viewmodel.KidsProfileViewModel;
import com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.api.ISettingService;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.bs;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.r;

public final class c extends com.ss.android.ugc.aweme.kids.profile.base.a implements org.greenrobot.eventbus.i, org.greenrobot.eventbus.j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f106765c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final h.h f106766a = h.i.a((h.f.a.a) h.f106777a);

    /* renamed from: b  reason: collision with root package name */
    final h.h f106767b = h.i.a((h.f.a.a) new i(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f106768e = h.i.a((h.f.a.a) new b(this));

    /* renamed from: j  reason: collision with root package name */
    private final h.h f106769j = h.i.a((h.f.a.a) new g(this));

    /* renamed from: k  reason: collision with root package name */
    private final h.h f106770k = h.i.a((h.f.a.a) new j(this));

    /* renamed from: l  reason: collision with root package name */
    private HashMap f106771l;

    static {
        Covode.recordClassIndex(68247);
    }

    private final KidsProfileViewModel c() {
        return (KidsProfileViewModel) this.f106770k.getValue();
    }

    @Override // com.ss.android.ugc.aweme.base.f.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.kids.profile.base.a
    public final View a(int i2) {
        if (this.f106771l == null) {
            this.f106771l = new HashMap();
        }
        View view = (View) this.f106771l.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f106771l.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public final b a() {
        return (b) this.f106769j.getValue();
    }

    @Override // com.ss.android.ugc.aweme.kids.profile.base.a
    public final void b() {
        HashMap hashMap = this.f106771l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(192, new org.greenrobot.eventbus.g(c.class, "onDeleteDraftItemEvent", com.ss.android.ugc.aweme.ftc.c.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(193, new org.greenrobot.eventbus.g(c.class, "onVideoCreatedOrSaved", com.ss.android.ugc.aweme.ftc.c.c.class, ThreadMode.MAIN, 0, true));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.kids.profile.base.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        b();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(68248);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class h extends m implements h.f.a.a<com.ss.android.ugc.aweme.kids.profile.a.b> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f106777a = new h();

        static {
            Covode.recordClassIndex(68256);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.kids.profile.a.b invoke() {
            return new com.ss.android.ugc.aweme.kids.profile.a.b();
        }
    }

    static final class i extends m implements h.f.a.a<h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, ? extends z>> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(68257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h.f.a.b<? super com.ss.android.ugc.aweme.kids.profile.utils.a, ? extends z> invoke() {
            return new h.f.a.b<com.ss.android.ugc.aweme.kids.profile.utils.a, z>(this) {
                /* class com.ss.android.ugc.aweme.kids.profile.c.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(68258);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(com.ss.android.ugc.aweme.kids.profile.utils.a aVar) {
                    com.ss.android.ugc.aweme.kids.profile.utils.a aVar2 = aVar;
                    l.d(aVar2, "");
                    if ((aVar2 instanceof a.C2738a) && this.this$0.this$0.getActivity() != null && (this.this$0.this$0.getActivity() instanceof androidx.fragment.app.e) && this.this$0.this$0.getFragmentManager() != null) {
                        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.kids.profile.api.a.a());
                        Fragment showDetailDraft = AVExternalServiceImpl.a().draftService().showDetailDraft(((a.C2738a) aVar2).f106790b);
                        androidx.fragment.app.i fragmentManager = this.this$0.this$0.getFragmentManager();
                        Objects.requireNonNull(fragmentManager, "null cannot be cast to non-null type androidx.fragment.app.FragmentManager");
                        n a2 = fragmentManager.a();
                        l.b(a2, "");
                        if (showDetailDraft == null) {
                            l.b();
                        }
                        a2.a(R.id.ad7, showDetailDraft);
                        a2.a("KidsProfile");
                        a2.b();
                    }
                    return z.f158842a;
                }
            };
        }
    }

    static final class g extends m implements h.f.a.a<b> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(68255);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            return new b((h.f.a.b) this.this$0.f106767b.getValue());
        }
    }

    static final class b extends m implements h.f.a.a<GridLayoutManager> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(68249);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ GridLayoutManager invoke() {
            this.this$0.getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
            gridLayoutManager.a(new a(gridLayoutManager));
            return gridLayoutManager;
        }

        public static final class a extends GridLayoutManager.c {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ GridLayoutManager f106772e;

            static {
                Covode.recordClassIndex(68250);
            }

            a(GridLayoutManager gridLayoutManager) {
                this.f106772e = gridLayoutManager;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.c
            public final int a(int i2) {
                if (i2 == 0) {
                    return this.f106772e.f3760b;
                }
                return 1;
            }
        }
    }

    static final class j extends m implements h.f.a.a<KidsProfileViewModel> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(68259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ KidsProfileViewModel invoke() {
            ac a2 = new ad(this.this$0, new ad.b(this) {
                /* class com.ss.android.ugc.aweme.kids.profile.c.j.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ j f106778a;

                static {
                    Covode.recordClassIndex(68260);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f106778a = r1;
                }

                @Override // androidx.lifecycle.ad.b
                public final <T extends ac> T a(Class<T> cls) {
                    l.d(cls, "");
                    return new KidsProfileViewModel((com.ss.android.ugc.aweme.kids.profile.a.a) this.f106778a.this$0.f106766a.getValue());
                }
            }).a(KidsProfileViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        KidsProfileViewModel c2 = c();
        c2.f106791a = kotlinx.coroutines.i.a(bs.f159054a, null, null, new KidsProfileViewModel.a(c2, null), 3);
    }

    public static final class k implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f106779a;

        static {
            Covode.recordClassIndex(68261);
        }

        public final void onAnimationRepeat(Animation animation) {
            l.d(animation, "");
        }

        public final void onAnimationStart(Animation animation) {
            l.d(animation, "");
        }

        k(View view) {
            this.f106779a = view;
        }

        public final void onAnimationEnd(Animation animation) {
            l.d(animation, "");
            this.f106779a.setLayerType(0, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.profile.c$c  reason: collision with other inner class name */
    static final class C2737c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106773a;

        static {
            Covode.recordClassIndex(68251);
        }

        C2737c(c cVar) {
            this.f106773a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.kids.profile.viewmodel.a aVar = (com.ss.android.ugc.aweme.kids.profile.viewmodel.a) obj;
            if (aVar != null && d.f106780a[aVar.ordinal()] == 1) {
                IKidsCommonService g2 = KidsCommonServiceImpl.g();
                androidx.fragment.app.e activity = this.f106773a.getActivity();
                if (activity == null) {
                    l.b();
                }
                l.b(activity, "");
                g2.a(activity);
            }
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106775a;

        static {
            Covode.recordClassIndex(68253);
        }

        e(c cVar) {
            this.f106775a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List list = (List) obj;
            b a2 = this.f106775a.a();
            l.b(list, "");
            l.d(list, "");
            a2.f106746a.clear();
            a2.f106746a.addAll(list);
            a2.notifyItemRangeChanged(0, a2.f106746a.size());
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106776a;

        static {
            Covode.recordClassIndex(68254);
        }

        f(c cVar) {
            this.f106776a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.kids.common.c.f.a("enter_setting_page", new com.ss.android.ugc.aweme.app.f.c().a("enter_method", "click_button").a("previous_page", "personal_homepage").a());
            ISettingService a2 = SettingServiceImpl.a();
            androidx.fragment.app.e activity = this.f106776a.getActivity();
            if (activity == null) {
                l.b();
            }
            l.b(activity, "");
            a2.a(activity);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        LinearLayout linearLayout = (LinearLayout) a(R.id.cvy);
        l.b(linearLayout, "");
        if (linearLayout.getVisibility() == 0 && !z) {
            com.ss.android.ugc.aweme.kids.common.c.f.a("shoot_bubble_show", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "personal_homepage").a());
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onDeleteDraftItemEvent(com.ss.android.ugc.aweme.ftc.c.a aVar) {
        l.d(aVar, "");
        List<e> value = c().f106793c.getValue();
        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.MutableList<com.ss.android.ugc.aweme.kids.profile.ProfileVideoData>");
        List<e> d2 = h.f.b.ad.d(value);
        Iterator<e> it = d2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            e next = it.next();
            if ((next instanceof e.a) && l.a((Object) aVar.f97534a.f(), (Object) ((e.a) next).f106781a.f())) {
                it.remove();
                break;
            }
        }
        c().f106793c.setValue(d2);
        c().f106794d.setValue(Integer.valueOf(d2.size() - 1));
        a().notifyDataSetChanged();
    }

    @r(a = ThreadMode.MAIN, b = true)
    public final void onVideoCreatedOrSaved(com.ss.android.ugc.aweme.ftc.c.c cVar) {
        l.d(cVar, "");
        if (cVar.f97536a == 1) {
            new com.bytedance.tux.g.b(this).a().e(R.string.cti).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
        } else if (cVar.f97536a == 2) {
            new com.bytedance.tux.g.b(this).a().e(R.string.ctb).b(R.raw.icon_tick_fill_small).d(R.attr.aw).b();
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f106774a;

        static {
            Covode.recordClassIndex(68252);
        }

        d(c cVar) {
            this.f106774a = cVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            MethodCollector.i(2003);
            if (((Integer) obj).intValue() > 0) {
                TuxTextView tuxTextView = (TuxTextView) this.f106774a.a(R.id.dbj);
                l.b(tuxTextView, "");
                tuxTextView.setVisibility(0);
                TuxTextView tuxTextView2 = (TuxTextView) this.f106774a.a(R.id.awb);
                l.b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
                TuxTextView tuxTextView3 = (TuxTextView) this.f106774a.a(R.id.aw0);
                l.b(tuxTextView3, "");
                tuxTextView3.setVisibility(8);
                ((LinearLayout) this.f106774a.a(R.id.cvy)).clearAnimation();
                LinearLayout linearLayout = (LinearLayout) this.f106774a.a(R.id.cvy);
                l.b(linearLayout, "");
                linearLayout.setVisibility(8);
                MethodCollector.o(2003);
                return;
            }
            TuxTextView tuxTextView4 = (TuxTextView) this.f106774a.a(R.id.dbj);
            l.b(tuxTextView4, "");
            tuxTextView4.setVisibility(4);
            TuxTextView tuxTextView5 = (TuxTextView) this.f106774a.a(R.id.awb);
            l.b(tuxTextView5, "");
            tuxTextView5.setVisibility(0);
            TuxTextView tuxTextView6 = (TuxTextView) this.f106774a.a(R.id.aw0);
            l.b(tuxTextView6, "");
            tuxTextView6.setVisibility(0);
            LinearLayout linearLayout2 = (LinearLayout) this.f106774a.a(R.id.cvy);
            linearLayout2.setVisibility(0);
            c cVar = this.f106774a;
            l.b(linearLayout2, "");
            linearLayout2.setLayerType(2, null);
            Animation loadAnimation = AnimationUtils.loadAnimation(cVar.getContext(), R.anim.ca);
            l.b(loadAnimation, "");
            loadAnimation.setRepeatMode(2);
            loadAnimation.setRepeatCount(-1);
            loadAnimation.setAnimationListener(new k(linearLayout2));
            linearLayout2.startAnimation(loadAnimation);
            if (!this.f106774a.isHidden()) {
                com.ss.android.ugc.aweme.kids.common.c.f.a("shoot_bubble_show", new com.ss.android.ugc.aweme.app.f.c().a("enter_from", "personal_homepage").a());
            }
            MethodCollector.o(2003);
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        ((FrameLayout) a(R.id.cnl)).setOnClickListener(new f(this));
        RecyclerView recyclerView = (RecyclerView) a(R.id.dri);
        recyclerView.setAdapter(a());
        recyclerView.setLayoutManager((GridLayoutManager) this.f106768e.getValue());
        Resources system = Resources.getSystem();
        l.b(system, "");
        recyclerView.a(new com.ss.android.ugc.aweme.kids.profile.b.a((int) (system.getDisplayMetrics().density * 2.0f)));
        LiveData a2 = aa.a(c().f106792b, KidsProfileViewModel.b.f106796a);
        l.b(a2, "");
        a2.observe(getViewLifecycleOwner(), new C2737c(this));
        c().f106794d.observe(getViewLifecycleOwner(), new d(this));
        c().f106793c.observe(getViewLifecycleOwner(), new e(this));
        if (this.f106764d == null && getView() != null) {
            this.f106764d = c.a.a(this, getView());
        }
        com.bytedance.widget.c cVar = this.f106764d;
        if (cVar != null) {
            cVar.a(new MyProfileReportWidget((ViewGroup) view));
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        this.f106764d = null;
        return com.a.a(layoutInflater, R.layout.adt, viewGroup, false);
    }
}
