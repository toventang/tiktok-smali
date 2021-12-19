package com.ss.android.ugc.aweme.commercialize.dao;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.b;
import androidx.room.b.a;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final j f73763a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.c f73764b;

    /* renamed from: c  reason: collision with root package name */
    private final b f73765c;

    /* renamed from: d  reason: collision with root package name */
    private final n f73766d;

    static {
        Covode.recordClassIndex(45388);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.dao.b
    public final void a() {
        this.f73763a.d();
        f b2 = this.f73766d.b();
        this.f73763a.e();
        try {
            b2.a();
            this.f73763a.g();
        } finally {
            this.f73763a.f();
            this.f73766d.a(b2);
        }
    }

    public c(j jVar) {
        this.f73763a = jVar;
        this.f73764b = new androidx.room.c<a>(jVar) {
            /* class com.ss.android.ugc.aweme.commercialize.dao.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(45389);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR ABORT INTO `showAd`(`awemeId`) VALUES (?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* bridge */ /* synthetic */ void a(f fVar, a aVar) {
                a aVar2 = aVar;
                if (aVar2.f73762a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, aVar2.f73762a);
                }
            }
        };
        this.f73765c = new b<a>(jVar) {
            /* class com.ss.android.ugc.aweme.commercialize.dao.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(45390);
            }

            @Override // androidx.room.n, androidx.room.b
            public final String a() {
                return "DELETE FROM `showAd` WHERE `awemeId` = ?";
            }
        };
        this.f73766d = new n(jVar) {
            /* class com.ss.android.ugc.aweme.commercialize.dao.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(45391);
            }

            @Override // androidx.room.n
            public final String a() {
                return "delete from showAd";
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.commercialize.dao.b
    public final List<a> a(String str) {
        m a2 = m.a("SELECT * FROM showAd where awemeId = ?", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        this.f73763a.d();
        Cursor a3 = this.f73763a.a(a2);
        try {
            int a4 = a.a(a3, "awemeId");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(new a(a3.getString(a4)));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.commercialize.dao.b
    public final void a(a aVar) {
        this.f73763a.d();
        this.f73763a.e();
        try {
            this.f73764b.a(aVar);
            this.f73763a.g();
        } finally {
            this.f73763a.f();
        }
    }
}
