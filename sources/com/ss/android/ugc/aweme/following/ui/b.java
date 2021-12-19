package com.ss.android.ugc.aweme.following.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.u;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.ai;
import com.bytedance.keva.Keva;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ae;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.k.k;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

public final class b extends com.ss.android.ugc.aweme.base.arch.b implements View.OnClickListener, ViewPager.e, ScrollableLayout.b {
    public static final C2324b n = new C2324b((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public boolean f96458b;

    /* renamed from: c  reason: collision with root package name */
    public String f96459c;

    /* renamed from: d  reason: collision with root package name */
    public User f96460d;

    /* renamed from: e  reason: collision with root package name */
    public int f96461e;

    /* renamed from: j  reason: collision with root package name */
    public int f96462j;

    /* renamed from: k  reason: collision with root package name */
    public int f96463k;

    /* renamed from: l  reason: collision with root package name */
    public final List<String> f96464l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public List<String> f96465m = new ArrayList();
    private com.ss.android.ugc.aweme.following.ui.adapter.c o;
    private String p;
    private boolean q = true;
    private final List<Fragment> r = new ArrayList();
    private final h.h s;
    private SparseArray t;

    static {
        Covode.recordClassIndex(61088);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final View a(int i2) {
        if (this.t == null) {
            this.t = new SparseArray();
        }
        View view = (View) this.t.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.t.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.base.arch.b
    public final void a() {
        SparseArray sparseArray = this.t;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final void a(float f2, float f3) {
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final boolean an_() {
        return false;
    }

    public final FollowRelationTabViewModel b() {
        return (FollowRelationTabViewModel) this.s.getValue();
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b
    public final void b(int i2, int i3) {
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.base.arch.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        a();
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrollStateChanged(int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.e
    public final void onPageScrolled(int i2, float f2, int i3) {
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.b$b  reason: collision with other inner class name */
    public static final class C2324b {
        static {
            Covode.recordClassIndex(61090);
        }

        private C2324b() {
        }

        public /* synthetic */ C2324b(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        User user = this.f96460d;
        if (user != null) {
            this.f96462j = user.getFollowingCount();
            this.f96463k = a(user);
        }
        c();
    }

    public static final class a extends m implements h.f.a.a<FollowRelationTabViewModel> {
        final /* synthetic */ Fragment $this_activityViewModel;
        final /* synthetic */ h.k.c $viewModelClass;
        final /* synthetic */ h.k.c $viewModelClass$inlined;

        static {
            Covode.recordClassIndex(61089);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment, h.k.c cVar, h.k.c cVar2) {
            super(0);
            this.$this_activityViewModel = fragment;
            this.$viewModelClass = cVar;
            this.$viewModelClass$inlined = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.$this_activityViewModel
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.e.f39405a
                androidx.lifecycle.ad r2 = androidx.lifecycle.ae.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass$inlined
                java.lang.Class r0 = h.f.a.a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                h.f.b.l.a(r1, r0)
                h.k.c r0 = r3.$viewModelClass
                java.lang.Class r0 = h.f.a.a(r0)
                androidx.lifecycle.ac r0 = com_ss_android_ugc_aweme_following_ui_FollowRelationTabFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.b.a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        public static ac com_ss_android_ugc_aweme_following_ui_FollowRelationTabFragment$$special$$inlined$activityViewModel$1_androidx_lifecycle_VScopeLancet_get(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    public b() {
        h.k.c a2 = h.f.b.ab.a(FollowRelationTabViewModel.class);
        this.s = i.a((h.f.a.a) new a(this, a2, a2));
    }

    private final void e() {
        if (!this.f96458b || com.ss.android.ugc.aweme.friends.service.a.f97047a.p()) {
            TuxIconView tuxIconView = (TuxIconView) a(R.id.hc);
            l.b(tuxIconView, "");
            tuxIconView.setVisibility(8);
            return;
        }
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.hc);
        l.b(tuxIconView2, "");
        tuxIconView2.setVisibility(0);
    }

    public final void c() {
        int i2;
        View view;
        View view2;
        DmtTabLayout dmtTabLayout = (DmtTabLayout) a(R.id.ehe);
        com.ss.android.ugc.aweme.following.ui.adapter.c cVar = this.o;
        if (cVar == null) {
            l.a("mAdapter");
        }
        Iterator<Fragment> it = cVar.f96439b.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (it.next() instanceof p) {
                break;
            } else {
                i4++;
            }
        }
        DmtTabLayout.f b2 = dmtTabLayout.b(i4);
        TextView textView = null;
        if (b2 != null) {
            view = b2.f33753f;
        } else {
            view = null;
        }
        if (!(view instanceof TextView)) {
            view = null;
        }
        TextView textView2 = (TextView) view;
        if (textView2 != null) {
            textView2.setText(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c0a) + " " + com.ss.android.ugc.aweme.i18n.b.a((long) this.f96462j));
        }
        DmtTabLayout dmtTabLayout2 = (DmtTabLayout) a(R.id.ehe);
        com.ss.android.ugc.aweme.following.ui.adapter.c cVar2 = this.o;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        Iterator<Fragment> it2 = cVar2.f96439b.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            } else if (it2.next() instanceof g) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        DmtTabLayout.f b3 = dmtTabLayout2.b(i2);
        if (b3 != null) {
            view2 = b3.f33753f;
        } else {
            view2 = null;
        }
        if (view2 instanceof TextView) {
            textView = view2;
        }
        TextView textView3 = textView;
        if (textView3 != null) {
            textView3.setText(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c07) + " " + com.ss.android.ugc.aweme.i18n.b.a((long) this.f96463k));
        }
    }

    static final class c implements DmtTabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f96466a = new c();

        static {
            Covode.recordClassIndex(61091);
        }

        c() {
        }

        @Override // com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout.b
        public final void a(DmtTabLayout.f fVar) {
            if (fVar != null) {
                fVar.f33748a = "from_click";
            }
            fVar.a();
        }
    }

    public static int a(User user) {
        if (ae.a(user)) {
            return user.getFansCount();
        }
        return user.getFollowerCount();
    }

    private static String b(int i2) {
        return "android:switcher:2131370423:" + i2;
    }

    static final class h extends m implements h.f.a.b<FollowRelationState, z> {
        final /* synthetic */ View $v$inlined;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61097);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(b bVar, View view) {
            super(1);
            this.this$0 = bVar;
            this.$v$inlined = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(FollowRelationState followRelationState) {
            l.d(followRelationState, "");
            if (this.this$0.getActivity() instanceof FollowRelationTabActivity) {
                com.ss.android.ugc.aweme.common.f.e.a(this.this$0.getActivity(), this.this$0.a(R.id.qb));
                androidx.fragment.app.e activity = this.this$0.getActivity();
                if (activity == null) {
                    l.b();
                }
                activity.finish();
            } else {
                this.this$0.onDestroy();
            }
            return z.f158842a;
        }
    }

    static final class g<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f96467a;

        static {
            Covode.recordClassIndex(61096);
        }

        g(b bVar) {
            this.f96467a = bVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            String str = this.f96467a.f96459c;
            l.b(curUser, "");
            if (l.a((Object) str, (Object) curUser.getUid())) {
                this.f96467a.f96462j = curUser.getFollowingCount();
                User user = this.f96467a.f96460d;
                if (user != null) {
                    user.setFollowingCount(this.f96467a.f96462j);
                }
                com.ss.android.ugc.aweme.framework.a.a.a(4, "FollowRelationTabFragment", in.l(curUser));
                this.f96467a.c();
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (view != null) {
            int id = view.getId();
            if (id == R.id.qb) {
                withState(b(), new h(this, view));
            } else if (id == R.id.hc) {
                ViewPager viewPager = (ViewPager) a(R.id.fk_);
                l.b(viewPager, "");
                if (viewPager.getCurrentItem() == 0) {
                    str = "following";
                } else {
                    str = "fans";
                }
                SmartRouter.buildRoute(getActivity(), "//friends/find").withParam("previous_page", str).open();
                r.a("click_add_friends", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).f66730a);
            }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d7, code lost:
        if (r3.equals(r1) != false) goto L_0x004a;
     */
    @Override // androidx.viewpager.widget.ViewPager.e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onPageSelected(int r7) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.following.ui.b.onPageSelected(int):void");
    }

    static final class f extends m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61094);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            l.d(iVar2, "");
            l.d(str, "");
            iVar2.withState(this.this$0.b(), new h.f.a.b<FollowRelationState, z>(this) {
                /* class com.ss.android.ugc.aweme.following.ui.b.f.AnonymousClass1 */
                final /* synthetic */ f this$0;

                static {
                    Covode.recordClassIndex(61095);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ z invoke(FollowRelationState followRelationState) {
                    FollowRelationState followRelationState2 = followRelationState;
                    l.d(followRelationState2, "");
                    int indexOf = this.this$0.this$0.f96465m.indexOf(followRelationState2.getTabIndex());
                    if (indexOf > 0) {
                        ViewPager viewPager = (ViewPager) this.this$0.this$0.a(R.id.fk_);
                        l.b(viewPager, "");
                        viewPager.setCurrentItem(indexOf);
                    }
                    return z.f158842a;
                }
            });
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61093);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            num.intValue();
            l.d(iVar, "");
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            l.b(g2, "");
            User curUser = g2.getCurUser();
            String str = this.this$0.f96459c;
            l.b(curUser, "");
            if (l.a((Object) str, (Object) curUser.getUid())) {
                b bVar = this.this$0;
                IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g3, "");
                User curUser2 = g3.getCurUser();
                l.b(curUser2, "");
                bVar.f96463k = b.a(curUser2);
                User user = this.this$0.f96460d;
                if (user != null) {
                    user.setFollowerCount(this.this$0.f96463k);
                }
                com.ss.android.ugc.aweme.framework.a.a.a(4, "FollowRelationTabFragment", in.l(curUser));
                this.this$0.c();
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Integer, z> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(61092);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(2);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Integer num) {
            User user;
            View view;
            int intValue = num.intValue();
            l.d(iVar, "");
            if (intValue > 0 && !this.this$0.f96458b && (user = this.this$0.f96460d) != null && !TextUtils.isEmpty(user.getRecommendReasonRelation()) && Pattern.compile("<b>").matcher(user.getRecommendReasonRelation()).find()) {
                this.this$0.f96461e = intValue;
                this.this$0.f96464l.set(0, com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.ast) + " " + com.ss.android.ugc.aweme.i18n.b.a((long) intValue));
                DmtTabLayout.f b2 = ((DmtTabLayout) this.this$0.a(R.id.ehe)).b(0);
                if (b2 != null) {
                    view = b2.f33753f;
                } else {
                    view = null;
                }
                if (view instanceof TextView) {
                    ((TextView) view).setText(this.this$0.f96464l.get(0));
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean g2;
        String str;
        Resources resources;
        int i2;
        boolean z;
        String str2;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f96459c = arguments.getString("uid");
            this.p = arguments.getString("follow_relation_type");
        }
        String str3 = this.f96459c;
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        this.f96458b = TextUtils.equals(str3, g3.getCurUserId());
        User user = com.ss.android.ugc.aweme.feed.x.h.f95333c;
        this.f96460d = user;
        if (user != null) {
            this.f96462j = user.getFollowingCount();
            this.f96463k = a(user);
        }
        User user2 = this.f96460d;
        if (user2 != null) {
            if (!TextUtils.isEmpty(in.b(user2))) {
                TuxTextView tuxTextView = (TuxTextView) a(R.id.title_tv);
                l.b(tuxTextView, "");
                tuxTextView.setText(in.b(user2));
            } else {
                TuxTextView tuxTextView2 = (TuxTextView) a(R.id.title_tv);
                l.b(tuxTextView2, "");
                tuxTextView2.setText(user2.getNickname());
            }
        }
        this.r.clear();
        Fragment a2 = getChildFragmentManager().a(b(this.r.size()));
        if (a2 == null) {
            a2 = new p();
        }
        a2.setArguments(getArguments());
        this.r.add(a2);
        this.f96464l.add(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c0a) + " " + com.ss.android.ugc.aweme.i18n.b.a((long) this.f96462j));
        this.f96465m.add("following_relation");
        Fragment a3 = getChildFragmentManager().a(b(this.r.size()));
        if (a3 == null) {
            a3 = new g();
        }
        a3.setArguments(getArguments());
        this.r.add(a3);
        this.f96464l.add(com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.c07) + " " + com.ss.android.ugc.aweme.i18n.b.a((long) this.f96463k));
        this.f96465m.add("follower_relation");
        if (!com.ss.android.ugc.aweme.recommend.users.b.f120122a.b()) {
            if (this.f96458b) {
                g2 = com.ss.android.ugc.aweme.recommend.users.b.f120122a.e();
            } else {
                g2 = com.ss.android.ugc.aweme.recommend.users.b.f120122a.g();
            }
            if (g2) {
                Fragment a4 = getChildFragmentManager().a(b(this.r.size()));
                if (a4 == null) {
                    a4 = new z();
                }
                a4.setArguments(getArguments());
                this.r.add(a4);
                List<String> list = this.f96464l;
                androidx.fragment.app.e activity = getActivity();
                if (activity == null || (resources = activity.getResources()) == null || (str = resources.getString(R.string.gai)) == null) {
                    str = "";
                }
                l.b(str, "");
                list.add(str);
                this.f96465m.add("suggest_user");
            }
        }
        androidx.fragment.app.i childFragmentManager = getChildFragmentManager();
        l.b(childFragmentManager, "");
        this.o = new com.ss.android.ugc.aweme.following.ui.adapter.c(childFragmentManager, this.r, this.f96464l);
        ViewPager viewPager = (ViewPager) a(R.id.fk_);
        l.b(viewPager, "");
        com.ss.android.ugc.aweme.following.ui.adapter.c cVar = this.o;
        if (cVar == null) {
            l.a("mAdapter");
        }
        viewPager.setAdapter(cVar);
        ((ViewPager) a(R.id.fk_)).addOnPageChangeListener(this);
        ViewPager viewPager2 = (ViewPager) a(R.id.fk_);
        l.b(viewPager2, "");
        viewPager2.setOffscreenPageLimit(3);
        if (n.a((Iterable) this.f96465m, (Object) this.p)) {
            i2 = n.a((List) this.f96465m, (Object) this.p);
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        this.q = z;
        ViewPager viewPager3 = (ViewPager) a(R.id.fk_);
        l.b(viewPager3, "");
        viewPager3.setCurrentItem(i2);
        com.ss.android.ugc.aweme.following.ui.adapter.c cVar2 = this.o;
        if (cVar2 == null) {
            l.a("mAdapter");
        }
        cVar2.c(i2);
        e();
        b().b(TextUtils.equals(this.f96465m.get(i2), "following_relation"));
        DmtTabLayout dmtTabLayout = (DmtTabLayout) a(R.id.ehe);
        l.b(dmtTabLayout, "");
        ((DmtTabLayout) a(R.id.ehe)).setBackgroundColor(androidx.core.content.b.c(dmtTabLayout.getContext(), R.color.nd));
        ((DmtTabLayout) a(R.id.ehe)).setCustomTabViewResId(R.layout.aop);
        ((DmtTabLayout) a(R.id.ehe)).setAutoFillWhenScrollable(true);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        int a5 = h.g.a.a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        ((DmtTabLayout) a(R.id.ehe)).a(a5, h.g.a.a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        ((DmtTabLayout) a(R.id.ehe)).setupWithViewPager((ViewPager) a(R.id.fk_));
        ((DmtTabLayout) a(R.id.ehe)).setOnTabClickListener(c.f96466a);
        ((TuxIconView) a(R.id.qb)).setOnClickListener(this);
        ((TuxIconView) a(R.id.hc)).setOnClickListener(this);
        if (l.a((Object) this.f96465m.get(i2), (Object) "following_relation")) {
            str2 = "following_list";
        } else {
            str2 = "follower_list";
        }
        com.ss.android.ugc.aweme.friends.service.a.f97047a.a(3, str2, "auto", com.bytedance.jedi.ext.adapter.b.b(this));
        StringBuilder sb = new StringBuilder("permission_dialog");
        IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g4, "");
        Keva.getRepo(sb.append(g4.getCurUserId()).toString()).storeBoolean("is_my_self", this.f96458b);
        f.a.b.b unused = selectSubscribe(b(), c.f96468a, new ah(), new d(this));
        FollowRelationTabViewModel b2 = b();
        k kVar = d.f96496a;
        ah ahVar = new ah();
        ahVar.f39381e = false;
        ahVar.f39380d = true;
        selectSubscribe(b2, kVar, ahVar, new e(this));
        selectSubscribe(b(), e.f96497a, ai.b(), new f(this));
        UserService.d().b().observe(this, new g(this));
    }

    @Override // com.ss.android.ugc.b.a.a.a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return com.a.a(layoutInflater, R.layout.anz, viewGroup, false);
    }
}
