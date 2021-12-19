package com.ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class CorrectPosition implements Serializable {
    private final int begin;
    private final int end;

    static {
        Covode.recordClassIndex(50890);
    }

    public static int com_ss_android_ugc_aweme_discover_model_CorrectPosition_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CorrectPosition copy$default(CorrectPosition correctPosition, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = correctPosition.begin;
        }
        if ((i4 & 2) != 0) {
            i3 = correctPosition.end;
        }
        return correctPosition.copy(i2, i3);
    }

    public final int component1() {
        return this.begin;
    }

    public final int component2() {
        return this.end;
    }

    public final CorrectPosition copy(int i2, int i3) {
        return new CorrectPosition(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorrectPosition)) {
            return false;
        }
        CorrectPosition correctPosition = (CorrectPosition) obj;
        return this.begin == correctPosition.begin && this.end == correctPosition.end;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_discover_model_CorrectPosition_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.begin) * 31) + com_ss_android_ugc_aweme_discover_model_CorrectPosition_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.end);
    }

    public final String toString() {
        return "CorrectPosition(begin=" + this.begin + ", end=" + this.end + ")";
    }

    public final int getBegin() {
        return this.begin;
    }

    public final int getEnd() {
        return this.end;
    }

    public final boolean isValid() {
        if (this.end >= this.begin) {
            return true;
        }
        return false;
    }

    public CorrectPosition(int i2, int i3) {
        this.begin = i2;
        this.end = i3;
    }
}
