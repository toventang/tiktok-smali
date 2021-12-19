package com.ss.android.ugc.aweme.following.ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import h.f.b.l;
import h.f.b.m;

public final class FollowRelationTabViewModel extends JediViewModel<FollowRelationState> {
    static {
        Covode.recordClassIndex(61255);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ FollowRelationState d() {
        return new FollowRelationState(false, 0, 0, 0, false, null, 63, null);
    }

    public final void a(int i2) {
        c(new a(i2));
    }

    public final void b(boolean z) {
        c(new b(z));
    }

    static final class a extends m implements h.f.a.b<FollowRelationState, FollowRelationState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(61256);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            l.d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, false, 0, this.$value, 0, false, null, 59, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<FollowRelationState, FollowRelationState> {
        final /* synthetic */ boolean $isFollowingTab;

        static {
            Covode.recordClassIndex(61257);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(boolean z) {
            super(1);
            this.$isFollowingTab = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            l.d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, false, 0, 0, 0, this.$isFollowingTab, null, 47, null);
        }
    }

    static final class c extends m implements h.f.a.b<FollowRelationState, FollowRelationState> {
        final /* synthetic */ boolean $isSearching;

        static {
            Covode.recordClassIndex(61258);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$isSearching = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            l.d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, this.$isSearching, 0, 0, 0, false, null, 62, null);
        }
    }

    static final class d extends m implements h.f.a.b<FollowRelationState, FollowRelationState> {
        final /* synthetic */ String $tabIndex;

        static {
            Covode.recordClassIndex(61259);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(1);
            this.$tabIndex = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            l.d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, false, 0, 0, 0, false, this.$tabIndex, 31, null);
        }
    }

    public final void a(String str) {
        l.d(str, "");
        c(new d(str));
    }

    public final void a(boolean z) {
        d(new c(z));
    }
}
