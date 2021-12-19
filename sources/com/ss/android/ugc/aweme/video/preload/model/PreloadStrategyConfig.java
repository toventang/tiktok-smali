package com.ss.android.ugc.aweme.video.preload.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.cf.a.d;
import java.util.Collections;
import java.util.List;

public class PreloadStrategyConfig {
    @c(a = "danger_buffer_threshold")
    private int dangerBufferThreshold;
    @c(a = "enable_buffer_threshold")
    private int enableBufferPreload;
    @c(a = "network_lower")
    private long networkLower;
    @c(a = "network_upper")
    private long networkUpper;
    @c(a = "secure_buffer_threshold")
    private int secureBufferThreshold;
    @c(a = "tasks")
    public List<PreloadTask> tasks;

    static {
        Covode.recordClassIndex(94046);
    }

    public static PreloadStrategyConfig getDefault() {
        return a.f143731a;
    }

    public int getDangerBufferThreshold() {
        return this.dangerBufferThreshold;
    }

    public long getNetworkLower() {
        return this.networkLower;
    }

    public long getNetworkUpper() {
        return this.networkUpper;
    }

    public int getSecureBufferThreshold() {
        return this.secureBufferThreshold;
    }

    public boolean isEnableBufferPreload() {
        if (this.enableBufferPreload == 1) {
            return true;
        }
        return false;
    }

    public List<PreloadTask> getTasks() {
        if (this.tasks == null) {
            this.tasks = Collections.emptyList();
        }
        return this.tasks;
    }

    public String taskToJson() {
        return d.a().b(this.tasks);
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final PreloadStrategyConfig f143731a;

        static {
            Covode.recordClassIndex(94047);
            PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
            f143731a = preloadStrategyConfig;
            preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask());
        }
    }

    public void clearFlag() {
        List<PreloadTask> list = this.tasks;
        if (list != null) {
            for (PreloadTask preloadTask : list) {
                preloadTask.alreadyPreload = false;
            }
        }
    }

    public String toString() {
        return "PreloadStrategyConfig{tasks=" + d.a().b(this.tasks) + '}';
    }

    public static PreloadStrategyConfig convertOldConfig(int i2, int i3) {
        PreloadStrategyConfig preloadStrategyConfig = new PreloadStrategyConfig();
        preloadStrategyConfig.tasks = Collections.singletonList(new PreloadTask(i2, i3));
        return preloadStrategyConfig;
    }
}
