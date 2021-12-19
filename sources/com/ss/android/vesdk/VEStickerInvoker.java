package com.ss.android.vesdk;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ttve.monitor.b;
import com.ss.android.ttve.monitor.e;
import com.ss.android.ttve.monitor.i;
import com.ss.android.ttve.nativePort.NativeCallbacks;
import com.ss.android.ttve.nativePort.TEInterface;
import com.ss.android.vesdk.VEListener;
import com.ss.android.vesdk.f.f;
import com.ss.android.vesdk.filterparam.VEStickerPinAreaParam;
import com.ss.android.vesdk.g.a;
import com.ss.android.vesdk.jni.TEStikcerInterface;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import com.ss.android.vesdk.x;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public class VEStickerInvoker implements f {
    private final TEInterface mNativeEditor;
    private final TEStikcerInterface mNativeStickerHandler;
    private int mStickerAnimationPreviewDuration = 3000;
    private float mStickerAnimationPreviewFps = 30.0f;
    private final x mVEEditor;

    static {
        Covode.recordClassIndex(99212);
    }

    @Override // com.ss.android.vesdk.f.f
    public void clearNativeFromSticker() {
        this.mNativeStickerHandler.f151338a = 0;
    }

    public int get2DBrushStrokeCount() {
        return this.mNativeStickerHandler.a();
    }

    public boolean is2DBrushEmpty() {
        if (this.mNativeStickerHandler.a() == 0) {
            return true;
        }
        return false;
    }

    public int begin2DBrush() {
        MethodCollector.i(13374);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(13374);
            return -112;
        }
        int nativeBegin2DBrush = tEStikcerInterface.nativeBegin2DBrush(tEStikcerInterface.f151338a);
        MethodCollector.o(13374);
        return nativeBegin2DBrush;
    }

    public int getTextLimitCount() {
        MethodCollector.i(11083);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(11083);
            return -112;
        }
        int nativeGetTextLimitCount = tEStikcerInterface.nativeGetTextLimitCount(tEStikcerInterface.f151338a);
        MethodCollector.o(11083);
        return nativeGetTextLimitCount;
    }

    public int undo2DBrush() {
        MethodCollector.i(13599);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(13599);
            return -112;
        }
        int nativeUndo2DBrush = tEStikcerInterface.nativeUndo2DBrush(tEStikcerInterface.f151338a);
        MethodCollector.o(13599);
        return nativeUndo2DBrush;
    }

    @Override // com.ss.android.vesdk.f.f
    public int addInfoStickerWithBuffer() {
        int i2;
        MethodCollector.i(7614);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "addInfoStickerWithBuffer...");
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i2 = -112;
                } else {
                    i2 = tEStikcerInterface.nativeAddInfoStickerWithBuffer(tEStikcerInterface.f151338a);
                }
            } finally {
                MethodCollector.o(7614);
            }
        }
        return i2;
    }

    public int stopStickerAnimationPreview() {
        int a2;
        MethodCollector.i(9280);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "stopStickerAnimationPreview");
                a2 = this.mNativeStickerHandler.a(false, 0, 0);
            } finally {
                MethodCollector.o(9280);
            }
        }
        return a2;
    }

    public VEStickerInvoker(x xVar) {
        this.mVEEditor = xVar;
        TEInterface tEInterface = xVar.B;
        this.mNativeEditor = tEInterface;
        this.mNativeStickerHandler = new TEStikcerInterface(tEInterface.getNativeHandler());
    }

    public int end2DBrush(String str) {
        MethodCollector.i(13462);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(13462);
            return -112;
        }
        int nativeEnd2DBrush = tEStikcerInterface.nativeEnd2DBrush(tEStikcerInterface.f151338a, str);
        MethodCollector.o(13462);
        return nativeEnd2DBrush;
    }

    public int notifyHideKeyBoard(boolean z) {
        MethodCollector.i(10923);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(10923);
            return -112;
        }
        int nativeNotifyHideKeyBoard = tEStikcerInterface.nativeNotifyHideKeyBoard(tEStikcerInterface.f151338a, z);
        MethodCollector.o(10923);
        return nativeNotifyHideKeyBoard;
    }

    public int set2DBrushCanvasAlpha(float f2) {
        MethodCollector.i(13598);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(13598);
            return -112;
        }
        int nativeSet2DBrushCanvasColor = tEStikcerInterface.nativeSet2DBrushCanvasColor(tEStikcerInterface.f151338a, f2);
        MethodCollector.o(13598);
        return nativeSet2DBrushCanvasColor;
    }

    public int set2DBrushSize(float f2) {
        MethodCollector.i(13463);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(13463);
            return -112;
        }
        int nativeSet2DBrushSize = tEStikcerInterface.nativeSet2DBrushSize(tEStikcerInterface.f151338a, f2);
        MethodCollector.o(13463);
        return nativeSet2DBrushSize;
    }

    public int setLanguage(String str) {
        MethodCollector.i(10924);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(10924);
            return -112;
        }
        int nativeSetLanguage = tEStikcerInterface.nativeSetLanguage(tEStikcerInterface.f151338a, str);
        MethodCollector.o(10924);
        return nativeSetLanguage;
    }

    public int addEmojiSticker(String str) {
        an.a("VEEditor_VEStickerInvoker", "addEmojiSticker... utf8Code: ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            return addInfoSticker(str, new String[]{"lv_emoji"});
        }
        an.d("VEEditor_VEStickerInvoker", "addEmojiSticker error, utf8Code is null");
        return -100;
    }

    public int addTextSticker(String str) {
        int addInfoSticker;
        MethodCollector.i(7519);
        if (TextUtils.isEmpty(str)) {
            an.d("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            MethodCollector.o(7519);
            return -100;
        }
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "addTextSticker...");
                addInfoSticker = addInfoSticker(str, new String[]{"lv_new_text"});
            } finally {
                MethodCollector.o(7519);
            }
        }
        return addInfoSticker;
    }

    public int deleteSticker(int i2) {
        MethodCollector.i(9468);
        an.c("VEEditor_VEStickerInvoker", "deleteSticker...");
        if (i2 < 0) {
            MethodCollector.o(9468);
            return -100;
        }
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(9468);
            return -112;
        }
        int nativeDeleteSubTrack = tEStikcerInterface.nativeDeleteSubTrack(tEStikcerInterface.f151338a, i2);
        MethodCollector.o(9468);
        return nativeDeleteSubTrack;
    }

    @Override // com.ss.android.vesdk.f.f
    public float[] getInfoStickerBoundingBox(int i2) {
        float[] a2;
        MethodCollector.i(7523);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "getInfoStickerBoundingBox... index: ".concat(String.valueOf(i2)));
                if (i2 >= 0) {
                    a2 = this.mNativeStickerHandler.a(i2, true);
                } else {
                    z zVar = new z(-100, "");
                    MethodCollector.o(7523);
                    throw zVar;
                }
            } finally {
                MethodCollector.o(7523);
            }
        }
        return a2;
    }

    public float[] getInfoStickerBoundingBoxWithoutRotate(int i2) {
        float[] a2;
        MethodCollector.i(7603);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "getInfoStickerBoundingBox... index:".concat(String.valueOf(i2)));
                if (i2 >= 0) {
                    a2 = this.mNativeStickerHandler.a(i2, false);
                } else {
                    z zVar = new z(-100, "");
                    MethodCollector.o(7603);
                    throw zVar;
                }
            } finally {
                MethodCollector.o(7603);
            }
        }
        return a2;
    }

    public int getTextContent(x.d dVar) {
        MethodCollector.i(11246);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(11246);
            return -112;
        }
        tEStikcerInterface.nativeGetTextContentCallback(tEStikcerInterface.f151338a, new NativeCallbacks.OnARTextContentCallback(dVar) {
            /* class com.ss.android.vesdk.jni.TEStikcerInterface.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x.d f151340a;

            static {
                Covode.recordClassIndex(99525);
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.OnARTextContentCallback
            public final void onResult(String[] strArr) {
            }

            {
                this.f151340a = r2;
            }
        });
        MethodCollector.o(11246);
        return 0;
    }

    @Override // com.ss.android.vesdk.f.f
    public boolean isInfoStickerAnimatable(int i2) {
        boolean z;
        MethodCollector.i(7825);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "isInfoStickerAnimatable...");
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                z = false;
                if (tEStikcerInterface.f151338a != 0) {
                    if (tEStikcerInterface.f151339b >= 0) {
                        z = tEStikcerInterface.nativeIsInfoStickerAnimatable(tEStikcerInterface.f151338a, i2);
                    }
                }
            } finally {
                MethodCollector.o(7825);
            }
        }
        return z;
    }

    public int pauseEffectAudio(boolean z) {
        int nativePauseEffectAudio;
        MethodCollector.i(13224);
        an.c("VEEditor_VEStickerInvoker", "pauseEffectAudio");
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            nativePauseEffectAudio = -112;
        } else {
            nativePauseEffectAudio = tEStikcerInterface.nativePauseEffectAudio(tEStikcerInterface.f151338a, z);
            if (nativePauseEffectAudio == 0) {
                MethodCollector.o(13224);
                return nativePauseEffectAudio;
            }
        }
        an.d("VEEditor_VEStickerInvoker", "pauseEffectAudio failed, ret = ".concat(String.valueOf(nativePauseEffectAudio)));
        MethodCollector.o(13224);
        return nativePauseEffectAudio;
    }

    public int pauseInfoStickerAnimation(boolean z) {
        int i2;
        MethodCollector.i(7828);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "pauseInfoStickerAnimation...");
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i2 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i2 = -105;
                } else {
                    i2 = tEStikcerInterface.nativePauseInfoStickerAnimation(tEStikcerInterface.f151338a, z);
                }
            } finally {
                MethodCollector.o(7828);
            }
        }
        return i2;
    }

    public int set2DBrushColor(int i2) {
        MethodCollector.i(13534);
        float f2 = ((float) ((i2 >>> 24) & 255)) * 0.003921569f;
        float f3 = ((float) ((i2 >>> 16) & 255)) * 0.003921569f;
        float f4 = ((float) ((i2 >>> 8) & 255)) * 0.003921569f;
        float f5 = ((float) (i2 & 255)) * 0.003921569f;
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(13534);
            return -112;
        }
        int nativeSet2DBrushColor = tEStikcerInterface.nativeSet2DBrushColor(tEStikcerInterface.f151338a, f3, f4, f5, f2);
        MethodCollector.o(13534);
        return nativeSet2DBrushColor;
    }

    public int setEffectBgmEnable(boolean z) {
        int nativeSetEffectBgmEnable;
        MethodCollector.i(13300);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            nativeSetEffectBgmEnable = -112;
        } else {
            nativeSetEffectBgmEnable = tEStikcerInterface.nativeSetEffectBgmEnable(tEStikcerInterface.f151338a, z);
            if (nativeSetEffectBgmEnable == 0) {
                MethodCollector.o(13300);
                return nativeSetEffectBgmEnable;
            }
        }
        an.d("VEEditor_VEStickerInvoker", "setEffectBgmEnable failed, ret = ".concat(String.valueOf(nativeSetEffectBgmEnable)));
        MethodCollector.o(13300);
        return nativeSetEffectBgmEnable;
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerBufferCallback(VEListener.VEInfoStickerBufferListener vEInfoStickerBufferListener) {
        MethodCollector.i(7777);
        an.c("VEEditor_VEStickerInvoker", "setInfoStickerBufferCallback...");
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(7777);
            return -112;
        }
        int nativeSetInfoStickerBufferCallback = tEStikcerInterface.nativeSetInfoStickerBufferCallback(tEStikcerInterface.f151338a, vEInfoStickerBufferListener);
        MethodCollector.o(7777);
        return nativeSetInfoStickerBufferCallback;
    }

    public int setInfoStickerCallSync(boolean z) {
        int i2;
        MethodCollector.i(9790);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "setInfoStickerCallSync... ".concat(String.valueOf(z)));
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i2 = -112;
                } else {
                    i2 = tEStikcerInterface.nativeSetInfoStickerCallSync(tEStikcerInterface.f151338a, z);
                }
            } finally {
                MethodCollector.o(9790);
            }
        }
        return i2;
    }

    public int setTextBitmapCallback(x.c cVar) {
        MethodCollector.i(11408);
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            MethodCollector.o(11408);
            return -112;
        }
        tEStikcerInterface.nativeSetTextBitmapCallback(tEStikcerInterface.f151338a, new NativeCallbacks.OnARTextBitmapCallback(cVar) {
            /* class com.ss.android.vesdk.jni.TEStikcerInterface.AnonymousClass2 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x.c f151342a;

            static {
                Covode.recordClassIndex(99526);
            }

            {
                this.f151342a = r2;
            }

            @Override // com.ss.android.ttve.nativePort.NativeCallbacks.OnARTextBitmapCallback
            public final BefTextLayoutResult onResult(String str, BefTextLayout befTextLayout) {
                x.c cVar = this.f151342a;
                if (cVar != null) {
                    return cVar.a();
                }
                return null;
            }
        });
        MethodCollector.o(11408);
        return 0;
    }

    @Override // com.ss.android.vesdk.f.f
    public int beginInfoStickerPin(int i2) {
        int i3;
        MethodCollector.i(11743);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin beginInfoStickerPin... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(11743);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    int nativeBeginInfoStickerPin = tEStikcerInterface.nativeBeginInfoStickerPin(tEStikcerInterface.f151338a, i2);
                    if (nativeBeginInfoStickerPin != 0) {
                        i3 = -1;
                    } else {
                        MethodCollector.o(11743);
                        return nativeBeginInfoStickerPin;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin beginInfoStickerPin... faild ret:".concat(String.valueOf(i3)));
                return i3;
            } finally {
                MethodCollector.o(11743);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int cancelInfoStickerPin(int i2) {
        int i3;
        MethodCollector.i(11907);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin cancelInfoStickerPin... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(11907);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    int nativeCancelInfoStickerPin = tEStikcerInterface.nativeCancelInfoStickerPin(tEStikcerInterface.f151338a, i2);
                    if (nativeCancelInfoStickerPin != 0) {
                        i3 = -1;
                    } else {
                        MethodCollector.o(11907);
                        return nativeCancelInfoStickerPin;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin cancelInfoStickerPin... faild ret:".concat(String.valueOf(i3)));
                return i3;
            } finally {
                MethodCollector.o(11907);
            }
        }
    }

    public int getInfoStickerPinState(int i2) {
        int i3;
        MethodCollector.i(12365);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinState... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(12365);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    i3 = tEStikcerInterface.nativeGetInfoStickerPinState(tEStikcerInterface.f151338a, i2);
                    if (i3 >= 0) {
                        an.c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinState... state:".concat(String.valueOf(i3)));
                        MethodCollector.o(12365);
                        return i3;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinState... faild ret:".concat(String.valueOf(i3)));
                return i3;
            } finally {
                MethodCollector.o(12365);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public float getInfoStickerRotate(int i2) {
        float f2;
        MethodCollector.i(8388);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerRotate... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(8388);
                return -100.0f;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    f2 = -112.0f;
                } else if (tEStikcerInterface.f151339b < 0) {
                    f2 = -105.0f;
                } else {
                    f2 = tEStikcerInterface.nativeGetInfoStickerRotate(tEStikcerInterface.f151338a, i2);
                }
                an.a("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerRotate... ret:".concat(String.valueOf(f2)));
                return f2;
            } finally {
                MethodCollector.o(8388);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public float getInfoStickerScale(int i2) {
        float f2;
        MethodCollector.i(8383);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerScale... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(8383);
                return -100.0f;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    f2 = -112.0f;
                } else if (tEStikcerInterface.f151339b < 0) {
                    f2 = -105.0f;
                } else {
                    f2 = tEStikcerInterface.nativeGetInfoStickerScale(tEStikcerInterface.f151338a, i2);
                    if (f2 < 0.0f) {
                        f2 = -1.0f;
                    } else if (f2 >= 0.0f) {
                        MethodCollector.o(8383);
                        return f2;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerScale... faild ret:".concat(String.valueOf(f2)));
                return f2;
            } finally {
                MethodCollector.o(8383);
            }
        }
    }

    public String getInfoStickerTemplateParams(int i2) {
        String nativeGetInfoStickerTemplateParam;
        MethodCollector.i(10609);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "getInfoStickerTemplateParams... index: ".concat(String.valueOf(i2)));
                if (i2 >= 0) {
                    TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                    if (tEStikcerInterface.f151338a == 0) {
                        nativeGetInfoStickerTemplateParam = "";
                    } else if (tEStikcerInterface.f151339b < 0) {
                        nativeGetInfoStickerTemplateParam = "";
                    } else {
                        nativeGetInfoStickerTemplateParam = tEStikcerInterface.nativeGetInfoStickerTemplateParam(tEStikcerInterface.f151338a, i2);
                    }
                } else {
                    z zVar = new z(-100, "");
                    MethodCollector.o(10609);
                    throw zVar;
                }
            } finally {
                MethodCollector.o(10609);
            }
        }
        return nativeGetInfoStickerTemplateParam;
    }

    @Override // com.ss.android.vesdk.f.f
    public boolean getInfoStickerVisible(int i2) {
        MethodCollector.i(8257);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerVisible... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            boolean z = true;
            if (i2 < 0) {
                MethodCollector.o(8257);
                return true;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a != 0) {
                    if (tEStikcerInterface.f151339b >= 0) {
                        z = tEStikcerInterface.nativeGetInfoStickerVisible(tEStikcerInterface.f151338a, i2);
                    }
                }
                an.a("VEEditor_VEStickerInvoker", "infoStickerPin  getInfoStickerVisible... ret:".concat(String.valueOf(z)));
                return z;
            } finally {
                MethodCollector.o(8257);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int removeInfoSticker(int i2) {
        int i3;
        MethodCollector.i(7443);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "removeInfoSticker... index: ".concat(String.valueOf(i2)));
                if (i2 < 0) {
                    return -100;
                }
                this.mVEEditor.ac.a(1, i2);
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    i3 = tEStikcerInterface.nativeRemoveInfoSticker(tEStikcerInterface.f151338a, i2);
                }
                MethodCollector.o(7443);
                return i3;
            } finally {
                MethodCollector.o(7443);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerRestoreMode(int i2) {
        int i3;
        MethodCollector.i(8547);
        an.a("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerRestoreMode... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(8547);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    int nativeSetInfoStickerRestoreMode = tEStikcerInterface.nativeSetInfoStickerRestoreMode(tEStikcerInterface.f151338a, i2);
                    if (nativeSetInfoStickerRestoreMode != 0) {
                        i3 = -1;
                    } else {
                        MethodCollector.o(8547);
                        return nativeSetInfoStickerRestoreMode;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerRestoreMode... faild ret:".concat(String.valueOf(i3)));
                return i3;
            } finally {
                MethodCollector.o(8547);
            }
        }
    }

    public int stopInfoStickerPin(int i2) {
        int i3;
        MethodCollector.i(12057);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin stopInfoStickerPin... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(12057);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    int nativeStopInfoStickerPin = tEStikcerInterface.nativeStopInfoStickerPin(tEStikcerInterface.f151338a, i2);
                    if (nativeStopInfoStickerPin != 0) {
                        i3 = -1;
                    } else {
                        MethodCollector.o(12057);
                        return nativeStopInfoStickerPin;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin stopInfoStickerPin... faild ret:".concat(String.valueOf(i3)));
                return i3;
            } finally {
                MethodCollector.o(12057);
            }
        }
    }

    public String getInfoStickerTemplateParams(String str) {
        String nativeGetInfoStickerTemplateParamWithPath;
        MethodCollector.i(10763);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "[getInfoStickerTemplateParams] path: ".concat(String.valueOf(str)));
                if (str.trim().length() != 0) {
                    TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                    if (tEStikcerInterface.f151338a == 0) {
                        an.d("TEMVInterface", "[getInfoStickerTemplateParam] mNative wrong value");
                        nativeGetInfoStickerTemplateParamWithPath = "";
                    } else if (tEStikcerInterface.f151339b < 0) {
                        an.d("TEMVInterface", "[getInfoStickerTemplateParam] no host tack");
                        nativeGetInfoStickerTemplateParamWithPath = "";
                    } else {
                        nativeGetInfoStickerTemplateParamWithPath = tEStikcerInterface.nativeGetInfoStickerTemplateParamWithPath(tEStikcerInterface.f151338a, str);
                    }
                } else {
                    z zVar = new z(-100, "empty or blank path");
                    MethodCollector.o(10763);
                    throw zVar;
                }
            } finally {
                MethodCollector.o(10763);
            }
        }
        return nativeGetInfoStickerTemplateParamWithPath;
    }

    public int enableStickerResourceLoadSync(int i2, boolean z) {
        return this.mNativeEditor.setFilterParam(i2, "effect sync load resource", String.valueOf(z));
    }

    public int addInfoStickerOrEmoji(String str, String str2) {
        an.a("VEEditor_VEStickerInvoker", "addInfoStickerOrEmoji... path: " + str + ", utf8Code: " + str2);
        if (TextUtils.isEmpty(str)) {
            return addEmojiSticker(str2);
        }
        return addInfoSticker(str, new String[]{"default"});
    }

    public int forceUpdateInfoSticker(int i2, boolean z) {
        String str;
        MethodCollector.i(10127);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "forceUpdateInfoSticker... index: ".concat(String.valueOf(i2)));
                if (i2 < 0) {
                    return -100;
                }
                TEInterface tEInterface = this.mNativeEditor;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                int filterParam = tEInterface.setFilterParam(i2, "entity data force update", str);
                MethodCollector.o(10127);
                return filterParam;
            } finally {
                MethodCollector.o(10127);
            }
        }
    }

    public int setInfoStickerTemplateParams(int i2, String str) {
        MethodCollector.i(10297);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "setInfoStickerTemplateParams... index: ".concat(String.valueOf(i2)));
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity template param", str);
                MethodCollector.o(10297);
                return filterParam;
            } finally {
                MethodCollector.o(10297);
            }
        }
    }

    public int setSrtFont(int i2, String str) {
        MethodCollector.i(12613);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setSrtFont");
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity srt font", str);
                MethodCollector.o(12613);
                return filterParam;
            } finally {
                MethodCollector.o(12613);
            }
        }
    }

    public int setSrtManipulateState(int i2, boolean z) {
        MethodCollector.i(12954);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setSrtManipulateState");
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity srt manipulate state", String.valueOf(z));
                MethodCollector.o(12954);
                return filterParam;
            } finally {
                MethodCollector.o(12954);
            }
        }
    }

    public int setStickerAnimator(int i2, VEStickerAnimator vEStickerAnimator) {
        int nativeGetSubTrackFilter;
        MethodCollector.i(7877);
        an.c("VEEditor_VEStickerInvoker", "addAnimator...");
        if (i2 < 0 || vEStickerAnimator == null) {
            MethodCollector.o(7877);
            return -100;
        }
        TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
        if (tEStikcerInterface.f151338a == 0) {
            nativeGetSubTrackFilter = -112;
        } else {
            nativeGetSubTrackFilter = tEStikcerInterface.nativeGetSubTrackFilter(tEStikcerInterface.f151338a, i2);
            if (nativeGetSubTrackFilter >= 0) {
                int filterParam = this.mNativeEditor.setFilterParam(nativeGetSubTrackFilter, "animator", vEStickerAnimator);
                MethodCollector.o(7877);
                return filterParam;
            }
        }
        MethodCollector.o(7877);
        return nativeGetSubTrackFilter;
    }

    public int startStickerAnimationPreview(int i2, int i3) {
        int a2;
        MethodCollector.i(9092);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "startStickerAnimationPreview duration:" + i2 + ", mode:" + i3);
                this.mStickerAnimationPreviewDuration = i2;
                a2 = this.mNativeStickerHandler.a(true, i2, i3);
            } finally {
                MethodCollector.o(9092);
            }
        }
        return a2;
    }

    @Override // com.ss.android.vesdk.f.f
    public int addInfoSticker(String str, String[] strArr) {
        int a2;
        int i2;
        MethodCollector.i(7380);
        an.a("VEEditor_VEStickerInvoker", "addInfoSticker...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7380);
            return -100;
        }
        e.a("iesve_veeditor_import_sticker", 1, (a) null);
        synchronized (this.mVEEditor) {
            try {
                a2 = this.mNativeStickerHandler.a(str, strArr);
            } finally {
                MethodCollector.o(7380);
            }
        }
        i.a aVar = new i.a();
        aVar.f61226a = str;
        this.mVEEditor.ac.a(1, a2, aVar);
        an.a("VEEditor_VEStickerInvoker", "addInfoSticker success with index ".concat(String.valueOf(a2)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (a2 >= 0) {
                i2 = 0;
            } else {
                i2 = -1;
            }
            jSONObject.put("resultCode", i2);
            b.a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return a2;
    }

    public int addTextStickerWithInitInfo(String str, String str2) {
        int addInfoStickerWithInitInfo;
        MethodCollector.i(9960);
        if (TextUtils.isEmpty(str)) {
            an.d("VEEditor_VEStickerInvoker", "addTextSticker error, json is null");
            MethodCollector.o(9960);
            return -100;
        } else if (TextUtils.isEmpty(str2)) {
            an.d("VEEditor_VEStickerInvoker", "addTextSticker error, initInfoJson is null");
            MethodCollector.o(9960);
            return -100;
        } else {
            synchronized (this.mVEEditor) {
                try {
                    an.a("VEEditor_VEStickerInvoker", "addTextSticker...");
                    addInfoStickerWithInitInfo = addInfoStickerWithInitInfo(str, new String[]{"lv_new_text"}, str2);
                } finally {
                    MethodCollector.o(9960);
                }
            }
            return addInfoStickerWithInitInfo;
        }
    }

    public int enableStickerAnimationPreview(int i2, boolean z) {
        int i3;
        MethodCollector.i(8898);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "enableStickerAnimationPreview index:" + i2 + ", enable:" + z);
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else {
                    i3 = tEStikcerInterface.nativeSetInfoStickerAnimationPreview(tEStikcerInterface.f151338a, i2, z);
                }
            } finally {
                MethodCollector.o(8898);
            }
        }
        return i3;
    }

    public int getInfoStickerFlip(int i2, boolean[] zArr) {
        MethodCollector.i(8202);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "getInfoStickerFlip...");
                int i3 = -100;
                if (i2 < 0 || zArr.length != 2) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b >= 0 && (i3 = tEStikcerInterface.nativeGetInfoStickerFlip(tEStikcerInterface.f151338a, i2, zArr)) != 0) {
                    i3 = -1;
                }
                MethodCollector.o(8202);
                return i3;
            } finally {
                MethodCollector.o(8202);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int getInfoStickerPinData(int i2, ByteBuffer[] byteBufferArr) {
        int i3;
        MethodCollector.i(12218);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinData... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(12218);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    i3 = tEStikcerInterface.nativeGetInfoStickerPinData(tEStikcerInterface.f151338a, i2, byteBufferArr);
                    if (i3 >= 0) {
                        MethodCollector.o(12218);
                        return i3;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin getInfoStickerPinData... faild ");
                return i3;
            } finally {
                MethodCollector.o(12218);
            }
        }
    }

    public int getInfoStickerPosition(int i2, float[] fArr) {
        MethodCollector.i(8206);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "getInfoStickerPosition...");
                int i3 = -100;
                if (i2 < 0 || fArr.length != 2) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b >= 0 && (i3 = tEStikcerInterface.nativeGetInfoStickerPosition(tEStikcerInterface.f151338a, i2, fArr)) != 0) {
                    i3 = -1;
                }
                MethodCollector.o(8206);
                return i3;
            } finally {
                MethodCollector.o(8206);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int getSrtInfoStickerInitPosition(int i2, float[] fArr) {
        MethodCollector.i(13142);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "getSrtInfoStickerInitPosition...");
                int i3 = -100;
                if (i2 < 0 || fArr.length != 2) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b >= 0 && (i3 = tEStikcerInterface.nativeGetSrtInfoStickerInitPosition(tEStikcerInterface.f151338a, i2, fArr)) != 0) {
                    i3 = -1;
                }
                MethodCollector.o(13142);
                return i3;
            } finally {
                MethodCollector.o(13142);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int restoreInfoStickerPinWithData(int i2, ByteBuffer byteBuffer) {
        int i3;
        MethodCollector.i(12059);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerPinWithFile... index:".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(12059);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b < 0) {
                    i3 = -105;
                } else {
                    int nativeRestoreInfoStickerPinWithJson = tEStikcerInterface.nativeRestoreInfoStickerPinWithJson(tEStikcerInterface.f151338a, i2, byteBuffer, byteBuffer.capacity());
                    if (nativeRestoreInfoStickerPinWithJson != 0) {
                        i3 = -1;
                    } else {
                        MethodCollector.o(12059);
                        return nativeRestoreInfoStickerPinWithJson;
                    }
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin setInfoStickerPinWithFile... faild ret:".concat(String.valueOf(i3)));
                return i3;
            } finally {
                MethodCollector.o(12059);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerAlpha(int i2, float f2) {
        MethodCollector.i(8082);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setInfoStickerAlpha... index: " + i2 + "alpha: " + f2);
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity alpha", String.valueOf(f2));
                MethodCollector.o(8082);
                return filterParam;
            } finally {
                MethodCollector.o(8082);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerLayer(int i2, int i3) {
        MethodCollector.i(8089);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setInfoStickerLayer... index: " + i2 + "layer: " + i3);
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity layer", String.valueOf(i3));
                MethodCollector.o(8089);
                return filterParam;
            } finally {
                MethodCollector.o(8089);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerRotation(int i2, float f2) {
        MethodCollector.i(7947);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setInfoStickerRotation... index: " + i2 + "degree: " + f2);
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity rotation", String.valueOf(f2));
                MethodCollector.o(7947);
                return filterParam;
            } finally {
                MethodCollector.o(7947);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerScale(int i2, float f2) {
        MethodCollector.i(7977);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setInfoStickerScale... index: " + i2 + "scale: " + f2);
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity scale x", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i2, "entity scale y", String.valueOf(f2));
                MethodCollector.o(7977);
                return filterParam;
            } finally {
                MethodCollector.o(7977);
            }
        }
    }

    public float setInfoStickerScaleSync(int i2, float f2) {
        float f3;
        MethodCollector.i(8075);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setInfoStickerScaleSync... index: " + i2 + "scale: " + f2);
                if (i2 < 0) {
                    return -100.0f;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    f3 = -112.0f;
                } else {
                    f3 = tEStikcerInterface.nativeSetInfoStickerScale(tEStikcerInterface.f151338a, i2, f2);
                }
                MethodCollector.o(8075);
                return f3;
            } finally {
                MethodCollector.o(8075);
            }
        }
    }

    public int setInfoStickerVisible(int i2, boolean z) {
        MethodCollector.i(9615);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "setInfoStickerVisible... index: " + i2 + " visible: " + z);
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity visible", String.valueOf(z));
                MethodCollector.o(9615);
                return filterParam;
            } finally {
                MethodCollector.o(9615);
            }
        }
    }

    public int setStickerPinArea(int i2, VEStickerPinAreaParam vEStickerPinAreaParam) {
        int i3;
        MethodCollector.i(11582);
        an.c("VEEditor_VEStickerInvoker", "infoStickerPin, setStickerPinArea, index: ".concat(String.valueOf(i2)));
        synchronized (this.mVEEditor) {
            if (i2 < 0) {
                MethodCollector.o(11582);
                return -100;
            }
            try {
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else {
                    i3 = tEStikcerInterface.nativeSetStickerPinArea(tEStikcerInterface.f151338a, i2, vEStickerPinAreaParam);
                    if (i3 != 0) {
                        i3 = -1;
                    }
                    return i3;
                }
                an.d("VEEditor_VEStickerInvoker", "infoStickerPin, setStickerPinArea, fail, ret: ".concat(String.valueOf(i3)));
                return i3;
            } finally {
                MethodCollector.o(11582);
            }
        }
    }

    public int updateTextSticker(int i2, String str) {
        MethodCollector.i(7724);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "updateTextSticker... index: ".concat(String.valueOf(i2)));
                int i3 = -100;
                if (i2 < 0) {
                    return -100;
                }
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i3 = -112;
                } else if (tEStikcerInterface.f151339b >= 0 && (i3 = tEStikcerInterface.nativeUpdateTextSticker(tEStikcerInterface.f151338a, i2, str)) != 0) {
                    i3 = -1;
                }
                MethodCollector.o(7724);
                return i3;
            } finally {
                MethodCollector.o(7724);
            }
        }
    }

    public int addInfoStickerTemplate(String str, String str2) {
        int a2;
        MethodCollector.i(10446);
        an.a("VEEditor_VEStickerInvoker", "addInfoStickerTemplate ... path : " + str + " params: " + str2);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(10446);
            return -100;
        }
        e.a("iesve_veeditor_import_sticker", 1, (a) null);
        int i2 = 0;
        String[] strArr = {"lv_info_sticker_template", str2};
        synchronized (this.mVEEditor) {
            try {
                a2 = this.mNativeStickerHandler.a(str, strArr);
            } finally {
                MethodCollector.o(10446);
            }
        }
        i.a aVar = new i.a();
        aVar.f61226a = str;
        this.mVEEditor.ac.a(1, a2, aVar);
        an.a("VEEditor_VEStickerInvoker", "addInfoStickerTemplate success with index ".concat(String.valueOf(a2)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (a2 < 0) {
                i2 = -1;
            }
            jSONObject.put("resultCode", i2);
            b.a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return a2;
    }

    public int setSrtColor(int i2, int i3) {
        MethodCollector.i(12736);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setSrtColor");
                if (i2 < 0) {
                    return -100;
                }
                an.d("VEEditor_VEStickerInvoker", "");
                int i4 = (i3 >>> 24) & 255;
                int i5 = (i3 >>> 16) & 255;
                int i6 = (i3 >>> 8) & 255;
                int i7 = i3 & 255;
                an.d("VEEditor_VEStickerInvoker", "aa=" + i4 + ", rr=" + i5 + ", gg=" + i6 + ", bb=" + i7);
                float f2 = ((float) i4) * 0.003921569f;
                float f3 = ((float) i5) * 0.003921569f;
                float f4 = ((float) i6) * 0.003921569f;
                float f5 = ((float) i7) * 0.003921569f;
                an.d("VEEditor_VEStickerInvoker", "a=" + f2 + ", r=" + f3 + ", g=" + f4 + ", b=" + f5);
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity srt color a", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i2, "entity srt color r", String.valueOf(f3)) + this.mNativeEditor.setFilterParam(i2, "entity srt color g", String.valueOf(f4)) + this.mNativeEditor.setFilterParam(i2, "entity srt color b", String.valueOf(f5));
                MethodCollector.o(12736);
                return filterParam;
            } finally {
                MethodCollector.o(12736);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r4 != 0) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setEffectFontPath(int r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            r7 = 9282(0x2442, float:1.3007E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r7)
            com.ss.android.vesdk.x r3 = r8.mVEEditor
            monitor-enter(r3)
            com.ss.android.vesdk.jni.TEStikcerInterface r6 = r8.mNativeStickerHandler     // Catch:{ all -> 0x0043 }
            long r0 = r6.f151338a     // Catch:{ all -> 0x0043 }
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0015
            r4 = -112(0xffffffffffffff90, float:NaN)
            goto L_0x001d
        L_0x0015:
            long r0 = r6.f151338a     // Catch:{ all -> 0x0043 }
            int r4 = r6.nativeSetEffectFontPath(r0, r10, r11)     // Catch:{ all -> 0x0043 }
            if (r4 == 0) goto L_0x002c
        L_0x001d:
            java.lang.String r2 = "VEEditor_VEStickerInvoker"
            java.lang.String r1 = "setEffectFontPath failed, ret = "
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x0043 }
            com.ss.android.vesdk.an.d(r2, r0)     // Catch:{ all -> 0x0043 }
        L_0x002c:
            com.ss.android.ttve.nativePort.TEInterface r1 = r8.mNativeEditor     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "effect font path"
            r1.setFilterParam(r9, r0, r10)     // Catch:{ all -> 0x0043 }
            com.ss.android.ttve.nativePort.TEInterface r2 = r8.mNativeEditor     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "effect face index"
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0043 }
            r2.setFilterParam(r9, r1, r0)     // Catch:{ all -> 0x0043 }
            monitor-exit(r3)     // Catch:{ all -> 0x0043 }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEStickerInvoker.setEffectFontPath(int, java.lang.String, int):int");
    }

    public int setInfoStickerFlip(int i2, boolean z, boolean z2) {
        String str;
        String str2;
        MethodCollector.i(8102);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "setInfoStickerFlip... index: " + i2 + "flipX: " + z + "flipY: " + z2);
                if (i2 < 0) {
                    an.d("VEEditor_VEStickerInvoker", "setInfoStickerFlip... failed index is wrong : ".concat(String.valueOf(i2)));
                    return -100;
                }
                TEInterface tEInterface = this.mNativeEditor;
                if (z) {
                    str = "true";
                } else {
                    str = "false";
                }
                int filterParam = tEInterface.setFilterParam(i2, "entity flip x", str);
                TEInterface tEInterface2 = this.mNativeEditor;
                if (z2) {
                    str2 = "true";
                } else {
                    str2 = "false";
                }
                int filterParam2 = filterParam + tEInterface2.setFilterParam(i2, "entity flip y", str2);
                MethodCollector.o(8102);
                return filterParam2;
            } finally {
                MethodCollector.o(8102);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerPosition(int i2, float f2, float f3) {
        MethodCollector.i(7939);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "setInfoStickerPosition... index: " + i2 + "offsetX: " + f2 + "offsetY: " + f3);
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity position x", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i2, "entity position y", String.valueOf(f3));
                MethodCollector.o(7939);
                return filterParam;
            } finally {
                MethodCollector.o(7939);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setInfoStickerTime(int i2, int i3, int i4) {
        MethodCollector.i(7963);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "setInfoStickerTime... index: " + i2 + "startTime: " + i3 + "endTime: " + i4);
                if (i2 < 0) {
                    return -100;
                }
                i.a aVar = this.mVEEditor.ac.f61224b.get(Integer.valueOf(i2));
                if (aVar != null) {
                    aVar.f61227b = i3;
                    aVar.f61228c = i4 - i3;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity start time", String.valueOf(i3)) + this.mNativeEditor.setFilterParam(i2, "entity end time", String.valueOf(i4));
                MethodCollector.o(7963);
                return filterParam;
            } finally {
                MethodCollector.o(7963);
            }
        }
    }

    public int setSrtInfo(int i2, int i3, String str) {
        MethodCollector.i(12506);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setSrtInfo");
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity audio start time", String.valueOf(i3)) + this.mNativeEditor.setFilterParam(i2, "entity srt info", str) + this.mNativeEditor.setFilterParam(i2, "entity srt", "true");
                MethodCollector.o(12506);
                return filterParam;
            } finally {
                MethodCollector.o(12506);
            }
        }
    }

    @Override // com.ss.android.vesdk.f.f
    public int setSrtInitialPosition(int i2, float f2, float f3) {
        MethodCollector.i(13050);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setSrtInitialPosition");
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity srt initial position x", String.valueOf(f2)) + this.mNativeEditor.setFilterParam(i2, "entity srt initial position y", String.valueOf(f3)) + this.mNativeEditor.setFilterParam(i2, "entity srt first", "true");
                MethodCollector.o(13050);
                return filterParam;
            } finally {
                MethodCollector.o(13050);
            }
        }
    }

    public int addInfoStickerWithInitInfo(String str, String[] strArr, String str2) {
        int length;
        int a2;
        MethodCollector.i(9793);
        an.a("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo ...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(9793);
            return -100;
        }
        e.a("iesve_veeditor_import_sticker", 1, (a) null);
        LinkedList linkedList = new LinkedList();
        int i2 = 0;
        if (strArr == null) {
            length = 0;
        } else {
            length = strArr.length;
        }
        int max = Math.max(5, length);
        for (int i3 = 0; i3 < max; i3++) {
            if (i3 < length) {
                linkedList.add(strArr[i3]);
            } else {
                linkedList.add("");
            }
        }
        linkedList.add(4, str2);
        String[] strArr2 = (String[]) linkedList.toArray(new String[0]);
        an.a("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo ... params: " + linkedList.toString());
        synchronized (this.mVEEditor) {
            try {
                a2 = this.mNativeStickerHandler.a(str, strArr2);
            } finally {
                MethodCollector.o(9793);
            }
        }
        i.a aVar = new i.a();
        aVar.f61226a = str;
        this.mVEEditor.ac.a(1, a2, aVar);
        an.a("VEEditor_VEStickerInvoker", "addInfoStickerWithInitInfo success with index ".concat(String.valueOf(a2)));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            if (a2 < 0) {
                i2 = -1;
            }
            jSONObject.put("resultCode", i2);
            b.a("vesdk_event_editor_info_sticker", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return a2;
    }

    @Override // com.ss.android.vesdk.f.f
    public int addImageSticker(String str, float f2, float f3, float f4, float f5) {
        int a2;
        MethodCollector.i(7624);
        an.a("VEEditor_VEStickerInvoker", "addImageSticker...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7624);
            return -100;
        }
        e.a("iesve_veeditor_import_sticker", 1, (a) null);
        String[] strArr = {String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(f5), "0"};
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("path", str);
            jSONObject.put("width", (double) f4);
            jSONObject.put("height", (double) f5);
            b.a("vesdk_event_editor_image_sticker", jSONObject, "behavior");
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        synchronized (this.mVEEditor) {
            try {
                a2 = this.mNativeStickerHandler.a(str, strArr);
            } finally {
                MethodCollector.o(7624);
            }
        }
        return a2;
    }

    @Override // com.ss.android.vesdk.f.f
    public int addImageStickerWithRatio(String str, float f2, float f3, float f4, float f5) {
        int a2;
        MethodCollector.i(7720);
        an.a("VEEditor_VEStickerInvoker", "addImageStickerWithRatio...");
        if (TextUtils.isEmpty(str)) {
            MethodCollector.o(7720);
            return -100;
        }
        e.a("iesve_veeditor_import_sticker", 1, (a) null);
        String[] strArr = {String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(f5), "1"};
        synchronized (this.mVEEditor) {
            try {
                a2 = this.mNativeStickerHandler.a(str, strArr);
            } finally {
                MethodCollector.o(7720);
            }
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r4 != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int setEffectInputText(int r15, java.lang.String r16, int r17, int r18, java.lang.String r19) {
        /*
            r14 = this;
            r6 = 9284(0x2444, float:1.301E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.i(r6)
            com.ss.android.vesdk.x r3 = r14.mVEEditor
            monitor-enter(r3)
            com.ss.android.vesdk.jni.TEStikcerInterface r7 = r14.mNativeStickerHandler     // Catch:{ all -> 0x005d }
            long r1 = r7.f151338a     // Catch:{ all -> 0x005d }
            r4 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r10 = r16
            r11 = r17
            r12 = r18
            r13 = r19
            if (r0 != 0) goto L_0x001d
            r4 = -112(0xffffffffffffff90, float:NaN)
            goto L_0x0025
        L_0x001d:
            long r8 = r7.f151338a     // Catch:{ all -> 0x005d }
            int r4 = r7.nativeSetEffectInputText(r8, r10, r11, r12, r13)     // Catch:{ all -> 0x005d }
            if (r4 == 0) goto L_0x0034
        L_0x0025:
            java.lang.String r2 = "VEEditor_VEStickerInvoker"
            java.lang.String r1 = "setEffectInputText failed, ret = "
            java.lang.String r0 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = r1.concat(r0)     // Catch:{ all -> 0x005d }
            com.ss.android.vesdk.an.d(r2, r0)     // Catch:{ all -> 0x005d }
        L_0x0034:
            com.ss.android.ttve.nativePort.TEInterface r1 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "effect inputtext"
            r1.setFilterParam(r15, r0, r10)     // Catch:{ all -> 0x005d }
            com.ss.android.ttve.nativePort.TEInterface r2 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "effect inputtext arg1"
            java.lang.String r0 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x005d }
            r2.setFilterParam(r15, r1, r0)     // Catch:{ all -> 0x005d }
            com.ss.android.ttve.nativePort.TEInterface r2 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r1 = "effect inputtext arg2"
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x005d }
            r2.setFilterParam(r15, r1, r0)     // Catch:{ all -> 0x005d }
            com.ss.android.ttve.nativePort.TEInterface r1 = r14.mNativeEditor     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "effect inputtext arg3"
            r1.setFilterParam(r15, r0, r13)     // Catch:{ all -> 0x005d }
            monitor-exit(r3)     // Catch:{ all -> 0x005d }
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            return r4
        L_0x005d:
            r0 = move-exception
            monitor-exit(r3)
            com.bytedance.frameworks.apm.trace.MethodCollector.o(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.vesdk.VEStickerInvoker.setEffectInputText(int, java.lang.String, int, int, java.lang.String):int");
    }

    public int setSrtAudioInfo(int i2, int i3, int i4, int i5, int i6, boolean z) {
        MethodCollector.i(12857);
        synchronized (this.mVEEditor) {
            try {
                an.b("VEEditor_VEStickerInvoker", "setSrtAudioInfo");
                if (i2 < 0) {
                    return -100;
                }
                int filterParam = this.mNativeEditor.setFilterParam(i2, "entity srt audio index", String.valueOf(i3)) + this.mNativeEditor.setFilterParam(i2, "entity srt audio seqIn", String.valueOf(i4)) + this.mNativeEditor.setFilterParam(i2, "entity srt audio trimIn", String.valueOf(i5)) + this.mNativeEditor.setFilterParam(i2, "entity srt audio trimOut", String.valueOf(i6)) + this.mNativeEditor.setFilterParam(i2, "entity srt audio cycle", String.valueOf(z));
                MethodCollector.o(12857);
                return filterParam;
            } finally {
                MethodCollector.o(12857);
            }
        }
    }

    public int setStickerAnimation(int i2, boolean z, String str, int i3, String str2, int i4) {
        int i5;
        MethodCollector.i(8558);
        synchronized (this.mVEEditor) {
            try {
                an.a("VEEditor_VEStickerInvoker", "setStickerAnimation... index:" + i2 + ", loop:" + z + ", inPath:" + str + ", inDuration:" + i3 + ", outPath:" + str2 + ", outDuration:" + i4);
                TEStikcerInterface tEStikcerInterface = this.mNativeStickerHandler;
                if (tEStikcerInterface.f151338a == 0) {
                    i5 = -112;
                } else {
                    i5 = tEStikcerInterface.nativeSetInfoStickerAnimationParam(tEStikcerInterface.f151338a, i2, z, str, i3, str2, i4, 0);
                }
            } finally {
                MethodCollector.o(8558);
            }
        }
        return i5;
    }

    public int addSticker(String str, int i2, int i3, float f2, float f3, float f4, float f5) {
        return addSticker(str, i2, i3, 0, i3 - i2, f2, f3, f4, f5);
    }

    public int addExtRes(String str, int i2, int i3, int i4, int i5, float f2, float f3, float f4, float f5) {
        an.c("VEEditor_VEStickerInvoker", "addSticker...");
        if (i2 > i3 || i2 < 0 || TextUtils.isEmpty(str)) {
            return -100;
        }
        e.a("iesve_veeditor_import_sticker", 1, (a) null);
        return this.mNativeStickerHandler.a(new String[]{str}, new int[]{i2}, new int[]{i3}, new int[]{i4}, new int[]{i5}, (double) f4, (double) f5, (double) f2, (double) f3);
    }

    public int addSticker(String str, int i2, int i3, int i4, int i5, float f2, float f3, float f4, float f5) {
        an.c("VEEditor_VEStickerInvoker", "addSticker...");
        if (i2 > i3 || i2 < 0 || TextUtils.isEmpty(str)) {
            return -100;
        }
        e.a("iesve_veeditor_import_sticker", 1, (a) null);
        return this.mNativeStickerHandler.a(new String[]{str}, new int[]{i2}, new int[]{i3}, new int[]{i4}, new int[]{i5}, (double) f4, (double) f5, (double) f2, (double) f3);
    }
}
