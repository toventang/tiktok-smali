package androidx.work.impl.b;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.j;
import androidx.room.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final j f4568a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.c f4569b;

    static {
        Covode.recordClassIndex(1791);
    }

    public c(j jVar) {
        this.f4568a = jVar;
        this.f4569b = new androidx.room.c<a>(jVar) {
            /* class androidx.work.impl.b.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1792);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR IGNORE INTO `Dependency`(`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* bridge */ /* synthetic */ void a(f fVar, a aVar) {
                a aVar2 = aVar;
                if (aVar2.f4566a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, aVar2.f4566a);
                }
                if (aVar2.f4567b == null) {
                    fVar.a(2);
                } else {
                    fVar.a(2, aVar2.f4567b);
                }
            }
        };
    }

    @Override // androidx.work.impl.b.b
    public final boolean a(String str) {
        boolean z = true;
        m a2 = m.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        Cursor a3 = this.f4568a.a(a2);
        try {
            boolean z2 = false;
            if (a3.moveToFirst()) {
                if (a3.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a3.close();
            a2.a();
        }
    }

    @Override // androidx.work.impl.b.b
    public final List<String> b(String str) {
        m a2 = m.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        Cursor a3 = this.f4568a.a(a2);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
