package com.bytedance.platform.godzilla.b.a.b.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import java.util.ArrayList;
import java.util.List;

public final class a implements com.bytedance.platform.godzilla.b.a.a.b.a {

    /* renamed from: a  reason: collision with root package name */
    private static List<String> f41972a;

    static {
        Covode.recordClassIndex(25637);
        ArrayList arrayList = new ArrayList();
        f41972a = arrayList;
        arrayList.add("FILE_PROVIDER_PATHS");
        f41972a.add("NullPointerException");
        f41972a.add("Failed to resolve canonical path");
        f41972a.add("android.os.DeadSystemException");
        f41972a.add("Package manager has died");
    }

    @Override // com.bytedance.platform.godzilla.b.a.a.b.a
    public final boolean a(Object obj, Throwable th) {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getMethodName().contains("installProvider") && th != null) {
                String th2 = th.toString();
                for (String str : f41972a) {
                    if (th2.contains(str)) {
                        "Hint the crash ".concat(String.valueOf(str));
                        g.a(g.a.DEBUG);
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }
}
