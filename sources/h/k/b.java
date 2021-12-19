package h.k;

import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

public interface b<R> extends a {
    static {
        Covode.recordClassIndex(105280);
    }

    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    String getName();

    List<Object> getParameters();

    l getReturnType();

    List<Object> getTypeParameters();

    m getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
