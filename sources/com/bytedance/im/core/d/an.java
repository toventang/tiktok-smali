package com.bytedance.im.core.d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.ModifyMessagePropertyStatus;
import com.bytedance.im.core.proto.ModifyPropertyContent;
import com.bytedance.im.core.proto.OPERATION_TYPE;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class an implements Serializable, Cloneable {
    public String clientMessageId;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public int inboxType;
    private ModifyMessagePropertyStatus modifyMsgPropertyStatus;
    private int msgType;
    boolean mute;
    private List<ModifyPropertyContent> propertyContentList;
    public long serverMessageId;
    public String ticket;

    static {
        Covode.recordClassIndex(22712);
    }

    public String getClientMessageId() {
        return this.clientMessageId;
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

    public int getInboxType() {
        return this.inboxType;
    }

    public ModifyMessagePropertyStatus getModifyMsgPropertyStatus() {
        return this.modifyMsgPropertyStatus;
    }

    public int getMsgType() {
        return this.msgType;
    }

    public boolean getMute() {
        return this.mute;
    }

    public List<ModifyPropertyContent> getPropertyContentList() {
        return this.propertyContentList;
    }

    public long getServerMessageId() {
        return this.serverMessageId;
    }

    public String getTicket() {
        return this.ticket;
    }

    public String toString() {
        return h.f38770a.b(this);
    }

    public boolean invalid() {
        if (TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.ticket)) {
            return true;
        }
        return false;
    }

    public an copy() {
        an anVar = new an();
        anVar.conversationId = getConversationId();
        anVar.conversationShortId = getConversationShortId();
        anVar.conversationType = getConversationType();
        anVar.ticket = getTicket();
        anVar.inboxType = getInboxType();
        anVar.serverMessageId = getServerMessageId();
        anVar.clientMessageId = getClientMessageId();
        anVar.msgType = getMsgType();
        anVar.propertyContentList = getPropertyContentList();
        anVar.modifyMsgPropertyStatus = getModifyMsgPropertyStatus();
        return anVar;
    }

    public void setClientMessageId(String str) {
        this.clientMessageId = str;
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

    public void setInboxType(int i2) {
        this.inboxType = i2;
    }

    public void setModifyMsgPropertyStatus(ModifyMessagePropertyStatus modifyMessagePropertyStatus) {
        this.modifyMsgPropertyStatus = modifyMessagePropertyStatus;
    }

    public void setMsgType(int i2) {
        this.msgType = i2;
    }

    public void setMute(boolean z) {
        this.mute = z;
    }

    public void setPropertyContentList(List<ModifyPropertyContent> list) {
        this.propertyContentList = list;
    }

    public void setServerMessageId(long j2) {
        this.serverMessageId = j2;
    }

    public void setTicket(String str) {
        this.ticket = str;
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final an f37817a = new an();

        static {
            Covode.recordClassIndex(22713);
        }

        public final a a(ai aiVar) {
            if (aiVar != null) {
                this.f37817a.serverMessageId = aiVar.getMsgId();
                this.f37817a.clientMessageId = aiVar.getUuid();
            }
            return this;
        }

        public final a a(h hVar) {
            if (hVar != null) {
                this.f37817a.conversationId = hVar.getConversationId();
                this.f37817a.conversationType = hVar.getConversationType();
                this.f37817a.conversationShortId = hVar.getConversationShortId();
                this.f37817a.ticket = hVar.getTicket();
                this.f37817a.inboxType = hVar.getInboxType();
            }
            return this;
        }

        public final a a(OPERATION_TYPE operation_type, String str, String str2, String str3) {
            this.f37817a.addPropertyContent(new ModifyPropertyContent(operation_type, str, str2, str3));
            return this;
        }
    }

    public void addPropertyContent(ag agVar) {
        OPERATION_TYPE operation_type;
        if (agVar != null) {
            if (agVar.deleted == 1) {
                operation_type = OPERATION_TYPE.REMOVE_PROPERTY_ITEM;
            } else {
                operation_type = OPERATION_TYPE.ADD_PROPERTY_ITEM;
            }
            addPropertyContent(new ModifyPropertyContent(operation_type, agVar.key, agVar.value, agVar.idempotent_id));
        }
    }

    public void addPropertyContent(ModifyPropertyContent modifyPropertyContent) {
        if (this.propertyContentList == null) {
            this.propertyContentList = new CopyOnWriteArrayList();
        }
        this.propertyContentList.add(modifyPropertyContent);
    }

    public void removePropertyContent(ag agVar) {
        List<ModifyPropertyContent> list;
        if (!(agVar == null || (list = this.propertyContentList) == null || list.isEmpty())) {
            int size = this.propertyContentList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ModifyPropertyContent modifyPropertyContent = this.propertyContentList.get(i2);
                if (modifyPropertyContent != null && TextUtils.equals(agVar.key, modifyPropertyContent.key) && TextUtils.equals(agVar.idempotent_id, modifyPropertyContent.idempotent_id)) {
                    this.propertyContentList.remove(i2);
                    return;
                }
            }
        }
    }
}
