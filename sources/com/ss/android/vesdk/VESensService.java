package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.monitor.g;
import java.util.HashMap;

public class VESensService implements Runnable {
    public static String SENS_SERVICE_TYPE_CAMERA = "camera";
    public static String SENS_SERVICE_TYPE_MIC = "mic";
    private static VESensService mSensService = new VESensService();
    private int lastObjectID = 0;
    private int mCheckIntervalMs = 1000;
    private Thread mCheckThread = null;
    private boolean mInit = false;
    private HashMap<Integer, bb> mObjectMap = new HashMap<>();
    private c mStatusChangeHander = null;

    public interface c {
        static {
            Covode.recordClassIndex(99208);
        }
    }

    public enum a {
        ACTION_TYPE_CRASH(1),
        ACTION_TYPE_ALOG(2),
        ACTION_TYPE_CRASH_ALOG(3),
        ACTION_TYPE_SLARDAR(4),
        ACTION_TYPE_SLARDAR_CRASH(5),
        ACTION_TYPE_SLARDAR_ALOG(6),
        ACTION_TYPE_SLARDAR_ALOG_CRASH(7);
        
        public int value;

        public final int getActionType() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(99206);
        }

        private a(int i2) {
            this.value = i2;
        }
    }

    public enum b {
        PRIVACY_STATUS_RELEASE(0),
        PRIVACY_STATUS_USING(1);
        
        private int value;

        public final int getStatus() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(99207);
        }

        private b(int i2) {
            this.value = i2;
        }
    }

    public static VESensService getInstance() {
        return mSensService;
    }

    static {
        Covode.recordClassIndex(99205);
    }

    private VESensService() {
    }

    private int allocateObjectID() {
        int i2;
        MethodCollector.i(5628);
        synchronized (this) {
            try {
                i2 = this.lastObjectID;
                this.lastObjectID = i2 + 1;
            } finally {
                MethodCollector.o(5628);
            }
        }
        return i2;
    }

    public boolean init() {
        if (this.mInit) {
            return true;
        }
        Thread thread = new Thread(this);
        this.mCheckThread = thread;
        this.mInit = true;
        thread.start();
        return true;
    }

    public void uninit() {
        MethodCollector.i(5661);
        this.mInit = false;
        try {
            this.mCheckThread.join();
            MethodCollector.o(5661);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
            MethodCollector.o(5661);
        }
    }

    public void run() {
        MethodCollector.i(5945);
        long j2 = 0;
        while (this.mInit) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j2 < ((long) this.mCheckIntervalMs)) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException unused) {
                }
            } else {
                synchronized (this) {
                    try {
                        for (bb bbVar : this.mObjectMap.values()) {
                            if (bbVar.f151055c != bbVar.f151056d && currentTimeMillis - bbVar.f151057e > ((long) bbVar.f151058f)) {
                                String str = "Check Object Status illegal, name: " + bbVar.f151053a + ", expect status:" + bbVar.f151056d + ", status:" + bbVar.f151055c;
                                if (bbVar.f151055c != b.PRIVACY_STATUS_RELEASE && !bbVar.f151060h) {
                                    bbVar.f151060h = true;
                                    if ((bbVar.f151059g.value & a.ACTION_TYPE_ALOG.value) != 0) {
                                        an.d("VESensService", str);
                                    }
                                    if ((bbVar.f151059g.value & a.ACTION_TYPE_SLARDAR.value) != 0) {
                                        g.a(new VESensException(str));
                                    }
                                    if ((bbVar.f151059g.value & a.ACTION_TYPE_CRASH.value) != 0) {
                                        RuntimeException runtimeException = new RuntimeException(str);
                                        MethodCollector.o(5945);
                                        throw runtimeException;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(5945);
                        throw th;
                    }
                }
                j2 = currentTimeMillis;
            }
        }
        MethodCollector.o(5945);
    }

    public void setObjectStatusCheckInterval(int i2) {
        this.mCheckIntervalMs = i2;
    }

    public void unregisterSensCheckObject(int i2) {
        MethodCollector.i(5666);
        synchronized (this) {
            try {
                this.mObjectMap.remove(Integer.valueOf(i2));
            } finally {
                MethodCollector.o(5666);
            }
        }
    }

    public int getIDWithName(String str) {
        for (bb bbVar : this.mObjectMap.values()) {
            if (str.equals(bbVar.f151053a)) {
                return bbVar.f151054b;
            }
        }
        return -1;
    }

    public int registerSensCheckObject(String str) {
        MethodCollector.i(5665);
        Integer.valueOf(0);
        synchronized (this) {
            try {
                for (bb bbVar : this.mObjectMap.values()) {
                    if (str.equals(bbVar.f151053a)) {
                        return bbVar.f151054b;
                    }
                }
                Integer valueOf = Integer.valueOf(allocateObjectID());
                this.mObjectMap.put(valueOf, new bb(valueOf.intValue(), str));
                int intValue = valueOf.intValue();
                MethodCollector.o(5665);
                return intValue;
            } finally {
                MethodCollector.o(5665);
            }
        }
    }

    public void registerSensObjectStatusChangedHandler(int i2, c cVar) {
        this.mStatusChangeHander = cVar;
    }

    public void setObjectStatusCheckThreshold(int i2, int i3) {
        MethodCollector.i(5825);
        synchronized (this) {
            try {
                bb bbVar = this.mObjectMap.get(Integer.valueOf(i2));
                if (bbVar != null) {
                    bbVar.f151058f = i3;
                }
            } finally {
                MethodCollector.o(5825);
            }
        }
    }

    public void setSensCheckObjExpectStatus(int i2, b bVar) {
        MethodCollector.i(5669);
        synchronized (this) {
            try {
                bb bbVar = this.mObjectMap.get(Integer.valueOf(i2));
                if (bbVar != null) {
                    bbVar.f151056d = bVar;
                    bbVar.f151057e = System.currentTimeMillis();
                    bbVar.f151060h = false;
                }
            } finally {
                MethodCollector.o(5669);
            }
        }
    }

    public void setSensCheckObjStatus(int i2, b bVar) {
        MethodCollector.i(5667);
        synchronized (this) {
            try {
                bb bbVar = this.mObjectMap.get(Integer.valueOf(i2));
                if (bbVar != null) {
                    bbVar.f151055c = bVar;
                }
            } finally {
                MethodCollector.o(5667);
            }
        }
    }

    public void setStatusAbnormalAction(int i2, a aVar) {
        MethodCollector.i(5876);
        synchronized (this) {
            try {
                bb bbVar = this.mObjectMap.get(Integer.valueOf(i2));
                if (bbVar != null) {
                    bbVar.f151059g = aVar;
                }
            } finally {
                MethodCollector.o(5876);
            }
        }
    }
}
