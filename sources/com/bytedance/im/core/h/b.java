package com.bytedance.im.core.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.internal.a.i;
import java.util.ArrayList;
import java.util.List;

public final class b {
    static {
        Covode.recordClassIndex(22828);
    }

    public static void a() {
        if (d.a().b().aN) {
            d.a();
        }
    }

    private static List<String> c() {
        if (!d.a().b().aN) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("DROP TRIGGER IF EXISTS msg_ad;");
        arrayList.add("DROP TRIGGER IF EXISTS msg_au;");
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER msg_ad AFTER DELETE ON msg BEGIN\n  DELETE FROM fts_msg_index_table WHERE rowid=old.").append("rowid;\nEND;");
        arrayList.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TRIGGER msg_au AFTER UPDATE ON msg\nFOR EACH ROW WHEN (new.").append(i.a.COLUMN_DELETED.key).append("=1 OR new.").append(i.a.COLUMN_NET_STATUS.key).append("=1)\nBEGIN\n  DELETE FROM fts_msg_index_table where rowid=new.rowid;\nEND;");
        arrayList.add(sb2.toString());
        return arrayList;
    }

    private static String b() {
        if (!d.a().b().aN) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE VIRTUAL TABLE IF NOT EXISTS fts_msg_index_table USING fts4(");
        if (d.a().b().f37599g) {
            sb.append("tokenize=mmicu,");
        }
        sb.append(i.a.COLUMN_CONVERSATION_ID.key).append(",");
        sb.append(i.a.COLUMN_CREATE_TIME.key).append(",");
        sb.append("fts_search_content,");
        sb.append(i.a.COLUMN_MSG_ID.key).append(",");
        sb.append("notindexed=").append(i.a.COLUMN_CONVERSATION_ID.key).append(",");
        sb.append("notindexed=").append(i.a.COLUMN_MSG_ID.key).append(",");
        sb.append("notindexed=").append(i.a.COLUMN_CREATE_TIME.key).append(");");
        return sb.toString();
    }

    public static void a(com.bytedance.im.core.internal.a.c.b bVar) {
        if (d.a().b().aN) {
            bVar.a(b());
            for (String str : c()) {
                bVar.a(str);
            }
        }
    }

    public static void a(com.bytedance.im.core.internal.a.c.b bVar, int i2) {
        if (d.a().b().aN && i2 < 38) {
            bVar.a(b());
            for (String str : c()) {
                bVar.a(str);
            }
        }
    }
}
