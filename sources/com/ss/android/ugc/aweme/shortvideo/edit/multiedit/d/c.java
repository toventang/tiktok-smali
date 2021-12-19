package com.ss.android.ugc.aweme.shortvideo.edit.multiedit.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f127880a;

    /* renamed from: b  reason: collision with root package name */
    public long f127881b;

    /* renamed from: c  reason: collision with root package name */
    public float f127882c;

    /* renamed from: d  reason: collision with root package name */
    public float f127883d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f127884e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f127885f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f127886g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f127887h;

    /* renamed from: i  reason: collision with root package name */
    public int f127888i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f127889j;

    /* renamed from: k  reason: collision with root package name */
    public int f127890k;

    static {
        Covode.recordClassIndex(83826);
    }

    public final void a() {
        this.f127880a = 0;
        this.f127881b = 0;
        this.f127882c = 0.0f;
        this.f127883d = 0.0f;
    }

    public final void a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.f127880a = multiEditVideoRecordData.startTime;
            this.f127881b = multiEditVideoRecordData.endTime;
            this.f127882c = multiEditVideoRecordData.leftSlideX;
            this.f127883d = multiEditVideoRecordData.rightSlideX;
        }
    }

    public final void b(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.leftSlideX = this.f127882c;
            multiEditVideoRecordData.rightSlideX = this.f127883d;
            multiEditVideoRecordData.startTime = this.f127880a;
            multiEditVideoRecordData.endTime = this.f127881b;
        }
    }
}
