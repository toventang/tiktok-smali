package androidx.emoji.widget;

import android.text.Editable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class c extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f2827a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile Editable.Factory f2828b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f2829c;

    static {
        Covode.recordClassIndex(998);
    }

    private c() {
        try {
            f2829c = getClass().getClassLoader().loadClass("android.text.DynamicLayout$ChangeWatcher");
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory a() {
        if (f2828b == null) {
            synchronized (f2827a) {
                if (f2828b == null) {
                    f2828b = new c();
                }
            }
        }
        return f2828b;
    }

    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f2829c;
        if (cls != null) {
            return new j(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
