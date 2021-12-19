package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import java.util.List;

public class bc implements ae {
    @c(a = "diamond_icon")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f19034a;
    @c(a = "icon")

    /* renamed from: b  reason: collision with root package name */
    public ImageModel f19035b;
    @c(a = "next_icon")

    /* renamed from: c  reason: collision with root package name */
    public ImageModel f19036c;
    @c(a = "next_name")

    /* renamed from: d  reason: collision with root package name */
    public String f19037d;
    @c(a = StringSet.name)

    /* renamed from: e  reason: collision with root package name */
    public String f19038e;
    @c(a = "deprecated20")

    /* renamed from: f  reason: collision with root package name */
    public long f19039f;
    @c(a = "deprecated23")

    /* renamed from: g  reason: collision with root package name */
    public long f19040g;
    @c(a = "im_icon")

    /* renamed from: h  reason: collision with root package name */
    public ImageModel f19041h;
    @c(a = "im_icon_with_level")

    /* renamed from: i  reason: collision with root package name */
    public ImageModel f19042i;
    @c(a = "new_im_icon_with_level")

    /* renamed from: j  reason: collision with root package name */
    public ImageModel f19043j;
    @c(a = "live_icon")

    /* renamed from: k  reason: collision with root package name */
    public ImageModel f19044k;
    @c(a = "new_live_icon")

    /* renamed from: l  reason: collision with root package name */
    public ImageModel f19045l;
    @c(a = "level")

    /* renamed from: m  reason: collision with root package name */
    public int f19046m;
    @c(a = "grade_icon_list")
    public List<y> n;
    @c(a = "grade_describe")
    public String o;
    @c(a = "deprecated25")
    public long p;
    @c(a = "deprecated24")
    public long q;
    @c(a = "background")
    public ImageModel r;
    @c(a = "background_back")
    public ImageModel s;
    @c(a = "upgrade_need_consume")
    long t;
    @c(a = "grade_banner")
    String u;
    @c(a = "next_privileges")
    String v;
    @c(a = "score")
    long w;
    @c(a = "screen_chat_type")
    long x;

