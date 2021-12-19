package com.ss.android.ugc.gamora.editor.sticker.livecd;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditLiveCDStickerState extends UiState {
    private final Boolean enableEdit;
    private final p hideHelpBoxEvent;
    private final p reloadInteractStickerStruct;
    private final a ui;
    private final float viewAlpha;

    static {
        Covode.recordClassIndex(96553);
    }

    public EditLiveCDStickerState() {
        this(null, null, 0.0f, null, null, 31, null);
    }

    public static /* synthetic */ EditLiveCDStickerState copy$default(EditLiveCDStickerState editLiveCDStickerState, p pVar, Boolean bool, float f2, p pVar2, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = editLiveCDStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 2) != 0) {
            bool = editLiveCDStickerState.enableEdit;
        }
        if ((i2 & 4) != 0) {
            f2 = editLiveCDStickerState.viewAlpha;
        }
        if ((i2 & 8) != 0) {
            pVar2 = editLiveCDStickerState.reloadInteractStickerStruct;
        }
        if ((i2 & 16) != 0) {
            aVar = editLiveCDStickerState.getUi();
        }
        return editLiveCDStickerState.copy(pVar, bool, f2, pVar2, aVar);
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

    public final p component4() {
        return this.reloadInteractStickerStruct;
    }

    public final a component5() {
        return getUi();
    }

    public final EditLiveCDStickerState copy(p pVar, Boolean bool, float f2, p pVar2, a aVar) {
        l.d(aVar, "");
        return new EditLiveCDStickerState(pVar, bool, f2, pVar2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditLiveCDStickerState)) {
            return false;
        }
        EditLiveCDStickerState editLiveCDStickerState = (EditLiveCDStickerState) obj;
        return l.a(this.hideHelpBoxEvent, editLiveCDStickerState.hideHelpBoxEvent) && l.a(this.enableEdit, editLiveCDStickerState.enableEdit) && Float.compare(this.viewAlpha, editLiveCDStickerState.viewAlpha) == 0 && l.a(this.reloadInteractStickerStruct, editLiveCDStickerState.reloadInteractStickerStruct) && l.a(getUi(), editLiveCDStickerState.getUi());
    }

    public final int hashCode() {
        p pVar = this.hideHelpBoxEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.enableEdit;
        int hashCode2 = (((hashCode + (bool != null ? bool.hashCode() : 0)) * 31) + com_ss_android_ugc_gamora_editor_sticker_livecd_EditLiveCDStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.viewAlpha)) * 31;
        p pVar2 = this.reloadInteractStickerStruct;
        int hashCode3 = (hashCode2 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EditLiveCDStickerState(hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", enableEdit=" + this.enableEdit + ", viewAlpha=" + this.viewAlpha + ", reloadInteractStickerStruct=" + this.reloadInteractStickerStruct + ", ui=" + getUi() + ")";
    }

    public final Boolean getEnableEdit() {
        return this.enableEdit;
    }

    public final p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final p getReloadInteractStickerStruct() {
        return this.reloadInteractStickerStruct;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    public final float getViewAlpha() {
        return this.viewAlpha;
    }

    public static int com_ss_android_ugc_gamora_editor_sticker_livecd_EditLiveCDStickerState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditLiveCDStickerState(p pVar, Boolean bool, float f2, p pVar2, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.hideHelpBoxEvent = pVar;
        this.enableEdit = bool;
        this.viewAlpha = f2;
        this.reloadInteractStickerStruct = pVar2;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditLiveCDStickerState(p pVar, Boolean bool, float f2, p pVar2, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? 1.0f : f2, (i2 & 8) == 0 ? pVar2 : null, (i2 & 16) != 0 ? new a.C1131a() : aVar);
    }
}
