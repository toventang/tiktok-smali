package com.ss.ttuploader;

import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.ttuploader.net.HTTPDNS;
import com.ss.ttuploader.net.IPCache;
import com.ss.ttuploader.net.TTUploadDNSInfo;
import com.ss.ttuploader.net.TTUploadDNSParser;
import com.ss.ttuploader.net.TTUploadDNSParserListener;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;

public class TTUploadResolver implements TTUploadDNSParserListener {
    private static final Hashtable<String, HostInfo> mCacheHosts = new Hashtable<>();
    public static volatile int mDNSVersion = 1;
    public static volatile int mIsUseTTnetDNS;
    public String mError;
    private HostInfo mHostInfo;
    private volatile String mHostName;
    public volatile String[] mIPStr;
    public volatile boolean mRet;
    private Thread mThread;
    private int mUseDNSType = mDNSVersion;

    /* access modifiers changed from: package-private */
    public static class HostInfo {
        public String ip;
        public long time;

        static {
            Covode.recordClassIndex(101400);
        }

        HostInfo() {
        }
    }

    static {
        Covode.recordClassIndex(101399);
    }

    public String getAddress() {
        if (!this.mRet || this.mIPStr == null || this.mIPStr[0] == null) {
            return null;
        }
        return this.mIPStr[0];
    }

    public int isSuccess() {
        if (!this.mRet) {
            return 0;
        }
        if (this.mIPStr == null || this.mIPStr[0] == null) {
            return -1;
        }
        return 1;
    }

