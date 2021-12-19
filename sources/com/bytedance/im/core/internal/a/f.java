package com.bytedance.im.core.internal.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.d.ao;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.a.c;
import com.bytedance.im.core.internal.a.c.c;
import com.bytedance.im.core.internal.utils.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class f {
    static {
        Covode.recordClassIndex(22896);
    }

    public static boolean a(String str, Map<Long, ao> map) {
        c cVar;
        Throwable th;
        Exception e2;
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet(b(str));
        HashSet hashSet3 = new HashSet(hashSet);
        hashSet3.addAll(hashSet2);
        hashSet3.removeAll(hashSet);
        ArrayList arrayList = new ArrayList(hashSet3);
        ArrayList<ao> arrayList2 = new ArrayList(map.values());
        HashSet<ao> hashSet4 = new HashSet();
        b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        try {
            if (!arrayList2.isEmpty()) {
                cVar = b.c("update participant_read set " + a.COLUMN_MIN_INDEX.key + "=?," + a.COLUMN_READ_INDEX.key + "=?," + a.COLUMN_READ_ORDER.key + "=? where " + a.COLUMN_USER_ID.key + "=? and " + a.COLUMN_CONVERSATION_ID.key + "=?");
                try {
                    for (ao aoVar : arrayList2) {
                        if (aoVar != null) {
                            cVar.d();
                            cVar.a(1, aoVar.f37820c);
                            cVar.a(2, aoVar.f37821d);
                            cVar.a(3, aoVar.f37822e);
                            cVar.a(4, aoVar.f37819b);
                            cVar.a(5, str);
                            if (cVar.a() <= 0) {
                                hashSet4.add(aoVar);
                            }
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e2);
                        b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
                        com.bytedance.im.core.internal.a.a.a.a(cVar);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.im.core.internal.a.a.a.a(cVar);
                        throw th;
                    }
                }
            } else {
                cVar = null;
            }
            if (!hashSet4.isEmpty()) {
                if (cVar != null) {
                    cVar.c();
                }
                cVar = b.c("insert or ignore into participant_read values(" + com.bytedance.im.core.internal.a.a.a.a(a.values().length) + ")");
                for (ao aoVar2 : hashSet4) {
                    cVar.d();
                    cVar.a(1, aoVar2.f37819b);
                    cVar.a(2, aoVar2.f37818a);
                    cVar.a(3, aoVar2.f37820c);
                    cVar.a(4, aoVar2.f37821d);
                    cVar.a(5, aoVar2.f37822e);
                    cVar.b();
                }
            }
            b(str, arrayList);
            b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", true);
            j.c("IMConversationMemberReadDao insertOrUpdateMemberRead end");
            com.bytedance.im.core.g.c.a().a("insertOrUpdateMemberRead", currentTimeMillis);
        } catch (Exception e4) {
            e2 = e4;
            cVar = null;
            com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e2);
            b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
            com.bytedance.im.core.internal.a.a.a.a(cVar);
            return true;
        } catch (Throwable th3) {
            th = th3;
            cVar = null;
            com.bytedance.im.core.internal.a.a.a.a(cVar);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(cVar);
        return true;
    }

    public enum a {
        COLUMN_USER_ID("user_id", "INTEGER NOT NULL"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
        COLUMN_MIN_INDEX("min_index", "INTEGER"),
        COLUMN_READ_INDEX("read_index", "INTEGER"),
        COLUMN_READ_ORDER("read_order", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22897);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE IF NOT EXISTS participant_read(");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    private static ao a(com.bytedance.im.core.internal.a.c.a aVar) {
        ao aoVar = new ao();
        aoVar.f37818a = aVar.c(aVar.a(a.COLUMN_CONVERSATION_ID.key));
        aoVar.f37819b = aVar.b(aVar.a(a.COLUMN_USER_ID.key));
        aoVar.a(aVar.b(aVar.a(a.COLUMN_MIN_INDEX.key)));
        aoVar.b(aVar.b(aVar.a(a.COLUMN_READ_INDEX.key)));
        aoVar.c(aVar.b(aVar.a(a.COLUMN_READ_ORDER.key)));
        return aoVar;
    }

    private static List<Long> b(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = b.a("select * from participant_read where " + a.COLUMN_CONVERSATION_ID.key + "=? ", new String[]{str});
            int i2 = -1;
            while (aVar.d()) {
                if (i2 < 0) {
                    i2 = aVar.a(a.COLUMN_USER_ID.key);
                }
                arrayList.add(Long.valueOf(aVar.b(i2)));
            }
        } catch (Exception e2) {
            com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao getMemberIdList", e2);
            e2.printStackTrace();
            e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static HashMap<String, HashMap<Long, ao>> a(List<String> list) {
        HashMap<String, HashMap<Long, ao>> hashMap = new HashMap<>();
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("select * from participant_read where " + a.COLUMN_CONVERSATION_ID.key + " in ( ");
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (i2 == list.size() - 1) {
                    sb.append("? )");
                } else {
                    sb.append("? ,");
                }
            }
            aVar = b.a(sb.toString(), (String[]) list.toArray(new String[list.size()]));
            ArrayList<ao> arrayList = new ArrayList();
            while (aVar.d()) {
                arrayList.add(a(aVar));
            }
            for (ao aoVar : arrayList) {
                String str = aoVar.f37818a;
                if (!hashMap.containsKey(str)) {
                    HashMap<Long, ao> hashMap2 = new HashMap<>();
                    hashMap2.put(Long.valueOf(aoVar.f37819b), aoVar);
                    hashMap.put(str, hashMap2);
                } else {
                    hashMap.get(str).put(Long.valueOf(aoVar.f37819b), aoVar);
                }
            }
            return hashMap;
        } catch (Exception e2) {
            com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao getMemberList", e2);
            e2.printStackTrace();
            e.a(e2);
            return hashMap;
        } finally {
            com.bytedance.im.core.internal.a.a.a.a(aVar);
        }
    }

    private static List<ao> a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        com.bytedance.im.core.internal.a.c.a aVar = null;
        try {
            aVar = b.a("select * from participant_read where " + a.COLUMN_CONVERSATION_ID.key + "=? ", new String[]{str});
            while (aVar.d()) {
                arrayList.add(a(aVar));
            }
        } catch (Exception e2) {
            com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao getMemberList", e2);
            e2.printStackTrace();
            e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static int a(String str, List<Long> list) {
        int i2;
        Exception e2;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return 0;
        }
        b.a("IMConversationMemberReadDao.removeMember(String, List)");
        try {
            Iterator<Long> it = list.iterator();
            i2 = 0;
            while (it.hasNext()) {
                try {
                    if (b.a("participant_read", a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(it.next())})) {
                        i2++;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao removeMember", e2);
                    b.a("IMConversationMemberReadDao.removeMember(String, List)", false);
                    return i2;
                }
            }
            b.a("IMConversationMemberReadDao.removeMember(String, List)", true);
        } catch (Exception e4) {
            e2 = e4;
            i2 = 0;
            com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao removeMember", e2);
            b.a("IMConversationMemberReadDao.removeMember(String, List)", false);
            return i2;
        }
        return i2;
    }

    private static int b(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || list.isEmpty()) {
            return 0;
        }
        int i2 = 0;
        for (Long l2 : list) {
            if (b.a("participant_read", a.COLUMN_CONVERSATION_ID.key + "=? AND " + a.COLUMN_USER_ID.key + "=?", new String[]{str, String.valueOf(l2)})) {
                i2++;
            }
        }
        return i2;
    }

    public static Map<Long, ao> c(String str, Map<Long, ao> map) {
        if (TextUtils.isEmpty(str)) {
            return map;
        }
        long currentTimeMillis = System.currentTimeMillis();
        List<ao> a2 = a(str);
        if (!a2.isEmpty()) {
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                ao aoVar = a2.get(i2);
                if (aoVar != null) {
                    long j2 = aoVar.f37819b;
                    if (map == null) {
                        map = new HashMap<>();
                        map.put(Long.valueOf(j2), aoVar.clone());
                    } else {
                        ao aoVar2 = map.get(Long.valueOf(j2));
                        if (aoVar2 == null) {
                            aoVar2 = new ao();
                        }
                        aoVar2.f37818a = aoVar.f37818a;
                        aoVar2.f37819b = aoVar.f37819b;
                        aoVar2.a(aoVar.f37820c);
                        aoVar2.b(aoVar.f37821d);
                        aoVar2.c(aoVar.f37822e);
                        map.put(Long.valueOf(j2), aoVar2);
                    }
                }
            }
        }
        com.bytedance.im.core.g.c.a().a("loadIndexInfoToMap", currentTimeMillis);
        return map;
    }

    public static boolean b(String str, Map<Long, ao> map) {
        c cVar;
        Throwable th;
        Exception e2;
        if (TextUtils.isEmpty(str) || map == null || map.isEmpty()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList<ao> arrayList = new ArrayList(map.values());
        HashSet<ao> hashSet = new HashSet();
        b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)");
        try {
            b.a("participant_read", c.a.COLUMN_ID.key + "=?", new String[]{str});
            if (!arrayList.isEmpty()) {
                cVar = b.c("update participant_read set " + a.COLUMN_READ_INDEX.key + "=?," + a.COLUMN_READ_ORDER.key + "=?," + a.COLUMN_MIN_INDEX.key + "=? where " + a.COLUMN_USER_ID.key + "=? and " + a.COLUMN_CONVERSATION_ID.key + "=?");
                try {
                    for (ao aoVar : arrayList) {
                        if (aoVar != null) {
                            cVar.d();
                            cVar.a(1, aoVar.f37821d);
                            cVar.a(2, aoVar.f37822e);
                            cVar.a(3, aoVar.f37820c);
                            cVar.a(4, aoVar.f37819b);
                            cVar.a(5, str);
                            if (cVar.a() <= 0) {
                                hashSet.add(aoVar);
                            }
                        }
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e2);
                        b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
                        com.bytedance.im.core.internal.a.a.a.a(cVar);
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                        com.bytedance.im.core.internal.a.a.a.a(cVar);
                        throw th;
                    }
                }
            } else {
                cVar = null;
            }
            if (!hashSet.isEmpty()) {
                if (cVar != null) {
                    cVar.c();
                }
                cVar = b.c("insert or ignore into participant_read values(" + com.bytedance.im.core.internal.a.a.a.a(a.values().length) + ")");
                for (ao aoVar2 : hashSet) {
                    cVar.d();
                    cVar.a(1, aoVar2.f37819b);
                    cVar.a(2, aoVar2.f37818a);
                    cVar.a(3, aoVar2.f37820c);
                    cVar.a(4, aoVar2.f37821d);
                    cVar.a(5, aoVar2.f37822e);
                    cVar.b();
                }
            }
            b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", true);
            j.c("IMConversationMemberReadDao insertOrUpdateMemberRead end");
            com.bytedance.im.core.g.c.a().a("insertOrUpdateMemberRead", currentTimeMillis);
        } catch (Exception e4) {
            e2 = e4;
            cVar = null;
            com.bytedance.im.core.c.f.b("imsdk", "IMConversationMemberReadDao insertOrUpdateMemberRead", e2);
            b.a("IMConversationMemberReadDao.insertOrUpdateMemberRead(String)", false);
            com.bytedance.im.core.internal.a.a.a.a(cVar);
            return true;
        } catch (Throwable th3) {
            th = th3;
            cVar = null;
            com.bytedance.im.core.internal.a.a.a.a(cVar);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(cVar);
        return true;
    }
}
