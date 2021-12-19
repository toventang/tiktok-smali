package com.ss.android.ugc.aweme.sticker.types.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.q.f;
import com.ss.android.ugc.aweme.utils.ig;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final C3549a f136072c = new C3549a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f136073a;

    /* renamed from: b  reason: collision with root package name */
    public final f f136074b;

    static {
        Covode.recordClassIndex(88888);
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.f.a$a  reason: collision with other inner class name */
    public static final class C3549a {
        static {
            Covode.recordClassIndex(88889);
        }

        private C3549a() {
        }

        public /* synthetic */ C3549a(byte b2) {
            this();
        }

        public static boolean a(String str) {
            if (str == null) {
                return false;
            }
            return n.b(ig.a(R.string.f_g), ig.a(R.string.f_h), ig.a(R.string.f_8), "record_mode_mv").contains(str);
        }
    }

    public a(f fVar) {
        l.d(fVar, "");
        this.f136074b = fVar;
    }
}
