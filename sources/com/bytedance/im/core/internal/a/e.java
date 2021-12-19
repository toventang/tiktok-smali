package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.ah;
import com.bytedance.im.core.g.c;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.utils.j;
import com.bytedance.im.core.internal.utils.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class e {
    static {
        Covode.recordClassIndex(22894);
    }

    public static Map<String, List<Long>> a(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        int i2 = d.a().b().ab.batchQueryEnableAndQueryLimit;
        String str = "select * from participant where " + a.COLUMN_CONVERSATION_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        com.bytedance.im.core.internal.a.c.a aVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i3 == i2 - 1 || i4 == list.size() - 1) {
                sb.append("'").append(list.get(i4)).append("') order by ").append(a.COLUMN_SORT_ORDER.key);
                try {
                    aVar = b.a(sb.toString(), (String[]) null);
                    if (aVar != null) {
                        int a2 = aVar.a(a.COLUMN_CONVERSATION_ID.key);
                        int a3 = aVar.a(a.COLUMN_USER_ID.key);
                        while (aVar.d()) {
                            String c2 = aVar.c(a2);
                            List list2 = (List) hashMap.get(c2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap.put(c2, list2);
                            }
                            list2.add(Long.valueOf(aVar.b(a3)));
                        }
                    }
                } catch (Exception e2) {
                    f.b("imsdk", "IMConversationMemberDao getMemberIdMap", e2);
                    e2.printStackTrace();
                    com.bytedance.im.core.c.e.a(e2);
                } catch (Throwable th) {
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    throw th;
                }
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                sb = new StringBuilder(str);
                i3 = 0;
            } else {
                i3++;
                sb.append("'").append(list.get(i4)).append("',");
            }
        }
        c.a().a("getMemberIdMap", currentTimeMillis);
        return hashMap;
    }

    public static List<ah> a(String str, List<Long> list) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = b.a("select * from participant where " + a.COLUMN_CONVERSATION_ID.key + "=? and " + a.COLUMN_USER_ID.key + " in (" + com.bytedance.im.core.internal.utils.e.a(list, ",") + ") order by " + a.COLUMN_SORT_ORDER.key, new String[]{str});
            while (aVar.d()) {
                arrayList.add(a(aVar));
            }
            j.c("IMConversationMemberDao getMemberList by ids, result:" + arrayList.size());
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationMemberDao getMemberList", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static boolean a(String str, int i2, List<ah> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return false;
        }
        j.c("IMConversationMemberDao insertOrUpdateMember, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<ah> arrayList = new ArrayList();
        b.a("IMConversationMemberDao.insertOrUpdateMember(String,List)");
        try {
            for (ah ahVar : list) {
                if (ahVar != null) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(a.COLUMN_SORT_ORDER.key, Long.valueOf(ahVar.getSortOrder()));
                    contentValues.put(a.COLUMN_ROLE.key, Integer.valueOf(ahVar.getRole()));
                    contentValues.put(a.COLUMN_ALIAS.key, ahVar.getAlias());
                    contentValues.put(a.COLUMN_SEC_UID.key, ahVar.getSecUid());
                    contentValues.put(a.COLUMN_SILENT.key, Integer.valueOf(ahVar.getSilent()));
                    contentValues.put(a.COLUMN_SILENT_TIME.key, Long.valueOf(ahVar.getSilentTime()));
                    if (b.a("participant", contentValues, a.COLUMN_USER_ID.key + "=? AND " + a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{String.valueOf(ahVar.getUid()), str}) <= 0) {
                        ahVar.setConversationType(i2);
                        arrayList.add(ahVar);
                    } else {
                        com.bytedance.im.core.internal.a.b.a.a();
                        d.a();
                    }
                }
            }
            for (ah ahVar2 : arrayList) {
                if (b.a("participant", a(ahVar2)) > 0) {
                    com.bytedance.im.core.internal.a.b.a.a();
                    d.a();
                }
            }
            b.a("IMConversationMemberDao.insertOrUpdateMember(String,List)", true);
            c.a().a("insertOrUpdateMember", currentTimeMillis);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationMemberDao", e2);
            b.a("IMConversationMemberDao.insertOrUpdateMember(String,List)", false);
        }
        q.a().b(list);
        return true;
    }

    private static void a(com.bytedance.im.core.internal.a.c.a aVar, Map<String, List<ah>> map) {
        if (aVar != null) {
            int a2 = aVar.a(a.COLUMN_ALIAS.key);
            int a3 = aVar.a(a.COLUMN_CONVERSATION_ID.key);
            int a4 = aVar.a(a.COLUMN_ROLE.key);
            int a5 = aVar.a(a.COLUMN_SORT_ORDER.key);
            int a6 = aVar.a(a.COLUMN_USER_ID.key);
            int a7 = aVar.a(a.COLUMN_SEC_UID.key);
            int a8 = aVar.a(a.COLUMN_SILENT.key);
            int a9 = aVar.a(a.COLUMN_SILENT_TIME.key);
            while (aVar.d()) {
                ah ahVar = new ah();
                String c2 = aVar.c(a3);
                ahVar.setAlias(aVar.c(a2));
                ahVar.setConversationId(c2);
                ahVar.setRole(aVar.a(a4));
                ahVar.setSortOrder((long) aVar.a(a5));
                ahVar.setUid(aVar.b(a6));
                ahVar.setSecUid(aVar.c(a7));
                ahVar.setSilent(aVar.a(a8));
                ahVar.setSilentTime(aVar.b(a9));
                List<ah> list = map.get(c2);
                if (list == null) {
                    list = new ArrayList<>();
                    map.put(c2, list);
                }
                list.add(ahVar);
            }
        }
    }

    public enum a {
        COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
        COLUMN_SORT_ORDER("sort_order", "INTEGER"),
        COLUMN_ROLE("role", "INTEGER"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
        COLUMN_ALIAS("alias", "TEXT"),
        COLUMN_SEC_UID("sec_uid", "TEXT"),
        COLUMN_SILENT("silent", "INTEGER"),
        COLUMN_SILENT_TIME("silent_time", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22895);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant(");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static boolean d(String str) {
        j.c("IMConversationMemberDao deleteConversation, cid:".concat(String.valueOf(str)));
        boolean a2 = b.a("participant", a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{str});
        if (a2) {
            com.bytedance.im.core.internal.a.b.a.a();
            d.a();
        }
        return a2;
    }

    private static ContentValues a(ah ahVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_USER_ID.key, Long.valueOf(ahVar.getUid()));
        contentValues.put(a.COLUMN_ALIAS.key, ahVar.getAlias());
        contentValues.put(a.COLUMN_CONVERSATION_ID.key, ahVar.getConversationId());
        contentValues.put(a.COLUMN_ROLE.key, Integer.valueOf(ahVar.getRole()));
        contentValues.put(a.COLUMN_SORT_ORDER.key, Long.valueOf(ahVar.getSortOrder()));
        contentValues.put(a.COLUMN_SEC_UID.key, ahVar.getSecUid());
        contentValues.put(a.COLUMN_SILENT.key, Integer.valueOf(ahVar.getSilent()));
        contentValues.put(a.COLUMN_SILENT_TIME.key, Long.valueOf(ahVar.getSilentTime()));
        return contentValues;
    }

    private static ah a(com.bytedance.im.core.internal.a.c.a aVar) {
        ah ahVar = new ah();
        ahVar.setAlias(aVar.c(aVar.a(a.COLUMN_ALIAS.key)));
        ahVar.setConversationId(aVar.c(aVar.a(a.COLUMN_CONVERSATION_ID.key)));
        ahVar.setRole(aVar.a(aVar.a(a.COLUMN_ROLE.key)));
        ahVar.setSortOrder((long) aVar.a(aVar.a(a.COLUMN_SORT_ORDER.key)));
        ahVar.setUid(aVar.b(aVar.a(a.COLUMN_USER_ID.key)));
        ahVar.setSecUid(aVar.c(aVar.a(a.COLUMN_SEC_UID.key)));
        ahVar.setSilent(aVar.a(aVar.a(a.COLUMN_SILENT.key)));
        ahVar.setSilentTime(aVar.b(aVar.a(a.COLUMN_SILENT_TIME.key)));
        return ahVar;
    }

    public static List<ah> b(String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = b.a("select * from participant where " + a.COLUMN_CONVERSATION_ID.key + "=? order by " + a.COLUMN_SORT_ORDER.key, new String[]{str});
            while (aVar.d()) {
                arrayList.add(a(aVar));
            }
            c.a().a("getMemberList", currentTimeMillis);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationMemberDao getMemberList", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static long c(String str) {
        j.c("IMConversationMemberDao getLargestOrder, cid:".concat(String.valueOf(str)));
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = b.a("select * from participant where " + a.COLUMN_CONVERSATION_ID.key + "=? order by " + a.COLUMN_SORT_ORDER.key + " desc limit 1", new String[]{str});
            if (aVar != null && aVar.c()) {
                long b2 = aVar.b(aVar.a(a.COLUMN_SORT_ORDER.key));
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                return b2;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            f.b("imsdk", "IMConversationMemberDao getLargestOrder", e2);
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return 0;
    }

    public static Map<String, List<ah>> b(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        int i2 = d.a().b().ab.batchQueryEnableAndQueryLimit;
        String str = "select * from participant where " + a.COLUMN_CONVERSATION_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        com.bytedance.im.core.internal.a.c.a aVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i3 == i2 - 1 || i4 == list.size() - 1) {
                sb.append("'").append(list.get(i4)).append("') order by ").append(a.COLUMN_SORT_ORDER.key);
                try {
                    aVar = b.a(sb.toString(), (String[]) null);
                    a(aVar, hashMap);
                } catch (Exception e2) {
                    f.b("imsdk", "IMConversationMemberDao getMembersMap", e2);
                    e2.printStackTrace();
                    com.bytedance.im.core.c.e.a(e2);
                } catch (Throwable th) {
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    throw th;
                }
                com.bytedance.im.core.internal.a.a.a.a(aVar);
                sb = new StringBuilder(str);
                i3 = 0;
            } else {
                i3++;
                sb.append("'").append(list.get(i4)).append("',");
            }
        }
        c.a().a("getMembersMap", currentTimeMillis);
        return hashMap;
    }

    public static List<Long> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        long currentTimeMillis = System.currentTimeMillis();
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = b.a("select * from participant where " + a.COLUMN_CONVERSATION_ID.key + "=? order by " + a.COLUMN_SORT_ORDER.key, new String[]{str});
            int i2 = -1;
            while (aVar.d()) {
                if (i2 < 0) {
                    i2 = aVar.a(a.COLUMN_USER_ID.key);
                }
                arrayList.add(Long.valueOf(aVar.b(i2)));
            }
            c.a().a("getMemberId", currentTimeMillis);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationMemberDao getMemberId", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static int b(String str, List<Long> list) {
        int i2;
        Exception e2;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        b.a("IMConversationMemberDao.removeMember(String,List)");
        try {
            i2 = 0;
            for (Long l2 : list) {
                try {
                    if (b.a("participant", a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(l2)})) {
                        i2++;
                        String.valueOf(l2);
                        com.bytedance.im.core.internal.a.b.b.a();
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    f.b("imsdk", "IMConversationMemberDao removeMember", e2);
                    b.a("IMConversationMemberDao.removeMember(String,List)", false);
                    return i2;
                }
            }
            b.a("IMConversationMemberDao.removeMember(String,List)", true);
        } catch (Exception e4) {
            e2 = e4;
            i2 = 0;
            f.b("imsdk", "IMConversationMemberDao removeMember", e2);
            b.a("IMConversationMemberDao.removeMember(String,List)", false);
            return i2;
        }
        return i2;
    }

    public static int c(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        int i2 = 0;
        for (Long l2 : list) {
            if (b.a("participant", a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(l2)})) {
                i2++;
                String.valueOf(l2);
                com.bytedance.im.core.internal.a.b.b.a();
            }
        }
        return i2;
    }

    public static ah a(String str, String str2) {
        Throwable th;
        ah ahVar;
        Exception e2;
        com.bytedance.im.core.internal.a.c.a aVar = null;
        ah ahVar2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        j.c("IMConversationMemberDao queryMember, cid:" + str + ", uid:" + str2);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            com.bytedance.im.core.internal.a.c.a a2 = b.a("select * from participant where " + a.COLUMN_CONVERSATION_ID.key + "=?  and " + a.COLUMN_USER_ID.key + "=?", new String[]{str, str2});
            while (a2.d()) {
                try {
                    ahVar2 = a(a2);
                } catch (Exception e3) {
                    e2 = e3;
                    ahVar = ahVar2;
                    aVar = a2;
                    try {
                        f.b("imsdk", "IMConversationMemberDao queryMember", e2);
                        e2.printStackTrace();
                        com.bytedance.im.core.c.e.a(e2);
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        return ahVar;
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.im.core.internal.a.a.a.a(aVar);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    aVar = a2;
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    throw th;
                }
            }
            c.a().a("queryMember", currentTimeMillis);
            com.bytedance.im.core.internal.a.a.a.a(a2);
            return ahVar2;
        } catch (Exception e4) {
            e2 = e4;
            ahVar = null;
            f.b("imsdk", "IMConversationMemberDao queryMember", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return ahVar;
        }
    }

    public static boolean b(String str, int i2, List<ah> list) {
        if (TextUtils.isEmpty(str) || list == null) {
            return false;
        }
        j.c("IMConversationMemberDao insertOrUpdateMemberNoTrans, cid:".concat(String.valueOf(str)));
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<ah> arrayList = new ArrayList();
        for (ah ahVar : list) {
            if (ahVar != null) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.COLUMN_SORT_ORDER.key, Long.valueOf(ahVar.getSortOrder()));
                contentValues.put(a.COLUMN_ROLE.key, Integer.valueOf(ahVar.getRole()));
                contentValues.put(a.COLUMN_ALIAS.key, ahVar.getAlias());
                contentValues.put(a.COLUMN_SEC_UID.key, ahVar.getSecUid());
                contentValues.put(a.COLUMN_SILENT.key, Integer.valueOf(ahVar.getSilent()));
                contentValues.put(a.COLUMN_SILENT_TIME.key, Long.valueOf(ahVar.getSilentTime()));
                if (b.a("participant", contentValues, a.COLUMN_USER_ID.key + "=? AND " + a.COLUMN_CONVERSATION_ID.key + "=?", new String[]{String.valueOf(ahVar.getUid()), str}) <= 0) {
                    ahVar.setConversationType(i2);
                    arrayList.add(ahVar);
                } else {
                    com.bytedance.im.core.internal.a.b.a.a();
                    d.a();
                }
            }
        }
        for (ah ahVar2 : arrayList) {
            if (b.a("participant", a(ahVar2)) > 0) {
                com.bytedance.im.core.internal.a.b.a.a();
                d.a();
            }
        }
        c.a().a("insertOrUpdateMemberNoTrans", currentTimeMillis);
        q.a().b(list);
        return true;
    }
}
