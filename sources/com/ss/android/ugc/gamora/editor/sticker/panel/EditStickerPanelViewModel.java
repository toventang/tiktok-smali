package com.ss.android.ugc.gamora.editor.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.n;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.infoSticker.g;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.l;
import h.f.b.m;
import h.v;

public final class EditStickerPanelViewModel extends LifecycleAwareViewModel<EditStickerPanelState> implements a {

    /* renamed from: a  reason: collision with root package name */
    private final f.a.b.a f146703a = new f.a.b.a();

    /* renamed from: b  reason: collision with root package name */
    private final c f146704b;

    static {
        Covode.recordClassIndex(96584);
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.panel.a
    public final void a() {
        c(d.f146705a);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new EditStickerPanelState(null, null, null, null, null, null, 63, null);
    }

    @Override // androidx.lifecycle.ac, com.bytedance.jedi.arch.JediViewModel
    public final void onCleared() {
        super.onCleared();
        this.f146703a.dispose();
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.panel.a
    public final void a(g gVar) {
        l.d(gVar, "");
        this.f146704b.a(gVar);
    }

    static final class c extends m implements h.f.a.b<EditStickerPanelState, EditStickerPanelState> {
        final /* synthetic */ String $enterMethod;
        final /* synthetic */ boolean $show;

        static {
            Covode.recordClassIndex(96587);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(boolean z, String str) {
            super(1);
            this.$show = z;
            this.$enterMethod = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            l.d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, new k(this.$show), null, null, null, this.$enterMethod, null, 46, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends m implements h.f.a.b<EditStickerPanelState, EditStickerPanelState> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f146705a = new d();

        static {
            Covode.recordClassIndex(96588);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            l.d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, null, null, null, null, null, new a.b(), 31, null);
        }
    }

    public EditStickerPanelViewModel(c cVar) {
        l.d(cVar, "");
        this.f146704b = cVar;
    }

    static final class a extends m implements h.f.a.b<EditStickerPanelState, EditStickerPanelState> {
        final /* synthetic */ Effect $effect;
        final /* synthetic */ String $extras = null;

        static {
            Covode.recordClassIndex(96585);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Effect effect) {
            super(1);
            this.$effect = effect;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            l.d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, null, null, null, new n(v.a(this.$effect, this.$extras)), null, null, 55, null);
        }
    }

    static final class b extends m implements h.f.a.b<EditStickerPanelState, EditStickerPanelState> {
        final /* synthetic */ Effect $effect;
        final /* synthetic */ String $extras;

        static {
            Covode.recordClassIndex(96586);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Effect effect, String str) {
            super(1);
            this.$effect = effect;
            this.$extras = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ EditStickerPanelState invoke(EditStickerPanelState editStickerPanelState) {
            EditStickerPanelState editStickerPanelState2 = editStickerPanelState;
            l.d(editStickerPanelState2, "");
            return EditStickerPanelState.copy$default(editStickerPanelState2, null, new n(v.a(this.$effect, this.$extras)), null, null, null, null, 61, null);
        }
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.panel.a
    public final void a(Effect effect, String str) {
        l.d(effect, "");
        c(new b(effect, str));
    }

    @Override // com.ss.android.ugc.gamora.editor.sticker.panel.a
    public final void a(boolean z, String str) {
        l.d(str, "");
        c(new c(z, str));
    }
}
