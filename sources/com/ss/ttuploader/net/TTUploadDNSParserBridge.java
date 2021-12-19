package com.ss.ttuploader.net;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttuploader.TTUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TTUploadDNSParserBridge implements TTUploadDNSParserListener {
    private long handle = 0;
    public String host;
    String ipList;
    boolean isFinish;
    private Lock lock = new ReentrantLock();

    static {
        Covode.recordClassIndex(101432);
    }

    private static native void _notifyParserResult(long j2, String str, String str2, long j3, String str3);

    /* access modifiers changed from: package-private */
    public boolean isFinish() {
        return this.isFinish;
    }

    public void release() {
        this.lock.lock();
        try {
            this.handle = 0;
            TTUploadDNSParser.getInstance().removeHost(this.host, this);
        } finally {
            this.lock.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public String getResult() {
        this.lock.lock();
        try {
            String str = this.ipList;
            this.lock.unlock();
            TTUploadLog.d("TTUploadDNSParserBridge", "****get result:".concat(String.valueOf(str)));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j2, String str) {
        MethodCollector.i(3456);
        TTUploadLog.d("TTUploadDNSParserBridge", "----start parse host:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            TTUploadLog.d("TTUploadDNSParserBridge", "****end parse fail for host:".concat(String.valueOf(str)));
            MethodCollector.o(3456);
            return -1;
        }
        this.lock.lock();
        this.handle = j2;
        try {
            this.host = str;
            TTUploadDNSInfo tTUploadDNSInfo = IPCache.getInstance().get(str);
            int i2 = 1;
            if (tTUploadDNSInfo != null) {
                this.ipList = tTUploadDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                TTUploadLog.d("TTUploadDNSParserBridge", a.a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(tTUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
                if (tTUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                    TTUploadLog.d("TTUploadDNSParserBridge", a.a("has expired try call parse:", new Object[0]));
                    TTUploadDNSParser.getInstance().addHost(str, null);
                }
                long j3 = this.handle;
                if (j3 != 0) {
                    _notifyParserResult(j3, str, this.ipList, tTUploadDNSInfo.mExpiredTime, null);
                }
            } else {
                TTUploadLog.d("TTUploadDNSParserBridge", "****add host to parser");
                TTUploadDNSParser.getInstance().addHost(str, this);
                i2 = 0;
            }
            return i2;
        } finally {
            this.lock.unlock();
            MethodCollector.o(3456);
        }
    }

    @Override // com.ss.ttuploader.net.TTUploadDNSParserListener
    public void onCompletion(int i2, String str, String str2, long j2, String str3) {
        MethodCollector.i(3465);
        this.lock.lock();
        try {
            if (!this.isFinish) {
                TTUploadLog.d("TTUploadDNSParserBridge", a.a("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i2), str2}));
                this.ipList = str2;
                this.isFinish = true;
                long j3 = this.handle;
                if (j3 != 0) {
                    _notifyParserResult(j3, str, str2, j2, str3);
                }
            } else {
                TTUploadLog.d("TTUploadDNSParserBridge", a.a("has finished not nedd cur completion code:%d result:%s expiredTime:%d", new Object[]{Integer.valueOf(i2), str2, Long.valueOf(j2)}));
            }
        } finally {
            this.lock.unlock();
            MethodCollector.o(3465);
        }
    }
}
