package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.k;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoMultiModeState implements af {
    private final k dismissAnimateEvent;
    private final k showAnimateEvent;
    private final Integer value;

    static {
        Covode.recordClassIndex(82409);
    }

    public CutVideoMultiModeState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ CutVideoMultiModeState copy$default(CutVideoMultiModeState cutVideoMultiModeState, Integer num, k kVar, k kVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            num = cutVideoMultiModeState.value;
        }
        if ((i2 & 2) != 0) {
            kVar = cutVideoMultiModeState.showAnimateEvent;
        }
        if ((i2 & 4) != 0) {
            kVar2 = cutVideoMultiModeState.dismissAnimateEvent;
        }
        return cutVideoMultiModeState.copy(num, kVar, kVar2);
    }

    public final Integer component1() {
        return this.value;
    }

    public final k component2() {
        return this.showAnimateEvent;
    }

    public final k component3() {
        return this.dismissAnimateEvent;
    }

    public final CutVideoMultiModeState copy(Integer num, k kVar, k kVar2) {
        return new CutVideoMultiModeState(num, kVar, kVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoMultiModeState)) {
            return false;
        }
        CutVideoMultiModeState cutVideoMultiModeState = (CutVideoMultiModeState) obj;
        return l.a(this.value, cutVideoMultiModeState.value) && l.a(this.showAnimateEvent, cutVideoMultiModeState.showAnimateEvent) && l.a(this.dismissAnimateEvent, cutVideoMultiModeState.dismissAnimateEvent);
    }

    public final int hashCode() {
        Integer num = this.value;
        int i2 = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        k kVar = this.showAnimateEvent;
        int hashCode2 = (hashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        k kVar2 = this.dismissAnimateEvent;
        if (kVar2 != null) {
            i2 = kVar2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CutVideoMultiModeState(value=" + this.value + ", showAnimateEvent=" + this.showAnimateEvent + ", dismissAnimateEvent=" + this.dismissAnimateEvent + ")";
    }

    public final k getDismissAnimateEvent() {
        return this.dismissAnimateEvent;
    }

    public final k getShowAnimateEvent() {
        return this.showAnimateEvent;
    }

    public final Integer getValue() {
        return this.value;
    }

    public CutVideoMultiModeState(Integer num, k kVar, k kVar2) {
        this.value = num;
        this.showAnimateEvent = kVar;
        this.dismissAnimateEvent = kVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoMultiModeState(Integer num, k kVar, k kVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : kVar, (i2 & 4) != 0 ? null : kVar2);
    }
}
