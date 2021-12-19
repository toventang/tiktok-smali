package com.ss.android.ugc.aweme.search.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class f implements Serializable {
    private long clickMagnifyingGlassTime;
    private long guessWordsRequestTime;
    private long gussWordsResponseTime;
    private long loadSuccessTime;

    static {
        Covode.recordClassIndex(79159);
    }

    public final long getClickMagnifyingGlassTime() {
        return this.clickMagnifyingGlassTime;
    }

    public final long getGuessWordsRequestTime() {
        return this.guessWordsRequestTime;
    }

    public final long getGussWordsResponseTime() {
        return this.gussWordsResponseTime;
    }

    public final long getLoadSuccessTime() {
        return this.loadSuccessTime;
    }

    public final void setClickMagnifyingGlassTime(long j2) {
        this.clickMagnifyingGlassTime = j2;
    }

    public final void setGuessWordsRequestTime(long j2) {
        this.guessWordsRequestTime = j2;
    }

    public final void setGussWordsResponseTime(long j2) {
        this.gussWordsResponseTime = j2;
    }

    public final void setLoadSuccessTime(long j2) {
        this.loadSuccessTime = j2;
    }
}
