package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class e implements z {
    @c(a = "level")

    /* renamed from: a  reason: collision with root package name */
    public int f19050a;
    @c(a = "experience")

    /* renamed from: b  reason: collision with root package name */
    public long f19051b;
    @c(a = "lowest_experience_this_level")

    /* renamed from: c  reason: collision with root package name */
    public long f19052c;
    @c(a = "highest_experience_this_level")

    /* renamed from: d  reason: collision with root package name */
    public long f19053d;
    @c(a = "task_start_experience")

    /* renamed from: e  reason: collision with root package name */
    public long f19054e;
    @c(a = "task_start_time")

    /* renamed from: f  reason: collision with root package name */
    public long f19055f;
    @c(a = "task_decrease_experience")

    /* renamed from: g  reason: collision with root package name */
    public long f19056g;
    @c(a = "task_target_experience")

    /* renamed from: h  reason: collision with root package name */
    public long f19057h;
    @c(a = "task_end_time")

    /* renamed from: i  reason: collision with root package name */
    public long f19058i;
    @c(a = "profile_dialog_bg")

    /* renamed from: j  reason: collision with root package name */
    public ImageModel f19059j;
    @c(a = "profile_dialog_bg_back")

    /* renamed from: k  reason: collision with root package name */
    public ImageModel f19060k;
    @c(a = "stage_level")

    /* renamed from: l  reason: collision with root package name */
    public ImageModel f19061l;
    @c(a = "small_icon")

    /* renamed from: m  reason: collision with root package name */
    public ImageModel f19062m;

    static {
        Covode.recordClassIndex(11376);
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final int a() {
        return this.f19050a;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long b() {
        return this.f19051b;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long c() {
        return this.f19052c;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long d() {
        return this.f19053d;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long e() {
        return this.f19054e;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long f() {
        return this.f19055f;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long g() {
        return this.f19056g;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long h() {
        return this.f19057h;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final long i() {
        return this.f19058i;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final ImageModel j() {
        return this.f19059j;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final ImageModel k() {
        return this.f19060k;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final ImageModel l() {
        return this.f19061l;
    }

    @Override // com.bytedance.android.livesdk.model.z
    public final ImageModel m() {
        return this.f19062m;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        ImageModel imageModel = this.f19062m;
        int i6 = 0;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f19051b;
        long j3 = this.f19052c;
        long j4 = this.f19053d;
        long j5 = this.f19054e;
        long j6 = this.f19055f;
        long j7 = this.f19056g;
        long j8 = this.f19057h;
        long j9 = this.f19058i;
        int i7 = ((((((((((((((((((i2 * 31) + this.f19050a) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        ImageModel imageModel2 = this.f19059j;
        if (imageModel2 != null) {
            i3 = imageModel2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        ImageModel imageModel3 = this.f19060k;
        if (imageModel3 != null) {
            i4 = imageModel3.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        ImageModel imageModel4 = this.f19061l;
        if (imageModel4 != null) {
            i5 = imageModel4.hashCode();
        } else {
            i5 = 0;
        }
        int i10 = (i9 + i5) * 31;
        ImageModel imageModel5 = this.f19062m;
        if (imageModel5 != null) {
            i6 = imageModel5.hashCode();
        }
        return i10 + i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f19050a != eVar.f19050a || this.f19051b != eVar.f19051b || this.f19052c != eVar.f19052c || this.f19053d != eVar.f19053d || this.f19054e != eVar.f19054e || this.f19055f != eVar.f19055f || this.f19056g != eVar.f19056g || this.f19057h != eVar.f19057h || this.f19058i != eVar.f19058i) {
                return false;
            }
            ImageModel imageModel = this.f19059j;
            if (imageModel == null ? eVar.f19059j != null : !imageModel.equals(eVar.f19059j)) {
                return false;
            }
            ImageModel imageModel2 = this.f19060k;
            if (imageModel2 == null ? eVar.f19060k != null : !imageModel2.equals(eVar.f19060k)) {
                return false;
            }
            ImageModel imageModel3 = this.f19061l;
            if (imageModel3 == null ? eVar.f19061l != null : !imageModel3.equals(eVar.f19061l)) {
                return false;
            }
            ImageModel imageModel4 = this.f19062m;
            ImageModel imageModel5 = eVar.f19062m;
            if (imageModel4 != null) {
                return imageModel4.equals(imageModel5);
            }
            if (imageModel5 == null) {
                return true;
            }
        }
        return false;
    }
}
