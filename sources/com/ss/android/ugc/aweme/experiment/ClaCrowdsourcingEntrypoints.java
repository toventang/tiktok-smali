package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class ClaCrowdsourcingEntrypoints {
    @c(a = "is_enrolled")
    private boolean isEnrolled;
    @c(a = "is_opt_out")
    private boolean isOptOut;
    @c(a = "is_targeted_user")
    private boolean isTargetedUser;
    @c(a = "pass_ags")
    private boolean passAgs;
    @c(a = "subtitle_type")
    private gv subtitleType;

    static {
        Covode.recordClassIndex(56246);
    }

    public ClaCrowdsourcingEntrypoints() {
        this(false, false, false, false, null, 31, null);
    }

    private final boolean component1() {
        return this.isEnrolled;
    }

    public static /* synthetic */ ClaCrowdsourcingEntrypoints copy$default(ClaCrowdsourcingEntrypoints claCrowdsourcingEntrypoints, boolean z, boolean z2, boolean z3, boolean z4, gv gvVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = claCrowdsourcingEntrypoints.isEnrolled;
        }
        if ((i2 & 2) != 0) {
            z2 = claCrowdsourcingEntrypoints.isOptOut;
        }
        if ((i2 & 4) != 0) {
            z3 = claCrowdsourcingEntrypoints.isTargetedUser;
        }
        if ((i2 & 8) != 0) {
            z4 = claCrowdsourcingEntrypoints.passAgs;
        }
        if ((i2 & 16) != 0) {
            gvVar = claCrowdsourcingEntrypoints.subtitleType;
        }
        return claCrowdsourcingEntrypoints.copy(z, z2, z3, z4, gvVar);
    }

    public final boolean component2() {
        return this.isOptOut;
    }

    public final boolean component3() {
        return this.isTargetedUser;
    }

    public final boolean component4() {
        return this.passAgs;
    }

    public final gv component5() {
        return this.subtitleType;
    }

    public final ClaCrowdsourcingEntrypoints copy(boolean z, boolean z2, boolean z3, boolean z4, gv gvVar) {
        l.d(gvVar, "");
        return new ClaCrowdsourcingEntrypoints(z, z2, z3, z4, gvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaCrowdsourcingEntrypoints)) {
            return false;
        }
        ClaCrowdsourcingEntrypoints claCrowdsourcingEntrypoints = (ClaCrowdsourcingEntrypoints) obj;
        return this.isEnrolled == claCrowdsourcingEntrypoints.isEnrolled && this.isOptOut == claCrowdsourcingEntrypoints.isOptOut && this.isTargetedUser == claCrowdsourcingEntrypoints.isTargetedUser && this.passAgs == claCrowdsourcingEntrypoints.passAgs && l.a(this.subtitleType, claCrowdsourcingEntrypoints.subtitleType);
    }

    public final int hashCode() {
        boolean z = this.isEnrolled;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = i3 * 31;
        boolean z2 = this.isOptOut;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.isTargetedUser;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        if (!this.passAgs) {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        gv gvVar = this.subtitleType;
        return i15 + (gvVar != null ? gvVar.hashCode() : 0);
    }

    public final String toString() {
        return "ClaCrowdsourcingEntrypoints(isEnrolled=" + this.isEnrolled + ", isOptOut=" + this.isOptOut + ", isTargetedUser=" + this.isTargetedUser + ", passAgs=" + this.passAgs + ", subtitleType=" + this.subtitleType + ")";
    }

    public final boolean getPassAgs() {
        return this.passAgs;
    }

    public final gv getSubtitleType() {
        return this.subtitleType;
    }

    public final boolean isOptOut() {
        return this.isOptOut;
    }

    public final boolean isTargetedUser() {
        return this.isTargetedUser;
    }

    public final boolean isEnrolled() {
        if (n.f90266a || this.isEnrolled) {
            return true;
        }
        return false;
    }

    public final void setOptOut(boolean z) {
        this.isOptOut = z;
    }

    public final void setPassAgs(boolean z) {
        this.passAgs = z;
    }

    public final void setTargetedUser(boolean z) {
        this.isTargetedUser = z;
    }

    public final void setSubtitleType(gv gvVar) {
        l.d(gvVar, "");
        this.subtitleType = gvVar;
    }

    public ClaCrowdsourcingEntrypoints(boolean z, boolean z2, boolean z3, boolean z4, gv gvVar) {
        l.d(gvVar, "");
        this.isEnrolled = z;
        this.isOptOut = z2;
        this.isTargetedUser = z3;
        this.passAgs = z4;
        this.subtitleType = gvVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClaCrowdsourcingEntrypoints(boolean z, boolean z2, boolean z3, boolean z4, gv gvVar, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) == 0 ? z4 : false, (i2 & 16) != 0 ? new gv() : gvVar);
    }
}
