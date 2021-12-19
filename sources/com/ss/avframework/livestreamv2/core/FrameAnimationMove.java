package com.ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.livestreamv2.core.LayerControl;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.utils.AVLog;

class FrameAnimationMove extends FrameAnimationBase {
    protected float mDeltaXPerFrame;
    protected float mDeltaYPerFrame;

    static {
        Covode.recordClassIndex(100047);
    }

    /* access modifiers changed from: protected */
    public void updateRect(RectF rectF) {
    }

    @Override // com.ss.avframework.livestreamv2.core.FrameAnimationBase
    public void restore() {
        VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
        videoMixerDescription.copy(this.mCurrentDescription);
        videoMixerDescription.left = this.mTargetRect.left;
        videoMixerDescription.top = this.mTargetRect.top;
        videoMixerDescription.right = this.mTargetRect.right;
        videoMixerDescription.bottom = this.mTargetRect.bottom;
        updateDescription(videoMixerDescription);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.livestreamv2.core.FrameAnimationBase
    public void calculation() {
        float centerX = this.mTargetRect.centerX() - this.mCurrentRect.centerX();
        float centerY = this.mTargetRect.centerY() - this.mCurrentRect.centerY();
        if (!((centerX == 0.0f && centerY == 0.0f) || this.mTotalFrames == 0)) {
            this.mDeltaXPerFrame = centerX / ((float) this.mTotalFrames);
            this.mDeltaYPerFrame = centerY / ((float) this.mTotalFrames);
            this.mContinue = true;
        }
        AVLog.ioi("FrameAnimationMove", "mDeltaXPerFrame " + this.mDeltaXPerFrame + " mDeltaYPerFrame " + this.mDeltaYPerFrame + " deltaX " + centerX + " deltaY " + centerY + " fps " + this.mFps + " totalFrames " + this.mTotalFrames + " continue " + this.mContinue);
    }

    @Override // com.ss.avframework.livestreamv2.core.FrameAnimationBase
    public void update(VideoMixer.VideoMixerTexture videoMixerTexture) {
        update((VideoFrame) null);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.livestreamv2.core.FrameAnimationBase
    public void updateDescription(VideoMixer.VideoMixerDescription videoMixerDescription) {
        videoMixerDescription.setMode(2);
        AVLog.w("FrameAnimationMove", this.mCurrentRect.toShortString());
        this.mLayer.updateDescription(videoMixerDescription);
    }

    @Override // com.ss.avframework.livestreamv2.core.FrameAnimationBase
    public void update(VideoFrame videoFrame) {
        this.mCurrentAnimationFrameIndex++;
        if (valid()) {
            this.mCurrentRect.offset(this.mDeltaXPerFrame, this.mDeltaYPerFrame);
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            updateRect(this.mCurrentRect);
            videoMixerDescription.copy(this.mCurrentDescription);
            videoMixerDescription.left = this.mCurrentRect.left;
            videoMixerDescription.top = this.mCurrentRect.top;
            videoMixerDescription.right = this.mCurrentRect.right;
            videoMixerDescription.bottom = this.mCurrentRect.bottom;
            updateDescription(videoMixerDescription);
        }
        if (this.mCurrentAnimationFrameIndex >= this.mTotalFrames) {
            this.mContinue = false;
        }
    }

    public FrameAnimationMove(int i2, LayerControl.Layer layer, long j2, RectF rectF, int i3) {
        super(i2, layer, j2, rectF, i3);
    }
}
