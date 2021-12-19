package com.ss.android.ugc.gamora.editor.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import h.f.a.b;
import h.f.b.l;
import h.f.b.m;

public final class ReplaceMusicToolbarViewModel extends LifecycleAwareViewModel<ReplaceMusicEditToolbarState> implements aa {
    static {
        Covode.recordClassIndex(96833);
    }

    @Override // com.ss.android.ugc.gamora.editor.toolbar.aa
    public final void a() {
        c(a.f147008a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ReplaceMusicEditToolbarState(new a.b(), null, null, null, 14, null);
    }

    static final class a extends m implements b<ReplaceMusicEditToolbarState, ReplaceMusicEditToolbarState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f147008a = new a();

        static {
            Covode.recordClassIndex(96834);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ReplaceMusicEditToolbarState invoke(ReplaceMusicEditToolbarState replaceMusicEditToolbarState) {
            ReplaceMusicEditToolbarState replaceMusicEditToolbarState2 = replaceMusicEditToolbarState;
            l.d(replaceMusicEditToolbarState2, "");
            return ReplaceMusicEditToolbarState.copy$default(replaceMusicEditToolbarState2, null, null, new p(), null, 11, null);
        }
    }
}
