package com.bytedance.hox;

import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.a.b;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public interface c extends k {
    static {
        Covode.recordClassIndex(18029);
    }

    List<b> T_();

    public static final class a {
        static {
            Covode.recordClassIndex(18030);
        }

        public static void a(c cVar, m mVar, i.a aVar) {
            l.c(mVar, "");
            l.c(aVar, "");
            List<b> T_ = cVar.T_();
            if (T_ != null) {
                Iterator<T> it = T_.iterator();
                while (it.hasNext()) {
                    it.next();
                    aVar.ordinal();
                }
            }
        }
    }
}
