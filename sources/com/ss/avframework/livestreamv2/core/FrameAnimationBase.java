package com.ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.livestreamv2.core.LayerControl;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.utils.AVLog;

public class FrameAnimationBase {
    protected long mAnimationTimeMs;
    protected boolean mContinue;
    protected int mCurrentAnimationFrameIndex;
    protected VideoMixer.VideoMixerDescription mCurrentDescription;
    protected RectF mCurrentRect = new RectF(this.mCurrentDescription.left, this.mCurrentDescription.top, this.mCurrentDescription.right, this.mCurrentDescription.bottom);
    protected int mFps;
    protected LayerControl.Layer mLayer;
    protected RectF mTargetRect;
    protected int mTotalFrames;
    protected int mType;

    static {
        Covode.recordClassIndex(100044);
    }

    public int getType() {
        return this.mType;
    }

    public boolean valid() {
        return this.mContinue;
    }

    /* access modifiers changed from: protected */
    public void calculation() {
        this.mTotalFrames = (int) ((((float) this.mAnimationTimeMs) / 1000.0f) * ((float) this.mFps));
    }

    public void restore() {
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.copy(this.mCurrentDescription);
        videoMixerDescription.left = this.mTargetRect.left;
        videoMixerDescription.top = this.mTargetRect.top;
        videoMixerDescription.right = this.mTargetRect.right;
        videoMixerDescription.bottom = this.mTargetRect.bottom;
        updateDescription(videoMixerDescription);
    }

    public void update(VideoMixer.VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    public void update(VideoFrame videoFrame) {
        int i2 = this.mCurrentAnimationFrameIndex + 1;
        this.mCurrentAnimationFrameIndex = i2;
        if (i2 >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    /* access modifiers changed from: protected */
    public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2).setzOrder(2147483646);
        AVLog.w("FrameAnimationBase", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    public FrameAnimationBase(int i2, LayerControl.Layer layer, long j2, RectF rectF, int i3) {
        this.mType = i2;
        this.mLayer = layer;
        this.mAnimationTimeMs = j2;
        this.mFps = i3;
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        this.mCurrentDescription = videoMixerDescription;
        videoMixerDescription.copy(this.mLayer.getLayerDescription());
        this.mTargetRect = rectF;
        calculation();
    }
}
