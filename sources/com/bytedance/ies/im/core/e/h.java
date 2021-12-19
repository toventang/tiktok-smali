package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.im.core.a.j;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final j f34071a = new j();

    /* renamed from: b  reason: collision with root package name */
    static final h.h f34072b = i.a((h.f.a.a) a.f34074a);

    /* renamed from: c  reason: collision with root package name */
    public static final h f34073c = new h();

    private h() {
    }

    static final class a extends m implements h.f.a.a<j> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34074a = new a();

        static {
            Covode.recordClassIndex(20291);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ j invoke() {
            return a();
        }

        private static j a() {
            j jVar;
            try {
                jVar = (j) b.a().a(true, "im_sdk_optimize_conv_list_pull", j.class);
            } catch (Throwable unused) {
                jVar = h.f34071a;
            }
            if (jVar == null) {
                return h.f34071a;
            }
            return jVar;
        }
    }

    static {
        Covode.recordClassIndex(20290);
    }
}
