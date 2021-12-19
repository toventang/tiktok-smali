package com.ss.android.ugc.aweme.ftc.components.sticker.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class FTCEditStickerState extends UiState {
    private final n<Float, Long> pollTextAnimEvent;
    private final o<Float, Float, Float> pollTextLayoutEvent;
    private final Integer pollingTopMargin;
    private final a ui;

    static {
        Covode.recordClassIndex(62229);
    }

    public FTCEditStickerState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.ftc.components.sticker.core.FTCEditStickerState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FTCEditStickerState copy$default(FTCEditStickerState fTCEditStickerState, a aVar, Integer num, n nVar, o oVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = fTCEditStickerState.getUi();
        }
        if ((i2 & 2) != 0) {
            num = fTCEditStickerState.pollingTopMargin;
        }
        if ((i2 & 4) != 0) {
            nVar = fTCEditStickerState.pollTextAnimEvent;
        }
        if ((i2 & 8) != 0) {
            oVar = fTCEditStickerState.pollTextLayoutEvent;
        }
        return fTCEditStickerState.copy(aVar, num, nVar, oVar);
    }

    public final a component1() {
        return getUi();
    }

    public final Integer component2() {
        return this.pollingTopMargin;
    }

    public final n<Float, Long> component3() {
        return this.pollTextAnimEvent;
    }

    public final o<Float, Float, Float> component4() {
        return this.pollTextLayoutEvent;
    }

    public final FTCEditStickerState copy(a aVar, Integer num, n<Float, Long> nVar, o<Float, Float, Float> oVar) {
        l.d(aVar, "");
        return new FTCEditStickerState(aVar, num, nVar, oVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditStickerState)) {
            return false;
        }
        FTCEditStickerState fTCEditStickerState = (FTCEditStickerState) obj;
        return l.a(getUi(), fTCEditStickerState.getUi()) && l.a(this.pollingTopMargin, fTCEditStickerState.pollingTopMargin) && l.a(this.pollTextAnimEvent, fTCEditStickerState.pollTextAnimEvent) && l.a(this.pollTextLayoutEvent, fTCEditStickerState.pollTextLayoutEvent);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        Integer num = this.pollingTopMargin;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        n<Float, Long> nVar = this.pollTextAnimEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        o<Float, Float, Float> oVar = this.pollTextLayoutEvent;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "FTCEditStickerState(ui=" + getUi() + ", pollingTopMargin=" + this.pollingTopMargin + ", pollTextAnimEvent=" + this.pollTextAnimEvent + ", pollTextLayoutEvent=" + this.pollTextLayoutEvent + ")";
    }

    public final n<Float, Long> getPollTextAnimEvent() {
        return this.pollTextAnimEvent;
    }

    public final o<Float, Float, Float> getPollTextLayoutEvent() {
        return this.pollTextLayoutEvent;
    }

    public final Integer getPollingTopMargin() {
        return this.pollingTopMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditStickerState(a aVar, Integer num, n<Float, Long> nVar, o<Float, Float, Float> oVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.pollingTopMargin = num;
        this.pollTextAnimEvent = nVar;
        this.pollTextLayoutEvent = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditStickerState(a aVar, Integer num, n nVar, o oVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : nVar, (i2 & 8) != 0 ? null : oVar);
    }
}
