package com.ss.android.ugc.aweme.shortvideo.ui;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.transition.AutoTransition;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.g.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ad;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.common.ad;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.experiment.gs;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.geofencing.GeoFencingSettingItem;
import com.ss.android.ugc.aweme.geofencing.a;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService;
import com.ss.android.ugc.aweme.internal.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.internal.ShareServiceImpl;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.port.in.IAVSettingService;
import com.ss.android.ugc.aweme.port.in.ab;
import com.ss.android.ugc.aweme.port.in.ak;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.port.in.az;
import com.ss.android.ugc.aweme.port.in.c;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.port.in.z;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.property.AVPreferences;
import com.ss.android.ugc.aweme.property.cz;
import com.ss.android.ugc.aweme.property.dc;
import com.ss.android.ugc.aweme.property.ee;
import com.ss.android.ugc.aweme.scheduler.h;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.services.external.IComplianceService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.AVPublishExtensionUtils;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.ss.android.ugc.aweme.services.publish.HotSpotTagPublishModel;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.MobParam;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.setting.br;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ab.m;
import com.ss.android.ugc.aweme.shortvideo.ac;
import com.ss.android.ugc.aweme.shortvideo.bf;
import com.ss.android.ugc.aweme.shortvideo.bg;
import com.ss.android.ugc.aweme.shortvideo.bh;
import com.ss.android.ugc.aweme.shortvideo.bz;
import com.ss.android.ugc.aweme.shortvideo.cd;
import com.ss.android.ugc.aweme.shortvideo.ce;
import com.ss.android.ugc.aweme.shortvideo.cf;
import com.ss.android.ugc.aweme.shortvideo.cr;
import com.ss.android.ugc.aweme.shortvideo.cu;
import com.ss.android.ugc.aweme.shortvideo.cv;
import com.ss.android.ugc.aweme.shortvideo.dv;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.bn;
import com.ss.android.ugc.aweme.shortvideo.edit.bo;
import com.ss.android.ugc.aweme.shortvideo.eh;
import com.ss.android.ugc.aweme.shortvideo.ek;
import com.ss.android.ugc.aweme.shortvideo.es;
import com.ss.android.ugc.aweme.shortvideo.eu;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.shortvideo.k.d;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStruct;
import com.ss.android.ugc.aweme.shortvideo.model.AVUploadSaveModel;
import com.ss.android.ugc.aweme.shortvideo.model.AddToPlaylistItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.BcAdModel;
import com.ss.android.ugc.aweme.shortvideo.model.BehaviorType;
import com.ss.android.ugc.aweme.shortvideo.model.CommentSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.CommonSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.DuetSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.model.Mission;
import com.ss.android.ugc.aweme.shortvideo.model.MissionUser;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.model.StitchSettingItemStatus;
import com.ss.android.ugc.aweme.shortvideo.p;
import com.ss.android.ugc.aweme.shortvideo.publish.a.b;
import com.ss.android.ugc.aweme.shortvideo.publish.aa;
import com.ss.android.ugc.aweme.shortvideo.publish.ab;
import com.ss.android.ugc.aweme.shortvideo.publish.aj;
import com.ss.android.ugc.aweme.shortvideo.publish.i;
import com.ss.android.ugc.aweme.shortvideo.publish.j;
import com.ss.android.ugc.aweme.shortvideo.publish.l;
import com.ss.android.ugc.aweme.shortvideo.publish.n;
import com.ss.android.ugc.aweme.shortvideo.publish.v;
import com.ss.android.ugc.aweme.shortvideo.publish.w;
import com.ss.android.ugc.aweme.shortvideo.transition.VideoCoverBitmapHolder;
import com.ss.android.ugc.aweme.shortvideo.ui.g;
import com.ss.android.ugc.aweme.shortvideo.ui.permissionmanager.f;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;
import com.ss.android.ugc.aweme.shortvideo.util.a;
import com.ss.android.ugc.aweme.shortvideo.util.ar;
import com.ss.android.ugc.aweme.shortvideo.util.aw;
import com.ss.android.ugc.aweme.shortvideo.util.ay;
import com.ss.android.ugc.aweme.shortvideo.util.ba;
import com.ss.android.ugc.aweme.shortvideo.util.bb;
import com.ss.android.ugc.aweme.shortvideo.util.w;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText;
import com.ss.android.ugc.aweme.shortvideo.view.MentionEditText;
import com.ss.android.ugc.aweme.shortvideo.view.OmnipotentRoundCornerImgView;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.DuetStickerUserStruct;
import com.ss.android.ugc.aweme.utils.Cif;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.bs;
import com.ss.android.ugc.aweme.utils.dj;
import com.ss.android.ugc.aweme.utils.gr;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.ss.android.ugc.aweme.views.k;
import com.ss.android.ugc.tools.utils.q;
import com.ss.android.vesdk.VERecordData;
import com.zhiliaoapp.musically.R;
import f.a.ae;
import f.a.b.b;
import h.f.b.z;
import java.io.File;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

public class cj extends Fragment implements ax.a, IComplianceService, bz {
    private static final String ag = cj.class.getSimpleName();
    private static final boolean ah = l.f115658a.e().d();
    bz A;
    CheckBox B;
    public ViewGroup C;
    public View D;
    TuxTextView E;
    TuxTextView F;
    public boolean G = true;
    public p H;
    public n I;
    public ViewGroup J;
    VideoPublishEditModel K;
    boolean L;
    public boolean M;
    public boolean N;
    public VideoCoverBitmapHolder O;
    public Bitmap P;
    long Q;
    public long R;
    public final List<e<Class<?>, IAVPublishExtension<?>>> S = c.r.a(AVPublishContentType.Video);
    boolean T;
    public String U;
    public String V = "";
    public int W = -1;
    public boolean X;
    public boolean Y;
    boolean Z = false;

    /* renamed from: a  reason: collision with root package name */
    final boolean f131594a = PrivacyServiceImpl.c().a();
    private com.ss.android.ugc.aweme.widgetcompat.a aA;
    private final AtomicInteger aB = new AtomicInteger(0);
    private com.ss.android.ugc.aweme.widgetcompat.a aC;
    private long aD;
    private int aE;
    private boolean aF;
    private boolean aG;
    private ad aH;
    private int aI = -1;
    private boolean aJ;
    private boolean aK;
    private boolean aL;
    private List<v> aM = new ArrayList();
    private String aN;
    private Mission aO = null;
    private com.ss.android.ugc.aweme.shortvideo.eventtrack.e aP;
    private com.bytedance.als.l<Boolean> aQ;
    private DialogInterface.OnDismissListener aR;
    String aa = "";
    public String ab;
    public b ac;
    com.ss.android.ugc.aweme.shortvideo.g.c ad;
    public boolean ae;
    final boolean af = g.a().y().b().booleanValue();
    private final IAVUIUXBugsExperimentService ai = AVUIUXBugsExperimentServiceDiff.b();
    private MutualRelationView aj;
    private CommonItemView ak;
    private CommonItemView al;
    private CommonItemView am;
    private CommentSettingItemStatus an;
    private final com.ss.android.ugc.aweme.geofencing.a ao = new com.ss.android.ugc.aweme.geofencing.a();
    private RelativeLayout ap;
    private GeoFencingSettingItem aq;
    private Boolean ar = false;
    private final com.ss.android.ugc.aweme.shortvideo.publish.c as = new com.ss.android.ugc.aweme.shortvideo.publish.c();
    private LinearLayout at;
    private bf au;
    private TuxTextView av;
    private View aw;
    private boolean ax = false;
    private ViewStub ay;
    private ViewGroup az;

    /* renamed from: b  reason: collision with root package name */
    View f131595b;

    /* renamed from: c  reason: collision with root package name */
    DuetSettingItemStatus f131596c;

    /* renamed from: d  reason: collision with root package name */
    StitchSettingItemStatus f131597d;

    /* renamed from: e  reason: collision with root package name */
    final AddToPlaylistItemStatus f131598e = new AddToPlaylistItemStatus();

    /* renamed from: f  reason: collision with root package name */
    final CommonSettingItemStatus f131599f = new CommonSettingItemStatus();

    /* renamed from: g  reason: collision with root package name */
    com.ss.android.ugc.aweme.shortvideo.publish.a f131600g;

    /* renamed from: h  reason: collision with root package name */
    PermissionSettingItem f131601h;

    /* renamed from: i  reason: collision with root package name */
    PublishImShareSettingItem f131602i;

    /* renamed from: j  reason: collision with root package name */
    Boolean f131603j = false;

    /* renamed from: k  reason: collision with root package name */
    public String f131604k = "";

    /* renamed from: l  reason: collision with root package name */
    public String f131605l = "";

