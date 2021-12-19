package org.greenrobot.eventbus.a;

import com.bytedance.covode.number.Covode;
import java.util.logging.Level;
import org.greenrobot.eventbus.l;

public final class a implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f159787a;

    /* renamed from: b  reason: collision with root package name */
    private final String f159788b;

    @Override // org.greenrobot.eventbus.l
    public final void a(Level level, String str) {
    }

    @Override // org.greenrobot.eventbus.l
    public final void a(Level level, String str, Throwable th) {
    }

    static {
        Covode.recordClassIndex(106468);
        boolean z = false;
        try {
            if (Class.forName("android.util.Log") != null) {
                z = true;
            }
        } catch (ClassNotFoundException unused) {
        }
        f159787a = z;
    }

    public a(String str) {
        this.f159788b = str;
    }
}
