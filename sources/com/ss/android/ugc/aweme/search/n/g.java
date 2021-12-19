package com.ss.android.ugc.aweme.search.n;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import h.f.b.l;
import java.io.Serializable;

public final class g implements Serializable {
    private final String hintWord;
    private final String hintWordId;
    private final Word inboxWord;

    static {
        Covode.recordClassIndex(79174);
    }

    public g() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ g copy$default(g gVar, String str, String str2, Word word, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gVar.hintWord;
        }
        if ((i2 & 2) != 0) {
            str2 = gVar.hintWordId;
        }
        if ((i2 & 4) != 0) {
            word = gVar.inboxWord;
        }
        return gVar.copy(str, str2, word);
    }

    public final String component1() {
        return this.hintWord;
    }

    public final String component2() {
        return this.hintWordId;
    }

    public final Word component3() {
        return this.inboxWord;
    }

    public final g copy(String str, String str2, Word word) {
        return new g(str, str2, word);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.hintWord, gVar.hintWord) && l.a(this.hintWordId, gVar.hintWordId) && l.a(this.inboxWord, gVar.inboxWord);
    }

    public final int hashCode() {
        String str = this.hintWord;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hintWordId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Word word = this.inboxWord;
        if (word != null) {
            i2 = word.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "SearchInputModel(hintWord=" + this.hintWord + ", hintWordId=" + this.hintWordId + ", inboxWord=" + this.inboxWord + ")";
    }

    public final String getHintWord() {
        return this.hintWord;
    }

    public final String getHintWordId() {
        return this.hintWordId;
    }

    public final Word getInboxWord() {
        return this.inboxWord;
    }

    public g(String str, String str2, Word word) {
        this.hintWord = str;
        this.hintWordId = str2;
        this.inboxWord = word;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, String str2, Word word, int i2, h.f.b.g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : word);
    }
}
