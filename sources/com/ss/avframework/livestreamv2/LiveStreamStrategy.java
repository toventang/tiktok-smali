package com.ss.avframework.livestreamv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.strategy.LiveStreamBaseStrategy;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;

public class LiveStreamStrategy extends LiveStreamBaseStrategy {
    private WeakReference<TEBundle> mEncodeStreamOpt;
    private LiveStreamBuilder mLiveStreamBuilder;
    private WeakReference<TEBundle> mTransportOpt;

    static {
        Covode.recordClassIndex(99943);
    }

    @Override // com.ss.avframework.engine.NativeObject, com.ss.avframework.strategy.LiveStreamBaseStrategy
    public synchronized void release() {
        MethodCollector.i(12431);
        super.release();
        MethodCollector.o(12431);
    }

    public void setLiveStreamBuilder(LiveStreamBuilder liveStreamBuilder) {
        this.mLiveStreamBuilder = liveStreamBuilder;
    }

    public LiveStreamStrategy(TEBundle tEBundle, TEBundle tEBundle2, LiveStreamBaseStrategy.IStrategyNotify iStrategyNotify) {
        super(iStrategyNotify);
        this.mEncodeStreamOpt = new WeakReference<>(tEBundle);
        this.mTransportOpt = new WeakReference<>(tEBundle2);
    }

    @Override // com.ss.avframework.strategy.LiveAbstractStrategy, com.ss.avframework.strategy.LiveStreamBaseStrategy
    public void onInfo(int i2, int i3, int i4) {
        TEBundle tEBundle;
        TEBundle tEBundle2;
        if (i2 != 1 || i3 != 1) {
            return;
        }
        if (i4 == 1) {
            AVLog.disableLogFile(false);
            AVLog.disableLogIODevice(false);
            WeakReference<TEBundle> weakReference = this.mEncodeStreamOpt;
            if (weakReference != null && this.mLiveStreamBuilder != null && (tEBundle = weakReference.get()) != null) {
                tEBundle.setBool("estream_psnr_enable", this.mLiveStreamBuilder.isEnablePSNR());
                tEBundle.setBool("estream_siti_enable", this.mLiveStreamBuilder.getSdkSetting().enableSiti);
                tEBundle.setBool("estream_transport_delay_enable", this.mLiveStreamBuilder.getPushBase().enableRenderStallStats);
                if (this.mIStrategyNotify != null) {
                    this.mIStrategyNotify.onLiveOptionChanged(tEBundle, null);
                }
            }
        } else if (i4 == 2 || i4 == 3) {
            AVLog.disableLogFile(true);
            AVLog.disableLogIODevice(true);
            WeakReference<TEBundle> weakReference2 = this.mEncodeStreamOpt;
            if (weakReference2 != null && (tEBundle2 = weakReference2.get()) != null) {
                tEBundle2.setBool("estream_psnr_enable", false);
                tEBundle2.setBool("estream_siti_enable", false);
                tEBundle2.setBool("estream_transport_delay_enable", false);
                if (this.mIStrategyNotify != null) {
                    this.mIStrategyNotify.onLiveOptionChanged(tEBundle2, null);
                }
            }
        }
    }
}
