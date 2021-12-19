package com.ss.android.ugc.effectmanager.effect.repository.oldrepo;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.ITask;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectChannelTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectCheckUpdateResult;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchCategoryEffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchPanelInfoTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.ProviderEffectTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.ScanQRCodeTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.CheckUpdateTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchCategoryEffectCacheTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchCategoryEffectTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectChannelCacheTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectChannelTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchEffectInfoByQRCodeTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchExistEffectListTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchPanelInfoCacheTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchPanelInfoTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchProviderEffectTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.SearchProviderEffectTask;
import java.util.Map;

public class OldEffectListRepository implements WeakHandler.IHandler, IEffectListRepository {
    private EffectConfiguration mConfiguration;
    private EffectContext mEffectContext;
    private EffectListListener mEffectListListener;
    private Handler mHandler = new WeakHandler(this);

    public interface EffectListListener {
        static {
            Covode.recordClassIndex(95471);
        }

        void updateEffectChannel(String str, EffectChannelResponse effectChannelResponse, int i2, ExceptionResult exceptionResult);
    }

    static {
        Covode.recordClassIndex(95470);
    }

    public void setOnEffectListListener(EffectListListener effectListListener) {
        this.mEffectListListener = effectListListener;
    }

    public OldEffectListRepository(EffectContext effectContext) {
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        if (this.mEffectListListener != null) {
            if (message.what == 14 && (message.obj instanceof EffectChannelTaskResult)) {
                EffectChannelTaskResult effectChannelTaskResult = (EffectChannelTaskResult) message.obj;
                ExceptionResult exception = effectChannelTaskResult.getException();
                if (exception == null) {
                    this.mEffectListListener.updateEffectChannel(effectChannelTaskResult.getTaskID(), effectChannelTaskResult.getEffectChannels(), 23, null);
                } else {
                    this.mEffectListListener.updateEffectChannel(effectChannelTaskResult.getTaskID(), effectChannelTaskResult.getEffectChannels(), 27, exception);
                }
            }
            if (message.what == 22 && (message.obj instanceof FetchPanelInfoTaskResult)) {
                FetchPanelInfoTaskResult fetchPanelInfoTaskResult = (FetchPanelInfoTaskResult) message.obj;
                IFetchPanelInfoListener fetchPanelInfoListener = this.mConfiguration.getListenerManger().getFetchPanelInfoListener(fetchPanelInfoTaskResult.getTaskID());
                if (fetchPanelInfoListener != null) {
                    ExceptionResult exception2 = fetchPanelInfoTaskResult.getException();
                    if (exception2 == null) {
                        fetchPanelInfoListener.onSuccess(fetchPanelInfoTaskResult.getPanelInfoModel());
                    } else {
                        fetchPanelInfoListener.onFail(exception2);
                    }
                    this.mConfiguration.getListenerManger().removeFetchPanelInfoListener(fetchPanelInfoTaskResult.getTaskID());
                }
            }
            if (message.what == 18 && (message.obj instanceof ProviderEffectTaskResult)) {
                ProviderEffectTaskResult providerEffectTaskResult = (ProviderEffectTaskResult) message.obj;
                ExceptionResult exception3 = providerEffectTaskResult.getException();
                IFetchProviderEffect fetchProviderEffectListener = this.mConfiguration.getListenerManger().getFetchProviderEffectListener(providerEffectTaskResult.getTaskID());
                if (fetchProviderEffectListener != null) {
                    if (exception3 == null) {
                        fetchProviderEffectListener.onSuccess(providerEffectTaskResult.getEffectListResponse());
                    } else {
                        fetchProviderEffectListener.onFail(providerEffectTaskResult.getException());
                    }
                    this.mConfiguration.getListenerManger().removeFetchProviderEffectListener(providerEffectTaskResult.getTaskID());
                }
            }
            if (message.what == 21 && (message.obj instanceof FetchCategoryEffectTaskResult)) {
                FetchCategoryEffectTaskResult fetchCategoryEffectTaskResult = (FetchCategoryEffectTaskResult) message.obj;
                ExceptionResult exception4 = fetchCategoryEffectTaskResult.getException();
                IFetchCategoryEffectListener fetchCategoryEffectListener = this.mConfiguration.getListenerManger().getFetchCategoryEffectListener(fetchCategoryEffectTaskResult.getTaskID());
                if (fetchCategoryEffectListener != null) {
                    if (exception4 == null) {
                        fetchCategoryEffectListener.onSuccess(fetchCategoryEffectTaskResult.getEffectChannels());
                    } else {
                        fetchCategoryEffectListener.onFail(exception4);
                    }
                    this.mConfiguration.getListenerManger().removeFetchCategoryEffectListener(fetchCategoryEffectTaskResult.getTaskID());
                }
            }
            if (message.what == 13 && (message.obj instanceof EffectCheckUpdateResult)) {
                EffectCheckUpdateResult effectCheckUpdateResult = (EffectCheckUpdateResult) message.obj;
                ExceptionResult exception5 = effectCheckUpdateResult.getException();
                ICheckChannelListener checkChannelListener = this.mConfiguration.getListenerManger().getCheckChannelListener(effectCheckUpdateResult.getTaskID());
                if (checkChannelListener != null) {
                    if (exception5 == null) {
                        checkChannelListener.checkChannelSuccess(effectCheckUpdateResult.isUpdate());
                    } else {
                        checkChannelListener.checkChannelFailed(exception5);
                    }
                    this.mConfiguration.getListenerManger().removeCheckChannelListener(effectCheckUpdateResult.getTaskID());
                }
            }
            if (message.what == 25 && (message.obj instanceof ScanQRCodeTaskResult)) {
                ScanQRCodeTaskResult scanQRCodeTaskResult = (ScanQRCodeTaskResult) message.obj;
                ExceptionResult exceptionResult = scanQRCodeTaskResult.exception;
                IScanQRCodeListener scanQRCodeListener = this.mConfiguration.getListenerManger().getScanQRCodeListener(scanQRCodeTaskResult.getTaskID());
                if (scanQRCodeListener != null) {
                    if (exceptionResult == null) {
                        scanQRCodeListener.onSuccess(scanQRCodeTaskResult.effect);
                    } else {
                        scanQRCodeListener.onFail(exceptionResult);
                    }
                    this.mConfiguration.getListenerManger().removeScanQRCodeListener(scanQRCodeTaskResult.getTaskID());
                }
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchEffectInfoByQRCode(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setScanQRCodeListener(generateTaskId, iScanQRCodeListener);
        this.mConfiguration.getTaskManager().commit(new FetchEffectInfoByQRCodeTask(this.mEffectContext, effectQRCode, generateTaskId, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectChannelListener(generateTaskId, iFetchEffectChannelListener);
        this.mConfiguration.getTaskManager().commit(new FetchExistEffectListTask(str, generateTaskId, this.mEffectContext, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener) {
        ITask fetchEffectChannelTask;
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchEffectChannelListener(generateTaskId, iFetchEffectChannelListener);
        if (z) {
            fetchEffectChannelTask = new FetchEffectChannelCacheTask(this.mEffectContext, str, generateTaskId, this.mHandler, false);
        } else {
            fetchEffectChannelTask = new FetchEffectChannelTask(this.mEffectContext, str, generateTaskId, this.mHandler);
        }
        this.mConfiguration.getTaskManager().commit(fetchEffectChannelTask);
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchProviderEffectList(String str, int i2, int i3, IFetchProviderEffect iFetchProviderEffect) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchProviderEffectListener(generateTaskId, iFetchProviderEffect);
        this.mConfiguration.getTaskManager().commit(new FetchProviderEffectTask(this.mEffectContext, generateTaskId, str, i2, i3, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String checkUpdate(String str, String str2, int i2, Map<String, String> map, ICheckChannelListener iCheckChannelListener) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setCheckChannelListener(generateTaskId, iCheckChannelListener);
        this.mConfiguration.getTaskManager().commit(new CheckUpdateTask(this.mEffectContext, generateTaskId, this.mHandler, str, str2, i2, map));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String searchProviderEffectList(String str, String str2, int i2, int i3, IFetchProviderEffect iFetchProviderEffect) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchProviderEffectListener(generateTaskId, iFetchProviderEffect);
        this.mConfiguration.getTaskManager().commit(new SearchProviderEffectTask(this.mEffectContext, generateTaskId, str, str2, i2, i3, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchPanelInfo(String str, boolean z, String str2, int i2, int i3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener) {
        ITask fetchPanelInfoTask;
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchPanelInfoListener(generateTaskId, iFetchPanelInfoListener);
        if (z2) {
            fetchPanelInfoTask = new FetchPanelInfoCacheTask(this.mEffectContext, str, generateTaskId, this.mHandler);
        } else {
            fetchPanelInfoTask = new FetchPanelInfoTask(this.mEffectContext, str, generateTaskId, z, str2, i2, i3, this.mHandler);
        }
        this.mConfiguration.getTaskManager().commit(fetchPanelInfoTask);
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IEffectListRepository
    public String fetchCategoryEffect(String str, String str2, int i2, int i3, int i4, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        ITask fetchCategoryEffectTask;
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchCategoryEffectListener(generateTaskId, iFetchCategoryEffectListener);
        if (z) {
            fetchCategoryEffectTask = new FetchCategoryEffectCacheTask(this.mEffectContext, str, generateTaskId, str2, i2, i3, i4, str3, this.mHandler);
        } else {
            fetchCategoryEffectTask = new FetchCategoryEffectTask(this.mEffectContext, str, generateTaskId, str2, i2, i3, i4, str3, this.mHandler);
        }
        this.mConfiguration.getTaskManager().commit(fetchCategoryEffectTask);
        return generateTaskId;
    }
}
