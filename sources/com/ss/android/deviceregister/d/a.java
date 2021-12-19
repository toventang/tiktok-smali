package com.ss.android.deviceregister.d;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static e<String> f59465a = new C1295a((byte) 0);

    /* renamed from: com.ss.android.deviceregister.d.a$a  reason: collision with other inner class name */
    public static class C1295a extends e<String> {
        static {
            Covode.recordClassIndex(36714);
        }

        private C1295a() {
        }

        public /* synthetic */ C1295a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* access modifiers changed from: protected */
        @Override // com.ss.android.deviceregister.d.e
        public final /* synthetic */ String a(Object[] objArr) {
            if (objArr == null || objArr[0] == null) {
                return null;
            }
            SharedPreferences a2 = d.a((Context) objArr[0], "com.ss.android.deviceregister.utils.Cdid", 0);
            String string = a2.getString("cdid", "");
            if (!TextUtils.isEmpty(string)) {
                return string;
            }
            String uuid = UUID.randomUUID().toString();
            a2.edit().putString("cdid", uuid).apply();
            return uuid;
        }
    }

    static {
        Covode.recordClassIndex(36713);
    }

    public static String a(Context context) {
        return f59465a.b(context);
    }
}
