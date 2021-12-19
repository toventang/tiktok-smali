package com.bytedance.ttnet.diagnosis;

import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.bytedance.ttnet.TTNetInit;
import com.bytedance.ttnet.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TTNetDiagnosisService {
    private static final Map<Integer, String> sTypeStringMap;

    private static h getCronetHttpClient() {
        if (c.a()) {
            return h.a(TTNetInit.getTTNetDepend().a());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    static {
        Covode.recordClassIndex(27278);
        HashMap hashMap = new HashMap();
        sTypeStringMap = hashMap;
        hashMap.put(0, "DNS_RESOLVE_TARGET");
        hashMap.put(1, "RACE_TARGETS");
        hashMap.put(2, "ACCELERATE_TARGET");
        hashMap.put(3, "DIAGNOSE_TARGET");
        hashMap.put(4, "DIAGNOSE_V2_TARGET");
    }

    private static String requestTypeToString(int i2) {
        return sTypeStringMap.get(Integer.valueOf(i2));
    }

    private static boolean isOneTargetRequestType(int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return false;
            }
            if (!(i2 == 2 || i2 == 3 || i2 == 4)) {
                throw new IllegalArgumentException("Illegal request type: ".concat(String.valueOf(i2)));
            }
        }
        return true;
    }

    public static void reportUserLog(String str) {
        if (str != null && !str.isEmpty()) {
            try {
                if (getCronetHttpClient() == null) {
                    return;
                }
                if (h.f29075c != null) {
                    Reflect.on(h.f29075c).call("reportNetDiagnosisUserLog", new Class[]{String.class}, str);
                    return;
                }
                throw new UnsupportedOperationException("CronetEngine has not been initialized.");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean isValidNetDetect(int i2, long j2) {
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    return true;
                }
                throw new IllegalArgumentException("Illegal request type: ".concat(String.valueOf(i2)));
            } else if (j2 == 1 || j2 == 2 || j2 == 64) {
                return true;
            } else {
                return false;
            }
        } else if ((67 & j2) == 0 || (j2 & -68) != 0) {
            return false;
        } else {
            return true;
        }
    }

    public static IDiagnosisRequest createRequest(int i2, String str, int i3, int i4) {
        if (!isOneTargetRequestType(i2)) {
            throw new IllegalArgumentException("Type " + requestTypeToString(i2) + " of request should be created with multiple targets.");
        } else if (!isValidNetDetect(i2, (long) i3)) {
            throw new IllegalArgumentException("Illegal netDetectType: ".concat(String.valueOf(i3)));
        } else if (i2 != 0 && i2 != 2 && i2 != 3 && i2 != 4) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            return new a(i2, arrayList, i3, i4);
        }
    }

    public static IDiagnosisRequest createRequest(int i2, List<String> list, int i3, int i4) {
        if (isOneTargetRequestType(i2)) {
            throw new IllegalArgumentException("Type " + requestTypeToString(i2) + " of request should be created with only one target.");
        } else if (!isValidNetDetect(i2, (long) i3)) {
            throw new IllegalArgumentException("Illegal netDetectType: ".concat(String.valueOf(i3)));
        } else if (i2 != 1) {
            return null;
        } else {
            return new a(i2, list, i3, i4);
        }
    }
}
