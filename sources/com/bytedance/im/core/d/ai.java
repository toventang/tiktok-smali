package com.bytedance.im.core.d;

import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.internal.utils.g;
import com.bytedance.im.core.internal.utils.h;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageStatus;
import com.bytedance.im.core.proto.PropertyItem;
import com.bytedance.im.core.proto.PropertyItemList;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.google.gson.f;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ai implements Serializable, Cloneable, Comparable<ai> {
    public List<c> attachments;
    @g
    public String content;
    public String conversationId;
    public long conversationShortId;
    public int conversationType;
    public long createdAt;
    private int deleted;
    private Map<String, String> ext;
    public long index;
    public long indexInConversationV2;
    private transient SparseArray<Object> localCache;
    public Map<String, String> localExt;
    private transient SparseArray<WeakReference<Object>> mKeyedTags;
    private MessageStatus messageStatus;
    private long msgId;
    public int msgStatus;
    public int msgType;
    public long orderIndex;
    private Map<String, List<ag>> propertyItemListMap;
    private int readStatus;
    private ReferenceInfo referenceInfo;
    private long rowid;
    public String secSender;
    public long sender;
    private az senderInfo;
    private int svrStatus;
    private long tableFlag;
    public String uuid;
    private long version;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ai f37702a = new ai();

        static {
            Covode.recordClassIndex(22665);
        }
    }

    static {
        Covode.recordClassIndex(22663);
    }

    public final List<c> getAttachments() {
        return this.attachments;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final long getConversationShortId() {
        return this.conversationShortId;
    }

    public final int getConversationType() {
        return this.conversationType;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final int getDeleted() {
        return this.deleted;
    }

    public final long getIndex() {
        return this.index;
    }

    public final long getIndexInConversationV2() {
        return this.indexInConversationV2;
    }

    public final long getMsgId() {
        return this.msgId;
    }

    public final int getMsgStatus() {
        return this.msgStatus;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    public final long getOrderIndex() {
        return this.orderIndex;
    }

    public final Map<String, List<ag>> getPropertyItemListMap() {
        return this.propertyItemListMap;
    }

    public final int getReadStatus() {
        return this.readStatus;
    }

    public final ReferenceInfo getReferenceInfo() {
        return this.referenceInfo;
    }

    public final long getRowId() {
        return this.rowid;
    }

    public final long getSender() {
        return this.sender;
    }

    public final az getSenderInfo() {
        return this.senderInfo;
    }

    public final int getSvrStatus() {
        return this.svrStatus;
    }

    public final long getTableFlag() {
        return this.tableFlag;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final long getVersion() {
        return this.version;
    }

    public final String getExtStr() {
        return h.a(this.ext);
    }

    public final String getLocalExtStr() {
        return h.a(this.localExt);
    }

    public final boolean isDeleted() {
        if (this.deleted == 1) {
            return true;
        }
        return false;
    }

    private static f getToStringGsonByLogPrivacy() {
        if (com.bytedance.im.core.e.a.a().d()) {
            return h.f38771b;
        }
        return h.f38770a;
    }

    @Override // java.lang.Object
    public final ai clone() {
        try {
            return (ai) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final String getLogContent() {
        if (com.bytedance.im.core.e.a.a().d()) {
            return "";
        }
        return this.content;
    }

    public final String getSecSender() {
        if (TextUtils.isEmpty(this.secSender)) {
            this.secSender = "";
        }
        return this.secSender;
    }

    public final int hashCode() {
        String str = this.uuid;
        if (str != null) {
            return str.hashCode();
        }
        return super.hashCode();
    }

    public final boolean isSuccessOrNormal() {
        int i2 = this.msgStatus;
        if (i2 == 2 || i2 == 5) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return getToStringGsonByLogPrivacy().b(this);
    }

    public final synchronized Map<String, String> getExt() {
        Map<String, String> map;
        MethodCollector.i(2043);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        map = this.ext;
        MethodCollector.o(2043);
        return map;
    }

    public final synchronized Map<String, String> getLocalExt() {
        Map<String, String> map;
        MethodCollector.i(2055);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        map = this.localExt;
        MethodCollector.o(2055);
        return map;
    }

    public final MessageStatus getMessageStatus() {
        MessageStatus messageStatus2 = this.messageStatus;
        if (messageStatus2 != null) {
            return messageStatus2;
        }
        if (isDeleted()) {
            return MessageStatus.DELETED;
        }
        if (isRecalled()) {
            return MessageStatus.RECALLED;
        }
        return MessageStatus.INVISIBLE;
    }

    public final String getPropertyItemListMapString() {
        try {
            Map<String, List<ag>> map = this.propertyItemListMap;
            if (map == null || map.size() <= 0) {
                return "";
            }
            return h.f38770a.b(this.propertyItemListMap);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final long getRefMsgId() {
        String str = getLocalExt().get("s:sdk_ref_msg_id");
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception e2) {
            e2.printStackTrace();
            return -1;
        }
    }

    public final boolean invalid() {
        if (this.sender <= 0 || TextUtils.isEmpty(this.conversationId) || TextUtils.isEmpty(this.uuid)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean isIndexLocal() {
        return "1".equals(getLocalExt().get("s:message_index_is_local"));
    }

    public final boolean isMention() {
        List<Long> mentionIds = getMentionIds();
        if (mentionIds == null || !mentionIds.contains(Long.valueOf(com.bytedance.im.core.e.a.a().b()))) {
            return false;
        }
        return true;
    }

    public final boolean isSelf() {
        if (com.bytedance.im.core.e.a.a().b() == this.sender) {
            return true;
        }
        return false;
    }

    public final List<Long> getMentionIds() {
        Map<String, String> map = this.ext;
        ArrayList arrayList = null;
        if (map != null && map.containsKey("s:mentioned_users")) {
            String str = this.ext.get("s:mentioned_users");
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(",");
            arrayList = new ArrayList();
            for (String str2 : split) {
                try {
                    arrayList.add(Long.valueOf(Long.parseLong(str2)));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public final boolean isRecalled() {
        if ("true".equals(getExt().get("s:is_recalled")) || "true".equals(getExt().get("s:recalled"))) {
            return true;
        }
        return false;
    }

    public final void setAttachments(List<c> list) {
        this.attachments = list;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setConversationId(String str) {
        this.conversationId = str;
    }

    public final void setConversationShortId(long j2) {
        this.conversationShortId = j2;
    }

    public final void setConversationType(int i2) {
        this.conversationType = i2;
    }

    public final void setCreatedAt(long j2) {
        this.createdAt = j2;
    }

    public final void setDeleted(int i2) {
        this.deleted = i2;
    }

    public final void setExt(Map<String, String> map) {
        this.ext = map;
    }

    public final void setLocalExt(Map<String, String> map) {
        this.localExt = map;
    }

    public final void setMessageStatus(MessageStatus messageStatus2) {
        this.messageStatus = messageStatus2;
    }

    public final void setMsgId(long j2) {
        this.msgId = j2;
    }

    public final void setMsgStatus(int i2) {
        this.msgStatus = i2;
    }

    public final void setMsgType(int i2) {
        this.msgType = i2;
    }

    public final void setPropertyItemListMap(Map<String, List<ag>> map) {
        this.propertyItemListMap = map;
    }

    public final void setReadStatus(int i2) {
        this.readStatus = i2;
    }

    public final void setRowId(long j2) {
        this.rowid = j2;
    }

    public final void setSender(long j2) {
        this.sender = j2;
    }

    public final void setSenderInfo(az azVar) {
        this.senderInfo = azVar;
    }

    public final void setSvrStatus(int i2) {
        this.svrStatus = i2;
    }

    public final void setTableFlag(long j2) {
        this.tableFlag = j2;
    }

    public final void setUuid(String str) {
        this.uuid = str;
    }

    public final void setVersion(long j2) {
        this.version = j2;
    }

    public final String getExtValue(String str) {
        return getMapValue(this.ext, str);
    }

    public final String getLocalExtValue(String str) {
        return getMapValue(this.localExt, str);
    }

    public final void setExtStr(String str) {
        this.ext = h.a(str);
    }

    public final void setLocalExtStr(String str) {
        this.localExt = h.a(str);
    }

    private void setRefMsgId(String str) {
        getLocalExt().put("s:sdk_ref_msg_id", str);
    }

    public final void setIndex(long j2) {
        if (this.index < j2) {
            this.index = j2;
        }
    }

    public final void setIndexInConversationV2(long j2) {
        if (this.indexInConversationV2 < j2) {
            this.indexInConversationV2 = j2;
        }
    }

    public final void setOrderIndex(long j2) {
        if (this.orderIndex < j2) {
            this.orderIndex = j2;
        }
    }

    public final void setSecSender(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.secSender = str;
    }

    public final synchronized void clearLocalExt(String str) {
        MethodCollector.i(2058);
        Map<String, String> map = this.localExt;
        if (map != null) {
            map.remove(str);
        }
        MethodCollector.o(2058);
    }

    public final synchronized Object getLocalCache(int i2) {
        MethodCollector.i(2052);
        SparseArray<Object> sparseArray = this.localCache;
        if (sparseArray == null) {
            MethodCollector.o(2052);
            return null;
        }
        Object obj = sparseArray.get(i2);
        MethodCollector.o(2052);
        return obj;
    }

    public final Object getTag(int i2) {
        SparseArray<WeakReference<Object>> sparseArray = this.mKeyedTags;
        if (sparseArray == null || sparseArray.get(i2) == null) {
            return null;
        }
        return this.mKeyedTags.get(i2).get();
    }

    public final synchronized void putExt(Map<String, String> map) {
        MethodCollector.i(2048);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.putAll(map);
        MethodCollector.o(2048);
    }

    public final synchronized void putLocalExt(Map<String, String> map) {
        MethodCollector.i(2073);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.putAll(map);
        MethodCollector.o(2073);
    }

    public final void setPropertyItemListMapByString(String str) {
        try {
            this.propertyItemListMap = (Map) h.f38770a.a(str, new com.google.gson.b.a<Map<String, PropertyItemList>>() {
                /* class com.bytedance.im.core.d.ai.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22664);
                }
            }.type);
        } catch (Throwable unused) {
            this.propertyItemListMap = null;
        }
    }

    public final int compareTo(ai aiVar) {
        if (equals(aiVar)) {
            return 0;
        }
        long orderIndex2 = aiVar.getOrderIndex() - getOrderIndex();
        if (orderIndex2 > 0) {
            return 1;
        }
        if (orderIndex2 < 0) {
            return -1;
        }
        long createdAt2 = aiVar.getCreatedAt() - getCreatedAt();
        if (createdAt2 > 0) {
            return 1;
        }
        if (createdAt2 < 0) {
            return -1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.uuid;
            String str2 = ((ai) obj).uuid;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final void setRefMsg(ReferenceInfo referenceInfo2) {
        if (referenceInfo2 == null || referenceInfo2.referenced_message_id.longValue() <= 0) {
            this.referenceInfo = null;
            setRefMsgId("");
            return;
        }
        this.referenceInfo = referenceInfo2.newBuilder().build();
        setRefMsgId(new StringBuilder().append(referenceInfo2.referenced_message_id).toString());
    }

    public final void updatePropertyFromServer(MessageBody messageBody) {
        ag agVar;
        if (!(messageBody == null || messageBody.version == null || messageBody.version.longValue() < this.version)) {
            String str = this.uuid;
            String str2 = this.conversationId;
            HashMap hashMap = null;
            if (messageBody.property_list != null) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry<String, PropertyItemList> entry : messageBody.property_list.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        ArrayList arrayList = new ArrayList();
                        hashMap2.put(key, arrayList);
                        PropertyItemList value = entry.getValue();
                        if (value.Items != null && !value.Items.isEmpty()) {
                            for (PropertyItem propertyItem : value.Items) {
                                if (propertyItem == null) {
                                    agVar = null;
                                } else {
                                    agVar = new ag();
                                    agVar.msgUuid = str;
                                    agVar.conversationId = str2;
                                    agVar.uid = propertyItem.uid;
                                    agVar.sec_uid = propertyItem.sec_uid;
                                    agVar.create_time = propertyItem.create_time;
                                    agVar.idempotent_id = propertyItem.idempotent_id;
                                    agVar.value = propertyItem.value;
                                    agVar.key = key;
                                }
                                arrayList.add(agVar);
                            }
                        }
                    }
                }
                hashMap = hashMap2;
            }
            this.propertyItemListMap = hashMap;
        }
    }

    private String getMapValue(Map<String, String> map, String str) {
        if (map == null || map.isEmpty() || TextUtils.isEmpty(str)) {
            return null;
        }
        return map.get(str);
    }

    public final synchronized void addExt(String str, String str2) {
        MethodCollector.i(2047);
        if (this.ext == null) {
            this.ext = new HashMap();
        }
        this.ext.put(str, str2);
        MethodCollector.o(2047);
    }

    public final synchronized void addLocalExt(String str, String str2) {
        MethodCollector.i(2057);
        if (this.localExt == null) {
            this.localExt = new HashMap();
        }
        this.localExt.put(str, str2);
        MethodCollector.o(2057);
    }

    public final synchronized void putLocalCache(int i2, Object obj) {
        MethodCollector.i(2049);
        if (this.localCache == null) {
            this.localCache = new SparseArray<>(1);
        }
        this.localCache.put(i2, obj);
        MethodCollector.o(2049);
    }

    public final void setTag(int i2, Object obj) {
        if (this.mKeyedTags == null) {
            this.mKeyedTags = new SparseArray<>(2);
        }
        this.mKeyedTags.put(i2, new WeakReference<>(obj));
    }
}
