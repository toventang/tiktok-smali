package com.ss.android.ugc.effectmanager.effect.repository.oldrepo;

import android.os.Handler;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.WeakHandler;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import com.ss.android.ugc.effectmanager.common.utils.TaskUtil;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.repository.IFavoriteRepository;
import com.ss.android.ugc.effectmanager.effect.task.result.FavoriteTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.result.FetchFavoriteListTaskResult;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FavoriteTask;
import com.ss.android.ugc.effectmanager.effect.task.task.oldtask.FetchFavoriteListTask;
import java.util.List;

public class OldFavoriteRepository implements WeakHandler.IHandler, IFavoriteRepository {
    private EffectConfiguration mConfiguration;
    private EffectContext mEffectContext;
    private Handler mHandler = new WeakHandler(this);

    static {
        Covode.recordClassIndex(95481);
    }

    public OldFavoriteRepository(EffectContext effectContext) {
        this.mEffectContext = effectContext;
        this.mConfiguration = effectContext.getEffectConfiguration();
    }

    @Override // com.ss.android.ugc.effectmanager.common.WeakHandler.IHandler
    public void handleMsg(Message message) {
        int i2 = message.what;
        if (i2 != 40) {
            if (i2 != 41) {
                EPLog.e("OldFavoriteRepository", "unknown error");
            } else if (message.obj instanceof FetchFavoriteListTaskResult) {
                FetchFavoriteListTaskResult fetchFavoriteListTaskResult = (FetchFavoriteListTaskResult) message.obj;
                IFetchFavoriteList fetchFavoriteListListener = this.mConfiguration.getListenerManger().getFetchFavoriteListListener(fetchFavoriteListTaskResult.getTaskID());
                if (fetchFavoriteListListener != null) {
                    if (fetchFavoriteListTaskResult.getException() == null) {
                        fetchFavoriteListListener.onSuccess(fetchFavoriteListTaskResult.getResult());
                    } else {
                        fetchFavoriteListListener.onFailed(fetchFavoriteListTaskResult.getException());
                    }
                    this.mConfiguration.getListenerManger().removeFetchFavoriteListListener(fetchFavoriteListTaskResult.getTaskID());
                }
            }
        } else if (message.obj instanceof FavoriteTaskResult) {
            FavoriteTaskResult favoriteTaskResult = (FavoriteTaskResult) message.obj;
            IModFavoriteList modFavoriteListListener = this.mConfiguration.getListenerManger().getModFavoriteListListener(favoriteTaskResult.getTaskID());
            if (modFavoriteListListener != null) {
                if (favoriteTaskResult.isSuccess()) {
                    modFavoriteListListener.onSuccess(favoriteTaskResult.getEffectIds());
                } else {
                    modFavoriteListListener.onFail(favoriteTaskResult.getException());
                }
                this.mConfiguration.getListenerManger().removeModFavoriteListListener(favoriteTaskResult.getTaskID());
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IFavoriteRepository
    public String fetchFavoriteList(String str, IFetchFavoriteList iFetchFavoriteList) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setFetchFavoriteListListener(generateTaskId, iFetchFavoriteList);
        this.mConfiguration.getTaskManager().commit(new FetchFavoriteListTask(this.mEffectContext, str, generateTaskId, this.mHandler));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IFavoriteRepository
    public String modFavoriteList(String str, String str2, boolean z, IModFavoriteList iModFavoriteList) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setModFavoriteListener(generateTaskId, iModFavoriteList);
        this.mConfiguration.getTaskManager().commit(new FavoriteTask(this.mEffectContext, str, generateTaskId, this.mHandler, str2, z));
        return generateTaskId;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.repository.IFavoriteRepository
    public String modFavoriteList(String str, List<String> list, boolean z, IModFavoriteList iModFavoriteList) {
        String generateTaskId = TaskUtil.INSTANCE.generateTaskId();
        this.mEffectContext.getEffectConfiguration().getListenerManger().setModFavoriteListener(generateTaskId, iModFavoriteList);
        this.mConfiguration.getTaskManager().commit(new FavoriteTask(this.mEffectContext, str, generateTaskId, this.mHandler, list, z));
        return generateTaskId;
    }
}
