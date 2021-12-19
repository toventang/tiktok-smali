package com.bytedance.android.livesdk.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class y {
    @c(a = "level_str")

    /* renamed from: a  reason: collision with root package name */
    public String f19787a;
    @c(a = "icon_diamond")

    /* renamed from: b  reason: collision with root package name */
    public int f19788b;
    @c(a = "icon")

    /* renamed from: c  reason: collision with root package name */
    public ImageModel f19789c;
    @c(a = "level")

    /* renamed from: d  reason: collision with root package name */
    public int f19790d;

    static {
        Covode.recordClassIndex(11730);
    }

    public int hashCode() {
        int i2;
        String str = this.f19787a;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = ((i2 * 31) + this.f19788b) * 31;
        ImageModel imageModel = this.f19789c;
        if (imageModel != null) {
            i3 = imageModel.hashCode();
        }
        return ((i4 + i3) * 31) + this.f19790d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f19788b != yVar.f19788b || this.f19790d != yVar.f19790d) {
                return false;
            }
            String str = this.f19787a;
            if (str == null ? yVar.f19787a != null : !str.equals(yVar.f19787a)) {
                return false;
            }
            ImageModel imageModel = this.f19789c;
            ImageModel imageModel2 = yVar.f19789c;
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
