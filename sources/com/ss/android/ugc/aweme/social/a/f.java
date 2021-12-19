package com.ss.android.ugc.aweme.social.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import h.f.b.m;
import h.h;
import h.i;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f133665a;

    /* renamed from: b  reason: collision with root package name */
    public static final f f133666b = new f();

    /* renamed from: c  reason: collision with root package name */
    private static final h f133667c = i.a((h.f.a.a) a.f133668a);

    public static int a() {
        return ((Number) f133667c.getValue()).intValue();
    }

    private f() {
    }

    static final class a extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f133668a = new a();

        static {
            Covode.recordClassIndex(87434);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a().a(true, "follow_back_on_vertical_share_panel_type", 0));
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(87433);
        if (a() > 0) {
            z = true;
        } else {
            z = false;
        }
        f133665a = z;
    }
}
