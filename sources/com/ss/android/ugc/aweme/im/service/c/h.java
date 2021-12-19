package com.ss.android.ugc.aweme.im.service.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.i;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f103850a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final h.h f103851b = i.a((h.f.a.a) a.f103852a);

    private h() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f103852a = new a();

        static {
            Covode.recordClassIndex(66522);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "dm_push_message_preview", 0));
        }
    }

    static {
        Covode.recordClassIndex(66521);
    }

    public static boolean a() {
        if (((Number) f103851b.getValue()).intValue() > 0) {
            return true;
        }
        return false;
    }
}
