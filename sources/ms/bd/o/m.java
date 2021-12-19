package ms.bd.o;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class m extends RuntimeException {
    static {
        Covode.recordClassIndex(105926);
    }

    public m(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
