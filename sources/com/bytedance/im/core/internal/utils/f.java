package com.bytedance.im.core.internal.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.c;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.az;
import com.bytedance.im.core.d.h;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.d.l;
import com.bytedance.im.core.proto.BlockStatus;
import com.bytedance.im.core.proto.ConversationCoreInfo;
import com.bytedance.im.core.proto.ConversationInfoV2;
import com.bytedance.im.core.proto.ConversationSettingInfo;
import com.bytedance.im.core.proto.MessageBody;
import com.bytedance.im.core.proto.MessageType;
import com.bytedance.im.core.proto.Participant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {
    static {
        Covode.recordClassIndex(23123);
    }

    public static List<ah> a(String str, List<Participant> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Participant participant : list) {
            if (participant.user_id != null) {
                ah ahVar = new ah();
                ahVar.setConversationId(str);
                ahVar.setAlias(participant.alias);
                if (participant.role != null) {
                    ahVar.setRole(participant.role.intValue());
                }
                if (participant.sort_order != null) {
                    ahVar.setSortOrder(participant.sort_order.longValue());
                }
                if (participant.blocked != null) {
                    ahVar.setSilent(participant.blocked.getValue());
                }
                if (participant.left_block_time != null) {
                    ahVar.setSilentTime(participant.left_block_time.longValue());
                }
                ahVar.setUid(participant.user_id.longValue());
                ahVar.setSecUid(participant.sec_uid);
                arrayList.add(ahVar);
            }
        }
        return arrayList;
    }

    public static List<ah> a(String str, List<Long> list, Map<Long, String> map, long j2) {
        if (list == null || list.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Long l2 : list) {
            if (l2 != null) {
                j2++;
                ah ahVar = new ah();
                ahVar.setConversationId(str);
                ahVar.setSortOrder(j2);
                ahVar.setUid(l2.longValue());
                ahVar.setSilent(BlockStatus.UNBLOCK.getValue());
                ahVar.setSilentTime(0);
                if (map != null) {
                    ahVar.setSecUid(map.get(l2));
                }
                arrayList.add(ahVar);
            }
        }
        return arrayList;
    }

    public static Map<String, String> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, jSONObject.getString(next));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return hashMap;
    }

    public static String b(Map<String, String> map) {
        if (map != null) {
            try {
                if (map.size() > 0) {
                    return h.f38770a.b(map);
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    public static az a(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new az(map.get("s:protrait"), map.get("s:nick_name"), map.get("s:basic_ext_info"));
    }

    public static JSONObject c(Map<String, String> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                try {
                    jSONObject.put(str, map.get(str));
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    public static ah a(String str, Participant participant) {
        if (participant == null || participant.user_id == null) {
            return null;
        }
        ah ahVar = new ah();
        ahVar.setConversationId(str);
        ahVar.setUid(participant.user_id.longValue());
        ahVar.setSecUid(participant.sec_uid);
        if (participant.role != null) {
            ahVar.setRole(participant.role.intValue());
        }
        ahVar.setAlias(participant.alias);
        if (participant.sort_order != null) {
            ahVar.setSortOrder(participant.sort_order.longValue());
        }
        if (participant.blocked != null) {
            ahVar.setSilent(participant.blocked.getValue());
        }
        if (participant.left_block_time != null) {
            ahVar.setSilentTime(participant.left_block_time.longValue());
        }
        return ahVar;
    }

    public static l a(l lVar, ConversationSettingInfo conversationSettingInfo) {
        int i2;
        int i3;
        if (lVar == null) {
            lVar = new l();
            lVar.setConversationId(conversationSettingInfo.conversation_id);
        }
        if (conversationSettingInfo.setting_version != null && conversationSettingInfo.setting_version.longValue() >= lVar.getVersion()) {
            int i4 = 0;
            if (conversationSettingInfo.mute != null) {
                i2 = conversationSettingInfo.mute.intValue();
            } else {
                i2 = 0;
            }
            lVar.setMute(i2);
            if (conversationSettingInfo.stick_on_top != null) {
                i3 = conversationSettingInfo.stick_on_top.intValue();
            } else {
                i3 = 0;
            }
            lVar.setStickTop(i3);
            lVar.setExt(conversationSettingInfo.ext);
            if (conversationSettingInfo.favorite != null) {
                i4 = conversationSettingInfo.favorite.intValue();
            }
            lVar.setFavor(i4);
            lVar.setVersion(conversationSettingInfo.setting_version.longValue());
        }
        return lVar;
    }

    public static ai a(String str, ai aiVar, MessageBody messageBody) {
        return a(str, aiVar, messageBody, false, MessageType.MESSAGE_TYPE_NOT_USED.getValue());
    }

    public static i a(String str, i iVar, ConversationCoreInfo conversationCoreInfo) {
        long j2;
        BlockStatus blockStatus;
        int i2;
        int intValue;
        if (iVar == null) {
            iVar = new i();
            if (conversationCoreInfo.conversation_id != null) {
                str = conversationCoreInfo.conversation_id;
            }
            iVar.setConversationId(str);
        }
        if (conversationCoreInfo.info_version != null && conversationCoreInfo.info_version.longValue() >= iVar.getVersion()) {
            iVar.setName(conversationCoreInfo.name);
            iVar.setIcon(conversationCoreInfo.icon);
            iVar.setDesc(conversationCoreInfo.desc);
            iVar.setNotice(conversationCoreInfo.notice);
            iVar.setExt(conversationCoreInfo.ext);
            iVar.setVersion(conversationCoreInfo.info_version.longValue());
            if (conversationCoreInfo.owner != null) {
                j2 = conversationCoreInfo.owner.longValue();
            } else {
                j2 = -1;
            }
            iVar.setOwner(j2);
            iVar.setSecOwner(conversationCoreInfo.sec_owner);
            if (conversationCoreInfo.block_status == null) {
                blockStatus = BlockStatus.UNBLOCK;
            } else {
                blockStatus = conversationCoreInfo.block_status;
            }
            iVar.setSilent(blockStatus.getValue());
            if (conversationCoreInfo.block_normal_only == null || !conversationCoreInfo.block_normal_only.booleanValue()) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            iVar.setSilentNormalOnly(i2);
            if (conversationCoreInfo.mode == null) {
                intValue = -1;
            } else {
                intValue = conversationCoreInfo.mode.intValue();
            }
            iVar.setMode(intValue);
        }
        return iVar;
    }

    public static h a(int i2, h hVar, ConversationInfoV2 conversationInfoV2, long j2) {
        return a(i2, hVar, conversationInfoV2, j2, null, null, true);
    }

    public static ai a(String str, ai aiVar, MessageBody messageBody, boolean z, int i2) {
        int i3;
        HashMap hashMap;
        long j2;
        if (aiVar == null) {
            aiVar = new ai();
            if (messageBody.order_in_conversation != null) {
                j2 = messageBody.order_in_conversation.longValue();
            } else {
                j2 = 0;
            }
            aiVar.setOrderIndex(j2);
            aiVar.setMsgId(messageBody.server_message_id.longValue());
            if (TextUtils.isEmpty(str)) {
                str = UUID.randomUUID().toString();
            }
            aiVar.setUuid(str);
            if (messageBody.create_time != null) {
                aiVar.setCreatedAt(messageBody.create_time.longValue());
            }
            aiVar.setMsgType(messageBody.message_type.intValue());
            aiVar.setConversationId(messageBody.conversation_id);
            aiVar.setConversationType(messageBody.conversation_type.intValue());
            aiVar.setSender(messageBody.sender.longValue());
            aiVar.setSecSender(messageBody.sec_sender);
            aiVar.setContent(messageBody.content);
            aiVar.setDeleted(0);
            aiVar.setMsgStatus(5);
            if (d.a().b().A) {
                aiVar = c.b(aiVar);
            }
        } else if (d.a().b().y) {
            aiVar.setMsgStatus(5);
        }
        if (!z && d.a().b().C && messageBody.create_time != null) {
            aiVar.setCreatedAt(messageBody.create_time.longValue());
        }
        aiVar.setConversationShortId(messageBody.conversation_short_id.longValue());
        if (!z && messageBody.index_in_conversation != null) {
            aiVar.setIndex(messageBody.index_in_conversation.longValue());
            aiVar.getLocalExt().remove("s:message_index_is_local");
        }
        if (!z && messageBody.order_in_conversation != null && (aiVar.getOrderIndex() < 10000 || d.a().b().w == 1)) {
            aiVar.setOrderIndex(messageBody.order_in_conversation.longValue());
        }
        if (messageBody.index_in_conversation_v2 != null) {
            aiVar.setIndexInConversationV2(messageBody.index_in_conversation_v2.longValue());
        }
        if (messageBody.status != null) {
            i3 = messageBody.status.intValue();
        } else {
            i3 = 0;
        }
        aiVar.setSvrStatus(i3);
        if (messageBody.version != null && messageBody.version.longValue() >= aiVar.getVersion()) {
            if (i2 == MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_EXT.getValue() || i2 == MessageType.MESSAGE_TYPE_NOT_USED.getValue()) {
                if (messageBody.ext == null) {
                    hashMap = null;
                } else {
                    hashMap = new HashMap(messageBody.ext);
                }
                aiVar.setExt(hashMap);
            }
            if (i2 == MessageType.MESSAGE_TYPE_UPDATE_MESSAGE_PROPERTY.getValue() || i2 == MessageType.MESSAGE_TYPE_NOT_USED.getValue()) {
                aiVar.updatePropertyFromServer(messageBody);
            }
            aiVar.setVersion(messageBody.version.longValue());
        }
        if (messageBody.message_type != null && messageBody.message_type.intValue() == aiVar.getMsgType() && messageBody.server_message_id != null && messageBody.server_message_id.longValue() >= aiVar.getMsgId()) {
            aiVar.setMsgId(messageBody.server_message_id.longValue());
        }
        aiVar.setSenderInfo(a(messageBody.user_profile));
        aiVar.setReadStatus(1 ^ (n.a(aiVar) ? 1 : 0));
        c j3 = d.a().f37562b.j();
        if (aiVar.getSvrStatus() == 0 && j3 != null) {
            aiVar.setSvrStatus(0);
        }
        if (messageBody.reference_info != null && aiVar.getReferenceInfo() == null) {
            aiVar.setRefMsg(messageBody.reference_info);
        }
        return aiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01f6, code lost:
        if (r2 != null) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.im.core.d.h a(int r8, com.bytedance.im.core.d.h r9, com.bytedance.im.core.proto.ConversationInfoV2 r10, long r11, com.bytedance.im.core.d.ai r13, java.util.List<com.bytedance.im.core.d.ah> r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 506
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.utils.f.a(int, com.bytedance.im.core.d.h, com.bytedance.im.core.proto.ConversationInfoV2, long, com.bytedance.im.core.d.ai, java.util.List, boolean):com.bytedance.im.core.d.h");
    }
}
