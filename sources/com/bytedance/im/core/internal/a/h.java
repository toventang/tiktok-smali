package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.a.c.c;
import com.bytedance.im.core.internal.utils.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class h {
    static {
        Covode.recordClassIndex(22900);
    }

    public enum a {
        COLUMN_UUID("uuid", "TEXT PRIMARY KEY"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
        COLUMN_IDS_STR("ids_str", "TEXT"),
        COLUMN_SENDER_ID("sender_id", "BIGINT"),
        COLUMN_CREATED_TIME("created_time", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22901);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS mention(");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return b.a("mention", a.COLUMN_UUID.key + "=?", new String[]{str});
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return b.a("mention", a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
    }

    public static boolean a(ai aiVar) {
        List<Long> mentionIds;
        boolean z = true;
        if (aiVar.isSelf() || (mentionIds = aiVar.getMentionIds()) == null || mentionIds.isEmpty() || !(mentionIds.contains(Long.valueOf(d.a().f37562b.a())) || mentionIds.contains(0L))) {
            return true;
        }
        Boolean bool = false;
        c cVar = null;
        try {
            if (d.a().b().aB) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.COLUMN_UUID.key, e.b(aiVar.getUuid()));
                contentValues.put(a.COLUMN_CONVERSATION_ID.key, e.b(aiVar.getConversationId()));
                contentValues.put(a.COLUMN_IDS_STR.key, e.a(mentionIds, ","));
                contentValues.put(a.COLUMN_SENDER_ID.key, Long.valueOf(aiVar.getSender()));
                contentValues.put(a.COLUMN_CREATED_TIME.key, Long.valueOf(aiVar.getCreatedAt()));
                if (b.c("mention", contentValues) <= 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            } else {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(" replace into mention(");
                for (a aVar : a.values()) {
                    sb.append(aVar.key).append(",");
                    sb2.append("?,");
                }
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                cVar = b.c(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
                if (cVar != null) {
                    cVar.a(a.COLUMN_UUID.ordinal() + 1, e.b(aiVar.getUuid()));
                    cVar.a(a.COLUMN_CONVERSATION_ID.ordinal() + 1, e.b(aiVar.getConversationId()));
                    cVar.a(a.COLUMN_IDS_STR.ordinal() + 1, e.a(mentionIds, ","));
                    cVar.a(a.COLUMN_SENDER_ID.ordinal() + 1, aiVar.getSender());
                    cVar.a(a.COLUMN_CREATED_TIME.ordinal() + 1, aiVar.getCreatedAt());
                }
                if (cVar.a() <= 0) {
                    z = false;
                }
                bool = Boolean.valueOf(z);
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMentionDao upsert", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((c) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(cVar);
        return bool.booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.im.core.d.ai> a(java.lang.String r8, long r9) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.h.a(java.lang.String, long):java.util.List");
    }

    public static Map<String, List<ai>> a(List<String> list, Map<String, Long> map) {
        Exception e2;
        String[] strArr = null;
        if (list.size() <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        int i2 = d.a().b().ab.batchQueryEnableAndQueryLimit;
        String str = "select * from mention where " + a.COLUMN_CONVERSATION_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        com.bytedance.im.core.internal.a.c.a aVar = null;
        int i3 = 0;
        int i4 = 0;
        while (i3 < list.size()) {
            if (i4 == i2 - 1 || i3 == list.size() - 1) {
                sb.append("'").append(list.get(i3)).append("') order by ").append(a.COLUMN_CREATED_TIME.key).append(" desc");
                try {
                    aVar = b.a(sb.toString(), strArr);
                    if (aVar != null) {
                        int a2 = aVar.a(a.COLUMN_CONVERSATION_ID.key);
                        int a3 = aVar.a(a.COLUMN_IDS_STR.key);
                        int a4 = aVar.a(a.COLUMN_UUID.key);
                        HashMap hashMap2 = new HashMap();
                        while (aVar.d()) {
                            if (e.a(aVar.c(a3))) {
                                String c2 = aVar.c(a2);
                                List list2 = (List) hashMap2.get(c2);
                                if (list2 == null) {
                                    list2 = new ArrayList();
                                    hashMap2.put(c2, list2);
                                }
                                list2.add(aVar.c(a4));
                            }
                        }
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            try {
                                Long l2 = map.get(entry.getKey());
                                List arrayList = new ArrayList();
                                if (l2 != null) {
                                    try {
                                        arrayList = i.a((List) entry.getValue(), l2.longValue());
                                    } catch (Exception e3) {
                                        e2 = e3;
                                        try {
                                            f.b("imsdk", "IMMentionDao getUnreadSelfMentionedMsgMap", e2);
                                            e2.printStackTrace();
                                            com.bytedance.im.core.c.e.a(e2);
                                            com.bytedance.im.core.internal.a.a.a.a(aVar);
                                            sb = new StringBuilder(str);
                                            i4 = 0;
                                            i3++;
                                            strArr = null;
                                        } catch (Throwable th) {
                                            com.bytedance.im.core.internal.a.a.a.a(aVar);
                                            throw th;
                                        }
                                    }
                                }
                                hashMap.put(entry.getKey(), arrayList);
                            } catch (Exception e4) {
                                e2 = e4;
                                f.b("imsdk", "IMMentionDao getUnreadSelfMentionedMsgMap", e2);
                                e2.printStackTrace();
                                com.bytedance.im.core.c.e.a(e2);
                                com.bytedance.im.core.internal.a.a.a.a(aVar);
                                sb = new StringBuilder(str);
                                i4 = 0;
                                i3++;
                                strArr = null;
                            }
                        }
                    }
                } catch (Exception e5) {
                    e2 = e5;
                    f.b("imsdk", "IMMentionDao getUnreadSelfMentionedMsgMap", e2);
                    e2.printStackTrace();
                    com.bytedance.im.core.c.e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    sb = new StringBuilder(str);
                    i4 = 0;
                    i3++;
                    strArr = null;
                }
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                sb = new StringBuilder(str);
                i4 = 0;
            } else {
                i4++;
                sb.append("'").append(list.get(i3)).append("',");
            }
            i3++;
            strArr = null;
        }
        com.bytedance.im.core.g.c.a().a("getUnreadSelfMentionedMsgMap", currentTimeMillis);
        return hashMap;
    }
}
