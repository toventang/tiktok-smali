package androidx.work.impl.b;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.c;
import androidx.room.j;
import androidx.room.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final j f4616a;

    /* renamed from: b  reason: collision with root package name */
    private final c f4617b;

    static {
        Covode.recordClassIndex(1814);
    }

    public l(j jVar) {
        this.f4616a = jVar;
        this.f4617b = new c<j>(jVar) {
            /* class androidx.work.impl.b.l.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1815);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkTag`(`tag`,`work_spec_id`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* bridge */ /* synthetic */ void a(f fVar, j jVar) {
                j jVar2 = jVar;
                if (jVar2.f4614a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, jVar2.f4614a);
                }
                if (jVar2.f4615b == null) {
                    fVar.a(2);
                } else {
                    fVar.a(2, jVar2.f4615b);
                }
            }
        };
    }

    @Override // androidx.work.impl.b.k
    public final List<String> a(String str) {
        m a2 = m.a("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        Cursor a3 = this.f4616a.a(a2);
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
