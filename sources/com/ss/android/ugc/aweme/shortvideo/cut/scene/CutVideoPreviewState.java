package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.m;
import com.bytedance.jedi.arch.n;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoPreviewState implements af {
    private final n<Integer, Integer> resetSurfaceSizeEvent;
    private final p restartProgress;
    private final Boolean surfaceEnable;
    private final m updateBottomMarginEvent;
    private final p updateVEDisplayEvent;

    static {
        Covode.recordClassIndex(82413);
    }

    public CutVideoPreviewState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoPreviewState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CutVideoPreviewState copy$default(CutVideoPreviewState cutVideoPreviewState, p pVar, Boolean bool, n nVar, m mVar, p pVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = cutVideoPreviewState.restartProgress;
        }
        if ((i2 & 2) != 0) {
            bool = cutVideoPreviewState.surfaceEnable;
        }
        if ((i2 & 4) != 0) {
            nVar = cutVideoPreviewState.resetSurfaceSizeEvent;
        }
        if ((i2 & 8) != 0) {
            mVar = cutVideoPreviewState.updateBottomMarginEvent;
        }
        if ((i2 & 16) != 0) {
            pVar2 = cutVideoPreviewState.updateVEDisplayEvent;
        }
        return cutVideoPreviewState.copy(pVar, bool, nVar, mVar, pVar2);
    }

    public final p component1() {
        return this.restartProgress;
    }

    public final Boolean component2() {
        return this.surfaceEnable;
    }

    public final n<Integer, Integer> component3() {
        return this.resetSurfaceSizeEvent;
    }

    public final m component4() {
        return this.updateBottomMarginEvent;
    }

    public final p component5() {
        return this.updateVEDisplayEvent;
    }

    public final CutVideoPreviewState copy(p pVar, Boolean bool, n<Integer, Integer> nVar, m mVar, p pVar2) {
        return new CutVideoPreviewState(pVar, bool, nVar, mVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoPreviewState)) {
            return false;
        }
        CutVideoPreviewState cutVideoPreviewState = (CutVideoPreviewState) obj;
        return l.a(this.restartProgress, cutVideoPreviewState.restartProgress) && l.a(this.surfaceEnable, cutVideoPreviewState.surfaceEnable) && l.a(this.resetSurfaceSizeEvent, cutVideoPreviewState.resetSurfaceSizeEvent) && l.a(this.updateBottomMarginEvent, cutVideoPreviewState.updateBottomMarginEvent) && l.a(this.updateVEDisplayEvent, cutVideoPreviewState.updateVEDisplayEvent);
    }

    public final int hashCode() {
        p pVar = this.restartProgress;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        Boolean bool = this.surfaceEnable;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        n<Integer, Integer> nVar = this.resetSurfaceSizeEvent;
        int hashCode3 = (hashCode2 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        m mVar = this.updateBottomMarginEvent;
        int hashCode4 = (hashCode3 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        p pVar2 = this.updateVEDisplayEvent;
        if (pVar2 != null) {
            i2 = pVar2.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CutVideoPreviewState(restartProgress=" + this.restartProgress + ", surfaceEnable=" + this.surfaceEnable + ", resetSurfaceSizeEvent=" + this.resetSurfaceSizeEvent + ", updateBottomMarginEvent=" + this.updateBottomMarginEvent + ", updateVEDisplayEvent=" + this.updateVEDisplayEvent + ")";
    }

    public final n<Integer, Integer> getResetSurfaceSizeEvent() {
        return this.resetSurfaceSizeEvent;
    }

    public final p getRestartProgress() {
        return this.restartProgress;
    }

    public final Boolean getSurfaceEnable() {
        return this.surfaceEnable;
    }

    public final m getUpdateBottomMarginEvent() {
        return this.updateBottomMarginEvent;
    }

    public final p getUpdateVEDisplayEvent() {
        return this.updateVEDisplayEvent;
    }

    public CutVideoPreviewState(p pVar, Boolean bool, n<Integer, Integer> nVar, m mVar, p pVar2) {
        this.restartProgress = pVar;
        this.surfaceEnable = bool;
        this.resetSurfaceSizeEvent = nVar;
        this.updateBottomMarginEvent = mVar;
        this.updateVEDisplayEvent = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoPreviewState(p pVar, Boolean bool, n nVar, m mVar, p pVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : nVar, (i2 & 8) != 0 ? null : mVar, (i2 & 16) == 0 ? pVar2 : null);
    }
}
