package com.ss.ttuploader.net;

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
    private ConcurrentHashMap<String, TTUploadDNSInfo> mDNSRecord = new ConcurrentHashMap<>();

    public String getCurNetExtraInfo() {
        return mNetExtraInfo;
    }

    public int getCurNetType() {
        return mNetType;
    }

    static {
        Covode.recordClassIndex(101421);
    }

    private IPCache() {
    }

    public void clear() {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
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
        MethodCollector.i(3452);
        if (mInstance == null) {
            synchronized (IPCache.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new IPCache();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3452);
                    throw th;
                }
            }
        }
        IPCache iPCache = mInstance;
        MethodCollector.o(3452);
        return iPCache;
    }

    public void setCurNetExtraInfo(String str) {
        mNetExtraInfo = str;
    }

    public void setCurNetType(int i2) {
        mNetType = i2;
    }

    public TTUploadDNSInfo get(String str) {
        TTUploadDNSInfo tTUploadDNSInfo;
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                tTUploadDNSInfo = concurrentHashMap.get(str);
            } else {
                tTUploadDNSInfo = null;
            }
            return tTUploadDNSInfo;
        } finally {
            this.lock.unlock();
        }
    }

    public void put(String str, TTUploadDNSInfo tTUploadDNSInfo) {
        this.lock.lock();
        try {
            ConcurrentHashMap<String, TTUploadDNSInfo> concurrentHashMap = this.mDNSRecord;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(str, tTUploadDNSInfo);
            }
        } finally {
            this.lock.unlock();
        }
    }
}
