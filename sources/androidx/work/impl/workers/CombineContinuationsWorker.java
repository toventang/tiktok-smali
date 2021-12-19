package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.bytedance.covode.number.Covode;

public class CombineContinuationsWorker extends Worker {
    static {
        Covode.recordClassIndex(1882);
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a d() {
        return new ListenableWorker.a.c(this.f4448b.f4456b);
    }

    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }
}
