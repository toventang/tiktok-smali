package com.ss.android.ugc.tools.d.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import h.f.b.l;
import java.util.Map;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f149161a = new a((byte) 0);

    static {
        Covode.recordClassIndex(98230);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98231);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static void a() {
        Keva repo = Keva.getRepo("bundle_survive_count_repo");
        l.b(repo, "");
        Map<String, ?> all = repo.getAll();
        l.b(all, "");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) value).intValue() > 1) {
                l.b(key, "");
                l.d(key, "");
                Keva.getRepo("large_transaction_repo").erase(key);
                Keva.getRepo("bundle_survive_count_repo").erase(key);
            }
        }
    }

    public static byte[] a(String str) {
        l.d(str, "");
        byte[] bytesJustDisk = Keva.getRepo("large_transaction_repo").getBytesJustDisk(str, new byte[0]);
        l.b(bytesJustDisk, "");
        return bytesJustDisk;
    }
}
