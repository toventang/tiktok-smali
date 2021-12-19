package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.g.c;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k {
    static {
        Covode.recordClassIndex(22909);
    }

    public static Map<String, Map<String, List<ag>>> a(List<String> list) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            String str = "select * from msg_property_new where " + a.COLUMN_MSG_UUID.key + " in (";
            for (int i2 = 0; i2 < list.size(); i2++) {
                str = str + "?";
                if (i2 != list.size() - 1) {
                    str = str + ",";
                }
            }
            aVar = b.a((str + ")") + " order by " + a.COLUMN_CREATE_TIME.key + " asc", (String[]) list.toArray(new String[0]));
            try {
                for (ag agVar : a(aVar)) {
                    if (!(agVar == null || agVar.deleted == 1)) {
                        Map map = (Map) hashMap.get(agVar.msgUuid);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(agVar.msgUuid, map);
                        }
                        List list2 = (List) map.get(agVar.key);
                        if (list2 == null) {
                            list2 = new ArrayList();
                            map.put(agVar.key, list2);
                        }
                        list2.add(agVar);
                    }
                }
                c.a().a("getMessagePropertiesMap", currentTimeMillis);
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return hashMap;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMMsgPropertyDao getMessageProperties", e2);
                    e2.printStackTrace();
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    com.bytedance.im.core.internal.a.a.a.a(aVar2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                com.bytedance.im.core.internal.a.a.a.a(aVar2);
                throw th;
            }
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            f.b("imsdk", "IMMsgPropertyDao getMessageProperties", e2);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return null;
        } catch (Throwable th4) {
            th = th4;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    private static Map<String, List<ag>> a(String str) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            aVar = b.a("select * from msg_property_new where " + a.COLUMN_MSG_UUID.key + "=? order by " + a.COLUMN_CREATE_TIME.key + " asc", new String[]{str});
            HashMap hashMap = null;
            while (aVar.d()) {
                try {
                    ag b2 = b(aVar);
                    if (!(b2 == null || b2.deleted == 1)) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        List<ag> list = hashMap.get(b2.key);
                        if (list == null) {
                            list = new ArrayList<>();
                            hashMap.put(b2.key, list);
                        }
                        list.add(b2);
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        f.b("imsdk", "IMMsgPropertyDao getMessageProperties", e2);
                        e2.printStackTrace();
                        e.a(e2);
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        com.bytedance.im.core.internal.a.a.a.a(aVar2);
                        throw th;
                    }
                }
            }
            c.a().a("getMessageProperties", currentTimeMillis);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return hashMap;
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            f.b("imsdk", "IMMsgPropertyDao getMessageProperties", e2);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    public static void a(com.bytedance.im.core.internal.a.c.c cVar, ag agVar) {
        if (cVar != null && agVar != null && !TextUtils.isEmpty(agVar.msgUuid)) {
            cVar.a(a.COLUMN_MSG_UUID.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(agVar.msgUuid));
            cVar.a(a.COLUMN_CONVERSATION_ID.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(agVar.conversationId));
            cVar.a(a.COLUMN_KEY.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(agVar.key));
            cVar.a(a.COLUMN_IDEMPOTENT_ID.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(agVar.idempotent_id));
            cVar.a(a.COLUMN_SENDER.ordinal() + 1, agVar.uid.longValue());
            cVar.a(a.COLUMN_SENDER_SEC.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(agVar.sec_uid));
            cVar.a(a.COLUMN_CREATE_TIME.ordinal() + 1, agVar.create_time.longValue());
            cVar.a(a.COLUMN_VALUE.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(agVar.value));
            cVar.a(a.COLUMN_DELETED.ordinal() + 1, (long) agVar.deleted);
            cVar.a(a.COLUMN_VERSION.ordinal() + 1, agVar.version);
            cVar.a(a.COLUMN_STATUS.ordinal() + 1, (long) agVar.status);
        }
    }

    public static String d() {
        return com.bytedance.im.core.internal.a.a.a.a(a.values().length);
    }

    public static String c() {
        return a.COLUMN_MSG_UUID.key + "=? and " + a.COLUMN_KEY.key + "=? and " + a.COLUMN_IDEMPOTENT_ID.key + "=?";
    }

    public static List<String> b() {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            aVar = b.a("SELECT rowId," + a.COLUMN_MSG_UUID.key + " FROM msg_property_new", (String[]) null);
            try {
                int a2 = aVar.a(a.COLUMN_MSG_UUID.key);
                while (aVar.d()) {
                    arrayList.add(aVar.c(a2));
                }
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return arrayList;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMMsgPropertyDao  getUuidList ", e2);
                    e2.printStackTrace();
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    aVar2 = aVar;
                    com.bytedance.im.core.internal.a.a.a.a(aVar2);
                    throw th;
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            f.b("imsdk", "IMMsgPropertyDao  getUuidList ", e2);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    public enum a {
        COLUMN_MSG_UUID("msg_uuid", "TEXT"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
        COLUMN_KEY("key", "TEXT"),
        COLUMN_IDEMPOTENT_ID("idempotent_id", "TEXT"),
        COLUMN_SENDER("sender", "INTEGER"),
        COLUMN_SENDER_SEC("sender_sec", "TEXT"),
        COLUMN_CREATE_TIME("create_time", "INTEGER"),
        COLUMN_VALUE("value", "TEXT"),
        COLUMN_DELETED("deleted", "INTEGER"),
        COLUMN_VERSION("version", "INTEGER"),
        COLUMN_STATUS("status", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22910);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg_property_new(");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        sb.append("PRIMARY KEY(").append(a.COLUMN_MSG_UUID.key).append(",").append(a.COLUMN_KEY.key).append(",").append(a.COLUMN_IDEMPOTENT_ID.key).append("));");
        return sb.toString();
    }

    public static void a(ai aiVar) {
        if (aiVar != null) {
            aiVar.setPropertyItemListMap(a(aiVar.getUuid()));
        }
    }

    private static ContentValues a(ag agVar) {
        if (agVar == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_MSG_UUID.key, agVar.msgUuid);
        contentValues.put(a.COLUMN_CONVERSATION_ID.key, agVar.conversationId);
        contentValues.put(a.COLUMN_KEY.key, agVar.key);
        contentValues.put(a.COLUMN_IDEMPOTENT_ID.key, agVar.idempotent_id);
        contentValues.put(a.COLUMN_SENDER.key, agVar.uid);
        contentValues.put(a.COLUMN_SENDER_SEC.key, agVar.sec_uid);
        contentValues.put(a.COLUMN_CREATE_TIME.key, agVar.create_time);
        contentValues.put(a.COLUMN_VALUE.key, agVar.value);
        contentValues.put(a.COLUMN_DELETED.key, Integer.valueOf(agVar.deleted));
        contentValues.put(a.COLUMN_VERSION.key, Long.valueOf(agVar.version));
        contentValues.put(a.COLUMN_STATUS.key, Integer.valueOf(agVar.status));
        return contentValues;
    }

    private static ag b(com.bytedance.im.core.internal.a.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        ag agVar = new ag();
        agVar.msgUuid = aVar.c(aVar.a(a.COLUMN_MSG_UUID.key));
        agVar.conversationId = aVar.c(aVar.a(a.COLUMN_CONVERSATION_ID.key));
        agVar.uid = Long.valueOf(aVar.b(aVar.a(a.COLUMN_SENDER.key)));
        agVar.sec_uid = aVar.c(aVar.a(a.COLUMN_SENDER_SEC.key));
        agVar.create_time = Long.valueOf(aVar.b(aVar.a(a.COLUMN_CREATE_TIME.key)));
        agVar.idempotent_id = aVar.c(aVar.a(a.COLUMN_IDEMPOTENT_ID.key));
        agVar.key = aVar.c(aVar.a(a.COLUMN_KEY.key));
        agVar.value = aVar.c(aVar.a(a.COLUMN_VALUE.key));
        agVar.version = aVar.b(aVar.a(a.COLUMN_VERSION.key));
        agVar.status = aVar.a(aVar.a(a.COLUMN_STATUS.key));
        agVar.deleted = aVar.a(aVar.a(a.COLUMN_DELETED.key));
        return agVar;
    }

    public static void b(ai aiVar) {
        List<ag> value;
        if (aiVar != null && !TextUtils.isEmpty(aiVar.getUuid())) {
            long currentTimeMillis = System.currentTimeMillis();
            boolean a2 = b.a();
            if (!a2) {
                b.a("IMMsgPropertyDao.updateMessageProperty");
            }
            com.bytedance.im.core.internal.a.c.c cVar = null;
            try {
                b.b("delete from msg_property_new where " + a.COLUMN_MSG_UUID.key + "='" + aiVar.getUuid() + "' and " + a.COLUMN_STATUS.key + "<>1 and " + a.COLUMN_STATUS.key + "<>4 and " + a.COLUMN_STATUS.key + "<>3");
                cVar = b.c("insert or ignore into msg_property_new values(" + d() + ")");
                Map<String, List<ag>> propertyItemListMap = aiVar.getPropertyItemListMap();
                if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                    for (Map.Entry<String, List<ag>> entry : propertyItemListMap.entrySet()) {
                        String key = entry.getKey();
                        if (!(key == null || (value = entry.getValue()) == null)) {
                            for (ag agVar : value) {
                                if (agVar != null) {
                                    agVar.msgUuid = aiVar.getUuid();
                                    agVar.conversationId = aiVar.getConversationId();
                                    agVar.key = key;
                                    if (d.a().b().aB) {
                                        b.a("msg_property_new", a(agVar));
                                    } else {
                                        a(cVar, agVar);
                                        cVar.b();
                                    }
                                }
                            }
                        }
                    }
                }
                a(aiVar);
                if (!a2) {
                    b.a("IMMsgPropertyDao.updateMessageProperty", true);
                }
                c.a().a("updateMessageProperty", currentTimeMillis);
            } catch (Exception e2) {
                f.b("imsdk", "IMMsgPropertyDao updateMessageProperty", e2);
                e2.printStackTrace();
                e.a(e2);
                if (!a2) {
                    b.a("IMMsgPropertyDao.updateMessageProperty", false);
                }
            } finally {
                com.bytedance.im.core.internal.a.a.a.a(cVar);
            }
        }
    }

    private static List<ag> a(com.bytedance.im.core.internal.a.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int a2 = aVar.a(a.COLUMN_MSG_UUID.key);
        int a3 = aVar.a(a.COLUMN_CONVERSATION_ID.key);
        int a4 = aVar.a(a.COLUMN_SENDER.key);
        int a5 = aVar.a(a.COLUMN_SENDER_SEC.key);
        int a6 = aVar.a(a.COLUMN_CREATE_TIME.key);
        int a7 = aVar.a(a.COLUMN_IDEMPOTENT_ID.key);
        int a8 = aVar.a(a.COLUMN_KEY.key);
        int a9 = aVar.a(a.COLUMN_VALUE.key);
        int a10 = aVar.a(a.COLUMN_VERSION.key);
        int a11 = aVar.a(a.COLUMN_STATUS.key);
        int a12 = aVar.a(a.COLUMN_DELETED.key);
        while (aVar.d()) {
            ag agVar = new ag();
            agVar.msgUuid = aVar.c(a2);
            agVar.conversationId = aVar.c(a3);
            agVar.uid = Long.valueOf(aVar.b(a4));
            agVar.sec_uid = aVar.c(a5);
            agVar.create_time = Long.valueOf(aVar.b(a6));
            agVar.idempotent_id = aVar.c(a7);
            agVar.key = aVar.c(a8);
            agVar.value = aVar.c(a9);
            agVar.version = aVar.b(a10);
            agVar.status = aVar.a(a11);
            agVar.deleted = aVar.a(a12);
            arrayList.add(agVar);
        }
        return arrayList;
    }

    public static ag a(ag agVar, boolean z) {
        int i2;
        if (agVar == null) {
            return null;
        }
        j.c("IMMsgPropertyDao updateSendingProperty");
        ag a2 = a(agVar.msgUuid, agVar.key, agVar.idempotent_id);
        if (a2 == null) {
            return null;
        }
        if (a2.status != 4) {
            a2 = null;
        }
        try {
            ContentValues contentValues = new ContentValues();
            String str = a.COLUMN_STATUS.key;
            if (z) {
                i2 = 2;
            } else {
                i2 = 3;
            }
            contentValues.put(str, Integer.valueOf(i2));
            b.a("msg_property_new", contentValues, c(), new String[]{agVar.msgUuid, agVar.key, agVar.idempotent_id});
            return a2;
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgPropertyDao updateSendingProperty", e2);
            e2.printStackTrace();
            e.a(e2);
            return null;
        }
    }

    public static ag a(String str, String str2, String str3) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            aVar = b.a("select * from msg_property_new where " + c(), new String[]{str, str2, str3});
            if (aVar != null) {
                try {
                    if (aVar.d()) {
                        ag b2 = b(aVar);
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        return b2;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        f.b("imsdk", "IMMsgPropertyDao getMessageProperty", e2);
                        e2.printStackTrace();
                        e.a(e2);
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2 = aVar;
                        com.bytedance.im.core.internal.a.a.a.a(aVar2);
                        throw th;
                    }
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            f.b("imsdk", "IMMsgPropertyDao getMessageProperty", e2);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return null;
    }
}
