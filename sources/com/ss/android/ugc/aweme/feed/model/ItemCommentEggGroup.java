package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;
import java.util.List;

public class ItemCommentEggGroup implements Serializable {
    @c(a = "item_comment_eggs")
    List<ItemCommentEggData> commentEggData;
    @c(a = "edit_hint_list")
    List<EditHint> editintist;

    static {
        Covode.recordClassIndex(59412);
    }

    public List<ItemCommentEggData> getCommentEggData() {
        return this.commentEggData;
    }

    public List<EditHint> getEditintist() {
        return this.editintist;
    }

    public String toString() {
        return "ItemCommentEggGroup{editintist=" + this.editintist + ", commentEggData=" + this.commentEggData + '}';
    }

    public void setCommentEggData(List<ItemCommentEggData> list) {
        this.commentEggData = list;
    }

    public void setEditintist(List<EditHint> list) {
        this.editintist = list;
    }
}
