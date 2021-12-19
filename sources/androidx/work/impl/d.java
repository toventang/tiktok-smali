package androidx.work.impl;

import android.content.Context;
import android.os.Build;
import androidx.work.g;
import androidx.work.impl.b.h;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.background.systemjob.b;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4691a = g.a("Schedulers");

    static {
        Covode.recordClassIndex(1846);
    }

    static c a(Context context, f fVar) {
        c fVar2;
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 23) {
            fVar2 = new b(context, fVar);
            androidx.work.impl.utils.b.a(context, SystemJobService.class, true);
            g.a();
            z = false;
        } else {
            fVar2 = new f(context);
            g.a();
        }
        androidx.work.impl.utils.b.a(context, SystemAlarmService.class, z);
        return fVar2;
    }

    /* JADX INFO: finally extract failed */
    public static void a(androidx.work.b bVar, WorkDatabase workDatabase, List<c> list) {
        int i2;
        if (list != null && list.size() != 0) {
            h i3 = workDatabase.i();
            workDatabase.e();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i2 = bVar.f4472f / 2;
                } else {
                    i2 = bVar.f4472f;
                }
                List<androidx.work.impl.b.g> a2 = i3.a(i2);
                if (a2.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (androidx.work.impl.b.g gVar : a2) {
                        i3.b(gVar.f4578a, currentTimeMillis);
                    }
                }
                workDatabase.g();
                workDatabase.f();
                if (a2.size() > 0) {
                    androidx.work.impl.b.g[] gVarArr = (androidx.work.impl.b.g[]) a2.toArray(new androidx.work.impl.b.g[0]);
                    for (c cVar : list) {
                        cVar.a(gVarArr);
                    }
                }
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
    }
}
