package com.ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.io.Serializable;

public final class d implements Serializable {
    @c(a = "block_type")
    private int blockType;
    @c(a = "mention_type")
    private int mentionType;

    static {
        Covode.recordClassIndex(44519);
    }

    public d() {
        this(0, 0, 3, null);
    }

    public static int com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckSingleTypeResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ d copy$default(d dVar, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = dVar.mentionType;
        }
        if ((i4 & 2) != 0) {
            i3 = dVar.blockType;
        }
        return dVar.copy(i2, i3);
    }

    public final int component1() {
        return this.mentionType;
    }

    public final int component2() {
        return this.blockType;
    }

    public final d copy(int i2, int i3) {
        return new d(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.mentionType == dVar.mentionType && this.blockType == dVar.blockType;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckSingleTypeResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.mentionType) * 31) + com_ss_android_ugc_aweme_comment_page_tag_api_MentionCheckSingleTypeResult_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.blockType);
    }

    public final String toString() {
        return "MentionCheckSingleTypeResult(mentionType=" + this.mentionType + ", blockType=" + this.blockType + ")";
    }

    public final int getBlockType() {
        return this.blockType;
    }

    public final int getMentionType() {
        return this.mentionType;
    }

    public final void setBlockType(int i2) {
        this.blockType = i2;
    }

    public final void setMentionType(int i2) {
        this.mentionType = i2;
    }

    public d(int i2, int i3) {
        this.mentionType = i2;
        this.blockType = i3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i2, int i3, int i4, g gVar) {
        this((i4 & 1) != 0 ? 0 : i2, (i4 & 2) != 0 ? 0 : i3);
    }
}
