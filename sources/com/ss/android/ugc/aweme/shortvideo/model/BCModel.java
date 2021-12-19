package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class BCModel {
    public final boolean shouldShowUsageCheck;

    static {
        Covode.recordClassIndex(84410);
    }

    public BCModel() {
        this(false, 1, null);
    }

    public static /* synthetic */ BCModel copy$default(BCModel bCModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = bCModel.shouldShowUsageCheck;
        }
        return bCModel.copy(z);
    }

    public final BCModel copy(boolean z) {
        return new BCModel(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof BCModel) && this.shouldShowUsageCheck == ((BCModel) obj).shouldShowUsageCheck;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.shouldShowUsageCheck;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "BCModel(shouldShowUsageCheck=" + this.shouldShowUsageCheck + ")";
    }

    public BCModel(boolean z) {
        this.shouldShowUsageCheck = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BCModel(boolean z, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z);
    }
}
