package com.ss.android.ugc.gamora.editor.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import h.f.b.g;
import h.f.b.l;

public final class EditStickerPanelState extends UiState {
    private final String enterMethod;
    private final n<Effect, String> launchChooseImageActivityEvent;
    private final n<Effect, String> selectEffectEvent;
    private final k stickerViewVisibleEvent;
    private final p temperatureErrorEvent;
    private final a ui;

    static {
        Covode.recordClassIndex(96583);
    }

    public EditStickerPanelState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.sticker.panel.EditStickerPanelState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditStickerPanelState copy$default(EditStickerPanelState editStickerPanelState, k kVar, n nVar, p pVar, n nVar2, String str, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            kVar = editStickerPanelState.stickerViewVisibleEvent;
        }
        if ((i2 & 2) != 0) {
            nVar = editStickerPanelState.selectEffectEvent;
        }
        if ((i2 & 4) != 0) {
            pVar = editStickerPanelState.temperatureErrorEvent;
        }
        if ((i2 & 8) != 0) {
            nVar2 = editStickerPanelState.launchChooseImageActivityEvent;
        }
        if ((i2 & 16) != 0) {
            str = editStickerPanelState.enterMethod;
        }
        if ((i2 & 32) != 0) {
            aVar = editStickerPanelState.getUi();
        }
        return editStickerPanelState.copy(kVar, nVar, pVar, nVar2, str, aVar);
    }

    public final k component1() {
        return this.stickerViewVisibleEvent;
    }

    public final n<Effect, String> component2() {
        return this.selectEffectEvent;
    }

    public final p component3() {
        return this.temperatureErrorEvent;
    }

    public final n<Effect, String> component4() {
        return this.launchChooseImageActivityEvent;
    }

    public final String component5() {
        return this.enterMethod;
    }

    public final a component6() {
        return getUi();
    }

    public final EditStickerPanelState copy(k kVar, n<Effect, String> nVar, p pVar, n<Effect, String> nVar2, String str, a aVar) {
        l.d(aVar, "");
        return new EditStickerPanelState(kVar, nVar, pVar, nVar2, str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditStickerPanelState)) {
            return false;
        }
        EditStickerPanelState editStickerPanelState = (EditStickerPanelState) obj;
        return l.a(this.stickerViewVisibleEvent, editStickerPanelState.stickerViewVisibleEvent) && l.a(this.selectEffectEvent, editStickerPanelState.selectEffectEvent) && l.a(this.temperatureErrorEvent, editStickerPanelState.temperatureErrorEvent) && l.a(this.launchChooseImageActivityEvent, editStickerPanelState.launchChooseImageActivityEvent) && l.a(this.enterMethod, editStickerPanelState.enterMethod) && l.a(getUi(), editStickerPanelState.getUi());
    }

    public final int hashCode() {
        k kVar = this.stickerViewVisibleEvent;
        int i2 = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        n<Effect, String> nVar = this.selectEffectEvent;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        p pVar = this.temperatureErrorEvent;
        int hashCode3 = (hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n<Effect, String> nVar2 = this.launchChooseImageActivityEvent;
        int hashCode4 = (hashCode3 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        String str = this.enterMethod;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "EditStickerPanelState(stickerViewVisibleEvent=" + this.stickerViewVisibleEvent + ", selectEffectEvent=" + this.selectEffectEvent + ", temperatureErrorEvent=" + this.temperatureErrorEvent + ", launchChooseImageActivityEvent=" + this.launchChooseImageActivityEvent + ", enterMethod=" + this.enterMethod + ", ui=" + getUi() + ")";
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final n<Effect, String> getLaunchChooseImageActivityEvent() {
        return this.launchChooseImageActivityEvent;
    }

    public final n<Effect, String> getSelectEffectEvent() {
        return this.selectEffectEvent;
    }

    public final k getStickerViewVisibleEvent() {
        return this.stickerViewVisibleEvent;
    }

    public final p getTemperatureErrorEvent() {
        return this.temperatureErrorEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditStickerPanelState(k kVar, n<Effect, String> nVar, p pVar, n<Effect, String> nVar2, String str, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.stickerViewVisibleEvent = kVar;
        this.selectEffectEvent = nVar;
        this.temperatureErrorEvent = pVar;
        this.launchChooseImageActivityEvent = nVar2;
        this.enterMethod = str;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditStickerPanelState(k kVar, n nVar, p pVar, n nVar2, String str, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : kVar, (i2 & 2) != 0 ? null : nVar, (i2 & 4) != 0 ? null : pVar, (i2 & 8) != 0 ? null : nVar2, (i2 & 16) == 0 ? str : null, (i2 & 32) != 0 ? new a.C1131a() : aVar);
    }
}
