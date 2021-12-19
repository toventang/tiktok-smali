package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    static final int f34091a = 1;

    /* renamed from: b  reason: collision with root package name */
    static final h f34092b = i.a((h.f.a.a) a.f34094a);

    /* renamed from: c  reason: collision with root package name */
    public static final l f34093c = new l();

    private l() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34094a = new a();

        static {
            Covode.recordClassIndex(20300);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "im_recent_msg_async_opt", 0) != l.f34091a) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(20299);
    }
}
