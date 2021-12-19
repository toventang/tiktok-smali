package net.jpountz.util;

import com.bytedance.covode.number.Covode;
import java.nio.ByteOrder;

public enum Utils {
    ;
    
    public static final ByteOrder NATIVE_BYTE_ORDER = ByteOrder.nativeOrder();
    private static final boolean unalignedAccessAllowed;

    public static boolean isUnalignedAccessAllowed() {
        return unalignedAccessAllowed;
    }

    static {
        Covode.recordClassIndex(106024);
        boolean z = false;
        String property = System.getProperty("os.arch");
        if (property.equals("i386") || property.equals("x86") || property.equals("amd64") || property.equals("x86_64") || property.equals("aarch64") || property.equals("ppc64le")) {
            z = true;
        }
        unalignedAccessAllowed = z;
    }
}
