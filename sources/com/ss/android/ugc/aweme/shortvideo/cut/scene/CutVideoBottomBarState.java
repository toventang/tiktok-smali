package com.ss.android.ugc.aweme.shortvideo.cut.scene;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import h.f.b.g;
import h.f.b.l;

public final class CutVideoBottomBarState implements af {
    private final Boolean deleteEnable;
    private final Boolean deleteVisible;
    private final Boolean rotateEnable;
    private final Boolean rotateVisible;
    private final Float selectTime;
    private final Boolean speedChecked;
    private final Boolean speedEnable;
    private final Boolean speedVisible;

    static {
        Covode.recordClassIndex(82373);
    }

    public CutVideoBottomBarState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ CutVideoBottomBarState copy$default(CutVideoBottomBarState cutVideoBottomBarState, Float f2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = cutVideoBottomBarState.selectTime;
        }
        if ((i2 & 2) != 0) {
            bool = cutVideoBottomBarState.speedVisible;
        }
        if ((i2 & 4) != 0) {
            bool2 = cutVideoBottomBarState.speedChecked;
        }
        if ((i2 & 8) != 0) {
            bool3 = cutVideoBottomBarState.rotateVisible;
        }
        if ((i2 & 16) != 0) {
            bool4 = cutVideoBottomBarState.deleteVisible;
        }
        if ((i2 & 32) != 0) {
            bool5 = cutVideoBottomBarState.rotateEnable;
        }
        if ((i2 & 64) != 0) {
            bool6 = cutVideoBottomBarState.speedEnable;
        }
        if ((i2 & 128) != 0) {
            bool7 = cutVideoBottomBarState.deleteEnable;
        }
        return cutVideoBottomBarState.copy(f2, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public final Float component1() {
        return this.selectTime;
    }

    public final Boolean component2() {
        return this.speedVisible;
    }

    public final Boolean component3() {
        return this.speedChecked;
    }

    public final Boolean component4() {
        return this.rotateVisible;
    }

    public final Boolean component5() {
        return this.deleteVisible;
    }

    public final Boolean component6() {
        return this.rotateEnable;
    }

    public final Boolean component7() {
        return this.speedEnable;
    }

    public final Boolean component8() {
        return this.deleteEnable;
    }

    public final CutVideoBottomBarState copy(Float f2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        return new CutVideoBottomBarState(f2, bool, bool2, bool3, bool4, bool5, bool6, bool7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CutVideoBottomBarState)) {
            return false;
        }
        CutVideoBottomBarState cutVideoBottomBarState = (CutVideoBottomBarState) obj;
        return l.a(this.selectTime, cutVideoBottomBarState.selectTime) && l.a(this.speedVisible, cutVideoBottomBarState.speedVisible) && l.a(this.speedChecked, cutVideoBottomBarState.speedChecked) && l.a(this.rotateVisible, cutVideoBottomBarState.rotateVisible) && l.a(this.deleteVisible, cutVideoBottomBarState.deleteVisible) && l.a(this.rotateEnable, cutVideoBottomBarState.rotateEnable) && l.a(this.speedEnable, cutVideoBottomBarState.speedEnable) && l.a(this.deleteEnable, cutVideoBottomBarState.deleteEnable);
    }

    public final int hashCode() {
        Float f2 = this.selectTime;
        int i2 = 0;
        int hashCode = (f2 != null ? f2.hashCode() : 0) * 31;
        Boolean bool = this.speedVisible;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.speedChecked;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.rotateVisible;
        int hashCode4 = (hashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.deleteVisible;
        int hashCode5 = (hashCode4 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.rotateEnable;
        int hashCode6 = (hashCode5 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.speedEnable;
        int hashCode7 = (hashCode6 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Boolean bool7 = this.deleteEnable;
        if (bool7 != null) {
            i2 = bool7.hashCode();
        }
        return hashCode7 + i2;
    }

    public final String toString() {
        return "CutVideoBottomBarState(selectTime=" + this.selectTime + ", speedVisible=" + this.speedVisible + ", speedChecked=" + this.speedChecked + ", rotateVisible=" + this.rotateVisible + ", deleteVisible=" + this.deleteVisible + ", rotateEnable=" + this.rotateEnable + ", speedEnable=" + this.speedEnable + ", deleteEnable=" + this.deleteEnable + ")";
    }

    public final Boolean getDeleteEnable() {
        return this.deleteEnable;
    }

    public final Boolean getDeleteVisible() {
        return this.deleteVisible;
    }

    public final Boolean getRotateEnable() {
        return this.rotateEnable;
    }

    public final Boolean getRotateVisible() {
        return this.rotateVisible;
    }

    public final Float getSelectTime() {
        return this.selectTime;
    }

    public final Boolean getSpeedChecked() {
        return this.speedChecked;
    }

    public final Boolean getSpeedEnable() {
        return this.speedEnable;
    }

    public final Boolean getSpeedVisible() {
        return this.speedVisible;
    }

    public CutVideoBottomBarState(Float f2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.selectTime = f2;
        this.speedVisible = bool;
        this.speedChecked = bool2;
        this.rotateVisible = bool3;
        this.deleteVisible = bool4;
        this.rotateEnable = bool5;
        this.speedEnable = bool6;
        this.deleteEnable = bool7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CutVideoBottomBarState(Float f2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : f2, (i2 & 2) != 0 ? null : bool, (i2 & 4) != 0 ? null : bool2, (i2 & 8) != 0 ? null : bool3, (i2 & 16) != 0 ? null : bool4, (i2 & 32) != 0 ? null : bool5, (i2 & 64) != 0 ? null : bool6, (i2 & 128) == 0 ? bool7 : null);
    }
}
