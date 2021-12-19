package com.benchmark.collection.service;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.RemoteException;
import com.benchmark.collection.a.a;
import com.benchmark.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ByteBenchProcessInterface {
    private d mCallback;
    private long mHandler;

    private native long nativeInit(String str, String str2, String str3, String str4, AssetManager assetManager);

    private native void native_destory(long j2);

    private native String[] native_getResult(long j2);

    private native int native_loadByteBench(long j2, String str);

    private native void native_release(long j2);

    private native int native_startTest(long j2, int i2, String str);

    private native int native_stopByteBench(long j2);

    static {
        Covode.recordClassIndex(2986);
        a.a();
        if (!a.f6113a) {
            a.a();
        }
    }

    public void destroy() {
        MethodCollector.i(7098);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7098);
            return;
        }
        native_destory(j2);
        this.mHandler = 0;
        MethodCollector.o(7098);
    }

    public String[] getResult() {
        MethodCollector.i(7060);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7060);
            return null;
        }
        String[] native_getResult = native_getResult(j2);
        MethodCollector.o(7060);
        return native_getResult;
    }

    public void release() {
        MethodCollector.i(7144);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7144);
            return;
        }
        native_release(j2);
        MethodCollector.o(7144);
    }

    public int stopByteBench() {
        MethodCollector.i(7059);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7059);
            return -108;
        }
        int native_stopByteBench = native_stopByteBench(j2);
        MethodCollector.o(7059);
        return native_stopByteBench;
    }

    public void setByteBenchCallback(d dVar) {
        this.mCallback = dVar;
    }

    private void initByteMonitor(Context context) {
        com.benchmark.bytemonitor.a.a(context);
        com.benchmark.bytemonitor.a.a();
    }

    public int loadByteBench(String str) {
        MethodCollector.i(7050);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7050);
            return -108;
        }
        int native_loadByteBench = native_loadByteBench(j2, str);
        MethodCollector.o(7050);
        return native_loadByteBench;
    }

    public void reportAndQuit(boolean z) {
        d dVar = this.mCallback;
        if (dVar != null) {
            try {
                dVar.a(105, "report result");
                if (z) {
                    this.mCallback.a(104, "quit service");
                }
            } catch (RemoteException e2) {
                e2.getMessage();
            }
        }
    }

    public int startTest(int i2, String str) {
        MethodCollector.i(7054);
        long j2 = this.mHandler;
        if (j2 == 0) {
            MethodCollector.o(7054);
            return -108;
        }
        int native_startTest = native_startTest(j2, i2, str);
        MethodCollector.o(7054);
        return native_startTest;
    }

    public int init(String str, String str2, String str3, String str4, Context context) {
        MethodCollector.i(7046);
        if (!a.f6113a) {
            MethodCollector.o(7046);
            return -3;
        }
        if (a.f6113a) {
            this.mHandler = nativeInit(str, str2, str3, str4, context.getAssets());
        }
        if (this.mHandler == 0) {
            MethodCollector.o(7046);
            return -1;
        }
        initByteMonitor(context);
        MethodCollector.o(7046);
        return 0;
    }
}
