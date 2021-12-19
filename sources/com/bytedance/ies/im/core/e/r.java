package com.bytedance.ies.im.core.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    static final h f34119a = i.a((h.f.a.a) a.f34123a);

    /* renamed from: b  reason: collision with root package name */
    public static final r f34120b = new r();

    /* renamed from: c  reason: collision with root package name */
    private static final int f34121c = 1;

    /* renamed from: d  reason: collision with root package name */
    private static final int f34122d = 2;

    private r() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34123a = new a();

        static {
            Covode.recordClassIndex(20314);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "im_sdk_retry_del_con", 0));
        }
    }

    static {
        Covode.recordClassIndex(20313);
    }
}
