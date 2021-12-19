package com.ss.android.ugc.gamora.editor;

import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class EditCommentStickerViewModel extends BaseJediViewModel<EditCommentStickerState> {

    /* renamed from: a  reason: collision with root package name */
    t<Boolean> f145648a;

    /* renamed from: b  reason: collision with root package name */
    private final h f145649b = i.a((h.f.a.a) e.f145652a);

    static {
        Covode.recordClassIndex(95648);
    }

    public final t<Float> b() {
        return (t) this.f145649b.getValue();
    }

    static final class e extends m implements h.f.a.a<t<Float>> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f145652a = new e();

        static {
            Covode.recordClassIndex(95653);
        }

        e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Float> invoke() {
            return new t();
        }
    }

    public final void a() {
        c(a.f145650a);
    }

    public final void g() {
        c(b.f145651a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditCommentStickerState(null, false, null, null, 15, null);
    }

    public final void a(float f2) {
        b().setValue(Float.valueOf(f2));
    }

    static final class a extends m implements h.f.a.b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f145650a = new a();

        static {
            Covode.recordClassIndex(95649);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            l.d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, new p(), false, null, null, 14, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditCommentStickerState, EditCommentStickerState> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f145651a = new b();

        static {
            Covode.recordClassIndex(95650);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            l.d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, null, false, null, new p(), 7, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<EditCommentStickerState, EditCommentStickerState> {
        final /* synthetic */ boolean $hasCommentSticker;

        static {
            Covode.recordClassIndex(95651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z) {
            super(1);
            this.$hasCommentSticker = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            l.d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, null, false, new k(this.$hasCommentSticker), null, 11, null);
        }
    }

    static final class d extends m implements h.f.a.b<EditCommentStickerState, EditCommentStickerState> {
        final /* synthetic */ boolean $value;

        static {
            Covode.recordClassIndex(95652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(boolean z) {
            super(1);
            this.$value = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditCommentStickerState invoke(EditCommentStickerState editCommentStickerState) {
            EditCommentStickerState editCommentStickerState2 = editCommentStickerState;
            l.d(editCommentStickerState2, "");
            return EditCommentStickerState.copy$default(editCommentStickerState2, null, this.$value, null, null, 13, null);
        }
    }

    public final void a(boolean z) {
        c(new c(z));
    }

    public final void b(boolean z) {
        c(new d(z));
        t<Boolean> tVar = this.f145648a;
        if (tVar != null && (!l.a(tVar.getValue(), Boolean.valueOf(z)))) {
            tVar.setValue(Boolean.valueOf(z));
        }
    }
}
