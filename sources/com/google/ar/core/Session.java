package com.google.ar.core;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.librarian.Librarian;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.ar.core.Config;
import com.google.ar.core.exceptions.FatalException;
import com.ss.android.ugc.aweme.lancet.m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Session {
    final ac faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    static {
        Covode.recordClassIndex(33041);
    }

    private native long[] nativeAcquireAllAnchors(long j2);

    private native int nativeCheckModuleAvailability(long j2, int i2);

    private native void nativeCloseSession(long j2);

    private native void nativeConfigure(long j2, long j3);

    private native long nativeCreateAnchor(long j2, Pose pose);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    static native long nativeCreateSessionWrapperFromHandle(long j2, long j3);

    private native int nativeEstimateFeatureMapQualityForHosting(long j2, Pose pose);

    private native long nativeGetCameraConfig(long j2);

    private native void nativeGetConfig(long j2, long j3);

    private native int nativeGetPlaybackStatus(long j2);

    private native void nativeGetRandomAccessStats(long j2, long j3);

    private native int nativeGetRecordingStatus(long j2);

    private native long[] nativeGetSupportedCameraConfigs(long j2);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j2, long j3);

    private native long nativeGetSymbolTable(long j2);

    private native long nativeHostCloudAnchor(long j2, long j3);

    private native long nativeHostCloudAnchorWithTtl(long j2, long j3, int i2);

    private native boolean nativeIsSupported(long j2, long j3);

    private native void nativePause(long j2);

    private native void nativeRecordExternalDataTrackSample(long j2, byte[] bArr, byte[] bArr2);

    private native void nativeRequestModuleInstallDeferred(long j2, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j2, int[] iArr);

    private native long nativeResolveCloudAnchor(long j2, String str);

    private native void nativeResume(long j2);

    private native int nativeSetCameraConfig(long j2, long j3);

    private native void nativeSetCameraTextureName(long j2, int i2);

    private native void nativeSetCameraTextureNames(long j2, int[] iArr);

    private native void nativeSetDisplayGeometry(long j2, int i2, int i3, int i4);

    private native void nativeSetPlaybackDataset(long j2, String str);

    private native void nativeStartRecording(long j2, long j3);

    private native void nativeStopRecording(long j2);

    private native void nativeUpdate(long j2, long j3);

    /* access modifiers changed from: package-private */
    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    /* access modifiers changed from: package-private */
    public native long[] nativeAcquireAllTrackables(long j2, int i2);

    /* access modifiers changed from: package-private */
    public native void nativeDestroySessionWrapper(long j2);

    /* access modifiers changed from: package-private */
    public native long nativeGetSessionNativeHandle(long j2);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsDepthModeSupported(long j2, int i2);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsDepthModeSupportedPrivate(long j2, int i2);

    /* access modifiers changed from: package-private */
    public native long nativeReleaseSessionOwnership(long j2);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            sharedCamera2.pause();
        }
    }

    public void close() {
        MethodCollector.i(12998);
        nativeCloseSession(this.nativeWrapperHandle);
        MethodCollector.o(12998);
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            return sharedCamera2;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    public void resume() {
        MethodCollector.i(13329);
        nativeResume(this.nativeWrapperHandle);
        MethodCollector.o(13329);
    }

    public void stopRecording() {
        MethodCollector.i(14107);
        nativeStopRecording(this.nativeWrapperHandle);
        MethodCollector.o(14107);
    }

    protected Session() {
        this.faceCache = new ac();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    static void loadDynamicSymbolsAfterSessionCreate() {
        MethodCollector.i(14016);
        if (Build.VERSION.SDK_INT >= 24) {
            ArImage.nativeLoadSymbols();
            ImageMetadata.nativeLoadSymbols();
            MethodCollector.o(14016);
            return;
        }
        MethodCollector.o(14016);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.i(12997);
        long j2 = this.nativeWrapperHandle;
        if (j2 != 0) {
            nativeDestroySessionWrapper(j2);
            this.nativeWrapperHandle = 0;
        }
        super.finalize();
        MethodCollector.o(12997);
    }

    public Collection<Anchor> getAllAnchors() {
        MethodCollector.i(13500);
        Collection<Anchor> convertNativeAnchorsToCollection = convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
        MethodCollector.o(13500);
        return convertNativeAnchorsToCollection;
    }

    public CameraConfig getCameraConfig() {
        MethodCollector.i(13911);
        CameraConfig cameraConfig = new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
        MethodCollector.o(13911);
        return cameraConfig;
    }

    public PlaybackStatus getPlaybackStatus() {
        MethodCollector.i(14104);
        PlaybackStatus forNumber = PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
        MethodCollector.o(14104);
        return forNumber;
    }

    public RecordingStatus getRecordingStatus() {
        MethodCollector.i(14108);
        RecordingStatus forNumber = RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
        MethodCollector.o(14108);
        return forNumber;
    }

    public List<CameraConfig> getSupportedCameraConfigs() {
        MethodCollector.i(13758);
        List<CameraConfig> convertNativeCameraConfigsToCollection = convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
        MethodCollector.o(13758);
        return convertNativeCameraConfigsToCollection;
    }

    public void pause() {
        MethodCollector.i(13405);
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
        MethodCollector.o(13405);
    }

    public Frame update() {
        MethodCollector.i(13330);
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        MethodCollector.o(13330);
        return frame;
    }

    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33043);
        }

        static FeatureMapQuality forNumber(int i2) {
            FeatureMapQuality[] values = values();
            for (FeatureMapQuality featureMapQuality : values) {
                if (featureMapQuality.nativeCode == i2) {
                    return featureMapQuality;
                }
            }
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected value for native FeatureMapQuality, value=");
            sb.append(i2);
            throw new FatalException(sb.toString());
        }

        private FeatureMapQuality(int i2) {
            this.nativeCode = i2;
        }
    }

    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000),
        DO_NOT_USE_ACTIVE_DEPTH_SENSOR(5),
        MOTION_TRACKING_ODOMETRY(6),
        HIT_TEST_WITH_DEPTH(7);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(33042);
        }

        private Feature(int i2) {
            this.nativeCode = i2;
        }
    }

    static void throwExceptionFromArStatus(int i2) {
        throwExceptionFromArStatus(null, i2, null, null);
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public static void com_google_ar_core_Session_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.a(str, false, (Context) null);
        m.a(uptimeMillis, str);
    }

    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    public void configure(Config config) {
        MethodCollector.i(13089);
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
        MethodCollector.o(13089);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        MethodCollector.i(13864);
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
        MethodCollector.o(13864);
    }

    public void setCameraTextureName(int i2) {
        MethodCollector.i(13407);
        nativeSetCameraTextureName(this.nativeWrapperHandle, i2);
        MethodCollector.o(13407);
    }

    public void setPlaybackDataset(String str) {
        MethodCollector.i(14068);
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
        MethodCollector.o(14068);
    }

    static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        }
        return byteBuffer.order(ByteOrder.nativeOrder());
    }

    public ModuleAvailability checkModuleAvailability(Module module) {
        MethodCollector.i(13091);
        ModuleAvailability forNumber = ModuleAvailability.forNumber(nativeCheckModuleAvailability(this.nativeWrapperHandle, module.nativeCode));
        MethodCollector.o(13091);
        return forNumber;
    }

    /* access modifiers changed from: package-private */
    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j2 : jArr) {
            arrayList.add(new Anchor(j2, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j2 : jArr) {
            arrayList.add(new CameraConfig(this, j2));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        MethodCollector.i(13567);
        Anchor anchor = new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
        MethodCollector.o(13567);
        return anchor;
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        MethodCollector.i(13633);
        FeatureMapQuality forNumber = FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
        MethodCollector.o(13633);
        return forNumber;
    }

    public void getConfig(Config config) {
        MethodCollector.i(13090);
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
        MethodCollector.o(13090);
    }

    public Anchor hostCloudAnchor(Anchor anchor) {
        MethodCollector.i(13696);
        Anchor anchor2 = new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
        MethodCollector.o(13696);
        return anchor2;
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        MethodCollector.i(13968);
        boolean nativeIsDepthModeSupported = nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
        MethodCollector.o(13968);
        return nativeIsDepthModeSupported;
    }

    public boolean isDepthModeSupportedPrivate(Config.DepthMode depthMode) {
        MethodCollector.i(13969);
        boolean nativeIsDepthModeSupportedPrivate = nativeIsDepthModeSupportedPrivate(this.nativeWrapperHandle, depthMode.nativeCode);
        MethodCollector.o(13969);
        return nativeIsDepthModeSupportedPrivate;
    }

    public boolean isSupported(Config config) {
        MethodCollector.i(13499);
        boolean nativeIsSupported = nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
        MethodCollector.o(13499);
        return nativeIsSupported;
    }

    public Anchor resolveCloudAnchor(String str) {
        MethodCollector.i(13756);
        Anchor anchor = new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
        MethodCollector.o(13756);
        return anchor;
    }

    public void setCameraTextureNames(int[] iArr) {
        MethodCollector.i(13406);
        if (iArr == null || iArr.length == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
            MethodCollector.o(13406);
            throw illegalArgumentException;
        }
        nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
        MethodCollector.o(13406);
    }

    public void startRecording(RecordingConfig recordingConfig) {
        MethodCollector.i(14106);
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            MethodCollector.o(14106);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        MethodCollector.o(14106);
        throw illegalArgumentException;
    }

    Session(long j2) {
        MethodCollector.i(12896);
        this.faceCache = new ac();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j2;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j2);
        MethodCollector.o(12896);
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        MethodCollector.i(13566);
        h a2 = h.a(cls);
        if (a2 == h.UNKNOWN_TO_JAVA) {
            List emptyList = Collections.emptyList();
            MethodCollector.o(13566);
            return emptyList;
        }
        Collection<T> convertNativeTrackablesToCollection = convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a2.f53461i));
        MethodCollector.o(13566);
        return convertNativeTrackablesToCollection;
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        MethodCollector.i(13808);
        if (cameraConfigFilter != null) {
            long[] nativeGetSupportedCameraConfigsWithFilter = nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle);
            int length = nativeGetSupportedCameraConfigsWithFilter.length;
            ArrayList arrayList = new ArrayList(length);
            for (long j2 : nativeGetSupportedCameraConfigsWithFilter) {
                arrayList.add(new CameraConfig(this, j2));
            }
            List<CameraConfig> unmodifiableList = Collections.unmodifiableList(arrayList);
            MethodCollector.o(13808);
            return unmodifiableList;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        MethodCollector.o(13808);
        throw illegalArgumentException;
    }

    public void requestModuleInstallDeferred(List<Module> list) {
        MethodCollector.i(13254);
        int[] iArr = new int[list.size()];
        int i2 = 0;
        for (Module module : list) {
            iArr[i2] = module.nativeCode;
            i2++;
        }
        nativeRequestModuleInstallDeferred(this.nativeWrapperHandle, iArr);
        MethodCollector.o(13254);
    }

    public void requestModuleInstallImmediate(List<Module> list) {
        MethodCollector.i(13178);
        int[] iArr = new int[list.size()];
        int i2 = 0;
        for (Module module : list) {
            iArr[i2] = module.nativeCode;
            i2++;
        }
        nativeRequestModuleInstallImmediate(this.nativeWrapperHandle, iArr);
        MethodCollector.o(13178);
    }

    /* access modifiers changed from: package-private */
    public Trackable createTrackable(long j2) {
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j2);
        h[] values = h.values();
        for (h hVar : values) {
            if (hVar.f53461i == internalGetType) {
                switch (hVar.ordinal()) {
                    case 0:
                    case 1:
                        return null;
                    case 2:
                        return new Plane(j2, this);
                    case 3:
                        return new Point(j2, this);
                    case 4:
                        return new AugmentedImage(j2, this);
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        return this.faceCache.a(j2, this);
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        return new DepthPoint(j2, this);
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        return new InstantPlacementPoint(j2, this);
                    default:
                        throw null;
                }
            }
        }
        TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j2);
        return null;
    }

    /* access modifiers changed from: package-private */
    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        int length = jArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (long j2 : jArr) {
            Trackable createTrackable = createTrackable(j2);
            if (createTrackable != null) {
                arrayList.add(cls.cast(createTrackable));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i2) {
        MethodCollector.i(13697);
        Anchor anchor2 = new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i2), this);
        MethodCollector.o(13697);
        return anchor2;
    }

    public Session(Context context, Set<Feature> set) {
        MethodCollector.i(12791);
        this.faceCache = new ac();
        this.sharedCamera = null;
        com_google_ar_core_Session_com_ss_android_ugc_aweme_lancet_LoadSoLancet_loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[(set.size() + 1)];
        int i2 = 0;
        for (Feature feature : set) {
            iArr[i2] = feature.nativeCode;
            i2++;
        }
        iArr[i2] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
        MethodCollector.o(12791);
    }

    public void recordExternalDataTrackSample(UUID uuid, ByteBuffer byteBuffer) {
        MethodCollector.i(14140);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            nativeRecordExternalDataTrackSample(this.nativeWrapperHandle, wrap.array(), bArr);
            MethodCollector.o(14140);
            return;
        }
        nativeRecordExternalDataTrackSample(this.nativeWrapperHandle, wrap.array(), byteBuffer.array());
        MethodCollector.o(14140);
    }

    public void setDisplayGeometry(int i2, int i3, int i4) {
        MethodCollector.i(13408);
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i2, i3, i4);
        MethodCollector.o(13408);
    }

    static void throwExceptionFromArStatus(String str, int i2, String[] strArr, int[] iArr) {
        int i3;
        g[] values = g.values();
        for (g gVar : values) {
            if (gVar.G == i2) {
                Class<? extends Exception> cls = gVar.H;
                if (cls != null) {
                    if (strArr == null || iArr == null || (i3 = strArr.length) != iArr.length) {
                        i3 = 0;
                    }
                    String str2 = gVar.I;
                    if (str2 == null) {
                        if (str == null) {
                            throw ((Throwable) cls.getConstructor(new Class[0]).newInstance(new Object[0]));
                        }
                    } else if (str == null) {
                        str = str2;
                    } else {
                        String valueOf = String.valueOf(str2);
                        String valueOf2 = String.valueOf(str);
                        if (valueOf2.length() != 0) {
                            str = valueOf.concat(valueOf2);
                        } else {
                            str = new String(valueOf);
                        }
                    }
                    Exception exc = (Exception) gVar.H.getConstructor(String.class).newInstance(str);
                    StackTraceElement[] stackTrace = exc.getStackTrace();
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[(stackTrace.length + i3)];
                    int i4 = 0;
                    while (i4 < i3) {
                        stackTraceElementArr[i4] = new StackTraceElement("ARCore", "native", strArr[i4], iArr[i4]);
                        i4++;
                    }
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        stackTraceElementArr[i4] = stackTraceElement;
                        i4++;
                    }
                    exc.setStackTrace(stackTraceElementArr);
                    throw exc;
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Unexpected error code: ");
        sb.append(i2);
        throw new FatalException(sb.toString());
    }
}
