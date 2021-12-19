package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class j {
    @c(a = "icon")

    /* renamed from: a  reason: collision with root package name */
    public ImageModel f19085a;
    @c(a = "level")

    /* renamed from: b  reason: collision with root package name */
    public long f19086b;
    @c(a = "source")

    /* renamed from: c  reason: collision with root package name */
    public String f19087c;
    @c(a = "profile_decoration_ribbon")

    /* renamed from: d  reason: collision with root package name */
    public ImageModel f19088d;

    static {
        Covode.recordClassIndex(11382);
    }

    public int hashCode() {
        int i2;
        ImageModel imageModel = this.f19085a;
        if (imageModel != null) {
            i2 = imageModel.hashCode();
        } else {
            i2 = 0;
        }
        long j2 = this.f19086b;
        return (i2 * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f19086b != jVar.f19086b) {
                return false;
            }
            ImageModel imageModel = this.f19085a;
            ImageModel imageModel2 = jVar.f19085a;
            if (imageModel != null) {
                return imageModel.equals(imageModel2);
            }
            if (imageModel2 == null) {
                return true;
            }
        }
        return false;
    }
}
