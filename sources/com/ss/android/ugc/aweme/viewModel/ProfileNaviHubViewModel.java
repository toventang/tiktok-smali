package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviDeleteRequest;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest;
import com.ss.android.ugc.aweme.model.api.request.a;
import com.ss.android.ugc.aweme.model.api.request.c;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.model.r;
import h.z;
import java.util.List;

public final class ProfileNaviHubViewModel extends BaseJediViewModel<ProfileNaviHubState> {
    static {
        Covode.recordClassIndex(94508);
    }

    private final void g() {
        d(k.f144374a);
        d(l.f144375a);
    }

    public final void b() {
        d(a.f144358a);
        d(b.f144359a);
    }

    public final void a() {
        ProfileNaviHubState profileNaviHubState = (ProfileNaviHubState) at_();
        profileNaviHubState.setContinueEditing(false);
        profileNaviHubState.setDoneCreatingProfileImage(false);
        profileNaviHubState.setCreateProfileImage(false);
        profileNaviHubState.setDoneNaviExperience(false);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ProfileNaviHubState(false, false, false, false, false, false, false, false, 255, null);
    }

    /* access modifiers changed from: package-private */
    public static final class f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviHubViewModel f144364a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144365b;

        static {
            Covode.recordClassIndex(94514);
        }

        f(ProfileNaviHubViewModel profileNaviHubViewModel, int i2) {
            this.f144364a = profileNaviHubViewModel;
            this.f144365b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144364a.a(this.f144365b + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviHubViewModel f144371a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f144372b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144373c;

        static {
            Covode.recordClassIndex(94518);
        }

        j(ProfileNaviHubViewModel profileNaviHubViewModel, h.f.a.b bVar, int i2) {
            this.f144371a = profileNaviHubViewModel;
            this.f144372b = bVar;
            this.f144373c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144371a.a(this.f144372b, this.f144373c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144358a = new a();

        static {
            Covode.recordClassIndex(94509);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, true, false, false, false, false, false, 251, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f144359a = new b();

        static {
            Covode.recordClassIndex(94510);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 251, null);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f144360a = new c();

        static {
            Covode.recordClassIndex(94511);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, true, false, false, 223, null);
        }
    }

    static final class d extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f144361a = new d();

        static {
            Covode.recordClassIndex(94512);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 223, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviHubViewModel f144362a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144363b;

        static {
            Covode.recordClassIndex(94513);
        }

        e(ProfileNaviHubViewModel profileNaviHubViewModel, int i2) {
            this.f144362a = profileNaviHubViewModel;
            this.f144363b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            if (baseResponse != null && baseResponse.error_code != 0) {
                this.f144362a.a(this.f144363b + 1);
            }
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f144366a = new g();

        static {
            Covode.recordClassIndex(94515);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, true, false, false, false, false, 247, null);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f144367a = new h();

        static {
            Covode.recordClassIndex(94516);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 247, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f144374a = new k();

        static {
            Covode.recordClassIndex(94519);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, true, false, false, false, 239, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f144375a = new l();

        static {
            Covode.recordClassIndex(94520);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 239, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f144376a = new n();

        static {
            Covode.recordClassIndex(94522);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, true, false, 191, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ProfileNaviHubState, ProfileNaviHubState> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f144377a = new o();

        static {
            Covode.recordClassIndex(94523);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviHubState invoke(ProfileNaviHubState profileNaviHubState) {
            ProfileNaviHubState profileNaviHubState2 = profileNaviHubState;
            h.f.b.l.d(profileNaviHubState2, "");
            return ProfileNaviHubState.copy$default(profileNaviHubState2, false, false, false, false, false, false, false, false, 191, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviHubViewModel f144368a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h.f.a.b f144369b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f144370c;

        static {
            Covode.recordClassIndex(94517);
        }

        i(ProfileNaviHubViewModel profileNaviHubViewModel, h.f.a.b bVar, int i2) {
            this.f144368a = profileNaviHubViewModel;
            this.f144369b = bVar;
            this.f144370c = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.api.b.e eVar = (com.ss.android.ugc.aweme.model.api.b.e) obj;
            if (eVar == null) {
                return;
            }
            if (eVar.error_code == 0) {
                List<com.ss.android.ugc.aweme.model.api.a.b> list = eVar.f110710c;
                if (list == null || list.isEmpty()) {
                    this.f144369b.invoke(false);
                } else {
                    this.f144369b.invoke(true);
                }
            } else {
                this.f144368a.a(this.f144369b, this.f144370c + 1);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ ProfileNaviHubViewModel this$0;

        static {
            Covode.recordClassIndex(94521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(ProfileNaviHubViewModel profileNaviHubViewModel) {
            super(1);
            this.this$0 = profileNaviHubViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            if (bool.booleanValue()) {
                ProfileNaviHubViewModel profileNaviHubViewModel = this.this$0;
                profileNaviHubViewModel.d(n.f144376a);
                profileNaviHubViewModel.d(o.f144377a);
            } else {
                ProfileNaviHubViewModel profileNaviHubViewModel2 = this.this$0;
                profileNaviHubViewModel2.d(c.f144360a);
                profileNaviHubViewModel2.d(d.f144361a);
            }
            return z.f158842a;
        }
    }

    public final void a(int i2) {
        String str;
        if (i2 < 3) {
            q qVar = r.f110811a;
            if (!(qVar == null || (str = qVar.f110805a) == null)) {
                ProfileNaviDeleteRequest.a.a(new a.C2827a().a(str).a()).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new e(this, i2), new f(this, i2));
            }
            g();
        }
    }

    public final void a(boolean z) {
        if (z) {
            a(new m(this), 0);
        }
        ((ProfileNaviHubState) at_()).setShouldShowSwitcher(z);
    }

    public final void a(h.f.a.b<? super Boolean, z> bVar, int i2) {
        if (i2 >= 3) {
            bVar.invoke(false);
        }
        c.a aVar = new c.a();
        aVar.f110751a = 0;
        ProfileNaviListRequest.a.a(aVar.a()).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new i(this, bVar, i2), new j(this, bVar, i2));
    }
}
