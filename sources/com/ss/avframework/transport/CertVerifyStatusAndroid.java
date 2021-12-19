package com.ss.avframework.transport;

import com.bytedance.covode.number.Covode;

public class CertVerifyStatusAndroid {
    public static int EXPIRED = -3;
    public static int FAILED = -1;
    public static int INCORRECT_KEY_USAGE = -6;
    public static int NOT_YET_VALID = -4;
    public static int NO_TRUSTED_ROOT = -2;
    public static int OK;
    public static int UNABLE_TO_PARSE = -5;

    static {
        Covode.recordClassIndex(100566);
    }
}
