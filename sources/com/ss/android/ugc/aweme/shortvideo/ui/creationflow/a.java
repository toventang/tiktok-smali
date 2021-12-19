package com.ss.android.ugc.aweme.shortvideo.ui.creationflow;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.w.f;
import h.f.b.l;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f131647a;

    /* renamed from: b  reason: collision with root package name */
    public final f f131648b;

    /* renamed from: c  reason: collision with root package name */
    public final long f131649c;

    /* renamed from: d  reason: collision with root package name */
    public final ShortVideoContext f131650d;

    /* renamed from: e  reason: collision with root package name */
    public final int f131651e;

    /* renamed from: f  reason: collision with root package name */
    public final d f131652f;

    /* renamed from: g  reason: collision with root package name */
    public final MultiEditVideoStatusRecordData f131653g;

    /* renamed from: h  reason: collision with root package name */
    public final String f131654h;

    /* renamed from: i  reason: collision with root package name */
    public final String f131655i;

    static {
        Covode.recordClassIndex(86212);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.f131647a, aVar.f131647a) && l.a(this.f131648b, aVar.f131648b) && this.f131649c == aVar.f131649c && l.a(this.f131650d, aVar.f131650d) && this.f131651e == aVar.f131651e && l.a(this.f131652f, aVar.f131652f) && l.a(this.f131653g, aVar.f131653g) && l.a(this.f131654h, aVar.f131654h) && l.a(this.f131655i, aVar.f131655i);
    }

    public final String toString() {
        return "EditActionArgument(activity=" + this.f131647a + ", recordComponentModel=" + this.f131648b + ", videoConcatTime=" + this.f131649c + ", shortVideoContext=" + this.f131650d + ", cameraPosition=" + this.f131651e + ", bean=" + this.f131652f + ", recordData=" + this.f131653g + ", videoPath=" + this.f131654h + ", audioPath=" + this.f131655i + ")";
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Activity activity = this.f131647a;
        int i8 = 0;
        if (activity != null) {
            i2 = activity.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = i2 * 31;
        f fVar = this.f131648b;
        if (fVar != null) {
            i3 = fVar.hashCode();
        } else {
            i3 = 0;
        }
        long j2 = this.f131649c;
        int i10 = (((i9 + i3) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        ShortVideoContext shortVideoContext = this.f131650d;
        if (shortVideoContext != null) {
            i4 = shortVideoContext.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (((i10 + i4) * 31) + this.f131651e) * 31;
        d dVar = this.f131652f;
        if (dVar != null) {
            i5 = dVar.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.f131653g;
        if (multiEditVideoStatusRecordData != null) {
            i6 = multiEditVideoStatusRecordData.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        String str = this.f131654h;
        if (str != null) {
            i7 = str.hashCode();
        } else {
            i7 = 0;
        }
        int i14 = (i13 + i7) * 31;
        String str2 = this.f131655i;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i14 + i8;
    }

    public a(Activity activity, f fVar, long j2, ShortVideoContext shortVideoContext, int i2, d dVar, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, String str2) {
        l.d(activity, "");
        l.d(fVar, "");
        l.d(shortVideoContext, "");
        l.d(str, "");
        l.d(str2, "");
        this.f131647a = activity;
        this.f131648b = fVar;
        this.f131649c = j2;
        this.f131650d = shortVideoContext;
        this.f131651e = i2;
        this.f131652f = dVar;
        this.f131653g = multiEditVideoStatusRecordData;
        this.f131654h = str;
        this.f131655i = str2;
    }
}
