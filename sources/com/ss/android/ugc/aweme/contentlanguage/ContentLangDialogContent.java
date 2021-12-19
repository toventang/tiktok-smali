package com.ss.android.ugc.aweme.contentlanguage;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;

public final class ContentLangDialogContent {
    @c(a = "text")
    private final String text;
    @c(a = "title")
    private final String title;

    static {
        Covode.recordClassIndex(48448);
    }

    public ContentLangDialogContent() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ContentLangDialogContent copy$default(ContentLangDialogContent contentLangDialogContent, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = contentLangDialogContent.title;
        }
        if ((i2 & 2) != 0) {
            str2 = contentLangDialogContent.text;
        }
        return contentLangDialogContent.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final ContentLangDialogContent copy(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        return new ContentLangDialogContent(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentLangDialogContent)) {
            return false;
        }
        ContentLangDialogContent contentLangDialogContent = (ContentLangDialogContent) obj;
        return l.a(this.title, contentLangDialogContent.title) && l.a(this.text, contentLangDialogContent.text);
    }

    public final int hashCode() {
        String str = this.title;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ContentLangDialogContent(title=" + this.title + ", text=" + this.text + ")";
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public ContentLangDialogContent(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.title = str;
        this.text = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContentLangDialogContent(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
