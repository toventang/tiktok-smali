package com.ss.android.ugc.gamora.editor;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class EditHashTagStickerViewModel extends JediViewModel<EditHashTagStickerState> {

    /* renamed from: a  reason: collision with root package name */
    private final h f145653a = i.a((h.f.a.a) c.f145655a);

    static {
        Covode.recordClassIndex(95655);
    }

    public final t<Float> a() {
        return (t) this.f145653a.getValue();
    }

    static final class c extends m implements h.f.a.a<t<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f145655a = new c();

        static {
            Covode.recordClassIndex(95658);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Float> invoke() {
            return new t();
        }
    }

    public final void b() {
        c(b.f145654a);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ EditHashTagStickerState d() {
        return new EditHashTagStickerState(null, null, 3, null);
    }

    public static final class a extends m implements h.f.a.b<EditHashTagStickerState, EditHashTagStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(95656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditHashTagStickerState invoke(EditHashTagStickerState editHashTagStickerState) {
            EditHashTagStickerState editHashTagStickerState2 = editHashTagStickerState;
            l.d(editHashTagStickerState2, "");
            return EditHashTagStickerState.copy$default(editHashTagStickerState2, null, Boolean.valueOf(this.$value), 1, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditHashTagStickerState, EditHashTagStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145654a = new b();

        static {
            Covode.recordClassIndex(95657);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditHashTagStickerState invoke(EditHashTagStickerState editHashTagStickerState) {
            EditHashTagStickerState editHashTagStickerState2 = editHashTagStickerState;
            l.d(editHashTagStickerState2, "");
            return EditHashTagStickerState.copy$default(editHashTagStickerState2, new p(), null, 2, null);
        }
    }

    public final void a(float f2) {
        a().setValue(Float.valueOf(f2));
    }
}
