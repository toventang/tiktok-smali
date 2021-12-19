package com.apiguard3;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.apiguard3.internal.setNextClusterForwardId;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class AGRequest {
    private static int AGRequest$Builder = 1;
    public static final String ANY_URL = "https://any.example.com";
    private static int getHeaders;
    private final Map<String, String> AGRequest;
    private final String getBody;
    private final String getMethod;
    private final byte[] getUrl;

    static {
        Covode.recordClassIndex(2477);
    }

    public static class Builder {
        private static int AGRequest$Builder = 1;
        private static char[] getBody = {'G', 'E', 'T', 'H', 'A', 'D', 'L', 'P', 'O', 'S', 'U', ',', 'I', 'n', 'v', 'a', 'l', 'i', 'd', ' ', 'R', 'J', 'K', 'M', 'N'};
        private static int method;
        private static char newBuilder = 5;
        private final Map<String, String> AGRequest;
        private byte[] getHeaders;
        private String getMethod;
        private String getUrl;

        static {
            Covode.recordClassIndex(2478);
        }

        public Builder() {
            this.AGRequest = Collections.synchronizedMap(new LinkedHashMap());
        }

        public Builder delete() {
            int i2 = method + 53;
            AGRequest$Builder = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getMethod("\u0006\u0000\u000b\u0006\u0003\u0002", 6 - View.MeasureSpec.getSize(0), (byte) (72 - TextUtils.lastIndexOf("", '0', 0))).intern(), null);
            int i4 = AGRequest$Builder + 83;
            method = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        public Builder head() {
            int i2 = method + 41;
            AGRequest$Builder = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getMethod("\u0004\u0002\u0000\t", 5 - (SystemClock.uptimeMillis() > 0 ? 1 : (SystemClock.uptimeMillis() == 0 ? 0 : -1)), (byte) (8 - TextUtils.indexOf("", ""))).intern(), null);
            int i4 = AGRequest$Builder + 79;
            method = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        public AGRequest build() {
            char c2;
            int i2 = AGRequest$Builder + 27;
            method = i2 % 128;
            int i3 = i2 % 2;
            String str = this.getUrl;
            if (str == null) {
                c2 = 'F';
            } else {
                c2 = '\n';
            }
            if (c2 != '\n' || str.isEmpty() || !URLUtil.isValidUrl(this.getUrl)) {
                throw new Exception(getMethod("\r\u000e\n\u0013\u0011\u0012\u0013\u000f\u000f\u0000", 10 - Process.getGidForName(""), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 58)).intern());
            }
            AGRequest aGRequest = new AGRequest(this);
            int i4 = AGRequest$Builder + 91;
            method = i4 % 128;
            int i5 = i4 % 2;
            return aGRequest;
        }

        public Builder get() {
            int i2 = AGRequest$Builder + 29;
            method = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getMethod("\u0001\u0002", View.MeasureSpec.makeMeasureSpec(0, 0) + 3, (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 49)).intern(), null);
            int i4 = AGRequest$Builder + 119;
            method = i4 % 128;
            if (i4 % 2 == 0) {
                return method2;
            }
            throw new NullPointerException("hashCode");
        }

        static /* synthetic */ byte[] AGRequest(Builder builder) {
            int i2 = method + 75;
            int i3 = i2 % 128;
            AGRequest$Builder = i3;
            int i4 = i2 % 2;
            byte[] bArr = builder.getHeaders;
            int i5 = i3 + 25;
            method = i5 % 128;
            int i6 = i5 % 2;
            return bArr;
        }

        Builder(AGRequest aGRequest) {
            Map<String, String> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
            this.AGRequest = synchronizedMap;
            this.getUrl = AGRequest.getBody(aGRequest);
            this.getHeaders = AGRequest.getHeaders(aGRequest);
            this.getMethod = AGRequest.getMethod(aGRequest);
            synchronizedMap.putAll(aGRequest.getHeaders());
        }

        static /* synthetic */ Map getBody(Builder builder) {
            char c2;
            int i2 = method + 41;
            AGRequest$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                c2 = 15;
            } else {
                c2 = '.';
            }
            Map<String, String> map = builder.AGRequest;
            if (c2 != 15) {
                throw new NullPointerException("hashCode");
            }
            int i3 = AGRequest$Builder + 121;
            method = i3 % 128;
            int i4 = i3 % 2;
            return map;
        }

        static /* synthetic */ String getHeaders(Builder builder) {
            boolean z;
            int i2 = AGRequest$Builder + 117;
            method = i2 % 128;
            if (i2 % 2 == 0) {
                z = false;
            } else {
                z = true;
            }
            String str = builder.getUrl;
            if (z) {
                throw new NullPointerException("hashCode");
            }
            int i3 = method + 117;
            AGRequest$Builder = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }

        static /* synthetic */ String getMethod(Builder builder) {
            char c2;
            int i2 = AGRequest$Builder;
            int i3 = i2 + 121;
            method = i3 % 128;
            int i4 = i3 % 2;
            String str = builder.getMethod;
            int i5 = i2 + 55;
            method = i5 % 128;
            if (i5 % 2 == 0) {
                c2 = 'S';
            } else {
                c2 = '2';
            }
            if (c2 == 'S') {
                return str;
            }
            throw new NullPointerException("hashCode");
        }

        public Builder post(byte[] bArr) {
            int i2 = AGRequest$Builder + 95;
            method = i2 % 128;
            int i3 = i2 % 2;
            Builder method2 = method(getMethod("\b\t\u0007\u0004", 4 - TextUtils.indexOf("", "", 0, 0), (byte) (-16777128 - Color.rgb(0, 0, 0))).intern(), bArr);
            int i4 = method + 57;
            AGRequest$Builder = i4 % 128;
            int i5 = i4 % 2;
            return method2;
        }

        public Builder url(String str) {
            int i2 = method;
            int i3 = i2 + 21;
            AGRequest$Builder = i3 % 128;
            int i4 = i3 % 2;
            this.getUrl = str;
            int i5 = i2 + 49;
            AGRequest$Builder = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw new NullPointerException("hashCode");
        }

        public Builder headers(Map<String, String> map) {
            int i2 = method + 97;
            AGRequest$Builder = i2 % 128;
            if (i2 % 2 != 0 ? map != null : map != null) {
                Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    int i3 = AGRequest$Builder + 109;
                    method = i3 % 128;
                    if (i3 % 2 == 0) {
                        Map.Entry<String, String> next = it.next();
                        addHeader(next.getKey(), next.getValue());
                    } else {
                        Map.Entry<String, String> next2 = it.next();
                        addHeader(next2.getKey(), next2.getValue());
                        throw new NullPointerException("hashCode");
                    }
                }
            }
            return this;
        }

        public Builder headersMultiMap(Map<String, List<String>> map) {
            if (map != null) {
                int i2 = method + 45;
                AGRequest$Builder = i2 % 128;
                int i3 = i2 % 2;
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    int i4 = method + 23;
                    AGRequest$Builder = i4 % 128;
                    int i5 = i4 % 2;
                    addHeader(entry.getKey(), TextUtils.join(getMethod(":", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (14 - ExpandableListView.getPackedPositionType(0))).intern(), entry.getValue()));
                }
            }
            return this;
        }

        public Builder put(byte[] bArr) {
            boolean z;
            int maxKeyCode;
            int packedPositionGroup;
            int i2 = method + 89;
            AGRequest$Builder = i2 % 128;
            if (i2 % 2 != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                maxKeyCode = 2 >> (KeyEvent.getMaxKeyCode() + 124);
                packedPositionGroup = 8 >> ExpandableListView.getPackedPositionGroup(0);
            } else {
                maxKeyCode = 3 - (KeyEvent.getMaxKeyCode() >> 16);
                packedPositionGroup = 39 - ExpandableListView.getPackedPositionGroup(0);
            }
            Builder method2 = method(getMethod("\u0005\f{", maxKeyCode, (byte) packedPositionGroup).intern(), bArr);
            int i3 = AGRequest$Builder + 101;
            method = i3 % 128;
            int i4 = i3 % 2;
            return method2;
        }

        public Builder method(String str, byte[] bArr) {
            int i2 = AGRequest$Builder + 81;
            method = i2 % 128;
            int i3 = i2 % 2;
            this.getMethod = str.toUpperCase(Locale.US);
            this.getHeaders = bArr;
            int i4 = AGRequest$Builder + 57;
            method = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw new NullPointerException("hashCode");
        }

        public Builder addHeader(String str, String str2) {
            int i2 = AGRequest$Builder + 43;
            method = i2 % 128;
            if (i2 % 2 == 0) {
                if (!(str == null || str.isEmpty() || str2 == null)) {
                    int i3 = method + 3;
                    AGRequest$Builder = i3 % 128;
                    if (i3 % 2 != 0) {
                        this.AGRequest.put(str, str2);
                    } else {
                        this.AGRequest.put(str, str2);
                        throw new NullPointerException("hashCode");
                    }
                }
                return this;
            }
            throw new NullPointerException("hashCode");
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v3, types: [char[]] */
        private static String getMethod(String str, int i2, byte b2) {
            if (str != 0) {
                str = str.toCharArray();
            }
            char[] cArr = (char[]) str;
            char[] cArr2 = getBody;
            char c2 = newBuilder;
            char[] cArr3 = new char[i2];
            if (i2 % 2 != 0) {
                i2--;
                cArr3[i2] = (char) (cArr[i2] - b2);
            }
            if (i2 > 1) {
                int i3 = method + 65;
                AGRequest$Builder = i3 % 128;
                int i4 = i3 % 2;
                for (int i5 = 0; i5 < i2; i5 += 2) {
                    char c3 = cArr[i5];
                    int i6 = i5 + 1;
                    char c4 = cArr[i6];
                    if (c3 != c4) {
                        int AGRequest2 = setNextClusterForwardId.AGRequest(c3, c2);
                        int body = setNextClusterForwardId.getBody(c3, c2);
                        int AGRequest3 = setNextClusterForwardId.AGRequest(c4, c2);
                        int body2 = setNextClusterForwardId.getBody(c4, c2);
                        if (body == body2) {
                            int headers = setNextClusterForwardId.getHeaders(AGRequest2, c2);
                            int headers2 = setNextClusterForwardId.getHeaders(AGRequest3, c2);
                            int body3 = setNextClusterForwardId.getBody(headers, body, c2);
                            int body4 = setNextClusterForwardId.getBody(headers2, body2, c2);
                            cArr3[i5] = cArr2[body3];
                            cArr3[i6] = cArr2[body4];
                        } else if (AGRequest2 == AGRequest3) {
                            int headers3 = setNextClusterForwardId.getHeaders(body, c2);
                            int headers4 = setNextClusterForwardId.getHeaders(body2, c2);
                            int body5 = setNextClusterForwardId.getBody(AGRequest2, headers3, c2);
                            int body6 = setNextClusterForwardId.getBody(AGRequest3, headers4, c2);
                            cArr3[i5] = cArr2[body5];
                            cArr3[i6] = cArr2[body6];
                        } else {
                            int body7 = setNextClusterForwardId.getBody(AGRequest2, body2, c2);
                            int body8 = setNextClusterForwardId.getBody(AGRequest3, body, c2);
                            cArr3[i5] = cArr2[body7];
                            cArr3[i6] = cArr2[body8];
                        }
                    } else {
                        int i7 = AGRequest$Builder + 107;
                        method = i7 % 128;
                        if (i7 % 2 == 0) {
                            cArr3[i5] = (char) (c3 - b2);
                            cArr3[i6] = (char) (c4 - b2);
                        } else {
                            cArr3[i5] = (char) (c3 / b2);
                            cArr3[i5 - 1] = (char) (c4 << b2);
                        }
                    }
                }
            }
            return new String(cArr3);
        }
    }

    public Builder newBuilder() {
        Builder builder = new Builder(this);
        int i2 = getHeaders + 125;
        AGRequest$Builder = i2 % 128;
        int i3 = i2 % 2;
        return builder;
    }

    public String getUrl() {
        int i2 = getHeaders + 17;
        int i3 = i2 % 128;
        AGRequest$Builder = i3;
        int i4 = i2 % 2;
        String str = this.getBody;
        int i5 = i3 + 121;
        getHeaders = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public byte[] getBody() {
        int i2 = AGRequest$Builder + 15;
        getHeaders = i2 % 128;
        if (i2 % 2 == 0) {
            return this.getUrl;
        }
        return this.getUrl;
    }

    public Map<String, String> getHeaders() {
        int i2 = AGRequest$Builder + 1;
        int i3 = i2 % 128;
        getHeaders = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.AGRequest;
        int i5 = i3 + 7;
        AGRequest$Builder = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    public String getMethod() {
        char c2;
        int i2 = getHeaders + 117;
        AGRequest$Builder = i2 % 128;
        if (i2 % 2 != 0) {
            c2 = '!';
        } else {
            c2 = 30;
        }
        if (c2 != 30) {
            String str = this.getMethod;
            int i3 = getHeaders + 19;
            AGRequest$Builder = i3 % 128;
            int i4 = i3 % 2;
            return str;
        }
        String str2 = this.getMethod;
        throw new NullPointerException("hashCode");
    }

    AGRequest(Builder builder) {
        this.getBody = Builder.getHeaders(builder);
        this.getUrl = Builder.AGRequest(builder);
        this.getMethod = Builder.getMethod(builder);
        this.AGRequest = Builder.getBody(builder);
    }

    static /* synthetic */ String getBody(AGRequest aGRequest) {
        int i2 = getHeaders + 123;
        int i3 = i2 % 128;
        AGRequest$Builder = i3;
        int i4 = i2 % 2;
        String str = aGRequest.getBody;
        int i5 = i3 + 93;
        getHeaders = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    static /* synthetic */ byte[] getHeaders(AGRequest aGRequest) {
        int i2 = AGRequest$Builder;
        int i3 = i2 + 95;
        getHeaders = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArr = aGRequest.getUrl;
        int i5 = i2 + 67;
        getHeaders = i5 % 128;
        int i6 = i5 % 2;
        return bArr;
    }

    static /* synthetic */ String getMethod(AGRequest aGRequest) {
        int i2 = AGRequest$Builder;
        int i3 = i2 + 83;
        getHeaders = i3 % 128;
        int i4 = i3 % 2;
        String str = aGRequest.getMethod;
        int i5 = i2 + 43;
        getHeaders = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public void addHeader(String str, String str2) {
        int i2 = AGRequest$Builder + 75;
        getHeaders = i2 % 128;
        int i3 = i2 % 2;
        this.AGRequest.put(str, str2);
    }
}
