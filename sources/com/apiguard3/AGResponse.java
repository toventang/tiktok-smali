package com.apiguard3;

import android.text.TextUtils;
import com.apiguard3.internal.setNextFocusRightId;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AGResponse {
    private static int AGRequest$Builder = 1;
    private static int getUrl;
    private final String AGRequest;
    private final Map<String, String> getBody;
    private final String getHeaders;
    private final int getMethod;

    static {
        Covode.recordClassIndex(2479);
    }

    public static class Builder {
        private static long getUrl = 6187802629896706682L;
        private static int method;
        private static int url = 1;
        private final Map<String, String> AGRequest;
        private String getBody;
        private int getHeaders;
        private String getMethod;

        static {
            Covode.recordClassIndex(2480);
        }

        public Builder() {
            this.AGRequest = Collections.synchronizedMap(new LinkedHashMap());
        }

        public AGResponse build() {
            AGResponse aGResponse = new AGResponse(this);
            int i2 = method + 75;
            url = i2 % 128;
            if (i2 % 2 != 0) {
                return aGResponse;
            }
            throw new NullPointerException("hashCode");
        }

        public Builder delete() {
            int i2 = method + 71;
            url = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getHeaders("뵕봑⣢닝茦腔랞乿풭뛺").intern());
            int i4 = method + 97;
            url = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        public Builder get() {
            int i2 = url + 73;
            method = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getHeaders("쁨쀯領掋⽣倎ᯃ").intern());
            int i4 = method + 65;
            url = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        public Builder head() {
            int i2 = url + 29;
            method = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getHeaders("䢺䣲Ɍ顳ઈ꺷㸽憝").intern());
            int i4 = url + 53;
            method = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        public Builder post() {
            int i2 = url + 9;
            method = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getHeaders("魨ŝ髍ʪ깪춐").intern());
            int i4 = method + 33;
            url = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        public Builder put() {
            int i2 = method + 121;
            url = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getHeaders("喪嗺챕噺⎇듮ᜧ").intern());
            int i4 = method + 121;
            url = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        static /* synthetic */ Map AGRequest(Builder builder) {
            int i2 = method + 7;
            int i3 = i2 % 128;
            url = i3;
            int i4 = i2 % 2;
            Map<String, String> map = builder.AGRequest;
            int i5 = i3 + 57;
            method = i5 % 128;
            int i6 = i5 % 2;
            return map;
        }

        static /* synthetic */ int getBody(Builder builder) {
            int i2 = method + 85;
            int i3 = i2 % 128;
            url = i3;
            int i4 = i2 % 2;
            int i5 = builder.getHeaders;
            int i6 = i3 + 83;
            method = i6 % 128;
            int i7 = i6 % 2;
            return i5;
        }

        static /* synthetic */ String getUrl(Builder builder) {
            int i2 = method + 111;
            int i3 = i2 % 128;
            url = i3;
            int i4 = i2 % 2;
            String str = builder.getMethod;
            int i5 = i3 + 9;
            method = i5 % 128;
            int i6 = i5 % 2;
            return str;
        }

        public Builder method(String str) {
            int i2 = method;
            int i3 = i2 + 19;
            url = i3 % 128;
            int i4 = i3 % 2;
            this.getBody = str;
            int i5 = i2 + 25;
            url = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        public Builder statusCode(int i2) {
            int i3 = url + 103;
            int i4 = i3 % 128;
            method = i4;
            int i5 = i3 % 2;
            this.getHeaders = i2;
            int i6 = i4 + 35;
            url = i6 % 128;
            int i7 = i6 % 2;
            return this;
        }

        public Builder url(String str) {
            int i2 = method + 119;
            url = i2 % 128;
            if (i2 % 2 != 0) {
                this.getMethod = str;
                return this;
            }
            this.getMethod = str;
            throw new NullPointerException("hashCode");
        }

        Builder(AGResponse aGResponse) {
            Map<String, String> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
            this.AGRequest = synchronizedMap;
            this.getMethod = AGResponse.getUrl(aGResponse);
            this.getBody = AGResponse.getHeaders(aGResponse);
            this.getHeaders = AGResponse.AGRequest(aGResponse);
            synchronizedMap.putAll(aGResponse.getHeaders());
        }

        static /* synthetic */ String getMethod(Builder builder) {
            char c2;
            int i2 = method + 5;
            url = i2 % 128;
            if (i2 % 2 != 0) {
                c2 = '0';
            } else {
                c2 = 'U';
            }
            String str = builder.getBody;
            if (c2 == '0') {
                return str;
            }
            throw new NullPointerException("hashCode");
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v4, types: [char[]] */
        private static String getHeaders(String str) {
            if (str != 0) {
                str = str.toCharArray();
                int i2 = url + 29;
                method = i2 % 128;
                int i3 = i2 % 2;
            }
            char[] AGRequest2 = setNextFocusRightId.AGRequest(getUrl, (char[]) str);
            for (int i4 = 4; i4 < AGRequest2.length; i4++) {
                int i5 = url + 101;
                method = i5 % 128;
                int i6 = i5 % 2;
                AGRequest2[i4] = (char) ((int) (((long) (AGRequest2[i4] ^ AGRequest2[i4 % 4])) ^ (((long) (i4 - 4)) * getUrl)));
            }
            return new String(AGRequest2, 4, AGRequest2.length - 4);
        }

        public Builder headers(Map<String, String> map) {
            int i2 = url + 75;
            method = i2 % 128;
            if (i2 % 2 != 0 ? map != null : map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    int i3 = method + 83;
                    url = i3 % 128;
                    int i4 = i3 % 2;
                    addHeader(entry.getKey(), entry.getValue());
                }
            }
            return this;
        }

        public Builder headersMultiMap(Map<String, List<String>> map) {
            if (map != null) {
                int i2 = method + 113;
                url = i2 % 128;
                int i3 = i2 % 2;
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    addHeader(entry.getKey(), TextUtils.join(getHeaders("돼돐痯⼕堌").intern(), entry.getValue()));
                }
            }
            int i4 = url + 51;
            method = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        public Builder addHeader(String str, String str2) {
            if (!(str == null || str2 == null)) {
                int i2 = method + 37;
                url = i2 % 128;
                int i3 = i2 % 2;
                if (!str2.isEmpty()) {
                    int i4 = url + 87;
                    method = i4 % 128;
                    int i5 = i4 % 2;
                    this.AGRequest.put(str, str2);
                    int i6 = method + 97;
                    url = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
            return this;
        }
    }

    public String getMethod() {
        int i2 = AGRequest$Builder;
        int i3 = i2 + 25;
        getUrl = i3 % 128;
        int i4 = i3 % 2;
        String str = this.AGRequest;
        int i5 = i2 + 37;
        getUrl = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public int getStatusCode() {
        int i2 = AGRequest$Builder;
        int i3 = i2 + 15;
        getUrl = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.getMethod;
        int i6 = i2 + 3;
        getUrl = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public String getUrl() {
        int i2 = AGRequest$Builder + 123;
        getUrl = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getHeaders;
        }
        return this.getHeaders;
    }

    public Builder newBuilder() {
        Builder builder = new Builder(this);
        int i2 = AGRequest$Builder + 57;
        getUrl = i2 % 128;
        if (i2 % 2 == 0) {
            return builder;
        }
        throw new NullPointerException("hashCode");
    }

    public Map<String, String> getHeaders() {
        int i2 = AGRequest$Builder;
        int i3 = i2 + 45;
        getUrl = i3 % 128;
        int i4 = i3 % 2;
        Map<String, String> map = this.getBody;
        int i5 = i2 + 109;
        getUrl = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    static /* synthetic */ int AGRequest(AGResponse aGResponse) {
        int i2 = AGRequest$Builder + 7;
        getUrl = i2 % 128;
        int i3 = i2 % 2;
        return aGResponse.getMethod;
    }

    static /* synthetic */ String getUrl(AGResponse aGResponse) {
        int i2 = getUrl + 97;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        return aGResponse.getHeaders;
    }

    AGResponse(Builder builder) {
        this.getHeaders = Builder.getUrl(builder);
        this.AGRequest = Builder.getMethod(builder);
        this.getMethod = Builder.getBody(builder);
        this.getBody = Builder.AGRequest(builder);
    }

    static /* synthetic */ String getHeaders(AGResponse aGResponse) {
        int i2 = getUrl + 39;
        int i3 = i2 % 128;
        AGRequest$Builder = i3;
        int i4 = i2 % 2;
        String str = aGResponse.AGRequest;
        int i5 = i3 + 87;
        getUrl = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }
}
