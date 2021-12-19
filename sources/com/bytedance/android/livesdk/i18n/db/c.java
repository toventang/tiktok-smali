package com.bytedance.android.livesdk.i18n.db;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.b.a;
import androidx.room.j;
import androidx.room.m;
import com.bytedance.covode.number.Covode;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final j f18236a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.c f18237b;

    static {
        Covode.recordClassIndex(10128);
    }

    public c(j jVar) {
        this.f18236a = jVar;
        this.f18237b = new androidx.room.c<a>(jVar) {
            /* class com.bytedance.android.livesdk.i18n.db.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(10129);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR REPLACE INTO `information`(`key`,`value`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* bridge */ /* synthetic */ void a(f fVar, a aVar) {
                a aVar2 = aVar;
                if (aVar2.f18234a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, aVar2.f18234a);
                }
                if (aVar2.f18235b == null) {
                    fVar.a(2);
                } else {
                    fVar.a(2, aVar2.f18235b);
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdk.i18n.db.b
    public final void a(a aVar) {
        this.f18236a.d();
        this.f18236a.e();
        try {
            this.f18237b.a(aVar);
            this.f18236a.g();
        } finally {
            this.f18236a.f();
        }
    }

    @Override // com.bytedance.android.livesdk.i18n.db.b
    public final a a(String str) {
        a aVar;
        m a2 = m.a("SELECT * FROM information WHERE `key` = ?", 1);
        a2.a(1, str);
        this.f18236a.d();
        Cursor a3 = this.f18236a.a(a2);
        try {
            int a4 = a.a(a3, "key");
            int a5 = a.a(a3, "value");
            if (a3.moveToFirst()) {
                aVar = new a();
                aVar.f18234a = a3.getString(a4);
                aVar.f18235b = a3.getString(a5);
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
