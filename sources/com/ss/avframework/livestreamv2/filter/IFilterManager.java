package com.ss.avframework.livestreamv2.filter;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.effect.IVideoEffectProcessor;
import com.ss.avframework.engine.AudioDeviceModule;
import java.nio.ByteBuffer;
import java.util.Map;
import org.json.JSONObject;

public interface IFilterManager {

    public interface ContourDataCallBack {
        static {
            Covode.recordClassIndex(100388);
        }

        void onReceivedLocalData(FindContourInfo findContourInfo);

        void onReceivedRemoteData(FindContourInfo findContourInfo);
    }

    public interface ContourInfoListener {
        static {
            Covode.recordClassIndex(100389);
        }

        void onReceivedData(FindContourInfo findContourInfo, int i2, int i3);
    }

    public interface EffectMsgListener extends IVideoEffectProcessor.EffectMsgListener {
        static {
            Covode.recordClassIndex(100390);
        }
    }

    public interface ErrorListener {
        static {
            Covode.recordClassIndex(100391);
        }

        void onError(int i2, String str);
    }

    public interface ExpressionDetectListener extends IVideoEffectProcessor.ExpressionDetectListener {
        static {
            Covode.recordClassIndex(100392);
        }
    }

    public interface FaceDetectListener extends IVideoEffectProcessor.FaceDetectListener {
        static {
            Covode.recordClassIndex(100393);
        }
    }

    public interface FindContourListener {
        static {
            Covode.recordClassIndex(100394);
        }

        void onSendFindContourSei(ByteBuffer byteBuffer, long j2, int i2);
    }

    public interface MicrophoneDetectListener extends IVideoEffectProcessor.MicrophoneDetectListener {
        static {
            Covode.recordClassIndex(100395);
        }
    }

    static {
        Covode.recordClassIndex(100387);
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

    IAudioStrangeVoice createAudioStrangeVoice(AudioDeviceModule.AudioRenderSink audioRenderSink, int i2, int i3);

    boolean detectFaceFromBitMap(Bitmap bitmap);

    void enable(boolean z);

    void enableExpressionDetect(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6);

    int enableFindContour(boolean z, String str);

    int enableMockFace(boolean z);

    void forceOutput2DTex(boolean z);

    String getABDefaultInfoFromEffect(String str);

    long getEffectAudioQuirk();

    float getEffectAudioVolume();

    long getEffectNativeHandler();

    String getEffectVersion();

    float getFilterIntensity(String str);

    String getVersion();

    IVideoEffectProcessor getVideoEffectProcessor();

    boolean isEnable();

    boolean isValid();

    String name();

    int pauseEffect();

    void processDoubleClickEvent(float f2, float f3);

    void processLongPressEvent(float f2, float f3);

    void processPanEvent(float f2, float f3, float f4, float f5, float f6);

    void processRotationEvent(float f2, float f3);

    void processScaleEvent(float f2, float f3);

    void processTouchDownEvent(float f2, float f3, int i2);

    void processTouchEvent(float f2, float f3);

    void processTouchEventWithTouchType(long j2, float f2, float f3, float f4, float f5, int i2, int i3);

    void processTouchUpEvent(float f2, float f3, int i2);

    void releaseContetDetector();

    int resumeEffect();

    int sendEffectMsg(int i2, int i3, int i4, String str);

    void setABInfoToEffect(JSONObject jSONObject, String str);

    int setAudioRecognizeDict(Map<String, String[]> map);

    int setBeautify(String str, float f2, float f3);

    int setBeautify(String str, float f2, float f3, float f4);

    void setContourDataCallBack(ContourDataCallBack contourDataCallBack);

    void setContourDataSendInterval(int i2);

    int setCustomEffect(String str, String str2);

    int setCustomEffectOrientation(String str, int i2);

    int setCustomEffectWithUri(String str, String str2, int i2, int i3);

    void setDoubleViewRect(double d2, double d3, double d4, double d5);

    int setEffect(String str);

    int setEffect(String str, boolean z);

    void setEffectAudioQuirk(long j2);

    void setEffectAudioVolume(float f2);

    void setEffectInfoChangeListener(IVideoEffectProcessor.IEffectInfoChangeListener iEffectInfoChangeListener);

    void setEffectMsgListener(EffectMsgListener effectMsgListener);

    void setErrorListener(ErrorListener errorListener);

    void setExpressionDetectListener(ExpressionDetectListener expressionDetectListener);

    int setFaceAttribute(boolean z);

    void setFaceDetectListener(FaceDetectListener faceDetectListener);

    int setFilter(String str, float f2);

    int setFilter(String str, float f2, boolean z);

    int setFilter(String str, String str2, float f2, float f3, float f4);

    int setFilter(String str, String str2, float f2, float f3, float f4, boolean z);

    void setFindContourListener(FindContourListener findContourListener);

    void setLicenseToEffect(String str);

    void setMicrophoneDetectListener(MicrophoneDetectListener microphoneDetectListener);

    void setMusicNodeFilePath(String str);

    void setRenderCacheString(String str, String str2);

    int setReshape(String str, float f2, float f3);

    void setSendContourInfoType(int i2);

    int startAudioRecognize();

    int startEffectAudio();

    int stopAudioRecognize();

    int stopEffectAudio();

    void updateEffAudioTimestampMs(long j2);
}
