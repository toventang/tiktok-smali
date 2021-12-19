package com.ss.ugc.effectplatform.algorithm;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.ss.android.ugc.aweme.lancet.m;
import h.f.b.l;

public interface g {
    static {
        Covode.recordClassIndex(102329);
    }

    void loadLibrary(String str);

    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f153468a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(102330);
        }

        @Override // com.ss.ugc.effectplatform.algorithm.g
        public final void loadLibrary(String str) {
            l.c(str, "");
            long uptimeMillis = SystemClock.uptimeMillis();
            Librarian.a(str);
            m.a(uptimeMillis, str);
        }
    }
}
