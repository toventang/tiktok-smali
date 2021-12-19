package androidx.work.impl.b;

import android.database.Cursor;
import androidx.room.c;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import com.bytedance.covode.number.Covode;

public final class f implements e {

    /* renamed from: a  reason: collision with root package name */
    private final j f4573a;

    /* renamed from: b  reason: collision with root package name */
    private final c f4574b;

    /* renamed from: c  reason: collision with root package name */
    private final n f4575c;

    static {
        Covode.recordClassIndex(1795);
    }

    public f(j jVar) {
        this.f4573a = jVar;
        this.f4574b = new c<d>(jVar) {
            /* class androidx.work.impl.b.f.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1796);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR REPLACE INTO `SystemIdInfo`(`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* bridge */ /* synthetic */ void a(androidx.i.a.f fVar, d dVar) {
                d dVar2 = dVar;
                if (dVar2.f4571a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, dVar2.f4571a);
                }
                fVar.a(2, (long) dVar2.f4572b);
            }
        };
        this.f4575c = new n(jVar) {
            /* class androidx.work.impl.b.f.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1797);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    @Override // androidx.work.impl.b.e
    public final void a(d dVar) {
        this.f4573a.e();
        try {
            this.f4574b.a(dVar);
            this.f4573a.g();
        } finally {
            this.f4573a.f();
        }
    }

    @Override // androidx.work.impl.b.e
    public final void b(String str) {
        androidx.i.a.f b2 = this.f4575c.b();
        this.f4573a.e();
        if (str == null) {
            try {
                b2.a(1);
            } catch (Throwable th) {
                this.f4573a.f();
                this.f4575c.a(b2);
                throw th;
            }
        } else {
            b2.a(1, str);
        }
        b2.a();
        this.f4573a.g();
        this.f4573a.f();
        this.f4575c.a(b2);
    }

    @Override // androidx.work.impl.b.e
    public final d a(String str) {
        d dVar;
        m a2 = m.a("SELECT * FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        Cursor a3 = this.f4573a.a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("work_spec_id");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("system_id");
            if (a3.moveToFirst()) {
                dVar = new d(a3.getString(columnIndexOrThrow), a3.getInt(columnIndexOrThrow2));
            } else {
                dVar = null;
            }
            return dVar;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
