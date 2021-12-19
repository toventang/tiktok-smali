package com.ss.android.ugc.aweme.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import h.f.b.l;
import h.f.b.m;

public final class ProfileNaviSpinnerViewModel extends BaseJediViewModel<ProfileNaviSpinnerState> {
    static {
        Covode.recordClassIndex(94542);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ProfileNaviSpinnerState(false, 1, null);
    }

    public static final class a extends m implements h.f.a.b<ProfileNaviSpinnerState, ProfileNaviSpinnerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f144404a = new a();

        static {
            Covode.recordClassIndex(94543);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSpinnerState invoke(ProfileNaviSpinnerState profileNaviSpinnerState) {
            ProfileNaviSpinnerState profileNaviSpinnerState2 = profileNaviSpinnerState;
            l.d(profileNaviSpinnerState2, "");
            return profileNaviSpinnerState2.copy(false);
        }
    }

    public static final class b extends m implements h.f.a.b<ProfileNaviSpinnerState, ProfileNaviSpinnerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f144405a = new b();

        static {
            Covode.recordClassIndex(94544);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviSpinnerState invoke(ProfileNaviSpinnerState profileNaviSpinnerState) {
            ProfileNaviSpinnerState profileNaviSpinnerState2 = profileNaviSpinnerState;
            l.d(profileNaviSpinnerState2, "");
            return profileNaviSpinnerState2.copy(true);
        }
    }
}
