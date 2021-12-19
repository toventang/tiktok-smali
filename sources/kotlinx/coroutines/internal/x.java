package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;

public final /* synthetic */ class x {

    /* renamed from: a  reason: collision with root package name */
    public static final int f159159a = Runtime.getRuntime().availableProcessors();

    static {
        Covode.recordClassIndex(105676);
    }

    public static final String a(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
