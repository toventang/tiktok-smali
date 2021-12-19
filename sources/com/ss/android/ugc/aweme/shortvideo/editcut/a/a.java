package com.ss.android.ugc.aweme.shortvideo.editcut.a;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f128079a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f128080b;

    /* renamed from: c  reason: collision with root package name */
    public final VideoPublishEditModel f128081c;

    /* renamed from: d  reason: collision with root package name */
    public final MultiEditVideoStatusRecordData f128082d;

    /* renamed from: e  reason: collision with root package name */
    public final Cut2EditTransferModel f128083e;

    static {
        Covode.recordClassIndex(83953);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f128079a == aVar.f128079a && this.f128080b == aVar.f128080b && l.a(this.f128081c, aVar.f128081c) && l.a(this.f128082d, aVar.f128082d) && l.a(this.f128083e, aVar.f128083e);
    }

    public final int hashCode() {
        int i2 = this.f128079a * 31;
        boolean z = this.f128080b;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (i2 + i3) * 31;
        VideoPublishEditModel videoPublishEditModel = this.f128081c;
        int i7 = 0;
        int hashCode = (i6 + (videoPublishEditModel != null ? videoPublishEditModel.hashCode() : 0)) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f128082d;
        int hashCode2 = (hashCode + (multiEditVideoStatusRecordData != null ? multiEditVideoStatusRecordData.hashCode() : 0)) * 31;
        Cut2EditTransferModel cut2EditTransferModel = this.f128083e;
        if (cut2EditTransferModel != null) {
            i7 = cut2EditTransferModel.hashCode();
        }
        return hashCode2 + i7;
    }

    public final String toString() {
        return "EditAdjustClipsModel(origin=" + this.f128079a + ", isMultiEdit=" + this.f128080b + ", editModel=" + this.f128081c + ", multiEditVideoStatusRecordData=" + this.f128082d + ", cut2EditTransferModel=" + this.f128083e + ")";
    }

    public a(int i2, boolean z, VideoPublishEditModel videoPublishEditModel, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, Cut2EditTransferModel cut2EditTransferModel) {
        l.d(videoPublishEditModel, "");
        l.d(multiEditVideoStatusRecordData, "");
        this.f128079a = i2;
        this.f128080b = z;
        this.f128081c = videoPublishEditModel;
        this.f128082d = multiEditVideoStatusRecordData;
        this.f128083e = cut2EditTransferModel;
    }
}
