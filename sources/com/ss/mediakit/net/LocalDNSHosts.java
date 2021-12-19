package com.ss.mediakit.net;

import android.os.Handler;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.mediakit.medialoader.AVMDLLog;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.util.concurrent.Future;

public class LocalDNSHosts {
    public InetAddress[] mAddress;
    protected boolean mCancelled;
    private Future mFuture;
    protected Handler mHandler;
    public String[] mHosts;
    public String mId;
    protected AVMDLNetClient mNetClient;
    public boolean mRet;

    static {
        Covode.recordClassIndex(101170);
    }

    public boolean isRunning() {
        return this.mRet;
    }

    public void close() {
        Future future = this.mFuture;
        if (future != null) {
            future.cancel(true);
            this.mFuture = null;
        }
    }

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

    /* access modifiers changed from: package-private */
    public static class MyRunnable implements Runnable {
        private final WeakReference<LocalDNSHosts> mLocalDNSRef;

        static {
            Covode.recordClassIndex(101172);
        }

        public void run() {
            AVMDLLog.d("BatchParseLocalDNSHosts", a.a("----implement delayed check for local dns", new Object[0]));
            LocalDNSHosts localDNSHosts = this.mLocalDNSRef.get();
            if (localDNSHosts == null) {
                AVMDLLog.d("BatchParseLocalDNSHosts", a.a("****end implement delayed check for local dns, dns object null", new Object[0]));
            } else if (!localDNSHosts.mRet) {
                localDNSHosts.cancel();
                AVMDLLog.d("BatchParseLocalDNSHosts", a.a("****end implement delayed check cancel local dns,", new Object[0]));
            }
        }

        public MyRunnable(LocalDNSHosts localDNSHosts) {
            this.mLocalDNSRef = new WeakReference<>(localDNSHosts);
        }
    }

    public void start() {
        try {
            this.mFuture = AVMDLThreadPool.addExecuteTask(new Runnable() {
                /* class com.ss.mediakit.net.LocalDNSHosts.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(101171);
                }

                public void run() {
                    int i2;
                    AVMDLLog.d("BatchParseLocalDNSHosts", "----call local dns batch parse");
                    for (int i3 = 0; i3 < LocalDNSHosts.this.mHosts.length; i3++) {
                        if (!TextUtils.isEmpty(LocalDNSHosts.this.mHosts[i3])) {
                            try {
                                LocalDNSHosts localDNSHosts = LocalDNSHosts.this;
                                localDNSHosts.mAddress = InetAddress.getAllByName(localDNSHosts.mHosts[i3]);
                                String str = "";
                                for (int i4 = 0; i4 < LocalDNSHosts.this.mAddress.length; i4++) {
                                    String hostAddress = LocalDNSHosts.this.mAddress[i4].getHostAddress();
                                    if (!TextUtils.isEmpty(hostAddress)) {
                                        str = TextUtils.isEmpty(str) ? str + hostAddress : str + "," + hostAddress;
                                    }
                                }
                                AVMDLLog.d("BatchParseLocalDNSHosts", a.a("host:%s pasrse suc result:%s", new Object[]{LocalDNSHosts.this.mHosts[i3], str}));
                                if (!TextUtils.isEmpty(str)) {
                                    AVMDLLog.d("BatchParseLocalDNSHosts", a.a("****default expiredtime:%d force expiredtime:%d ", new Object[]{Integer.valueOf(AVMDLDNSParser.mGlobalDefaultExpiredTime), Integer.valueOf(AVMDLDNSParser.mGlobalForceExpiredTime)}));
                                    if (AVMDLDNSParser.mGlobalForceExpiredTime > 0) {
                                        i2 = AVMDLDNSParser.mGlobalForceExpiredTime;
                                    } else {
                                        i2 = AVMDLDNSParser.mGlobalDefaultExpiredTime;
                                    }
                                    IPCache.getInstance().put(LocalDNSHosts.this.mHosts[i3], new AVMDLDNSInfo(0, LocalDNSHosts.this.mHosts[i3], str, ((long) (i2 * 1000)) + System.currentTimeMillis(), LocalDNSHosts.this.mId));
                                }
                            } catch (Throwable th) {
                                AVMDLLog.d("BatchParseLocalDNSHosts", a.a("host:%s pasrse err:%s", new Object[]{LocalDNSHosts.this.mHosts[i3], th.getMessage()}));
                            }
                        }
                    }
                    LocalDNSHosts.this.mRet = true;
                    AVMDLLog.d("BatchParseLocalDNSHosts", "****end call local dns batch parse");
                }
            });
        } catch (Exception e2) {
            AVMDLLog.d("BatchParseLocalDNSHosts", a.a("****end call local dns, exception:%s", new Object[]{e2}));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNSHosts(String[] strArr, Handler handler) {
        this.mHosts = strArr;
        this.mHandler = handler;
    }
}
