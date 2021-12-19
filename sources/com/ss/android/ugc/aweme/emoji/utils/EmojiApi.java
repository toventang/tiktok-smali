package com.ss.android.ugc.aweme.emoji.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.EmojiResourcesResponse;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import kotlinx.coroutines.av;
import l.b.f;
import l.b.o;
import l.b.t;

public interface EmojiApi {
    static {
        Covode.recordClassIndex(56208);
    }

    @o(a = "im/resources/sticker/collect/")
    av<Object> collectEmoji(@t(a = "action") int i2, @t(a = "sticker_ids") String str);

    @f(a = "im/resources/")
    av<ResourcesResponse> getResources(@t(a = "resource_type") String str);

    @f(a = "im/resources/sticker/list/")
    av<EmojiResourcesResponse> getSelfEmojis();

    @f(a = "im/resources/emoticon/trending/")
    av<Object> getTrendingEmojis(@t(a = "cursor") int i2, @t(a = "count") int i3, @t(a = "source") String str, @t(a = "group_id") String str2);

    @o(a = "im/resources/sticker/collect/")
    f.a.t<Object> rxCollectEmoji(@t(a = "action") int i2, @t(a = "sticker_ids") String str);

    @o(a = "im/resources/sticker/collect/")
    f.a.t<Object> rxCollectEmoji(@t(a = "action") int i2, @t(a = "sticker_ids") String str, @t(a = "sticker_uri") String str2, @t(a = "sticker_url") String str3, @t(a = "resource_id") long j2, @t(a = "sticker_type") int i3);
}
