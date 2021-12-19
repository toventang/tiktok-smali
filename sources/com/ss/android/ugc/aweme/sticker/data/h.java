package com.ss.android.ugc.aweme.sticker.data;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class h implements Serializable {
    @c(a = "end_time")
    public long endTime;
    @c(a = "start_time")
    public long startTime;
    @c(a = "text")
    public String text;

    static {
        Covode.recordClassIndex(88116);
    }

    public static int com_ss_android_ugc_aweme_sticker_data_Utterance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getText() {
        return this.text;
    }

    public h() {
        this.text = "";
    }

    public final int hashCode() {
        return (int) ((((this.startTime * 31) + ((long) com_ss_android_ugc_aweme_sticker_data_Utterance_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.endTime))) * 31) + ((long) this.text.hashCode()));
    }

    public final void setEndTime(long j2) {
        this.endTime = j2;
    }

    public final void setStartTime(long j2) {
        this.startTime = j2;
    }

    public final void setText(String str) {
        l.d(str, "");
        this.text = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(h hVar) {
        this();
        l.d(hVar, "");
        this.startTime = hVar.startTime;
        this.endTime = hVar.endTime;
        this.text = hVar.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sticker.data.Utterance");
        h hVar = (h) obj;
        if (this.startTime == hVar.startTime && this.endTime == hVar.endTime && !(!l.a((Object) this.text, (Object) hVar.text))) {
            return true;
        }
        return false;
    }

    public h(long j2, long j3) {
        this();
        this.startTime = j2;
        this.endTime = j3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(long j2, long j3, String str) {
        this();
        l.d(str, "");
        this.startTime = j2;
        this.endTime = j3;
        this.text = str;
    }
}
