package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4741a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f4742b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4743c;

    static {
        Covode.recordClassIndex(1860);
    }

    private void b() {
        if (!this.f4743c) {
            this.f4742b = d.a(this.f4741a, "androidx.work.util.id", 0);
            this.f4743c = true;
        }
    }

    public final int a() {
        int a2;
        synchronized (a.class) {
            b();
            a2 = a("next_alarm_manager_id");
        }
        return a2;
    }

    public a(Context context) {
        this.f4741a = context;
    }

    private int a(String str) {
        int i2 = 0;
        int i3 = this.f4742b.getInt(str, 0);
        if (i3 != Integer.MAX_VALUE) {
            i2 = i3 + 1;
        }
        a(str, i2);
        return i3;
    }

    private void a(String str, int i2) {
        this.f4742b.edit().putInt(str, i2).apply();
    }

    public final int a(int i2, int i3) {
        synchronized (a.class) {
            b();
            int a2 = a("next_job_scheduler_id");
            if (a2 >= i2) {
                if (a2 <= i3) {
                    i2 = a2;
                }
            }
            a("next_job_scheduler_id", i2 + 1);
        }
        return i2;
    }
}
