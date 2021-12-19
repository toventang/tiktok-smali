package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.internal.a.c.c;
import com.bytedance.im.core.internal.utils.e;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class b {
    static {
        Covode.recordClassIndex(22868);
    }

    public static boolean a(i iVar) {
        boolean z = false;
        if (iVar == null || TextUtils.isEmpty(iVar.getConversationId())) {
            return false;
        }
        Boolean bool = false;
        c cVar = null;
        try {
            if (d.a().b().aB) {
                com.bytedance.im.core.internal.a.a.b.a("IMConversationCoreDao.insertOrUpdate");
                ContentValues contentValues = new ContentValues();
                contentValues.put(a.COLUMN_ID.key, e.b(iVar.getConversationId()));
                contentValues.put(a.COLUMN_VERSION.key, Long.valueOf(iVar.getVersion()));
                contentValues.put(a.COLUMN_NAME.key, e.b(iVar.getName()));
                contentValues.put(a.COLUMN_DESC.key, e.b(iVar.getDesc()));
                contentValues.put(a.COLUMN_ICON.key, e.b(iVar.getIcon()));
                contentValues.put(a.COLUMN_NOTICE.key, e.b(iVar.getNotice()));
                contentValues.put(a.COLUMN_OWNER_ID.key, Long.valueOf(iVar.getOwner()));
                contentValues.put(a.COLUMN_SEC_OWNER.key, e.b(iVar.getSecOwner()));
                contentValues.put(a.COLUMN_SILENT.key, Integer.valueOf(iVar.getSilent()));
                contentValues.put(a.COLUMN_SILENT_NORMAL_ONLY.key, Integer.valueOf(iVar.getSilentNormalOnly()));
                contentValues.put(a.COLUMN_MODE.key, Integer.valueOf(iVar.getMode()));
                contentValues.put(a.COLUMN_EXT.key, e.b(iVar.getExtStr()));
                if (com.bytedance.im.core.internal.a.a.b.c("conversation_core", contentValues) > 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            } else {
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                sb.append(" replace into conversation_core(");
                for (a aVar : a.values()) {
                    sb.append(aVar.key).append(",");
                    sb2.append("?,");
                }
                String sb3 = sb.toString();
                String sb4 = sb2.toString();
                com.bytedance.im.core.internal.a.a.b.a("IMConversationCoreDao.insertOrUpdate");
                cVar = com.bytedance.im.core.internal.a.a.b.c(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
                if (cVar != null) {
                    cVar.d();
                    cVar.a(a.COLUMN_ID.ordinal() + 1, e.b(iVar.getConversationId()));
                    cVar.a(a.COLUMN_VERSION.ordinal() + 1, iVar.getVersion());
                    cVar.a(a.COLUMN_NAME.ordinal() + 1, e.b(iVar.getName()));
                    cVar.a(a.COLUMN_ICON.ordinal() + 1, e.b(iVar.getIcon()));
                    cVar.a(a.COLUMN_DESC.ordinal() + 1, e.b(iVar.getDesc()));
                    cVar.a(a.COLUMN_NOTICE.ordinal() + 1, e.b(iVar.getNotice()));
                    cVar.a(a.COLUMN_OWNER_ID.ordinal() + 1, iVar.getOwner());
                    cVar.a(a.COLUMN_SEC_OWNER.ordinal() + 1, e.b(iVar.getSecOwner()));
                    cVar.a(a.COLUMN_SILENT.ordinal() + 1, (long) iVar.getSilent());
                    cVar.a(a.COLUMN_SILENT_NORMAL_ONLY.ordinal() + 1, (long) iVar.getSilentNormalOnly());
                    cVar.a(a.COLUMN_MODE.ordinal() + 1, (long) iVar.getMode());
                    cVar.a(a.COLUMN_EXT.ordinal() + 1, e.b(iVar.getExtStr()));
                }
                if (cVar.a() > 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            if (bool.booleanValue() && d.a().b().aN) {
                com.bytedance.im.core.h.d.b();
            }
            com.bytedance.im.core.internal.a.a.b.a("IMConversationCoreDao.insertOrUpdate", true);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationCoreDao insertOrUpdate ", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
            com.bytedance.im.core.internal.a.a.b.a("IMConversationCoreDao.insertOrUpdate", true);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.b.a("IMConversationCoreDao.insertOrUpdate", true);
            com.bytedance.im.core.internal.a.a.a.a((c) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(cVar);
        return bool.booleanValue();
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_core (");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public enum a {
        COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
        COLUMN_VERSION("info_version", "BIGINT"),
        COLUMN_NAME(StringSet.name, "TEXT"),
        COLUMN_DESC("desc", "TEXT"),
        COLUMN_ICON("icon", "TEXT"),
        COLUMN_NOTICE("notice", "TEXT"),
        COLUMN_OWNER_ID("owner_id", "INTEGER DEFAULT -1"),
        COLUMN_SEC_OWNER("sec_owner", "TEXT"),
        COLUMN_SILENT("silent", "INTEGER DEFAULT 0"),
        COLUMN_SILENT_NORMAL_ONLY("silent_normal_only", "INTEGER DEFAULT 0"),
        COLUMN_MODE("mode", "INTEGER DEFAULT -1"),
        COLUMN_EXT("ext", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22869);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static List<i> a(com.bytedance.im.core.internal.a.c.a aVar) {
        if (aVar == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int a2 = aVar.a(a.COLUMN_ID.key);
        int a3 = aVar.a(a.COLUMN_VERSION.key);
        int a4 = aVar.a(a.COLUMN_NAME.key);
        int a5 = aVar.a(a.COLUMN_ICON.key);
        int a6 = aVar.a(a.COLUMN_DESC.key);
        int a7 = aVar.a(a.COLUMN_NOTICE.key);
        int a8 = aVar.a(a.COLUMN_OWNER_ID.key);
        int a9 = aVar.a(a.COLUMN_SEC_OWNER.key);
        int a10 = aVar.a(a.COLUMN_SILENT.key);
        int a11 = aVar.a(a.COLUMN_SILENT_NORMAL_ONLY.key);
        int a12 = aVar.a(a.COLUMN_MODE.key);
        int a13 = aVar.a(a.COLUMN_EXT.key);
        while (aVar.d()) {
            i iVar = new i();
            iVar.setConversationId(aVar.c(a2));
            iVar.setVersion(aVar.b(a3));
            iVar.setName(aVar.c(a4));
            iVar.setIcon(aVar.c(a5));
            iVar.setDesc(aVar.c(a6));
            iVar.setNotice(aVar.c(a7));
            iVar.setOwner(aVar.b(a8));
            iVar.setSecOwner(aVar.c(a9));
            iVar.setSilent(aVar.a(a10));
            iVar.setSilentNormalOnly(aVar.a(a11));
            iVar.setMode(aVar.a(a12));
            iVar.setExtStr(aVar.c(a13));
            arrayList.add(iVar);
        }
        return arrayList;
    }

    public static i a(String str) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        i iVar = null;
        iVar = null;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            aVar = com.bytedance.im.core.internal.a.a.b.a("select * from conversation_core where " + a.COLUMN_ID.key + "=?", new String[]{str});
            try {
                if (aVar.c()) {
                    i iVar2 = new i();
                    iVar2.setConversationId(aVar.c(aVar.a(a.COLUMN_ID.key)));
                    iVar2.setVersion(aVar.b(aVar.a(a.COLUMN_VERSION.key)));
                    iVar2.setName(aVar.c(aVar.a(a.COLUMN_NAME.key)));
                    iVar2.setIcon(aVar.c(aVar.a(a.COLUMN_ICON.key)));
                    iVar2.setDesc(aVar.c(aVar.a(a.COLUMN_DESC.key)));
                    iVar2.setNotice(aVar.c(aVar.a(a.COLUMN_NOTICE.key)));
                    iVar2.setOwner(aVar.b(aVar.a(a.COLUMN_OWNER_ID.key)));
                    iVar2.setSecOwner(aVar.c(aVar.a(a.COLUMN_SEC_OWNER.key)));
                    iVar2.setSilent(aVar.a(aVar.a(a.COLUMN_SILENT.key)));
                    iVar2.setSilentNormalOnly(aVar.a(aVar.a(a.COLUMN_SILENT_NORMAL_ONLY.key)));
                    iVar2.setMode(aVar.a(aVar.a(a.COLUMN_MODE.key)));
                    iVar2.setExtStr(aVar.c(aVar.a(a.COLUMN_EXT.key)));
                    iVar = iVar2;
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMConversationCoreDao get ", e2);
                    e2.printStackTrace();
                    com.bytedance.im.core.c.e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return iVar;
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
            f.b("imsdk", "IMConversationCoreDao get ", e2);
            e2.printStackTrace();
            com.bytedance.im.core.c.e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return iVar;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return iVar;
    }

    public static Map<String, i> a(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = d.a().b().ab.batchQueryEnableAndQueryLimit;
        String str = "select * from conversation_core where " + a.COLUMN_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        com.bytedance.im.core.internal.a.c.a aVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i3 == i2 - 1 || i4 == list.size() - 1) {
                sb.append("'").append(list.get(i4)).append("')");
                try {
                    aVar = com.bytedance.im.core.internal.a.a.b.a(sb.toString(), (String[]) null);
                    a(aVar, hashMap);
                } catch (Exception e2) {
                    f.b("imsdk", "IMConversationCoreDao getCoreInfoMap ", e2);
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
        return hashMap;
    }

    private static void a(com.bytedance.im.core.internal.a.c.a aVar, Map<String, i> map) {
        if (aVar != null) {
            int a2 = aVar.a(a.COLUMN_ID.key);
            int a3 = aVar.a(a.COLUMN_VERSION.key);
            int a4 = aVar.a(a.COLUMN_NAME.key);
            int a5 = aVar.a(a.COLUMN_ICON.key);
            int a6 = aVar.a(a.COLUMN_DESC.key);
            int a7 = aVar.a(a.COLUMN_NOTICE.key);
            int a8 = aVar.a(a.COLUMN_OWNER_ID.key);
            int a9 = aVar.a(a.COLUMN_SEC_OWNER.key);
            int a10 = aVar.a(a.COLUMN_SILENT.key);
            int a11 = aVar.a(a.COLUMN_SILENT_NORMAL_ONLY.key);
            int a12 = aVar.a(a.COLUMN_MODE.key);
            int a13 = aVar.a(a.COLUMN_EXT.key);
            while (aVar.d()) {
                i iVar = new i();
                String c2 = aVar.c(a2);
                iVar.setConversationId(c2);
                iVar.setVersion(aVar.b(a3));
                iVar.setName(aVar.c(a4));
                iVar.setIcon(aVar.c(a5));
                iVar.setDesc(aVar.c(a6));
                iVar.setNotice(aVar.c(a7));
                iVar.setOwner(aVar.b(a8));
                iVar.setSecOwner(aVar.c(a9));
                iVar.setSilent(aVar.a(a10));
                iVar.setSilentNormalOnly(aVar.a(a11));
                iVar.setMode(aVar.a(a12));
                iVar.setExtStr(aVar.c(a13));
                map.put(c2, iVar);
            }
        }
    }
}
