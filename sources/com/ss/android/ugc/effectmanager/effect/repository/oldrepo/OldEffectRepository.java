package com.ss.android.ugc.effectmanager.effect.repository.oldrepo;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.utils.EffectExtKt;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener;
import com.ss.android.ugc.effectmanager.effect.listener.IEffectListResponseListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListWithLifeCycleListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchHotEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchResourceListener;
import com.ss.android.ugc.effectmanager.effect.listener.ISearchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository;
import com.ss.android.ugc.effectmanager.effect.repository.newrepo.EffectDownloadManager;
import com.ss.android.ugc.effectmanager.effect.task.result.DownloadProviderEffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectListTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchEffectListByIdTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchResourceListTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.HotEffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.QueryVideoUsedStickerTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.SearchEffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.CheckResourceListTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListByIdsTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListWithLifeCycleTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadProviderEffectTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectCacheTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectListByIdsTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectListByResourceIdsTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchHotEffectTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchResourceListTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.QueryVideoUsedStickerTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.SearchEffectTask;
import java.util.List;
import java.util.Map;

public class OldEffectRepository implements WeakHandler.IHandler, IEffectRepository {
    private EffectConfiguration mConfiguration;
    private EffectContext mEffectContext;
    public Handler mHandler = new WeakHandler(this);
    private EffectListener mListener;

    public interface EffectListener {
        static {
            Covode.recordClassIndex(95480);
        }

        void updateEffectListStatus(String str, List<Effect> list, ExceptionResult exceptionResult);

        void updateEffectStatus(String str, Effect effect, int i2, ExceptionResult exceptionResult);
    }

