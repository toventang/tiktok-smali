package com.ss.ugc.live.a.a.c;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.a.a.c;

public class a extends RuntimeException {
    private c mRequest;

    static {
        Covode.recordClassIndex(102704);
    }

    public c getResourceRequest() {
        return this.mRequest;
    }

    public long getResourceId() {
        return this.mRequest.f154005b;
    }

    public String toString() {
        String runtimeException = super.toString();
        Throwable cause = getCause();
        if (cause == null || cause == this) {
            return runtimeException;
        }
        return runtimeException + "\n" + cause.toString();
    }

    public String getMessage() {
        StringBuilder append = new StringBuilder().append(this.mRequest.toString()).append("\navailable disk space:");
        String path = Environment.getDataDirectory().getPath();
        int i2 = Build.VERSION.SDK_INT;
        StatFs statFs = new StatFs(path);
        return append.append((statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong()) / 1024).append("KB\n").append(super.getMessage()).toString();
    }

    public a(c cVar) {
        this.mRequest = cVar;
    }

    public a(String str, c cVar) {
        super(str);
        this.mRequest = cVar;
    }

    public a(String str, Throwable th, c cVar) {
        super(str, th);
        this.mRequest = cVar;
    }
}
