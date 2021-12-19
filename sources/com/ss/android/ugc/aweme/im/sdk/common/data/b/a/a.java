package com.ss.android.ugc.aweme.im.sdk.common.data.b.a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.im.sdk.common.data.b.c.c;
import com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b;
import java.util.HashMap;

public final class a extends SQLiteOpenHelper {

    /* renamed from: a  reason: collision with root package name */
    private Context f102479a;

    /* renamed from: b  reason: collision with root package name */
    private String f102480b;

    /* renamed from: c  reason: collision with root package name */
    private int f102481c;

    static {
        Covode.recordClassIndex(65619);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        MethodCollector.i(4310);
        sQLiteDatabase.execSQL(c.b());
        sQLiteDatabase.execSQL(com.ss.android.ugc.aweme.im.sdk.common.data.b.c.a.b());
        MethodCollector.o(4310);
    }

    public a(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 23);
        this.f102479a = context;
        this.f102480b = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r3.isClosed() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        if (r3.isClosed() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r3.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(android.database.sqlite.SQLiteDatabase r5, java.lang.String r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.a.a.a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String):boolean");
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        this.f102481c++;
        if (this.f102479a == null || TextUtils.isEmpty(this.f102480b)) {
            a(i2, i3, 0);
            super.onDowngrade(sQLiteDatabase, i2, i3);
            return;
        }
        try {
            this.f102479a.deleteDatabase(this.f102480b);
            a(sQLiteDatabase);
            if (this.f102481c <= 1) {
                b.a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_FULL, true);
            }
            a(i2, i3, 1);
        } catch (Exception e2) {
            a(i2, i3, 0);
            throw new SQLiteException("Can't downgrade database from version " + i2 + " to " + i3 + " and recover failed", e2);
        }
    }

    private void a(int i2, int i3, int i4) {
        com.ss.android.ugc.aweme.im.service.m.a.c("DBHelper", "onDowngrade: " + this.f102480b + ", [" + i2 + "->" + i3 + "], " + this.f102481c + ", " + i4);
        HashMap hashMap = new HashMap();
        hashMap.put("error_stack", "[" + i2 + "," + i3 + "]");
        hashMap.put("count", Integer.valueOf(this.f102481c));
        hashMap.put("status", Integer.valueOf(i4));
        com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a("im_db_downgrade_error", hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x03d6, code lost:
        if (r8 <= 10) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 986
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.common.data.b.a.a.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
