package com.ss.android.ugc.aweme.i.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.aj;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    protected static int f99760b = 12;

    /* renamed from: a  reason: collision with root package name */
    protected int f99761a;

    /* access modifiers changed from: protected */
    public abstract aj<Long> a();

    public a() {
        this(5);
    }

    static {
        Covode.recordClassIndex(63603);
    }

    public a(int i2) {
        this.f99761a = i2;
    }

    public final void a(long j2) {
        a().b(Long.valueOf(j2));
    }

    public final boolean b(long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        int i2 = instance.get(11);
        if (i2 >= 0 && i2 < this.f99761a) {
            instance.add(5, -1);
        }
        instance.set(11, this.f99761a);
        instance.set(12, 0);
        instance.set(13, 0);
        long timeInMillis = instance.getTimeInMillis();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance.getTime());
        if (a().c().longValue() < timeInMillis) {
            return true;
        }
        return false;
    }
}
