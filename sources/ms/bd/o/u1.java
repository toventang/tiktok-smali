package ms.bd.o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;

public class u1 {

    /* renamed from: a  reason: collision with root package name */
    private static final String f159558a = ((String) h.a(16777217, 0, 0, "19802c", new byte[]{46, 58, 5, 71, 23, 120}));

    static {
        MethodCollector.i(13183);
        Covode.recordClassIndex(105963);
        MethodCollector.o(13183);
    }

    private static boolean a(File file) {
        MethodCollector.i(13098);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(13098);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(13098);
        return delete;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00d8 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cd A[SYNTHETIC, Splitter:B:41:0x00cd] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r19) {
        /*
        // Method dump skipped, instructions count: 236
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.u1.a(android.content.Context):int");
    }
}
