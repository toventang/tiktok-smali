package com.ss.mediakit.net;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public class AVMDLDNSManager {
    public static Map<Integer, CreateConstructor> dnsMap;
    private static AVMDLDNSManager mInstance;

    static {
        Covode.recordClassIndex(101132);
    }

    private AVMDLDNSManager() {
        dnsMap = new HashMap();
        initDnsMap();
    }

    public static AVMDLDNSManager getInstance() {
        MethodCollector.i(1141);
        if (mInstance == null) {
            synchronized (AVMDLDNSManager.class) {
                try {
                    if (mInstance == null) {
                        try {
                            mInstance = new AVMDLDNSManager();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            mInstance = null;
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1141);
                    throw th;
                }
            }
        }
        AVMDLDNSManager aVMDLDNSManager = mInstance;
        MethodCollector.o(1141);
        return aVMDLDNSManager;
    }

    private void initDnsMap() {
        DefaultConstructor defaultConstructor = new DefaultConstructor();
        dnsMap.put(1, defaultConstructor);
        dnsMap.put(2, defaultConstructor);
        dnsMap.put(3, defaultConstructor);
    }

    public synchronized CreateConstructor getCreateConstructor(int i2) {
        MethodCollector.i(1139);
        if (dnsMap.containsKey(Integer.valueOf(i2))) {
            CreateConstructor createConstructor = dnsMap.get(Integer.valueOf(i2));
            MethodCollector.o(1139);
            return createConstructor;
        }
        MethodCollector.o(1139);
        return null;
    }

    public synchronized void registerDnsConstructor(int i2, CreateConstructor createConstructor) {
        MethodCollector.i(1138);
        try {
            dnsMap.put(Integer.valueOf(i2), createConstructor);
            MethodCollector.o(1138);
        } catch (Exception e2) {
            e2.printStackTrace();
            MethodCollector.o(1138);
        }
    }
}
