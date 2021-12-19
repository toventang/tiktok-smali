package com.bytedance.common.wschannel.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.common.utility.m;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class SsWsApp implements Parcelable, IWsApp {
    public static final Parcelable.Creator<SsWsApp> CREATOR = new Parcelable.Creator<SsWsApp>() {
        /* class com.bytedance.common.wschannel.model.SsWsApp.AnonymousClass1 */

        static {
            Covode.recordClassIndex(16071);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SsWsApp[] newArray(int i2) {
            return new SsWsApp[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SsWsApp createFromParcel(Parcel parcel) {
            return new SsWsApp(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    List<String> f27274a;

    /* renamed from: b  reason: collision with root package name */
    int f27275b;

    /* renamed from: c  reason: collision with root package name */
    String f27276c;

    /* renamed from: d  reason: collision with root package name */
    int f27277d;

    /* renamed from: e  reason: collision with root package name */
    String f27278e;

    /* renamed from: f  reason: collision with root package name */
    String f27279f;

    /* renamed from: g  reason: collision with root package name */
    int f27280g;

    /* renamed from: h  reason: collision with root package name */
    int f27281h;

    /* renamed from: i  reason: collision with root package name */
    int f27282i;

    /* renamed from: j  reason: collision with root package name */
    String f27283j;

    public int describeContents() {
        return 0;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int a() {
        return this.f27275b;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int b() {
        return this.f27277d;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String c() {
        return this.f27278e;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String d() {
        return this.f27279f;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int e() {
        return this.f27280g;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int f() {
        return this.f27281h;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String h() {
        return this.f27283j;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final int i() {
        return this.f27282i;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final String j() {
        return this.f27276c;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final List<String> k() {
        return this.f27274a;
    }

    static {
        Covode.recordClassIndex(16070);
    }

    protected SsWsApp() {
        this.f27274a = new ArrayList();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f27284a;

        /* renamed from: b  reason: collision with root package name */
        public String f27285b;

        /* renamed from: c  reason: collision with root package name */
        public String f27286c;

        /* renamed from: d  reason: collision with root package name */
        public int f27287d;

        /* renamed from: e  reason: collision with root package name */
        public int f27288e;

        /* renamed from: f  reason: collision with root package name */
        public int f27289f;

        /* renamed from: g  reason: collision with root package name */
        public String f27290g;

        /* renamed from: h  reason: collision with root package name */
        public String f27291h;

        /* renamed from: i  reason: collision with root package name */
        public int f27292i;

        /* renamed from: j  reason: collision with root package name */
        public List<String> f27293j;

        static {
            Covode.recordClassIndex(16072);
        }

        public final SsWsApp a() {
            return new SsWsApp(this.f27292i, this.f27284a, this.f27285b, this.f27286c, this.f27293j, this.f27287d, this.f27288e, this.f27289f, this.f27290g, this.f27291h, (byte) 0);
        }

        public static SsWsApp a(JSONObject jSONObject) {
            SsWsApp ssWsApp = new SsWsApp();
            if (jSONObject != null) {
                ssWsApp.f27275b = jSONObject.optInt("channel_id");
                ssWsApp.f27277d = jSONObject.optInt("app_id");
                ssWsApp.f27278e = jSONObject.optString("device_id");
                ssWsApp.f27279f = jSONObject.optString("install_id");
                ssWsApp.f27280g = jSONObject.optInt("app_version");
                ssWsApp.f27281h = jSONObject.optInt("platform");
                ssWsApp.f27282i = jSONObject.optInt("fpid");
                ssWsApp.f27283j = jSONObject.optString("app_kay");
                ssWsApp.f27276c = jSONObject.optString("extra");
                JSONArray optJSONArray = jSONObject.optJSONArray("urls");
                ssWsApp.f27274a.clear();
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        ssWsApp.f27274a.add(optJSONArray.optString(i2));
                    }
                }
            }
            return ssWsApp;
        }
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4 = ((this.f27277d * 31) + this.f27275b) * 31;
        String str = this.f27278e;
        int i5 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i4 + i2) * 31;
        String str2 = this.f27279f;
        if (str2 != null) {
            i3 = str2.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str3 = this.f27276c;
        if (str3 != null) {
            i5 = str3.hashCode();
        }
        return ((((i7 + i5) * 31) + this.f27280g) * 31) + this.f27281h;
    }

    @Override // com.bytedance.common.wschannel.app.IWsApp
    public final JSONObject g() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("channel_id", this.f27275b);
        jSONObject.put("app_id", this.f27277d);
        jSONObject.put("device_id", this.f27278e);
        jSONObject.put("install_id", this.f27279f);
        JSONArray jSONArray = new JSONArray();
        List<String> list = this.f27274a;
        if (list != null) {
            for (String str : list) {
                jSONArray.put(str);
            }
        }
        jSONObject.put("urls", jSONArray);
        jSONObject.put("app_version", this.f27280g);
        jSONObject.put("platform", this.f27281h);
        jSONObject.put("fpid", this.f27282i);
        jSONObject.put("app_kay", this.f27283j);
        jSONObject.put("extra", this.f27276c);
        return jSONObject;
    }

    protected SsWsApp(Parcel parcel) {
        this.f27274a = new ArrayList();
        this.f27274a = parcel.createStringArrayList();
        this.f27275b = parcel.readInt();
        this.f27276c = parcel.readString();
        this.f27277d = parcel.readInt();
        this.f27278e = parcel.readString();
        this.f27279f = parcel.readString();
        this.f27280g = parcel.readInt();
        this.f27281h = parcel.readInt();
        this.f27282i = parcel.readInt();
        this.f27283j = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SsWsApp ssWsApp = (SsWsApp) obj;
        if (!(this.f27275b == ssWsApp.f27275b && this.f27277d == ssWsApp.f27277d && this.f27280g == ssWsApp.f27280g && this.f27281h == ssWsApp.f27281h)) {
            return false;
        }
        String str = this.f27278e;
        if (str == null ? ssWsApp.f27278e != null : !str.equals(ssWsApp.f27278e)) {
            return false;
        }
        String str2 = this.f27279f;
        if (str2 == null ? ssWsApp.f27279f != null : !str2.equals(ssWsApp.f27279f)) {
            return false;
        }
        if (this.f27282i != ssWsApp.f27282i) {
            return false;
        }
        String str3 = this.f27283j;
        if (str3 == null ? ssWsApp.f27283j != null : !str3.equals(ssWsApp.f27283j)) {
            return false;
        }
        if (this.f27274a.size() != ssWsApp.f27274a.size()) {
            return false;
        }
        for (String str4 : this.f27274a) {
            if (!ssWsApp.f27274a.contains(str4)) {
                return false;
            }
        }
        return m.a(this.f27276c, ssWsApp.f27276c);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f27274a);
        parcel.writeInt(this.f27275b);
        parcel.writeString(this.f27276c);
        parcel.writeInt(this.f27277d);
        parcel.writeString(this.f27278e);
        parcel.writeString(this.f27279f);
        parcel.writeInt(this.f27280g);
        parcel.writeInt(this.f27281h);
        parcel.writeInt(this.f27282i);
        parcel.writeString(this.f27283j);
    }

    private SsWsApp(int i2, int i3, String str, String str2, List<String> list, int i4, int i5, int i6, String str3, String str4) {
        ArrayList arrayList = new ArrayList();
        this.f27274a = arrayList;
        this.f27277d = i3;
        this.f27275b = i2;
        this.f27278e = str;
        this.f27279f = str2;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f27280g = i4;
        this.f27281h = i5;
        this.f27282i = i6;
        this.f27283j = str3;
        this.f27276c = str4;
    }

    /* synthetic */ SsWsApp(int i2, int i3, String str, String str2, List list, int i4, int i5, int i6, String str3, String str4, byte b2) {
        this(i2, i3, str, str2, list, i4, i5, i6, str3, str4);
    }
}
