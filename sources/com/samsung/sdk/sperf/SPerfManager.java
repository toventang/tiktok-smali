package com.samsung.sdk.sperf;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;

/* access modifiers changed from: package-private */
public class SPerfManager {
    private static BoostLevelControl boostLevelControl;
    private static Context mContext = null;
    private static SPerfManager mInstance;
    private static int nextBoostObjectID;
    private static HashMap<Integer, TaskBoostReleaseHandler> releaserHash = new HashMap<>();
    private static SPerfInitThread sPerfThread = new SPerfInitThread();
    private static SessionControl sessionControl;

    static {
        Covode.recordClassIndex(35507);
    }

    private SPerfManager() {
    }

    public static SPerfManager createInstance(Context context) {
        SPerfManager sPerfManager;
        MethodCollector.i(2112);
        synchronized (SPerfManager.class) {
            try {
                sPerfManager = mInstance;
                if (sPerfManager == null) {
                    sPerfManager = null;
                    if (context == null) {
                        SPerfUtil.logAlways("ERROR : Context is Null");
                    } else {
                        Thread thread = new Thread(sPerfThread);
                        try {
                            thread.start();
                            thread.join();
                            sPerfManager = sPerfThread.getSPerfManager();
                            mContext = context;
                            int i2 = 0;
                            do {
                                if (CustomParams.getBoostType(i2) == 1 && mContext != null) {
                                    releaserHash.put(Integer.valueOf(i2), new TaskBoostReleaseHandler(mContext, sPerfManager, i2));
                                }
                                i2++;
                            } while (i2 < 11);
                        } catch (InterruptedException e2) {
                            SPerfUtil.logAlways("ERROR : InterruptedException");
                            e2.printStackTrace();
                        } catch (IllegalThreadStateException e3) {
                            SPerfUtil.logAlways("ERROR : IllegalThreadStateException");
                            e3.printStackTrace();
                        }
                    }
                }
            } finally {
                MethodCollector.o(2112);
            }
        }
        return sPerfManager;
    }

    public static SPerfManager initSPerfManager() {
        String str;
        if (mInstance == null) {
            SessionControl createInstance = SessionControl.createInstance();
            sessionControl = createInstance;
            if (createInstance == null) {
                str = "ERROR : Initialize Fail (Session)";
            } else {
                BoostLevelControl createInstance2 = BoostLevelControl.createInstance(createInstance);
                boostLevelControl = createInstance2;
                if (createInstance2 == null) {
                    str = "ERROR : Initialize Fail (BoostingLevelSet)";
                } else {
                    mInstance = new SPerfManager();
                }
            }
            SPerfUtil.logAlways(str);
            return null;
        }
        return mInstance;
    }

    public static void startTaskReleaseHandler(int i2, int i3) {
        HashMap<Integer, TaskBoostReleaseHandler> hashMap = releaserHash;
        if (hashMap != null) {
            hashMap.get(Integer.valueOf(i2)).startBoostTimeout(i3);
        }
    }

    public void addSPerfListerner(SPerfListener sPerfListener) {
        String str;
        if (sPerfListener == null) {
            str = "ERROR : Null listener (addPerfSDKListerner)";
        } else {
            SessionControl sessionControl2 = sessionControl;
            if (sessionControl2 == null) {
                str = "ERROR : SessionControl Should be initialized";
            } else {
                sessionControl2.addListerner(sPerfListener);
                return;
            }
        }
        SPerfUtil.log(str);
    }

    public int createBoostID() {
        int i2;
        MethodCollector.i(2120);
        synchronized (this) {
            try {
                i2 = nextBoostObjectID;
                nextBoostObjectID = i2 + 1;
            } finally {
                MethodCollector.o(2120);
            }
        }
        return i2;
    }

    public int startBoost(BoostObject boostObject) {
        if (boostObject == null) {
            SPerfUtil.log("ERROR : null boost object (doBoost)");
            return -1;
        }
        if (boostObject.getID() == -1) {
            boostObject.setID(createBoostID());
        }
        return Boost.requestNativeBoost(boostObject);
    }

    public int startPresetBoost(int i2, int i3) {
        String str;
        BoostLevelControl boostLevelControl2 = boostLevelControl;
        if (boostLevelControl2 == null) {
            str = "ERROR : BoostLevelControl Should be initialized";
        } else if (i3 >= 0) {
            return startBoost(boostLevelControl2.getBoostObjectByScenario(i2, i3));
        } else {
            str = "ERROR : timeout coundn't be less than 0";
        }
        SPerfUtil.log(str);
        return -1;
    }

    public int stopBoost() {
        if (boostLevelControl != null) {
            return Boost.releaseNativeBoost();
        }
        SPerfUtil.log("ERROR : BoostLevelControl Should be initialized");
        return -1;
    }

    public int stopBoost(int i2, int i3) {
        if (boostLevelControl != null) {
            return Boost.releaseNativeBoost(i2, i3);
        }
        SPerfUtil.log("ERROR : BoostLevelControl Should be initialized");
        return -1;
    }

    public int updateBoost(int i2, int i3, int i4, BoostObject boostObject) {
        BoostLevelControl boostLevelControl2 = boostLevelControl;
        if (boostLevelControl2 != null) {
            return boostLevelControl2.updateBoost(i2, i3, i4, boostObject);
        }
        SPerfUtil.log("ERROR : Initialize Fail boostLevel not exist (updateBoost)");
        return -1;
    }
}
