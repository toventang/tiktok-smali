package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class hc {

    /* renamed from: a  reason: collision with root package name */
    public static TypedValue f143052a = new TypedValue();

    /* renamed from: b  reason: collision with root package name */
    public static DisplayMetrics f143053b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f143054c = new a((byte) 0);

    public static final class a {
        static {
            Covode.recordClassIndex(93621);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private static void a(Context context) {
            if (hc.f143053b == null) {
                Resources resources = context.getResources();
                l.b(resources, "");
                hc.f143053b = resources.getDisplayMetrics();
            }
        }

        public static float a(Context context, float f2) {
            if (context == null) {
                return f2;
            }
            a(context);
            DisplayMetrics displayMetrics = hc.f143053b;
            DisplayMetrics displayMetrics2 = hc.f143053b;
            if (displayMetrics2 == null) {
                l.b();
            }
            float f3 = 3.0f;
            if (displayMetrics2.density < 3.0f) {
                f3 = 2.0f;
            }
            return (f2 * f3) + 0.5f;
        }
    }

    static {
        Covode.recordClassIndex(93620);
    }
}
