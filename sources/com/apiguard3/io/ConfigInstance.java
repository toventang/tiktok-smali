package com.apiguard3.io;

import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.webkit.URLUtil;
import com.apiguard3.domain.Config;
import com.apiguard3.internal.checkCertificates;
import com.apiguard3.internal.getMethod;
import com.apiguard3.internal.getState;
import com.apiguard3.internal.log;
import com.bytedance.covode.number.Covode;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class ConfigInstance implements Serializable {
    private static int AGRequest = 1;
    private static int getBody = 0;
    private static char[] getUrl = {'6', 'j', 'q', 'm', 'j', 'n', 'l', 'n', '_', 'a', 'p', 's', 'x', 'L', 'D', 'k', 'p', 's', 'l', 'c', 'b', '\\', 'd', 'l', 'B', '1', 'Y', 'n', 'j', 'g', 'h', ']', '\\', 'k', 'm', 'e'};
    private static final long serialVersionUID = 6511510411110711290L;
    private transient Config getMethod;

    static {
        Covode.recordClassIndex(2623);
    }

    private ConfigInstance() {
    }

    /* access modifiers changed from: protected */
    public final Object writeReplace() {
        ConfigSerializationProxy configSerializationProxy = new ConfigSerializationProxy(this);
        int i2 = AGRequest + 79;
        getBody = i2 % 128;
        int i3 = i2 % 2;
        return configSerializationProxy;
    }

    public final Config getHeaders() {
        int i2 = getBody + 57;
        int i3 = i2 % 128;
        AGRequest = i3;
        int i4 = i2 % 2;
        Config config = this.getMethod;
        int i5 = i3 + 21;
        getBody = i5 % 128;
        int i6 = i5 % 2;
        return config;
    }

    static final class ConfigSerializationProxy implements Serializable {
        private static int AGRequest = 0;
        private static char[] getHeaders = {'*', 'T', 'F', '2', '9', '9', 'o', 'M', 'I', 'f', 'n', 'T', '0', 'N', 'l', 'p', '[', '<', 'W', 'h', 'F', 'L', 'P', '.', 'O', 'Y', '@', 'W', 'h', 'I', 'I', 'V', ':', 'V', 'l'};
        private static int getUrl = 1;
        private static final long serialVersionUID = 9011110108210509910L;
        private final Config config;
        private final byte[] shaHash;

        static {
            Covode.recordClassIndex(2624);
        }

        /* access modifiers changed from: protected */
        public final Object readResolve() {
            boolean z;
            int i2 = AGRequest + 5;
            getUrl = i2 % 128;
            int i3 = i2 % 2;
            if (this.config.values()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i4 = AGRequest + 103;
                getUrl = i4 % 128;
                if (i4 % 2 != 0) {
                    checkCertificates.getMethod(log.getBody.getBody, getState.getUrl.AGRequest$Builder);
                    return null;
                }
                checkCertificates.getMethod(log.getBody.getBody, getState.getUrl.AGRequest$Builder);
                return null;
            }
            byte[] bytes = this.config.addHeader().getBytes(Charset.forName(getMethod(new int[]{0, 5, 0, 2}, URLUtil.isNetworkUrl("http://"), "\u0000\u0001\u0001\u0001\u0001").intern()));
            try {
                Object[] objArr = new Object[2];
                objArr[1] = getMethod(new int[]{5, 30, 0, 6}, PhoneNumberUtils.isDialable('0'), "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000").intern().getBytes(Charset.forName(getMethod(new int[]{0, 5, 0, 2}, !PhoneNumberUtils.isGlobalPhoneNumber(""), "\u0000\u0001\u0001\u0001\u0001").intern()));
                objArr[0] = bytes;
                if (Arrays.equals((byte[]) ((Class) getMethod.AGRequest((char) (Process.myTid() >> 22), ((Process.getThreadPriority(0) + 20) >> 6) + 40, 5997 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod("getUrl", byte[].class, byte[].class).invoke(null, objArr), this.shaHash)) {
                    return new ConfigInstance(this.config);
                }
                checkCertificates.getMethod(log.getBody.getBody, getState.getUrl.url);
                return null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        ConfigSerializationProxy(ConfigInstance configInstance) {
            Config url = ConfigInstance.getUrl(configInstance);
            this.config = url;
            byte[] bytes = url.addHeader().getBytes(Charset.forName(getMethod(new int[]{0, 5, 0, 2}, WindowManager.LayoutParams.mayUseInputMethod(0), "\u0000\u0001\u0001\u0001\u0001").intern()));
            try {
                Object[] objArr = new Object[2];
                objArr[1] = getMethod(new int[]{5, 30, 0, 6}, URLUtil.isHttpsUrl("https://"), "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000").intern().getBytes(Charset.forName(getMethod(new int[]{0, 5, 0, 2}, URLUtil.isHttpUrl("http://"), "\u0000\u0001\u0001\u0001\u0001").intern()));
                objArr[0] = bytes;
                this.shaHash = (byte[]) ((Class) getMethod.AGRequest((char) (ViewConfiguration.getLongPressTimeout() >> 16), 40 - (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.getDeadChar(0, 0) + 5997)).getMethod("getUrl", byte[].class, byte[].class).invoke(null, objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        private static String getMethod(int[] iArr, boolean z, String str) {
            char[] cArr;
            int i2;
            char c2;
            int i3 = getUrl + 1;
            AGRequest = i3 % 128;
            int i4 = i3 % 2;
            byte[] bArr = str;
            if (str != null) {
                bArr = str.getBytes("ISO-8859-1");
            }
            byte[] bArr2 = bArr;
            int i5 = 0;
            int i6 = iArr[0];
            int i7 = iArr[1];
            int i8 = iArr[2];
            int i9 = iArr[3];
            char[] cArr2 = new char[i7];
            System.arraycopy(getHeaders, i6, cArr2, 0, i7);
            if (bArr2 != null) {
                int i10 = AGRequest + 57;
                getUrl = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr = new char[i7];
                    i2 = 0;
                    c2 = 0;
                } else {
                    cArr = new char[i7];
                    i2 = 1;
                    c2 = 1;
                }
                while (i2 < i7) {
                    if (bArr2[i2] == 1) {
                        cArr[i2] = (char) (((cArr2[i2] << 1) + 1) - c2);
                    } else {
                        cArr[i2] = (char) ((cArr2[i2] << 1) - c2);
                    }
                    c2 = cArr[i2];
                    i2++;
                }
                cArr2 = cArr;
            }
            if (i9 > 0) {
                char[] cArr3 = new char[i7];
                System.arraycopy(cArr2, 0, cArr3, 0, i7);
                int i11 = i7 - i9;
                System.arraycopy(cArr3, 0, cArr2, i11, i9);
                System.arraycopy(cArr3, i9, cArr2, 0, i11);
            }
            if (z) {
                char[] cArr4 = new char[i7];
                for (int i12 = 0; i12 < i7; i12++) {
                    cArr4[i12] = cArr2[(i7 - i12) - 1];
                }
                cArr2 = cArr4;
            }
            if (i8 > 0) {
                while (i5 < i7) {
                    int i13 = getUrl;
                    int i14 = i13 + 17;
                    AGRequest = i14 % 128;
                    int i15 = i14 % 2;
                    cArr2[i5] = (char) (cArr2[i5] - iArr[2]);
                    i5++;
                    int i16 = i13 + 59;
                    AGRequest = i16 % 128;
                    int i17 = i16 % 2;
                }
            }
            return new String(cArr2);
        }
    }

    public ConfigInstance(Config config) {
        this.getMethod = config;
    }

    static /* synthetic */ Config getUrl(ConfigInstance configInstance) {
        int i2 = AGRequest + 95;
        int i3 = i2 % 128;
        getBody = i3;
        int i4 = i2 % 2;
        Config config = configInstance.getMethod;
        int i5 = i3 + 49;
        AGRequest = i5 % 128;
        if (i5 % 2 != 0) {
            return config;
        }
        throw new NullPointerException("hashCode");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException(getUrl(new int[]{0, 36, 0, 21}, PhoneNumberUtils.isGlobalPhoneNumber(""), "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000").intern());
    }

    private static String getUrl(int[] iArr, boolean z, String str) {
        int i2 = AGRequest + 31;
        int i3 = i2 % 128;
        getBody = i3;
        int i4 = i2 % 2;
        int i5 = 0;
        byte[] bArr = str;
        if (str != null) {
            int i6 = i3 + 85;
            AGRequest = i6 % 128;
            int i7 = i6 % 2;
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        int i8 = iArr[0];
        int i9 = iArr[1];
        int i10 = iArr[2];
        int i11 = iArr[3];
        char[] cArr = new char[i9];
        System.arraycopy(getUrl, i8, cArr, 0, i9);
        if (bArr2 != null) {
            int i12 = getBody + 69;
            AGRequest = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr2 = new char[i9];
            char c2 = 0;
            for (int i14 = 0; i14 < i9; i14++) {
                if (bArr2[i14] == 1) {
                    cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c2);
                } else {
                    cArr2[i14] = (char) ((cArr[i14] << 1) - c2);
                }
                c2 = cArr2[i14];
            }
            cArr = cArr2;
        }
        if (i11 > 0) {
            int i15 = getBody + 65;
            AGRequest = i15 % 128;
            if (i15 % 2 == 0) {
                char[] cArr3 = new char[i9];
                System.arraycopy(cArr, 0, cArr3, 1, i9);
                System.arraycopy(cArr3, 0, cArr, i9 >> i11, i11);
                System.arraycopy(cArr3, i11, cArr, 0, i9 % i11);
            } else {
                char[] cArr4 = new char[i9];
                System.arraycopy(cArr, 0, cArr4, 0, i9);
                int i16 = i9 - i11;
                System.arraycopy(cArr4, 0, cArr, i16, i11);
                System.arraycopy(cArr4, i11, cArr, 0, i16);
            }
        }
        if (z) {
            char[] cArr5 = new char[i9];
            for (int i17 = 0; i17 < i9; i17++) {
                cArr5[i17] = cArr[(i9 - i17) - 1];
            }
            cArr = cArr5;
        }
        if (i10 > 0) {
            int i18 = getBody + 7;
            AGRequest = i18 % 128;
            int i19 = i18 % 2;
            while (i5 < i9) {
                int i20 = getBody + 1;
                AGRequest = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr[i5] = (char) (cArr[i5] + iArr[5]);
                    i5 += 82;
                } else {
                    cArr[i5] = (char) (cArr[i5] - iArr[2]);
                    i5++;
                }
            }
        }
        return new String(cArr);
    }
}
