package com.ss.android.ugc.aweme.feed.assem.avatar;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.callback.b;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.assem.arch.extensions.p;
import com.bytedance.assem.arch.extensions.q;
import com.bytedance.assem.arch.extensions.r;
import com.bytedance.assem.arch.extensions.s;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.commercialize.utils.bo;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.feed.AvatarImageWithLive;
import com.ss.android.ugc.aweme.feed.adapter.VideoEventDispatchViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.bb;
import com.ss.android.ugc.aweme.feed.adapter.bd;
import com.ss.android.ugc.aweme.feed.af;
import com.ss.android.ugc.aweme.feed.assem.avatar.a;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.ss.android.ugc.aweme.feed.ui.LiveCircleView;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.ss.android.ugc.aweme.utils.em;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.f.b.ab;
import h.z;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class i implements com.bytedance.assem.arch.viewModel.f<a> {

    /* renamed from: a  reason: collision with root package name */
    SmartAvatarBorderView f92029a;

    /* renamed from: b  reason: collision with root package name */
    AvatarImageWithLive f92030b;

    /* renamed from: c  reason: collision with root package name */
    LiveCircleView f92031c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.feed.ui.d f92032d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f92033e;

    /* renamed from: f  reason: collision with root package name */
    public final g f92034f = new g(this);

    /* renamed from: g  reason: collision with root package name */
    public final Context f92035g;

    /* renamed from: h  reason: collision with root package name */
    public final a f92036h;

    /* renamed from: i  reason: collision with root package name */
    private final h.h f92037i;

    /* renamed from: j  reason: collision with root package name */
    private final h.h f92038j;

    public static final class a extends h.f.b.m implements h.f.a.b<bb, bb> {
        public static final a INSTANCE = new a();

        static {
            Covode.recordClassIndex(57968);
        }

        public a() {
            super(1);
        }

        public final bb invoke(bb bbVar) {
            h.f.b.l.c(bbVar, "");
            return bbVar;
        }
    }

    public static final class d extends h.f.b.m implements h.f.a.b<bd, bd> {
        public static final d INSTANCE = new d();

        static {
            Covode.recordClassIndex(57971);
        }

        public d() {
            super(1);
        }

        public final bd invoke(bd bdVar) {
            h.f.b.l.c(bdVar, "");
            return bdVar;
        }
    }

    static {
        Covode.recordClassIndex(57967);
    }

    /* access modifiers changed from: package-private */
    public final VideoEventDispatchViewModel a() {
        return (VideoEventDispatchViewModel) this.f92037i.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j> void a(AssemViewModel<S> assemViewModel, com.bytedance.assem.arch.viewModel.k<S> kVar, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super a, ? super S, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(mVar, "");
        this.f92036h.a(assemViewModel, kVar, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super a, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        this.f92036h.a(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, com.bytedance.assem.arch.viewModel.k<q<A, B>> kVar3, h.f.a.b<? super Throwable, z> bVar, h.f.a.q<? super a, ? super A, ? super B, z> qVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(qVar, "");
        this.f92036h.a(assemViewModel, kVar, kVar2, kVar3, bVar, qVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, com.bytedance.assem.arch.viewModel.k<r<A, B, C>> kVar4, h.f.a.b<? super Throwable, z> bVar, h.f.a.r<? super a, ? super A, ? super B, ? super C, z> rVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(rVar, "");
        this.f92036h.a(assemViewModel, kVar, kVar2, kVar3, kVar4, bVar, rVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A, B, C, D> void a(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, h.k.k<S, ? extends B> kVar2, h.k.k<S, ? extends C> kVar3, h.k.k<S, ? extends D> kVar4, com.bytedance.assem.arch.viewModel.k<s<A, B, C, D>> kVar5, h.f.a.b<? super Throwable, z> bVar, h.f.a.s<? super a, ? super A, ? super B, ? super C, ? super D, z> sVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(kVar3, "");
        h.f.b.l.d(kVar4, "");
        h.f.b.l.d(kVar5, "");
        h.f.b.l.d(sVar, "");
        this.f92036h.a(assemViewModel, kVar, kVar2, kVar3, kVar4, kVar5, bVar, sVar);
    }

    /* access modifiers changed from: package-private */
    public final VideoPlayViewModel b() {
        return (VideoPlayViewModel) this.f92038j.getValue();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final <S extends com.bytedance.assem.arch.viewModel.j, A> void b(AssemViewModel<S> assemViewModel, h.k.k<S, ? extends A> kVar, com.bytedance.assem.arch.viewModel.k<p<A>> kVar2, h.f.a.b<? super Throwable, z> bVar, h.f.a.m<? super a, ? super A, z> mVar) {
        h.f.b.l.d(assemViewModel, "");
        h.f.b.l.d(kVar, "");
        h.f.b.l.d(kVar2, "");
        h.f.b.l.d(mVar, "");
        this.f92036h.b(assemViewModel, kVar, kVar2, bVar, mVar);
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.f getActualLifecycleOwnerHolder() {
        return this.f92036h.getActualLifecycleOwnerHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final com.bytedance.tiktok.proxy.h<a> getActualReceiverHolder() {
        return this.f92036h.getActualReceiverHolder();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getHasSubscribedForReused() {
        return this.f92036h.getHasSubscribedForReused();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final androidx.lifecycle.m getHostLifecycleOwner() {
        return this.f92036h.getHostLifecycleOwner();
    }

    @Override // com.bytedance.assem.arch.viewModel.f
    public final boolean getUniqueOnlyDefault() {
        return this.f92036h.getUniqueOnlyDefault();
    }

    public static final class b extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bb>> {
        public static final b INSTANCE = new b();

        static {
            Covode.recordClassIndex(57969);
        }

        public b() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bb> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class c extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final c INSTANCE = new c();

        static {
            Covode.recordClassIndex(57970);
        }

        public c() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.a<com.bytedance.assem.jedi_vm.viewModel.b<bd>> {
        public static final e INSTANCE = new e();

        static {
            Covode.recordClassIndex(57972);
        }

        public e() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.jedi_vm.viewModel.b<bd> invoke() {
            return new com.bytedance.assem.jedi_vm.viewModel.b<>();
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.a<com.bytedance.assem.arch.viewModel.c> {
        public static final f INSTANCE = new f();

        static {
            Covode.recordClassIndex(57973);
        }

        public f() {
            super(0);
        }

        @Override // h.f.a.a
        public final com.bytedance.assem.arch.viewModel.c invoke() {
            return new com.bytedance.assem.arch.viewModel.c();
        }
    }

    /* Return type fixed from 'com.bytedance.tiktok.proxy.d' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.f
    public final /* bridge */ /* synthetic */ a getReceiverForHostVM() {
        return (a) this.f92036h.getReceiverForHostVM();
    }

    public static final class g implements f.a.d.f<com.ss.android.ugc.aweme.live.feedpage.d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f92039a;

        static {
            Covode.recordClassIndex(57974);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        g(i iVar) {
            this.f92039a = iVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.d.f
        public final /* synthetic */ void accept(com.ss.android.ugc.aweme.live.feedpage.d dVar) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            com.ss.android.ugc.aweme.live.feedpage.d dVar2 = dVar;
            if (dVar2 != null && (videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92039a.f92036h)) != null && (aweme = videoItemParams.mAweme) != null && !(!h.f.b.l.a((Object) String.valueOf(dVar2.f108377a), (Object) aweme.getAuthorUid()))) {
                aweme.getAuthor().roomId = dVar2.f108378b;
                if (!a.C2220a.b(aweme)) {
                    i.a(this.f92039a).a(aweme.getAuthor(), getClass(), this, aweme);
                }
            }
        }
    }

    public static final /* synthetic */ com.ss.android.ugc.aweme.feed.ui.d a(i iVar) {
        com.ss.android.ugc.aweme.feed.ui.d dVar = iVar.f92032d;
        if (dVar == null) {
            h.f.b.l.a("avatarBorderViewController");
        }
        return dVar;
    }

    public static final class h extends com.bytedance.android.livesdk.callback.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f92040b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f92041c;

        static {
            Covode.recordClassIndex(57975);
        }

        @Override // com.bytedance.android.livesdk.callback.b
        public final void a(Map<String, Object> map) {
            Object obj;
            String str;
            String str2;
            HashMap<String, String> hashMap = null;
            if (map != null) {
                obj = map.get("audience_live_play_enter_room_config");
            } else {
                obj = null;
            }
            if (!(obj instanceof EnterRoomConfig)) {
                obj = null;
            }
            EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
            if (enterRoomConfig != null) {
                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.f23299c;
                if (roomsData != null) {
                    hashMap = roomsData.f23333l;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.f23299c;
                if (roomsData2 != null && roomsData2.o) {
                    String str3 = this.f92040b;
                    String str4 = "";
                    if (hashMap == null || (str = hashMap.get("value")) == null) {
                        str = str4;
                    }
                    h.f.b.l.b(str, str4);
                    if (!(hashMap == null || (str2 = hashMap.get("log_extra")) == null)) {
                        str4 = str2;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("live_ad", str3, str, str4, "0").a("room_id", map.get("audience_live_play_room_id")).b();
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str, long j2, long j3) {
            super(j3);
            this.f92040b = str;
            this.f92041c = j2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.feed.assem.avatar.i$i  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2222i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f92042a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ VideoItemParams f92043b;

        static {
            Covode.recordClassIndex(57976);
        }

        View$OnClickListenerC2222i(i iVar, VideoItemParams videoItemParams) {
            this.f92042a = iVar;
            this.f92043b = videoItemParams;
        }

        public final void onClick(View view) {
            int i2;
            String str;
            com.bytedance.ies.ugc.aweme.commercialize.scene.api.d.a c2;
            ClickAgent.onClick(view);
            final Aweme aweme = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92042a.f92036h)).mAweme;
            final DataCenter dataCenter = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92042a.f92036h)).dataCenter;
            if (!in.d() && !com.ss.android.ugc.aweme.login.b.a.a(aweme)) {
                if ((!h.f.b.l.a((Object) ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92042a.f92036h)).mEventType, (Object) "new_ad_fake_user")) && com.ss.android.ugc.aweme.commercialize.e.a.b.E(aweme)) {
                    h.f.b.l.b(aweme, "");
                    if (!aweme.isAd()) {
                        return;
                    }
                }
                h.f.b.l.b(aweme, "");
                if (!aweme.isCanPlay() || aweme.isDelete()) {
                    com.ss.android.ugc.aweme.tux.a.i.a aVar = new com.ss.android.ugc.aweme.tux.a.i.a(this.f92042a.f92035g);
                    if (aweme.isImage()) {
                        i2 = R.string.cjs;
                    } else {
                        i2 = R.string.har;
                    }
                    aVar.a(i2).a();
                    return;
                }
                IAdSceneService f2 = AdSceneServiceImpl.f();
                if (!(f2 == null || (c2 = f2.c()) == null)) {
                    c2.a(aweme, this.f92042a.f92035g);
                }
                u a2 = new u().a("homepage_hot");
                a2.f109596a = u.c.ITEM;
                a2.f109597b = u.a.ENTER_PROFILE;
                u a3 = a2.g(aweme).a(aweme.getAuthor());
                User author = aweme.getAuthor();
                h.f.b.l.b(author, "");
                a3.s(author.getRequestId()).b();
                com.ss.android.ugc.aweme.feed.s.a(af.PROFILE);
                JSONObject jSONObject = ((VideoItemParams) com.bytedance.assem.arch.b.l.a(this.f92042a.f92036h)).mRequestId;
                if (jSONObject == null || (str = jSONObject.optString("request_id")) == null) {
                    str = aweme.getRequestId();
                }
                aweme.setRequestId(str);
                if (dataCenter != null) {
                    dataCenter.a("feed_internal_event", new ag(19, aweme));
                }
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.w(aweme)) {
                    com.ss.android.ugc.aweme.commercialize.g.c().a(this.f92042a.f92035g, aweme, new bo(this) {
                        /* class com.ss.android.ugc.aweme.feed.assem.avatar.i.View$OnClickListenerC2222i.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ View$OnClickListenerC2222i f92044a;

                        static {
                            Covode.recordClassIndex(57977);
                        }

                        @Override // com.ss.android.ugc.aweme.commercialize.utils.bo
                        public final void a() {
                            String str;
                            String str2;
                            String str3;
                            DataCenter dataCenter = dataCenter;
                            if (dataCenter != null) {
                                dataCenter.a("to_profile", "");
                            }
                            com.ss.android.ugc.aweme.metrics.q c2 = new com.ss.android.ugc.aweme.metrics.q().c(aweme, this.f92044a.f92043b.mPageType);
                            String str4 = this.f92044a.f92043b.mEventType;
                            if (str4 == null) {
                                str4 = "";
                            }
                            com.ss.android.ugc.aweme.metrics.q qVar = (com.ss.android.ugc.aweme.metrics.q) c2.o(str4).a(this.f92044a.f92042a.f92035g);
                            DataCenter dataCenter2 = dataCenter;
                            String str5 = null;
                            if (dataCenter2 != null) {
                                str = (String) dataCenter2.b("playlist_type", "");
                            } else {
                                str = null;
                            }
                            qVar.t = str;
                            DataCenter dataCenter3 = dataCenter;
                            if (dataCenter3 != null) {
                                str2 = (String) dataCenter3.b("playlist_id", "");
                            } else {
                                str2 = null;
                            }
                            qVar.v = str2;
                            DataCenter dataCenter4 = dataCenter;
                            if (dataCenter4 != null) {
                                str3 = (String) dataCenter4.b("playlist_id_key", "");
                            } else {
                                str3 = null;
                            }
                            qVar.u = str3;
                            DataCenter dataCenter5 = dataCenter;
                            if (dataCenter5 != null) {
                                str5 = (String) dataCenter5.b("tab_name", "");
                            }
                            ((com.ss.android.ugc.aweme.metrics.a) qVar.c(str5).d(ac.b(aweme, this.f92044a.f92043b.mPageType))).a("click_head").l(FeedParamProvider.a.a(this.f92044a.f92042a.f92035g).getSearchId()).f(FeedParamProvider.a.a(this.f92044a.f92042a.f92035g).getSearchResultId()).f();
                        }

                        {
                            this.f92044a = r1;
                        }
                    });
                    return;
                }
                String a4 = RequestIdService.a().a(aweme, this.f92043b.mPageType);
                if (TextUtils.equals(this.f92043b.mEventType, "homepage_hot")) {
                    User author2 = aweme.getAuthor();
                    h.f.b.l.b(author2, "");
                    com.ss.android.ugc.aweme.story.live.d.b(a4, author2.getUid(), aweme.getAuthor().roomId, aweme.getAid());
                } else if (TextUtils.equals(this.f92043b.mEventType, "homepage_follow")) {
                    User author3 = aweme.getAuthor();
                    h.f.b.l.b(author3, "");
                    com.ss.android.ugc.aweme.story.live.d.a(a4, author3.getUid(), aweme.getAuthor().roomId, aweme.getAid());
                } else {
                    String a5 = com.ss.android.ugc.aweme.feed.helper.f.a(this.f92043b.mEventType, this.f92043b.isMyProfile);
                    User author4 = aweme.getAuthor();
                    h.f.b.l.b(author4, "");
                    com.ss.android.ugc.aweme.story.live.d.a(1, a5, a4, author4.getUid(), aweme.getAuthor().roomId);
                }
                EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f23298b.f23311c = aweme.getAid();
                if (com.ss.android.ugc.aweme.commercialize.e.a.b.s(aweme)) {
                    com.ss.android.ugc.aweme.commercialize.live.service.a.a(aweme, enterRoomConfig, 52);
                }
                enterRoomConfig.f23299c.J = this.f92043b.mEventType;
                enterRoomConfig.f23299c.L = "video_head";
                enterRoomConfig.f23298b.f23312d = aweme.getAid();
                enterRoomConfig.f23298b.f23313e = "video";
                ILiveOuterService s = LiveOuterService.s();
                h.f.b.l.b(s, "");
                s.i().a(this.f92042a.f92035g, aweme.getAuthor(), enterRoomConfig);
                i.a(10000, "live_duration_10s");
                i.a(30000, "live_duration_30s");
                i.a(60000, "live_duration_60s");
            }
        }
    }

    public final void a(VideoItemParams videoItemParams) {
        boolean z;
        UrlModel urlModel;
        User author;
        h.f.b.l.d(videoItemParams, "");
        Aweme aweme = videoItemParams.mAweme;
        h.f.b.l.b(aweme, "");
        boolean a2 = a.C2220a.a(aweme);
        boolean b2 = a.C2220a.b(videoItemParams.mAweme);
        AvatarImageWithLive avatarImageWithLive = this.f92030b;
        if (avatarImageWithLive == null) {
            h.f.b.l.a("avatarLiveView");
        }
        if (a2 || !b2) {
            z = false;
        } else {
            z = true;
        }
        avatarImageWithLive.a(z);
        StringBuilder sb = new StringBuilder("FeedAvatarView_");
        Aweme aweme2 = videoItemParams.mAweme;
        h.f.b.l.b(aweme2, "");
        String sb2 = sb.append(aweme2.getAid()).toString();
        int dimension = (int) this.f92035g.getResources().getDimension(R.dimen.fw);
        Aweme aweme3 = videoItemParams.mAweme;
        AvatarImageWithLive avatarImageWithLive2 = this.f92030b;
        if (avatarImageWithLive2 == null) {
            h.f.b.l.a("avatarLiveView");
        }
        if (br.a(aweme3, avatarImageWithLive2.getAvatarImageView())) {
            com.ss.android.ugc.aweme.commercialize.g.h().a(br.b(videoItemParams.mAweme));
        } else {
            AvatarImageWithLive avatarImageWithLive3 = this.f92030b;
            if (avatarImageWithLive3 == null) {
                h.f.b.l.a("avatarLiveView");
            }
            SmartAvatarBorderView avatarImageView = avatarImageWithLive3.getAvatarImageView();
            Aweme aweme4 = videoItemParams.mAweme;
            if (aweme4 == null || (author = aweme4.getAuthor()) == null) {
                urlModel = null;
            } else {
                urlModel = author.getAvatarThumb();
            }
            avatarImageView.a(urlModel, em.a(101), dimension, dimension, sb2);
        }
        AvatarImageWithLive avatarImageWithLive4 = this.f92030b;
        if (avatarImageWithLive4 == null) {
            h.f.b.l.a("avatarLiveView");
        }
        avatarImageWithLive4.setOnClickListener(new View$OnClickListenerC2222i(this, videoItemParams));
        com.ss.android.ugc.aweme.feed.ui.d dVar = this.f92032d;
        if (dVar == null) {
            h.f.b.l.a("avatarBorderViewController");
        }
        Aweme aweme5 = videoItemParams.mAweme;
        h.f.b.l.b(aweme5, "");
        dVar.a(aweme5.getAuthor(), getClass(), this.f92034f, videoItemParams.mAweme);
    }

    static final class j extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(57978);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(aVar2, "");
            if (this.this$0.f92033e) {
                i.a(this.this$0).d();
                this.this$0.f92033e = false;
            }
            return z.f158842a;
        }
    }

    public static void a(long j2, String str) {
        ILiveOuterService s = LiveOuterService.s();
        h.f.b.l.b(s, "");
        s.d().a(b.a.AUDIENCE_LIVE_PLAY_DURATION, new h(str, j2, j2));
    }

    static final class n extends h.f.b.m implements h.f.a.m<a, com.bytedance.assem.arch.extensions.a<? extends Boolean>, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(57983);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.assem.arch.extensions.a<? extends Boolean> aVar2) {
            Aweme aweme;
            a aVar3 = aVar;
            h.f.b.l.d(aVar3, "");
            h.f.b.l.d(aVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (!aweme.isLive() && aweme.getStreamUrlModel() == null))) {
                i.a(this.this$0).c();
                this.this$0.f92033e = true;
            }
            return z.f158842a;
        }
    }

    public i(Context context, a aVar) {
        h.f.b.l.d(context, "");
        h.f.b.l.d(aVar, "");
        this.f92035g = context;
        this.f92036h = aVar;
        this.f92037i = new com.bytedance.ext_power_list.g(ab.a(VideoEventDispatchViewModel.class), aVar, b.INSTANCE, c.INSTANCE, a.INSTANCE);
        this.f92038j = new com.bytedance.ext_power_list.g(ab.a(VideoPlayViewModel.class), aVar, e.INSTANCE, f.INSTANCE, d.INSTANCE);
    }

    static final class l extends h.f.b.m implements h.f.a.m<a, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(57981);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar2) {
            Aweme aweme;
            User author;
            a aVar3 = aVar;
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.a aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null || aVar4 == null || aVar4.f34874a != 3 || !com.ss.android.ugc.aweme.commercialize.e.a.b.w(aweme) || com.ss.android.ugc.aweme.commercialize.e.a.b.x(aweme))) {
                i.a(this.this$0).a(author, aVar3.getClass(), this.this$0.f92034f, aweme);
            }
            return z.f158842a;
        }
    }

    static final class m extends h.f.b.m implements h.f.a.m<a, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(57982);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar) {
            Aweme aweme;
            User author;
            String str;
            a aVar2 = aVar;
            com.bytedance.ies.ugc.aweme.commercialize.splash.topview.g gVar2 = gVar;
            h.f.b.l.d(aVar2, "");
            VideoItemParams videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar2);
            if (!(videoItemParams == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null)) {
                if (gVar2 != null) {
                    str = gVar2.f34887a;
                } else {
                    str = null;
                }
                if (h.f.b.l.a((Object) str, (Object) aweme.getAid())) {
                    i.a(this.this$0).a(author, aVar2.getClass(), this.this$0.f92034f, aweme);
                }
            }
            return z.f158842a;
        }
    }

    static final class k extends h.f.b.m implements h.f.a.m<a, com.bytedance.android.live.base.a.a, z> {
        final /* synthetic */ i this$0;

        static {
            Covode.recordClassIndex(57979);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(i iVar) {
            super(2);
            this.this$0 = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(a aVar, com.bytedance.android.live.base.a.a aVar2) {
            VideoItemParams videoItemParams;
            Aweme aweme;
            User author;
            a aVar3 = aVar;
            com.bytedance.android.live.base.a.a aVar4 = aVar2;
            h.f.b.l.d(aVar3, "");
            if (!(aVar4 == null || (videoItemParams = (VideoItemParams) com.bytedance.assem.arch.b.l.a(aVar3)) == null || (aweme = videoItemParams.mAweme) == null || (author = aweme.getAuthor()) == null || (!h.f.b.l.a((Object) String.valueOf(aVar4.f7363b), (Object) author.getUid())))) {
                a aVar5 = a.f92047a;
                if (aVar4.f7364c) {
                    if (author.roomId != 0) {
                        com.ss.android.ugc.aweme.live.feedpage.c liveStateManager = BusinessComponentServiceUtils.getLiveStateManager();
                        String uid = author.getUid();
                        h.f.b.l.b(uid, "");
                        liveStateManager.a(Long.parseLong(uid));
                        String uid2 = author.getUid();
                        h.f.b.l.b(uid2, "");
                        aVar5.invoke(false, 0L, uid2);
                    }
                    author.roomId = 0;
                } else if (aVar4.f7362a != 0) {
                    if (author.roomId == 0) {
                        com.ss.android.ugc.aweme.live.feedpage.c liveStateManager2 = BusinessComponentServiceUtils.getLiveStateManager();
                        String uid3 = author.getUid();
                        h.f.b.l.b(uid3, "");
                        liveStateManager2.a(Long.parseLong(uid3));
                        Long valueOf = Long.valueOf(aVar4.f7362a);
                        String uid4 = author.getUid();
                        h.f.b.l.b(uid4, "");
                        aVar5.invoke(true, valueOf, uid4);
                    }
                    author.roomId = aVar4.f7362a;
                }
                com.ss.android.ugc.aweme.commercialize.e.a.b.ad(aweme);
                i.a(this.this$0).a(author, aVar3.getClass(), this.this$0.f92034f, aweme);
            }
            return z.f158842a;
        }

        static final class a extends h.f.b.m implements h.f.a.q<Boolean, Long, String, z> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f92047a = new a();

            static {
                Covode.recordClassIndex(57980);
            }

            a() {
                super(3);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
            @Override // h.f.a.q
            public final /* synthetic */ z invoke(Boolean bool, Long l2, String str) {
                String str2;
                boolean booleanValue = bool.booleanValue();
                long longValue = l2.longValue();
                String str3 = str;
                h.f.b.l.d(str3, "");
                com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("action_type", "click").a("anchor_id", str3.toString()).a("room_id", String.valueOf(longValue)).a("enter_from_merge", "homepage_hot").a("enter_method", "video_head");
                if (booleanValue) {
                    str2 = "live_on";
                } else {
                    str2 = "live_off";
                }
                com.ss.android.ugc.aweme.common.r.a("livesdk_live_status_change", a2.a("status", str2).f66730a);
                return z.f158842a;
            }
        }
    }
}
