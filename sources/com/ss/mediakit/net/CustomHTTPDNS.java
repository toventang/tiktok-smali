package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class CustomHTTPDNS extends BaseDNS {
    private InetAddress[] mAddress;
    private Future mFuture;
    public boolean mRet;

    static {
        Covode.recordClassIndex(101152);
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void cancel() {
        if (!this.mCancelled) {
            this.mCancelled = true;
            Future future = this.mFuture;
            if (future != null) {
                future.cancel(true);
                this.mFuture = null;
            }
        }
    }

    @Override // com.ss.mediakit.net.BaseDNS
    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.mediakit.net.CustomHTTPDNS.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101153);
                }

                public void run() {
                    int i2;
                    long j2;
                    Object[] objArr = new Object[2];
                    objArr[0] = CustomHTTPDNS.this.mHostname;
                    if (AVMDLDNSParser.mCustomHttpDNSParser == null) {
                        i2 = 0;
                    } else {
                        i2 = 1;
                    }
                    objArr[1] = Integer.valueOf(i2);
                    AVMDLLog.d("CustomHTTPDNS", a.a("----call custom httpdns, host:%s custom parser:%d", objArr));
                    AVMDLCustomHTTPDNSParserResult aVMDLCustomHTTPDNSParserResult = null;
                    if (AVMDLDNSParser.mCustomHttpDNSParser != null) {
                        aVMDLCustomHTTPDNSParserResult = AVMDLDNSParser.mCustomHttpDNSParser.parseHost(CustomHTTPDNS.this.mHostname);
                    }
                    CustomHTTPDNS.this.mRet = true;
                    if (aVMDLCustomHTTPDNSParserResult == null || TextUtils.isEmpty(aVMDLCustomHTTPDNSParserResult.mIPList)) {
                        AVMDLLog.d("CustomHTTPDNS", a.a("****end call custom httpdns, result null or iplist null host:%s", new Object[]{CustomHTTPDNS.this.mHostname}));
                        CustomHTTPDNS.this.notifyError(new AVMDLDNSInfo(4, CustomHTTPDNS.this.mHostname, (String) null, 0, CustomHTTPDNS.this.mId));
                        return;
                    }
                    AVMDLLog.d("CustomHTTPDNS", a.a("****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                    if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                        j2 = (long) AVMDLDNSParser.mGlobalForceExpiredTime;
                    } else {
                        j2 = aVMDLCustomHTTPDNSParserResult.mTTL;
                    }
                    AVMDLDNSInfo aVMDLDNSInfo = new AVMDLDNSInfo(4, CustomHTTPDNS.this.mHostname, aVMDLCustomHTTPDNSParserResult.mIPList, System.currentTimeMillis() + (j2 * 1000), CustomHTTPDNS.this.mId);
                    IPCache.getInstance().put(CustomHTTPDNS.this.mHostname, aVMDLDNSInfo);
                    CustomHTTPDNS.this.notifySuccess(aVMDLDNSInfo);
                    AVMDLLog.d("CustomHTTPDNS", a.a("****end call custom httpdns, suc iplist:%s host:%s", new Object[]{aVMDLCustomHTTPDNSParserResult.mIPList, CustomHTTPDNS.this.mHostname}));
                }
            });
        } catch (Exception e2) {
            AVMDLLog.d("CustomHTTPDNS", a.a("****end call custom httpdns, exception:%s host:%s", new Object[]{e2, this.mHostname}));
            notifyError(new AVMDLDNSInfo(4, this.mHostname, (String) null, 0, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    static class MyRunnable implements Runnable {
        private final WeakReference<CustomHTTPDNS> mCustomHTTPDNSRef;

        static {
            Covode.recordClassIndex(101154);
        }

        public void run() {
            AVMDLLog.d("CustomHTTPDNS", a.a("----implement delayed check for custom httpdns", new Object[0]));
            CustomHTTPDNS customHTTPDNS = this.mCustomHTTPDNSRef.get();
            if (customHTTPDNS == null) {
                AVMDLLog.d("CustomHTTPDNS", a.a("****end implement delayed check for custom httpdns, dns object null", new Object[0]));
            } else if (!customHTTPDNS.mRet) {
                customHTTPDNS.cancel();
                AVMDLLog.d("CustomHTTPDNS", a.a("****end implement delayed check cancel custom httpdns,", new Object[0]));
                customHTTPDNS.notifyError(new AVMDLDNSInfo(4, customHTTPDNS.mHostname, (String) null, 0, customHTTPDNS.mId));
            }
        }

        public MyRunnable(CustomHTTPDNS customHTTPDNS) {
            this.mCustomHTTPDNSRef = new WeakReference<>(customHTTPDNS);
        }
    }

    public CustomHTTPDNS(String str, Handler handler) {
        super(str, handler);
    }
}