    /* renamed from: m  reason: collision with root package name */
    public final t<com.ss.android.ugc.aweme.photo.a.a> f131606m = new t<>();
    public cf n;
    LinearLayout o;
    ImageView p;
    ObjectAnimator q;
    public eh r;
    RelativeLayout s;
    public View t;
    public OmnipotentRoundCornerImgView u;
    public TuxTextView v;
    View w;
    View x;
    public HashTagMentionEditText y;
    VideoPrivacySettingsItem z;

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(86202);
        }

        void a();
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.bz
    public final void d() {
        this.L = true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v28, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.bz> */
    /* JADX WARN: Multi-variable type inference failed */
    private void a(View view, Bundle bundle) {
        boolean z2;
        boolean z3;
        boolean z4;
        HashMap hashMap;
        List<User> a2;
        MissionUser next;
        float f2;
        boolean z5;
        int i2;
        boolean z6;
        com.ss.android.ugc.aweme.shortvideo.publish.a aVar;
        MethodCollector.i(12013);
        ExtensionDataRepo extensionDataRepo = (ExtensionDataRepo) a(this).a(ExtensionDataRepo.class);
        PermissionSettingItem permissionSettingItem = (PermissionSettingItem) view.findViewById(R.id.d3m);
        this.f131601h = permissionSettingItem;
        permissionSettingItem.a(new ds(this));
        PermissionSettingItem permissionSettingItem2 = this.f131601h;
        VideoPublishEditModel videoPublishEditModel = this.K;
        ed edVar = new ed(this);
        cf cfVar = new cf(this, permissionSettingItem2, 0);
        cfVar.f125116h = videoPublishEditModel;
        cfVar.f125112d = edVar;
        this.n = cfVar;
        this.aR = new eo(this);
        this.n.a((ce) new ce() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass1 */

            static {
                Covode.recordClassIndex(86186);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.ce
            public final String d() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.ce
            public final String e() {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.ce
            public final String c() {
                if (TextUtils.isEmpty(cj.this.f131604k)) {
                    return "";
                }
                return com.a.a(cj.this.getString(R.string.die), new Object[]{cj.this.f131604k});
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.ce
            public final String a() {
                if (TextUtils.isEmpty(cj.this.f131605l) || TextUtils.isEmpty(cj.this.f131604k)) {
                    return cj.this.getContext().getResources().getString(R.string.byi);
                }
                return cj.this.getContext().getResources().getString(R.string.byi) + com.a.a(cj.this.getContext().getResources().getString(R.string.die), new Object[]{cj.this.f131604k});
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.ce
            public final String b() {
                if (TextUtils.isEmpty(cj.this.f131605l) || TextUtils.isEmpty(cj.this.f131604k)) {
                    return cj.this.getContext().getResources().getString(R.string.byh);
                }
                return cj.this.getContext().getResources().getString(R.string.byh) + com.a.a(cj.this.getContext().getResources().getString(R.string.die), new Object[]{cj.this.f131604k});
            }
        }, (j) new ex(this), this.aR, false, false);
        this.f131606m.observe(this, new ey(this, extensionDataRepo));
        if (com.ss.android.ugc.aweme.internal.a.f104775a.a(true)) {
            TuxTextCell tuxTextCell = (TuxTextCell) view.findViewById(R.id.e7a);
            tuxTextCell.setVisibility(0);
            ((c.f) tuxTextCell.getAccessory()).a(new cz(this));
            MutualRelationView mutualRelationView = (MutualRelationView) view.findViewById(R.id.e78);
            this.aj = mutualRelationView;
            mutualRelationView.a((int) com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 28.0f), (int) com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 20.0f));
            g();
            this.f131595b = view.findViewById(R.id.e7_);
            com.ss.android.ugc.aweme.internal.a.f104775a.a(getActivity(), false, new da(this));
        }
        this.f131602i = (PublishImShareSettingItem) view.findViewById(R.id.blr);
        View findViewById = view.findViewById(R.id.apl);
        this.at = (LinearLayout) view.findViewById(R.id.c7z);
        this.s = (RelativeLayout) view.findViewById(R.id.ddb);
        this.t = view.findViewById(R.id.c81);
        this.az = (ViewGroup) view.findViewById(R.id.hb);
        this.C = (ViewGroup) view.findViewById(R.id.hl);
        this.D = view.findViewById(R.id.hn);
        this.J = (ViewGroup) view.findViewById(R.id.ben);
        if (!com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
            this.f131599f.bindView(view.findViewById(R.id.j3), this);
            if (this.aq == null) {
                GeoFencingSettingItem geoFencingSettingItem = (GeoFencingSettingItem) ((ViewStub) view.findViewById(R.id.ddh)).inflate();
                this.aq = geoFencingSettingItem;
                this.ao.a(this, geoFencingSettingItem);
            }
        }
        if (!com.ss.android.ugc.aweme.shortvideo.k.b.a() && this.ap == null) {
            RelativeLayout relativeLayout = (RelativeLayout) ((ViewStub) view.findViewById(R.id.dda)).inflate();
            this.ap = relativeLayout;
            this.f131598e.bindView(relativeLayout, this);
        }
        com.ss.android.ugc.aweme.photo.a.a value = this.f131606m.getValue();
        if (value != null) {
            if (com.ss.android.ugc.aweme.port.in.c.r.c() == 2) {
                this.Y = true;
                this.n.a(value.getPermission(), (List<User>) null, 0, this.Y, "");
            } else if (com.ss.android.ugc.aweme.port.in.c.r.c() == 1) {
                this.Y = false;
                this.n.a(value.getPermission(), (List<User>) null, 0, this.Y, "");
            }
        }
        this.f131606m.setValue(new com.ss.android.ugc.aweme.photo.a.a(this.K.isPrivate, this.K.excludeUserList, this.K.allowRecommend));
        this.n.a(this.f131606m.getValue().getPermission(), this.K.excludeUserList, this.K.allowRecommend, this.Y, "");
        if (this.K.mOutVideoWidth < this.K.mOutVideoHeight) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (com.bytedance.ies.abmock.b.a().a(true, "enable_share_changeux", false)) {
            this.H = new cv(this, view, z2);
        } else {
            this.H = new cu(this, view, z2);
        }
        n nVar = new n(this, this.K.mIsFromDraft, this.aK, this.aL, this.ad);
        this.I = nVar;
        nVar.f129818i = new ez(this);
        if (this.K.hasSubtitle()) {
            v vVar = new v(w.SAVE_LOCAL_OPTIONS, getString(R.string.fgc), "", 2131232403, false, db.f131676a);
            vVar.f129893e = new dc(this);
            if (com.ss.android.ugc.aweme.shortvideo.k.a.a()) {
                if (i.a()) {
                    com.ss.android.ugc.aweme.publish.t.a(0);
                } else if (j().booleanValue()) {
                    vVar.f129891c = new dd(this);
                }
            }
            vVar.a(bb.a(com.ss.android.ugc.aweme.publish.t.b()));
            vVar.f129890b = new de(this);
            this.aM.add(vVar);
        } else {
            v vVar2 = new v(w.SAVE_LOCAL, getString(R.string.fgc), getString(R.string.fe), 2131232403, f.a() && com.ss.android.ugc.aweme.publish.t.b() > 0, null);
            vVar2.f129899k = new df(this, vVar2);
            vVar2.f129893e = new dg(this);
            if ((i.a() || j().booleanValue()) && com.ss.android.ugc.aweme.shortvideo.k.a.a()) {
                com.ss.android.ugc.aweme.publish.t.a(0);
                vVar2.f129898j = false;
            }
            if (com.ss.android.ugc.aweme.shortvideo.k.a.a()) {
                if (i.a()) {
                    vVar2.f129891c = new di(this, vVar2);
                } else if (j().booleanValue()) {
                    vVar2.f129891c = new dj(this);
                }
            }
            this.aM.add(vVar2);
        }
        if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
            v vVar3 = new v(w.AUTO_CAPTION, getString(R.string.b2j), "", 2131233492, this.K.allowAutoCaptionSetting > 0, dk.f131688a);
            vVar3.f129893e = new dl(this);
            this.aM.add(vVar3);
        }
        if (this.aK) {
            boolean a3 = d.a();
            this.aM.add(new v(w.HIGH_QUALITY, getString(a3 ? R.string.f0l : R.string.bt), getString(a3 ? R.string.f0m : R.string.bu), a3 ? R.raw.icon_video_star : 2131232402, com.ss.android.ugc.aweme.publish.t.a(), new dm(this)));
        }
        VideoPublishViewModel E2 = E();
        List<v> list = this.aM;
        h.f.b.l.d(list, "");
        E2.f131939a = list;
        VideoPublishViewModel E3 = E();
        com.ss.android.ugc.aweme.geofencing.a aVar2 = this.ao;
        h.f.b.l.d(aVar2, "");
        E3.f131940b = aVar2;
        VideoPublishViewModel E4 = E();
        AddToPlaylistItemStatus addToPlaylistItemStatus = this.f131598e;
        h.f.b.l.d(addToPlaylistItemStatus, "");
        E4.f131941c = addToPlaylistItemStatus;
        if (getActivity() != null) {
            n nVar2 = this.I;
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) getActivity();
            VideoPublishEditModel videoPublishEditModel2 = this.K;
            CommonSettingItemStatus commonSettingItemStatus = this.f131599f;
            int publishPermission = getPublishPermission();
            com.ss.android.ugc.aweme.shortvideo.g.c cVar = this.ad;
            h.f.b.l.d(dVar, "");
            h.f.b.l.d(videoPublishEditModel2, "");
            h.f.b.l.d(commonSettingItemStatus, "");
            h.f.b.l.d(cVar, "");
            if (com.ss.android.ugc.aweme.port.in.c.u.a()) {
                commonSettingItemStatus._visibility.setValue(8);
            } else if (nVar2.g() || videoPublishEditModel2.hasSubtitle()) {
                commonSettingItemStatus._visibility.setValue(8);
            } else if (!CrossLanguageUserExperiment.c().a()) {
                commonSettingItemStatus._visibility.setValue(8);
            } else {
                aVar = new com.ss.android.ugc.aweme.shortvideo.publish.a(dVar, commonSettingItemStatus, videoPublishEditModel2, cVar, new n.b(nVar2));
                if (aVar.f129673d.mIsFromDraft || aVar.f129673d.allowAutoCaptionSetting != 0) {
                    aVar.f129672c._checked.setValue(Boolean.valueOf(aVar.f129673d.allowAutoCaptionSetting > 0));
                } else {
                    aVar.f129672c._checked.setValue(Boolean.valueOf(com.ss.android.ugc.aweme.cs.g.a.f79059a.getBoolean("privacy_setting_auto_caption", false)));
                }
                aVar.f129670a = h.f.b.l.a((Object) aVar.f129672c._checked.getValue(), (Object) true);
                aVar.a(publishPermission);
                this.f131600g = aVar;
            }
            aVar = null;
            this.f131600g = aVar;
        }
        if (!IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).needShowAddOrRemoveButton() || IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).needCreateFirstMix()) {
            z3 = false;
            z4 = false;
        } else {
            z3 = true;
            if (com.ss.android.ugc.aweme.shortvideo.k.b.a()) {
                z4 = true;
            }
            z4 = false;
        }
        if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
            boolean z7 = !a.C2412a.a();
            boolean z8 = this.aL;
            boolean z9 = this.f131600g != null;
            boolean z10 = this.aK;
            n nVar3 = this.I;
            LinearLayout linearLayout = this.at;
            List<v> list2 = this.aM;
            VideoPublishEditModel videoPublishEditModel3 = this.K;
            p pVar = this.H;
            com.ss.android.ugc.aweme.geofencing.a aVar3 = this.ao;
            AddToPlaylistItemStatus addToPlaylistItemStatus2 = this.f131598e;
            h.f.b.l.d(linearLayout, "");
            h.f.b.l.d(aVar3, "");
            h.f.b.l.d(addToPlaylistItemStatus2, "");
            nVar3.p = videoPublishEditModel3;
            Context context = linearLayout.getContext();
            h.f.b.l.b(context, "");
            nVar3.f129810a = context;
            nVar3.f129820k = z4;
            nVar3.o = list2;
            if (!(z4 || z7 || z8 || z9 || z10) || list2 == null || videoPublishEditModel3 == null) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (com.ss.android.ugc.aweme.property.b.i()) {
                IAVSettingService createIAVSettingServicebyMonsterPlugin = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
                h.f.b.l.b(createIAVSettingServicebyMonsterPlugin, "");
                if (!createIAVSettingServicebyMonsterPlugin.getSaveAtPost()) {
                    if (n.a.b() != 0) {
                        if (pVar != null) {
                            pVar.a();
                        }
                        if (z6) {
                            h.f.b.l.a(videoPublishEditModel3);
                            nVar3.a(linearLayout, list2, videoPublishEditModel3);
                        } else {
                            nVar3.a(linearLayout, videoPublishEditModel3);
                        }
                    } else if (z6) {
                        h.f.b.l.a(videoPublishEditModel3);
                        nVar3.b(linearLayout, list2, videoPublishEditModel3);
                    }
                }
            }
            if (z6) {
                h.f.b.l.a(videoPublishEditModel3);
                nVar3.b(linearLayout, list2, videoPublishEditModel3);
            }
            if (pVar != null) {
                pVar.a();
            }
        } else {
            n nVar4 = this.I;
            LinearLayout linearLayout2 = this.at;
            List<v> list3 = this.aM;
            VideoPublishEditModel videoPublishEditModel4 = this.K;
            p pVar2 = this.H;
            com.ss.android.ugc.aweme.geofencing.a aVar4 = this.ao;
            AddToPlaylistItemStatus addToPlaylistItemStatus3 = this.f131598e;
            h.f.b.l.d(linearLayout2, "");
            h.f.b.l.d(aVar4, "");
            h.f.b.l.d(addToPlaylistItemStatus3, "");
            nVar4.p = videoPublishEditModel4;
            boolean z11 = (nVar4.w || (nVar4.v && list3 != null)) && videoPublishEditModel4 != null;
            nVar4.o = list3;
            Context context2 = linearLayout2.getContext();
            h.f.b.l.b(context2, "");
            nVar4.f129810a = context2;
            if (com.ss.android.ugc.aweme.property.b.i()) {
                IAVSettingService createIAVSettingServicebyMonsterPlugin2 = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false);
                h.f.b.l.b(createIAVSettingServicebyMonsterPlugin2, "");
                if (!createIAVSettingServicebyMonsterPlugin2.getSaveAtPost()) {
                    if (n.a.b() != 0) {
                        if (pVar2 != null) {
                            pVar2.a();
                        }
                        if ((nVar4.w || (nVar4.v && list3 != null)) && videoPublishEditModel4 != null) {
                            nVar4.a(linearLayout2, list3, videoPublishEditModel4);
                        } else {
                            nVar4.a(linearLayout2, videoPublishEditModel4);
                        }
                    } else if (z11) {
                        h.f.b.l.a(videoPublishEditModel4);
                        nVar4.b(linearLayout2, list3, videoPublishEditModel4);
                    }
                }
            }
            if (z11) {
                h.f.b.l.a(videoPublishEditModel4);
                nVar4.b(linearLayout2, list3, videoPublishEditModel4);
            }
        }
        if (com.ss.android.ugc.aweme.shortvideo.k.c.a()) {
            this.A = new bz(this);
            VideoPrivacySettingsItem videoPrivacySettingsItem = (VideoPrivacySettingsItem) view.findViewById(R.id.fgv);
            this.z = videoPrivacySettingsItem;
            videoPrivacySettingsItem.setVisibility(0);
            this.z.setOnClickListener(new cy(this));
        } else {
            if (this.ak == null) {
                CommonItemView commonItemView = (CommonItemView) ((ViewStub) view.findViewById(R.id.aa3)).inflate();
                this.ak = commonItemView;
                this.an.bindView(commonItemView, this);
            }
            if (this.al == null) {
                CommonItemView commonItemView2 = (CommonItemView) ((ViewStub) view.findViewById(R.id.aqs)).inflate();
                this.al = commonItemView2;
                this.f131596c.bindView(commonItemView2, this);
            }
            if (this.am == null) {
                CommonItemView commonItemView3 = (CommonItemView) ((ViewStub) view.findViewById(R.id.ebw)).inflate();
                this.am = commonItemView3;
                this.f131597d.bindView(commonItemView3, this);
            }
        }
        n nVar5 = this.I;
        LinearLayout linearLayout3 = this.at;
        VideoPublishEditModel videoPublishEditModel5 = this.K;
        if (videoPublishEditModel5 == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            hashMap.put("creation_id", this.K.creationId);
            hashMap.put("enter_from", "video_post_page");
            hashMap.put("content_type", N());
            hashMap.put("content_source", es.d(this.K));
            hashMap.put("shoot_way", this.K.mShootWay);
        }
        String str = this.K.creationId;
        DuetSettingItemStatus duetSettingItemStatus = this.f131596c;
        CommentSettingItemStatus commentSettingItemStatus = this.an;
        StitchSettingItemStatus stitchSettingItemStatus = this.f131597d;
        h.f.b.l.d(linearLayout3, "");
        h.f.b.l.d(videoPublishEditModel5, "");
        h.f.b.l.d(duetSettingItemStatus, "");
        h.f.b.l.d(commentSettingItemStatus, "");
        h.f.b.l.d(stitchSettingItemStatus, "");
        if (!com.ss.android.ugc.aweme.port.in.c.u.a()) {
            if (nVar5.g()) {
                boolean a4 = br.a(videoPublishEditModel5);
                nVar5.r = com.a.a(LayoutInflater.from(linearLayout3.getContext()), R.layout.ah0, linearLayout3, false);
                linearLayout3.addView(nVar5.r, new LinearLayout.LayoutParams(-1, nVar5.a(56.0f)));
                View view2 = nVar5.r;
                if (view2 != null) {
                    view2.setOnClickListener(new n.f(nVar5, a4, str, hashMap));
                }
                nVar5.f129811b = videoPublishEditModel5.commentSetting == 0;
                if (com.ss.android.ugc.aweme.shortvideo.publish.t.a()) {
                    if (!com.ss.android.ugc.aweme.port.in.c.u.b()) {
                        nVar5.f129814e = true;
                    } else {
                        if (nVar5.t) {
                            nVar5.f129814e = videoPublishEditModel5.allowDownloadSetting == 0;
                        }
                        b.i.a((Callable) n.h.f129831a).a(new n.i(nVar5), b.i.f4826c);
                    }
                }
                duetSettingItemStatus._visibility.setValue(8);
                commentSettingItemStatus._visibility.setValue(8);
            } else {
                Context context3 = linearLayout3.getContext();
                h.f.b.l.b(context3, "");
                j jVar = new j(duetSettingItemStatus, context3);
                Context context4 = linearLayout3.getContext();
                h.f.b.l.b(context4, "");
                j jVar2 = new j(stitchSettingItemStatus, context4);
                Context context5 = linearLayout3.getContext();
                h.f.b.l.b(context5, "");
                j jVar3 = new j(commentSettingItemStatus, context5);
                CommonSettingItemStatus commonSettingItemStatus2 = jVar.f129791c;
                j.a aVar5 = new j.a("duet");
                aVar5.f129793a = br.a(videoPublishEditModel5);
                aVar5.f129794b = com.ss.android.ugc.aweme.port.in.i.a().e().getReactDuetSettingCurrent(2) == br.f122115e;
                if (!videoPublishEditModel5.mIsFromDraft) {
                    VideoPublishEditModel videoPublishEditModel6 = nVar5.p;
                    if (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(videoPublishEditModel6 != null ? videoPublishEditModel6.getMainBusinessContext() : null) != null) {
                        aVar5.f129794b = true;
                    }
                }
                aVar5.f129795c = bo.a((BaseShortVideoContext) videoPublishEditModel5);
                aVar5.f129796d = R.string.be5;
                aVar5.f129797e = R.string.ca_;
                aVar5.f129798f = R.string.ha2;
                aVar5.f129799g = new n.q(nVar5, videoPublishEditModel5, commonSettingItemStatus2, str, hashMap);
                jVar.a(aVar5);
                CommonSettingItemStatus commonSettingItemStatus3 = jVar2.f129791c;
                boolean stitchSettingChanged = com.ss.android.ugc.aweme.port.in.i.a().e().getStitchSettingChanged(false);
                z.a aVar6 = new z.a();
                aVar6.element = true;
                if (stitchSettingChanged) {
                    aVar6.element = com.ss.android.ugc.aweme.port.in.i.a().e().getStitchSettingCurrent(0) == 0;
                } else if (com.ss.android.ugc.aweme.port.in.i.a().e().getReactDuetSettingChanged(false)) {
                    aVar6.element = com.ss.android.ugc.aweme.port.in.i.a().e().getReactDuetSettingCurrent(2) == 0;
                }
                j.a aVar7 = new j.a("stitch");
                if (!ee.a() || ((!(videoPublishEditModel5 instanceof VideoPublishEditModel) || !videoPublishEditModel5.isShoutout() || !com.ss.android.ugc.aweme.shoutouts.d.MODE_POST.equals(videoPublishEditModel5.mShoutOutsData.getShoutOutsMode())) && videoPublishEditModel5.getVideoLength() <= 0)) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                aVar7.f129793a = z5;
                aVar7.f129794b = aVar6.element;
                aVar7.f129795c = bo.a((BaseShortVideoContext) videoPublishEditModel5);
                aVar7.f129796d = R.string.g7y;
                aVar7.f129797e = R.string.cah;
                aVar7.f129798f = R.string.ha6;
                aVar7.f129799g = new n.r(videoPublishEditModel5, aVar6, commonSettingItemStatus3, str, hashMap);
                jVar2.a(aVar7);
                com.ss.android.ugc.aweme.port.in.i.a().e().setStitchSettingChanged(true);
                AVPreferences e2 = com.ss.android.ugc.aweme.port.in.i.a().e();
                if (h.f.b.l.a((Object) commonSettingItemStatus3._checked.getValue(), (Object) true)) {
                    i2 = br.f122116f;
                } else {
                    i2 = br.f122115e;
                }
                e2.setStitchSettingCurrent(i2);
                CommonSettingItemStatus commonSettingItemStatus4 = jVar3.f129791c;
                j.a aVar8 = new j.a(UGCMonitor.EVENT_COMMENT);
                aVar8.f129793a = true;
                aVar8.f129794b = videoPublishEditModel5.commentSetting == 0;
                aVar8.f129797e = 0;
                aVar8.f129798f = R.string.ha0;
                aVar8.f129799g = new n.g(videoPublishEditModel5, commonSettingItemStatus4, hashMap);
                jVar3.a(aVar8);
                PrivacyServiceImpl.c().a(new n.c(jVar, jVar2, jVar3));
            }
        }
        this.E = (TuxTextView) view.findViewById(R.id.mw);
        this.F = (TuxTextView) view.findViewById(R.id.mv);
        this.av = (TuxTextView) view.findViewById(R.id.ho);
        if (com.ss.android.ugc.aweme.setting.c.a() == 1) {
            this.av.setVisibility(0);
            TuxTextView tuxTextView = this.av;
            androidx.fragment.app.e activity = getActivity();
            h.f.b.l.d(activity, "");
            com.bytedance.tux.c.b a5 = com.bytedance.tux.c.c.a(w.a.f132375a).a(activity);
            Resources system = Resources.getSystem();
            h.f.b.l.a((Object) system, "");
            int a6 = h.g.a.a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            h.f.b.l.a((Object) system2, "");
            a5.setBounds(0, 0, a6, h.g.a.a(TypedValue.applyDimension(1, 14.0f, system2.getDisplayMetrics())));
            tuxTextView.setCompoundDrawablesRelative(a5, null, null, null);
            view.findViewById(R.id.ash).getLayoutParams().height = (int) com.bytedance.common.utility.n.b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.ben).getLayoutParams()).topMargin = (int) com.bytedance.common.utility.n.b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.hb).getLayoutParams()).topMargin = (int) com.bytedance.common.utility.n.b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.hl).getLayoutParams()).topMargin = (int) com.bytedance.common.utility.n.b(getContext(), 184.0f);
            ((RelativeLayout.LayoutParams) view.findViewById(R.id.bm5).getLayoutParams()).bottomMargin = (int) com.bytedance.common.utility.n.b(getContext(), 56.0f);
            int a7 = (com.bytedance.common.utility.n.a(getContext()) - ((int) com.bytedance.common.utility.n.b(getContext(), 46.0f))) / 3;
            this.av.setMaxWidth(a7);
            this.E.setMaxWidth(a7);
            this.F.setMaxWidth(a7);
        }
        HashTagMentionEditText hashTagMentionEditText = (HashTagMentionEditText) view.findViewById(R.id.atp);
        this.y = hashTagMentionEditText;
        hashTagMentionEditText.requestFocus();
        if (Build.VERSION.SDK_INT >= 28) {
            this.y.setFallbackLineSpacing(false);
        }
        this.r = new eh(this, this.y, this.E, this.F, this.av, this.C, this.K);
        if (this.ai.a()) {
            this.s.getViewTreeObserver().addOnGlobalLayoutListener(new cm(this));
        }
        this.au = new bf(this.K.creationId, this.r, view);
        new com.ss.android.ugc.aweme.shortvideo.l(this, this.r, view);
        this.r.a();
        this.u = (OmnipotentRoundCornerImgView) view.findViewById(R.id.bm5);
        this.u.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ((OmnipotentRoundCornerImgView) view.findViewById(R.id.bm6)).setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (this.K.mIsFromDraft && this.K.getVideoCoverPath() != null) {
            com.ss.android.ugc.aweme.video.e.c(this.K.getVideoCoverPath());
            this.K.generateVideoCoverPath();
        }
        L();
        this.u.setOnClickListener(new k() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass11 */

            static {
                Covode.recordClassIndex(86188);
            }

            @Override // com.ss.android.ugc.aweme.views.k
            public final void a(View view) {
                UrlModel urlModel;
                MethodCollector.i(8717);
                OmnipotentRoundCornerImgView omnipotentRoundCornerImgView = cj.this.u;
                omnipotentRoundCornerImgView.buildDrawingCache(true);
                Bitmap copy = omnipotentRoundCornerImgView.getDrawingCache(true).copy(Bitmap.Config.RGB_565, false);
                omnipotentRoundCornerImgView.destroyDrawingCache();
                cj.this.O = new VideoCoverBitmapHolder();
                cj.this.getLifecycle().a(cj.this.O);
                if (cj.this.P != null) {
                    copy = cj.this.P;
                }
                VideoCoverBitmapHolder.f131084a = copy;
                cj.this.y.setShouldDisableTrim(true);
                cj.this.a(true);
                String str = null;
                if (cj.this.S.isEmpty() || cj.this.S.get(1) == null || cj.this.S.get(1).f2398b == null) {
                    urlModel = null;
                } else {
                    str = cj.this.S.get(1).f2398b.getAnchorText();
                    urlModel = cj.this.S.get(1).f2398b.getAnchorIconUrl();
                }
                androidx.fragment.app.e activity = cj.this.getActivity();
                OmnipotentRoundCornerImgView omnipotentRoundCornerImgView2 = cj.this.u;
                TuxTextView tuxTextView = cj.this.v;
                VideoPublishEditModel videoPublishEditModel = cj.this.K;
                int permission = cj.this.f131606m.getValue().getPermission();
                String str2 = cj.this.ab;
                Intent intent = new Intent(activity, VEVideoPublishPreviewActivity.class);
                intent.putExtra("args", (Serializable) videoPublishEditModel);
                intent.putExtra("extra_publish_preview_anchor_text", str);
                intent.putExtra("extra_publish_preview_anchor_icon_url", urlModel);
                intent.putExtra("extra_publish_preview_permission", permission);
                intent.putExtra("extra_publish_preview_last_group_id", str2);
                androidx.core.h.v.a(omnipotentRoundCornerImgView2, "transition_view_v1");
                androidx.core.h.v.a(tuxTextView, "transition_view_v2");
                Bundle a2 = androidx.core.app.b.a(activity, e.a(omnipotentRoundCornerImgView2, "transition_view_v1"), e.a(tuxTextView, "transition_view_v2")).a();
                h.f.b.l.d(activity, "");
                h.f.b.l.d(intent, "");
                com.ss.android.ugc.tools.d.a.c.a(intent);
                activity.startActivityForResult(intent, 8, a2);
                cj.this.M = true;
                cj.this.r();
                MethodCollector.o(8717);
            }
        });
        this.v = (TuxTextView) view.findViewById(R.id.a5x);
        View findViewById2 = view.findViewById(R.id.a5w);
        if (!(dc.a() == 3 || dc.a() == 2)) {
            findViewById2 = this.v;
        }
        findViewById2.setOnClickListener(new k() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass3 */

            static {
                Covode.recordClassIndex(86195);
            }

            @Override // com.ss.android.ugc.aweme.views.k
            public final void a(View view) {
                r.a("click_cover_entrance", new com.ss.android.ugc.tools.f.b().a("creation_id", cj.this.K.creationId).a("enter_from", "video_post_page").a("shoot_way", cj.this.K.mShootWay).a("shoot_entrance", cj.this.s()).a("content_type", es.c(cj.this.K)).a("content_source", cj.this.K.getAvetParameter().getContentSource()).f149193a);
                cj.this.N = true;
                if (cj.this.X) {
                    g.a().o().i().a(cj.this.requireContext(), "enter_choose_cover_page");
                }
                androidx.fragment.app.e activity = cj.this.getActivity();
                VideoPublishEditModel videoPublishEditModel = cj.this.K;
                Intent intent = new Intent(activity, ChooseCoverActivity.class);
                intent.addFlags(603979776);
                intent.putExtra("KEY_VIDEO_PUBLISH_EDIT_MODEL", (Serializable) videoPublishEditModel);
                com.ss.android.ugc.tools.d.a.c.a(activity, intent, 4);
                activity.overridePendingTransition(R.anim.w, R.anim.x);
            }
        });
        this.w = findViewById.findViewById(R.id.ddf);
        this.o = (LinearLayout) findViewById.findViewById(R.id.ddj);
        this.p = (ImageView) findViewById.findViewById(R.id.ddk);
        this.w.setOnClickListener(new bp() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass12 */

            static {
                Covode.recordClassIndex(86189);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                cj.this.R = System.currentTimeMillis();
                r.a("performance_publish_click", new com.ss.android.ugc.tools.f.b().a("publish_action_trace_id", cj.this.V).f149193a);
                q.a("PublishDurationMonitor MANUAL_START");
                cr.a().f125301g = false;
                cr.a().f125302h = false;
                cr.a().g();
                if (!com.ss.android.ugc.aweme.port.in.c.u.b()) {
                    gr.c("LG");
                    cj.this.a(new fb(this));
                } else {
                    cj.this.h();
                }
                if (TextUtils.isEmpty(cj.this.K.playlist_id) && !TextUtils.isEmpty(cj.this.K.playlist_name)) {
                    MixFeedService.k().g();
                }
            }
        });
        View findViewById3 = findViewById.findViewById(R.id.apg);
        this.x = findViewById3;
        findViewById3.setOnClickListener(new bp() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass13 */

            static {
                Covode.recordClassIndex(86190);
            }

            @Override // com.ss.android.ugc.aweme.utils.bp
            public final void a(View view) {
                cr.a().g();
                if (!cj.this.ae) {
                    cj.this.b("click save draft button");
                }
            }
        });
        View view3 = this.x;
        View view4 = this.w;
        androidx.fragment.app.e activity2 = getActivity();
        com.ss.android.ugc.aweme.shortvideo.g.c cVar2 = this.ad;
        h.f.b.l.d(view3, "");
        h.f.b.l.d(view4, "");
        h.f.b.l.d(findViewById, "");
        h.f.b.l.d(cVar2, "");
        int a8 = com.bytedance.ies.abmock.b.a().a(true, "studio_draft_button", 0);
        ImageView imageView = (ImageView) view3.findViewById(R.id.aph);
        View findViewById4 = view3.findViewById(R.id.apn);
        view3.setOnTouchListener(new g.a(imageView, findViewById4, view3));
        if (!(activity2 == null || a8 == 0)) {
            float b2 = com.bytedance.common.utility.n.b(activity2, 44.0f);
            if (a8 == 1 || a8 == 2) {
                h.f.b.l.b(findViewById4, "");
                findViewById4.setVisibility(8);
                h.f.b.l.b(imageView, "");
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (layoutParams != null) {
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginStart(layoutParams2.getMarginEnd());
                    f2 = com.bytedance.common.utility.n.b(activity2, 64.0f);
                    if (a8 == 1 && ((Keva) d.f131672a.getValue()).getBoolean("ALLOW_DRAFT_TOOLTIP", true) && view3.getVisibility() == 0) {
                        cVar2.a(new com.ss.android.ugc.aweme.shortvideo.g.b("save_draft_button", LiveNetAdaptiveHurryTimeSetting.DEFAULT, new g.b(activity2, view3), (byte) 0));
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    MethodCollector.o(12013);
                    throw nullPointerException;
                }
            } else {
                if (a8 == 3 || a8 == 4) {
                    h.f.b.l.b(findViewById4, "");
                    ViewGroup.LayoutParams layoutParams3 = findViewById4.getLayoutParams();
                    if (layoutParams3 != null) {
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                        layoutParams4.setMarginEnd((int) com.bytedance.common.utility.n.b(activity2, 12.0f));
                        if (a8 == 3) {
                            h.f.b.l.b(imageView, "");
                            ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
                            if (layoutParams5 != null) {
                                ((LinearLayout.LayoutParams) layoutParams5).setMarginStart(layoutParams4.getMarginEnd());
                            } else {
                                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                MethodCollector.o(12013);
                                throw nullPointerException2;
                            }
                        } else {
                            h.f.b.l.b(imageView, "");
                            imageView.setVisibility(8);
                            View findViewById5 = view4.findViewById(R.id.ddi);
                            h.f.b.l.b(findViewById5, "");
                            findViewById5.setVisibility(8);
                            layoutParams4.setMarginStart(layoutParams4.getMarginEnd());
                        }
                        view3.setMinimumWidth((int) com.bytedance.common.utility.n.b(activity2, 64.0f));
                    } else {
                        NullPointerException nullPointerException3 = new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        MethodCollector.o(12013);
                        throw nullPointerException3;
                    }
                } else if (a8 == 5) {
                    h.f.b.l.b(imageView, "");
                    imageView.setVisibility(8);
                    View findViewById6 = view4.findViewById(R.id.ddi);
                    h.f.b.l.b(findViewById6, "");
                    findViewById6.setVisibility(8);
                    view3.setBackgroundResource(0);
                    LinearLayout linearLayout4 = (LinearLayout) findViewById;
                    linearLayout4.removeView(view3);
                    linearLayout4.removeView(view4);
                    linearLayout4.addView(view4, 0);
                    linearLayout4.addView(view3, -1);
                    linearLayout4.setOrientation(1);
                    f2 = -1.0f;
                    b2 = com.bytedance.common.utility.n.b(activity2, 32.0f);
                }
                f2 = -2.0f;
            }
            view3.setLayoutParams(new LinearLayout.LayoutParams((int) f2, (int) b2));
            view4.getLayoutParams().width = -1;
        }
        List<AVChallenge> readTextChallenges = this.K.getTextStickerChallenges().getReadTextChallenges();
        List list4 = this.K.challenges;
        if (list4 != null && !list4.isEmpty()) {
            this.as.f129781a = (AVChallenge) list4.get(0);
        }
        com.ss.android.ugc.aweme.port.in.c.f115634m.b().a(Boolean.valueOf(this.K.isPrivate == 1));
        com.ss.android.ugc.aweme.geofencing.a aVar9 = this.ao;
        List list5 = this.K.geofencingSetting;
        h.f.b.l.d(this, "");
        GeoFencingSettingItem geoFencingSettingItem2 = aVar9.f99012b;
        if (geoFencingSettingItem2 != null) {
            h.f.b.l.d(this, "");
            if (!GeoFencingSettingItem.a()) {
                geoFencingSettingItem2.f98993a.observe(this, new GeoFencingSettingItem.d(geoFencingSettingItem2));
                com.ss.android.ugc.aweme.geofencing.b.a.a(new GeoFencingSettingItem.e(geoFencingSettingItem2, list5));
            }
        }
        if (!a.C2412a.a()) {
            aVar9.f99013c.observe(this, new a.c(aVar9));
            com.ss.android.ugc.aweme.geofencing.b.a.a(new a.d(aVar9, list5));
        }
        if (this.K.title != null && this.K.title.trim().isEmpty()) {
            VideoPublishEditModel videoPublishEditModel7 = this.K;
            videoPublishEditModel7.title = videoPublishEditModel7.title.trim();
        }
        if (!TextUtils.isEmpty(this.K.chain)) {
            eh ehVar = this.r;
            String str2 = this.K.title;
            String str3 = this.K.chain;
            ehVar.f128419c.setText(str2);
            Editable text = ehVar.f128419c.getText();
            if (text != null) {
                HashMap hashMap2 = new HashMap(2);
                hashMap2.put("title", str2);
                hashMap2.put("text", text.toString());
                com.ss.android.ugc.aweme.port.in.i.a().o().o().a(new ek(str2, text), eh.f128417a, "setTitleAndChain", hashMap2);
            }
            ehVar.f128419c.setSelection(str2.length());
            ehVar.n = str3;
            ehVar.o = true;
        } else {
            this.r.f128419c.setText(this.K.title);
        }
        eh ehVar2 = this.r;
        String str4 = this.K.creationId;
        ehVar2.f128426j = str4;
        if (ehVar2.f128419c != null) {
            ehVar2.f128419c.setCreationId(str4);
        }
        if (this.K.isDuet()) {
            this.r.a(1);
        } else if (this.K.isReaction()) {
            this.r.a(2);
        } else if (this.K.isCommentReply()) {
            this.r.a(3);
        }
        this.r.c(this.K.structList);
        ArrayList arrayList = new ArrayList();
        if (this.K.challenges != null) {
            arrayList.addAll(this.K.challenges);
        }
        arrayList.addAll(readTextChallenges);
        this.r.f128419c.C.clear();
        this.r.a(arrayList);
        com.ss.android.ugc.aweme.shortvideo.c b3 = cr.a().b();
        if (!(this.K.mIsFromDraft || b3 == null || b3.challenge == null)) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(b3.challenge);
            this.r.a(arrayList2);
        }
        if (this.K.stickerChallenge != null && !this.K.stickerChallenge.infoStickerChallenges().isEmpty()) {
            Collection<AVChallenge> infoStickerChallenges = this.K.stickerChallenge.infoStickerChallenges();
            ArrayList arrayList3 = new ArrayList();
            if (this.K.challenges == null || this.K.challenges.isEmpty()) {
                arrayList3.addAll(infoStickerChallenges);
            } else {
                for (AVChallenge aVChallenge : infoStickerChallenges) {
                    if (aVChallenge != null && !this.K.challenges.contains(aVChallenge)) {
                        arrayList3.add(aVChallenge);
                    }
                }
            }
            this.r.a(arrayList3);
        }
        Mission a9 = com.ss.android.ugc.aweme.port.in.c.f115633l.a(this.K.commerceData);
        this.aO = a9;
        if (a9 != null) {
            this.y.setPublishExtensionDataContainer(this);
            this.r.b(this.aO.getChallengeNames());
            if (this.aO.getMentionedUsers() != null && !this.aO.getMentionedUsers().isEmpty()) {
                Iterator<MissionUser> it = this.aO.getMentionedUsers().iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    this.r.a(next.getNickname(), next.getUid(), next.getNickname());
                }
            }
        }
        if (!this.K.publishDuetMentionedUserList.isEmpty()) {
            for (String str5 : this.K.publishDuetMentionedUserList) {
                this.r.b(str5);
            }
        }
        DuetStickerStruct a10 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.K.getMainBusinessContext());
        if (!(a10 == null || a10.getUserList() == null || a10.getUserList().size() <= 0)) {
            for (DuetStickerUserStruct duetStickerUserStruct : a10.getUserList()) {
                this.r.a(duetStickerUserStruct.f134784a, duetStickerUserStruct.f134788e, duetStickerUserStruct.f134787d);
            }
        }
        if (!(this.K.mentionUserModel == null || (a2 = com.ss.android.ugc.aweme.utils.ad.a(this.K.mentionUserModel)) == null || a2.isEmpty())) {
            for (User user : a2) {
                if (user != null) {
                    this.r.f128419c.a(user.getNickname(), user.getUid(), user.getSecUid());
                }
            }
        }
        this.r.f128419c.a(true);
        if (bundle != null) {
            this.as.f129781a = (AVChallenge) bundle.getSerializable("challenge");
            this.f131606m.setValue(new com.ss.android.ugc.aweme.photo.a.a(bundle.getInt("permission"), (List) bundle.getSerializable("excludeUserList")));
            this.L = bundle.getBoolean("contentModified");
            this.U = bundle.getString("publish_id");
            this.V = bundle.getString("publish_action_trace_id");
        } else {
            this.V = UUID.randomUUID().toString();
        }
        for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
            eVar.f2398b.onCreate(this, (LinearLayout) view.findViewById(R.id.az1), bundle, AVPublishContentType.Video, bo.a(this.K), new ExtensionMisc(null, null, this.K.microAppModel, this, extensionDataRepo, new MobParam("video_post_page", this.K.mShootWay, this.K.creationId), com.ss.android.ugc.aweme.sticker.text.d.b(this.K)), new cn(this));
        }
        for (e<Class<?>, IAVPublishExtension<?>> eVar2 : this.S) {
            eVar2.f2398b.onCreateFinish();
        }
        this.f131596c._leftText.setValue(getString(R.string.sz));
        if (this.K.mIsFromDraft && this.I.b(this.f131596c) == 1) {
            com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.b(this.K);
            q();
        }
        if (gs.a()) {
            this.H.f129529a.a(new co(this));
        }
        if (i.a()) {
            this.H.f129529a.a(new cp(this));
        } else if (j().booleanValue()) {
            this.H.f129529a.a(false);
            this.H.f129529a.a(new cq(this));
        }
        D();
        this.H.a(this.K);
        if (z3) {
            this.f131598e._visibility.setValue(0);
            this.f131598e.addOnClickListener(new cr(this));
        }
        this.f131606m.observe(this, new cs(this));
        this.ao.a(this, new ct(this));
        this.r.w.add(com.google.c.a.k.a(this));
        ((CheckBox) view.findViewById(R.id.a5b)).setVisibility(8);
        String a11 = SettingsManager.a().a("video_description", "");
        if (!TextUtils.isEmpty(a11)) {
            this.y.setHint(a11);
        }
        a(view);
        l.a().z().a(this.ay, this);
        O();
        C();
        VideoPrivacySettingsItem videoPrivacySettingsItem2 = this.z;
        if (videoPrivacySettingsItem2 != null) {
            this.I.a((View) videoPrivacySettingsItem2);
            B();
        }
        MethodCollector.o(12013);
    }

    public final void a(boolean z2) {
        this.r.c();
        if (!z2) {
            this.r.f128419c.removeStarAtlas();
            ay.a(getContext(), this.y, false);
        }
        this.K.title = this.r.f128419c.getNoAdTagTextForTitleModule();
        List<AVTextExtraStruct> d2 = this.r.d();
        if (d2 != null) {
            this.K.structList = d2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final void a(final boolean z2, final boolean z3) {
        if (this.Z) {
            d("SaveDraft");
            return;
        }
        this.Z = true;
        long j2 = 0;
        try {
            if (!TextUtils.isEmpty(this.K.commerceData)) {
                j2 = new JSONObject(this.K.commerceData).getLong("star_atlas_order_id");
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        int i2 = 0;
        cr.a().f125301g = false;
        cr.a().f125302h = false;
        com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("original_resolution", com.ss.android.ugc.aweme.shortvideo.edit.bp.o(this.K)).a("creation_id", this.K.creationId).a("shoot_way", this.K.mShootWay).a("task_id", j2).a("enter_from", "video_post_page").a("content_source", es.d(this.K)).a("content_type", es.c(this.K)).a("is_subtitle", this.K.hasSubtitle() ? 1 : 0).a("from_group_id", dv.a());
        if (CrossLanguageUserExperiment.c().a()) {
            if (this.K.allowAutoCaptionSetting > 0) {
                i2 = 1;
            }
            a2.a("trans_auth", i2);
        }
        if (this.K.draftId != 0) {
            a2.a("draft_id", this.K.draftId);
        }
        if (TextUtils.isEmpty(this.K.newDraftId)) {
            this.K.newDraftId = com.ss.android.ugc.aweme.tools.draft.e.b.a();
            a2.a("first_create_time", (int) (System.currentTimeMillis() / 1000));
        }
        a2.a("new_draft_id", this.K.newDraftId);
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        String str = "";
        a2.a("music_id", cVar != null ? Long.valueOf(cVar.id) : str);
        if (this.K.isDuet()) {
            a2.a("is_through_duet_sticker", this.K.duetFromDuetSticker);
        }
        a2.a("creation_duration", this.K.getPreviewInfo().getPreviewVideoLength());
        a2.a("info_sticker_list", this.K.getInfoStickerList());
        a2.a("noise_reducer_status", this.K.isAudioEnhance ? "on" : "off");
        if (this.K.uploadMethod != null) {
            str = this.K.uploadMethod;
        }
        a2.a("upload_method", str);
        r.a("save_draft", a2.f149193a);
        c("save_draft");
        M();
        k();
        for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
            eVar.f2398b.onSaveDraft(bo.a(this.K));
        }
        com.ss.android.ugc.aweme.draft.k.a("[realSaveDraft], activity=" + getActivity());
        this.K.mSyncPlatforms = this.H.b();
        final com.ss.android.ugc.aweme.draft.model.c a3 = a(this.K);
        if (z2 && this.aC == null && getActivity() != null && !getActivity().isFinishing()) {
            this.aC = com.ss.android.ugc.aweme.widgetcompat.a.a(getActivity(), getString(R.string.ewe));
        }
        this.ae = true;
        r.a(this.K);
        h.b(b.a.a().a("save_draft").a());
        VideoPublishEditModel videoPublishEditModel = this.K;
        final int i3 = z3 ? 1 : 0;
        com.ss.android.ugc.aweme.shortvideo.ab.n.a(new m.c(a3, z3, videoPublishEditModel, new IDraftService.DraftSaveListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass7 */

            static {
                Covode.recordClassIndex(86199);
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveSuccess() {
                if (z2) {
                    cj.this.t();
                }
                if (z2 && cj.this.isAdded()) {
                    new com.bytedance.tux.g.b(cj.this).a(cj.this.getString(R.string.ffy)).b();
                }
                if (z3 && cj.this.isAdded()) {
                    new com.bytedance.tux.g.b(cj.this).a(cj.this.getString(R.string.a5j)).b();
                }
                com.ss.android.ugc.aweme.tools.draft.j.c.a().notifyDraftUpdate(a3);
                com.ss.android.ugc.aweme.port.in.c.C.c().a(a3, false);
                int i2 = i3;
                if (i2 == 0) {
                    cj.this.d(true);
                } else if (i2 == 1) {
                    cj.this.d(false);
                }
                com.ss.android.ugc.aweme.draft.k.a("[saveDraft]: creation id = " + a3.f() + " Music Path: " + cj.this.K.mMusicPath + " isMusicExist: " + com.ss.android.ugc.tools.utils.i.a(cj.this.K.mMusicPath));
                cj.this.ae = false;
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                if (z2) {
                    cj.this.t();
                }
                cj cjVar = cj.this;
                boolean a2 = com.ss.android.ugc.aweme.draft.i.a(draftSaveResult);
                boolean z = z2;
                boolean z2 = z3;
                if (z) {
                    if (a2) {
                        new com.bytedance.tux.g.b(cjVar).a(cjVar.getString(R.string.bcz)).b();
                    } else {
                        new com.bytedance.tux.g.b(cjVar).a(cjVar.getString(R.string.bd0)).b();
                    }
                    cjVar.Z = false;
                }
                if (z2) {
                    cjVar.d(false);
                }
                cj.this.ae = false;
            }
        }));
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax.a
    public final void a(String str) {
        VideoPublishEditModel videoPublishEditModel = this.K;
        if (videoPublishEditModel != null) {
            videoPublishEditModel.commerceData = str;
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax.a
    public final void a(Boolean bool, Boolean bool2) {
        Editable text;
        TagBAUser tagBAUser;
        if (bool.booleanValue()) {
            HashTagMentionEditText hashTagMentionEditText = this.y;
            BcAdModel c2 = l.f115658a.z().c();
            String str = null;
            String handleName = (c2 == null || (tagBAUser = c2.baUser) == null) ? null : tagBAUser.getHandleName();
            BcAdModel c3 = l.f115658a.z().c();
            if (c3 != null) {
                str = c3.partnerWith;
            }
            if (!TextUtils.isEmpty(handleName) && hashTagMentionEditText != null) {
                hashTagMentionEditText.removeStarAtlas();
                StringBuilder sb = new StringBuilder();
                if (str == null) {
                    str = "";
                }
                String a2 = com.a.a(str, Arrays.copyOf(new Object[]{"@".concat(String.valueOf(handleName))}, 1));
                h.f.b.l.b(a2, "");
                String sb2 = sb.append(a2).append(" ").toString();
                if (!TextUtils.isEmpty(sb2) && (text = hashTagMentionEditText.getText()) != null) {
                    hashTagMentionEditText.a(sb2.length());
                    Boolean.valueOf(true);
                    hashTagMentionEditText.a();
                    text.insert(0, sb2);
                    Boolean.valueOf(true);
                    hashTagMentionEditText.a(sb2);
                    return;
                }
                return;
            }
            return;
        }
        ay.a(getContext(), this.y, bool2.booleanValue());
    }

    private String N() {
        return es.c(this.K);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z v() {
        n();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z w() {
        b("checkServerPrePostAllow");
        return null;
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax.a
    public final boolean b() {
        return G().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax.a
    public final boolean c() {
        return I().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IComplianceService
    public boolean getMusicPreventDownload() {
        return j().booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.services.external.IComplianceService
    public int getPublishPermission() {
        PermissionSettingItem permissionSettingItem = this.f131601h;
        if (permissionSettingItem != null) {
            return permissionSettingItem.getPermission();
        }
        return -1;
    }

    static {
        Covode.recordClassIndex(86185);
    }

    private void D() {
        try {
            if (com.ss.android.ugc.aweme.global.config.settings.c.f99077a.f99078b.getSilentShareConfigurable().booleanValue()) {
                this.H.f129529a.a(getString(R.string.fsh));
            }
        } catch (com.bytedance.ies.a unused) {
        }
    }

    private VideoPublishViewModel E() {
        return (VideoPublishViewModel) com.bytedance.jedi.arch.t.a(requireActivity()).a(VideoPublishViewModel.class);
    }

    private Boolean F() {
        if (!AVCommerceServiceImpl.h().b()) {
            return false;
        }
        return G();
    }

    static Boolean j() {
        boolean z2;
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar == null || !cVar.isPreventDownload()) {
            z2 = false;
        } else {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean A() {
        new com.bytedance.tux.g.b(this).e(R.string.fge).b();
        return false;
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax.a
    public final String a() {
        VideoPublishEditModel videoPublishEditModel = this.K;
        if (videoPublishEditModel == null) {
            return null;
        }
        return videoPublishEditModel.commerceData;
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        ab.a(getActivity(), com.ss.android.ugc.aweme.shortvideo.publish.l.f129802b, new dz(this), new ea(this), new eb(this), new ec(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.R != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.R;
            if (currentTimeMillis < 10000) {
                Cif.a.a("click_publish", currentTimeMillis);
            }
            this.R = -1;
        }
    }

    public final String s() {
        if (this.K.getAvetParameter() != null) {
            return this.K.getAvetParameter().getStoryShootEntrance();
        }
        return "";
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z x() {
        new com.bytedance.tux.g.b(this).e(R.string.fge).b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z y() {
        new com.bytedance.tux.g.b(this).e(R.string.fge).b();
        return null;
    }

    private void B() {
        this.an._checked.observe(this, new cu(this));
        this.f131596c._checked.observe(this, new cv(this));
        this.f131597d._checked.observe(this, new cx(this));
    }

    private void C() {
        int i2;
        if (this.aL) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        if (l.f115658a.z().e()) {
            i2 = 1;
        }
        r.a("post_page_show", new com.ss.android.ugc.tools.f.b().a("shoot_way", this.K.mShootWay).a("creator_type", i2).f149193a);
    }

    private Boolean G() {
        VideoPublishEditModel videoPublishEditModel = this.K;
        boolean z2 = true;
        if (videoPublishEditModel != null && videoPublishEditModel.realHasOriginalSound()) {
            return true;
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null && !cVar.isOriginalSound()) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    private Boolean H() {
        VideoPublishEditModel videoPublishEditModel = this.K;
        boolean z2 = false;
        if (videoPublishEditModel != null && videoPublishEditModel.hasOriginalSound()) {
            return false;
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null && !cVar.isCommerceMusic()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    private Boolean I() {
        VideoPublishEditModel videoPublishEditModel = this.K;
        boolean z2 = false;
        if (videoPublishEditModel != null && videoPublishEditModel.hasOriginalSound()) {
            return false;
        }
        com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
        if (cVar != null && cVar.isCommerceMusic()) {
            z2 = true;
        }
        return Boolean.valueOf(z2);
    }

    private void J() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null || !com.ss.android.ugc.aweme.settings.j.a()) {
            Intent intent = new Intent();
            intent.putExtra("publish result", "PublishActivity success");
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    private void M() {
        VideoPublishEditModel videoPublishEditModel = this.K;
        videoPublishEditModel.setMainBusinessData(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e.updateSDKShareContextWhenSaveOrPost(videoPublishEditModel.mIsFromDraft, this.K.getMainBusinessData()));
        this.aH = (ad) com.ss.android.ugc.aweme.port.in.c.f115623b.a(com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.e.getShareContext(this.K.getMainBusinessContext()), ad.class);
    }

    private void O() {
        p pVar = this.H;
        if (pVar != null && pVar.f129529a != null && this.H.f129529a.c() != null && this.H.f129529a.c().getVisibility() == 0) {
            ShareServiceImpl.a().a(getPublishPermission(), getMusicPreventDownload());
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        this.aB.incrementAndGet();
        if (this.aA == null && getActivity() != null && !getActivity().isFinishing()) {
            this.aA = com.ss.android.ugc.aweme.widgetcompat.a.a(getActivity(), getString(R.string.fe8));
            q.d("VideoPublish prepareEffects:" + this.aA);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        com.ss.android.ugc.aweme.widgetcompat.a aVar;
        if (this.aB.decrementAndGet() == 0 && (aVar = this.aA) != null && aVar.isShowing() && getActivity() != null && !getActivity().isFinishing()) {
            this.aA.dismiss();
            this.aA = null;
        }
    }

    public final void l() {
        for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
            eVar.f2398b.onBackPressed(bo.a(this.K));
        }
        if (!this.T) {
            com.ss.android.ugc.aweme.port.in.g.a().o().i().a(getContext(), "publish_page_on_back_pressed");
        }
    }

    /* access modifiers changed from: package-private */
    public final void o() {
        f.a.ab.a(ek.f131720a).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a_(new ae<Boolean>() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass5 */

            static {
                Covode.recordClassIndex(86197);
            }

            private void a() {
                if (cj.this.W == -1) {
                    cj cjVar = cj.this;
                    cjVar.W = com.ss.android.ugc.aweme.shortvideo.v.g.a(cjVar.requireContext(), cj.this.K);
                }
                if (cj.this.W != 0) {
                    Bundle c2 = cj.this.c(true);
                    c2.putInt("pre_publish_type", cj.this.W);
                    if (!com.ss.android.ugc.aweme.settings.m.a()) {
                        cj cjVar2 = cj.this;
                        cjVar2.U = h.a(c2, cjVar2.U);
                    } else if (h.c() == 0) {
                        com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel start pre publish task");
                        h.a(b.a.a().a("pre_publish_reset_task_state").a());
                        h.c(c2);
                    } else if (com.ss.android.ugc.aweme.settings.m.c()) {
                        com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel resume previous paused task, wait for finish");
                        h.a();
                        h.f120867f = new fa(c2);
                    }
                } else if (com.ss.android.ugc.aweme.settings.m.a() && com.ss.android.ugc.aweme.settings.m.c() && h.c() != 0) {
                    com.ss.android.ugc.aweme.scheduler.g.a("PublishParallel resume previous paused task");
                    h.a();
                }
            }

            @Override // f.a.ae
            public final void onSubscribe(f.a.b.b bVar) {
                cj.this.ac = bVar;
            }

            @Override // f.a.ae
            public final void onError(Throwable th) {
                q.b("fetch user pre publish config failed");
                q.a(th);
                com.ss.android.ugc.aweme.port.in.g.a().e().setEnablePreUploadByUser(false);
                a();
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // f.a.ae
            public final /* synthetic */ void onSuccess(Boolean bool) {
                Boolean bool2 = bool;
                q.a("fetch user pre publish config onSuccess".concat(String.valueOf(bool2)));
                com.ss.android.ugc.aweme.port.in.g.a().e().setEnablePreUploadByUser(bool2.booleanValue());
                a();
            }
        });
    }

    public final void t() {
        com.ss.android.ugc.aweme.widgetcompat.a aVar = this.aC;
        if (aVar != null && aVar.isShowing() && getActivity() != null && !getActivity().isFinishing()) {
            this.aC.dismiss();
            this.aC = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z u() {
        r.a("tns_video_push_words_cancel_ck", new com.ss.android.ugc.tools.f.b().a("creation_id", this.K.creationId).a("user_id", com.ss.android.ugc.aweme.port.in.c.u.e().c()).f149193a);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z z() {
        if (!this.f131603j.booleanValue()) {
            new com.bytedance.tux.g.b(getActivity()).e(R.string.gj5).b();
            return null;
        }
        IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).showAddToMixInPublishPage(getActivity(), new et(this), "video_post_page", "publish_page", this.f131605l, this.f131604k);
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        VideoPublishEditModel videoPublishEditModel;
        if (this.aj != null && (videoPublishEditModel = this.K) != null) {
            if (videoPublishEditModel.tagUserList != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<InteractionTagUserInfo> it = this.K.tagUserList.iterator();
                while (it.hasNext()) {
                    arrayList.add(InteractionTagInfoKt.toMutualUser(it.next()));
                }
                if (arrayList.size() > 0) {
                    this.aj.setVisibility(0);
                    this.aj.a(new MutualStruct(0, arrayList.size(), arrayList), 4);
                    return;
                }
            }
            this.aj.setVisibility(8);
        }
    }

    public final void i() {
        PublishExtensionModel fromString = PublishExtensionModel.fromString(this.K.commerceData);
        BcAdModel c2 = l.f115658a.z().c();
        if (!(c2 == null || c2.baUser == null)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c2.baUser);
            fromString.tcmTagBaInfo = arrayList;
        }
        fromString.brandedContentType = l.f115658a.z().h();
        fromString.starAtlasContent = l.f115658a.z().d();
        this.K.commerceData = PublishExtensionModel.toString(fromString);
        ay.a(getContext(), this.y, false);
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.publish.c.a());
        if (this.f131606m.getValue().getPermission() == 1) {
            b(true);
            return;
        }
        com.ss.android.ugc.aweme.port.in.ab abVar = com.ss.android.ugc.aweme.port.in.c.f115624c;
        getContext();
        abVar.a(new ab.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass2 */

            static {
                Covode.recordClassIndex(86194);
            }

            @Override // com.ss.android.ugc.aweme.port.in.ab.a
            public final void a(boolean z) {
                cj.this.b(false);
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final h.z q() {
        DuetStickerStruct a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.K.getMainBusinessContext());
        if (!(a2 == null || a2.getUserList() == null || a2.getUserList().size() <= 0)) {
            for (DuetStickerUserStruct duetStickerUserStruct : a2.getUserList()) {
                this.r.b(duetStickerUserStruct.a().getUid());
            }
        }
        return h.z.f158842a;
    }

    public final void r() {
        r.a("click_preview_entrance", new com.ss.android.ugc.tools.f.b().a("original_resolution", com.ss.android.ugc.aweme.shortvideo.edit.bp.o(this.K)).a("creation_id", this.K.creationId).a("enter_from", "video_post_page").a("shoot_way", this.K.mShootWay).a("shoot_entrance", s()).a("content_source", es.d(this.K)).a("content_type", es.c(this.K)).a("route", "1").f149193a);
    }

    private void K() {
        String trim = this.r.f128419c.getNoAdTagTextForTitleModule().trim();
        List asList = Arrays.asList(trim.split("\n"));
        ArrayList<AVTextExtraStruct> arrayList = new ArrayList();
        for (AVTextExtraStruct aVTextExtraStruct : this.K.structList) {
            arrayList.add(aVTextExtraStruct.clone());
        }
        Collections.sort(arrayList, ei.f131718a);
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (AVTextExtraStruct aVTextExtraStruct2 : arrayList) {
            String substring = trim.substring(aVTextExtraStruct2.getStart(), aVTextExtraStruct2.getEnd());
            int i5 = i3;
            while (true) {
                if (i5 >= asList.size()) {
                    break;
                }
                int indexOf = ((String) asList.get(i5)).indexOf(substring, i4);
                if (indexOf >= 0) {
                    i4 = substring.length() + indexOf;
                    aVTextExtraStruct2.setLineIndex(i5);
                    aVTextExtraStruct2.setStart(indexOf);
                    aVTextExtraStruct2.setEnd(i4);
                    i3 = i5;
                    break;
                }
                i5++;
                i4 = 0;
            }
        }
        this.K.contentDesc = asList;
        this.K.contentDescExtra = arrayList;
        String replaceAll = trim.replaceAll("\n+", " ");
        ArrayList<AVTextExtraStruct> arrayList2 = new ArrayList();
        for (AVTextExtraStruct aVTextExtraStruct3 : this.K.structList) {
            arrayList2.add(aVTextExtraStruct3.clone());
        }
        Collections.sort(arrayList2, ej.f131719a);
        for (AVTextExtraStruct aVTextExtraStruct4 : arrayList2) {
            String substring2 = trim.substring(aVTextExtraStruct4.getStart(), aVTextExtraStruct4.getEnd());
            int indexOf2 = replaceAll.indexOf(substring2, i2);
            if (indexOf2 >= 0) {
                i2 = substring2.length() + indexOf2;
                aVTextExtraStruct4.setStart(indexOf2);
                aVTextExtraStruct4.setEnd(i2);
            }
        }
        this.K.returnCaptionTitle = replaceAll;
        this.K.returnCaptionStructList = arrayList2;
    }

    public final void h() {
        com.ss.android.ugc.aweme.photo.a.a value = this.f131606m.getValue();
        if (value == null || value.getPermission() != -1) {
            com.ss.android.ugc.aweme.ba.e eVar = this.r.v;
            if (!eVar.f67873a.isEmpty() && eVar.f67876d) {
                r.a("input_word_cut", new com.ss.android.ugc.tools.f.b().a("enter_from", "publish").a("input_content", eVar.f67874b).a("input_content_cut", eVar.f67875c.b(eVar.f67873a)).f149193a);
                eVar.a();
            }
            if (!l.f115658a.z().a(getActivity(), getContext(), H(), this.r.d(), new Cdo(this), new dp(this), new dq(this), new dr(this)).booleanValue()) {
                int a2 = l.f115658a.z().a(getContext(), getActivity(), this.ar, H(), I(), this.r.d());
                if (a2 == 1) {
                    this.ar = true;
                } else if (a2 == 0) {
                    i();
                }
            }
        } else {
            this.aa = "click_post";
            com.ss.android.ugc.aweme.shortvideo.eventtrack.f.a("click_post", value.getPermission());
            cf cfVar = this.n;
            dn dnVar = new dn(this);
            DialogInterface.OnDismissListener onDismissListener = this.aR;
            if (cfVar.f125113e != null) {
                cfVar.a(cfVar.f125114f, cfVar.f125115g, false, false);
                cfVar.f125113e.a(cfVar.f125109a, dnVar, onDismissListener);
            }
        }
    }

    public final void k() {
        a(false);
        com.ss.android.ugc.aweme.photo.a.a value = this.f131606m.getValue();
        if (value != null) {
            this.K.isPrivate = value.getPermission();
            this.K.excludeUserList = value.getExcludeUserList();
            this.K.allowRecommend = value.getAllowRecommend();
        }
        this.K.geofencingSetting = this.ao.a();
        if (this.as.b() == null || !dj.a(this.r.d(), this.as.a())) {
            this.K.challenges = null;
        } else {
            this.K.challenges = new ArrayList();
            this.K.challenges.add(this.as.f129781a);
        }
        n nVar = this.I;
        if (nVar != null) {
            this.K.commentSetting = nVar.a(this.an);
            this.K.allowDownloadSetting = this.I.f();
            if (CrossLanguageUserExperiment.c().a() && this.f131600g != null) {
                this.K.allowAutoCaptionSetting = n.c(this.f131599f);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        View view;
        boolean z2 = false;
        if (SettingsManager.a().a("studio_reset_publish_view_touch_listener", false) && (view = getView()) != null) {
            ba.f132250a.a(view, null);
        }
        com.ss.android.ugc.aweme.shortvideo.g.c cVar = this.ad;
        if (cVar != null) {
            cVar.b().clear();
            this.ad = null;
        }
        f.a.b.b bVar = this.ac;
        if (bVar != null) {
            bVar.dispose();
        }
        q.a("ProcessPublish DestroyPublishFragment isPublish:" + this.T);
        if (!this.T) {
            com.ss.android.ugc.aweme.port.in.g.a().o().i().a(requireContext(), "publish_page_destroyed");
        }
        super.onDestroyView();
        if (this.H == null) {
            StringBuilder sb = new StringBuilder("syncModule is null and the fragment's view is null?:->");
            if (getView() == null) {
                z2 = true;
            }
            com.ss.android.ugc.aweme.framework.a.a.a(sb.append(z2).toString());
        }
        eh ehVar = this.r;
        if (ehVar.p != null) {
            aj ajVar = ehVar.p;
            f.a.b.b bVar2 = ajVar.f129726f;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            f.a.b.b bVar3 = ajVar.f129727g;
            if (bVar3 != null) {
                bVar3.dispose();
            }
        }
        for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
            eVar.f2398b.onDestroy();
        }
        h.f120867f = null;
        ar.f132216a.b();
    }

    private void L() {
        boolean z2;
        if (this.K.canvasVideoData != null) {
            List<String> sourceInfo = this.K.canvasVideoData.getSourceInfo();
            if (sourceInfo != null && !sourceInfo.isEmpty()) {
                a(this.u, BitmapUtils.decodeBitmap(new File(sourceInfo.get(0))));
            }
        } else if (this.K.isMvThemeVideoType()) {
            String str = this.K.mvCreateVideoData.videoCoverImgPath;
            if (com.ss.android.ugc.aweme.video.e.b(str)) {
                e(str);
            }
        } else if (!this.K.isMultiVideoEdit()) {
            ArrayList arrayList = new ArrayList();
            if (this.K.mEffectList != null) {
                arrayList.addAll(this.K.mEffectList);
            }
            if (this.K.mTimeEffect != null) {
                arrayList.add(this.K.mTimeEffect);
                if (this.K.mTimeEffect.getKey().equals("1")) {
                    z2 = true;
                    com.ss.android.ugc.aweme.shortvideo.u.a.a(arrayList, com.ss.android.ugc.aweme.filter.c.b(es.a(this.K, com.ss.android.ugc.aweme.port.in.c.C.r().d())), this.K.mSelectedFilterIntensity, (int) (this.K.mVideoCoverStartTm * 1000.0f), z2, this.K.getPreviewInfo(), this.K.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() {
                        /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass6 */

                        static {
                            Covode.recordClassIndex(86198);
                        }

                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverFailed(int i2) {
                            new com.bytedance.tux.g.b(cj.this).e(R.string.doa).b();
                        }

                        @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                        public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                            if (cj.this.u != null && cj.this.getContext() != null) {
                                Bitmap mergeCoverText = cj.this.K.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                                androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(cj.this.getResources(), mergeCoverText);
                                a2.a(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 4.0f));
                                cj.this.u.setImageDrawable(a2);
                                cj.this.P = mergeCoverText;
                                com.ss.android.ugc.aweme.shortvideo.u.a.a(mergeCoverText, cj.this.K.getVideoCoverPath());
                            }
                        }
                    });
                }
            }
            z2 = false;
            com.ss.android.ugc.aweme.shortvideo.u.a.a(arrayList, com.ss.android.ugc.aweme.filter.c.b(es.a(this.K, com.ss.android.ugc.aweme.port.in.c.C.r().d())), this.K.mSelectedFilterIntensity, (int) (this.K.mVideoCoverStartTm * 1000.0f), z2, this.K.getPreviewInfo(), this.K.getVideoCoverPath(), new IEffectService.OnVideoCoverCallback() {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass6 */

                static {
                    Covode.recordClassIndex(86198);
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverFailed(int i2) {
                    new com.bytedance.tux.g.b(cj.this).e(R.string.doa).b();
                }

                @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
                public final void onGetVideoCoverSuccess(Bitmap bitmap) {
                    if (cj.this.u != null && cj.this.getContext() != null) {
                        Bitmap mergeCoverText = cj.this.K.getCoverPublishModel().getEffectTextModel().mergeCoverText(bitmap);
                        androidx.core.graphics.drawable.b a2 = androidx.core.graphics.drawable.d.a(cj.this.getResources(), mergeCoverText);
                        a2.a(com.bytedance.common.utility.n.b(com.ss.android.ugc.aweme.port.in.c.f115622a, 4.0f));
                        cj.this.u.setImageDrawable(a2);
                        cj.this.P = mergeCoverText;
                        com.ss.android.ugc.aweme.shortvideo.u.a.a(mergeCoverText, cj.this.K.getVideoCoverPath());
                    }
                }
            });
        } else if (es.j(this.K)) {
            if (TextUtils.isEmpty(this.K.multiEditVideoRecordData.coverImagePath)) {
                this.K.multiEditVideoRecordData.coverImagePath = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.b.d.a();
            }
            String str2 = this.K.multiEditVideoRecordData.coverImagePath;
            if (com.ss.android.ugc.aweme.video.e.b(str2)) {
                e(str2);
            }
        } else {
            VERecordData a2 = com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.a.a(this.K.getCurMultiEditVideoRecordData());
            Pair<Integer, Integer> playInOutTime = this.K.getCurMultiEditVideoRecordData().getPlayInOutTime();
            a2.a((long) (((Integer) playInOutTime.first).intValue() * 1000), (long) (((Integer) playInOutTime.second).intValue() * 1000));
            this.u.post(new el(this, playInOutTime, a2));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
            eVar.f2398b.onResume();
        }
        com.ss.android.ugc.aweme.photo.a.a value = this.f131606m.getValue();
        if (value != null) {
            if (com.ss.android.ugc.aweme.port.in.c.r.c() == 2) {
                this.Y = true;
                if (value.getPermission() == 1) {
                    this.f131606m.setValue(new com.ss.android.ugc.aweme.photo.a.a(0));
                    value = this.f131606m.getValue();
                    new com.bytedance.tux.g.b(this).a(getContext().getString(R.string.h9x)).b();
                }
                this.n.a(value.getPermission(), (List<User>) null, 0, true, "");
            } else if (com.ss.android.ugc.aweme.port.in.c.r.c() == 1) {
                this.Y = false;
                this.n.a(value.getPermission(), (List<User>) null, 0, false, "");
            }
            if (com.ss.android.ugc.aweme.port.in.c.r.c() == 2) {
                this.Y = true;
                if (value.getPermission() == 1) {
                    this.f131606m.setValue(new com.ss.android.ugc.aweme.photo.a.a(0));
                    value = this.f131606m.getValue();
                    new com.bytedance.tux.g.b(this).a(getContext().getString(R.string.h9x)).b();
                }
                this.n.a(value.getPermission(), (List<User>) null, 0, true, "");
            } else if (com.ss.android.ugc.aweme.port.in.c.r.c() == 1) {
                this.Y = false;
                this.n.a(value.getPermission(), (List<User>) null, 0, false, "");
            }
        }
        this.aQ.a(this, new cw(this));
        com.bytedance.als.l<Boolean> lVar = E().f131942d;
        lVar.a(this, new dh(this, lVar));
    }

    public final void p() {
        int i2;
        DuetStickerStruct a2;
        List<DuetStickerUserStruct> userList;
        if (!(getActivity() == null || getActivity().isFinishing())) {
            this.T = true;
            if (!this.aF && !this.aJ) {
                getActivity().finish();
            }
            com.ss.android.ugc.aweme.port.in.c.f115624c.a(getActivity(), this.K.mStickerID);
            for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
                eVar.f2398b.onPublish(bo.a(this.K));
            }
            gr.a("-2", BehaviorType.EVENT, "CP", null, null, 24);
            this.K.screenBrightness = com.ss.android.ugc.aweme.common.e.a(getActivity());
            MentionEditText.MentionSpan[] mentionText = this.r.f128419c.getMentionText();
            VideoPublishEditModel videoPublishEditModel = this.K;
            HashSet hashSet = new HashSet();
            if (!(mentionText == null || mentionText.length == 0)) {
                for (MentionEditText.MentionSpan mentionSpan : mentionText) {
                    String str = mentionSpan.f132609g;
                    if (!(str == null || str.length() == 0)) {
                        hashSet.add(mentionSpan.f132609g);
                    }
                }
            }
            if (!(videoPublishEditModel == null || (a2 = com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(videoPublishEditModel.getMainBusinessContext())) == null || (userList = a2.getUserList()) == null)) {
                Iterator<T> it = userList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().f134787d);
                }
            }
            String valueOf = String.valueOf(hashSet.size());
            if (com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.b.a(this.K.getMainBusinessContext()) == null) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            com.ss.android.ugc.aweme.shortvideo.eventtrack.e.a(requireActivity(), this.K, this.B, this.aI, this.y, this.H, this.ab, this.aN, this.aO, valueOf, false, i2);
            androidx.fragment.app.e requireActivity = requireActivity();
            VideoPublishEditModel videoPublishEditModel2 = this.K;
            int i3 = this.W;
            String str2 = this.V;
            h.f.b.l.d(requireActivity, "");
            h.f.b.l.d(videoPublishEditModel2, "");
            h.f.b.l.d(str2, "");
            r.a("performance_publish", new com.ss.android.ugc.tools.f.b().a("creation_id", videoPublishEditModel2.creationId).a("shoot_way", videoPublishEditModel2.mShootWay).a("content_type", es.c(videoPublishEditModel2)).a("video_type", 0).a("memory_total_size_mb", (int) ((bs.a(requireActivity) / 1024) / 1024)).a("retry_publish", 0).a("pre_publish_type", i3).a("publish_action_trace_id", str2).a("brightness", videoPublishEditModel2.screenBrightness).a("is_hd_video", dmt.av.video.m.a(videoPublishEditModel2) ? 1 : 0).a("video_upload_type", 1).f149193a);
            if (com.ss.android.ugc.aweme.settings.i.a()) {
                com.bytedance.apm.b.a("user_publish_success_rate_parallel", -1, new com.ss.android.ugc.aweme.shortvideo.ar().a("video_type", (Integer) 0).a("retry_publish", (Integer) 0).a("video_upload_type", (Integer) 1).a());
            }
            r.a(this.K);
            com.ss.android.ugc.aweme.shortvideo.ab.n.a(new m.b(getActivity(), c(false), this.U));
            if (this.K.isSaveLocal()) {
                r.a("download", new com.ss.android.ugc.tools.f.b().a("scene_id", 1004).a("creation_id", this.K.creationId).a("group_id", "").a("enter_from", "video_post_page").a("content_type", es.c(this.K)).a("download_type", "self").a("download_method", "download_with_publish").f149193a);
            }
            c("publish");
        }
    }

    /* access modifiers changed from: package-private */
    public final void n() {
        String str;
        int i2;
        CheckBox checkBox;
        boolean z2;
        int a2;
        boolean z3;
        if (this.Z) {
            d("Publish");
            return;
        }
        this.Z = true;
        this.aD = SystemClock.uptimeMillis();
        M();
        if (TextUtils.isEmpty(this.K.musicId)) {
            str = "";
        } else {
            str = this.K.musicId;
        }
        if (TextUtils.isEmpty(str)) {
            com.ss.android.ugc.aweme.shortvideo.c cVar = cr.a().f125295a;
            if (cVar == null) {
                str = "";
            } else {
                str = cVar.getMusicId();
            }
        }
        if (this.K != null && !TextUtils.isEmpty(str) && "edit_page_recommend".equals(this.K.mMusicOrigin) && 1 == this.K.comFrom) {
            com.ss.android.ugc.tools.f.b a3 = new com.ss.android.ugc.tools.f.b().a("item_id", str);
            h.f.b.l.b("94349537923", "");
            r.a("jarvis_item_click", a3.a("channel_id", "94349537923").a("req_id", this.K.aiMusicLogPbImprId).f149193a);
        }
        this.r.c();
        this.K.title = this.r.f128419c.getNoAdTagTextForTitleModule();
        List<AVTextExtraStruct> d2 = this.r.d();
        if (d2 == null) {
            this.K.structList = new ArrayList();
        } else {
            this.K.structList = d2;
        }
        if (ah) {
            K();
        }
        GoodsPublishModel goodsPublishModel = (GoodsPublishModel) AVPublishExtensionUtils.findModel(this.S, GoodsPublishModel.class);
        if (goodsPublishModel != null && !TextUtils.isEmpty(goodsPublishModel.getGoodsDraftId())) {
            this.K.shopDraftId = goodsPublishModel.getGoodsDraftId();
        }
        HotSpotTagPublishModel hotSpotTagPublishModel = (HotSpotTagPublishModel) AVPublishExtensionUtils.findModel(this.S, HotSpotTagPublishModel.class);
        if (hotSpotTagPublishModel != null) {
            this.K.hotSpotTag = hotSpotTagPublishModel.getTag();
            this.K.sentenceId = hotSpotTagPublishModel.getId();
        }
        com.ss.android.ugc.aweme.photo.a.a value = this.f131606m.getValue();
        if (value != null) {
            this.K.isPrivate = value.getPermission();
            this.K.excludeUserList = value.getExcludeUserList();
            this.K.allowRecommend = value.getAllowRecommend();
        }
        if (this.K.mOutputFile == null || TextUtils.isEmpty(this.K.mOutputFile)) {
            this.K.mOutputFile = com.ss.android.ugc.aweme.shortvideo.WorkSpace.b.a(this.K).h().getPath();
        }
        boolean z4 = false;
        if (CrossLanguageUserExperiment.c().a()) {
            this.K.allowAutoCaptionSetting = n.c(this.f131599f);
            if (this.K.allowAutoCaptionSetting > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            com.ss.android.ugc.aweme.cs.g.a.f79059a.storeBoolean("privacy_setting_auto_caption", z3);
        }
        this.K.commentSetting = this.I.a(this.an);
        this.K.reactDuetSetting = this.I.b(this.f131596c);
        VideoPublishEditModel videoPublishEditModel = this.K;
        n nVar = this.I;
        StitchSettingItemStatus stitchSettingItemStatus = this.f131597d;
        h.f.b.l.d(stitchSettingItemStatus, "");
        if (!cz.a() ? !h.f.b.l.a((Object) stitchSettingItemStatus._checked.getValue(), (Object) true) : (a2 = com.ss.android.ugc.aweme.property.ax.a()) == 1 || a2 == 2 ? !nVar.f129813d : !h.f.b.l.a((Object) stitchSettingItemStatus._checked.getValue(), (Object) true)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        videoPublishEditModel.stitchSetting = i2;
        this.K.geofencingSetting = this.ao.a();
        n nVar2 = this.I;
        VideoPublishEditModel videoPublishEditModel2 = this.K;
        h.f.b.l.d(videoPublishEditModel2, "");
        if (com.ss.android.ugc.aweme.shortvideo.publish.t.a()) {
            videoPublishEditModel2.allowDownloadSetting = nVar2.f();
        }
        this.K.challenges = null;
        int c2 = this.H.c();
        if (com.ss.android.ugc.aweme.shortvideo.k.a.a() && c2 == 1 && com.ss.android.ugc.aweme.publish.t.b() == 0) {
            c2 = 0;
        }
        com.ss.android.ugc.aweme.port.in.g.a().o().m().a(this.K, c2);
        if (this.K.getSaveModel() != null) {
            AVUploadSaveModel saveModel = this.K.getSaveModel();
            if (this.I.a() || (this.I.n && com.ss.android.ugc.aweme.publish.t.b() > 0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            saveModel.setSaveToAlbum(z2);
            AVUploadSaveModel saveModel2 = this.K.getSaveModel();
            if ((this.I.n || com.ss.android.ugc.aweme.shortvideo.k.a.a()) && this.K.hasSubtitle() && com.ss.android.ugc.aweme.publish.t.b() == 2) {
                z4 = true;
            }
            saveModel2.setSaveWithCaption(z4);
            this.K.getSaveModel().setSaveToAppPathInsteadOfAlbum(this.I.n);
            this.K.getSaveModel().setEnableSilentEnhancement(n.a.a());
        }
        this.K.mSyncPlatforms = this.H.b();
        if (F().booleanValue() && (checkBox = this.B) != null) {
            if (checkBox.isChecked()) {
                this.K.musicUsageConfirmation = 1;
            } else {
                this.K.musicUsageConfirmation = 2;
            }
        }
        if (this.f131603j.booleanValue()) {
            this.K.playlist_id = this.f131605l;
            this.K.playlist_name = this.f131604k;
            r.a("add_playlist_video", new com.ss.android.ugc.tools.f.b().a("enter_from", this.K.enterFrom).a("enter_method", "publish_page").a("playlist_id", this.f131605l).f149193a);
        }
        try {
            this.K.mPoiData = com.ss.android.ugc.aweme.poi_api.service.c.a().a(new eh(this));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        com.ss.android.ugc.aweme.draft.k.a("start save draft before publish creation id = " + this.K.creationId);
        final com.ss.android.ugc.aweme.draft.model.c a4 = a(this.K);
        cr.a().q = a4.r();
        com.ss.android.ugc.aweme.shortvideo.ab.n.a(new m.c(a4, 1, this.K, new IDraftService.DraftSaveListener() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass8 */

            static {
                Covode.recordClassIndex(86200);
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveSuccess() {
                com.ss.android.ugc.aweme.port.in.g.a().c().a(a4, true);
                com.ss.android.ugc.aweme.port.in.c.D.d().a().b(a4);
                Context context = cj.this.getContext();
                if (context != null) {
                    new com.ss.android.ugc.aweme.shortvideo.publish.z(context, new aa(context, cj.this.K)).a(a4);
                }
                cj.this.p();
            }

            @Override // com.ss.android.ugc.aweme.services.draft.IDraftService.DraftSaveListener
            public final void onDraftSaveFailed(DraftSaveResult draftSaveResult) {
                cj.this.p();
            }
        }));
    }

    private static androidx.lifecycle.ad a(Fragment fragment) {
        return androidx.lifecycle.ae.a(fragment, (ad.b) null);
    }

    private void e(String str) {
        this.u.post(new em(this, str));
    }

    private static boolean d(String str) {
        String concat = "DoubleManualFinishPublish ".concat(String.valueOf(str));
        q.b(concat);
        com.ss.android.ugc.aweme.df.f.a(concat);
        q.b("BlockDoubleManualFinishPublish");
        return true;
    }

    public static com.ss.android.ugc.aweme.draft.model.c a(VideoPublishEditModel videoPublishEditModel) {
        az.a<Boolean> b2 = com.ss.android.ugc.aweme.port.in.c.f115634m.b();
        boolean z2 = true;
        if (videoPublishEditModel.isPrivate() != 1) {
            z2 = false;
        }
        b2.a(Boolean.valueOf(z2));
        new bn("VideoPublishFragment");
        com.ss.android.ugc.aweme.draft.model.c b3 = bn.b(videoPublishEditModel);
        b3.I = System.currentTimeMillis();
        return b3;
    }

    public final void b(String str) {
        if (!TextUtils.isEmpty(str)) {
            q.a(ag, "save draft scene=".concat(String.valueOf(str)));
            if (!com.ss.android.ugc.aweme.port.in.c.u.b()) {
                a(new dx(this, true, false));
            } else {
                a(true, false);
            }
        } else {
            throw new IllegalArgumentException("save draft scene can't be empty");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        cf.a(bundle);
        for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
            eVar.f2398b.onSaveInstanceState(bundle);
        }
        bundle.putSerializable("challenge", this.as.f129781a);
        bundle.putBoolean("contentModified", this.L);
        bundle.putString("publish_id", this.U);
        bundle.putString("publish_action_trace_id", this.V);
    }

    /* access modifiers changed from: package-private */
    public final void a(final i.b bVar) {
        final String str;
        com.ss.android.ugc.aweme.account.model.a e2 = com.ss.android.ugc.aweme.port.in.c.u.e();
        if (e2 != null) {
            str = e2.c();
        } else {
            str = "";
        }
        i iVar = new i();
        final Dialog a2 = iVar.a(getContext());
        if (a2 != null) {
            iVar.f129786a = new i.b() {
                /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass15 */

                static {
                    Covode.recordClassIndex(86192);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                public final void a() {
                    a2.dismiss();
                    bVar.a();
                    i.a("", str, "video_post_page", "download_with_publish", "download");
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.publish.i.b
                public final void b() {
                    a2.dismiss();
                    bVar.b();
                    i.a("", str, "video_post_page", "download_with_publish", "cancel");
                }
            };
            a2.show();
        }
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax.a
    public final void b(Boolean bool) {
        View view;
        CheckBox checkBox;
        View view2;
        CheckBox checkBox2;
        if (bool.booleanValue()) {
            if (F().booleanValue() && (checkBox2 = this.B) != null && !checkBox2.isChecked()) {
                this.ax = true;
                this.B.setChecked(true);
            }
            if (F().booleanValue() && (view2 = this.aw) != null) {
                view2.setVisibility(8);
                return;
            }
            return;
        }
        if (F().booleanValue() && this.ax && (checkBox = this.B) != null && checkBox.isChecked()) {
            this.ax = false;
            this.B.setChecked(false);
        }
        if (F().booleanValue() && (view = this.aw) != null) {
            view.setVisibility(0);
        }
    }

    public final void c(String str) {
        r.a("leave_post_page", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_post_page").a("shoot_way", this.K.mShootWay).a("creation_id", this.K.creationId).a("leave_action", str).a("is_enter_cover", this.N ? 1 : 0).a("is_enter_preview", this.M ? 1 : 0).a("is_content_modified", this.L ? 1 : 0).a("app_mem_use", a.C3430a.a("av_video_edit").getFirst()).a("availble_mem", a.C3430a.a("av_video_edit").getSecond()).a("duration", System.currentTimeMillis() - this.Q).a("publish_action_trace_id", this.V).f149193a);
    }

    private void a(View view) {
        String string;
        MethodCollector.i(12174);
        if (!F().booleanValue()) {
            MethodCollector.o(12174);
            return;
        }
        if (this.aw == null) {
            this.aw = ((ViewStub) view.findViewById(R.id.crh)).inflate();
        }
        String string2 = view.getResources().getString(R.string.esu);
        String string3 = view.getResources().getString(R.string.esv);
        if (string2.contains(string3.toLowerCase())) {
            string = string2.replace(string3.toLowerCase(), string3);
        } else {
            string = view.getResources().getString(R.string.esu, string3);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(aw.a(androidx.core.content.b.c(view.getContext(), R.color.bx)), string.length() - string3.length(), string.length(), 18);
        TextView textView = (TextView) this.aw.findViewById(R.id.cri);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(0);
        CheckBox checkBox = (CheckBox) this.aw.findViewById(R.id.acq);
        this.B = checkBox;
        checkBox.setChecked(true);
        this.B.setClickable(false);
        this.aw.setOnClickListener(new dt(this));
        MethodCollector.o(12174);
    }

    public final void b(boolean z2) {
        com.ss.android.ugc.aweme.photo.a.a value = this.f131606m.getValue();
        if (value != null) {
            aj a2 = this.r.a(value.getPermission(), com.ss.android.ugc.aweme.port.in.c.u.e().e());
            com.ss.android.ugc.aweme.shortvideo.publish.l.f129801a = null;
            if (a2 != null) {
                String obj = this.r.f128419c.getText().toString();
                if (ah) {
                    obj = obj.replaceAll("\n+", " ");
                }
                a2.a(obj);
                a2.a();
            } else {
                q.a("TitleSensitivity checkPrivacyConfirmation() checker is null");
            }
            if (z2 || !l.f115658a.a().a(requireActivity())) {
                m();
                return;
            }
            com.ss.android.ugc.aweme.shortvideo.publish.l.f129801a = com.ss.android.ugc.aweme.shortvideo.publish.m.PRIVACY_DIALOG;
            l.f115658a.a().a(requireActivity(), new dy(this));
        }
    }

    public final Bundle c(boolean z2) {
        int c2 = this.H.c();
        if (com.ss.android.ugc.aweme.shortvideo.k.a.a() && c2 == 1 && com.ss.android.ugc.aweme.publish.t.b() == 0) {
            c2 = 0;
        }
        this.K.setSaveModel(com.ss.android.ugc.aweme.port.in.g.a().o().m().a(this.K, c2, z2, com.ss.android.ugc.aweme.publish.a.a.a.a(this.I)));
        com.ss.android.ugc.aweme.tools.b.g.a(com.ss.android.ugc.aweme.shortvideo.q.a(this.K), com.ss.android.ugc.aweme.shortvideo.q.b(this.K), com.ss.android.ugc.aweme.tools.b.e.PUBLISH, com.ss.android.ugc.aweme.tools.b.e.SEND_REQUEST);
        this.K.userClickPublishTime = this.aD;
        Bundle bundle = new Bundle();
        bundle.putInt("video_type", 0);
        bundle.putSerializable("extra_video_publish_args", this.K);
        bundle.putString("shoot_way", this.K.mShootWay);
        bundle.putInt("extra_stick_point_type", this.aE);
        bundle.putBoolean("enter_record_from_other_platform", this.aF);
        bundle.putBoolean("extra_enter_from_live", this.aJ);
        bundle.putInt("publish_private_state", this.K.isPrivate());
        bundle.putInt("publish_permission", this.n.f125110b.getPermission());
        if (es.b(this.K)) {
            bundle.putBoolean("shoutouts_video_fast_publish", true);
        }
        com.ss.android.ugc.aweme.framework.a.a.a("VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle)));
        r.a("av_video_memory", new com.ss.android.ugc.tools.f.b().a("log", "VideoPublishService.createBundleParams()  bundle=".concat(String.valueOf(bundle))).f149193a);
        Publish.PublishBundle = bundle;
        return bundle;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        q.a("PublishDurationMonitor VideoPublishFragment onActivityCreated");
        if (bundle == null) {
            cd cdVar = new cd(this.K.videoWidth(), this.K.videoHeight(), com.ss.android.ugc.aweme.property.b.c(), com.ss.android.ugc.aweme.property.eh.a());
            o.a("aweme_video_record_info", new com.ss.android.ugc.aweme.app.f.c().a("resolution", cdVar.f125104a + "*" + cdVar.f125105b).a("bitrate", Long.valueOf(new BigDecimal((double) cdVar.f125106c).longValue())).a("frame_rate", Long.valueOf(new BigDecimal((double) cdVar.f125107d).longValue())).a("is_hardcode", Boolean.valueOf(cdVar.f125108e)).a());
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h.z a(aj ajVar) {
        ac acVar;
        com.ss.android.ugc.aweme.shortvideo.cj postPrompts;
        String goBack;
        com.ss.android.ugc.aweme.shortvideo.cj postPrompts2;
        String text;
        com.ss.android.ugc.aweme.shortvideo.cj postPrompts3;
        String postAnyway;
        String str;
        String str2;
        String str3;
        String str4;
        String dialogTitle;
        com.ss.android.ugc.aweme.shortvideo.cj postPrompts4;
        if (ajVar.f129721a == null || !ajVar.f129721a.booleanValue()) {
            n();
        } else {
            r.a("tns_video_push_words_sh", new com.ss.android.ugc.tools.f.b().a("creation_id", this.K.creationId).a("user_id", com.ss.android.ugc.aweme.port.in.c.u.e().c()).f149193a);
            androidx.fragment.app.e activity = getActivity();
            ep epVar = new ep(this);
            eq eqVar = new eq(this);
            h.f.b.l.d(ajVar, "");
            h.f.b.l.d(epVar, "");
            h.f.b.l.d(eqVar, "");
            if (!(activity == null || com.ss.android.ugc.aweme.shortvideo.publish.l.f129801a == com.ss.android.ugc.aweme.shortvideo.publish.m.PRIVACY_DIALOG || com.ss.android.ugc.aweme.shortvideo.publish.l.f129801a == com.ss.android.ugc.aweme.shortvideo.publish.m.POST_FREQUENCY_LIMIT_DIALOG || (!h.f.b.l.a((Object) ajVar.f129721a, (Object) true)) || (acVar = ajVar.f129722b) == null || acVar.getPostPrompts() == null || (postPrompts = acVar.getPostPrompts()) == null || (goBack = postPrompts.getGoBack()) == null || goBack.length() == 0 || (postPrompts2 = acVar.getPostPrompts()) == null || (text = postPrompts2.getText()) == null || text.length() == 0 || (postPrompts3 = acVar.getPostPrompts()) == null || (postAnyway = postPrompts3.getPostAnyway()) == null || postAnyway.length() == 0 || com.ss.android.ugc.aweme.port.in.c.u.a())) {
                a.C0731a aVar = new a.C0731a(activity);
                ac acVar2 = ajVar.f129722b;
                if (acVar2 != null) {
                    com.ss.android.ugc.aweme.shortvideo.cj postPrompts5 = acVar2.getPostPrompts();
                    if (postPrompts5 != null) {
                        str = postPrompts5.getText();
                    } else {
                        str = null;
                    }
                    aVar.f33402b = str;
                    com.ss.android.ugc.aweme.shortvideo.cj postPrompts6 = acVar2.getPostPrompts();
                    if (postPrompts6 == null || (dialogTitle = postPrompts6.getDialogTitle()) == null || dialogTitle.length() == 0 || (postPrompts4 = acVar2.getPostPrompts()) == null) {
                        str2 = null;
                    } else {
                        str2 = postPrompts4.getDialogTitle();
                    }
                    aVar.f33401a = str2;
                    com.ss.android.ugc.aweme.shortvideo.cj postPrompts7 = acVar2.getPostPrompts();
                    if (postPrompts7 != null) {
                        str3 = postPrompts7.getPostAnyway();
                    } else {
                        str3 = null;
                    }
                    a.C0731a a2 = aVar.a(str3, (DialogInterface.OnClickListener) new l.a(aVar, epVar, eqVar), false);
                    com.ss.android.ugc.aweme.shortvideo.cj postPrompts8 = acVar2.getPostPrompts();
                    if (postPrompts8 != null) {
                        str4 = postPrompts8.getGoBack();
                    } else {
                        str4 = null;
                    }
                    a2.b(str4, (DialogInterface.OnClickListener) new l.b(aVar, epVar, eqVar), false);
                }
                Dialog c2 = aVar.a().c();
                c2.setCancelable(true);
                c2.setCanceledOnTouchOutside(false);
                com.ss.android.ugc.aweme.shortvideo.publish.l.f129801a = com.ss.android.ugc.aweme.shortvideo.publish.m.SENSITIVE_TITLE_DIALOG;
            }
        }
        return null;
    }

    public final void d(boolean z2) {
        com.bytedance.services.apm.api.a.a(getContext(), "VideoPublishFragment#getContext is null");
        com.bytedance.services.apm.api.a.a(getActivity(), "VideoPublishFragment#getActivity is null");
        if (this.aJ) {
            if (getActivity() != null) {
                getActivity().setResult(9, new Intent());
                q.a("SaveDraft to Live");
                getActivity().finish();
            }
        } else if (this.aF || this.aG) {
            if (this.aG) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.c());
            }
            q.a("SaveDraft to OtherPlatform");
            if (z2) {
                com.ss.android.ugc.aweme.port.in.g.a().c().a(true);
            }
            J();
        } else {
            Intent intent = new Intent();
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", true);
            if (this.aH != null && !this.K.mIsFromDraft) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_SHOW_OPEN_SHARE_DIALOG", this.aH);
            }
            boolean g2 = com.ss.android.ugc.aweme.port.in.c.f115624c.g();
            q.a("SaveDraft publishContainerActivityClassAlive:".concat(String.valueOf(g2)));
            if (!g2) {
                intent.putExtra("enable_optimize_main_not_in_stack", true);
            }
            if (this.K.mIsFromDraft) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.c());
                q.a("SaveDraft to DraftBox");
                if (z2) {
                    com.ss.android.ugc.aweme.port.in.g.a().c().a(true);
                }
                J();
            } else {
                Context context = getContext();
                if (context != null) {
                    com.ss.android.ugc.aweme.port.in.g.a().o().i().a(context, "handle_save_draft_finish");
                }
                if (getActivity() != null || !com.ss.android.ugc.aweme.settings.j.a()) {
                    intent.addFlags(335544320);
                    intent.setClass(requireActivity(), com.ss.android.ugc.aweme.port.in.c.f115624c.e());
                    q.a("SaveDraft to Main");
                    startActivity(intent);
                } else {
                    return;
                }
            }
            requireActivity().overridePendingTransition(0, R.anim.x);
        }
    }

    public final void a(final a aVar) {
        if (getActivity().getIntent().getBooleanExtra("is_from_sys_share", false)) {
            r.a("login_notify", new com.ss.android.ugc.tools.f.b().a("enter_from", "video_edit_page").f149193a);
        }
        com.ss.android.ugc.aweme.port.in.g.a().o().i().a(requireContext(), "jump_to_login_page");
        com.ss.android.ugc.aweme.port.in.c.u.a(this, "video_edit_page", "click_shoot", new z.a() {
            /* class com.ss.android.ugc.aweme.shortvideo.ui.cj.AnonymousClass4 */

            static {
                Covode.recordClassIndex(86196);
            }

            @Override // com.ss.android.ugc.aweme.port.in.z.a
            public final void b() {
            }

            @Override // com.ss.android.ugc.aweme.port.in.z.a
            public final void a() {
                com.ss.android.ugc.aweme.account.model.a e2;
                if (cj.this.I != null) {
                    n nVar = cj.this.I;
                    if (com.ss.android.ugc.aweme.shortvideo.publish.t.a() && (e2 = com.ss.android.ugc.aweme.port.in.c.u.e()) != null) {
                        if (!e2.k()) {
                            nVar.f129814e = false;
                        } else if (!nVar.f129815f) {
                            nVar.f129814e = e2.j();
                        } else if (nVar.f129814e && !e2.j()) {
                            nVar.f129814e = false;
                            new com.bytedance.tux.g.b(nVar.s).e(R.string.bc9).b();
                        }
                    }
                }
                if (aVar == null) {
                    return;
                }
                if (com.ss.android.ugc.aweme.port.in.g.a().A().a()) {
                    com.ss.android.ugc.aweme.shortvideo.f.a.a();
                } else {
                    aVar.a();
                }
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.port.in.ax.a
    public final void a(Boolean bool) {
        Resources resources;
        String string;
        if (!bool.booleanValue()) {
            Context context = getContext();
            HashTagMentionEditText hashTagMentionEditText = this.y;
            ay.a(context, hashTagMentionEditText, false);
            if (hashTagMentionEditText != null) {
                hashTagMentionEditText.removeStarAtlas();
            }
        } else {
            ay.a(getContext(), this.y);
        }
        if (this.aL) {
            n nVar = this.I;
            boolean booleanValue = bool.booleanValue();
            ax axVar = nVar.f129816g;
            if (axVar != null) {
                axVar.a(booleanValue);
            }
            String str = "";
            if (booleanValue) {
                Context context2 = nVar.s.getContext();
                if (!(context2 == null || (resources = context2.getResources()) == null || (string = resources.getString(R.string.g3d)) == null)) {
                    str = string;
                }
                nVar.q = str;
                CommonItemView commonItemView = nVar.f129822m;
                if (commonItemView != null) {
                    commonItemView.setRightText(nVar.q);
                }
                Keva.getRepo("sponsored_video_keva").storeBoolean("sponsored", true);
                CommonItemView commonItemView2 = nVar.f129822m;
                if (commonItemView2 != null) {
                    commonItemView2.c();
                    return;
                }
                return;
            }
            nVar.q = str;
            CommonItemView commonItemView3 = nVar.f129822m;
            if (commonItemView3 != null) {
                commonItemView3.setRightText(nVar.q);
            }
        }
    }

    private static void a(ImageView imageView, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 21) {
            getActivity().getWindow().setSharedElementReenterTransition(new AutoTransition());
            getActivity().getWindow().setSharedElementExitTransition(new AutoTransition());
        }
        com.ss.android.ugc.aweme.port.in.l.f115658a.z().f();
        this.aQ = new com.bytedance.als.l<>(true);
        this.ad = new com.ss.android.ugc.aweme.shortvideo.g.c(this.aQ);
        this.an = (CommentSettingItemStatus) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(CommentSettingItemStatus.class);
        this.f131596c = (DuetSettingItemStatus) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(DuetSettingItemStatus.class);
        this.f131597d = (StitchSettingItemStatus) androidx.lifecycle.ae.a(getActivity(), (ad.b) null).a(StitchSettingItemStatus.class);
        ba.a(view);
        Bundle arguments = getArguments();
        this.aI = arguments.getInt("music_rec_type", -1);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) arguments.getSerializable("args");
        this.K = videoPublishEditModel;
        videoPublishEditModel.uploadSpeedInfo = com.ss.android.ugc.aweme.port.in.g.a().o().g().b();
        this.ab = dv.f126643b;
        this.aN = dv.f126644c;
        if (cr.a().f125302h.booleanValue()) {
            this.K.commerceData = com.ss.android.ugc.aweme.port.in.c.f115633l.a(this.K.commerceData, cr.a().f125301g.booleanValue());
        }
        VideoPublishEditModel videoPublishEditModel2 = this.K;
        if (videoPublishEditModel2 == null || videoPublishEditModel2.isPreviewInfoValid()) {
            this.aE = arguments.getInt("extra_stick_point_type", 0);
            this.aF = arguments.getBoolean("enter_record_from_other_platform", false);
            this.aJ = arguments.getBoolean("extra_enter_from_live", false);
            this.aG = arguments.getBoolean("edit_publish_session_end_together", false);
            q.d("VideoPublishFragment filter_id_list:" + this.K.mCurFilterIds + " prop_list:" + this.K.mStickerID + " effect_list:" + this.K.getEditEffectList() + " info_sticker_list:" + this.K.getInfoStickerList());
            com.ss.android.ugc.aweme.port.in.g.a().u();
            this.X = com.ss.android.ugc.aweme.shortvideo.v.g.a(getContext());
            this.aK = SettingsManager.a().a("enable_high_quality_video", false);
            this.aL = com.ss.android.ugc.aweme.port.in.l.f115658a.z().b().booleanValue();
            this.ay = (ViewStub) view.findViewById(R.id.s1);
            a(view, bundle);
            ck ckVar = new ck(this);
            if (!this.K.mIsFromDraft) {
                ckVar.invoke();
            } else {
                com.ss.android.ugc.aweme.tools.draft.az.a(this.K, getActivity(), ckVar);
            }
            eu.b(getActivity());
            bf bfVar = this.au;
            bfVar.n = com.ss.android.ugc.aweme.shortvideo.publish.b.a(this.K);
            Context context = getContext();
            if (context instanceof androidx.fragment.app.e) {
                androidx.fragment.app.e eVar = (androidx.fragment.app.e) context;
                bfVar.p = (HashTagMobHelper) androidx.lifecycle.ae.a(eVar, (ad.b) null).a(HashTagMobHelper.class);
                bfVar.p.f128459a = bfVar.q;
                bfVar.p.f128464f = bfVar.f125030m;
                bfVar.o = BaseTitleHelper.a.a(eVar);
                bfVar.o.f143427a = new bh(bfVar);
                bfVar.p.f128463e = bfVar.o;
            }
            if (bfVar.f125021d != null) {
                bfVar.f125029l = new com.ss.android.ugc.aweme.video.hashtag.c(context, bfVar.f125030m, bfVar);
                bfVar.f125021d.setLayoutManager(new LinearLayoutManager());
                bfVar.f125021d.setAdapter(bfVar.f125029l);
            }
            if (bfVar.f125022e != null) {
                com.bytedance.ies.dmt.ui.widget.e eVar2 = new com.bytedance.ies.dmt.ui.widget.e(context);
                eVar2.setStatus(new d.a(context).c(R.string.de2).f33648a);
                eVar2.setOnClickListener(new bg(bfVar));
                DmtStatusView dmtStatusView = bfVar.f125022e;
                DmtStatusView.a a2 = DmtStatusView.a.a(context);
                dmtStatusView.setBuilder(a2.a(new d.a(a2.f33599a).a("  ").b("  ").f33648a).c(eVar2));
            }
            bfVar.f125027j = com.ss.android.ugc.aweme.port.in.c.f115625d.a((ak.a<AVChallenge>) bfVar);
            bfVar.f125026i = com.ss.android.ugc.aweme.port.in.c.f115625d.a((ak.e) bfVar);
            bfVar.f125023f.a();
            HashTagMentionEditText hashTagMentionEditText = bfVar.f125023f.f128419c;
            hashTagMentionEditText.addTextChangedListener(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0273: INVOKE  
                  (r1v16 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                  (wrap: com.ss.android.ugc.aweme.shortvideo.bf$1 : 0x0270: CONSTRUCTOR  (r0v79 com.ss.android.ugc.aweme.shortvideo.bf$1) = 
                  (r5v1 'bfVar' com.ss.android.ugc.aweme.shortvideo.bf)
                  (r1v16 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                 call: com.ss.android.ugc.aweme.shortvideo.bf.1.<init>(com.ss.android.ugc.aweme.shortvideo.bf, com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText):void type: CONSTRUCTOR)
                 type: VIRTUAL call: com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText.addTextChangedListener(android.text.TextWatcher):void in method: com.ss.android.ugc.aweme.shortvideo.ui.cj.onViewCreated(android.view.View, android.os.Bundle):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0270: CONSTRUCTOR  (r0v79 com.ss.android.ugc.aweme.shortvideo.bf$1) = 
                  (r5v1 'bfVar' com.ss.android.ugc.aweme.shortvideo.bf)
                  (r1v16 'hashTagMentionEditText' com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText)
                 call: com.ss.android.ugc.aweme.shortvideo.bf.1.<init>(com.ss.android.ugc.aweme.shortvideo.bf, com.ss.android.ugc.aweme.shortvideo.view.HashTagMentionEditText):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.shortvideo.ui.cj.onViewCreated(android.view.View, android.os.Bundle):void, file: classes.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.shortvideo.bf, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                */
            /*
            // Method dump skipped, instructions count: 834
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.cj.onViewCreated(android.view.View, android.os.Bundle):void");
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View a2 = com.a.a(layoutInflater, R.layout.a1t, viewGroup, false);
            ar.f132216a.a(getActivity(), (ViewGroup) a2.findViewById(R.id.aik));
            return a2;
        }

        @Override // androidx.fragment.app.Fragment
        public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
            super.onRequestPermissionsResult(i2, strArr, iArr);
            for (e<Class<?>, IAVPublishExtension<?>> eVar : this.S) {
                eVar.f2398b.onRequestPermissionsResult(i2, strArr, iArr);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e6, code lost:
            if (r10 != null) goto L_0x002e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
        @Override // androidx.fragment.app.Fragment
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onActivityResult(int r8, int r9, android.content.Intent r10) {
            /*
            // Method dump skipped, instructions count: 251
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.cj.onActivityResult(int, int, android.content.Intent):void");
        }
    }
