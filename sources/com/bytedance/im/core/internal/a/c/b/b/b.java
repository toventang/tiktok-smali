package com.bytedance.im.core.internal.a.c.b.b;

import android.content.ContentValues;
import com.bytedance.covode.number.Covode;
import com.bytedance.im.core.internal.a.c.a;
import com.bytedance.im.core.internal.a.c.c;
import com.bytedance.im.core.internal.utils.j;
import com.tencent.wcdb.database.SQLiteDatabase;

public final class b implements com.bytedance.im.core.internal.a.c.b {

    /* renamed from: a  reason: collision with root package name */
    public SQLiteDatabase f38212a = null;

    static {
        Covode.recordClassIndex(22889);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void b() {
        this.f38212a.b(true);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void d() {
        this.f38212a.g();
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void e() {
        this.f38212a.b(false);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void c() {
        this.f38212a.h();
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final boolean a() {
        return this.f38212a.i();
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final c b(String str) {
        return new c(this.f38212a.a(str));
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final void a(String str) {
        j.c("imsdkdb".concat(String.valueOf(str)));
        this.f38212a.b(str);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final long c(String str, ContentValues contentValues) {
        return this.f38212a.b(str, (String) null, contentValues);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final long b(String str, ContentValues contentValues) {
        return this.f38212a.a(str, (String) null, contentValues, 5);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final long a(String str, ContentValues contentValues) {
        return this.f38212a.a(str, (String) null, contentValues);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final a a(String str, String[] strArr) {
        j.c("imsdkdb".concat(String.valueOf(str)));
        return new a(this.f38212a.a(str, strArr));
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final int a(String str, String str2, String[] strArr) {
        return this.f38212a.a(str, str2, strArr);
    }

    @Override // com.bytedance.im.core.internal.a.c.b
    public final int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        return this.f38212a.a(str, contentValues, str2, strArr);
    }
}
