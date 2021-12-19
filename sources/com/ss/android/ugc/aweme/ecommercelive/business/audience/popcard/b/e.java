package com.ss.android.ugc.aweme.ecommercelive.business.audience.popcard.b;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.utils.dg;
import h.f.b.l;

public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f87859b = new a((byte) 0);
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final int f87860a;

    static {
        Covode.recordClassIndex(55252);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(55253);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static e a(String str) {
            Object obj;
            l.d(str, "");
            try {
                obj = dg.a(str, e.class);
            } catch (Exception unused) {
                obj = null;
            }
            e eVar = (e) obj;
            if (eVar == null) {
                return new e(0);
            }
            return eVar;
        }
    }

    public e(int i2) {
        this.f87860a = i2;
    }
}
