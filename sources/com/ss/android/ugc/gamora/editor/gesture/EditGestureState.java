package com.ss.android.ugc.gamora.editor.gesture;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.o;
import com.bytedance.ui_component.UiState;
import com.bytedance.ui_component.a;
import h.f.b.g;
import h.f.b.l;

public final class EditGestureState extends UiState {
    private final n<Float, Long> gestureAnimEvent;
    private final Boolean gestureEnable;
    private final o<Float, Float, Float> gestureLayoutEvent;
    private final a ui;

    static {
        Covode.recordClassIndex(95904);
    }

    public EditGestureState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.gamora.editor.gesture.EditGestureState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditGestureState copy$default(EditGestureState editGestureState, Boolean bool, n nVar, o oVar, a aVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = editGestureState.gestureEnable;
        }
        if ((i2 & 2) != 0) {
            nVar = editGestureState.gestureAnimEvent;
        }
        if ((i2 & 4) != 0) {
            oVar = editGestureState.gestureLayoutEvent;
        }
        if ((i2 & 8) != 0) {
            aVar = editGestureState.getUi();
        }
        return editGestureState.copy(bool, nVar, oVar, aVar);
    }

    public final Boolean component1() {
        return this.gestureEnable;
    }

    public final n<Float, Long> component2() {
        return this.gestureAnimEvent;
    }

    public final o<Float, Float, Float> component3() {
        return this.gestureLayoutEvent;
    }

    public final a component4() {
        return getUi();
    }

    public final EditGestureState copy(Boolean bool, n<Float, Long> nVar, o<Float, Float, Float> oVar, a aVar) {
        l.d(aVar, "");
        return new EditGestureState(bool, nVar, oVar, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditGestureState)) {
            return false;
        }
        EditGestureState editGestureState = (EditGestureState) obj;
        return l.a(this.gestureEnable, editGestureState.gestureEnable) && l.a(this.gestureAnimEvent, editGestureState.gestureAnimEvent) && l.a(this.gestureLayoutEvent, editGestureState.gestureLayoutEvent) && l.a(getUi(), editGestureState.getUi());
    }

    public final int hashCode() {
        Boolean bool = this.gestureEnable;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        n<Float, Long> nVar = this.gestureAnimEvent;
        int hashCode2 = (hashCode + (nVar != null ? nVar.hashCode() : 0)) * 31;
        o<Float, Float, Float> oVar = this.gestureLayoutEvent;
        int hashCode3 = (hashCode2 + (oVar != null ? oVar.hashCode() : 0)) * 31;
        a ui2 = getUi();
        if (ui2 != null) {
            i2 = ui2.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EditGestureState(gestureEnable=" + this.gestureEnable + ", gestureAnimEvent=" + this.gestureAnimEvent + ", gestureLayoutEvent=" + this.gestureLayoutEvent + ", ui=" + getUi() + ")";
    }

    public final n<Float, Long> getGestureAnimEvent() {
        return this.gestureAnimEvent;
    }

    public final Boolean getGestureEnable() {
        return this.gestureEnable;
    }

    public final o<Float, Float, Float> getGestureLayoutEvent() {
        return this.gestureLayoutEvent;
    }

    @Override // com.bytedance.ui_component.UiState
    public final a getUi() {
        return this.ui;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditGestureState(Boolean bool, n<Float, Long> nVar, o<Float, Float, Float> oVar, a aVar) {
        super(aVar);
        l.d(aVar, "");
        this.gestureEnable = bool;
        this.gestureAnimEvent = nVar;
        this.gestureLayoutEvent = oVar;
        this.ui = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EditGestureState(Boolean bool, n nVar, o oVar, a aVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : nVar, (i2 & 4) != 0 ? null : oVar, (i2 & 8) != 0 ? new a.C1131a() : aVar);
    }
}
