package com.google.android.gms.auth.api.identity;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.r;
import java.util.Arrays;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public final String f49794a;

    static {
        Covode.recordClassIndex(31093);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f49795a;

        static {
            Covode.recordClassIndex(31094);
        }

        public a() {
        }

        public final f a() {
            return new f(this.f49795a);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public final a a(String str) {
            this.f49795a = r.a(str);
            return this;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{f.class});
    }

    public final boolean equals(Object obj) {
        return obj instanceof f;
    }

    public f(String str) {
        this.f49794a = str;
    }
}
