package com.ss.android.ugc.effectmanager.common.download;

import com.bytedance.covode.number.Covode;
import h.f.b.g;

public final class DownloadException extends Exception {
    public static final Companion Companion = new Companion(null);
    private final int errorCode;

    static {
        Covode.recordClassIndex(95285);
    }

    public static final class Companion {
        static {
            Covode.recordClassIndex(95286);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public DownloadException(int i2) {
        this.errorCode = i2;
    }
}
