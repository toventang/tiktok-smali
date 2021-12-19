package com.ss.android.vesdk.audio;

import com.bytedance.covode.number.Covode;
import com.ss.android.medialib.presenter.e;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.aj;
import com.ss.android.vesdk.an;
import com.ss.android.vesdk.audio.j;
import com.ss.android.vesdk.m;

public enum g implements h {
    INSTANCE;
    
    private boolean mFeedPcm = true;
    e mPresenter;
    VEAudioEncodeSettings mVEAudioEncodeSettings;

    public final void startFeedPCM() {
        this.mFeedPcm = true;
    }

    public final void stopFeedPCM() {
        this.mFeedPcm = false;
    }

    static {
        Covode.recordClassIndex(99297);
    }

    public final void setAudioBufferConsumer(e eVar) {
        this.mPresenter = eVar;
    }

    public final void setAudioEncodeSettings(VEAudioEncodeSettings vEAudioEncodeSettings) {
        this.mVEAudioEncodeSettings = vEAudioEncodeSettings;
    }

    private g(String str) {
    }

    @Override // com.ss.android.vesdk.audio.h
    public final void onReceive(j jVar) {
        e eVar = this.mPresenter;
        if (eVar == null) {
            an.d("AudioCaptureHolder", "onReceiver error: please set buffer consumer, before init AudioCapture");
        } else if (!this.mFeedPcm) {
            an.a("AudioCaptureHolder", "pcm feed stop");
        } else {
            eVar.a(((j.a) jVar.f150986a).f150989a, jVar.f150987b, jVar.f150988c);
        }
    }

    @Override // com.ss.android.vesdk.audio.h
    public final void onError(int i2, int i3, String str) {
        an.a("AudioCaptureHolder", "errType" + i2 + "ret:" + i3 + "msg:" + str);
    }

    @Override // com.ss.android.vesdk.audio.h
    public final void onInfo(int i2, int i3, double d2, Object obj) {
        if (i2 == aj.M) {
            if (i3 == 0) {
                m mVar = (m) obj;
                if (this.mVEAudioEncodeSettings == null) {
                    an.d("AudioCaptureHolder", "please set VEAudioEncodeSettings, before init AudioCapture");
                    return;
                }
                e eVar = this.mPresenter;
                if (eVar == null) {
                    an.d("AudioCaptureHolder", "please set buffer consumer, before init AudioCapture");
                    return;
                } else {
                    eVar.initAudioConfig(mVar.f151352b, mVar.f151351a, this.mVEAudioEncodeSettings.f150678c, this.mVEAudioEncodeSettings.f150680e, this.mVEAudioEncodeSettings.f150679d);
                    an.a("AudioCaptureHolder", "mVEAudioCapture inited: channelCount:" + mVar.f151351a + " sampleHz:" + mVar.f151352b + " encode sample rate:" + this.mVEAudioEncodeSettings.f150678c + " encode channel count:" + this.mVEAudioEncodeSettings.f150680e);
                }
            } else {
                an.a("AudioCaptureHolder", "initAudio error:".concat(String.valueOf(i3)));
            }
            if (i2 == aj.N) {
                this.mFeedPcm = true;
            }
        }
    }
}
