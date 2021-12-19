package com.ss.android.ugc.aweme.publish.g.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.shortvideo.ee;
import com.ss.android.ugc.aweme.shortvideo.upload.y;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.vesdk.z;
import h.a.i;
import h.f.b.l;
import java.io.IOException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f118800a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final Integer[] f118801b = {-5, -110, 120000};

    private a() {
    }

    static {
        Covode.recordClassIndex(77153);
    }

    public static final boolean a(int i2) {
        return i.a(f118801b, Integer.valueOf(i2));
    }

    public static final int b(Throwable th) {
        if (th instanceof ee) {
            return ((ee) th).getCode();
        }
        if (th instanceof z) {
            return ((z) th).getRetCd();
        }
        return 10038;
    }

    public static final boolean c(Throwable th) {
        l.d(th, "");
        int b2 = b(th);
        if (b2 == -66666 || b2 == -6666601) {
            return true;
        }
        return false;
    }

    public static final int d(Throwable th) {
        l.d(th, "");
        if (th instanceof y) {
            y yVar = (y) th;
            if (yVar.getErrorCode() != 0) {
                return (int) yVar.getErrorCode();
            }
        }
        return 12;
    }

    public static final boolean a(Throwable th) {
        l.d(th, "");
        long min = Math.min(e.f(), 2147483647L);
        Throwable cause = th.getCause();
        if (!(cause instanceof IOException)) {
            return false;
        }
        if (l.a((Object) cause.getMessage(), (Object) "write failed: ENOSPC (No space left on device)") || min < 100) {
            return true;
        }
        return false;
    }

    public static final String e(Throwable th) {
        BaseResponse.ServerTimeExtra serverTimeExtra;
        l.d(th, "");
        if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getRawResponse();
            if ((rawResponse instanceof BaseResponse) && (serverTimeExtra = ((BaseResponse) rawResponse).extra) != null) {
                String str = serverTimeExtra.logid;
                if (str == null) {
                    return "empty_logid";
                }
                return str;
            }
        }
        return "";
    }

    public static final int a(Throwable th, int i2) {
        l.d(th, "");
        if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            return ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
        }
        return i2;
    }
}
