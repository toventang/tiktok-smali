package ms.bd.o;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public final class g {
    static {
        Covode.recordClassIndex(105905);
    }

    static boolean a(Context context, String str, String str2) {
        int i2;
        MethodCollector.i(8954);
        boolean z = true;
        try {
            String[] list = context.getAssets().list(str);
            if (list.length > 0) {
                new File(str2).mkdirs();
                for (String str3 : list) {
                    a(context, str + ((String) h.a(16777217, 0, 0, "42ea31", new byte[]{106})) + str3, str2 + ((String) h.a(16777217, 0, 0, "c40b78", new byte[]{61})) + str3);
                }
            } else {
                InputStream open = context.getAssets().open(str);
                FileOutputStream fileOutputStream = new FileOutputStream(new File(str2));
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = open.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.flush();
                open.close();
                fileOutputStream.close();
            }
            i2 = 8954;
        } catch (Exception unused) {
            h.a(16777217, 0, 0, "f97e49", new byte[]{116, 58, 66});
            i2 = 8954;
            z = false;
        }
        MethodCollector.o(i2);
        return z;
    }
}
