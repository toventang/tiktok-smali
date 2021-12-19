package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoTitleBarState implements af {
    private final k animateTitleBarEvent;
    private final Boolean backEnable;
    private final Boolean backVisible;
    private final Boolean nextEnable;
    private final Boolean nextVisible;

    static {
        Covode.recordClassIndex(82435);
    }

    public CutVideoTitleBarState() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ CutVideoTitleBarState copy$default(CutVideoTitleBarState cutVideoTitleBarState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, k kVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = cutVideoTitleBarState.backVisible;
        }
        if ((i2 & 2) != 0) {
            bool2 = cutVideoTitleBarState.nextVisible;
        }
        if ((i2 & 4) != 0) {
            bool3 = cutVideoTitleBarState.backEnable;
        }
        if ((i2 & 8) != 0) {
            bool4 = cutVideoTitleBarState.nextEnable;
        }
        if ((i2 & 16) != 0) {
            kVar = cutVideoTitleBarState.animateTitleBarEvent;
        }
        return cutVideoTitleBarState.copy(bool, bool2, bool3, bool4, kVar);
    }

    public final Boolean component1() {
        return this.backVisible;
    }

    public final Boolean component2() {
        return this.nextVisible;
    }

    public final Boolean component3() {
        return this.backEnable;
    }

    public final Boolean component4() {
        return this.nextEnable;
    }

    public final k component5() {
        return this.animateTitleBarEvent;
    }

    public final CutVideoTitleBarState copy(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, k kVar) {
        return new CutVideoTitleBarState(bool, bool2, bool3, bool4, kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoTitleBarState)) {
            return false;
        }
        CutVideoTitleBarState cutVideoTitleBarState = (CutVideoTitleBarState) obj;
        return l.a(this.backVisible, cutVideoTitleBarState.backVisible) && l.a(this.nextVisible, cutVideoTitleBarState.nextVisible) && l.a(this.backEnable, cutVideoTitleBarState.backEnable) && l.a(this.nextEnable, cutVideoTitleBarState.nextEnable) && l.a(this.animateTitleBarEvent, cutVideoTitleBarState.animateTitleBarEvent);
    }

    public final int hashCode() {
        Boolean bool = this.backVisible;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.nextVisible;
        int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.backEnable;
        int hashCode3 = (hashCode2 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.nextEnable;
        int hashCode4 = (hashCode3 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        k kVar = this.animateTitleBarEvent;
        if (kVar != null) {
            i2 = kVar.hashCode();
        }
        return hashCode4 + i2;
    }

    public final String toString() {
        return "CutVideoTitleBarState(backVisible=" + this.backVisible + ", nextVisible=" + this.nextVisible + ", backEnable=" + this.backEnable + ", nextEnable=" + this.nextEnable + ", animateTitleBarEvent=" + this.animateTitleBarEvent + ")";
    }

    public final k getAnimateTitleBarEvent() {
        return this.animateTitleBarEvent;
    }

    public final Boolean getBackEnable() {
        return this.backEnable;
    }

    public final Boolean getBackVisible() {
        return this.backVisible;
    }

    public final Boolean getNextEnable() {
        return this.nextEnable;
    }

    public final Boolean getNextVisible() {
        return this.nextVisible;
    }

    public CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, k kVar) {
        this.backVisible = bool;
        this.nextVisible = bool2;
        this.backEnable = bool3;
        this.nextEnable = bool4;
        this.animateTitleBarEvent = kVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoTitleBarState(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, k kVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : bool2, (i2 & 4) != 0 ? null : bool3, (i2 & 8) != 0 ? null : bool4, (i2 & 16) == 0 ? kVar : null);
    }
}
