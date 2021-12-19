package com.ss.android.ugc.aweme.profile.viewmodel;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ab;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.vm.ScopeViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

public final class ProfileViewModel extends JediViewModel<ProfileState> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f117498a = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(75904);
        }

        /* renamed from: com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel$a$a  reason: collision with other inner class name */
        public static final class C2982a implements ad.b {
            static {
                Covode.recordClassIndex(75905);
            }

            C2982a() {
            }

            @Override // androidx.lifecycle.ad.b
            public final <T extends ac> T a(Class<T> cls) {
                h.f.b.l.d(cls, "");
                return new ProfileViewModel();
            }
        }

        private a() {
        }

        /* access modifiers changed from: package-private */
        public static final class b extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {

            /* renamed from: a  reason: collision with root package name */
            public static final b f117499a = new b();

            static {
                Covode.recordClassIndex(75906);
            }

            b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
                h.f.b.l.d(profileState, "");
                return profileState;
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ProfileViewModel a(Fragment fragment) {
            h.f.b.l.d(fragment, "");
            ac a2 = a(ae.a(fragment, new C2982a()), ProfileViewModel.class.getName(), ProfileViewModel.class);
            h.f.b.l.b(a2, "");
            ProfileViewModel profileViewModel = (ProfileViewModel) a2;
            profileViewModel.a_(b.f117499a);
            return profileViewModel;
        }

        private static ac a(ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.a(str, cls);
            }
            ac a2 = adVar.a(str, cls);
            ab.a(a2, adVar);
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(75903);
    }

    public final void a() {
        c(new k());
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ ProfileState d() {
        return new ProfileState(null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33554431, null);
    }

    public final void b(List<? extends Aweme> list) {
        c(new l(list));
    }

    public final void c(boolean z) {
        c(new j(z));
    }

    public final void d(boolean z) {
        c(new h(z));
    }

    public final void a(User user) {
        h.f.b.l.d(user, "");
        c(new n(user));
    }

    public final void b(boolean z) {
        c(new g(z));
    }

    public static final class b extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ int $pos;

        static {
            Covode.recordClassIndex(75907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i2) {
            super(1);
            this.$pos = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, this.$pos, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33554367, null);
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ int $currentCommentSetting;

        static {
            Covode.recordClassIndex(75908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i2) {
            super(1);
            this.$currentCommentSetting = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, Integer.valueOf(this.$currentCommentSetting), null, null, 29360127, null);
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ int $currentDownloadSetting;

        static {
            Covode.recordClassIndex(75909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(int i2) {
            super(1);
            this.$currentDownloadSetting = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, Integer.valueOf(this.$currentDownloadSetting), false, null, null, null, null, 33030143, null);
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ String $enterFrom;

        static {
            Covode.recordClassIndex(75910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(1);
            this.$enterFrom = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, this.$enterFrom, null, null, null, null, false, false, false, null, false, null, null, null, null, 33552383, null);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ String $from;

        static {
            Covode.recordClassIndex(75911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.$from = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, this.$from, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33553407, null);
        }
    }

    static final class g extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ boolean $isGuideUserCard;

        static {
            Covode.recordClassIndex(75912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.$isGuideUserCard = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, Boolean.valueOf(this.$isGuideUserCard), null, false, false, false, null, false, null, null, null, null, 33538047, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ boolean $onHiddenChanged;

        static {
            Covode.recordClassIndex(75913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(boolean z) {
            super(1);
            this.$onHiddenChanged = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, this.$onHiddenChanged, null, null, null, null, 32505855, null);
        }
    }

    static final class i extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ boolean $isPostAwemeEmpty;

        static {
            Covode.recordClassIndex(75914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(boolean z) {
            super(1);
            this.$isPostAwemeEmpty = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, Boolean.valueOf(this.$isPostAwemeEmpty), null, null, false, false, false, null, false, null, null, null, null, 33546239, null);
        }
    }

    static final class j extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ boolean $isPostAwemeEmpty;

        static {
            Covode.recordClassIndex(75915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(boolean z) {
            super(1);
            this.$isPostAwemeEmpty = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, Boolean.valueOf(this.$isPostAwemeEmpty), false, false, false, null, false, null, null, null, null, 33521663, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ boolean $isPostGuideShow = false;

        static {
            Covode.recordClassIndex(75916);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, Boolean.valueOf(this.$isPostGuideShow), null, null, null, false, false, false, null, false, null, null, null, null, 33550335, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ List $firstRefreshAwemeList;

        static {
            Covode.recordClassIndex(75917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(List list) {
            super(1);
            this.$firstRefreshAwemeList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, this.$firstRefreshAwemeList, 16777215, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ List $firstRefreshAwemeList;

        static {
            Covode.recordClassIndex(75918);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(List list) {
            super(1);
            this.$firstRefreshAwemeList = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, this.$firstRefreshAwemeList, null, 25165823, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n extends h.f.b.m implements h.f.a.b<ProfileState, ProfileState> {
        final /* synthetic */ User $u;

        static {
            Covode.recordClassIndex(75919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(User user) {
            super(1);
            this.$u = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileState invoke(ProfileState profileState) {
            ProfileState profileState2 = profileState;
            h.f.b.l.d(profileState2, "");
            return ProfileState.copy$default(profileState2, null, null, this.$u, null, null, 0, 0, false, null, null, null, null, null, null, null, null, false, false, false, null, false, null, null, null, null, 33554427, null);
        }
    }

    public final void a(List<? extends Aweme> list) {
        c(new m(list));
    }

    public final void a(boolean z) {
        c(new i(z));
    }
}
