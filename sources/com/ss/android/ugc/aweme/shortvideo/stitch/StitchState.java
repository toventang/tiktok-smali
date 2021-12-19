package com.ss.android.ugc.aweme.shortvideo.stitch;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class StitchState implements af {
    private final p hideIntroduceEvent;
    private final p quitEvent;
    private final p showIntroduceEvent;
    private final p showTrimmingNextGuideEvent;
    private final p showTrimmingViewGuideEvent;

    static {
        Covode.recordClassIndex(85719);
    }

    public StitchState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ StitchState copy$default(StitchState stitchState, p pVar, p pVar2, p pVar3, p pVar4, p pVar5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = stitchState.showIntroduceEvent;
        }
        if ((i2 & 2) != 0) {
            pVar2 = stitchState.hideIntroduceEvent;
        }
        if ((i2 & 4) != 0) {
            pVar3 = stitchState.showTrimmingViewGuideEvent;
        }
        if ((i2 & 8) != 0) {
            pVar4 = stitchState.showTrimmingNextGuideEvent;
        }
        if ((i2 & 16) != 0) {
            pVar5 = stitchState.quitEvent;
        }
        return stitchState.copy(pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public final p component1() {
        return this.showIntroduceEvent;
    }

    public final p component2() {
        return this.hideIntroduceEvent;
    }

    public final p component3() {
        return this.showTrimmingViewGuideEvent;
    }

    public final p component4() {
        return this.showTrimmingNextGuideEvent;
    }

    public final p component5() {
        return this.quitEvent;
    }

    public final StitchState copy(p pVar, p pVar2, p pVar3, p pVar4, p pVar5) {
        return new StitchState(pVar, pVar2, pVar3, pVar4, pVar5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StitchState)) {
            return false;
        }
        StitchState stitchState = (StitchState) obj;
        return l.a(this.showIntroduceEvent, stitchState.showIntroduceEvent) && l.a(this.hideIntroduceEvent, stitchState.hideIntroduceEvent) && l.a(this.showTrimmingViewGuideEvent, stitchState.showTrimmingViewGuideEvent) && l.a(this.showTrimmingNextGuideEvent, stitchState.showTrimmingNextGuideEvent) && l.a(this.quitEvent, stitchState.quitEvent);
    }

    public final int hashCode() {
        p pVar = this.showIntroduceEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.hideIntroduceEvent;
        int hashCode2 = (hashCode + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
        p pVar3 = this.showTrimmingViewGuideEvent;
        int hashCode3 = (hashCode2 + (pVar3 != null ? pVar3.hashCode() : 0)) * 31;
        p pVar4 = this.showTrimmingNextGuideEvent;
        int hashCode4 = (hashCode3 + (pVar4 != null ? pVar4.hashCode() : 0)) * 31;
        p pVar5 = this.quitEvent;
        if (pVar5 != null) {
            i2 = pVar5.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "StitchState(showIntroduceEvent=" + this.showIntroduceEvent + ", hideIntroduceEvent=" + this.hideIntroduceEvent + ", showTrimmingViewGuideEvent=" + this.showTrimmingViewGuideEvent + ", showTrimmingNextGuideEvent=" + this.showTrimmingNextGuideEvent + ", quitEvent=" + this.quitEvent + ")";
    }

    public final p getHideIntroduceEvent() {
        return this.hideIntroduceEvent;
    }

    public final p getQuitEvent() {
        return this.quitEvent;
    }

    public final p getShowIntroduceEvent() {
        return this.showIntroduceEvent;
    }

    public final p getShowTrimmingNextGuideEvent() {
        return this.showTrimmingNextGuideEvent;
    }

    public final p getShowTrimmingViewGuideEvent() {
        return this.showTrimmingViewGuideEvent;
    }

    public StitchState(p pVar, p pVar2, p pVar3, p pVar4, p pVar5) {
        this.showIntroduceEvent = pVar;
        this.hideIntroduceEvent = pVar2;
        this.showTrimmingViewGuideEvent = pVar3;
        this.showTrimmingNextGuideEvent = pVar4;
        this.quitEvent = pVar5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StitchState(p pVar, p pVar2, p pVar3, p pVar4, p pVar5, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : pVar2, (i2 & 4) != 0 ? null : pVar3, (i2 & 8) != 0 ? null : pVar4, (i2 & 16) == 0 ? pVar5 : null);
    }
}
