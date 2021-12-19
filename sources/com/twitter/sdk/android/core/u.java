package com.twitter.sdk.android.core;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.f;
import com.twitter.sdk.android.core.internal.b.e;

public class u extends i<TwitterAuthToken> {
    @c(a = "user_name")

    /* renamed from: c  reason: collision with root package name */
    public final String f156193c;

    static {
        Covode.recordClassIndex(103739);
    }

    /* access modifiers changed from: package-private */
    public static class a implements e<u> {

        /* renamed from: a  reason: collision with root package name */
        private final f f156194a = new f();

        static {
            Covode.recordClassIndex(103740);
        }

        a() {
        }

        /* access modifiers changed from: private */
        public String a(u uVar) {
            if (uVar == null || uVar.f155913a == null) {
                return "";
            }
            try {
                return this.f156194a.b(uVar);
            } catch (Exception e2) {
                f c2 = k.c();
                e2.getMessage();
                c2.b();
                return "";
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public u a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                return (u) this.f156194a.a(str, u.class);
            } catch (Exception e2) {
                f c2 = k.c();
                e2.getMessage();
                c2.b();
                return null;
            }
        }
    }

    @Override // com.twitter.sdk.android.core.i
    public int hashCode() {
        int i2;
        int hashCode = super.hashCode() * 31;
        String str = this.f156193c;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    @Override // com.twitter.sdk.android.core.i
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f156193c;
        String str2 = ((u) obj).f156193c;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public u(TwitterAuthToken twitterAuthToken, long j2, String str) {
        super(twitterAuthToken, j2);
        this.f156193c = str;
    }
}
