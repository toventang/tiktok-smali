package com.ss.avframework.effect;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.buffer.RoiInfo;
import com.ss.avframework.engine.AudioDeviceModule;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

public interface IVideoEffectProcessor {

    public interface EffectMsgListener {
        static {
            Covode.recordClassIndex(99775);
        }

        void onMessageReceived(int i2, int i3, int i4, String str);
    }

    public interface ExpressionBundle {
        static {
            Covode.recordClassIndex(99776);
        }

        float getAngryScore();

        float getArousal();

        float getAttractive();

        float getBlurScore();

        float getBoyProb();

        float getEge();

        int getExpressionType();

        float getHappyScore();

        float getIllumination();

        float getLipstickProb();

        float getMaskProb();

        float getMustacheProb();

        float getQuality();

        float getRealFaceProb();

        float getSadScore();

        float getSurpriseScore();

        float getValence();

        float getWearGlassProb();

        float getWearHatProb();

        float getWearSunglassProb();
    }

    public interface ExpressionDetectListener {
        static {
            Covode.recordClassIndex(99777);
        }

        void onExpressionDetectResultCallback(ExpressionBundle[] expressionBundleArr);
    }

    public interface FaceDetectListener {
        static {
            Covode.recordClassIndex(99778);
        }

        void onFaceDetectResultCallback(int i2);
    }

    public interface IEffectInfoChangeListener {
        static {
            Covode.recordClassIndex(99779);
        }

        void onEffectInfoChange(String str, String str2, int i2, int i3);

        void onLicenseInfoChange(String str, int i2);
    }

    public interface MicrophoneDetectListener {
        static {
            Covode.recordClassIndex(99780);
        }

        void onMicrophoneDetectResultCallback(float f2);
    }

    static {
        Covode.recordClassIndex(99774);
    }

    int composerAppendNodes(String[] strArr, int i2);

    int composerAppendNodesWithTags(String[] strArr, int i2, String[] strArr2);

    int composerCheckNodeExclusion(String str, String str2, int[] iArr);

    int composerExclusionCompare(String str, String str2, String str3, int[] iArr);

    int composerReloadNodes(String[] strArr, int i2);

    int composerReloadNodesWithTags(String[] strArr, int i2, String[] strArr2);

    int composerRemoveNodes(String[] strArr, int i2);

    int composerReplaceNodesWithTags(String[] strArr, int i2, String[] strArr2, int i3, String[] strArr3);

    int composerSetMode(int i2, int i3);

    int composerSetNodes(String[] strArr, int i2);

    int composerSetNodesWithTags(String[] strArr, int i2, String[] strArr2);

    int composerUpdateNode(String str, String str2, float f2);

    void configEffect(int i2, int i3, String str, String str2, boolean z, boolean z2, String str3);

    boolean detectFaceFromBitMap(Bitmap bitmap);

    void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    int enableFindContour(boolean z, String str);

    int enableMockFace(boolean z);

    AudioDeviceModule.AudioRenderSink getEffectAudioRender();

    String getEffectVersion();

    float getFilterIntensity(String str);

    int getMattingResult(ByteBuffer byteBuffer);

    boolean isAudioRecognizeAvailable();

    String name();

    int pauseEffect();

    int process(int i2, int i3, int i4, int i5, int i6, long j2, boolean z);

    int process(int i2, int i3, int i4, int i5, int i6, RoiInfo roiInfo, long j2, boolean z, long j3);

    void processDoubleClickEvent(float f2, float f3);

    void processLongPressEvent(float f2, float f3);

    void processPanEvent(float f2, float f3, float f4, float f5, float f6);

    void processRotationEvent(float f2, float f3);

    void processScaleEvent(float f2, float f3);

    void processTouchDownEvent(float f2, float f3, int i2);

    void processTouchEvent(float f2, float f3);

    void processTouchEventWithTouchType(long j2, float f2, float f3, float f4, float f5, int i2, int i3);

    void processTouchUpEvent(float f2, float f3, int i2);

    void release();

    void releaseContetDetector();

    int resumeEffect();

    int sendEffectMsg(int i2, int i3, int i4, String str);

    void setAlgorithmAB(boolean z);

    int setAssetManager(AssetManager assetManager);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f2, float f3);

    int setBeautify(String str, float f2, float f3, float f4);

    int setCustomEffect(String str, String str2);

    int setCustomEffectBitmap(String str, Bitmap bitmap);

    int setCustomEffectOrientation(String str, int i2);

    void setDoubleViewRect(double d2, double d3, double d4, double d5);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    int setEffectABInfo(JSONObject jSONObject, String str);

    int setEffectLicense(String str);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setExpressionDetectListener(ExpressionDetectListener expressionDetectListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f2);

    int setFilter(String str, float f2, boolean z);

    int setFilter(String str, String str2, float f2, float f3, float f4);

    int setFilter(String str, String str2, float f2, float f3, float f4, boolean z);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    void setRenderCacheString(String str, String str2);

    int setReshape(String str, float f2, float f3);

    int setResourceFinder(Object obj);

    int setSendContourInfoType(int i2);

    int startAudioRecognize(ByteBuffer byteBuffer, int i2, int i3, int i4);

    int startEffectAudio();

    int stopEffectAudio();

    boolean valid();
}
