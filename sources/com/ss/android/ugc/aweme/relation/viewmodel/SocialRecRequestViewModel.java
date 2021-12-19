package com.ss.android.ugc.aweme.relation.viewmodel;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.ss.android.ugc.aweme.friends.model.FriendList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public final class SocialRecRequestViewModel extends JediViewModel<SocialRecRequestState> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f120508c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public f.a.b.b f120509a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f120510b;

    static {
        Covode.recordClassIndex(78450);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78451);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final void b() {
        f.a.b.b d2 = f.a.t.b(2, TimeUnit.SECONDS).d(new h(this));
        h.f.b.l.b(d2, "");
        a(d2);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ SocialRecRequestState d() {
        return new SocialRecRequestState(false, false, false, false, false, false, null, 0, 0, false, 1023, null);
    }

    private final void a() {
        b();
        com.ss.android.ugc.aweme.friends.e.a.b("login_onboarding", "user", "contact", "login", "uid", "process", null);
        int b2 = com.ss.android.ugc.aweme.relation.b.b.b();
        c.a.a(true);
        com.ss.android.ugc.aweme.social.monitor.e eVar = com.ss.android.ugc.aweme.social.monitor.e.f133706b;
        UUID randomUUID = UUID.randomUUID();
        h.f.b.l.b(randomUUID, "");
        com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(b2, randomUUID);
        f.a.b.b a3 = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(1, true).a((f.a.d.g<? super BaseResponse, ? extends f.a.x<? extends R>>) new i(this, a2), false).a((f.a.d.g<? super R, ? extends f.a.x<? extends R>>) new j(a2, b2), false).d(k.f120532a).h(5, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new l(this), new m(this));
        h.f.b.l.b(a3, "");
        a(a3);
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120519a;

        static {
            Covode.recordClassIndex(78459);
        }

        e(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120519a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f120519a.c(AnonymousClass1.f120520a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120523a;

        static {
            Covode.recordClassIndex(78464);
        }

        g(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120523a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f120523a.c(AnonymousClass1.f120524a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120525a;

        static {
            Covode.recordClassIndex(78466);
        }

        h(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120525a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f120525a.c(AnonymousClass1.f120526a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120535a;

        static {
            Covode.recordClassIndex(78475);
        }

        m(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120535a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f120535a.c(AnonymousClass1.f120536a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120543a;

        static {
            Covode.recordClassIndex(78482);
        }

        p(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120543a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f120543a.c(AnonymousClass1.f120544a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class y<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120566a;

        static {
            Covode.recordClassIndex(78503);
        }

        y(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120566a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f120566a.c(AnonymousClass1.f120567a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final c f120513a = new c();

        static {
            Covode.recordClassIndex(78453);
        }

        c() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.relation.a aVar = (com.ss.android.ugc.aweme.relation.a) obj;
            h.f.b.l.d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f120305a);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120527a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120528b;

        static {
            Covode.recordClassIndex(78468);
        }

        i(SocialRecRequestViewModel socialRecRequestViewModel, com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f120527a = socialRecRequestViewModel;
            this.f120528b = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            this.f120527a.c(AnonymousClass1.f120529a);
            this.f120527a.f120510b = true;
            return com.ss.android.ugc.aweme.relation.b.b.a(this.f120528b, true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final k f120532a = new k();

        static {
            Covode.recordClassIndex(78471);
        }

        k() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.relation.a aVar = (com.ss.android.ugc.aweme.relation.a) obj;
            h.f.b.l.d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f120305a);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<SocialRecRequestState, SocialRecRequestState> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f120545a = new q();

        static {
            Covode.recordClassIndex(78484);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
            SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
            h.f.b.l.d(socialRecRequestState2, "");
            return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, true, null, 0, 0, false, 991, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.b<SocialRecRequestState, SocialRecRequestState> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f120546a = new r();

        static {
            Covode.recordClassIndex(78485);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
            SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
            h.f.b.l.d(socialRecRequestState2, "");
            return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, null, 1, 0, false, 895, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class s extends h.f.b.m implements h.f.a.b<SocialRecRequestState, SocialRecRequestState> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f120547a = new s();

        static {
            Covode.recordClassIndex(78486);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
            SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
            h.f.b.l.d(socialRecRequestState2, "");
            return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, true, null, 0, 0, false, 991, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120559b;

        static {
            Covode.recordClassIndex(78496);
        }

        u(SocialRecRequestViewModel socialRecRequestViewModel, com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f120558a = socialRecRequestViewModel;
            this.f120559b = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            this.f120558a.c(AnonymousClass1.f120560a);
            return com.ss.android.ugc.aweme.relation.b.b.a(this.f120559b, true);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        public static final w f120562a = new w();

        static {
            Covode.recordClassIndex(78499);
        }

        w() {
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.relation.a aVar = (com.ss.android.ugc.aweme.relation.a) obj;
            h.f.b.l.d(aVar, "");
            FriendList friendList = new FriendList();
            friendList.setFriends(aVar.f120305a);
            return friendList;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120511a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f120512b;

        static {
            Covode.recordClassIndex(78452);
        }

        b(com.ss.android.ugc.aweme.social.monitor.d dVar, int i2) {
            this.f120511a = dVar;
            this.f120512b = i2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            h.f.b.l.d(list, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                return com.ss.android.ugc.aweme.friends.i.b.a(list, this.f120511a, this.f120512b);
            }
            f.a.t b2 = f.a.t.b(new com.ss.android.ugc.aweme.relation.a());
            h.f.b.l.b(b2, "");
            return b2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120521a;

        static {
            Covode.recordClassIndex(78461);
        }

        f(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120521a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            final FriendList friendList = (FriendList) obj;
            if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f120521a.c(AnonymousClass1.f120522a);
            } else {
                this.f120521a.c(new h.f.a.b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.f.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(78463);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        h.f.b.l.d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120530a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f120531b;

        static {
            Covode.recordClassIndex(78470);
        }

        j(com.ss.android.ugc.aweme.social.monitor.d dVar, int i2) {
            this.f120530a = dVar;
            this.f120531b = i2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            h.f.b.l.d(list, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                return com.ss.android.ugc.aweme.friends.i.b.a(list, this.f120530a, this.f120531b);
            }
            f.a.t b2 = f.a.t.b(new com.ss.android.ugc.aweme.relation.a());
            h.f.b.l.b(b2, "");
            return b2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120533a;

        static {
            Covode.recordClassIndex(78472);
        }

        l(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120533a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            final FriendList friendList = (FriendList) obj;
            if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f120533a.c(AnonymousClass1.f120534a);
            } else {
                this.f120533a.c(new h.f.a.b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.l.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(78474);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        h.f.b.l.d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120537a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120538b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f120539c;

        static {
            Covode.recordClassIndex(78477);
        }

        n(SocialRecRequestViewModel socialRecRequestViewModel, String str, int i2) {
            this.f120537a = socialRecRequestViewModel;
            this.f120538b = str;
            this.f120539c = i2;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            h.f.b.l.d(obj, "");
            this.f120537a.c(AnonymousClass1.f120540a);
            this.f120537a.f120510b = true;
            return com.ss.android.ugc.aweme.friends.api.a.a().getSocialFriendsWithScene("facebook", c.b.f141662a.a(this.f120538b), null, Long.valueOf(c.b.f141662a.d(this.f120538b)), Integer.valueOf(this.f120539c));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120541a;

        static {
            Covode.recordClassIndex(78479);
        }

        o(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120541a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            final FriendList friendList = (FriendList) obj;
            if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f120541a.c(AnonymousClass1.f120542a);
            } else {
                this.f120541a.c(new h.f.a.b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.o.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(78481);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        h.f.b.l.d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v<T, R> implements f.a.d.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f120561a;

        static {
            Covode.recordClassIndex(78498);
        }

        v(com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f120561a = dVar;
        }

        @Override // f.a.d.g
        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            h.f.b.l.d(list, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
                return com.ss.android.ugc.aweme.friends.i.b.a(list, this.f120561a, 4);
            }
            f.a.t b2 = f.a.t.b(new com.ss.android.ugc.aweme.relation.a());
            h.f.b.l.b(b2, "");
            return b2;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120563a;

        static {
            Covode.recordClassIndex(78500);
        }

        x(SocialRecRequestViewModel socialRecRequestViewModel) {
            this.f120563a = socialRecRequestViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            FriendList friendList = (FriendList) obj;
            if (!(friendList == null || (friends = friendList.getFriends()) == null || !(!friends.isEmpty()))) {
                this.f120563a.c(AnonymousClass1.f120564a);
            }
            this.f120563a.c(AnonymousClass2.f120565a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120514a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f120515b;

        static {
            Covode.recordClassIndex(78454);
        }

        d(SocialRecRequestViewModel socialRecRequestViewModel, boolean z) {
            this.f120514a = socialRecRequestViewModel;
            this.f120515b = z;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List friends;
            List friends2;
            final FriendList friendList = (FriendList) obj;
            if (this.f120515b) {
                if (!(friendList == null || (friends2 = friendList.getFriends()) == null || !(!friends2.isEmpty()))) {
                    this.f120514a.c(AnonymousClass1.f120516a);
                }
                this.f120514a.c(AnonymousClass2.f120517a);
            } else if (friendList == null || (friends = friendList.getFriends()) == null || friends.isEmpty()) {
                this.f120514a.c(AnonymousClass3.f120518a);
            } else {
                this.f120514a.c(new h.f.a.b<SocialRecRequestState, SocialRecRequestState>() {
                    /* class com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.d.AnonymousClass4 */

                    static {
                        Covode.recordClassIndex(78458);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // h.f.a.b
                    public final /* synthetic */ SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState) {
                        SocialRecRequestState socialRecRequestState2 = socialRecRequestState;
                        h.f.b.l.d(socialRecRequestState2, "");
                        return SocialRecRequestState.copy$default(socialRecRequestState2, false, false, false, false, false, false, friendList, 0, 0, false, 959, null);
                    }
                });
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class t<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SocialRecRequestViewModel f120548a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f120549b;

        static {
            Covode.recordClassIndex(78487);
        }

        t(SocialRecRequestViewModel socialRecRequestViewModel, String str) {
            this.f120548a = socialRecRequestViewModel;
            this.f120549b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.ufr.d dVar = (com.ss.android.ugc.aweme.ufr.d) obj;
            if (dVar.f141690b.f141691a && dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.SYNC_STATUS) {
                this.f120548a.c(AnonymousClass1.f120550a);
                this.f120548a.f120510b = true;
                String a2 = c.b.f141662a.a(this.f120549b);
                long d2 = c.b.f141662a.d(this.f120549b);
                SocialRecRequestViewModel socialRecRequestViewModel = this.f120548a;
                f.a.b.b a3 = com.ss.android.ugc.aweme.friends.api.a.a().getSocialFriendsWithScene("facebook", a2, null, Long.valueOf(d2), 4).h(5, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.t.AnonymousClass2 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ t f120551a;

                    static {
                        Covode.recordClassIndex(78489);
                    }

                    {
                        this.f120551a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        List friends;
                        FriendList friendList = (FriendList) obj;
                        if (!(friendList == null || (friends = friendList.getFriends()) == null || !(!friends.isEmpty()))) {
                            this.f120551a.f120548a.c(AnonymousClass1.f120552a);
                        }
                        this.f120551a.f120548a.c(AnonymousClass2.f120553a);
                    }
                }, new f.a.d.f(this) {
                    /* class com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.t.AnonymousClass3 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ t f120554a;

                    static {
                        Covode.recordClassIndex(78492);
                    }

                    {
                        this.f120554a = r1;
                    }

                    @Override // f.a.d.f
                    public final /* synthetic */ void accept(Object obj) {
                        this.f120554a.f120548a.c(AnonymousClass1.f120555a);
                    }
                });
                h.f.b.l.b(a3, "");
                socialRecRequestViewModel.a(a3);
                f.a.b.b bVar = this.f120548a.f120509a;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f120548a.f120509a = null;
            } else if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.REQUEST_ACTUAL_PERMISSION) {
                if (!dVar.f141690b.f141691a) {
                    f.a.b.b bVar2 = this.f120548a.f120509a;
                    if (bVar2 != null) {
                        bVar2.dispose();
                    }
                    this.f120548a.f120509a = null;
                    this.f120548a.c(AnonymousClass4.f120556a);
                }
            } else if (dVar.f141689a == com.ss.android.ugc.aweme.ufr.g.REQUEST_UID_PERMISSION && !dVar.f141690b.f141691a) {
                f.a.b.b bVar3 = this.f120548a.f120509a;
                if (bVar3 != null) {
                    bVar3.dispose();
                }
                this.f120548a.f120509a = null;
                this.f120548a.c(AnonymousClass5.f120557a);
            }
        }
    }

    private final void a(String str) {
        b();
        int b2 = com.ss.android.ugc.aweme.relation.b.b.b();
        f.a.b.b a2 = com.ss.android.ugc.aweme.friends.api.a.a().getSocialFriendsWithScene("facebook", c.b.f141662a.a(str), null, Long.valueOf(c.b.f141662a.d(str)), Integer.valueOf(b2)).h(5, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this), new g(this));
        h.f.b.l.b(a2, "");
        a(a2);
    }

    private final void a(boolean z) {
        int b2;
        b();
        if (z) {
            b2 = 4;
        } else {
            b2 = com.ss.android.ugc.aweme.relation.b.b.b();
        }
        com.ss.android.ugc.aweme.social.monitor.e eVar = com.ss.android.ugc.aweme.social.monitor.e.f133706b;
        UUID randomUUID = UUID.randomUUID();
        h.f.b.l.b(randomUUID, "");
        com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(b2, randomUUID);
        f.a.b.b a3 = com.ss.android.ugc.aweme.relation.b.b.a(a2, true).a((f.a.d.g<? super List<ContactModelV2>, ? extends f.a.x<? extends R>>) new b(a2, b2), false).d(c.f120513a).h(5, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this, z), new e(this));
        h.f.b.l.b(a3, "");
        a(a3);
    }

    private final void a(String str, int i2) {
        if (i2 == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) {
            Activity j2 = com.bytedance.ies.ugc.appcontext.f.j();
            if (j2 != null) {
                User c2 = in.c();
                h.f.b.l.b(c2, "");
                this.f120509a = com.ss.android.ugc.aweme.ufr.b.a(j2, com.ss.android.ugc.aweme.ufr.a.a.class, c2.getUid(), "version_update", "auto", false).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).d(new t(this, str));
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.friends.e.a.b("version_update", "user", "contact", "auto", "uid", "process", null);
        c.a.a(true);
        com.ss.android.ugc.aweme.social.monitor.e eVar = com.ss.android.ugc.aweme.social.monitor.e.f133706b;
        UUID randomUUID = UUID.randomUUID();
        h.f.b.l.b(randomUUID, "");
        com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(4, randomUUID);
        f.a.b.b a3 = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(1, true).a((f.a.d.g<? super BaseResponse, ? extends f.a.x<? extends R>>) new u(this, a2), false).a((f.a.d.g<? super R, ? extends f.a.x<? extends R>>) new v(a2), false).d(w.f120562a).h(5, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new x(this), new y(this));
        h.f.b.l.b(a3, "");
        a(a3);
    }

    private final void a(String str, String str2) {
        b();
        com.ss.android.ugc.aweme.friends.e.a.b("login_onboarding", "user", "facebook", "login", "uid", str2, null);
        int b2 = com.ss.android.ugc.aweme.relation.b.b.b();
        c.b.f141662a.a(true);
        f.a.b.b a2 = com.ss.android.ugc.aweme.friends.api.a.a().syncSocialRelationStatusInRx(2, true).a((f.a.d.g<? super BaseResponse, ? extends f.a.x<? extends R>>) new n(this, str, b2), false).h(5, TimeUnit.SECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new o(this), new p(this));
        h.f.b.l.b(a2, "");
        a(a2);
    }

    public final void a(String str, int i2, int i3, String str2) {
        h.f.b.l.d(str, "");
        h.f.b.l.d(str2, "");
        if (i2 == 1) {
            boolean a2 = c.a.f141661a.a();
            if (!c.a.f141661a.b()) {
                c(q.f120545a);
            } else if (a2) {
                a(false);
            } else {
                a();
            }
        } else if (i2 != 2) {
            if (i2 == 3) {
                if (i3 != com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_CONTACT.getValue()) {
                    a(str, i3);
                } else if (!c.a.f141661a.b()) {
                    c(s.f120547a);
                } else if (c.a.f141661a.a()) {
                    c(r.f120546a);
                    a(true);
                } else {
                    a(str, i3);
                }
            }
        } else if (c.b.f141662a.a()) {
            a(str);
        } else {
            a(str, str2);
        }
    }
}
