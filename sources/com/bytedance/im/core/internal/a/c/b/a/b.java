package com.bytedance.im.core.internal.a.c.b.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.internal.a.c.a;
import com.bytedance.im.core.internal.a.c.c;

public final class b implements com.bytedance.im.core.internal.a.c.b {

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f38209a = null;

    static {
        Covode.recordClassIndex(22886);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final boolean a() {
        return this.f38209a.inTransaction();
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void c() {
        this.f38209a.setTransactionSuccessful();
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void b() {
        MethodCollector.i(9812);
        this.f38209a.beginTransaction();
        MethodCollector.o(9812);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void d() {
        MethodCollector.i(9978);
        this.f38209a.endTransaction();
        MethodCollector.o(9978);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void e() {
        MethodCollector.i(11086);
        this.f38209a.beginTransactionNonExclusive();
        MethodCollector.o(11086);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final c b(String str) {
        MethodCollector.i(10927);
        c cVar = new c(this.f38209a.compileStatement(str));
        MethodCollector.o(10927);
        return cVar;
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void a(String str) {
        MethodCollector.i(10135);
        this.f38209a.execSQL(str);
        MethodCollector.o(10135);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final long c(String str, ContentValues contentValues) {
        MethodCollector.i(11088);
        long replace = this.f38209a.replace(str, null, contentValues);
        MethodCollector.o(11088);
        return replace;
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final long b(String str, ContentValues contentValues) {
        MethodCollector.i(10765);
        long insertWithOnConflict = this.f38209a.insertWithOnConflict(str, null, contentValues, 5);
        MethodCollector.o(10765);
        return insertWithOnConflict;
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final long a(String str, ContentValues contentValues) {
        MethodCollector.i(10612);
        long insert = this.f38209a.insert(str, null, contentValues);
        MethodCollector.o(10612);
        return insert;
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final a a(String str, String[] strArr) {
        MethodCollector.i(11085);
        a aVar = new a(this.f38209a.rawQuery(str, strArr));
        MethodCollector.o(11085);
        return aVar;
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final int a(String str, String str2, String[] strArr) {
        MethodCollector.i(10302);
        int delete = this.f38209a.delete(str, str2, strArr);
        MethodCollector.o(10302);
        return delete;
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        MethodCollector.i(10452);
        int update = this.f38209a.update(str, contentValues, str2, strArr);
        MethodCollector.o(10452);
        return update;
    }
}
