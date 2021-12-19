package com.ss.android.ugc.aweme.tools.mvtemplate;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.google.gson.b.a;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.k;
import java.util.List;
import org.json.JSONObject;

public class MvThemeData implements Parcelable {
    public static final Parcelable.Creator<MvThemeData> CREATOR = new Parcelable.Creator<MvThemeData>() {
        /* class com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData.AnonymousClass2 */

        static {
            Covode.recordClassIndex(91840);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MvThemeData[] newArray(int i2) {
            return new MvThemeData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MvThemeData createFromParcel(Parcel parcel) {
            return new MvThemeData(parcel);
        }
    };
    @c(a = "effect")

    /* renamed from: a  reason: collision with root package name */
    public Effect f140618a;
    @c(a = "urlPrefixList")

    /* renamed from: b  reason: collision with root package name */
    public List<String> f140619b;
    @c(a = "minCount")

    /* renamed from: c  reason: collision with root package name */
    public int f140620c;
    @c(a = "maxCount")

    /* renamed from: d  reason: collision with root package name */
    public int f140621d;
    @c(a = "videoMd5")

    /* renamed from: e  reason: collision with root package name */
    public String f140622e;
    @c(a = "resFillMode")

    /* renamed from: f  reason: collision with root package name */
    public String f140623f;
    @c(a = "resWidth")

    /* renamed from: g  reason: collision with root package name */
    public int f140624g;
    @c(a = "resHeight")

    /* renamed from: h  reason: collision with root package name */
    public int f140625h;
    @c(a = "isDefaultType")

    /* renamed from: i  reason: collision with root package name */
    public boolean f140626i;
    @c(a = "mvType")

    /* renamed from: j  reason: collision with root package name */
    public int f140627j;
    @c(a = "needServerExecute")

    /* renamed from: k  reason: collision with root package name */
    public boolean f140628k;
    @c(a = "mvAlgorithmHint")

    /* renamed from: l  reason: collision with root package name */
    String f140629l;
    @c(a = "mvAutoSaveToast")

    /* renamed from: m  reason: collision with root package name */
    public String f140630m;
    @c(a = "algorithmKeyForSave")
    public List<String> n;
    @c(a = "srcLimitWidth")
    public int o;
    @c(a = "srcLimitHeight")
    public int p;
    @c(a = "srcLimitToast")
    public String q;
    @c(a = "hasCommerceMusic")
    public boolean r;
    @c(a = "imgMd5")
    private String s;

    public int describeContents() {
        return 0;
    }

    public MvThemeData() {
    }

    static {
        Covode.recordClassIndex(91838);
    }

    public final String a() {
        Effect effect = this.f140618a;
        if (effect != null) {
            return effect.getEffectId();
        }
        return null;
    }

    public final List<String> b() {
        Effect effect = this.f140618a;
        if (effect != null) {
            return effect.getMusic();
        }
        return null;
    }

    public final String d() {
        Effect effect = this.f140618a;
        if (effect != null) {
            return effect.getUnzipPath();
        }
        return null;
    }

    public final String h() {
        Effect effect = this.f140618a;
        if (effect != null) {
            return effect.getHint();
        }
        return "";
    }

    public final String i() {
        Effect effect = this.f140618a;
        if (effect != null) {
            return effect.getId();
        }
        return null;
    }

    public final String f() {
        Effect effect = this.f140618a;
        if (effect == null || effect.getName() == null) {
            return "";
        }
        return this.f140618a.getName();
    }

    public final String c() {
        UrlModel fileUrl;
        Effect effect = this.f140618a;
        if (effect == null || (fileUrl = effect.getFileUrl()) == null || k.a(fileUrl.getUrlList())) {
            return null;
        }
        return fileUrl.getUrlList().get(0);
    }

    public final String e() {
        if (!TextUtils.isEmpty(this.f140622e) && !k.a(this.f140619b)) {
            return this.f140619b.get(0) + this.f140622e;
        }
        return null;
    }

    public final String g() {
        if (!TextUtils.isEmpty(this.s) && !k.a(this.f140619b)) {
            return this.f140619b.get(0) + this.s;
        }
        return null;
    }

    private void j() {
        if (this.f140618a != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f140618a.getExtra());
                this.f140620c = jSONObject.optInt("template_min_material", 0);
                this.f140621d = jSONObject.optInt("template_max_material", 0);
                this.f140622e = jSONObject.optString("template_video_cover", "");
                this.s = jSONObject.optString("template_picture_cover", "");
                this.f140623f = jSONObject.optString("template_pic_fill_mode", "AspectFit");
                this.f140624g = jSONObject.optInt("template_pic_input_width", 720);
                this.f140625h = jSONObject.optInt("template_pic_input_height", 1280);
                this.f140627j = jSONObject.optInt("template_type", 0);
                this.f140629l = jSONObject.optString("mv_algorithm_hint");
                this.f140630m = jSONObject.optString("mv_auto_save_toast");
                this.q = jSONObject.optString("mv_resolution_limited_toast");
                this.o = jSONObject.optInt("mv_resolution_limited_width");
                this.p = jSONObject.optInt("mv_resolution_limited_height");
                this.n = (List) com.ss.android.ugc.aweme.port.in.c.f115623b.a(jSONObject.optString("mv_server_algorithm_result_save_keys"), new a<List<String>>() {
                    /* class com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(91839);
                    }
                }.type);
                this.r = jSONObject.optBoolean("is_commerce_music", false);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void a(Effect effect) {
        this.f140618a = effect;
        j();
    }

    protected MvThemeData(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f140618a = (Effect) parcel.readParcelable(Effect.class.getClassLoader());
        this.f140619b = parcel.createStringArrayList();
        this.f140620c = parcel.readInt();
        this.f140621d = parcel.readInt();
        this.f140622e = parcel.readString();
        this.s = parcel.readString();
        this.f140623f = parcel.readString();
        this.f140624g = parcel.readInt();
        this.f140625h = parcel.readInt();
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f140626i = z;
        this.f140627j = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f140628k = z2;
        this.f140629l = parcel.readString();
        this.f140630m = parcel.readString();
        this.n = parcel.createStringArrayList();
        this.r = parcel.readByte() == 0 ? false : z3;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f140618a, i2);
        parcel.writeStringList(this.f140619b);
        parcel.writeInt(this.f140620c);
        parcel.writeInt(this.f140621d);
        parcel.writeString(this.f140622e);
        parcel.writeString(this.s);
        parcel.writeString(this.f140623f);
        parcel.writeInt(this.f140624g);
        parcel.writeInt(this.f140625h);
        parcel.writeByte(this.f140626i ? (byte) 1 : 0);
        parcel.writeInt(this.f140627j);
        parcel.writeByte(this.f140628k ? (byte) 1 : 0);
        parcel.writeString(this.f140629l);
        parcel.writeString(this.f140630m);
        parcel.writeStringList(this.n);
        parcel.writeByte(this.r ? (byte) 1 : 0);
    }
}
