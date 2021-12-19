package com.ss.android.ugc.effectmanager.effect.repository;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import java.util.Map;

public interface IEffectListRepository {
    static {
        Covode.recordClassIndex(95464);
    }

    String checkUpdate(String str, String str2, int i2, Map<String, String> map, ICheckChannelListener iCheckChannelListener);

    String fetchCategoryEffect(String str, String str2, int i2, int i3, int i4, String str3, boolean z, IFetchCategoryEffectListener iFetchCategoryEffectListener);

    String fetchEffectInfoByQRCode(EffectQRCode effectQRCode, IScanQRCodeListener iScanQRCodeListener);

    String fetchExistEffectList(String str, IFetchEffectChannelListener iFetchEffectChannelListener);

    String fetchList(String str, boolean z, IFetchEffectChannelListener iFetchEffectChannelListener);

    String fetchPanelInfo(String str, boolean z, String str2, int i2, int i3, boolean z2, IFetchPanelInfoListener iFetchPanelInfoListener);

    String fetchProviderEffectList(String str, int i2, int i3, IFetchProviderEffect iFetchProviderEffect);

    String searchProviderEffectList(String str, String str2, int i2, int i3, IFetchProviderEffect iFetchProviderEffect);
}
