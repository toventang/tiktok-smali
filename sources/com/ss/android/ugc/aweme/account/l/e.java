package com.ss.android.ugc.aweme.account.l;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.regex.Pattern;

public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63153a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private Pattern f63154b = Pattern.compile(".*[A-Za-z].*");

    /* renamed from: c  reason: collision with root package name */
    private Pattern f63155c = Pattern.compile(".*[\\d].*");

    /* renamed from: d  reason: collision with root package name */
    private Pattern f63156d = Pattern.compile(".*[_~!@#$%^&*()+,.:;=<>?\\/|\\-\\[\\]\\\\].*");

    static {
        Covode.recordClassIndex(38900);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38901);
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
        if (!this.f63154b.matcher(str).matches() || !this.f63155c.matcher(str).matches() || !this.f63156d.matcher(str).matches()) {
            return false;
        }
        return true;
    }
}
