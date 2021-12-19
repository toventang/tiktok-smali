package com.ss.android.ugc.aweme.challenge.data;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.b;
import androidx.room.b.a;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final j f69926a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.c f69927b;

    /* renamed from: c  reason: collision with root package name */
    private final b f69928c;

    /* renamed from: d  reason: collision with root package name */
    private final n f69929d;

    static {
        Covode.recordClassIndex(43123);
    }

    @Override // com.ss.android.ugc.aweme.challenge.data.b
    public final List<e> a() {
        Long l2;
        m a2 = m.a("SELECT * FROM localHashTag order by time desc", 0);
        this.f69926a.d();
        Cursor a3 = this.f69926a.a(a2);
        try {
            int a4 = a.a(a3, StringSet.name);
            int a5 = a.a(a3, "time");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                e eVar = new e();
                eVar.f69943a = a3.getString(a4);
                if (a3.isNull(a5)) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(a3.getLong(a5));
                }
                eVar.f69944b = l2;
                arrayList.add(eVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public c(j jVar) {
        this.f69926a = jVar;
        this.f69927b = new androidx.room.c<e>(jVar) {
            /* class com.ss.android.ugc.aweme.challenge.data.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43124);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR FAIL INTO `localHashTag`(`name`,`time`) VALUES (?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* synthetic */ void a(f fVar, e eVar) {
                e eVar2 = eVar;
                if (eVar2.f69943a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, eVar2.f69943a);
                }
                if (eVar2.f69944b == null) {
                    fVar.a(2);
                } else {
                    fVar.a(2, eVar2.f69944b.longValue());
                }
            }
        };
        this.f69928c = new b<e>(jVar) {
            /* class com.ss.android.ugc.aweme.challenge.data.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(43125);
            }

            @Override // androidx.room.n, androidx.room.b
            public final String a() {
                return "UPDATE OR FAIL `localHashTag` SET `name` = ?,`time` = ? WHERE `name` = ?";
            }
        };
        this.f69929d = new n(jVar) {
            /* class com.ss.android.ugc.aweme.challenge.data.c.AnonymousClass3 */

            static {
                Covode.recordClassIndex(43126);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM localHashTag WHERE time in(SELECT time FROM localHashTag ORDER BY time ASC LIMIT ?)";
            }
        };
    }
}
