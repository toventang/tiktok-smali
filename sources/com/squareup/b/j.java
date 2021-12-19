package com.squareup.b;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.InputStream;

public interface j {
    static {
        Covode.recordClassIndex(36062);
    }

    a a(Uri uri, int i2);

    public static class b extends IOException {
        final boolean localCacheOnly;
        final int responseCode;

        static {
            Covode.recordClassIndex(36064);
        }

        public b(String str, int i2, int i3) {
            super(str);
            this.localCacheOnly = q.isOfflineOnly(i2);
            this.responseCode = i3;
        }
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f58046a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f58047b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f58048c;

        /* renamed from: d  reason: collision with root package name */
        public final long f58049d;

        static {
            Covode.recordClassIndex(36063);
        }

        public a(InputStream inputStream, boolean z, long j2) {
            if (inputStream != null) {
                this.f58046a = inputStream;
                this.f58047b = null;
                this.f58048c = z;
                this.f58049d = j2;
                return;
            }
            throw new IllegalArgumentException("Stream may not be null.");
        }
    }
}
