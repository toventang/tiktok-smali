package com.ss.android.ugc.gamora.editor.gesture;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.filter.FilterBean;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.p;
import h.u;

public final class EditGestureViewModel extends LifecycleAwareViewModel<EditGestureState> implements a {

    /* renamed from: a  reason: collision with root package name */
    private final h f145950a = i.a((h.f.a.a) b.f145951a);

    static {
        Covode.recordClassIndex(95905);
    }

    static final class b extends m implements h.f.a.a<t<FilterBean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145951a = new b();

        static {
            Covode.recordClassIndex(95907);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<FilterBean> invoke() {
            return new t();
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.gesture.a
    public final void a() {
        d(d.f145952a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditGestureState(null, null, null, null, 15, null);
    }

    public static final class c extends m implements h.f.a.b<EditGestureState, EditGestureState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(95908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            l.d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, Boolean.valueOf(this.$value), null, null, null, 14, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditGestureState, EditGestureState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f145952a = new d();

        static {
            Covode.recordClassIndex(95909);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            l.d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, null, null, null, new a.b(), 7, null);
        }
    }

    public static final class a extends m implements h.f.a.b<EditGestureState, EditGestureState> {
        final /* synthetic */ long $duration = 300;
        final /* synthetic */ float $toY;

        static {
            Covode.recordClassIndex(95906);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(float f2) {
            super(1);
            this.$toY = f2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            l.d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, null, new n(new p(Float.valueOf(this.$toY), Long.valueOf(this.$duration))), null, null, 13, null);
        }
    }

    public static final class e extends m implements h.f.a.b<EditGestureState, EditGestureState> {
        final /* synthetic */ float $scale;
        final /* synthetic */ float $x;
        final /* synthetic */ float $y;

        static {
            Covode.recordClassIndex(95910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(float f2, float f3, float f4) {
            super(1);
            this.$scale = f2;
            this.$x = f3;
            this.$y = f4;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditGestureState invoke(EditGestureState editGestureState) {
            EditGestureState editGestureState2 = editGestureState;
            l.d(editGestureState2, "");
            return EditGestureState.copy$default(editGestureState2, null, null, new o(new u(Float.valueOf(this.$scale), Float.valueOf(this.$x), Float.valueOf(this.$y))), null, 11, null);
        }
    }
}
