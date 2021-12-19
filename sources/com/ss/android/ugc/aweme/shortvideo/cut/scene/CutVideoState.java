package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.p;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoState implements af {
    private final p nextEvent;
    private final p quitEvent;

    static {
        Covode.recordClassIndex(82427);
    }

    public CutVideoState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CutVideoState copy$default(CutVideoState cutVideoState, p pVar, p pVar2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            pVar = cutVideoState.quitEvent;
        }
        if ((i2 & 2) != 0) {
            pVar2 = cutVideoState.nextEvent;
        }
        return cutVideoState.copy(pVar, pVar2);
    }

    public final p component1() {
        return this.quitEvent;
    }

    public final p component2() {
        return this.nextEvent;
    }

    public final CutVideoState copy(p pVar, p pVar2) {
        return new CutVideoState(pVar, pVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoState)) {
            return false;
        }
        CutVideoState cutVideoState = (CutVideoState) obj;
        return l.a(this.quitEvent, cutVideoState.quitEvent) && l.a(this.nextEvent, cutVideoState.nextEvent);
    }

    public final int hashCode() {
        p pVar = this.quitEvent;
        int i2 = 0;
        int hashCode = (pVar != null ? pVar.hashCode() : 0) * 31;
        p pVar2 = this.nextEvent;
        if (pVar2 != null) {
            i2 = pVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CutVideoState(quitEvent=" + this.quitEvent + ", nextEvent=" + this.nextEvent + ")";
    }

    public final p getNextEvent() {
        return this.nextEvent;
    }

    public final p getQuitEvent() {
        return this.quitEvent;
    }

    public CutVideoState(p pVar, p pVar2) {
        this.quitEvent = pVar;
        this.nextEvent = pVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoState(p pVar, p pVar2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : pVar, (i2 & 2) != 0 ? null : pVar2);
    }
}
