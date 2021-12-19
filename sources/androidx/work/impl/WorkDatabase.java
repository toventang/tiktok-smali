package androidx.work.impl;

import androidx.room.j;
import androidx.work.impl.b.b;
import androidx.work.impl.b.e;
import androidx.work.impl.b.h;
import androidx.work.impl.b.k;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;

public abstract class WorkDatabase extends j {

    /* renamed from: k  reason: collision with root package name */
    static final long f4513k = TimeUnit.DAYS.toMillis(7);

    public abstract h i();

    public abstract b j();

    public abstract k k();

    public abstract e l();

    static {
        Covode.recordClassIndex(1758);
    }
}
