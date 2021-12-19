package com.ss.android.ugc.aweme.recommend;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList;
import com.ss.android.ugc.aweme.friends.model.RecommendUserHint;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.ab;
import com.ss.android.ugc.aweme.profile.presenter.u;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.recommend.r;
import com.ss.android.ugc.aweme.utils.fo;
import com.ss.android.ugc.aweme.video.v;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.playerkit.videoview.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class k extends com.ss.android.ugc.aweme.common.f.b implements View.OnClickListener, com.ss.android.ugc.aweme.base.a.k<User>, u {

    /* renamed from: d  reason: collision with root package name */
    public static final a f120078d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    ab f120079a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f120080b;

    /* renamed from: c  reason: collision with root package name */
    public final i f120081c = new i();

    /* renamed from: e  reason: collision with root package name */
    private final h f120082e = i.a(m.NONE, new d(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f120083f = i.a(m.NONE, new e(this));

    /* renamed from: g  reason: collision with root package name */
    private final h f120084g = i.a(m.NONE, new f(this));

    /* renamed from: h  reason: collision with root package name */
    private boolean f120085h;

    /* renamed from: i  reason: collision with root package name */
    private RecommendUsersDialogViewModel f120086i;

    /* renamed from: j  reason: collision with root package name */
    private SparseArray f120087j;

    static {
        Covode.recordClassIndex(78049);
    }

    private View a(int i2) {
        if (this.f120087j == null) {
            this.f120087j = new SparseArray();
        }
        View view = (View) this.f120087j.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f120087j.put(i2, findViewById);
        return findViewById;
    }

    public final j a() {
        return (j) this.f120082e.getValue();
    }

    public final String b() {
        return (String) this.f120083f.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78050);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(androidx.fragment.app.i iVar, RecommendUserDialogList recommendUserDialogList, String str, String str2) {
            l.d(iVar, "");
            l.d(recommendUserDialogList, "");
            Fragment a2 = iVar.a("RecommendUserDialogFragment");
            if (!(a2 instanceof k)) {
                a2 = null;
            }
            k kVar = (k) a2;
            if (kVar == null) {
                if (str == null) {
                    str = "";
                }
                if (str2 == null) {
                    str2 = "";
                }
                kVar = new k();
                Bundle bundle = new Bundle();
                bundle.putSerializable("data", recommendUserDialogList);
                bundle.putSerializable("enter_from", str);
                bundle.putSerializable("previous_page", str2);
                kVar.setArguments(bundle);
            }
            if (!kVar.isAdded()) {
                iVar.a().a(kVar, "RecommendUserDialogFragment").c();
            }
        }
    }

    private static boolean c() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f120087j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        i iVar = this.f120081c;
        if (!iVar.f120069c) {
            iVar.f120070d = System.currentTimeMillis();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<j> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(78054);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        static final class a implements h.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f120094a;

            static {
                Covode.recordClassIndex(78055);
            }

            a(d dVar) {
                this.f120094a = dVar;
            }

            @Override // com.ss.android.ugc.aweme.common.a.h.a
            public final void l() {
                k kVar = this.f120094a.this$0;
                kVar.a().ag_();
                ab abVar = kVar.f120079a;
                if (abVar != null) {
                    abVar.d();
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            k kVar = this.this$0;
            j jVar = new j(kVar, kVar.b());
            jVar.a((h.a) new a(this));
            return jVar;
        }
    }

    static final class e extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(78056);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("enter_from");
            }
            return null;
        }
    }

    static final class f extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ k this$0;

        static {
            Covode.recordClassIndex(78057);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(k kVar) {
            super(0);
            this.this$0 = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                return arguments.getString("previous_page");
            }
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        i iVar = this.f120081c;
        if (iVar.f120069c) {
            iVar.f120069c = false;
            iVar.f120067a += System.currentTimeMillis() - iVar.f120070d;
        }
    }

    @Override // androidx.fragment.app.d
    public void dismiss() {
        String str;
        t<Boolean> tVar;
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
        if (this.f120080b) {
            v.O().y();
            this.f120080b = false;
        }
        Keva keva = r.a.a().f120110a;
        Calendar instance = Calendar.getInstance();
        l.b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        keva.storeLong("dialog_last_shown_timestamp", instance.getTimeInMillis());
        i iVar = this.f120081c;
        if (iVar.f120069c) {
            iVar.f120069c = false;
            iVar.f120067a += System.currentTimeMillis() - iVar.f120070d;
            if (iVar.f120068b || iVar.f120067a > 4000) {
                r.a.a().f120110a.storeInt("dialog_close_without_action_in_times", 0);
            } else {
                r a2 = r.a.a();
                int i2 = a2.f120110a.getInt("dialog_close_without_action_in_times", 0) + 1;
                a2.f120110a.storeInt("dialog_close_without_action_in_times", i2);
                if (i2 >= 2) {
                    Keva keva2 = a2.f120110a;
                    Calendar instance2 = Calendar.getInstance();
                    l.b(instance2, "");
                    instance2.setTimeInMillis(System.currentTimeMillis());
                    instance2.set(11, 0);
                    instance2.set(12, 0);
                    instance2.set(13, 0);
                    instance2.add(6, 30);
                    keva2.storeLong("dialog_close_without_action_in_times_maximum_timestamp", instance2.getTimeInMillis());
                }
            }
        }
        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", b());
        if (this.f120085h) {
            str = "button";
        } else {
            str = "blank";
        }
        com.ss.android.ugc.aweme.common.r.a("close_suggested_accounts_pop_up", a3.a("click_method", str).f66730a);
        if (TextUtils.equals(b(), "personal_collection") || TextUtils.equals(b(), "personal_homepage")) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.b.c());
        }
        RecommendUsersDialogViewModel recommendUsersDialogViewModel = this.f120086i;
        if (recommendUsersDialogViewModel != null && (tVar = recommendUsersDialogViewModel.f120058b) != null) {
            tVar.postValue(false);
        }
    }

    public static final class b implements fo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f120088a;

        static {
            Covode.recordClassIndex(78051);
        }

        b(k kVar) {
            this.f120088a = kVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.fo.a
        public final void a(int i2, final fo foVar) {
            final int i3;
            l.d(foVar, "");
            if (this.f120088a.a().f120073b) {
                i3 = i2 - 1;
            } else {
                i3 = i2;
            }
            final User user = (User) this.f120088a.a().e().get(i2);
            if (user != null && !(user instanceof RecommendUserHint)) {
                String uid = user.getUid();
                l.b(uid, "");
                foVar.a(uid, new Runnable() {
                    /* class com.ss.android.ugc.aweme.recommend.k.b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(78052);
                    }

                    public final void run() {
                        this.f120088a.a("show_recommend_user_cell", user, i3);
                        com.ss.android.ugc.aweme.metrics.u a2 = new com.ss.android.ugc.aweme.metrics.u().a(this.f120088a.b());
                        a2.f109596a = u.c.POP_UP;
                        a2.f109597b = u.a.SHOW;
                        a2.a(user).f();
                    }
                });
            }
        }
    }

    public static final class c extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f120093a;

        static {
            Covode.recordClassIndex(78053);
        }

        c(k kVar) {
            this.f120093a = kVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (!this.f120093a.f120081c.f120068b && i2 == 1) {
                this.f120093a.f120081c.f120068b = true;
            }
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.wj);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            this.f120086i = (RecommendUsersDialogViewModel) ae.a(activity, (ad.b) null).a(RecommendUsersDialogViewModel.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void b(RecommendList recommendList) {
        if (this.ae && recommendList != null && (recommendList instanceof RecommendUserDialogList)) {
            List<User> recommendUsers = ((RecommendUserDialogList) recommendList).getRecommendUsers();
            ab abVar = this.f120079a;
            if (!(abVar == null || abVar.f() == 0)) {
                a().b(recommendUsers);
                if (recommendList.hasMore()) {
                    a().ai_();
                    return;
                }
            }
            a().ah_();
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        l.b(onCreateDialog, "");
        onCreateDialog.setCancelable(true);
        onCreateDialog.setCanceledOnTouchOutside(true);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.addFlags(67108864);
            window.setAttributes(attributes);
        }
        onCreateDialog.setOnShowListener(new g(this));
        return onCreateDialog;
    }

    static final class g implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f120095a;

        static {
            Covode.recordClassIndex(78058);
        }

        g(k kVar) {
            this.f120095a = kVar;
        }

        public final void onShow(DialogInterface dialogInterface) {
            VideoViewComponent videoViewComponent;
            VideoViewComponent videoViewComponent2;
            k kVar = this.f120095a;
            if (n.a()) {
                com.ss.android.ugc.aweme.video.i O = v.O();
                l.b(O, "");
                if (O.o()) {
                    v.O().B();
                } else {
                    com.ss.android.ugc.playerkit.videoview.a aVar = a.C4019a.f148902a;
                    l.b(aVar, "");
                    if (!(aVar.f148900a == null || (videoViewComponent = aVar.f148900a.get()) == null || !videoViewComponent.g())) {
                        com.ss.android.ugc.playerkit.videoview.a aVar2 = a.C4019a.f148902a;
                        if (!(aVar2.f148900a == null || (videoViewComponent2 = aVar2.f148900a.get()) == null)) {
                            videoViewComponent2.b();
                        }
                    }
                }
                kVar.f120080b = true;
            }
            com.ss.android.ugc.aweme.common.r.a("show_suggested_accounts_pop_up", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", this.f120095a.b()).f66730a);
            i iVar = this.f120095a.f120081c;
            if (!iVar.f120069c) {
                iVar.f120069c = true;
                iVar.f120067a = 0;
                iVar.f120070d = System.currentTimeMillis();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(RecommendList recommendList) {
        if (this.ae && recommendList != null && (recommendList instanceof RecommendUserDialogList)) {
            RecommendUserDialogList recommendUserDialogList = (RecommendUserDialogList) recommendList;
            List<User> recommendUsers = recommendUserDialogList.getRecommendUsers();
            if (recommendUsers == null || recommendUsers.isEmpty()) {
                a().f();
                a().d(false);
                return;
            }
            a().d(false);
            a().b_(recommendUserDialogList.getRecommendUsers());
            if (recommendList.hasMore()) {
                a().ai_();
            } else {
                a().ah_();
            }
        }
    }

    public void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.bo8) {
                if (this.ae) {
                    this.f120081c.f120068b = true;
                    j a2 = a();
                    RecyclerView recyclerView = (RecyclerView) a(R.id.djj);
                    l.b(recyclerView, "");
                    RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                    if (a2.f76354l != null) {
                        List list = a2.f76354l;
                        l.b(list, "");
                        Iterator it = list.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!(it.next() instanceof RecommendUserHint)) {
                                i2++;
                            } else if (i2 >= 0) {
                                if (i2 == 0) {
                                    if (i2 < a2.f76354l.size()) {
                                        a2.f76354l.remove(i2);
                                        a2.notifyItemRemoved(i2);
                                    }
                                    a2.f120073b = false;
                                    return;
                                }
                                return;
                            }
                        }
                        RecommendUserHint recommendUserHint = a2.f120072a;
                        if (a2.f76354l != null) {
                            a2.f76354l.add(0, recommendUserHint);
                            a2.notifyItemInserted(0);
                        }
                        a2.f120073b = true;
                        if (layoutManager != null) {
                            layoutManager.e(0);
                        }
                    }
                }
            } else if (valueOf.intValue() == R.id.a7h) {
                this.f120085h = true;
                dismiss();
            } else if (valueOf.intValue() == R.id.c5e) {
                dismiss();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.u
    public final void a(Exception exc) {
        if (this.ae) {
            List e2 = a().e();
            if (e2 == null || e2.isEmpty()) {
                a().d(false);
                return;
            }
            a().d(false);
            a().j();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        t<Boolean> tVar;
        l.d(view, "");
        super.onViewCreated(view, bundle);
        RecommendUsersDialogViewModel recommendUsersDialogViewModel = this.f120086i;
        if (!(recommendUsersDialogViewModel == null || (tVar = recommendUsersDialogViewModel.f120058b) == null)) {
            tVar.postValue(true);
        }
        int a2 = (int) (((float) n.a(getContext())) * 0.84f);
        View findViewById = view.findViewById(R.id.c5a);
        l.b(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.width = h.j.h.c(a2, h.g.a.a(TypedValue.applyDimension(1, 360.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams.height = h.j.h.c((int) (((float) n.b(getContext())) * 0.8f), h.g.a.a(TypedValue.applyDimension(1, 480.0f, system2.getDisplayMetrics())));
        findViewById.requestLayout();
        RecyclerView recyclerView = (RecyclerView) a(R.id.djj);
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
            recyclerView.setAdapter(a());
            recyclerView.a(new c(this));
        }
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djj);
        if (recyclerView2 != null) {
            new fo(recyclerView2, new b(this));
        }
        TuxIconView tuxIconView = (TuxIconView) a(R.id.bo8);
        if (tuxIconView != null) {
            tuxIconView.setOnClickListener(this);
        }
        TuxIconView tuxIconView2 = (TuxIconView) a(R.id.a7h);
        if (tuxIconView2 != null) {
            tuxIconView2.setOnClickListener(this);
        }
        FrameLayout frameLayout = (FrameLayout) a(R.id.c5e);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(this);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) a(R.id.c5a);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(this);
        }
        if (this.f120079a == null) {
            RecommendCommonUserModel recommendCommonUserModel = new RecommendCommonUserModel();
            Bundle arguments = getArguments();
            Serializable serializable = null;
            if (arguments != null) {
                serializable = arguments.getSerializable("data");
            }
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.model.RecommendUserDialogList");
            recommendCommonUserModel.setRecommendList((RecommendUserDialogList) serializable);
            ab abVar = new ab(recommendCommonUserModel, this);
            this.f120079a = abVar;
            a(abVar.a());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.xl, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.base.a.k
    public final void a(FollowStatus followStatus, String str, String str2) {
        l.d(followStatus, "");
        l.d(str, "");
        l.d(str2, "");
        if (followStatus.followStatus == 0) {
            com.ss.android.ugc.aweme.common.r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "suggest_account_pop_up").a("to_user_id", str).f66730a);
        } else {
            com.ss.android.ugc.aweme.common.r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "suggest_account_pop_up").a("to_user_id", str).f66730a);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.base.a.k
    public final /* synthetic */ void a(int i2, User user, int i3) {
        boolean z;
        String str;
        RecommendList a2;
        User user2 = user;
        if (user2 == null) {
            return;
        }
        if (i2 == 100) {
            this.f120081c.f120068b = true;
            if (this.ae) {
                getContext();
                if (!j.f107229h || !j.b() || j.c()) {
                    j.f107229h = c();
                }
                if (!j.f107229h) {
                    new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(R.string.de8).a();
                    return;
                }
                if (user2.getFollowStatus() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                a().a(user2, user2.getFollowStatus());
                if (z2) {
                    a("follow", user2, i3);
                    com.ss.android.ugc.aweme.metrics.u a3 = new com.ss.android.ugc.aweme.metrics.u().a(b());
                    a3.f109596a = u.c.POP_UP;
                    a3.f109597b = u.a.FOLLOW;
                    a3.a(user2).f();
                    return;
                }
                a("follow_cancel", user2, i3);
                com.ss.android.ugc.aweme.metrics.u a4 = new com.ss.android.ugc.aweme.metrics.u().a(b());
                a4.f109596a = u.c.POP_UP;
                a4.f109597b = u.a.FOLLOW_CANCEL;
                a4.a(user2).f();
            }
        } else if (i2 == 101) {
            this.f120081c.f120068b = true;
            SmartRoute withParam = SmartRouter.buildRoute(getActivity(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("enter_from", "suggest_account_pop_up").withParam("extra_previous_page_position", b()).withParam("recommend_from_type", "list").withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true);
            ab abVar = this.f120079a;
            String str2 = "";
            if (abVar == null || (a2 = abVar.a()) == null || (str = a2.getRid()) == null) {
                str = str2;
            }
            SmartRoute withParam2 = withParam.withParam("enter_from_request_id", str);
            String b2 = b();
            u.c cVar = u.c.POP_UP;
            String recType = user2.getRecType();
            u.b a5 = g.a.a(user2);
            String uid = user2.getUid();
            String requestId = user2.getRequestId();
            if (requestId != null) {
                str2 = requestId;
            }
            withParam2.withParam("recommend_enter_profile_params", new g(b2, null, cVar, recType, a5, uid, null, null, str2, null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
            com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "suggest_account_pop_up").a("previous_page", b()).a("to_user_id", user2.getUid()).a("rec_type", user2.getRecType()).a("impr_order", i3).f66730a);
            com.ss.android.ugc.aweme.metrics.u a6 = new com.ss.android.ugc.aweme.metrics.u().a(b());
            a6.f109596a = u.c.POP_UP;
            a6.f109597b = u.a.ENTER_PROFILE;
            a6.a(user2).f();
        }
    }

    public final void a(String str, User user, int i2) {
        com.ss.android.ugc.aweme.common.r.a(str, new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "suggest_account_pop_up").a("previous_page", b()).a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("impr_order", i2).a("relation_type", user.getFriendTypeStr()).f66730a);
    }
}
