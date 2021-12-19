package com.ss.android.ugc.aweme.discover.model.suggest;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.l;
import java.io.Serializable;
import java.util.Objects;

public final class Word implements Serializable {
    @c(a = "id", b = {"group_id"})
    private String id;
    private String implId;
    private boolean isShowed;
    @c(a = "show_word")
    private String showWord;
    @c(a = "type_image")
    private UrlModel typeImage;
    @c(a = "word", b = {"words_content"})
    private String word;
    @c(a = "words_position")
    private int wordPosition;
    @c(a = "words_source")
    private String wordSource;
    @c(a = "words_type")
    private String wordType;

    static {
        Covode.recordClassIndex(50995);
    }

    public Word() {
    }

    public final String getId() {
        return this.id;
    }

    public final String getImplId() {
        return this.implId;
    }

    public final String getShowWord() {
        return this.showWord;
    }

    public final UrlModel getTypeImage() {
        return this.typeImage;
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

    public final String getWordType() {
        return this.wordType;
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

    public final void setImplId(String str) {
        this.implId = str;
    }

    public final void setShowWord(String str) {
        this.showWord = str;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setTypeImage(UrlModel urlModel) {
        this.typeImage = urlModel;
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

    public final void setWordType(String str) {
        this.wordType = str;
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
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.Word");
        if (!l.a((Object) this.word, (Object) ((Word) obj).word)) {
            return false;
        }
        return true;
    }

    public Word(String str, String str2) {
        this.id = str;
        this.word = str2;
    }
}
