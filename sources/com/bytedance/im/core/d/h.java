package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.internal.utils.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class h implements Serializable, Cloneable, Comparable<h> {
    private int badgeCount;
    private String conversationId;
    private long conversationShortId;
    private int conversationType;
    private i coreInfo;
    private String draftContent;
    private long draftTime;
    private boolean hasMore = true;
    private int inboxType;
    private boolean isInBox;
    private boolean isMember;
    private boolean isPreview;
    private boolean isStranger;
    private ai lastMessage;
    private long lastMessageIndex;
    private long lastMessageOrderIndex;
    private Map<String, String> localExt;
    private long maxIndexV2;
    private ah member;
    private int memberCount;
    private List<Long> memberIds;
    private List<ah> members;
    private long minIndex;
    private long minIndexV2;
    private int readBadgeCount;
    private long readIndex;
    private long readIndexV2;
    private l settingInfo;
    private List<ah> singleChatMembers;
    private long sortOrder;
    private int status;
    private String ticket;
    private long unreadCount;
    private List<ai> unreadSelfMentionedMessages;
    private long updatedTime;

    static {
        Covode.recordClassIndex(22763);
    }

    public int getBadgeCount() {
        return this.badgeCount;
    }

    public String getConversationId() {
        return this.conversationId;
    }

    public long getConversationShortId() {
        return this.conversationShortId;
    }

    public int getConversationType() {
        return this.conversationType;
    }

    public i getCoreInfo() {
        return this.coreInfo;
    }

    public String getDraftContent() {
        return this.draftContent;
    }

    public long getDraftTime() {
        return this.draftTime;
    }

    public int getInboxType() {
        return this.inboxType;
    }

    public ai getLastMessage() {
        return this.lastMessage;
    }

    public long getLastMessageIndex() {
        return this.lastMessageIndex;
    }

    public long getLastMessageOrderIndex() {
        return this.lastMessageOrderIndex;
    }

    public long getMaxIndexV2() {
        return this.maxIndexV2;
    }

    public ah getMember() {
        return this.member;
    }

    public int getMemberCount() {
        return this.memberCount;
    }

    public List<ah> getMembers() {
        return this.members;
    }

    public long getMinIndex() {
        return this.minIndex;
    }

    public long getMinIndexV2() {
        return this.minIndexV2;
    }

    public int getReadBadgeCount() {
        return this.readBadgeCount;
    }

    public long getReadIndex() {
        return this.readIndex;
    }

    public long getReadIndexV2() {
        return this.readIndexV2;
    }

    public l getSettingInfo() {
        return this.settingInfo;
    }

    public List<ah> getSingleChatMembers() {
        return this.singleChatMembers;
    }

    public long getSortOrder() {
        return this.sortOrder;
    }

    public int getStatus() {
        return this.status;
    }

    public String getTicket() {
        return this.ticket;
    }

    public long getUnreadCount() {
        return this.unreadCount;
    }

    public List<ai> getUnreadSelfMentionedMessages() {
        return this.unreadSelfMentionedMessages;
    }

    public long getUpdatedTime() {
        return this.updatedTime;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public boolean isInBox() {
        return this.isInBox;
    }

    public boolean isMember() {
        return this.isMember;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public boolean isStranger() {
        return this.isStranger;
    }

    public String getLocalExtStr() {
        return com.bytedance.im.core.internal.utils.h.a(this.localExt);
    }

    public String getMemberStr() {
        return o.a(this.member);
    }

    public boolean isDissolved() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public h clone() {
        try {
            return (h) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public List<Long> getMemberIds() {
        List<Long> list = this.memberIds;
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    public int getMuted() {
        l lVar = this.settingInfo;
        if (lVar != null) {
            return lVar.getMute();
        }
        return 0;
    }

    public int getStickTop() {
        l lVar = this.settingInfo;
        if (lVar != null) {
            return lVar.getStickTop();
        }
        return 0;
    }

    public int hashCode() {
        String str = this.conversationId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isFavorite() {
        l lVar = this.settingInfo;
        if (lVar == null || !lVar.isFavor()) {
            return false;
        }
        return true;
    }

    public boolean isGroupChat() {
        if (this.conversationType == e.a.f37582b) {
            return true;
        }
        return false;
    }

    public boolean isLiveChat() {
        if (this.conversationType == e.a.f37583c) {
            return true;
        }
        return false;
    }

    public boolean isLocal() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public boolean isMute() {
        l lVar = this.settingInfo;
        if (lVar == null || !lVar.isMute()) {
            return false;
        }
        return true;
    }

    public boolean isSingleChat() {
        if (this.conversationType == e.a.f37581a) {
            return true;
        }
        return false;
    }

    public boolean isStickTop() {
        l lVar = this.settingInfo;
        if (lVar == null || !lVar.isStickTop()) {
            return false;
        }
        return true;
    }

    public boolean isTemp() {
        if (this.conversationShortId <= 0) {
            return true;
        }
        return false;
    }

    public boolean isWaitingInfo() {
        Map<String, String> map = this.localExt;
        if (map == null || !map.containsKey("s:conv_wait_info")) {
            return false;
        }
        return true;
    }

    public synchronized Map<String, String> getExt() {
        MethodCollector.i(2173);
        l lVar = this.settingInfo;
        if (lVar != null) {
            Map<String, String> ext = lVar.getExt();
            MethodCollector.o(2173);
            return ext;
        }
        MethodCollector.o(2173);
        return null;
    }

    public synchronized Map<String, String> getLocalExt() {
        Map<String, String> map;
        MethodCollector.i(2177);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        map = this.localExt;
        MethodCollector.o(2177);
        return map;
    }

    public boolean isReadBadgeCountUpdated() {
        if (this.readBadgeCount > 0 || TextUtils.equals(getLocalExt().get("s:read_badge_count_update"), "1")) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "Conversation{conversationId='" + this.conversationId + '\'' + ", conversationShortId=" + this.conversationShortId + ", conversationType=" + this.conversationType + ", isMember=" + this.isMember + ", memberCount=" + this.memberCount + ", unreadCount=" + this.unreadCount + ", updatedTime=" + this.updatedTime + ", readIndex=" + this.readIndex + ", lastMessageIndex=" + this.lastMessageIndex + ", ticket='" + this.ticket + '\'' + ", inboxType=" + this.inboxType + ", hasMore=" + this.hasMore + ", draftTime=" + this.draftTime + ", draftContent='" + this.draftContent + '\'' + ", sortOrder=" + this.sortOrder + ", localExt=" + this.localExt + ", memberIds=" + this.memberIds + ", lastMessage=" + this.lastMessage + ", member=" + this.member + ", isStranger=" + this.isStranger + ", isInBox=" + this.isInBox + ", members=" + this.members + ", isPreview=" + this.isPreview + '}';
    }

    public void setConversationId(String str) {
        this.conversationId = str;
    }

    public void setConversationShortId(long j2) {
        this.conversationShortId = j2;
    }

    public void setConversationType(int i2) {
        this.conversationType = i2;
    }

    public void setCoreInfo(i iVar) {
        this.coreInfo = iVar;
    }

    public void setDraftContent(String str) {
        this.draftContent = str;
    }

    public void setDraftTime(long j2) {
        this.draftTime = j2;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setInBox(boolean z) {
        this.isInBox = z;
    }

    public void setInboxType(int i2) {
        this.inboxType = i2;
    }

    public void setIsMember(boolean z) {
        this.isMember = z;
    }

    public void setLastMessageIndex(long j2) {
        this.lastMessageIndex = j2;
    }

    public void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public void setMember(ah ahVar) {
        this.member = ahVar;
    }

    public void setMemberCount(int i2) {
        this.memberCount = i2;
    }

    public void setMemberIds(List<Long> list) {
        this.memberIds = list;
    }

    public void setMembers(List<ah> list) {
        this.members = list;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setReadIndex(long j2) {
        this.readIndex = j2;
    }

    public void setSettingInfo(l lVar) {
        this.settingInfo = lVar;
    }

    public void setSingleChatMembers(List<ah> list) {
        this.singleChatMembers = list;
    }

    public void setSortOrder(long j2) {
        this.sortOrder = j2;
    }

    public void setStatus(int i2) {
        this.status = i2;
    }

    public void setStranger(boolean z) {
        this.isStranger = z;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public void setUnreadCount(long j2) {
        this.unreadCount = j2;
    }

    public void setUnreadSelfMentionedMessages(List<ai> list) {
        this.unreadSelfMentionedMessages = list;
    }

    public void setUpdatedTime(long j2) {
        this.updatedTime = j2;
    }

    public void setBadgeCount(int i2) {
        if (i2 > this.badgeCount) {
            this.badgeCount = i2;
        }
    }

    public void setLocalExtStr(String str) {
        this.localExt = com.bytedance.im.core.internal.utils.h.a(str);
    }

    public void setMemberStr(String str) {
        this.member = o.a(str);
    }

    public void setReadBadgeCount(int i2) {
        if (i2 > this.readBadgeCount) {
            this.readBadgeCount = i2;
        }
    }

    public void setLastMessage(ai aiVar) {
        this.lastMessage = aiVar;
        if (aiVar != null) {
            setLastMessageOrderIndex(aiVar.getOrderIndex());
        }
    }

    public void setLastMessageOrderIndex(long j2) {
        if (this.lastMessageOrderIndex < j2) {
            this.lastMessageOrderIndex = j2;
        }
    }

    public void setMaxIndexV2(long j2) {
        if (j2 > this.maxIndexV2) {
            this.maxIndexV2 = j2;
        }
    }

    public void setMinIndex(long j2) {
        if (j2 > this.minIndex) {
            this.minIndex = j2;
        }
    }

    public void setMinIndexV2(long j2) {
        if (j2 > this.minIndexV2) {
            this.minIndexV2 = j2;
        }
    }

    public void setReadIndexV2(long j2) {
        if (j2 > this.readIndexV2) {
            this.readIndexV2 = j2;
        }
    }

    public int compareTo(h hVar) {
        if (hVar.getStickTop() != getStickTop()) {
            return hVar.getStickTop() - getStickTop();
        }
        long max = Math.max(hVar.getUpdatedTime(), hVar.getDraftTime()) - Math.max(getUpdatedTime(), getDraftTime());
        if (max > 0) {
            return 1;
        }
        if (max < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.conversationId;
            String str2 = ((h) obj).conversationId;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean removeMentionMessage(String str) {
        List<ai> list = this.unreadSelfMentionedMessages;
        if (list != null && !list.isEmpty()) {
            for (ai aiVar : this.unreadSelfMentionedMessages) {
                if (TextUtils.equals(str, aiVar.getUuid())) {
                    this.unreadSelfMentionedMessages.remove(aiVar);
                    return true;
                }
            }
        }
        return false;
    }
}
