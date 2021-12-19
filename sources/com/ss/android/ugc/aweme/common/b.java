package com.ss.android.ugc.aweme.common;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class b<T> implements WeakHandler.IHandler {
    public T mData;
    public WeakHandler mHandler = new WeakHandler(Looper.getMainLooper(), this);
    public boolean mIsLoading;
    public List<o> mNotifyListeners;

    static {
        Covode.recordClassIndex(47148);
    }

    public static int com_ss_android_ugc_aweme_common_BaseModel_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean checkParams(Object... objArr);

    public void handleData(T t) {
        this.mData = t;
    }

    /* access modifiers changed from: protected */
    public void resetLoadingStatus(Message message) {
        this.mIsLoading = false;
    }

    public void clearNotifyListener(o oVar) {
        List<o> list;
        if (oVar != null && (list = this.mNotifyListeners) != null) {
            list.remove(oVar);
        }
    }

    public boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        return true;
    }

    public void addNotifyListener(o oVar) {
        Objects.requireNonNull(oVar, "INotifyListener could not be null");
        if (this.mNotifyListeners == null) {
            this.mNotifyListeners = new LinkedList();
        }
        this.mNotifyListeners.add(oVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.ss.android.ugc.aweme.common.b<T> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        resetLoadingStatus(message);
        if (message.obj instanceof Exception) {
            com_ss_android_ugc_aweme_common_BaseModel_com_ss_android_ugc_aweme_lancet_LogLancet_e("Snow", "exception: ");
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
