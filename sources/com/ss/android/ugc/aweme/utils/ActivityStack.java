package com.ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.bytedance.common.utility.collection.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.common.applog.AppLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public final class ActivityStack {
    public static Application.ActivityLifecycleCallbacks lifecycleCallbacks = new Application.ActivityLifecycleCallbacks() {
        /* class com.ss.android.ugc.aweme.utils.ActivityStack.AnonymousClass1 */

        static {
            Covode.recordClassIndex(93234);
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            MethodCollector.i(2739);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sActivityStack.remove(activity);
                } finally {
                    MethodCollector.o(2739);
                }
            }
        }

        public final void onActivityStarted(Activity activity) {
            MethodCollector.i(2748);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sStartedActivities.a(activity);
                } finally {
                    MethodCollector.o(2748);
                }
            }
        }

        public final void onActivityResumed(Activity activity) {
            MethodCollector.i(2745);
            synchronized (ActivityStack.class) {
                try {
                    if (ActivityStack.sAppBackGround) {
                        ActivityStack.sAppBackGround = false;
                        if (!ActivityStack.sAppBackgroundListeners.f26927a.isEmpty()) {
                            Iterator<b> it = ActivityStack.sAppBackgroundListeners.iterator();
                            while (it.hasNext()) {
                                b next = it.next();
                                if (next != null) {
                                    next.b();
                                }
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(2745);
                }
            }
        }

        public final void onActivityStopped(Activity activity) {
            MethodCollector.i(2750);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sStartedActivities.b(activity);
                    if (!ActivityStack.sAppBackGround && ActivityStack.sStartedActivities.f26927a.isEmpty()) {
                        ActivityStack.sAppBackGround = true;
                        if (!ActivityStack.sAppBackgroundListeners.f26927a.isEmpty()) {
                            Iterator<b> it = ActivityStack.sAppBackgroundListeners.iterator();
                            while (it.hasNext()) {
                                b next = it.next();
                                if (next != null) {
                                    next.a();
                                }
                            }
                        }
                    }
                } finally {
                    MethodCollector.o(2750);
                }
            }
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            MethodCollector.i(2738);
            synchronized (ActivityStack.class) {
                try {
                    ActivityStack.sActivityStack.remove(activity);
                    ActivityStack.sActivityStack.add(activity);
                } catch (Throwable th) {
                    MethodCollector.o(2738);
                    throw th;
                }
            }
            AppLog.onActivityCreate(activity);
            MethodCollector.o(2738);
        }
    };
    static LinkedList<Activity> sActivityStack = new LinkedList<>();
    static boolean sAppBackGround = true;
    static d<b> sAppBackgroundListeners = new d<>();
    static d<Activity> sStartedActivities = new d<>();

    public interface a {
        static {
            Covode.recordClassIndex(93235);
        }
    }

    public interface b {
        static {
            Covode.recordClassIndex(93236);
        }

        void a();

        void b();
    }

    public static boolean isAppBackGround() {
        return sAppBackGround;
    }

    public static synchronized Activity[] getActivityStack() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            MethodCollector.i(284);
            activityArr = (Activity[]) sActivityStack.toArray(new Activity[sActivityStack.size()]);
            MethodCollector.o(284);
        }
        return activityArr;
    }

    static {
        Covode.recordClassIndex(93233);
    }

    public static synchronized Activity getPreviousActivity() {
        synchronized (ActivityStack.class) {
            MethodCollector.i(2374);
            if (sActivityStack.size() >= 2) {
                LinkedList<Activity> linkedList = sActivityStack;
                Activity activity = linkedList.get(linkedList.size() - 2);
                MethodCollector.o(2374);
                return activity;
            }
            MethodCollector.o(2374);
            return null;
        }
    }

    public static synchronized Activity[] getStartedActivitys() {
        Activity[] activityArr;
        synchronized (ActivityStack.class) {
            MethodCollector.i(288);
            ArrayList arrayList = new ArrayList();
            Iterator<Activity> it = sStartedActivities.iterator();
            while (it != null && it.hasNext()) {
                Activity next = it.next();
                if (next != null) {
                    arrayList.add(next);
                }
            }
            activityArr = (Activity[]) arrayList.toArray(new Activity[arrayList.size()]);
            MethodCollector.o(288);
        }
        return activityArr;
    }

    public static synchronized Activity getTopActivity() {
        synchronized (ActivityStack.class) {
            MethodCollector.i(2369);
            if (sActivityStack.isEmpty()) {
                MethodCollector.o(2369);
                return null;
            }
            Activity last = sActivityStack.getLast();
            MethodCollector.o(2369);
            return last;
        }
    }

    public static synchronized Activity getValidTopActivity() {
        Activity topActivity;
        synchronized (ActivityStack.class) {
            MethodCollector.i(278);
            topActivity = getTopActivity();
            if (topActivity != null && topActivity.isFinishing()) {
                sActivityStack.removeLast();
                topActivity = getValidTopActivity();
            }
            MethodCollector.o(278);
        }
        return topActivity;
    }

    public static synchronized void removeAppBackGroundListener(b bVar) {
        synchronized (ActivityStack.class) {
            MethodCollector.i(291);
            if (bVar != null) {
                sAppBackgroundListeners.b(bVar);
            }
            MethodCollector.o(291);
        }
    }

    public static synchronized void addAppBackGroundListener(b bVar) {
        synchronized (ActivityStack.class) {
            MethodCollector.i(289);
            if (bVar != null && !sAppBackgroundListeners.f26927a.containsKey(bVar)) {
                sAppBackgroundListeners.a(bVar);
            }
            MethodCollector.o(289);
        }
    }

    public static void finishAllFlipChatActivity(Class<?> cls) {
        Iterator<Activity> it = sActivityStack.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (cls.isInstance(next) && !(next instanceof a)) {
                next.finish();
            }
        }
    }

    public static synchronized Activity getPreviousActivity(Activity activity) {
        Activity activity2;
        int i2;
        synchronized (ActivityStack.class) {
            MethodCollector.i(2368);
            LinkedList<Activity> linkedList = sActivityStack;
            activity2 = null;
            int size = linkedList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                Activity activity3 = linkedList.get(size);
                if ((activity3 == activity || activity3.getTaskId() != activity.getTaskId()) && size - 1 >= 0) {
                    activity2 = linkedList.get(i2);
                    break;
                }
                size--;
            }
            MethodCollector.o(2368);
        }
        return activity2;
    }
}
