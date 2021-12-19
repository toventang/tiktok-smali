package com.ss.android.ugc.aweme.profile.ui;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.lifecycle.ad;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.f;
import com.bytedance.lobby.auth.c;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.sheet.a.a;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.bytedance.tux.table.cell.c;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.imagepipeline.e.k;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.ak;
import com.ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.ss.android.ugc.aweme.profile.edit.api.YoutubeApi;
import com.ss.android.ugc.aweme.profile.edit.b;
import com.ss.android.ugc.aweme.profile.edit.c;
import com.ss.android.ugc.aweme.profile.edit.d;
import com.ss.android.ugc.aweme.profile.edit.h;
import com.ss.android.ugc.aweme.profile.edit.m;
import com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.ProfileAdvancedFeaturesCell;
import com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.a;
import com.ss.android.ugc.aweme.profile.editprofile.vm.ProfileEditProfileViewModel;
import com.ss.android.ugc.aweme.profile.f.y;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import com.ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.model.UserBioPermission;
import com.ss.android.ugc.aweme.profile.model.UserPronounsInfo;
import com.ss.android.ugc.aweme.profile.presenter.ae;
import com.ss.android.ugc.aweme.profile.presenter.p;
import com.ss.android.ugc.aweme.profile.presenter.x;
import com.ss.android.ugc.aweme.profile.ui.bj;
import com.ss.android.ugc.aweme.profile.ui.bk;
import com.ss.android.ugc.aweme.services.external.IDonationService;
import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import com.ss.android.ugc.aweme.setting.verification.c;
import com.ss.android.ugc.aweme.utils.ai;
import com.ss.android.ugc.aweme.utils.dk;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.w;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.json.JSONObject;

public class bm extends aj implements b, c, d, a, p, x, be, i, j {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f116984a = false;
    protected static final List<String> o = Arrays.asList(UGCMonitor.TYPE_PHOTO, "video", "nickname", "supported_ngo", "bio", "instagram", "twitter", "youtube", "category", "website", "bio_email");
    protected boolean A;
    protected LinearLayout B;
    protected LinearLayout C;
    protected TextView D;
    protected TuxTextCell E;
    protected TuxTextCell F;
    protected TuxTextCell G;
    protected TuxTextCell H;
    protected TuxTextCell I;
    protected TuxTextCell J;
    protected TuxTextCell K;
    protected TuxTextCell L;
    protected TuxTextCell M;
    protected TuxTextCell N;
    protected View O;
    protected TuxTextCell P;
    protected TuxTextCell Q;
    protected TuxTextCell R;
    protected PowerList S;
    protected TuxTextView T;
    protected TuxTextView U;
    protected InstagramPresenter V;
    protected h W;
    protected m X;
    String Y = "";
    protected boolean Z = false;
    User aa;

    /* renamed from: b  reason: collision with root package name */
    private boolean f116985b = false;

    /* renamed from: c  reason: collision with root package name */
    private com.ss.android.ugc.aweme.setting.verification.c f116986c;

    /* renamed from: d  reason: collision with root package name */
    private int f116987d = 0;

    /* renamed from: e  reason: collision with root package name */
    private ProfileNgoStruct f116988e;

    /* renamed from: j  reason: collision with root package name */
    private ProfileEditProfileViewModel f116989j;

    /* renamed from: k  reason: collision with root package name */
    private f.a.b.a f116990k = null;

    /* renamed from: l  reason: collision with root package name */
    private n f116991l;
    protected List<String> p;
    com.ss.android.ugc.aweme.app.f.d q = new com.ss.android.ugc.aweme.app.f.d();
    protected AnimatedImageView r;
    protected DmtStatusView s;
    protected TuxNavBar t;
    protected ae u;
    protected com.ss.android.ugc.aweme.profile.presenter.a v;
    protected boolean w;
    protected boolean x;
    protected User y;
    protected ak z;

