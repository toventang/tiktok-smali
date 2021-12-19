package com.ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.b;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static HashMap<String, b> f89433a = new HashMap<>();

    static {
        Covode.recordClassIndex(56197);
    }

    public static void b(String str) {
        f89433a.remove(str);
    }

    public static b a(String str) {
        return f89433a.get(str);
    }

    public static void a(String str, b bVar) {
        f89433a.put(str, bVar);
    }
}
