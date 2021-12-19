package com.ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public final class ClickSearchWord {
    @c(a = "group_id")
    public final String groupId;
    public boolean isShowed;
    @c(a = "sug_word")
    public final String word;
    @c(a = "word_record")
    public final Word wordRecord;

    static {
        Covode.recordClassIndex(50987);
    }

    public ClickSearchWord() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ClickSearchWord copy$default(ClickSearchWord clickSearchWord, String str, String str2, Word word2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = clickSearchWord.word;
        }
        if ((i2 & 2) != 0) {
            str2 = clickSearchWord.groupId;
        }
        if ((i2 & 4) != 0) {
            word2 = clickSearchWord.wordRecord;
        }
        return clickSearchWord.copy(str, str2, word2);
    }

    public final ClickSearchWord copy(String str, String str2, Word word2) {
        return new ClickSearchWord(str, str2, word2);
    }

    public final String toString() {
        return "ClickSearchWord(word=" + this.word + ", groupId=" + this.groupId + ", wordRecord=" + this.wordRecord + ")";
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public ClickSearchWord(String str, String str2, Word word2) {
        this.word = str;
        this.groupId = str2;
        this.wordRecord = word2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ClickSearchWord(String str, String str2, Word word2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : word2);
    }
}
