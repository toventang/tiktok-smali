package com.ss.android.ugc.aweme.shortvideo.countdown;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import h.f.b.l;

public final class CountdownViewModel extends JediViewModel<CountdownState> {

    /* renamed from: a  reason: collision with root package name */
    public final CountdownState f125144a;

    static {
        Covode.recordClassIndex(82195);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* bridge */ /* synthetic */ CountdownState d() {
        return this.f125144a;
    }

    public CountdownViewModel(CountdownState countdownState) {
        l.d(countdownState, "");
        this.f125144a = countdownState;
    }
}
