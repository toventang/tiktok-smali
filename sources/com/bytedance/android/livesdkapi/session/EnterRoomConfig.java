package com.bytedance.android.livesdkapi.session;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.fragment.app.e;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.WarningTag;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class EnterRoomConfig implements Parcelable {
    public static final Parcelable.Creator<EnterRoomConfig> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final a f23296f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public StreamData f23297a;

    /* renamed from: b  reason: collision with root package name */
    public LogData f23298b;

    /* renamed from: c  reason: collision with root package name */
    public RoomsData f23299c;

    /* renamed from: d  reason: collision with root package name */
    public FeedCoverData f23300d;

    /* renamed from: e  reason: collision with root package name */
    public SearchWrapData f23301e;

    public static final class FeedCoverData implements Parcelable {
        public static final Parcelable.Creator<FeedCoverData> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public static final a f23302c = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public boolean f23303a;

        /* renamed from: b  reason: collision with root package name */
        public List<String> f23304b;

        public final int describeContents() {
            return 0;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(13860);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<FeedCoverData> {
            static {
                Covode.recordClassIndex(13861);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ FeedCoverData[] newArray(int i2) {
                return new FeedCoverData[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ FeedCoverData createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new FeedCoverData(parcel);
            }
        }

        public FeedCoverData() {
        }

        static {
            Covode.recordClassIndex(13859);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public FeedCoverData(Parcel parcel) {
            this();
            l.d(parcel, "");
            this.f23303a = 1 != parcel.readInt() ? false : true;
            this.f23304b = parcel.createStringArrayList();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeInt(this.f23303a ? 1 : 0);
            parcel.writeStringList(this.f23304b);
        }
    }

    public static final class GuestUser implements Parcelable {
        public static final a CREATOR = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public long f23305a;

        /* renamed from: b  reason: collision with root package name */
        public String f23306b;

        /* renamed from: c  reason: collision with root package name */
        public int f23307c;

        /* renamed from: d  reason: collision with root package name */
        public String f23308d;

        static {
            Covode.recordClassIndex(13862);
        }

        public final int describeContents() {
            return 0;
        }

        public static final class a implements Parcelable.Creator<GuestUser> {
            static {
                Covode.recordClassIndex(13863);
            }

            private a() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ GuestUser[] newArray(int i2) {
                return new GuestUser[i2];
            }

            public /* synthetic */ a(byte b2) {
                this();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ GuestUser createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new GuestUser(parcel);
            }
        }

        public GuestUser() {
            this.f23308d = "";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public GuestUser(Parcel parcel) {
            this();
            l.d(parcel, "");
            this.f23305a = parcel.readLong();
            this.f23306b = parcel.readString();
            this.f23307c = parcel.readInt();
            this.f23308d = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            if (parcel != null) {
                parcel.writeLong(this.f23305a);
                parcel.writeString(this.f23306b);
                parcel.writeInt(this.f23307c);
                parcel.writeString(this.f23308d);
            }
        }
    }

    public static final class LogData implements Parcelable {
        public static final Parcelable.Creator<LogData> CREATOR = new b();
        public static final a N = new a((byte) 0);
        public String A;
        public String B;
        public String C;
        public String D;
        public String E;
        public String F;
        public String G;
        public String H;
        public String I;
        public String J;
        public String K;
        public String L;
        public int M;

        /* renamed from: a  reason: collision with root package name */
        public String f23309a;

        /* renamed from: b  reason: collision with root package name */
        public String f23310b;

        /* renamed from: c  reason: collision with root package name */
        public String f23311c;

        /* renamed from: d  reason: collision with root package name */
        public String f23312d;

        /* renamed from: e  reason: collision with root package name */
        public String f23313e;

        /* renamed from: f  reason: collision with root package name */
        public String f23314f;

        /* renamed from: g  reason: collision with root package name */
        public String f23315g;

        /* renamed from: h  reason: collision with root package name */
        public String f23316h;

        /* renamed from: i  reason: collision with root package name */
        public String f23317i;

        /* renamed from: j  reason: collision with root package name */
        public String f23318j;

        /* renamed from: k  reason: collision with root package name */
        public long f23319k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f23320l;

        /* renamed from: m  reason: collision with root package name */
        public String f23321m;
        public long n;
        public String o;
        public String p;
        public String q;
        public String r;
        public String s;
        public String t;
        public long u;
        public long v;
        public long w;
        public String x;
        public String y;
        public String z;

        public final int describeContents() {
            return 0;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(13865);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<LogData> {
            static {
                Covode.recordClassIndex(13866);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LogData[] newArray(int i2) {
                return new LogData[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LogData createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new LogData(parcel);
            }
        }

        public LogData() {
            this.f23317i = "";
            this.f23318j = "";
            this.t = "";
            this.M = -1;
        }

        static {
            Covode.recordClassIndex(13864);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public LogData(Parcel parcel) {
            this();
            l.d(parcel, "");
            this.f23309a = parcel.readString();
            this.f23310b = parcel.readString();
            this.f23311c = parcel.readString();
            this.f23314f = parcel.readString();
            this.f23315g = parcel.readString();
            this.f23316h = parcel.readString();
            this.f23317i = parcel.readString();
            this.f23318j = parcel.readString();
            this.f23319k = parcel.readLong();
            this.f23320l = 1 != parcel.readInt() ? false : true;
            this.f23321m = parcel.readString();
            this.n = parcel.readLong();
            this.o = parcel.readString();
            this.p = parcel.readString();
            this.q = parcel.readString();
            this.r = parcel.readString();
            this.s = parcel.readString();
            this.t = parcel.readString();
            this.u = parcel.readLong();
            this.v = parcel.readLong();
            this.w = parcel.readLong();
            this.x = parcel.readString();
            this.y = parcel.readString();
            this.z = parcel.readString();
            this.A = parcel.readString();
            this.B = parcel.readString();
            this.C = parcel.readString();
            this.D = parcel.readString();
            this.E = parcel.readString();
            this.F = parcel.readString();
            this.G = parcel.readString();
            this.H = parcel.readString();
            this.I = parcel.readString();
            this.J = parcel.readString();
            this.K = parcel.readString();
            this.L = parcel.readString();
            this.M = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f23309a);
            parcel.writeString(this.f23310b);
            parcel.writeString(this.f23311c);
            parcel.writeString(this.f23314f);
            parcel.writeString(this.f23315g);
            parcel.writeString(this.f23316h);
            parcel.writeString(this.f23317i);
            parcel.writeString(this.f23318j);
            parcel.writeLong(this.f23319k);
            parcel.writeInt(this.f23320l ? 1 : 0);
            parcel.writeString(this.f23321m);
            parcel.writeLong(this.n);
            parcel.writeString(this.o);
            parcel.writeString(this.p);
            parcel.writeString(this.q);
            parcel.writeString(this.r);
            parcel.writeString(this.s);
            parcel.writeString(this.t);
            parcel.writeLong(this.u);
            parcel.writeLong(this.v);
            parcel.writeLong(this.w);
            parcel.writeString(this.x);
            parcel.writeString(this.y);
            parcel.writeString(this.z);
            parcel.writeString(this.A);
            parcel.writeString(this.B);
            parcel.writeString(this.C);
            parcel.writeString(this.D);
            parcel.writeString(this.E);
            parcel.writeString(this.F);
            parcel.writeString(this.G);
            parcel.writeString(this.H);
            parcel.writeString(this.I);
            parcel.writeString(this.J);
            parcel.writeString(this.K);
            parcel.writeString(this.L);
            parcel.writeInt(this.M);
        }
    }

    public static final class RoomsData implements Parcelable {
        public static final Parcelable.Creator<RoomsData> CREATOR = new b();
        public static final a aJ = new a((byte) 0);
        public String A;
        public SparseArray<EnterRoomConfig> B;
        public EnterRoomConfig C;
        public String D;
        public String E;
        public String F;
        public Rect G;
        public long[] H;
        public String I;
        public String J;
        public boolean K;
        public String L;
        public String M;
        public String N;
        public boolean O;
        public String P;
        public String Q;
        public long R;
        public i S;
        public String T;
        public boolean U;
        public int V;
        public String W;
        public String X;
        public long Y;
        public String Z;

        /* renamed from: a  reason: collision with root package name */
        public String f23322a;
        public long aA;
        public int aB;
        public HashMap<Long, String> aC;
        public MaskLayer aD;
        public WarningTag aE;
        public String aF;
        public String aG;
        public long aH;
        public long aI;
        public String aa;
        public String ab;
        public String ac;
        public String ad;
        public long ae;
        public TimeStamp af;
        public boolean ag;
        public int ah;
        public String ai;
        public long aj;
        public boolean ak;
        public boolean al;
        public boolean am;
        public long an;
        public long ao;
        public boolean ap;
        public boolean aq;
        public boolean ar;
        public String as;
        public String at;
        public GuestUser au;
        public String av;
        public boolean aw;
        public String ax;
        public ImageModel ay;
        public boolean az;

        /* renamed from: b  reason: collision with root package name */
        public boolean f23323b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f23324c;

        /* renamed from: d  reason: collision with root package name */
        public String f23325d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f23326e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f23327f;

        /* renamed from: g  reason: collision with root package name */
        public long f23328g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23329h;

        /* renamed from: i  reason: collision with root package name */
        public String f23330i;

        /* renamed from: j  reason: collision with root package name */
        public String f23331j;

        /* renamed from: k  reason: collision with root package name */
        public String f23332k;

        /* renamed from: l  reason: collision with root package name */
        public HashMap<String, String> f23333l;

        /* renamed from: m  reason: collision with root package name */
        public HashMap<String, String> f23334m;
        public String n;
        public boolean o;
        public String p;
        public String q;
        public int r;
        public String s;
        public int t;
        public long u;
        public String v;
        public long w;
        public Boolean x;
        public ArrayList<String> y;
        public String z;

        public final int describeContents() {
            return 0;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(13868);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<RoomsData> {
            static {
                Covode.recordClassIndex(13869);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RoomsData[] newArray(int i2) {
                return new RoomsData[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RoomsData createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new RoomsData(parcel);
            }
        }

        static {
            Covode.recordClassIndex(13867);
        }

        public RoomsData() {
            this.f23322a = "";
            this.f23333l = new HashMap<>();
            this.f23334m = new HashMap<>();
            this.q = "0";
            this.s = "";
            this.t = -1;
            this.v = "";
            this.w = -1;
            this.D = "0";
            this.P = "";
            this.Q = "";
            this.R = -1;
            this.S = i.VIDEO;
            this.W = "";
            this.X = "";
            this.aa = "inner_draw";
            this.ae = -1;
            this.af = new TimeStamp();
            this.au = new GuestUser();
            this.aF = "";
            this.aH = -1;
            this.aI = -1;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public RoomsData(Parcel parcel) {
            this();
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            l.d(parcel, "");
            boolean z16 = false;
            if (1 == parcel.readInt()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f23324c = z2;
            this.f23325d = parcel.readString();
            if (1 == parcel.readInt()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f23326e = z3;
            if (1 == parcel.readInt()) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.f23327f = z4;
            if (1 == parcel.readInt()) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.f23329h = z5;
            this.f23330i = parcel.readString();
            this.f23331j = parcel.readString();
            this.f23332k = parcel.readString();
            Serializable readSerializable = parcel.readSerializable();
            Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
            this.f23333l = (HashMap) readSerializable;
            Serializable readSerializable2 = parcel.readSerializable();
            Objects.requireNonNull(readSerializable2, "null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
            this.f23334m = (HashMap) readSerializable2;
            this.n = parcel.readString();
            if (1 == parcel.readInt()) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.o = z6;
            this.p = parcel.readString();
            this.q = parcel.readString();
            this.r = parcel.readInt();
            this.s = parcel.readString();
            this.t = parcel.readInt();
            this.u = parcel.readLong();
            this.v = parcel.readString();
            this.w = parcel.readLong();
            this.x = (Boolean) parcel.readValue(Boolean.TYPE.getClassLoader());
            this.y = parcel.createStringArrayList();
            this.z = parcel.readString();
            this.A = parcel.readString();
            this.B = parcel.readSparseArray(EnterRoomConfig.class.getClassLoader());
            this.C = (EnterRoomConfig) parcel.readParcelable(EnterRoomConfig.class.getClassLoader());
            this.D = parcel.readString();
            this.E = parcel.readString();
            this.F = parcel.readString();
            this.G = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
            this.H = parcel.createLongArray();
            this.J = parcel.readString();
            this.L = parcel.readString();
            this.N = parcel.readString();
            if (1 == parcel.readInt()) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.O = z7;
            this.P = parcel.readString();
            this.Q = parcel.readString();
            this.R = parcel.readLong();
            this.T = parcel.readString();
            if (1 == parcel.readInt()) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.U = z8;
            this.V = parcel.readInt();
            this.W = parcel.readString();
            this.X = parcel.readString();
            this.Y = parcel.readLong();
            this.Z = parcel.readString();
            this.ab = parcel.readString();
            this.ac = parcel.readString();
            this.ad = parcel.readString();
            this.ae = parcel.readLong();
            this.af = (TimeStamp) parcel.readParcelable(TimeStamp.class.getClassLoader());
            if (parcel.readInt() == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.ag = z9;
            this.ah = parcel.readInt();
            this.ai = parcel.readString();
            this.aj = parcel.readLong();
            if (parcel.readInt() == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.ak = z10;
            if (parcel.readInt() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.al = z11;
            if (parcel.readInt() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.am = z12;
            this.an = parcel.readLong();
            this.ao = parcel.readLong();
            if (parcel.readInt() == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.ap = z13;
            this.I = parcel.readString();
            if (parcel.readInt() == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.ar = z14;
            this.as = parcel.readString();
            this.at = parcel.readString();
            this.au = (GuestUser) parcel.readParcelable(GuestUser.class.getClassLoader());
            this.av = parcel.readString();
            if (parcel.readInt() == 1) {
                z15 = true;
            } else {
                z15 = false;
            }
            this.aw = z15;
            this.ay = (ImageModel) parcel.readParcelable(ImageModel.class.getClassLoader());
            this.az = parcel.readInt() == 1 ? true : z16;
            this.aA = parcel.readLong();
            this.aB = parcel.readInt();
            this.aF = parcel.readString();
            this.aG = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeInt(this.f23324c ? 1 : 0);
            parcel.writeString(this.f23325d);
            parcel.writeInt(this.f23326e ? 1 : 0);
            parcel.writeInt(this.f23327f ? 1 : 0);
            parcel.writeInt(this.f23329h ? 1 : 0);
            parcel.writeString(this.f23330i);
            parcel.writeString(this.f23331j);
            parcel.writeString(this.f23332k);
            parcel.writeSerializable(this.f23333l);
            parcel.writeSerializable(this.f23334m);
            parcel.writeString(this.n);
            parcel.writeInt(this.o ? 1 : 0);
            parcel.writeString(this.p);
            parcel.writeString(this.q);
            parcel.writeInt(this.r);
            parcel.writeString(this.s);
            parcel.writeInt(this.t);
            parcel.writeLong(this.u);
            parcel.writeString(this.v);
            parcel.writeLong(this.w);
            parcel.writeValue(this.x);
            parcel.writeStringList(this.y);
            parcel.writeString(this.z);
            parcel.writeString(this.A);
            parcel.writeSparseArray(this.B);
            parcel.writeParcelable(this.C, 0);
            parcel.writeString(this.D);
            parcel.writeString(this.E);
            parcel.writeString(this.F);
            parcel.writeParcelable(this.G, 0);
            parcel.writeLongArray(this.H);
            parcel.writeString(this.J);
            parcel.writeString(this.L);
            parcel.writeString(this.N);
            parcel.writeInt(this.O ? 1 : 0);
            parcel.writeString(this.P);
            parcel.writeString(this.Q);
            parcel.writeLong(this.R);
            parcel.writeString(this.T);
            parcel.writeInt(this.U ? 1 : 0);
            parcel.writeInt(this.V);
            parcel.writeString(this.W);
            parcel.writeString(this.X);
            parcel.writeLong(this.Y);
            parcel.writeString(this.Z);
            parcel.writeString(this.ab);
            parcel.writeString(this.ac);
            parcel.writeString(this.ad);
            parcel.writeLong(this.ae);
            parcel.writeParcelable(this.af, 0);
            parcel.writeInt(this.ag ? 1 : 0);
            parcel.writeInt(this.ah);
            parcel.writeString(this.ai);
            parcel.writeLong(this.aj);
            parcel.writeInt(this.ak ? 1 : 0);
            parcel.writeInt(this.al ? 1 : 0);
            parcel.writeInt(this.am ? 1 : 0);
            parcel.writeLong(this.an);
            parcel.writeLong(this.ao);
            parcel.writeInt(this.ap ? 1 : 0);
            parcel.writeString(this.I);
            parcel.writeInt(this.ar ? 1 : 0);
            parcel.writeString(this.as);
            parcel.writeString(this.at);
            parcel.writeParcelable(this.au, 0);
            parcel.writeString(this.av);
            parcel.writeInt(this.aw ? 1 : 0);
            parcel.writeParcelable(this.ay, 0);
            parcel.writeInt(this.az ? 1 : 0);
            parcel.writeLong(this.aA);
            parcel.writeInt(this.aB);
            parcel.writeString(this.aF);
            parcel.writeString(this.aG);
        }
    }

    public static final class SearchWrapData implements Parcelable {
        public static final Parcelable.Creator<SearchWrapData> CREATOR = new b();

        /* renamed from: b  reason: collision with root package name */
        public static final a f23335b = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public String f23336a;

        public final int describeContents() {
            return 0;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(13871);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<SearchWrapData> {
            static {
                Covode.recordClassIndex(13872);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SearchWrapData[] newArray(int i2) {
                return new SearchWrapData[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SearchWrapData createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new SearchWrapData(parcel);
            }
        }

        public SearchWrapData() {
            this.f23336a = "";
        }

        static {
            Covode.recordClassIndex(13870);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public SearchWrapData(Parcel parcel) {
            this();
            l.d(parcel, "");
            this.f23336a = parcel.readString();
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f23336a);
        }
    }

    public static final class StreamData implements Parcelable {
        public static final Parcelable.Creator<StreamData> CREATOR = new b();
        public static final a n = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public boolean f23337a;

        /* renamed from: b  reason: collision with root package name */
        public String f23338b;

        /* renamed from: c  reason: collision with root package name */
        public String f23339c;

        /* renamed from: d  reason: collision with root package name */
        public String f23340d;

        /* renamed from: e  reason: collision with root package name */
        public String f23341e;

        /* renamed from: f  reason: collision with root package name */
        public String f23342f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f23343g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f23344h;

        /* renamed from: i  reason: collision with root package name */
        public int f23345i;

        /* renamed from: j  reason: collision with root package name */
        public int f23346j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f23347k;

        /* renamed from: l  reason: collision with root package name */
        public long f23348l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f23349m;

        public final int describeContents() {
            return 0;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(13874);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<StreamData> {
            static {
                Covode.recordClassIndex(13875);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ StreamData[] newArray(int i2) {
                return new StreamData[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ StreamData createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new StreamData(parcel);
            }
        }

        public StreamData() {
            this.f23348l = -1;
        }

        static {
            Covode.recordClassIndex(13873);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public StreamData(Parcel parcel) {
            this();
            boolean z;
            boolean z2;
            boolean z3;
            l.d(parcel, "");
            this.f23338b = parcel.readString();
            this.f23339c = parcel.readString();
            this.f23340d = parcel.readString();
            this.f23341e = parcel.readString();
            this.f23342f = parcel.readString();
            boolean z4 = false;
            if (1 == parcel.readInt()) {
                z = true;
            } else {
                z = false;
            }
            this.f23343g = z;
            if (1 == parcel.readInt()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f23344h = z2;
            this.f23345i = parcel.readInt();
            this.f23346j = parcel.readInt();
            if (1 == parcel.readInt()) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f23347k = z3;
            this.f23348l = parcel.readLong();
            this.f23349m = 1 == parcel.readInt() ? true : z4;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeString(this.f23338b);
            parcel.writeString(this.f23339c);
            parcel.writeString(this.f23340d);
            parcel.writeString(this.f23341e);
            parcel.writeString(this.f23342f);
            parcel.writeInt(this.f23343g ? 1 : 0);
            parcel.writeInt(this.f23344h ? 1 : 0);
            parcel.writeInt(this.f23345i);
            parcel.writeInt(this.f23346j);
            parcel.writeInt(this.f23347k ? 1 : 0);
            parcel.writeLong(this.f23348l);
            parcel.writeInt(this.f23349m ? 1 : 0);
        }
    }

    public static final class TimeStamp implements Parcelable {
        public static final Parcelable.Creator<TimeStamp> CREATOR = new b();

        /* renamed from: c  reason: collision with root package name */
        public static final a f23350c = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public long f23351a;

        /* renamed from: b  reason: collision with root package name */
        public Long f23352b;

        public final int describeContents() {
            return 0;
        }

        public static final class a {
            static {
                Covode.recordClassIndex(13877);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        public static final class b implements Parcelable.Creator<TimeStamp> {
            static {
                Covode.recordClassIndex(13878);
            }

            b() {
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ TimeStamp[] newArray(int i2) {
                return new TimeStamp[i2];
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ TimeStamp createFromParcel(Parcel parcel) {
                l.d(parcel, "");
                return new TimeStamp(parcel);
            }
        }

        public TimeStamp() {
            this.f23352b = 0L;
        }

        static {
            Covode.recordClassIndex(13876);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public TimeStamp(Parcel parcel) {
            this();
            l.d(parcel, "");
            this.f23351a = parcel.readLong();
            this.f23352b = (Long) parcel.readValue(Long.TYPE.getClassLoader());
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            l.d(parcel, "");
            parcel.writeLong(this.f23351a);
            parcel.writeValue(this.f23352b);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(13879);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b implements Parcelable.Creator<EnterRoomConfig> {
        static {
            Covode.recordClassIndex(13880);
        }

        b() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EnterRoomConfig[] newArray(int i2) {
            return new EnterRoomConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnterRoomConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EnterRoomConfig(parcel);
        }
    }

    static {
        Covode.recordClassIndex(13858);
    }

    public EnterRoomConfig() {
        this.f23297a = new StreamData();
        this.f23298b = new LogData();
        this.f23299c = new RoomsData();
        this.f23300d = new FeedCoverData();
        this.f23301e = new SearchWrapData();
    }

    public final e a(Context context) {
        while (!(context instanceof e)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (e) context;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EnterRoomConfig(Parcel parcel) {
        this();
        l.d(parcel, "");
        Parcelable readParcelable = parcel.readParcelable(StreamData.class.getClassLoader());
        if (readParcelable == null) {
            l.b();
        }
        this.f23297a = (StreamData) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(LogData.class.getClassLoader());
        if (readParcelable2 == null) {
            l.b();
        }
        this.f23298b = (LogData) readParcelable2;
        Parcelable readParcelable3 = parcel.readParcelable(RoomsData.class.getClassLoader());
        if (readParcelable3 == null) {
            l.b();
        }
        this.f23299c = (RoomsData) readParcelable3;
        Parcelable readParcelable4 = parcel.readParcelable(SearchWrapData.class.getClassLoader());
        if (readParcelable4 == null) {
            l.b();
        }
        this.f23301e = (SearchWrapData) readParcelable4;
    }

    public static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeParcelable(this.f23297a, 0);
        parcel.writeParcelable(this.f23298b, 0);
        parcel.writeParcelable(this.f23299c, 0);
        parcel.writeParcelable(this.f23301e, 0);
    }
}
