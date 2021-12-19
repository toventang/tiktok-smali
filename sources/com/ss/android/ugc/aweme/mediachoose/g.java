package com.ss.android.ugc.aweme.mediachoose;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import h.f.a.b;
import h.f.b.l;
import h.m.p;
import h.z;
import java.util.Objects;

public interface g {
    static {
        Covode.recordClassIndex(70066);
    }

    void a();

    void a(MediaModel mediaModel, long j2, long j3, b<? super f, z> bVar, b<? super f, z> bVar2);

    void a(String str);

    public static final class a {
        static {
            Covode.recordClassIndex(70067);
        }

        public static String a(String str) {
            Integer valueOf;
            if (str == null || (valueOf = Integer.valueOf(p.b((CharSequence) str, '.'))) == null || valueOf.intValue() == -1) {
                return "empty_file_suffix";
            }
            int intValue = valueOf.intValue();
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String substring = str.substring(intValue);
            l.b(substring, "");
            return substring;
        }
    }
}
