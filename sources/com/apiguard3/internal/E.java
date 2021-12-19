package com.apiguard3.internal;

import android.media.AudioTrack;
import android.os.Process;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import com.bytedance.covode.number.Covode;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public final class E implements getHeaders, Serializable {
    private static char[] AGRequest = {'*', 'd', 'l', 'B', '1', '\\', 'q', '^', 'X', 'm', 'r', 'm', 'h', 'b', '[', '\\', 'k', 'm', 'e', 'f', 'j', 'q', 'm', 'j', 'n', 'l', 'n', '_', 'a', 'p', 's', 'x', 'L', 'D', 'k', 'p', 's', 'l', 'c', 'b'};
    private static int getBody = 1;
    private static int getMethod = 0;
    private static final long serialVersionUID = -2194429445620376626L;
    private final AtomicReference<String> payload;

    static {
        Covode.recordClassIndex(2519);
    }

    public E() {
        this("");
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() {
        CvmPayloadSerializationProxy cvmPayloadSerializationProxy = new CvmPayloadSerializationProxy(this);
        int i2 = getMethod + 85;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        return cvmPayloadSerializationProxy;
    }

    @Override // com.apiguard3.internal.getHeaders
    public final String getUrl() {
        int i2 = getBody + 125;
        getMethod = i2 % 128;
        int i3 = i2 % 2;
        String str = this.payload.get();
        int i4 = getBody + 1;
        getMethod = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public static final class CvmPayloadSerializationProxy implements Serializable {
        private static int getBody = 1;
        private static int getHeaders = 0;
        private static long getMethod = -118748131802413216L;
        private static final long serialVersionUID = 1283480018427592438L;
        private final String payload;
        private final byte[] shaHash = getMethod();

        static {
            Covode.recordClassIndex(2520);
        }

        /* access modifiers changed from: protected */
        public final Object readResolve() {
            int i2 = getBody + 125;
            getHeaders = i2 % 128;
            if (i2 % 2 != 0 ? Arrays.equals(getMethod(), this.shaHash) : Arrays.equals(getMethod(), this.shaHash)) {
                return new E(this.payload);
            }
            int i3 = getHeaders + 25;
            getBody = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }

        private byte[] getMethod() {
            boolean z;
            int i2 = getHeaders + 87;
            getBody = i2 % 128;
            if (i2 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                byte[] bytes = this.payload.getBytes(Charset.forName(getHeaders("ⱗ燓ㆺⰂ龜柞").intern()));
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = getHeaders("㰯㟞푫ꗋ↰㱜プᑅ?도耙ݬ狳鍧撻潞뷊?䨤䶐帺㾈꿱꩗磾ᩙ赠裍敩璖").intern().getBytes(Charset.forName(getHeaders("ⱗ燓ㆺⰂ龜柞").intern()));
                    objArr[0] = bytes;
                    byte[] bArr = (byte[]) ((Class) getMethod.AGRequest((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 40, 5998 - (ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)))).getMethod("getUrl", byte[].class, byte[].class).invoke(null, objArr);
                    throw new NullPointerException("hashCode");
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                byte[] bytes2 = this.payload.getBytes(Charset.forName(getHeaders("ⱗ燓ㆺⰂ龜柞").intern()));
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[1] = getHeaders("㰯㟞푫ꗋ↰㱜プᑅ?도耙ݬ狳鍧撻潞뷊?䨤䶐帺㾈꿱꩗磾ᩙ赠裍敩璖").intern().getBytes(Charset.forName(getHeaders("ⱗ燓ㆺⰂ龜柞").intern()));
                    objArr2[0] = bytes2;
                    byte[] bArr2 = (byte[]) ((Class) getMethod.AGRequest((char) (Process.getGidForName("") + 1), (ViewConfiguration.getTapTimeout() >> 16) + 40, 5997 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).getMethod("getUrl", byte[].class, byte[].class).invoke(null, objArr2);
                    int i3 = getBody + 119;
                    getHeaders = i3 % 128;
                    int i4 = i3 % 2;
                    return bArr2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th2;
                }
            }
        }

        CvmPayloadSerializationProxy(E e2) {
            this.payload = (String) E.AGRequest(e2).get();
        }

        private static String getHeaders(String str) {
            int i2 = getHeaders + 79;
            int i3 = i2 % 128;
            getBody = i3;
            int i4 = i2 % 2;
            char[] cArr = str;
            if (str != null) {
                int i5 = i3 + 71;
                getHeaders = i5 % 128;
                int i6 = i5 % 2;
                cArr = str.toCharArray();
            }
            char[] AGRequest = setNextFocusRightId.AGRequest(getMethod, cArr);
            for (int i7 = 4; i7 < AGRequest.length; i7++) {
                AGRequest[i7] = (char) ((int) (((long) (AGRequest[i7] ^ AGRequest[i7 % 4])) ^ (((long) (i7 - 4)) * getMethod)));
            }
            return new String(AGRequest, 4, AGRequest.length - 4);
        }
    }

    public E(String str) {
        this.payload = new AtomicReference<>(str == null ? "" : str);
    }

    static /* synthetic */ AtomicReference AGRequest(E e2) {
        int i2 = getBody + 71;
        int i3 = i2 % 128;
        getMethod = i3;
        int i4 = i2 % 2;
        AtomicReference<String> atomicReference = e2.payload;
        int i5 = i3 + 47;
        getBody = i5 % 128;
        int i6 = i5 % 2;
        return atomicReference;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException(getMethod(new int[]{0, 40, 0, 0}, URLUtil.isValidUrl(null), "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001").intern());
    }

    @Override // com.apiguard3.internal.getHeaders
    public final void getUrl(String str) {
        boolean z;
        String str2 = this.payload.get();
        String str3 = new String(str);
        while (true) {
            if (this.payload.compareAndSet(str2, str3)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int i2 = getBody + 49;
                getMethod = i2 % 128;
                int i3 = i2 % 2;
                str2 = this.payload.get();
            } else {
                int i4 = getBody + 7;
                getMethod = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:0:0x0000 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v3, types: [byte[]] */
    private static String getMethod(int[] iArr, boolean z, String str) {
        if (str != 0) {
            str = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) str;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = new char[i3];
        System.arraycopy(AGRequest, i2, cArr, 0, i3);
        if (bArr != null) {
            char[] cArr2 = new char[i3];
            char c2 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                if (bArr[i6] == 1) {
                    cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                } else {
                    cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                }
                c2 = cArr2[i6];
            }
            cArr = cArr2;
        }
        if (i5 > 0) {
            int i7 = getMethod + 21;
            getBody = i7 % 128;
            if (i7 % 2 == 0) {
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr, 1, cArr3, 1, i3);
                System.arraycopy(cArr3, 0, cArr, i3 % i5, i5);
                System.arraycopy(cArr3, i5, cArr, 0, i3 + i5);
            } else {
                char[] cArr4 = new char[i3];
                System.arraycopy(cArr, 0, cArr4, 0, i3);
                int i8 = i3 - i5;
                System.arraycopy(cArr4, 0, cArr, i8, i5);
                System.arraycopy(cArr4, i5, cArr, 0, i8);
            }
        }
        if (z) {
            int i9 = getMethod + 51;
            getBody = i9 % 128;
            int i10 = i9 % 2;
            char[] cArr5 = new char[i3];
            for (int i11 = 0; i11 < i3; i11++) {
                cArr5[i11] = cArr[(i3 - i11) - 1];
            }
            cArr = cArr5;
        }
        if (i4 > 0) {
            int i12 = getMethod + 25;
            getBody = i12 % 128;
            int i13 = i12 % 2;
            for (int i14 = 0; i14 < i3; i14++) {
                cArr[i14] = (char) (cArr[i14] - iArr[2]);
            }
        }
        return new String(cArr);
    }
}
