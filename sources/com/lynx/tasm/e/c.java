package com.lynx.tasm.e;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.j;
import com.lynx.tasm.d.a;
import com.lynx.tasm.utils.l;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f56602a = new a() {
        /* class com.lynx.tasm.e.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(35298);
        }
    };

    static {
        Covode.recordClassIndex(35297);
    }

    public static void a(a aVar) {
        f56602a = aVar;
    }

    public static abstract class a {
        static {
            Covode.recordClassIndex(35299);
        }

        public static void a(j jVar, String str) {
            if (jVar.f55905m != null) {
                jVar.f55905m.a(new com.lynx.tasm.j(str, 301));
            }
        }

        public final Typeface b(j jVar, a.EnumC1269a aVar, String str) {
            return a(jVar, aVar, str);
        }

        /* access modifiers changed from: protected */
        public Typeface a(j jVar, a.EnumC1269a aVar, String str) {
            if (!TextUtils.isEmpty(str) && aVar != a.EnumC1269a.LOCAL) {
                int indexOf = str.indexOf("base64,");
                if (str.startsWith("data:") && indexOf != -1) {
                    try {
                        return l.a(jVar, Base64.decode(str.substring(indexOf + 7), 0));
                    } catch (Exception e2) {
                        jVar.a(str, "font", e2.getMessage());
                    }
                }
            }
            return null;
        }
    }
}
