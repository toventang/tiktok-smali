package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.g;
import androidx.work.impl.a.d;
import com.bytedance.covode.number.Covode;

final class c {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4638e = g.a("ConstraintsCmdHandler");

    /* renamed from: a  reason: collision with root package name */
    final Context f4639a;

    /* renamed from: b  reason: collision with root package name */
    final int f4640b;

    /* renamed from: c  reason: collision with root package name */
    final e f4641c;

    /* renamed from: d  reason: collision with root package name */
    final d f4642d;

    static {
        Covode.recordClassIndex(1829);
    }

    c(Context context, int i2, e eVar) {
        this.f4639a = context;
        this.f4640b = i2;
        this.f4641c = eVar;
        this.f4642d = new d(context, null);
    }
}
