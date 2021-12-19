package com.bytedance.creativex.recorder.b.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.sticker.SavePhotoStickerInfo;
import h.f.b.l;
import java.util.List;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f28201a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f28202b;

    /* renamed from: c  reason: collision with root package name */
    public final SavePhotoStickerInfo f28203c;

    static {
        Covode.recordClassIndex(16534);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return l.a(this.f28201a, sVar.f28201a) && l.a(this.f28202b, sVar.f28202b) && l.a(this.f28203c, sVar.f28203c);
    }

    public final int hashCode() {
        List<String> list = this.f28201a;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.f28202b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        SavePhotoStickerInfo savePhotoStickerInfo = this.f28203c;
        if (savePhotoStickerInfo != null) {
            i2 = savePhotoStickerInfo.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "RecordStickerInfo(arTexts=" + this.f28201a + ", effectTexts=" + this.f28202b + ", savePhotoStickerInfo=" + this.f28203c + ")";
    }

    private /* synthetic */ s() {
        this(null, null, null);
    }

    public s(List<String> list, List<String> list2, SavePhotoStickerInfo savePhotoStickerInfo) {
        this.f28201a = list;
        this.f28202b = list2;
        this.f28203c = savePhotoStickerInfo;
    }
}
