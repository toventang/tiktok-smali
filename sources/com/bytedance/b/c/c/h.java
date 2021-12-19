package com.bytedance.b.c.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.monitor.a.c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.Map;

public final class h {
    static {
        Covode.recordClassIndex(15187);
    }

    public static void a(int i2, Map<Integer, i> map) {
        File[] listFiles = new File("/proc/" + i2 + "/task/").listFiles();
        int length = listFiles.length;
        BufferedReader bufferedReader = null;
        for (int i3 = 0; i3 < length; i3++) {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(listFiles[i3].getPath() + "/stat")), 1000);
                try {
                    String readLine = bufferedReader2.readLine();
                    int lastIndexOf = readLine.lastIndexOf(41);
                    String substring = readLine.substring(0, lastIndexOf);
                    String substring2 = readLine.substring(lastIndexOf + 4);
                    int indexOf = substring.indexOf(40);
                    int intValue = Integer.valueOf(substring.substring(0, indexOf - 1)).intValue();
                    String substring3 = substring.substring(indexOf + 1);
                    String[] split = substring2.split(" ");
                    long parseLong = Long.parseLong(split[10]) + Long.parseLong(split[11]);
                    if (!(intValue == 0 || substring3.isEmpty() || parseLong == 0)) {
                        i iVar = new i();
                        iVar.f26104b = substring3;
                        iVar.f26103a = intValue;
                        iVar.f26105c = parseLong;
                        map.put(Integer.valueOf(intValue), iVar);
                    }
                    c.a(bufferedReader2);
                    bufferedReader = bufferedReader2;
                } catch (Throwable unused) {
                    bufferedReader = bufferedReader2;
                    c.a(bufferedReader);
                }
            } catch (FileNotFoundException unused2) {
                c.a(bufferedReader);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r13.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00aa, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ab, code lost:
        r4 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x00a6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r11, java.util.List<com.bytedance.b.c.c.i> r12, java.util.List<com.bytedance.b.c.c.i> r13, double r14) {
        /*
        // Method dump skipped, instructions count: 193
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.b.c.c.h.a(int, java.util.List, java.util.List, double):void");
    }
}