    static {
        Covode.recordClassIndex(95473);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public Handler getHandler() {
        return this.mHandler;
    }

    public void setListener(EffectListener effectListener) {
        this.mListener = effectListener;
    }

    public OldEffectRepository(EffectContext effectContext) {
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.mListener != null) {
            if (message.what == 15 && (message.obj instanceof EffectTaskResult)) {
                EffectTaskResult effectTaskResult = (EffectTaskResult) message.obj;
                Effect effect = effectTaskResult.getEffect();
                ExceptionResult exception = effectTaskResult.getException();
                if (exception == null) {
                    this.mListener.updateEffectStatus(effectTaskResult.getTaskID(), effect, 20, null);
                } else {
                    this.mListener.updateEffectStatus(effectTaskResult.getTaskID(), effect, 26, exception);
                }
            }
            if (message.what == 17 && (message.obj instanceof EffectListTaskResult)) {
                EffectListTaskResult effectListTaskResult = (EffectListTaskResult) message.obj;
                ExceptionResult exception2 = effectListTaskResult.getException();
                if (exception2 == null) {
                    this.mListener.updateEffectListStatus(effectListTaskResult.getTaskID(), effectListTaskResult.getEffectList(), null);
                } else {
                    this.mListener.updateEffectListStatus(effectListTaskResult.getTaskID(), effectListTaskResult.getEffectList(), exception2);
                }
            }
            if (message.what == 23 && (message.obj instanceof FetchEffectListByIdTaskResult)) {
                FetchEffectListByIdTaskResult fetchEffectListByIdTaskResult = (FetchEffectListByIdTaskResult) message.obj;
                ExceptionResult exception3 = fetchEffectListByIdTaskResult.getException();
                IFetchEffectListByIdsListener fetchEffectListByIdsListener = this.mConfiguration.getListenerManger().getFetchEffectListByIdsListener(fetchEffectListByIdTaskResult.getTaskID());
                if (fetchEffectListByIdsListener != null) {
                    if (exception3 == null) {
                        fetchEffectListByIdsListener.onSuccess(fetchEffectListByIdTaskResult.getEffectResponse());
                    } else {
                        fetchEffectListByIdsListener.onFail(exception3);
                    }
                    this.mConfiguration.getListenerManger().removeFetchEffectListByIdsListener(fetchEffectListByIdTaskResult.getTaskID());
                }
            }
            if (message.what == 24 && (message.obj instanceof FetchResourceListTaskResult)) {
                FetchResourceListTaskResult fetchResourceListTaskResult = (FetchResourceListTaskResult) message.obj;
                ExceptionResult exception4 = fetchResourceListTaskResult.getException();
                IFetchResourceListener iFetchResourceListener = (IFetchResourceListener) this.mConfiguration.getListenerManger().getListener(fetchResourceListTaskResult.getTaskID());
                if (iFetchResourceListener != null) {
                    if (exception4 == null) {
                        iFetchResourceListener.onSuccess(fetchResourceListTaskResult.getResult());
                    } else {
                        iFetchResourceListener.onFail(exception4);
                    }
                }
                this.mConfiguration.getListenerManger().removeListener(fetchResourceListTaskResult.getTaskID());
            }
            if (message.what == 60 && (message.obj instanceof SearchEffectTaskResult)) {
                SearchEffectTaskResult searchEffectTaskResult = (SearchEffectTaskResult) message.obj;
                ExceptionResult exception5 = searchEffectTaskResult.getException();
                ISearchEffectListener iSearchEffectListener = (ISearchEffectListener) this.mConfiguration.getListenerManger().getListener(searchEffectTaskResult.getTaskID());
                if (iSearchEffectListener != null) {
                    if (exception5 == null) {
                        iSearchEffectListener.onSuccess(searchEffectTaskResult.getResponse());
                    } else {
                        iSearchEffectListener.onFail(exception5);
                    }
                    this.mConfiguration.getListenerManger().removeListener(searchEffectTaskResult.getTaskID());
                }
            }
            if (message.what == 62 && (message.obj instanceof HotEffectTaskResult)) {
                HotEffectTaskResult hotEffectTaskResult = (HotEffectTaskResult) message.obj;
                ExceptionResult exception6 = hotEffectTaskResult.getException();
                IFetchHotEffectListener iFetchHotEffectListener = (IFetchHotEffectListener) this.mConfiguration.getListenerManger().getListener(hotEffectTaskResult.getTaskID());
                if (iFetchHotEffectListener != null) {
                    if (exception6 == null) {
                        iFetchHotEffectListener.onSuccess(hotEffectTaskResult.getResponse());
                    } else {
                        iFetchHotEffectListener.onFailed(exception6);
                    }
                    this.mConfiguration.getListenerManger().removeListener(hotEffectTaskResult.getTaskID());
                }
            }
            if (message.what == 19 && (message.obj instanceof DownloadProviderEffectTaskResult)) {
                DownloadProviderEffectTaskResult downloadProviderEffectTaskResult = (DownloadProviderEffectTaskResult) message.obj;
                ExceptionResult exception7 = downloadProviderEffectTaskResult.getException();
                IDownloadProviderEffectListener downloadProviderEffectListener = this.mConfiguration.getListenerManger().getDownloadProviderEffectListener(downloadProviderEffectTaskResult.getTaskID());
                if (downloadProviderEffectListener != null) {
                    if (exception7 == null) {
                        downloadProviderEffectListener.onSuccess(downloadProviderEffectTaskResult.getEffect());
                    } else {
                        downloadProviderEffectListener.onFail(downloadProviderEffectTaskResult.getEffect(), downloadProviderEffectTaskResult.getException());
                    }
                }
                this.mConfiguration.getListenerManger().removeDownloadProviderEffectListener(downloadProviderEffectTaskResult.getTaskID());
            }
            if (message.what == 54 && (message.obj instanceof DownloadProviderEffectTaskResult)) {
                DownloadProviderEffectTaskResult downloadProviderEffectTaskResult2 = (DownloadProviderEffectTaskResult) message.obj;
                IDownloadProviderEffectListener downloadProviderEffectListener2 = this.mConfiguration.getListenerManger().getDownloadProviderEffectListener(downloadProviderEffectTaskResult2.getTaskID());
                if (downloadProviderEffectListener2 instanceof IDownloadProviderEffectProgressListener) {
                    ((IDownloadProviderEffectProgressListener) downloadProviderEffectListener2).onProgress(downloadProviderEffectTaskResult2.getEffect(), downloadProviderEffectTaskResult2.getProgress(), downloadProviderEffectTaskResult2.getTotalSize());
                }
            }
            if (message.what == 42 && (message.obj instanceof EffectTaskResult)) {
                EffectTaskResult effectTaskResult2 = (EffectTaskResult) message.obj;
                IFetchEffectListener fetchEffectListener = this.mConfiguration.getListenerManger().getFetchEffectListener(effectTaskResult2.getTaskID());
                if (fetchEffectListener != null) {
                    fetchEffectListener.onStart(effectTaskResult2.getEffect());
                }
            }
            if (message.what == 53 && (message.obj instanceof EffectTaskResult)) {
                EffectTaskResult effectTaskResult3 = (EffectTaskResult) message.obj;
                IFetchEffectListener fetchEffectListener2 = this.mConfiguration.getListenerManger().getFetchEffectListener(effectTaskResult3.getTaskID());
                if (fetchEffectListener2 instanceof IEffectDownloadProgressListener) {
                    ((IEffectDownloadProgressListener) fetchEffectListener2).onProgress(effectTaskResult3.getEffect(), effectTaskResult3.getProgress(), effectTaskResult3.getTotalSize());
                }
            }
            if (message.what == 61 && (message.obj instanceof QueryVideoUsedStickerTaskResult)) {
                QueryVideoUsedStickerTaskResult queryVideoUsedStickerTaskResult = (QueryVideoUsedStickerTaskResult) message.obj;
                ExceptionResult exception8 = queryVideoUsedStickerTaskResult.getException();
                IEffectListResponseListener iEffectListResponseListener = (IEffectListResponseListener) this.mConfiguration.getListenerManger().getListener(queryVideoUsedStickerTaskResult.getTaskID());
                if (iEffectListResponseListener != null) {
                    if (exception8 == null) {
                        iEffectListResponseListener.onSuccess(queryVideoUsedStickerTaskResult.getResponse());
                    } else {
                        iEffectListResponseListener.onFail(exception8);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String checkResourceList(Map<String, String> map, IFetchResourceListener iFetchResourceListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setListener(generateTaskId, iFetchResourceListener);
        this.mConfiguration.getTaskManager().commit(new CheckResourceListTask(this.mEffectContext, this.mHandler, generateTaskId, map));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String downloadProviderEffectList(ProviderEffect providerEffect, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setDownloadProviderEffectListener(generateTaskId, iDownloadProviderEffectListener);
        this.mConfiguration.getTaskManager().commit(new DownloadProviderEffectTask(this.mEffectContext, generateTaskId, providerEffect, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String fetchEffectFromCache(Effect effect, IFetchEffectListener iFetchEffectListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectListener(generateTaskId, iFetchEffectListener);
        this.mConfiguration.getTaskManager().commit(new FetchEffectCacheTask(this.mEffectContext, effect, this.mHandler, generateTaskId));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String fetchResourceList(Map<String, String> map, IFetchResourceListener iFetchResourceListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setListener(generateTaskId, iFetchResourceListener);
        this.mConfiguration.getTaskManager().commit(new FetchResourceListTask(this.mEffectContext, this.mHandler, generateTaskId, map));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String queryVideoUsedStickers(Map<String, String> map, IEffectListResponseListener iEffectListResponseListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setListener(generateTaskId, iEffectListResponseListener);
        this.mConfiguration.getTaskManager().commit(new QueryVideoUsedStickerTask(this.mEffectContext, map, this.mHandler, generateTaskId));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public synchronized String fetchEffect(Effect effect, final IFetchEffectListener iFetchEffectListener) {
        MethodCollector.i(953);
        EffectDownloadManager effectDownloadManager = this.mEffectContext.getEffectConfiguration().getEffectDownloadManager();
        if (effectDownloadManager == null || !effectDownloadManager.isDownloading(EffectExtKt.expectedMd5(effect))) {
            if (effectDownloadManager != null) {
                effectDownloadManager.addDownloadEffect(effect);
            }
            String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
            this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectListener(generateTaskId, iFetchEffectListener);
            DownloadEffectTask downloadEffectTask = new DownloadEffectTask(effect, this.mEffectContext, generateTaskId, this.mHandler);
            this.mListener.updateEffectStatus("", effect, 21, null);
            this.mConfiguration.getTaskManager().commit(downloadEffectTask);
            MethodCollector.o(953);
            return generateTaskId;
        }
        if (iFetchEffectListener != null) {
            iFetchEffectListener.onStart(effect);
            effectDownloadManager.addDownloadListener(effect, new IEffectDownloadProgressListener() {
                /* class com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldEffectRepository.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95474);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public void onStart(final Effect effect) {
                    OldEffectRepository.this.mHandler.post(new Runnable() {
                        /* class com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldEffectRepository.AnonymousClass1.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(95477);
                        }

                        public void run() {
                            iFetchEffectListener.onStart(effect);
                        }
                    });
                }

                public void onSuccess(final Effect effect) {
                    OldEffectRepository.this.mHandler.post(new Runnable() {
                        /* class com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldEffectRepository.AnonymousClass1.AnonymousClass4 */

                        static {
                            Covode.recordClassIndex(95478);
                        }

                        public void run() {
                            iFetchEffectListener.onSuccess(effect);
                        }
                    });
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public void onFail(final Effect effect, final ExceptionResult exceptionResult) {
                    OldEffectRepository.this.mHandler.post(new Runnable() {
                        /* class com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldEffectRepository.AnonymousClass1.AnonymousClass2 */

                        static {
                            Covode.recordClassIndex(95476);
                        }

                        public void run() {
                            iFetchEffectListener.onFail(effect, exceptionResult);
                        }
                    });
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IEffectDownloadProgressListener
                public void onProgress(final Effect effect, final int i2, final long j2) {
                    if (iFetchEffectListener instanceof IEffectDownloadProgressListener) {
                        OldEffectRepository.this.mHandler.post(new Runnable() {
                            /* class com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldEffectRepository.AnonymousClass1.AnonymousClass1 */

                            static {
                                Covode.recordClassIndex(95475);
                            }

                            public void run() {
                                ((IEffectDownloadProgressListener) iFetchEffectListener).onProgress(effect, i2, j2);
                            }
                        });
                    }
                }
            });
        }
        MethodCollector.o(953);
        return "";
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String fetchEffectListById(List<String> list, Map<String, String> map, IFetchEffectListListener iFetchEffectListListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectListListener(generateTaskId, iFetchEffectListListener);
        this.mConfiguration.getTaskManager().commit(new DownloadEffectListByIdsTask(this.mEffectContext, list, this.mHandler, generateTaskId, map));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String fetchEffectListById2(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectListByIdsListener(generateTaskId, iFetchEffectListByIdsListener);
        this.mConfiguration.getTaskManager().commit(new FetchEffectListByIdsTask(this.mEffectContext, list, this.mHandler, generateTaskId, map));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String fetchEffectListByResourceId(List<String> list, Map<String, String> map, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectListByIdsListener(generateTaskId, iFetchEffectListByIdsListener);
        this.mConfiguration.getTaskManager().commit(new FetchEffectListByResourceIdsTask(this.mEffectContext, list, this.mHandler, generateTaskId, map));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String fetchEffectList(List<? extends Effect> list, DownloadEffectExtra downloadEffectExtra, final IFetchEffectListListener iFetchEffectListListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectListListener(generateTaskId, iFetchEffectListListener);
        if (iFetchEffectListListener instanceof IFetchEffectListWithLifeCycleListener) {
            this.mConfiguration.getTaskManager().commit(new DownloadEffectListWithLifeCycleTask(this.mEffectContext, list, generateTaskId, this.mHandler, downloadEffectExtra, new DownloadEffectListWithLifeCycleTask.DownloadLifeCycleListener() {
                /* class com.ss.android.ugc.effectmanager.effect.repository.oldrepo.OldEffectRepository.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(95479);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListWithLifeCycleTask.DownloadLifeCycleListener
                public void onFinally() {
                    ((IFetchEffectListWithLifeCycleListener) iFetchEffectListListener).onFinally();
                }

                @Override // com.ss.android.ugc.effectmanager.effect.task.task.oldtask.DownloadEffectListWithLifeCycleTask.DownloadLifeCycleListener
                public void onStart() {
                    ((IFetchEffectListWithLifeCycleListener) iFetchEffectListListener).onStart();
                }
            }));
        } else {
            this.mConfiguration.getTaskManager().commit(new DownloadEffectListTask(this.mEffectContext, list, generateTaskId, this.mHandler, downloadEffectExtra));
        }
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String fetchHotEffect(int i2, int i3, Map<String, String> map, boolean z, IFetchHotEffectListener iFetchHotEffectListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setListener(generateTaskId, iFetchHotEffectListener);
        this.mConfiguration.getTaskManager().commit(new FetchHotEffectTask(this.mEffectContext, i2, i3, map, this.mHandler, generateTaskId));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectRepository
    public String searchEffect(String str, String str2, int i2, int i3, Map<String, String> map, ISearchEffectListener iSearchEffectListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setListener(generateTaskId, iSearchEffectListener);
        this.mConfiguration.getTaskManager().commit(new SearchEffectTask(this.mEffectContext, str, str2, i2, i3, map, this.mHandler, generateTaskId));
        return generateTaskId;
    }
}
