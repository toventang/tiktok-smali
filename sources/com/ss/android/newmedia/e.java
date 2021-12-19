package com.ss.android.newmedia;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.app.AwemeAppData;

public abstract class e {

    /* renamed from: h  reason: collision with root package name */
    private static volatile AwemeAppData f59945h;

    /* renamed from: a  reason: collision with root package name */
    protected int f59946a = ((int) d.e());

    /* renamed from: b  reason: collision with root package name */
    protected final Context f59947b = d.a();

    /* renamed from: c  reason: collision with root package name */
    public long f59948c = -1;

    /* renamed from: d  reason: collision with root package name */
    public long f59949d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f59950e = 2;

    /* renamed from: f  reason: collision with root package name */
    private final Object f59951f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private int f59952g = 1;

    static {
        Covode.recordClassIndex(37049);
    }

    public static AwemeAppData a() {
        if (f59945h == null) {
            synchronized (e.class) {
                if (f59945h == null) {
                    f59945h = new AwemeAppData();
                }
            }
        }
        return f59945h;
    }

    public final int b() {
        int i2 = this.f59946a;
        if (i2 == -1 || i2 == 0 || i2 == 1) {
            this.f59946a = (int) d.e();
        }
        return this.f59946a;
    }
}
