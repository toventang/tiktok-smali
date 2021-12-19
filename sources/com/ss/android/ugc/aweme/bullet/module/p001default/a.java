package com.ss.android.ugc.aweme.bullet.module.p001default;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.bullet.c.c.a.k;
import com.ss.android.ugc.aweme.bullet.bridge.ad.AdThirdTrackMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.DownloadAppClickMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.FeedLearnMoreButtonClick;
import com.ss.android.ugc.aweme.bullet.bridge.ad.LoadGeckoResourcesMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.LocalPhoneNoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.MessageTipMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenAdUrlMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.OpenRechargePanel;
import com.ss.android.ugc.aweme.bullet.bridge.ad.SendAdLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.StartFeedButtonAnimationMethod;
import com.ss.android.ugc.aweme.bullet.bridge.ad.VideoFollowButtonClick;
import com.ss.android.ugc.aweme.bullet.bridge.ad.VideoFollowStatus;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.AdInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.AsyncGoodsEditInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.FetchFeedsAwemeDataMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.OpenECommerceLegalModalMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.OpenGoodDetailMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.PayMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.TaoCommandMethod;
import com.ss.android.ugc.aweme.bullet.bridge.commerce.WXMiniPayMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.AppInstalledMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.BdturingMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.BindPhoneMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.BroadcastMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.CloseCurrentPanelMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.CopyContentMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.FetchMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.FileSelectionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GalleryPreviewMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetAbTestMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetNativeItemMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetSettingsMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.GetThemeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.InitPIPOSdkMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.IsAppInstalledMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LaunchChatMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.LoginWithPlatform;
import com.ss.android.ugc.aweme.bullet.bridge.common.LogoutMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.MiniAppPreloadMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.NoticePermissionMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenAdPanelPageMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenCalendarMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenPhoneAreaMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.OpenScanMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.ReloadMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.RequestMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetNativeItemMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.SetScrollTopMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.ShareOpenPlatformMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.ShowDmtToastMethod;
import com.ss.android.ugc.aweme.bullet.bridge.common.UploadFileMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.AppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.BulletGetAppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.BulletUserInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.CloseMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ComponentDidMountMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.DarkModeMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.GetAppInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.GetContainerIdMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsFlowMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.LoadFeedsMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.MonitorLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenAwemeDetailMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenBrowserMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenFeedsFlowMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenHalfDialogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenLongVideoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.OpenShortVideoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.RecordParamMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ReportCustomEventMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePopMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.RoutePushMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.SendLogV3Method;
import com.ss.android.ugc.aweme.bullet.bridge.framework.SetStatusBarMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.ShowToastMethod;
import com.ss.android.ugc.aweme.bullet.bridge.framework.UserInfoMethod;
import com.ss.android.ugc.aweme.bullet.bridge.main.CardRelayoutMethod;
import com.ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.service.IEOYService;
import com.ss.android.ugc.aweme.share.ShareH5Service;
import com.ss.android.ugc.aweme.tcm.impl.anchor.GetContainerDataMethod;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a  reason: invalid package */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f69471a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(42825);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$a  reason: collision with other inner class name */
    public static final class C1569a extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1569a f69472a = new C1569a();

        static {
            Covode.recordClassIndex(42826);
        }

        C1569a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new CloseMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$aa */
    public static final class aa extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final aa f69473a = new aa();

        static {
            Covode.recordClassIndex(42827);
        }

        aa() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new MonitorLogMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ab */
    public static final class ab extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final ab f69474a = new ab();

        static {
            Covode.recordClassIndex(42828);
        }

        ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new OpenSchemaMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ac */
    public static final class ac extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final ac f69475a = new ac();

        static {
            Covode.recordClassIndex(42829);
        }

        ac() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return ShareH5Service.a.a().a(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ad */
    public static final class ad extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final ad f69476a = new ad();

        static {
            Covode.recordClassIndex(42830);
        }

        ad() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return ShareH5Service.a.a().b(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$ae */
    public static final class ae extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final ae f69477a = new ae();

        static {
            Covode.recordClassIndex(42831);
        }

        ae() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new ShowToastMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$b */
    public static final class b extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f69478a = new b();

        static {
            Covode.recordClassIndex(42832);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new OpenBrowserMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$c */
    public static final class c extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f69479a = new c();

        static {
            Covode.recordClassIndex(42833);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new AppInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$d */
    public static final class d extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f69480a = new d();

        static {
            Covode.recordClassIndex(42834);
        }

        d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new GetAppInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$e */
    public static final class e extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f69481a = new e();

        static {
            Covode.recordClassIndex(42835);
        }

        e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new ComponentDidMountMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$f */
    public static final class f extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f69482a = new f();

        static {
            Covode.recordClassIndex(42836);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new LoadFeedsFlowMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$g */
    public static final class g extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f69483a = new g();

        static {
            Covode.recordClassIndex(42837);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new OpenFeedsFlowMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$h */
    public static final class h extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f69484a = new h();

        static {
            Covode.recordClassIndex(42838);
        }

        h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new OpenAwemeDetailMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$i */
    public static final class i extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f69485a = new i();

        static {
            Covode.recordClassIndex(42839);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new LoadFeedsMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$j */
    public static final class j extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f69486a = new j();

        static {
            Covode.recordClassIndex(42840);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new DarkModeMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$k */
    public static final class k extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f69487a = new k();

        static {
            Covode.recordClassIndex(42841);
        }

        k() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new RoutePopMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$l */
    public static final class l extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f69488a = new l();

        static {
            Covode.recordClassIndex(42842);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new UserInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$m */
    public static final class m extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final m f69489a = new m();

        static {
            Covode.recordClassIndex(42843);
        }

        m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new RoutePushMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$n */
    public static final class n extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f69490a = new n();

        static {
            Covode.recordClassIndex(42844);
        }

        n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new OpenShortVideoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$o */
    public static final class o extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f69491a = new o();

        static {
            Covode.recordClassIndex(42845);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new OpenLongVideoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$p */
    public static final class p extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f69492a = new p();

        static {
            Covode.recordClassIndex(42846);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new OpenHalfDialogMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$q */
    public static final class q extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f69493a = new q();

        static {
            Covode.recordClassIndex(42847);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new BulletUserInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$r */
    public static final class r extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f69494a = new r();

        static {
            Covode.recordClassIndex(42848);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new BulletGetAppInfoMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$s */
    public static final class s extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f69495a = new s();

        static {
            Covode.recordClassIndex(42849);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new RecordParamMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$t */
    public static final class t extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f69496a = new t();

        static {
            Covode.recordClassIndex(42850);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new ReportCustomEventMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$u */
    public static final class u extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final u f69497a = new u();

        static {
            Covode.recordClassIndex(42851);
        }

        u() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new GetContainerIdMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$v */
    public static final class v extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final v f69498a = new v();

        static {
            Covode.recordClassIndex(42852);
        }

        v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new LoadGeckoResourcesMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$w */
    public static final class w extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final w f69499a = new w();

        static {
            Covode.recordClassIndex(42853);
        }

        w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new SendLogMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$x */
    public static final class x extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final x f69500a = new x();

        static {
            Covode.recordClassIndex(42854);
        }

        x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new ShareOpenPlatformMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$y */
    public static final class y extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final y f69501a = new y();

        static {
            Covode.recordClassIndex(42855);
        }

        y() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new SetStatusBarMethod(bVar2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.bullet.module.default.a$z */
    public static final class z extends h.f.b.m implements h.f.a.b<com.bytedance.ies.bullet.c.e.a.b, com.bytedance.ies.bullet.c.c.a.k> {

        /* renamed from: a  reason: collision with root package name */
        public static final z f69502a = new z();

        static {
            Covode.recordClassIndex(42856);
        }

        z() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ com.bytedance.ies.bullet.c.c.a.k invoke(com.bytedance.ies.bullet.c.e.a.b bVar) {
            com.bytedance.ies.bullet.c.e.a.b bVar2 = bVar;
            h.f.b.l.d(bVar2, "");
            return new SendLogV3Method(bVar2);
        }
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> e(com.bytedance.ies.bullet.c.e.a.b bVar) {
        return h.a.n.a(new CardRelayoutMethod(bVar));
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> g(com.bytedance.ies.bullet.c.e.a.b bVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DownloadAppClickMethod(bVar));
        arrayList.add(new GetContainerDataMethod(bVar));
        return arrayList;
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> d(com.bytedance.ies.bullet.c.e.a.b bVar) {
        com.ss.android.ugc.aweme.i18n.xbridge.b.a.a();
        com.ss.android.ugc.aweme.i18n.xbridge.c.a.a();
        com.bytedance.ies.xbridge.model.b.c cVar = new com.bytedance.ies.xbridge.model.b.c();
        cVar.a(Context.class, bVar.c(Context.class));
        cVar.a(com.bytedance.ies.bullet.c.e.a.b.class, bVar);
        return com.bytedance.ies.xbridge.platform.a.a.a.a(cVar, bVar, h.a.n.b(new com.bytedance.ies.xbridge.platform.lynx.b(), new com.bytedance.ies.xbridge.platform.b.c()));
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> f(com.bytedance.ies.bullet.c.e.a.b bVar) {
        return h.a.n.b(new AsyncGoodsEditInfoMethod(bVar), new OpenGoodDetailMethod(bVar), new FetchFeedsAwemeDataMethod(bVar), new PayMethod(bVar), new WXMiniPayMethod(bVar), new OpenECommerceLegalModalMethod(bVar), new TaoCommandMethod(bVar), new AdInfoMethod(bVar), new CloseCurrentPanelMethod(bVar));
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> h(com.bytedance.ies.bullet.c.e.a.b bVar) {
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.web.a.a aVar = (com.bytedance.ies.web.a.a) bVar.c(com.bytedance.ies.web.a.a.class);
        Object c2 = bVar.c(Context.class);
        if (!(aVar == null || c2 == null)) {
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "openAweme", new com.ss.android.ugc.aweme.web.jsbridge.e(new WeakReference(c2), aVar), k.a.PROTECT));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "openRecord", new com.ss.android.ugc.aweme.web.jsbridge.aa(new WeakReference(c2), aVar), k.a.PROTECT));
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "downloadMedia", new DownloadFileMethod(aVar).attach(new WeakReference<>(c2)), k.a.PROTECT));
        }
        return arrayList;
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> i(com.bytedance.ies.bullet.c.e.a.b bVar) {
        Map<String, com.bytedance.ies.web.a.d> javaMethods;
        ArrayList arrayList = new ArrayList();
        com.bytedance.ies.web.a.a aVar = (com.bytedance.ies.web.a.a) bVar.c(com.bytedance.ies.web.a.a.class);
        Object c2 = bVar.c(Context.class);
        if (!(aVar == null || c2 == null || (javaMethods = com.ss.android.ugc.aweme.account.b.h().getJavaMethods(new WeakReference<>(c2), aVar)) == null)) {
            for (Map.Entry<String, com.bytedance.ies.web.a.d> entry : javaMethods.entrySet()) {
                if (!TextUtils.equals(entry.getKey(), "localPhoneNo")) {
                    String key = entry.getKey();
                    h.f.b.l.b(key, "");
                    com.bytedance.ies.web.a.d value = entry.getValue();
                    h.f.b.l.b(value, "");
                    arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, key, value));
                }
            }
        }
        arrayList.add(new LocalPhoneNoMethod(bVar));
        return arrayList;
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> j(com.bytedance.ies.bullet.c.e.a.b bVar) {
        ArrayList arrayList = new ArrayList();
        Object c2 = bVar.c(com.bytedance.ies.web.a.a.class);
        Object c3 = bVar.c(Context.class);
        if (!(c2 == null || c3 == null)) {
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "copyToClipboard", new com.ss.android.sdk.webview.a.d(new WeakReference(c3)), k.a.PROTECT));
            if (SettingsManager.a().a("jsb_open_third_app", false)) {
                arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "openThirdApp", new com.ss.android.sdk.webview.a.h(new WeakReference(c3)), k.a.PROTECT));
            }
            arrayList.add(com.ss.android.ugc.aweme.bullet.utils.b.a(bVar, "open", new com.ss.android.sdk.webview.a.g(new WeakReference(c3)), k.a.PROTECT));
        }
        return arrayList;
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> k(com.bytedance.ies.bullet.c.e.a.b bVar) {
        return h.a.n.b(new SendAdLogMethod(bVar), new MessageTipMethod(bVar), new OpenAdUrlMethod(bVar), new AdThirdTrackMethod(bVar), new StartFeedButtonAnimationMethod(bVar), new FeedLearnMoreButtonClick(bVar), new VideoFollowButtonClick(bVar), new VideoFollowStatus(bVar));
    }

    public static List<com.bytedance.ies.bullet.c.c.a.k> a(com.bytedance.ies.bullet.c.e.a.b bVar) {
        List<com.bytedance.ies.bullet.c.c.a.k> list;
        h.f.b.l.d(bVar, "");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c(bVar));
        arrayList.addAll(d(bVar));
        arrayList.addAll(b(bVar));
        arrayList.addAll(e(bVar));
        List<com.bytedance.ies.bullet.c.c.a.k> a2 = MusicService.m().a(bVar);
        h.f.b.l.b(a2, "");
        arrayList.addAll(a2);
        arrayList.addAll(com.ss.android.ugc.aweme.search.h.f121133a.a(bVar));
        arrayList.addAll(f(bVar));
        arrayList.addAll(g(bVar));
        arrayList.addAll(ECommerceLiveBridgeMethodServiceImpl.a().a(bVar));
        arrayList.addAll(h(bVar));
        arrayList.addAll(i(bVar));
        arrayList.addAll(j(bVar));
        arrayList.addAll(k(bVar));
        arrayList.addAll(com.ss.android.ugc.aweme.bullet.bridge.a.a.a(bVar));
        arrayList.addAll(ECommerceService.createIECommerceServicebyMonsterPlugin(false).getJSMethods(bVar));
        arrayList.addAll(ShoppingAdsServiceImpl.d().a(bVar));
        IEOYService b2 = EOYServiceImpl.b();
        if (b2 == null || (list = b2.a(bVar)) == null) {
            list = h.a.z.INSTANCE;
        }
        arrayList.addAll(list);
        return arrayList;
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> b(com.bytedance.ies.bullet.c.e.a.b bVar) {
        return h.a.n.b(new BridgeProxy("close", bVar, C1569a.f69472a), new BridgeProxy("userInfo", bVar, l.f69488a), new BridgeProxy("sendLog", bVar, w.f69499a), new BridgeProxy("sendLogV3", bVar, z.f69502a), new BridgeProxy("monitorLog", bVar, aa.f69473a), new BridgeProxy("openSchema", bVar, ab.f69474a), new BridgeProxy("share", bVar, ac.f69475a), new BridgeProxy("shareSearch", bVar, ad.f69476a), new BridgeProxy("showToast", bVar, ae.f69477a), new BridgeProxy("openBrowser", bVar, b.f69478a), new BridgeProxy("appInfo", bVar, c.f69479a), new BridgeProxy("getAppInfo", bVar, d.f69480a), new BridgeProxy("componentDidMount", bVar, e.f69481a), new BridgeProxy("loadFeedsFlow", bVar, f.f69482a), new BridgeProxy("openFeedsFlow", bVar, g.f69483a), new BridgeProxy("openAwemeDetail", bVar, h.f69484a), new BridgeProxy("loadFeeds", bVar, i.f69485a), new BridgeProxy("darkMode", bVar, j.f69486a), new BridgeProxy("routePop", bVar, k.f69487a), new BridgeProxy("routePush", bVar, m.f69489a), new BridgeProxy("open_short_video", bVar, n.f69490a), new BridgeProxy("open_long_video", bVar, o.f69491a), new BridgeProxy("openHalfDialog", bVar, p.f69492a), new BridgeProxy("uniUserInfo", bVar, q.f69493a), new BridgeProxy("uniAppInfo", bVar, r.f69494a), new BridgeProxy("openRecord", bVar, s.f69495a), new BridgeProxy("reportCustomEvent", bVar, t.f69496a), new BridgeProxy("getContainerId", bVar, u.f69497a), new BridgeProxy("loadGeckoResources", bVar, v.f69498a), new BridgeProxy("shareOpenPlatform", bVar, x.f69500a), new BridgeProxy("setStatusBar", bVar, y.f69501a));
    }

    private static List<com.bytedance.ies.bullet.c.c.a.k> c(com.bytedance.ies.bullet.c.e.a.b bVar) {
        return h.a.n.b(new FetchMethod(bVar), new RequestMethod(bVar), new GetNativeItemMethod(bVar), new SetNativeItemMethod(bVar), new GetSettingsMethod(bVar), new BroadcastMethod(bVar), new InitPIPOSdkMethod(bVar), new SetScrollTopMethod(bVar), new ShowDmtToastMethod(bVar), new OpenBrowserMethod(bVar), new UploadFileMethod(bVar), new GalleryPreviewMethod(bVar), new OpenScanMethod(bVar), new FileSelectionMethod(bVar), new BindPhoneMethod(bVar), new IsAppInstalledMethod(bVar), new NoticePermissionMethod(bVar), new LoginMethod(bVar), new LoginWithPlatform(bVar), new LogoutMethod(bVar), new MiniAppPreloadMethod(bVar), new OpenPhoneAreaMethod(bVar), new OpenRechargePanel(bVar), new GetAbTestMethod(bVar), new ReloadMethod(bVar), new CopyContentMethod(bVar), new GetThemeMethod(bVar), new OpenAdPanelPageMethod(bVar), new OpenCalendarMethod(bVar), new BdturingMethod(bVar), new LaunchChatMethod(bVar), new AppInstalledMethod(bVar));
    }
}
