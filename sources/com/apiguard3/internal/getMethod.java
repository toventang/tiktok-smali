package com.apiguard3.internal;

import android.util.Pair;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public class getMethod {
    public static byte[] AGResponse;
    private static Object AGResponse$Builder;
    private static int AGState;
    public static final int getSharedInstance = 0;
    public static byte[] getStatusCode;
    private static int initialize;
    private static int parseResponseHeaders;
    public static final byte[] statusCode = null;
    private static Object valueOf;
    private static long values;

    private static void $$a() {
        int i2 = (initialize + 70) - 1;
        parseResponseHeaders = i2 % 128;
        int i3 = i2 % 2;
        byte[] bArr = new byte[1100];
        System.arraycopy("\u0006Oì\u0002\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þÿî$åî\tö\bð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFÕê\u0001ëPÔå\u0001ëû\u0000\n\u000fà\bÿ\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðÿî+Úú\u0004ï,Øôñÿ<Êî\u0004ÿï\u0011ì\u000b.ø\u0007üê&æ\u0002\u0006ò\fñÿ<Êî\u0004ÿï\u0011ì\u000b.\u0002Âø÷\fð\u0001\nò;ê÷òêñù\rïüMýÿî.ßûø\u0000\u001eØô\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õÿî\u001cà\u0003\u0012ù\u0011õ\u0012õ\u0015õ\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úö\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜêÿî,áëü0Ë\u0007\u0005ð\u0014ë\u0002í\t\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÉñÿ;Ëî\u0004ÿï\u0011ì\u000b.\u0001Ãø÷\fð\u0001\nò:Ê2\tó\u0003\u0015å\u0001ëû\u0000\n\u000fà\bÿ\b\u0002È\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷ñÿ;Ëî\u0004ÿï\u0011ì\u000b.\u0001Ãø÷\fð\u0001\nò:Åÿî$åî\tö\b=³ð\u0007ï\u0000\u0003\u00023·\fê\u0001CêÐ\u0007ï\u0000\u0003\u0002\u001eØ\u0004ì\u000eûì\fð\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000b\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî)à\u0001úüðüÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tÿî/Ð\bèð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÉñÿ;Ëî\u0004ÿï\u0011ì\u000b.\u0001Ãø÷\fð\u0001\nò:Ë1ÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þð\u0007ï\u0000\u0003\u00023·\fê\u0001C×ìê\u0001\u001cÞ\búö\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004ð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úú\u0012ú\u0010õñÿ;Ëî\u0004ÿï\u0011ì\u000b.\u0001Ãø÷\fð\u0001\nò:ë÷òêñù\rïüMýë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëý\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 1100);
        statusCode = bArr;
        getSharedInstance = 86;
        int i4 = parseResponseHeaders + 81;
        initialize = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String $$c(byte r12, int r13, int r14) {
        /*
        // Method dump skipped, instructions count: 187
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.getMethod.$$c(byte, int, int):java.lang.String");
    }

    public static Object AGRequest(char c2, int i2, int i3) {
        int i4 = parseResponseHeaders;
        boolean z = true;
        int i5 = ((i4 | 119) << 1) - (i4 ^ 119);
        initialize = i5 % 128;
        int i6 = i5 % 2;
        Object obj = AGResponse$Builder;
        int i7 = (i4 & 105) + (i4 | 105);
        initialize = i7 % 128;
        int i8 = i7 % 2;
        try {
            Object[] objArr = new Object[3];
            objArr[2] = Integer.valueOf(i3);
            objArr[1] = Integer.valueOf(i2);
            objArr[0] = Character.valueOf(c2);
            byte[] bArr = statusCode;
            Class<?> cls = Class.forName($$c((byte) bArr[366], 237, (byte) bArr[3]), true, (ClassLoader) valueOf);
            byte b2 = (byte) bArr[480];
            Object com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke = com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke(cls.getMethod($$c(b2, (short) ((b2 ^ 737) | (b2 & 737)), (byte) (-bArr[236])), Character.TYPE, Integer.TYPE, Integer.TYPE), obj, objArr);
            int i9 = (parseResponseHeaders + 2) - 1;
            initialize = i9 % 128;
            if (i9 % 2 != 0) {
                z = false;
            }
            if (z) {
                return com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke;
            }
            throw new NullPointerException("hashCode");
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static Object com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static int getBody(Object obj) {
        int i2 = (parseResponseHeaders + 40) - 1;
        initialize = i2 % 128;
        if (i2 % 2 == 0) {
            Object obj2 = AGResponse$Builder;
            int i3 = initialize;
            int i4 = (i3 & 103) + (i3 | 103);
            parseResponseHeaders = i4 % 128;
            int i5 = i4 % 2;
            int i6 = (i3 & 123) + (i3 | 123);
            parseResponseHeaders = i6 % 128;
            int i7 = i6 % 2;
            try {
                byte[] bArr = statusCode;
                int intValue = ((Integer) com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke(Class.forName($$c((byte) bArr[366], 237, (byte) bArr[3]), true, (ClassLoader) valueOf).getMethod($$c((byte) bArr[480], 386, (byte) bArr[24]), Object.class), obj2, new Object[]{obj})).intValue();
                int i8 = parseResponseHeaders;
                int i9 = ((i8 | 9) << 1) - (i8 ^ 9);
                initialize = i9 % 128;
                int i10 = i9 % 2;
                return intValue;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } else {
            Object obj3 = AGResponse$Builder;
            throw new NullPointerException("hashCode");
        }
    }

    public static int getHeaders(int i2) {
        int i3 = initialize;
        int i4 = (i3 ^ 101) + ((i3 & 101) << 1);
        parseResponseHeaders = i4 % 128;
        int i5 = i4 % 2;
        Object obj = AGResponse$Builder;
        int i6 = (i3 + 42) - 1;
        int i7 = i6 % 128;
        parseResponseHeaders = i7;
        int i8 = i6 % 2;
        int i9 = ((i7 | 105) << 1) - (i7 ^ 105);
        initialize = i9 % 128;
        int i10 = i9 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = statusCode;
            int intValue = ((Integer) com_apiguard3_internal_getMethod_java_lang_reflect_Method_invoke(Class.forName($$c((byte) bArr[366], 237, (byte) bArr[3]), true, (ClassLoader) valueOf).getMethod($$c((byte) bArr[480], 776, (byte) bArr[495]), Integer.TYPE), obj, objArr)).intValue();
            int i11 = (initialize + 42) - 1;
            parseResponseHeaders = i11 % 128;
            int i12 = i11 % 2;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private getMethod() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 933
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    static {
        /*
        // Method dump skipped, instructions count: 6782
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apiguard3.internal.getMethod.<clinit>():void");
    }
}
