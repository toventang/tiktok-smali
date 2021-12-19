package com.ss.android.ugc.aweme.common;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class ag {

    /* renamed from: a  reason: collision with root package name */
    public static final a f76392a = new a((byte) 0);

    static {
        Covode.recordClassIndex(47145);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47146);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static float a(float f2, Resources resources) {
            if (resources == null) {
                return 0.0f;
            }
            return TypedValue.applyDimension(1, f2, resources.getDisplayMetrics());
        }

        public static float a(Context context, float f2) {
            l.d(context, "");
            Resources resources = context.getResources();
            l.b(resources, "");
            return f2 * resources.getDisplayMetrics().density;
        }
    }
}
