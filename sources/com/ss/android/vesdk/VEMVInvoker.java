package com.ss.android.vesdk;

import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.common.j;
import com.ss.android.ttve.model.MVInfoBean;
import com.ss.android.ttve.model.MVResourceBean;
import com.ss.android.ttve.model.VEMVAudioAlgorithmResult;
import com.ss.android.ttve.model.g;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.VEMVAlgorithmConfig;
import com.ss.android.vesdk.VEMVParams;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import com.ss.android.vesdk.f.d;
import com.ss.android.vesdk.jni.TEMVInterface;
import com.ss.android.vesdk.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VEMVInvoker implements d {
    private boolean mIsMVInit;
    private int mMVBackgroundAudioRid;
    private int mMVBackgroundAudioTrackIndex = -1;
    private List<Integer> mMVFilterIndex;
    public volatile VEListener.aa mMVInitListener;
    private NativeCallbacks.f mMVInitedCallback = new NativeCallbacks.f() {
        /* class com.ss.android.vesdk.VEMVInvoker.AnonymousClass1 */

        static {
            Covode.recordClassIndex(99191);
        }

        @Override // com.ss.android.ttve.nativePort.NativeCallbacks.f
        public final void a() {
            if (VEMVInvoker.this.mMVInitListener != null) {
                VEMVInvoker.this.mMVInitListener.a();
            }
        }
    };
    private int mMVKaraokeAudioTrackIndex = -1;
    private String mMVPath;
    private g mMVResVideoInfo;
    private String[] mMVResourcePaths;
    private String[] mMVResourceTypes;
    private List<VESize> mMVSize;
    private final TEInterface mNativeEditor;
    private final TEMVInterface mNativeMVHandler;
    private final x mVEEditor;
    private MVInfoBean mvInfo;
    private VEMVParams.a mvResolution;

    static {
        Covode.recordClassIndex(99190);
    }

    public int getMVBackgroundAudioRid() {
        return this.mMVBackgroundAudioRid;
    }

    @Override // com.ss.android.vesdk.f.d
    public int getMVBackgroundAudioTrackIndex() {
        return this.mMVBackgroundAudioTrackIndex;
    }

    public int getMVKaraokeAudioIndex() {
        return this.mMVKaraokeAudioTrackIndex;
    }

    @Override // com.ss.android.vesdk.f.d
    public boolean isMVInitialedInternal() {
        return this.mIsMVInit;
    }

    @Override // com.ss.android.vesdk.f.d
    public void clearNativeFromMV() {
        this.mNativeMVHandler.clearNative();
    }

    public MVInfoBean getMVInfo() {
        if (this.mIsMVInit) {
            MVInfoBean mVInfoBean = this.mvInfo;
            if (mVInfoBean != null) {
                return mVInfoBean;
            }
            throw new z(-1, "MV resource information construction failed!");
        }
        throw new z(-1, "The MV resource has not been initialized yet, please call the init2 method");
    }

    @Override // com.ss.android.vesdk.f.d
    public VEMVAudioInfo getMVOriginalBackgroundAudio() {
        an.c("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio");
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return (VEMVAudioInfo) this.mNativeMVHandler.getMVOriginalBackgroundAudio();
        }
        an.d("VEEditor_VEMVInvoker", "getMVOriginalBackgroundAudio bad input file, please call initMV first");
        return null;
    }

    public VEMVAlgorithmConfig getServerAlgorithmConfig() {
        an.c("VEEditor_VEMVInvoker", "getServerAlgorithmConfig.");
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return (VEMVAlgorithmConfig) this.mNativeMVHandler.getServerAlgorithmConfig();
        }
        an.d("VEEditor_VEMVInvoker", "getServerAlgorithmConfig error, please call initMV first!");
        throw new IllegalStateException("getServerAlgorithmConfig, initMv is not called!");
    }

    @Override // com.ss.android.vesdk.f.d
    public void setListenerForMV(VEListener.aa aaVar) {
        this.mMVInitListener = aaVar;
    }

    @Override // com.ss.android.vesdk.f.d
    public void addMVFilterInternal(int i2) {
        List<Integer> list = this.mMVFilterIndex;
        if (list != null) {
            list.add(Integer.valueOf(i2));
        }
    }

    public VEMVInvoker(x xVar) {
        this.mVEEditor = xVar;
        TEInterface tEInterface = xVar.B;
        this.mNativeEditor = tEInterface;
        this.mNativeMVHandler = new TEMVInterface(tEInterface.getNativeHandler());
    }

    public int setMVAudioBeatAlgorithmResult(VEMVAudioAlgorithmResult vEMVAudioAlgorithmResult) {
        an.c("VEEditor_VEMVInvoker", "setMVAudioBeatAlgorithmResult. beatSize : " + vEMVAudioAlgorithmResult.size);
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVAudioBeatAlgorithmResult(vEMVAudioAlgorithmResult);
        }
        an.d("VEEditor_VEMVInvoker", "setMVAudioBeatAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setMVAudioBeatAlgorithmResult, initMv is not called!");
    }

    public int setMVDataJson(String str) {
        an.c("VEEditor_VEMVInvoker", "setMVDataJson. json = ".concat(String.valueOf(str)));
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setMVDataJson(str);
        }
        an.d("VEEditor_VEMVInvoker", "setMVDataJson error, please call initMV first!");
        throw new IllegalStateException("setMVDataJson, initMv is not called!");
    }

    @Override // com.ss.android.vesdk.f.d
    public int updateMVResources(VEMVParams vEMVParams) {
        an.c("VEEditor_VEMVInvoker", "updateMVResources " + vEMVParams.toString());
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.imgSizes, false, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public int updateMVResourcesRecreateEngine(VEMVParams vEMVParams) {
        an.c("VEEditor_VEMVInvoker", "updateMVResourcesRecreateEngine " + vEMVParams.toString());
        return reInitMV(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, null, 0, 0, vEMVParams.resMV, true, vEMVParams.isSingleVideo, vEMVParams.imgSizes, true, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds);
    }

    public Map<Integer, List<MVResourceBean>> getMVUserVideoInfo(String str) {
        if (!this.mIsMVInit) {
            throw new z(-1, "The MV resource has not been initialized yet, please call the init2 method");
        } else if (this.mMVResVideoInfo != null) {
            HashMap hashMap = new HashMap();
            for (MVResourceBean mVResourceBean : this.mMVResVideoInfo.f61184a) {
                if (mVResourceBean.content.equals(str)) {
                    List list = (List) hashMap.get(Integer.valueOf(mVResourceBean.trackIndex));
                    if (list == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(mVResourceBean);
                        hashMap.put(Integer.valueOf(mVResourceBean.trackIndex), arrayList);
                    } else {
                        list.add(mVResourceBean);
                        hashMap.put(Integer.valueOf(mVResourceBean.trackIndex), list);
                    }
                }
            }
            return hashMap;
        } else {
            throw new z(-1, "MV resource information construction failed");
        }
    }

    @Override // com.ss.android.vesdk.f.d
    public int initMV(VEMVParams vEMVParams) {
        Throwable th;
        MethodCollector.i(8656);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEMVInvoker", "initMV " + vEMVParams.toString());
                try {
                    int initMVInternal = initMVInternal(vEMVParams.mvPath, vEMVParams.resourcesFilePaths, vEMVParams.resourcesTypes, vEMVParams.mvDuration, vEMVParams.bgmPath, vEMVParams.bgmTrimIn, vEMVParams.bgmTrimOut, vEMVParams.resMV, false, vEMVParams.isSingleVideo, vEMVParams.imgSizes, vEMVParams.backVolume, vEMVParams.originalVolume, vEMVParams.karaokeAudioPaths, vEMVParams.karaokeAudioDurations, vEMVParams.karaokeAudioSpeeds, vEMVParams.customRenderRes);
                    MethodCollector.o(8656);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.o(8656);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(8656);
                throw th;
            }
        }
    }

    @Override // com.ss.android.vesdk.f.d
    public int setMvOriginalAudio(boolean z, float f2) {
        an.a("VEEditor_VEMVInvoker", "setMVoriginalAudio... ".concat(String.valueOf(z)));
        if (this.mIsMVInit && this.mMVResVideoInfo == null) {
            return -502;
        }
        ArrayList<Integer> arrayList = new ArrayList();
        for (MVResourceBean mVResourceBean : this.mMVResVideoInfo.f61184a) {
            if (!arrayList.contains(Integer.valueOf(mVResourceBean.trackIndex))) {
                arrayList.add(Integer.valueOf(mVResourceBean.trackIndex));
            }
        }
        if (!z) {
            for (Integer num : arrayList) {
                this.mVEEditor.a(num.intValue(), 0, 0.0f);
            }
        } else {
            for (Integer num2 : arrayList) {
                this.mVEEditor.a(num2.intValue(), 0, f2);
            }
        }
        return 0;
    }

    public int initMV(String str, String[] strArr, String[] strArr2) {
        Throwable th;
        MethodCollector.i(8454);
        synchronized (this.mVEEditor) {
            try {
                try {
                    int initMVInternal = initMVInternal(str, strArr, strArr2, null, null, 0, 0, VEMVParams.a.RES_RANDOM, false, false, null, 1.0f, 1.0f, null, null, null, null);
                    MethodCollector.o(8454);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.o(8454);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(8454);
                throw th;
            }
        }
    }

    @Override // com.ss.android.vesdk.f.d
    public int updateMVBackgroundAudioTrack(String str, int i2, int i3) {
        an.c("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack");
        return reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, str, i2, i3, this.mvResolution, false, false, this.mMVSize, false, null, null, null);
    }

    public int setExternalAlgorithmResult(String str, String str2, String str3) {
        an.c("VEEditor_VEMVInvoker", "setExternalAlgorithmResult. photoPath = " + str + ", algorithmType = " + str2 + ", filePath = " + str3);
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, -1);
        }
        an.d("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int updateMVBackgroundAudioTrack2(String str, int i2, int i3) {
        an.c("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2...");
        int reInitMV = reInitMV(this.mMVPath, this.mMVResourcePaths, this.mMVResourceTypes, null, null, 0, 0, this.mvResolution, true, false, this.mMVSize, false, null, null, null);
        if (reInitMV != 0) {
            an.d("VEEditor_VEMVInvoker", "updateMVBackgroundAudioTrack2 failed when reinitMV !!!");
            return reInitMV;
        }
        this.mVEEditor.a(this.mMVBackgroundAudioTrackIndex, 1, 0.0f);
        return this.mVEEditor.a(str, i2, i3, true);
    }

    @Override // com.ss.android.vesdk.f.d
    public int updateMVResources(String str, String[] strArr, String[] strArr2) {
        an.c("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.a.RES_RANDOM, true, false, null, false, null, null, null);
    }

    public int updateMVResourcesRecreateEngine(String str, String[] strArr, String[] strArr2) {
        an.c("VEEditor_VEMVInvoker", "updateMVResourcesRecreateEngine");
        return reInitMV(str, strArr, strArr2, null, null, 0, 0, VEMVParams.a.RES_RANDOM, true, false, null, true, null, null, null);
    }

    private List<List<List<MVResourceBean>>> genMVResourceTracks(MVInfoBean mVInfoBean, List<String> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        ArrayList<MVResourceBean> arrayList4 = mVInfoBean.resources;
        ArrayList arrayList5 = new ArrayList();
        while (arrayList5.size() != arrayList4.size()) {
            ArrayList arrayList6 = new ArrayList();
            double d2 = 0.0d;
            double d3 = 0.0d;
            for (MVResourceBean mVResourceBean : arrayList4) {
                if (!arrayList5.contains(Integer.valueOf(mVResourceBean.rid))) {
                    if ("video".equals(mVResourceBean.type) || "img".equals(mVResourceBean.type) || "bgimg".equals(mVResourceBean.type)) {
                        if (mVResourceBean.seqIn >= d2) {
                            MVResourceBean mVResourceBean2 = new MVResourceBean();
                            mVResourceBean2.seqIn = mVResourceBean.seqIn * 1000.0d;
                            mVResourceBean2.seqOut = mVResourceBean.seqOut * 1000.0d;
                            mVResourceBean2.trimIn = mVResourceBean.trimIn * 1000.0d;
                            mVResourceBean2.trimOut = mVResourceBean.trimOut * 1000.0d;
                            mVResourceBean2.musicFadeIn = mVResourceBean.musicFadeIn * 1000.0d;
                            mVResourceBean2.musicFadeOut = mVResourceBean.musicFadeOut * 1000.0d;
                            if (mVResourceBean2.trimOut == 0.0d && ("img".equals(mVResourceBean.type) || "bgimg".equals(mVResourceBean.type))) {
                                mVResourceBean2.trimOut = mVResourceBean2.seqOut - mVResourceBean2.seqIn;
                            }
                            mVResourceBean2.content = mVResourceBean.content;
                            mVResourceBean2.type = mVResourceBean.type;
                            mVResourceBean2.rid = mVResourceBean.rid;
                            mVResourceBean2.isLoop = mVResourceBean.isLoop;
                            mVResourceBean2.isMute = mVResourceBean.isMute;
                            mVResourceBean2.timeMode = mVResourceBean.timeMode;
                            arrayList6.add(mVResourceBean2);
                            d2 = mVResourceBean.seqOut;
                            arrayList5.add(Integer.valueOf(mVResourceBean2.rid));
                            list.add(mVResourceBean2.content);
                        }
                    } else if (DataType.AUDIO.equals(mVResourceBean.type)) {
                        if (mVResourceBean.seqIn >= d3) {
                            ArrayList arrayList7 = new ArrayList();
                            MVResourceBean mVResourceBean3 = new MVResourceBean();
                            mVResourceBean3.seqIn = mVResourceBean.seqIn * 1000.0d;
                            mVResourceBean3.seqOut = mVResourceBean.seqOut * 1000.0d;
                            mVResourceBean3.trimIn = mVResourceBean.trimIn * 1000.0d;
                            mVResourceBean3.trimOut = mVResourceBean.trimOut * 1000.0d;
                            mVResourceBean3.musicFadeIn = mVResourceBean.musicFadeIn * 1000.0d;
                            mVResourceBean3.musicFadeOut = mVResourceBean.musicFadeOut * 1000.0d;
                            mVResourceBean3.content = mVResourceBean.content;
                            mVResourceBean3.type = mVResourceBean.type;
                            mVResourceBean3.rid = mVResourceBean.rid;
                            mVResourceBean3.isLoop = mVResourceBean.isLoop;
                            mVResourceBean3.isMute = mVResourceBean.isMute;
                            mVResourceBean3.timeMode = mVResourceBean.timeMode;
                            if (this.mMVBackgroundAudioRid == 0) {
                                this.mMVBackgroundAudioRid = mVResourceBean3.rid;
                            }
                            arrayList7.add(mVResourceBean3);
                            d3 = mVResourceBean.seqOut;
                            arrayList5.add(Integer.valueOf(mVResourceBean3.rid));
                            list2.add(mVResourceBean3.content);
                            if (arrayList7.size() > 0) {
                                arrayList3.add(arrayList7);
                            }
                        }
                    } else if ("text".equals(mVResourceBean.type)) {
                        arrayList5.add(Integer.valueOf(mVResourceBean.rid));
                    } else {
                        arrayList5.add(Integer.valueOf(mVResourceBean.rid));
                    }
                }
            }
            if (arrayList6.size() > 0) {
                arrayList2.add(arrayList6);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.vesdk.f.d
    public int changeMvUserVideoInfoInternal(int i2, int[] iArr, VEClipTimelineParam[] vEClipTimelineParamArr, VEClipSourceParam[] vEClipSourceParamArr) {
        if (this.mMVResVideoInfo == null) {
            an.d("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... mvResInfo was not inited!");
            return -502;
        } else if ((vEClipTimelineParamArr == null || iArr.length == vEClipTimelineParamArr.length) && (vEClipSourceParamArr == null || iArr.length == vEClipSourceParamArr.length)) {
            for (int i3 = 0; i3 < this.mMVResVideoInfo.a(); i3++) {
                int i4 = 0;
                for (int i5 : iArr) {
                    MVResourceBean a2 = this.mMVResVideoInfo.a(i3);
                    if (a2.clipIndex == i5 && a2.trackIndex == i2) {
                        if (vEClipTimelineParamArr != null) {
                            a2.trimIn = (double) vEClipTimelineParamArr[i4].trimIn;
                            a2.trimOut = (double) vEClipTimelineParamArr[i4].trimOut;
                        }
                        if (vEClipSourceParamArr != null) {
                            a2.content = vEClipSourceParamArr[i4].clipFilePath;
                        }
                        this.mMVResVideoInfo.a(i3, a2);
                    }
                    i4++;
                }
            }
            return 0;
        } else {
            an.d("VEEditor_VEMVInvoker", "changeMvUserVideoInfo... Invalid params!");
            return -1;
        }
    }

    @Override // com.ss.android.vesdk.f.d
    public int setExternalAlgorithmResult(String str, String str2, String str3, VEMVAlgorithmConfig.MV_REESULT_IN_TYPE mv_reesult_in_type) {
        an.c("VEEditor_VEMVInvoker", "setExternalAlgorithmResult. photoPath = " + str + ", algorithmType = " + str2 + ", result = " + str3 + ", type = " + mv_reesult_in_type);
        if (this.mMVPath != null && this.mMVResourcePaths != null && this.mMVResourceTypes != null) {
            return this.mNativeMVHandler.setExternalAlgorithmResult(str, str2, str3, mv_reesult_in_type.ordinal());
        }
        an.d("VEEditor_VEMVInvoker", "setExternalAlgorithmResult error, please call initMV first!");
        throw new IllegalStateException("setExternalAlgorithmResult, initMv is not called!");
    }

    public int updateMVResources(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        an.c("VEEditor_VEMVInvoker", "updateMVResources");
        return reInitMV(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.a.RES_RANDOM, true, z, null, false, null, null, null);
    }

    public int initMV(String str, String[] strArr, String[] strArr2, int[] iArr, boolean z) {
        Throwable th;
        MethodCollector.i(8452);
        synchronized (this.mVEEditor) {
            try {
                try {
                    int initMVInternal = initMVInternal(str, strArr, strArr2, iArr, null, 0, 0, VEMVParams.a.RES_RANDOM, false, z, null, 1.0f, 1.0f, null, null, null, null);
                    MethodCollector.o(8452);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.o(8452);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(8452);
                throw th;
            }
        }
    }

    @Override // com.ss.android.vesdk.f.d
    public int initMV(String str, String[] strArr, String[] strArr2, String str2, int i2, int i3) {
        Throwable th;
        MethodCollector.i(8456);
        synchronized (this.mVEEditor) {
            try {
                try {
                    int initMVInternal = initMVInternal(str, strArr, strArr2, null, str2, i2, i3, VEMVParams.a.RES_RANDOM, false, false, null, 1.0f, 1.0f, null, null, null, null);
                    MethodCollector.o(8456);
                    return initMVInternal;
                } catch (Throwable th2) {
                    th = th2;
                    MethodCollector.o(8456);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                MethodCollector.o(8456);
                throw th;
            }
        }
    }

    private boolean genResourcesArrRepeat(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i2) {
        int i3 = (int) (mVResourceBean.trimOut - mVResourceBean.trimIn);
        int i4 = (int) mVResourceBean.seqIn;
        for (int i5 = 0; i5 < i2; i5++) {
            strArr[i5] = mVResourceBean.content;
            iArr5[i5] = mVResourceBean.rid;
            iArr[i5] = (int) mVResourceBean.trimIn;
            iArr2[i5] = (int) mVResourceBean.trimOut;
            iArr3[i5] = i4;
            iArr4[i5] = i4 + i3;
            i4 = iArr4[i5];
        }
        int i6 = i2 - 1;
        iArr4[i6] = (int) mVResourceBean.seqOut;
        iArr2[i6] = (iArr4[i6] - iArr3[i6]) + iArr[i6];
        return true;
    }

    private boolean genResourcesArrCycle(MVResourceBean mVResourceBean, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i2) {
        int i3 = (int) (mVResourceBean.seqOut - mVResourceBean.seqIn);
        if (i2 <= 0) {
            an.d("VEEditor_VEMVInvoker", "mvDuration invalied ...");
            return false;
        }
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i4 + i3;
            if (i6 > i2) {
                break;
            }
            iArr[i5] = (int) mVResourceBean.trimIn;
            iArr2[i5] = (int) mVResourceBean.trimOut;
            iArr3[i5] = ((int) mVResourceBean.seqIn) + i4;
            iArr4[i5] = ((int) mVResourceBean.seqOut) + i4;
            strArr[i5] = mVResourceBean.content;
            iArr5[i5] = mVResourceBean.rid;
            i5++;
            i4 = i6;
        }
        if (i4 >= i2) {
            return true;
        }
        iArr[i5] = 0;
        iArr2[i5] = i2 - i4;
        iArr3[i5] = ((int) mVResourceBean.seqIn) + i4;
        iArr4[i5] = i2;
        strArr[i5] = mVResourceBean.content;
        iArr5[i5] = mVResourceBean.rid;
        return true;
    }

    private void genResourcesArr(List<MVResourceBean> list, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, String[] strArr, int[] iArr5, int i2, boolean[] zArr) {
        int i3 = 0;
        for (MVResourceBean mVResourceBean : list) {
            iArr[i3] = (int) mVResourceBean.trimIn;
            iArr2[i3] = (int) mVResourceBean.trimOut;
            iArr3[i3] = (int) mVResourceBean.seqIn;
            iArr4[i3] = (int) mVResourceBean.seqOut;
            strArr[i3] = mVResourceBean.content;
            iArr5[i3] = mVResourceBean.rid;
            zArr[i3] = mVResourceBean.isMute;
            mVResourceBean.trackIndex = i2;
            mVResourceBean.clipIndex = i3;
            i3++;
            if (Arrays.asList(this.mMVResourcePaths).contains(mVResourceBean.content)) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.mMVResVideoInfo.a()) {
                        break;
                    }
                    MVResourceBean a2 = this.mMVResVideoInfo.a(i4);
                    if (a2.content.equals(mVResourceBean.content) && a2.trackIndex == -1) {
                        this.mMVResVideoInfo.a(i4, mVResourceBean);
                        break;
                    }
                    i4++;
                }
            }
        }
    }

    private int reInitMV(String str, String[] strArr, String[] strArr2, int[] iArr, String str2, int i2, int i3, VEMVParams.a aVar, boolean z, boolean z2, List<VESize> list, boolean z3, String[] strArr3, int[] iArr2, float[] fArr) {
        Throwable th;
        MethodCollector.i(9405);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEMVInvoker", "reinitMV...");
                if (!(str == null || strArr == null)) {
                    if (strArr2 != null) {
                        this.mVEEditor.a(0, x.f.EDITOR_SEEK_FLAG_LastSeek);
                        if (z3) {
                            j jVar = this.mVEEditor.s;
                            jVar.f61094a = -1;
                            jVar.f61095b = -1;
                            jVar.f61096c.clear();
                            jVar.f61097d.clear();
                            int releaseEngine = this.mNativeEditor.releaseEngine();
                            if (releaseEngine != 0) {
                                an.a("VEEditor_VEMVInvoker", "stop in reInitMV failed, ret = ".concat(String.valueOf(releaseEngine)));
                                MethodCollector.o(9405);
                                return -1;
                            }
                        } else {
                            int stop = this.mNativeEditor.stop();
                            if (stop != 0) {
                                an.a("VEEditor_VEMVInvoker", "release in reInitMV failed, ret = ".concat(String.valueOf(stop)));
                                MethodCollector.o(9405);
                                return -1;
                            }
                        }
                        this.mMVBackgroundAudioRid = 0;
                        this.mMVKaraokeAudioTrackIndex = -1;
                        int[] iArr3 = new int[this.mMVFilterIndex.size()];
                        for (int i4 = 0; i4 < this.mMVFilterIndex.size(); i4++) {
                            iArr3[i4] = this.mMVFilterIndex.get(i4).intValue();
                        }
                        this.mVEEditor.a(iArr3);
                        try {
                            int initMVInternal = initMVInternal(str, strArr, strArr2, iArr, str2, i2, i3, aVar, z, z2, list, 1.0f, 1.0f, strArr3, iArr2, fArr, null);
                            if (initMVInternal != 0) {
                                an.d("VEEditor_VEMVInvoker", "init2 in reInitMV failed, ret = ".concat(String.valueOf(initMVInternal)));
                                MethodCollector.o(9405);
                                return initMVInternal;
                            }
                            try {
                                this.mNativeEditor.createTimeline();
                                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                                this.mNativeEditor.updateTrackFilter(0, 0, false);
                                if (this.mVEEditor.J() != null) {
                                    x xVar = this.mVEEditor;
                                    xVar.f151514c.a(xVar.J().f61171a, 1.0f, true);
                                }
                                MethodCollector.o(9405);
                                return prepareEngine;
                            } catch (Throwable th2) {
                                th = th2;
                                MethodCollector.o(9405);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            MethodCollector.o(9405);
                            throw th;
                        }
                    }
                }
                an.a("VEEditor_VEMVInvoker", "reinitMV bad input file, please call init2 first");
                MethodCollector.o(9405);
                return -205;
            } catch (Throwable th4) {
                th = th4;
                MethodCollector.o(9405);
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x059a, code lost:
        if (r53 > 0) goto L_0x044a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int initMVInternal(java.lang.String r66, java.lang.String[] r67, java.lang.String[] r68, int[] r69, java.lang.String r70, int r71, int r72, com.ss.android.vesdk.VEMVParams.a r73, boolean r74, boolean r75, java.util.List<com.ss.android.vesdk.VESize> r76, float r77, float r78, java.lang.String[] r79, int[] r80, float[] r81, com.ss.android.vesdk.VESize r82) {
        /*
        // Method dump skipped, instructions count: 1462
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEMVInvoker.initMVInternal(java.lang.String, java.lang.String[], java.lang.String[], int[], java.lang.String, int, int, com.ss.android.vesdk.VEMVParams$a, boolean, boolean, java.util.List, float, float, java.lang.String[], int[], float[], com.ss.android.vesdk.VESize):int");
    }
}
