package com.ss.android.ugc.gamora.editor.sticker.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditDuetStickerState extends UiState {
    private final Boolean enableEdit;
    private final p hideHelpBoxEvent;
    private final a ui;
    private final float viewAlpha;

    static {
        Covode.recordClassIndex(96486);
    }

    public EditDuetStickerState() {
        this(null, null, 0.0f, null, 15, null);
    }

    public static /* synthetic */ EditDuetStickerState copy$default(EditDuetStickerState editDuetStickerState, p pVar, Boolean bool, float f2, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editDuetStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 2) != 0) {
            bool = editDuetStickerState.enableEdit;
        }
        if ((i2 & 4) != 0) {
            f2 = editDuetStickerState.viewAlpha;
        }
        if ((i2 & 8) != 0) {
            aVar = editDuetStickerState.getUi();
        }
        return editDuetStickerState.copy(pVar, bool, f2, aVar);
    }

    public final p component1() {
        return this.hideHelpBoxEvent;
    }

    public final Boolean component2() {
        return this.enableEdit;
    }

    public final float component3() {
        return this.viewAlpha;
    }

    public final a component4() {
        return getUi();
    }

    public final EditDuetStickerState copy(p pVar, Boolean bool, float f2, a aVar) {
        l.d(aVar, "");
        return new EditDuetStickerState(pVar, bool, f2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditDuetStickerState)) {
            return false;
        }
        EditDuetStickerState editDuetStickerState = (EditDuetStickerState) obj;
        return l.a(this.hideHelpBoxEvent, editDuetStickerState.hideHelpBoxEvent) && l.a(this.enableEdit, editDuetStickerState.enableEdit) && Float.compare(this.viewAlpha, editDuetStickerState.viewAlpha) == 0 && l.a(getUi(), editDuetStickerState.getUi());
    }

    public final int hashCode() {
        p pVar = this.hideHelpBoxEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.enableEdit;
        int hashCode2 = (((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + com_ss_android_ugc_gamora_editor_sticker_duet_EditDuetStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.viewAlpha)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "EditDuetStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ", viewAlpha=" + this.viewAlpha + ", ui=" + getUi() + ")";
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

    public static int com_ss_android_ugc_gamora_editor_sticker_duet_EditDuetStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditDuetStickerState(p pVar, Boolean bool, float f2, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
        this.viewAlpha = f2;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditDuetStickerState(p pVar, Boolean bool, float f2, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? 1.0f : f2, (i2 & 8) != 0 ? new a.C1131a() : aVar);
    }
}
