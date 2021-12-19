package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CommentPrompt implements Serializable {
    @c(a = "content")
    private final String content;
    @c(a = StringSet.type)
    private final int type;

    static {
        Covode.recordClassIndex(44301);
    }

    public CommentPrompt() {
        this(0, null, 3, null);
    }

    public static int com_ss_android_ugc_aweme_comment_model_CommentPrompt_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ CommentPrompt copy$default(CommentPrompt commentPrompt, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = commentPrompt.type;
        }
        if ((i3 & 2) != 0) {
            str = commentPrompt.content;
        }
        return commentPrompt.copy(i2, str);
    }

    public final int component1() {
        return this.type;
    }

    public final String component2() {
        return this.content;
    }

    public final CommentPrompt copy(int i2, String str) {
        l.d(str, "");
        return new CommentPrompt(i2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPrompt)) {
            return false;
        }
        CommentPrompt commentPrompt = (CommentPrompt) obj;
        return this.type == commentPrompt.type && l.a(this.content, commentPrompt.content);
    }

    public final int hashCode() {
        int com_ss_android_ugc_aweme_comment_model_CommentPrompt_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode = com_ss_android_ugc_aweme_comment_model_CommentPrompt_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.type) * 31;
        String str = this.content;
        return com_ss_android_ugc_aweme_comment_model_CommentPrompt_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CommentPrompt(type=" + this.type + ", content=" + this.content + ")";
    }

    public final String getContent() {
        return this.content;
    }

    public final int getType() {
        return this.type;
    }

    public CommentPrompt(int i2, String str) {
        l.d(str, "");
        this.type = i2;
        this.content = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CommentPrompt(int i2, String str, int i3, g gVar) {
        this((i3 & 1) != 0 ? 0 : i2, (i3 & 2) != 0 ? "" : str);
    }
}
