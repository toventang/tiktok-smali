package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private Context f4782a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences f4783b;

    static {
        Covode.recordClassIndex(1878);
    }

    public final boolean a() {
        return b().getBoolean("reschedule_needed", false);
    }

    private SharedPreferences b() {
        SharedPreferences sharedPreferences;
        synchronized (c.class) {
            if (this.f4783b == null) {
                this.f4783b = d.a(this.f4782a, "androidx.work.util.preferences", 0);
            }
            sharedPreferences = this.f4783b;
        }
        return sharedPreferences;
    }

    public c(Context context) {
        this.f4782a = context;
    }

    public final void a(boolean z) {
        b().edit().putBoolean("reschedule_needed", z).apply();
    }
}
