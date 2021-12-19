package com.ss.android.ugc.aweme.comment.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.af;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.ext.list.o;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import h.f.b.g;
import h.f.b.l;

public final class GifEmojiListState implements af {
    private final String awemeId;
    private final String keyword;
    private final ListState<GifEmoji, o> listState;

    static {
        Covode.recordClassIndex(44908);
    }

    public GifEmojiListState() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.comment.viewmodel.GifEmojiListState */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GifEmojiListState copy$default(GifEmojiListState gifEmojiListState, String str, String str2, ListState listState2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gifEmojiListState.keyword;
        }
        if ((i2 & 2) != 0) {
            str2 = gifEmojiListState.awemeId;
        }
        if ((i2 & 4) != 0) {
            listState2 = gifEmojiListState.listState;
        }
        return gifEmojiListState.copy(str, str2, listState2);
    }

    public final String component1() {
        return this.keyword;
    }

    public final String component2() {
        return this.awemeId;
    }

    public final ListState<GifEmoji, o> component3() {
        return this.listState;
    }

    public final GifEmojiListState copy(String str, String str2, ListState<GifEmoji, o> listState2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(listState2, "");
        return new GifEmojiListState(str, str2, listState2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GifEmojiListState)) {
            return false;
        }
        GifEmojiListState gifEmojiListState = (GifEmojiListState) obj;
        return l.a(this.keyword, gifEmojiListState.keyword) && l.a(this.awemeId, gifEmojiListState.awemeId) && l.a(this.listState, gifEmojiListState.listState);
    }

    public final int hashCode() {
        String str = this.keyword;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.awemeId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ListState<GifEmoji, o> listState2 = this.listState;
        if (listState2 != null) {
            i2 = listState2.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "GifEmojiListState(keyword=" + this.keyword + ", awemeId=" + this.awemeId + ", listState=" + this.listState + ")";
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final ListState<GifEmoji, o> getListState() {
        return this.listState;
    }

    public GifEmojiListState(String str, String str2, ListState<GifEmoji, o> listState2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(listState2, "");
        this.keyword = str;
        this.awemeId = str2;
        this.listState = listState2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GifEmojiListState(String str, String str2, ListState listState2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? new ListState(new o(false, 3, (byte) 0), null, null, null, null, 30, null) : listState2);
    }
}
