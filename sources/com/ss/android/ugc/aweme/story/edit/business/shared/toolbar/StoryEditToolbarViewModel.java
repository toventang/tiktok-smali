package com.ss.android.ugc.aweme.story.edit.business.shared.toolbar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.b.l;
import h.f.b.m;
import java.util.List;

public final class StoryEditToolbarViewModel extends LifecycleAwareViewModel<StoryEditToolbarState> implements d {

    /* renamed from: a  reason: collision with root package name */
    private final t<n> f137458a = new t<>();

    static {
        Covode.recordClassIndex(89901);
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d
    public final LiveData<n> a() {
        return this.f137458a;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new StoryEditToolbarState(new a.b(), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
    }

    public final void a(int i2) {
        c(new h(i2));
    }

    public final void b(int i2) {
        c(new b(i2));
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d
    public final void c(boolean z) {
        c(new e(z));
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d
    public final void d(boolean z) {
        c(new d(z));
    }

    static final class f extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ List $value;

        static {
            Covode.recordClassIndex(89907);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(List list) {
            super(1);
            this.$value = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, this.$value, null, null, null, null, null, null, null, null, null, null, 4093, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d
    public final void a(n nVar) {
        l.d(nVar, "");
        this.f137458a.setValue(nVar);
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d
    public final void b(boolean z) {
        c(new a(z));
    }

    static final class a extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ boolean $isVisible;

        static {
            Covode.recordClassIndex(89902);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(boolean z) {
            super(1);
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, Boolean.valueOf(this.$isVisible), null, null, null, null, 3967, null);
        }
    }

    static final class b extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(89903);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, Integer.valueOf(this.$value), null, null, null, null, null, null, null, null, 4087, null);
        }
    }

    static final class c extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ boolean $isVisible;

        static {
            Covode.recordClassIndex(89904);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.$isVisible), 2047, null);
        }
    }

    static final class d extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ boolean $mute;

        static {
            Covode.recordClassIndex(89905);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$mute = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.$mute), null, 3071, null);
        }
    }

    static final class e extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ boolean $isVisible;

        static {
            Covode.recordClassIndex(89906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.$isVisible), null, null, 3583, null);
        }
    }

    static final class g extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ boolean $isVisible;

        static {
            Covode.recordClassIndex(89908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z) {
            super(1);
            this.$isVisible = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, null, null, null, null, null, null, Boolean.valueOf(this.$isVisible), null, null, null, 3839, null);
        }
    }

    static final class h extends m implements h.f.a.b<StoryEditToolbarState, StoryEditToolbarState> {
        final /* synthetic */ int $value;

        static {
            Covode.recordClassIndex(89909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(int i2) {
            super(1);
            this.$value = i2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ StoryEditToolbarState invoke(StoryEditToolbarState storyEditToolbarState) {
            StoryEditToolbarState storyEditToolbarState2 = storyEditToolbarState;
            l.d(storyEditToolbarState2, "");
            return StoryEditToolbarState.copy$default(storyEditToolbarState2, null, null, Integer.valueOf(this.$value), null, null, null, null, null, null, null, null, null, 4091, null);
        }
    }

    public final void a(List<o> list) {
        l.d(list, "");
        c(new f(list));
    }

    @Override // com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d
    public final void a(boolean z) {
        c(new g(z));
    }
}
