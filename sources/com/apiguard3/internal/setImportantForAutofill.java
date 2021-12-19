package com.apiguard3.internal;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;

public final class setImportantForAutofill {
    private static int getHeaders = 1;
    private static int getMethod;

    public interface AGRequest {
        static {
            Covode.recordClassIndex(2597);
        }

        void AGRequest(Throwable th);

        void getUrl();
    }

    public interface getBody {
        static {
            Covode.recordClassIndex(2598);
        }

        void AGRequest(String str);

        String getBody(String str);

        void getHeaders(String str);

        String[] getHeaders();
    }

    public interface getMethod {
        static {
            Covode.recordClassIndex(2599);
        }

        void getBody(Context context, String[] strArr, String str, File file, setContentCaptureSession setcontentcapturesession);
    }

    static {
        Covode.recordClassIndex(2596);
    }

    setImportantForAutofill() {
    }

    public static boolean getMethod(CharSequence charSequence) {
        if (charSequence != null) {
            int i2 = getHeaders + 49;
            getMethod = i2 % 128;
            int i3 = i2 % 2;
            int length = charSequence.length();
            if (i3 != 0) {
                throw new NullPointerException("hashCode");
            } else if (length != 0) {
                int i4 = getHeaders + 83;
                getMethod = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }

    public static void AGRequest(Context context, String str, AGRequest aGRequest) {
        new setContentCaptureSession().getMethod(context, str, null, aGRequest);
        int i2 = getHeaders + 121;
        getMethod = i2 % 128;
        if (i2 % 2 != 0) {
            throw new NullPointerException("hashCode");
        }
    }
}
