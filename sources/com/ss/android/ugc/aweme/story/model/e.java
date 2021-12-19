package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class e implements Serializable {
    @c(a = "total")
    private final long total;

    static {
        Covode.recordClassIndex(90272);
    }

    public static int com_ss_android_ugc_aweme_story_model_StoryArchStatistic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ e copy$default(e eVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = eVar.total;
        }
        return eVar.copy(j2);
    }

    public final long component1() {
        return this.total;
    }

    public final e copy(long j2) {
        return new e(j2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof e) && this.total == ((e) obj).total;
        }
        return true;
    }

    public final int hashCode() {
        return com_ss_android_ugc_aweme_story_model_StoryArchStatistic_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.total);
    }

    public final String toString() {
        return "StoryArchStatistic(total=" + this.total + ")";
    }

    public final long getTotal() {
        return this.total;
    }

    public e(long j2) {
        this.total = j2;
    }
}
