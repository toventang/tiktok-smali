package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.task.SyncTask;
import com.ss.android.ugc.effectmanager.common.task.SyncTaskListener;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.common.utils.EventJsonBuilder;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.bridge.EffectFetcherArguments;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import java.util.List;

public class DownloadEffectTask extends NormalTask {
    private EffectConfiguration mConfiguration;
    private int mCurCnt;
    private List<String> mDownLoadUrl;
    public Effect mEffect;
    private EffectContext mEffectContext;
    public EffectDownloadManager mEffectDownloadManager;
    private DownloadEffectExtra mExtra;
    private IMonitorService mMonitorService;

    static {
        Covode.recordClassIndex(95515);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        downloadEffect();
    }

    private void downloadEffect() {
        SyncTask<EffectTaskResult> fetchEffect = this.mEffectContext.getEffectConfiguration().getEffectFetcher().fetchEffect(new EffectFetcherArguments(this.mEffect, this.mDownLoadUrl, this.mConfiguration.getEffectDir().getPath()));
        final EffectTaskResult totalSize = new EffectTaskResult(this.mEffect, null).setProgress(0).setTotalSize(0);
        fetchEffect.setListener(new SyncTaskListener<EffectTaskResult>() {
            /* class com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(95516);
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onFinally(SyncTask<EffectTaskResult> syncTask) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onStart(SyncTask<EffectTaskResult> syncTask) {
                if (DownloadEffectTask.this.mEffectDownloadManager != null) {
                    DownloadEffectTask.this.mEffectDownloadManager.startDownloadEffect(DownloadEffectTask.this.mEffect);
                }
                DownloadEffectTask.this.sendMessage(42, new EffectTaskResult(DownloadEffectTask.this.mEffect, null));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onFailed(SyncTask<EffectTaskResult> syncTask, ExceptionResult exceptionResult) {
                DownloadEffectTask.this.mobResult(false, exceptionResult);
                if (DownloadEffectTask.this.mEffectDownloadManager != null) {
                    DownloadEffectTask.this.mEffectDownloadManager.failedDownloadEffect(DownloadEffectTask.this.mEffect, exceptionResult);
                }
                DownloadEffectTask.this.sendMessage(15, new EffectTaskResult(DownloadEffectTask.this.mEffect, exceptionResult));
            }

            public void onResponse(SyncTask<EffectTaskResult> syncTask, EffectTaskResult effectTaskResult) {
                DownloadEffectTask.this.mobResult(true, null);
                if (DownloadEffectTask.this.mEffectDownloadManager != null) {
                    DownloadEffectTask.this.mEffectDownloadManager.finishDownloadEffect(DownloadEffectTask.this.mEffect);
                }
                DownloadEffectTask.this.sendMessage(15, new EffectTaskResult(effectTaskResult.getEffect(), null));
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.SyncTaskListener
            public void onProgress(SyncTask<EffectTaskResult> syncTask, int i2, long j2) {
                if (DownloadEffectTask.this.mEffectDownloadManager != null) {
                    DownloadEffectTask.this.mEffectDownloadManager.onEffectDownloadProgressChange(DownloadEffectTask.this.mEffect, i2, j2);
                }
                DownloadEffectTask.this.sendMessage(53, totalSize.setProgress(i2).setTotalSize(j2));
            }
        });
        fetchEffect.execute();
    }

    public void mobResult(boolean z, ExceptionResult exceptionResult) {
        DownloadEffectExtra downloadEffectExtra;
        String effectId;
        String name;
        String sb;
        if (!(this.mMonitorService == null || (downloadEffectExtra = this.mExtra) == null)) {
            if (TextUtils.equals("beautify", downloadEffectExtra.getPanel()) || TextUtils.equals("beautifynew", this.mExtra.getPanel())) {
                int i2 = !z ? 1 : 0;
                StringBuilder sb2 = new StringBuilder();
                List<String> list = this.mDownLoadUrl;
                if (list != null) {
                    for (String str : list) {
                        sb2.append(str);
                        sb2.append(",");
                    }
                }
                IMonitorService iMonitorService = this.mMonitorService;
                EventJsonBuilder newBuilder = EventJsonBuilder.newBuilder();
                Effect effect = this.mEffect;
                String str2 = "";
                if (effect == null) {
                    effectId = str2;
                } else {
                    effectId = effect.getEffectId();
                }
                EventJsonBuilder addValuePair = newBuilder.addValuePair("effect_id", effectId);
                Effect effect2 = this.mEffect;
                if (effect2 == null) {
                    name = str2;
                } else {
                    name = effect2.getName();
                }
                EventJsonBuilder addValuePair2 = addValuePair.addValuePair("effect_name", name).addValuePair("app_id", this.mConfiguration.getAppID()).addValuePair("access_key", this.mConfiguration.getAccessKey()).addValuePair("download_urls", sb2.toString()).addValuePair("panel", this.mExtra.getPanel());
                if (exceptionResult == null) {
                    sb = str2;
                } else {
                    sb = new StringBuilder().append(exceptionResult.getErrorCode()).toString();
                }
                EventJsonBuilder addValuePair3 = addValuePair2.addValuePair("error_code", sb);
                if (exceptionResult != null) {
                    str2 = exceptionResult.getMsg();
                }
                iMonitorService.monitorStatusRate("effect_resource_download_success_rate", i2, addValuePair3.addValuePair("error_msg", str2).addValuePair("effect_platform_type", (Integer) 0).build());
            }
        }
    }

    public DownloadEffectTask(Effect effect, EffectContext effectContext, String str, Handler handler) {
        this(effect, effectContext, str, handler, null);
    }

    public DownloadEffectTask(Effect effect, EffectContext effectContext, String str, Handler handler, DownloadEffectExtra downloadEffectExtra) {
        super(handler, str);
        this.mEffect = effect;
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mCurCnt = effectContext.getEffectConfiguration().getRetryCount();
        this.mDownLoadUrl = EffectUtils.getUrl(this.mEffect.getFileUrl());
        this.mExtra = downloadEffectExtra;
        this.mMonitorService = this.mConfiguration.getMonitorService();
        this.mEffectDownloadManager = this.mConfiguration.getEffectDownloadManager();
    }
}