    /* access modifiers changed from: protected */
    public int b() {
        return R.layout.aof;
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(376, new g(bm.class, "onEditCategorySuccessEvent", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(377, new g(bm.class, "onAppStoreLinkSuccess", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        this.s.setBuilder(DmtStatusView.a.a(getContext()));
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.csl);
        this.t = tuxNavBar;
        TuxNavBar.a aVar = new TuxNavBar.a();
        com.bytedance.tux.navigation.a.b a2 = new com.bytedance.tux.navigation.a.b().a(R.raw.icon_arrow_left_ltr);
        a2.f45194b = true;
        tuxNavBar.setNavActions(aVar.a(a2.a((com.bytedance.tux.navigation.a.d) new cf(this, view))).a(new com.bytedance.tux.navigation.a.g().a((String) getText(R.string.bku))));
        com.ss.android.ugc.aweme.profile.presenter.a aVar2 = new com.ss.android.ugc.aweme.profile.presenter.a();
        this.v = aVar2;
        aVar2.f116509c = this;
        this.v.b(getActivity(), this);
        ae aeVar = new ae();
        this.u = aeVar;
        aeVar.f116520c = this;
        this.f116986c = new com.ss.android.ugc.aweme.setting.verification.c();
        this.R.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(String str, TuxTextCell tuxTextCell) {
        String language;
        String str2;
        int i2;
        int i3;
        int i4;
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1008549514:
                if (str.equals("app_store_link")) {
                    c2 = 0;
                    break;
                }
                break;
            case -994687732:
                if (str.equals("pronouns")) {
                    c2 = 1;
                    break;
                }
                break;
            case -991745245:
                if (str.equals("youtube")) {
                    c2 = 2;
                    break;
                }
                break;
            case -916346253:
                if (str.equals("twitter")) {
                    c2 = 3;
                    break;
                }
                break;
            case -265713450:
                if (str.equals("username")) {
                    c2 = 4;
                    break;
                }
                break;
            case -180337243:
                if (str.equals("bio_email")) {
                    c2 = 5;
                    break;
                }
                break;
            case 97544:
                if (str.equals("bio")) {
                    c2 = 6;
                    break;
                }
                break;
            case 28903346:
                if (str.equals("instagram")) {
                    c2 = 7;
                    break;
                }
                break;
            case 50511102:
                if (str.equals("category")) {
                    c2 = '\b';
                    break;
                }
                break;
            case 70690926:
                if (str.equals("nickname")) {
                    c2 = '\t';
                    break;
                }
                break;
            case 746049438:
                if (str.equals("navi_view")) {
                    c2 = '\n';
                    break;
                }
                break;
            case 1083235153:
                if (str.equals("nonprofit")) {
                    c2 = 11;
                    break;
                }
                break;
            case 1224335515:
                if (str.equals("website")) {
                    c2 = '\f';
                    break;
                }
                break;
        }
        String str3 = "";
        switch (c2) {
            case 0:
                if (in.c() != null && in.c().getAccountType() == 3) {
                    r.a("ttelite_BA_download_click_edit", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "ba_profile").f66730a);
                }
                e activity = getActivity();
                String a2 = com.ss.android.ugc.aweme.profile.settings.b.a();
                Locale a3 = com.ss.android.ugc.aweme.i18n.language.i18n.c.a(com.bytedance.ies.ugc.appcontext.d.a());
                if (!(a3 == null || (language = a3.getLanguage()) == null)) {
                    str3 = language;
                }
                SmartRouter.buildRoute(activity, h.m.p.a(a2, "((locale))", str3)).open();
                return;
            case 1:
                if (!com.ss.android.ugc.aweme.l.a.a.a(tuxTextCell, 1200) && ab_() && !this.Z) {
                    User user = this.aa;
                    if (user == null || user.getPronounsInfo() == null || this.aa.getPronounsInfo().getPronouns() == null) {
                        str2 = this.y.getPronounsInfo().getPronouns();
                    } else {
                        str2 = this.aa.getPronounsInfo().getPronouns();
                    }
                    y.a("enter_profile_pronoun", "click_pronoun", "pronoun");
                    String string = getString(R.string.f0_);
                    if (str2 == null) {
                        str2 = str3;
                    }
                    l.d(string, str3);
                    l.d(str2, str3);
                    com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c cVar = new com.ss.android.ugc.aweme.profile.editprofile.pronouns.b.c();
                    Bundle bundle = new Bundle();
                    bundle.putString("content_name", string);
                    bundle.putString("content_value", str2);
                    cVar.setArguments(bundle);
                    cVar.setUserVisibleHint(true);
                    br brVar = new br(this);
                    l.d(brVar, str3);
                    cVar.f116183c = brVar;
                    cVar.show(getActivity().getSupportFragmentManager(), "EditPronounDialog");
                    return;
                }
                return;
            case 2:
                if (getContext().getString(R.string.bl2).equals(a(this.Q))) {
                    m mVar = this.X;
                    if (!((Boolean) mVar.f116144g.getValue()).booleanValue()) {
                        m.a(mVar, new Exception("Google service is not available, aborting."), (String) null, "before_goto_URL", (YoutubeApi.a) null, 10);
                    } else {
                        ai.a(new m.b(mVar), "YoutubeApi");
                    }
                    this.s.f();
                    i2 = 0;
                } else {
                    a(getResources().getString(R.string.h40), getResources().getString(R.string.h41), new cb(this));
                    i2 = 1;
                }
                r.a("click_social_account_bind", new com.ss.android.ugc.aweme.app.f.d().a("status", i2).a("platform", "youtube").f66730a);
                return;
            case 3:
                if (getContext().getString(R.string.bkv).equals(a(this.R))) {
                    this.W.a();
                    this.s.f();
                    i4 = 0;
                } else {
                    a(getResources().getString(R.string.h3x), getResources().getString(R.string.h3y), new by(this));
                    i4 = 1;
                }
                r.a("click_social_account_bind", new com.ss.android.ugc.aweme.app.f.d().a("status", i4).a("platform", "twitter").f66730a);
                return;
            case 4:
                b(tuxTextCell);
                return;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                if (!com.ss.android.ugc.aweme.l.a.a.a(tuxTextCell, 1200) && ab_()) {
                    String a4 = a(this.K);
                    if (!a4.equals(getString(R.string.bkh))) {
                        str3 = a4;
                    }
                    y.a("enter_profile_mail", "click_mail", "mail");
                    bl a5 = bl.a(getString(R.string.bki), str3, getResources().getString(R.string.bml), 0, true);
                    a5.setUserVisibleHint(true);
                    a5.a(new bu(this));
                    a5.a(this);
                    a5.f116972h = bv.f117005a;
                    a5.f116971g = false;
                    a5.show(getActivity().getSupportFragmentManager(), "EditMailDialog");
                    return;
                }
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                if (!com.ss.android.ugc.aweme.l.a.a.a(tuxTextCell, 1200) && ab_() && !this.Z) {
                    String a6 = a(this.I);
                    if (!a6.equals(getString(R.string.bkb))) {
                        str3 = a6;
                    }
                    y.a("enter_profile_bio", "click_bio", "bio");
                    bj a7 = bj.a.a(getString(R.string.bkc), str3);
                    a7.setUserVisibleHint(true);
                    a7.a(new bs(this));
                    a7.show(getActivity().getSupportFragmentManager(), "EditNicknameDialog");
                    return;
                }
                return;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                if (getContext().getString(R.string.bkg).equals(a(this.P))) {
                    InstagramPresenter instagramPresenter = this.V;
                    instagramPresenter.f116073g = true;
                    c.a aVar = new c.a(instagramPresenter.f116069c);
                    aVar.f40170a = "instagram";
                    aVar.f40172c = instagramPresenter;
                    com.bytedance.lobby.auth.c a8 = aVar.a();
                    com.bytedance.lobby.internal.d.a();
                    com.bytedance.lobby.internal.d.a(a8);
                    this.s.f();
                    i3 = 0;
                } else {
                    a(getResources().getString(R.string.h3q), getResources().getString(R.string.h3r), new ca(this));
                    i3 = 1;
                }
                r.a("click_social_account_bind", new com.ss.android.ugc.aweme.app.f.d().a("status", i3).a("platform", "instagram").f66730a);
                return;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                SmartRouter.buildRoute(getActivity(), com.ss.android.ugc.aweme.profile.settings.c.a(3, "settings")).open();
                return;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                if (!com.ss.android.ugc.aweme.l.a.a.a(tuxTextCell, 1200) && ab_() && !this.Z) {
                    this.f116986c.a(this.y, new com.ss.android.ugc.aweme.setting.verification.b() {
                        /* class com.ss.android.ugc.aweme.profile.ui.bm.AnonymousClass3 */

                        static {
                            Covode.recordClassIndex(75546);
                        }

                        @Override // com.ss.android.ugc.aweme.setting.verification.b
                        public final void a(VerificationResponse verificationResponse) {
                            if (verificationResponse.isEmpty()) {
                                bm.this.g();
                            } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(bm.this.getString(R.string.fe2)).a();
                            } else if (verificationResponse.isCerted()) {
                                if (c.a.f()) {
                                    String string = bm.this.getString(R.string.fdz);
                                    String string2 = bm.this.getString(R.string.fdy);
                                    if (!(string == null || string2 == null)) {
                                        ((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(bm.this.getActivity()).d(string2).b(string)).a(R.string.fe1, new cm(this)).a((DialogInterface.OnClickListener) null).a().b().show();
                                        return;
                                    }
                                }
                                bm.this.g();
                            } else if (verificationResponse.isUpdating()) {
                                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(bm.this.getString(R.string.fe3)).a();
                            }
                        }
                    });
                    return;
                }
                return;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                ProfileNaviServiceImpl.a().b(getActivity(), tuxTextCell, "edit_profile_page");
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                r.a("edit_nonprofit_link", new com.ss.android.ugc.aweme.account.a.b.a().a("enter_from", "personal_homepage").a("user_id", com.ss.android.ugc.aweme.profile.b.d.a()).a("enter_method", "click_edit_ngo_profile").f62575a);
                String a9 = a(this.L);
                if (a9.equals(getContext().getString(R.string.diu))) {
                    i();
                    return;
                }
                String string2 = getResources().getString(R.string.div, a9);
                a.C1109a a10 = new a.e().a(R.string.dis).a(new bw(this));
                a.C1109a b2 = new a.e().a(R.string.dit).a(new bx(this)).b(1);
                ArrayList arrayList = new ArrayList();
                arrayList.add(a10);
                arrayList.add(b2);
                new a.b().a(string2).b(arrayList).b().show(getFragmentManager(), "nonprofit");
                return;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                if (!com.ss.android.ugc.aweme.l.a.a.a(tuxTextCell, 1200) && ab_() && !this.Z) {
                    String a11 = a(this.J);
                    if (a11.equals(getString(R.string.bl0))) {
                        a11 = str3;
                    }
                    y.a("enter_profile_website", "click_website", "website");
                    bk a12 = bk.a.a(a11, str3);
                    a12.setUserVisibleHint(true);
                    a12.a(this);
                    bt btVar = new bt(this);
                    l.d(btVar, str3);
                    a12.f116954f = btVar;
                    a12.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(List list) {
        ProfileEditProfileViewModel profileEditProfileViewModel = this.f116989j;
        PowerList powerList = this.S;
        l.d(powerList, "");
        l.d(list, "");
        List<com.bytedance.ies.powerlist.e> allChunks = powerList.getAllChunks();
        l.b(allChunks, "");
        for (T t2 : allChunks) {
            if (t2 instanceof com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.c) {
                t2.b().a();
                f<com.bytedance.ies.powerlist.b.a> b2 = t2.b();
                ArrayList arrayList = new ArrayList(h.a.n.a((Iterable) list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.d(((Number) it.next()).intValue()));
                }
                b2.a(arrayList);
                profileEditProfileViewModel.a((com.bytedance.ies.powerlist.e) t2);
            }
        }
    }

    public final boolean a(IDonationService.OrganizationModel organizationModel) {
        int intValue;
        ProfileEditProfileViewModel profileEditProfileViewModel;
        PowerList powerList;
        if (organizationModel == null || !(organizationModel.getNgoId() == null || organizationModel.getName() == null)) {
            ProfileNgoStruct profileNgoStruct = null;
            if (organizationModel != null) {
                ProfileNgoStruct profileNgoStruct2 = new ProfileNgoStruct();
                if (organizationModel.getName() != null) {
                    profileNgoStruct2.setName(organizationModel.getName());
                    if (organizationModel.getNgoId() != null) {
                        profileNgoStruct2.setId(organizationModel.getNgoId().intValue());
                        if (organizationModel.getDonateLink() != null) {
                            profileNgoStruct2.setDonationLink(organizationModel.getDonateLink());
                        }
                        if (organizationModel.getIcon() != null) {
                            profileNgoStruct2.setIconUrl(organizationModel.getIcon().getUri());
                        }
                        profileNgoStruct = profileNgoStruct2;
                    }
                }
            }
            this.aa.setProfileNgoStruct(profileNgoStruct);
            ae aeVar = this.u;
            if (organizationModel == null) {
                intValue = 0;
            } else {
                intValue = organizationModel.getNgoId().intValue();
            }
            if (!aeVar.f116518a) {
                aeVar.f116518a = true;
                com.ss.android.ugc.aweme.account.b.g().updateSupportedNgo(aeVar.f116519b, intValue, aeVar.f116521d);
            }
            this.s.f();
            if (com.ss.android.ugc.aweme.profile.experiment.g.a() && (profileEditProfileViewModel = this.f116989j) != null && (powerList = this.S) != null) {
                boolean z2 = organizationModel == null;
                l.d(powerList, "");
                if (!z2) {
                    List<com.bytedance.ies.powerlist.e> allChunks = powerList.getAllChunks();
                    l.b(allChunks, "");
                    Iterator<T> it = allChunks.iterator();
                    loop2:
                    while (true) {
                        if (!it.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            List<com.bytedance.ies.powerlist.e> allChunks2 = powerList.getAllChunks();
                            l.b(allChunks2, "");
                            Iterator<T> it2 = allChunks2.iterator();
                            loop4:
                            while (true) {
                                if (!it2.hasNext()) {
                                    arrayList.add(Integer.valueOf(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Supporting.getId()));
                                    profileEditProfileViewModel.a().f116155a.a(ProfileEditProfileViewModel.a(arrayList)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(ProfileEditProfileViewModel.b.f116260a, ProfileEditProfileViewModel.c.f116261a);
                                    break;
                                }
                                T next = it2.next();
                                if (next instanceof com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.c) {
                                    for (T t2 : next.b().c()) {
                                        if (!(t2 instanceof com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.d)) {
                                            break loop4;
                                        }
                                        arrayList.add(Integer.valueOf(t2.f116166a));
                                    }
                                    if (next.b().b() == 0) {
                                        next.a(true);
                                    }
                                    next.b().a(new com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.d(com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Supporting.getId()));
                                }
                            }
                        } else {
                            T next2 = it.next();
                            if (next2 instanceof com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.c) {
                                int size = next2.b().c().size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    com.bytedance.ies.powerlist.b.a b2 = next2.b().b(i2);
                                    if ((b2 instanceof com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.d) && ((com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.d) b2).f116166a == com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Supporting.getId()) {
                                        break loop2;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                } else {
                    List<com.bytedance.ies.powerlist.e> allChunks3 = powerList.getAllChunks();
                    l.b(allChunks3, "");
                    for (T t3 : allChunks3) {
                        if (!(t3 instanceof com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.c)) {
                            break;
                        }
                        int size2 = t3.b().c().size();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size2) {
                                break;
                            }
                            com.bytedance.ies.powerlist.b.a b3 = t3.b().b(i3);
                            if ((b3 instanceof com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.d) && ((com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.d) b3).f116166a == com.ss.android.ugc.aweme.profile.widgets.advancedfeat.a.a.Supporting.getId()) {
                                t3.b().a(i3);
                                break;
                            }
                            i3++;
                        }
                        if (t3.b().b() == 0) {
                            T t4 = t3;
                            if (t4.f116164d != null) {
                                com.ss.android.ugc.aweme.profile.editprofile.b.a aVar = t4.f116164d;
                                if (aVar == null) {
                                    l.a("headerView");
                                }
                                PowerStub powerStub = t4.f34287a;
                                if (powerStub != null) {
                                    powerStub.a(aVar);
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.fg2).a();
        this.s.setVisibility(8);
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public void a(User user, int i2) {
        com.ss.android.ugc.aweme.app.f.d dVar;
        this.x = true;
        String str = "bold";
        if (i2 == 0) {
            a(this.F, (CharSequence) this.aa.getNickname(), true);
            a("nickname", false, str);
        } else if (i2 == 2) {
            boolean isEmpty = TextUtils.isEmpty(this.aa.getSignature());
            if (TextUtils.isEmpty(this.aa.getSignature())) {
                str = "blank";
            }
            a("bio", isEmpty, str);
            q(this.aa.getSignature());
        } else if (i2 == 4) {
            com.ss.android.ugc.aweme.base.e.a(this.r, user.getAvatarMedium());
        } else if (i2 == 12) {
            String str2 = "";
            o((String) com.google.c.a.j.fromNullable(this.aa.getProfileNgoStruct()).transform(cc.f117058a).or(str2));
            String str3 = "remove_nonprofit_link";
            if (this.aa.getProfileNgoStruct() != null) {
                if (this.f116988e != null) {
                    str3 = "change_nonprofit_link";
                } else {
                    str3 = "add_nonprofit_link";
                }
                dVar = new com.ss.android.ugc.aweme.app.f.d();
                str2 = this.aa.getProfileNgoStruct().getDonationLink();
            } else {
                dVar = new com.ss.android.ugc.aweme.app.f.d();
                ProfileNgoStruct profileNgoStruct = this.f116988e;
                if (profileNgoStruct != null) {
                    str2 = profileNgoStruct.getDonationLink();
                }
            }
            r.a(str3, dVar.a("link", str2).a("link_type", "nonprofit").f66730a);
            a(this.aa.getProfileNgoStruct());
        } else if (i2 == 112) {
            if (this.f116985b) {
                this.f116985b = false;
                r.a("ttelite_save_email", new com.ss.android.ugc.aweme.app.f.d().a("is_success", "1").f66730a);
            }
            p(user.getBioUrl());
            a(user.getBioEmail());
        } else if (i2 == 116) {
            y.a(1, this.f116987d, (String) null);
            u(this.aa.getUniqueId());
        }
        this.s.d();
    }

    /* access modifiers changed from: protected */
    public final void a(String str, boolean z2, String str2) {
        List<String> list = this.p;
        if (list != null) {
            if (z2) {
                if (list.contains(str)) {
                    this.p.remove(str);
                }
            } else if (!this.p.contains(str)) {
                this.p.add(str);
            }
            if (str.equals("bio_email")) {
                str = "email";
            }
            this.q.a(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(Exception exc, int i2) {
        if (ab_() && this.u != null && this.v != null) {
            CaptchaHelperServiceImpl.a();
            if (4 == i2) {
                this.s.setVisibility(8);
                this.v.d();
                if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 20022) {
                    com.ss.android.common.c.c.a(getActivity(), "profile_image_setting", "review_failure");
                }
            }
            if (i2 == 116) {
                String str = null;
                Exception exc2 = (!(exc instanceof ExecutionException) || !(exc.getCause() instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) ? exc : (Exception) exc.getCause();
                if (exc2 instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                    com.ss.android.ugc.aweme.base.api.a.b.a aVar = (com.ss.android.ugc.aweme.base.api.a.b.a) exc2;
                    str = String.valueOf(aVar.getErrorCode());
                    dk.a(str, aVar.getErrorMsg(), this.Y, getContext());
                    d();
                }
                y.a(0, this.f116987d, str);
            } else if (i2 != 116) {
                com.ss.android.ugc.aweme.app.api.b.a.a((Context) getActivity(), (Throwable) exc, (int) R.string.ez6);
            }
            com.ss.android.ugc.trill.e.a.a(exc.getMessage(), "user");
            this.s.setVisibility(8);
            this.v.d();
            if (this.f116985b) {
                this.f116985b = false;
                r.a("ttelite_save_email", new com.ss.android.ugc.aweme.app.f.d().a("is_success", "0").f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(boolean z2) {
        if (z2) {
            new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(R.string.h_y).a();
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.profile.b.e());
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.x
    public final void a(String str, boolean z2) {
        if (ab_()) {
            this.s.setVisibility(8);
            if (!TextUtils.isEmpty(str)) {
                new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(str).a();
                if (z2 && getActivity() != null) {
                    getActivity().finish();
                }
            }
        }
    }

    public final void a(TuxTextCell tuxTextCell, boolean z2, String str) {
        List<String> list = this.p;
        if (list != null) {
            if (z2) {
                if (list.contains(str)) {
                    this.p.remove(str);
                }
            } else if (!this.p.contains(str)) {
                this.p.add(str);
            }
            this.q.a(str, z2 ? "bold" : "blank");
            a(tuxTextCell, (CharSequence) null, this.p.contains(str));
        }
    }

    public final void a(TuxTextCell tuxTextCell, CharSequence charSequence, boolean z2) {
        c.f fVar = (c.f) tuxTextCell.getAccessory();
        if (fVar != null) {
            if (charSequence == null) {
                charSequence = fVar.f45446c.getLabel();
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(com.bytedance.tux.h.d.a(getContext(), z2 ? R.attr.bc : R.attr.bk).intValue()), 0, charSequence.length(), 17);
            fVar.a(spannableStringBuilder);
            tuxTextCell.setAccessory(fVar);
        }
    }

    private void d() {
        this.s.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object m() {
        TuxTextCell tuxTextCell = this.F;
        if (tuxTextCell == null) {
            return null;
        }
        b(tuxTextCell);
        return null;
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.Z = com.ss.android.ugc.aweme.compliance.api.a.c().a(4);
    }

    /* access modifiers changed from: protected */
    public final void k() {
        DmtStatusView dmtStatusView = this.s;
        if (dmtStatusView != null) {
            dmtStatusView.setVisibility(8);
        }
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.v;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        EventBus.a().b(this);
        com.ss.android.ugc.aweme.setting.verification.c cVar = this.f116986c;
        if (cVar != null) {
            cVar.f123053a.a();
        }
        f.a.b.a aVar = this.f116990k;
        if (aVar != null) {
            aVar.dispose();
        }
    }

    @Override // com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.profile.presenter.a aVar = this.v;
        if (aVar != null) {
            aVar.d();
        }
        com.ss.android.ugc.aweme.profile.presenter.a aVar2 = this.v;
        if (aVar2 != null) {
            aVar2.f116509c = null;
        }
        ae aeVar = this.u;
        if (aeVar != null) {
            aeVar.f116520c = null;
        }
        this.s.setVisibility(8);
    }

    static {
        Covode.recordClassIndex(75543);
    }

    public final void g() {
        TuxTextCell tuxTextCell = this.F;
        if (tuxTextCell != null) {
            String a2 = a(tuxTextCell);
            y.a("enter_profile_name", "click_name", StringSet.name);
            bl a3 = bl.a(getString(R.string.bko), a2, "", 30, false);
            a3.setUserVisibleHint(true);
            a3.a(new bp(this));
            a3.show(getActivity().getSupportFragmentManager(), "EditWebsiteDialog");
        }
    }

    /* access modifiers changed from: package-private */
    public final void i() {
        androidx.fragment.app.i fragmentManager;
        androidx.fragment.app.d selectDonationDialog = AVExternalServiceImpl.a().donationService().getSelectDonationDialog(new IDonationService.OnDonationOrgChangeListener() {
            /* class com.ss.android.ugc.aweme.profile.ui.bm.AnonymousClass1 */

            static {
                Covode.recordClassIndex(75544);
            }

            @Override // com.ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onDismiss() {
            }

            @Override // com.ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onShow() {
            }

            @Override // com.ss.android.ugc.aweme.services.external.IDonationService.OnDonationOrgChangeListener
            public final void onOrgSelected(IDonationService.OrganizationModel organizationModel) {
                bm bmVar = bm.this;
                bmVar.a(bmVar.L, (CharSequence) organizationModel.getName(), false);
                bm.this.a(organizationModel);
            }
        });
        if (!selectDonationDialog.isAdded() && (fragmentManager = getFragmentManager()) != null) {
            selectDonationDialog.show(fragmentManager, "profile_edit_select_donation");
        }
    }

    /* renamed from: j */
    public final void l() {
        if (ab_()) {
            if (this.p != null) {
                com.ss.android.ugc.aweme.profile.ui.v2.y.a("leave", this.q);
            }
            if (getArguments().getBoolean("change_to_ba", false)) {
                com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.setting.d.d());
            }
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void n() {
        if (ab_() && !this.Z) {
            y.a("replace_profile_photo", "click_head", UGCMonitor.TYPE_PHOTO);
            this.v.a(getActivity(), this.r, com.ss.android.ugc.aweme.account.b.g().getCurUser());
        }
    }

    public final void h() {
        boolean z2;
        String string;
        String str;
        String str2;
        Date date = new Date(this.y.getHandleModified() * 1000);
        int abs = Math.abs((int) ((new Date().getTime() - date.getTime()) / 86400000));
        if (this.f116987d == 0) {
            y.a("enter_profile_username", "click_username", "username");
        }
        if (abs > 30) {
            z2 = true;
            string = getString(R.string.blg);
        } else {
            z2 = false;
            BDDateFormat bDDateFormat = new BDDateFormat("LL");
            Calendar instance = Calendar.getInstance();
            instance.setTime(date);
            instance.add(5, 30);
            string = getString(R.string.h8k, bDDateFormat.a(instance.getTime().getTime(), Locale.getDefault()));
        }
        if (this.G != null) {
            if (!v(this.Y)) {
                str = this.Y;
            } else {
                str = "";
            }
            int i2 = this.f116987d;
            if (i2 == 1) {
                str2 = "personal_homepage";
            } else if (i2 == 2) {
                str2 = "modify_username_notify";
            } else if (i2 == 3) {
                str2 = "tiktok_message";
            } else {
                str2 = "edit_profile_page";
            }
            String string2 = getString(R.string.bkz);
            l.d(string2, "");
            l.d(str, "");
            l.d(string, "");
            l.d(str2, "");
            cq cqVar = new cq();
            Bundle bundle = new Bundle();
            bundle.putString("content_name", string2);
            bundle.putString("content_value", str);
            bundle.putString("enter_from", str2);
            bundle.putBoolean("is_edit_enabled", z2);
            bundle.putString("edit_hint", string);
            bundle.putInt("content_max_length", 24);
            bundle.putBoolean("is_enable_null", false);
            cqVar.setArguments(bundle);
            cqVar.setUserVisibleHint(true);
            bq bqVar = new bq(this);
            l.d(bqVar, "");
            cqVar.f117079b = bqVar;
            cqVar.show(getActivity().getSupportFragmentManager(), "EditUserNameDialog");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.edit.c
    public final void a() {
        if (getContext() != null) {
            this.s.setVisibility(8);
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(getString(R.string.h4k)).a();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* access modifiers changed from: protected */
    public void c() {
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        char c2;
        String str2;
        String str3;
        this.z = new ak();
        this.aa = new User();
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        this.y = curUser;
        if (curUser != null) {
            this.Z = com.ss.android.ugc.aweme.compliance.api.a.c().a(4);
            List<String> list = this.y.boldFields;
            this.p = list;
            if (list != null) {
                int accountType = this.y.getAccountType();
                if (accountType == 0) {
                    str = "normal";
                } else if (accountType == 1) {
                    str = "proaccount";
                } else if (accountType == 2) {
                    str = "creator";
                } else if (accountType != 3) {
                    str = "";
                } else {
                    str = "business";
                }
                this.q.a("account_type", str);
                for (String str4 : o) {
                    str4.hashCode();
                    switch (str4.hashCode()) {
                        case -991745245:
                            if (str4.equals("youtube")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -916346253:
                            if (str4.equals("twitter")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -477583675:
                            if (str4.equals("supported_ngo")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -180337243:
                            if (str4.equals("bio_email")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 97544:
                            if (str4.equals("bio")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 28903346:
                            if (str4.equals("instagram")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 50511102:
                            if (str4.equals("category")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 70690926:
                            if (str4.equals("nickname")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 106642994:
                            if (str4.equals(UGCMonitor.TYPE_PHOTO)) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 112202875:
                            if (str4.equals("video")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1224335515:
                            if (str4.equals("website")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    String str5 = "is_edited";
                    String str6 = "default";
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            com.ss.android.ugc.aweme.app.f.d dVar = this.q;
                            if (this.p.contains(str4)) {
                                str2 = "bold";
                            } else {
                                str2 = "blank";
                            }
                            dVar.a(str4, str2);
                            break;
                        case 3:
                            com.ss.android.ugc.aweme.app.f.d dVar2 = this.q;
                            if (this.p.contains(str4)) {
                                str3 = "bold";
                            } else {
                                str3 = "blank";
                            }
                            dVar2.a("email", str3);
                            break;
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            com.ss.android.ugc.aweme.app.f.d dVar3 = this.q;
                            if (this.p.contains(str4)) {
                                str6 = "bold";
                            }
                            dVar3.a(str4, str6);
                            break;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            com.ss.android.ugc.aweme.app.f.d dVar4 = this.q;
                            if (!this.p.contains(str4)) {
                                str5 = str6;
                            }
                            dVar4.a(str4, str5);
                            break;
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            com.ss.android.ugc.aweme.app.f.d dVar5 = this.q;
                            if (!this.p.contains(str4)) {
                                str5 = "blank";
                            }
                            dVar5.a(str4, str5);
                            break;
                    }
                }
            }
            a("bio", TextUtils.isEmpty(this.y.getSignature()), "");
            a(this.F, (CharSequence) this.y.getNickname(), false);
            a(this.F, "nickname");
            u(in.b(this.y));
            User user = this.y;
            if (user == null || this.Z || user.getPronounsInfo() == null || this.y.getPronounsInfo().getEnableEditPronouns() == null || !this.y.getPronounsInfo().getEnableEditPronouns().booleanValue()) {
                this.H.setVisibility(8);
                this.q.a("pronouns", "null");
            } else {
                String pronouns = this.y.getPronounsInfo().getPronouns();
                if (TextUtils.isEmpty(pronouns)) {
                    a(this.H, (CharSequence) getString(R.string.pg), false);
                    this.q.a("pronouns", "blank");
                } else {
                    a(this.H, (CharSequence) pronouns, true);
                    this.q.a("pronouns", "bold");
                }
                a(this.H, "pronouns");
            }
            User user2 = this.y;
            if (user2 != null) {
                q(user2.getSignature());
                p(user2.getBioUrl());
                a(user2.getBioEmail());
                r(user2.getBizAccountInfo() != null ? user2.getBizAccountInfo().getDownloadAppLinkToShowInEditProfile() : null);
                s(user2.getCategory());
                if (com.ss.android.ugc.aweme.profile.f.ae.a()) {
                    UserBioPermission bioPermission = user2.getBioPermission();
                    if (bioPermission != null) {
                        TuxTextCell tuxTextCell = this.J;
                        if (bioPermission.getEnableUrl()) {
                            i5 = 0;
                        } else {
                            i5 = 8;
                        }
                        tuxTextCell.setVisibility(i5);
                        TuxTextCell tuxTextCell2 = this.K;
                        if (bioPermission.getEnableEmail()) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        tuxTextCell2.setVisibility(i6);
                        TuxTextCell tuxTextCell3 = this.M;
                        if (bioPermission.getEnableDownloadAppLink()) {
                            i7 = 0;
                        } else {
                            i7 = 8;
                        }
                        tuxTextCell3.setVisibility(i7);
                        if (!bioPermission.getEnableUrl()) {
                            this.q.a("website", "");
                        }
                        if (!bioPermission.getEnableEmail()) {
                            this.q.a("email", "");
                        }
                    } else {
                        this.J.setVisibility(8);
                        this.K.setVisibility(8);
                        this.M.setVisibility(8);
                        this.q.a("website", "");
                        this.q.a("email", "");
                    }
                    if (user2.getAccountType() == 2 || user2.getAccountType() == 3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    TuxTextCell tuxTextCell4 = this.N;
                    if (z3) {
                        i4 = 0;
                    } else {
                        i4 = 8;
                    }
                    tuxTextCell4.setVisibility(i4);
                    i2 = 8;
                } else {
                    if (com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowBioUrl()) {
                        i3 = 0;
                        this.J.setVisibility(0);
                        i2 = 8;
                    } else {
                        i3 = 0;
                        i2 = 8;
                        this.J.setVisibility(8);
                        this.q.a("website", "");
                    }
                    if (com.ss.android.ugc.aweme.profile.service.a.f116616a.shouldShowBioEmail()) {
                        this.K.setVisibility(i3);
                    } else {
                        this.K.setVisibility(i2);
                        this.q.a("email", "");
                    }
                    this.M.setVisibility(i2);
                    this.N.setVisibility(i2);
                }
                if (this.N.getVisibility() == i2) {
                    this.q.a("category", "");
                }
            } else {
                i2 = 8;
            }
            User user3 = this.y;
            if (user3 == null) {
                this.L.setVisibility(i2);
            } else if (!com.ss.android.ugc.aweme.profile.experiment.b.a()) {
                this.L.setVisibility(i2);
            } else {
                this.L.setVisibility(0);
                a(user3.getProfileNgoStruct());
                o(user3.getProfileNgoStruct() != null ? user3.getProfileNgoStruct().getName() : null);
            }
            if (com.ss.android.ugc.aweme.profile.experiment.h.f116350a) {
                a(this.E, "", false);
                this.E.setVisibility(0);
                a(this.E, "navi_view");
            } else {
                this.E.setVisibility(8);
            }
            if (Math.abs((int) ((new Date().getTime() - new Date(this.y.getHandleModified() * 1000).getTime()) / 86400000)) >= 30 && this.f116987d != 0) {
                b.i.a(500).a(new ce(this), b.i.f4826c, null);
            }
            this.aa.setSignature(this.y.getSignature());
            com.ss.android.ugc.aweme.base.e.a(this.r, this.y.getAvatarMedium());
            this.w = false;
            if (!TextUtils.isEmpty(this.y.getInsId())) {
                z2 = true;
                a(this.P, (CharSequence) this.y.getInsId(), true);
            } else {
                z2 = true;
            }
            if (!TextUtils.isEmpty(this.y.getYoutubeChannelTitle())) {
                a(this.Q, this.y.getYoutubeChannelTitle(), z2);
            }
            if (!TextUtils.isEmpty(this.y.getTwitterName())) {
                a(this.R, this.y.getTwitterName(), z2);
            }
            List<String> list2 = this.p;
            if (list2 != null) {
                a(this.F, (CharSequence) null, list2.contains("nickname"));
                a(this.L, (CharSequence) null, this.p.contains("supported_ngo"));
                a(this.P, (CharSequence) null, this.p.contains("instagram"));
                a(this.Q, (CharSequence) null, this.p.contains("youtube"));
                a(this.R, (CharSequence) null, this.p.contains("twitter"));
            }
            User user4 = this.y;
            if (com.bytedance.ies.ugc.appcontext.d.k() || com.ss.android.ugc.aweme.profile.experiment.e.a()) {
                this.O.setVisibility(8);
                this.U.setVisibility(8);
                this.R.setVisibility(8);
                this.P.setVisibility(8);
                this.Q.setVisibility(8);
                this.q.a("twitter", "");
                this.q.a("instagram", "");
                this.q.a("youtube", "");
            } else {
                com.ss.android.ugc.aweme.profile.settings.d.a().getTwitter();
                boolean ins = com.ss.android.ugc.aweme.profile.settings.d.a().getIns();
                boolean youtube = com.ss.android.ugc.aweme.profile.settings.d.a().getYoutube();
                this.R.setVisibility(8);
                this.q.a("twitter", "");
                if (ins || !TextUtils.isEmpty(user4.getInsId())) {
                    this.P.setVisibility(0);
                } else {
                    this.P.setVisibility(8);
                    this.q.a("instagram", "");
                }
                if (youtube || !TextUtils.isEmpty(user4.getYoutubeChannelTitle())) {
                    this.Q.setVisibility(0);
                } else {
                    this.Q.setVisibility(8);
                    this.q.a("youtube", "");
                }
                a(this.P, "instagram");
                a(this.Q, "youtube");
                a(this.R, "twitter");
            }
            if (com.ss.android.ugc.aweme.profile.experiment.g.a()) {
                this.f116990k = new f.a.b.a();
                this.f116989j = (ProfileEditProfileViewModel) new ad(this, new com.ss.android.ugc.aweme.profile.editprofile.vm.a(this.f116990k)).a(ProfileEditProfileViewModel.class);
                e activity = getActivity();
                if (activity != null) {
                    this.f116989j.f116254d.observe(this, new ch(activity));
                    this.f116989j.f116255e.observe(this, new ci(this));
                    this.f116989j.f116256f.observe(this, new cj(this));
                    this.f116989j.f116257g.observe(this, new ck(this));
                }
                User user5 = this.y;
                if (user5 != null) {
                    PowerList powerList = this.S;
                    l.d(powerList, "");
                    l.d(this, "");
                    RecyclerView.a adapter = powerList.getAdapter();
                    if (adapter != null) {
                        PowerStub g2 = ((PowerAdapter) adapter).g();
                        if (g2 != null) {
                            com.bytedance.ies.powerlist.a.b e2 = g2.e();
                            if (!e2.a().containsKey(com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.a.class)) {
                                e2.a().put(com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.a.class, this);
                            } else {
                                throw new RuntimeException("already contains control type :" + com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.a.class);
                            }
                        }
                        this.S.a(ProfileAdvancedFeaturesCell.class);
                        this.S.setLifecycleOwner(this);
                        com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.c cVar = new com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.c(ProfileEditProfileViewModel.a(user5));
                        this.S.a(cVar);
                        n nVar = new n(new com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.e(cVar, this.f116989j));
                        this.f116991l = nVar;
                        nVar.a((RecyclerView) this.S);
                        return;
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.editprofile.advancedfeatures.powerlist.a
    public final void a(PowerCell<?> powerCell) {
        this.f116991l.b(powerCell);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c();
    }

    static String h(String str) {
        return "tiktok.com/@".concat(String.valueOf(str));
    }

    private static String t(String str) {
        while (str.contains("\n\n")) {
            str = str.replaceAll("\n\n", "\n");
        }
        return str;
    }

    private static boolean w(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(boolean z2) {
        if (z2) {
            this.s.f();
        } else {
            this.s.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.edit.d
    public final void e(final String str) {
        ai.b(new Runnable() {
            /* class com.ss.android.ugc.aweme.profile.ui.bm.AnonymousClass4 */

            static {
                Covode.recordClassIndex(75547);
            }

            public final void run() {
                if (bm.this.getContext() != null) {
                    if (TextUtils.isEmpty(str)) {
                        bm bmVar = bm.this;
                        bmVar.a(bmVar.Q, (CharSequence) bm.this.getContext().getString(R.string.bl2), false);
                    } else {
                        bm bmVar2 = bm.this;
                        bmVar2.a(bmVar2.Q, (CharSequence) str, true);
                    }
                    bm bmVar3 = bm.this;
                    bmVar3.a(bmVar3.Q, TextUtils.isEmpty(str), "youtube");
                    bm.this.s.setVisibility(8);
                }
            }
        }, "BoltsUtils");
    }

    @Override // com.ss.android.ugc.aweme.profile.edit.d
    public final void f(String str) {
        ai.b(new cd(this, str), "BoltsUtils");
    }

    private static String a(TuxTextCell tuxTextCell) {
        c.f fVar = (c.f) tuxTextCell.getAccessory();
        if (fVar == null || fVar.f45446c.getLabel() == null) {
            return "";
        }
        return fVar.f45446c.getLabel().toString();
    }

    private void c(boolean z2) {
        if (z2) {
            this.B.setVisibility(0);
            this.C.setVisibility(8);
            b(this.G);
            return;
        }
        this.B.setVisibility(8);
        this.C.setVisibility(0);
    }

    private boolean v(String str) {
        if (this.Z) {
            return false;
        }
        if (!str.matches("[0-9A-Za-z_.]*") || w(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(DialogInterface dialogInterface) {
        InstagramPresenter instagramPresenter = this.V;
        instagramPresenter.f116073g = false;
        instagramPresenter.f116071e.updateInsId(instagramPresenter.f116070d, "", 0);
        dialogInterface.dismiss();
        this.s.f();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(String str) {
        if (ab_()) {
            this.s.setVisibility(8);
            new com.ss.android.ugc.aweme.tux.a.i.a(getContext()).a(str).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean m(String str) {
        String str2;
        this.A = true;
        this.aa.setBioUrl(str);
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!TextUtils.isEmpty(str)) {
            str2 = "bold";
        } else {
            str2 = "blank";
        }
        a("website", isEmpty, str2);
        p(str);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void b(View view) {
        if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && ab_() && !this.Z) {
            this.f116986c.a(this.y, new com.ss.android.ugc.aweme.setting.verification.b() {
                /* class com.ss.android.ugc.aweme.profile.ui.bm.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(75545);
                }

                @Override // com.ss.android.ugc.aweme.setting.verification.b
                public final void a(VerificationResponse verificationResponse) {
                    if (verificationResponse.isEmpty()) {
                        bm.this.h();
                    } else if (verificationResponse.isCerting() || verificationResponse.isCertedAgain()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(bm.this.getString(R.string.fe2)).a();
                    } else if (verificationResponse.isCerted()) {
                        if (c.a.e()) {
                            String string = bm.this.getString(R.string.fdx);
                            String string2 = bm.this.getString(R.string.fdw);
                            if (!(string == null || string2 == null)) {
                                ((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(bm.this.getActivity()).d(string2).b(string)).a(R.string.fe1, new cl(this)).a((DialogInterface.OnClickListener) null).a().b().show();
                                return;
                            }
                        }
                        bm.this.h();
                    } else if (verificationResponse.isUpdating()) {
                        new com.ss.android.ugc.aweme.tux.a.i.a(com.bytedance.ies.ugc.appcontext.d.a()).a(bm.this.getString(R.string.fe3)).a();
                    }
                }
            });
        }
    }

    private void o(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            a(this.L, (CharSequence) getString(R.string.diu), false);
        } else {
            a(this.L, (CharSequence) str, false);
        }
        List<String> list = this.p;
        if (list != null) {
            a(this.L, (CharSequence) null, list.contains("supported_ngo"));
        }
        a(this.L, "nonprofit");
    }

    private void p(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(this.J, (CharSequence) str, false);
        } else {
            a(this.J, (CharSequence) getString(R.string.bl0), false);
        }
        List<String> list = this.p;
        if (list != null) {
            a(this.J, (CharSequence) null, list.contains("website"));
        }
        a(this.J, "website");
    }

    private void q(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(this.I, (CharSequence) str, false);
        } else {
            a(this.I, (CharSequence) getString(R.string.bkb), false);
        }
        List<String> list = this.p;
        if (list != null) {
            a(this.I, (CharSequence) null, list.contains("bio"));
        }
        a(this.I, "bio");
    }

    private void r(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(this.M, (CharSequence) str, false);
        } else {
            a(this.M, (CharSequence) getString(R.string.f160024c), false);
        }
        a(this.M, "app_store_link");
    }

    private void s(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(this.N, (CharSequence) str, false);
        } else {
            a(this.N, (CharSequence) getString(R.string.adj), false);
        }
        if (this.p != null) {
            a(this.N, (CharSequence) null, true);
        }
        a(this.N, "category");
    }

    private void u(String str) {
        this.Y = str;
        this.D.setText(h(str));
        a(this.G, (CharSequence) this.Y, true);
        this.D.setTextColor(getContext().getResources().getColor(R.color.bx));
        c(v(this.Y));
        a(this.G, "username");
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public void b(AvatarUri avatarUri) {
        this.v.d();
        if (this.u == null || avatarUri == null) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.nn).a();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.edit.c
    public final void d(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                a(this.R, (CharSequence) getContext().getString(R.string.bkv), false);
            } else {
                a(this.R, (CharSequence) str, true);
            }
            a(this.R, TextUtils.isEmpty(str), "twitter");
            this.s.setVisibility(8);
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onAppStoreLinkSuccess(com.ss.android.ugc.aweme.fe.method.j jVar) {
        JSONObject optJSONObject;
        if (jVar.f91311b != null && TextUtils.equals(jVar.f91311b.optString("eventName"), "download_app_link_success") && (optJSONObject = jVar.f91311b.optJSONObject("data")) != null) {
            String optString = optJSONObject.optString("android_download_app_link");
            if (TextUtils.isEmpty(optString)) {
                optString = optJSONObject.optString("ios_download_app_link");
            }
            r(optString);
            com.ss.android.ugc.aweme.account.b.g().queryUser();
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public void onEditCategorySuccessEvent(com.ss.android.ugc.aweme.fe.method.j jVar) {
        JSONObject optJSONObject;
        if (jVar.f91311b != null && TextUtils.equals(jVar.f91311b.optString("eventName"), "edit_category_success") && (optJSONObject = jVar.f91311b.optJSONObject("data")) != null) {
            String optString = optJSONObject.optString("category_name");
            if (!TextUtils.isEmpty(optString)) {
                s(optString);
                this.y.setCategory(optString);
                com.ss.android.ugc.aweme.account.b.g().queryUser();
            }
        }
    }

    private void b(TuxTextCell tuxTextCell) {
        c.f fVar = (c.f) tuxTextCell.getAccessory();
        if (fVar != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fVar.f45446c.getLabel());
            com.bytedance.tux.c.a aVar = new com.bytedance.tux.c.a();
            aVar.f44749a = R.raw.icon_exclamation_mark_circle_fill;
            aVar.f44750b = com.ss.android.ugc.aweme.base.utils.n.a(12.0d);
            aVar.f44751c = com.ss.android.ugc.aweme.base.utils.n.a(12.0d);
            aVar.f44753e = Integer.valueOf((int) R.attr.ay);
            spannableStringBuilder.clear();
            spannableStringBuilder.append((CharSequence) "0");
            spannableStringBuilder.setSpan(aVar.b(getContext()), 0, 1, 17);
            fVar.a(spannableStringBuilder);
            tuxTextCell.setAccessory(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(DialogInterface dialogInterface) {
        h hVar = this.W;
        hVar.f116122d = false;
        com.ss.android.ugc.aweme.profile.edit.api.a.a(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: INVOKE  
              (wrap: com.ss.android.ugc.aweme.profile.edit.h$2 : 0x0007: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.profile.edit.h$2) = (r1v0 'hVar' com.ss.android.ugc.aweme.profile.edit.h) call: com.ss.android.ugc.aweme.profile.edit.h.2.<init>(com.ss.android.ugc.aweme.profile.edit.h):void type: CONSTRUCTOR)
             type: STATIC call: com.ss.android.ugc.aweme.profile.edit.api.a.a(com.ss.android.ugc.aweme.profile.edit.api.a$a):void in method: com.ss.android.ugc.aweme.profile.ui.bm.c(android.content.DialogInterface):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
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
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: CONSTRUCTOR  (r0v1 com.ss.android.ugc.aweme.profile.edit.h$2) = (r1v0 'hVar' com.ss.android.ugc.aweme.profile.edit.h) call: com.ss.android.ugc.aweme.profile.edit.h.2.<init>(com.ss.android.ugc.aweme.profile.edit.h):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.profile.ui.bm.c(android.content.DialogInterface):void, file: classes8.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
            	... 14 more
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.profile.edit.h, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
            	... 20 more
            */
        /*
            this = this;
            com.ss.android.ugc.aweme.profile.edit.h r1 = r2.W
            r0 = 0
            r1.f116122d = r0
            com.ss.android.ugc.aweme.profile.edit.h$2 r0 = new com.ss.android.ugc.aweme.profile.edit.h$2
            r0.<init>()
            com.ss.android.ugc.aweme.profile.edit.api.a.a(r0)
            r3.dismiss()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = r2.s
            r0.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.bm.c(android.content.DialogInterface):void");
    }

    /* access modifiers changed from: package-private */
    public final boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.dgz).a();
            this.s.setVisibility(8);
            return false;
        } else if (TextUtils.isEmpty(str.trim())) {
            new com.ss.android.ugc.aweme.tux.a.i.a(getActivity()).a(R.string.dh1).a();
            this.s.setVisibility(8);
            return false;
        } else if (!TextUtils.equals(str, com.ss.android.ugc.aweme.account.b.g().getCurUser().getNickname())) {
            this.aa.setNickname(str);
            this.u.b(str);
            this.s.f();
            return true;
        } else {
            this.z.f115960a = "";
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(String str) {
        UserPronounsInfo userPronounsInfo = new UserPronounsInfo();
        userPronounsInfo.setPronouns(str);
        this.aa.setPronouns(userPronounsInfo);
        a(true);
        if (!str.equals("")) {
            a(this.H, (CharSequence) str, true);
            a("pronouns", false, "bold");
            return;
        }
        a(this.H, (CharSequence) getString(R.string.pg), false);
        a("pronouns", true, "blank");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean k(String str) {
        if (!TextUtils.equals(str, com.ss.android.ugc.aweme.account.b.g().getCurUser().getSignature())) {
            String t2 = t(str);
            int length = t2.length() - 1;
            if (length >= 0 && t2.charAt(length) == '\n') {
                t2 = t2.substring(0, length);
            }
            this.aa.setSignature(t2);
            this.z.f115961b = t2;
            this.s.f();
            this.u.c(t2);
            this.A = true;
            return true;
        }
        this.z.f115961b = null;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean l(String str) {
        String str2;
        this.f116985b = true;
        if (!TextUtils.equals(str, com.ss.android.ugc.aweme.account.b.g().getCurUser().getBioEmail())) {
            String t2 = t(str);
            int length = t2.length() - 1;
            if (length >= 0 && t2.charAt(length) == '\n') {
                t2 = t2.substring(0, length);
            }
            this.A = true;
            this.z.f115971l = t2;
            this.s.f();
            this.aa.setEmail(t2);
            this.u.a(this.z.a());
            boolean isEmpty = TextUtils.isEmpty(t2);
            if (!TextUtils.isEmpty(t2)) {
                str2 = "bold";
            } else {
                str2 = "blank";
            }
            a("bio_email", isEmpty, str2);
            return true;
        }
        this.z.f115971l = null;
        return true;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ int n(String str) {
        String uniqueId;
        User curUser = com.ss.android.ugc.aweme.account.b.g().getCurUser();
        if (TextUtils.isEmpty(curUser.getUniqueId())) {
            uniqueId = curUser.getShortId();
        } else {
            uniqueId = curUser.getUniqueId();
        }
        if (str.equals(uniqueId)) {
            this.z.f115962c = "";
            return 0;
        } else if (dk.a(str, getContext())) {
            this.u.a(str);
            this.s.f();
            this.aa.setUniqueId(str);
            return 1;
        } else {
            d();
            this.z.f115962c = "";
            return 2;
        }
    }

    private void a(ProfileNgoStruct profileNgoStruct) {
        if (profileNgoStruct == null || profileNgoStruct.getName().isEmpty()) {
            this.f116988e = null;
        } else {
            this.f116988e = this.y.getProfileNgoStruct();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public void b(Exception exc) {
        k();
        if (ab_() && this.v != null) {
            if ((exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) && ((com.ss.android.ugc.aweme.base.api.a.a) exc).getErrorCode() == 20022) {
                com.ss.android.common.c.c.a(getActivity(), "profile_image_setting", "review_failure");
            }
            com.ss.android.ugc.aweme.app.api.b.a.a((Context) getActivity(), (Throwable) exc, (int) R.string.nn);
            com.ss.android.ugc.trill.e.a.a(exc.getMessage(), "avatar");
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.edit.b
    public final void c(String str) {
        if (getContext() != null) {
            if (TextUtils.isEmpty(str)) {
                a(this.P, (CharSequence) getContext().getString(R.string.bkg), false);
            } else {
                a(this.P, (CharSequence) str, true);
            }
            a(this.P, TextUtils.isEmpty(str), "instagram");
            this.s.setVisibility(8);
        }
    }

    private void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            a(this.K, (CharSequence) str, false);
        } else {
            a(this.K, (CharSequence) getString(R.string.bkh), false);
        }
        List<String> list = this.p;
        if (list != null) {
            a(this.K, (CharSequence) null, list.contains("bio_email"));
        }
        a(this.K, "bio_email");
    }

    @Override // com.ss.android.ugc.aweme.profile.presenter.p
    public void b(String str) {
        this.x = true;
        Uri parse = Uri.parse("file://".concat(String.valueOf(str)));
        k.a().e().a(parse);
        com.ss.android.ugc.aweme.base.e.b(this.r, parse.toString(), (int) com.bytedance.common.utility.n.b(getContext(), 84.0f), (int) com.bytedance.common.utility.n.b(getContext(), 84.0f));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(DialogInterface dialogInterface) {
        ai.a(new m.f(this.X), "BoltsUtils");
        dialogInterface.dismiss();
        this.s.f();
    }

    private void a(TuxTextCell tuxTextCell, String str) {
        c.f fVar = (c.f) tuxTextCell.getAccessory();
        if (fVar != null) {
            fVar.a(new cg(this, str, tuxTextCell));
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(8922);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(8922);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        UrlModel urlModel;
        if (i2 == 1001) {
            m mVar = this.X;
            if (intent == null) {
                m.a(mVar, new Exception("onActivityResult called with null Intent"), (String) null, "goto_URL_and_auth", (YoutubeApi.a) null, 10);
            } else {
                b.i.b(new m.d(mVar, intent), b.i.f4824a).a((b.g) new m.e(mVar));
            }
        } else {
            if (!(i2 != 10002 || intent == null || (urlModel = (UrlModel) intent.getSerializableExtra("path")) == null)) {
                com.ss.android.ugc.aweme.base.e.a(this.r, urlModel);
                com.ss.android.ugc.aweme.account.b.g().getCurUser().setAvatarUpdateReminder(false);
                List<String> list = com.ss.android.ugc.aweme.account.b.g().getCurUser().boldFields;
                if (list != null) {
                    if (list.size() > 0 && !list.contains(UGCMonitor.TYPE_PHOTO)) {
                        list.add(UGCMonitor.TYPE_PHOTO);
                        com.ss.android.ugc.aweme.account.b.g().getCurUser().setBoldFields(list);
                    }
                    a(UGCMonitor.TYPE_PHOTO, false, "is_edited");
                }
            }
            this.v.a(i2, i3, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a2 = com.a.a(layoutInflater, b(), viewGroup, false);
        this.r = (AnimatedImageView) a2.findViewById(R.id.bfb);
        this.s = (DmtStatusView) a2.findViewById(R.id.e_o);
        this.B = (LinearLayout) a2.findViewById(R.id.bqz);
        this.C = (LinearLayout) a2.findViewById(R.id.cg0);
        this.D = (TextView) a2.findViewById(R.id.d3r);
        this.E = (TuxTextCell) a2.findViewById(R.id.cty);
        this.F = (TuxTextCell) a2.findViewById(R.id.cvc);
        this.G = (TuxTextCell) a2.findViewById(R.id.fe2);
        this.H = (TuxTextCell) a2.findViewById(R.id.dd3);
        this.I = (TuxTextCell) a2.findViewById(R.id.te);
        this.J = (TuxTextCell) a2.findViewById(R.id.fm7);
        this.K = (TuxTextCell) a2.findViewById(R.id.cjy);
        this.L = (TuxTextCell) a2.findViewById(R.id.cw6);
        this.M = (TuxTextCell) a2.findViewById(R.id.lc);
        this.N = (TuxTextCell) a2.findViewById(R.id.a2u);
        this.O = a2.findViewById(R.id.tc);
        this.P = (TuxTextCell) a2.findViewById(R.id.bqa);
        this.Q = (TuxTextCell) a2.findViewById(R.id.fnv);
        this.R = (TuxTextCell) a2.findViewById(R.id.fa9);
        this.S = (PowerList) a2.findViewById(R.id.i5);
        this.T = (TuxTextView) a2.findViewById(R.id.bf5);
        this.U = (TuxTextView) a2.findViewById(R.id.bfl);
        View findViewById = a2.findViewById(R.id.fc_);
        if (findViewById != null) {
            findViewById.setOnClickListener(new bn(this));
        }
        View findViewById2 = a2.findViewById(R.id.cg0);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new bo(this));
        }
        View findViewById3 = a2.findViewById(R.id.bfb);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new bz(this));
        }
        if (getArguments() != null) {
            this.f116987d = getArguments().getInt("need_focus_id_input", 0);
        }
        a(a2);
        EventBus.a(EventBus.a(), this);
        return a2;
    }

    private void a(String str, String str2, DialogInterface.OnClickListener onClickListener) {
        if (this.f35364f) {
            ((com.bytedance.tux.dialog.e) new com.bytedance.tux.dialog.e(getActivity()).b(str).d(str2)).a(R.string.a7y, onClickListener).a().b().show();
        }
    }
}
