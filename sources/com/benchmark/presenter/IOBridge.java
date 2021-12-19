package com.benchmark.presenter;

import android.os.Environment;
import com.benchmark.settings.BTCIOSettings;
import com.benchmark.tools.b;
import com.benchmark.tools.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Random;

public class IOBridge {
    public static Random randomGenerator = new Random();
    private boolean internal;
    public BTCIOSettings settings;
    private String testFile;

    public void afterRun() {
        b.c(this.testFile);
    }

    static {
        Covode.recordClassIndex(3039);
    }

    public boolean isExternalStorageWritable() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public HashMap<String, Float> runIOTest() {
        HashMap<String, Float> hashMap = new HashMap<>();
        float write = write(this.settings.blockSize, this.settings.blockNum, true, this.testFile);
        b.c(this.testFile);
        float write2 = write(this.settings.blockSize, this.settings.blockNum, false, this.testFile);
        float read = read(this.settings.blockSize, this.settings.blockNum, true, this.testFile);
        float read2 = read(this.settings.blockSize, this.settings.blockNum, false, this.testFile);
        hashMap.put("random_write", Float.valueOf(j.a(write)));
        hashMap.put("random_read", Float.valueOf(j.a(read)));
        hashMap.put("sequential_write", Float.valueOf(j.a(write2)));
        hashMap.put("sequential_read", Float.valueOf(j.a(read2)));
        return hashMap;
    }

    public int prepare(BTCIOSettings bTCIOSettings) {
        long a2;
        if (!this.internal && !isExternalStorageWritable()) {
            return -10003;
        }
        if (bTCIOSettings.mode.equalsIgnoreCase("internal")) {
            this.internal = true;
        }
        if (this.internal) {
            a2 = b.a(bTCIOSettings.cachePathDir);
        } else {
            a2 = b.a(bTCIOSettings.externalCacheDir);
        }
        if (a2 < ((long) (bTCIOSettings.blockNum * 10 * bTCIOSettings.blockSize))) {
            return -10002;
        }
        this.settings = bTCIOSettings;
        String str = bTCIOSettings.cachePathDir + File.separator + "test.file";
        String str2 = bTCIOSettings.externalCacheDir + File.separator + "test.file";
        if (!this.internal) {
            str = str2;
        }
        this.testFile = str;
        return 0;
    }

    public static float read(int i2, int i3, boolean z, String str) {
        long j2;
        int i4;
        MethodCollector.i(11966);
        File file = new File(str);
        byte[] bArr = new byte[i2];
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            j2 = System.nanoTime();
            i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                try {
                    randomAccessFile.seek((long) (randomGenerator.nextInt(i3 - 1) * i2));
                    randomAccessFile.readFully(bArr, 0, i2);
                    i4 += i2;
                } catch (IOException e2) {
                    MethodCollector.o(11966);
                    throw e2;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    MethodCollector.o(11966);
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileInputStream fileInputStream = new FileInputStream(file);
            j2 = System.nanoTime();
            i4 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                try {
                    fileInputStream.read(bArr, 0, i2);
                    i4 += i2;
                } catch (IOException e3) {
                    MethodCollector.o(11966);
                    throw e3;
                } catch (Throwable th2) {
                    fileInputStream.close();
                    MethodCollector.o(11966);
                    throw th2;
                }
            }
            fileInputStream.close();
        }
        float nanoTime = (((float) i4) / ((float) (System.nanoTime() - j2))) * 1000.0f;
        MethodCollector.o(11966);
        return nanoTime;
    }

    public static float write(int i2, int i3, boolean z, String str) {
        long j2;
        int i4;
        MethodCollector.i(11806);
        byte[] bArr = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr[i5] = -16;
        }
        File file = new File(str);
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
        }
        if (z) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            j2 = System.nanoTime();
            i4 = 0;
            for (int i6 = 0; i6 < i3; i6++) {
                try {
                    randomAccessFile.seek((long) (randomGenerator.nextInt(i3 - 1) * i2));
                    randomAccessFile.write(bArr, 0, i2);
                    i4 += i2;
                } catch (IOException e2) {
                    MethodCollector.o(11806);
                    throw e2;
                } catch (Throwable th) {
                    randomAccessFile.close();
                    MethodCollector.o(11806);
                    throw th;
                }
            }
            randomAccessFile.close();
        } else {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            j2 = System.nanoTime();
            i4 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                try {
                    fileOutputStream.write(bArr, 0, i2);
                    i4 += i2;
                } catch (IOException e3) {
                    MethodCollector.o(11806);
                    throw e3;
                } catch (Throwable th2) {
                    fileOutputStream.close();
                    MethodCollector.o(11806);
                    throw th2;
                }
            }
            fileOutputStream.close();
        }
        float nanoTime = (((float) i4) / ((float) (System.nanoTime() - j2))) * 1000.0f;
        MethodCollector.o(11806);
        return nanoTime;
    }
}
