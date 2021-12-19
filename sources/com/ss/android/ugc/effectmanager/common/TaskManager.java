package com.ss.android.ugc.effectmanager.common;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.common.task.BaseInterceptor;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import com.ss.android.ugc.effectmanager.common.task.ITask;
import com.ss.android.ugc.effectmanager.common.task.NewITask;
import com.ss.android.ugc.effectmanager.common.utils.CollectionUtil;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TaskManager {
    public Map<String, Pair<NewITask, Future>> mExecutingTask = new ConcurrentHashMap();
    private ExecutorService mExecutor;
    private boolean mInit;
    private Map<String, BaseInterceptor> mInterceptions;
    private boolean needShutDown;

    static {
        Covode.recordClassIndex(95258);
    }

    public static class TaskManagerConfig {
        private ExecutorService mExecutor;
        public boolean needShutDown;

        static {
            Covode.recordClassIndex(95261);
        }

        public ExecutorService getExecutor() {
            return this.mExecutor;
        }

        public TaskManagerConfig setExecutor(ExecutorService executorService, boolean z) {
            this.mExecutor = executorService;
            return this;
        }
    }

    public Map<String, BaseInterceptor> getInterceptions() {
        return this.mInterceptions;
    }

    private void checkInit() {
        if (!this.mInit) {
            throw new IllegalStateException("EffectPlatformSDK: TaskManager is not init !!!");
        }
    }

    public void destroy() {
        if (this.needShutDown) {
            this.mExecutor.shutdown();
        }
    }

    public void cancelAllTask() {
        if (!CollectionUtil.isMapEmpty(this.mExecutingTask)) {
            for (Pair<NewITask, Future> pair : this.mExecutingTask.values()) {
                ((NewITask) pair.first).cancel();
                ((Future) pair.second).cancel(true);
            }
            this.mExecutingTask.clear();
        }
        if (this.needShutDown) {
            this.mExecutor.shutdown();
        }
    }

    public void init(TaskManagerConfig taskManagerConfig) {
        this.mExecutor = taskManagerConfig.getExecutor();
        this.needShutDown = taskManagerConfig.needShutDown;
        this.mInterceptions = new ConcurrentHashMap();
        this.mInit = true;
    }

    public void cancelTask(String str) {
        Pair<NewITask, Future> pair;
        if (this.mExecutingTask.containsKey(str) && (pair = this.mExecutingTask.get(str)) != null) {
            ((NewITask) pair.first).cancel();
            ((Future) pair.second).cancel(true);
        }
    }

    public void commit(final ITask iTask) {
        if (iTask != null) {
            checkInit();
            if (!CollectionUtil.isMapEmpty(this.mInterceptions)) {
                for (BaseInterceptor baseInterceptor : this.mInterceptions.values()) {
                    if (baseInterceptor.intercept(iTask)) {
                        return;
                    }
                }
            }
            this.mExecutor.execute(new Runnable() {
                /* class com.ss.android.ugc.effectmanager.common.TaskManager.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(95259);
                }

                public void run() {
                    iTask.execute();
                }
            });
        }
    }

    public void addInterception(String str, BaseInterceptor baseInterceptor) {
        this.mInterceptions.put(str, baseInterceptor);
    }

    public void enableInterception(String str, boolean z) {
        BaseInterceptor baseInterceptor = this.mInterceptions.get(str);
        if (baseInterceptor != null) {
            baseInterceptor.enable(z);
        }
    }

    public <T> void commit(final NewITask<T> newITask, final IEffectPlatformBaseListener<T> iEffectPlatformBaseListener) {
        if (newITask != null) {
            checkInit();
            this.mExecutingTask.put(newITask.getId(), new Pair<>(newITask, this.mExecutor.submit(new Runnable() {
                /* class com.ss.android.ugc.effectmanager.common.TaskManager.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(95260);
                }

                public void run() {
                    newITask.execute(iEffectPlatformBaseListener);
                    TaskManager.this.mExecutingTask.remove(newITask.getId());
                }
            })));
        }
    }
}
