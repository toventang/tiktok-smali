package h.k;

import com.bytedance.covode.number.Covode;
import h.c;

public interface e<R> extends c<R>, b<R> {
    static {
        Covode.recordClassIndex(105283);
    }

    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // h.k.b
    boolean isSuspend();
}
