package com.ss.android.ugc.aweme.relation.dialog;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ab;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.relation.dialog.a;
import com.ss.android.ugc.aweme.utils.fo;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.h;
import h.i;
import h.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends com.ss.android.ugc.aweme.common.f.b implements View.OnClickListener, k<User> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f120382a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final h f120383b = i.a(m.NONE, new c(this));

    /* renamed from: c  reason: collision with root package name */
    private final h f120384c = i.a(m.NONE, new d(this));

    /* renamed from: d  reason: collision with root package name */
    private final h f120385d = i.a(m.NONE, new e(this));

    /* renamed from: e  reason: collision with root package name */
    private boolean f120386e;

    /* renamed from: f  reason: collision with root package name */
    private SparseArray f120387f;

    static {
        Covode.recordClassIndex(78325);
    }

    private View a(int i2) {
        if (this.f120387f == null) {
            this.f120387f = new SparseArray();
        }
        View view = (View) this.f120387f.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f120387f.put(i2, findViewById);
        return findViewById;
    }

    public final a a() {
        return (a) this.f120383b.getValue();
    }

    public final String b() {
        return (String) this.f120384c.getValue();
    }

    public final int c() {
        return ((Number) this.f120385d.getValue()).intValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78326);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static b a(FriendList<Friend> friendList, String str, int i2) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("data", friendList);
            bundle.putSerializable("enter_from", str);
            bundle.putSerializable("social_rec_type", Integer.valueOf(i2));
            bVar.setArguments(bundle);
            return bVar;
        }

        public static void a(androidx.fragment.app.i iVar, FriendList<Friend> friendList, String str, int i2) {
            l.d(iVar, "");
            l.d(friendList, "");
            Fragment a2 = iVar.a("SocialRecFriendsDialogFragment");
            if (!(a2 instanceof b)) {
                a2 = null;
            }
            b bVar = (b) a2;
            if (bVar == null) {
                if (str == null) {
                    str = "";
                }
                bVar = a(friendList, str, i2);
            }
            if (!bVar.isAdded()) {
                iVar.a().a(bVar, "SocialRecFriendsDialogFragment").c();
            }
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<a> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78329);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ a invoke() {
            b bVar = this.this$0;
            a aVar = new a(bVar, bVar.b());
            aVar.d(false);
            return aVar;
        }
    }

    private static boolean e() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.d
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalStateException unused) {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a.C0732a.f33434a.a(b.a.SOCIAL_REC_FRIENDS);
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f120387f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    static final class d extends h.f.b.m implements h.f.a.a<String> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.this$0 = bVar;
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

    static final class e extends h.f.b.m implements h.f.a.a<Integer> {
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(78331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(b bVar) {
            super(0);
            this.this$0 = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            Serializable serializable;
            Bundle arguments = this.this$0.getArguments();
            if (arguments != null) {
                serializable = arguments.getSerializable("social_rec_type");
            } else {
                serializable = null;
            }
            Objects.requireNonNull(serializable, "null cannot be cast to non-null type kotlin.Int");
            return Integer.valueOf(((Integer) serializable).intValue());
        }
    }

    private final void d() {
        String str;
        Bundle arguments = getArguments();
        Serializable serializable = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("data");
        }
        FriendList friendList = (FriendList) serializable;
        if (this.ae && friendList != null) {
            if (friendList.getFriends().isEmpty()) {
                a().f();
            } else {
                a a2 = a();
                List<User> friends = friendList.getFriends();
                l.b(friends, "");
                ArrayList arrayList = new ArrayList(n.a((Iterable) friends, 10));
                for (User user : friends) {
                    l.b(user, "");
                    LogPbBean logPbBean = friendList.getLogPbBean();
                    if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
                        str = "";
                    }
                    user.setRequestId(str);
                    arrayList.add(user);
                }
                a2.b_(arrayList);
            }
            a().d(false);
            a().ah_();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.dialog.b$b  reason: collision with other inner class name */
    public static final class C3113b implements fo.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f120388a;

        static {
            Covode.recordClassIndex(78327);
        }

        C3113b(b bVar) {
            this.f120388a = bVar;
        }

        @Override // com.ss.android.ugc.aweme.utils.fo.a
        public final void a(int i2, final fo foVar) {
            l.d(foVar, "");
            final User user = (User) this.f120388a.a().e().get(i2);
            if (user != null && !(user instanceof a.b)) {
                String uid = user.getUid();
                l.b(uid, "");
                foVar.a(uid, new Runnable() {
                    /* class com.ss.android.ugc.aweme.relation.dialog.b.C3113b.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(78328);
                    }

                    public final void run() {
                        this.f120388a.a(user, u.a.SHOW, this.f120388a.c());
                    }
                });
            }
        }
    }

    @Override // androidx.fragment.app.d, com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.ya);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
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
        return onCreateDialog;
    }

    public final void onClick(View view) {
        Integer valueOf;
        ClickAgent.onClick(view);
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.bo8) {
                if (this.ae) {
                    a a2 = a();
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
                            } else if (!(it.next() instanceof a.b)) {
                                i2++;
                            } else if (i2 >= 0) {
                                if (i2 == 0 && i2 < a2.f76354l.size()) {
                                    a2.f76354l.remove(i2);
                                    a2.notifyItemRemoved(i2);
                                    return;
                                }
                                return;
                            }
                        }
                        a.b bVar = a2.f120378a;
                        if (a2.f76354l != null) {
                            a2.f76354l.add(0, bVar);
                            a2.notifyItemInserted(0);
                        }
                        if (layoutManager != null) {
                            layoutManager.e(0);
                        }
                    }
                }
            } else if (valueOf.intValue() == R.id.a7h) {
                this.f120386e = true;
                dismiss();
            } else if (valueOf.intValue() == R.id.c5e) {
                dismiss();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.f.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        l.d(view, "");
        super.onViewCreated(view, bundle);
        int a2 = (int) (((float) com.bytedance.common.utility.n.a(getContext())) * 0.84f);
        int b2 = (int) (((float) com.bytedance.common.utility.n.b(getContext())) * 0.8f);
        View findViewById = view.findViewById(R.id.c5a);
        l.b(findViewById, "");
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        layoutParams.width = h.j.h.c(a2, h.g.a.a(TypedValue.applyDimension(1, 360.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        l.a((Object) system2, "");
        layoutParams.height = h.j.h.c(b2, h.g.a.a(TypedValue.applyDimension(1, 480.0f, system2.getDisplayMetrics())));
        findViewById.requestLayout();
        RecyclerView recyclerView = (RecyclerView) a(R.id.djj);
        if (recyclerView != null) {
            recyclerView.getContext();
            recyclerView.setLayoutManager(new WrapLinearLayoutManager());
            recyclerView.setAdapter(a());
            RecyclerView.f itemAnimator = recyclerView.getItemAnimator();
            Objects.requireNonNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((ab) itemAnimator).f3953m = false;
        }
        RecyclerView recyclerView2 = (RecyclerView) a(R.id.djj);
        if (recyclerView2 != null) {
            new fo(recyclerView2, new C3113b(this));
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
        d();
        com.ss.android.ugc.aweme.relation.b.b.b(c(), com.ss.android.ugc.aweme.relation.c.b.RECOMMEND.getValue());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        return com.a.a(layoutInflater, R.layout.a27, viewGroup, false);
    }

    @Override // com.ss.android.ugc.aweme.base.a.k
    public final void a(FollowStatus followStatus, String str, String str2) {
        l.d(followStatus, "");
        l.d(str, "");
        l.d(str2, "");
        if (followStatus.followStatus == 0) {
            r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str2).a("to_user_id", str).f66730a);
        } else {
            r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str2).a("to_user_id", str).f66730a);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object, int] */
    @Override // com.ss.android.ugc.aweme.base.a.k
    public final /* synthetic */ void a(int i2, User user, int i3) {
        boolean z;
        String str;
        User user2 = user;
        if (user2 == null) {
            return;
        }
        if (i2 != 100) {
            if (i2 == 101) {
                SmartRouter.buildRoute(getActivity(), "aweme://user/profile/" + user2.getUid()).withParam("sec_user_id", user2.getSecUid()).withParam("from_recommend_card", 1).withParam("enter_from", "foru_boarding").withParam("extra_previous_page_position", b()).withParam("recommend_from_type", "list").withParam("extra_mutual_relation", user2.getMutualStruct()).withParam("extra_from_mutual", true).withParam("recommend_enter_profile_params", new g(b(), null, u.c.POP_UP, user2.getRecType(), g.a.a(user2), user2.getUid(), null, null, user2.getRequestId(), null, user2.getFriendTypeStr(), user2.getSocialInfo())).open();
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "foru_boarding").a("previous_page", b()).a("to_user_id", user2.getUid());
                if (c() == 2) {
                    str = "1-2";
                } else {
                    str = "1-1";
                }
                r.a("enter_personal_detail", a2.a("rec_type", str).a("impr_order", i3).f66730a);
                a(user2, u.a.ENTER_PROFILE, c());
            }
        } else if (this.ae) {
            getContext();
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = e();
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
                a("follow", user2, i3, c());
                a(user2, u.a.FOLLOW, c());
                return;
            }
            a("follow_cancel", user2, i3, c());
            a(user2, u.a.FOLLOW_CANCEL, c());
        }
    }

    public final void a(User user, u.a aVar, int i2) {
        u a2 = new u().a(b());
        a2.f109596a = u.c.POP_UP;
        a2.f109597b = aVar;
        u o = a2.o("on_boarding");
        if (i2 == 2) {
            user.setRecType("1-2");
        } else {
            user.setRecType("1-1");
        }
        o.a(user).f();
    }

    private final void a(String str, User user, int i2, int i3) {
        String str2;
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "foru_boarding").a("previous_page", b());
        if (i3 == 2) {
            str2 = "1-2";
        } else {
            str2 = "1-1";
        }
        r.a(str, a2.a("rec_type", str2).a("rec_uid", user.getUid()).a("impr_order", i2).a("relation_type", user.getFriendTypeStr()).f66730a);
    }
}
