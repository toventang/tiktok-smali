package com.facebook.imageutils;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import java.io.IOException;
import java.io.InputStream;

public final class h {
    static {
        Covode.recordClassIndex(29238);
    }

    private static short e(InputStream inputStream) {
        MethodCollector.i(2931);
        short read = (short) (inputStream.read() & 255);
        MethodCollector.o(2931);
        return read;
    }

    private static byte f(InputStream inputStream) {
        MethodCollector.i(2936);
        byte read = (byte) (inputStream.read() & 255);
        MethodCollector.o(2936);
        return read;
    }

    private static int c(InputStream inputStream) {
        MethodCollector.i(2846);
        int read = ((((byte) inputStream.read()) << 8) & 65280) | (((byte) inputStream.read()) & 255);
        MethodCollector.o(2846);
        return read;
    }

    private static int d(InputStream inputStream) {
        byte f2 = f(inputStream);
        return ((f(inputStream) << 16) & 16711680) | ((f(inputStream) << 8) & 65280) | (f2 & 255);
    }

    private static int b(InputStream inputStream) {
        MethodCollector.i(219);
        byte read = (byte) inputStream.read();
        byte read2 = (byte) inputStream.read();
        int read3 = ((((byte) inputStream.read()) << 24) & -16777216) | ((((byte) inputStream.read()) << 16) & 16711680) | ((read2 << 8) & 65280) | (read & 255);
        MethodCollector.o(219);
        return read3;
    }

    public static Pair<Integer, Integer> a(InputStream inputStream) {
        MethodCollector.i(BuildConfig.VERSION_CODE);
        byte[] bArr = new byte[4];
        Pair<Integer, Integer> pair = null;
        try {
            inputStream.read(bArr);
            if (!a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                MethodCollector.o(BuildConfig.VERSION_CODE);
                return null;
            }
            b(inputStream);
            inputStream.read(bArr);
            if (!a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                MethodCollector.o(BuildConfig.VERSION_CODE);
                return null;
            }
            inputStream.read(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < 4; i2++) {
                sb.append((char) bArr[i2]);
            }
            String sb2 = sb.toString();
            if ("VP8 ".equals(sb2)) {
                inputStream.skip(7);
                short e4 = e(inputStream);
                short e5 = e(inputStream);
                short e6 = e(inputStream);
                if (e4 == 157 && e5 == 1 && e6 == 42) {
                    pair = new Pair<>(Integer.valueOf(c(inputStream)), Integer.valueOf(c(inputStream)));
                }
                try {
                    inputStream.close();
                } catch (IOException e7) {
                    e7.printStackTrace();
                }
                MethodCollector.o(BuildConfig.VERSION_CODE);
                return pair;
            } else if ("VP8L".equals(sb2)) {
                b(inputStream);
                if (f(inputStream) == 47) {
                    int read = ((byte) inputStream.read()) & 255;
                    int read2 = ((byte) inputStream.read()) & 255;
                    int read3 = ((byte) inputStream.read()) & 255;
                    int i3 = read3 << 2;
                    pair = new Pair<>(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf((((read2 & 192) >> 6) | i3 | (((((byte) inputStream.read()) & 255) & 15) << 10)) + 1));
                }
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                MethodCollector.o(BuildConfig.VERSION_CODE);
                return pair;
            } else if ("VP8X".equals(sb2)) {
                inputStream.skip(8);
                Pair<Integer, Integer> pair2 = new Pair<>(Integer.valueOf(d(inputStream) + 1), Integer.valueOf(d(inputStream) + 1));
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    e9.printStackTrace();
                }
                MethodCollector.o(BuildConfig.VERSION_CODE);
                return pair2;
            } else {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                MethodCollector.o(BuildConfig.VERSION_CODE);
                return null;
            }
        } catch (IOException e11) {
            e11.printStackTrace();
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            }
            MethodCollector.o(BuildConfig.VERSION_CODE);
            throw th;
        }
    }

    private static boolean a(byte[] bArr, String str) {
        if (4 != str.length()) {
            return false;
        }
        int i2 = 0;
        while (str.charAt(i2) == bArr[i2]) {
            i2++;
            if (i2 >= 4) {
                return true;
            }
        }
        return false;
    }
}
