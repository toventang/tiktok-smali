package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ag;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.ap;
import com.bytedance.im.core.g.c;
import com.bytedance.im.core.internal.utils.e;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.t;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class i {
    static {
        Covode.recordClassIndex(22902);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x03c5, code lost:
        if (r0 > 0) goto L_0x03c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.bytedance.im.core.d.ai r16, boolean r17, boolean r18) {
        /*
        // Method dump skipped, instructions count: 1113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.i.a(com.bytedance.im.core.d.ai, boolean, boolean):boolean");
    }

    public static boolean a(ai aiVar) {
        boolean z = false;
        if (aiVar != null && !aiVar.invalid()) {
            t.a().a(aiVar);
            long currentTimeMillis = System.currentTimeMillis();
            b(aiVar);
            long a2 = com.bytedance.im.core.internal.a.a.b.a("msg", c(aiVar));
            aiVar.setRowId(a2);
            h.a(aiVar);
            if (a2 >= 0) {
                z = true;
                com.bytedance.im.core.h.b.a();
                if (aiVar.getDeleted() == 0) {
                    com.bytedance.im.core.internal.a.b.a.a();
                    d.a();
                }
            }
            Map<String, List<ag>> propertyItemListMap = aiVar.getPropertyItemListMap();
            if (propertyItemListMap != null && !propertyItemListMap.isEmpty()) {
                k.b(aiVar);
            }
            if (z && aiVar.getAttachments() != null) {
                z = a.a(aiVar.getAttachments());
            }
            c.a().a("insertMessage", currentTimeMillis);
            j.c("IMMsgDao insertMessage, svrId:" + aiVar.getMsgId() + ", uuid:" + aiVar.getUuid() + ", result:" + z);
        }
        return z;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        boolean b2 = com.bytedance.im.core.internal.a.a.b.b("update msg set " + a.COLUMN_DELETED.key + "=1 where " + a.COLUMN_MSG_ID.key + "=\"" + str + "\"");
        if (b2) {
            h.a(str);
            com.bytedance.im.core.internal.a.b.a.a();
            d.a();
        }
        j.c("IMMsgDao deleteMsg, uuid:" + str + ", result:" + b2);
        return b2;
    }

    public static List<ai> a(List<String> list, long j2) {
        com.bytedance.im.core.internal.a.c.a aVar = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select rowid,* from msg where " + a.COLUMN_MSG_ID.key + " in ('" + e.a(list, "','") + "')  AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_NET_STATUS.key + "=? AND " + a.COLUMN_INNER_INDEX.key + ">? order by " + a.COLUMN_ORDER_INDEX.key + " desc, " + a.COLUMN_CREATE_TIME.key + " desc", new String[]{"0", "0", String.valueOf(j2)});
            if (d.a().b().aw) {
                a(aVar, arrayList);
            } else {
                while (aVar.d()) {
                    arrayList.add(a(aVar));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao getMsgList", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static void a(String str, List<Long> list) {
        if (!com.bytedance.im.core.internal.utils.d.a(list)) {
            com.bytedance.im.core.internal.a.c.a aVar = null;
            try {
                aVar = com.bytedance.im.core.internal.a.a.b.a("select * from msg where " + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + " in('" + e.a(list, "','") + "') AND " + a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
                int a2 = aVar.a(a.COLUMN_INDEX_IN_CONVERSATION_V2.key);
                while (aVar.d()) {
                    list.remove(Long.valueOf(aVar.b(a2)));
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                f.b("imsdk", "IMMsgDao checkMissedMsgIndexV2List", e2);
                com.bytedance.im.core.c.e.a(e2);
            } finally {
                com.bytedance.im.core.internal.a.a.a.a(aVar);
            }
        }
    }

    public static List<Long> a(String str, ap apVar) {
        com.bytedance.im.core.internal.a.c.a aVar = null;
        if (TextUtils.isEmpty(str) || !apVar.isValid()) {
            f.b("imsdk", "IMMsgDao getIndexV2ListByRange, invalid cid:" + str + ", range:" + apVar, (Throwable) null);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select * from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + ">=? AND " + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + "<=? order by " + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + " asc", new String[]{str, String.valueOf(apVar.start), String.valueOf(apVar.end)});
            int a2 = aVar.a(a.COLUMN_INDEX_IN_CONVERSATION_V2.key);
            while (aVar.d()) {
                long b2 = aVar.b(a2);
                if (b2 >= apVar.start && b2 <= apVar.end) {
                    arrayList.add(Long.valueOf(b2));
                }
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getIndexV2ListByRange", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static List<ai> a(String str, long j2, long j3, int i2, int[] iArr) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i2 <= 0) {
            i2 = 20;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = "select rowid,* from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_NET_STATUS.key + "=? AND " + a.COLUMN_INNER_INDEX.key + "<? AND " + a.COLUMN_INNER_INDEX.key + ">=?";
            if (iArr != null && iArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    sb.append(iArr[i3]);
                    if (i3 < iArr.length - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                str2 = str2 + " AND " + a.COLUMN_MSG_TYPE.key + " IN " + sb.toString();
            }
            aVar = com.bytedance.im.core.internal.a.a.b.a(str2 + " order by " + a.COLUMN_ORDER_INDEX.key + " desc, " + a.COLUMN_CREATE_TIME.key + " desc limit " + i2, new String[]{str, "0", "0", String.valueOf(j2), String.valueOf(j3)});
            if (d.a().b().aw) {
                a(aVar, arrayList);
            } else {
                while (aVar.d()) {
                    arrayList.add(a(aVar));
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao queryOlderMessageList", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        j.c("IMMsgDao queryOlderMessageList, cid:" + str + ", index:" + j2 + ", minIndex:" + j3 + ", limit:" + i2 + ", count:" + arrayList.size());
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0215 A[EDGE_INSN: B:43:0x0215->B:25:0x0215 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(com.bytedance.im.core.internal.a.c.a r32, java.util.List<com.bytedance.im.core.d.ai> r33, boolean r34) {
        /*
        // Method dump skipped, instructions count: 628
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.i.a(com.bytedance.im.core.internal.a.c.a, java.util.List, boolean):void");
    }

    /* access modifiers changed from: package-private */
    public enum b {
        FLAG_ATTACHMENT(1),
        FLAG_MSG_PROPERTY(2);
        
        public long value;

        static {
            Covode.recordClassIndex(22906);
        }

        private b(long j2) {
            this.value = j2;
        }
    }

    public static int a() {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select * from msg", (String[]) null);
            try {
                int b2 = aVar.b();
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return b2;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMMsgDao getAllMsgCount", e2);
                    com.bytedance.im.core.c.e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    f.b("imsdk", "IMMsgDao getAllMsgCount 0", (Throwable) null);
                    return 0;
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
            f.b("imsdk", "IMMsgDao getAllMsgCount", e2);
            com.bytedance.im.core.c.e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            f.b("imsdk", "IMMsgDao getAllMsgCount 0", (Throwable) null);
            return 0;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    public enum a {
        COLUMN_MSG_ID("msg_uuid", "TEXT PRIMARY KEY"),
        COLUMN_SERVER_ID("msg_server_id", "BIGINT"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT NOT NULL"),
        COLUMN_CONVERSATION_SHORT_ID("conversation_short_id", "BIGINT"),
        COLUMN_CONVERSATION_TYPE("conversation_type", "INTEGER"),
        COLUMN_MSG_TYPE(StringSet.type, "INTEGER"),
        COLUMN_INNER_INDEX("index_in_conversation", "BIGINT"),
        COLUMN_ORDER_INDEX("order_index", "BIGINT"),
        COLUMN_STATUS("status", "INTEGER"),
        COLUMN_NET_STATUS("net_status", "INTEGER"),
        COLUMN_VERSION("version", "INTEGER"),
        COLUMN_DELETED("deleted", "INTEGER"),
        COLUMN_CREATE_TIME("created_time", "INTEGER"),
        COLUMN_SENDER("sender", "BIGINT"),
        COLUMN_CONTENT("content", "TEXT"),
        COLUMN_EXT("ext", "TEXT"),
        COLUMN_LOCAL_INFO("local_info", "TEXT"),
        COLUMN_READ_STATUS("read_status", "INTEGER"),
        COLUMN_SEC_SENDER("sec_sender", "TEXT"),
        COLUMN_PROPERTY_LIST("property_list", "TEXT"),
        COLUMN_INDEX_IN_CONVERSATION_V2("index_in_conversation_v2", "BIGINT default -1"),
        COLUMN_TABLE_FLAG("table_flag", "BIGINT default 0");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22905);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static boolean b() {
        List<String> a2 = a.a();
        List<String> b2 = k.b();
        Map<String, Long> d2 = d();
        HashMap hashMap = null;
        if (d2 != null && a2 != null && b2 != null) {
            HashMap hashMap2 = new HashMap();
            if (!d2.isEmpty() && (!a2.isEmpty() || !b2.isEmpty())) {
                Iterator<Map.Entry<String, Long>> it = d2.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, Long> next = it.next();
                    String key = next.getKey();
                    long longValue = next.getValue().longValue();
                    if (!a2.contains(key)) {
                        longValue &= b.FLAG_ATTACHMENT.value ^ -1;
                        hashMap2.put(key, Long.valueOf(longValue));
                    } else if (!e.a(longValue, b.FLAG_ATTACHMENT.value)) {
                        longValue |= b.FLAG_ATTACHMENT.value;
                        hashMap2.put(key, Long.valueOf(longValue));
                    }
                    if (!b2.contains(key)) {
                        hashMap2.put(key, Long.valueOf(longValue & (-1 ^ b.FLAG_MSG_PROPERTY.value)));
                    } else if (!e.a(longValue, b.FLAG_MSG_PROPERTY.value)) {
                        hashMap2.put(key, Long.valueOf(longValue | b.FLAG_MSG_PROPERTY.value));
                    }
                    if (!com.bytedance.im.core.internal.c.a.b()) {
                        break;
                    }
                }
            }
            hashMap = hashMap2;
        }
        if (hashMap == null) {
            return false;
        }
        boolean z = true;
        if (hashMap.isEmpty()) {
            return true;
        }
        try {
            com.bytedance.im.core.internal.a.a.b.a("IMMsgDao updateTableFlag");
            Iterator it2 = hashMap.entrySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.COLUMN_TABLE_FLAG.key, (Long) entry.getValue());
                if (com.bytedance.im.core.internal.a.a.b.a("msg", contentValues, a.COLUMN_MSG_ID.key + "=?", new String[]{(String) entry.getKey()}) >= 0) {
                    if (!com.bytedance.im.core.internal.c.a.b()) {
                        break;
                    }
                } else {
                    break;
                }
            }
            z = false;
            com.bytedance.im.core.internal.a.a.b.a("IMMsgDao updateTableFlag", z);
            return z;
        } catch (Exception e2) {
            com.bytedance.im.core.internal.a.a.b.a("IMMsgDao updateTableFlag", false);
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao updateTableFlag", e2);
            com.bytedance.im.core.c.e.a(e2);
            return false;
        }
    }

    public static String c() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS msg(");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    private static Map<String, Long> d() {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        HashMap hashMap = new HashMap();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("SELECT rowId," + a.COLUMN_MSG_ID.key + "," + a.COLUMN_TABLE_FLAG.key + " FROM msg", (String[]) null);
            if (aVar != null) {
                try {
                    int a2 = aVar.a(a.COLUMN_MSG_ID.key);
                    int a3 = aVar.a(a.COLUMN_TABLE_FLAG.key);
                    while (true) {
                        if (!aVar.d()) {
                            break;
                        }
                        hashMap.put(aVar.c(a2), Long.valueOf(aVar.b(a3)));
                        if (!com.bytedance.im.core.internal.c.a.b()) {
                            hashMap = null;
                            break;
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        e2.printStackTrace();
                        f.b("imsdk", "IMMsgDao getOldFlagMap", e2);
                        com.bytedance.im.core.c.e.a(e2);
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
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return hashMap;
        } catch (Exception e4) {
            e2 = e4;
            aVar = null;
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao getOldFlagMap", e2);
            com.bytedance.im.core.c.e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return null;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    private static void b(ai aiVar) {
        if (aiVar != null) {
            long j2 = 0;
            if (aiVar.getAttachments() != null && !aiVar.getAttachments().isEmpty()) {
                j2 = 0 | b.FLAG_ATTACHMENT.value;
            }
            if (aiVar.getPropertyItemListMap() != null && !aiVar.getPropertyItemListMap().isEmpty()) {
                j2 |= b.FLAG_MSG_PROPERTY.value;
            }
            aiVar.setTableFlag(j2);
        }
    }

    public static boolean j(String str) {
        return com.bytedance.im.core.internal.a.a.b.b("update msg set " + a.COLUMN_READ_STATUS.key + "=1 where " + a.COLUMN_CONVERSATION_ID.key + "='" + str + "'");
    }

    public static ai a(long j2) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select rowid,* from msg where " + a.COLUMN_SERVER_ID.key + "=?", new String[]{String.valueOf(j2)});
            try {
                if (aVar.c()) {
                    ai a2 = a(aVar);
                    c.a().a("getMsg", currentTimeMillis);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return a2;
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMMsgDao getMsg", e2);
                    e2.printStackTrace();
                    com.bytedance.im.core.c.e.a(e2);
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
            f.b("imsdk", "IMMsgDao getMsg", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
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

    public static ai c(String str) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select rowid,* from msg where " + a.COLUMN_MSG_ID.key + "=?", new String[]{str});
            if (aVar != null) {
                try {
                    if (aVar.c()) {
                        ai a2 = a(aVar);
                        c.a().a("getMsg", currentTimeMillis);
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        return a2;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        f.b("imsdk", "IMMsgDao getMsg", e2);
                        e2.printStackTrace();
                        com.bytedance.im.core.c.e.a(e2);
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
            f.b("imsdk", "IMMsgDao getMsg", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
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

    public static long g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select " + a.COLUMN_ORDER_INDEX.key + " from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? order by " + a.COLUMN_ORDER_INDEX.key + " asc limit 1", new String[]{str});
            if (aVar != null && aVar.c()) {
                long b2 = aVar.b(aVar.a(a.COLUMN_ORDER_INDEX.key));
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return b2;
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getMinOrderIndex", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return 0;
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select rowid,* from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_NET_STATUS.key + "=? limit 1", new String[]{str, "0", "0"});
            if (aVar.c()) {
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return true;
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao hasMsgByConversation", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return false;
    }

    private static long k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select rowid from msg where " + a.COLUMN_MSG_ID.key + "=?", new String[]{str});
            if (aVar != null && aVar.c()) {
                long b2 = aVar.b(aVar.a("rowid"));
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return b2;
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getRowid", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return -1;
    }

    public static long d(String str) {
        long j2 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select " + a.COLUMN_INNER_INDEX.key + " from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_INNER_INDEX.key + ">? order by " + a.COLUMN_INNER_INDEX.key + " asc, " + a.COLUMN_CREATE_TIME.key + " asc limit 1", new String[]{str, "10000000"});
            if (aVar.c()) {
                j2 = aVar.b(aVar.a(a.COLUMN_INNER_INDEX.key));
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getLegalOldestIndex", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        j.c("IMMsgDao getLegalOldestIndex, cid:" + str + ", index:" + j2);
        return j2;
    }

    public static long e(String str) {
        long j2 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select * from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? order by " + a.COLUMN_ORDER_INDEX.key + " desc, " + a.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str});
            if (aVar != null && aVar.c()) {
                j2 = aVar.b(aVar.a(a.COLUMN_INNER_INDEX.key));
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getLastMsgIndex", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        j.c("IMMsgDao getLastMsgIndex, cid:" + str + ", index:" + j2);
        return j2;
    }

    public static long f(String str) {
        long j2 = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select max(" + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + ") as " + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + " from msg where " + a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
            if (aVar != null && aVar.c()) {
                j2 = aVar.b(aVar.a(a.COLUMN_INDEX_IN_CONVERSATION_V2.key));
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getMaxIndexV2", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        j.c("IMMsgDao getMaxIndexV2, cid:" + str + ", indexV2:" + j2);
        return j2;
    }

    public static ai h(String str) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select rowid,* from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_NET_STATUS.key + "=? order by " + a.COLUMN_ORDER_INDEX.key + " desc, " + a.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str, "0", "0"});
            try {
                if (aVar.c()) {
                    ai a2 = a(aVar);
                    c.a().a("getLastShowMsg", currentTimeMillis);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return a2;
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMMsgDao getLastShowMsg", e2);
                    e2.printStackTrace();
                    com.bytedance.im.core.c.e.a(e2);
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
            f.b("imsdk", "IMMsgDao getLastShowMsg", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
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

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.im.core.d.ai a(com.bytedance.im.core.internal.a.c.a r6) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.i.a(com.bytedance.im.core.internal.a.c.a):com.bytedance.im.core.d.ai");
    }

    private static ContentValues c(ai aiVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_MSG_ID.key, aiVar.getUuid());
        contentValues.put(a.COLUMN_SERVER_ID.key, Long.valueOf(aiVar.getMsgId()));
        contentValues.put(a.COLUMN_CONVERSATION_ID.key, aiVar.getConversationId());
        contentValues.put(a.COLUMN_CONVERSATION_SHORT_ID.key, Long.valueOf(aiVar.getConversationShortId()));
        contentValues.put(a.COLUMN_CONVERSATION_TYPE.key, Integer.valueOf(aiVar.getConversationType()));
        contentValues.put(a.COLUMN_MSG_TYPE.key, Integer.valueOf(aiVar.getMsgType()));
        contentValues.put(a.COLUMN_INNER_INDEX.key, Long.valueOf(aiVar.getIndex()));
        contentValues.put(a.COLUMN_ORDER_INDEX.key, Long.valueOf(aiVar.getOrderIndex()));
        contentValues.put(a.COLUMN_STATUS.key, Integer.valueOf(aiVar.getMsgStatus()));
        contentValues.put(a.COLUMN_NET_STATUS.key, Integer.valueOf(aiVar.getSvrStatus()));
        contentValues.put(a.COLUMN_VERSION.key, Long.valueOf(aiVar.getVersion()));
        contentValues.put(a.COLUMN_DELETED.key, Integer.valueOf(aiVar.getDeleted()));
        contentValues.put(a.COLUMN_CREATE_TIME.key, Long.valueOf(aiVar.getCreatedAt()));
        contentValues.put(a.COLUMN_SENDER.key, Long.valueOf(aiVar.getSender()));
        contentValues.put(a.COLUMN_CONTENT.key, aiVar.getContent());
        contentValues.put(a.COLUMN_EXT.key, aiVar.getExtStr());
        contentValues.put(a.COLUMN_LOCAL_INFO.key, aiVar.getLocalExtStr());
        contentValues.put(a.COLUMN_READ_STATUS.key, Integer.valueOf(aiVar.getReadStatus()));
        contentValues.put(a.COLUMN_SEC_SENDER.key, aiVar.getSecSender());
        contentValues.put(a.COLUMN_PROPERTY_LIST.key, "");
        contentValues.put(a.COLUMN_INDEX_IN_CONVERSATION_V2.key, Long.valueOf(aiVar.getIndexInConversationV2()));
        contentValues.put(a.COLUMN_TABLE_FLAG.key, Long.valueOf(aiVar.getTableFlag()));
        return contentValues;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = com.bytedance.im.core.internal.a.a.b.a("msg", a.COLUMN_MSG_TYPE.key + "=?", new String[]{str});
        c.a().a("deleteMsgByType", currentTimeMillis);
        return a2;
    }

    private static void a(com.bytedance.im.core.internal.a.c.a aVar, List<ai> list) {
        a(aVar, list, true);
    }

    public static long b(String str, long j2) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select " + a.COLUMN_INNER_INDEX.key + " from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + "=?", new String[]{str, String.valueOf(j2)});
            if (aVar != null && aVar.c()) {
                long b2 = aVar.b(aVar.a(a.COLUMN_INNER_INDEX.key));
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return b2;
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getIndexByIndexV2", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return 0;
    }

    public static long c(String str, long j2) {
        j.c("IMMsgDao getOrderIndex, convId:" + str + ", mgsIndex:" + j2);
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select " + a.COLUMN_ORDER_INDEX.key + " from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_NET_STATUS.key + "=? AND " + a.COLUMN_INNER_INDEX.key + "=? order by " + a.COLUMN_ORDER_INDEX.key + " desc, " + a.COLUMN_CREATE_TIME.key + " desc limit 1", new String[]{str, "0", "0", String.valueOf(j2)});
            if (aVar.c()) {
                long b2 = aVar.b(aVar.a(a.COLUMN_ORDER_INDEX.key));
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return b2;
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgDao getOrderIndex", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return 0;
    }

    public static long d(String str, long j2) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select * from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_INNER_INDEX.key + ">? AND " + a.COLUMN_SENDER.key + "!=? AND " + a.COLUMN_NET_STATUS.key + "=? AND " + a.COLUMN_READ_STATUS.key + "=?", new String[]{str, "0", String.valueOf(j2), String.valueOf(d.a().f37562b.a()), "0", "0"});
            try {
                int b2 = aVar.b();
                c.a().a("computeUnreadMsgCount", currentTimeMillis);
                long j3 = (long) b2;
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return j3;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    f.b("imsdk", "IMMsgDao computeUnreadMsgCount error", (Throwable) null);
                    com.bytedance.im.core.c.e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    j.c("IMMsgDao computeUnreadMsgCount:0, cid:".concat(String.valueOf(str)));
                    return 0;
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
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao computeUnreadMsgCount error", (Throwable) null);
            com.bytedance.im.core.c.e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            j.c("IMMsgDao computeUnreadMsgCount:0, cid:".concat(String.valueOf(str)));
            return 0;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    public static ai a(String str, long j2) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        if (j2 <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select rowid,* from msg where " + a.COLUMN_INNER_INDEX.key + "=? and " + a.COLUMN_CONVERSATION_ID.key + " =?  and " + a.COLUMN_SERVER_ID.key + " >0 ", new String[]{String.valueOf(j2), str});
            try {
                if (aVar.c()) {
                    ai a2 = a(aVar);
                    c.a().a("getMsg", currentTimeMillis);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return a2;
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMMsgDao getMsg", e2);
                    e2.printStackTrace();
                    com.bytedance.im.core.c.e.a(e2);
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
            f.b("imsdk", "IMMsgDao getMsg", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
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

    public static List<ai> a(String str, int i2) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i2 <= 0) {
            i2 = 20;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a(("select rowid,* from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_NET_STATUS.key + "=?") + " order by " + a.COLUMN_ORDER_INDEX.key + " desc, " + a.COLUMN_CREATE_TIME.key + " desc limit " + i2, new String[]{str, "0", "0"});
            if (d.a().b().aw) {
                a(aVar, arrayList);
            } else {
                while (aVar.d()) {
                    arrayList.add(a(aVar));
                }
            }
            c.a().a("initMessageList", currentTimeMillis);
        } catch (Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao initMessageList", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        j.c("IMMsgDao initMessageList, cid:" + str + ", limit:" + i2 + ", count:" + arrayList.size());
        return arrayList;
    }

    public static int b(String str, long j2, long j3) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select * from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_INNER_INDEX.key + "<=? AND " + a.COLUMN_INNER_INDEX.key + ">=?", new String[]{str, String.valueOf(j3), String.valueOf(j2)});
            return aVar.b();
        } catch (Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao computeMsgCount", e2);
            com.bytedance.im.core.c.e.a(e2);
            return -1;
        } finally {
            com.bytedance.im.core.internal.a.a.a.a(aVar);
        }
    }

    public static long a(String str, long j2, long j3) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        try {
            String str2 = "select * from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_INNER_INDEX.key + ">? AND " + a.COLUMN_INDEX_IN_CONVERSATION_V2.key + "<? AND " + a.COLUMN_SENDER.key + "!=? AND " + a.COLUMN_NET_STATUS.key + "=? AND " + a.COLUMN_READ_STATUS.key + "=?";
            String[] strArr = new String[7];
            strArr[0] = str;
            strArr[1] = "0";
            strArr[2] = String.valueOf(j2);
            if (j3 <= 0) {
                j3 = Long.MAX_VALUE;
            }
            strArr[3] = String.valueOf(j3);
            strArr[4] = String.valueOf(d.a().f37562b.a());
            strArr[5] = "0";
            strArr[6] = "0";
            aVar = com.bytedance.im.core.internal.a.a.b.a(str2, strArr);
            try {
                int b2 = aVar.b();
                c.a().a("computeUnreadMsgCount2", currentTimeMillis);
                long j4 = (long) b2;
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return j4;
            } catch (Exception e3) {
                e2 = e3;
                try {
                    e2.printStackTrace();
                    f.b("imsdk", "IMMsgDao computeUnreadMsgCount2 error", (Throwable) null);
                    com.bytedance.im.core.c.e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    j.c("IMMsgDao computeUnreadMsgCount2:0, cid:".concat(String.valueOf(str)));
                    return 0;
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
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao computeUnreadMsgCount2 error", (Throwable) null);
            com.bytedance.im.core.c.e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            j.c("IMMsgDao computeUnreadMsgCount2:0, cid:".concat(String.valueOf(str)));
            return 0;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
    }

    public static List<ai> a(String str, long j2, long j3, int i2) {
        return a(str, j2, j3, i2, null, true);
    }

    public static List<ai> a(String str, long j2, long j3, int i2, int[] iArr, boolean z) {
        return b(str, j2, j3, i2, iArr, z);
    }

    private static List<ai> b(String str, long j2, long j3, int i2, int[] iArr, boolean z) {
        int i3 = i2;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        if (i3 <= 0) {
            i3 = 20;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        ArrayList arrayList = new ArrayList();
        try {
            String str2 = (("select rowid,* from msg where " + a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_DELETED.key + "=? AND " + a.COLUMN_NET_STATUS.key + "=?") + " AND " + a.COLUMN_INNER_INDEX.key + ">?") + " AND " + a.COLUMN_INNER_INDEX.key + "<=?";
            int i4 = 0;
            if (iArr != null && iArr.length > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("(");
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    sb.append(iArr[i5]);
                    if (i5 < iArr.length - 1) {
                        sb.append(",");
                    }
                }
                sb.append(")");
                str2 = str2 + " AND " + a.COLUMN_MSG_TYPE.key + " IN " + sb.toString();
            }
            String str3 = str2 + " order by " + a.COLUMN_ORDER_INDEX.key + " asc, " + a.COLUMN_CREATE_TIME.key + " asc";
            if (z) {
                str3 = str3 + " limit " + i3;
            }
            aVar = com.bytedance.im.core.internal.a.a.b.a(str3, new String[]{str, "0", "0", String.valueOf(j2), String.valueOf(j3)});
            if (d.a().b().aw) {
                a(aVar, arrayList);
                Collections.reverse(arrayList);
            } else {
                ai[] aiVarArr = new ai[aVar.b()];
                while (aVar.d()) {
                    aiVarArr[(aVar.b() - 1) - i4] = a(aVar);
                    i4++;
                }
                arrayList.addAll(Arrays.asList(aiVarArr));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "IMMsgDao queryNewerMessageList", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        j.c("IMMsgDao queryNewerMessageList, cid:" + str + ", startIndex:" + j2 + ", limit:" + i3 + ", count:" + arrayList.size());
        return arrayList;
    }
}
