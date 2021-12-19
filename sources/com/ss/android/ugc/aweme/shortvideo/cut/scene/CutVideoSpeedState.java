package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoSpeedState implements af {
    private final Boolean enable;
    private final Boolean visible;

    static {
        Covode.recordClassIndex(82420);
    }

    public CutVideoSpeedState() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ CutVideoSpeedState copy$default(CutVideoSpeedState cutVideoSpeedState, Boolean bool, Boolean bool2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bool = cutVideoSpeedState.enable;
        }
        if ((i2 & 2) != 0) {
            bool2 = cutVideoSpeedState.visible;
        }
        return cutVideoSpeedState.copy(bool, bool2);
    }

    public final Boolean component1() {
        return this.enable;
    }

    public final Boolean component2() {
        return this.visible;
    }

    public final CutVideoSpeedState copy(Boolean bool, Boolean bool2) {
        return new CutVideoSpeedState(bool, bool2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoSpeedState)) {
            return false;
        }
        CutVideoSpeedState cutVideoSpeedState = (CutVideoSpeedState) obj;
        return l.a(this.enable, cutVideoSpeedState.enable) && l.a(this.visible, cutVideoSpeedState.visible);
    }

    public final int hashCode() {
        Boolean bool = this.enable;
        int i2 = 0;
        int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
        Boolean bool2 = this.visible;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "CutVideoSpeedState(enable=" + this.enable + ", visible=" + this.visible + ")";
    }

    public final Boolean getEnable() {
        return this.enable;
    }

    public final Boolean getVisible() {
        return this.visible;
    }

    public CutVideoSpeedState(Boolean bool, Boolean bool2) {
        this.enable = bool;
        this.visible = bool2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoSpeedState(Boolean bool, Boolean bool2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : bool2);
    }
}
