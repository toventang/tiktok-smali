package com.ss.android.ugc.aweme.shortvideo.ui.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.property.bx;
import com.ss.android.ugc.tools.utils.q;
import h.f.b.l;
import h.f.b.m;

public final class ag {
    static {
        Covode.recordClassIndex(85992);
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f131258a = new a();

        static {
            Covode.recordClassIndex(85993);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (bx.a()) {
                c cVar = c.C1870c.f80046a;
                l.b(cVar, "");
                if (cVar.a()) {
                    z = true;
                    q.d("AVSecurityMobHelper open camera in background be intercepted");
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }
}
