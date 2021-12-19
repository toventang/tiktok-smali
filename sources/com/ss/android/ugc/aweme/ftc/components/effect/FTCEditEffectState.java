package com.ss.android.ugc.aweme.ftc.components.effect;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class FTCEditEffectState extends UiState {
    private final Integer setVideoLength;
    private final a ui;

    static {
        Covode.recordClassIndex(62158);
    }

    public FTCEditEffectState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ FTCEditEffectState copy$default(FTCEditEffectState fTCEditEffectState, a aVar, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            aVar = fTCEditEffectState.getUi();
        }
        if ((i2 & 2) != 0) {
            num = fTCEditEffectState.setVideoLength;
        }
        return fTCEditEffectState.copy(aVar, num);
    }

    public final a component1() {
        return getUi();
    }

    public final Integer component2() {
        return this.setVideoLength;
    }

    public final FTCEditEffectState copy(a aVar, Integer num) {
        l.d(aVar, "");
        return new FTCEditEffectState(aVar, num);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FTCEditEffectState)) {
            return false;
        }
        FTCEditEffectState fTCEditEffectState = (FTCEditEffectState) obj;
        return l.a(getUi(), fTCEditEffectState.getUi()) && l.a(this.setVideoLength, fTCEditEffectState.setVideoLength);
    }

    public final int hashCode() {
        a ui2 = getUi();
        int i2 = 0;
        int hashCode = (ui2 != null ? ui2.hashCode() : 0) * 31;
        Integer num = this.setVideoLength;
        if (num != null) {
            i2 = num.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "FTCEditEffectState(ui=" + getUi() + ", setVideoLength=" + this.setVideoLength + ")";
    }

    public final Integer getSetVideoLength() {
        return this.setVideoLength;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FTCEditEffectState(a aVar, Integer num) {
        super(aVar);
        l.d(aVar, "");
        this.ui = aVar;
        this.setVideoLength = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FTCEditEffectState(a aVar, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? new a.C1131a() : aVar, (i2 & 2) != 0 ? null : num);
    }
}
