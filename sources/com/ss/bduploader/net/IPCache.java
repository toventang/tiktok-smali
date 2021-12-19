package com.ss.bduploader.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class IPCache {
    private static IPCache mInstance;
    private static String mNetExtraInfo;
    private static int mNetType = -1;
    private Lock lock = new ReentrantLock();
    private ConcurrentHashMap<String, BDUploadDNSInfo> mDNSRecord = new ConcurrentHashMap<>();

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    static {
        Covode.recordClassIndex(100695);
    }

    private IPCache() {
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.clear();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public int getRecordSize() {
        int i2;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                i2 = concurrentHashMap.size();
            } else {
                i2 = -1;
            }
            return i2;
        } finally {
            this.lock.unlock();
        }
    }

    public static IPCache getInstance() {
        MethodCollector.i(3562);
        if (mInstance == null) {
            synchronized (IPCache.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new IPCache();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3562);
                    throw th;
                }
            }
        }
        IPCache iPCache = mInstance;
        MethodCollector.o(3562);
        return iPCache;
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i2) {
        mNetType = i2;
    }

    public BDUploadDNSInfo get(String str) {
        BDUploadDNSInfo bDUploadDNSInfo;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                bDUploadDNSInfo = concurrentHashMap.get(str);
            } else {
                bDUploadDNSInfo = null;
            }
            return bDUploadDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void put(String str, BDUploadDNSInfo bDUploadDNSInfo) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, BDUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, bDUploadDNSInfo);
            }
        } finally {
            this.lock.unlock();
        }
    }
}
