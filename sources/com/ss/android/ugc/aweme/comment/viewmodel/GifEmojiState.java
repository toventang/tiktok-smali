package com.ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import h.f.b.g;
import h.f.b.l;

public final class GifEmojiState implements af {
    private final GifEmoji gifEmoji;

    static {
        Covode.recordClassIndex(44922);
    }

    public GifEmojiState() {
        this(null, 1, null);
    }

    public static /* synthetic */ GifEmojiState copy$default(GifEmojiState gifEmojiState, GifEmoji gifEmoji2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            gifEmoji2 = gifEmojiState.gifEmoji;
        }
        return gifEmojiState.copy(gifEmoji2);
    }

    public final GifEmoji component1() {
        return this.gifEmoji;
    }

    public final GifEmojiState copy(GifEmoji gifEmoji2) {
        l.d(gifEmoji2, "");
        return new GifEmojiState(gifEmoji2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GifEmojiState) && l.a(this.gifEmoji, ((GifEmojiState) obj).gifEmoji);
        }
        return true;
    }

    public final int hashCode() {
        GifEmoji gifEmoji2 = this.gifEmoji;
        if (gifEmoji2 != null) {
            return gifEmoji2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "GifEmojiState(gifEmoji=" + this.gifEmoji + ")";
    }

    public final GifEmoji getGifEmoji() {
        return this.gifEmoji;
    }

    public GifEmojiState(GifEmoji gifEmoji2) {
        l.d(gifEmoji2, "");
        this.gifEmoji = gifEmoji2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GifEmojiState(GifEmoji gifEmoji2, int i2, g gVar) {
        this((i2 & 1) != 0 ? new GifEmoji() : gifEmoji2);
    }
}
