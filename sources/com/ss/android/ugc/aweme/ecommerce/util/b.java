package com.ss.android.ugc.aweme.ecommerce.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.local_test.a;
import h.f.b.m;
import h.h;
import h.i;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f87555a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final h f87556b = i.a((h.f.a.a) a.f87557a);

    public static String a() {
        return (String) f87556b.getValue();
    }

    private b() {
    }

    static final class a extends m implements h.f.a.a<String> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f87557a = new a();

        static {
            Covode.recordClassIndex(55038);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ String invoke() {
            if (a.C2792a.f108997a.f108996a.enableBoe()) {
                return "http://oec-api.tiktokv.com.boe-gateway.byted.org/";
            }
            return "https://oec-api.tiktokv.com/";
        }
    }

    static {
        Covode.recordClassIndex(55037);
    }
}
