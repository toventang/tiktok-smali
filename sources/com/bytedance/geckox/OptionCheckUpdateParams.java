package com.bytedance.geckox;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.f.a;
import com.bytedance.geckox.policy.loop.model.LoopInterval;
import java.util.HashMap;
import java.util.Map;

public class OptionCheckUpdateParams {
    private Map<String, Map<String, Object>> customParam = new HashMap();
    private boolean enableDownloadAutoRetry = true;
    private boolean enableRetry = true;
    private boolean enableThrottle = true;
    private boolean innerRequestByUser = false;
    private boolean lazyUpdate;
    private a listener;
    private LoopInterval.a loopLevel;
    private int updatePriority = 1;

    public interface ChannelUpdatePriority {
        static {
            Covode.recordClassIndex(17251);
        }
    }

    public interface CustomValue {
        static {
            Covode.recordClassIndex(17252);
        }

        Object getValue();
    }

    static {
        Covode.recordClassIndex(17250);
    }

    public int getChannelUpdatePriority() {
        return this.updatePriority;
    }

    public Map<String, Map<String, Object>> getCustomParam() {
        return this.customParam;
    }

    public boolean getInnerRequestByUser() {
        return this.innerRequestByUser;
    }

    public a getListener() {
        return this.listener;
    }

    public LoopInterval.a getLoopLevel() {
        return this.loopLevel;
    }

    public boolean isEnableDownloadAutoRetry() {
        return this.enableDownloadAutoRetry;
    }

    public boolean isEnableRetry() {
        return this.enableRetry;
    }

    public boolean isEnableThrottle() {
        return this.enableThrottle;
    }

    public boolean isLazyUpdate() {
        return this.lazyUpdate;
    }

    public OptionCheckUpdateParams setChannelUpdatePriority(int i2) {
        this.updatePriority = i2;
        return this;
    }

    public OptionCheckUpdateParams setCustomParam(Map<String, Map<String, Object>> map) {
        this.customParam = map;
        return this;
    }

    public OptionCheckUpdateParams setEnableDownloadAutoRetry(boolean z) {
        this.enableDownloadAutoRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableRetry(boolean z) {
        this.enableRetry = z;
        return this;
    }

    public OptionCheckUpdateParams setEnableThrottle(boolean z) {
        this.enableThrottle = z;
        return this;
    }

    public OptionCheckUpdateParams setInnerRequestByUser(boolean z) {
        this.innerRequestByUser = z;
        return this;
    }

    public OptionCheckUpdateParams setLazyUpdate(boolean z) {
        this.lazyUpdate = z;
        return this;
    }

    public OptionCheckUpdateParams setListener(a aVar) {
        this.listener = aVar;
        return this;
    }

    public OptionCheckUpdateParams setLoopLevel(LoopInterval.a aVar) {
        this.loopLevel = aVar;
        return this;
    }
}
