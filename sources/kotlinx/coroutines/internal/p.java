package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import kotlinx.coroutines.ci;

public final class p {

    /* renamed from: a */
    private static final boolean f159151a = true;

    public static final Void a() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    static {
        Covode.recordClassIndex(105668);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.coroutines.internal.MainDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r0v1, types: [kotlinx.coroutines.internal.MainDispatcherFactory] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.ci] */
    public static final ci a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            mainDispatcherFactory = mainDispatcherFactory.createDispatcher(list);
            return mainDispatcherFactory;
        } catch (Throwable th) {
            return a(th, mainDispatcherFactory.hintOnError());
        }
    }

    static /* synthetic */ q a(Throwable th, int i2) {
        if ((i2 & 1) != 0) {
            th = null;
        }
        return a(th, (String) null);
    }

    private static final q a(Throwable th, String str) {
        if (f159151a) {
            return new q(th, str);
        }
        if (th != null) {
            throw th;
        }
        a();
        throw null;
    }
}
