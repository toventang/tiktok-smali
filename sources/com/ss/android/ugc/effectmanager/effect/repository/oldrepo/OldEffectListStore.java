package com.ss.android.ugc.effectmanager.effect.repository.oldrepo;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.util.List;

public class OldEffectListStore {
    private EffectConfiguration mConfiguration;
    private EffectChannelResponse mEffectChannels;

    static {
        Covode.recordClassIndex(95472);
    }

    public EffectChannelResponse getCurrentEffectChannel() {
        EffectChannelResponse effectChannelResponse = this.mEffectChannels;
        if (effectChannelResponse == null) {
            return new EffectChannelResponse();
        }
        return effectChannelResponse;
    }

    public OldEffectListStore(EffectConfiguration effectConfiguration) {
        this.mConfiguration = effectConfiguration;
    }

    public void updateEffectListDownloadStatus(String str, List<Effect> list, ExceptionResult exceptionResult) {
        IFetchEffectListListener fetchEffectLisListener = this.mConfiguration.getListenerManger().getFetchEffectLisListener(str);
        if (fetchEffectLisListener != null) {
            if (exceptionResult == null) {
                fetchEffectLisListener.onSuccess(list);
            } else {
                fetchEffectLisListener.onFail(exceptionResult);
            }
            this.mConfiguration.getListenerManger().removeFetchEffectLisListener(str);
        }
    }

    public void updateEffectChannel(String str, EffectChannelResponse effectChannelResponse, int i2, ExceptionResult exceptionResult) {
        IFetchEffectChannelListener fetchEffectChannelListener;
        if (i2 == 23) {
            this.mEffectChannels = effectChannelResponse;
            IFetchEffectChannelListener fetchEffectChannelListener2 = this.mConfiguration.getListenerManger().getFetchEffectChannelListener(str);
            if (fetchEffectChannelListener2 != null) {
                fetchEffectChannelListener2.onSuccess(effectChannelResponse);
                this.mConfiguration.getListenerManger().removeFetchEffectChannelListener(str);
            }
        } else if (i2 == 27 && (fetchEffectChannelListener = this.mConfiguration.getListenerManger().getFetchEffectChannelListener(str)) != null) {
            fetchEffectChannelListener.onFail(exceptionResult);
            this.mConfiguration.getListenerManger().removeFetchEffectChannelListener(str);
        }
    }

    public void updateEffectDownloadStatus(String str, Effect effect, int i2, ExceptionResult exceptionResult) {
        IFetchEffectListener fetchEffectListener;
        if (i2 == 20) {
            IFetchEffectListener fetchEffectListener2 = this.mConfiguration.getListenerManger().getFetchEffectListener(str);
            if (fetchEffectListener2 != null) {
                fetchEffectListener2.onSuccess(effect);
                this.mConfiguration.getListenerManger().removeFetchEffectListener(str);
            }
        } else if (i2 == 26 && (fetchEffectListener = this.mConfiguration.getListenerManger().getFetchEffectListener(str)) != null) {
            fetchEffectListener.onFail(effect, exceptionResult);
            this.mConfiguration.getListenerManger().removeFetchEffectListener(str);
        }
    }
}
