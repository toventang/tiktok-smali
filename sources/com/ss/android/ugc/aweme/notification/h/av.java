package com.ss.android.ugc.aweme.notification.h;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.a.k;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.follow.widet.a;
import com.ss.android.ugc.aweme.friends.ui.au;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.inbox.e;
import com.ss.android.ugc.aweme.inbox.f;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notification.utils.h;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.LinkedHashMap;
import java.util.Set;

public final class av extends p {

    /* renamed from: a  reason: collision with root package name */
    public k<User> f113586a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.follow.widet.a f113587b = new com.ss.android.ugc.aweme.follow.widet.a(this.f113589d, new a.g(this) {
        /* class com.ss.android.ugc.aweme.notification.h.av.AnonymousClass1 */

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f113592a;

        static {
            Covode.recordClassIndex(73019);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        {
            this.f113592a = r1;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.g, com.ss.android.ugc.aweme.follow.widet.a.f
        public final void a(int i2, User user) {
            av.c();
            k<User> kVar = this.f113592a.f113586a;
            if (kVar != null) {
                int i3 = au.f97195h;
                int position = this.f113592a.getPosition();
                this.f113592a.f113588c.getView();
                kVar.a(i3, user, position);
            }
        }
    });

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.recommend.a f113588c;

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.following.ui.view.a f113589d;

    /* renamed from: e  reason: collision with root package name */
    private int f113590e = 2001;

    /* renamed from: f  reason: collision with root package name */
    private User f113591f;
    private final int q;
    private final BaseNotificationVM r;

    static {
        Covode.recordClassIndex(73018);
    }

    public static void c() {
        f.b(e.f113599a);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final boolean e() {
        if (this.q == 9) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.notification.h.k, com.ss.android.ugc.aweme.notification.h.a
    public final void bY_() {
        k<User> kVar;
        User user;
        String str;
        super.bY_();
        if (!(this.f113590e != 2011 || (user = this.f113591f) == null || user.getUid() == null)) {
            Set<String> g2 = this.r.g();
            User user2 = this.f113591f;
            if (user2 == null) {
                l.b();
            }
            if (!g2.contains(user2.getUid())) {
                Set<String> g3 = this.r.g();
                User user3 = this.f113591f;
                if (user3 == null) {
                    l.b();
                }
                String uid = user3.getUid();
                l.b(uid, "");
                g3.add(uid);
                User user4 = this.f113591f;
                if (user4 == null) {
                    l.b();
                }
                l.d(user4, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("enter_from", "notification_page");
                String uid2 = user4.getUid();
                l.b(uid2, "");
                linkedHashMap.put("to_user_id", uid2);
                linkedHashMap.put("follow_status", String.valueOf(com.ss.android.ugc.aweme.notification.utils.e.a(user4)));
                if (user4.isPrivateAccount()) {
                    str = "1";
                } else {
                    str = "0";
                }
                linkedHashMap.put("is_private_account", str);
                r.a("invite_follow_cell_show", linkedHashMap);
            }
        }
        if (this.f113590e == 2001 && (kVar = this.f113586a) != null) {
            int i2 = au.f97194g;
            User user5 = this.f113591f;
            int position = getPosition();
            this.f113588c.getView();
            kVar.a(i2, user5, position);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e extends m implements h.f.a.b<e.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f113599a = new e();

        static {
            Covode.recordClassIndex(73024);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(e.a aVar) {
            e.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.b();
            return z.f158842a;
        }
    }

    public final void a(k<User> kVar) {
        this.f113586a = kVar;
        if (this.q == 9) {
            this.itemView.setOnLongClickListener(this);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f113593a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ av f113594b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f113595c;

        static {
            Covode.recordClassIndex(73020);
        }

        a(boolean z, av avVar, User user) {
            this.f113593a = z;
            this.f113594b = avVar;
            this.f113595c = user;
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.c
        public final boolean a(int i2) {
            boolean a2 = h.a(this.f113594b.f113647i, this.f113595c, null, null, null, !this.f113593a, 28);
            if (a2) {
                User user = this.f113595c;
                u a3 = new u().a("notification_page");
                a3.f109596a = u.c.CARD;
                a3.f109597b = u.a.ENTER_CHAT;
                a3.a(user).s(user.getRequestId()).f();
            }
            return a2;
        }
    }

    public static final class b implements a.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ av f113596a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ User f113597b;

        static {
            Covode.recordClassIndex(73021);
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.d
        public final void a(FollowStatus followStatus) {
            if (followStatus != null) {
                IMService.createIIMServicebyMonsterPlugin(false).storeFollowStatus(followStatus);
                this.f113596a.f113588c.a(followStatus.followStatus, followStatus.followerStatus, this.f113597b.getUid());
            }
            com.ss.android.ugc.aweme.friends.service.a aVar = com.ss.android.ugc.aweme.friends.service.a.f97047a;
            Context context = this.f113596a.f113647i;
            l.b(context, "");
            aVar.a(3, "notification_page", "follow", context);
        }

        b(av avVar, User user) {
            this.f113596a = avVar;
            this.f113597b = user;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements a.e {

        /* renamed from: a  reason: collision with root package name */
        public static final d f113598a = new d();

        static {
            Covode.recordClassIndex(73023);
        }

        d() {
        }

        @Override // com.ss.android.ugc.aweme.follow.widet.a.e
        public final void a(FollowStatus followStatus) {
            l.b(followStatus, "");
            if (followStatus.followStatus == 0) {
                r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("to_user_id", followStatus.userId).f66730a);
            } else {
                r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page").a("to_user_id", followStatus.userId).f66730a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<Integer, z> {
        final /* synthetic */ User $user$inlined;
        final /* synthetic */ av this$0;

        static {
            Covode.recordClassIndex(73022);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(av avVar, User user) {
            super(1);
            this.this$0 = avVar;
            this.$user$inlined = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Integer num) {
            boolean z;
            int intValue = num.intValue();
            if (intValue == au.f97190c) {
                av.c();
            }
            if (intValue == au.f97191d) {
                User user = this.$user$inlined;
                if (user != null) {
                    com.ss.android.ugc.aweme.follow.widet.a aVar = this.this$0.f113587b;
                    if (aVar == null) {
                        l.b();
                    }
                    String uid = user.getUid();
                    String secUid = user.getSecUid();
                    int followStatus = user.getFollowStatus();
                    int followerStatus = user.getFollowerStatus();
                    if (user.isSecret() || user.isPrivateAccount()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.a(uid, secUid, followStatus, followerStatus, z);
                }
            } else {
                k<User> kVar = this.this$0.f113586a;
                if (kVar != null) {
                    User user2 = this.$user$inlined;
                    int layoutPosition = this.this$0.getLayoutPosition();
                    this.this$0.f113588c.getView();
                    kVar.a(intValue, user2, layoutPosition);
                }
            }
            return z.f158842a;
        }
    }

    public final void a(User user, int i2) {
        this.f113590e = i2;
        this.f113591f = user;
        if (user != null) {
            boolean d2 = IMUnder16ProxyImpl.n().d();
            if (in.d() || d2) {
                this.f113588c.a(false);
            } else {
                this.f113588c.a(true);
            }
            this.f113588c.a(user);
            com.ss.android.ugc.aweme.follow.widet.a aVar = this.f113587b;
            if (aVar != null) {
                aVar.a(user);
            }
            com.ss.android.ugc.aweme.follow.widet.a aVar2 = this.f113587b;
            if (aVar2 != null) {
                aVar2.f96288e = new a(d2, this, user);
            }
            com.ss.android.ugc.aweme.follow.widet.a aVar3 = this.f113587b;
            if (aVar3 != null) {
                aVar3.f96287d = new b(this, user);
            }
            com.ss.android.ugc.aweme.follow.widet.a aVar4 = this.f113587b;
            if (aVar4 != null) {
                aVar4.f96289f = d.f113598a;
            }
            this.f113588c.setEventListener(new c(this, user));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public av(com.ss.android.ugc.aweme.recommend.a aVar, int i2, BaseNotificationVM baseNotificationVM) {
        super(aVar.getView());
        l.d(aVar, "");
        l.d(baseNotificationVM, "");
        this.f113588c = aVar;
        this.q = i2;
        this.r = baseNotificationVM;
        this.f113589d = aVar.getFollowBtn();
    }
}
