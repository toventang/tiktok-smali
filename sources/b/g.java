package b;

import com.bytedance.covode.number.Covode;

public interface g<TTaskResult, TContinuationResult> {
    static {
        Covode.recordClassIndex(1898);
    }

    TContinuationResult then(i<TTaskResult> iVar);
}
