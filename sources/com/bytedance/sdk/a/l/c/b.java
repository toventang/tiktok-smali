package com.bytedance.sdk.a.l.c;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.ss.android.account.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f43414a;

    /* renamed from: b  reason: collision with root package name */
    private a f43415b;

    static {
        Covode.recordClassIndex(26600);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f43416a = new b((byte) 0);

        static {
            Covode.recordClassIndex(26601);
        }
    }

    private b() {
        this.f43415b = new a(f.a().b());
        this.f43414a = null;
    }

    public final boolean a() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f43414a;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                return true;
            }
            a aVar = this.f43415b;
            if (aVar == null) {
                return false;
            }
            this.f43414a = aVar.getWritableDatabase();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.bytedance.sdk.a.l.d.c> a(int r26, java.lang.Object r27) {
        /*
        // Method dump skipped, instructions count: 221
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.a.l.c.b.a(int, java.lang.Object):java.util.List");
    }
}
