package com.bytedance.b.k.c;

import android.os.Process;
import com.bytedance.b.k.d;
import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static long f26318a = -1;

    static {
        Covode.recordClassIndex(15286);
    }

    public static long a() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), 1000);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                d.b(bufferedReader);
                return parseLong;
            } catch (Throwable unused) {
                d.b(bufferedReader);
                return -1;
            }
        } catch (Throwable unused2) {
            bufferedReader = null;
            d.b(bufferedReader);
            return -1;
        }
    }
}
