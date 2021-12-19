package com.bytedance.ies.sdk.widgets;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.m;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class DataCenter extends ac {
    private Map<String, Object> dataStore = new HashMap();
    private Handler handler = new Handler(Looper.getMainLooper());
    public m lifecycleOwner;
    private Map<String, NextLiveData<KVData>> liveDataMap = new HashMap();
    private Thread mainThread;

    static {
        Covode.recordClassIndex(20703);
    }

    private boolean notMainThread() {
        if (this.mainThread == null) {
            this.mainThread = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != this.mainThread) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.ac
    public void onCleared() {
        this.dataStore.clear();
        this.liveDataMap.clear();
        this.lifecycleOwner = null;
        this.handler.removeCallbacksAndMessages(null);
    }

    public boolean has(String str) {
        return this.dataStore.containsKey(str);
    }

    public <T> T get(String str) {
        T t = (T) this.dataStore.get(str);
        if (t != null) {
            return t;
        }
        return null;
    }

    public DataCenter removeObserver(u<KVData> uVar) {
        if (uVar == null) {
            return this;
        }
        for (NextLiveData<KVData> nextLiveData : this.liveDataMap.values()) {
            nextLiveData.removeObserver(uVar);
        }
        return this;
    }

    private NextLiveData<KVData> getLiveData(String str) {
        NextLiveData<KVData> nextLiveData = this.liveDataMap.get(str);
        if (nextLiveData == null) {
            nextLiveData = new NextLiveData<>();
            if (this.dataStore.containsKey(str)) {
                nextLiveData.setValue(new KVData(str, this.dataStore.get(str)));
            }
            this.liveDataMap.put(str, nextLiveData);
        }
        return nextLiveData;
    }

    /* renamed from: put */
    public DataCenter lambda$put$0$DataCenter(Bundle bundle) {
        if (notMainThread()) {
            this.handler.post(new DataCenter$$Lambda$0(this, bundle));
            return this;
        } else if (bundle == null) {
            return this;
        } else {
            for (String str : bundle.keySet()) {
                if (str != null) {
                    lambda$put$1$DataCenter(str, com_bytedance_ies_sdk_widgets_DataCenter_com_ss_android_ugc_aweme_lancet_IntentLancet_get(bundle, str));
                }
            }
            return this;
        }
    }

    public static Object com_bytedance_ies_sdk_widgets_DataCenter_com_ss_android_ugc_aweme_lancet_IntentLancet_get(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public DataCenter observe(String str, u<KVData> uVar) {
        return observe(str, uVar, false);
    }

    public DataCenter observeForever(String str, u<KVData> uVar) {
        return observeForever(str, uVar, false);
    }

    public static DataCenter create(ad adVar, m mVar) {
        DataCenter dataCenter = (DataCenter) adVar.a(DataCenter.class);
        dataCenter.lifecycleOwner = mVar;
        return dataCenter;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    static <T> T get(Object obj, T t) {
        if (obj == 0) {
            return null;
        }
        if (t == null || (((obj instanceof Number) && (t instanceof Number)) || t.getClass().isAssignableFrom(obj.getClass()))) {
            return obj;
        }
        return t;
    }

    public <T> T get(String str, T t) {
        return !this.dataStore.containsKey(str) ? t : (T) get(this.dataStore.get(str), t);
    }

    public DataCenter removeObserver(String str, u<KVData> uVar) {
        NextLiveData<KVData> nextLiveData;
        if (!(TextUtils.isEmpty(str) || uVar == null || (nextLiveData = this.liveDataMap.get(str)) == null)) {
            nextLiveData.removeObserver(uVar);
        }
        return this;
    }

    /* renamed from: put */
    public DataCenter lambda$put$1$DataCenter(String str, Object obj) {
        if (notMainThread()) {
            this.handler.post(new DataCenter$$Lambda$1(this, str, obj));
            return this;
        }
        this.dataStore.put(str, obj);
        NextLiveData<KVData> nextLiveData = this.liveDataMap.get(str);
        if (nextLiveData != null) {
            nextLiveData.setValue(new KVData(str, obj));
        }
        return this;
    }

    public DataCenter observe(String str, u<KVData> uVar, boolean z) {
        if (!TextUtils.isEmpty(str) && uVar != null) {
            NextLiveData<KVData> liveData = getLiveData(str);
            m mVar = this.lifecycleOwner;
            if (mVar != null) {
                liveData.observe(mVar, uVar, z);
            }
        }
        return this;
    }

    public DataCenter observeForever(String str, u<KVData> uVar, boolean z) {
        if (!TextUtils.isEmpty(str) && uVar != null) {
            getLiveData(str).observeForever(uVar, z);
        }
        return this;
    }
}
