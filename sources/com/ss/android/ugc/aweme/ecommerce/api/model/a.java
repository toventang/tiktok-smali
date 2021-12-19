package com.ss.android.ugc.aweme.ecommerce.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;

public class a<T> {
    public static final C2022a Companion = new C2022a((byte) 0);
    @c(a = "code")
    public final int code;
    @c(a = "data")
    public final T data;
    @c(a = "message")
    public final String message;

    static {
        Covode.recordClassIndex(52856);
    }

    public a() {
        this(0, null, null, 7, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.api.model.a$a  reason: collision with other inner class name */
    public static final class C2022a {
        static {
            Covode.recordClassIndex(52857);
        }

        private C2022a() {
        }

        public /* synthetic */ C2022a(byte b2) {
            this();
        }
    }

    public final boolean isCodeOK() {
        if (this.code == 0) {
            return true;
        }
        return false;
    }

    public a(int i2, String str, T t) {
        this.code = i2;
        this.message = str;
        this.data = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i2, String str, Object obj, int i3, g gVar) {
        this((i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? null : obj);
    }
}
