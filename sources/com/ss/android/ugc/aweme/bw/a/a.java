package com.ss.android.ugc.aweme.bw.a;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.o;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class a<T> implements WeakHandler.IHandler, c {
    public T mData;
    protected WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    protected List<o> mNotifyListeners;
    public int mQueryType = 1;

    static {
        Covode.recordClassIndex(42909);
    }

    @Override // com.ss.android.ugc.aweme.bw.a.c
    public void onDestroy() {
        clearAllNotifyListener();
    }

    public void clearAllNotifyListener() {
        List<o> list = this.mNotifyListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void handleData(T t) {
        this.mData = t;
    }

    public void clearNotifyListener(o oVar) {
        List<o> list;
        if (oVar != null && (list = this.mNotifyListeners) != null) {
            list.remove(oVar);
        }
    }

    public void addNotifyListener(o oVar) {
        Objects.requireNonNull(oVar, "INotifyListener could not be null");
        if (this.mNotifyListeners == null) {
            this.mNotifyListeners = new LinkedList();
        }
        this.mNotifyListeners.add(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.bw.a.a<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            ((Exception) message.obj).printStackTrace();
            List<o> list = this.mNotifyListeners;
            if (list != null) {
                for (o oVar : list) {
                    oVar.a_((Exception) message.obj);
                }
                return;
            }
            return;
        }
        handleData(message.obj);
        List<o> list2 = this.mNotifyListeners;
        if (list2 != null) {
            for (o oVar2 : list2) {
                oVar2.c();
            }
        }
    }
}
