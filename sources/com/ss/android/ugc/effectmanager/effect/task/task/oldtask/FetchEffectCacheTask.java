package com.ss.android.ugc.effectmanager.effect.task.task.oldtask;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.common.cachemanager.ICache;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.common.task.NormalTask;
import com.ss.android.ugc.effectmanager.context.EffectContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.task.result.EffectTaskResult;

public class FetchEffectCacheTask extends NormalTask {
    private Effect mEffect;
    private EffectConfiguration mEffectConfiguration;

    static {
        Covode.recordClassIndex(95522);
    }

    @Override // com.ss.android.ugc.effectmanager.common.task.ITask
    public void execute() {
        ICache cache = this.mEffectConfiguration.getCache();
        Effect effect = this.mEffect;
        if (effect == null || cache == null) {
            sendMessage(15, new EffectTaskResult(this.mEffect, new ExceptionResult(10003)));
            return;
        }
        try {
            if (cache.has(effect.getId())) {
                sendMessage(15, new EffectTaskResult(this.mEffect, null));
            } else {
                sendMessage(15, new EffectTaskResult(this.mEffect, new ExceptionResult(10003)));
            }
        } catch (Exception e2) {
            sendMessage(15, new EffectTaskResult(this.mEffect, new ExceptionResult(e2)));
        }
    }

    public FetchEffectCacheTask(EffectContext effectContext, Effect effect, Handler handler, String str) {
        super(handler, str);
        this.mEffectConfiguration = effectContext.getEffectConfiguration();
        this.mEffect = effect;
    }
}
