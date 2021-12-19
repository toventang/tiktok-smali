package com.ss.avframework.livestreamv2.utils;

import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.LiveStreamBuilder;
import com.ss.avframework.livestreamv2.core.LiveCore;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class VideoDumpProxy {
    public static Class<?> classRawVideoDumper;
    private static Constructor<?> constructorLiveCoreVideoDump;
    private static Constructor<?> constructorLiveStreamVideoDump;
    public static Constructor<?> constructorRawVideoDumper;
    public static String currentVideoSourceName;
    private static int isLiveCoreVideoDumpAvailable = -1;
    private static int isLiveStreamVideoDumpAvailable = -1;
    public static int isRawVideoDumperAvailable = -1;
    public static Method methodCheckFrameCount;
    public static Method methodOnTextureFrame;
    public static Method methodOnYuvFrame;
    public static Method methodRelease;
    public static Method methodUpdateDumpFile;
    public static final List<RawVideoDumperProxy> rawVideoDumperList = new ArrayList();

    /* renamed from: com.ss.avframework.livestreamv2.utils.VideoDumpProxy$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(100500);
        }
    }

    public interface VideoDumpEventListener {
        static {
            Covode.recordClassIndex(100502);
        }

        void onInfo(int i2, Object... objArr);
    }

    static class VideoDumpEventListenerImpl implements VideoDumpEventListener {
        static {
            Covode.recordClassIndex(100503);
        }

        private VideoDumpEventListenerImpl() {
        }

        /* synthetic */ VideoDumpEventListenerImpl(AnonymousClass1 r1) {
            this();
        }

        @Override // com.ss.avframework.livestreamv2.utils.VideoDumpProxy.VideoDumpEventListener
        public void onInfo(int i2, Object... objArr) {
            MethodCollector.i(12488);
            if (i2 == 0) {
                String str = null;
                String str2 = (String) objArr[0];
                if (str2 != null) {
                    try {
                        str = str2.substring(str2.lastIndexOf(47) + 1, str2.lastIndexOf(46));
                    } catch (Exception unused) {
                        str = str2;
                    }
                    Matcher matcher = Pattern.compile("_*\\d+x\\d+[x_]\\d+").matcher(str);
                    if (matcher.find()) {
                        str = str.substring(0, matcher.start());
                    }
                }
                VideoDumpProxy.currentVideoSourceName = str;
                synchronized (VideoDumpProxy.rawVideoDumperList) {
                    try {
                        for (RawVideoDumperProxy rawVideoDumperProxy : VideoDumpProxy.rawVideoDumperList) {
                            rawVideoDumperProxy.updateDumpFile(str);
                        }
                    } finally {
                        MethodCollector.o(12488);
                    }
                }
            } else if (i2 == 1) {
                synchronized (VideoDumpProxy.rawVideoDumperList) {
                    try {
                        for (RawVideoDumperProxy rawVideoDumperProxy2 : VideoDumpProxy.rawVideoDumperList) {
                            rawVideoDumperProxy2.onVideoDumpParamsChange((JSONObject) objArr[0]);
                        }
                    } finally {
                        MethodCollector.o(12488);
                    }
                }
            } else {
                MethodCollector.o(12488);
            }
        }
    }

    public static class RawVideoDumperProxy {
        private String mParamKey;
        private Object mRawVideoDumper;

        static {
            Covode.recordClassIndex(100501);
        }

        private static Object com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        }

        private boolean isValid() {
            if (VideoDumpProxy.isRawVideoDumperAvailable != 1 || this.mRawVideoDumper == null) {
                return false;
            }
            return true;
        }

        public void release() {
            MethodCollector.i(13218);
            synchronized (VideoDumpProxy.rawVideoDumperList) {
                try {
                    VideoDumpProxy.rawVideoDumperList.remove(this);
                } catch (Throwable th) {
                    MethodCollector.o(13218);
                    throw th;
                }
            }
            releaseRawVideoDumper();
            MethodCollector.o(13218);
        }

        private void releaseRawVideoDumper() {
            if (isValid()) {
                Object obj = this.mRawVideoDumper;
                this.mRawVideoDumper = null;
                try {
                    if (VideoDumpProxy.methodRelease == null) {
                        VideoDumpProxy.methodRelease = VideoDumpProxy.classRawVideoDumper.getMethod("release", new Class[0]);
                    }
                    com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodRelease, obj, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public boolean checkFrameCount() {
            if (!isValid()) {
                return false;
            }
            try {
                if (VideoDumpProxy.methodCheckFrameCount == null) {
                    VideoDumpProxy.methodCheckFrameCount = VideoDumpProxy.classRawVideoDumper.getMethod("checkFrameCount", new Class[0]);
                }
                Boolean bool = (Boolean) com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodCheckFrameCount, this.mRawVideoDumper, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    return false;
                }
                return true;
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public void onVideoDumpParamsChange(JSONObject jSONObject) {
            releaseRawVideoDumper();
            if (jSONObject != null && !jSONObject.isNull(this.mParamKey)) {
                createRawVideoDumper(jSONObject.optJSONObject(this.mParamKey));
            }
        }

        /* access modifiers changed from: package-private */
        public void updateDumpFile(String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodUpdateDumpFile == null) {
                        VideoDumpProxy.methodUpdateDumpFile = VideoDumpProxy.classRawVideoDumper.getMethod("updateDumpFile", String.class);
                    }
                    com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodUpdateDumpFile, this.mRawVideoDumper, new Object[]{str});
                } catch (Exception unused) {
                }
            }
        }

        private void createRawVideoDumper(JSONObject jSONObject) {
            if (VideoDumpProxy.isRawVideoDumperAvailable == -1) {
                try {
                    Class<?> cls = Class.forName("com.ss.avframework.livestreamv2.utils.VideoDumpDebug.RawVideoDumper");
                    VideoDumpProxy.classRawVideoDumper = cls;
                    VideoDumpProxy.constructorRawVideoDumper = cls.getConstructor(Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE);
                    VideoDumpProxy.isRawVideoDumperAvailable = 1;
                } catch (Exception unused) {
                    VideoDumpProxy.isRawVideoDumperAvailable = 0;
                }
            }
            if (VideoDumpProxy.isRawVideoDumperAvailable == 1) {
                try {
                    int optInt = jSONObject.optInt("startFrameCount");
                    int optInt2 = jSONObject.optInt("dumpFrameCount");
                    String optString = jSONObject.optString("dumpSaveDir");
                    boolean optBoolean = jSONObject.optBoolean("exclusiveFileName");
                    if (optInt >= 0 && optInt2 > 0 && !TextUtils.isEmpty(optString)) {
                        this.mRawVideoDumper = VideoDumpProxy.constructorRawVideoDumper.newInstance(Integer.valueOf(optInt), Integer.valueOf(optInt2), optString, Boolean.valueOf(optBoolean));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                updateDumpFile(VideoDumpProxy.currentVideoSourceName);
            }
        }

        public RawVideoDumperProxy(JSONObject jSONObject, String str) {
            MethodCollector.i(13138);
            synchronized (VideoDumpProxy.rawVideoDumperList) {
                try {
                    VideoDumpProxy.rawVideoDumperList.add(this);
                } catch (Throwable th) {
                    MethodCollector.o(13138);
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(str)) {
                this.mParamKey = str;
                createRawVideoDumper(jSONObject.optJSONObject(str));
                MethodCollector.o(13138);
                return;
            }
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException("param key is null");
            MethodCollector.o(13138);
            throw androidRuntimeException;
        }

        public void onYuvFrame(ByteBuffer byteBuffer, int i2, int i3, int i4, String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodOnYuvFrame == null) {
                        VideoDumpProxy.methodOnYuvFrame = VideoDumpProxy.classRawVideoDumper.getMethod("onYuvFrame", ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class);
                    }
                    com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(VideoDumpProxy.methodOnYuvFrame, this.mRawVideoDumper, new Object[]{byteBuffer, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str});
                } catch (Exception unused) {
                }
            }
        }

        public void onTextureFrame(int i2, boolean z, int i3, int i4, int i5, float[] fArr, String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodOnTextureFrame == null) {
                        VideoDumpProxy.methodOnTextureFrame = VideoDumpProxy.classRawVideoDumper.getMethod("onTextureFrame", Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, float[].class, String.class);
                    }
                    Method method = VideoDumpProxy.methodOnTextureFrame;
                    try {
                        com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(method, this.mRawVideoDumper, new Object[]{Integer.valueOf(i2), Boolean.valueOf(z), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), fArr, str});
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }

        public void onYuvFrame(ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4, int i5, int i6, int i7, String str) {
            if (isValid()) {
                try {
                    if (VideoDumpProxy.methodOnYuvFrame == null) {
                        VideoDumpProxy.methodOnYuvFrame = VideoDumpProxy.classRawVideoDumper.getMethod("onYuvFrame", ByteBuffer.class, Integer.TYPE, ByteBuffer.class, Integer.TYPE, ByteBuffer.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class);
                    }
                    Method method = VideoDumpProxy.methodOnYuvFrame;
                    try {
                        com_ss_avframework_livestreamv2_utils_VideoDumpProxy$RawVideoDumperProxy_java_lang_reflect_Method_invoke(method, this.mRawVideoDumper, new Object[]{byteBuffer, Integer.valueOf(i2), byteBuffer2, Integer.valueOf(i3), byteBuffer3, Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), str});
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(100499);
    }

    public static LiveCore createLiveCoreVideoDumpInstance(LiveCore.Builder builder) {
        if (isLiveCoreVideoDumpAvailable == -1) {
            try {
                constructorLiveCoreVideoDump = Class.forName("com.ss.avframework.livestreamv2.utils.VideoDumpDebug.LiveCoreVideoDump").getConstructor(LiveCore.Builder.class);
                isLiveCoreVideoDumpAvailable = 1;
            } catch (Exception unused) {
                isLiveCoreVideoDumpAvailable = 0;
            }
        }
        if (isLiveCoreVideoDumpAvailable != 1) {
            return null;
        }
        try {
            return (LiveCore) constructorLiveCoreVideoDump.newInstance(builder);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static ILiveStream createLiveStreamVideoDumpInstance(LiveStreamBuilder liveStreamBuilder, Handler handler, Handler handler2, AudioDeviceModule audioDeviceModule, IVideoEffectProcessor iVideoEffectProcessor) {
        if (isLiveStreamVideoDumpAvailable == -1) {
            try {
                constructorLiveStreamVideoDump = Class.forName("com.ss.avframework.livestreamv2.utils.VideoDumpDebug.LiveStreamVideoDump").getConstructor(LiveStreamBuilder.class, Handler.class, Handler.class, AudioDeviceModule.class, IVideoEffectProcessor.class, VideoDumpEventListener.class);
                isLiveStreamVideoDumpAvailable = 1;
            } catch (Exception unused) {
                isLiveStreamVideoDumpAvailable = 0;
            }
        }
        if (isLiveStreamVideoDumpAvailable != 1) {
            return null;
        }
        try {
            VideoDumpEventListenerImpl videoDumpEventListenerImpl = new VideoDumpEventListenerImpl(null);
            return (ILiveStream) constructorLiveStreamVideoDump.newInstance(liveStreamBuilder, handler, handler2, audioDeviceModule, iVideoEffectProcessor, videoDumpEventListenerImpl);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }
}
