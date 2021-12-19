package com.bytedance.android.live.base.model;

import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import java.util.List;

public final class HashtagResponse {
    @c(a = "game_hashtag")
    public Hashtag gameHashTag;
    @c(a = "game_tag_list")
    public List<GameTag> gameTagList;
    @c(a = "hashtag")
    public List<Hashtag> hashtags;

    static {
        Covode.recordClassIndex(3573);
    }

    public HashtagResponse() {
        this(null, null, null, 7, null);
    }

    public HashtagResponse(List<Hashtag> list, List<GameTag> list2, Hashtag hashtag) {
        this.hashtags = list;
        this.gameTagList = list2;
        this.gameHashTag = hashtag;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HashtagResponse(List list, List list2, Hashtag hashtag, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : list2, (i2 & 4) != 0 ? null : hashtag);
    }
}
