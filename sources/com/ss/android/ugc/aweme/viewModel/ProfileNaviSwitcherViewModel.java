package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.model.api.request.ProfileNaviListRequest;
import com.ss.android.ugc.aweme.model.api.request.c;
import h.f.b.l;
import h.f.b.m;

public final class ProfileNaviSwitcherViewModel extends BaseJediViewModel<ProfileNaviSwitcherState> {
    static {
        Covode.recordClassIndex(94546);
    }

    public final void b() {
        d(g.f144414a);
        d(h.f144415a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ProfileNaviSwitcherState(null, false, false, false, false, 31, null);
    }

    public final void a() {
        ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) at_();
        profileNaviSwitcherState.getNaviList().clear();
        profileNaviSwitcherState.setHasMore(true);
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviSwitcherViewModel f144410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144411b;

        static {
            Covode.recordClassIndex(94550);
        }

        d(ProfileNaviSwitcherViewModel profileNaviSwitcherViewModel, int i2) {
            this.f144410a = profileNaviSwitcherViewModel;
            this.f144411b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            if (obj != null) {
                this.f144410a.a(this.f144411b + 1);
            }
        }
    }

    public static final class a extends m implements h.f.a.b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144406a = new a();

        static {
            Covode.recordClassIndex(94547);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            l.d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, true, 15, null);
        }
    }

    public static final class b extends m implements h.f.a.b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f144407a = new b();

        static {
            Covode.recordClassIndex(94548);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            l.d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, false, 15, null);
        }
    }

    public static final class e extends m implements h.f.a.b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f144412a = new e();

        static {
            Covode.recordClassIndex(94551);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            l.d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, true, false, 23, null);
        }
    }

    public static final class f extends m implements h.f.a.b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f144413a = new f();

        static {
            Covode.recordClassIndex(94552);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            l.d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, false, 23, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f144414a = new g();

        static {
            Covode.recordClassIndex(94553);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            l.d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, true, false, false, 27, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h extends m implements h.f.a.b<ProfileNaviSwitcherState, ProfileNaviSwitcherState> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f144415a = new h();

        static {
            Covode.recordClassIndex(94554);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSwitcherState invoke(ProfileNaviSwitcherState profileNaviSwitcherState) {
            ProfileNaviSwitcherState profileNaviSwitcherState2 = profileNaviSwitcherState;
            l.d(profileNaviSwitcherState2, "");
            return ProfileNaviSwitcherState.copy$default(profileNaviSwitcherState2, null, false, false, false, false, 27, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviSwitcherViewModel f144408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f144409b;

        static {
            Covode.recordClassIndex(94549);
        }

        c(ProfileNaviSwitcherViewModel profileNaviSwitcherViewModel, int i2) {
            this.f144408a = profileNaviSwitcherViewModel;
            this.f144409b = i2;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            com.ss.android.ugc.aweme.model.api.b.e eVar = (com.ss.android.ugc.aweme.model.api.b.e) obj;
            if (eVar != null) {
                boolean z = true;
                if (eVar.error_code != 0) {
                    this.f144408a.a(this.f144409b + 1);
                } else if (eVar.f110710c != null) {
                    ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) this.f144408a.at_();
                    profileNaviSwitcherState.getNaviList().addAll(eVar.f110710c);
                    if (eVar.f110709b != 1) {
                        z = false;
                    }
                    profileNaviSwitcherState.setHasMore(z);
                    this.f144408a.b();
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 < 3) {
            ProfileNaviSwitcherState profileNaviSwitcherState = (ProfileNaviSwitcherState) at_();
            if (profileNaviSwitcherState.getHasMore()) {
                c.a aVar = new c.a();
                aVar.f110751a = profileNaviSwitcherState.getNaviList().size();
                l.b(ProfileNaviListRequest.a.a(aVar.a()).b(f.a.h.a.d(f.a.k.a.f158004a)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new c(this, i2), new d(this, i2)), "");
                return;
            }
            b();
        }
    }
}
