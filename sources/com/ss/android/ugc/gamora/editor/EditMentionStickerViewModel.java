package com.ss.android.ugc.gamora.editor;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class EditMentionStickerViewModel extends JediViewModel<EditMentionStickerState> {

    /* renamed from: a  reason: collision with root package name */
    private final h f145656a = i.a((h.f.a.a) c.f145658a);

    static {
        Covode.recordClassIndex(95660);
    }

    public final t<Float> a() {
        return (t) this.f145656a.getValue();
    }

    static final class c extends m implements h.f.a.a<t<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f145658a = new c();

        static {
            Covode.recordClassIndex(95663);
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
        c(b.f145657a);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ EditMentionStickerState d() {
        return new EditMentionStickerState(null, false, null, 7, null);
    }

    public static final class a extends m implements h.f.a.b<EditMentionStickerState, EditMentionStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(95661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMentionStickerState invoke(EditMentionStickerState editMentionStickerState) {
            EditMentionStickerState editMentionStickerState2 = editMentionStickerState;
            l.d(editMentionStickerState2, "");
            return EditMentionStickerState.copy$default(editMentionStickerState2, null, false, Boolean.valueOf(this.$value), 3, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditMentionStickerState, EditMentionStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145657a = new b();

        static {
            Covode.recordClassIndex(95662);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditMentionStickerState invoke(EditMentionStickerState editMentionStickerState) {
            EditMentionStickerState editMentionStickerState2 = editMentionStickerState;
            l.d(editMentionStickerState2, "");
            return EditMentionStickerState.copy$default(editMentionStickerState2, new p(), false, null, 6, null);
        }
    }

    public final void a(float f2) {
        a().setValue(Float.valueOf(f2));
    }
}
