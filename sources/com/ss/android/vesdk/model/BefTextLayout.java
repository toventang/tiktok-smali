package com.ss.android.vesdk.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ttve.nativePort.f;
import com.ss.android.vesdk.an;
import java.nio.charset.Charset;

public class BefTextLayout {
    long backColor;
    int charSize;
    String familyName;
    boolean isPlaceholder;
    int letterSpacing;
    int lineCount;
    float lineHeight;
    int lineWidth;
    int split;
    int textAlign;
    long textColor;
    int textIndent;

    static {
        Covode.recordClassIndex(99540);
    }

    public long getBackColor() {
        return this.backColor;
    }

    public int getCharSize() {
        return this.charSize;
    }

    public String getFamilyName() {
        return this.familyName;
    }

    public int getLetterSpacing() {
        return this.letterSpacing;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public float getLineHeight() {
        return this.lineHeight;
    }

    public int getLineWidth() {
        return this.lineWidth;
    }

    public int getSplit() {
        return this.split;
    }

    public int getTextAlign() {
        return this.textAlign;
    }

    public long getTextColor() {
        return this.textColor;
    }

    public int getTextIndent() {
        return this.textIndent;
    }

    public boolean isPlaceholder() {
        return this.isPlaceholder;
    }

    public String toString() {
        return "BefTextLayout{charSize=" + this.charSize + ", letterSpacing=" + this.letterSpacing + ", lineWidth=" + this.lineWidth + ", lineHeight=" + this.lineHeight + ", textAlign=" + this.textAlign + ", textIndent=" + this.textIndent + ", split=" + this.split + ", lineCount=" + this.lineCount + ", familyName='" + this.familyName + '\'' + ", textColor=" + this.textColor + ", backColor=" + this.backColor + ", isPlaceholder=" + this.isPlaceholder + '}';
    }

    public void setBackColor(long j2) {
        this.backColor = j2;
    }

    public void setCharSize(int i2) {
        this.charSize = i2;
    }

    public void setFamilyName(String str) {
        this.familyName = str;
    }

    public void setLetterSpacing(int i2) {
        this.letterSpacing = i2;
    }

    public void setLineCount(int i2) {
        this.lineCount = i2;
    }

    public void setLineHeight(float f2) {
        this.lineHeight = f2;
    }

    public void setLineWidth(int i2) {
        this.lineWidth = i2;
    }

    public void setPlaceholder(boolean z) {
        this.isPlaceholder = z;
    }

    public void setSplit(int i2) {
        this.split = i2;
    }

    public void setTextAlign(int i2) {
        this.textAlign = i2;
    }

    public void setTextColor(long j2) {
        this.textColor = j2;
    }

    public void setTextIndent(int i2) {
        this.textIndent = i2;
    }

    public static BefTextLayout readFromByteArray(byte[][] bArr) {
        String str;
        boolean z = false;
        f fVar = new f(bArr[0]);
        BefTextLayout befTextLayout = new BefTextLayout();
        befTextLayout.setBackColor(fVar.b().longValue());
        befTextLayout.setCharSize(fVar.a());
        int a2 = fVar.a();
        if (fVar.f61359b + a2 > fVar.f61358a.length) {
            an.d("TEParcel", "readString out of bound(data size=" + fVar.f61358a.length + ", start=" + fVar.f61359b + ", len=" + a2 + ")");
            str = null;
        } else {
            str = new String(fVar.f61358a, fVar.f61359b, a2, Charset.forName("UTF-8"));
            fVar.f61359b += a2;
        }
        befTextLayout.setFamilyName(str);
        befTextLayout.setLetterSpacing(fVar.a());
        befTextLayout.setLineCount(fVar.a());
        befTextLayout.setLineHeight((float) fVar.a());
        befTextLayout.setLineWidth(fVar.a());
        if (fVar.f61359b + 4 > fVar.f61358a.length) {
            an.d("TEParcel", "out of border");
        } else if (fVar.a() != 0) {
            z = true;
        }
        befTextLayout.setPlaceholder(z);
        befTextLayout.setSplit(fVar.a());
        befTextLayout.setTextAlign(fVar.a());
        befTextLayout.setTextColor(fVar.b().longValue());
        befTextLayout.setTextIndent(fVar.a());
        return befTextLayout;
    }
}
