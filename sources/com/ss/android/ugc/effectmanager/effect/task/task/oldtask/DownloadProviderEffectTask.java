package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.EffectRequest;
import com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.common.utils.EffectUtils;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.task.result.DownloadProviderEffectTaskResult;
import java.io.File;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class DownloadProviderEffectTask extends NormalTask {
    private EffectConfiguration mConfiguration;
    private String mDownLoadUrl;
    private ProviderEffect mEffect;
    private EffectContext mEffectContext;
    private String mRemoteIp;
    private String mRequestedUrl;
    private int mRetryCount;

    static {
        Covode.recordClassIndex(95517);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask, com.ss.android.ugc.effectmanager.common.task.NormalTask
    public void cancel() {
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        int i2 = this.mRetryCount;
        for (int i3 = 0; i3 < i2; i3++) {
            if (isCanceled()) {
                sendMessage(19, new DownloadProviderEffectTaskResult(this.mEffect, new ExceptionResult(10001)));
                return;
            }
            try {
                if (TextUtils.isEmpty(this.mEffect.getPath())) {
                    this.mEffect.setPath(this.mConfiguration.getEffectDir() + File.separator + this.mEffect.getId() + ".gif");
                }
                this.mRequestedUrl = this.mDownLoadUrl;
                try {
                    this.mRemoteIp = InetAddress.getByName(new URL(this.mRequestedUrl).getHost()).getHostAddress();
                } catch (UnknownHostException e2) {
                    e2.printStackTrace();
                } catch (MalformedURLException e3) {
                    e3.printStackTrace();
                }
                ProviderEffect download = download(this.mDownLoadUrl, this.mEffect.getPath());
                if (download != null) {
                    sendMessage(19, new DownloadProviderEffectTaskResult(download, null));
                    return;
                }
            } catch (Exception e4) {
                if (i3 == i2 - 1) {
                    e4.printStackTrace();
                    ExceptionResult exceptionResult = new ExceptionResult(e4);
                    exceptionResult.setTrackParams(this.mRequestedUrl, "", this.mRemoteIp);
                    sendMessage(19, new DownloadProviderEffectTaskResult(this.mEffect, exceptionResult));
                    return;
                }
            }
        }
    }

    private ProviderEffect download(String str, String str2) {
        EffectRequest effectRequest = new EffectRequest("GET", str, false);
        InputStream execute = this.mEffectContext.getEffectConfiguration().getEffectNetWorker().execute(effectRequest);
        final DownloadProviderEffectTaskResult downloadProviderEffectTaskResult = new DownloadProviderEffectTaskResult(this.mEffect, null, 0, 0);
        EffectUtils.convertStreamToFile(execute, str2, effectRequest.getContentLength(), new DownloadListenerAdapter() {
            /* class com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadProviderEffectTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(95518);
            }

            @Override // com.ss.android.ugc.effectmanager.common.download.DownloadListener, com.ss.android.ugc.effectmanager.common.download.DownloadListenerAdapter
            public void onProgress(int i2, long j2) {
                downloadProviderEffectTaskResult.setProgress(i2).setTotalSize(j2);
                DownloadProviderEffectTask.this.sendMessage(54, downloadProviderEffectTaskResult);
            }
        });
        return this.mEffect;
    }

    public DownloadProviderEffectTask(EffectContext effectContext, String str, ProviderEffect providerEffect, Handler handler) {
        super(handler, str);
        this.mEffect = providerEffect;
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
        this.mRetryCount = effectContext.getEffectConfiguration().getRetryCount();
        this.mDownLoadUrl = EffectUtils.getUrl(providerEffect);
    }
}
