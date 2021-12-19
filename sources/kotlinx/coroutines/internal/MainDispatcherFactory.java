package kotlinx.coroutines.internal;

import com.bytedance.covode.number.Covode;
import java.util.List;
import kotlinx.coroutines.ci;

public interface MainDispatcherFactory {
    static {
        Covode.recordClassIndex(105639);
    }

    ci createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
