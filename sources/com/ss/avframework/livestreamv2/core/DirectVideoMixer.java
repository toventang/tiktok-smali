package com.ss.avframework.livestreamv2.core;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.buffer.VideoFrame;
import com.ss.avframework.engine.VideoSink;
import com.ss.avframework.livestreamv2.RenderView;
import com.ss.avframework.mixer.VideoMixer;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.utils.AVLog;
import com.ss.avframework.utils.TEBundle;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public class DirectVideoMixer extends VideoMixer {
    private boolean mDirectRender;
    private int mHeight;
    public WeakReference<RenderView> mRenderView;
    private VideoSinkInternal mVideoSinkInternal;
    private int mWidth;

    static {
        Covode.recordClassIndex(100039);
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public boolean isDirectRenderMode() {
        return this.mDirectRender;
    }

    public static class SurfaceViewWithoutCallback extends MixerRenderView {
        SurfaceHolder holder;
        SurfaceView mSurfaceView;

        static {
            Covode.recordClassIndex(100041);
        }

        public void addViewCallback() {
            SurfaceHolder surfaceHolder = this.holder;
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(this);
                AVLog.ioi("SurfaceViewWithoutCallback", "callback is added");
            }
        }

        public void removeViewCallback() {
            SurfaceHolder surfaceHolder = this.holder;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this);
                AVLog.ioi("SurfaceViewWithoutCallback", "callback is removed");
            }
        }

        @Override // com.ss.avframework.opengl.GLRenderVideoSink
        public void initSurfaceView(SurfaceView surfaceView) {
            init();
            AVLog.ioi("SurfaceViewWithoutCallback", "SurfaceViewWithoutCallback is inited");
        }

        public SurfaceViewWithoutCallback(View view, DirectVideoMixer directVideoMixer) {
            super(view, directVideoMixer);
            if (view != null && (view instanceof SurfaceView)) {
                SurfaceView surfaceView = (SurfaceView) view;
                this.mSurfaceView = surfaceView;
                this.holder = surfaceView.getHolder();
            }
        }
    }

    public static class MixerRenderView extends RenderView {
        private Object mFence;
        private boolean mUpdated = false;
        private WeakReference<DirectVideoMixer> mVideoMixer;

        static {
            Covode.recordClassIndex(100040);
        }

        @Override // com.ss.avframework.livestreamv2.RenderView, com.ss.avframework.opengl.GLRenderVideoSink.GLRenderer
        public void onSurfaceCreated() {
            super.onSurfaceCreated();
            AVLog.ioi("MixerRenderView", "surface Create ".concat(String.valueOf(this)));
        }

        @Override // com.ss.avframework.livestreamv2.RenderView, com.ss.avframework.opengl.GLRenderVideoSink.GLRenderer
        public void onSurfaceDestroy() {
            super.onSurfaceDestroy();
            AVLog.ioi("MixerRenderView", "surface Destroy ".concat(String.valueOf(this)));
        }

        @Override // com.ss.avframework.opengl.GLRenderVideoSink, com.ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.i(12817);
            super.release();
            MethodCollector.o(12817);
        }

        public MixerRenderView(View view, DirectVideoMixer directVideoMixer) {
            super(view, true);
            DirectVideoMixer directVideoMixer2;
            MethodCollector.i(12687);
            Object obj = new Object();
            this.mFence = obj;
            synchronized (obj) {
                try {
                    this.mVideoMixer = new WeakReference<>(directVideoMixer);
                    if (!this.mUpdated && this.mWindHeight > 1 && this.mWindWidth > 1 && (directVideoMixer2 = this.mVideoMixer.get()) != null) {
                        directVideoMixer2.updateSize(this.mWindWidth, this.mWindHeight);
                    }
                } finally {
                    MethodCollector.o(12687);
                }
            }
        }

        @Override // com.ss.avframework.livestreamv2.RenderView, com.ss.avframework.opengl.GLRenderVideoSink.GLRenderer
        public void onSurfaceChanged(int i2, int i3) {
            MethodCollector.i(12816);
            synchronized (this.mFence) {
                try {
                    super.onSurfaceChanged(i2, i3);
                    WeakReference<DirectVideoMixer> weakReference = this.mVideoMixer;
                    if (weakReference != null) {
                        this.mUpdated = true;
                        DirectVideoMixer directVideoMixer = weakReference.get();
                        if (directVideoMixer != null) {
                            directVideoMixer.updateSize(i2, i3);
                        }
                        AVLog.ioi("MixerRenderView", "surface Change(" + i2 + "," + i3 + ")" + this);
                        MethodCollector.o(12816);
                    }
                } finally {
                    MethodCollector.o(12816);
                }
            }
        }
    }

    class VideoSinkInternal extends VideoSink {
        static {
            Covode.recordClassIndex(100042);
        }

        @Override // com.ss.avframework.engine.VideoSink
        public void OnDiscardedFrame() {
        }

        @Override // com.ss.avframework.engine.NativeObject
        public synchronized void release() {
            MethodCollector.i(12572);
            super.release();
            MethodCollector.o(12572);
        }

        VideoSinkInternal() {
        }

        @Override // com.ss.avframework.engine.VideoSink
        public void onFrame(VideoFrame videoFrame) {
            RenderView renderView = DirectVideoMixer.this.mRenderView.get();
            if (renderView != null) {
                renderView.onFrame(videoFrame);
            }
        }
    }

    public DirectVideoMixer() {
        VideoSinkInternal videoSinkInternal = new VideoSinkInternal();
        this.mVideoSinkInternal = videoSinkInternal;
        AddVideoSink(videoSinkInternal);
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        this.mWidth = tEBundle.getInt("vmixer_width");
        this.mHeight = tEBundle.getInt("vmixer_height");
        tEBundle.setBool("vmixer_enable_gl_finish", GLThreadManager.isNeedFinish());
        setParameter(tEBundle);
        tEBundle.release();
        enableDirectRender(false);
    }

    @Override // com.ss.avframework.mixer.VideoMixer, com.ss.avframework.engine.NativeObject
    public synchronized void release() {
        MethodCollector.i(13093);
        this.mRenderView = new WeakReference<>(null);
        RemoveVideoSink(this.mVideoSinkInternal);
        this.mVideoSinkInternal.release();
        this.mVideoSinkInternal = null;
        super.release();
        MethodCollector.o(13093);
    }

    public void enableDirectRender(boolean z) {
        this.mDirectRender = z;
        setEnable(!z);
    }

    public void updateView(RenderView renderView) {
        this.mRenderView = new WeakReference<>(renderView);
    }

    public int onDirectFrame(VideoFrame videoFrame) {
        RenderView renderView;
        if (!this.mDirectRender || (renderView = this.mRenderView.get()) == null) {
            return 0;
        }
        renderView.onFrame(videoFrame);
        return 0;
    }

    public int onFrame(int i2, VideoFrame videoFrame) {
        MethodCollector.i(13002);
        synchronized (this) {
            try {
                if (!this.mDirectRender) {
                    return mixFrame(i2, videoFrame);
                }
                MethodCollector.o(13002);
                return -1;
            } finally {
                MethodCollector.o(13002);
            }
        }
    }

    public void updateSize(int i2, int i3) {
        TEBundle tEBundle = new TEBundle();
        getParameter(tEBundle);
        tEBundle.setInt("vmixer_width", i2);
        tEBundle.setInt("vmixer_height", i3);
        setParameter(tEBundle);
        tEBundle.release();
        this.mWidth = i2;
        this.mHeight = i3;
    }

    public int onFrame(int i2, VideoMixer.VideoMixerTexture videoMixerTexture) {
        MethodCollector.i(13001);
        synchronized (this) {
            try {
                if (!this.mDirectRender) {
                    return mixFrame(i2, videoMixerTexture);
                }
                MethodCollector.o(13001);
                return -1;
            } finally {
                MethodCollector.o(13001);
            }
        }
    }
}
