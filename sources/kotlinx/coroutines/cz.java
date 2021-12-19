package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.CancellationException;

public final class cz extends CancellationException implements af<cz> {
    public final bz coroutine;

    static {
        Covode.recordClassIndex(105617);
    }

    @Override // kotlinx.coroutines.af
    public final cz createCopy() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        cz czVar = new cz(message, this.coroutine);
        czVar.initCause(this);
        return czVar;
    }

    public cz(String str) {
        this(str, null);
    }

    public cz(String str, bz bzVar) {
        super(str);
        this.coroutine = bzVar;
    }
}
