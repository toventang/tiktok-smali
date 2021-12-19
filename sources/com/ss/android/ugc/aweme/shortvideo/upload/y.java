package com.ss.android.ugc.aweme.shortvideo.upload;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.uploader.g;
import h.a.i;
import h.f.b.l;

public final class y extends RuntimeException {
    public static final a Companion = new a((byte) 0);
    public static final Integer[] USER_NETWORK_BAD_CODES = {-5, -110, 120000};
    private final g mInfo;

    public y() {
        this(null, 1, null);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(86560);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final long getErrorCode() {
        g gVar = this.mInfo;
        if (gVar != null) {
            return gVar.f142019f;
        }
        return 0;
    }

    public final String toString() {
        return "UploadException(mInfo=" + this.mInfo + ')';
    }

    static {
        Covode.recordClassIndex(86559);
    }

    public y(g gVar) {
        this.mInfo = gVar;
    }

    public static final boolean isUserNetworkBad(int i2) {
        return i.a(USER_NETWORK_BAD_CODES, Integer.valueOf(i2));
    }

    public static final int resolveErrorCode(Throwable th) {
        l.d(th, "");
        if (th instanceof y) {
            y yVar = (y) th;
            if (yVar.getErrorCode() != 0) {
                return (int) yVar.getErrorCode();
            }
        }
        return 12;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(g gVar, int i2, h.f.b.g gVar2) {
        this((i2 & 1) != 0 ? null : gVar);
    }
}
