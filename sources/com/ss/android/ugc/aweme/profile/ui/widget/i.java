package com.ss.android.ugc.aweme.profile.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.friends.model.RecommendContact;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.ss.android.ugc.aweme.profile.experiment.k;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.RecommendCommonUserViewMus;
import com.ss.android.ugc.aweme.profile.ui.cv;
import com.ss.android.ugc.aweme.profile.ui.cw;
import com.ss.android.ugc.aweme.social.widget.card.a.i;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.utils.io;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.ss.android.ugc.aweme.views.SuggestUserAvatarView;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.z;
import h.f.b.l;
import h.f.b.m;
import h.v;
import h.w;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class i extends com.ss.android.ugc.aweme.common.a.f<User> {
    public static final a y = new a((byte) 0);
    private int A = 1;
    private float B = n();
    private final Paint C = new Paint();
    private final Set<String> D = new LinkedHashSet();
    private int E;
    private final h.h F = h.i.a((h.f.a.a) new C2981i(this));
    private final g G;

    /* renamed from: a  reason: collision with root package name */
    public b f117428a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.common.d.c<cw> f117429b;

    /* renamed from: c  reason: collision with root package name */
    public cw.c f117430c;

    /* renamed from: d  reason: collision with root package name */
    public cv.a f117431d;

    /* renamed from: e  reason: collision with root package name */
    public String f117432e;

    /* renamed from: f  reason: collision with root package name */
    public String f117433f;

    /* renamed from: g  reason: collision with root package name */
    public int f117434g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, Integer> f117435h = new HashMap<>();

    /* renamed from: i  reason: collision with root package name */
    public f.a.b.a f117436i;

    /* renamed from: j  reason: collision with root package name */
    public User f117437j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f117438k;
    final h.h w = h.i.a((h.f.a.a) new j(this));
    final h.h x;
    private int z;

    public interface b {
        static {
            Covode.recordClassIndex(75866);
        }

        void a(User user);

        void b(User user);

        void c(User user);

        void d(User user);
    }

    static {
        Covode.recordClassIndex(75864);
    }

    public final cv l() {
        return (cv) this.F.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75865);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final List<User> e() {
        List<User> list = this.f76354l;
        if (list == null) {
            return z.INSTANCE;
        }
        return list;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.i$i  reason: collision with other inner class name */
    static final class C2981i extends m implements h.f.a.a<cv> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(75874);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2981i(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ cv invoke() {
            return new cv((View) this.this$0.x.getValue());
        }
    }

    public static com.ss.android.ugc.aweme.social.widget.card.a.a m() {
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            return com.ss.android.ugc.aweme.social.widget.card.a.a.LARGE_SQUARE;
        }
        return com.ss.android.ugc.aweme.social.widget.card.a.a.SQUARE;
    }

    public final float n() {
        float f2;
        int i2 = this.A;
        if (i2 >= 2) {
            i2 = 2;
        }
        if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
            f2 = 226.0f;
        } else {
            f2 = 176.0f;
        }
        return (((float) (i2 - 1)) * 14.0f) + f2;
    }

    static final class j extends m implements h.f.a.a<com.ss.android.ugc.aweme.social.widget.card.a.g> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(75875);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(i iVar) {
            super(0);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.social.widget.card.a.g invoke() {
            return new com.ss.android.ugc.aweme.social.widget.card.a.g(ag.a(v.a(com.ss.android.ugc.aweme.social.widget.card.a.f.CONTACT, i.m()), v.a(com.ss.android.ugc.aweme.social.widget.card.a.f.FACEBOOK, i.m())));
        }
    }

    private final void o() {
        User user = this.f117437j;
        if (user != null) {
            boolean z2 = this.f117438k;
            l.d(user, "");
            int i2 = 2;
            int i3 = 0;
            if (user.getFollowerCount() < 1000 && user.getAccountType() != 2 && user.getAccountType() != 3) {
                if (k.a() == 1 || k.a() == 3 || (!z2 && k.a() == 2)) {
                    if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
                        i2 = 1;
                    }
                    while (i3 < this.f76354l.size() && i3 < i2) {
                        String[] strArr = k.f117454a;
                        Object obj = this.f76354l.get(i3);
                        l.b(obj, "");
                        if (!h.a.i.a(strArr, ((User) obj).getRecType())) {
                            break;
                        }
                        i3++;
                    }
                    this.f76354l.add(i3, new RecommendContact(null, 1, null));
                }
            }
        }
    }

    static final class h extends m implements h.f.a.a<LinearLayout> {
        final /* synthetic */ Context $context;
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(75872);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(i iVar, Context context) {
            super(0);
            this.this$0 = iVar;
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ LinearLayout invoke() {
            Activity a2;
            String str;
            Context context;
            Context context2 = this.$context;
            if (context2 instanceof com.bytedance.nita.a.a) {
                com.bytedance.nita.a.a aVar = (com.bytedance.nita.a.a) context2;
                WeakReference<Context> weakReference = aVar.f41607a;
                Context context3 = null;
                if (weakReference != null) {
                    context3 = weakReference.get();
                }
                if (context3 instanceof Activity) {
                    WeakReference<Context> weakReference2 = aVar.f41607a;
                    if (weakReference2 == null || (context = weakReference2.get()) == null) {
                        throw new w("null cannot be cast to non-null type");
                    }
                    a2 = (Activity) context;
                } else {
                    throw new com.bytedance.nita.b.b("make sure you get this preCreated View from Activity context ");
                }
            } else {
                a2 = o.a(context2);
            }
            com.ss.android.ugc.aweme.social.widget.card.i iVar = com.ss.android.ugc.aweme.social.widget.card.i.f133800a;
            Objects.requireNonNull(a2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            com.ss.android.ugc.aweme.social.widget.a aVar2 = new com.ss.android.ugc.aweme.social.widget.a((androidx.fragment.app.e) a2, null, null, null, 14);
            i.a aVar3 = new i.a();
            int i2 = this.this$0.f117434g;
            if (i2 == RecommendCommonUserViewMus.f116797j) {
                str = "others_homepage";
            } else if (i2 == 1) {
                str = "homepage_follow";
            } else if (i2 == RecommendCommonUserViewMus.f116799l) {
                str = "homepage_friends";
            } else {
                str = "";
            }
            return iVar.a(aVar2, 0, aVar3.a(ag.a(v.a("enter_from", str))).a((com.ss.android.ugc.aweme.social.widget.card.a.g) this.this$0.w.getValue()).a(new com.ss.android.ugc.aweme.social.widget.card.j(this) {
                /* class com.ss.android.ugc.aweme.profile.ui.widget.i.h.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f117452a;

                static {
                    Covode.recordClassIndex(75873);
                }

                @Override // com.ss.android.ugc.aweme.social.widget.card.j
                public final void d(int i2) {
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f117452a = r1;
                }

                @Override // com.ss.android.ugc.aweme.social.widget.card.j
                public final void a(User user) {
                    l.d(user, "");
                    l.d(user, "");
                }

                @Override // com.ss.android.ugc.aweme.social.widget.card.j
                public final void a(com.ss.android.ugc.aweme.social.widget.card.k kVar) {
                    l.d(kVar, "");
                    l.d(kVar, "");
                }

                @Override // com.ss.android.ugc.aweme.social.widget.card.j
                public final void a(com.ss.android.ugc.aweme.social.widget.card.a.f fVar, com.ss.android.ugc.aweme.social.widget.card.a.e eVar, List<? extends User> list) {
                    int adapterPosition;
                    f.a.b.a aVar;
                    l.d(fVar, "");
                    l.d(eVar, "");
                    if (eVar == com.ss.android.ugc.aweme.social.widget.card.a.e.ON_AUTHORIZE) {
                        if (fVar == com.ss.android.ugc.aweme.social.widget.card.a.f.CONTACT) {
                            adapterPosition = this.f117452a.this$0.l().getAdapterPosition();
                        } else {
                            adapterPosition = this.f117452a.this$0.l().getAdapterPosition() + 1;
                        }
                        i iVar = this.f117452a.this$0;
                        Context context = this.f117452a.$context;
                        int i2 = j.f117453a[fVar.ordinal()];
                        if (i2 == 1) {
                            f.a.b.a aVar2 = iVar.f117436i;
                            if (aVar2 != null) {
                                com.ss.android.ugc.aweme.friends.service.a aVar3 = com.ss.android.ugc.aweme.friends.service.a.f97047a;
                                User c2 = in.c();
                                l.b(c2, "");
                                String uid = c2.getUid();
                                l.b(uid, "");
                                f.a.b.b a2 = aVar3.a(uid, 6).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(iVar, context, adapterPosition), new f(iVar, context, adapterPosition));
                                l.b(a2, "");
                                f.a.j.a.a(a2, aVar2);
                            }
                        } else if (i2 == 2 && (aVar = iVar.f117436i) != null) {
                            f.a.b.b a3 = com.ss.android.ugc.aweme.friends.service.a.f97047a.b(6).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(iVar, context, adapterPosition), new d(iVar, context, adapterPosition));
                            l.b(a3, "");
                            f.a.j.a.a(a3, aVar);
                        }
                    }
                }
            }).a());
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f117443b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f117444c;

        static {
            Covode.recordClassIndex(75868);
        }

        d(i iVar, Context context, int i2) {
            this.f117442a = iVar;
            this.f117443b = context;
            this.f117444c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            i.a(this.f117443b, 0);
        }
    }

    static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117448a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f117449b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f117450c;

        static {
            Covode.recordClassIndex(75870);
        }

        f(i iVar, Context context, int i2) {
            this.f117448a = iVar;
            this.f117449b = context;
            this.f117450c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            i.a(this.f117449b, 0);
        }
    }

    public static final class g implements cw.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117451a;

        static {
            Covode.recordClassIndex(75871);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(i iVar) {
            this.f117451a = iVar;
        }

        @Override // com.ss.android.ugc.aweme.profile.ui.cw.b
        public final void a(User user, int i2) {
            b bVar;
            l.d(user, "");
            if (i2 >= 0 && i2 < this.f117451a.f76354l.size()) {
                this.f117451a.f76354l.remove(i2);
                this.f117451a.notifyItemRemoved(i2);
                if (this.f117451a.f117428a != null && !(user instanceof RecommendContact)) {
                    b bVar2 = this.f117451a.f117428a;
                    if (bVar2 != null) {
                        bVar2.a(user);
                    }
                    if (this.f117451a.f76354l.isEmpty() && (bVar = this.f117451a.f117428a) != null) {
                        bVar.b(user);
                    }
                }
                if (i2 != this.f117451a.f76354l.size()) {
                    i iVar = this.f117451a;
                    iVar.notifyItemRangeChanged(i2, iVar.f76354l.size() - i2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        if (this.f76354l.get(i2) instanceof RecommendContact) {
            return 1;
        }
        return 0;
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117439a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f117440b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f117441c;

        static {
            Covode.recordClassIndex(75867);
        }

        c(i iVar, Context context, int i2) {
            this.f117439a = iVar;
            this.f117440b = context;
            this.f117441c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Object checkValid = ((com.ss.android.ugc.aweme.base.api.a) obj).checkValid();
            l.b(checkValid, "");
            List<User> list = ((UploadContactsResult) checkValid).users;
            i iVar = this.f117439a;
            Context context = this.f117440b;
            l.b(list, "");
            iVar.a(context, 1, list, this.f117441c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        com.ss.android.ugc.aweme.common.d.c<cw> cVar;
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if ((viewHolder instanceof cw) && (cVar = this.f117429b) != null) {
            cVar.a(viewHolder);
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f117445a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f117446b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f117447c;

        static {
            Covode.recordClassIndex(75869);
        }

        e(i iVar, Context context, int i2) {
            this.f117445a = iVar;
            this.f117446b = context;
            this.f117447c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.base.api.a aVar = (com.ss.android.ugc.aweme.base.api.a) obj;
            l.d(aVar, "");
            Object checkValid = aVar.checkValid();
            l.b(checkValid, "");
            List<? extends User> friends = ((FriendList) checkValid).getFriends();
            i iVar = this.f117445a;
            Context context = this.f117446b;
            l.b(friends, "");
            iVar.a(context, 2, friends, this.f117447c);
        }
    }

    public i(Context context) {
        l.d(context, "");
        this.x = h.i.a((h.f.a.a) new h(this, context));
        this.G = new g(this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>] */
    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<User> list) {
        String quantityString;
        List<MutualUser> userList;
        l.d(list, "");
        if (!k.b()) {
            this.f76354l = list;
        } else if (!list.isEmpty()) {
            if (this.f76354l == null) {
                this.f76354l = new ArrayList();
            }
            this.f76354l.clear();
            if (!(list.get(0) instanceof RecommendContact)) {
                this.f76354l.addAll(list);
            }
            o();
        } else {
            return;
        }
        this.A = 1;
        this.D.clear();
        List list2 = this.f76354l;
        l.b(list2, "");
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            User user = (User) this.f76354l.get(i2);
            if (!(user instanceof RecommendContact)) {
                HashMap<String, Integer> hashMap = this.f117435h;
                l.b(user, "");
                String uid = user.getUid();
                l.b(uid, "");
                hashMap.put(uid, Integer.valueOf(i2));
                Set<String> set = this.D;
                String uid2 = user.getUid();
                l.b(uid2, "");
                set.add(uid2);
                if (com.ss.android.ugc.aweme.profile.experiment.i.b()) {
                    Object obj = this.f76354l.get(i2);
                    l.b(obj, "");
                    User user2 = (User) obj;
                    l.d(user2, "");
                    Paint paint = this.C;
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    paint.setTextSize(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
                    Resources system2 = Resources.getSystem();
                    l.a((Object) system2, "");
                    float applyDimension = TypedValue.applyDimension(1, 130.0f, system2.getDisplayMetrics());
                    if (com.ss.android.ugc.aweme.profile.experiment.i.a()) {
                        Paint paint2 = this.C;
                        Resources system3 = Resources.getSystem();
                        l.a((Object) system3, "");
                        paint2.setTextSize(TypedValue.applyDimension(1, 13.0f, system3.getDisplayMetrics()));
                        Resources system4 = Resources.getSystem();
                        l.a((Object) system4, "");
                        applyDimension = TypedValue.applyDimension(1, 160.0f, system4.getDisplayMetrics());
                    }
                    Resources system5 = Resources.getSystem();
                    l.a((Object) system5, "");
                    double applyDimension2 = (double) (applyDimension - (TypedValue.applyDimension(1, 8.0f, system5.getDisplayMetrics()) * 2.0f));
                    l.d(user2, "");
                    if (user2.getMutualStruct() == null) {
                        quantityString = user2.getRecommendReason();
                        l.b(quantityString, "");
                    } else {
                        List<MutualUser> userList2 = user2.getMutualStruct().getUserList();
                        if (userList2 == null || userList2.isEmpty()) {
                            quantityString = com.bytedance.ies.ugc.appcontext.d.a().getResources().getQuantityString(R.plurals.fb, user2.getMutualStruct().getTotal(), Integer.valueOf(user2.getMutualStruct().getTotal()));
                            l.b(quantityString, "");
                        } else {
                            quantityString = MutualRelationView.a.a(com.bytedance.ies.ugc.appcontext.d.a(), Integer.valueOf(user2.getMutualStruct().getMutualType()));
                        }
                    }
                    double measureText = (double) this.C.measureText(quantityString);
                    if (!(user2.getMutualStruct() == null || (userList = user2.getMutualStruct().getUserList()) == null || userList.isEmpty())) {
                        MutualStruct mutualStruct = user2.getMutualStruct();
                        l.b(mutualStruct, "");
                        float a2 = SuggestUserAvatarView.a.a(mutualStruct);
                        Resources system6 = Resources.getSystem();
                        l.a((Object) system6, "");
                        double applyDimension3 = (double) TypedValue.applyDimension(1, a2, system6.getDisplayMetrics());
                        Double.isNaN(measureText);
                        Double.isNaN(applyDimension3);
                        measureText += applyDimension3;
                    }
                    Double.isNaN(applyDimension2);
                    int ceil = (int) Math.ceil(measureText / applyDimension2);
                    if (ceil > this.A) {
                        this.A = ceil;
                    }
                }
            }
        }
        this.B = n();
        notifyDataSetChanged();
    }

    public static void a(Context context, int i2) {
        int i3 = R.string.c1q;
        if (i2 != 0) {
            if (i2 == 1) {
                i3 = R.string.dha;
            } else if (i2 == 2) {
                i3 = R.string.dh7;
            } else if (i2 == 3) {
                i3 = R.string.gj4;
            }
        }
        Activity a2 = o.a(context);
        if (a2 != null) {
            new com.bytedance.tux.g.b(a2).e(i3).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 == 1) {
            return l();
        }
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ap3, viewGroup, false);
        l.b(a2, "");
        return new cw(a2, this.f117434g);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        User user;
        TextView textView;
        l.d(viewHolder, "");
        if (viewHolder instanceof cw) {
            cw cwVar = (cw) viewHolder;
            if (this.f76354l == null || i2 < 0 || i2 >= this.f76354l.size()) {
                user = null;
            } else {
                user = (User) this.f76354l.get(i2);
            }
            g gVar = this.G;
            cw.c cVar = this.f117430c;
            b bVar = this.f117428a;
            int i3 = this.z;
            String str = this.f117432e;
            String str2 = this.f117433f;
            if (user != null) {
                cwVar.f117110j = bVar;
                cwVar.f117105e = user;
                User user2 = cwVar.f117105e;
                if (user2 == null) {
                    l.a("mUser");
                }
                cwVar.n = Integer.valueOf(user2.getFollowStatus());
                cwVar.f117107g = gVar;
                cwVar.f117108h = cVar;
                cwVar.f117106f = i2;
                UrlModel avatarMedium = user.getAvatarMedium();
                if (avatarMedium == null) {
                    avatarMedium = user.getAvatarThumb();
                }
                cwVar.f117101a.setUserData(new UserVerify(avatarMedium, user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType())));
                cwVar.f117101a.a();
                cwVar.f117102b.setText(user.getNickname());
                cwVar.f117103c.setVisibility(8);
                cwVar.f117104d.setVisibility(0);
                cwVar.f117104d.setMaxLines(1);
                if (com.ss.android.ugc.aweme.profile.experiment.i.b()) {
                    if (user.getMutualStruct() == null) {
                        cwVar.f117103c.setVisibility(8);
                        cwVar.f117104d.setVisibility(0);
                        com.ss.android.ugc.aweme.social.ext.a.a(cwVar.f117104d, user, null, null, 6);
                        cwVar.f117104d.setMinTextSize(10.0f);
                        cwVar.f117104d.setMaxLines(2);
                        cwVar.f117104d.setEllipsize(TextUtils.TruncateAt.END);
                    } else {
                        cwVar.f117104d.setVisibility(8);
                        cwVar.f117103c.setVisibility(0);
                        cwVar.f117104d.setText(user.getUniqueId());
                        cwVar.f117103c.getTvDesc().setMaxLines(2);
                        cwVar.f117103c.getTvDesc().setEllipsize(TextUtils.TruncateAt.END);
                        cwVar.f117103c.a(user.getMutualStruct(), 6);
                        List<MutualUser> userList = user.getMutualStruct().getUserList();
                        if (userList == null || userList.isEmpty()) {
                            cwVar.f117103c.a();
                            cwVar.f117103c.getTvDesc().setMaxLines(2);
                            cwVar.f117103c.getTvDesc().setMinTextSize(10.0f);
                            cwVar.f117103c.getTvDesc().setGravity(17);
                        } else {
                            MutualRelationView mutualRelationView = cwVar.f117103c;
                            MutualStruct mutualStruct = user.getMutualStruct();
                            l.b(mutualStruct, "");
                            mutualRelationView.a(mutualStruct, cw.b());
                        }
                    }
                }
                if (com.ss.android.ugc.aweme.profile.experiment.i.b()) {
                    textView = cwVar.f117102b;
                } else {
                    textView = cwVar.f117104d;
                }
                io.a(cwVar.f117109i, user.getCustomVerify(), user.getEnterpriseVerifyReason(), textView);
                User user3 = cwVar.f117105e;
                if (user3 == null) {
                    l.a("mUser");
                }
                Integer valueOf = Integer.valueOf(user3.getFollowStatus());
                User user4 = cwVar.f117105e;
                if (user4 == null) {
                    l.a("mUser");
                }
                cwVar.a(valueOf, user4.getFollowerStatus());
                ViewGroup.LayoutParams layoutParams = cwVar.f117111k.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.j jVar = (RecyclerView.j) layoutParams;
                if (i2 != 0) {
                    i3 = 0;
                }
                jVar.leftMargin = i3;
                cwVar.f117111k.setLayoutParams(jVar);
                cwVar.f117113m = str2;
                cwVar.f117112l = str;
                if (cwVar.f117112l == null) {
                    cwVar.f117112l = "";
                }
            }
            float f2 = this.B;
            int i4 = cwVar.f117111k.getLayoutParams().height;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            if (i4 != h.g.a.a(TypedValue.applyDimension(1, f2, system.getDisplayMetrics()))) {
                ViewGroup.LayoutParams layoutParams2 = cwVar.f117111k.getLayoutParams();
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                layoutParams2.height = h.g.a.a(TypedValue.applyDimension(1, f2, system2.getDisplayMetrics()));
                cwVar.f117111k.setLayoutParams(layoutParams2);
            }
        } else if (viewHolder instanceof cv) {
            this.E = i2;
            cv cvVar = (cv) viewHolder;
            float f3 = this.B;
            View view = cvVar.itemView;
            l.b(view, "");
            int i5 = view.getLayoutParams().height;
            Resources system3 = Resources.getSystem();
            l.a((Object) system3, "");
            if (i5 != h.g.a.a(TypedValue.applyDimension(1, f3, system3.getDisplayMetrics()))) {
                View view2 = cvVar.itemView;
                l.b(view2, "");
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                Resources system4 = Resources.getSystem();
                l.a((Object) system4, "");
                layoutParams3.height = h.g.a.a(TypedValue.applyDimension(1, f3, system4.getDisplayMetrics()));
                View view3 = cvVar.itemView;
                l.b(view3, "");
                view3.setLayoutParams(layoutParams3);
            }
        }
    }

    public final void a(Context context, int i2, List<? extends User> list, int i3) {
        if (list.isEmpty()) {
            a(context, i2);
            return;
        }
        int i4 = i3;
        for (T t : list) {
            if (!this.D.contains(t.getUid())) {
                int i5 = i4 + 1;
                this.f76354l.add(i4, t);
                Set<String> set = this.D;
                String uid = t.getUid();
                l.b(uid, "");
                set.add(uid);
                i4 = i5;
            }
        }
        if (i4 > i3) {
            notifyItemRangeInserted(i3, i4 - i3);
            cv.a aVar = this.f117431d;
            if (aVar != null) {
                aVar.a(i3);
                return;
            }
            return;
        }
        a(context, 3);
    }
}
