package com.ss.android.ugc.aweme.profile.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import h.f.a.b;
import h.f.b.l;

public final class MyProfileGuideViewModel extends JediViewModel<MyProfileGuideState> {
    static {
        Covode.recordClassIndex(75900);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ MyProfileGuideState d() {
        return new MyProfileGuideState(false, false, false, false, null, null, null, false, false, false, null, null, null, null, 16383, null);
    }

    public final void g(b<? super MyProfileGuideState, MyProfileGuideState> bVar) {
        l.d(bVar, "");
        c(bVar);
    }
}
