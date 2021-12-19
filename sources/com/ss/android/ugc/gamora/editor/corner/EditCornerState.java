package com.ss.android.ugc.gamora.editor.corner;

import com.bytedance.covode.number.Covode;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditCornerState extends UiState {
    private final Integer bottomMargin;
    private final Boolean cornerVisible;
    private final Integer topMargin;
    private final a ui;

    static {
        Covode.recordClassIndex(95731);
    }

    public EditCornerState() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ EditCornerState copy$default(EditCornerState editCornerState, Boolean bool, Integer num, Integer num2, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = editCornerState.cornerVisible;
        }
        if ((i2 & 2) != 0) {
            num = editCornerState.topMargin;
        }
        if ((i2 & 4) != 0) {
            num2 = editCornerState.bottomMargin;
        }
        if ((i2 & 8) != 0) {
            aVar = editCornerState.getUi();
        }
        return editCornerState.copy(bool, num, num2, aVar);
    }

    public final Boolean component1() {
        return this.cornerVisible;
    }

    public final Integer component2() {
        return this.topMargin;
    }

    public final Integer component3() {
        return this.bottomMargin;
    }

    public final a component4() {
        return getUi();
    }

    public final EditCornerState copy(Boolean bool, Integer num, Integer num2, a aVar) {
        l.d(aVar, "");
        return new EditCornerState(bool, num, num2, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCornerState)) {
            return false;
        }
        EditCornerState editCornerState = (EditCornerState) obj;
        return l.a(this.cornerVisible, editCornerState.cornerVisible) && l.a(this.topMargin, editCornerState.topMargin) && l.a(this.bottomMargin, editCornerState.bottomMargin) && l.a(getUi(), editCornerState.getUi());
    }

    public final int hashCode() {
        Boolean bool = this.cornerVisible;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Integer num = this.topMargin;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.bottomMargin;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EditCornerState(cornerVisible=" + this.cornerVisible + ", topMargin=" + this.topMargin + ", bottomMargin=" + this.bottomMargin + ", ui=" + getUi() + ")";
    }

    public final Integer getBottomMargin() {
        return this.bottomMargin;
    }

    public final Boolean getCornerVisible() {
        return this.cornerVisible;
    }

    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditCornerState(Boolean bool, Integer num, Integer num2, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.cornerVisible = bool;
        this.topMargin = num;
        this.bottomMargin = num2;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditCornerState(Boolean bool, Integer num, Integer num2, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? new a.C1131a() : aVar);
    }
}
