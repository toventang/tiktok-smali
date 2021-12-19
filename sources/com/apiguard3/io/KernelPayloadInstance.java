package com.apiguard3.io;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.apiguard3.internal.getMethod;
import com.apiguard3.internal.setNextClusterForwardId;
import com.bytedance.covode.number.Covode;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public final class KernelPayloadInstance implements Serializable {
    private static int getHeaders = 0;
    private static char[] getMethod = {'U', 's', 'e', ' ', 'K', 'r', 'n', 'l', 'P', 'a', 'y', 'o', 'd', 'S', 'i', 'z', 't', 'x', 'V', 'W', 'X', 'Y', 'Z', '[', '\\'};
    private static char getUrl = 5;
    private static int newBuilder = 1;
    private static final long serialVersionUID = 3128887582760800825L;
    public transient Map<String, String> AGRequest;
    public transient Map<String, String> getBody;

    static {
        Covode.recordClassIndex(2625);
    }

    private KernelPayloadInstance() {
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() {
        KernelPayloadSerializationProxy kernelPayloadSerializationProxy = new KernelPayloadSerializationProxy(this);
        int i2 = newBuilder + 61;
        getHeaders = i2 % 128;
        if (i2 % 2 == 0) {
            return kernelPayloadSerializationProxy;
        }
        throw new NullPointerException("hashCode");
    }

    static final class KernelPayloadSerializationProxy implements Serializable {
        private static int AGRequest = 0;
        private static char[] getBody = {'U', 'T', 'F', '-', '8', 's', 'i', 'd', '/', 'l', 'r', '[', '}', '0', 'D', 'h', '+', 'g', 'E', ';', 'x', '\'', '5', '`', 'q', '=', '<', 'z', 'f', '6', 'V', 'W', 'X', 'Y', 'Z', '\\'};
        private static char getHeaders = 6;
        private static int getMethod = 1;
        private static final long serialVersionUID = 4032605224111506387L;
        private final TreeMap<String, String> maxPayload;
        private final TreeMap<String, String> minPayload;
        private final byte[] shaHash;

        static {
            Covode.recordClassIndex(2626);
        }

        /* access modifiers changed from: protected */
        public final Object readResolve() {
            byte[] bytes = new StringBuilder().append(this.minPayload.toString()).append(this.maxPayload.toString()).toString().getBytes(Charset.forName(getHeaders("\u0001\u0002\u0003\u0004m", (byte) (53 - View.getDefaultSize(0, 0)), 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()));
            try {
                Object[] objArr = new Object[2];
                objArr[1] = getHeaders("\u0000\u000b\b\t\n\u000b\u0006\u0011\u000e\u000f\u0010\u0011\f\u000b\u0013\u0014\u0015\u0016\u0015\n\u0005\u0015\u0019\u001a\u001b\u001c\"\u0010\u0011\u001c", (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 83), View.MeasureSpec.getMode(0) + 30).intern().getBytes(Charset.forName(getHeaders("\u0001\u0002\u0003\u0004m", (byte) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 53), Color.green(0) + 5).intern()));
                objArr[0] = bytes;
                if (Arrays.equals((byte[]) ((Class) getMethod.AGRequest((char) Color.blue(0), 40 - View.MeasureSpec.getMode(0), (ViewConfiguration.getTouchSlop() >> 8) + 5997)).getMethod("getUrl", byte[].class, byte[].class).invoke(null, objArr), this.shaHash)) {
                    return new KernelPayloadInstance(this.minPayload, this.maxPayload);
                }
                int i2 = AGRequest + 63;
                getMethod = i2 % 128;
                int i3 = i2 % 2;
                return null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        KernelPayloadSerializationProxy(KernelPayloadInstance kernelPayloadInstance) {
            if (kernelPayloadInstance.AGRequest != null) {
                this.minPayload = new TreeMap<>(kernelPayloadInstance.AGRequest);
            } else {
                this.minPayload = new TreeMap<>();
            }
            if (kernelPayloadInstance.AGRequest != null) {
                this.maxPayload = new TreeMap<>(kernelPayloadInstance.getBody);
            } else {
                this.maxPayload = new TreeMap<>();
            }
            byte[] bytes = new StringBuilder().append(this.minPayload.toString()).append(this.maxPayload.toString()).toString().getBytes(Charset.forName(getHeaders("\u0001\u0002\u0003\u0004m", (byte) (53 - View.MeasureSpec.getMode(0)), Color.red(0) + 5).intern()));
            try {
                Object[] objArr = new Object[2];
                objArr[1] = getHeaders("\u0000\u000b\b\t\n\u000b\u0006\u0011\u000e\u000f\u0010\u0011\f\u000b\u0013\u0014\u0015\u0016\u0015\n\u0005\u0015\u0019\u001a\u001b\u001c\"\u0010\u0011\u001c", (byte) ((Process.myTid() >> 22) + 83), 29 - TextUtils.lastIndexOf("", '0', 0)).intern().getBytes(Charset.forName(getHeaders("\u0001\u0002\u0003\u0004m", (byte) (53 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 6).intern()));
                objArr[0] = bytes;
                this.shaHash = (byte[]) ((Class) getMethod.AGRequest((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 40, Drawable.resolveOpacity(0, 0) + 5997)).getMethod("getUrl", byte[].class, byte[].class).invoke(null, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        private static String getHeaders(String str, byte b2, int i2) {
            boolean z;
            char c2;
            boolean z2;
            int i3 = getMethod + 99;
            AGRequest = i3 % 128;
            char[] cArr = str;
            if (i3 % 2 == 0) {
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                char[] cArr3 = getBody;
                char c3 = getHeaders;
                char[] cArr4 = new char[i2];
                if (i2 % 2 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    i2--;
                    cArr4[i2] = (char) (cArr2[i2] - b2);
                }
                if (i2 > 1) {
                    for (int i4 = 0; i4 < i2; i4 += 2) {
                        char c4 = cArr2[i4];
                        int i5 = i4 + 1;
                        char c5 = cArr2[i5];
                        if (c4 != c5) {
                            c2 = 'A';
                        } else {
                            c2 = '9';
                        }
                        if (c2 != 'A') {
                            int i6 = getMethod + 43;
                            AGRequest = i6 % 128;
                            if (i6 % 2 != 0) {
                                cArr4[i4] = (char) (c4 * b2);
                                cArr4[i4 * 0] = (char) (c5 >> b2);
                            } else {
                                cArr4[i4] = (char) (c4 - b2);
                                cArr4[i5] = (char) (c5 - b2);
                            }
                        } else {
                            int AGRequest2 = setNextClusterForwardId.AGRequest(c4, c3);
                            int body = setNextClusterForwardId.getBody(c4, c3);
                            int AGRequest3 = setNextClusterForwardId.AGRequest(c5, c3);
                            int body2 = setNextClusterForwardId.getBody(c5, c3);
                            if (body == body2) {
                                int headers = setNextClusterForwardId.getHeaders(AGRequest2, c3);
                                int headers2 = setNextClusterForwardId.getHeaders(AGRequest3, c3);
                                int body3 = setNextClusterForwardId.getBody(headers, body, c3);
                                int body4 = setNextClusterForwardId.getBody(headers2, body2, c3);
                                cArr4[i4] = cArr3[body3];
                                cArr4[i5] = cArr3[body4];
                            } else {
                                if (AGRequest2 != AGRequest3) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (!z2) {
                                    int body5 = setNextClusterForwardId.getBody(AGRequest2, body2, c3);
                                    int body6 = setNextClusterForwardId.getBody(AGRequest3, body, c3);
                                    cArr4[i4] = cArr3[body5];
                                    cArr4[i5] = cArr3[body6];
                                } else {
                                    int headers3 = setNextClusterForwardId.getHeaders(body, c3);
                                    int headers4 = setNextClusterForwardId.getHeaders(body2, c3);
                                    int body7 = setNextClusterForwardId.getBody(AGRequest2, headers3, c3);
                                    int body8 = setNextClusterForwardId.getBody(AGRequest3, headers4, c3);
                                    cArr4[i4] = cArr3[body7];
                                    cArr4[i5] = cArr3[body8];
                                }
                            }
                        }
                    }
                }
                String str2 = new String(cArr4);
                int i7 = getMethod + 43;
                AGRequest = i7 % 128;
                int i8 = i7 % 2;
                return str2;
            }
            throw new NullPointerException("hashCode");
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException(getMethod("\u0001\u0002\u0003\u0004\u0000\u0003\u0006\u0007\u0007\f\t\u0005\f\u0005\u000e\u0006\r\u000e\u0000\u0007\u0013\u000e\t\f\u0013\u0005\u0013\u000b\u0010\u000b\t\u0006\f\u0010\r\u0000\u000b\t\u0006\u0015\u0004\u0007u", (byte) (17 - TextUtils.getOffsetBefore("", 0)), 43 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
    }

    public KernelPayloadInstance(Map<String, String> map, Map<String, String> map2) {
        this.AGRequest = map;
        this.getBody = map2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [char[]] */
    /* JADX WARN: Type inference failed for: r11v2 */
    private static String getMethod(String str, byte b2, int i2) {
        if (str != 0) {
            int i3 = getHeaders + 85;
            newBuilder = i3 % 128;
            int i4 = i3 % 2;
            str = str.toCharArray();
        }
        char[] cArr = (char[]) str;
        char[] cArr2 = getMethod;
        char c2 = getUrl;
        char[] cArr3 = new char[i2];
        if (i2 % 2 != 0) {
            int i5 = newBuilder + 43;
            getHeaders = i5 % 128;
            if (i5 % 2 != 0) {
                i2 += 125;
                cArr3[i2] = (char) (cArr[i2] >> b2);
            } else {
                i2--;
                cArr3[i2] = (char) (cArr[i2] - b2);
            }
        }
        if (i2 > 1) {
            int i6 = 0;
            while (i6 < i2) {
                char c3 = cArr[i6];
                int i7 = i6 + 1;
                char c4 = cArr[i7];
                if (c3 == c4) {
                    cArr3[i6] = (char) (c3 - b2);
                    cArr3[i7] = (char) (c4 - b2);
                } else {
                    int AGRequest2 = setNextClusterForwardId.AGRequest(c3, c2);
                    int body = setNextClusterForwardId.getBody(c3, c2);
                    int AGRequest3 = setNextClusterForwardId.AGRequest(c4, c2);
                    int body2 = setNextClusterForwardId.getBody(c4, c2);
                    if (body == body2) {
                        int i8 = newBuilder + 35;
                        getHeaders = i8 % 128;
                        int i9 = i8 % 2;
                        int headers = setNextClusterForwardId.getHeaders(AGRequest2, c2);
                        int headers2 = setNextClusterForwardId.getHeaders(AGRequest3, c2);
                        int body3 = setNextClusterForwardId.getBody(headers, body, c2);
                        int body4 = setNextClusterForwardId.getBody(headers2, body2, c2);
                        cArr3[i6] = cArr2[body3];
                        cArr3[i7] = cArr2[body4];
                    } else if (AGRequest2 != AGRequest3) {
                        int body5 = setNextClusterForwardId.getBody(AGRequest2, body2, c2);
                        int body6 = setNextClusterForwardId.getBody(AGRequest3, body, c2);
                        cArr3[i6] = cArr2[body5];
                        cArr3[i7] = cArr2[body6];
                    } else {
                        int headers3 = setNextClusterForwardId.getHeaders(body, c2);
                        int headers4 = setNextClusterForwardId.getHeaders(body2, c2);
                        int body7 = setNextClusterForwardId.getBody(AGRequest2, headers3, c2);
                        int body8 = setNextClusterForwardId.getBody(AGRequest3, headers4, c2);
                        cArr3[i6] = cArr2[body7];
                        cArr3[i7] = cArr2[body8];
                    }
                }
                i6 += 2;
                int i10 = newBuilder + 45;
                getHeaders = i10 % 128;
                int i11 = i10 % 2;
            }
        }
        return new String(cArr3);
    }
}
