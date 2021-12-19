package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import h.f.b.m;
import h.h;
import h.i;

public final class CutVideoMultiBottomViewModel extends BaseJediViewModel<CutVideoMultiBottomState> {

    /* renamed from: a  reason: collision with root package name */
    private final h f125534a = i.a((h.f.a.a) a.f125535a);

    static {
        Covode.recordClassIndex(82407);
    }

    static final class a extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f125535a = new a();

        static {
            Covode.recordClassIndex(82408);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            return new t();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new CutVideoMultiBottomState(null, 1, null);
    }
}
