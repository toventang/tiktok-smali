package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;

public class DownloadEffectListWithLifeCycleTask extends DownloadEffectListTask {
    private DownloadLifeCycleListener mDownloadLifeCycleListener;

    public interface DownloadLifeCycleListener {
        static {
            Covode.recordClassIndex(95514);
        }

        void onFinally();

        void onStart();
    }

    static {
        Covode.recordClassIndex(95513);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask, com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListTask
    public void execute() {
        DownloadLifeCycleListener downloadLifeCycleListener = this.mDownloadLifeCycleListener;
        if (downloadLifeCycleListener != null) {
            downloadLifeCycleListener.onStart();
        }
        super.execute();
        DownloadLifeCycleListener downloadLifeCycleListener2 = this.mDownloadLifeCycleListener;
        if (downloadLifeCycleListener2 != null) {
            downloadLifeCycleListener2.onFinally();
        }
    }

    public DownloadEffectListWithLifeCycleTask(EffectContext effectContext, List<Effect> list, String str, Handler handler, DownloadEffectExtra downloadEffectExtra, DownloadLifeCycleListener downloadLifeCycleListener) {
        super(effectContext, list, str, handler, downloadEffectExtra);
        this.mDownloadLifeCycleListener = downloadLifeCycleListener;
    }
}
