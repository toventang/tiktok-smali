package com.bytedance.covode.a;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static File f27393a;

    public interface a {
        static {
            Covode.recordClassIndex(16113);
        }

        void a();
    }

    static {
        Covode.recordClassIndex(16112);
    }

    public static File a(a aVar) {
        File file;
        File file2 = f27393a;
        if (file2 == null) {
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                file = listFiles[i2];
                if ("record".equals(file.getName())) {
                    break;
                }
                i2++;
            }
        }
        file = null;
        if (file == null) {
            return null;
        }
        File file3 = new File(f27393a, "record.dat");
        try {
            a(file, file3, aVar);
            return file3;
        } catch (IOException unused) {
            return null;
        }
    }

    public static File a(a aVar) {
        File file;
        File file2 = f27393a;
        if (file2 != null) {
            return file2;
        }
        ApplicationInfo applicationInfo = aVar.f27391b.getApplicationInfo();
        if (aVar.f27390a == null) {
            file = new File(applicationInfo.dataDir, "covode");
        }
        try {
            String str = aVar.f27391b.getPackageManager().getPackageInfo(aVar.f27391b.getPackageName(), 0).versionName;
            File file3 = new File(file, str + "-" + a(new File(applicationInfo.sourceDir)));
            f27393a = file3;
            file3.mkdirs();
            if (!f27393a.exists()) {
                return null;
            }
            f27393a.getAbsolutePath();
            return f27393a;
        } catch (PackageManager.NameNotFoundException | IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static long a(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            long length = randomAccessFile.length() - 22;
            if (length >= 0) {
                long j2 = length - 65536;
                if (j2 < 0) {
                    j2 = 0;
                }
                int reverseBytes = Integer.reverseBytes(101010256);
                while (true) {
                    randomAccessFile.seek(length);
                    if (randomAccessFile.readInt() != reverseBytes) {
                        length--;
                        if (length < j2) {
                            throw new ZipException("End Of Central Directory signature not found");
                        }
                    } else {
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        randomAccessFile.skipBytes(2);
                        long reverseBytes2 = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                        CRC32 crc32 = new CRC32();
                        randomAccessFile.seek(4294967295L & ((long) Integer.reverseBytes(randomAccessFile.readInt())));
                        byte[] bArr = new byte[8192];
                        int read = randomAccessFile.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                        while (read != -1) {
                            crc32.update(bArr, 0, read);
                            reverseBytes2 -= (long) read;
                            if (reverseBytes2 == 0) {
                                break;
                            }
                            read = randomAccessFile.read(bArr, 0, (int) Math.min(8192L, reverseBytes2));
                        }
                        return crc32.getValue();
                    }
                }
            } else {
                throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
            }
        } finally {
            randomAccessFile.close();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012e, code lost:
        if (r3 == null) goto L_0x0133;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r14, java.io.File r15, com.bytedance.covode.a.b.a r16) {
        /*
        // Method dump skipped, instructions count: 324
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.covode.a.b.a(java.io.File, java.io.File, com.bytedance.covode.a.b$a):void");
    }
}
