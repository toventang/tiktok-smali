package com.ss.android.ugc.aweme.prop.b;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.e;
import androidx.fragment.app.l;
import b.g;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.lighten.a.e;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.ui.s;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.detail.a;
import com.ss.android.ugc.aweme.detail.m;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.GreenScreenMaterial;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.IIMService;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.a.b;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.services.settings.IAVSettingsService;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.ah;
import com.ss.android.ugc.aweme.shortvideo.c;
import com.ss.android.ugc.aweme.sticker.model.h;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.ic;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.i;

public class j extends a implements com.ss.android.ugc.aweme.prop.view.a, i, org.greenrobot.eventbus.j {
    RemoteImageView N;
    public RemoteImageView O;
    GridView P;
    View Q;
    CheckableImageView R;
    TextView S;
    ImageView T;
    FrameLayout U;
    SmartImageView V;
    TuxTextView W;
    CheckableImageView X;
    ViewGroup Y;
    ViewStub Z;

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.tux.sheet.sheet.a f118235a;
    private String aA;
    private com.ss.android.ugc.aweme.prop.d.a aB;
    private String aC;
    private h aD;
    private ViewGroup aE;
    private boolean aF;
    private boolean aG;
    private b aH;
    private float aI;
    private float aJ;
    private com.ss.android.ugc.aweme.prop.a aK;
    private String aL;
    private c aM;
    private Serializable aN;
    private int aO;
    private String aP;
    private boolean aQ;
    private boolean aR;
    private Handler aS = new SafeHandler(this);
    private h aT;
    private com.ss.android.ugc.aweme.v.a.c aU;
    private f aV;
    private List<String> aW;
    private boolean aX = false;
    private IAVEffectService.EffectPlatformLoader aY = new IAVEffectService.EffectPlatformLoader() {
        /* class com.ss.android.ugc.aweme.prop.b.j.AnonymousClass1 */

        static {
            Covode.recordClassIndex(76786);
        }

        @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.EffectPlatformLoader
        public final void load(g<f, Void> gVar) {
            b.j jVar = new b.j();
            if (j.this.av == null) {
                IAVEffectService iAVEffectService = j.this.aw;
                Context applicationContext = j.this.getContext().getApplicationContext();
                if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
                    applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
                }
                iAVEffectService.buildEffectPlatform(applicationContext, new y(this, jVar, gVar), z.f118274a);
                return;
            }
            jVar.a(j.this.av);
            jVar.f4869a.a((g) gVar);
        }
    };
    private com.ss.android.ugc.aweme.commerce_sticker_api.b.a aZ = null;
    ViewStub aa;
    ViewStub ab;
    ViewStub ac;
    ViewStub ad;
    SpringLayout ae;
    ViewGroup af;
    LinearLayout ag;
    RemoteImageView ah;
    TextView ai;
    TextView aj;
    TextView ak;
    LinearLayout al;
    TuxTextView am;
    public int an;
    boolean ao;
    public com.ss.android.ugc.aweme.sticker.model.g ap;
    String aq;
    String ar;
    String as;
    String at;
    int au;
    public f av;
    public IAVEffectService aw = AVExternalServiceImpl.a().abilityService().effectService();
    com.ss.android.ugc.aweme.commerce_sticker_api.service.a ax = CommerceStickerServiceImpl.c().b();
    private com.ss.android.ugc.aweme.prop.a.a ay;
    private String az;

    /* renamed from: b  reason: collision with root package name */
    View f118236b;
    private RelativeLayout ba;
    private final bp bb = new bp() {
        /* class com.ss.android.ugc.aweme.prop.b.j.AnonymousClass2 */

        static {
            Covode.recordClassIndex(76787);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            String str;
            j jVar = j.this;
            if (jVar.getActivity() == null || !MSAdaptionService.c().b((Context) jVar.getActivity())) {
                String uuid = UUID.randomUUID().toString();
                d a2 = new d().a("creation_id", uuid).a("shoot_way", "prop_page").a("enter_from", "prop_page");
                if (jVar.a() == null) {
                    str = "";
                } else {
                    str = jVar.a().get(0);
                }
                d a3 = a2.a("prop_id", str).a("is_ui_shoot", (Object) true).a("time_elapsed_since_launch_app", AVExternalServiceImpl.a().infoService().getDurationSinceAppForeground(uuid)).a("group_id", jVar.ar).a("shoot_enter_from", jVar.as).a("is_bundled", jVar.au);
                if (!TextUtils.isEmpty(jVar.at)) {
                    a3.a("from_banner_id", jVar.at);
                }
                AVExternalServiceImpl.a().getAVMobService().onEventV3("shoot", a3.f66730a);
                if (!jVar.ax.a(view.getContext(), jVar.ap, "prop_collection")) {
                    IAVSettingsService avsettingsConfig = AVExternalServiceImpl.a().configService().avsettingsConfig();
                    if (avsettingsConfig == null || !avsettingsConfig.needLoginBeforeRecord()) {
                        jVar.a(false, uuid, AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                    } else {
                        com.ss.android.ugc.aweme.login.c.a(jVar.getActivity(), "prop_page", "prop_reuse_icon", (Bundle) null, (com.ss.android.ugc.aweme.base.component.f) null);
                    }
                }
            } else {
                Toast makeText = Toast.makeText(jVar.getActivity(), jVar.getString(R.string.bey), 0);
                if (Build.VERSION.SDK_INT == 25) {
                    ic.a(makeText);
                }
                makeText.show();
            }
        }
    };
    private boolean bc = false;
    private long bd = -1;
    private boolean be = false;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f118237c;

    /* renamed from: d  reason: collision with root package name */
    RemoteImageView f118238d;

    /* renamed from: e  reason: collision with root package name */
    RemoteImageView f118239e;

    /* renamed from: j  reason: collision with root package name */
    RemoteImageView f118240j;

    /* renamed from: k  reason: collision with root package name */
    TextView f118241k;

    /* renamed from: l  reason: collision with root package name */
    TextView f118242l;

    /* renamed from: m  reason: collision with root package name */
    TextView f118243m;
    View n;
    View o;
    DmtStatusView p;
    RemoteImageView q;
    ViewGroup r;
    ViewStub s;
    View t;
    ImageView u;

    static {
        Covode.recordClassIndex(76785);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.ss.android.ugc.aweme.detail.a
    public final boolean H() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String a(int i2) {
        return "prop_page";
    }

    @Override // org.greenrobot.eventbus.i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new org.greenrobot.eventbus.g(j.class, "onEvent", com.ss.android.ugc.aweme.im.service.model.j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(171, new org.greenrobot.eventbus.g(j.class, "receiveJumpMessage", com.ss.android.ugc.aweme.sticker.types.unlock.a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final int h() {
        return R.layout.a1p;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void k() {
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final boolean n() {
        return false;
    }

    public final void a(boolean z) {
        getContext();
        if (!j()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (!this.aX) {
                this.p.h();
            }
        } else {
            if (!this.aX) {
                this.p.f();
            }
            this.aB.a(this.aC, 0);
        }
        if (z) {
            this.p.d();
            if (this.I != null) {
                s sVar = (s) this.I.get(this.aH.f118205b);
                if (sVar != null) {
                    sVar.j();
                } else {
                    this.ae.setRefreshing(false);
                }
            } else {
                SpringLayout springLayout = this.ae;
                if (springLayout != null) {
                    springLayout.setRefreshing(false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, String str, boolean z2) {
        if (this.aK == null) {
            com.ss.android.ugc.aweme.prop.a aVar = new com.ss.android.ugc.aweme.prop.a(getActivity(), "prop_page");
            this.aK = aVar;
            aVar.f118169e.setShootEnterFrom(this.as);
            this.aK.f118169e.setFromBannerId(this.at);
            this.aK.f118169e.setBundled(Integer.valueOf(this.au));
            this.aK.f118177m = "prop_auto";
            this.aK.f118175k = str;
            this.aK.C = this.aO;
        }
        this.aK.q = new w(this);
        ArrayList<String> a2 = a();
        if (a2 != null && a2.size() != 0) {
            Serializable serializable = this.aN;
            if (serializable instanceof Music) {
                this.aK.a((Music) serializable);
            }
            this.aK.a(a2, "prop_page", this.aA, z, this.aO, z2);
        }
    }

    public final void a(String str) {
        com.ss.android.ugc.aweme.sticker.model.g gVar = this.ap;
        if (gVar != null && !TextUtils.isEmpty(gVar.ownerId) && !TextUtils.isEmpty(this.ap.ownerName)) {
            r.a("enter_personal_detail", new d().a("prop_id", this.ap.id).a("to_user_id", this.ap.ownerId).a("enter_from", "prop_page").a("enter_method", str).f66730a);
            t.a(t.a(), u.a("aweme://user/profile/" + this.ap.ownerId).a("sec_user_id", this.ap.mSecUid).a("enter_from", "prop_page").a());
        }
    }

    @Override // com.ss.android.ugc.aweme.prop.view.a
    public final void a(Exception exc) {
        com.ss.android.ugc.aweme.framework.a.a.a((Throwable) exc);
        SpringLayout springLayout = this.ae;
        if (springLayout != null) {
            springLayout.setRefreshing(false);
        }
        if (ab_()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
            if (this.aX) {
                this.p.d();
            } else {
                this.p.h();
            }
        }
        ImageView imageView = this.T;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        b(this.bc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e() {
        a(false);
    }

    private static boolean g() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final String i() {
        com.ss.android.ugc.aweme.sticker.model.g gVar = this.ap;
        if (gVar != null) {
            return gVar.id;
        }
        return "";
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.ss.android.ugc.aweme.effectplatform.f fVar = this.av;
        if (fVar != null) {
            fVar.destroy();
        }
    }

    private static boolean j() {
        if (com.ss.android.ugc.aweme.lancet.j.f107229h && com.ss.android.ugc.aweme.lancet.j.b() && !com.ss.android.ugc.aweme.lancet.j.c()) {
            return com.ss.android.ugc.aweme.lancet.j.f107229h;
        }
        boolean g2 = g();
        com.ss.android.ugc.aweme.lancet.j.f107229h = g2;
        return g2;
    }

    private void q() {
        if (AVExternalServiceImpl.a().provideTakeInSameOptimize().enableTakeInSameRecordOptimize(com.bytedance.ies.ugc.appcontext.d.a())) {
            a(true, "", false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        a(true);
        r.a("refresh_page", new d().a("enter_from", "prop_page").f66730a);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.ss.android.ugc.aweme.prop.a aVar = this.aK;
        if (aVar != null && aVar.A != null) {
            aVar.A.a();
        }
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.bd = System.currentTimeMillis();
        if (this.be) {
            com.ss.android.ugc.aweme.prop.a aVar = this.aK;
            if (aVar.w != null) {
                aVar.a(aVar.w, UUID.randomUUID().toString(), false);
            }
            this.be = false;
            this.bc = false;
        }
        b(this.bc);
    }

    private ArrayList<com.ss.android.ugc.aweme.sticker.model.g> m() {
        h hVar = this.aD;
        if (hVar == null || hVar.mStickers == null || this.aD.mStickers.size() == 0) {
            return null;
        }
        ArrayList<com.ss.android.ugc.aweme.sticker.model.g> arrayList = new ArrayList<>(this.aD.mStickers.size());
        for (com.ss.android.ugc.aweme.sticker.model.g gVar : this.aD.mStickers) {
            if (!gVar.mIsSelect) {
                arrayList.add(gVar);
            } else {
                arrayList.add(0, gVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final ArrayList<String> a() {
        h hVar = this.aD;
        if (hVar == null || hVar.mStickers == null || this.aD.mStickers.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>(this.aD.mStickers.size());
        for (com.ss.android.ugc.aweme.sticker.model.g gVar : this.aD.mStickers) {
            if (!gVar.mIsSelect) {
                arrayList.add(gVar.id);
            } else {
                arrayList.add(0, gVar.id);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c() {
        List<Aweme> list;
        com.ss.android.ugc.aweme.metrics.f a2 = new com.ss.android.ugc.aweme.metrics.f().a("prop_page");
        a2.t = "prop_page";
        a2.q = this.ap.id;
        a2.s = ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(this.ar, 0));
        a2.f109568a = this.ar;
        a2.r = 1009;
        a2.f();
        SecApiImpl.a().reportData("share");
        ShareService shareService = ah.f123352a;
        e activity = getActivity();
        com.ss.android.ugc.aweme.sticker.model.g gVar = this.ap;
        String str = this.ar;
        com.ss.android.ugc.aweme.detail.h hVar = (com.ss.android.ugc.aweme.detail.h) this.I.get(this.G);
        if (hVar instanceof s) {
            list = ((s) hVar).p();
        } else {
            list = null;
        }
        shareService.a(activity, gVar, str, list, this.aq);
    }

    @Override // com.ss.android.ugc.b.a.a.a, com.bytedance.ies.uikit.a.b, androidx.fragment.app.Fragment
    public void onStop() {
        String str;
        com.ss.android.ugc.aweme.sticker.model.g gVar = this.ap;
        if (gVar == null) {
            str = "";
        } else {
            str = gVar.id;
        }
        this.M = -1;
        super.onStop();
        o();
        if (this.bd != -1) {
            r.a("stay_time", new d().a("prop_id", str).a("enter_from", "prop_page").a("duration", String.valueOf(System.currentTimeMillis() - this.bd)).a("group_id", this.ar).a("log_pb", this.aq).f66730a);
            this.bd = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        String str;
        if (this.ap != null) {
            this.aQ = false;
            this.aR = false;
            if (!com.ss.android.ugc.aweme.account.b.g().isLogin()) {
                com.ss.android.ugc.aweme.login.c.a(getActivity(), "prop_page", "click_favorite_prop", (Bundle) null, new x(this));
                return;
            }
            if (this.ap.isFavorite) {
                str = "cancel_favorite_prop";
            } else {
                str = "favourite_prop";
            }
            r.a(str, new d().a("enter_from", "prop_page").a("prop_id", this.ap.id).f66730a);
            com.ss.android.ugc.aweme.prop.d.a aVar = this.aB;
            getActivity();
            com.ss.android.ugc.aweme.sticker.model.g gVar = this.ap;
            gVar.isFavorite = !gVar.isFavorite;
            aVar.f118293a.load(new g<com.ss.android.ugc.aweme.effectplatform.f, Void>(gVar) {
                /* class com.ss.android.ugc.aweme.prop.d.a.AnonymousClass2 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ com.ss.android.ugc.aweme.sticker.model.g f118296a;

                static {
                    Covode.recordClassIndex(76819);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
                @Override // b.g
                public final /* synthetic */ Void then(b.i<com.ss.android.ugc.aweme.effectplatform.f> iVar) {
                    iVar.d().a("default", Collections.singletonList(this.f118296a.id), this.f118296a.isFavorite, new IModFavoriteList() {
                        /* class com.ss.android.ugc.aweme.prop.d.a.AnonymousClass2.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(76820);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final /* synthetic */ void onSuccess(List<String> list) {
                            if (a.this.f76397i != null) {
                                ((com.ss.android.ugc.aweme.prop.view.a) a.this.f76397i).b(AnonymousClass2.this.f118296a);
                            }
                        }

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList
                        public final void onFail(ExceptionResult exceptionResult) {
                            if (a.this.f76397i != null) {
                                AnonymousClass2.this.f118296a.isFavorite = !AnonymousClass2.this.f118296a.isFavorite;
                                ((com.ss.android.ugc.aweme.prop.view.a) a.this.f76397i).a(AnonymousClass2.this.f118296a, exceptionResult);
                            }
                        }
                    });
                    return null;
                }

                {
                    this.f118296a = r2;
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final l l() {
        boolean z;
        com.ss.android.ugc.aweme.prop.a.a aVar = this.ay;
        if (aVar != null) {
            return aVar;
        }
        h hVar = this.aD;
        this.I = new ArrayList(hVar.mStickers.size() - 1);
        for (com.ss.android.ugc.aweme.sticker.model.g gVar : hVar.mStickers) {
            com.ss.android.ugc.aweme.detail.h hVar2 = (com.ss.android.ugc.aweme.detail.h) getChildFragmentManager().a(a.v + gVar.id);
            e eVar = hVar2;
            if (hVar2 == null) {
                this.aV = new f(this.az);
                String str = gVar.id;
                String str2 = this.aP;
                String str3 = this.ar;
                f fVar = this.aV;
                e eVar2 = new e();
                Bundle bundle = new Bundle();
                bundle.putInt("detail_aweme_list_type", 15);
                bundle.putString("event_label", "sticker_prop_detail");
                bundle.putString("detail_id", str);
                bundle.putString("detail_aweme_from", str2);
                bundle.putString("detail_aweme_from_aid", str3);
                eVar2.setArguments(bundle);
                eVar2.G = fVar;
                eVar = eVar2;
            }
            if (eVar instanceof e) {
                s sVar = (s) eVar;
                if (this.G == 0) {
                    z = true;
                } else {
                    z = false;
                }
                sVar.z = z;
                sVar.A = true;
            }
            this.I.add(eVar);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.I) {
            arrayList.add(obj);
        }
        com.ss.android.ugc.aweme.prop.a.a aVar2 = new com.ss.android.ugc.aweme.prop.a.a(getChildFragmentManager(), arrayList);
        this.ay = aVar2;
        return aVar2;
    }

    @org.greenrobot.eventbus.r
    public void receiveJumpMessage(com.ss.android.ugc.aweme.sticker.types.unlock.a aVar) {
        this.be = true;
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final com.ss.android.ugc.aweme.g.a.g a(ViewGroup viewGroup) {
        return this.aU.a(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.prop.view.a
    public final void b(com.ss.android.ugc.aweme.sticker.model.g gVar) {
        if (gVar.isFavorite) {
            this.aQ = true;
            if (!this.ao) {
                return;
            }
            return;
        }
        new com.bytedance.tux.g.b(this).e(R.string.a9j).b();
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(View view) {
        super.a(view);
        this.aT = new c();
        if (this.bc) {
            this.aU = new com.ss.android.ugc.aweme.detail.base.a(requireContext(), 2131231564);
        } else {
            this.aU = new com.ss.android.ugc.aweme.v.a.a(requireContext(), getLayoutInflater(), R.string.b8b);
        }
    }

    @org.greenrobot.eventbus.r
    public void onEvent(com.ss.android.ugc.aweme.im.service.model.j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (ab_() && TextUtils.equals("sticker", jVar.f103916d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(getActivity(), this.n, jVar);
        }
    }

    private void b(boolean z) {
        int i2;
        RelativeLayout relativeLayout;
        int i3 = 2131233884;
        if (z && (relativeLayout = this.ba) != null) {
            this.aU.b(relativeLayout);
            com.ss.android.ugc.aweme.detail.base.a aVar = new com.ss.android.ugc.aweme.detail.base.a(getContext(), 2131233884);
            this.aU = aVar;
            aVar.a(this.ba);
            this.ba.findViewById(R.id.e9v).setOnClickListener(this.bb);
        }
        View view = this.Q;
        if (view != null) {
            view.setEnabled(!z);
            if (z) {
                this.Q.setAlpha(0.34f);
            } else {
                this.Q.setAlpha(1.0f);
            }
        }
        RemoteImageView remoteImageView = this.f118239e;
        if (remoteImageView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            remoteImageView.setVisibility(i2);
        }
        RemoteImageView remoteImageView2 = this.f118238d;
        if (remoteImageView2 != null) {
            if (!z) {
                i3 = 2131231564;
            }
            com.ss.android.ugc.aweme.base.e.a(remoteImageView2, i3);
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.a
    public final void a(Bundle bundle) {
        if (bundle != null) {
            this.ar = bundle.getString("aweme_id");
            this.aq = bundle.getString("extra_log_pb");
            this.az = bundle.getString("extra_music_from");
            this.aA = bundle.getString("extra_sticker_from");
            this.aM = (c) bundle.getSerializable("sticker_music");
            this.aN = bundle.getSerializable("music_model");
            this.aW = bundle.getStringArrayList("extra_stickers");
            int i2 = bundle.getInt("media_type", 0);
            this.an = i2;
            if (i2 != 3) {
                i2 = 0;
            }
            this.an = i2;
            this.aO = bundle.getInt("EXTRA_VIDEO_LENGTH", 0);
            this.aP = bundle.getString("extra_previous_page", "");
            this.as = bundle.getString("shoot_enter_from");
            this.at = bundle.getString("from_banner_id");
            this.au = bundle.getInt("is_bundled", 0);
            StringBuilder sb = new StringBuilder();
            List<String> list = this.aW;
            if (list != null && list.size() > 0) {
                this.aL = this.aW.get(0);
                Iterator<String> it = this.aW.iterator();
                while (it.hasNext()) {
                    sb.append(it.next() + ",");
                }
            }
            if (sb.toString().endsWith(",")) {
                this.aC = sb.toString().substring(0, sb.toString().length() - 1);
            }
            this.K = bundle.getString("sticker_id");
            com.ss.android.ugc.aweme.prop.c.c.f118282b = this.an;
            this.H = false;
        }
    }

    public final void a(com.ss.android.ugc.aweme.sticker.model.g gVar) {
        CheckableImageView checkableImageView;
        int i2;
        int i3;
        if (gVar != null && this.S != null && (checkableImageView = this.R) != null) {
            boolean z = gVar.isFavorite;
            int i4 = R.drawable.b1a;
            if (z) {
                i2 = R.drawable.b1a;
            } else {
                i2 = 2131233128;
            }
            checkableImageView.setImageResource(i2);
            CheckableImageView checkableImageView2 = this.X;
            if (checkableImageView2 != null) {
                if (!gVar.isFavorite) {
                    i4 = 2131233128;
                }
                checkableImageView2.setImageResource(i4);
            }
            TextView textView = this.S;
            if (gVar.isFavorite) {
                i3 = R.string.daz;
            } else {
                i3 = R.string.pj;
            }
            textView.setText(i3);
            if (gVar.isFavorite) {
                this.aR = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(int i2) {
        if (i2 != this.aH.f118205b) {
            b bVar = this.aH;
            if (bVar.f118204a != null && i2 < bVar.f118204a.size()) {
                for (com.ss.android.ugc.aweme.sticker.model.g gVar : bVar.f118204a) {
                    gVar.mIsSelect = false;
                }
                bVar.f118204a.get(i2).mIsSelect = true;
                bVar.f118205b = i2;
                bVar.notifyDataSetChanged();
            }
            c(this.aH.f118204a.get(i2));
            if (this.ax.a(this.aH.f118204a.get(i2))) {
                this.bc = true;
            } else {
                this.bc = false;
            }
            b(this.bc);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void c(com.ss.android.ugc.aweme.sticker.model.g r18) {
        /*
        // Method dump skipped, instructions count: 896
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.prop.b.j.c(com.ss.android.ugc.aweme.sticker.model.g):void");
    }

    @Override // com.ss.android.ugc.aweme.prop.view.a
    public final void a(h hVar) {
        SpringLayout springLayout = this.ae;
        if (springLayout != null) {
            springLayout.setRefreshing(false);
        }
        if (ab_()) {
            if (hVar == null || hVar.mStickers == null || hVar.mStickers.size() == 0) {
                this.aX = false;
                this.p.g();
                ViewGroup viewGroup = this.af;
                if (viewGroup != null) {
                    viewGroup.setVisibility(8);
                    return;
                }
                return;
            }
            this.aD = hVar;
            if (!this.aF) {
                super.k();
            }
            boolean booleanValue = SharePrefCache.inst().getStickerArtEntry().c().booleanValue();
            String stickerArtistIconUrl = AVExternalServiceImpl.a().configService().avsettingsConfig().getStickerArtistIconUrl();
            if (!TextUtils.isEmpty(SharePrefCache.inst().getStickerArtlistUrl().c()) && !TextUtils.isEmpty(stickerArtistIconUrl) && booleanValue) {
                this.O.setVisibility(0);
                com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
                b2.f47325m = this.O.getController();
                b2.f47319g = new com.facebook.drawee.c.d<com.facebook.imagepipeline.j.f>() {
                    /* class com.ss.android.ugc.aweme.prop.b.j.AnonymousClass6 */

                    static {
                        Covode.recordClassIndex(76791);
                    }

                    @Override // com.facebook.drawee.c.d
                    public final void onFailure(String str, Throwable th) {
                    }

                    @Override // com.facebook.drawee.c.d
                    public final void onIntermediateImageFailed(String str, Throwable th) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
                    @Override // com.facebook.drawee.c.d
                    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, com.facebook.imagepipeline.j.f fVar) {
                    }

                    @Override // com.facebook.drawee.c.d
                    public final void onRelease(String str) {
                    }

                    @Override // com.facebook.drawee.c.d
                    public final void onSubmit(String str, Object obj) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
                    @Override // com.facebook.drawee.c.d
                    public final /* synthetic */ void onFinalImageSet(String str, com.facebook.imagepipeline.j.f fVar, Animatable animatable) {
                        com.facebook.imagepipeline.j.f fVar2 = fVar;
                        if (j.this.getContext() != null && fVar2 != null && fVar2.getWidth() != 0 && fVar2.getHeight() != 0) {
                            j.this.O.setLayoutParams(new FrameLayout.LayoutParams((int) ((n.b(j.this.getContext(), 25.0f) * ((float) fVar2.getWidth())) / ((float) fVar2.getHeight())), (int) n.b(j.this.getContext(), 25.0f)));
                        }
                    }
                };
                this.O.setController(b2.b(Uri.parse(stickerArtistIconUrl)).e());
            }
            this.O.setOnClickListener(new u(this));
            this.aF = true;
            c(hVar.mStickers.get(0));
            hVar.mStickers.get(0).mIsSelect = true;
            if (hVar.mStickers.size() == 1) {
                this.P.setVisibility(8);
                this.t.setVisibility(8);
                ViewGroup viewGroup2 = this.Y;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                }
            } else {
                ViewGroup viewGroup3 = this.Y;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                }
                this.P.setVisibility(0);
                this.t.setVisibility(0);
                b bVar = this.aH;
                List<com.ss.android.ugc.aweme.sticker.model.g> list = hVar.mStickers;
                if (!(list == null || list.size() == 0)) {
                    bVar.f118204a.clear();
                    bVar.f118204a.addAll(list);
                    bVar.notifyDataSetChanged();
                }
                this.P.setNumColumns(hVar.mStickers.size());
                int b3 = (int) n.b(getActivity(), 42.0f);
                int b4 = (int) n.b(getActivity(), 16.0f);
                int size = hVar.mStickers.size();
                this.P.setLayoutParams(new LinearLayout.LayoutParams((b3 * size) + ((size - 1) * b4) + (b4 * 2), -2));
            }
            q();
            this.aX = true;
            this.p.d();
            ImageView imageView = this.T;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            if (this.ax.a(hVar.mStickers.get(0))) {
                this.bc = true;
            }
            b(this.bc);
            com.ss.android.ugc.aweme.sticker.model.g gVar = hVar.mStickers.get(0);
            if (com.ss.android.ugc.aweme.aq.a.a.a()) {
                final com.ss.android.ugc.aweme.y.c b5 = com.ss.android.ugc.aweme.aq.a.a.b();
                if (!(b5 == null || b5.s == null || b5.f145310j == null || !b5.f145310j.contains(gVar.id))) {
                    if (!TextUtils.isEmpty(b5.n)) {
                        this.W.setVisibility(0);
                        this.U.setVisibility(0);
                        this.W.setText(b5.n);
                    } else {
                        this.W.setVisibility(8);
                    }
                    this.V.setVisibility(0);
                    v a2 = com.bytedance.lighten.a.r.a(b5.s.f145315a).a("StickerPropDetailFragment");
                    Context context = getContext();
                    e.a aVar = new e.a();
                    aVar.f39831e = com.bytedance.lighten.a.d.c.a(context, 2.0f);
                    aVar.f39828b = com.bytedance.lighten.a.d.c.a(context, 0.0f);
                    a2.w = aVar.a();
                    a2.E = this.V;
                    a2.c();
                    this.U.setOnClickListener(new View.OnClickListener() {
                        /* class com.ss.android.ugc.aweme.prop.b.j.AnonymousClass8 */

                        static {
                            Covode.recordClassIndex(76793);
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            ChallengeDetailLegacyServiceImpl.a().a(j.this.getContext(), b5.s.f145316b);
                        }
                    });
                    this.U.setVisibility(0);
                }
            } else {
                this.U.setVisibility(8);
            }
            com.bytedance.ies.watcher.c.c("sd_start_activity_to_show_header_duration");
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void a(float f2, float f3) {
        this.aG = m.a(f2, f3, this.aG, this);
    }

    @Override // com.ss.android.ugc.aweme.prop.view.a
    public final void a(com.ss.android.ugc.aweme.sticker.model.g gVar, ExceptionResult exceptionResult) {
        if (getActivity() != null) {
            com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.favorites.d.b(gVar));
            a(gVar);
            int errorCode = exceptionResult.getErrorCode();
            if (errorCode == 2004 || errorCode == 2002) {
                new com.bytedance.tux.g.b(this).a(getResources().getString(R.string.br3)).b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout.b, com.ss.android.ugc.aweme.detail.a
    public final void b(int i2, int i3) {
        super.b(i2, i3);
        float f2 = 0.0f;
        if (this.aJ == 0.0f) {
            if (this.r.getVisibility() == 0) {
                this.aJ = (float) (this.r.getBottom() - this.A.getBottom());
            } else if (this.f118241k.getVisibility() == 0) {
                this.aJ = (float) (this.f118241k.getBottom() - this.A.getBottom());
            }
        }
        if (this.aI == 0.0f) {
            this.aI = (float) (this.n.getBottom() - this.A.getBottom());
        }
        float f3 = (float) i2;
        float f4 = this.aJ;
        float f5 = (f3 - f4) / (this.aI - f4);
        if (f5 >= 0.0f) {
            f2 = f5;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        this.A.setAlpha(f2);
        this.z.setAlpha(f2);
        this.n.setAlpha(1.0f - (f3 / this.aI));
        this.O.setAlpha(1.0f - f2);
        CheckableImageView checkableImageView = this.X;
        if (checkableImageView != null) {
            if (((double) f2) == 1.0d) {
                checkableImageView.setVisibility(0);
            } else {
                checkableImageView.setVisibility(8);
            }
        }
        this.aG = m.a(f2, this.aG, this);
    }

    @Override // com.ss.android.ugc.aweme.base.f.a, com.bytedance.ies.uikit.a.b, com.ss.android.ugc.aweme.detail.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int a2 = this.aT.a();
        com.a.a(LayoutInflater.from(getContext()), a2, (ViewGroup) view.findViewById(R.id.bf9), true);
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.e9y);
        this.ba = relativeLayout;
        this.aU.a(relativeLayout);
        this.f118236b = view.findViewById(R.id.e9v);
        this.f118237c = (ViewGroup) view.findViewById(R.id.c5x);
        this.f118238d = (RemoteImageView) view.findViewById(R.id.e9z);
        this.f118239e = (RemoteImageView) view.findViewById(R.id.ebh);
        this.f118240j = (RemoteImageView) view.findViewById(R.id.ebg);
        this.f118241k = (TextView) view.findViewById(R.id.ebi);
        this.f118242l = (TextView) view.findViewById(R.id.f3g);
        this.f118243m = (TextView) view.findViewById(R.id.fcq);
        this.n = view.findViewById(R.id.bez);
        this.o = view.findViewById(R.id.bp0);
        this.p = (DmtStatusView) view.findViewById(R.id.e_o);
        this.q = (RemoteImageView) view.findViewById(R.id.sr);
        this.r = (ViewGroup) view.findViewById(R.id.c8l);
        this.s = (ViewStub) view.findViewById(R.id.fl8);
        this.t = view.findViewById(R.id.eou);
        this.u = (ImageView) view.findViewById(R.id.ls);
        this.N = (RemoteImageView) view.findViewById(R.id.c1l);
        this.O = (RemoteImageView) view.findViewById(R.id.c1m);
        this.P = (GridView) view.findViewById(R.id.eaz);
        this.Q = view.findViewById(R.id.ebe);
        this.R = (CheckableImageView) view.findViewById(R.id.ebf);
        this.S = (TextView) view.findViewById(R.id.f84);
        this.T = (ImageView) view.findViewById(R.id.e0k);
        this.U = (FrameLayout) view.findViewById(R.id.ct);
        this.V = (SmartImageView) view.findViewById(R.id.cu);
        this.W = (TuxTextView) view.findViewById(R.id.al0);
        this.X = (CheckableImageView) view.findViewById(R.id.b0i);
        this.Y = (ViewGroup) view.findViewById(R.id.bd1);
        this.Z = (ViewStub) view.findViewById(R.id.c8z);
        this.aa = (ViewStub) view.findViewById(R.id.ft);
        this.ab = (ViewStub) view.findViewById(R.id.fl1);
        this.ac = (ViewStub) view.findViewById(R.id.c6g);
        this.ad = (ViewStub) view.findViewById(R.id.c8j);
        this.ae = (SpringLayout) view.findViewById(R.id.dk8);
        this.af = (ViewGroup) view.findViewById(R.id.dtd);
        this.ag = (LinearLayout) view.findViewById(R.id.atw);
        this.ah = (RemoteImageView) view.findViewById(R.id.ao5);
        this.ai = (TextView) view.findViewById(R.id.aog);
        this.aj = (TextView) view.findViewById(R.id.aof);
        this.ak = (TextView) view.findViewById(R.id.ao3);
        this.al = (LinearLayout) view.findViewById(R.id.fgq);
        this.am = (TuxTextView) view.findViewById(R.id.f9l);
        this.E = (ImageView) view.findViewById(R.id.qb);
        this.E.setOnClickListener(new m(this));
        this.Q.setOnClickListener(new n(this));
        this.T.setOnClickListener(new o(this));
        this.r.setOnClickListener(new p(this));
        super.onViewCreated(view, bundle);
        getActivity();
        if (!j()) {
            new com.bytedance.tux.g.b(this).e(R.string.de8).b();
        }
        com.ss.android.ugc.aweme.prop.d.a aVar = new com.ss.android.ugc.aweme.prop.d.a(this.aY, TextUtils.equals(this.aA, "from_sticker_master_profile"));
        this.aB = aVar;
        aVar.a_(this);
        this.aZ = CommerceStickerServiceImpl.c().a(this.aa, this.Z, this.ab, this.ac, this.ad);
        MtEmptyView a3 = MtEmptyView.a(getContext());
        a3.setStatus(new d.a(getContext()).a(2131232016).b(R.string.bm3).c(R.string.bm2).f33648a);
        this.p.setBuilder(DmtStatusView.a.a(getContext()).b(a3).b(com.ss.android.ugc.aweme.views.h.a(getContext(), new k(this))));
        this.Q.setVisibility(0);
        this.R.setOnStateChangeListener(new CheckableImageView.a() {
            /* class com.ss.android.ugc.aweme.prop.b.j.AnonymousClass3 */

            static {
                Covode.recordClassIndex(76788);
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void bR_() {
            }

            @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
            public final void a(int i2) {
                if (i2 == 1) {
                    j jVar = j.this;
                    jVar.a(jVar.ap);
                }
            }
        });
        CheckableImageView checkableImageView = this.X;
        if (checkableImageView != null) {
            checkableImageView.setOnStateChangeListener(new CheckableImageView.a() {
                /* class com.ss.android.ugc.aweme.prop.b.j.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(76789);
                }

                @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
                public final void bR_() {
                }

                @Override // com.ss.android.ugc.aweme.music.ui.CheckableImageView.a
                public final void a(int i2) {
                    if (i2 == 1) {
                        j jVar = j.this;
                        jVar.a(jVar.ap);
                    }
                }
            });
            this.X.setOnClickListener(new l(this));
        }
        this.z.setAlpha(0.0f);
        this.z.setOnClickListener(new q(this));
        b bVar = new b(getActivity(), this.aT);
        this.aH = bVar;
        this.P.setAdapter((ListAdapter) bVar);
        this.P.setOnItemClickListener(new r(this));
        this.f118236b.setVisibility(0);
        this.f118237c.setBackground(null);
        if (com.ss.android.ugc.aweme.tux.a.b.a.a()) {
            this.ae.setOnRefreshListener(new s(this));
        } else {
            this.ae.setNestedHeader(null);
            this.ae.setOverScrollMode(com.bytedance.tux.widget.spring.e.NONE);
            this.ae.setScrollMode(com.bytedance.tux.widget.spring.g.NONE);
        }
        a(false);
        this.f118236b.setOnClickListener(this.bb);
        int i2 = this.an;
        AnonymousClass5 r0 = new a() {
            /* class com.ss.android.ugc.aweme.prop.b.j.AnonymousClass5 */

            static {
                Covode.recordClassIndex(76790);
            }

            @Override // com.ss.android.ugc.aweme.prop.b.a
            public final void a(int i2) {
                String str;
                int i3;
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (j.this.ap == null) {
                    str = "";
                } else {
                    str = j.this.ap.id;
                }
                r.a("select_media_type", dVar.a("prop_id", str).a("previous_media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[j.this.an]).a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[i2]).f66730a);
                if (i2 != j.this.an) {
                    j.this.an = i2;
                    TuxTextView tuxTextView = j.this.am;
                    if (j.this.an == 3) {
                        i3 = R.string.c4x;
                    } else {
                        i3 = R.string.rk;
                    }
                    tuxTextView.setText(i3);
                    com.ss.android.ugc.aweme.prop.c.c.f118282b = j.this.an;
                    j.this.a(false);
                }
                try {
                    if (j.this.f118235a != null) {
                        j.this.f118235a.b();
                    }
                } catch (Exception unused) {
                }
            }
        };
        d.f118226b = i2;
        d dVar = new d();
        dVar.f118228a = r0;
        this.f118235a = new a.C1112a().a(dVar).a(1).f45299a;
        this.al.setOnClickListener(new t(this));
    }
}
