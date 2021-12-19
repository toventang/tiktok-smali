package com.bytedance.im.core.h;

import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.d.i;
import com.bytedance.im.core.internal.a.b;
import com.bytedance.im.core.internal.e.c;
import java.util.ArrayList;
import java.util.List;

public final class a {
    static {
        Covode.recordClassIndex(22825);
    }

    private a() {
    }

    /* renamed from: com.bytedance.im.core.h.a$a  reason: collision with other inner class name */
    public static class C0921a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38111a = new a((byte) 0);

        static {
            Covode.recordClassIndex(22827);
        }
    }

    private static String a() {
        if (!d.a().b().aN) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE VIRTUAL TABLE IF NOT EXISTS fts_group_index_table USING fts4(");
        if (d.a().b().f37599g) {
            sb.append("tokenize=mmicu,");
        }
        sb.append("fts_name);");
        return sb.toString();
    }

    private static List<String> b() {
        if (!d.a().b().aN) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER conversation_bu BEFORE UPDATE ON conversation_core BEGIN\n  DELETE FROM fts_group_index_table WHERE rowid=old.").append(b.a.COLUMN_ID.key).append(";\nEND;");
        arrayList.add(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CREATE TRIGGER conversation_bd BEFORE DELETE ON conversation_core BEGIN\n  DELETE FROM fts_group_index_table WHERE rowid=old.").append(b.a.COLUMN_ID.key).append(";\nEND;");
        arrayList.add(sb2.toString());
        return arrayList;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public static void a(com.bytedance.im.core.internal.a.c.b bVar) {
        if (d.a().b().aN) {
            bVar.a(a());
            for (String str : b()) {
                bVar.a(str);
            }
        }
    }

    public final void a(com.bytedance.im.core.internal.a.c.b bVar, int i2) {
        if (d.a().b().aN && i2 < 33) {
            bVar.a(a());
            for (String str : b()) {
                bVar.a(str);
            }
            com.bytedance.im.core.internal.e.d.a(new c<Boolean>() {
                /* class com.bytedance.im.core.h.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(22826);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Boolean a() {
                    System.currentTimeMillis();
                    List<i> a2 = b.a(com.bytedance.im.core.internal.a.a.b.a("SELECT * FROM conversation_core", (String[]) null));
                    if (d.a().b().aN) {
                        d.b();
                    }
                    a2.size();
                    if (d.a().f37562b.b() != null) {
                        d.a().f37562b.b();
                    }
                    return true;
                }
            }, (com.bytedance.im.core.internal.e.b) null);
        }
    }
}
