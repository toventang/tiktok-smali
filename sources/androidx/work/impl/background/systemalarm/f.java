package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.g;
import androidx.work.impl.c;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class f implements c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4668a = g.a("SystemAlarmScheduler");

    /* renamed from: b  reason: collision with root package name */
    private final Context f4669b;

    static {
        Covode.recordClassIndex(1836);
    }

    @Override // androidx.work.impl.c
    public final void a(String str) {
        a(this.f4669b, b.c(this.f4669b, str));
    }

    public f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f4669b = applicationContext;
    }

    @Override // androidx.work.impl.c
    public final void a(androidx.work.impl.b.g... gVarArr) {
        for (androidx.work.impl.b.g gVar : gVarArr) {
            g.a();
            com.a.a("Scheduling work with workSpecId %s", new Object[]{gVar.f4578a});
            a(this.f4669b, b.a(this.f4669b, gVar.f4578a));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName a(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.f.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
