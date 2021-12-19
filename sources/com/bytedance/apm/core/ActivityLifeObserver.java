package com.bytedance.apm.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.services.apm.api.IActivityLifeManager;
import com.bytedance.services.apm.api.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class ActivityLifeObserver implements Application.ActivityLifecycleCallbacks, IActivityLifeManager {
    private static final ActivityLifeObserver mInstance = new ActivityLifeObserver();
    private boolean mChangingConfigActivity;
    private String mCurActivityHash;
    private int mFrontActivityCount;
    private boolean mIsFrontV2;
    private ArrayList<d> mObservers = new ArrayList<>(8);
    private String mTopActivityClassName = null;
    private WeakReference<Activity> mTopActivityRef;

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public static ActivityLifeObserver getInstance() {
        return mInstance;
    }

    public WeakReference<Activity> getTopActivityRef() {
        return this.mTopActivityRef;
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public boolean isForeground() {
        return this.mIsFrontV2;
    }

    public boolean isV2Foreground() {
        return this.mIsFrontV2;
    }

    static {
        Covode.recordClassIndex(14545);
    }

    private ActivityLifeObserver() {
    }

    private Object[] collectObservers() {
        Object[] objArr;
        synchronized (this.mObservers) {
            if (this.mObservers.size() > 0) {
                objArr = this.mObservers.toArray();
            } else {
                objArr = null;
            }
        }
        if (objArr == null) {
            return new Object[0];
        }
        return objArr;
    }

    public String getTopActivityClassName() {
        WeakReference<Activity> weakReference = this.mTopActivityRef;
        String str = "";
        if (weakReference == null) {
            return str;
        }
        Activity activity = weakReference.get();
        if (activity == null || (str = this.mTopActivityClassName) != null) {
            return str;
        }
        return activity.getClass().getName();
    }

    public static void init(Application application) {
        mInstance.initWithApp(application);
    }

    private void initWithApp(Application application) {
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this);
            application.registerActivityLifecycleCallbacks(this);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        if (getActivityHash(activity).equals(this.mCurActivityHash)) {
            this.mCurActivityHash = null;
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void register(d dVar) {
        ArrayList<d> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mObservers.add(dVar);
            }
        }
    }

    @Override // com.bytedance.services.apm.api.IActivityLifeManager
    public void unregister(d dVar) {
        ArrayList<d> arrayList = this.mObservers;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mObservers.remove(dVar);
            }
        }
    }

    private String getActivityHash(Activity activity) {
        return activity.getClass().getName() + activity.hashCode();
    }

    private void notifyBackground(Activity activity) {
        for (Object obj : collectObservers()) {
            ((d) obj).a(activity);
        }
    }

    private void notifyFront(Activity activity) {
        for (Object obj : collectObservers()) {
            ((d) obj).b(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        for (Object obj : collectObservers()) {
            ((d) obj).c(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        this.mTopActivityRef = new WeakReference<>(activity);
        this.mTopActivityClassName = null;
        collectObservers();
        String activityHash = getActivityHash(activity);
        if (!activityHash.equals(this.mCurActivityHash)) {
            this.mCurActivityHash = activityHash;
        }
    }

    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.mChangingConfigActivity = true;
            return;
        }
        int i2 = this.mFrontActivityCount - 1;
        this.mFrontActivityCount = i2;
        if (i2 == 0) {
            this.mIsFrontV2 = false;
            notifyBackground(activity);
        }
    }

    public void onActivityStarted(Activity activity) {
        for (Object obj : collectObservers()) {
            ((d) obj).l_();
        }
        if (this.mChangingConfigActivity) {
            this.mChangingConfigActivity = false;
            return;
        }
        int i2 = this.mFrontActivityCount + 1;
        this.mFrontActivityCount = i2;
        if (i2 == 1) {
            this.mIsFrontV2 = true;
            notifyFront(activity);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        for (Object obj : collectObservers()) {
            ((d) obj).a(activity, bundle);
        }
    }
}
