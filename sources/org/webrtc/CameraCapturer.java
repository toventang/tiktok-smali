package org.webrtc;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.realx.base.RXLogging;
import java.util.Arrays;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraSession;
import org.webrtc.CameraVideoCapturer;
import org.webrtc.NativeLibrary;

abstract class CameraCapturer implements CameraVideoCapturer {
    public Context applicationContext;
    public final CameraEnumerator cameraEnumerator;
    public String cameraName;
    public final CameraSession.Events cameraSessionEventsHandler = new CameraSession.Events() {
        /* class org.webrtc.CameraCapturer.AnonymousClass2 */

        static {
            Covode.recordClassIndex(106525);
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraOpening() {
            MethodCollector.i(12165);
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (CameraCapturer.this.currentSession != null) {
                        RXLogging.e("CameraCapturer", "onCameraOpening while session was open.");
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraOpening(CameraCapturer.this.cameraName);
                    MethodCollector.o(12165);
                } finally {
                    MethodCollector.o(12165);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraClosed(CameraSession cameraSession) {
            MethodCollector.i(12577);
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession == CameraCapturer.this.currentSession || CameraCapturer.this.currentSession == null) {
                        CameraCapturer.this.eventsHandler.onCameraClosed();
                        MethodCollector.o(12577);
                        return;
                    }
                    RXLogging.e("CameraCapturer", "onCameraClosed from another session.");
                } finally {
                    MethodCollector.o(12577);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraDisconnected(CameraSession cameraSession) {
            MethodCollector.i(12444);
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        RXLogging.e("CameraCapturer", "onCameraDisconnected from another session.");
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraDisconnected();
                    CameraCapturer.this.stopCapture();
                    MethodCollector.o(12444);
                } finally {
                    MethodCollector.o(12444);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraError(CameraSession cameraSession, String str) {
            MethodCollector.i(12306);
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        RXLogging.e("CameraCapturer", "onCameraError from another session: ".concat(String.valueOf(str)));
                        return;
                    }
                    CameraCapturer.this.eventsHandler.onCameraError(str);
                    CameraCapturer.this.stopCapture();
                    MethodCollector.o(12306);
                } finally {
                    MethodCollector.o(12306);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onFrameCaptured(CameraSession cameraSession, VideoFrame videoFrame) {
            MethodCollector.i(12685);
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    if (cameraSession != CameraCapturer.this.currentSession) {
                        Logging.e("CameraCapturer", "onFrameCaptured from another session.");
                        return;
                    }
                    if (!CameraCapturer.this.firstFrameObserved) {
                        CameraCapturer.this.eventsHandler.onFirstFrameAvailable();
                        CameraCapturer.this.firstFrameObserved = true;
                    }
                    CameraCapturer.this.cameraStatistics.addFrame();
                    CameraCapturer.this.capturerObserver.onFrameCaptured(videoFrame);
                    MethodCollector.o(12685);
                } finally {
                    MethodCollector.o(12685);
                }
            }
        }

        @Override // org.webrtc.CameraSession.Events
        public void onCameraConfig(int i2, int i3, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
            MethodCollector.i(12686);
            CameraCapturer.this.checkIsOnCameraThread();
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.eventsHandler.onCameraConfig(i2, i3, framerateRange);
                } finally {
                    MethodCollector.o(12686);
                }
            }
        }
    };
    public CameraVideoCapturer.CameraStatistics cameraStatistics;
    private Handler cameraThreadHandler;
    public CapturerObserver capturerObserver;
    public final CameraSession.CreateSessionCallback createSessionCallback = new CameraSession.CreateSessionCallback() {
        /* class org.webrtc.CameraCapturer.AnonymousClass1 */

        static {
            Covode.recordClassIndex(106524);
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onDone(CameraSession cameraSession) {
            MethodCollector.i(12921);
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    RXLogging.w("CameraCapturer", "Create session done. Switch state: " + CameraCapturer.this.switchState);
                    if (cameraSession != null) {
                        cameraSession.setOrientationMode(CameraCapturer.this.mOrientationMode);
                    }
                    CameraCapturer.this.capturerObserver.onCapturerStarted(true);
                    CameraCapturer.this.sessionOpening = false;
                    CameraCapturer.this.currentSession = cameraSession;
                    CameraCapturer.this.cameraStatistics = new CameraVideoCapturer.CameraStatistics(CameraCapturer.this.surfaceHelper, CameraCapturer.this.eventsHandler);
                    CameraCapturer.this.firstFrameObserved = false;
                    CameraCapturer.this.stateLock.notifyAll();
                    if (CameraCapturer.this.switchState == SwitchState.IN_PROGRESS) {
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        if (CameraCapturer.this.switchEventsHandler != null) {
                            CameraCapturer.this.switchEventsHandler.onCameraSwitchDone(CameraCapturer.this.cameraEnumerator.isFrontFacing(CameraCapturer.this.cameraName));
                            CameraCapturer.this.switchEventsHandler = null;
                        }
                    } else if (CameraCapturer.this.switchState == SwitchState.PENDING) {
                        CameraCapturer.this.switchState = SwitchState.IDLE;
                        CameraCapturer cameraCapturer = CameraCapturer.this;
                        cameraCapturer.switchCameraInternal(cameraCapturer.switchEventsHandler);
                    }
                } finally {
                    MethodCollector.o(12921);
                }
            }
        }

