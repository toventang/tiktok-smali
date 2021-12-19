package com.ss.avframework.livestreamv2.core.interact;

import android.util.AndroidRuntimeException;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioCallback;
import com.ss.avframework.livestreamv2.core.interact.audio.AudioClient;
import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;
import com.ss.avframework.utils.AVLog;
import java.nio.Buffer;

class InteractAudioClient implements ILiveStream.IAudioFrameAvailableListener, AudioClient {
    private AudioCallback mAudioCallback;
    private int mChannel;
    private long mLastLogTime;
    private int mSampleHz;
    private boolean mStart;
    private Statistics mStatics;

    static {
        Covode.recordClassIndex(100204);
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void release() {
        this.mAudioCallback = null;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void stop() {
        this.mStart = false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public Statistics getStatistics() {
        return this.mStatics;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void start() {
        AudioCallback audioCallback = this.mAudioCallback;
        if (audioCallback != null) {
            audioCallback.onAudioWarning("");
        }
        this.mStart = true;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.audio.AudioClient
    public void prepare(AudioCallback audioCallback) {
        this.mAudioCallback = audioCallback;
    }

    public InteractAudioClient(int i2, int i3) {
        this.mChannel = i2;
        this.mSampleHz = i3;
    }

    public InteractAudioClient(int i2, int i3, boolean z) {
        this(i2, i3);
        if (z) {
            this.mStatics = new Statistics(1000);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.IAudioFrameAvailableListener
    public void onAudioFrameAvailable(Buffer buffer, int i2, int i3, int i4, long j2) {
        long j3;
        Statistics statistics = this.mStatics;
        if (statistics != null) {
            j3 = System.currentTimeMillis();
        } else {
            j3 = 0;
        }
        AudioCallback audioCallback = this.mAudioCallback;
        if (this.mStart) {
            if (audioCallback != null) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.mLastLogTime > 10000) {
                    AVLog.ioi("InteractAudioClient", "Input interact audio frame: sample_rate " + i3 + ", channel " + i4);
                    this.mLastLogTime = currentTimeMillis;
                }
                if (this.mChannel == i4 && this.mSampleHz == i3) {
                    audioCallback.updateAudioFrame(buffer, i2, j2);
                } else {
                    throw new AndroidRuntimeException("Interact client BUG!");
                }
            }
        } else if (audioCallback != null) {
            audioCallback.onAudioWarning("AudioClient no start.");
        }
        if (statistics != null) {
            statistics.add((double) (System.currentTimeMillis() - j3));
        }
    }
}
