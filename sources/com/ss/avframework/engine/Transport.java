package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.TEBundle;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class Transport extends NativeObject implements StaticsReport.StaticReportInterface {
    private EventObserver mObserver;

    public interface EventObserver {
        static {
            Covode.recordClassIndex(99830);
        }

        void onTransportEvent(int i2, int i3, long j2, String str);
    }

    static {
        Covode.recordClassIndex(99829);
    }

    private static native void nativeEnableVideoFrameStatistics(boolean z);

    private native TEBundle nativeGetParameter();

    private static native void nativeResetSeiMgr();

    private native void nativeSetParameter(TEBundle tEBundle);

    private static native void nativeSetSeiSourceAble(boolean z);

    public int addSeiField(String str, Object obj, int i2) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i2, long j2, boolean z, boolean z2) {
        return 0;
    }

    public int addSeiField(String str, Object obj, int i2, long j2, boolean z, boolean z2, int i3) {
        return 0;
    }

    public void addUserMetaData(String str, String str2, int i2) {
    }

    public String getDnsIP() {
        return null;
    }

    public long getInt64Value(int i2) {
        return 0;
    }

    public String getLocalIP() {
        return null;
    }

    public String getRemoteIP() {
        return null;
    }

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        return false;
    }

    public VsyncModule getVsyncModule() {
        return null;
    }

    public abstract void registerFeedbackObserber(FeedbackObserver feedbackObserver);

    public void sendPacket(MediaPacket mediaPacket) {
    }

    public void sendPacket(Buffer buffer, int i2) {
    }

    public int sendSeiMsg(String str) {
        return 0;
    }

    public void setVysncModule(VsyncModule vsyncModule) {
    }

    public boolean setupUrl(String str) {
        return false;
    }

    public void startTransportInDebug() {
    }

    public void stopTransportInDebug() {
    }

    public abstract void unRegisterFeedbackObserber(FeedbackObserver feedbackObserver);

    public static void ResetSeiMgr() {
        nativeResetSeiMgr();
    }

    public TEBundle getParameter() {
        return nativeGetParameter();
    }

    public static void EnableVideoFrameStatistics(boolean z) {
        nativeEnableVideoFrameStatistics(z);
    }

    public static void SetSeiSourceAble(boolean z) {
        nativeSetSeiSourceAble(z);
    }

    public void setEventObserver(EventObserver eventObserver) {
        this.mObserver = eventObserver;
    }

    public void setParameter(TEBundle tEBundle) {
        nativeSetParameter(tEBundle);
    }

    public abstract class FeedbackObserver {
        static {
            Covode.recordClassIndex(99831);
        }

        /* access modifiers changed from: protected */
        public abstract void onFeedback(String str);

        public FeedbackObserver() {
        }
    }

    /* access modifiers changed from: protected */
    public void onEvent(int i2, int i3, long j2, String str) {
        EventObserver eventObserver = this.mObserver;
        if (eventObserver != null) {
            eventObserver.onTransportEvent(i2, i3, j2, str);
        }
    }

    public static class MediaPacket {
        public ByteBuffer buffer;
        public int flags;
        public boolean isVideo;
        public int offset;
        public long presentationTimeUs;
        public int size;

        static {
            Covode.recordClassIndex(99832);
        }

        public void set(ByteBuffer byteBuffer, boolean z, int i2, int i3, long j2, int i4) {
            this.buffer = byteBuffer;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeUs = j2;
            this.flags = i4;
            this.isVideo = z;
        }
    }
}
