package com.ss.android.ugc.trill.share.data;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.b.a;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    private final j f150670a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.room.c f150671b;

    /* renamed from: c  reason: collision with root package name */
    private final n f150672c;

    static {
        Covode.recordClassIndex(99078);
    }

    public c(j jVar) {
        this.f150670a = jVar;
        this.f150671b = new androidx.room.c<a>(jVar) {
            /* class com.ss.android.ugc.trill.share.data.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99079);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR ABORT INTO `Record`(`rid`,`time`,`channel`,`share_type`) VALUES (nullif(?, 0),?,?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* synthetic */ void a(f fVar, a aVar) {
                a aVar2 = aVar;
                fVar.a(1, (long) aVar2.f150666a);
                if (aVar2.f150667b == null) {
                    fVar.a(2);
                } else {
                    fVar.a(2, aVar2.f150667b.longValue());
                }
                if (aVar2.f150668c == null) {
                    fVar.a(3);
                } else {
                    fVar.a(3, aVar2.f150668c);
                }
                if (aVar2.f150669d == null) {
                    fVar.a(4);
                } else {
                    fVar.a(4, (long) aVar2.f150669d.intValue());
                }
            }
        };
        this.f150672c = new n(jVar) {
            /* class com.ss.android.ugc.trill.share.data.c.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99080);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM record WHERE rid = ?";
            }
        };
    }

    @Override // com.ss.android.ugc.trill.share.data.b
    public final void a(a aVar) {
        this.f150670a.d();
        this.f150670a.e();
        try {
            this.f150671b.a(aVar);
            this.f150670a.g();
        } finally {
            this.f150670a.f();
        }
    }

    @Override // com.ss.android.ugc.trill.share.data.b
    public final void b(Integer num) {
        this.f150670a.d();
        f b2 = this.f150672c.b();
        if (num == null) {
            b2.a(1);
        } else {
            b2.a(1, (long) num.intValue());
        }
        this.f150670a.e();
        try {
            b2.a();
            this.f150670a.g();
        } finally {
            this.f150670a.f();
            this.f150672c.a(b2);
        }
    }

    @Override // com.ss.android.ugc.trill.share.data.b
    public final long c(Integer num) {
        long j2;
        m a2 = m.a("SELECT count(*) FROM record WHERE share_type = ?", 1);
        if (num == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, (long) num.intValue());
        }
        this.f150670a.d();
        Cursor a3 = this.f150670a.a(a2);
        try {
            if (a3.moveToFirst()) {
                j2 = a3.getLong(0);
            } else {
                j2 = 0;
            }
            return j2;
        } finally {
            a3.close();
            a2.a();
        }
    }

    @Override // com.ss.android.ugc.trill.share.data.b
    public final List<a> a(Integer num) {
        Long l2;
        m a2 = m.a("SELECT * FROM record where share_type = ? order by time desc limit 10", 1);
        if (num == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, (long) num.intValue());
        }
        this.f150670a.d();
        Cursor a3 = this.f150670a.a(a2);
        try {
            int a4 = a.a(a3, "rid");
            int a5 = a.a(a3, "time");
            int a6 = a.a(a3, "channel");
            int a7 = a.a(a3, "share_type");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                a aVar = new a();
                aVar.f150666a = a3.getInt(a4);
                Integer num2 = null;
                if (a3.isNull(a5)) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(a3.getLong(a5));
                }
                aVar.f150667b = l2;
                aVar.f150668c = a3.getString(a6);
                if (!a3.isNull(a7)) {
                    num2 = Integer.valueOf(a3.getInt(a7));
                }
                aVar.f150669d = num2;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    @Override // com.ss.android.ugc.trill.share.data.b
    public final List<a> a(Integer num, Integer num2) {
        Long l2;
        m a2 = m.a("SELECT * FROM record where share_type = ? order by time desc limit ?", 2);
        if (num == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, (long) num.intValue());
        }
        if (num2 == null) {
            a2.f4356e[2] = 1;
        } else {
            a2.a(2, (long) num2.intValue());
        }
        this.f150670a.d();
        Cursor a3 = this.f150670a.a(a2);
        try {
            int a4 = a.a(a3, "rid");
            int a5 = a.a(a3, "time");
            int a6 = a.a(a3, "channel");
            int a7 = a.a(a3, "share_type");
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                a aVar = new a();
                aVar.f150666a = a3.getInt(a4);
                Integer num3 = null;
                if (a3.isNull(a5)) {
                    l2 = null;
                } else {
                    l2 = Long.valueOf(a3.getLong(a5));
                }
                aVar.f150667b = l2;
                aVar.f150668c = a3.getString(a6);
                if (!a3.isNull(a7)) {
                    num3 = Integer.valueOf(a3.getInt(a7));
                }
                aVar.f150669d = num3;
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }
}
