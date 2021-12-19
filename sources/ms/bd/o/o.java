package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import ms.bd.o.n;

public class o {

    /* renamed from: a  reason: collision with root package name */
    protected final Set<String> f159523a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    protected final n.b f159524b;

    /* renamed from: c  reason: collision with root package name */
    protected final n.a f159525c;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f159526d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f159527e;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f159528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f159529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f159530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o f159531d;

        static {
            Covode.recordClassIndex(105937);
        }

        public void run() {
            try {
                this.f159531d.a(this.f159528a, this.f159529b, this.f159530c);
                throw null;
            } catch (UnsatisfiedLinkError unused) {
                throw null;
            } catch (m unused2) {
                throw null;
            }
        }
    }

    static {
        Covode.recordClassIndex(105936);
    }

    public static void a(String str, Object... objArr) {
        com.a.a(Locale.US, str, objArr);
    }

    protected o() {
        q qVar = new q();
        l lVar = new l();
        this.f159524b = qVar;
        this.f159525c = lVar;
    }

    private static boolean a(File file) {
        MethodCollector.i(9354);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (e.a(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_delete_log", e.a(cVar));
            }
            if (e.c(file.getAbsolutePath(), cVar)) {
                e.a(file, new RuntimeException(), "exception_handle", e.a(cVar));
                MethodCollector.o(9354);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(9354);
        return delete;
    }

    public final void a(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!n.a(str)) {
            com.a.a(Locale.US, "Beginning load of %s...", new Object[]{str});
            a(context, str, null);
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    private static File b(Context context, String str, String str2) {
        String a2 = q.a(str);
        if (n.a(str2)) {
            return new File(context.getDir("lib", 0), a2);
        }
        return new File(context.getDir("lib", 0), a2 + "." + str2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v5, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r1 = new ms.bd.o.w(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r0 = r1.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01b5, code lost:
        r1.close();
        r3 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c0, code lost:
        if (r3.hasNext() != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c2, code lost:
        r2 = r3.next();
        a(r20, r2.substring(3, r2.length() - 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r10.length > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x01a8 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ac A[SYNTHETIC, Splitter:B:108:0x01ac] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
        // Method dump skipped, instructions count: 520
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.o.a(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
