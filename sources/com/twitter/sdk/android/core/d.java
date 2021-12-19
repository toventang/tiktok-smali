package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.g;
import com.twitter.sdk.android.core.internal.b.e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import java.lang.reflect.Type;

public class d extends i<GuestAuthToken> {
    static {
        Covode.recordClassIndex(103587);
    }

    public d(GuestAuthToken guestAuthToken) {
        super(guestAuthToken, 0);
    }

    public static class a implements e<d> {

        /* renamed from: a  reason: collision with root package name */
        private final f f155898a = new g().a((Type) GuestAuthToken.class, (Object) new AuthTokenAdapter()).b();

        static {
            Covode.recordClassIndex(103588);
        }

        /* access modifiers changed from: private */
        public String a(d dVar) {
            if (dVar == null || dVar.f155913a == null) {
                return "";
            }
            try {
                return this.f155898a.b(dVar);
            } catch (Exception e2) {
                f c2 = k.c();
                e2.getMessage();
                c2.b();
                return "";
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public d a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (d) this.f155898a.a(str, d.class);
            } catch (Exception e2) {
                f c2 = k.c();
                e2.getMessage();
                c2.b();
                return null;
            }
        }
    }
}
