package com.ss.android.ugc.aweme.compliance.privacy.settings.video;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.a.g;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.ad.comment.AdCommentService;
import com.ss.android.ugc.aweme.al.d;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.dc.h;
import com.ss.android.ugc.aweme.dm;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.ss.android.ugc.aweme.services.function.IFunctionKey;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import com.ss.android.ugc.aweme.setting.serverpush.b.b;
import com.ss.android.ugc.aweme.setting.serverpush.b.c;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.ce;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends Fragment implements com.bytedance.tux.navigation.a, b, c {
    static final String s = (AVApiImpl.b().a() + "/aweme/v1/aweme/react_duet/set/limit/");
    private static final String x = (AVApiImpl.b().a() + "/tiktok/v1/caption/cla/");

    /* renamed from: a  reason: collision with root package name */
    public IPrivacyConfig.IPermissionSettingItem f77826a;

    /* renamed from: b  reason: collision with root package name */
    IPrivacyConfig.IPermissionModule f77827b;

    /* renamed from: c  reason: collision with root package name */
    public Aweme f77828c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.common.c f77829d;

    /* renamed from: e  reason: collision with root package name */
    boolean f77830e = true;

    /* renamed from: f  reason: collision with root package name */
    boolean f77831f = true;

    /* renamed from: g  reason: collision with root package name */
    boolean f77832g = true;

    /* renamed from: h  reason: collision with root package name */
    boolean f77833h;

    /* renamed from: i  reason: collision with root package name */
    h f77834i;

    /* renamed from: j  reason: collision with root package name */
    h f77835j;

    /* renamed from: k  reason: collision with root package name */
    h f77836k;

    /* renamed from: l  reason: collision with root package name */
    h f77837l;

    /* renamed from: m  reason: collision with root package name */
    h f77838m;
    String n = "";
    String o = "";
    String p = "";
    boolean q;
    boolean r;
    private TextView t;
    private f u;
    private com.ss.android.ugc.aweme.common.c v;
    private dm w;

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(Exception exc) {
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void av_() {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z j() {
        d();
        return z.f158842a;
    }

    private static boolean k() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean i() {
        com.ss.android.ugc.aweme.setting.serverpush.a.f fVar = this.u;
        if (fVar == null || fVar.v != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        AdCommentService.b().a();
    }

    public static boolean e() {
        if (j.f107229h && j.b() && !j.c()) {
            return j.f107229h;
        }
        boolean k2 = k();
        j.f107229h = k2;
        return k2;
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.b
    public final void cf_() {
        this.f77830e = !this.f77830e;
        this.f77834i.a(new am(this));
    }

    /* access modifiers changed from: package-private */
    public final boolean h() {
        Aweme aweme = this.f77828c;
        if (aweme == null || aweme.getCommerceVideoAuthInfo() == null || !this.f77828c.getCommerceVideoAuthInfo().isAdvPromotable()) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.d.a.c.a(new d(false, true));
        this.f77829d.cd_();
    }

    static {
        Covode.recordClassIndex(48232);
    }

    public final boolean c() {
        Aweme aweme = this.f77828c;
        if (aweme == null || aweme.getInteractStickerStructs() == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : this.f77828c.getInteractStickerStructs()) {
            if (interactStickerStruct.getQaStruct() != null && TextUtils.equals(Long.toString(interactStickerStruct.getQaStruct().getItemId()), this.f77828c.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        String str;
        getContext();
        if (!e()) {
            c(R.string.de7);
            return;
        }
        if (f(this.f77828c) == 0) {
            if (this.f77831f) {
                this.f77831f = false;
            } else {
                this.f77831f = true;
            }
            this.f77835j.a(new e(this));
            com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
            if (this.f77831f) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("disable_video_duet", dVar.a("to_status", str).f66730a);
        }
        i.b(new j(this), i.f4824a).a(new k(this), i.f4826c, null);
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        getContext();
        if (!e()) {
            c(R.string.de7);
            return;
        }
        this.f77833h = !this.f77833h;
        this.f77837l.a(new g(this));
        String aid = this.f77828c.getAid();
        boolean z = this.f77833h;
        Object a2 = RetrofitFactory.a().b(Api.f66569d).d().a(ToggleAutoCaptionApi.class);
        l.b(a2, "");
        ((ToggleAutoCaptionApi) a2).toggleAutoCaptionSetting(aid, z).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new h(this, z), new i(this, z));
    }

    @Override // com.bytedance.tux.navigation.a
    public final TuxNavBar.a a() {
        return new TuxNavBar.a().b(new com.bytedance.tux.navigation.a.b().a(R.raw.icon_x_mark_small).a((com.bytedance.tux.navigation.a.d) new b(this))).a(new g().a(getString(R.string.eul)));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g() {
        /*
        // Method dump skipped, instructions count: 195
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.privacy.settings.video.a.g():void");
    }

    static int c(Aweme aweme) {
        InteractPermission interactPermission = aweme.getInteractPermission();
        if (interactPermission == null) {
            return 0;
        }
        return interactPermission.getStitchPrivacySettingControl();
    }

    private static int f(Aweme aweme) {
        InteractPermission interactPermission = aweme.getInteractPermission();
        if (interactPermission == null) {
            return 0;
        }
        return interactPermission.getDuetPrivacySettingControl();
    }

    public static boolean a(Aweme aweme) {
        if (aweme.getCommerceVideoAuthInfo() == null) {
            return false;
        }
        return aweme.getCommerceVideoAuthInfo().isPreventSelfSee();
    }

    public static String b(Aweme aweme) {
        if (aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getPreventPrivacyReason() == null) {
            return "";
        }
        return aweme.getCommerceVideoAuthInfo().getPreventPrivacyReason();
    }

    private void c(String str) {
        Fragment fragment;
        if (getParentFragment() instanceof com.bytedance.tux.sheet.sheet.a) {
            fragment = getParentFragment();
        } else {
            fragment = this;
        }
        new com.bytedance.tux.g.b(fragment).a(str).b();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.ss.android.ugc.d.a.c.a(new d(true, true));
        com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<BaseResponse>, b> t2 = SettingServiceImpl.v().t();
        this.f77829d = t2;
        t2.a_(this);
    }

    private void b(String str) {
        if (this.f77833h) {
            f();
        }
        this.f77833h = false;
        this.f77837l.a(ah.f77851a);
        this.f77837l.a(new ai(this, str));
    }

    private static boolean d(Aweme aweme) {
        List<InteractStickerStruct> interactStickerStructs;
        if (!(aweme == null || (interactStickerStructs = aweme.getInteractStickerStructs()) == null || interactStickerStructs.isEmpty())) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 16) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean e(Aweme aweme) {
        if (!(aweme == null || aweme.getInteractStickerStructs() == null || aweme.getInteractStickerStructs().size() <= 0)) {
            for (InteractStickerStruct interactStickerStruct : aweme.getInteractStickerStructs()) {
                if (!(interactStickerStruct.getCaptionStruct() == null || com.bytedance.common.utility.collection.b.a((Collection) interactStickerStruct.getCaptionStruct().getAutoCaptions()))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void c(int i2) {
        Fragment fragment;
        if (getParentFragment() instanceof com.bytedance.tux.sheet.sheet.a) {
            fragment = getParentFragment();
        } else {
            fragment = this;
        }
        new com.bytedance.tux.g.b(fragment).e(i2).b();
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            this.t.setVisibility(8);
            return;
        }
        if (this.t.getVisibility() != 0) {
            this.t.setVisibility(0);
        }
        this.t.setText(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void b(i iVar) {
        String str;
        int i2 = 1;
        if (iVar.c()) {
            if (iVar.e() instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) iVar.e();
                if (aVar.getErrorCode() == 3004044) {
                    c(aVar.getErrorMsg());
                    return null;
                }
            }
            c(R.string.de7);
            this.f77831f = !this.f77831f;
            this.f77835j.a(new av(this));
        } else {
            if (!(this.f77828c.getDuetSetting() == 0 || this.f77828c.getReactSetting() == 0)) {
                i2 = 0;
            }
            this.f77828c.setDuetSetting(i2);
            this.f77828c.setReactSetting(i2);
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.shortvideo.j.b(this.f77828c));
            com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", this.f77828c.getAid()).a("enter_from", "personal_homepage");
            if (this.f77828c.getDuetSetting() == 0 || this.f77828c.getReactSetting() == 0) {
                str = "on";
            } else {
                str = "off";
            }
            r.a("click_react_duet_control", a2.a("to_status", str).f66730a);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Void a(i iVar) {
        int i2 = 1;
        if (iVar.c()) {
            if (iVar.e() instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) iVar.e();
                if (aVar.getErrorCode() == 3004045) {
                    c(aVar.getErrorMsg());
                    return null;
                }
            }
            c(R.string.de7);
            this.f77832g = !this.f77832g;
            this.f77836k.a(new at(this));
        } else {
            if (this.f77828c.getStitchSetting() != 0) {
                i2 = 0;
            }
            this.f77828c.setStitchSetting(i2);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        String str;
        String aid;
        boolean isSecret = com.ss.android.ugc.aweme.account.b.g().getCurUser().isSecret();
        if (i2 != 0) {
            if (i2 == 1) {
                str = "private";
            } else if (i2 != 2) {
                str = "";
            } else {
                str = "friend";
            }
        } else if (isSecret) {
            str = "followers";
        } else {
            str = "public";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("to_status", str);
            }
            if (this.f77828c.getAwemeType() == 2) {
                jSONObject.put("is_photo", 1);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        MobClick labelName = MobClick.obtain().setEventName("scope_control").setLabelName("share_option");
        Aweme aweme = this.f77828c;
        if (aweme == null) {
            aid = "0";
        } else {
            aid = aweme.getAid();
        }
        r.onEvent(labelName.setValue(aid).setJsonObject(jSONObject));
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("group_id", this.f77828c.getAid()).a("enter_from", this.o).a("impr_id", this.p);
        if (TextUtils.equals(str, "friend")) {
            str = str + "s";
        }
        a2.a("to_status", str);
        if (TextUtils.equals(this.o, "personal_homepage")) {
            a2.a("tab_name", this.n);
        }
        a2.a("is_private", isSecret ? 1 : 0);
        r.a("select_privacy_setting_video", a2.f66730a);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        boolean z;
        if (getContext() != null) {
            if (i2 != 0) {
                b(getContext().getResources().getString(R.string.b2i));
                return;
            }
            Aweme aweme = this.f77828c;
            if (aweme == null || aweme.getVideo() == null || this.f77828c.getVideo().getCaptionModel() == null || this.f77828c.getVideo().getCaptionModel().getEnableAutoCaption() != 0) {
                Aweme aweme2 = this.f77828c;
                if (aweme2 == null || aweme2.getVideo() == null || this.f77828c.getVideo().getCaptionModel() == null || this.f77828c.getVideo().getCaptionModel().getHasOriginalAudio() <= 0 || this.f77828c.getVideo().getCaptionModel().getEnableAutoCaption() == 0) {
                    b(getContext().getResources().getString(R.string.b2h));
                    return;
                }
                if (this.f77828c.getVideo().getCaptionModel().getEnableAutoCaption() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f77833h = z;
                this.f77837l.a(new af(this));
                this.f77837l.a(new ag(this));
                return;
            }
            b(getContext().getResources().getString(R.string.b2g));
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
    public final void a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
        this.u = fVar;
        g();
        if (this.f77828c.getAwemeType() != 40 && this.f77838m != null && !i()) {
            this.f77838m.a(an.f77858a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo;
        int missionItemStatus;
        com.ss.android.ugc.aweme.commerce.a commerceVideoAuthInfo2;
        boolean z;
        boolean z2;
        MethodCollector.i(5314);
        super.onViewCreated(view, bundle);
        this.w = new dm((PowerList) view.findViewById(R.id.d7z));
        boolean z3 = true;
        this.f77834i = new h(new com.ss.android.ugc.aweme.be.h(getString(R.string.st), new c(this), true, new n(this)));
        this.f77835j = new h(new com.ss.android.ugc.aweme.be.h(getString(R.string.t0), new y(this), true, new aj(this)));
        this.f77836k = new h(new com.ss.android.ugc.aweme.be.h(getString(R.string.t3), new au(this), false, new ay(this)));
        this.f77837l = new h(new com.ss.android.ugc.aweme.be.h(getString(R.string.b2j), (View.OnClickListener) null));
        this.f77838m = new h(new com.ss.android.ugc.aweme.be.h(getString(R.string.sx), (View.OnClickListener) new az(this)));
        this.w.a(this.f77834i);
        Aweme aweme = this.f77828c;
        if (!(aweme == null || aweme.getAwemeType() == 40)) {
            this.w.a(this.f77835j);
            this.w.a(this.f77836k);
            this.w.a(this.f77837l);
            this.w.a(this.f77838m);
        }
        FrameLayout frameLayout = (FrameLayout) getView().findViewById(R.id.cs9);
        Aweme aweme2 = this.f77828c;
        if (aweme2 == null || aweme2.getAwemeType() != 40) {
            IPrivacyConfig.IPermissionSettingItem createPermissionSettingItem = AVExternalServiceImpl.a().configService().privacyConfig().createPermissionSettingItem(getContext());
            this.f77826a = createPermissionSettingItem;
            createPermissionSettingItem.setAdvPromotable(h());
            IPrivacyConfig.IPermissionSettingItem iPermissionSettingItem = this.f77826a;
            Aweme aweme3 = this.f77828c;
            if (aweme3 == null || (commerceVideoAuthInfo = aweme3.getCommerceVideoAuthInfo()) == null) {
                missionItemStatus = 0;
            } else {
                missionItemStatus = commerceVideoAuthInfo.getMissionItemStatus();
            }
            Aweme aweme4 = this.f77828c;
            String str = "0";
            if (!(aweme4 == null || (commerceVideoAuthInfo2 = aweme4.getCommerceVideoAuthInfo()) == null)) {
                str = String.valueOf(commerceVideoAuthInfo2.getMissionId());
            }
            iPermissionSettingItem.setMission(missionItemStatus, str);
            this.f77826a.asView().setId(R.id.cs8);
            this.f77826a.asView().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f77826a.asView());
            this.f77826a.getPrivateIcon().setVisibility(8);
            TextView privateHint = this.f77826a.getPrivateHint();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            privateHint.setLayoutParams(layoutParams);
            if (com.ss.android.ugc.aweme.utils.z.b(this.f77828c)) {
                this.f77826a.setPermission(0, a(this.f77828c), b(this.f77828c));
            } else if (com.ss.android.ugc.aweme.utils.z.c(this.f77828c)) {
                this.f77826a.setPermission(2, a(this.f77828c), b(this.f77828c));
            } else if (com.ss.android.ugc.aweme.utils.z.d(this.f77828c)) {
                this.f77826a.setPermission(1, a(this.f77828c), b(this.f77828c));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        Aweme aweme5 = this.f77828c;
        if (!(aweme5 == null || aweme5.getAwemeType() == 40 || com.bytedance.common.utility.collection.b.a((Collection) this.f77828c.getGeofencingRegions()))) {
            IPrivacyConfig.IPermissionSettingItem iPermissionSettingItem2 = this.f77826a;
            if (iPermissionSettingItem2 != null) {
                View asView = iPermissionSettingItem2.asView();
                this.f77826a.setPermission(0, a(this.f77828c), b(this.f77828c));
                asView.setAlpha(0.4f);
                asView.setEnabled(false);
            }
            h hVar = this.f77835j;
            if (hVar != null) {
                hVar.a(u.f77898a);
            }
            h hVar2 = this.f77836k;
            if (hVar2 != null) {
                hVar2.a(v.f77899a);
            }
            h hVar3 = this.f77837l;
            if (hVar3 != null) {
                hVar3.a(w.f77900a);
            }
            AVExternalServiceImpl.a().configService().geoFencingConfig().injectGeoFencingSettingItem(this.f77828c, (FrameLayout) getView().findViewById(R.id.cs7), this);
        }
        this.t = (TextView) getView().findViewById(R.id.epb);
        Aweme aweme6 = this.f77828c;
        if (aweme6 == null || aweme6.getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71513a) {
            z = true;
        } else {
            z = false;
        }
        this.f77830e = z;
        this.f77834i.a(new ak(this));
        if (this.f77828c != null) {
            AdCommentService.b().a(this.f77828c.getAid(), new aa(this));
        }
        com.ss.android.ugc.aweme.common.c<com.ss.android.ugc.aweme.common.b<com.ss.android.ugc.aweme.setting.serverpush.a.f>, c> u2 = SettingServiceImpl.v().u();
        this.v = u2;
        u2.a_(this);
        this.v.a(new Object[0]);
        Aweme aweme7 = this.f77828c;
        if (aweme7 == null || aweme7.getAwemeType() != 40) {
            IAVSettingsService avsettingsConfig = AVExternalServiceImpl.a().configService().avsettingsConfig();
            boolean enableStitch = avsettingsConfig.enableStitch();
            this.q = enableStitch;
            if (enableStitch) {
                this.f77836k.a(x.f77901a);
            }
            if (e(this.f77828c) || !CrossLanguageUserExperiment.c().a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            this.r = z2;
            this.f77837l.a(new z(this));
            avsettingsConfig.enableStitch();
            this.f77835j.a(new ab(getString(R.string.sz)));
            Aweme aweme8 = this.f77828c;
            if (aweme8 != null) {
                if (aweme8.getDuetSetting() == 0 || this.f77828c.getReactSetting() == 0) {
                    this.f77831f = true;
                } else {
                    this.f77831f = false;
                }
                this.f77835j.a(new ac(this));
                if (FunctionSupportService.INSTANCE.notSupport(IFunctionKey.DUET)) {
                    this.f77835j.a(ad.f77847a);
                }
            }
            Aweme aweme9 = this.f77828c;
            if (aweme9 != null) {
                if (aweme9.getStitchSetting() != 0) {
                    z3 = false;
                }
                this.f77832g = z3;
                this.f77836k.a(new ae(this));
            }
            a(this.f77828c.getStatus().getPrivateStatus());
            IAVSettingsService avsettingsConfig2 = AVExternalServiceImpl.a().configService().avsettingsConfig();
            if (avsettingsConfig2.getPostDownloadSetting() && avsettingsConfig2.getEnablePublishPrivacySetting() == 2) {
                this.f77838m.a(new al(this));
            }
        }
        a(this.f77834i, UGCMonitor.EVENT_COMMENT, 0);
        Aweme aweme10 = this.f77828c;
        if (!(aweme10 == null || aweme10.getAwemeType() == 40)) {
            a(this.f77835j, "duet", f(this.f77828c));
            a(this.f77836k, "stitch", c(this.f77828c));
            a(this.f77838m, "download", 0);
        }
        Aweme aweme11 = this.f77828c;
        if (!(aweme11 == null || aweme11.getAwemeType() == 40)) {
            IPrivacyConfig.IPermissionModule createPermissionModule = AVExternalServiceImpl.a().configService().privacyConfig().createPermissionModule(getParentFragment(), this.f77826a, 0, d(this.f77828c));
            this.f77827b = createPermissionModule;
            createPermissionModule.setupV2(new ce() {
                /* class com.ss.android.ugc.aweme.compliance.privacy.settings.video.a.AnonymousClass1 */

                /* renamed from: b  reason: collision with root package name */
                private final boolean f77840b;

                static {
                    Covode.recordClassIndex(48233);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.ce
                public final String d() {
                    if (this.f77840b) {
                        return a.this.getResources().getString(R.string.f5e);
                    }
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.ce
                public final String e() {
                    if (this.f77840b) {
                        return a.this.getResources().getString(R.string.f5p);
                    }
                    return "";
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.ce
                public final String c() {
                    if (a.this.f77828c == null || a.this.f77828c.playlist_info == null) {
                        return "";
                    }
                    String mixName = a.this.f77828c.playlist_info.getMixName();
                    if (TextUtils.isEmpty(mixName)) {
                        return "";
                    }
                    if (this.f77840b) {
                        return a.this.getResources().getString(R.string.f5h, mixName);
                    }
                    return com.a.a(a.this.getString(R.string.die), new Object[]{mixName});
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.ce
                public final String a() {
                    if (!(a.this.f77828c == null || a.this.f77828c.playlist_info == null)) {
                        String mixId = a.this.f77828c.playlist_info.getMixId();
                        String mixName = a.this.f77828c.playlist_info.getMixName();
                        if (!TextUtils.isEmpty(mixId) && !TextUtils.isEmpty(mixName)) {
                            if (this.f77840b) {
                                return a.this.getResources().getString(R.string.f5g, mixName);
                            }
                            return a.this.getResources().getString(R.string.byi) + com.a.a(a.this.getResources().getString(R.string.die), new Object[]{mixName});
                        }
                    }
                    if (this.f77840b) {
                        return a.this.getResources().getString(R.string.f5f);
                    }
                    return a.this.getResources().getString(R.string.byi);
                }

                @Override // com.ss.android.ugc.aweme.shortvideo.ce
                public final String b() {
                    if (!(a.this.f77828c == null || a.this.f77828c.playlist_info == null)) {
                        String mixId = a.this.f77828c.playlist_info.getMixId();
                        String mixName = a.this.f77828c.playlist_info.getMixName();
                        if (!TextUtils.isEmpty(mixId) && !TextUtils.isEmpty(mixName)) {
                            if (this.f77840b) {
                                return a.this.getResources().getString(R.string.f5g, mixName);
                            }
                            return a.this.getResources().getString(R.string.byh) + com.a.a(a.this.getResources().getString(R.string.die), new Object[]{mixName});
                        }
                    }
                    if (this.f77840b) {
                        return a.this.getResources().getString(R.string.f5f);
                    }
                    return a.this.getResources().getString(R.string.byh);
                }

                {
                    boolean z;
                    if (!a.this.c() || !QnaService.a().enablePublicQna()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f77840b = z;
                }
            }, new ba(this));
            g();
            if (bundle != null) {
                this.f77827b.restoreSavedInstanceState(bundle);
            }
        }
        MethodCollector.o(5314);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.uo, viewGroup, false);
    }

    private void a(h hVar, String str, int i2) {
        o a2 = com.ss.android.ugc.aweme.compliance.api.a.d().a(2, str);
        if (a2 != null) {
            int showType = a2.getShowType();
            if (showType == 2 || i2 == 2) {
                hVar.a(p.f77892a);
            } else if (i2 == 1) {
                hVar.a(q.f77893a);
                hVar.a(r.f77894a);
            } else if (showType == 1) {
                hVar.a(s.f77895a);
                hVar.a(new t(this, a2));
            }
        }
    }
}
