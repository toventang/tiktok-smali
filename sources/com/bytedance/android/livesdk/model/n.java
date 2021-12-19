package com.bytedance.android.livesdk.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.util.List;

public class n implements ag {
    @c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public long f19720a;
    @c(a = "title")

    /* renamed from: b  reason: collision with root package name */
    public String f19721b;
    @c(a = "url_list")

    /* renamed from: c  reason: collision with root package name */
    public List<String> f19722c;
    @c(a = "uri")

    /* renamed from: d  reason: collision with root package name */
    public String f19723d;
    @c(a = "height")

    /* renamed from: e  reason: collision with root package name */
    public int f19724e;
    @c(a = "width")

    /* renamed from: f  reason: collision with root package name */
    public int f19725f;
    @c(a = "schema_url")

    /* renamed from: g  reason: collision with root package name */
    public String f19726g;
    @c(a = "text")

    /* renamed from: h  reason: collision with root package name */
    public String f19727h;
    @c(a = "avg_color")

    /* renamed from: i  reason: collision with root package name */
    public String f19728i;
    @c(a = "banner_type")

    /* renamed from: j  reason: collision with root package name */
    public int f19729j;

    /* renamed from: k  reason: collision with root package name */
    private ImageModel f19730k;

    static {
        Covode.recordClassIndex(11708);
    }

    @Override // com.bytedance.android.livesdk.model.ag
    public long getId() {
        return this.f19720a;
    }

    @Override // com.bytedance.android.livesdk.model.ag
    public String getMixId() {
        return String.valueOf(getId());
    }

    public final ImageModel a() {
        if (!(this.f19730k != null || this.f19722c == null || this.f19723d == null)) {
            this.f19730k = new ImageModel(this.f19723d, this.f19722c);
        }
        return this.f19730k;
    }

    public final boolean a(n nVar) {
        if (this == nVar) {
            return true;
        }
        if (!(nVar != null && this.f19720a == nVar.f19720a && TextUtils.equals(this.f19721b, nVar.f19721b) && TextUtils.equals(this.f19723d, nVar.f19723d) && TextUtils.equals(this.f19726g, nVar.f19726g) && TextUtils.equals(this.f19727h, nVar.f19727h) && this.f19725f == nVar.f19725f && this.f19724e == nVar.f19724e)) {
            return false;
        }
        List<String> list = this.f19722c;
        if (list == null) {
            if (nVar.f19722c != null) {
                return false;
            }
            if (nVar.f19722c == null) {
                return true;
            }
        } else if (nVar.f19722c == null) {
            return false;
        }
        if (list.size() != nVar.f19722c.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.f19722c.size(); i2++) {
            if (!TextUtils.equals(this.f19722c.get(i2), nVar.f19722c.get(i2))) {
                return false;
            }
        }
        return true;
    }
}
