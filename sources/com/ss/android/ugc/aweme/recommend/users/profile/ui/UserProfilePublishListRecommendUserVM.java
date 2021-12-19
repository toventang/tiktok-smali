package com.ss.android.ugc.aweme.recommend.users.profile.ui;

import android.app.Activity;
import android.content.Context;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.eu;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class UserProfilePublishListRecommendUserVM extends AssemListViewModel<f, com.bytedance.ies.powerlist.b.a, Integer> {
    public static final a o = new a((byte) 0);

    /* renamed from: k  reason: collision with root package name */
    public final f.a.b.a f120140k = new f.a.b.a();

    /* renamed from: l  reason: collision with root package name */
    public final Set<String> f120141l = new LinkedHashSet();

    /* renamed from: m  reason: collision with root package name */
    public User f120142m;
    public String n;
    private final String p = "[\"private_account\", \"no_content_account\"]";
    private boolean q;
    private int r;
    private int s;
    private final com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.recommend.users.profile.a.a> t;

    /* access modifiers changed from: package-private */
    public static final class b extends h.c.b.a.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ UserProfilePublishListRecommendUserVM this$0;

        static {
            Covode.recordClassIndex(78127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, h.c.d dVar) {
            super(dVar);
            this.this$0 = userProfilePublishListRecommendUserVM;
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.a(0, 0, (String) null, 0, this);
        }
    }

    static {
        Covode.recordClassIndex(78125);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78126);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new f();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ac
    public final void onCleared() {
        super.onCleared();
        this.f120140k.a();
    }

    static final class d extends m implements h.f.a.b<f, f> {
        final /* synthetic */ com.bytedance.ext_power_list.a $newListState;

        static {
            Covode.recordClassIndex(78130);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.bytedance.ext_power_list.a aVar) {
            super(1);
            this.$newListState = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ f invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            return f.a(fVar2, this.$newListState, 0, false, 6);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final void a(com.bytedance.ext_power_list.a<com.bytedance.ies.powerlist.b.a> aVar) {
        l.d(aVar, "");
        a((h.f.a.b) new d(aVar));
    }

    public final void c(int i2) {
        b((h.f.a.b) new i(this, i2));
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<f, z> {
        final /* synthetic */ UserProfilePublishListRecommendUserVM this$0;

        static {
            Covode.recordClassIndex(78128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM) {
            super(1);
            this.this$0 = userProfilePublishListRecommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            f fVar2 = fVar;
            l.d(fVar2, "");
            if (!fVar2.f120165b) {
                this.this$0.a((h.f.a.b) AnonymousClass1.f120143a);
            }
            return z.f158842a;
        }
    }

    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f120148a;

        static {
            Covode.recordClassIndex(78132);
        }

        public f(Context context) {
            this.f120148a = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Context context = this.f120148a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new com.bytedance.tux.g.b((Activity) context).e(R.string.c1q).b();
        }
    }

    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f120153a;

        static {
            Covode.recordClassIndex(78134);
        }

        public h(Context context) {
            this.f120153a = context;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Context context = this.f120153a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            new com.bytedance.tux.g.b((Activity) context).e(R.string.c1q).b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<f, z> {
        final /* synthetic */ int $position;
        final /* synthetic */ UserProfilePublishListRecommendUserVM this$0;

        static {
            Covode.recordClassIndex(78135);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, int i2) {
            super(1);
            this.this$0 = userProfilePublishListRecommendUserVM;
            this.$position = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(f fVar) {
            l.d(fVar, "");
            this.this$0.a((h.f.a.b) new h.f.a.b<f, f>(this) {
                /* class com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM.i.AnonymousClass1 */
                final /* synthetic */ i this$0;

                static {
                    Covode.recordClassIndex(78136);
                }

                {
                    this.this$0 = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // h.f.a.b
                public final /* synthetic */ f invoke(f fVar) {
                    f fVar2 = fVar;
                    l.d(fVar2, "");
                    return f.a(fVar2, null, this.this$0.$position, false, 5);
                }
            });
            return z.f158842a;
        }
    }

    public UserProfilePublishListRecommendUserVM(com.bytedance.assem.arch.a.a<com.ss.android.ugc.aweme.recommend.users.profile.a.a> aVar) {
        l.d(aVar, "");
        this.t = aVar;
    }

    private final void a(ArrayList<com.bytedance.ies.powerlist.b.a> arrayList) {
        if (!this.q) {
            arrayList.add(new com.ss.android.ugc.aweme.recommend.users.profile.powerlist.a());
            this.q = true;
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object a(h.c.d<? super com.bytedance.ies.powerlist.page.f<Integer>> dVar) {
        String str;
        this.f120141l.clear();
        User user = this.f120142m;
        if (user != null) {
            str = user.getSecUid();
        } else {
            str = null;
        }
        return a(20, 0, str, 1, dVar);
    }

    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserProfilePublishListRecommendUserVM f120144a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f120145b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f120146c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f120147d;

        static {
            Covode.recordClassIndex(78131);
        }

        public e(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, Context context, z.c cVar, int i2) {
            this.f120144a = userProfilePublishListRecommendUserVM;
            this.f120145b = context;
            this.f120146c = cVar;
            this.f120147d = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.base.api.a aVar = (com.ss.android.ugc.aweme.base.api.a) obj;
            l.d(aVar, "");
            Object checkValid = aVar.checkValid();
            l.b(checkValid, "");
            List friends = ((FriendList) checkValid).getFriends();
            if (friends.size() == 0) {
                Context context = this.f120145b;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context).e(R.string.dh7).b();
                return;
            }
            l.b(friends, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) friends, 10));
            for (T t : friends) {
                Set<String> set = this.f120144a.f120141l;
                l.b(t, "");
                if (!set.contains(t.getUid())) {
                    UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM = this.f120144a;
                    z.c cVar = this.f120146c;
                    int i2 = cVar.element;
                    cVar.element = i2 + 1;
                    userProfilePublishListRecommendUserVM.a(i2, new com.ss.android.ugc.aweme.recommend.users.profile.powerlist.b(t));
                    Set<String> set2 = this.f120144a.f120141l;
                    String uid = t.getUid();
                    l.b(uid, "");
                    set2.add(uid);
                }
                arrayList.add(h.z.f158842a);
            }
            this.f120144a.c(this.f120147d);
            if (this.f120146c.element == this.f120147d) {
                Context context2 = this.f120145b;
                Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context2).e(R.string.gj4).b();
            }
        }
    }

    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UserProfilePublishListRecommendUserVM f120149a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f120150b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.c f120151c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f120152d;

        static {
            Covode.recordClassIndex(78133);
        }

        public g(UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM, Context context, z.c cVar, int i2) {
            this.f120149a = userProfilePublishListRecommendUserVM;
            this.f120150b = context;
            this.f120151c = cVar;
            this.f120152d = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Object checkValid = ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            l.b(checkValid, "");
            List<User> list = ((UploadContactsResult) checkValid).users;
            if (list.size() == 0) {
                Context context = this.f120150b;
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context).e(R.string.dha).b();
                return;
            }
            l.b(list, "");
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            for (T t : list) {
                Set<String> set = this.f120149a.f120141l;
                l.b(t, "");
                if (!set.contains(t.getUid())) {
                    UserProfilePublishListRecommendUserVM userProfilePublishListRecommendUserVM = this.f120149a;
                    z.c cVar = this.f120151c;
                    int i2 = cVar.element;
                    cVar.element = i2 + 1;
                    userProfilePublishListRecommendUserVM.a(i2, new com.ss.android.ugc.aweme.recommend.users.profile.powerlist.b(t));
                    Set<String> set2 = this.f120149a.f120141l;
                    String uid = t.getUid();
                    l.b(uid, "");
                    set2.add(uid);
                }
                arrayList.add(h.z.f158842a);
            }
            this.f120149a.c(this.f120152d);
            if (this.f120151c.element == this.f120152d) {
                Context context2 = this.f120150b;
                Objects.requireNonNull(context2, "null cannot be cast to non-null type android.app.Activity");
                new com.bytedance.tux.g.b((Activity) context2).e(R.string.gj4).b();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, h.c.d] */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* synthetic */ Object a(Integer num, h.c.d<? super com.bytedance.ies.powerlist.page.f<Integer>> dVar) {
        String str;
        int intValue = num.intValue();
        User user = this.f120142m;
        if (user != null) {
            str = user.getSecUid();
        } else {
            str = null;
        }
        return a(20, intValue, str, 1, dVar);
    }

    private final void b(u.a aVar, User user) {
        String str;
        String str2;
        String str3;
        int i2;
        int i3 = g.f120167a[aVar.ordinal()];
        int i4 = 1;
        if (i3 == 1) {
            str = "follow";
        } else if (i3 == 2) {
            str = "follow_cancel";
        } else if (i3 != 3) {
            str = "";
        } else {
            str = "enter_personal_detail";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_method", "follow_card_button").a("enter_from", "others_homepage").a("event_type", "card").a("req_id", this.n);
        String str4 = null;
        if (user != null) {
            str2 = user.getRecType();
        } else {
            str2 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("rec_type", str2);
        if (user != null) {
            str3 = user.getUid();
        } else {
            str3 = null;
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("to_user_id", str3);
        User user2 = this.f120142m;
        if (user2 != null) {
            str4 = user2.getUid();
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("from_user_id", str4);
        if (user == null || !user.isSecret()) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("is_private", i2);
        if (user != null && user.getFollowStatus() == 4) {
            i4 = 0;
        }
        com.ss.android.ugc.aweme.app.f.d a7 = a6.a("cancel_type", i4);
        l.b(a7, "");
        r.a(str, eu.a(a7, user).f66730a);
    }

    public final void a(u.a aVar, User user) {
        String str;
        l.d(aVar, "");
        u a2 = new u().a("others_homepage");
        a2.f109596a = u.c.CARD;
        a2.f109597b = aVar;
        u s2 = a2.a(user).p("bottom").s(this.n);
        if (user != null) {
            str = user.getUid();
        } else {
            str = null;
        }
        s2.t(str).f();
        b(aVar, user);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008b A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c5 A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00dc A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0114 A[Catch:{ Exception -> 0x011b }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r15, int r16, java.lang.String r17, int r18, h.c.d<? super com.bytedance.ies.powerlist.page.f<java.lang.Integer>> r19) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM.a(int, int, java.lang.String, int, h.c.d):java.lang.Object");
    }
}
