package com.ss.avframework.livestreamv2.core.interact;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.a;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.LiveCore;
import com.ss.avframework.livestreamv2.core.interact.statistic.Statistics;
import com.ss.avframework.livestreamv2.core.interact.video.VideoCallback;
import com.ss.avframework.livestreamv2.core.interact.video.VideoClient;
import com.ss.avframework.livestreamv2.utils.VideoDumpProxy;
import com.ss.avframework.opengl.GLThreadManager;
import com.ss.avframework.utils.AVLog;
import javax.microedition.khronos.egl.EGLContext;
import org.json.JSONObject;

class InteractVideoClient implements LiveCore.ILiveCoreTextureFrameAvailableListener, VideoClient {
    private static int total_1282_number;
    private static int total_1285_number;
    private static int total_frame_number;
    private String TAG;
    private long mLastLogTime;
    private VideoDumpProxy.RawVideoDumperProxy mRawVideoDumper;
    private boolean mStart;
    private Statistics mStatics;
    private VideoCallback mVideoCallback;
    private int occur_1282_number;
    private int occur_1285_number;
    private int push_frame_number;
    private boolean reported1282;
    private boolean reportedGLError;

    static {
        Covode.recordClassIndex(100223);
    }

    private void dump2DTextureFrame(int i2, int i3, int i4, int i5, float[] fArr, String str) {
    }

    private void releaseRawVideoDumper() {
    }

    /* access modifiers changed from: package-private */
    public void setDumpFrameParams(JSONObject jSONObject) {
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void stop() {
        this.mStart = false;
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public Statistics getStatistics() {
        return this.mStatics;
    }

    public InteractVideoClient() {
        this.TAG = "InteractVideoClient";
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void release() {
        this.mVideoCallback = null;
        releaseRawVideoDumper();
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void start() {
        VideoCallback videoCallback = this.mVideoCallback;
        if (videoCallback != null) {
            videoCallback.onVideoWarning("");
        }
        this.mStart = true;
    }

    private void checkRtcEglError() {
        this.push_frame_number++;
        total_frame_number++;
        int glGetError = GLES20.glGetError();
        String str = "";
        int i2 = 0;
        boolean z = false;
        while (glGetError != 0) {
            str = str + ", error code:" + glGetError;
            if (glGetError == 1282) {
                this.occur_1282_number++;
                total_1282_number++;
                z = true;
            } else if (glGetError == 1285) {
                this.occur_1285_number++;
                total_1285_number++;
            }
            glGetError = GLES20.glGetError();
            i2++;
            if (i2 >= 10) {
                break;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            AVLog.ioe("GLUtil", "rtc opengl error:".concat(String.valueOf(str)));
            if (!this.reportedGLError) {
                this.reportedGLError = true;
                AVLog.logKibana(6, this.TAG, "rtc opengl error:".concat(String.valueOf(str)), null);
            } else if (z && !this.reported1282) {
                this.reported1282 = true;
                AVLog.logKibana(6, this.TAG, "rtc opengl error:".concat(String.valueOf(str)), null);
            }
        }
        if (this.push_frame_number % 75 != 0) {
            return;
        }
        if (this.occur_1282_number > 0 || this.occur_1285_number > 0) {
            AVLog.logKibana(6, this.TAG, a.a("RTC OPENGL errors:[current 5s(1285_occurs:%d, 1282_occurs:%d) ,total(1285_occurs:%d, 1282_occurs:%d), total_frames_number:%d]", new Object[]{Integer.valueOf(this.occur_1285_number), Integer.valueOf(this.occur_1282_number), Integer.valueOf(total_1285_number), Integer.valueOf(total_1282_number), Integer.valueOf(total_frame_number)}), null);
            this.occur_1282_number = 0;
            this.occur_1285_number = 0;
        }
    }

    @Override // com.ss.avframework.livestreamv2.core.interact.video.VideoClient
    public void prepare(VideoCallback videoCallback) {
        this.mVideoCallback = videoCallback;
        this.mStart = false;
    }

    public InteractVideoClient(boolean z) {
        this();
        if (z) {
            this.mStatics = new Statistics(1000);
        }
    }

    @Override // com.ss.avframework.livestreamv2.ILiveStream.ITextureFrameAvailableListener
    public void onTextureFrameAvailable(EGLContext eGLContext, int i2, boolean z, int i3, int i4, long j2, float[] fArr, Object... objArr) {
        onTextureFrameAvailable(GLThreadManager.getEGLContext(), i2, z, i3, i4, j2, fArr, objArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextureFrameAvailable(android.opengl.EGLContext r30, int r31, boolean r32, int r33, int r34, long r35, float[] r37, java.lang.Object... r38) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.avframework.livestreamv2.core.interact.InteractVideoClient.onTextureFrameAvailable(android.opengl.EGLContext, int, boolean, int, int, long, float[], java.lang.Object[]):void");
    }
}
