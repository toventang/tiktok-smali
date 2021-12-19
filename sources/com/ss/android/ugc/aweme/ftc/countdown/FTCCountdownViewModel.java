package com.ss.android.ugc.aweme.ftc.countdown;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import h.f.b.l;

public final class FTCCountdownViewModel extends JediViewModel<FTCCountdownState> {

    /* renamed from: a  reason: collision with root package name */
    public final FTCCountdownState f98319a;

    static {
        Covode.recordClassIndex(62533);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* bridge */ /* synthetic */ FTCCountdownState d() {
        return this.f98319a;
    }

    public FTCCountdownViewModel(FTCCountdownState fTCCountdownState) {
        l.d(fTCCountdownState, "");
        this.f98319a = fTCCountdownState;
    }
}
