package com.ss.android.ugc.aweme.viewModel;

import android.content.SharedPreferences;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviInfoRequest;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarListRequest;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviStarterAvatarRequest;
import com.ss.android.ugc.aweme.model.t;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.List;

public final class ProfileNaviOnboardingViewModel extends BaseJediViewModel<ProfileNaviOnboardingState> {

    /* renamed from: d  reason: collision with root package name */
    public static final String f144378d = "profile_navi_onboarding_tutorial_shown";

    /* renamed from: e  reason: collision with root package name */
    public static final a f144379e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f144380a = 1500;

    /* renamed from: b  reason: collision with root package name */
    public Handler f144381b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f144382c;

    public static final class a {
        static {
            Covode.recordClassIndex(94526);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        ((ProfileNaviOnboardingState) at_()).setStarterAvatarSelected(null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ProfileNaviOnboardingState(null, null, null, 7, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f144381b.removeCallbacksAndMessages(null);
    }

    public static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviOnboardingViewModel f144395a;

        static {
            Covode.recordClassIndex(94535);
        }

        public h(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel) {
            this.f144395a = profileNaviOnboardingViewModel;
        }

        public final void run() {
            this.f144395a.c(AnonymousClass1.f144396a);
            this.f144395a.f144381b.postDelayed(new Runnable(this) {
                /* class com.ss.android.ugc.aweme.viewModel.ProfileNaviOnboardingViewModel.h.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h f144397a;

                static {
                    Covode.recordClassIndex(94537);
                }

                {
                    this.f144397a = r1;
                }

                public final void run() {
                    this.f144397a.f144395a.b();
                }
            }, this.f144395a.f144380a);
        }
    }

    static {
        Covode.recordClassIndex(94525);
    }

    public final void b() {
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putBoolean;
        c(f.f144393a);
        SharedPreferences sharedPreferences = this.f144382c;
        if (!(sharedPreferences == null || (edit = sharedPreferences.edit()) == null || (putBoolean = edit.putBoolean(f144378d, true)) == null)) {
            putBoolean.apply();
        }
        a(0);
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviOnboardingViewModel f144386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144387b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144388c;

        static {
            Covode.recordClassIndex(94529);
        }

        c(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, String str, int i2) {
            this.f144386a = profileNaviOnboardingViewModel;
            this.f144387b = str;
            this.f144388c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144386a.a(this.f144387b, this.f144388c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviOnboardingViewModel f144391a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144392b;

        static {
            Covode.recordClassIndex(94532);
        }

        e(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, int i2) {
            this.f144391a = profileNaviOnboardingViewModel;
            this.f144392b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144391a.a(this.f144392b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviOnboardingViewModel f144401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f144402b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144403c;

        static {
            Covode.recordClassIndex(94540);
        }

        j(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, t tVar, int i2) {
            this.f144401a = profileNaviOnboardingViewModel;
            this.f144402b = tVar;
            this.f144403c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144401a.a(this.f144402b, this.f144403c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviOnboardingViewModel f144383a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f144384b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144385c;

        static {
            Covode.recordClassIndex(94527);
        }

        b(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, String str, int i2) {
            this.f144383a = profileNaviOnboardingViewModel;
            this.f144384b = str;
            this.f144385c = i2;
        }

        static final class a extends m implements h.f.a.b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {
            final /* synthetic */ com.ss.android.ugc.aweme.model.api.a.b $it;

            static {
                Covode.recordClassIndex(94528);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(com.ss.android.ugc.aweme.model.api.a.b bVar) {
                super(1);
                this.$it = bVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
                ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
                l.d(profileNaviOnboardingState2, "");
                return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, null, null, this.$it, 3, null);
            }
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
                    this.f144383a.d(new a(bVar));
                    return;
                }
                return;
            }
            this.f144383a.a(this.f144384b, this.f144385c + 1);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviOnboardingViewModel f144389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144390b;

        static {
            Covode.recordClassIndex(94530);
        }

        d(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, int i2) {
            this.f144389a = profileNaviOnboardingViewModel;
            this.f144390b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.api.b.f fVar = (com.ss.android.ugc.aweme.model.api.b.f) obj;
            if (fVar == null) {
                return;
            }
            if (fVar.error_code == 0) {
                this.f144389a.d(new a(this, fVar));
            } else {
                this.f144389a.a(this.f144390b + 1);
            }
        }

        static final class a extends m implements h.f.a.b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {
            final /* synthetic */ com.ss.android.ugc.aweme.model.api.b.f $resp$inlined;
            final /* synthetic */ d this$0;

            static {
                Covode.recordClassIndex(94531);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d dVar, com.ss.android.ugc.aweme.model.api.b.f fVar) {
                super(1);
                this.this$0 = dVar;
                this.$resp$inlined = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
                com.ss.android.ugc.aweme.model.api.a.g image;
                UrlModel thumbnailUrl;
                List<String> urlList;
                ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
                l.d(profileNaviOnboardingState2, "");
                com.ss.android.ugc.aweme.model.api.b.f fVar = this.$resp$inlined;
                l.d(fVar, "");
                ArrayList arrayList = new ArrayList();
                List<com.ss.android.ugc.aweme.model.api.a.f> list = fVar.f110711a;
                if (list != null) {
                    for (com.ss.android.ugc.aweme.model.api.a.f fVar2 : list) {
                        String id = fVar2.getId();
                        if (!(id == null || id.length() == 0 || (image = fVar2.getImage()) == null || (thumbnailUrl = image.getThumbnailUrl()) == null || (urlList = thumbnailUrl.getUrlList()) == null || urlList.size() <= 0)) {
                            String id2 = fVar2.getId();
                            if (id2 == null) {
                                l.b();
                            }
                            String str = urlList.get(0);
                            l.b(str, "");
                            arrayList.add(new t(id2, str));
                        }
                    }
                }
                return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, null, arrayList, null, 5, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f144393a = new f();

        static {
            Covode.recordClassIndex(94533);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
            ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
            l.d(profileNaviOnboardingState2, "");
            return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, new a(b.DEFAULT, 2), null, null, 6, null);
        }
    }

    public static final class g extends m implements h.f.a.b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f144394a = new g();

        static {
            Covode.recordClassIndex(94534);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
            ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
            l.d(profileNaviOnboardingState2, "");
            return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, new a(b.TUTORIAL_1, 2), null, null, 6, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviOnboardingViewModel f144398a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f144399b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144400c;

        static {
            Covode.recordClassIndex(94538);
        }

        i(ProfileNaviOnboardingViewModel profileNaviOnboardingViewModel, t tVar, int i2) {
            this.f144398a = profileNaviOnboardingViewModel;
            this.f144399b = tVar;
            this.f144400c = i2;
        }

        static final class a extends m implements h.f.a.b<ProfileNaviOnboardingState, ProfileNaviOnboardingState> {
            final /* synthetic */ List $it;

            static {
                Covode.recordClassIndex(94539);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(List list) {
                super(1);
                this.$it = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // h.f.a.b
            public final /* synthetic */ ProfileNaviOnboardingState invoke(ProfileNaviOnboardingState profileNaviOnboardingState) {
                ProfileNaviOnboardingState profileNaviOnboardingState2 = profileNaviOnboardingState;
                l.d(profileNaviOnboardingState2, "");
                return ProfileNaviOnboardingState.copy$default(profileNaviOnboardingState2, null, null, new com.ss.android.ugc.aweme.model.api.a.b(null, null, null, null, this.$it, null, 47, null), 3, null);
            }
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.api.b.g gVar = (com.ss.android.ugc.aweme.model.api.b.g) obj;
            if (gVar == null) {
                return;
            }
            if (gVar.error_code == 0) {
                List<com.ss.android.ugc.aweme.model.api.a.c> list = gVar.f110712a;
                if (list != null) {
                    this.f144398a.d(new a(list));
                    return;
                }
                return;
            }
            this.f144398a.a(this.f144399b, this.f144400c + 1);
        }
    }

    public final void a(int i2) {
        if (i2 < 3) {
            ProfileNaviStarterAvatarListRequest.f110731a.getStarterAvatar().b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new d(this, i2), new e(this, i2));
        }
    }

    public final void a(t tVar, int i2) {
        l.d(tVar, "");
        if (i2 < 3) {
            ProfileNaviStarterAvatarRequest.a.a(tVar.a()).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new i(this, tVar, i2), new j(this, tVar, i2));
        }
    }

    public final void a(String str, int i2) {
        l.d(str, "");
        if (i2 < 3) {
            ProfileNaviInfoRequest.a.a(str).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new b(this, str, i2), new c(this, str, i2));
        }
    }
}
