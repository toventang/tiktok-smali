package com.bytedance.framwork.core.c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.UnsupportedEncodingException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static b f29489a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f29490b;

    public static class a implements b {
        static {
            Covode.recordClassIndex(17178);
        }

        @Override // com.bytedance.framwork.core.c.c.b
        public final boolean a(Context context) {
            return false;
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(17179);
        }

        boolean a(Context context);
    }

    static {
        Covode.recordClassIndex(17177);
    }

    public static byte[] a(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return str.getBytes("UTF-8");
                }
            } catch (UnsupportedEncodingException unused) {
                return str.getBytes();
            }
        }
        return null;
    }
}
