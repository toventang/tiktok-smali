package com.ss.bduploader.net;

import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.bduploader.BDUploadLog;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BDUploadDNSParserBridge implements BDUploadDNSParserListener {
    private long handle = 0;
    public String host;
    String ipList;
    boolean isFinish;
    private Lock lock = new ReentrantLock();

    static {
        Covode.recordClassIndex(100681);
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
            BDUploadDNSParser.getInstance().removeHost(this.host, this);
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
            BDUploadLog.d("BDUploadDNSParserBridge", "****get result:".concat(String.valueOf(str)));
            return str;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }

    public int start(long j2, String str) {
        MethodCollector.i(3294);
        BDUploadLog.d("BDUploadDNSParserBridge", "----start parse host:".concat(String.valueOf(str)));
        if (TextUtils.isEmpty(str)) {
            BDUploadLog.d("BDUploadDNSParserBridge", "****end parse fail for host:".concat(String.valueOf(str)));
            MethodCollector.o(3294);
            return -1;
        }
        this.lock.lock();
        this.handle = j2;
        try {
            this.host = str;
            BDUploadDNSInfo bDUploadDNSInfo = IPCache.getInstance().get(str);
            int i2 = 1;
            if (bDUploadDNSInfo != null) {
                this.ipList = bDUploadDNSInfo.mIpList;
                long currentTimeMillis = System.currentTimeMillis();
                BDUploadLog.d("BDUploadDNSParserBridge", a.a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(bDUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
                if (bDUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                    BDUploadLog.d("BDUploadDNSParserBridge", a.a("has expired try call parse:", new Object[0]));
                    BDUploadDNSParser.getInstance().addHost(str, null);
                }
                long j3 = this.handle;
                if (j3 != 0) {
                    _notifyParserResult(j3, str, this.ipList, bDUploadDNSInfo.mExpiredTime, null);
                }
            } else {
                BDUploadLog.d("BDUploadDNSParserBridge", "****add host to parser");
                BDUploadDNSParser.getInstance().addHost(str, this);
                i2 = 0;
            }
            return i2;
        } finally {
            this.lock.unlock();
            MethodCollector.o(3294);
        }
    }

    @Override // com.ss.bduploader.net.BDUploadDNSParserListener
    public void onCompletion(int i2, String str, String str2, long j2, String str3) {
        MethodCollector.i(4557);
        this.lock.lock();
        try {
            if (!this.isFinish) {
                BDUploadLog.d("BDUploadDNSParserBridge", a.a("receive completion code:%d result:%s", new Object[]{Integer.valueOf(i2), str2}));
                this.ipList = str2;
                this.isFinish = true;
                long j3 = this.handle;
                if (j3 != 0) {
                    _notifyParserResult(j3, str, str2, j2, str3);
                }
            } else {
                BDUploadLog.d("BDUploadDNSParserBridge", a.a("has finished not nedd cur completion code:%d result:%s expiredTime:%lld", new Object[]{Integer.valueOf(i2), str2, Long.valueOf(j2)}));
            }
        } finally {
            this.lock.unlock();
            MethodCollector.o(4557);
        }
    }
}
