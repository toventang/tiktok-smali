package com.ss.android.ugc.aweme.ftc.components.sticker.info;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.d;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.jedi.arch.p;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import h.f.b.g;
import h.f.b.l;

public final class FTCEditInfoStickerState extends UiState {
    private final d<StickerItemModel> clickStickerItemEvent;
    private final n<Float, Long> editViewAnimEvent;
    private final o<Float, Float, Float> editViewLayoutEvent;
    private final p hideHelpBoxEvent;
    private final n<Integer, Integer> resetVideoLengthEvent;
    private final a ui;

    static {
        Covode.recordClassIndex(62290);
    }

    public FTCEditInfoStickerState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.sticker.info.FTCEditInfoStickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditInfoStickerState copy$default(FTCEditInfoStickerState fTCEditInfoStickerState, a aVar, p pVar, n nVar, d dVar, n nVar2, o oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = fTCEditInfoStickerState.getUi();
        }
        if ((i2 & 2) != 0) {
            pVar = fTCEditInfoStickerState.hideHelpBoxEvent;
        }
        if ((i2 & 4) != 0) {
            nVar = fTCEditInfoStickerState.resetVideoLengthEvent;
        }
        if ((i2 & 8) != 0) {
            dVar = fTCEditInfoStickerState.clickStickerItemEvent;
        }
        if ((i2 & 16) != 0) {
            nVar2 = fTCEditInfoStickerState.editViewAnimEvent;
        }
        if ((i2 & 32) != 0) {
            oVar = fTCEditInfoStickerState.editViewLayoutEvent;
        }
        return fTCEditInfoStickerState.copy(aVar, pVar, nVar, dVar, nVar2, oVar);
    }

    public final a component1() {
        return getUi();
    }

    public final p component2() {
        return this.hideHelpBoxEvent;
    }

    public final n<Integer, Integer> component3() {
        return this.resetVideoLengthEvent;
    }

    public final d<StickerItemModel> component4() {
        return this.clickStickerItemEvent;
    }

    public final n<Float, Long> component5() {
        return this.editViewAnimEvent;
    }

    public final o<Float, Float, Float> component6() {
        return this.editViewLayoutEvent;
    }

    public final FTCEditInfoStickerState copy(a aVar, p pVar, n<Integer, Integer> nVar, d<? extends StickerItemModel> dVar, n<Float, Long> nVar2, o<Float, Float, Float> oVar) {
        l.d(aVar, "");
        return new FTCEditInfoStickerState(aVar, pVar, nVar, dVar, nVar2, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditInfoStickerState)) {
            return false;
        }
        FTCEditInfoStickerState fTCEditInfoStickerState = (FTCEditInfoStickerState) obj;
        return l.a(getUi(), fTCEditInfoStickerState.getUi()) && l.a(this.hideHelpBoxEvent, fTCEditInfoStickerState.hideHelpBoxEvent) && l.a(this.resetVideoLengthEvent, fTCEditInfoStickerState.resetVideoLengthEvent) && l.a(this.clickStickerItemEvent, fTCEditInfoStickerState.clickStickerItemEvent) && l.a(this.editViewAnimEvent, fTCEditInfoStickerState.editViewAnimEvent) && l.a(this.editViewLayoutEvent, fTCEditInfoStickerState.editViewLayoutEvent);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        p pVar = this.hideHelpBoxEvent;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        n<Integer, Integer> nVar = this.resetVideoLengthEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        d<StickerItemModel> dVar = this.clickStickerItemEvent;
        int hashCode4 = (hashCode3 + (dVar != null ? dVar.hashCode() : 0)) * 31;
        n<Float, Long> nVar2 = this.editViewAnimEvent;
        int hashCode5 = (hashCode4 + (nVar2 != null ? nVar2.hashCode() : 0)) * 31;
        o<Float, Float, Float> oVar = this.editViewLayoutEvent;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "FTCEditInfoStickerState(ui=" + getUi() + ", hideHelpBoxEvent=" + this.hideHelpBoxEvent + ", resetVideoLengthEvent=" + this.resetVideoLengthEvent + ", clickStickerItemEvent=" + this.clickStickerItemEvent + ", editViewAnimEvent=" + this.editViewAnimEvent + ", editViewLayoutEvent=" + this.editViewLayoutEvent + ")";
    }

    public final d<StickerItemModel> getClickStickerItemEvent() {
        return this.clickStickerItemEvent;
    }

    public final n<Float, Long> getEditViewAnimEvent() {
        return this.editViewAnimEvent;
    }

    public final o<Float, Float, Float> getEditViewLayoutEvent() {
        return this.editViewLayoutEvent;
    }

    public final p getHideHelpBoxEvent() {
        return this.hideHelpBoxEvent;
    }

    public final n<Integer, Integer> getResetVideoLengthEvent() {
        return this.resetVideoLengthEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.bytedance.jedi.arch.d<? extends com.ss.android.ugc.aweme.editSticker.model.StickerItemModel> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditInfoStickerState(a aVar, p pVar, n<Integer, Integer> nVar, d<? extends StickerItemModel> dVar, n<Float, Long> nVar2, o<Float, Float, Float> oVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.hideHelpBoxEvent = pVar;
        this.resetVideoLengthEvent = nVar;
        this.clickStickerItemEvent = dVar;
        this.editViewAnimEvent = nVar2;
        this.editViewLayoutEvent = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditInfoStickerState(a aVar, p pVar, n nVar, d dVar, n nVar2, o oVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : pVar, (i2 & 4) != 0 ? null : nVar, (i2 & 8) != 0 ? null : dVar, (i2 & 16) != 0 ? null : nVar2, (i2 & 32) == 0 ? oVar : null);
    }
}
