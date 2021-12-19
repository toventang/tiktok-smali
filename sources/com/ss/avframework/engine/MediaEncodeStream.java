package com.ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.avframework.statics.StaticsReport;
import com.ss.avframework.utils.TEBundle;
import java.util.ArrayList;
import java.util.Iterator;

public class MediaEncodeStream extends MediaEditorStream implements StaticsReport.StaticReportInterface {
    private InternalObserver mInternalObserver;
    private long mNativeObj;
    private ArrayList<MediaTrack> mTracks = new ArrayList<>();
    private Transport mTransport;
    private VsyncModule mVsyncModule = new VsyncModule(nativeGetVsyncModule(this.mNativeObj));

    public interface Observer {
        static {
            Covode.recordClassIndex(99818);
        }

        void onMediaEncodeStreamEvent(int i2, int i3, long j2, String str);
    }

    static {
        Covode.recordClassIndex(99816);
    }

    private native void nativeAddTrack(long j2, MediaTrack mediaTrack);

    private native TEBundle nativeGetParameter(long j2);

    private native boolean nativeGetStaticsReport(long j2, StaticsReport staticsReport);

    private native void nativeRegisterObserver(long j2, Object obj);

    private native void nativeRelease(long j2);

    private native void nativeRemoveTrack(long j2, MediaTrack mediaTrack);

    private native void nativeRequestIDRFrame(long j2);

    private native void nativeSetEstimateTimeInterval(long j2, int i2);

    private native void nativeSetIsAddCropInfo(long j2, boolean z);

    private native void nativeSetParameter(long j2, TEBundle tEBundle);

    private native void nativeSetSITICaculator(long j2, SITICalculator sITICalculator);

    private native void nativeSetVideoEncoderFactory(long j2, VideoEncoderFactory videoEncoderFactory);

    private native void nativeStart(long j2);

    private native void nativeStartRecord(long j2, String str);

    private native void nativeStop(long j2);

    private native void nativeStopRecord(long j2);

    private static native long nativeToEditorStream(long j2);

    private native void nativeUnRegisterObserver(long j2, Object obj);

    /* access modifiers changed from: protected */
    public native long nativeGetVsyncModule(long j2);

    public VsyncModule getVsyncModule() {
        return this.mVsyncModule;
    }

    public TEBundle getParameter() {
        MethodCollector.i(14631);
        TEBundle nativeGetParameter = nativeGetParameter(this.mNativeObj);
        MethodCollector.o(14631);
        return nativeGetParameter;
    }

    public void requestIDRFrame() {
        MethodCollector.i(14632);
        nativeRequestIDRFrame(this.mNativeObj);
        MethodCollector.o(14632);
    }

    public void start() {
        MethodCollector.i(14619);
        nativeStart(this.mNativeObj);
        MethodCollector.o(14619);
    }

    public void stop() {
        MethodCollector.i(14624);
        nativeStop(this.mNativeObj);
        MethodCollector.o(14624);
    }

    public void stopRecord() {
        MethodCollector.i(14626);
        nativeStopRecord(this.mNativeObj);
        MethodCollector.o(14626);
    }

    @Override // com.ss.avframework.engine.MediaEditorStream
    public synchronized void release() {
        MethodCollector.i(14615);
        if (this.mNativeObj == 0) {
            MethodCollector.o(14615);
            return;
        }
        stop();
        Iterator<MediaTrack> it = this.mTracks.iterator();
        while (it.hasNext()) {
            MediaTrack next = it.next();
            nativeRemoveTrack(this.mNativeObj, next);
            next.release();
            it.remove();
        }
        nativeSetVideoEncoderFactory(this.mNativeObj, null);
        if (this.mTransport != null) {
            this.mTransport = null;
        }
        VsyncModule vsyncModule = this.mVsyncModule;
        if (vsyncModule != null) {
            vsyncModule.release();
            this.mVsyncModule = null;
        }
        nativeUnRegisterObserver(this.mNativeObj, this.mInternalObserver);
        this.mInternalObserver.release();
        this.mInternalObserver = null;
        super.release();
        nativeRelease(this.mNativeObj);
        this.mNativeObj = 0;
        MethodCollector.o(14615);
    }

    /* access modifiers changed from: package-private */
    public class InternalObserver extends NativeObject implements Observer {
        private Observer mObserver;

        static {
            Covode.recordClassIndex(99817);
        }

        public void onChanged() {
        }

        public void registerObserver(Observer observer) {
            this.mObserver = observer;
        }

        public InternalObserver() {
        }

        @Override // com.ss.avframework.engine.MediaEncodeStream.Observer
        public void onMediaEncodeStreamEvent(int i2, int i3, long j2, String str) {
            Observer observer = this.mObserver;
            if (observer != null) {
                observer.onMediaEncodeStreamEvent(i2, i3, j2, str);
            }
        }
    }

    public boolean containTrack(MediaTrack mediaTrack) {
        return this.mTracks.contains(mediaTrack);
    }

    public void registerObserver(Observer observer) {
        this.mInternalObserver.registerObserver(observer);
    }

    @Override // com.ss.avframework.statics.StaticsReport.StaticReportInterface
    public boolean getStaticsReport(StaticsReport staticsReport) {
        MethodCollector.i(14629);
        boolean nativeGetStaticsReport = nativeGetStaticsReport(this.mNativeObj, staticsReport);
        MethodCollector.o(14629);
        return nativeGetStaticsReport;
    }

    public void setEstimateTimeInterval(int i2) {
        MethodCollector.i(14628);
        nativeSetEstimateTimeInterval(this.mNativeObj, i2);
        MethodCollector.o(14628);
    }

    public void setIsAddCropInfo(boolean z) {
        MethodCollector.i(14617);
        nativeSetIsAddCropInfo(this.mNativeObj, z);
        MethodCollector.o(14617);
    }

    public void setParameter(TEBundle tEBundle) {
        MethodCollector.i(14627);
        nativeSetParameter(this.mNativeObj, tEBundle);
        MethodCollector.o(14627);
    }

    public void setSITICaculator(SITICalculator sITICalculator) {
        MethodCollector.i(14630);
        nativeSetSITICaculator(this.mNativeObj, sITICalculator);
        MethodCollector.o(14630);
    }

    public void startRecord(String str) {
        MethodCollector.i(14625);
        nativeStartRecord(this.mNativeObj, str);
        MethodCollector.o(14625);
    }

    public void addTrack(MediaTrack mediaTrack) {
        MethodCollector.i(14616);
        nativeAddTrack(this.mNativeObj, mediaTrack);
        this.mTracks.add(mediaTrack);
        MethodCollector.o(14616);
    }

    public void removeTrack(MediaTrack mediaTrack) {
        MethodCollector.i(14618);
        if (this.mTracks.remove(mediaTrack)) {
            nativeRemoveTrack(this.mNativeObj, mediaTrack);
        }
        MethodCollector.o(14618);
    }

    public MediaEncodeStream(long j2, Transport transport) {
        super(nativeToEditorStream(j2));
        MethodCollector.i(14611);
        this.mNativeObj = j2;
        this.mTransport = transport;
        InternalObserver internalObserver = new InternalObserver();
        this.mInternalObserver = internalObserver;
        nativeRegisterObserver(this.mNativeObj, internalObserver);
        MethodCollector.o(14611);
    }
}
