package com.ss.android.ugc.aweme.viewModel;

import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviCreateRequest;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviEditRequest;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest;
import com.ss.android.ugc.aweme.profile.ak;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.User;
import h.z;
import java.io.File;
import java.util.Map;

public final class ProfileNaviCreatorViewModel extends BaseJediViewModel<ProfileNaviCreatorState> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f144304a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final String f144305b = "NaviCreatorViewModel";

    static {
        Covode.recordClassIndex(94453);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94454);
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel$a$a  reason: collision with other inner class name */
        public static final class C3849a extends h.f.b.m implements h.f.a.a<z> {
            final /* synthetic */ h.f.a.m $callback;
            final /* synthetic */ File $file;

            static {
                Covode.recordClassIndex(94455);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3849a(File file, h.f.a.m mVar) {
                super(0);
                this.$file = file;
                this.$callback = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                com.ss.android.ugc.aweme.common.w.a(this.$file, this.$callback, 0);
                return z.f158842a;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(File file, h.f.a.m<? super AvatarUri, ? super Boolean, z> mVar) {
            com.ss.android.ugc.aweme.model.b.a(new com.ss.android.ugc.aweme.model.a(new C3849a(file, mVar)));
        }
    }

    public static File b() {
        com.ss.android.ugc.aweme.model.c cVar = com.ss.android.ugc.aweme.model.r.f110812b;
        if (cVar != null) {
            return cVar.f110757b;
        }
        return null;
    }

    public static void i() {
        com.ss.android.ugc.aweme.model.b.a(new com.ss.android.ugc.aweme.model.a(y.f144333a));
    }

    public final void g() {
        d(u.f144327a);
        d(v.f144328a);
    }

    public final void h() {
        d(b.f144306a);
        d(c.f144307a);
    }

    public final void j() {
        com.ss.android.ugc.aweme.model.b.a(new com.ss.android.ugc.aweme.model.a(new p(this)));
    }

    /* access modifiers changed from: package-private */
    public static final class p extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ ProfileNaviCreatorViewModel this$0;

        static {
            Covode.recordClassIndex(94470);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        p(ProfileNaviCreatorViewModel profileNaviCreatorViewModel) {
            super(0);
            this.this$0 = profileNaviCreatorViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
            if (qVar != null) {
                String str = qVar.f110805a;
                if (str == null || str.length() == 0) {
                    this.this$0.a(0);
                } else {
                    this.this$0.b(0);
                }
            }
            return z.f158842a;
        }
    }

    public final void a() {
        ProfileNaviCreatorState profileNaviCreatorState = (ProfileNaviCreatorState) at_();
        profileNaviCreatorState.setProfileImageBackgroundColor(null);
        profileNaviCreatorState.setAnimationFileGenerated(false);
        profileNaviCreatorState.setContinueEditing(false);
        profileNaviCreatorState.setShouldGenerateAnimation(false);
        profileNaviCreatorState.setShouldSetAsProfileImage(false);
        profileNaviCreatorState.setShouldShowSetProfileView(false);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ProfileNaviCreatorState(null, false, false, false, false, false, false, false, null, 511, null);
    }

    static final class y extends h.f.b.m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f144333a = new y();

        static {
            Covode.recordClassIndex(94479);
        }

        y() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            UrlModel urlModel;
            UrlModel urlModel2;
            String str;
            com.ss.android.ugc.aweme.model.c cVar = com.ss.android.ugc.aweme.model.r.f110813c;
            if (!(cVar == null || (urlModel = cVar.f110756a) == null)) {
                com.ss.android.ugc.aweme.model.c cVar2 = com.ss.android.ugc.aweme.model.r.f110814d;
                if (cVar2 != null) {
                    urlModel2 = cVar2.f110756a;
                } else {
                    urlModel2 = null;
                }
                ak akVar = new ak();
                akVar.f115963d = urlModel.getUri();
                akVar.a(urlModel.getUri());
                com.ss.android.ugc.aweme.account.b.g().updateCurAvatar(urlModel, urlModel, urlModel);
                IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
                h.f.b.l.b(g2, "");
                User curUser = g2.getCurUser();
                h.f.b.l.b(curUser, "");
                curUser.setAvatarVideoUri(urlModel);
                if (urlModel2 != null) {
                    akVar.a(urlModel2.getUri());
                    IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
                    h.f.b.l.b(g3, "");
                    User curUser2 = g3.getCurUser();
                    h.f.b.l.b(curUser2, "");
                    curUser2.setAvatarVideoUri(urlModel2);
                }
                Map<String, String> a2 = akVar.a();
                h.f.b.l.b(a2, "");
                a2.put("page_from", "0");
                com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
                if (!(qVar == null || (str = qVar.f110805a) == null)) {
                    a2.put("navi_id", str);
                }
                if (urlModel2 != null) {
                    a2.put("video_icon", urlModel2.getUri());
                }
                com.ss.android.ugc.aweme.account.b.g().updateUserInfo(new WeakHandler(a.f144334a), a2);
            }
            return z.f158842a;
        }

        static final class a implements WeakHandler.IHandler {

            /* renamed from: a  reason: collision with root package name */
            public static final a f144334a = new a();

            static {
                Covode.recordClassIndex(94480);
            }

            a() {
            }

            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                com.ss.android.ugc.aweme.model.b.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviCreatorViewModel f144310a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144311b;

        static {
            Covode.recordClassIndex(94459);
        }

        e(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i2) {
            this.f144310a = profileNaviCreatorViewModel;
            this.f144311b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144310a.a(this.f144311b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviCreatorViewModel f144317a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144318b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144319c;

        static {
            Covode.recordClassIndex(94463);
        }

        i(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, String str, int i2) {
            this.f144317a = profileNaviCreatorViewModel;
            this.f144318b = str;
            this.f144319c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144317a.a(this.f144318b, this.f144319c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviCreatorViewModel f144331a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144332b;

        static {
            Covode.recordClassIndex(94478);
        }

        x(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i2) {
            this.f144331a = profileNaviCreatorViewModel;
            this.f144332b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144331a.b(this.f144332b + 1);
            }
        }
    }

    public final void a(String str) {
        h.f.b.l.d(str, "");
        d(new t(str));
    }

    static final class b extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f144306a = new b();

        static {
            Covode.recordClassIndex(94456);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, true, null, 383, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f144307a = new c();

        static {
            Covode.recordClassIndex(94457);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 383, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviCreatorViewModel f144308a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144309b;

        static {
            Covode.recordClassIndex(94458);
        }

        d(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i2) {
            this.f144308a = profileNaviCreatorViewModel;
            this.f144309b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.q qVar;
            com.ss.android.ugc.aweme.model.api.b.a aVar = (com.ss.android.ugc.aweme.model.api.b.a) obj;
            if (aVar == null) {
                return;
            }
            if (aVar.error_code == 0) {
                String str = aVar.f110703a;
                if (!(str == null || (qVar = com.ss.android.ugc.aweme.model.r.f110811a) == null)) {
                    qVar.f110805a = str;
                }
                com.ss.android.ugc.aweme.model.b.c();
                return;
            }
            this.f144308a.a(this.f144309b + 1);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f144312a = new f();

        static {
            Covode.recordClassIndex(94460);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, true, false, false, false, false, false, false, null, 509, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f144313a = new g();

        static {
            Covode.recordClassIndex(94461);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 509, null);
        }
    }

    public static final class j extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f144320a = new j();

        static {
            Covode.recordClassIndex(94464);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, true, false, false, false, false, false, null, 507, null);
        }
    }

    public static final class k extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f144321a = new k();

        static {
            Covode.recordClassIndex(94465);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 507, null);
        }
    }

    public static final class l extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f144322a = new l();

        static {
            Covode.recordClassIndex(94466);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, true, false, false, null, 479, null);
        }
    }

    public static final class m extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f144323a = new m();

        static {
            Covode.recordClassIndex(94467);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 479, null);
        }
    }

    public static final class n extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f144324a = new n();

        static {
            Covode.recordClassIndex(94468);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 479, null);
        }
    }

    public static final class r extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f144325a = new r();

        static {
            Covode.recordClassIndex(94472);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, true, false, null, 447, null);
        }
    }

    static final class t extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {
        final /* synthetic */ String $hex;

        static {
            Covode.recordClassIndex(94474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        t(String str) {
            super(1);
            this.$hex = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, this.$hex, false, false, false, false, false, false, false, null, 510, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class u extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f144327a = new u();

        static {
            Covode.recordClassIndex(94475);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, true, false, false, false, null, 495, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class v extends h.f.b.m implements h.f.a.b<ProfileNaviCreatorState, ProfileNaviCreatorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f144328a = new v();

        static {
            Covode.recordClassIndex(94476);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviCreatorState invoke(ProfileNaviCreatorState profileNaviCreatorState) {
            ProfileNaviCreatorState profileNaviCreatorState2 = profileNaviCreatorState;
            h.f.b.l.d(profileNaviCreatorState2, "");
            return ProfileNaviCreatorState.copy$default(profileNaviCreatorState2, null, false, false, false, false, false, false, false, null, 495, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class w<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviCreatorViewModel f144329a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144330b;

        static {
            Covode.recordClassIndex(94477);
        }

        w(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, int i2) {
            this.f144329a = profileNaviCreatorViewModel;
            this.f144330b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.api.b.b bVar = (com.ss.android.ugc.aweme.model.api.b.b) obj;
            if (bVar == null) {
                return;
            }
            if (bVar.error_code == 0) {
                com.ss.android.ugc.aweme.model.b.c();
            } else {
                this.f144329a.b(this.f144330b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviCreatorViewModel f144314a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144315b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144316c;

        static {
            Covode.recordClassIndex(94462);
        }

        h(ProfileNaviCreatorViewModel profileNaviCreatorViewModel, String str, int i2) {
            this.f144314a = profileNaviCreatorViewModel;
            this.f144315b = str;
            this.f144316c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.api.b.d dVar = (com.ss.android.ugc.aweme.model.api.b.d) obj;
            if (dVar == null) {
                return;
            }
            if (dVar.error_code == 0) {
                com.ss.android.ugc.aweme.model.api.a.b bVar = dVar.f110707a;
                if (bVar != null) {
                    com.ss.android.ugc.aweme.model.r.a(bVar);
                    this.f144314a.g();
                    return;
                }
                return;
            }
            this.f144314a.a(this.f144315b, this.f144316c + 1);
        }
    }

    public final void a(int i2) {
        if (i2 < 3) {
            if (i2 > 0) {
                com.ss.android.ugc.aweme.model.b.b();
                return;
            }
            com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
            if (qVar != null) {
                String b2 = new com.google.gson.f().b(qVar.a());
                h.f.b.l.b(b2, "");
                h.f.b.l.d(b2, "");
                h.f.b.l.b(ProfileNaviCreateRequest.f110713a.createNavi(b2).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this, i2), new e(this, i2)), "");
            }
        }
    }

    public final void b(int i2) {
        if (i2 < 3) {
            if (i2 > 0) {
                com.ss.android.ugc.aweme.model.b.b();
                return;
            }
            com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
            if (qVar != null) {
                String b2 = new com.google.gson.f().b(qVar.a());
                h.f.b.l.b(b2, "");
                h.f.b.l.d(b2, "");
                h.f.b.l.b(ProfileNaviEditRequest.f110719a.editNavi(b2).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new w(this, i2), new x(this, i2)), "");
            }
        }
    }

    public static final class q extends h.f.b.m implements h.f.a.m<AvatarUri, Boolean, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.q $navi;

        static {
            Covode.recordClassIndex(94471);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(com.ss.android.ugc.aweme.model.q qVar) {
            super(2);
            this.$navi = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(AvatarUri avatarUri, Boolean bool) {
            AvatarUri avatarUri2 = avatarUri;
            if (bool.booleanValue() || avatarUri2 == null) {
                com.ss.android.ugc.aweme.model.b.b();
            } else {
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(avatarUri2.urlList);
                urlModel.setUri(avatarUri2.uri);
                this.$navi.f110809e = urlModel;
                com.ss.android.ugc.aweme.model.c cVar = com.ss.android.ugc.aweme.model.r.f110812b;
                if (cVar != null) {
                    cVar.f110756a = urlModel;
                }
                com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
                if (qVar != null) {
                    qVar.f110809e = urlModel;
                }
                com.ss.android.ugc.aweme.model.b.c();
            }
            return z.f158842a;
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.m<AvatarUri, Boolean, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f144326a = new s();

        static {
            Covode.recordClassIndex(94473);
        }

        s() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(AvatarUri avatarUri, Boolean bool) {
            AvatarUri avatarUri2 = avatarUri;
            if (bool.booleanValue() || avatarUri2 == null) {
                com.ss.android.ugc.aweme.model.b.b();
            } else {
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(avatarUri2.urlList);
                urlModel.setUri(avatarUri2.uri);
                com.ss.android.ugc.aweme.model.c cVar = com.ss.android.ugc.aweme.model.r.f110813c;
                if (cVar != null) {
                    cVar.f110756a = urlModel;
                }
                com.ss.android.ugc.aweme.model.b.c();
            }
            return z.f158842a;
        }
    }

    public final void a(String str, int i2) {
        h.f.b.l.d(str, "");
        if (i2 < 3) {
            ProfileNaviInfoRequest.a.a(str).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this, str, i2), new i(this, str, i2));
        }
    }

    public static final class o extends h.f.b.m implements h.f.a.m<AvatarUri, Boolean, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.q $navi;
        final /* synthetic */ UrlModel $urlModel;

        static {
            Covode.recordClassIndex(94469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(UrlModel urlModel, com.ss.android.ugc.aweme.model.q qVar) {
            super(2);
            this.$urlModel = urlModel;
            this.$navi = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(AvatarUri avatarUri, Boolean bool) {
            AvatarUri avatarUri2 = avatarUri;
            if (bool.booleanValue() || avatarUri2 == null) {
                com.ss.android.ugc.aweme.model.b.b();
            } else {
                this.$urlModel.setUrlList(avatarUri2.urlList);
                this.$urlModel.setUri(avatarUri2.uri);
                this.$navi.f110810f = this.$urlModel;
                if (com.ss.android.ugc.aweme.model.r.f110811a != null) {
                    com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
                    if (qVar == null) {
                        h.f.b.l.b();
                    }
                    if (h.f.b.l.a((Object) qVar.f110805a, (Object) this.$navi.f110805a)) {
                        com.ss.android.ugc.aweme.model.c cVar = com.ss.android.ugc.aweme.model.r.f110814d;
                        if (cVar != null) {
                            cVar.f110756a = this.$urlModel;
                        }
                        com.ss.android.ugc.aweme.model.q qVar2 = com.ss.android.ugc.aweme.model.r.f110811a;
                        if (qVar2 != null) {
                            qVar2.f110810f = this.$urlModel;
                        }
                    }
                }
                com.ss.android.ugc.aweme.model.b.c();
            }
            return z.f158842a;
        }
    }
}
