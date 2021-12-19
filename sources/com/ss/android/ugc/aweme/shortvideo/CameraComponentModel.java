package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.o;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.a;
import com.ss.android.ugc.tools.c;
import com.ss.android.ugc.tools.utils.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class CameraComponentModel implements Parcelable {
    public static final Parcelable.Creator<CameraComponentModel> CREATOR = new Parcelable.Creator<CameraComponentModel>() {
        /* class com.ss.android.ugc.aweme.shortvideo.CameraComponentModel.AnonymousClass2 */

        static {
            Covode.recordClassIndex(81952);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CameraComponentModel[] newArray(int i2) {
            return new CameraComponentModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CameraComponentModel createFromParcel(Parcel parcel) {
            return new CameraComponentModel(parcel, (byte) 0);
        }
    };
    public float A;
    public boolean B;
    public int C;
    public String D;
    public Map<String, Object> E;
    public boolean F;
    public RecordContext G;
    public boolean H;
    private dt I;

    /* renamed from: a  reason: collision with root package name */
    public final int f124706a;

    /* renamed from: b  reason: collision with root package name */
    public long f124707b;

    /* renamed from: c  reason: collision with root package name */
    public int f124708c;

    /* renamed from: d  reason: collision with root package name */
    public int f124709d;

    /* renamed from: e  reason: collision with root package name */
    public int f124710e;

    /* renamed from: f  reason: collision with root package name */
    public dt f124711f;

    /* renamed from: g  reason: collision with root package name */
    public long f124712g;

    /* renamed from: h  reason: collision with root package name */
    public Workspace f124713h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f124714i;

    /* renamed from: j  reason: collision with root package name */
    public long f124715j;

    /* renamed from: k  reason: collision with root package name */
    public long f124716k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f124717l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f124718m;
    public ClientCherEffectParam n;
    public DuetContext o;
    public ReactionContext p;
    public int q;
    public a r;
    public boolean s;
    public boolean t;
    public int u;
    public GameDuetResource v;
    public ExtractFramesModel w;
    public bi x;
    public String y;
    public boolean z;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(81950);
    }

    public final dt d() {
        if (this.f124714i) {
            return this.I;
        }
        return this.f124711f;
    }

    public final String e() {
        if (a()) {
            return this.f124713h.c();
        }
        return null;
    }

    public final long h() {
        if (this.f124714i) {
            return this.f124715j;
        }
        return this.f124712g;
    }

    public final long k() {
        if (this.f124714i) {
            return this.f124716k;
        }
        return this.f124707b;
    }

    public final boolean a() {
        if (this.f124713h.c() == null || b() || c()) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        if (TextUtils.isEmpty(this.o.f124722c) || TextUtils.isEmpty(this.o.f124723d)) {
            return false;
        }
        return true;
    }

    public final long g() {
        if (this.f124714i) {
            return this.x.a() + ((long) this.q);
        }
        return (long) this.q;
    }

    public final boolean i() {
        Iterator it = this.f124711f.iterator();
        while (it.hasNext()) {
            if (((TimeSpeedModelExtension) it.next()).getBackgroundVideo() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean l() {
        if (!this.H || b() || c()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (this.p.f124739a == null || TextUtils.isEmpty(this.p.f124739a.videoPath) || TextUtils.isEmpty(this.p.f124739a.wavPath)) {
            return false;
        }
        return true;
    }

    public final String f() {
        String e2 = e();
        if (e2 != null) {
            return e2;
        }
        if (this.o.f124723d != null) {
            return this.o.f124723d;
        }
        if (this.p.f124739a != null) {
            return this.p.f124739a.wavPath;
        }
        return null;
    }

    public final dt j() {
        if (!this.f124714i || d.a(this.I)) {
            return this.f124711f;
        }
        dt dtVar = new dt(this.f124711f);
        dtVar.remove(this.x.b());
        dtVar.addAll(this.x.b(), this.I);
        return dtVar;
    }

    public final void a(long j2) {
        if (this.f124714i) {
            this.f124715j = j2;
        } else {
            this.f124712g = j2;
        }
    }

    public static ArrayList<TimeSpeedModelExtension> a(String str) {
        try {
            ArrayList arrayList = (ArrayList) c.f149148c.a(str, new com.google.gson.b.a<ArrayList<o>>() {
                /* class com.ss.android.ugc.aweme.shortvideo.CameraComponentModel.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(81951);
                }
            }.type);
            ArrayList<TimeSpeedModelExtension> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(TimeSpeedModelExtension.fromJson(c.f149148c, (o) it.next()));
            }
            return arrayList2;
        } catch (Exception unused) {
            return b(str);
        }
    }

    public CameraComponentModel(int i2) {
        this.f124711f = new dt();
        this.I = new dt();
        this.f124712g = 0;
        this.f124715j = 0;
        this.f124717l = false;
        this.f124718m = false;
        this.o = new DuetContext((byte) 0);
        this.p = new ReactionContext((byte) 0);
        this.s = true;
        this.t = true;
        this.A = -1.0f;
        this.F = false;
        this.G = new RecordContext();
        this.H = false;
        this.f124706a = i2;
    }

    private static ArrayList<TimeSpeedModelExtension> b(String str) {
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList<>();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        String[] split = str.split("\\$");
        if (split.length > 0) {
            for (String str2 : split) {
                String[] split2 = str2.split(",");
                if (split2.length == 2) {
                    try {
                        arrayList.add(new TimeSpeedModelExtension(Integer.parseInt(split2[0]), (double) Float.parseFloat(split2[1]), null, null, null));
                    } catch (Exception unused) {
                    }
                }
                if (split2.length == 3) {
                    try {
                        arrayList.add(new TimeSpeedModelExtension(Integer.parseInt(split2[0]), (double) Float.parseFloat(split2[1]), split2[2], null, null));
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    private CameraComponentModel(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f124711f = new dt();
        this.I = new dt();
        this.f124712g = 0;
        this.f124715j = 0;
        boolean z6 = false;
        this.f124717l = false;
        this.f124718m = false;
        this.o = new DuetContext((byte) 0);
        this.p = new ReactionContext((byte) 0);
        this.s = true;
        this.t = true;
        this.A = -1.0f;
        this.F = false;
        this.G = new RecordContext();
        this.H = false;
        this.f124706a = parcel.readInt();
        this.f124707b = parcel.readLong();
        this.y = parcel.readString();
        this.q = parcel.readInt();
        this.f124708c = parcel.readInt();
        this.f124709d = parcel.readInt();
        this.f124713h = (Workspace) parcel.readParcelable(Workspace.class.getClassLoader());
        this.f124711f = new dt(a(parcel.readString()));
        this.f124712g = parcel.readLong();
        this.f124710e = parcel.readInt();
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.B = z2;
        this.C = parcel.readInt();
        this.o = (DuetContext) parcel.readParcelable(DuetContext.class.getClassLoader());
        this.G = (RecordContext) parcel.readParcelable(RecordContext.class.getClassLoader());
        this.p = (ReactionContext) parcel.readParcelable(ReactionContext.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.s = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.t = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f124717l = z5;
        this.u = parcel.readInt();
        this.v = (GameDuetResource) parcel.readParcelable(GameDuetResource.class.getClassLoader());
        this.w = (ExtractFramesModel) parcel.readSerializable();
        this.n = (ClientCherEffectParam) parcel.readParcelable(ClientCherEffectParam.class.getClassLoader());
        this.z = parcel.readByte() != 0 ? true : z6;
        this.A = parcel.readFloat();
    }

    /* synthetic */ CameraComponentModel(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f124706a);
        parcel.writeLong(this.f124707b);
        parcel.writeString(this.y);
        parcel.writeInt(this.q);
        parcel.writeInt(this.f124708c);
        parcel.writeInt(this.f124709d);
        parcel.writeParcelable(this.f124713h, i2);
        parcel.writeString(du.a(this.f124711f));
        parcel.writeLong(this.f124712g);
        parcel.writeInt(this.f124710e);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeInt(this.C);
        parcel.writeParcelable(this.o, i2);
        parcel.writeParcelable(this.G, i2);
        parcel.writeParcelable(this.p, i2);
        parcel.writeByte(this.s ? (byte) 1 : 0);
        parcel.writeByte(this.t ? (byte) 1 : 0);
        parcel.writeByte(this.f124717l ? (byte) 1 : 0);
        parcel.writeInt(this.u);
        parcel.writeParcelable(this.v, i2);
        parcel.writeSerializable(this.w);
        parcel.writeParcelable(this.n, i2);
        parcel.writeByte(this.z ? (byte) 1 : 0);
        parcel.writeFloat(this.A);
    }
}
