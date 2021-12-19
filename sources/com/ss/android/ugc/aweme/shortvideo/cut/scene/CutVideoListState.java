package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoListState implements af {
    private final k animateRecyclerViewEvent;
    private final Boolean cancelEnable;
    private final p deleteSegEvent;
    private final k dismissSegAnimateEvent;
    private final k dismissSingleAnimateEvent;
    private final Boolean saveEnable;
    private final k showSegAnimateEvent;
    private final k showSingleAnimateEvent;
    private final Boolean singleVideoEditVisible;
    private final k updateSpeedCheckEvent;

    static {
        Covode.recordClassIndex(82392);
    }

    public CutVideoListState() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static /* synthetic */ CutVideoListState copy$default(CutVideoListState cutVideoListState, p pVar, k kVar, Boolean bool, Boolean bool2, k kVar2, k kVar3, k kVar4, k kVar5, Boolean bool3, k kVar6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = cutVideoListState.deleteSegEvent;
        }
        if ((i2 & 2) != 0) {
            kVar = cutVideoListState.updateSpeedCheckEvent;
        }
        if ((i2 & 4) != 0) {
            bool = cutVideoListState.saveEnable;
        }
        if ((i2 & 8) != 0) {
            bool2 = cutVideoListState.cancelEnable;
        }
        if ((i2 & 16) != 0) {
            kVar2 = cutVideoListState.showSegAnimateEvent;
        }
        if ((i2 & 32) != 0) {
            kVar3 = cutVideoListState.dismissSegAnimateEvent;
        }
        if ((i2 & 64) != 0) {
            kVar4 = cutVideoListState.showSingleAnimateEvent;
        }
        if ((i2 & 128) != 0) {
            kVar5 = cutVideoListState.dismissSingleAnimateEvent;
        }
        if ((i2 & 256) != 0) {
            bool3 = cutVideoListState.singleVideoEditVisible;
        }
        if ((i2 & 512) != 0) {
            kVar6 = cutVideoListState.animateRecyclerViewEvent;
        }
        return cutVideoListState.copy(pVar, kVar, bool, bool2, kVar2, kVar3, kVar4, kVar5, bool3, kVar6);
    }

    public final p component1() {
        return this.deleteSegEvent;
    }

    public final k component10() {
        return this.animateRecyclerViewEvent;
    }

    public final k component2() {
        return this.updateSpeedCheckEvent;
    }

    public final Boolean component3() {
        return this.saveEnable;
    }

    public final Boolean component4() {
        return this.cancelEnable;
    }

    public final k component5() {
        return this.showSegAnimateEvent;
    }

    public final k component6() {
        return this.dismissSegAnimateEvent;
    }

    public final k component7() {
        return this.showSingleAnimateEvent;
    }

    public final k component8() {
        return this.dismissSingleAnimateEvent;
    }

    public final Boolean component9() {
        return this.singleVideoEditVisible;
    }

    public final CutVideoListState copy(p pVar, k kVar, Boolean bool, Boolean bool2, k kVar2, k kVar3, k kVar4, k kVar5, Boolean bool3, k kVar6) {
        return new CutVideoListState(pVar, kVar, bool, bool2, kVar2, kVar3, kVar4, kVar5, bool3, kVar6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoListState)) {
            return false;
        }
        CutVideoListState cutVideoListState = (CutVideoListState) obj;
        return l.a(this.deleteSegEvent, cutVideoListState.deleteSegEvent) && l.a(this.updateSpeedCheckEvent, cutVideoListState.updateSpeedCheckEvent) && l.a(this.saveEnable, cutVideoListState.saveEnable) && l.a(this.cancelEnable, cutVideoListState.cancelEnable) && l.a(this.showSegAnimateEvent, cutVideoListState.showSegAnimateEvent) && l.a(this.dismissSegAnimateEvent, cutVideoListState.dismissSegAnimateEvent) && l.a(this.showSingleAnimateEvent, cutVideoListState.showSingleAnimateEvent) && l.a(this.dismissSingleAnimateEvent, cutVideoListState.dismissSingleAnimateEvent) && l.a(this.singleVideoEditVisible, cutVideoListState.singleVideoEditVisible) && l.a(this.animateRecyclerViewEvent, cutVideoListState.animateRecyclerViewEvent);
    }

    public final int hashCode() {
        p pVar = this.deleteSegEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        k kVar = this.updateSpeedCheckEvent;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        Boolean bool = this.saveEnable;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.cancelEnable;
        int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        k kVar2 = this.showSegAnimateEvent;
        int hashCode5 = (hashCode4 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        k kVar3 = this.dismissSegAnimateEvent;
        int hashCode6 = (hashCode5 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        k kVar4 = this.showSingleAnimateEvent;
        int hashCode7 = (hashCode6 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        k kVar5 = this.dismissSingleAnimateEvent;
        int hashCode8 = (hashCode7 + (kVar5 != null ? kVar5.hashCode() : 0)) * 31;
        Boolean bool3 = this.singleVideoEditVisible;
        int hashCode9 = (hashCode8 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        k kVar6 = this.animateRecyclerViewEvent;
        if (kVar6 != null) {
            i2 = kVar6.hashCode();
        }
        return hashCode9 + i2;
    }

    public final String toString() {
        return "CutVideoListState(deleteSegEvent=" + this.deleteSegEvent + ", updateSpeedCheckEvent=" + this.updateSpeedCheckEvent + ", saveEnable=" + this.saveEnable + ", cancelEnable=" + this.cancelEnable + ", showSegAnimateEvent=" + this.showSegAnimateEvent + ", dismissSegAnimateEvent=" + this.dismissSegAnimateEvent + ", showSingleAnimateEvent=" + this.showSingleAnimateEvent + ", dismissSingleAnimateEvent=" + this.dismissSingleAnimateEvent + ", singleVideoEditVisible=" + this.singleVideoEditVisible + ", animateRecyclerViewEvent=" + this.animateRecyclerViewEvent + ")";
    }

    public final k getAnimateRecyclerViewEvent() {
        return this.animateRecyclerViewEvent;
    }

    public final Boolean getCancelEnable() {
        return this.cancelEnable;
    }

    public final p getDeleteSegEvent() {
        return this.deleteSegEvent;
    }

    public final k getDismissSegAnimateEvent() {
        return this.dismissSegAnimateEvent;
    }

    public final k getDismissSingleAnimateEvent() {
        return this.dismissSingleAnimateEvent;
    }

    public final Boolean getSaveEnable() {
        return this.saveEnable;
    }

    public final k getShowSegAnimateEvent() {
        return this.showSegAnimateEvent;
    }

    public final k getShowSingleAnimateEvent() {
        return this.showSingleAnimateEvent;
    }

    public final Boolean getSingleVideoEditVisible() {
        return this.singleVideoEditVisible;
    }

    public final k getUpdateSpeedCheckEvent() {
        return this.updateSpeedCheckEvent;
    }

    public CutVideoListState(p pVar, k kVar, Boolean bool, Boolean bool2, k kVar2, k kVar3, k kVar4, k kVar5, Boolean bool3, k kVar6) {
        this.deleteSegEvent = pVar;
        this.updateSpeedCheckEvent = kVar;
        this.saveEnable = bool;
        this.cancelEnable = bool2;
        this.showSegAnimateEvent = kVar2;
        this.dismissSegAnimateEvent = kVar3;
        this.showSingleAnimateEvent = kVar4;
        this.dismissSingleAnimateEvent = kVar5;
        this.singleVideoEditVisible = bool3;
        this.animateRecyclerViewEvent = kVar6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoListState(p pVar, k kVar, Boolean bool, Boolean bool2, k kVar2, k kVar3, k kVar4, k kVar5, Boolean bool3, k kVar6, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : kVar, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : bool2, (i2 & 16) != 0 ? null : kVar2, (i2 & 32) != 0 ? null : kVar3, (i2 & 64) != 0 ? null : kVar4, (i2 & 128) != 0 ? null : kVar5, (i2 & 256) != 0 ? null : bool3, (i2 & 512) == 0 ? kVar6 : null);
    }
}
