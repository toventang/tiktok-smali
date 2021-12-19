package com.apiguard3.internal;

import com.bytedance.covode.number.Covode;

public interface log {

    public interface getMethod {
        static {
            Covode.recordClassIndex(2558);
        }

        String AGRequest();
    }

    static {
        Covode.recordClassIndex(2556);
    }

    void getHeaders(APIGuard$Callback aPIGuard$Callback);

    void getUrl(getBody getbody);

    public enum getBody {
        getMethod(-1),
        getHeaders(0),
        getUrl(1),
        getBody(2),
        AGRequest(3),
        addHeader(4),
        method(Integer.MAX_VALUE);
        
        private static char[] AGRequest$Builder;
        private static int get;
        private static long newBuilder;
        private static int post = 1;
        private int level;

        static void getHeaders() {
            AGRequest$Builder = new char[]{'E', 12423, 25080, 37424, 49926, 62582, 9405, 21906, 34532, 46897, 59408, 6502, 18879, 31386, 43719, 39429, 52090, 14514, 27012, 24308, 36392, 65300, 11366, 7610, 17053, 46048, 58154, 53249, 381, 56214, 60245, 47673, 18928, 6364, 12198, 65400, 9520, 5602, 17557, 46921, 'D', 12432, 25064, 37418, 49939, 'T', 12423, 25067, 37436, 49937, 'L', 12432, 25084, 37434, 49944, 62582, 9395, 21906, 34544};
            newBuilder = -1535349097057799979L;
        }

        public final int getBody() {
            int i2 = get + 75;
            int i3 = i2 % 128;
            post = i3;
            int i4 = i2 % 2;
            int i5 = this.level;
            int i6 = i3 + 19;
            get = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static {
            Covode.recordClassIndex(2557);
            get = 0;
            getHeaders();
            int i2 = post + 87;
            get = i2 % 128;
            int i3 = i2 % 2;
        }

        public static getBody valueOf(String str) {
            int i2 = get + 113;
            post = i2 % 128;
            int i3 = i2 % 2;
            getBody getbody = (getBody) Enum.valueOf(getBody.class, str);
            int i4 = post + 109;
            get = i4 % 128;
            int i5 = i4 % 2;
            return getbody;
        }

        public static getBody AGRequest(int i2) {
            int i3 = post;
            int i4 = i3 + 85;
            get = i4 % 128;
            int i5 = i4 % 2;
            if (i2 == -1) {
                return getMethod;
            }
            if (i2 == 0) {
                return getHeaders;
            }
            if (i2 == 1) {
                return getUrl;
            }
            if (i2 == 2) {
                getBody getbody = getBody;
                int i6 = i3 + 19;
                get = i6 % 128;
                if (i6 % 2 == 0) {
                    return getbody;
                }
                throw new NullPointerException("hashCode");
            } else if (i2 == 3) {
                return AGRequest;
            } else {
                if (i2 == 4) {
                    return addHeader;
                }
                getBody getbody2 = method;
                int i7 = i3 + 69;
                get = i7 % 128;
                int i8 = i7 % 2;
                return getbody2;
            }
        }

        private getBody(int i2) {
            this.level = i2;
        }

        private static String getUrl(int i2, int i3, char c2) {
            int i4 = get + 115;
            post = i4 % 128;
            int i5 = i4 % 2;
            char[] cArr = new char[i3];
            for (int i6 = 0; i6 < i3; i6++) {
                int i7 = post + 75;
                get = i7 % 128;
                int i8 = i7 % 2;
                cArr[i6] = (char) ((int) ((((long) AGRequest$Builder[i2 + i6]) ^ (((long) i6) * newBuilder)) ^ ((long) c2)));
            }
            return new String(cArr);
        }
    }
}
