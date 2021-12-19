package com.ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class DuetLayoutModeState extends UiState {
    private final int changeDirectionMode;
    private final int chosenPosition;
    private final int guideMode;
    private final String toast;
    private final int touchGesture;
    private final a ui;

    static {
        Covode.recordClassIndex(82975);
    }

    public DuetLayoutModeState() {
        this(0, 0, 0, 0, null, null, 63, null);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ DuetLayoutModeState copy$default(DuetLayoutModeState duetLayoutModeState, int i2, int i3, int i4, int i5, String str, a aVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = duetLayoutModeState.changeDirectionMode;
        }
        if ((i6 & 2) != 0) {
            i3 = duetLayoutModeState.guideMode;
        }
        if ((i6 & 4) != 0) {
            i4 = duetLayoutModeState.touchGesture;
        }
        if ((i6 & 8) != 0) {
            i5 = duetLayoutModeState.chosenPosition;
        }
        if ((i6 & 16) != 0) {
            str = duetLayoutModeState.toast;
        }
        if ((i6 & 32) != 0) {
            aVar = duetLayoutModeState.getUi();
        }
        return duetLayoutModeState.copy(i2, i3, i4, i5, str, aVar);
    }

    public final int component1() {
        return this.changeDirectionMode;
    }

    public final int component2() {
        return this.guideMode;
    }

    public final int component3() {
        return this.touchGesture;
    }

    public final int component4() {
        return this.chosenPosition;
    }

    public final String component5() {
        return this.toast;
    }

    public final a component6() {
        return getUi();
    }

    public final DuetLayoutModeState copy(int i2, int i3, int i4, int i5, String str, a aVar) {
        l.d(str, "");
        l.d(aVar, "");
        return new DuetLayoutModeState(i2, i3, i4, i5, str, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetLayoutModeState)) {
            return false;
        }
        DuetLayoutModeState duetLayoutModeState = (DuetLayoutModeState) obj;
        return this.changeDirectionMode == duetLayoutModeState.changeDirectionMode && this.guideMode == duetLayoutModeState.guideMode && this.touchGesture == duetLayoutModeState.touchGesture && this.chosenPosition == duetLayoutModeState.chosenPosition && l.a(this.toast, duetLayoutModeState.toast) && l.a(getUi(), duetLayoutModeState.getUi());
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = ((((((com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.changeDirectionMode) * 31) + com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.guideMode)) * 31) + com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.touchGesture)) * 31) + com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.chosenPosition)) * 31;
        String str = this.toast;
        int i2 = 0;
        int hashCode = (com_ss_android_ugc_aweme_shortvideo_duet_DuetLayoutModeState_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "DuetLayoutModeState(changeDirectionMode=" + this.changeDirectionMode + ", guideMode=" + this.guideMode + ", touchGesture=" + this.touchGesture + ", chosenPosition=" + this.chosenPosition + ", toast=" + this.toast + ", ui=" + getUi() + ")";
    }

    public final int getChangeDirectionMode() {
        return this.changeDirectionMode;
    }

    public final int getChosenPosition() {
        return this.chosenPosition;
    }

    public final int getGuideMode() {
        return this.guideMode;
    }

    public final String getToast() {
        return this.toast;
    }

    public final int getTouchGesture() {
        return this.touchGesture;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DuetLayoutModeState(int i2, int i3, int i4, int i5, String str, a aVar) {
        super(aVar);
        l.d(str, "");
        l.d(aVar, "");
        this.changeDirectionMode = i2;
        this.guideMode = i3;
        this.touchGesture = i4;
        this.chosenPosition = i5;
        this.toast = str;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetLayoutModeState(int i2, int i3, int i4, int i5, String str, a aVar, int i6, g gVar) {
        this((i6 & 1) != 0 ? 0 : i2, (i6 & 2) != 0 ? 0 : i3, (i6 & 4) != 0 ? 0 : i4, (i6 & 8) == 0 ? i5 : 0, (i6 & 16) != 0 ? "" : str, (i6 & 32) != 0 ? new a.C1131a() : aVar);
    }
}