    static {
        Covode.recordClassIndex(11334);
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel a() {
        return this.f19034a;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel b() {
        return this.f19035b;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel c() {
        return this.f19036c;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final String d() {
        return this.f19037d;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final String e() {
        return this.f19038e;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final long f() {
        return this.f19039f;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final long g() {
        return this.f19040g;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final long h() {
        return this.p;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final long i() {
        return this.q;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel j() {
        return this.f19041h;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel k() {
        return this.f19042i;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final int l() {
        return this.f19046m;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel m() {
        return this.f19044k;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final List<y> p() {
        return this.n;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final String q() {
        return this.o;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel r() {
        return this.r;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel s() {
        return this.s;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel n() {
        ImageModel imageModel = this.f19045l;
        if (imageModel != null) {
            return imageModel;
        }
        return this.f19044k;
    }

    @Override // com.bytedance.android.livesdk.model.ae
    public final ImageModel o() {
        ImageModel imageModel = this.f19043j;
        if (imageModel != null) {
            return imageModel;
        }
        return this.f19042i;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ImageModel imageModel = this.f19034a;
        int i15 = 0;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        } else {
            i2 = 0;
        }
        int i16 = i2 * 31;
        ImageModel imageModel2 = this.f19035b;
        if (imageModel2 != null) {
            i3 = imageModel2.hashCode();
        } else {
            i3 = 0;
        }
        int i17 = (i16 + i3) * 31;
        ImageModel imageModel3 = this.f19036c;
        if (imageModel3 != null) {
            i4 = imageModel3.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        String str = this.f19037d;
        if (str != null) {
            i5 = str.hashCode();
        } else {
            i5 = 0;
        }
        int i19 = (i18 + i5) * 31;
        String str2 = this.f19038e;
        if (str2 != null) {
            i6 = str2.hashCode();
        } else {
            i6 = 0;
        }
        long j2 = this.f19039f;
        long j3 = this.f19040g;
        int i20 = (((((i19 + i6) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        ImageModel imageModel4 = this.f19041h;
        if (imageModel4 != null) {
            i7 = imageModel4.hashCode();
        } else {
            i7 = 0;
        }
        int i21 = (i20 + i7) * 31;
        ImageModel imageModel5 = this.f19042i;
        if (imageModel5 != null) {
            i8 = imageModel5.hashCode();
        } else {
            i8 = 0;
        }
        int i22 = (i21 + i8) * 31;
        ImageModel imageModel6 = this.f19043j;
        if (imageModel6 != null) {
            i9 = imageModel6.hashCode();
        } else {
            i9 = 0;
        }
        int i23 = (i22 + i9) * 31;
        ImageModel imageModel7 = this.f19044k;
        if (imageModel7 != null) {
            i10 = imageModel7.hashCode();
        } else {
            i10 = 0;
        }
        int i24 = (i23 + i10) * 31;
        ImageModel imageModel8 = this.f19045l;
        if (imageModel8 != null) {
            i11 = imageModel8.hashCode();
        } else {
            i11 = 0;
        }
        int i25 = (((i24 + i11) * 31) + this.f19046m) * 31;
        List<y> list = this.n;
        if (list != null) {
            i12 = list.hashCode();
        } else {
            i12 = 0;
        }
        int i26 = (i25 + i12) * 31;
        String str3 = this.o;
        if (str3 != null) {
            i13 = str3.hashCode();
        } else {
            i13 = 0;
        }
        long j4 = this.p;
        long j5 = this.q;
        int i27 = (((((i26 + i13) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        ImageModel imageModel9 = this.r;
        if (imageModel9 != null) {
            i14 = imageModel9.hashCode();
        } else {
            i14 = 0;
        }
        int i28 = (i27 + i14) * 31;
        ImageModel imageModel10 = this.s;
        if (imageModel10 != null) {
            i15 = imageModel10.hashCode();
        }
        return i28 + i15;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            bc bcVar = (bc) obj;
            if (this.f19039f != bcVar.f19039f || this.f19040g != bcVar.f19040g || this.f19046m != bcVar.f19046m) {
                return false;
            }
            ImageModel imageModel = this.f19034a;
            if (imageModel == null ? bcVar.f19034a != null : !imageModel.equals(bcVar.f19034a)) {
                return false;
            }
            ImageModel imageModel2 = this.f19035b;
            if (imageModel2 == null ? bcVar.f19035b != null : !imageModel2.equals(bcVar.f19035b)) {
                return false;
            }
            ImageModel imageModel3 = this.f19036c;
            if (imageModel3 == null ? bcVar.f19036c != null : !imageModel3.equals(bcVar.f19036c)) {
                return false;
            }
            String str = this.f19037d;
            if (str == null ? bcVar.f19037d != null : !str.equals(bcVar.f19037d)) {
                return false;
            }
            String str2 = this.f19038e;
            if (str2 == null ? bcVar.f19038e != null : !str2.equals(bcVar.f19038e)) {
                return false;
            }
            ImageModel imageModel4 = this.f19041h;
            if (imageModel4 == null ? bcVar.f19041h != null : !imageModel4.equals(bcVar.f19041h)) {
                return false;
            }
            ImageModel imageModel5 = this.f19042i;
            if (imageModel5 == null ? bcVar.f19042i != null : !imageModel5.equals(bcVar.f19042i)) {
                return false;
            }
            ImageModel imageModel6 = this.f19043j;
            if (imageModel6 == null ? bcVar.f19043j != null : !imageModel6.equals(bcVar.f19043j)) {
                return false;
            }
            ImageModel imageModel7 = this.f19044k;
            if (imageModel7 == null ? bcVar.f19044k != null : !imageModel7.equals(bcVar.f19044k)) {
                return false;
            }
            ImageModel imageModel8 = this.f19045l;
            if (imageModel8 == null ? bcVar.f19045l != null : !imageModel8.equals(bcVar.f19045l)) {
                return false;
            }
            List<y> list = this.n;
            if (list == null ? bcVar.n != null : !list.equals(bcVar.n)) {
                return false;
            }
            if (this.q != bcVar.q || this.p != bcVar.p) {
                return false;
            }
            ImageModel imageModel9 = this.r;
            if (imageModel9 == null ? bcVar.r != null : !imageModel9.equals(bcVar.r)) {
                return false;
            }
            ImageModel imageModel10 = this.s;
            if (imageModel10 == null ? bcVar.s != null : !imageModel10.equals(bcVar.s)) {
                return false;
            }
            String str3 = this.o;
            String str4 = bcVar.o;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }
}
