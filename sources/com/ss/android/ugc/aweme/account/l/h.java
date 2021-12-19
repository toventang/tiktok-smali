package com.ss.android.ugc.aweme.account.l;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.regex.Pattern;

public final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63162a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Pattern f63163b = Pattern.compile("^[\\w~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\]*$");

    static {
        Covode.recordClassIndex(38908);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38909);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.account.l.f
    public final boolean a(String str) {
        l.d(str, "");
        return this.f63163b.matcher(str).matches();
    }
}
