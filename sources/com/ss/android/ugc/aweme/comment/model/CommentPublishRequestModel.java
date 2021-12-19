package com.ss.android.ugc.aweme.comment.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.io.Serializable;
import java.util.List;

public class CommentPublishRequestModel implements Serializable {
    @c(a = "action_type")
    int actionType;
    @c(a = "ad_info")
    String adInfo;
    @c(a = "aweme_id")
    String aid;
    @c(a = "channel_id")
    int channelId;
    @c(a = "is_self_see")
    int isSelfSee;
    @c(a = "reply_id")
    String replyId;
    @c(a = "reply_to_reply_id")
    String replyToReplyId;
    @c(a = "text")
    String text;
    @c(a = "text_extra")
    List<TextExtraStruct> textExtraList;

    static {
        Covode.recordClassIndex(44302);
    }

    public int getActionType() {
        return this.actionType;
    }

    public String getAdInfo() {
        return this.adInfo;
    }

    public String getAid() {
        return this.aid;
    }

    public int getChannelId() {
        return this.channelId;
    }

    public int getIsSelfSee() {
        return this.isSelfSee;
    }

    public String getReplyId() {
        return this.replyId;
    }

    public String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public String getText() {
        return this.text;
    }

    public List<TextExtraStruct> getTextExtraList() {
        return this.textExtraList;
    }

    public void setActionType(int i2) {
        this.actionType = i2;
    }

    public void setAdInfo(String str) {
        this.adInfo = str;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setChannelId(int i2) {
        this.channelId = i2;
    }

    public void setIsSelfSee(int i2) {
        this.isSelfSee = i2;
    }

    public void setReplyId(String str) {
        this.replyId = str;
    }

    public void setReplyToReplyId(String str) {
        this.replyToReplyId = str;
    }

    public void setStructList(List<TextExtraStruct> list) {
        this.textExtraList = list;
    }

    public void setText(String str) {
        this.text = str;
    }
}
