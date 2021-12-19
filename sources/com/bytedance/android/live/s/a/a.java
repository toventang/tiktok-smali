package com.bytedance.android.live.s.a;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.ba;
import com.bytedance.android.livesdk.model.bc;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class a {

    /* renamed from: h  reason: collision with root package name */
    public static final C0265a f12592h = new C0265a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final long f12593a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12594b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12595c;

    /* renamed from: d  reason: collision with root package name */
    public final String f12596d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageModel f12597e;

    /* renamed from: f  reason: collision with root package name */
    public final bc f12598f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12599g;

    static {
        Covode.recordClassIndex(6937);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12593a == aVar.f12593a && l.a(this.f12594b, aVar.f12594b) && l.a(this.f12595c, aVar.f12595c) && l.a(this.f12596d, aVar.f12596d) && l.a(this.f12597e, aVar.f12597e) && l.a(this.f12598f, aVar.f12598f) && this.f12599g == aVar.f12599g;
    }

    public final String toString() {
        return "AdminUser(id=" + this.f12593a + ", secUid=" + this.f12594b + ", nickName=" + this.f12595c + ", displayId=" + this.f12596d + ", avatar=" + this.f12597e + ", userHonor=" + this.f12598f + ", isAdmin=" + this.f12599g + ")";
    }

    /* renamed from: com.bytedance.android.live.s.a.a$a  reason: collision with other inner class name */
    public static final class C0265a {
        static {
            Covode.recordClassIndex(6938);
        }

        private C0265a() {
        }

        public /* synthetic */ C0265a(byte b2) {
            this();
        }

        public static a a(User user) {
            boolean z;
            l.d(user, "");
            long id = user.getId();
            String secUid = user.getSecUid();
            l.b(secUid, "");
            String nickName = user.getNickName();
            String str = user.displayId;
            ImageModel avatarThumb = user.getAvatarThumb();
            bc userHonor = user.getUserHonor();
            ba userAttr = user.getUserAttr();
            if (userAttr != null) {
                z = userAttr.f19030b;
            } else {
                z = false;
            }
            return new a(id, secUid, nickName, str, avatarThumb, userHonor, z);
        }
    }

    private /* synthetic */ a() {
        this(0, "", null, null, null, null, false);
    }

    public final int hashCode() {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2 = this.f12593a;
        int i6 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        String str = this.f12594b;
        int i7 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i8 = (i6 + i2) * 31;
        String str2 = this.f12595c;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i9 = (i8 + i3) * 31;
        String str3 = this.f12596d;
        if (str3 != null) {
            i4 = str3.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = (i9 + i4) * 31;
        ImageModel imageModel = this.f12597e;
        if (imageModel != null) {
            i5 = imageModel.hashCode();
        } else {
            i5 = 0;
        }
        int i11 = (i10 + i5) * 31;
        bc bcVar = this.f12598f;
        if (bcVar != null) {
            i7 = bcVar.hashCode();
        }
        int i12 = (i11 + i7) * 31;
        boolean z = this.f12599g;
        if (z) {
            z = true;
        }
        int i13 = z ? 1 : 0;
        int i14 = z ? 1 : 0;
        int i15 = z ? 1 : 0;
        return i12 + i13;
    }

    public a(long j2, String str, String str2, String str3, ImageModel imageModel, bc bcVar, boolean z) {
        l.d(str, "");
        this.f12593a = j2;
        this.f12594b = str;
        this.f12595c = str2;
        this.f12596d = str3;
        this.f12597e = imageModel;
        this.f12598f = bcVar;
        this.f12599g = z;
    }
}
