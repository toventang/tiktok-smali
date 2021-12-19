package com.ss.android.ugc.aweme.ml.ab;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.setting.model.MLModel;

public interface g {
    static {
        Covode.recordClassIndex(70849);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static boolean f110372a;

        /* renamed from: b  reason: collision with root package name */
        public static MLModel f110373b;

        static {
            Covode.recordClassIndex(70850);
        }

        public static MLModel a() {
            if (!f110372a) {
                try {
                    f110373b = (MLModel) b.a().a(false, "speed_ml", MLModel.class);
                } catch (Throwable unused) {
                    f110373b = null;
                }
                f110372a = true;
            }
            return f110373b;
        }
    }
}
