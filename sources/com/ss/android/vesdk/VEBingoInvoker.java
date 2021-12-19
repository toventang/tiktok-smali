package com.ss.android.vesdk;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.medialib.e;
import com.ss.android.ttve.model.VEFrame;
import com.ss.android.ttve.monitor.TEMonitorInvoker;
import com.ss.android.ttve.monitor.h;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ttve.nativePort.TEVideoUtilsCallback;
import com.ss.android.ttve.nativePort.a;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.ss.android.vesdk.f.b;
import com.ss.android.vesdk.jni.TEBingoInterface;
import com.ss.android.vesdk.x;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class VEBingoInvoker implements b {
    private int frameCountCur;
    public Map<Integer, Boolean> genFrameMap = new HashMap();
    public final TEBingoInterface mNativeBingoHandler;
    private final TEInterface mNativeEditor;
    private final x mVEEditor;

    static {
        Covode.recordClassIndex(99097);
    }

    @Override // com.ss.android.vesdk.f.b
    public void clearNativeFromBingo() {
        this.mNativeBingoHandler.clearNative();
    }

    @Override // com.ss.android.vesdk.f.b
    public int initBingoAlgorithm() {
        an.a("VEEditor_VEBingoInvoker", "initBingoAlgorithm");
        int initBingoAlgorithm = this.mNativeBingoHandler.initBingoAlgorithm();
        if (initBingoAlgorithm != 0) {
            an.d("VEEditor_VEBingoInvoker", "initBingoAlgorithm failed, ret = ".concat(String.valueOf(initBingoAlgorithm)));
        }
        return initBingoAlgorithm;
    }

    /* renamed from: com.ss.android.vesdk.VEBingoInvoker$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f150727a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 99102(0x1831e, float:1.38871E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.vesdk.ROTATE_DEGREE[] r0 = com.ss.android.vesdk.ROTATE_DEGREE.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.ss.android.vesdk.VEBingoInvoker.AnonymousClass3.f150727a = r2
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.ss.android.vesdk.ROTATE_DEGREE.ROTATE_NONE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.ss.android.vesdk.VEBingoInvoker.AnonymousClass3.f150727a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.ss.android.vesdk.ROTATE_DEGREE.ROTATE_90     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.ss.android.vesdk.VEBingoInvoker.AnonymousClass3.f150727a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.ss.android.vesdk.ROTATE_DEGREE.ROTATE_180     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.ss.android.vesdk.VEBingoInvoker.AnonymousClass3.f150727a     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.android.vesdk.ROTATE_DEGREE r0 = com.ss.android.vesdk.ROTATE_DEGREE.ROTATE_270     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEBingoInvoker.AnonymousClass3.<clinit>():void");
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public List<VEClipAlgorithmParam> getAllVideoRangeData() {
        an.c("VEEditor_VEBingoInvoker", "getAllVideoRangeData");
        List<VEClipAlgorithmParam> allVideoRangeData = this.mNativeBingoHandler.getAllVideoRangeData();
        for (int i2 = 0; i2 < allVideoRangeData.size(); i2++) {
            an.c("VEEditor_VEBingoInvoker", "rangData: " + allVideoRangeData.get(i2).toString());
        }
        return allVideoRangeData;
    }

    @Override // com.ss.android.vesdk.f.b
    public int updateAlgorithmFromNormal() {
        int updateAlgorithmFromNormal;
        MethodCollector.i(8274);
        synchronized (this.mVEEditor) {
            try {
                an.c("VEEditor_VEBingoInvoker", "updateAlgorithmFromNormal");
                updateAlgorithmFromNormal = this.mNativeBingoHandler.updateAlgorithmFromNormal();
                if (updateAlgorithmFromNormal != 0) {
                    an.d("VEEditor_VEBingoInvoker", "updateAlgorithmFromNormal failed, ret = ".concat(String.valueOf(updateAlgorithmFromNormal)));
                }
            } finally {
                MethodCollector.o(8274);
            }
        }
        return updateAlgorithmFromNormal;
    }

    @Override // com.ss.android.vesdk.f.b
    public int genRandomSolve() {
        MethodCollector.i(8250);
        synchronized (this.mVEEditor) {
            try {
                an.c("VEEditor_VEBingoInvoker", "genRandomSolve");
                this.mNativeEditor.stop();
                int randomSolve = this.mNativeBingoHandler.getRandomSolve();
                if (randomSolve != 0) {
                    an.d("VEEditor_VEBingoInvoker", "getRandomSolve failed, ret = ".concat(String.valueOf(randomSolve)));
                    return randomSolve;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.o(8250);
                return prepareEngine;
            } finally {
                MethodCollector.o(8250);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public int genSmartCutting() {
        MethodCollector.i(8264);
        synchronized (this.mVEEditor) {
            try {
                an.c("VEEditor_VEBingoInvoker", "genSmartCutting");
                this.mNativeEditor.stop();
                int genAISolve = this.mNativeBingoHandler.genAISolve();
                if (genAISolve != 0) {
                    an.d("VEEditor_VEBingoInvoker", "genSmartCutting failed, ret = ".concat(String.valueOf(genAISolve)));
                    return genAISolve;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.o(8264);
                return prepareEngine;
            } finally {
                MethodCollector.o(8264);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public int removeAllVideoSound() {
        MethodCollector.i(8193);
        synchronized (this.mVEEditor) {
            try {
                an.c("VEEditor_VEBingoInvoker", "removeAllVideoSound");
                this.mNativeEditor.stop();
                int removeAllVideoSound = this.mNativeBingoHandler.removeAllVideoSound();
                if (removeAllVideoSound != 0) {
                    an.d("VEEditor_VEBingoInvoker", "removeAllVideoSound failed, ret = ".concat(String.valueOf(removeAllVideoSound)));
                    return removeAllVideoSound;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.o(8193);
                return prepareEngine;
            } finally {
                MethodCollector.o(8193);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public int restoreAllVideoSound() {
        MethodCollector.i(8245);
        synchronized (this.mVEEditor) {
            try {
                an.c("VEEditor_VEBingoInvoker", "restoreAllVideoSound");
                this.mNativeEditor.stop();
                int restoreAllVideoSound = this.mNativeBingoHandler.restoreAllVideoSound();
                if (restoreAllVideoSound != 0) {
                    an.d("VEEditor_VEBingoInvoker", "restoreAllVideoSound failed, ret = ".concat(String.valueOf(restoreAllVideoSound)));
                    return restoreAllVideoSound;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.o(8245);
                return prepareEngine;
            } finally {
                MethodCollector.o(8245);
            }
        }
    }

    public VEBingoInvoker(x xVar) {
        this.mVEEditor = xVar;
        TEInterface tEInterface = xVar.B;
        this.mNativeEditor = tEInterface;
        this.mNativeBingoHandler = new TEBingoInterface(tEInterface);
    }

    @Override // com.ss.android.vesdk.f.b
    public int cancelGenVideoFrame(int i2) {
        an.c("VEEditor_VEBingoInvoker", "cancelGenVideoFrame... index: ".concat(String.valueOf(i2)));
        if (az.f151042f) {
            return this.mNativeBingoHandler.cancelExtractVideoFrames(i2);
        }
        this.genFrameMap.put(Integer.valueOf(i2), false);
        this.frameCountCur = 0;
        return 0;
    }

    public int checkScoresFile(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        an.c("VEEditor_VEBingoInvoker", "checkScoresFile filePath:".concat(String.valueOf(str)));
        int checkScoresFile = this.mNativeBingoHandler.checkScoresFile(str);
        if (checkScoresFile != 0) {
            an.d("VEEditor_VEBingoInvoker", "checkScoresFile failed, ret = ".concat(String.valueOf(checkScoresFile)));
        }
        return checkScoresFile;
    }

    public int setInterimScoresToFile(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return -100;
        }
        an.c("VEEditor_VEBingoInvoker", "setInterimScoresToFile filePath:".concat(String.valueOf(str)));
        int interimScoresToFile = this.mNativeBingoHandler.setInterimScoresToFile(str);
        if (interimScoresToFile != 0) {
            an.d("VEEditor_VEBingoInvoker", "setInterimScoresToFile failed, ret = ".concat(String.valueOf(interimScoresToFile)));
        }
        return interimScoresToFile;
    }

    public int setMusicCropRatio(int i2) {
        an.c("VEEditor_VEBingoInvoker", "setMusicCropRatio crop:".concat(String.valueOf(i2)));
        int musicCropRatio = this.mNativeBingoHandler.setMusicCropRatio(i2);
        if (musicCropRatio != 0) {
            an.d("VEEditor_VEBingoInvoker", "setMusicCropRatio failed, ret = ".concat(String.valueOf(musicCropRatio)));
        }
        return musicCropRatio;
    }

    public int addVideoClipWithAlgorithm(String[] strArr) {
        MethodCollector.i(7916);
        synchronized (this.mVEEditor) {
            try {
                if (strArr.length == 0) {
                    return -100;
                }
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    an.c("VEEditor_VEBingoInvoker", "addVidoeClipWithAlgorithm...  i: " + i2 + " path: " + strArr[i2]);
                }
                this.mNativeEditor.stop();
                int addVidoeClipWithAlgorithm = this.mNativeBingoHandler.addVidoeClipWithAlgorithm(strArr);
                if (addVidoeClipWithAlgorithm != 0) {
                    an.d("VEEditor_VEBingoInvoker", "addVidoeClipWithAlgorithm failed, ret = ".concat(String.valueOf(addVidoeClipWithAlgorithm)));
                    MethodCollector.o(7916);
                    return addVidoeClipWithAlgorithm;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.o(7916);
                return prepareEngine;
            } finally {
                MethodCollector.o(7916);
            }
        }
    }

    public int deleteVideoClipWithAlgorithm(int i2) {
        MethodCollector.i(7925);
        synchronized (this.mVEEditor) {
            try {
                an.c("VEEditor_VEBingoInvoker", "deleteVideoClipWithAlgorithm... ".concat(String.valueOf(i2)));
                if (i2 < 0) {
                    return -100;
                }
                this.mNativeEditor.stop();
                int deleteVideoClipWithAlgorithm = this.mNativeBingoHandler.deleteVideoClipWithAlgorithm(i2);
                if (deleteVideoClipWithAlgorithm != 0) {
                    an.d("VEEditor_VEBingoInvoker", "deleteVideoClipWithAlgorithm failed, ret = ".concat(String.valueOf(deleteVideoClipWithAlgorithm)));
                    MethodCollector.o(7925);
                    return deleteVideoClipWithAlgorithm;
                }
                int prepareEngine = this.mNativeEditor.prepareEngine(0);
                MethodCollector.o(7925);
                return prepareEngine;
            } finally {
                MethodCollector.o(7925);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public int removeMusic(int i2) {
        MethodCollector.i(8132);
        synchronized (this.mVEEditor) {
            try {
                this.mNativeEditor.stop();
                an.c("VEEditor_VEBingoInvoker", "removeMusic index: ".concat(String.valueOf(i2)));
                int removeMusic = this.mNativeBingoHandler.removeMusic(i2);
                if (removeMusic != 0) {
                    an.d("VEEditor_VEBingoInvoker", "removeMusic failed, ret = ".concat(String.valueOf(removeMusic)));
                    return removeMusic;
                }
                this.mNativeEditor.prepareEngine(0);
                MethodCollector.o(8132);
                return 0;
            } finally {
                MethodCollector.o(8132);
            }
        }
    }

    public int moveVideoClipWithAlgorithm(int i2, int i3) {
        MethodCollector.i(7996);
        synchronized (this.mVEEditor) {
            try {
                an.c("VEEditor_VEBingoInvoker", "moveVideoClipWithAlgorithm... from: " + i2 + " to: " + i3);
                if (i2 != i3 && i2 >= 0) {
                    if (i3 >= 0) {
                        this.mNativeEditor.stop();
                        int moveVideoClipWithAlgorithm = this.mNativeBingoHandler.moveVideoClipWithAlgorithm(i2, i3);
                        if (moveVideoClipWithAlgorithm != 0) {
                            an.d("VEEditor_VEBingoInvoker", "moveVideoClipWithAlgorithm failed, ret = ".concat(String.valueOf(moveVideoClipWithAlgorithm)));
                            MethodCollector.o(7996);
                            return moveVideoClipWithAlgorithm;
                        }
                        int prepareEngine = this.mNativeEditor.prepareEngine(0);
                        MethodCollector.o(7996);
                        return prepareEngine;
                    }
                }
                return -100;
            } finally {
                MethodCollector.o(7996);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public int setAIRotation(int i2, ROTATE_DEGREE rotate_degree) {
        an.c("VEEditor_VEBingoInvoker", "setAIRotation index:" + i2 + " rotation: " + rotate_degree);
        int i3 = AnonymousClass3.f150727a[rotate_degree.ordinal()];
        int i4 = 0;
        if (i3 != 1) {
            if (i3 == 2) {
                i4 = 90;
            } else if (i3 == 3) {
                i4 = LiveFeedRefreshTimeSetting.DEFAULT;
            } else if (i3 == 4) {
                i4 = 270;
            }
        }
        int aIRotation = this.mNativeBingoHandler.setAIRotation(i2, i4);
        if (aIRotation != 0) {
            an.d("VEEditor_VEBingoInvoker", "setAIRotation failed, ret = ".concat(String.valueOf(aIRotation)));
        }
        return aIRotation;
    }

    @Override // com.ss.android.vesdk.f.b
    public int initWithAlgorithm(String[] strArr, x.l lVar) {
        MethodCollector.i(7852);
        synchronized (this.mVEEditor) {
            try {
                TEMonitorInvoker.nativeReset(1);
                h.a(1);
                if (strArr.length == 0) {
                    return -100;
                }
                an.c("VEEditor_VEBingoInvoker", "initWithAlgorithm... ".concat(String.valueOf(lVar)));
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    an.c("VEEditor_VEBingoInvoker", "initWithAlgorithm...  i: " + i2 + " path: " + strArr[i2]);
                }
                this.mVEEditor.I = System.currentTimeMillis();
                this.mVEEditor.J = System.currentTimeMillis();
                int initVideoEditorWithAlgorithm = this.mNativeBingoHandler.initVideoEditorWithAlgorithm(strArr, lVar.ordinal());
                if (initVideoEditorWithAlgorithm != 0) {
                    an.d("VEEditor_VEBingoInvoker", "initVideoEditorWithAlgorithm failed, ret = ".concat(String.valueOf(initVideoEditorWithAlgorithm)));
                    this.mVEEditor.T = false;
                    MethodCollector.o(7852);
                    return initVideoEditorWithAlgorithm;
                }
                this.mVEEditor.T = true;
                com.ss.android.vesdk.runtime.b bVar = this.mVEEditor.f151516e;
                bVar.f151432g = false;
                bVar.f151436k = 0;
                bVar.f151435j = 0;
                this.mVEEditor.Q = lVar;
                this.mVEEditor.K();
                this.mVEEditor.A = 0;
                int L = this.mVEEditor.L();
                MethodCollector.o(7852);
                return L;
            } finally {
                MethodCollector.o(7852);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public int setMusicAndResult(String str, int i2, int i3, VEAlgorithmPath vEAlgorithmPath) {
        MethodCollector.i(8024);
        synchronized (this.mVEEditor) {
            try {
                this.mNativeEditor.stop();
                an.c("VEEditor_VEBingoInvoker", "setMusicAndResult... audioFilePath: " + str + " trimIn: " + i2 + " trimOut: " + i3 + " " + vEAlgorithmPath.toString());
                if ((vEAlgorithmPath.getVeBeatsPath() == null || e.a(vEAlgorithmPath.getVeBeatsPath())) && ((vEAlgorithmPath.getDownBeatsPath() == null || e.a(vEAlgorithmPath.getDownBeatsPath())) && ((vEAlgorithmPath.getNoStrengthBeatsPath() == null || e.a(vEAlgorithmPath.getNoStrengthBeatsPath())) && ((vEAlgorithmPath.getManMadePath() == null || e.a(vEAlgorithmPath.getManMadePath())) && (vEAlgorithmPath.getOnlineBeatsPath() == null || e.a(vEAlgorithmPath.getOnlineBeatsPath())))))) {
                    int musicAndResult = this.mNativeBingoHandler.setMusicAndResult(str, i2, i3, vEAlgorithmPath.getVeBeatsPath(), vEAlgorithmPath.getDownBeatsPath(), vEAlgorithmPath.getNoStrengthBeatsPath(), vEAlgorithmPath.getOnlineBeatsPath(), vEAlgorithmPath.getManMadePath(), vEAlgorithmPath.getType(), vEAlgorithmPath.getMode());
                    if (musicAndResult < 0) {
                        an.d("VEEditor_VEBingoInvoker", "setMusicAndResult failed, ret = ".concat(String.valueOf(musicAndResult)));
                        MethodCollector.o(8024);
                        return musicAndResult;
                    }
                    int prepareEngine = this.mNativeEditor.prepareEngine(0);
                    MethodCollector.o(8024);
                    return prepareEngine;
                }
                an.d("VEEditor_VEBingoInvoker", "file is not exist !");
                return -100;
            } finally {
                MethodCollector.o(8024);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.b
    public int beginGenVideoFrames(final int i2, int i3, boolean z, final VEListener.i iVar) {
        final int i4;
        final int i5;
        int i6;
        int i7;
        int i8;
        an.c("VEEditor_VEBingoInvoker", "beginGenVideoFrames...:" + i2 + ", second:" + i3 + ", hasHWDecode:" + z);
        int i9 = 1;
        if (az.f151042f) {
            if (!z) {
                i9 = 4;
            }
            if (Build.VERSION.SDK_INT < 23) {
                i8 = 2;
                i9 = 2;
            } else {
                i8 = 4;
            }
            return this.mNativeBingoHandler.extractVideoFrames(i2, 1000000 * i3, 2, i8, i9, iVar);
        }
        this.genFrameMap.put(Integer.valueOf(i2), true);
        final String clipPath = this.mNativeBingoHandler.getClipPath(i2);
        if (clipPath.equals("")) {
            an.d("VEEditor_VEBingoInvoker", "getClipPath wrong index: ".concat(String.valueOf(i2)));
            return -100;
        }
        final int[] iArr = new int[10];
        TEVideoUtils.getVideoFileInfo(clipPath, iArr);
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            an.d("VEEditor_VEBingoInvoker", "beginGenVideoFrames error for invalid video size");
            return -1;
        }
        if (iArr[0] > iArr[1]) {
            double d2 = (double) iArr[0];
            Double.isNaN(d2);
            double d3 = (double) iArr[1];
            Double.isNaN(d3);
            int i10 = (int) (d3 / (d2 / 320.0d));
            int i11 = i10 % 16;
            if (i11 >= 8) {
                i10 += 16;
            }
            i5 = i10 - i11;
            i4 = 320;
        } else {
            double d4 = (double) iArr[1];
            Double.isNaN(d4);
            double d5 = (double) iArr[0];
            Double.isNaN(d5);
            int i12 = (int) (d5 / (d4 / 320.0d));
            int i13 = i12 % 16;
            if (i13 >= 8) {
                i12 += 16;
            }
            i4 = i12 - i13;
            i5 = 320;
        }
        int i14 = 3;
        final int i15 = (iArr[3] / (i3 * 1000)) + 1;
        if (z) {
            i6 = i15 / 3;
        } else {
            i14 = i15;
            i6 = i14;
        }
        an.c("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i2 + " second:" + i3 + " hasHWDecode:" + z + " beginGenVideoFrames HWSteps:" + i6);
        final long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (int i16 = 0; i16 < i15; i16 += i14) {
            arrayList.add(Integer.valueOf(i16 * 1000));
        }
        if (arrayList.size() > 0 && ((Integer) arrayList.get(arrayList.size() - 1)).intValue() > 1000) {
            arrayList.set(arrayList.size() - 1, Integer.valueOf(((Integer) arrayList.get(arrayList.size() - 1)).intValue() - 1000));
        }
        final int[] iArr2 = new int[arrayList.size()];
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            iArr2[i17] = ((Integer) arrayList.get(i17)).intValue();
            an.a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i2 + " softList value:" + iArr2[i17]);
        }
        final long[] jArr = {System.currentTimeMillis()};
        new Thread(new Runnable() {
            /* class com.ss.android.vesdk.VEBingoInvoker.AnonymousClass1 */

            static {
                Covode.recordClassIndex(99098);
            }

            public final void run() {
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                TEVideoUtilsCallback tEVideoUtilsCallback = new TEVideoUtilsCallback();
                tEVideoUtilsCallback.setListener(new ad() {
                    /* class com.ss.android.vesdk.VEBingoInvoker.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99099);
                    }

                    @Override // com.ss.android.vesdk.ad
                    public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                        an.a("frameProcessSoft" + i2, " cost time :" + (System.currentTimeMillis() - jArr[0]) + " ptsMs: " + i4);
                        jArr[0] = System.currentTimeMillis();
                        ByteBuffer[] byteBufferArr = byteBufferArr;
                        if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i4;
                            return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i2)).booleanValue();
                        }
                        VEBingoInvoker.this.mNativeBingoHandler.processBingoFrames(byteBufferArr[0], byteBuffer, i2, i3, fArr[0], clipPath);
                        byteBufferArr[0] = null;
                        fArr[0] = 0.0f;
                        VEBingoInvoker.this.progressBack(iVar, i15, i2, currentTimeMillis, iArr);
                        return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i2)).booleanValue();
                    }
                });
                TEVideoUtils.getVideoFramesMore(clipPath, iArr2, i4, i5, false, false, 2, true, tEVideoUtilsCallback);
            }
        }).start();
        if (z) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            for (int i18 = 0; i18 < i6; i18++) {
                int i19 = i18 * 1000;
                if (!arrayList.contains(Integer.valueOf(i19))) {
                    arrayList2.add(Integer.valueOf(i19));
                    an.a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i2 + " hwListOne value:" + i19);
                }
            }
            int i20 = i6;
            while (true) {
                i7 = i6 * 2;
                if (i20 >= i7) {
                    break;
                }
                int i21 = i20 * 1000;
                if (!arrayList.contains(Integer.valueOf(i21))) {
                    arrayList3.add(Integer.valueOf(i21));
                    an.a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i2 + " hwListTwo value:" + i21);
                }
                i20++;
            }
            while (i7 < i15) {
                int i22 = i7 * 1000;
                if (!arrayList.contains(Integer.valueOf(i22))) {
                    arrayList4.add(Integer.valueOf(i22));
                    an.a("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i2 + " hwListThree value:" + i22);
                }
                i7++;
            }
            beginGenFrameHW(clipPath, arrayList2, i4, i5, 2, i15, i2, 1, iArr, currentTimeMillis, iVar);
            beginGenFrameHW(clipPath, arrayList3, i4, i5, 2, i15, i2, 2, iArr, currentTimeMillis, iVar);
            beginGenFrameHW(clipPath, arrayList4, i4, i5, 2, i15, i2, 3, iArr, currentTimeMillis, iVar);
        }
        return 0;
    }

    public void progressBack(VEListener.i iVar, int i2, int i3, long j2, int[] iArr) {
        MethodCollector.i(8346);
        synchronized (this.mVEEditor) {
            try {
                float f2 = (float) i2;
                float f3 = ((float) (this.frameCountCur + 1)) / f2;
                an.c("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i3 + " count:" + this.frameCountCur + " steps:" + i2 + " progress:" + f3);
                if (f3 <= 1.0f && this.genFrameMap.get(Integer.valueOf(i3)).booleanValue()) {
                    an.c("VEEditor_VEBingoInvoker", "HwFrameExtractor_" + i3 + " progressBack < 1 count:" + this.frameCountCur + " steps:" + i2 + " progress:" + f3);
                    int i4 = this.frameCountCur + 1;
                    this.frameCountCur = i4;
                    iVar.a(((float) i4) / f2);
                }
                if (f3 == 1.0f) {
                    long currentTimeMillis = System.currentTimeMillis() - j2;
                    an.c("VEEditor_VEBingoInvoker", "bingo extractFrame " + i3 + " progressBack == 1, count:" + this.frameCountCur + " steps:" + i2 + " progress:" + f3 + ", cost:" + currentTimeMillis);
                    this.frameCountCur = 0;
                    this.genFrameMap.put(Integer.valueOf(i3), false);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("src_width", iArr[0]);
                        jSONObject.put("src_height", iArr[1]);
                        jSONObject.put("src_duration", iArr[3]);
                        jSONObject.put("all_frame_count", i2);
                        jSONObject.put("all_cost_ms", currentTimeMillis);
                        jSONObject.put("mean_cost_ms", (double) (((float) currentTimeMillis) / f2));
                        com.ss.android.ttve.monitor.b.a("vesdk_event_editor_extract_frame_time", jSONObject, "performance", false, true);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            } finally {
                MethodCollector.o(8346);
            }
        }
    }

    private void beginGenFrameHW(final String str, List<Integer> list, final int i2, final int i3, final int i4, final int i5, final int i6, final int i7, final int[] iArr, final long j2, final VEListener.i iVar) {
        final int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = list.get(i8).intValue();
        }
        new Thread(new Runnable() {
            /* class com.ss.android.vesdk.VEBingoInvoker.AnonymousClass2 */

            static {
                Covode.recordClassIndex(99100);
            }

            public final void run() {
                boolean z;
                final ByteBuffer[] byteBufferArr = {null};
                final float[] fArr = {0.0f};
                final long[] jArr = {System.currentTimeMillis()};
                a aVar = new a(str, iArr2, i2, i3, i4, i6, new ad() {
                    /* class com.ss.android.vesdk.VEBingoInvoker.AnonymousClass2.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(99101);
                    }

                    @Override // com.ss.android.vesdk.ad
                    public final boolean processFrame(ByteBuffer byteBuffer, int i2, int i3, int i4) {
                        String str;
                        String str2 = "frameProcessHW" + i6 + "_" + i7;
                        StringBuilder append = new StringBuilder(" cost time :").append(System.currentTimeMillis() - jArr[0]).append(" ptsMs: ").append(i4).append(" frame is ");
                        if (byteBuffer == null) {
                            str = "null";
                        } else {
                            str = "not null";
                        }
                        an.a(str2, append.append(str).toString());
                        jArr[0] = System.currentTimeMillis();
                        if (byteBuffer == null) {
                            byteBufferArr[0] = null;
                            VEBingoInvoker.this.progressBack(iVar, i5, i6, j2, iArr);
                            return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i6)).booleanValue();
                        }
                        ByteBuffer[] byteBufferArr = byteBufferArr;
                        if (byteBufferArr[0] == null) {
                            byteBufferArr[0] = byteBuffer;
                            fArr[0] = (float) i4;
                            return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i6)).booleanValue();
                        }
                        VEBingoInvoker.this.mNativeBingoHandler.processBingoFrames(byteBufferArr[0], byteBuffer, i2, i3, fArr[0], str);
                        byteBufferArr[0] = null;
                        fArr[0] = 0.0f;
                        VEBingoInvoker.this.progressBack(iVar, i5, i6, j2, iArr);
                        return VEBingoInvoker.this.genFrameMap.get(Integer.valueOf(i6)).booleanValue();
                    }
                });
                try {
                    an.a(aVar.f61276b, "method start begin");
                    if (aVar.f61278f.length <= 0) {
                        an.a(aVar.f61276b, "ptsMs.length is wrong: " + aVar.f61278f.length);
                        return;
                    }
                    if (a.f61273c == null || a.f61274d == null) {
                        String lowerCase = com.ss.android.ttve.common.a.a().toLowerCase();
                        if (lowerCase.contains("qualcomm")) {
                            a.f61273c = "qualcomm";
                            if (lowerCase.contains("sdm660")) {
                                a.f61274d = "sdm660";
                            } else if (lowerCase.contains("msm8994")) {
                                a.f61274d = "msm8994";
                            } else if (lowerCase.contains("sdm845")) {
                                a.f61274d = "sdm845";
                            } else if (lowerCase.contains("sm8150")) {
                                a.f61274d = "sm8150";
                            } else {
                                a.f61274d = "";
                            }
                        }
                    }
                    aVar.q = System.currentTimeMillis();
                    MediaExtractor mediaExtractor = new MediaExtractor();
                    mediaExtractor.setDataSource(aVar.f61277e);
                    int i2 = aVar.f61279g;
                    int i3 = aVar.f61280h;
                    MediaFormat mediaFormat = null;
                    for (int i4 = 0; i4 < mediaExtractor.getTrackCount(); i4++) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i4);
                        if (trackFormat.getString("mime").startsWith("video")) {
                            aVar.s = trackFormat.getInteger("width");
                            aVar.t = trackFormat.getInteger("height");
                            aVar.r = trackFormat.getInteger("rotation-degrees");
                            if (aVar.r != 0) {
                                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((aVar.f61279g * aVar.f61280h) * 3) / 2);
                                allocateDirect.clear();
                                aVar.o = VEFrame.createByteBufferFrame(allocateDirect, aVar.f61279g, aVar.f61280h, 0, 0, VEFrame.a.TEPixFmt_YUV420P);
                                if (aVar.r == 90 || aVar.r == 270) {
                                    i2 = aVar.f61280h;
                                    i3 = aVar.f61279g;
                                }
                            }
                            mediaExtractor.selectTrack(i4);
                            mediaFormat = trackFormat;
                        }
                    }
                    if (aVar.f61285m == null) {
                        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i2 * i3) * 3) / 2);
                        allocateDirect2.clear();
                        aVar.f61285m = VEFrame.createByteBufferFrame(allocateDirect2, i2, i3, aVar.r, 0, VEFrame.a.TEPixFmt_YUV420P);
                    }
                    aVar.p = MediaCodec.createDecoderByType("video/avc");
                    ArrayList arrayList = new ArrayList();
                    mediaExtractor.seekTo((long) aVar.f61278f[0], 2);
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = aVar.f61282j;
                    while (true) {
                        long sampleTime = mediaExtractor.getSampleTime();
                        if (sampleTime < 0 && mediaExtractor.advance()) {
                            aVar.z = true;
                            break;
                        }
                        arrayList2.add(Long.valueOf(sampleTime));
                        if (mediaExtractor.getSampleFlags() == 1) {
                            z = true;
                            arrayList.add(Long.valueOf(sampleTime));
                        } else {
                            z = false;
                        }
                        if (sampleTime > ((long) aVar.f61278f[aVar.f61278f.length - 1]) && z) {
                            i5--;
                        }
                        if (mediaExtractor.advance()) {
                            if (i5 <= 0) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (aVar.z) {
                        an.a(aVar.f61276b, "start wrong");
                        aVar.b();
                        return;
                    }
                    Collections.sort(arrayList2);
                    int length = aVar.f61278f.length;
                    List[] listArr = new List[length];
                    int size = arrayList2.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < size && i7 < aVar.f61278f.length) {
                        if (((Long) arrayList2.get(i6)).longValue() < ((long) aVar.f61278f[i7])) {
                            i6++;
                        } else {
                            if (listArr[i7] == null) {
                                listArr[i7] = new ArrayList();
                            }
                            for (int i8 = 0; i8 < aVar.f61282j; i8++) {
                                int i9 = i6 + i8;
                                if (i9 < size) {
                                    listArr[i7].add(arrayList2.get(i9));
                                }
                            }
                            i6++;
                            i7++;
                        }
                    }
                    if (listArr[aVar.f61278f.length - 1] != null && listArr[aVar.f61278f.length - 1].size() == 1) {
                        listArr[aVar.f61278f.length - 1].add(listArr[aVar.f61278f.length - 1].get(0));
                        listArr[aVar.f61278f.length - 1].set(0, arrayList2.get(arrayList2.size() - 2));
                    }
                    for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                        an.a(aVar.f61276b, "pts value:" + arrayList2.get(i10));
                    }
                    for (int i11 = 0; i11 < length; i11++) {
                        List list = listArr[i11];
                        for (int i12 = 0; i12 < list.size(); i12++) {
                            an.a(aVar.f61276b, "sensArray i: " + i12 + " value: " + list.get(i12).toString());
                        }
                    }
                    mediaExtractor.seekTo((long) aVar.f61278f[0], 0);
                    aVar.u = new HandlerThread("MediaCodec Callback");
                    an.a(aVar.f61276b, "getVideoFramesHW: mCodecHandlerThread = " + aVar.u.getThreadId() + ", curr-threadId = " + aVar.f61275a);
                    aVar.u.start();
                    aVar.p.setCallback(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02f8: INVOKE  
                          (wrap: android.media.MediaCodec : 0x02f1: IGET  (r1v13 android.media.MediaCodec) = (r3v1 'aVar' com.ss.android.ttve.nativePort.a) com.ss.android.ttve.nativePort.a.p android.media.MediaCodec)
                          (wrap: com.ss.android.ttve.nativePort.a$1 : 0x02f5: CONSTRUCTOR  (r0v52 com.ss.android.ttve.nativePort.a$1) = 
                          (r3v1 'aVar' com.ss.android.ttve.nativePort.a)
                          (r4v1 'mediaExtractor' android.media.MediaExtractor)
                          (r6v4 'listArr' java.util.List[])
                          (r7v3 'arrayList' java.util.ArrayList)
                         call: com.ss.android.ttve.nativePort.a.1.<init>(com.ss.android.ttve.nativePort.a, android.media.MediaExtractor, java.util.List[], java.util.List):void type: CONSTRUCTOR)
                          (wrap: android.os.Handler : 0x02ee: CONSTRUCTOR  (r8v6 android.os.Handler) = 
                          (wrap: android.os.Looper : 0x02ea: INVOKE  (r0v51 android.os.Looper) = 
                          (wrap: android.os.HandlerThread : 0x02e8: IGET  (r0v50 android.os.HandlerThread) = (r3v1 'aVar' com.ss.android.ttve.nativePort.a) com.ss.android.ttve.nativePort.a.u android.os.HandlerThread)
                         type: VIRTUAL call: android.os.HandlerThread.getLooper():android.os.Looper)
                         call: android.os.Handler.<init>(android.os.Looper):void type: CONSTRUCTOR)
                         type: VIRTUAL call: android.media.MediaCodec.setCallback(android.media.MediaCodec$Callback, android.os.Handler):void in method: com.ss.android.vesdk.VEBingoInvoker.2.run():void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:306)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:69)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02f5: CONSTRUCTOR  (r0v52 com.ss.android.ttve.nativePort.a$1) = 
                          (r3v1 'aVar' com.ss.android.ttve.nativePort.a)
                          (r4v1 'mediaExtractor' android.media.MediaExtractor)
                          (r6v4 'listArr' java.util.List[])
                          (r7v3 'arrayList' java.util.ArrayList)
                         call: com.ss.android.ttve.nativePort.a.1.<init>(com.ss.android.ttve.nativePort.a, android.media.MediaExtractor, java.util.List[], java.util.List):void type: CONSTRUCTOR in method: com.ss.android.vesdk.VEBingoInvoker.2.run():void, file: classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 27 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ttve.nativePort.a, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 33 more
                        */
                    /*
                    // Method dump skipped, instructions count: 940
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEBingoInvoker.AnonymousClass2.run():void");
                }
            }).start();
        }
    }
