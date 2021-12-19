package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.b;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;

public class CommerceConfigData implements Serializable {
    @b(a = StringJsonAdapterFactory.class)
    @c(a = "data")
    public ItemCommentEggGroup itemCommentEggGroup;
    @c(a = "item_like_egg")
    public ItemLikeEggData itemLikeEggData;
    @c(a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(59363);
    }

    public ItemCommentEggGroup getItemCommentEggGroup() {
        return this.itemCommentEggGroup;
    }

    public ItemLikeEggData getItemLikeEggData() {
        return this.itemLikeEggData;
    }

    public int getType() {
        return this.type;
    }

    public void setItemCommentEggGroup(ItemCommentEggGroup itemCommentEggGroup2) {
        this.itemCommentEggGroup = itemCommentEggGroup2;
    }

    public void setItemLikeEggData(ItemLikeEggData itemLikeEggData2) {
        this.itemLikeEggData = itemLikeEggData2;
    }

    public void setType(int i2) {
        this.type = i2;
    }
}
