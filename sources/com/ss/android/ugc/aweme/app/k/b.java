package com.ss.android.ugc.aweme.app.k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import h.m.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f66816a = new a((byte) 0);

    static {
        Covode.recordClassIndex(41131);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41132);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static String a(Map<String, ? extends Object> map) {
            if (map == null) {
                return "";
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                stringBuffer.append(entry.getKey() + '=' + entry.getValue());
                stringBuffer.append("&");
            }
            String stringBuffer2 = stringBuffer.toString();
            l.b(stringBuffer2, "");
            if (!p.c(stringBuffer2, "&", false)) {
                return stringBuffer2;
            }
            Objects.requireNonNull(stringBuffer2, "null cannot be cast to non-null type java.lang.String");
            String substring = stringBuffer2.substring(0, stringBuffer2.length() - 1);
            l.b(substring, "");
            return substring;
        }

        public static HashMap<String, Object> a(String str) {
            l.d(str, "");
            HashMap<String, Object> hashMap = new HashMap<>(0);
            if (TextUtils.isEmpty(str)) {
                return hashMap;
            }
            Object[] array = p.c(str, new String[]{"&"}).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            for (String str2 : (String[]) array) {
                Object[] array2 = p.c(str2, new String[]{"="}).toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array2;
                if (strArr.length == 2) {
                    hashMap.put(strArr[0], strArr[1]);
                }
            }
            return hashMap;
        }
    }
}
