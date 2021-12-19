package com.ss.android.ugc.aweme.friends.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.ac;
import com.ss.android.ugc.aweme.experiment.cz;
import com.ss.android.ugc.aweme.experiment.ey;
import com.ss.android.ugc.aweme.experiment.fi;
import com.ss.android.ugc.aweme.find.ui.FindFriendsActivity;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.i.a.a;
import com.ss.android.ugc.aweme.friends.invite.v2.ContactInvitationItemView;
import com.ss.android.ugc.aweme.friends.invite.v2.InvitationReflowHelper;
import com.ss.android.ugc.aweme.friends.invite.v2.ThirdPartInvitationItemView;
import com.ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.friends.model.InviteContactFriendsModel;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.ss.android.ugc.aweme.friends.service.IFriendsService;
import com.ss.android.ugc.aweme.friends.ui.ContactsActivity;
import com.ss.android.ugc.aweme.friends.ui.InviteFriendsActivity;
import com.ss.android.ugc.aweme.friends.ui.as;
import com.ss.android.ugc.aweme.friends.ui.w;
import com.ss.android.ugc.aweme.friends.ui.y;
import com.ss.android.ugc.aweme.friends.widget.contact.f;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.presenter.o;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse;
import com.ss.android.ugc.aweme.relation.api.RelationApi;
import com.ss.android.ugc.aweme.relation.b;
import com.ss.android.ugc.aweme.relation.c.a;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.ufr.contact.ContactUFR;
import com.ss.android.ugc.aweme.utils.be;
import com.ss.android.ugc.aweme.utils.in;
import f.a.ab;
import f.a.t;
import f.a.v;
import f.a.x;
import h.a.z;
import h.f.b.l;
import h.p;
import h.q;
import h.r;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public final class FriendsServiceImpl implements IFriendsService {

    /* renamed from: a  reason: collision with root package name */
    private b f97019a;

    static {
        Covode.recordClassIndex(61656);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends com.ss.android.ugc.aweme.ufr.a> c() {
        return ContactUFR.class;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.c d() {
        return c.a.f141661a;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Class<? extends com.ss.android.ugc.aweme.ufr.a> f() {
        return com.ss.android.ugc.aweme.ufr.a.a.class;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.d g() {
        return c.b.f141662a;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(String str, boolean z) {
        l.d(str, "");
        com.ss.android.ugc.aweme.friends.i.a.a(str, z, "", "", "");
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean a(Activity activity) {
        l.d(activity, "");
        return be.a(activity);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(Activity activity, com.ss.android.ugc.aweme.friends.ui.f fVar) {
        l.d(activity, "");
        l.d(fVar, "");
        be.a(activity, fVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(int i2, String str, String str2, Context context) {
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        fi a2 = com.ss.android.ugc.aweme.friends.i.e.f96885e.a(i2);
        if (ey.a()) {
            if (!a2.f90044a && !a2.f90045b) {
                return;
            }
        } else if (!a2.f90044a) {
            return;
        }
        com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
        DialogContext.a aVar2 = new DialogContext.a((androidx.fragment.app.e) context);
        aVar2.f33424a = b.a.FRIENDSLIST_PERMISSION;
        aVar.a(aVar2.a(new c(a2, str, str2, context)));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean a(User user) {
        if (user == null || user.getFollowerCount() < 1000) {
            return true;
        }
        return (user == null || user.getMutualStruct() == null) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: f.a.t<R> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(String str) {
        l.d(str, "");
        c.a.a(true);
        com.ss.android.ugc.aweme.social.monitor.e eVar = com.ss.android.ugc.aweme.social.monitor.e.f133706b;
        int b2 = com.ss.android.ugc.aweme.relation.b.b.b();
        UUID randomUUID = UUID.randomUUID();
        l.b(randomUUID, "");
        com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(b2, randomUUID);
        f.a.d.f<Object> fVar = f.a.e.b.a.f157191d;
        com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(1, true).a(new e(str)).a((f.a.d.g<? super BaseResponse, ? extends x<? extends R>>) new f(str, a2), false).a((f.a.d.g<? super R, ? extends x<? extends R>>) new g(a2), false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(fVar, fVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(com.ss.android.ugc.aweme.friends.g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
        com.ss.android.ugc.aweme.ufr.f.f141695a.add(new com.bytedance.common.utility.collection.e<>(gVar));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean a(boolean z) {
        int b2;
        int b3;
        if (((Boolean) cz.f89753a.getValue()).booleanValue()) {
            if (!com.ss.android.ugc.aweme.relation.b.f() && com.ss.android.ugc.aweme.relation.b.f120336a.getBoolean("key_cache_ready_" + com.ss.android.ugc.aweme.relation.b.i(), false) && !com.ss.android.ugc.aweme.relation.b.g() && (!z ? com.ss.android.ugc.aweme.relation.b.b() == 4 : !(2 > (b3 = com.ss.android.ugc.aweme.relation.b.b()) || 3 < b3)) && !in.f()) {
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                l.b(g2, "");
                if (g2.isLogin()) {
                    return true;
                }
            }
            return false;
        }
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        return g3.isLogin() && !in.f() && !com.ss.android.ugc.aweme.relation.b.f() && com.ss.android.ugc.aweme.relation.b.f120336a.getBoolean(new StringBuilder("key_cache_ready_").append(com.ss.android.ugc.aweme.relation.b.i()).toString(), false) && !com.ss.android.ugc.aweme.relation.b.g() && (!z ? com.ss.android.ugc.aweme.relation.b.b() == 4 : !(2 > (b2 = com.ss.android.ugc.aweme.relation.b.b()) || 3 < b2));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void a(fi fiVar, String str, String str2, Context context) {
        l.d(fiVar, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(context, "");
        com.bytedance.ies.dmt.ui.dialog.dialogmanager.a aVar = a.C0732a.f33434a;
        DialogContext.a aVar2 = new DialogContext.a((androidx.fragment.app.e) context);
        aVar2.f33424a = b.a.FRIENDSLIST_PERMISSION;
        aVar.a(aVar2.a(new d(fiVar, str, str2, context)));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final IContactService b() {
        return new ContactServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean e() {
        return c.a.f141661a.a();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final w i() {
        return new o();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final IFriendsService.b j() {
        return a.C3111a.a();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final IFriendsService.d k() {
        return a.C2336a.a();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean l() {
        return com.ss.android.ugc.aweme.friends.i.a.b();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean m() {
        return c.a.f141661a.b();
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.widget.contact.c n() {
        return f.a.a();
    }

    public static final class c implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fi f97024a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97025b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f97026c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f97027d;

        static {
            Covode.recordClassIndex(61660);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            com.ss.android.ugc.aweme.friends.i.e.f96885e.a(this.f97024a, this.f97025b, this.f97026c, (androidx.fragment.app.e) this.f97027d);
        }

        c(fi fiVar, String str, String str2, Context context) {
            this.f97024a = fiVar;
            this.f97025b = str;
            this.f97026c = str2;
            this.f97027d = context;
        }
    }

    public static final class d implements b.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fi f97028a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f97029b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f97030c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f97031d;

        static {
            Covode.recordClassIndex(61661);
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a(List<Integer> list, int i2) {
        }

        @Override // com.bytedance.ies.dmt.ui.dialog.dialogmanager.b.c
        public final void a() {
            com.ss.android.ugc.aweme.friends.i.e.f96885e.a(this.f97028a, this.f97029b, this.f97030c, (androidx.fragment.app.e) this.f97031d);
        }

        d(fi fiVar, String str, String str2, Context context) {
            this.f97028a = fiVar;
            this.f97029b = str;
            this.f97030c = str2;
            this.f97031d = context;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean p() {
        if (SettingsManager.a().a("hide_find_friends_entrance", 0) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final b q() {
        if (this.f97019a == null) {
            this.f97019a = new SocialFriendsService();
        }
        return this.f97019a;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final long h() {
        return com.bytedance.ies.abmock.b.a().a(true, "facebook_upload_interval", 0L) * 1000;
    }

    public static IFriendsService s() {
        MethodCollector.i(9650);
        Object a2 = com.ss.android.ugc.b.a(IFriendsService.class, false);
        if (a2 != null) {
            IFriendsService iFriendsService = (IFriendsService) a2;
            MethodCollector.o(9650);
            return iFriendsService;
        }
        if (com.ss.android.ugc.b.bt == null) {
            synchronized (IFriendsService.class) {
                try {
                    if (com.ss.android.ugc.b.bt == null) {
                        com.ss.android.ugc.b.bt = new FriendsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9650);
                    throw th;
                }
            }
        }
        FriendsServiceImpl friendsServiceImpl = (FriendsServiceImpl) com.ss.android.ugc.b.bt;
        MethodCollector.o(9650);
        return friendsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void o() {
        com.ss.android.ugc.aweme.relation.b.f120336a.storeBoolean("key_rec_friends_has_shown_" + com.ss.android.ugc.aweme.relation.b.i(), true);
        com.ss.android.ugc.aweme.relation.b.f120336a.storeBoolean("key_cache_ready_" + com.ss.android.ugc.aweme.relation.b.i(), false);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void r() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin() && !com.ss.android.ugc.aweme.relation.b.f()) {
            int a2 = SettingsManager.a().a("obtain_friends_strategy_when_upgrading", 0);
            if (com.ss.android.ugc.aweme.relation.b.f120336a.getBoolean("key_new_version", false) && a2 > 1) {
                com.ss.android.ugc.aweme.relation.b.f120336a.storeInt("key_display_strategy", a2);
                com.ss.android.ugc.aweme.relation.b.f120336a.storeLong("key_rec_friends_frequency", SettingsManager.a().a("obtain_friends_strategy_when_upgrading_frequency", 30L));
                boolean c2 = com.ss.android.ugc.aweme.relation.b.c();
                boolean d2 = com.ss.android.ugc.aweme.relation.b.d();
                com.ss.android.ugc.aweme.relation.b.f120336a.storeString("key_check_status", "value_check_start");
                a.f97047a.a().a(new b.a(c2, d2), b.C3108b.f120344a);
                if (c2 || d2) {
                    com.ss.android.ugc.aweme.relation.b.a();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final ab<CheckMatchedFriendsResponse> a() {
        ab<CheckMatchedFriendsResponse> a2 = RelationApi.a.a().checkMatchedFriends().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final fi a(int i2) {
        return com.ss.android.ugc.aweme.friends.i.e.f96885e.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.invite.b a(androidx.fragment.app.e eVar) {
        l.d(eVar, "");
        return new InvitationReflowHelper(new WeakReference(eVar));
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.invite.a b(Context context) {
        l.d(context, "");
        return new ContactInvitationItemView(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final t<List<Friend>> c(int i2) {
        t<List<Friend>> a2 = t.a(new b(i2));
        l.b(a2, "");
        return a2;
    }

    static final class b<T> implements f.a.w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f97022a;

        static {
            Covode.recordClassIndex(61658);
        }

        b(int i2) {
            this.f97022a = i2;
        }

        @Override // f.a.w
        public final void subscribe(final v<List<Friend>> vVar) {
            l.d(vVar, "");
            new InviteContactFriendsModel("contact").uploadContacts(true, this.f97022a).a(new b.g() {
                /* class com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl.b.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(61659);
                }

                @Override // b.g
                public final /* synthetic */ Object then(i iVar) {
                    Object obj;
                    l.b(iVar, "");
                    if (iVar.c()) {
                        v vVar = vVar;
                        l.b(vVar, "");
                        Exception e2 = iVar.e();
                        if (e2 == null) {
                            e2 = new IllegalStateException("Unknown error");
                        }
                        ac.a(vVar, (Throwable) e2);
                    } else {
                        FriendList friendList = (FriendList) iVar.d();
                        if (friendList == null || (obj = friendList.getFriends()) == null) {
                            obj = z.INSTANCE;
                        }
                        v vVar2 = vVar;
                        l.b(vVar2, "");
                        ac.a(vVar2, obj);
                    }
                    return h.z.f158842a;
                }
            });
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f97032a;

        static {
            Covode.recordClassIndex(61662);
        }

        e(String str) {
            this.f97032a = str;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 7 out of bounds for length 7
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.String r0 = r7.f97032a
                java.lang.String r1 = "guide"
                java.lang.String r2 = "contact"
                java.lang.String r3 = "did"
                java.lang.String r4 = ""
                java.lang.String r5 = "auto"
                r6 = 1
                com.ss.android.ugc.aweme.friends.e.a.a(r0, r1, r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl.e.accept(java.lang.Object):void");
        }
    }

    static final class f<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f97033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f97034b;

        static {
            Covode.recordClassIndex(61663);
        }

        f(String str, com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f97033a = str;
            this.f97034b = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            l.d(obj, "");
            com.ss.android.ugc.aweme.friends.e.a.b(this.f97033a, "guide", "contact", "", "did", "auto", null);
            return com.ss.android.ugc.aweme.relation.b.b.a(this.f97034b, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final t<UploadContactsResult> b(int i2) {
        t<UploadContactsResult> a2 = t.a(new a(this, i2));
        l.b(a2, "");
        return a2;
    }

    static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f97035a;

        static {
            Covode.recordClassIndex(61664);
        }

        g(com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f97035a = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            l.d(list, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                return com.ss.android.ugc.aweme.friends.i.b.a(list, this.f97035a, 0);
            }
            t b2 = t.b(new com.ss.android.ugc.aweme.relation.a());
            l.b(b2, "");
            return b2;
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.invite.c a(Fragment fragment) {
        l.d(fragment, "");
        return new ThirdPartInvitationItemView(fragment);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void b(com.ss.android.ugc.aweme.friends.g gVar) {
        l.d(gVar, "");
        l.d(gVar, "");
        com.ss.android.ugc.aweme.ufr.f.f141695a.remove(new com.bytedance.common.utility.collection.e(gVar));
    }

    static final class a<T> implements f.a.w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FriendsServiceImpl f97020a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f97021b;

        static {
            Covode.recordClassIndex(61657);
        }

        a(FriendsServiceImpl friendsServiceImpl, int i2) {
            this.f97020a = friendsServiceImpl;
            this.f97021b = i2;
        }

        @Override // f.a.w
        public final void subscribe(v<UploadContactsResult> vVar) {
            Object obj;
            l.d(vVar, "");
            com.ss.android.ugc.aweme.social.monitor.e eVar = com.ss.android.ugc.aweme.social.monitor.e.f133706b;
            int i2 = this.f97021b;
            UUID randomUUID = UUID.randomUUID();
            l.b(randomUUID, "");
            com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(i2, randomUUID);
            try {
                a2.a();
                List<ContactModelV2> a3 = be.a(com.bytedance.ies.ugc.appcontext.d.a(), a2, false);
                l.b(a3, "");
                if (com.bytedance.common.utility.collection.b.a((Collection) a3)) {
                    vVar.a(new UploadContactsResult());
                } else {
                    vVar.a(UploadContactsApi.a(a3, a2, 0, this.f97021b));
                    a2.e();
                }
                obj = q.m223constructorimpl(h.z.f158842a);
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
            Throwable r0 = q.m226exceptionOrNullimpl(obj);
            if (r0 != null) {
                vVar.a(r0);
                a2.a(r0);
            }
            a2.g();
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final com.ss.android.ugc.aweme.friends.ui.x a(Context context) {
        l.d(context, "");
        return new as(context, (byte) 0);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void b(boolean z) {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        List<SocialPlatformSetting> socialPlatformSettings = curUser.getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    socialPlatformSetting.setSyncStatus(z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final void c(boolean z) {
        if (c.b.f141662a.a()) {
            com.ss.android.ugc.aweme.common.r.a("switch_sync_auth", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "privacy_setting").a("method", "auto").a("to_status", "off").a("platform", "facebook").f66730a);
            c.b.f141662a.a(z);
            t<BaseResponse> b2 = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(2, Boolean.valueOf(z)).b(f.a.h.a.b(f.a.k.a.f158006c));
            f.a.d.f<? super BaseResponse> fVar = f.a.e.b.a.f157191d;
            b2.a(fVar, (f.a.d.f<? super Throwable>) fVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final boolean b(Activity activity) {
        if ((activity instanceof ContactsActivity) || (activity instanceof InviteFriendsActivity)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final t<FriendList<Friend>> a(String str, int i2) {
        l.d(str, "");
        t<FriendList<Friend>> socialFriendsWithScene = com.ss.android.ugc.aweme.friends.api.a.a().getSocialFriendsWithScene("facebook", c.b.f141662a.a(str), null, Long.valueOf(c.b.f141662a.d(str)), Integer.valueOf(i2));
        l.b(socialFriendsWithScene, "");
        return socialFriendsWithScene;
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final p<String, HashMap<String, Object>> a(String str, p<String, ? extends HashMap<String, Object>> pVar) {
        l.d(str, "");
        l.d(pVar, "");
        return InvitationReflowHelper.a.a(str, pVar);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final y a(Context context, HashMap<String, Boolean> hashMap, boolean z, boolean z2) {
        l.d(context, "");
        l.d(hashMap, "");
        return (y) RecommendUserServiceImpl.b().a(context, hashMap);
    }

    @Override // com.ss.android.ugc.aweme.friends.service.IFriendsService
    public final Intent a(Context context, int i2, int i3, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (context == null) {
            return null;
        }
        Intent intent = new Intent(context, FindFriendsActivity.class);
        intent.putExtra("previous_page", str2);
        return intent;
    }
}
