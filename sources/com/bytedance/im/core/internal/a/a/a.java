package com.bytedance.im.core.internal.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.e;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.c.i;
import com.bytedance.im.core.g.b;
import com.bytedance.im.core.internal.a.c;
import com.bytedance.im.core.internal.a.c.a.c;
import com.bytedance.im.core.internal.a.e;
import com.bytedance.im.core.internal.a.g;
import com.bytedance.im.core.internal.a.h;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.a.j;
import com.bytedance.im.core.internal.a.k;
import com.bytedance.im.core.internal.utils.s;
import java.io.File;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f38186a;

    /* renamed from: b  reason: collision with root package name */
    private String f38187b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.im.core.internal.a.c.a.a f38188c;

    static {
        Covode.recordClassIndex(22866);
    }

    private a() {
    }

    public final void a(int i2, int i3) {
        f.b("imsdk", "IMDBHelper onDowngrade, oldVersion:" + i2 + ",newVersion:" + i3 + ", mDBName:" + this.f38187b, (Throwable) null);
        if (!b.f38101b) {
            new i().a("im_sdk_db_downgrade").a("old_version", Integer.valueOf(i2)).a("new_version", Integer.valueOf(i3)).b();
        }
        b.f38101b = true;
        d.a().a(true);
    }

    public final com.bytedance.im.core.internal.a.c.b c() {
        com.bytedance.im.core.internal.a.c.a.a e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.a();
    }

    public static a a() {
        MethodCollector.i(10941);
        if (f38186a == null) {
            synchronized (a.class) {
                try {
                    if (f38186a == null) {
                        f38186a = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10941);
                    throw th;
                }
            }
        }
        a aVar = f38186a;
        MethodCollector.o(10941);
        return aVar;
    }

    public final long b() {
        try {
            File databasePath = d.a().f37561a.getDatabasePath(this.f38187b);
            if (databasePath == null || !databasePath.exists() || !databasePath.isFile()) {
                return 0;
            }
            return databasePath.length() / 1024;
        } catch (Exception e2) {
            f.b("imsdk", "IMDBHelper getDBSize", e2);
            e.a(e2);
            return 0;
        }
    }

    public final void d() {
        f.b("imsdk", "IMDBHelper deleteDatabase start", (Throwable) null);
        com.bytedance.im.core.internal.a.c.a.a aVar = this.f38188c;
        if (aVar != null) {
            aVar.close();
        }
        d.a().f37561a.deleteDatabase(this.f38187b);
        d.a().f37561a.deleteDatabase("encrypted_" + this.f38187b);
        this.f38188c = null;
        f.b("imsdk", "IMDBHelper deleteDatabase end", (Throwable) null);
    }

    private synchronized com.bytedance.im.core.internal.a.c.a.a e() {
        String str;
        MethodCollector.i(10944);
        long a2 = d.a().f37562b.a();
        if (a2 <= 0) {
            f.b("imsdk", "IMDBHelper getDBName, uid invalid: ".concat(String.valueOf(a2)), (Throwable) null);
            str = null;
        } else {
            str = a2 + "_im.db";
            if (!d.a().f37562b.g()) {
                str = "sub_".concat(String.valueOf(str));
            }
        }
        if (TextUtils.isEmpty(str)) {
            f.b("imsdk", "IMDBHelper getOpenHelper, db name invalid", (Throwable) null);
            MethodCollector.o(10944);
            return null;
        }
        try {
            if (this.f38188c == null) {
                f.b("imsdk", "IMDBHelper getOpenHelper, create new:".concat(String.valueOf(str)), (Throwable) null);
                com.bytedance.im.core.internal.a.c.a.a a3 = a(str);
                this.f38188c = a3;
                MethodCollector.o(10944);
                return a3;
            } else if (str.equals(this.f38187b)) {
                com.bytedance.im.core.internal.a.c.a.a aVar = this.f38188c;
                MethodCollector.o(10944);
                return aVar;
            } else {
                f.b("imsdk", "IMDBHelper getOpenHelper, close previous:" + this.f38187b + ", create new:" + str, (Throwable) null);
                this.f38188c.close();
                this.f38188c = a(str);
                com.bytedance.im.core.internal.a.c.a.a aVar2 = this.f38188c;
                MethodCollector.o(10944);
                return aVar2;
            }
        } catch (Exception e2) {
            f.b("imsdk", "IMDBHelper getOpenHelper", e2);
        }
    }

    public static String a(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = i2 - 1;
            if (i3 > i4) {
                return sb.toString();
            }
            sb.append("?");
            if (i3 != i4) {
                sb.append(",");
            }
            i3++;
        }
    }

    private com.bytedance.im.core.internal.a.c.a.a a(String str) {
        f.b("imsdk", "IMDBHelper createOpenHelper, dbName:".concat(String.valueOf(str)), (Throwable) null);
        d.a().f37562b.l();
        this.f38187b = str;
        Context context = d.a().f37561a;
        if (!d.a().b().f37599g) {
            return new c(context, this.f38187b);
        }
        String str2 = d.a().b().B;
        if (TextUtils.isEmpty(str2)) {
            return new com.bytedance.im.core.internal.a.c.a.d(context, this.f38187b);
        }
        return new com.bytedance.im.core.internal.a.c.a.d(context, this.f38187b, str2.getBytes());
    }

    public static void a(com.bytedance.im.core.internal.a.c.a aVar) {
        if (aVar != null) {
            try {
                aVar.a();
            } catch (Exception e2) {
                f.b("imsdk", "close cursor", e2);
                e.a(e2);
            }
        }
    }

    private static void b(com.bytedance.im.core.internal.a.c.b bVar) {
        int i2 = 0;
        String[] strArr = {"CREATE INDEX UID_INDEX ON msg(" + i.a.COLUMN_SERVER_ID.key + ")", "CREATE INDEX MSG_UUID_INDEX ON msg(" + i.a.COLUMN_MSG_ID.key + ")", "CREATE INDEX CONVERSATION_INDEX ON msg(" + i.a.COLUMN_CONVERSATION_ID.key + "," + i.a.COLUMN_INNER_INDEX.key + ")"};
        int i3 = 0;
        do {
            bVar.a(strArr[i3]);
            i3++;
        } while (i3 < 3);
        String[] strArr2 = {"create index MEMBER_CONVERSATION_INDEX on participant(" + e.a.COLUMN_CONVERSATION_ID.key + ")", "create index USER_ID_INDEX on participant(" + e.a.COLUMN_USER_ID.key + ")"};
        int i4 = 0;
        do {
            bVar.a(strArr2[i4]);
            i4++;
        } while (i4 < 2);
        bVar.a(com.bytedance.im.core.internal.a.d.b());
        String[] b2 = j.b();
        do {
            bVar.a(b2[i2]);
            i2++;
        } while (i2 < 2);
        bVar.a(com.bytedance.im.core.internal.a.a.c());
    }

    public static void a(com.bytedance.im.core.internal.a.c.b bVar) {
        f.b("imsdk", "IMDBHelper onCreate", (Throwable) null);
        StringBuilder sb = new StringBuilder();
        sb.append("create table if not exists conversation_list (");
        c.a[] values = c.a.values();
        for (c.a aVar : values) {
            sb.append(aVar.key).append(" ").append(aVar.type).append(",");
        }
        String sb2 = sb.toString();
        s.a();
        s.h();
        bVar.a(sb2.substring(0, sb2.length() - 1) + ");");
        bVar.a(com.bytedance.im.core.internal.a.i.c());
        bVar.a(com.bytedance.im.core.internal.a.a.b());
        bVar.a(com.bytedance.im.core.internal.a.e.a());
        bVar.a(com.bytedance.im.core.internal.a.b.a());
        bVar.a(g.a());
        com.bytedance.im.core.internal.a.b.b.a(bVar);
        bVar.a(h.a());
        bVar.a(com.bytedance.im.core.internal.a.f.a());
        bVar.a(k.a());
        bVar.a(com.bytedance.im.core.internal.a.d.a());
        bVar.a(j.a());
        b(bVar);
        com.bytedance.im.core.h.a.a(bVar);
        com.bytedance.im.core.h.b.a(bVar);
    }

    public static void a(com.bytedance.im.core.internal.a.c.c cVar) {
        if (cVar != null) {
            try {
                cVar.c();
            } catch (Exception e2) {
                f.b("imsdk", "close sqLiteStatement", e2);
                com.bytedance.im.core.c.e.a(e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0063 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0098 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a1 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00aa A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b3 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c5 A[Catch:{ Exception -> 0x02ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x02ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.bytedance.im.core.internal.a.c.b r9, int r10, int r11) {
        /*
        // Method dump skipped, instructions count: 801
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.internal.a.a.a.a(com.bytedance.im.core.internal.a.c.b, int, int):void");
    }
}
