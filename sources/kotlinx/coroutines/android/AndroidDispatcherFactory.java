package kotlinx.coroutines.android;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    static {
        Covode.recordClassIndex(105529);
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final int getLoadPriority() {
        return 1073741823;
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final a createDispatcher(List<? extends MainDispatcherFactory> list) {
        return new a(c.a(Looper.getMainLooper()), "Main");
    }
}
