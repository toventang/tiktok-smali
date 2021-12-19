package com.ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f140026a;

    static {
        Covode.recordClassIndex(91512);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f140027a;

        static {
            Covode.recordClassIndex(91513);
        }

        public final b a() {
            return new b(this.f140027a);
        }

        public final a a(c cVar) {
            l.d(cVar, "");
            this.f140027a = cVar.getTag() | this.f140027a;
            return this;
        }
    }

    public b(int i2) {
        this.f140026a = i2;
    }
}
