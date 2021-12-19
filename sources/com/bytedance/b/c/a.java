package com.bytedance.b.c;

import android.text.TextUtils;
import com.bytedance.b.k.f;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.CopyOnWriteArraySet;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f25979b;

    /* renamed from: a  reason: collision with root package name */
    public CopyOnWriteArraySet<String> f25980a = new CopyOnWriteArraySet<>();

    /* renamed from: com.bytedance.b.c.a$a  reason: collision with other inner class name */
    public interface AbstractC0555a {
        static {
            Covode.recordClassIndex(15144);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(15145);
        }

        boolean a();
    }

    static {
        Covode.recordClassIndex(15143);
    }

    private a() {
    }

    public static a a() {
        if (f25979b == null) {
            synchronized (a.class) {
                if (f25979b == null) {
                    f25979b = new a();
                }
            }
        }
        return f25979b;
    }

    public final String b() {
        String a2 = f.a(this.f25980a.toArray(), "#");
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        return "";
    }
}
