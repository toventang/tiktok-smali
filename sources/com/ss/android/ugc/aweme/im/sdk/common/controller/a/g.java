package com.ss.android.ugc.aweme.im.sdk.common.controller.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f102177a = new g();

    /* renamed from: b  reason: collision with root package name */
    private static final h f102178b = i.a((h.f.a.a) a.f102179a);

    public static int a() {
        return ((Number) f102178b.getValue()).intValue();
    }

    private g() {
    }

    public static boolean c() {
        if (a() > 1) {
            return true;
        }
        return false;
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102179a = new a();

        static {
            Covode.recordClassIndex(65388);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "im_unread_view_style", 0));
        }
    }

    static {
        Covode.recordClassIndex(65387);
    }

    public static boolean b() {
        if (a() == 1 || a() == 2 || a() == 3) {
            return true;
        }
        return false;
    }
}
