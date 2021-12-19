package com.ss.android.ugc.gamora.editor.lightening.canvas;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditPhotoCanvasState extends UiState {
    private final a ui;

    static {
        Covode.recordClassIndex(96052);
    }

    public EditPhotoCanvasState() {
        this(null, 1, null);
    }

    public static /* synthetic */ EditPhotoCanvasState copy$default(EditPhotoCanvasState editPhotoCanvasState, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = editPhotoCanvasState.getUi();
        }
        return editPhotoCanvasState.copy(aVar);
    }

    public final a component1() {
        return getUi();
    }

    public final EditPhotoCanvasState copy(a aVar) {
        l.d(aVar, "");
        return new EditPhotoCanvasState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EditPhotoCanvasState) && l.a(getUi(), ((UiState) obj).getUi());
        }
        return true;
    }

    public final int hashCode() {
        a ui2 = getUi();
        if (ui2 != null) {
            return ui2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "EditPhotoCanvasState(ui=" + getUi() + ")";
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoCanvasState(a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditPhotoCanvasState(a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.b() : aVar);
    }
}