    public void freeAddress() {
        Thread thread;
        if (this.mUseDNSType == 1 && (thread = this.mThread) != null) {
            try {
                thread.interrupt();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (this.mUseDNSType == 2) {
            try {
                TTUploadDNSParser.getInstance().removeHost(this.mHostName, this);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class ParserHost implements Runnable {
        String mHostName;
        TTUploadResolver mResolver;

        static {
            Covode.recordClassIndex(101401);
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                int r0 = com.ss.ttuploader.TTUploadResolver.mIsUseTTnetDNS
                r4 = 1
                r2 = 0
                r3 = 0
                if (r0 != r4) goto L_0x001f
                java.lang.String r0 = r5.mHostName     // Catch:{ all -> 0x001e }
                java.util.List r1 = com.bytedance.ttnet.TTNetInit.dnsLookup(r0)     // Catch:{ all -> 0x001e }
                if (r1 == 0) goto L_0x001f
                java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x001e }
                if (r0 == 0) goto L_0x001f
                java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x001e }
                java.net.InetAddress r0 = (java.net.InetAddress) r0     // Catch:{ all -> 0x001e }
                r3 = r0
                r0 = 1
                goto L_0x0032
            L_0x001e:
                r0 = 0
            L_0x001f:
                java.lang.String r0 = r5.mHostName     // Catch:{ UnknownHostException -> 0x0026 }
                java.net.InetAddress r3 = java.net.InetAddress.getByName(r0)     // Catch:{ UnknownHostException -> 0x0026 }
                goto L_0x0032
            L_0x0026:
                r0 = move-exception
                r0.printStackTrace()
                com.ss.ttuploader.TTUploadResolver r1 = r5.mResolver
                java.lang.String r0 = r0.getMessage()
                r1.mError = r0
            L_0x0032:
                if (r3 == 0) goto L_0x005c
                java.lang.String r3 = r3.getHostAddress()
                com.ss.ttuploader.TTUploadResolver r1 = r5.mResolver
                java.lang.String[] r0 = new java.lang.String[r4]
                r1.mIPStr = r0
                com.ss.ttuploader.TTUploadResolver r0 = r5.mResolver
                java.lang.String[] r0 = r0.mIPStr
                r0[r2] = r3
                com.ss.ttuploader.TTUploadResolver$HostInfo r2 = new com.ss.ttuploader.TTUploadResolver$HostInfo
                r2.<init>()
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
                r2.ip = r3
                java.lang.String r0 = r5.mHostName
                com.ss.ttuploader.TTUploadResolver.putHostInfo(r0, r2)
                long r0 = java.lang.System.currentTimeMillis()
                r2.time = r0
            L_0x005c:
                com.ss.ttuploader.TTUploadResolver r0 = r5.mResolver
                r0.mRet = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.ttuploader.TTUploadResolver.ParserHost.run():void");
        }

        public ParserHost(TTUploadResolver tTUploadResolver, String str) {
            this.mResolver = tTUploadResolver;
            this.mHostName = str;
        }
    }

    public static void setEnableTTNetDNS(int i2) {
        mIsUseTTnetDNS = i2;
    }

    public void getAddressInfo(String str) {
        int i2 = this.mUseDNSType;
        if (i2 == 1) {
            getAddressInfoVersion_1(str);
        } else if (i2 != 2) {
            getAddressInfoVersion_1(str);
        } else {
            getAddressInfoVersion_2(str);
        }
    }

    public static final boolean isIP(String str) {
        if (str.length() >= 7 && str.length() <= 15) {
            return Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str).find();
        }
        if (str.charAt(0) == '[' && str.charAt(str.length() - 1) == ']') {
            return true;
        }
        return false;
    }

    private void getAddressInfoVersion_1(String str) {
        this.mHostName = str;
        if (str == null || str.length() <= 0 || "".equals(str)) {
            this.mRet = true;
        } else if (isIP(this.mHostName)) {
            this.mIPStr = new String[1];
            this.mIPStr[0] = this.mHostName;
            this.mRet = true;
        } else {
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            HostInfo hostInfo = hashtable.get(str);
            this.mHostInfo = hostInfo;
            if (hostInfo != null) {
                if (hostInfo.ip == null || System.currentTimeMillis() - this.mHostInfo.time >= 60000) {
                    hashtable.remove(str);
                    this.mHostInfo = null;
                } else {
                    this.mIPStr = new String[1];
                    this.mIPStr[0] = this.mHostInfo.ip;
                    this.mRet = true;
                    return;
                }
            }
            try {
                Thread thread = new Thread(new ParserHost(this, this.mHostName));
                this.mThread = thread;
                thread.start();
            } catch (Exception e2) {
                this.mRet = true;
                this.mError = e2.getMessage();
            }
        }
    }

    private void getAddressInfoVersion_2(String str) {
        TTUploadLog.d("TTUploadResolver", "----add host to parser");
        this.mHostName = str;
        TTUploadDNSInfo tTUploadDNSInfo = IPCache.getInstance().get(str);
        if (!(tTUploadDNSInfo == null || tTUploadDNSInfo.mIpList == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            TTUploadLog.d("TTUploadResolver", a.a("get result from cache expiredT:%d curT:%d ", new Object[]{Long.valueOf(tTUploadDNSInfo.mExpiredTime), Long.valueOf(currentTimeMillis)}));
            if (tTUploadDNSInfo.mExpiredTime <= currentTimeMillis) {
                TTUploadLog.d("TTUploadResolver", a.a("has expired try call parse:", new Object[0]));
                TTUploadDNSParser.getInstance().addHost(str, null);
            }
            String[] split = tTUploadDNSInfo.mIpList.split(",");
            if (split != null && split.length > 0) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
                this.mRet = true;
                TTUploadLog.d("TTUploadResolver", a.a("get result from cache suc, ip:%s ", new Object[]{split[0]}));
            }
        }
        if (!this.mRet) {
            TTUploadLog.d("TTUploadResolver", "****add host to parser");
            TTUploadDNSParser.getInstance().addHost(str, this);
        }
    }

    public static void setDNSServer(String str, String str2) {
        HTTPDNS.setDNSServerHost(str, str2);
    }

    static synchronized void putHostInfo(String str, HostInfo hostInfo) {
        synchronized (TTUploadResolver.class) {
            MethodCollector.i(6288);
            long currentTimeMillis = System.currentTimeMillis();
            Hashtable<String, HostInfo> hashtable = mCacheHosts;
            String str2 = null;
            if (hashtable.size() > 128) {
                Iterator<Map.Entry<String, HostInfo>> it = hashtable.entrySet().iterator();
                HostInfo hostInfo2 = null;
                while (it.hasNext()) {
                    HostInfo value = it.next().getValue();
                    str2 = it.next().getKey();
                    if (value != null && value.time < currentTimeMillis) {
                        currentTimeMillis = value.time;
                        hostInfo2 = value;
                    }
                }
                if (!(hostInfo2 == null || str2 == null)) {
                    mCacheHosts.remove(str2);
                }
            }
            mCacheHosts.put(str, hostInfo);
            MethodCollector.o(6288);
        }
    }

    public static void setDNSType(int i2, int i3, int i4, int i5, int i6) {
        if (i2 == 1 || i2 == 2) {
            TTUploadDNSParser.setIntValue(0, i3);
            TTUploadDNSParser.setIntValue(1, i4);
            TTUploadDNSParser.setIntValue(3, i5);
            TTUploadDNSParser.setIntValue(2, i6);
            mDNSVersion = i2;
        }
    }

    @Override // com.ss.ttuploader.net.TTUploadDNSParserListener
    public void onCompletion(int i2, String str, String str2, long j2, String str3) {
        String[] split;
        TTUploadLog.d("TTUploadResolver", a.a("notify result host:%s iplist:%s ", new Object[]{str, str2}));
        if (!this.mRet) {
            if (!(str2 == null || str == null || !str.equals(this.mHostName) || (split = str2.split(",")) == null || split.length <= 0)) {
                this.mIPStr = new String[1];
                this.mIPStr[0] = split[0];
            }
            this.mRet = true;
        }
    }
}
