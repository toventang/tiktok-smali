package com.bytedance.android.livesdk.i18n.db;

import android.database.Cursor;
import androidx.room.b.a;
import androidx.room.c;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final j f18241a;

    /* renamed from: b  reason: collision with root package name */
    private final c f18242b;

    /* renamed from: c  reason: collision with root package name */
    private final n f18243c;

    static {
        Covode.recordClassIndex(10132);
    }

    @Override // com.bytedance.android.livesdk.i18n.db.e
    public final void b() {
        this.f18241a.d();
        androidx.i.a.f b2 = this.f18243c.b();
        this.f18241a.e();
        try {
            b2.a();
            this.f18241a.g();
        } finally {
            this.f18241a.f();
            this.f18243c.a(b2);
        }
    }

    @Override // com.bytedance.android.livesdk.i18n.db.e
    public final List<d> a() {
        m a2 = m.a("SELECT * FROM translation", 0);
        this.f18241a.d();
        Cursor a3 = this.f18241a.a(a2);
        try {
            int a4 = a.a(a3, "key");
            int a5 = a.a(a3, "value");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                d dVar = new d();
                dVar.f18239a = a3.getString(a4);
                dVar.f18240b = a3.getString(a5);
                arrayList.add(dVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public f(j jVar) {
        this.f18241a = jVar;
        this.f18242b = new c<d>(jVar) {
            /* class com.bytedance.android.livesdk.i18n.db.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(10133);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR REPLACE INTO `translation`(`key`,`value`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* bridge */ /* synthetic */ void a(androidx.i.a.f fVar, d dVar) {
                d dVar2 = dVar;
                if (dVar2.f18239a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, dVar2.f18239a);
                }
                if (dVar2.f18240b == null) {
                    fVar.a(2);
                } else {
                    fVar.a(2, dVar2.f18240b);
                }
            }
        };
        this.f18243c = new n(jVar) {
            /* class com.bytedance.android.livesdk.i18n.db.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(10134);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM translation";
            }
        };
    }

    @Override // com.bytedance.android.livesdk.i18n.db.e
    public final void a(List<d> list) {
        this.f18241a.d();
        this.f18241a.e();
        try {
            this.f18242b.a((Iterable) list);
            this.f18241a.g();
        } finally {
            this.f18241a.f();
        }
    }
}
