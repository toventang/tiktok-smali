package com.bytedance.im.core.internal.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.d.l;
import com.bytedance.im.core.internal.a.a.b;
import com.bytedance.im.core.internal.a.c.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class g {
    static {
        Covode.recordClassIndex(22898);
    }

    public enum a {
        COLUMN_ID("conversation_id", "TEXT PRIMARY KEY"),
        COLUMN_VERSION("info_version", "BIGINT"),
        COLUMN_STICK_TOP("stick_top", "INTEGER"),
        COLUMN_MUTE("mute", "INTEGER"),
        COLUMN_EXT("ext", "TEXT"),
        COLUMN_FAVORITE("favor", "INTEGER");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22899);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static String a() {
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_setting (");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public static l a(String str) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        l lVar = null;
        lVar = null;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            aVar = b.a("select * from conversation_setting where " + a.COLUMN_ID.key + "=?", new String[]{str});
            try {
                if (aVar.c()) {
                    l lVar2 = new l();
                    lVar2.setConversationId(aVar.c(aVar.a(a.COLUMN_ID.key)));
                    lVar2.setVersion(aVar.b(aVar.a(a.COLUMN_VERSION.key)));
                    lVar2.setStickTop(aVar.a(aVar.a(a.COLUMN_STICK_TOP.key)));
                    lVar2.setMute(aVar.a(aVar.a(a.COLUMN_MUTE.key)));
                    lVar2.setExtStr(aVar.c(aVar.a(a.COLUMN_EXT.key)));
                    lVar2.setFavor(aVar.a(aVar.a(a.COLUMN_FAVORITE.key)));
                    lVar = lVar2;
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMConversationSettingDao get ", e2);
                    e2.printStackTrace();
                    e.a(e2);
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return lVar;
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
            f.b("imsdk", "IMConversationSettingDao get ", e2);
            e2.printStackTrace();
            e.a(e2);
            com.bytedance.im.core.internal.a.a.a.a(aVar);
            return lVar;
        } catch (Throwable th3) {
            th = th3;
            com.bytedance.im.core.internal.a.a.a.a(aVar2);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return lVar;
    }

    public static Map<String, l> a(List<String> list) {
        if (list.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        int i2 = d.a().b().ab.batchQueryEnableAndQueryLimit;
        String str = "select * from conversation_setting where " + a.COLUMN_ID.key + " in (";
        StringBuilder sb = new StringBuilder(str);
        com.bytedance.im.core.internal.a.c.a aVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (i3 == i2 - 1 || i4 == list.size() - 1) {
                sb.append("'").append(list.get(i4)).append("')");
                try {
                    aVar = b.a(sb.toString(), (String[]) null);
                    a(aVar, hashMap);
                } catch (Exception e2) {
                    f.b("imsdk", "IMConversationSettingDao getSettingInfoMap ", e2);
                    e2.printStackTrace();
                    e.a(e2);
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

    public static boolean a(l lVar) {
        boolean z = false;
        if (lVar == null || TextUtils.isEmpty(lVar.getConversationId())) {
            return false;
        }
        Boolean bool = false;
        c cVar = null;
        try {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb.append(" replace into conversation_setting(");
            for (a aVar : a.values()) {
                sb.append(aVar.key).append(",");
                sb2.append("?,");
            }
            String sb3 = sb.toString();
            String sb4 = sb2.toString();
            cVar = b.c(sb3.substring(0, sb3.length() - 1) + ") values (" + sb4.substring(0, sb4.length() - 1) + ");");
            if (cVar != null) {
                cVar.d();
                cVar.a(a.COLUMN_ID.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(lVar.getConversationId()));
                cVar.a(a.COLUMN_VERSION.ordinal() + 1, lVar.getVersion());
                cVar.a(a.COLUMN_STICK_TOP.ordinal() + 1, (long) lVar.getStickTop());
                cVar.a(a.COLUMN_MUTE.ordinal() + 1, (long) lVar.getMute());
                cVar.a(a.COLUMN_EXT.ordinal() + 1, com.bytedance.im.core.internal.utils.e.b(lVar.getExtStr()));
                cVar.a(a.COLUMN_FAVORITE.ordinal() + 1, (long) lVar.getFavor());
            }
            if (cVar.a() > 0) {
                z = true;
            }
            bool = Boolean.valueOf(z);
        } catch (Exception e2) {
            f.b("imsdk", "IMConversationSettingDao insertOrUpdate", e2);
            e2.printStackTrace();
            e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((c) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(cVar);
        return bool.booleanValue();
    }

    private static void a(com.bytedance.im.core.internal.a.c.a aVar, Map<String, l> map) {
        if (aVar != null) {
            int a2 = aVar.a(a.COLUMN_ID.key);
            int a3 = aVar.a(a.COLUMN_VERSION.key);
            int a4 = aVar.a(a.COLUMN_STICK_TOP.key);
            int a5 = aVar.a(a.COLUMN_MUTE.key);
            int a6 = aVar.a(a.COLUMN_EXT.key);
            int a7 = aVar.a(a.COLUMN_FAVORITE.key);
            while (aVar.d()) {
                l lVar = new l();
                String c2 = aVar.c(a2);
                lVar.setConversationId(c2);
                lVar.setVersion(aVar.b(a3));
                lVar.setStickTop(aVar.a(a4));
                lVar.setMute(aVar.a(a5));
                lVar.setExtStr(aVar.c(a6));
                lVar.setFavor(aVar.a(a7));
                map.put(c2, lVar);
            }
        }
    }
}
