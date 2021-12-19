package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoMultiBottomState implements af {
    private final Boolean visible;

    static {
        Covode.recordClassIndex(82406);
    }

    public CutVideoMultiBottomState() {
        this(null, 1, null);
    }

    public static /* synthetic */ CutVideoMultiBottomState copy$default(CutVideoMultiBottomState cutVideoMultiBottomState, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = cutVideoMultiBottomState.visible;
        }
        return cutVideoMultiBottomState.copy(bool);
    }

    public final Boolean component1() {
        return this.visible;
    }

    public final CutVideoMultiBottomState copy(Boolean bool) {
        return new CutVideoMultiBottomState(bool);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CutVideoMultiBottomState) && l.a(this.visible, ((CutVideoMultiBottomState) obj).visible);
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.visible;
        if (bool != null) {
            return bool.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CutVideoMultiBottomState(visible=" + this.visible + ")";
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoMultiBottomState(Boolean bool) {
        this.visible = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoMultiBottomState(Boolean bool, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bool);
    }
}
