package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.a;

import com.bytedance.covode.number.Covode;
import java.util.Calendar;

public abstract class a {

    /* renamed from: b  reason: collision with root package name */
    protected static int f106896b = 12;

    /* renamed from: a  reason: collision with root package name */
    protected int f106897a;

    /* access modifiers changed from: protected */
    public abstract Long a();

    /* access modifiers changed from: protected */
    public abstract void c(long j2);

    public a() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(68372);
    }

    public final void a(long j2) {
        c(j2);
    }

    private a(byte b2) {
        this.f106897a = 5;
    }

    public final boolean b(long j2) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j2);
        int i2 = instance.get(11);
        if (i2 >= 0 && i2 < this.f106897a) {
            instance.add(5, -1);
        }
        instance.set(11, this.f106897a);
        instance.set(12, 0);
        instance.set(13, 0);
        if (a().longValue() < instance.getTimeInMillis()) {
            return true;
        }
        return false;
    }
}
