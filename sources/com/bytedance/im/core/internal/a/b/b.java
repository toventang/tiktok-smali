package com.bytedance.im.core.internal.a.b;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static boolean f38196a;

    static {
        Covode.recordClassIndex(22872);
    }

    public static boolean a() {
        if (f38196a) {
            return false;
        }
        d.a();
        return false;
    }

    private static String b() {
        StringBuilder sb = new StringBuilder();
        sb.append("create virtual table if not exists fts_entity using fts4 (");
        a[] values = a.values();
        for (a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        sb.append(" notindexed=").append(a.COLUMN_EXTRA.key).append(",");
        String sb2 = sb.toString();
        return sb2.substring(0, sb2.length() - 1) + ");";
    }

    public enum a {
        COLUMN_ID("combined_key", "TEXT NOT NULL"),
        COLUMN_TYPE(StringSet.type, "INTEGER"),
        COLUMN_CONVERSATION_ID("conversation_id", "TEXT"),
        COLUMN_MESSAGE_UUID("message_uuid", "TEXT"),
        COLUMN_USER_ID("user_id", "TEXT"),
        COLUMN_ENTITY_ID("entity_id", "TEXT"),
        COLUMN_SEARCH_CONTENT("search_content", "TEXT"),
        COLUMN_EXTRA("extra", "TEXT");
        
        public String key;
        public String type;

        static {
            Covode.recordClassIndex(22873);
        }

        private a(String str, String str2) {
            this.key = str;
            this.type = str2;
        }
    }

    public static void a(com.bytedance.im.core.internal.a.c.b bVar) {
        if (!d.a().b().aN) {
            f38196a = true;
            return;
        }
        try {
            d.a();
            bVar.a(b());
        } catch (Exception e2) {
            f.b("IMFTSEntityDao", "createTable failed", e2);
            f38196a = true;
        }
    }

    private static ContentValues a(com.bytedance.im.core.d.b.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(a.COLUMN_ID.key, aVar.a());
        contentValues.put(a.COLUMN_TYPE.key, Integer.valueOf(aVar.f37867b));
        contentValues.put(a.COLUMN_CONVERSATION_ID.key, aVar.f37868c);
        contentValues.put(a.COLUMN_MESSAGE_UUID.key, aVar.f37869d);
        contentValues.put(a.COLUMN_USER_ID.key, aVar.f37870e);
        contentValues.put(a.COLUMN_ENTITY_ID.key, aVar.f37871f);
        contentValues.put(a.COLUMN_SEARCH_CONTENT.key, aVar.f37872g);
        contentValues.put(a.COLUMN_EXTRA.key, aVar.f37873h);
        return contentValues;
    }

    public static boolean a(List<com.bytedance.im.core.d.b.a> list) {
        if (f38196a) {
            return false;
        }
        f.b("imsdk", new StringBuilder("IMFTSEntityDao addFTSEntity, entityList:").append(list == null ? null : Integer.valueOf(list.size())).toString(), (Throwable) null);
        if (list == null || list.isEmpty()) {
            return true;
        }
        int i2 = 0;
        for (com.bytedance.im.core.d.b.a aVar : list) {
            if (com.bytedance.im.core.internal.a.a.b.a("fts_entity", a(aVar)) >= 0) {
                i2++;
            }
        }
        if (i2 == list.size()) {
            return true;
        }
        return false;
    }

    public static boolean b(List<com.bytedance.im.core.d.b.a> list) {
        if (f38196a) {
            return false;
        }
        f.b("imsdk", new StringBuilder("IMFTSEntityDao deleteFTSEntity, list:").append(list == null ? null : Integer.valueOf(list.size())).toString(), (Throwable) null);
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (com.bytedance.im.core.d.b.a aVar : list) {
                if (aVar != null && !TextUtils.isEmpty(aVar.a())) {
                    sb.append(",\"").append(aVar.a()).append('\"');
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return com.bytedance.im.core.internal.a.a.b.b("delete from fts_entity where " + a.COLUMN_ID.key + " in " + ("(" + sb2.substring(1) + ")"));
            }
        }
        return true;
    }

    public static boolean a(List<String> list, String str) {
        if (f38196a) {
            return false;
        }
        f.b("imsdk", new StringBuilder("IMFTSEntityDao deleteFTSEntityById, list:").append(list == null ? null : Integer.valueOf(list.size())).append(", columnKey:").append(str).toString(), (Throwable) null);
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(",\"").append(str2).append('\"');
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return com.bytedance.im.core.internal.a.a.b.b("delete from fts_entity where " + str + " in " + ("(" + sb2.substring(1) + ")"));
            }
        }
        return true;
    }

    public static boolean a(List<String> list, String str, int i2) {
        if (f38196a) {
            return false;
        }
        f.b("imsdk", new StringBuilder("IMFTSEntityDao deleteFTSEntityByIdAndType, list:").append(list == null ? null : Integer.valueOf(list.size())).append(", columnKey:").append(str).append(", type:").append(i2).toString(), (Throwable) null);
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(",\"").append(str2).append('\"');
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return com.bytedance.im.core.internal.a.a.b.b("delete from fts_entity where " + str + " in " + ("(" + sb2.substring(1) + ")") + " and " + a.COLUMN_TYPE.key + " =" + i2);
            }
        }
        return true;
    }
}
