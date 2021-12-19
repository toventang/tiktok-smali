package com.ss.ttuploader;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ttnet.d.d;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

public class TTUploadExternNetBridge implements TTExternNetLoaderListener {
    TTExternResponseInfo curResponseInfo = null;
    String extraInfo = null;
    volatile boolean isFinished = false;
    private Lock lock = new ReentrantLock();
    long mHandle = 0;

    static {
        Covode.recordClassIndex(101397);
    }

    private native void nativeTTNetCallback(long j2);

    private native int nativeTTNetReadFileData(long j2, byte[] bArr, long j3, int i2);

    public int isFinished() {
        if (this.isFinished) {
            return 1;
        }
        return 0;
    }

    public Object getExtraInfo() {
        try {
            this.lock.lock();
            return this.extraInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public Object getResponseObject() {
        try {
            this.lock.lock();
            return this.curResponseInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void resetHandle() {
        try {
            this.lock.lock();
            this.mHandle = 0;
        } finally {
            this.lock.unlock();
        }
    }

    public void cancelTask(Object obj) {
        TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
        if (tTExternNetLoader != null) {
            tTExternNetLoader.cancelTask();
        }
    }

    @Override // com.ss.ttuploader.TTExternNetLoaderListener
    public void onComplete(TTExternResponseInfo tTExternResponseInfo) {
        MethodCollector.i(6022);
        try {
            this.lock.lock();
            this.curResponseInfo = tTExternResponseInfo;
            this.isFinished = true;
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
            MethodCollector.o(6022);
        }
    }

    @Override // com.ss.ttuploader.TTExternNetLoaderListener
    public void onFailed(String str, Throwable th) {
        MethodCollector.i(6024);
        try {
            this.lock.lock();
            this.isFinished = true;
            if (th != null) {
                this.extraInfo = th.toString();
            }
        } finally {
            nativeTTNetCallback(this.mHandle);
            this.lock.unlock();
            MethodCollector.o(6024);
        }
    }

    @Override // com.ss.ttuploader.TTExternNetLoaderListener
    public int readFileData(byte[] bArr, long j2, int i2) {
        MethodCollector.i(6025);
        int nativeTTNetReadFileData = nativeTTNetReadFileData(this.mHandle, bArr, j2, i2);
        MethodCollector.o(6025);
        return nativeTTNetReadFileData;
    }

    /* JADX INFO: finally extract failed */
    public int sendRequest(Object obj, long j2, String str, String str2, String str3, byte[] bArr, int i2, int i3, int i4) {
        JSONObject jSONObject;
        if (!(obj == null || j2 == 0 || TextUtils.isEmpty(str))) {
            this.mHandle = j2;
            try {
                jSONObject = new JSONObject(str3);
            } catch (Exception unused) {
                jSONObject = null;
            }
            TTExternNetLoader tTExternNetLoader = (TTExternNetLoader) obj;
            if (!(jSONObject == null || tTExternNetLoader == null)) {
                this.curResponseInfo = null;
                try {
                    this.lock.lock();
                    this.isFinished = false;
                    this.lock.unlock();
                    d dVar = new d();
                    dVar.f28948i = (long) (i3 + i4);
                    dVar.f28950k = true;
                    try {
                        int sendRequest = tTExternNetLoader.sendRequest(new TTExternRequestInfo(str, str2, jSONObject, bArr, dVar), this);
                        if (sendRequest < 0) {
                            return sendRequest;
                        }
                        return 0;
                    } catch (Throwable unused2) {
                        return -2;
                    }
                } catch (Throwable th) {
                    this.lock.unlock();
                    throw th;
                }
            }
        }
        return -1;
    }
}
