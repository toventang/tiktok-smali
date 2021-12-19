package com.bytedance.creativex.recorder.sticker.panel;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class StickerPanelState extends UiState {
    private final a ui;

    static {
        Covode.recordClassIndex(16717);
    }

    public StickerPanelState() {
        this(null, 1, null);
    }

    public static /* synthetic */ StickerPanelState copy$default(StickerPanelState stickerPanelState, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = stickerPanelState.getUi();
        }
        return stickerPanelState.copy(aVar);
    }

    public final a component1() {
        return getUi();
    }

    public final StickerPanelState copy(a aVar) {
        l.d(aVar, "");
        return new StickerPanelState(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StickerPanelState) && l.a(getUi(), ((UiState) obj).getUi());
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
        return "StickerPanelState(ui=" + getUi() + ")";
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPanelState(a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StickerPanelState(a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar);
    }
}
