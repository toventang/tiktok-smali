package com.ss.avframework.livestreamv2.core;

import android.graphics.RectF;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.livestreamv2.core.LayerControl;
import com.ss.avframework.mixer.VideoMixer;

class FrameAnimationGradualRect extends FrameAnimationBase {
    private RectF mScaleRatio;

    static {
        Covode.recordClassIndex(100046);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.avframework.livestreamv2.core.FrameAnimationBase
    public void calculation() {
        super.calculation();
        this.mScaleRatio = new RectF((this.mTargetRect.left - this.mCurrentRect.left) / ((float) this.mTotalFrames), (this.mTargetRect.top - this.mCurrentRect.top) / ((float) this.mTotalFrames), (this.mTargetRect.right - this.mCurrentRect.right) / ((float) this.mTotalFrames), (this.mTargetRect.bottom - this.mCurrentRect.bottom) / ((float) this.mTotalFrames));
        this.mContinue = true;
    }

    @Override // com.ss.avframework.livestreamv2.core.FrameAnimationBase
    public void update(VideoFrame videoFrame) {
        super.update(videoFrame);
        if (valid()) {
            this.mCurrentRect.left += this.mScaleRatio.left;
            this.mCurrentRect.top += this.mScaleRatio.top;
            this.mCurrentRect.right += this.mScaleRatio.right;
            this.mCurrentRect.bottom += this.mScaleRatio.bottom;
            if (this.mCurrentRect.left < 0.0f) {
                this.mCurrentRect.left = 0.0f;
            }
            if (this.mCurrentRect.right > 1.0f) {
                this.mCurrentRect.right = 1.0f;
            }
            if (this.mCurrentRect.top < 0.0f) {
                this.mCurrentRect.top = 0.0f;
            }
            if (this.mCurrentRect.bottom > 1.0f) {
                this.mCurrentRect.bottom = 1.0f;
            }
            VideoMixer.VideoMixerDescription videoMixerDescription = new VideoMixer.VideoMixerDescription();
            videoMixerDescription.copy(this.mCurrentDescription);
            videoMixerDescription.left = this.mCurrentRect.left;
            videoMixerDescription.top = this.mCurrentRect.top;
            videoMixerDescription.right = this.mCurrentRect.right;
            videoMixerDescription.bottom = this.mCurrentRect.bottom;
            updateDescription(videoMixerDescription);
        }
    }

    public FrameAnimationGradualRect(int i2, LayerControl.Layer layer, long j2, RectF rectF, int i3) {
        super(i2, layer, j2, rectF, i3);
    }
}
