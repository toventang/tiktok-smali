package kotlinx.coroutines;

import com.bytedance.covode.number.Covode;
import java.lang.Throwable;
import kotlinx.coroutines.af;

public interface af<T extends Throwable & af<T>> {
    static {
        Covode.recordClassIndex(105516);
    }

    T createCopy();
}
