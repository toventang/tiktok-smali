package com.ss.android.ugc.aweme.account.l;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63152a = new a((byte) 0);

    static {
        Covode.recordClassIndex(38898);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38899);
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
        int length = str.length();
        if (8 <= length && 20 >= length) {
            return true;
        }
        return false;
    }
}
