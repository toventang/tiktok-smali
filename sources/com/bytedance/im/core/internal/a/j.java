package com.bytedance.im.core.internal.a;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.a.a.b;
import java.util.ArrayList;
import java.util.List;

public final class j {
    static {
        Covode.recordClassIndex(22907);
    }

    public enum a {
        COLUMN_MSG_ID("uuid", "TEXT"),
        COLUMN_KEY("key", "TEXT"),
        COLUMN_VALUE("value", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22908);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static String[] b() {
        return new String[]{"create index msg_ky_id_index on message_kv(" + a.COLUMN_MSG_ID.key + ")", "create index msg_ky_key_index on message_kv(" + a.COLUMN_KEY.key + ")"};
    }

    public static String a() {
        StringBuilder sb = new StringBuilder("create table if not exists message_kv(");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        sb.append("primary key(").append(a.COLUMN_MSG_ID.key).append(",").append(a.COLUMN_KEY.key).append("));");
        return sb.toString();
    }

    public static List<Pair<String, String>> a(String str) {
        com.bytedance.im.core.internal.a.c.a aVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            aVar = b.a("select * from message_kv where " + a.COLUMN_KEY.key + "=?", new String[]{str});
            while (aVar.d()) {
                arrayList.add(new Pair(aVar.c(aVar.a(a.COLUMN_MSG_ID.key)), aVar.c(aVar.a(a.COLUMN_VALUE.key))));
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgKvDaoget", e2);
            e2.printStackTrace();
            e.a(e2);
        } catch (Throwable th) {
            com.bytedance.im.core.internal.a.a.a.a((com.bytedance.im.core.internal.a.c.a) null);
            throw th;
        }
        com.bytedance.im.core.internal.a.a.a.a(aVar);
        return arrayList;
    }

    public static String a(String str, String str2) {
        Throwable th;
        com.bytedance.im.core.internal.a.c.a aVar;
        Exception e2;
        com.bytedance.im.core.internal.a.c.a aVar2 = null;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            aVar = b.a("select value from message_kv where " + a.COLUMN_MSG_ID.key + "=? AND " + a.COLUMN_KEY.key + "=?", new String[]{str, str2});
            try {
                if (aVar.c()) {
                    String c2 = aVar.c(aVar.a(a.COLUMN_VALUE.key));
                    com.bytedance.im.core.internal.a.a.a.a(aVar);
                    return c2;
                }
            } catch (Exception e3) {
                e2 = e3;
                try {
                    f.b("imsdk", "IMMsgKvDaoget", e2);
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
            f.b("imsdk", "IMMsgKvDaoget", e2);
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

    private static boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            f.b("IMMsgKvDao", "delete invalid:" + str + ", " + str2, (Throwable) null);
            return false;
        }
        try {
            boolean b2 = b.b("delete from message_kv where " + a.COLUMN_MSG_ID.key + "=\"" + str + "\" AND " + a.COLUMN_KEY.key + "=\"" + str2 + "\"");
            if (!b2) {
                f.b("imsdk", "IMMsgKvDaodelete failed:" + str + ", " + str2, (Throwable) null);
            }
            return b2;
        } catch (Exception e2) {
            f.b("imsdk", "IMMsgKvDao", (Throwable) null);
            e2.printStackTrace();
            e.a(e2);
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            return b(str, str2);
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            f.b("imsdk", "IMMsgKvDaoinsertOrUpdate params invalid, cid:" + str + ", key:" + str2, (Throwable) null);
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_MSG_ID.key, str);
        contentValues.put(a.COLUMN_KEY.key, str2);
        contentValues.put(a.COLUMN_VALUE.key, str3);
        long c2 = b.c("message_kv", contentValues);
        if (c2 < 0) {
            f.b("imsdk", "IMMsgKvDaoinsertOrUpdate failed, cid:" + str + ", key:" + str2 + ", value:" + str3 + ", result:" + c2, (Throwable) null);
        }
        if (c2 > 0) {
            return true;
        }
        return false;
    }
}
