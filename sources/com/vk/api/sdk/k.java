package com.vk.api.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.l;

public final class k implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f156352a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f156353b;

    static {
        Covode.recordClassIndex(103837);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103838);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public /* synthetic */ k(Context context) {
        this(context, "com.vkontakte.android_pref_name");
    }

    @Override // com.vk.api.sdk.h
    public final String a(String str) {
        l.c(str, "");
        return this.f156353b.getString(str, null);
    }

    @Override // com.vk.api.sdk.h
    public final void b(String str) {
        l.c(str, "");
        this.f156353b.edit().remove(str).apply();
    }

    private k(Context context, String str) {
        l.c(context, "");
        l.c(str, "");
        this.f156353b = d.a(context, str, 0);
    }

    @Override // com.vk.api.sdk.h
    public final void a(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        this.f156353b.edit().putString(str, str2).apply();
    }

    @Override // com.vk.api.sdk.h
    public final void b(String str, String str2) {
        l.c(str, "");
        l.c(str, "");
        if (str2 != null) {
            a(str, str2);
        } else {
            b(str);
        }
    }
}
