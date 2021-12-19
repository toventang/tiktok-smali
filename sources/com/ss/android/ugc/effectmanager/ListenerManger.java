package com.ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IDownloadProviderEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchCategoryEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListByIdsListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchPanelInfoListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchProviderEffect;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener;
import com.ss.android.ugc.effectmanager.effect.listener.IScanQRCodeListener;
import com.ss.android.ugc.effectmanager.effect.listener.IWriteUpdateTagListener;
import com.ss.ugc.effectplatform.h.e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ListenerManger {
    private Map<String, ICheckChannelListener> checkChannelListenerMap = new ConcurrentHashMap();
    private Map<String, IFetchEffectChannelListener> fetchEffectChannelListenerMap = new ConcurrentHashMap();
    private Map<String, IFetchEffectListByIdsListener> fetchEffectListByIdsListenerMap;
    private Map<String, IFetchEffectListListener> fetchEffectListListenerMap = new ConcurrentHashMap();
    private Map<String, IFetchEffectListener> fetchEffectListenerMap = new ConcurrentHashMap();
    private Map<String, Object> mCommonListenerMap;
    private Map<String, IDownloadProviderEffectListener> mDownloadProviderEffectMap;
    private Map<String, IFetchCategoryEffectListener> mFetchCategoryEffectListenerMap;
    private Map<String, IFetchFavoriteList> mFetchFavoriteListMap = new ConcurrentHashMap();
    private Map<String, IFetchPanelInfoListener> mFetchPanelInfoListenerMap;
    private Map<String, IFetchProviderEffect> mFetchProviderEffectMap;
    private Map<String, IScanQRCodeListener> mIScanQRCodeListenerMap = new ConcurrentHashMap();
    private Map<String, e> mKNEffectPlatformListenerMap = new ConcurrentHashMap();
    private Map<String, IModFavoriteList> mModFavoriteListMap = new ConcurrentHashMap();
    private Map<String, IReadUpdateTagListener> mReadUpdateTagMap = new ConcurrentHashMap();
    private Map<String, IWriteUpdateTagListener> mWriteUpdateTagMap = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(95196);
    }

    public void destroy() {
        clearMapIfNeeded(this.checkChannelListenerMap);
        clearMapIfNeeded(this.fetchEffectChannelListenerMap);
        clearMapIfNeeded(this.fetchEffectListListenerMap);
        clearMapIfNeeded(this.fetchEffectListByIdsListenerMap);
        clearMapIfNeeded(this.fetchEffectListenerMap);
        clearMapIfNeeded(this.mWriteUpdateTagMap);
        clearMapIfNeeded(this.mModFavoriteListMap);
        clearMapIfNeeded(this.mFetchFavoriteListMap);
        clearMapIfNeeded(this.mReadUpdateTagMap);
        clearMapIfNeeded(this.mIScanQRCodeListenerMap);
        clearMapIfNeeded(this.mFetchProviderEffectMap);
        clearMapIfNeeded(this.mDownloadProviderEffectMap);
        clearMapIfNeeded(this.mFetchCategoryEffectListenerMap);
        clearMapIfNeeded(this.mFetchPanelInfoListenerMap);
        clearMapIfNeeded(this.mCommonListenerMap);
        clearMapIfNeeded(this.mKNEffectPlatformListenerMap);
    }

    public void removeCheckChannelListener(String str) {
        Map<String, ICheckChannelListener> map = this.checkChannelListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeDownloadProviderEffectListener(String str) {
        Map<String, IDownloadProviderEffectListener> map = this.mDownloadProviderEffectMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchCategoryEffectListener(String str) {
        Map<String, IFetchCategoryEffectListener> map = this.mFetchCategoryEffectListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchEffectChannelListener(String str) {
        Map<String, IFetchEffectChannelListener> map = this.fetchEffectChannelListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchEffectLisListener(String str) {
        Map<String, IFetchEffectChannelListener> map = this.fetchEffectChannelListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchEffectListByIdsListener(String str) {
        Map<String, IFetchEffectListByIdsListener> map = this.fetchEffectListByIdsListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchEffectListener(String str) {
        Map<String, IFetchEffectListener> map = this.fetchEffectListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchFavoriteListListener(String str) {
        Map<String, IFetchFavoriteList> map = this.mFetchFavoriteListMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchPanelInfoListener(String str) {
        Map<String, IFetchPanelInfoListener> map = this.mFetchPanelInfoListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeFetchProviderEffectListener(String str) {
        Map<String, IFetchProviderEffect> map = this.mFetchProviderEffectMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeKNPlatformListener(String str) {
        Map<String, e> map = this.mKNEffectPlatformListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeListener(String str) {
        Map<String, Object> map = this.mCommonListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeModFavoriteListListener(String str) {
        Map<String, IModFavoriteList> map = this.mModFavoriteListMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeScanQRCodeListener(String str) {
        Map<String, IScanQRCodeListener> map = this.mIScanQRCodeListenerMap;
        if (map != null) {
            map.remove(str);
        }
    }

    private void clearMapIfNeeded(Map map) {
        if (map != null && !map.isEmpty()) {
            map.clear();
        }
    }

    public ICheckChannelListener getCheckChannelListener(String str) {
        Map<String, ICheckChannelListener> map = this.checkChannelListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IDownloadProviderEffectListener getDownloadProviderEffectListener(String str) {
        Map<String, IDownloadProviderEffectListener> map = this.mDownloadProviderEffectMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchCategoryEffectListener getFetchCategoryEffectListener(String str) {
        Map<String, IFetchCategoryEffectListener> map = this.mFetchCategoryEffectListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchEffectChannelListener getFetchEffectChannelListener(String str) {
        Map<String, IFetchEffectChannelListener> map = this.fetchEffectChannelListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchEffectListListener getFetchEffectLisListener(String str) {
        Map<String, IFetchEffectListListener> map = this.fetchEffectListListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchEffectListByIdsListener getFetchEffectListByIdsListener(String str) {
        Map<String, IFetchEffectListByIdsListener> map = this.fetchEffectListByIdsListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchEffectListener getFetchEffectListener(String str) {
        Map<String, IFetchEffectListener> map = this.fetchEffectListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchFavoriteList getFetchFavoriteListListener(String str) {
        Map<String, IFetchFavoriteList> map = this.mFetchFavoriteListMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchPanelInfoListener getFetchPanelInfoListener(String str) {
        Map<String, IFetchPanelInfoListener> map = this.mFetchPanelInfoListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IFetchProviderEffect getFetchProviderEffectListener(String str) {
        Map<String, IFetchProviderEffect> map = this.mFetchProviderEffectMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public <T> e<T> getKNPlatformListener(String str) {
        Map<String, e> map = this.mKNEffectPlatformListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Object getListener(String str) {
        Map<String, Object> map = this.mCommonListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IModFavoriteList getModFavoriteListListener(String str) {
        Map<String, IModFavoriteList> map = this.mModFavoriteListMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IReadUpdateTagListener getReadUpdateTagListener(String str) {
        Map<String, IReadUpdateTagListener> map = this.mReadUpdateTagMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IScanQRCodeListener getScanQRCodeListener(String str) {
        Map<String, IScanQRCodeListener> map = this.mIScanQRCodeListenerMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public IWriteUpdateTagListener getWriteUpdateTagListener(String str) {
        Map<String, IWriteUpdateTagListener> map = this.mWriteUpdateTagMap;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public void removeReadUpdateTagListener(String str) {
        Map<String, IReadUpdateTagListener> map = this.mReadUpdateTagMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void removeWriteUpdateTagListener(String str) {
        Map<String, IWriteUpdateTagListener> map = this.mWriteUpdateTagMap;
        if (map != null) {
            map.remove(str);
        }
    }

    public void addNewKNPlatformListener(String str, e eVar) {
        if (eVar != null) {
            if (this.mKNEffectPlatformListenerMap == null) {
                this.mKNEffectPlatformListenerMap = new ConcurrentHashMap();
            }
            this.mKNEffectPlatformListenerMap.put(str, eVar);
        }
    }

    public void setCheckChannelListener(String str, ICheckChannelListener iCheckChannelListener) {
        if (iCheckChannelListener != null) {
            if (this.checkChannelListenerMap == null) {
                this.checkChannelListenerMap = new ConcurrentHashMap();
            }
            this.checkChannelListenerMap.put(str, iCheckChannelListener);
        }
    }

    public void setDownloadProviderEffectListener(String str, IDownloadProviderEffectListener iDownloadProviderEffectListener) {
        if (iDownloadProviderEffectListener != null) {
            if (this.mDownloadProviderEffectMap == null) {
                this.mDownloadProviderEffectMap = new ConcurrentHashMap();
            }
            this.mDownloadProviderEffectMap.put(str, iDownloadProviderEffectListener);
        }
    }

    public void setFetchCategoryEffectListener(String str, IFetchCategoryEffectListener iFetchCategoryEffectListener) {
        if (iFetchCategoryEffectListener != null) {
            if (this.mFetchCategoryEffectListenerMap == null) {
                this.mFetchCategoryEffectListenerMap = new ConcurrentHashMap();
            }
            this.mFetchCategoryEffectListenerMap.put(str, iFetchCategoryEffectListener);
        }
    }

    public void setFetchEffectChannelListener(String str, IFetchEffectChannelListener iFetchEffectChannelListener) {
        if (iFetchEffectChannelListener != null) {
            if (this.fetchEffectChannelListenerMap == null) {
                this.fetchEffectChannelListenerMap = new ConcurrentHashMap();
            }
            this.fetchEffectChannelListenerMap.put(str, iFetchEffectChannelListener);
        }
    }

    public void setFetchEffectListByIdsListener(String str, IFetchEffectListByIdsListener iFetchEffectListByIdsListener) {
        if (iFetchEffectListByIdsListener != null) {
            if (this.fetchEffectListByIdsListenerMap == null) {
                this.fetchEffectListByIdsListenerMap = new ConcurrentHashMap();
            }
            this.fetchEffectListByIdsListenerMap.put(str, iFetchEffectListByIdsListener);
        }
    }

    public void setFetchEffectListListener(String str, IFetchEffectListListener iFetchEffectListListener) {
        if (iFetchEffectListListener != null) {
            if (this.fetchEffectListenerMap == null) {
                this.fetchEffectListenerMap = new ConcurrentHashMap();
            }
            this.fetchEffectListListenerMap.put(str, iFetchEffectListListener);
        }
    }

    public void setFetchEffectListener(String str, IFetchEffectListener iFetchEffectListener) {
        if (iFetchEffectListener != null) {
            if (this.fetchEffectListenerMap == null) {
                this.fetchEffectListenerMap = new ConcurrentHashMap();
            }
            this.fetchEffectListenerMap.put(str, iFetchEffectListener);
        }
    }

    public void setFetchFavoriteListListener(String str, IFetchFavoriteList iFetchFavoriteList) {
        if (iFetchFavoriteList != null) {
            if (this.mFetchFavoriteListMap == null) {
                this.mFetchFavoriteListMap = new ConcurrentHashMap();
            }
            this.mFetchFavoriteListMap.put(str, iFetchFavoriteList);
        }
    }

    public void setFetchPanelInfoListener(String str, IFetchPanelInfoListener iFetchPanelInfoListener) {
        if (iFetchPanelInfoListener != null) {
            if (this.mFetchPanelInfoListenerMap == null) {
                this.mFetchPanelInfoListenerMap = new ConcurrentHashMap();
            }
            this.mFetchPanelInfoListenerMap.put(str, iFetchPanelInfoListener);
        }
    }

    public void setFetchProviderEffectListener(String str, IFetchProviderEffect iFetchProviderEffect) {
        if (iFetchProviderEffect != null) {
            if (this.mFetchProviderEffectMap == null) {
                this.mFetchProviderEffectMap = new ConcurrentHashMap();
            }
            this.mFetchProviderEffectMap.put(str, iFetchProviderEffect);
        }
    }

    public Object setListener(String str, Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.mCommonListenerMap == null) {
            this.mCommonListenerMap = new ConcurrentHashMap();
        }
        return this.mCommonListenerMap.put(str, obj);
    }

    public void setModFavoriteListener(String str, IModFavoriteList iModFavoriteList) {
        if (iModFavoriteList != null) {
            if (this.mModFavoriteListMap == null) {
                this.mModFavoriteListMap = new ConcurrentHashMap();
            }
            this.mModFavoriteListMap.put(str, iModFavoriteList);
        }
    }

    public void setReadUpdateTagListener(String str, IReadUpdateTagListener iReadUpdateTagListener) {
        if (iReadUpdateTagListener != null) {
            if (this.mReadUpdateTagMap == null) {
                this.mReadUpdateTagMap = new ConcurrentHashMap();
            }
            this.mReadUpdateTagMap.put(str, iReadUpdateTagListener);
        }
    }

    public void setScanQRCodeListener(String str, IScanQRCodeListener iScanQRCodeListener) {
        if (iScanQRCodeListener != null) {
            if (this.mIScanQRCodeListenerMap == null) {
                this.mIScanQRCodeListenerMap = new ConcurrentHashMap();
            }
            this.mIScanQRCodeListenerMap.put(str, iScanQRCodeListener);
        }
    }

    public void setWriteUpdateTagListener(String str, IWriteUpdateTagListener iWriteUpdateTagListener) {
        if (iWriteUpdateTagListener != null) {
            if (this.mWriteUpdateTagMap == null) {
                this.mWriteUpdateTagMap = new ConcurrentHashMap();
            }
            this.mWriteUpdateTagMap.put(str, iWriteUpdateTagListener);
        }
    }
}
