package com.ss.android.vesdk;

import com.bytedance.covode.number.Covode;

public class VEMusicSRTEffectParam {
    private boolean mAddMask;
    private String mEffectResourcePath;
    private int mFontFaceIndex;
    private String mFontTTFPath;
    public a mGetMusicProgressInvoker;
    private int mMaskColor = 1291845632;
    private boolean mParamUpdated;
    private c[] mSrtData;

    public interface a {
        static {
            Covode.recordClassIndex(99196);
        }

        float a();
    }

    public interface b extends a {
        static {
            Covode.recordClassIndex(99197);
        }

        VEMusicBitmapParam b();
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public String f150783a;

        /* renamed from: b  reason: collision with root package name */
        public int f150784b;

        /* renamed from: c  reason: collision with root package name */
        public int f150785c;

        /* renamed from: d  reason: collision with root package name */
        public int f150786d;

        static {
            Covode.recordClassIndex(99198);
        }
    }

    static {
        Covode.recordClassIndex(99195);
    }

    public boolean getAddMask() {
        return this.mAddMask;
    }

    public String getEffectResPath() {
        return this.mEffectResourcePath;
    }

    public int getFontFaceIndex() {
        return this.mFontFaceIndex;
    }

    public String getFontTTFPath() {
        return this.mFontTTFPath;
    }

    public int getMaskColor() {
        return this.mMaskColor;
    }

    private VEMusicSRTEffectParam() {
    }

    private boolean getParamUpdated() {
        if (!this.mParamUpdated) {
            return false;
        }
        this.mParamUpdated = false;
        return true;
    }

    public float getMusicProgress() {
        a aVar = this.mGetMusicProgressInvoker;
        if (aVar != null) {
            return aVar.a();
        }
        return 0.0f;
    }

    public int[][] getSrtData() {
        int[][] iArr = new int[this.mSrtData.length][];
        int i2 = 0;
        while (true) {
            c[] cVarArr = this.mSrtData;
            if (i2 >= cVarArr.length) {
                return iArr;
            }
            iArr[i2] = convertDataToUnicode32(cVarArr[i2]);
            i2++;
        }
    }

    public void setAddMask(boolean z) {
        this.mAddMask = z;
        this.mParamUpdated = true;
    }

    public void setMaskColor(int i2) {
        this.mMaskColor = i2;
        this.mParamUpdated = true;
    }

    private int[] convertDataToUnicode32(c cVar) {
        int codePointCount = cVar.f150783a.codePointCount(0, cVar.f150783a.length());
        int[] iArr = new int[(codePointCount + 3)];
        iArr[0] = cVar.f150786d;
        iArr[1] = cVar.f150784b;
        iArr[2] = cVar.f150785c;
        for (int i2 = 0; i2 < codePointCount; i2++) {
            iArr[i2 + 3] = cVar.f150783a.codePointAt(i2);
        }
        return iArr;
    }

    public void updateEffectResPath(c[] cVarArr, String str, String str2, int i2, a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i2;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicSRTEffectParam(c[] cVarArr, String str, String str2, int i2, a aVar) {
        this.mSrtData = cVarArr;
        this.mFontTTFPath = str2;
        this.mEffectResourcePath = str;
        this.mFontFaceIndex = i2;
        this.mGetMusicProgressInvoker = aVar;
        this.mParamUpdated = true;
    }

    public VEMusicBitmapParam generateBitmap(String str, int i2, int i3, int i4, float f2, int i5, int i6, int i7) {
        a aVar = this.mGetMusicProgressInvoker;
        if (aVar == null || !(aVar instanceof b)) {
            return null;
        }
        return ((b) aVar).b();
    }

    public VEMusicBitmapParam generateBitmapUnicode(int[] iArr, int i2, int i3, int i4, float f2, int i5, int i6, int i7) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmap(new String(iArr, 0, iArr.length), i2, i3, i4, f2, i5, i6, i7);
    }
}
