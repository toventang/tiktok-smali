package com.bytedance.ies.im.core.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f34034a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final h f34035b = i.a((h.f.a.a) a.f34036a);

    public static boolean a() {
        return ((Boolean) f34035b.getValue()).booleanValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34036a = new a();

        static {
            Covode.recordClassIndex(20268);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            boolean z = true;
            if (b.a().a(true, "im_sync_time", 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    static {
        Covode.recordClassIndex(20267);
    }
}
