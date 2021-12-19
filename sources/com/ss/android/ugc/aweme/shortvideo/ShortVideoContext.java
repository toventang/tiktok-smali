package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.common.a;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.cs.g.b;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.photomovie.PhotoMvConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sharedar.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.LoudnessBalanceParam;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtraMentionUserModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.GameDuetResource;
import com.ss.android.ugc.aweme.shortvideo.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.shortvideo.model.RecordPresetResource;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import dmt.av.video.SingleImageCoverBitmapData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ShortVideoContext implements Parcelable {
    public static final Parcelable.Creator<ShortVideoContext> CREATOR = new Parcelable.Creator<ShortVideoContext>() {
        /* class com.ss.android.ugc.aweme.shortvideo.ShortVideoContext.AnonymousClass1 */

        static {
            Covode.recordClassIndex(81982);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShortVideoContext[] newArray(int i2) {
            return new ShortVideoContext[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShortVideoContext createFromParcel(Parcel parcel) {
            return new ShortVideoContext(parcel, (byte) 0);
        }
    };
    public ad A;
    public String B;
    public int C;
    public String D;
    public AVETParameter E;
    public StitchContext F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public List<AVTextExtraStruct> K;
    public int L;
    public List<User> M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public SharedARModel S;
    public String T;
    public boolean U;
    public RecordPresetResource V;
    public Boolean W;
    public String X;
    public String Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public CreativeFlowData f124756a;
    public float aA;
    public int aB;
    public ArrayList<String> aC;
    public boolean aD;
    public String aE;
    public String aF;
    public String aG;
    public int aH;
    public long aI;
    public int aJ;
    public long aK;
    public User aL;
    public User aM;
    public boolean aN;
    public float aO;
    public boolean aP;
    public boolean aQ;
    public String aR;
    public PhotoMvConfig aS;
    public int aT;
    public int aU;
    public SingleImageCoverBitmapData aV;
    public a aW;
    public String aX;
    public String aY;
    public BeautyMobParam aZ;
    public int aa;
    public d ab;
    public boolean ac;
    public boolean ad;
    public int ae;
    public ExtraSession af;
    public String ag;
    public t ah;
    public boolean ai;
    public boolean aj;
    public boolean ak;
    public boolean al;
    public String am;
    public ExtraMentionUserModel an;
    public UrlModel ao;
    public int ap;
    public ArrayList<String> aq;
    public int ar;
    public LoudnessBalanceParam as;
    public ArrayList<String> at;
    public i au;
    public DraftEditTransferModel av;
    public d aw;
    public ArrayList<Integer> ax;
    public String ay;
    public int az;

    /* renamed from: b  reason: collision with root package name */
    public final CameraComponentModel f124757b;

    /* renamed from: c  reason: collision with root package name */
    public int f124758c;

    /* renamed from: d  reason: collision with root package name */
    public String f124759d;

    /* renamed from: e  reason: collision with root package name */
    public String f124760e;

    /* renamed from: f  reason: collision with root package name */
    public UrlModel f124761f;

    /* renamed from: g  reason: collision with root package name */
    public String f124762g;

    /* renamed from: h  reason: collision with root package name */
    public String f124763h;

    /* renamed from: i  reason: collision with root package name */
    public int f124764i;

    /* renamed from: j  reason: collision with root package name */
    public String f124765j;

    /* renamed from: k  reason: collision with root package name */
    public UrlModel f124766k;

    /* renamed from: l  reason: collision with root package name */
    public CommentVideoModel f124767l;

    /* renamed from: m  reason: collision with root package name */
    public QaStruct f124768m;
    public Effect n;
    public String o;
    public String p;
    public String q;
    public String r;
    public boolean s;
    public String t;
    public String u;
    public String v;
    public GreenScreenMaterial w;
    public String x;
    public String y;
    public String z;

    public int describeContents() {
        return 0;
    }

    public final boolean a() {
        return this.ac && !this.ad;
    }

    public final void a(boolean z2) {
        if (!z2) {
            this.S = null;
        } else if (this.S == null) {
            this.S = new SharedARModel();
        }
    }

    public final void a(StitchParams stitchParams) {
        if (stitchParams != null && stitchParams.getVideoSegment() != null && stitchParams.getVideoSegment().getVideoFileInfo() != null) {
            this.F.f124773a = stitchParams;
            c(this.F.f124773a.isMuted());
            this.F.f124774b = new TimeSpeedModelExtension();
            this.F.f124774b.setDuration((int) stitchParams.getVideoSegment().getVideoFileInfo().getDuration());
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.model.a aVar) {
        this.f124757b.r = aVar;
    }

    public final void a(GameDuetResource gameDuetResource) {
        this.f124757b.v = gameDuetResource;
    }

    public final void a(String str) {
        this.f124757b.y = str;
    }

    public final void a(Map<String, Object> map) {
        this.f124757b.E = map;
    }

    public final boolean i() {
        if (this.ab != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return this.f124757b.i();
    }

    public final void m() {
        this.f124757b.f124715j = 0;
    }

    public final RetakeVideoContext n() {
        return (RetakeVideoContext) this.f124757b.x;
    }

    public final int s() {
        int i2 = this.aa;
        if (i2 == -1) {
            return this.Z;
        }
        return i2;
    }

    static {
        Covode.recordClassIndex(81981);
    }

    public final AVETParameter j() {
        if (this.E == null) {
            this.E = new AVETParameter();
        }
        return this.E;
    }

    public final void k() {
        this.F.f124773a = null;
        this.F.f124774b = null;
    }

    public final boolean e() {
        return TextUtils.equals(this.r, "upload_anchor");
    }

    public final boolean h() {
        if (this.F.f124773a == null) {
            return false;
        }
        if (!this.F.f124773a.isPGCMusic() || this.F.f124773a.getMusic() == null) {
            return true;
        }
        return false;
    }

    public final boolean o() {
        if ("comment_reply".equals(this.r) || "question_and_answer".equals(this.r)) {
            return true;
        }
        return false;
    }

    public final boolean p() {
        if (this.f124757b.f124706a == 2 || this.f124757b.f124706a == 1) {
            return true;
        }
        return false;
    }

    public final boolean q() {
        if (this.f124757b.f124706a == 2 || this.ar == 50) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.S != null) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        if (this.F.f124773a != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.F.f124773a != null && this.F.f124773a.getMusic() != null && this.F.f124773a.isPGCMusic() && this.F.f124773a.getMusicStart() >= 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.f124757b.f124711f.size(); i3++) {
            if (((TimeSpeedModelExtension) this.f124757b.f124711f.get(i3)).getStickerInfo().isOriginalSticker()) {
                i2++;
            }
        }
        return i2;
    }

    public final String r() {
        int i2 = this.Z;
        if (i2 != 2) {
            if (i2 == 10) {
                return "video_15";
            }
            if (i2 == 11) {
                return "video_60";
            }
            if (i2 == 14) {
                return "video_180";
            }
            if (i2 != 15) {
                return "";
            }
            return "fast_shoot";
        } else if (AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService().e()) {
            return "fast_shoot";
        } else {
            return UGCMonitor.TYPE_PHOTO;
        }
    }

    public final String g() {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < this.f124757b.f124711f.size(); i2++) {
            if (!TextUtils.isEmpty(((TimeSpeedModelExtension) this.f124757b.f124711f.get(i2)).getOriginalId())) {
                sb.append(((TimeSpeedModelExtension) this.f124757b.f124711f.get(i2)).getOriginalId() + ",");
            }
        }
        return sb.toString();
    }

    public static String a(ArrayList<TimeSpeedModelExtension> arrayList) {
        return du.a(arrayList);
    }

    public final void b(int i2) {
        this.f124757b.f124709d = i2;
    }

    public final void c(int i2) {
        this.f124757b.f124710e = i2;
    }

    public final void d(int i2) {
        this.f124757b.q = i2;
    }

    public final void e(int i2) {
        this.f124757b.u = i2;
    }

    public final void a(int i2) {
        this.f124757b.f124708c = i2;
    }

    public final void b(long j2) {
        this.f124757b.f124712g = j2;
    }

    public final void c(long j2) {
        this.f124757b.f124716k = j2;
    }

    public final void d(boolean z2) {
        this.f124757b.t = z2;
    }

    public final void e(boolean z2) {
        this.f124757b.B = z2;
    }

    public final void a(long j2) {
        this.f124757b.f124707b = j2;
    }

    public final void b(boolean z2) {
        this.f124757b.f124714i = z2;
    }

    public final void c(boolean z2) {
        this.f124757b.f124717l = z2;
    }

    public final void a(ClientCherEffectParam clientCherEffectParam) {
        this.f124757b.n = clientCherEffectParam;
    }

    public final void a(RecordContext recordContext) {
        this.f124757b.G = recordContext;
    }

    public ShortVideoContext(CameraComponentModel cameraComponentModel) {
        this.f124756a = new CreativeFlowData();
        this.f124758c = -1;
        this.s = false;
        this.B = "";
        this.D = "";
        this.F = new StitchContext((byte) 0);
        this.J = false;
        this.L = b.a();
        this.Q = false;
        this.W = false;
        this.aa = -1;
        this.ac = false;
        this.ad = false;
        this.af = new ExtraSession((byte) 0);
        this.ag = "";
        this.ap = 0;
        this.aq = new ArrayList<>();
        this.ar = 0;
        this.as = new LoudnessBalanceParam();
        this.at = new ArrayList<>();
        this.au = new i();
        this.aw = null;
        this.ax = new ArrayList<>();
        this.az = 0;
        this.aA = -1.0f;
        this.aB = 0;
        this.aC = new ArrayList<>();
        this.aD = false;
        this.aG = "";
        this.aH = 0;
        this.aN = false;
        this.aP = false;
        this.aQ = false;
        this.aR = "";
        this.f124757b = cameraComponentModel;
    }

    public final void a(RetakeVideoContext retakeVideoContext) {
        this.f124757b.x = retakeVideoContext;
    }

    public final void a(Workspace workspace) {
        this.f124757b.f124713h = workspace;
    }

    private ShortVideoContext(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        this.f124756a = new CreativeFlowData();
        this.f124758c = -1;
        boolean z11 = false;
        this.s = false;
        this.B = "";
        this.D = "";
        this.F = new StitchContext((byte) 0);
        this.J = false;
        this.L = b.a();
        this.Q = false;
        this.W = false;
        this.aa = -1;
        this.ac = false;
        this.ad = false;
        this.af = new ExtraSession((byte) 0);
        this.ag = "";
        this.ap = 0;
        this.aq = new ArrayList<>();
        this.ar = 0;
        this.as = new LoudnessBalanceParam();
        this.at = new ArrayList<>();
        this.au = new i();
        this.aw = null;
        this.ax = new ArrayList<>();
        this.az = 0;
        this.aA = -1.0f;
        this.aB = 0;
        this.aC = new ArrayList<>();
        this.aD = false;
        this.aG = "";
        this.aH = 0;
        this.aN = false;
        this.aP = false;
        this.aQ = false;
        this.aR = "";
        this.f124759d = parcel.readString();
        this.f124760e = parcel.readString();
        this.aK = parcel.readLong();
        this.f124757b = (CameraComponentModel) parcel.readParcelable(CameraComponentModel.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.ac = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.ad = z3;
        this.f124761f = (UrlModel) parcel.readSerializable();
        this.f124764i = parcel.readInt();
        this.f124765j = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readString();
        this.t = parcel.readString();
        this.u = parcel.readString();
        this.v = parcel.readString();
        this.w = (GreenScreenMaterial) parcel.readSerializable();
        this.f124767l = (CommentVideoModel) parcel.readSerializable();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.T = parcel.readString();
        this.X = parcel.readString();
        this.Y = parcel.readString();
        this.Z = parcel.readInt();
        this.aa = parcel.readInt();
        this.H = parcel.readString();
        this.K = parcel.createTypedArrayList(AVTextExtraStruct.CREATOR);
        this.L = parcel.readInt();
        this.M = (List) parcel.readSerializable();
        this.N = parcel.readInt();
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.O = z4;
        this.ae = parcel.readInt();
        this.af = (ExtraSession) parcel.readParcelable(ExtraSession.class.getClassLoader());
        this.ah = (t) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.ai = z5;
        this.E = (AVETParameter) parcel.readSerializable();
        this.an = (ExtraMentionUserModel) parcel.readSerializable();
        this.aq = parcel.createStringArrayList();
        this.at = parcel.createStringArrayList();
        this.au = (i) parcel.readSerializable();
        this.av = (DraftEditTransferModel) parcel.readParcelable(DraftEditTransferModel.class.getClassLoader());
        this.ao = (UrlModel) parcel.readSerializable();
        this.A = (ad) parcel.readSerializable();
        this.am = parcel.readString();
        this.x = parcel.readString();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.G = z6;
        this.az = parcel.readInt();
        this.aA = parcel.readFloat();
        parcel.readList(this.ax, Integer.class.getClassLoader());
        this.ay = parcel.readString();
        this.I = parcel.readString();
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.J = z7;
        this.f124762g = parcel.readString();
        this.f124766k = (UrlModel) parcel.readSerializable();
        this.aS = (PhotoMvConfig) parcel.readParcelable(PhotoMvConfig.class.getClassLoader());
        this.f124756a = (CreativeFlowData) parcel.readParcelable(CreativeFlowData.class.getClassLoader());
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.P = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.Q = z9;
        this.aI = parcel.readLong();
        this.aO = parcel.readFloat();
        this.f124758c = parcel.readInt();
        this.ab = (d) parcel.readSerializable();
        this.aL = (User) parcel.readSerializable();
        this.aM = (User) parcel.readSerializable();
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.aD = z10;
        this.f124763h = parcel.readString();
        this.B = parcel.readString();
        this.aJ = parcel.readInt();
        this.aT = parcel.readInt();
        this.aU = parcel.readInt();
        this.y = parcel.readString();
        this.ar = parcel.readInt();
        this.as = (LoudnessBalanceParam) parcel.readSerializable();
        this.aZ = (BeautyMobParam) parcel.readParcelable(BeautyMobParam.class.getClassLoader());
        this.s = parcel.readByte() != 0 ? true : z11;
        this.aR = parcel.readString();
        this.f124768m = (QaStruct) parcel.readSerializable();
        this.aW = (a) parcel.readSerializable();
        this.aX = parcel.readString();
        this.aV = (SingleImageCoverBitmapData) parcel.readParcelable(SingleImageCoverBitmapData.class.getClassLoader());
        this.aY = parcel.readString();
        this.p = parcel.readString();
    }

    public final void a(dt dtVar) {
        this.f124757b.f124711f = dtVar;
    }

    public final void a(ExtractFramesModel extractFramesModel) {
        this.f124757b.w = extractFramesModel;
    }

    /* synthetic */ ShortVideoContext(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f124759d);
        parcel.writeString(this.f124760e);
        parcel.writeLong(this.aK);
        parcel.writeParcelable(this.f124757b, i2);
        parcel.writeInt(this.ac ? 1 : 0);
        parcel.writeInt(this.ad ? 1 : 0);
        parcel.writeSerializable(this.f124761f);
        parcel.writeInt(this.f124764i);
        parcel.writeString(this.f124765j);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeSerializable(this.w);
        parcel.writeSerializable(this.f124767l);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeString(this.T);
        parcel.writeString(this.X);
        parcel.writeString(this.Y);
        parcel.writeInt(this.Z);
        parcel.writeInt(this.aa);
        parcel.writeString(this.H);
        parcel.writeTypedList(this.K);
        parcel.writeInt(this.L);
        parcel.writeSerializable((Serializable) this.M);
        parcel.writeInt(this.N);
        parcel.writeByte(this.O ? (byte) 1 : 0);
        parcel.writeInt(this.ae);
        parcel.writeParcelable(this.af, i2);
        parcel.writeSerializable(this.ah);
        parcel.writeInt(this.ai ? 1 : 0);
        parcel.writeSerializable(this.E);
        parcel.writeSerializable(this.an);
        parcel.writeStringList(this.aq);
        parcel.writeStringList(this.at);
        parcel.writeSerializable(this.au);
        parcel.writeParcelable(this.av, i2);
        parcel.writeSerializable(this.ao);
        parcel.writeSerializable(this.A);
        parcel.writeString(this.am);
        parcel.writeString(this.x);
        parcel.writeByte(this.G ? (byte) 1 : 0);
        parcel.writeInt(this.az);
        parcel.writeFloat(this.aA);
        parcel.writeList(this.ax);
        parcel.writeString(this.ay);
        parcel.writeString(this.I);
        parcel.writeByte(this.J ? (byte) 1 : 0);
        parcel.writeString(this.f124762g);
        parcel.writeSerializable(this.f124766k);
        parcel.writeParcelable(this.aS, i2);
        parcel.writeParcelable(this.f124756a, i2);
        parcel.writeByte(this.P ? (byte) 1 : 0);
        parcel.writeByte(this.Q ? (byte) 1 : 0);
        parcel.writeLong(this.aI);
        parcel.writeFloat(this.aO);
        parcel.writeInt(this.f124758c);
        parcel.writeSerializable(this.ab);
        parcel.writeSerializable(this.aL);
        parcel.writeSerializable(this.aM);
        parcel.writeByte(this.aD ? (byte) 1 : 0);
        parcel.writeString(this.f124763h);
        parcel.writeString(this.B);
        parcel.writeInt(this.aJ);
        parcel.writeInt(this.aT);
        parcel.writeInt(this.aU);
        parcel.writeString(this.y);
        parcel.writeInt(this.ar);
        parcel.writeSerializable(this.as);
        parcel.writeParcelable(this.aZ, i2);
        parcel.writeByte(this.s ? (byte) 1 : 0);
        parcel.writeString(this.aR);
        parcel.writeSerializable(this.f124768m);
        parcel.writeSerializable(this.aW);
        parcel.writeString(this.aX);
        parcel.writeParcelable(this.aV, i2);
        parcel.writeString(this.aY);
        parcel.writeString(this.p);
    }
}
