package com.tencent.wcdb;

import com.bytedance.covode.number.Covode;
import com.tencent.wcdb.database.SQLiteDatabase;
import com.tencent.wcdb.database.m;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f154689a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        Covode.recordClassIndex(103071);
    }

    public static int a(String[] strArr) {
        int length = strArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr[i2].equals("_id")) {
                return i2;
            }
        }
        return -1;
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder();
        a(sb, str);
        return sb.toString();
    }

    public static int b(String str) {
        String trim = str.trim();
        if (trim.length() < 3) {
            return 99;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int charAt = trim.charAt(i2);
            if (charAt < 97 || charAt > 122) {
                if (charAt >= 128) {
                    break;
                }
            } else {
                charAt = (charAt - 97) + 65;
            }
            i3 |= (charAt & 127) << (i2 * 8);
            i2++;
            if (i2 >= 3) {
                switch (i3) {
                    case 4279873:
                    case 5522756:
                        return 9;
                    case 4280912:
                        return 7;
                    case 4476485:
                    case 5066563:
                        return 5;
                    case 4477013:
                    case 4998468:
                    case 5260626:
                    case 5459529:
                        return 2;
                    case 4543043:
                    case 5198404:
                    case 5524545:
                        return 8;
                    case 4670786:
                        return 4;
                    case 4998483:
                        return 1;
                    case 5001042:
                        return 6;
                    case 5526593:
                        return 3;
                }
            }
        }
        return 99;
    }

    public static int a(int i2, int i3) {
        return Math.max(i2 - (i3 / 3), 0);
    }

    public static String b(SQLiteDatabase sQLiteDatabase, String str) {
        m a2 = sQLiteDatabase.a(str);
        try {
            return a2.j();
        } finally {
            a2.close();
        }
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String str) {
        m a2 = sQLiteDatabase.a(str);
        try {
            return a2.i();
        } finally {
            a2.close();
        }
    }

    private static void a(StringBuilder sb, String str) {
        sb.append('\'');
        if (str.indexOf(39) != -1) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if (charAt == '\'') {
                    sb.append('\'');
                }
                sb.append(charAt);
            }
        } else {
            sb.append(str);
        }
        sb.append('\'');
    }
}
