package com.ss.bduploader.net;

import android.os.Handler;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.bduploader.BDUploadLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class LocalDNS extends BaseDNS {
    public InetAddress[] mAddress;
    private Future mFuture;
    public boolean mRet;

    static {
        Covode.recordClassIndex(100696);
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public boolean isRunning() {
        return this.mRet;
    }

    @Override // com.ss.bduploader.net.BaseDNS
    public void close() {
        super.close();
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

    @Override // com.ss.bduploader.net.BaseDNS
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

    @Override // com.ss.bduploader.net.BaseDNS
    public void start() {
        try {
            this.mFuture = BDUploadThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.bduploader.net.LocalDNS.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(100697);
                }

                public void run() {
                    BDUploadLog.d("LocalDNS", a.a("----call local dns, host:%s", new Object[]{LocalDNS.this.mHostname}));
                    try {
                        LocalDNS localDNS = LocalDNS.this;
                        localDNS.mAddress = InetAddress.getAllByName(localDNS.mHostname);
                        LocalDNS.this.mRet = true;
                        if (LocalDNS.this.mAddress == null) {
                            BDUploadLog.d("LocalDNS", a.a("****end call local dns, not get address host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS.this.notifyError(new BDUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId));
                            return;
                        }
                        String str = "";
                        for (int i2 = 0; i2 < LocalDNS.this.mAddress.length; i2++) {
                            String hostAddress = LocalDNS.this.mAddress[i2].getHostAddress();
                            if (!TextUtils.isEmpty(hostAddress)) {
                                str = TextUtils.isEmpty(str) ? str + hostAddress : str + "," + hostAddress;
                            }
                        }
                        if (TextUtils.isEmpty(str)) {
                            BDUploadLog.d("LocalDNS", a.a("****end call local dns, iplist null host:%s", new Object[]{LocalDNS.this.mHostname}));
                            LocalDNS.this.notifyError(new BDUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId));
                            return;
                        }
                        BDUploadLog.d("LocalDNS", a.a("****end call local dns, suc iplist:%s host:%s", new Object[]{str, LocalDNS.this.mHostname}));
                        BDUploadDNSInfo bDUploadDNSInfo = new BDUploadDNSInfo(0, LocalDNS.this.mHostname, str, System.currentTimeMillis() + ((long) (BDUploadDNSParser.mGlobalDefaultExpiredTime * 1000)), LocalDNS.this.mId);
                        IPCache.getInstance().put(LocalDNS.this.mHostname, bDUploadDNSInfo);
                        LocalDNS.this.notifySuccess(bDUploadDNSInfo);
                    } catch (Throwable th) {
                        LocalDNS.this.mRet = true;
                        BDUploadLog.d("LocalDNS", a.a("****end call local dns, end exception:%s host:%s", new Object[]{th, LocalDNS.this.mHostname}));
                        LocalDNS.this.notifyError(new BDUploadDNSInfo(0, LocalDNS.this.mHostname, null, 0, LocalDNS.this.mId));
                    }
                }
            });
        } catch (Exception e2) {
            BDUploadLog.d("LocalDNS", a.a("****end call local dns, exception:%s host:%s", new Object[]{e2, this.mHostname}));
            notifyError(new BDUploadDNSInfo(0, this.mHostname, null, 0, this.mId));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNS> mLocalDNSRef;

        static {
            Covode.recordClassIndex(100698);
        }

        public void run() {
            BDUploadLog.d("LocalDNS", a.a("----implement delayed check for local dns", new Object[0]));
            LocalDNS localDNS = this.mLocalDNSRef.get();
            if (localDNS == null) {
                BDUploadLog.d("LocalDNS", a.a("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNS.mRet) {
                localDNS.cancel();
                BDUploadLog.d("LocalDNS", a.a("****end implement delayed check cancel local dns,", new Object[0]));
                localDNS.notifyError(new BDUploadDNSInfo(0, localDNS.mHostname, null, 0, localDNS.mId));
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }
    }

    public LocalDNS(String str, Handler handler) {
        super(str, handler);
    }
}
