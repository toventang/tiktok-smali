package okhttp3.internal.publicsuffix;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.InputStream;
import java.net.IDN;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import k.h;
import k.n;
import k.q;
import okhttp3.internal.Util;

public final class PublicSuffixDatabase {
    private static final String[] EMPTY_RULE = new String[0];
    private static final String[] PREVAILING_RULE = {"*"};
    private static final byte[] WILDCARD_LABEL = {42};
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    public static PublicSuffixDatabase get() {
        return instance;
    }

    static {
        Covode.recordClassIndex(106312);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readTheListUninterruptibly() {
        /*
            r5 = this;
            r4 = 0
        L_0x0001:
            r5.readTheList()     // Catch:{ InterruptedIOException -> 0x0005, IOException -> 0x0014 }
            goto L_0x000a
        L_0x0005:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x0029 }
            r4 = 1
            goto L_0x0001
        L_0x000a:
            if (r4 == 0) goto L_0x0013
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0013:
            return
        L_0x0014:
            r3 = move-exception
            okhttp3.internal.platform.Platform r2 = okhttp3.internal.platform.Platform.get()
            r1 = 5
            java.lang.String r0 = "Failed to read public suffix list"
            r2.log(r1, r0, r3)
            if (r4 == 0) goto L_0x0028
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0028:
            return
        L_0x0029:
            r1 = move-exception
            if (r4 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    private void readTheList() {
        MethodCollector.i(6372);
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            MethodCollector.o(6372);
            return;
        }
        h a2 = q.a(new n(q.a(resourceAsStream)));
        try {
            byte[] bArr = new byte[a2.j()];
            a2.b(bArr);
            byte[] bArr2 = new byte[a2.j()];
            a2.b(bArr2);
            Util.closeQuietly(a2);
            synchronized (this) {
                try {
                    this.publicSuffixListBytes = bArr;
                    this.publicSuffixExceptionListBytes = bArr2;
                } catch (Throwable th) {
                    MethodCollector.o(6372);
                    throw th;
                }
            }
            this.readCompleteLatch.countDown();
            MethodCollector.o(6372);
        } catch (Throwable th2) {
            Util.closeQuietly(a2);
            MethodCollector.o(6372);
            throw th2;
        }
    }

    public final String getEffectiveTldPlusOne(String str) {
        int length;
        int length2;
        Objects.requireNonNull(str, "domain == null");
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] findMatchingRule = findMatchingRule(split);
        if (split.length == findMatchingRule.length && findMatchingRule[0].charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule[0].charAt(0) == '!') {
            length = split.length;
            length2 = findMatchingRule.length;
        } else {
            length = split.length;
            length2 = findMatchingRule.length + 1;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i2 = length - length2; i2 < split2.length; i2++) {
            sb.append(split2[i2]).append('.');
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String str2;
        String str3;
        String[] strArr2;
        String[] strArr3;
        MethodCollector.i(6337);
        int i2 = 0;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        synchronized (this) {
            try {
                if (this.publicSuffixListBytes == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
                    MethodCollector.o(6337);
                    throw illegalStateException;
                }
            } catch (Throwable th) {
                MethodCollector.o(6337);
                throw th;
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i3 = 0; i3 < strArr.length; i3++) {
            bArr[i3] = strArr[i3].getBytes(Util.UTF_8);
        }
        int i4 = 0;
        while (true) {
            str = null;
            if (i4 >= length) {
                str2 = null;
                break;
            }
            str2 = binarySearchBytes(this.publicSuffixListBytes, bArr, i4);
            if (str2 != null) {
                break;
            }
            i4++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i5 = 0;
            while (true) {
                if (i5 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i5] = WILDCARD_LABEL;
                str3 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i5);
                if (str3 != null) {
                    break;
                }
                i5++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i2 >= length - 1) {
                    break;
                }
                String binarySearchBytes = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i2);
                if (binarySearchBytes != null) {
                    str = binarySearchBytes;
                    break;
                }
                i2++;
            }
        }
        if (str != null) {
            String[] split = "!".concat(String.valueOf(str)).split("\\.");
            MethodCollector.o(6337);
            return split;
        } else if (str2 == null && str3 == null) {
            String[] strArr4 = PREVAILING_RULE;
            MethodCollector.o(6337);
            return strArr4;
        } else {
            if (str2 != null) {
                strArr2 = str2.split("\\.");
            } else {
                strArr2 = EMPTY_RULE;
            }
            if (str3 != null) {
                strArr3 = str3.split("\\.");
            } else {
                strArr3 = EMPTY_RULE;
            }
            int length2 = strArr2.length;
            int length3 = strArr3.length;
            MethodCollector.o(6337);
            if (length2 > length3) {
                return strArr2;
            }
            return strArr3;
        }
    }

    /* access modifiers changed from: package-private */
    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        if (r2 > 0) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String binarySearchBytes(byte[] r11, byte[][] r12, int r13) {
        /*
        // Method dump skipped, instructions count: 121
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.binarySearchBytes(byte[], byte[][], int):java.lang.String");
    }
}
