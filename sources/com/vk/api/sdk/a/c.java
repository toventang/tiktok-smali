package com.vk.api.sdk.a;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.vk.api.sdk.a.a;
import com.vk.api.sdk.f.g;
import com.vk.api.sdk.h;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f156219b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h f156220a;

    static {
        Covode.recordClassIndex(103751);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(103752);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final boolean a() {
        a b2 = a.C4121a.b(this.f156220a);
        if (b2 == null || !b2.a()) {
            return false;
        }
        return true;
    }

    private static Bundle b(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public c(h hVar) {
        l.c(hVar, "");
        this.f156220a = hVar;
    }

    public static e a(Intent intent) {
        Map hashMap;
        if (intent.hasExtra("extra-token-data")) {
            hashMap = g.a(a(intent, "extra-token-data"));
            if (hashMap == null) {
                return null;
            }
        } else if (b(intent) == null) {
            return null;
        } else {
            hashMap = new HashMap();
            Bundle b2 = b(intent);
            if (b2 == null) {
                l.a();
            }
            for (String str : b2.keySet()) {
                l.a((Object) str, "");
                Bundle b3 = b(intent);
                if (b3 == null) {
                    l.a();
                }
                hashMap.put(str, String.valueOf(a(b3, str)));
            }
        }
        if (hashMap.get("error") != null) {
            return null;
        }
        try {
            return new e(new a(hashMap), (byte) 0);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
