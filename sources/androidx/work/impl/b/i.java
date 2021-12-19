package androidx.work.impl.b;

import android.database.Cursor;
import androidx.i.a.f;
import androidx.room.c;
import androidx.room.j;
import androidx.room.m;
import androidx.room.n;
import androidx.work.a;
import androidx.work.e;
import androidx.work.h;
import androidx.work.i;
import androidx.work.impl.b.m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final j f4595a;

    /* renamed from: b  reason: collision with root package name */
    private final c f4596b;

    /* renamed from: c  reason: collision with root package name */
    private final n f4597c;

    /* renamed from: d  reason: collision with root package name */
    private final n f4598d;

    /* renamed from: e  reason: collision with root package name */
    private final n f4599e;

    /* renamed from: f  reason: collision with root package name */
    private final n f4600f;

    /* renamed from: g  reason: collision with root package name */
    private final n f4601g;

    /* renamed from: h  reason: collision with root package name */
    private final n f4602h;

    /* renamed from: i  reason: collision with root package name */
    private final n f4603i;

    /* renamed from: j  reason: collision with root package name */
    private final n f4604j;

    static {
        Covode.recordClassIndex(1802);
    }

    @Override // androidx.work.impl.b.h
    public final List<String> a() {
        m a2 = m.a("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        Cursor a3 = this.f4595a.a(a2);
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

    @Override // androidx.work.impl.b.h
    public final int b() {
        f b2 = this.f4603i.b();
        this.f4595a.e();
        try {
            int a2 = b2.a();
            this.f4595a.g();
            return a2;
        } finally {
            this.f4595a.f();
            this.f4603i.a(b2);
        }
    }

    @Override // androidx.work.impl.b.h
    public final List<g> c() {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        m a2 = m.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        Cursor a3 = this.f4595a.a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a3.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a3.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a3.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a3.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a3.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a3.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a3.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a3.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a3.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a3.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a3.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a3.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a3.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a3.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a3.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a3.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a3.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a3.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a3.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a3.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a3.getColumnIndexOrThrow("content_uri_triggers");
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(columnIndexOrThrow);
                    String string2 = a3.getString(columnIndexOrThrow3);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.f4480b = m.c(a3.getInt(columnIndexOrThrow16));
                    if (a3.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f4481c = z;
                    if (a3.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f4482d = z2;
                    if (a3.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f4483e = z3;
                    if (a3.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f4484f = z4;
                    cVar.f4485g = a3.getLong(columnIndexOrThrow21);
                    cVar.f4486h = a3.getLong(columnIndexOrThrow22);
                    cVar.f4487i = m.a(a3.getBlob(columnIndexOrThrow23));
                    g gVar = new g(string, string2);
                    gVar.f4579b = m.a(a3.getInt(columnIndexOrThrow2));
                    gVar.f4581d = a3.getString(columnIndexOrThrow4);
                    gVar.f4582e = e.a(a3.getBlob(columnIndexOrThrow5));
                    gVar.f4583f = e.a(a3.getBlob(columnIndexOrThrow6));
                    gVar.f4584g = a3.getLong(columnIndexOrThrow7);
                    gVar.f4585h = a3.getLong(columnIndexOrThrow8);
                    gVar.f4586i = a3.getLong(columnIndexOrThrow9);
                    gVar.f4588k = a3.getInt(columnIndexOrThrow10);
                    gVar.f4589l = m.b(a3.getInt(columnIndexOrThrow11));
                    gVar.f4590m = a3.getLong(columnIndexOrThrow12);
                    gVar.n = a3.getLong(columnIndexOrThrow13);
                    gVar.o = a3.getLong(columnIndexOrThrow14);
                    gVar.p = a3.getLong(columnIndexOrThrow15);
                    gVar.f4587j = cVar;
                    arrayList.add(gVar);
                }
                a3.close();
                a2.a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a3.close();
                a2.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a3.close();
            a2.a();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.h
    public final List<g> d() {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        m a2 = m.a("SELECT * FROM workspec WHERE state=0", 0);
        Cursor a3 = this.f4595a.a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a3.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a3.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a3.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a3.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a3.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a3.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a3.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a3.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a3.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a3.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a3.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a3.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a3.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a3.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a3.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a3.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a3.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a3.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a3.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a3.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a3.getColumnIndexOrThrow("content_uri_triggers");
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(columnIndexOrThrow);
                    String string2 = a3.getString(columnIndexOrThrow3);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.f4480b = m.c(a3.getInt(columnIndexOrThrow16));
                    if (a3.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f4481c = z;
                    if (a3.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f4482d = z2;
                    if (a3.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f4483e = z3;
                    if (a3.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f4484f = z4;
                    cVar.f4485g = a3.getLong(columnIndexOrThrow21);
                    cVar.f4486h = a3.getLong(columnIndexOrThrow22);
                    cVar.f4487i = m.a(a3.getBlob(columnIndexOrThrow23));
                    g gVar = new g(string, string2);
                    gVar.f4579b = m.a(a3.getInt(columnIndexOrThrow2));
                    gVar.f4581d = a3.getString(columnIndexOrThrow4);
                    gVar.f4582e = e.a(a3.getBlob(columnIndexOrThrow5));
                    gVar.f4583f = e.a(a3.getBlob(columnIndexOrThrow6));
                    gVar.f4584g = a3.getLong(columnIndexOrThrow7);
                    gVar.f4585h = a3.getLong(columnIndexOrThrow8);
                    gVar.f4586i = a3.getLong(columnIndexOrThrow9);
                    gVar.f4588k = a3.getInt(columnIndexOrThrow10);
                    gVar.f4589l = m.b(a3.getInt(columnIndexOrThrow11));
                    gVar.f4590m = a3.getLong(columnIndexOrThrow12);
                    gVar.n = a3.getLong(columnIndexOrThrow13);
                    gVar.o = a3.getLong(columnIndexOrThrow14);
                    gVar.p = a3.getLong(columnIndexOrThrow15);
                    gVar.f4587j = cVar;
                    arrayList.add(gVar);
                }
                a3.close();
                a2.a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a3.close();
                a2.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a3.close();
            a2.a();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.h
    public final int c(String str) {
        f b2 = this.f4601g.b();
        this.f4595a.e();
        if (str == null) {
            try {
                b2.a(1);
            } catch (Throwable th) {
                this.f4595a.f();
                this.f4601g.a(b2);
                throw th;
            }
        } else {
            b2.a(1, str);
        }
        int a2 = b2.a();
        this.f4595a.g();
        this.f4595a.f();
        this.f4601g.a(b2);
        return a2;
    }

    @Override // androidx.work.impl.b.h
    public final i.a d(String str) {
        i.a aVar;
        m a2 = m.a("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        Cursor a3 = this.f4595a.a(a2);
        try {
            if (a3.moveToFirst()) {
                aVar = m.a(a3.getInt(0));
            } else {
                aVar = null;
            }
            return aVar;
        } finally {
            a3.close();
            a2.a();
        }
    }

    public i(j jVar) {
        this.f4595a = jVar;
        this.f4596b = new c<g>(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass1 */

            static {
                Covode.recordClassIndex(1803);
            }

            @Override // androidx.room.n
            public final String a() {
                return "INSERT OR IGNORE INTO `WorkSpec`(`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.i.a.f, java.lang.Object] */
            @Override // androidx.room.c
            public final /* synthetic */ void a(f fVar, g gVar) {
                int i2;
                g gVar2 = gVar;
                int i3 = 1;
                if (gVar2.f4578a == null) {
                    fVar.a(1);
                } else {
                    fVar.a(1, gVar2.f4578a);
                }
                fVar.a(2, (long) m.a(gVar2.f4579b));
                if (gVar2.f4580c == null) {
                    fVar.a(3);
                } else {
                    fVar.a(3, gVar2.f4580c);
                }
                if (gVar2.f4581d == null) {
                    fVar.a(4);
                } else {
                    fVar.a(4, gVar2.f4581d);
                }
                byte[] a2 = e.a(gVar2.f4582e);
                if (a2 == null) {
                    fVar.a(5);
                } else {
                    fVar.a(5, a2);
                }
                byte[] a3 = e.a(gVar2.f4583f);
                if (a3 == null) {
                    fVar.a(6);
                } else {
                    fVar.a(6, a3);
                }
                fVar.a(7, gVar2.f4584g);
                fVar.a(8, gVar2.f4585h);
                fVar.a(9, gVar2.f4586i);
                fVar.a(10, (long) gVar2.f4588k);
                a aVar = gVar2.f4589l;
                int i4 = m.AnonymousClass1.f4620b[aVar.ordinal()];
                if (i4 == 1) {
                    i2 = 0;
                } else if (i4 == 2) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("Could not convert " + aVar + " to int");
                }
                fVar.a(11, (long) i2);
                fVar.a(12, gVar2.f4590m);
                fVar.a(13, gVar2.n);
                fVar.a(14, gVar2.o);
                fVar.a(15, gVar2.p);
                androidx.work.c cVar = gVar2.f4587j;
                if (cVar != null) {
                    h hVar = cVar.f4480b;
                    int i5 = m.AnonymousClass1.f4621c[hVar.ordinal()];
                    if (i5 == 1) {
                        i3 = 0;
                    } else if (i5 != 2) {
                        if (i5 == 3) {
                            i3 = 2;
                        } else if (i5 == 4) {
                            i3 = 3;
                        } else if (i5 == 5) {
                            i3 = 4;
                        } else {
                            throw new IllegalArgumentException("Could not convert " + hVar + " to int");
                        }
                    }
                    fVar.a(16, (long) i3);
                    fVar.a(17, cVar.f4481c ? 1 : 0);
                    fVar.a(18, cVar.f4482d ? 1 : 0);
                    fVar.a(19, cVar.f4483e ? 1 : 0);
                    fVar.a(20, cVar.f4484f ? 1 : 0);
                    fVar.a(21, cVar.f4485g);
                    fVar.a(22, cVar.f4486h);
                    byte[] a4 = m.a(cVar.f4487i);
                    if (a4 == null) {
                        fVar.a(23);
                    } else {
                        fVar.a(23, a4);
                    }
                } else {
                    fVar.a(16);
                    fVar.a(17);
                    fVar.a(18);
                    fVar.a(19);
                    fVar.a(20);
                    fVar.a(21);
                    fVar.a(22);
                    fVar.a(23);
                }
            }
        };
        this.f4597c = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass2 */

            static {
                Covode.recordClassIndex(1804);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.f4598d = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass3 */

            static {
                Covode.recordClassIndex(1805);
            }

            @Override // androidx.room.n
            public final String a() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.f4599e = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass4 */

            static {
                Covode.recordClassIndex(1806);
            }

            @Override // androidx.room.n
            public final String a() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f4600f = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass5 */

            static {
                Covode.recordClassIndex(1807);
            }

            @Override // androidx.room.n
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.f4601g = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass6 */

            static {
                Covode.recordClassIndex(1808);
            }

            @Override // androidx.room.n
            public final String a() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.f4602h = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass7 */

            static {
                Covode.recordClassIndex(1809);
            }

            @Override // androidx.room.n
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.f4603i = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass8 */

            static {
                Covode.recordClassIndex(1810);
            }

            @Override // androidx.room.n
            public final String a() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.f4604j = new n(jVar) {
            /* class androidx.work.impl.b.i.AnonymousClass9 */

            static {
                Covode.recordClassIndex(1811);
            }

            @Override // androidx.room.n
            public final String a() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }

    @Override // androidx.work.impl.b.h
    public final int b(String str) {
        f b2 = this.f4600f.b();
        this.f4595a.e();
        if (str == null) {
            try {
                b2.a(1);
            } catch (Throwable th) {
                this.f4595a.f();
                this.f4600f.a(b2);
                throw th;
            }
        } else {
            b2.a(1, str);
        }
        int a2 = b2.a();
        this.f4595a.g();
        this.f4595a.f();
        this.f4600f.a(b2);
        return a2;
    }

    @Override // androidx.work.impl.b.h
    public final List<e> e(String str) {
        androidx.room.m a2 = androidx.room.m.a("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        Cursor a3 = this.f4595a.a(a2);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(e.a(a3.getBlob(0)));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.a();
        }
    }

    @Override // androidx.work.impl.b.h
    public final g a(String str) {
        Throwable th;
        g gVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.room.m a2 = androidx.room.m.a("SELECT * FROM workspec WHERE id=?", 1);
        if (str == null) {
            a2.f4356e[1] = 1;
        } else {
            a2.a(1, str);
        }
        Cursor a3 = this.f4595a.a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a3.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a3.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a3.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a3.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a3.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a3.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a3.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a3.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a3.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a3.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a3.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a3.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a3.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a3.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a3.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a3.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a3.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a3.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a3.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a3.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a3.getColumnIndexOrThrow("content_uri_triggers");
                if (a3.moveToFirst()) {
                    String string = a3.getString(columnIndexOrThrow);
                    String string2 = a3.getString(columnIndexOrThrow3);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.f4480b = m.c(a3.getInt(columnIndexOrThrow16));
                    if (a3.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f4481c = z;
                    if (a3.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f4482d = z2;
                    if (a3.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f4483e = z3;
                    if (a3.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f4484f = z4;
                    cVar.f4485g = a3.getLong(columnIndexOrThrow21);
                    cVar.f4486h = a3.getLong(columnIndexOrThrow22);
                    cVar.f4487i = m.a(a3.getBlob(columnIndexOrThrow23));
                    gVar = new g(string, string2);
                    gVar.f4579b = m.a(a3.getInt(columnIndexOrThrow2));
                    gVar.f4581d = a3.getString(columnIndexOrThrow4);
                    gVar.f4582e = e.a(a3.getBlob(columnIndexOrThrow5));
                    gVar.f4583f = e.a(a3.getBlob(columnIndexOrThrow6));
                    gVar.f4584g = a3.getLong(columnIndexOrThrow7);
                    gVar.f4585h = a3.getLong(columnIndexOrThrow8);
                    gVar.f4586i = a3.getLong(columnIndexOrThrow9);
                    gVar.f4588k = a3.getInt(columnIndexOrThrow10);
                    gVar.f4589l = m.b(a3.getInt(columnIndexOrThrow11));
                    gVar.f4590m = a3.getLong(columnIndexOrThrow12);
                    gVar.n = a3.getLong(columnIndexOrThrow13);
                    gVar.o = a3.getLong(columnIndexOrThrow14);
                    gVar.p = a3.getLong(columnIndexOrThrow15);
                    gVar.f4587j = cVar;
                } else {
                    gVar = null;
                }
                a3.close();
                a2.a();
                return gVar;
            } catch (Throwable th2) {
                th = th2;
                a3.close();
                a2.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a3.close();
            a2.a();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.h
    public final List<g> a(int i2) {
        Throwable th;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.room.m a2 = androidx.room.m.a("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        a2.a(1, (long) i2);
        Cursor a3 = this.f4595a.a(a2);
        try {
            int columnIndexOrThrow = a3.getColumnIndexOrThrow("id");
            int columnIndexOrThrow2 = a3.getColumnIndexOrThrow("state");
            int columnIndexOrThrow3 = a3.getColumnIndexOrThrow("worker_class_name");
            int columnIndexOrThrow4 = a3.getColumnIndexOrThrow("input_merger_class_name");
            int columnIndexOrThrow5 = a3.getColumnIndexOrThrow("input");
            int columnIndexOrThrow6 = a3.getColumnIndexOrThrow("output");
            int columnIndexOrThrow7 = a3.getColumnIndexOrThrow("initial_delay");
            int columnIndexOrThrow8 = a3.getColumnIndexOrThrow("interval_duration");
            int columnIndexOrThrow9 = a3.getColumnIndexOrThrow("flex_duration");
            int columnIndexOrThrow10 = a3.getColumnIndexOrThrow("run_attempt_count");
            int columnIndexOrThrow11 = a3.getColumnIndexOrThrow("backoff_policy");
            int columnIndexOrThrow12 = a3.getColumnIndexOrThrow("backoff_delay_duration");
            int columnIndexOrThrow13 = a3.getColumnIndexOrThrow("period_start_time");
            int columnIndexOrThrow14 = a3.getColumnIndexOrThrow("minimum_retention_duration");
            try {
                int columnIndexOrThrow15 = a3.getColumnIndexOrThrow("schedule_requested_at");
                int columnIndexOrThrow16 = a3.getColumnIndexOrThrow("required_network_type");
                int columnIndexOrThrow17 = a3.getColumnIndexOrThrow("requires_charging");
                int columnIndexOrThrow18 = a3.getColumnIndexOrThrow("requires_device_idle");
                int columnIndexOrThrow19 = a3.getColumnIndexOrThrow("requires_battery_not_low");
                int columnIndexOrThrow20 = a3.getColumnIndexOrThrow("requires_storage_not_low");
                int columnIndexOrThrow21 = a3.getColumnIndexOrThrow("trigger_content_update_delay");
                int columnIndexOrThrow22 = a3.getColumnIndexOrThrow("trigger_max_content_delay");
                int columnIndexOrThrow23 = a3.getColumnIndexOrThrow("content_uri_triggers");
                ArrayList arrayList = new ArrayList(a3.getCount());
                while (a3.moveToNext()) {
                    String string = a3.getString(columnIndexOrThrow);
                    String string2 = a3.getString(columnIndexOrThrow3);
                    androidx.work.c cVar = new androidx.work.c();
                    cVar.f4480b = m.c(a3.getInt(columnIndexOrThrow16));
                    if (a3.getInt(columnIndexOrThrow17) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar.f4481c = z;
                    if (a3.getInt(columnIndexOrThrow18) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    cVar.f4482d = z2;
                    if (a3.getInt(columnIndexOrThrow19) != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    cVar.f4483e = z3;
                    if (a3.getInt(columnIndexOrThrow20) != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.f4484f = z4;
                    cVar.f4485g = a3.getLong(columnIndexOrThrow21);
                    cVar.f4486h = a3.getLong(columnIndexOrThrow22);
                    cVar.f4487i = m.a(a3.getBlob(columnIndexOrThrow23));
                    g gVar = new g(string, string2);
                    gVar.f4579b = m.a(a3.getInt(columnIndexOrThrow2));
                    gVar.f4581d = a3.getString(columnIndexOrThrow4);
                    gVar.f4582e = e.a(a3.getBlob(columnIndexOrThrow5));
                    gVar.f4583f = e.a(a3.getBlob(columnIndexOrThrow6));
                    gVar.f4584g = a3.getLong(columnIndexOrThrow7);
                    gVar.f4585h = a3.getLong(columnIndexOrThrow8);
                    gVar.f4586i = a3.getLong(columnIndexOrThrow9);
                    gVar.f4588k = a3.getInt(columnIndexOrThrow10);
                    gVar.f4589l = m.b(a3.getInt(columnIndexOrThrow11));
                    gVar.f4590m = a3.getLong(columnIndexOrThrow12);
                    gVar.n = a3.getLong(columnIndexOrThrow13);
                    gVar.o = a3.getLong(columnIndexOrThrow14);
                    gVar.p = a3.getLong(columnIndexOrThrow15);
                    gVar.f4587j = cVar;
                    arrayList.add(gVar);
                }
                a3.close();
                a2.a();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                a3.close();
                a2.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a3.close();
            a2.a();
            throw th;
        }
    }

    @Override // androidx.work.impl.b.h
    public final int a(i.a aVar, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        androidx.room.b.c.a(sb);
        sb.append(")");
        f a2 = this.f4595a.a(sb.toString());
        a2.a(1, (long) m.a(aVar));
        int i2 = 0;
        do {
            String str = strArr[0];
            if (str == null) {
                a2.a(2);
            } else {
                a2.a(2, str);
            }
            i2++;
        } while (i2 <= 0);
        this.f4595a.e();
        try {
            int a3 = a2.a();
            this.f4595a.g();
            return a3;
        } finally {
            this.f4595a.f();
        }
    }

    @Override // androidx.work.impl.b.h
    public final void a(String str, long j2) {
        f b2 = this.f4599e.b();
        this.f4595a.e();
        try {
            b2.a(1, j2);
            if (str == null) {
                b2.a(2);
            } else {
                b2.a(2, str);
            }
            b2.a();
            this.f4595a.g();
        } finally {
            this.f4595a.f();
            this.f4599e.a(b2);
        }
    }

    @Override // androidx.work.impl.b.h
    public final int b(String str, long j2) {
        f b2 = this.f4602h.b();
        this.f4595a.e();
        try {
            b2.a(1, j2);
            if (str == null) {
                b2.a(2);
            } else {
                b2.a(2, str);
            }
            int a2 = b2.a();
            this.f4595a.g();
            return a2;
        } finally {
            this.f4595a.f();
            this.f4602h.a(b2);
        }
    }

    @Override // androidx.work.impl.b.h
    public final void a(String str, e eVar) {
        f b2 = this.f4598d.b();
        this.f4595a.e();
        try {
            byte[] a2 = e.a(eVar);
            if (a2 == null) {
                b2.a(1);
            } else {
                b2.a(1, a2);
            }
            if (str == null) {
                b2.a(2);
            } else {
                b2.a(2, str);
            }
            b2.a();
            this.f4595a.g();
        } finally {
            this.f4595a.f();
            this.f4598d.a(b2);
        }
    }
}
