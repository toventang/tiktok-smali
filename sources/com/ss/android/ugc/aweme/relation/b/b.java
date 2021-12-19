package com.ss.android.ugc.aweme.relation.b;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.experiment.gp;
import com.ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.ss.android.ugc.aweme.friends.model.Friend;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.c.c;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.be;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import f.a.t;
import f.a.v;
import f.a.w;
import f.a.x;
import h.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f120345a = new b();

    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120346a = new a((byte) 0);

        static {
            Covode.recordClassIndex(78297);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final int c() {
            return 2;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(78298);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean b() {
            int i2;
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
                Iterator<SocialPlatformSetting> it = socialPlatformSettings.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SocialPlatformSetting next = it.next();
                    if (next.getSocialPlatform() == 2) {
                        i2 = next.getOnBoardingRecStrategy();
                        break;
                    }
                }
            }
            i2 = 0;
            return c.b(i2);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final p<Boolean, Boolean> a() {
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            boolean z = true;
            if (!(socialData == null || (socialPlatformSettings = socialData.getSocialPlatformSettings()) == null)) {
                for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                    if (socialPlatformSetting.getSocialPlatform() == 2) {
                        if (socialPlatformSetting.getSyncStatus() || !socialPlatformSetting.getDisplayConsentPage()) {
                            z = false;
                        }
                        return new p<>(Boolean.valueOf(z), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                    }
                }
            }
            return new p<>(true, true);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(com.ss.android.ugc.aweme.relation.c cVar) {
            boolean z;
            h.f.b.l.d(cVar, "");
            int e2 = b.e(2);
            if (cVar.getType() != com.ss.android.ugc.aweme.relation.c.TRIGGER_IN_JOURNEY_FRONT.getType() || !c.d(e2)) {
                z = true;
            } else {
                z = false;
            }
            if (cVar.getType() != com.ss.android.ugc.aweme.relation.c.TRIGGER_IN_JOURNEY_BACK.getType() || !c.c(e2)) {
                return z;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(androidx.fragment.app.e eVar) {
            h.f.b.l.d(eVar, "");
            if (!c.a(b.e(2))) {
                return false;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (!g2.isLogin() || in.f()) {
                return false;
            }
            com.ss.android.ugc.aweme.account.b.a();
            if ((!h.f.b.l.a((Object) com.ss.android.ugc.aweme.account.b.f62864a.k().getLatestLoginMethodName(), (Object) "facebook")) || !com.ss.android.sdk.a.b.f60131a.a("facebook")) {
                return false;
            }
            com.ss.android.ugc.aweme.friends.d g3 = com.ss.android.ugc.aweme.friends.service.a.f97047a.g();
            IAccountUserService g4 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g4, "");
            if (g3.a(g4.getCurUserId()).length() != 0 && b.b(2)) {
                return true;
            }
            return false;
        }
    }

    public interface d {
        static {
            Covode.recordClassIndex(78299);
        }

        p<Boolean, Boolean> a();

        boolean a(androidx.fragment.app.e eVar);

        boolean a(com.ss.android.ugc.aweme.relation.c cVar);

        boolean b();

        int c();
    }

    public static final class e implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final a f120347a = new a((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        private final h.h f120348b = h.i.a((h.f.a.a) C3110b.f120349a);

        static {
            Covode.recordClassIndex(78300);
        }

        private final int d() {
            return ((Number) this.f120348b.getValue()).intValue();
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(com.ss.android.ugc.aweme.relation.c cVar) {
            h.f.b.l.d(cVar, "");
            return false;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final int c() {
            return 3;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(78301);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.relation.b.b$e$b  reason: collision with other inner class name */
        static final class C3110b extends h.f.b.m implements h.f.a.a<Integer> {

            /* renamed from: a  reason: collision with root package name */
            public static final C3110b f120349a = new C3110b();

            static {
                Covode.recordClassIndex(78302);
            }

            C3110b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ Integer invoke() {
                return Integer.valueOf(com.ss.android.ugc.aweme.relation.b.b());
            }
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean b() {
            int d2 = d();
            if (2 <= d2 && 3 >= d2) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final p<Boolean, Boolean> a() {
            boolean z;
            if (com.ss.android.ugc.aweme.relation.b.c() || com.ss.android.ugc.aweme.relation.b.d()) {
                z = true;
            } else {
                z = false;
            }
            return new p<>(Boolean.valueOf(z), false);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(androidx.fragment.app.e eVar) {
            h.f.b.l.d(eVar, "");
            if (com.ss.android.ugc.aweme.relation.b.f()) {
                return false;
            }
            if (d() <= 1) {
                d();
                return false;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isLogin() && !in.f() && !com.ss.android.ugc.aweme.relation.b.g()) {
                return true;
            }
            return false;
        }
    }

    private b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.b.b$b  reason: collision with other inner class name */
    public static final class C3109b implements d {
        static {
            Covode.recordClassIndex(78296);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(androidx.fragment.app.e eVar) {
            h.f.b.l.d(eVar, "");
            return false;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(com.ss.android.ugc.aweme.relation.c cVar) {
            h.f.b.l.d(cVar, "");
            return true;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean b() {
            return false;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final int c() {
            return 0;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final p<Boolean, Boolean> a() {
            return new p<>(true, true);
        }
    }

    static {
        Covode.recordClassIndex(78294);
    }

    public static int b() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        if (g2.isNewUser()) {
            return 2;
        }
        return 3;
    }

    public static final class a implements d {
        static {
            Covode.recordClassIndex(78295);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final int c() {
            return 1;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean b() {
            int i2;
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
                Iterator<SocialPlatformSetting> it = socialPlatformSettings.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SocialPlatformSetting next = it.next();
                    if (next.getSocialPlatform() == 1) {
                        i2 = next.getOnBoardingRecStrategy();
                        break;
                    }
                }
            }
            i2 = 0;
            return c.b(i2);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final p<Boolean, Boolean> a() {
            List<SocialPlatformSetting> socialPlatformSettings;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            User curUser = g2.getCurUser();
            h.f.b.l.b(curUser, "");
            SocialDataStruct socialData = curUser.getSocialData();
            if (!(socialData == null || (socialPlatformSettings = socialData.getSocialPlatformSettings()) == null)) {
                for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                    if (socialPlatformSetting.getSocialPlatform() == 1) {
                        return new p<>(Boolean.valueOf(!c.a.f141661a.c()), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                    }
                }
            }
            return new p<>(true, true);
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(androidx.fragment.app.e eVar) {
            h.f.b.l.d(eVar, "");
            if (!c.a(b.e(1))) {
                return false;
            }
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            if (g2.isLogin() && !in.f() && b.b(1) && !com.bytedance.ies.powerpermissions.j.a((Activity) eVar, "android.permission.READ_CONTACTS")) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.relation.b.b.d
        public final boolean a(com.ss.android.ugc.aweme.relation.c cVar) {
            h.f.b.l.d(cVar, "");
            boolean z = true;
            int e2 = b.e(1);
            if (cVar.getType() == com.ss.android.ugc.aweme.relation.c.TRIGGER_IN_JOURNEY_FRONT.getType() && c.d(e2)) {
                z = false;
            }
            if (cVar.getType() != com.ss.android.ugc.aweme.relation.c.TRIGGER_IN_JOURNEY_BACK.getType() || !c.c(e2)) {
                return z;
            }
            return false;
        }
    }

    public static boolean a() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        User curUser = g2.getCurUser();
        h.f.b.l.b(curUser, "");
        return curUser.getSocialData().getEnablePermissionPopup();
    }

    private static t<FriendList<Friend>> c() {
        int b2 = b();
        c.b bVar = c.b.f141662a;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        String a2 = bVar.a(g2.getCurUserId());
        c.b bVar2 = c.b.f141662a;
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g3, "");
        t<FriendList<Friend>> a3 = com.ss.android.ugc.aweme.friends.api.a.a().getSocialFriendsWithScene("facebook", a2, null, Long.valueOf(bVar2.d(g3.getCurUserId())), Integer.valueOf(b2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a3, "");
        return a3;
    }

    private static t<FriendList<Friend>> d() {
        com.ss.android.ugc.aweme.friends.e.a.b("login_onboarding", "user", "facebook", "login", "uid", "auto", null);
        int b2 = b();
        c.b.f141662a.a(true);
        t<R> a2 = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(2, true).a((f.a.d.g<? super BaseResponse, ? extends x<? extends R>>) new m(b2), false).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a2, "");
        return a2;
    }

    private static t<FriendList<Friend>> e() {
        int b2 = b();
        com.ss.android.ugc.aweme.social.monitor.e eVar = com.ss.android.ugc.aweme.social.monitor.e.f133706b;
        int b3 = b();
        UUID randomUUID = UUID.randomUUID();
        h.f.b.l.b(randomUUID, "");
        com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(b3, randomUUID);
        t<R> a3 = a(a2, true).a((f.a.d.g<? super List<ContactModelV2>, ? extends x<? extends R>>) new g(a2, b2), false).d(h.f120354a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a3, "");
        return a3;
    }

    private static t<FriendList<Friend>> f() {
        int b2 = b();
        c.a.a(true);
        com.ss.android.ugc.aweme.social.monitor.e eVar = com.ss.android.ugc.aweme.social.monitor.e.f133706b;
        int b3 = b();
        UUID randomUUID = UUID.randomUUID();
        h.f.b.l.b(randomUUID, "");
        com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(b3, randomUUID);
        t<R> a3 = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(1, true).a((f.a.d.g<? super BaseResponse, ? extends x<? extends R>>) new j(a2), false).a((f.a.d.g<? super R, ? extends x<? extends R>>) new k(a2, b2), false).d(l.f120359a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        h.f.b.l.b(a3, "");
        return a3;
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final i f120355a = new i();

        static {
            Covode.recordClassIndex(78306);
        }

        i() {
        }

        @Override // f.a.w
        public final void subscribe(v<FriendList<Friend>> vVar) {
            h.f.b.l.d(vVar, "");
            vVar.a(new Exception("social platform not support!"));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        public static final n f120361a = new n();

        static {
            Covode.recordClassIndex(78311);
        }

        n() {
        }

        @Override // f.a.w
        public final void subscribe(v<FriendList<Friend>> vVar) {
            h.f.b.l.d(vVar, "");
            vVar.a(new Exception("social platform not support!"));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120350a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f120351b;

        static {
            Covode.recordClassIndex(78303);
        }

        f(com.ss.android.ugc.aweme.social.monitor.d dVar, boolean z) {
            this.f120350a = dVar;
            this.f120351b = z;
        }

        @Override // f.a.w
        public final void subscribe(v<List<ContactModelV2>> vVar) {
            h.f.b.l.d(vVar, "");
            this.f120350a.a();
            List<ContactModelV2> a2 = be.a(com.bytedance.ies.ugc.appcontext.d.a(), this.f120350a, this.f120351b);
            h.f.b.l.b(a2, "");
            vVar.a(a2);
            vVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final h f120354a = new h();

        static {
            Covode.recordClassIndex(78305);
        }

        h() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.relation.a aVar = (com.ss.android.ugc.aweme.relation.a) obj;
            h.f.b.l.d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f120305a);
            friendList.setLogPbBean(aVar.f120306b);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120356a;

        static {
            Covode.recordClassIndex(78307);
        }

        j(com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f120356a = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            this.f120356a.a();
            return b.a(this.f120356a, true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final l f120359a = new l();

        static {
            Covode.recordClassIndex(78309);
        }

        l() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.relation.a aVar = (com.ss.android.ugc.aweme.relation.a) obj;
            h.f.b.l.d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f120305a);
            friendList.setLogPbBean(aVar.f120306b);
            return friendList;
        }
    }

    private final t<FriendList<Friend>> f(int i2) {
        if (i2 == 1) {
            return e();
        }
        if (i2 == 2) {
            return c();
        }
        t<FriendList<Friend>> a2 = t.a(i.f120355a);
        h.f.b.l.b(a2, "");
        return a2;
    }

    private static t<FriendList<Friend>> g(int i2) {
        if (i2 == 1) {
            return f();
        }
        if (i2 == 2) {
            return d();
        }
        t<FriendList<Friend>> a2 = t.a(n.f120361a);
        h.f.b.l.b(a2, "");
        return a2;
    }

    /* access modifiers changed from: package-private */
    public static final class g<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120352a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f120353b;

        static {
            Covode.recordClassIndex(78304);
        }

        g(com.ss.android.ugc.aweme.social.monitor.d dVar, int i2) {
            this.f120352a = dVar;
            this.f120353b = i2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            h.f.b.l.d(list, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                return com.ss.android.ugc.aweme.friends.i.b.a(list, this.f120352a, this.f120353b);
            }
            t b2 = t.b(new com.ss.android.ugc.aweme.relation.a());
            h.f.b.l.b(b2, "");
            return b2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120357a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f120358b;

        static {
            Covode.recordClassIndex(78308);
        }

        k(com.ss.android.ugc.aweme.social.monitor.d dVar, int i2) {
            this.f120357a = dVar;
            this.f120358b = i2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            h.f.b.l.d(list, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                return com.ss.android.ugc.aweme.friends.i.b.a(list, this.f120357a, this.f120358b);
            }
            t b2 = t.b(new com.ss.android.ugc.aweme.relation.a());
            h.f.b.l.b(b2, "");
            return b2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f120360a;

        static {
            Covode.recordClassIndex(78310);
        }

        m(int i2) {
            this.f120360a = i2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            c.b bVar = c.b.f141662a;
            IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g2, "");
            String a2 = bVar.a(g2.getCurUserId());
            c.b bVar2 = c.b.f141662a;
            IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
            h.f.b.l.b(g3, "");
            return com.ss.android.ugc.aweme.friends.api.a.a().getSocialFriendsWithScene("facebook", a2, null, Long.valueOf(bVar2.d(g3.getCurUserId())), Integer.valueOf(this.f120360a));
        }
    }

    public static d a(int i2) {
        if (i2 == 1) {
            return new a();
        }
        if (i2 == 2) {
            return new c();
        }
        if (i2 != 3) {
            return new C3109b();
        }
        return new e();
    }

    public static int e(int i2) {
        List<SocialPlatformSetting> socialPlatformSettings;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        h.f.b.l.b(g2, "");
        User curUser = g2.getCurUser();
        h.f.b.l.b(curUser, "");
        SocialDataStruct socialData = curUser.getSocialData();
        if (!(socialData == null || (socialPlatformSettings = socialData.getSocialPlatformSettings()) == null)) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == i2) {
                    return socialPlatformSetting.getOnBoardingRecStrategy();
                }
            }
        }
        return 0;
    }

    public static boolean b(int i2) {
        com.ss.android.ugc.aweme.relation.c.c a2 = c.a.a();
        boolean z = a2.f120372a.getBoolean("go_through_social_recommend_flow".concat(String.valueOf(i2)), false);
        com.ss.android.ugc.aweme.relation.c.c a3 = c.a.a();
        long j2 = a3.f120372a.getLong("go_through_time_ms".concat(String.valueOf(i2)), -1);
        if (!z || System.currentTimeMillis() > j2 + (((long) gp.a()) * 86400000)) {
            return true;
        }
        return false;
    }

    public static com.ss.android.ugc.aweme.relation.a.a c(int i2) {
        if (i2 == 1) {
            String string = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bxs);
            h.f.b.l.b(string, "");
            String string2 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bxq);
            h.f.b.l.b(string2, "");
            String string3 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mt);
            h.f.b.l.b(string3, "");
            String string4 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mn);
            h.f.b.l.b(string4, "");
            String string5 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mo);
            h.f.b.l.b(string5, "");
            String string6 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.atu);
            h.f.b.l.b(string6, "");
            return new com.ss.android.ugc.aweme.relation.a.a(1, string, R.drawable.a_7, string2, string3, string4, string5, string6, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
        } else if (i2 != 2) {
            return null;
        } else {
            String string7 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bxs);
            h.f.b.l.b(string7, "");
            String string8 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.f160035ms);
            h.f.b.l.b(string8, "");
            String string9 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mq);
            h.f.b.l.b(string9, "");
            String string10 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mn);
            h.f.b.l.b(string10, "");
            String string11 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mo);
            h.f.b.l.b(string11, "");
            String string12 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.giu);
            h.f.b.l.b(string12, "");
            return new com.ss.android.ugc.aweme.relation.a.a(2, string7, 2131232086, string8, string9, string10, string11, string12, com.ss.android.ugc.aweme.relation.c.b.CONSENT.getValue());
        }
    }

    public static com.ss.android.ugc.aweme.relation.recommend.m d(int i2) {
        if (i2 == 1) {
            String string = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bl);
            h.f.b.l.b(string, "");
            String string2 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bj);
            h.f.b.l.b(string2, "");
            String string3 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bi);
            h.f.b.l.b(string3, "");
            String string4 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.ftp);
            h.f.b.l.b(string4, "");
            return new com.ss.android.ugc.aweme.relation.recommend.m(1, string, string2, string3, string4);
        } else if (i2 == 2) {
            String string5 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bl);
            h.f.b.l.b(string5, "");
            String string6 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bj);
            h.f.b.l.b(string6, "");
            String string7 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bi);
            h.f.b.l.b(string7, "");
            String string8 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.cgl);
            h.f.b.l.b(string8, "");
            return new com.ss.android.ugc.aweme.relation.recommend.m(2, string5, string6, string7, string8);
        } else if (i2 != 3) {
            return null;
        } else {
            String string9 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bl);
            h.f.b.l.b(string9, "");
            String string10 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bj);
            h.f.b.l.b(string10, "");
            String string11 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.bba);
            h.f.b.l.b(string11, "");
            String string12 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.cgl);
            h.f.b.l.b(string12, "");
            return new com.ss.android.ugc.aweme.relation.recommend.m(3, string9, string10, string11, string12);
        }
    }

    public static void b(int i2, int i3) {
        c.a.a().a(i2, i3);
    }

    public final t<FriendList<Friend>> a(boolean z, int i2) {
        if (z) {
            return f(i2);
        }
        return g(i2);
    }

    public static t<List<ContactModelV2>> a(com.ss.android.ugc.aweme.social.monitor.d dVar, boolean z) {
        h.f.b.l.d(dVar, "");
        t<List<ContactModelV2>> a2 = t.a(new f(dVar, z));
        h.f.b.l.b(a2, "");
        return a2;
    }

    public static com.ss.android.ugc.aweme.relation.a.a a(int i2, int i3) {
        if (i3 == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
            String string = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.dgi);
            h.f.b.l.b(string, "");
            String string2 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.dgh);
            h.f.b.l.b(string2, "");
            String string3 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.dgg);
            h.f.b.l.b(string3, "");
            String string4 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mn);
            h.f.b.l.b(string4, "");
            String string5 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mo);
            h.f.b.l.b(string5, "");
            String string6 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.giu);
            h.f.b.l.b(string6, "");
            return new com.ss.android.ugc.aweme.relation.a.a(i2, string, 2131232086, string2, string3, string4, string5, string6, i3);
        } else if (i3 != com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_CONTACT.getValue()) {
            return null;
        } else {
            String string7 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.dgi);
            h.f.b.l.b(string7, "");
            String string8 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.dgf);
            h.f.b.l.b(string8, "");
            String string9 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.dge);
            h.f.b.l.b(string9, "");
            String string10 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mn);
            h.f.b.l.b(string10, "");
            String string11 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.mo);
            h.f.b.l.b(string11, "");
            String string12 = com.bytedance.ies.ugc.appcontext.g.c().getString(R.string.atu);
            h.f.b.l.b(string12, "");
            return new com.ss.android.ugc.aweme.relation.a.a(i2, string7, R.drawable.a_7, string8, string9, string10, string11, string12, i3);
        }
    }
}
