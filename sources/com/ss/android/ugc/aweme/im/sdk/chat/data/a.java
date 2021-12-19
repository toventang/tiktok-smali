package com.ss.android.ugc.aweme.im.sdk.chat.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.d.ai;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public class a implements Serializable {
    private int chatType;
    private String conversationId = "";
    private int enterFrom;
    private String enterFromForMob = "";
    private List<ai> selectMsgList;
    private int selectMsgType;
    private b statictisParams = new b(null, 1, null);
    private int unreadCount;

    static {
        Covode.recordClassIndex(63893);
    }

    public static /* synthetic */ void getChatType$annotations() {
    }

    public static /* synthetic */ void getEnterFrom$annotations() {
    }

    public IMUser getSingleChatFromUser() {
        return null;
    }

    public String getSingleChatFromUserId() {
        return null;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final int getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterFromForMob() {
        return this.enterFromForMob;
    }

    public final List<ai> getSelectMsgList() {
        return this.selectMsgList;
    }

    public final int getSelectMsgType() {
        return this.selectMsgType;
    }

    public final b getStatictisParams() {
        return this.statictisParams;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }

    public final boolean isFriendChat() {
        if (this.chatType == 0) {
            return true;
        }
        return false;
    }

    public final boolean isStrangerChat() {
        if (this.chatType == 1) {
            return true;
        }
        return false;
    }

    public final boolean isAuthorSupporterChat() {
        if (this.chatType == 4) {
            return true;
        }
        return false;
    }

    public final boolean isEnterpriseChat() {
        if (this.chatType == 2) {
            return true;
        }
        return false;
    }

    public final boolean isGroupChat() {
        if (this.chatType == 3) {
            return true;
        }
        return false;
    }

    public final boolean isSingleChat() {
        int i2 = this.chatType;
        if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 4) {
            return true;
        }
        return false;
    }

    public final void setChatType(int i2) {
        this.chatType = i2;
    }

    public final void setEnterFrom(int i2) {
        this.enterFrom = i2;
    }

    public final void setEnterFromForMob(String str) {
        this.enterFromForMob = str;
    }

    public final void setSelectMsgList(List<ai> list) {
        this.selectMsgList = list;
    }

    public final void setSelectMsgType(int i2) {
        this.selectMsgType = i2;
    }

    public final void setUnreadCount(int i2) {
        this.unreadCount = i2;
    }

    public final void setConversationId(String str) {
        l.d(str, "");
        this.conversationId = str;
    }

    public final void setStatictisParams(b bVar) {
        l.d(bVar, "");
        this.statictisParams = bVar;
    }
}
