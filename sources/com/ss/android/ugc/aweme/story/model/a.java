package com.ss.android.ugc.aweme.story.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;

public final class a extends BaseResponse implements Serializable {
    @c(a = "emoji_id")
    private final int emojiId;
    @c(a = "reaction_id")
    private final long reactionId;

    static {
        Covode.recordClassIndex(90268);
    }

    public static int com_ss_android_ugc_aweme_story_model_EmojiReaction_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static int com_ss_android_ugc_aweme_story_model_EmojiReaction_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ a copy$default(a aVar, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j2 = aVar.reactionId;
        }
        if ((i3 & 2) != 0) {
            i2 = aVar.emojiId;
        }
        return aVar.copy(j2, i2);
    }

    public final long component1() {
        return this.reactionId;
    }

    public final int component2() {
        return this.emojiId;
    }

    public final a copy(long j2, int i2) {
        return new a(j2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.reactionId == aVar.reactionId && this.emojiId == aVar.emojiId;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_story_model_EmojiReaction_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.reactionId) * 31) + com_ss_android_ugc_aweme_story_model_EmojiReaction_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.emojiId);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "EmojiReaction(reactionId=" + this.reactionId + ", emojiId=" + this.emojiId + ")";
    }

    public final int getEmojiId() {
        return this.emojiId;
    }

    public final long getReactionId() {
        return this.reactionId;
    }

    public a(long j2, int i2) {
        this.reactionId = j2;
        this.emojiId = i2;
    }
}
