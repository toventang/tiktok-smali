package com.ss.android.ugc.aweme.discover.mixfeed.lynx;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.mixfeed.lynx.Api;
import h.f.b.l;
import h.z;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static i<a> f81820a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f81821b;

    /* renamed from: c  reason: collision with root package name */
    public static final d f81822c = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(50816);
    }

    static final class a<TTaskResult, TContinuationResult> implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f81823a = new a();

        static {
            Covode.recordClassIndex(50817);
        }

        a() {
        }

        @Override // b.g
        public final /* bridge */ /* synthetic */ Object then(i iVar) {
            d.f81821b = false;
            return z.f158842a;
        }
    }

    public static void a(String str) {
        l.d(str, "");
        if (!f81821b) {
            f81821b = true;
            i<a> fetchSchema = Api.a.f81812a.fetchSchema(str, 1);
            f81820a = fetchSchema;
            if (fetchSchema != null) {
                fetchSchema.a(a.f81823a);
            }
        }
    }
}
