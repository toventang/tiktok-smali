package com.benchmark.tools;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

public class g {

    /* renamed from: c  reason: collision with root package name */
    public static Context f6379c;

    /* renamed from: d  reason: collision with root package name */
    public static b f6380d;

    /* renamed from: e  reason: collision with root package name */
    public static b f6381e = new a();

    public interface b {
        static {
            Covode.recordClassIndex(3067);
        }

        boolean a(List<String> list);
    }

    static {
        Covode.recordClassIndex(3065);
    }

    public static class a implements b {
        static {
            Covode.recordClassIndex(3066);
        }

        @Override // com.benchmark.tools.g.b
        public final boolean a(List<String> list) {
            System.currentTimeMillis();
            for (String str : list) {
                System.currentTimeMillis();
                if (!h.a(str, g.f6379c)) {
                    return false;
                }
                System.currentTimeMillis();
            }
            return true;
        }
    }
}
