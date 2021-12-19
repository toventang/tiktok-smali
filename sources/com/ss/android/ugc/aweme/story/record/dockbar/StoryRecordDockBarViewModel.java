package com.ss.android.ugc.aweme.story.record.dockbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class StoryRecordDockBarViewModel extends BaseJediViewModel<StoryRecordDockBarState> {
    static {
        Covode.recordClassIndex(90395);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new StoryRecordDockBarState(null, 1, null);
    }

    static final class a extends m implements b<StoryRecordDockBarState, StoryRecordDockBarState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f138199a = new a();

        static {
            Covode.recordClassIndex(90396);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryRecordDockBarState invoke(StoryRecordDockBarState storyRecordDockBarState) {
            StoryRecordDockBarState storyRecordDockBarState2 = storyRecordDockBarState;
            l.d(storyRecordDockBarState2, "");
            return storyRecordDockBarState2.copy(new p());
        }
    }
}
