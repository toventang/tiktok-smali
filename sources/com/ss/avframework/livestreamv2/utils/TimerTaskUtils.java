package com.ss.avframework.livestreamv2.utils;

import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskUtils {
    private static Map<String, Timer> mapTasks = new HashMap();

    static {
        Covode.recordClassIndex(100496);
    }

    public static void removeTask(String str) {
        Timer timer = mapTasks.get(str);
        if (timer != null) {
            timer.cancel();
            mapTasks.remove(str);
        }
    }

    public static void addTask(final Runnable runnable, int i2, String str) {
        removeTask(str);
        Timer timer = new Timer();
        long j2 = (long) i2;
        timer.schedule(new TimerTask() {
            /* class com.ss.avframework.livestreamv2.utils.TimerTaskUtils.AnonymousClass1 */

            static {
                Covode.recordClassIndex(100497);
            }

            public final void run() {
                runnable.run();
            }
        }, j2, j2);
        mapTasks.put(str, timer);
    }
}
