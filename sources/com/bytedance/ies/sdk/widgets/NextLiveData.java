package com.bytedance.ies.sdk.widgets;

import androidx.lifecycle.m;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

public class NextLiveData<T> extends t<T> {
    public int mLatestVersion = -1;
    private Map<u, NextObserver> nextObserverMap = new HashMap();

    static {
        Covode.recordClassIndex(20719);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(u<T> uVar) {
        observeForever(uVar, false);
    }

    @Override // androidx.lifecycle.LiveData, androidx.lifecycle.t
    public void setValue(T t) {
        this.mLatestVersion++;
        super.setValue(t);
    }

    /* access modifiers changed from: package-private */
    public class NextObserver<T> implements u<T> {
        private int initVersion;
        private boolean notifyWhenObserve;
        private u<T> observer;

        static {
            Covode.recordClassIndex(20720);
        }

        @Override // androidx.lifecycle.u
        public void onChanged(T t) {
            if (this.notifyWhenObserve || this.initVersion < NextLiveData.this.mLatestVersion) {
                this.observer.onChanged(t);
            }
        }

        NextObserver(int i2, u<T> uVar, boolean z) {
            this.initVersion = i2;
            this.observer = uVar;
            this.notifyWhenObserve = z;
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void removeObserver(u<T> uVar) {
        NextObserver remove = this.nextObserverMap.remove(uVar);
        if (remove != null) {
            super.removeObserver(remove);
            return;
        }
        super.removeObserver(uVar);
        if (uVar instanceof NextObserver) {
            for (Map.Entry<u, NextObserver> entry : this.nextObserverMap.entrySet()) {
                if (uVar.equals(entry.getValue())) {
                    u key = entry.getKey();
                    if (key != null) {
                        this.nextObserverMap.remove(key);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(m mVar, u<T> uVar) {
        observe(mVar, uVar, false);
    }

    public void observeForever(u<T> uVar, boolean z) {
        if (!this.nextObserverMap.containsKey(uVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, uVar, z);
            this.nextObserverMap.put(uVar, nextObserver);
            super.observeForever(nextObserver);
        }
    }

    public void observe(m mVar, u<T> uVar, boolean z) {
        if (!this.nextObserverMap.containsKey(uVar)) {
            NextObserver nextObserver = new NextObserver(this.mLatestVersion, uVar, z);
            this.nextObserverMap.put(uVar, nextObserver);
            super.observe(mVar, nextObserver);
        }
    }
}
