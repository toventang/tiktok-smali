package com.ss.android.ugc.aweme.runtime.behavior;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.b.a;
import androidx.room.c;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final j f120715a;

    /* renamed from: b  reason: collision with root package name */
    private final c f120716b;

    /* renamed from: c  reason: collision with root package name */
    private final n f120717c;

    /* renamed from: d  reason: collision with root package name */
    private final n f120718d;

    static {
        Covode.recordClassIndex(78651);
    }

    public b(j jVar) {
        this.f120715a = jVar;
        this.f120716b = new c<c>(jVar) {
            /* class com.ss.android.ugc.aweme.runtime.behavior.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(78652);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR ABORT INTO `runtimeBehaviorEntity`(`id`,`type`,`time`,`msg`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* bridge */ /* synthetic */ void a(f fVar, c cVar) {
                c cVar2 = cVar;
                fVar.a(1, (long) cVar2.f120722a);
                if (cVar2.f120723b == null) {
                    fVar.a(2);
                } else {
                    fVar.a(2, cVar2.f120723b);
                }
                fVar.a(3, cVar2.f120724c);
                if (cVar2.f120725d == null) {
                    fVar.a(4);
                } else {
                    fVar.a(4, cVar2.f120725d);
                }
            }
        };
        this.f120717c = new n(jVar) {
            /* class com.ss.android.ugc.aweme.runtime.behavior.b.AnonymousClass2 */

            static {
                Covode.recordClassIndex(78653);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM runtimeBehaviorEntity where type = ? and time < ?";
            }
        };
        this.f120718d = new n(jVar) {
            /* class com.ss.android.ugc.aweme.runtime.behavior.b.AnonymousClass3 */

            static {
                Covode.recordClassIndex(78654);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM runtimeBehaviorEntity";
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.runtime.behavior.a
    public final void a(c cVar) {
        this.f120715a.d();
        this.f120715a.e();
        try {
            this.f120716b.a(cVar);
            this.f120715a.g();
        } finally {
            this.f120715a.f();
        }
    }

    @Override // com.ss.android.ugc.aweme.runtime.behavior.a
    public final void b(String str, long j2) {
        this.f120715a.d();
        f b2 = this.f120717c.b();
        if (str == null) {
            b2.a(1);
        } else {
            b2.a(1, str);
        }
        b2.a(2, j2);
        this.f120715a.e();
        try {
            b2.a();
            this.f120715a.g();
        } finally {
            this.f120715a.f();
            this.f120717c.a(b2);
        }
    }

    @Override // com.ss.android.ugc.aweme.runtime.behavior.a
    public final List<c> a(String str, long j2) {
        m a2 = m.a("SELECT * FROM runtimeBehaviorEntity where type = ?  and time > ?", 2);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        a2.a(2, j2);
        this.f120715a.d();
        Cursor a3 = this.f120715a.a(a2);
        try {
            int a4 = a.a(a3, "id");
            int a5 = a.a(a3, StringSet.type);
            int a6 = a.a(a3, "time");
            int a7 = a.a(a3, "msg");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                c cVar = new c();
                cVar.f120722a = a3.getInt(a4);
                String string = a3.getString(a5);
                l.d(string, "");
                cVar.f120723b = string;
                cVar.f120724c = a3.getLong(a6);
                String string2 = a3.getString(a7);
                l.d(string2, "");
                cVar.f120725d = string2;
                arrayList.add(cVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
