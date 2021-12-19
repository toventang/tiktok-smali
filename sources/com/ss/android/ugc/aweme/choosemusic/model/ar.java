package com.ss.android.ugc.aweme.choosemusic.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class ar implements Serializable {
    @c(a = "id", b = {"group_id"})
    private String id;
    private boolean isShowed;
    @c(a = "params")
    private al params;
    @c(a = "word", b = {"words_content"})
    private String word;
    @c(a = "words_position")
    private int wordPosition;
    @c(a = "words_source")
    private String wordSource;

    static {
        Covode.recordClassIndex(43560);
    }

    public final String getId() {
        return this.id;
    }

    public final al getParams() {
        return this.params;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordPosition() {
        return this.wordPosition;
    }

    public final String getWordSource() {
        return this.wordSource;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final int hashCode() {
        String str = this.word;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setParams(al alVar) {
        this.params = alVar;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(int i2) {
        this.wordPosition = i2;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!l.a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.choosemusic.model.Word");
        if (!l.a((Object) this.word, (Object) ((ar) obj).word)) {
            return false;
        }
        return true;
    }
}
