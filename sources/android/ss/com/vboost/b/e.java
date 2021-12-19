package android.ss.com.vboost.b;

import android.ss.com.vboost.e.d;
import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.io.RandomAccessFile;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f411a = e.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static a f412b = a.UNINITED;

    static {
        Covode.recordClassIndex(18);
    }

    static int b() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("/sys/devices/system/cpu/possible", "r");
            String readLine = randomAccessFile.readLine();
            randomAccessFile.close();
            if (readLine != null) {
                String[] split = readLine.split("-");
                if (split.length == 2) {
                    availableProcessors = Integer.parseInt(split[1]) + 1;
                }
            }
        } catch (IOException | NumberFormatException e2) {
            e2.printStackTrace();
        }
        if (availableProcessors <= 0) {
            return 8;
        }
        return availableProcessors;
    }

    public enum a {
        UNINITED,
        QCOM,
        MTK,
        CHRY,
        SAMSUNG,
        UNKNOWN;

        static {
            Covode.recordClassIndex(19);
        }
    }

    public static a a() {
        a aVar;
        if (f412b != a.UNINITED) {
            return f412b;
        }
        String a2 = d.a("ro.hardware");
        if (a2 != null) {
            if (a2.startsWith("qcom") || a2.startsWith("msm") || a2.startsWith("qsc") || a2.startsWith("sdm")) {
                aVar = a.QCOM;
                f412b = aVar;
                return aVar;
            }
            if (a2.startsWith("mt")) {
                aVar = a.MTK;
            } else if (a2.startsWith("kirin") || a2.startsWith("hi")) {
                aVar = a.CHRY;
            } else {
                String a3 = d.a("ro.hardware.egl");
                if (a3 != null && a3.toLowerCase().equals("adreno")) {
                    aVar = a.QCOM;
                }
            }
            f412b = aVar;
            return aVar;
        }
        aVar = a.UNKNOWN;
        f412b = aVar;
        return aVar;
    }

    static int a(int i2) {
        return a("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
    }

    private static int a(String str) {
        if (str != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
                String readLine = randomAccessFile.readLine();
                randomAccessFile.close();
                return Integer.parseInt(readLine);
            } catch (IOException | NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        return -1;
    }
}
