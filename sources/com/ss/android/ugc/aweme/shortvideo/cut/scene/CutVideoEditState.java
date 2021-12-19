package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoEditState implements af {
    private final k changeStickPointSlideModeEvent;
    private final Boolean editEnable;
    private final Boolean isEditVideoLength;
    private final p refreshFrameMapEvent;
    private final p updatePlayBoundaryEvent;

    static {
        Covode.recordClassIndex(82385);
    }

    public CutVideoEditState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoEditState copy$default(CutVideoEditState cutVideoEditState, p pVar, Boolean bool, k kVar, p pVar2, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = cutVideoEditState.updatePlayBoundaryEvent;
        }
        if ((i2 & 2) != 0) {
            bool = cutVideoEditState.editEnable;
        }
        if ((i2 & 4) != 0) {
            kVar = cutVideoEditState.changeStickPointSlideModeEvent;
        }
        if ((i2 & 8) != 0) {
            pVar2 = cutVideoEditState.refreshFrameMapEvent;
        }
        if ((i2 & 16) != 0) {
            bool2 = cutVideoEditState.isEditVideoLength;
        }
        return cutVideoEditState.copy(pVar, bool, kVar, pVar2, bool2);
    }

    public final p component1() {
        return this.updatePlayBoundaryEvent;
    }

    public final Boolean component2() {
        return this.editEnable;
    }

    public final k component3() {
        return this.changeStickPointSlideModeEvent;
    }

    public final p component4() {
        return this.refreshFrameMapEvent;
    }

    public final Boolean component5() {
        return this.isEditVideoLength;
    }

    public final CutVideoEditState copy(p pVar, Boolean bool, k kVar, p pVar2, Boolean bool2) {
        return new CutVideoEditState(pVar, bool, kVar, pVar2, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoEditState)) {
            return false;
        }
        CutVideoEditState cutVideoEditState = (CutVideoEditState) obj;
        return l.a(this.updatePlayBoundaryEvent, cutVideoEditState.updatePlayBoundaryEvent) && l.a(this.editEnable, cutVideoEditState.editEnable) && l.a(this.changeStickPointSlideModeEvent, cutVideoEditState.changeStickPointSlideModeEvent) && l.a(this.refreshFrameMapEvent, cutVideoEditState.refreshFrameMapEvent) && l.a(this.isEditVideoLength, cutVideoEditState.isEditVideoLength);
    }

    public final int hashCode() {
        p pVar = this.updatePlayBoundaryEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.editEnable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        k kVar = this.changeStickPointSlideModeEvent;
        int hashCode3 = (hashCode2 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        p pVar2 = this.refreshFrameMapEvent;
        int hashCode4 = (hashCode3 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        Boolean bool2 = this.isEditVideoLength;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CutVideoEditState(updatePlayBoundaryEvent=" + this.updatePlayBoundaryEvent + ", editEnable=" + this.editEnable + ", changeStickPointSlideModeEvent=" + this.changeStickPointSlideModeEvent + ", refreshFrameMapEvent=" + this.refreshFrameMapEvent + ", isEditVideoLength=" + this.isEditVideoLength + ")";
    }

    public final k getChangeStickPointSlideModeEvent() {
        return this.changeStickPointSlideModeEvent;
    }

    public final Boolean getEditEnable() {
        return this.editEnable;
    }

    public final p getRefreshFrameMapEvent() {
        return this.refreshFrameMapEvent;
    }

    public final p getUpdatePlayBoundaryEvent() {
        return this.updatePlayBoundaryEvent;
    }

    public final Boolean isEditVideoLength() {
        return this.isEditVideoLength;
    }

    public CutVideoEditState(p pVar, Boolean bool, k kVar, p pVar2, Boolean bool2) {
        this.updatePlayBoundaryEvent = pVar;
        this.editEnable = bool;
        this.changeStickPointSlideModeEvent = kVar;
        this.refreshFrameMapEvent = pVar2;
        this.isEditVideoLength = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoEditState(p pVar, Boolean bool, k kVar, p pVar2, Boolean bool2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : kVar, (i2 & 8) != 0 ? null : pVar2, (i2 & 16) == 0 ? bool2 : null);
    }
}
