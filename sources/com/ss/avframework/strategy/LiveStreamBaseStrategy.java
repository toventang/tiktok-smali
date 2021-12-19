package com.ss.avframework.strategy;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.utils.TEBundle;

public class LiveStreamBaseStrategy extends LiveAbstractStrategy {
    protected IStrategyNotify mIStrategyNotify;

    public interface IStrategyNotify {
        static {
            Covode.recordClassIndex(100562);
        }

        void onLiveOptionChanged(TEBundle tEBundle, TEBundle tEBundle2);
    }

    static {
        Covode.recordClassIndex(100561);
    }

    @Override // com.ss.avframework.strategy.LiveAbstractStrategy
    public void onInfo(int i2, int i3, int i4) {
    }

    @Override // com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(13892);
        super.release();
        MethodCollector.o(13892);
    }

    public LiveStreamBaseStrategy(IStrategyNotify iStrategyNotify) {
        this.mIStrategyNotify = iStrategyNotify;
    }
}
