package net.jpountz.lz4;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import net.jpountz.util.Native;
import net.jpountz.util.Utils;

public final class LZ4Factory {
    private static LZ4Factory JAVA_SAFE_INSTANCE;
    private static LZ4Factory JAVA_UNSAFE_INSTANCE;
    private static LZ4Factory NATIVE_INSTANCE;
    private final LZ4Compressor fastCompressor;
    private final LZ4FastDecompressor fastDecompressor;
    private final LZ4Compressor highCompressor;
    private final LZ4Compressor[] highCompressors;
    private final String impl;
    private final LZ4SafeDecompressor safeDecompressor;

    static {
        Covode.recordClassIndex(105987);
    }

    public final LZ4Compressor fastCompressor() {
        return this.fastCompressor;
    }

    public final LZ4FastDecompressor fastDecompressor() {
        return this.fastDecompressor;
    }

    public final LZ4Compressor highCompressor() {
        return this.highCompressor;
    }

    public final LZ4SafeDecompressor safeDecompressor() {
        return this.safeDecompressor;
    }

    public final LZ4Decompressor decompressor() {
        return fastDecompressor();
    }

    public final LZ4UnknownSizeDecompressor unknownSizeDecompressor() {
        return safeDecompressor();
    }

    public static LZ4Factory fastestJavaInstance() {
        if (!Utils.isUnalignedAccessAllowed()) {
            return safeInstance();
        }
        try {
            return unsafeInstance();
        } catch (Throwable unused) {
            return safeInstance();
        }
    }

    public static synchronized LZ4Factory nativeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            MethodCollector.i(5561);
            if (NATIVE_INSTANCE == null) {
                NATIVE_INSTANCE = instance("JNI");
            }
            lZ4Factory = NATIVE_INSTANCE;
            MethodCollector.o(5561);
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory safeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            MethodCollector.i(5564);
            if (JAVA_SAFE_INSTANCE == null) {
                JAVA_SAFE_INSTANCE = instance("JavaSafe");
            }
            lZ4Factory = JAVA_SAFE_INSTANCE;
            MethodCollector.o(5564);
        }
        return lZ4Factory;
    }

    public static synchronized LZ4Factory unsafeInstance() {
        LZ4Factory lZ4Factory;
        synchronized (LZ4Factory.class) {
            MethodCollector.i(5565);
            if (JAVA_UNSAFE_INSTANCE == null) {
                JAVA_UNSAFE_INSTANCE = instance("JavaUnsafe");
            }
            lZ4Factory = JAVA_UNSAFE_INSTANCE;
            MethodCollector.o(5565);
        }
        return lZ4Factory;
    }

    public static LZ4Factory fastestInstance() {
        if (!Native.isLoaded() && Native.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            return fastestJavaInstance();
        }
        try {
            return nativeInstance();
        } catch (Throwable unused) {
            return fastestJavaInstance();
        }
    }

    public final String toString() {
        return getClass().getSimpleName() + ":" + this.impl;
    }

    private static LZ4Factory instance(String str) {
        try {
            return new LZ4Factory(str);
        } catch (Exception e2) {
            throw new AssertionError(e2);
        }
    }

    public final LZ4Compressor highCompressor(int i2) {
        if (i2 > 17) {
            i2 = 17;
        } else if (i2 <= 0) {
            i2 = 9;
        }
        return this.highCompressors[i2];
    }

    private static <T> T classInstance(String str) {
        ClassLoader classLoader = LZ4Factory.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return (T) classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static void main(String[] strArr) {
        System.out.println("Fastest instance is " + fastestInstance());
        System.out.println("Fastest Java instance is " + fastestJavaInstance());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: net.jpountz.lz4.LZ4Compressor[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private LZ4Factory(java.lang.String r19) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4Factory.<init>(java.lang.String):void");
    }
}
