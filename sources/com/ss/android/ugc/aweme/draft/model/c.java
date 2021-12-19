package com.ss.android.ugc.aweme.draft.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.effect.EffectListModel;
import com.ss.android.ugc.aweme.infosticker.StickerChallenge;
import com.ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautyMetadata;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import com.ss.android.ugc.aweme.shortvideo.i;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.BeautyMobParam;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.SocialModel;
import com.ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shoutouts.d;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.textsticker.TextStickerChallenges;
import com.ss.android.ugc.aweme.utils.cc;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class c {
    public a A = a.all;
    public int B = -1;
    public long C;
    public int D;
    public EffectListModel E;
    public long F;
    public int G;
    public String H;
    @com.google.gson.a.c(a = "time")
    public long I;
    @com.google.gson.a.c(a = "save_time")
    public long J;
    public String K;
    public int L;
    public int M;
    public String N;
    public String O;
    float[] P;
    public String Q;
    public int R;
    public float S;
    public String T;
    public String U;
    int V;
    public b W = new b();
    @com.google.gson.a.c(a = "id")

    /* renamed from: a  reason: collision with root package name */
    public int f83180a;
    @com.google.gson.a.c(a = "aweme")

    /* renamed from: b  reason: collision with root package name */
    public a f83181b;
    @com.google.gson.a.c(a = "photoMovieContext")

    /* renamed from: c  reason: collision with root package name */
    public PhotoMovieContext f83182c;

    /* renamed from: d  reason: collision with root package name */
    public transient int f83183d = -1;

    /* renamed from: e  reason: collision with root package name */
    public String f83184e;

    /* renamed from: f  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shortvideo.c f83185f;

    /* renamed from: g  reason: collision with root package name */
    public String f83186g;

    /* renamed from: h  reason: collision with root package name */
    public String f83187h;

    /* renamed from: i  reason: collision with root package name */
    public String f83188i;

    /* renamed from: j  reason: collision with root package name */
    public int f83189j;

    /* renamed from: k  reason: collision with root package name */
    public int f83190k;

    /* renamed from: l  reason: collision with root package name */
    public int f83191l;

    /* renamed from: m  reason: collision with root package name */
    public int f83192m;
    public int n;
    public int o;
    public int p;
    public String q;
    public String r;
    public UrlModel s;
    public int t;
    public String u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    static {
        Covode.recordClassIndex(51869);
    }

    public final void a(String str) {
        this.W.bI = str;
    }

    public final void a(BeautyMobParam beautyMobParam) {
        this.W.z = beautyMobParam;
    }

    public final boolean a() {
        int i2 = this.x;
        return i2 == 0 || i2 == 1;
    }

    public final void a(List<String> list) {
        this.W.aS = list;
    }

    public final void a(boolean z2) {
        b bVar = this.W;
        if (bVar != null) {
            bVar.av = z2;
        }
    }

    public final void a(d dVar) {
        this.W.aU = dVar;
    }

    public final void a(ArrayList<BeautyMetadata> arrayList) {
        this.W.aD = arrayList;
    }

    public final void a(Map<String, Object> map) {
        this.W.ai = map;
    }

    public final void a(ReactionParams reactionParams) {
        this.W.f83177k = reactionParams;
    }

    public final void a(ExtractFramesModel extractFramesModel) {
        this.W.u = extractFramesModel;
    }

    public final void a(AVUploadSaveModel aVUploadSaveModel) {
        this.W.D = aVUploadSaveModel;
    }

    public final void a(InfoStickerModel infoStickerModel) {
        this.W.E = infoStickerModel;
    }

    public final void a(t tVar) {
        this.W.F = tVar;
    }

    public final void a(SocialModel socialModel) {
        this.W.K = socialModel;
    }

    public final void a(CreativeFlowData creativeFlowData) {
        this.W.O = creativeFlowData;
    }

    public final void a(com.ss.android.ugc.aweme.mvtheme.d dVar) {
        this.W.M = dVar;
    }

    public final void a(i iVar) {
        this.W.P = iVar;
    }

    public final void a(EditPreviewInfo editPreviewInfo) {
        this.W.ao = editPreviewInfo;
    }

    public final void a(QaStruct qaStruct) {
        this.W.bu = qaStruct;
    }

    public final void a(StickerChallenge stickerChallenge) {
        this.W.ag = stickerChallenge;
    }

    public final void a(TextStickerChallenges textStickerChallenges) {
        this.W.ah = textStickerChallenges;
    }

    public final void a(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        this.W.ax = multiEditVideoStatusRecordData;
    }

    public final void a(com.ss.android.ugc.aweme.shortvideo.ac.a aVar) {
        this.W.az = aVar;
    }

    public final void a(StickerInfo stickerInfo) {
        this.W.aB = stickerInfo;
    }

    public final void a(StitchParams stitchParams) {
        this.W.aJ = stitchParams;
    }

    public final void a(CoverPublishModel coverPublishModel) {
        this.W.aR = coverPublishModel;
    }

    public final int b() {
        b bVar = this.W;
        if (bVar == null) {
            return 0;
        }
        return bVar.Z;
    }

    public final int d() {
        return this.W.ab.intValue();
    }

    public final ReactionParams g() {
        b bVar = this.W;
        if (bVar != null) {
            return bVar.f83177k;
        }
        return null;
    }

    public final ExtractFramesModel i() {
        if (this.W.u == null) {
            return null;
        }
        return this.W.u;
    }

    public final InfoStickerModel j() {
        b bVar = this.W;
        if (bVar != null) {
            return bVar.E;
        }
        return null;
    }

    public final String o() {
        if (this.W.M == null) {
            return null;
        }
        return this.W.M.videoCoverImgPath;
    }

    public final String p() {
        if (this.W.ax == null) {
            return null;
        }
        return this.W.ax.coverImagePath;
    }

    public final i q() {
        b bVar = this.W;
        if (bVar != null) {
            return bVar.aa;
        }
        return null;
    }

    public final String f() {
        String str = this.W.f83169c;
        if (TextUtils.isEmpty(str)) {
            return UUID.randomUUID().toString();
        }
        return str;
    }

    public final String r() {
        if (TextUtils.isEmpty(this.f83184e)) {
            this.f83184e = f();
        }
        return this.f83184e;
    }

    public final float s() {
        if (c(this.W.as)) {
            return -1.0f;
        }
        return this.W.as;
    }

    public final boolean t() {
        if (this.W.bp != null) {
            return true;
        }
        return false;
    }

    public enum a {
        all,
        half,
        none;

        static {
            Covode.recordClassIndex(51870);
        }
    }

    public final boolean h() {
        b bVar = this.W;
        if (bVar != null) {
            return bVar.f83179m;
        }
        return false;
    }

    public final boolean k() {
        if (this.W.M != null) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (this.W.N != null) {
            return true;
        }
        return false;
    }

    public final boolean m() {
        if (this.f83182c != null) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        if (this.W.ax == null || !this.W.ax.isSupportMultiEdit) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        if (!TextUtils.isEmpty(this.T)) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        b bVar = this.W;
        if (bVar == null || !bVar.av) {
            return false;
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder("AwemeDraft{id=").append(this.f83180a).append("creationId=").append(this.W.f83169c).append("previewInfo=");
        EditPreviewInfo editPreviewInfo = this.W.ao;
        if (editPreviewInfo == null) {
            str = null;
        } else {
            str = "[" + editPreviewInfo.getVideoList().size() + ']' + "[videoFileInfo:" + n.a(editPreviewInfo.getVideoList(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, cc.a.f142762a, 31) + ']' + "[videoCutInfo:" + n.a(editPreviewInfo.getVideoList(), (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, cc.b.f142763a, 31) + ']';
        }
        return append.append(str).append(", aweme=").append(this.f83181b).append(", photoMovieContext=").append(this.f83182c).append(", musicModel=").append(this.f83185f).append(", videoPath='").append(this.f83186g).append('\'').append(", musicPath='").append(this.f83187h).append('\'').append(", voicePath='").append(this.f83188i).append('\'').append(", videoVolume=").append(this.f83189j).append(", musicVolume=").append(this.f83190k).append(", filter=").append(this.f83192m).append(", musicStart=").append(this.n).append(", effect=").append(this.o).append(", origin=").append(this.p).append(", mReversePath='").append(this.q).append('\'').append(", videoSpeed='").append(this.r).append('\'').append(", audioTrack=").append(this.s).append(", fiterLabel='").append(this.u).append('\'').append(", cameraPos=").append(this.v).append(", useBeauty=").append(this.w).append(", type=").append(this.x).append(", isWidthDivider=").append(this.z).append(", privateVideo=").append(this.D).append(", mEffectListModel=").append(this.E).append(", maxDuration=").append(this.F).append(", faceBeauty=").append(this.G).append(", userId='").append(this.H).append('\'').append(", time=").append(this.I).append(", videoSegmentsDesc='").append(this.K).append('\'').append(", hardEncode=").append(this.L).append(", specialPoints=").append(this.M).append(", stickerPath='").append(this.N).append('\'').append(", stickerID='").append(this.O).append('\'').append(", volumeTaps=").append(Arrays.toString(this.P)).append(", musicEffectSegments='").append(this.Q).append('\'').append(", newVersion=").append(this.R).append(", customCoverStart=").append(this.S).append(", duetFrom='").append(this.T).append('\'').append(", syncPlatforms='").append(this.U).append('\'').append(", from='").append(this.V).append('\'').append(", extras=").append(this.W).append('}').toString();
    }

    public final void a(int i2) {
        this.W.bk = i2;
    }

    public final void b(float f2) {
        this.W.bd = f2;
    }

    public final void c(int i2) {
        this.W.bj = i2;
    }

    public final void d(int i2) {
        this.W.V = i2;
    }

    public final void e(int i2) {
        this.W.W = i2;
    }

    public final void f(int i2) {
        this.W.X = i2;
    }

    public final void g(int i2) {
        this.W.Y = i2;
    }

    public final void h(int i2) {
        b bVar = this.W;
        if (bVar != null) {
            bVar.Z = i2;
        }
    }

    public final void i(String str) {
        this.W.al = str;
    }

    public final void j(int i2) {
        this.W.aV = i2;
    }

    public final void k(int i2) {
        this.W.J = i2;
    }

    public final void l(int i2) {
        this.W.ae = i2;
    }

    public final void m(int i2) {
        this.W.aq = i2;
    }

    public final void n(int i2) {
        this.W.ar = i2;
    }

    public final void o(int i2) {
        this.W.f83168b = i2;
    }

    public final void p(int i2) {
        this.W.f83167a = i2;
    }

    public final void q(int i2) {
        this.W.f83175i = i2;
    }

    public final void r(int i2) {
        this.W.f83176j = i2;
    }

    public final void s(int i2) {
        this.W.f83171e = i2;
    }

    public final void t(int i2) {
        this.W.bb = i2;
    }

    public final void u(int i2) {
        this.W.G = i2;
    }

    public final void v(int i2) {
        this.W.aG = i2;
    }

    public final void w(int i2) {
        this.W.au = i2;
    }

    public final void x(String str) {
        this.W.aI = str;
    }

    public final void y(String str) {
        this.W.aP = str;
    }

    public final void a(float f2) {
        if (!c(f2)) {
            this.W.as = f2;
        }
    }

    public final void c(String str) {
        this.W.w = str;
    }

    public final void e(String str) {
        this.W.y = str;
    }

    public final void f(String str) {
        this.W.A = str;
    }

    public final void h(String str) {
        this.W.bn = str;
    }

    public final void k(String str) {
        this.W.ad = str;
    }

    public final void l(String str) {
        this.W.n = str;
    }

    public final void m(String str) {
        this.W.f83169c = str;
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "edit_draft";
        }
        this.W.f83170d = str;
    }

    public final void r(String str) {
        this.W.q = str;
    }

    public final void t(String str) {
        this.W.ac = str;
    }

    public final void u(String str) {
        if (str != null) {
            b bVar = this.W;
            l.d(str, "");
            bVar.bt = str;
        }
    }

    public final void v(String str) {
        this.W.aA = str;
    }

    public final void w(String str) {
        this.W.o = str;
    }

    private static boolean c(float f2) {
        double d2 = (double) f2;
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            return true;
        }
        return false;
    }

    public final void a(long j2) {
        this.W.bc = j2;
    }

    public final void b(int i2) {
        this.W.bi = i2;
    }

    public final void d(String str) {
        this.W.x = str;
    }

    public final void e(List<String> list) {
        this.W.H = list;
    }

    public final void g(String str) {
        this.W.B = str;
    }

    public final void h(boolean z2) {
        this.W.ay = z2;
    }

    public final void i(int i2) {
        this.W.ab = Integer.valueOf(i2);
    }

    public final void j(String str) {
        this.W.T = str;
    }

    public final void k(boolean z2) {
        this.W.aw = z2;
    }

    public final void l(boolean z2) {
        this.W.aK = z2;
    }

    public final void m(boolean z2) {
        this.W.aN = z2;
    }

    public final void n(boolean z2) {
        this.W.aO = z2;
    }

    public final void o(String str) {
        this.W.br = str;
    }

    public final void p(String str) {
        b bVar = this.W;
        l.d(str, "");
        bVar.f83172f = str;
    }

    public final void q(String str) {
        this.W.f83178l = str;
    }

    public final void a(CommentVideoModel commentVideoModel) {
        this.W.aC = commentVideoModel;
    }

    public final void b(String str) {
        this.W.v = str;
    }

    public final void c(ArrayList<String> arrayList) {
        this.W.aM = arrayList;
    }

    public final void d(List<String> list) {
        this.W.bg = list;
    }

    public final void e(boolean z2) {
        this.W.f83179m = z2;
    }

    public final void f(List<EditVideoSegment> list) {
        this.W.ap = list;
    }

    public final void g(List<String> list) {
        this.W.aX = list;
    }

    public final void i(boolean z2) {
        this.W.Q = z2;
    }

    public final void j(boolean z2) {
        this.W.aF = z2;
    }

    public final void o(boolean z2) {
        this.W.aY = z2;
    }

    public final void p(boolean z2) {
        this.W.aZ = z2;
    }

    public final void q(boolean z2) {
        this.W.ba = z2;
    }

    public final void s(String str) {
        b bVar = this.W;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        l.d(str, "");
        bVar.at = str;
    }

    public final void a(CutSameEditData cutSameEditData) {
        this.W.aQ = cutSameEditData;
    }

    public final void b(ArrayList<ImportVideoInfo> arrayList) {
        this.W.af = arrayList;
    }

    public final void c(List<String> list) {
        this.W.bf = list;
    }

    public final void d(boolean z2) {
        this.W.f83173g = z2;
    }

    public final void f(boolean z2) {
        this.W.I = z2;
    }

    public final void g(boolean z2) {
        this.W.ak = z2;
    }

    public final void a(DuetExtraInfo duetExtraInfo) {
        this.W.a(duetExtraInfo);
    }

    public final void b(List<User> list) {
        this.W.aT = list;
    }

    public final void c(boolean z2) {
        this.W.f83174h = z2;
    }

    public final void a(b bVar) {
        this.W = bVar;
        if (bVar != null && !TextUtils.isEmpty(bVar.S)) {
            this.f83186g = this.W.S;
        }
    }

    public final void b(boolean z2) {
        this.W.bz = z2;
    }

    public final void a(e eVar) {
        this.W.U = eVar;
    }

    public final void a(i iVar) {
        this.W.aa = iVar;
    }
}
