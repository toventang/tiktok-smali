package com.ss.android.ugc.aweme.ab;

import com.bytedance.covode.number.Covode;

public final class a {
    static {
        Covode.recordClassIndex(38490);
    }

    public static int a(int i2) {
        if (i2 == 20000) {
            return 0;
        }
        if (i2 == 20015) {
            return -2;
        }
        if (i2 == 22001 || i2 == 20007 || i2 == 20008) {
            return -5;
        }
        switch (i2) {
            case 20003:
                return -4;
            case 20004:
            case 20005:
                return -2;
            default:
                switch (i2) {
                    case 20011:
                    case 20012:
                        return -5;
                    case 20013:
                        return -2;
                    default:
                        return -1;
                }
        }
    }
}
