package com.ss.android.ugc.gamora.editor.sticker.qa;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditQaStickerState extends UiState {
    private final Boolean enableEdit;
    private final p hideHelpBoxEvent;
    private final a ui;
    private final float viewAlpha;

    static {
        Covode.recordClassIndex(96670);
    }

    public EditQaStickerState() {
        this(null, null, null, 0.0f, 15, null);
    }

    public static /* synthetic */ EditQaStickerState copy$default(EditQaStickerState editQaStickerState, a aVar, p pVar, Boolean bool, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = editQaStickerState.getUi();
        }
        if ((i2 & 2) != 0) {
            pVar = editQaStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 4) != 0) {
            bool = editQaStickerState.enableEdit;
        }
        if ((i2 & 8) != 0) {
            f2 = editQaStickerState.viewAlpha;
        }
        return editQaStickerState.copy(aVar, pVar, bool, f2);
    }

    public final a component1() {
        return getUi();
    }

    public final p component2() {
        return this.hideHelpBoxEvent;
    }

    public final Boolean component3() {
        return this.enableEdit;
    }

    public final float component4() {
        return this.viewAlpha;
    }

    public final EditQaStickerState copy(a aVar, p pVar, Boolean bool, float f2) {
        l.d(aVar, "");
        return new EditQaStickerState(aVar, pVar, bool, f2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditQaStickerState)) {
            return false;
        }
        EditQaStickerState editQaStickerState = (EditQaStickerState) obj;
        return l.a(getUi(), editQaStickerState.getUi()) && l.a(this.hideHelpBoxEvent, editQaStickerState.hideHelpBoxEvent) && l.a(this.enableEdit, editQaStickerState.enableEdit) && Float.compare(this.viewAlpha, editQaStickerState.viewAlpha) == 0;
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        p pVar = this.hideHelpBoxEvent;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        Boolean bool = this.enableEdit;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return ((hashCode2 + i2) * 31) + com_ss_android_ugc_gamora_editor_sticker_qa_EditQaStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.viewAlpha);
    }

    public final String toString() {
        return "EditQaStickerState(ui=" + getUi() + ", hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ", viewAlpha=" + this.viewAlpha + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final float getViewAlpha() {
        return this.viewAlpha;
    }

    public static int com_ss_android_ugc_gamora_editor_sticker_qa_EditQaStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditQaStickerState(a aVar, p pVar, Boolean bool, float f2) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
        this.viewAlpha = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditQaStickerState(a aVar, p pVar, Boolean bool, float f2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : pVar, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? 1.0f : f2);
    }
}
