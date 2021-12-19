package com.ss.android.ugc.aweme.utils;

import android.os.Process;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.Callable;

public final class bk {

    /* renamed from: a  reason: collision with root package name */
    public static a f142678a;

    /* renamed from: b  reason: collision with root package name */
    public static Integer f142679b;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public double f142681a;

        /* renamed from: b  reason: collision with root package name */
        public double f142682b;

        static {
            Covode.recordClassIndex(93342);
        }
    }

    static {
        Covode.recordClassIndex(93339);
    }

    public static a a() {
        RandomAccessFile randomAccessFile;
        FileNotFoundException e2;
        IOException e3;
        a aVar = new a();
        RandomAccessFile randomAccessFile2 = null;
        try {
            String valueOf = String.valueOf(Process.myPid());
            RandomAccessFile randomAccessFile3 = new RandomAccessFile("/proc/stat", "r");
            try {
                String[] split = randomAccessFile3.readLine().split(" ");
                double d2 = 0.0d;
                int length = split.length;
                for (int i2 = 2; i2 < length; i2++) {
                    d2 += Double.parseDouble(split[i2]);
                }
                randomAccessFile = new RandomAccessFile("/proc/" + valueOf + "/stat", "r");
                try {
                    String[] split2 = randomAccessFile.readLine().split(" ");
                    aVar.f142681a = Double.parseDouble(split2[13]) + Double.parseDouble(split2[14]) + Double.parseDouble(split2[15]) + Double.parseDouble(split2[16]);
                    aVar.f142682b = d2;
                    a(randomAccessFile3);
                } catch (FileNotFoundException e4) {
                    e2 = e4;
                    randomAccessFile2 = randomAccessFile3;
                    e2.printStackTrace();
                    a(randomAccessFile2);
                    a(randomAccessFile);
                    return aVar;
                } catch (IOException e5) {
                    e3 = e5;
                    randomAccessFile2 = randomAccessFile3;
                    try {
                        e3.printStackTrace();
                        a(randomAccessFile2);
                        a(randomAccessFile);
                        return aVar;
                    } catch (Throwable th) {
                        a(randomAccessFile2);
                        a(randomAccessFile);
                        throw th;
                    }
                } catch (Throwable unused) {
                    randomAccessFile2 = randomAccessFile3;
                    a(randomAccessFile2);
                    a(randomAccessFile);
                    return aVar;
                }
            } catch (FileNotFoundException e6) {
                e2 = e6;
                randomAccessFile = null;
                randomAccessFile2 = randomAccessFile3;
                e2.printStackTrace();
                a(randomAccessFile2);
                a(randomAccessFile);
                return aVar;
            } catch (IOException e7) {
                e3 = e7;
                randomAccessFile = null;
                randomAccessFile2 = randomAccessFile3;
                e3.printStackTrace();
                a(randomAccessFile2);
                a(randomAccessFile);
                return aVar;
            } catch (Throwable unused2) {
                randomAccessFile = null;
                randomAccessFile2 = randomAccessFile3;
                a(randomAccessFile2);
                a(randomAccessFile);
                return aVar;
            }
        } catch (FileNotFoundException e8) {
            e2 = e8;
            randomAccessFile = null;
            e2.printStackTrace();
            a(randomAccessFile2);
            a(randomAccessFile);
            return aVar;
        } catch (IOException e9) {
            e3 = e9;
            randomAccessFile = null;
            e3.printStackTrace();
            a(randomAccessFile2);
            a(randomAccessFile);
            return aVar;
        } catch (Throwable unused3) {
            randomAccessFile = null;
            a(randomAccessFile2);
            a(randomAccessFile);
            return aVar;
        }
        a(randomAccessFile);
        return aVar;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(final boolean z) {
        i.b(new Callable<a>() {
            /* class com.ss.android.ugc.aweme.utils.bk.AnonymousClass2 */

            static {
                Covode.recordClassIndex(93341);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ a call() {
                return bk.a();
            }
        }, i.f4824a).a(new g<a, Void>() {
            /* class com.ss.android.ugc.aweme.utils.bk.AnonymousClass1 */

            static {
                Covode.recordClassIndex(93340);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
            @Override // b.g
            public final /* synthetic */ Void then(i<a> iVar) {
                if (iVar.d() == null) {
                    return null;
                }
                if (!(!z || bk.f142678a == null || iVar.d().f142682b == bk.f142678a.f142682b)) {
                    bk.f142679b = Integer.valueOf((int) (((iVar.d().f142681a - bk.f142678a.f142681a) * 100.0d) / (iVar.d().f142682b - bk.f142678a.f142682b)));
                }
                bk.f142678a = iVar.d();
                return null;
            }
        }, i.f4826c, null);
    }
}