        @Override // org.webrtc.CameraSession.CreateSessionCallback
        public void onFailure(CameraSession.FailureType failureType, String str) {
            MethodCollector.i(13014);
            CameraCapturer.this.checkIsOnCameraThread();
            CameraCapturer.this.uiThreadHandler.removeCallbacks(CameraCapturer.this.openCameraTimeoutRunnable);
            synchronized (CameraCapturer.this.stateLock) {
                try {
                    CameraCapturer.this.capturerObserver.onCapturerStarted(false);
                    CameraCapturer cameraCapturer = CameraCapturer.this;
                    cameraCapturer.openAttemptsRemaining--;
                    if (CameraCapturer.this.openAttemptsRemaining <= 0) {
                        RXLogging.e("CameraCapturer", "Opening camera failed, passing: ".concat(String.valueOf(str)));
                        CameraCapturer.this.sessionOpening = false;
                        CameraCapturer.this.stateLock.notifyAll();
                        if (CameraCapturer.this.switchState != SwitchState.IDLE) {
                            if (CameraCapturer.this.switchEventsHandler != null) {
                                CameraCapturer.this.switchEventsHandler.onCameraSwitchError(str);
                                CameraCapturer.this.switchEventsHandler = null;
                            }
                            CameraCapturer.this.switchState = SwitchState.IDLE;
                        }
                        if (failureType == CameraSession.FailureType.DISCONNECTED) {
                            CameraCapturer.this.eventsHandler.onCameraDisconnected();
                        } else {
                            CameraCapturer.this.eventsHandler.onCameraError(str);
                        }
                    } else {
                        RXLogging.e("CameraCapturer", "Opening camera failed, retry: ".concat(String.valueOf(str)));
                        CameraCapturer.this.createSessionInternal(500);
                    }
                } finally {
                    MethodCollector.o(13014);
                }
            }
        }
    };
    public CameraSession currentSession;
    public final CameraVideoCapturer.CameraEventsHandler eventsHandler;
    public boolean firstFrameObserved;
    public int framerate;
    public int height;
    public CameraVideoCapturer.ORIENTATION_MODE mOrientationMode = CameraVideoCapturer.ORIENTATION_MODE.ORIENTATION_MODE_ADAPTIVE;
    private NativeLibraryLoader nativeLibraryLoader = new NativeLibrary.DefaultLoader();
    private String nativeLibraryName = "bytertc";
    public int openAttemptsRemaining;
    public final Runnable openCameraTimeoutRunnable = new Runnable() {
        /* class org.webrtc.CameraCapturer.AnonymousClass3 */

        static {
            Covode.recordClassIndex(106526);
        }

        public void run() {
            CameraCapturer.this.eventsHandler.onCameraError("Camera failed to start within timeout.");
        }
    };
    public boolean sessionOpening;
    public final Object stateLock = new Object();
    public SurfaceTextureHelper surfaceHelper;
    public CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;
    public SwitchState switchState = SwitchState.IDLE;
    public final Handler uiThreadHandler;
    public int width;

    static {
        Covode.recordClassIndex(106523);
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void addMediaRecorderToCamera(MediaRecorder mediaRecorder, CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer$$CC.addMediaRecorderToCamera(this, mediaRecorder, mediaRecorderHandler);
    }

    /* access modifiers changed from: protected */
    public abstract void createCameraSession(CameraSession.CreateSessionCallback createSessionCallback2, CameraSession.Events events, Context context, SurfaceTextureHelper surfaceTextureHelper, String str, int i2, int i3, int i4);

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
        return false;
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void removeMediaRecorderFromCamera(CameraVideoCapturer.MediaRecorderHandler mediaRecorderHandler) {
        CameraVideoCapturer$$CC.removeMediaRecorderFromCamera(this, mediaRecorderHandler);
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
        RXLogging.w("CameraCapturer", "dispose");
        stopCapture();
    }

    /* access modifiers changed from: protected */
    public String getCameraName() {
        String str;
        synchronized (this.stateLock) {
            str = this.cameraName;
        }
        return str;
    }

    public void checkIsOnCameraThread() {
        if (Thread.currentThread() != this.cameraThreadHandler.getLooper().getThread()) {
            RXLogging.e("CameraCapturer", "Check is on camera thread failed.");
            throw new RuntimeException("Not on camera thread.");
        }
    }

    /* access modifiers changed from: package-private */
    public enum SwitchState {
        IDLE,
        PENDING,
        IN_PROGRESS;

        static {
            Covode.recordClassIndex(106532);
        }
    }

    public void printStackTrace() {
        Thread thread;
        Handler handler = this.cameraThreadHandler;
        if (!(handler == null || (thread = handler.getLooper().getThread()) == null)) {
            StackTraceElement[] stackTrace = thread.getStackTrace();
            if (stackTrace.length > 0) {
                RXLogging.w("CameraCapturer", "CameraCapturer stack trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    RXLogging.w("CameraCapturer", stackTraceElement.toString());
                }
            }
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
        RXLogging.w("CameraCapturer", "Stop capture");
        synchronized (this.stateLock) {
            while (this.sessionOpening) {
                RXLogging.w("CameraCapturer", "Stop capture: Waiting for session to open");
                try {
                    this.stateLock.wait();
                } catch (InterruptedException unused) {
                    RXLogging.e("CameraCapturer", "Stop capture interrupted while waiting for the session to open.");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
            if (this.currentSession != null) {
                RXLogging.w("CameraCapturer", "Stop capture: Nulling session");
                this.cameraStatistics.release();
                this.cameraStatistics = null;
                final CameraSession cameraSession = this.currentSession;
                this.cameraThreadHandler.post(new Runnable() {
                    /* class org.webrtc.CameraCapturer.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(106529);
                    }

                    public void run() {
                        cameraSession.stop();
                    }
                });
                this.currentSession = null;
                this.capturerObserver.onCapturerStopped();
            } else {
                RXLogging.w("CameraCapturer", "Stop capture: No session open");
            }
        }
        RXLogging.w("CameraCapturer", "Stop capture done");
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void setOrientationMode(CameraVideoCapturer.ORIENTATION_MODE orientation_mode) {
        this.mOrientationMode = orientation_mode;
    }

    public void createSessionInternal(int i2) {
        this.uiThreadHandler.postDelayed(this.openCameraTimeoutRunnable, (long) (i2 + 10000));
        this.cameraThreadHandler.postDelayed(new Runnable() {
            /* class org.webrtc.CameraCapturer.AnonymousClass5 */

            static {
                Covode.recordClassIndex(106528);
            }

            public void run() {
                MethodCollector.i(11693);
                try {
                    synchronized (CameraCapturer.this.stateLock) {
                        try {
                            CameraCapturer cameraCapturer = CameraCapturer.this;
                            cameraCapturer.createCameraSession(cameraCapturer.createSessionCallback, CameraCapturer.this.cameraSessionEventsHandler, CameraCapturer.this.applicationContext, CameraCapturer.this.surfaceHelper, CameraCapturer.this.cameraName, CameraCapturer.this.width, CameraCapturer.this.height, CameraCapturer.this.framerate);
                        } finally {
                            MethodCollector.o(11693);
                        }
                    }
                } catch (IllegalArgumentException e2) {
                    if (CameraCapturer.this.capturerObserver != null) {
                        CameraCapturer.this.capturerObserver.onCapturerError("Create VideoCapture Session fail : " + e2.getMessage());
                    }
                    MethodCollector.o(11693);
                }
            }
        }, (long) i2);
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(final CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w("CameraCapturer", "switchCamera");
        this.cameraThreadHandler.post(new Runnable() {
            /* class org.webrtc.CameraCapturer.AnonymousClass7 */

            static {
                Covode.recordClassIndex(106530);
            }

            public void run() {
                CameraCapturer.this.switchCameraInternal(cameraSwitchHandler);
            }
        });
    }

    public void switchCameraInternal(CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.w("CameraCapturer", "switchCamera internal");
        String[] deviceNames = this.cameraEnumerator.getDeviceNames();
        if (deviceNames.length >= 2) {
            synchronized (this.stateLock) {
                if (this.switchState != SwitchState.IDLE) {
                    reportCameraSwitchError("Camera switch already in progress.", cameraSwitchHandler);
                    return;
                }
                boolean z = this.sessionOpening;
                if (z || this.currentSession != null) {
                    this.switchEventsHandler = cameraSwitchHandler;
                    if (z) {
                        this.switchState = SwitchState.PENDING;
                        return;
                    }
                    this.switchState = SwitchState.IN_PROGRESS;
                    RXLogging.w("CameraCapturer", "switchCamera: Stopping session");
                    this.cameraStatistics.release();
                    this.cameraStatistics = null;
                    final CameraSession cameraSession = this.currentSession;
                    this.cameraThreadHandler.post(new Runnable() {
                        /* class org.webrtc.CameraCapturer.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(106531);
                        }

                        public void run() {
                            cameraSession.stop();
                        }
                    });
                    this.currentSession = null;
                    this.cameraName = deviceNames[(Arrays.asList(deviceNames).indexOf(this.cameraName) + 1) % deviceNames.length];
                    this.sessionOpening = true;
                    this.openAttemptsRemaining = 1;
                    createSessionInternal(0);
                    RXLogging.w("CameraCapturer", "switchCamera done");
                    return;
                }
                reportCameraSwitchError("switchCamera: camera is not running.", cameraSwitchHandler);
            }
        } else if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError("No camera to switch to.");
        }
    }

    private void reportCameraSwitchError(String str, CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        RXLogging.e("CameraCapturer", str);
        if (cameraSwitchHandler != null) {
            cameraSwitchHandler.onCameraSwitchError(str);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver2) {
        Handler handler;
        this.applicationContext = context;
        this.capturerObserver = capturerObserver2;
        this.surfaceHelper = surfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            handler = null;
        } else {
            handler = surfaceTextureHelper.getHandler();
        }
        this.cameraThreadHandler = handler;
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int i2, int i3, int i4) {
        RXLogging.w("CameraCapturer", "changeCaptureFormat: " + i2 + "x" + i3 + "@" + i4);
        synchronized (this.stateLock) {
            stopCapture();
            startCapture(i2, i3, i4);
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i2, int i3, int i4) {
        RXLogging.w("CameraCapturer", "startCapture: " + i2 + "x" + i3 + "@" + i4);
        if (this.applicationContext != null) {
            synchronized (this.stateLock) {
                if (this.sessionOpening || this.currentSession != null) {
                    RXLogging.w("CameraCapturer", "Session already open");
                    return;
                }
                this.width = i2;
                this.height = i3;
                this.framerate = i4;
                this.sessionOpening = true;
                this.openAttemptsRemaining = 3;
                createSessionInternal(0);
                return;
            }
        }
        throw new RuntimeException("CameraCapturer must be initialized before calling startCapture.");
    }

    public CameraCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraEnumerator cameraEnumerator2) {
        this.eventsHandler = cameraEventsHandler == null ? new CameraVideoCapturer.CameraEventsHandler() {
            /* class org.webrtc.CameraCapturer.AnonymousClass4 */

            static {
                Covode.recordClassIndex(106527);
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraClosed() {
                RXLogging.w("CameraCapturer", "CameraEventsHandler onCameraClosed");
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraDisconnected() {
                RXLogging.e("CameraCapturer", "CameraEventsHandler onCameraDisconnected");
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onFirstFrameAvailable() {
                RXLogging.w("CameraCapturer", "CameraEventsHandler onFirstFrameAvailable");
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraError(String str) {
                RXLogging.e("CameraCapturer", "CameraEventsHandler onCameraError: ".concat(String.valueOf(str)));
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraFreezed(String str) {
                RXLogging.e("CameraCapturer", "CameraEventsHandler onCameraFreezed: ".concat(String.valueOf(str)));
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraOpening(String str) {
                RXLogging.w("CameraCapturer", "CameraEventsHandler onCameraOpening".concat(String.valueOf(str)));
            }

            @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
            public void onCameraConfig(int i2, int i3, CameraEnumerationAndroid.CaptureFormat.FramerateRange framerateRange) {
                RXLogging.w("CameraCapturer", "CameraEventsHandler onCameraClosed");
            }
        } : cameraEventsHandler;
        this.cameraEnumerator = cameraEnumerator2;
        this.cameraName = str;
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        String[] deviceNames = cameraEnumerator2.getDeviceNames();
        if (deviceNames.length == 0) {
            throw new RuntimeException("No cameras attached.");
        } else if (!Arrays.asList(deviceNames).contains(this.cameraName)) {
            throw new IllegalArgumentException("Camera name " + this.cameraName + " does not match any known camera device.");
        }
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int i2, int i3, int i4, int i5) {
        startCapture(i2, i3, i4);
    }
}
