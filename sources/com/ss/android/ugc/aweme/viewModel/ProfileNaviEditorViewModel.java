package com.ss.android.ugc.aweme.viewModel;

import android.content.Context;
import android.os.Build;
import com.bef.effectsdk.BEFEffectNative;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.af;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.NaviEffectNetworkerImpl;
import com.ss.android.ugc.aweme.common.aa;
import com.ss.android.ugc.aweme.common.ab;
import com.ss.android.ugc.aweme.common.y;
import com.ss.android.ugc.aweme.model.k;
import com.ss.android.ugc.aweme.model.v;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.effectmanager.DownloadableModelConfig;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.EffectConfiguration;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.link.model.host.Host;
import h.f.b.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class ProfileNaviEditorViewModel extends BaseJediViewModel<ProfileNaviEditorState> implements MessageCenter.Listener, aa, ICheckChannelListener, IFetchEffectChannelListener {

    /* renamed from: a  reason: collision with root package name */
    public boolean f144335a;

    /* renamed from: b  reason: collision with root package name */
    private final String f144336b = "NaviEditorViewModel";

    /* renamed from: c  reason: collision with root package name */
    private final int f144337c = 66667;

    /* renamed from: d  reason: collision with root package name */
    private final int f144338d = 66666;

    /* renamed from: e  reason: collision with root package name */
    private final int f144339e = 8192;

    /* renamed from: f  reason: collision with root package name */
    private final int f144340f = 7;

    /* renamed from: g  reason: collision with root package name */
    private final int f144341g = 66666;

    /* renamed from: k  reason: collision with root package name */
    private final String f144342k = "142710f02c3a11e8b42429f14557854a";

    /* renamed from: l  reason: collision with root package name */
    private final String f144343l = "test";

    /* renamed from: m  reason: collision with root package name */
    private final String f144344m = "Navi";
    private final String n = "navi";
    private final String o = "ui";
    private final String p = "tiktok";
    private final String q = "categories";
    private final String r = "tabs";
    private final String s = "head";
    private String t = BEFEffectNative.getEffectSDKVersion();
    private EffectManager u;

    static {
        Covode.recordClassIndex(94482);
    }

    public final void a(Effect effect, EffectChannelResponse effectChannelResponse) {
        com.google.gson.o a2 = a(effect);
        if (a2 != null) {
            h.f.b.l.d(a2, "");
            try {
                if (a2.b("animations")) {
                    com.google.gson.l c2 = a2.c("animations");
                    h.f.b.l.b(c2, "");
                    com.google.gson.i k2 = c2.k();
                    if (k2.a() > 0) {
                        com.google.gson.l a3 = k2.a(0);
                        h.f.b.l.b(a3, "");
                        com.google.gson.o j2 = a3.j();
                        if (j2.b("key") && j2.b(StringSet.name)) {
                            com.google.gson.l c3 = j2.c("key");
                            h.f.b.l.b(c3, "");
                            String c4 = c3.c();
                            h.f.b.l.b(c4, "");
                            ab.f76385a = c4;
                            com.google.gson.l c5 = j2.c(StringSet.name);
                            h.f.b.l.b(c5, "");
                            ab.f76386b = c5.c();
                        }
                    }
                }
                if (a2.b("enable_mocap")) {
                    com.google.gson.l c6 = a2.c("enable_mocap");
                    h.f.b.l.b(c6, "");
                    ab.f76387c = c6.h();
                }
            } catch (Exception unused) {
            }
            d(i.f144350a);
            d(j.f144351a);
            z.e eVar = new z.e();
            T t2 = (T) a(a2);
            if (t2 != null) {
                eVar.element = t2;
                HashMap<String, com.ss.android.ugc.aweme.model.d> a4 = a(a2, eVar.element);
                if (a4 != null) {
                    for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse.getCategoryResponseList()) {
                        String key = effectCategoryResponse.getKey();
                        if (!h.f.b.l.a((Object) key, (Object) this.s)) {
                            for (Effect effect2 : effectCategoryResponse.getTotalEffects()) {
                                if (a4.containsKey(key)) {
                                    com.ss.android.ugc.aweme.model.d dVar = a4.get(key);
                                    if (dVar == null) {
                                        h.f.b.l.b();
                                    }
                                    h.f.b.l.b(dVar, "");
                                    com.ss.android.ugc.aweme.model.n a5 = com.ss.android.ugc.aweme.model.o.a(effect2, dVar);
                                    if (a5 != null) {
                                        com.ss.android.ugc.aweme.model.d dVar2 = a4.get(key);
                                        if (dVar2 == null) {
                                            h.f.b.l.b();
                                        }
                                        h.f.b.l.b(dVar2, "");
                                        dVar2.e().add(a5);
                                    }
                                }
                            }
                        }
                    }
                    for (com.ss.android.ugc.aweme.model.u uVar : eVar.element) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<com.ss.android.ugc.aweme.model.d> it = uVar.c().iterator();
                        while (it.hasNext()) {
                            com.ss.android.ugc.aweme.model.d next = it.next();
                            if (next.e().isEmpty() && next.g().isEmpty()) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            uVar.c().remove(it2.next());
                        }
                    }
                    h.f.b.l.d(a4, "");
                    com.ss.android.ugc.aweme.model.r.f110815e = a4;
                    if (com.ss.android.ugc.aweme.model.r.f110816f != null) {
                        com.ss.android.ugc.aweme.model.api.a.b bVar = com.ss.android.ugc.aweme.model.r.f110816f;
                        if (bVar == null) {
                            h.f.b.l.b();
                        }
                        com.ss.android.ugc.aweme.model.r.a(bVar);
                    }
                    d(new b(eVar));
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.aa
    public final void a(List<y> list, boolean z) {
        h.f.b.l.d(list, "");
        for (y yVar : list) {
            d(new q(yVar));
            if (!((ProfileNaviEditorState) at_()).getNaviDoneLoading() && z) {
                d(r.f144355a);
            }
        }
    }

    private static List<Host> b() {
        return h.a.n.d(new Host("https://api-va.tiktokv.com"));
    }

    public final void a() {
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) at_();
        profileNaviEditorState.setCurrentMessage(null);
        profileNaviEditorState.setHeadStickerPath(null);
        profileNaviEditorState.setNaviDoneLoading(false);
        profileNaviEditorState.setEditCategory(null);
        profileNaviEditorState.setTabList(null);
        profileNaviEditorState.setParentCategoryList(null);
        MessageCenter.removeAllListener();
        MessageCenter.destroy();
        com.ss.android.ugc.aweme.common.z.a();
        com.ss.android.ugc.aweme.model.r.a();
        com.ss.android.ugc.aweme.model.r.f110815e = null;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final /* synthetic */ af d() {
        return new ProfileNaviEditorState(null, null, null, null, null, false, false, false, false, false, 1023, null);
    }

    private static Context f(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }

    public final void a(String str) {
        d(new x(str));
    }

    public final void c(Context context) {
        h.f.b.l.d(context, "");
        e(context).checkedEffectListUpdate(this.f144344m, this);
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelFailed(ExceptionResult exceptionResult) {
        Exception exception;
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            exception.printStackTrace();
        }
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
    public final void onFail(ExceptionResult exceptionResult) {
        Exception exception;
        if (exceptionResult != null && (exception = exceptionResult.getException()) != null) {
            exception.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ z.e $tabList;

        static {
            Covode.recordClassIndex(94484);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z.e eVar) {
            super(1);
            this.$tabList = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, this.$tabList.element, null, null, null, null, false, false, false, false, false, 1022, null);
        }
    }

    public static final class c implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviEditorViewModel f144345a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EffectChannelResponse f144346b;

        static {
            Covode.recordClassIndex(94485);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            h.f.b.l.d(effect2, "");
            EffectChannelResponse effectChannelResponse = this.f144346b;
            if (effectChannelResponse != null) {
                this.f144345a.a(effect2, effectChannelResponse);
            }
            this.f144345a.a(effect2.getUnzipPath());
        }

        c(ProfileNaviEditorViewModel profileNaviEditorViewModel, EffectChannelResponse effectChannelResponse) {
            this.f144345a = profileNaviEditorViewModel;
            this.f144346b = effectChannelResponse;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            h.f.b.l.d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                exceptionResult.getException().printStackTrace();
            }
        }
    }

    public static final class d implements IFetchEffectListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProfileNaviEditorViewModel f144347a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.model.n f144348b;

        static {
            Covode.recordClassIndex(94486);
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onStart(Effect effect) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
        public final /* synthetic */ void onSuccess(Effect effect) {
            Effect effect2 = effect;
            h.f.b.l.d(effect2, "");
            this.f144348b.a(effect2.getUnzipPath());
            this.f144347a.b(this.f144348b);
        }

        d(ProfileNaviEditorViewModel profileNaviEditorViewModel, com.ss.android.ugc.aweme.model.n nVar) {
            this.f144347a = profileNaviEditorViewModel;
            this.f144348b = nVar;
        }

        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
        public final void onFail(Effect effect, ExceptionResult exceptionResult) {
            h.f.b.l.d(exceptionResult, "");
            if (exceptionResult.getException() != null) {
                exceptionResult.getException().printStackTrace();
            }
        }
    }

    public static final class e extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.d $category;

        static {
            Covode.recordClassIndex(94487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(com.ss.android.ugc.aweme.model.d dVar) {
            super(1);
            this.$category = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, new com.ss.android.ugc.aweme.common.x(this.$category), false, false, false, false, false, 1007, null);
        }
    }

    public static final class f extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ y $message;

        static {
            Covode.recordClassIndex(94488);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(y yVar) {
            super(1);
            this.$message = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, this.$message, null, null, false, false, false, false, false, 1019, null);
        }
    }

    public static final class g extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f144349a = new g();

        static {
            Covode.recordClassIndex(94489);
        }

        g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 1007, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f144350a = new i();

        static {
            Covode.recordClassIndex(94491);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, true, 511, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final j f144351a = new j();

        static {
            Covode.recordClassIndex(94492);
        }

        j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 511, null);
        }
    }

    static final class l extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f144352a = new l();

        static {
            Covode.recordClassIndex(94494);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 991, null);
        }
    }

    static final class n extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ y $message;

        static {
            Covode.recordClassIndex(94496);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(y yVar) {
            super(1);
            this.$message = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, this.$message, null, null, false, false, false, false, false, 1019, null);
        }
    }

    static final class o extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final o f144353a = new o();

        static {
            Covode.recordClassIndex(94497);
        }

        o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, true, false, false, false, 959, null);
        }
    }

    static final class p extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final p f144354a = new p();

        static {
            Covode.recordClassIndex(94498);
        }

        p() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 959, null);
        }
    }

    static final class q extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ y $message;

        static {
            Covode.recordClassIndex(94499);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(y yVar) {
            super(1);
            this.$message = yVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, this.$message, null, null, false, false, false, false, false, 1019, null);
        }
    }

    static final class r extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final r f144355a = new r();

        static {
            Covode.recordClassIndex(94500);
        }

        r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, true, false, false, false, false, 991, null);
        }
    }

    public static final class s extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final s f144356a = new s();

        static {
            Covode.recordClassIndex(94501);
        }

        s() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, true, false, 767, null);
        }
    }

    public static final class t extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {

        /* renamed from: a  reason: collision with root package name */
        public static final t f144357a = new t();

        static {
            Covode.recordClassIndex(94502);
        }

        t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, null, null, false, false, false, false, false, 767, null);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class x extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ String $path;

        static {
            Covode.recordClassIndex(94506);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(String str) {
            super(1);
            this.$path = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, null, this.$path, null, false, false, false, false, false, 1015, null);
        }
    }

    public static String a(com.ss.android.ugc.aweme.model.d dVar) {
        String h2 = dVar.h();
        if (h2 == null || h2.length() == 0) {
            return dVar.a();
        }
        String h3 = dVar.h();
        if (h3 == null) {
            h.f.b.l.b();
        }
        return h3;
    }

    private static File d(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107195c != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107195c;
        }
        File filesDir = context.getFilesDir();
        com.ss.android.ugc.aweme.lancet.d.f107195c = filesDir;
        return filesDir;
    }

    @Override // com.ss.android.ugc.effectmanager.effect.listener.ICheckChannelListener
    public final void checkChannelSuccess(boolean z) {
        if (z) {
            EffectManager effectManager = this.u;
            if (effectManager != null) {
                effectManager.fetchEffectList(this.f144344m, false, (IFetchEffectChannelListener) this);
                return;
            }
            return;
        }
        EffectManager effectManager2 = this.u;
        if (effectManager2 != null) {
            effectManager2.fetchEffectListFromCache(this.f144344m, this);
        }
    }

    public static final class a extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.e $color;

        static {
            Covode.recordClassIndex(94483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(com.ss.android.ugc.aweme.model.e eVar) {
            super(1);
            this.$color = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, y.a.b(this.$color.f110760c), null, null, false, false, false, false, false, 1019, null);
        }
    }

    public static final class h extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.d $category;

        static {
            Covode.recordClassIndex(94490);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(com.ss.android.ugc.aweme.model.d dVar) {
            super(1);
            this.$category = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            com.ss.android.ugc.aweme.model.h j2 = this.$category.j();
            if (j2 == null) {
                h.f.b.l.b();
            }
            String str = j2.f110767c;
            if (this.$category.j() == null) {
                h.f.b.l.b();
            }
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, y.a.c(str), null, null, false, false, false, false, false, 1019, null);
        }
    }

    static final class k extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.d $category$inlined;
        final /* synthetic */ ProfileNaviEditorViewModel this$0;

        static {
            Covode.recordClassIndex(94493);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(ProfileNaviEditorViewModel profileNaviEditorViewModel, com.ss.android.ugc.aweme.model.d dVar) {
            super(1);
            this.this$0 = profileNaviEditorViewModel;
            this.$category$inlined = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            com.ss.android.ugc.aweme.model.g i2 = this.$category$inlined.i();
            if (i2 == null) {
                h.f.b.l.b();
            }
            com.ss.android.ugc.aweme.model.e eVar = i2.f110764b;
            if (eVar == null) {
                h.f.b.l.b();
            }
            String str = eVar.f110760c;
            if (str == null) {
                h.f.b.l.b();
            }
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, y.a.b(str), null, null, false, false, false, false, false, 1019, null);
        }
    }

    static final class m extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.j $inspiration;

        static {
            Covode.recordClassIndex(94495);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(com.ss.android.ugc.aweme.model.j jVar) {
            super(1);
            this.$inspiration = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, y.a.a(this.$inspiration.f110772a), null, null, false, false, false, false, false, 1019, null);
        }
    }

    public static final class u extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.n $currentEffect;

        static {
            Covode.recordClassIndex(94503);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public u(com.ss.android.ugc.aweme.model.n nVar) {
            super(1);
            this.$currentEffect = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, y.a.a(this.$currentEffect.d(), false), null, null, false, false, false, false, false, 1019, null);
        }
    }

    public static final class v extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ com.ss.android.ugc.aweme.model.s $selectable;

        static {
            Covode.recordClassIndex(94504);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public v(com.ss.android.ugc.aweme.model.s sVar) {
            super(1);
            this.$selectable = sVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, y.a.a(this.$selectable.a()), null, null, false, false, false, false, false, 1019, null);
        }
    }

    public static final class w extends h.f.b.m implements h.f.a.b<ProfileNaviEditorState, ProfileNaviEditorState> {
        final /* synthetic */ String $key$inlined;
        final /* synthetic */ int $value$inlined;
        final /* synthetic */ ProfileNaviEditorViewModel this$0;

        static {
            Covode.recordClassIndex(94505);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public w(ProfileNaviEditorViewModel profileNaviEditorViewModel, int i2, String str) {
            super(1);
            this.this$0 = profileNaviEditorViewModel;
            this.$value$inlined = i2;
            this.$key$inlined = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ ProfileNaviEditorState invoke(ProfileNaviEditorState profileNaviEditorState) {
            ProfileNaviEditorState profileNaviEditorState2 = profileNaviEditorState;
            h.f.b.l.d(profileNaviEditorState2, "");
            return ProfileNaviEditorState.copy$default(profileNaviEditorState2, null, null, y.a.a(this.$key$inlined, this.$value$inlined), null, null, false, false, false, false, false, 1019, null);
        }
    }

    public final void b(com.ss.android.ugc.aweme.model.n nVar) {
        com.ss.android.ugc.aweme.model.n b2;
        com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
        if (qVar != null && (b2 = qVar.b(a(nVar.c()))) != null) {
            if (com.ss.android.ugc.aweme.common.z.f76619b == null) {
                com.ss.android.ugc.aweme.common.z.a(this);
            }
            if (h.f.b.l.a((Object) b2.a(), (Object) nVar.a()) && !com.ss.android.ugc.aweme.common.z.a(b2.d())) {
                com.ss.android.ugc.aweme.common.z.a(nVar);
            }
        }
    }

    public static com.ss.android.ugc.aweme.model.n b(com.ss.android.ugc.aweme.model.d dVar) {
        com.ss.android.ugc.aweme.model.d dVar2;
        h.f.b.l.d(dVar, "");
        HashMap<String, com.ss.android.ugc.aweme.model.d> hashMap = com.ss.android.ugc.aweme.model.r.f110815e;
        if (!(hashMap == null || (dVar2 = hashMap.get(dVar.a())) == null)) {
            h.f.b.l.b(dVar2, "");
            String h2 = dVar2.h();
            if (h2 == null || h2.length() == 0) {
                com.ss.android.ugc.aweme.model.q qVar = com.ss.android.ugc.aweme.model.r.f110811a;
                if (qVar != null) {
                    return qVar.b(dVar2.a());
                }
                return null;
            }
            com.ss.android.ugc.aweme.model.q qVar2 = com.ss.android.ugc.aweme.model.r.f110811a;
            if (qVar2 != null) {
                String h3 = dVar2.h();
                if (h3 == null) {
                    h.f.b.l.b();
                }
                return qVar2.b(h3);
            }
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
    public final /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
        Effect effect;
        EffectManager effectManager;
        EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
        if (effectChannelResponse2 != null) {
            for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse2.getCategoryResponseList()) {
                if (h.f.b.l.a((Object) effectCategoryResponse.getKey(), (Object) this.s)) {
                    if (!(!(!effectCategoryResponse.getTotalEffects().isEmpty()) || (effect = effectCategoryResponse.getTotalEffects().get(0)) == null || (effectManager = this.u) == null)) {
                        if (effectManager.isEffectReady(effect)) {
                            EffectManager effectManager2 = this.u;
                            if (effectManager2 == null) {
                                h.f.b.l.b();
                            }
                            if (effectManager2.isEffectDownloaded(effect)) {
                                a(effect, effectChannelResponse2);
                                a(effect.getUnzipPath());
                                return;
                            }
                        }
                        EffectManager effectManager3 = this.u;
                        if (effectManager3 == null) {
                            h.f.b.l.b();
                        }
                        effectManager3.fetchEffect(effect, new c(this, effectChannelResponse2));
                        return;
                    }
                    return;
                }
            }
        }
    }

    private final com.google.gson.o a(Effect effect) {
        boolean z;
        try {
            com.google.gson.l a2 = com.google.gson.q.a(effect.getSdkExtra());
            if (a2 != null) {
                com.google.gson.l c2 = ((com.google.gson.o) a2).f(this.n).f(this.o).c(this.p);
                h.f.b.l.b(c2, "");
                String c3 = c2.c();
                String transResPath = effect.getTransResPath();
                if (transResPath == null || transResPath.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    h.f.b.l.b(c3, "");
                    com.google.gson.o a3 = a(effect, c3);
                    if (a3 != null) {
                        return a3;
                    }
                }
                String str = effect.getUnzipPath() + File.separator + c3;
                h.f.b.l.b(str, "");
                com.google.gson.l a4 = com.google.gson.q.a(h.e.j.c(new File(str)));
                if (a4 != null) {
                    return (com.google.gson.o) a4;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonObject");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonObject");
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    private EffectManager e(Context context) {
        h.f.b.l.d(context, "");
        if (this.u == null) {
            EffectConfiguration.Builder executor = new EffectConfiguration.Builder().accessKey(this.f144342k).channel(this.f144343l).sdkVersion(this.t).appVersion(this.t).platform("android").deviceType(Build.MODEL).deviceId("0").effectDir(new File(d(context), "effect")).JsonConverter(new com.ss.android.ugc.aweme.common.p()).effectNetWorker(new NaviEffectNetworkerImpl()).hosts(b()).context(f(context)).retryCount(3).region("").executor(com.ss.android.ugc.aweme.cw.g.a());
            DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
            h.f.b.l.b(instance, "");
            EffectConfiguration build = executor.effectFetcher(instance.getEffectFetcher()).build();
            h.f.b.l.b(build, "");
            EffectManager effectManager = new EffectManager();
            this.u = effectManager;
            effectManager.init(build);
        }
        EffectManager effectManager2 = this.u;
        if (effectManager2 == null) {
            h.f.b.l.b();
        }
        return effectManager2;
    }

    public final DownloadableModelSupport b(Context context) {
        DownloadableModelConfig.ModelFileEnv modelFileEnv;
        h.f.b.l.d(context, "");
        if (!DownloadableModelSupport.isInitialized()) {
            DownloadableModelConfig.Builder jsonConverter = new DownloadableModelConfig.Builder().setContext(context).setAccessKey(this.f144342k).setAppId("1233").setHosts(b()).setSdkVersion(this.t).setDeviceType(Build.MODEL).setJsonConverter(new com.ss.android.ugc.aweme.common.p());
            if (AVExternalServiceImpl.a().configService().avsettingsConfig().enableModelFileOnlyEnv()) {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.ONLINE;
            } else {
                modelFileEnv = DownloadableModelConfig.ModelFileEnv.TEST;
            }
            DownloadableModelSupport.initialize(jsonConverter.setModelFileEnv(modelFileEnv).setEffectNetWorker(new NaviEffectNetworkerImpl()).setAssetManager(context.getAssets()).setWorkspace(new File(d(context), "effectmodel").getPath()).setExecutor(com.ss.android.ugc.aweme.cw.g.a()).build());
        }
        DownloadableModelSupport instance = DownloadableModelSupport.getInstance();
        h.f.b.l.b(instance, "");
        return instance;
    }

    private final List<com.ss.android.ugc.aweme.model.u> a(com.google.gson.o oVar) {
        try {
            ArrayList arrayList = new ArrayList();
            com.google.gson.l c2 = oVar.c(this.r);
            h.f.b.l.b(c2, "");
            Iterator<com.google.gson.l> it = c2.k().iterator();
            while (it.hasNext()) {
                com.google.gson.l next = it.next();
                h.f.b.l.b(next, "");
                com.google.gson.o j2 = next.j();
                h.f.b.l.b(j2, "");
                com.ss.android.ugc.aweme.model.u a2 = v.a.a(j2);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            return arrayList;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    public final void a(Context context) {
        List<com.ss.android.ugc.aweme.model.u> tabList;
        h.f.b.l.d(context, "");
        b(context);
        e(context);
        MessageCenter.setListener(this);
        ProfileNaviEditorState profileNaviEditorState = (ProfileNaviEditorState) at_();
        String headStickerPath = profileNaviEditorState.getHeadStickerPath();
        if (headStickerPath == null || headStickerPath.length() == 0 || (tabList = profileNaviEditorState.getTabList()) == null || tabList.isEmpty()) {
            c(context);
        }
        com.ss.android.ugc.aweme.common.z.a(this);
    }

    public final void a(com.ss.android.ugc.aweme.model.n nVar) {
        EffectManager effectManager = this.u;
        if (effectManager != null) {
            if (effectManager.isEffectReady(nVar.e())) {
                EffectManager effectManager2 = this.u;
                if (effectManager2 == null) {
                    h.f.b.l.b();
                }
                if (effectManager2.isEffectDownloaded(nVar.e())) {
                    b(nVar);
                    return;
                }
            }
            EffectManager effectManager3 = this.u;
            if (effectManager3 == null) {
                h.f.b.l.b();
            }
            effectManager3.fetchEffect(nVar.e(), new d(this, nVar));
        }
    }

    private static com.google.gson.o a(Effect effect, String str) {
        try {
            String str2 = effect.getTransResPath() + File.separator + "custom" + File.separator + str;
            h.f.b.l.b(str2, "");
            if (!new File(str2).exists()) {
                return null;
            }
            com.google.gson.l a2 = com.google.gson.q.a(h.e.j.c(new File(str2)));
            if (a2 != null) {
                return (com.google.gson.o) a2;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.gson.JsonObject");
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    private final HashMap<String, com.ss.android.ugc.aweme.model.d> a(com.google.gson.o oVar, List<? extends com.ss.android.ugc.aweme.model.u> list) {
        try {
            HashMap<String, com.ss.android.ugc.aweme.model.d> hashMap = new HashMap<>();
            com.google.gson.l c2 = oVar.c(this.q);
            h.f.b.l.b(c2, "");
            Iterator<com.google.gson.l> it = c2.k().iterator();
            while (it.hasNext()) {
                com.google.gson.l next = it.next();
                h.f.b.l.b(next, "");
                com.google.gson.o j2 = next.j();
                h.f.b.l.b(j2, "");
                com.ss.android.ugc.aweme.model.d a2 = k.a.a(j2);
                if (a2 != null) {
                    hashMap.put(a2.a(), a2);
                    for (com.ss.android.ugc.aweme.model.u uVar : list) {
                        if (h.f.b.l.a((Object) a2.d(), (Object) uVar.a())) {
                            uVar.c().add(a2);
                        }
                    }
                }
            }
            return hashMap;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    @Override // com.bef.effectsdk.message.MessageCenter.Listener
    public final void onMessageReceived(int i2, int i3, int i4, String str) {
        com.ss.android.ugc.aweme.model.e eVar;
        String str2;
        com.ss.android.ugc.aweme.model.q qVar;
        com.ss.android.ugc.aweme.model.e eVar2;
        if (str == null || !h.f.b.l.a((Object) str, (Object) "head") || i3 != 3) {
            if (i2 == 17) {
                if (i3 == 3 && str != null) {
                    h.f.b.l.d(str, "");
                    int size = com.ss.android.ugc.aweme.common.z.f76618a.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (h.f.b.l.a((Object) com.ss.android.ugc.aweme.common.z.f76618a.get(i5).d(), (Object) str)) {
                            com.ss.android.ugc.aweme.model.d c2 = com.ss.android.ugc.aweme.common.z.f76618a.get(i5).c();
                            com.ss.android.ugc.aweme.common.z.f76618a.remove(i5);
                            h.f.b.l.d(c2, "");
                            ArrayList arrayList = new ArrayList();
                            com.ss.android.ugc.aweme.model.g i6 = c2.i();
                            if (!(i6 == null || (eVar = i6.f110764b) == null || (str2 = eVar.f110760c) == null || str2.length() == 0)) {
                                arrayList.add(y.a.b(str2));
                            }
                            if (c2.j() != null) {
                                com.ss.android.ugc.aweme.model.h j2 = c2.j();
                                if (j2 == null) {
                                    h.f.b.l.b();
                                }
                                if (j2.f110766b == 1) {
                                    com.ss.android.ugc.aweme.model.h j3 = c2.j();
                                    if (j3 == null) {
                                        h.f.b.l.b();
                                    }
                                    arrayList.add(y.a.c(j3.f110767c));
                                }
                            }
                            arrayList.addAll(com.ss.android.ugc.aweme.common.z.a(c2));
                            aa aaVar = com.ss.android.ugc.aweme.common.z.f76619b;
                            if (aaVar != null) {
                                aaVar.a(arrayList, !com.ss.android.ugc.aweme.common.z.f76618a.isEmpty());
                            }
                            com.ss.android.ugc.aweme.common.z.b();
                            return;
                        }
                    }
                }
            } else if (i2 == this.f144339e) {
                if (i3 != this.f144340f) {
                }
            } else if (i2 == 48) {
                d(o.f144353a);
            } else if (i2 == 49) {
                d(p.f144354a);
            }
        } else if (!this.f144335a) {
            this.f144335a = true;
            HashMap<String, com.ss.android.ugc.aweme.model.d> hashMap = com.ss.android.ugc.aweme.model.r.f110815e;
            if (!(hashMap == null || hashMap.isEmpty() || (qVar = com.ss.android.ugc.aweme.model.r.f110811a) == null)) {
                Collection<com.ss.android.ugc.aweme.model.n> values = qVar.f110807c.values();
                d(l.f144352a);
                for (com.ss.android.ugc.aweme.model.n nVar : values) {
                    h.f.b.l.b(nVar, "");
                    a(nVar);
                }
                for (com.ss.android.ugc.aweme.model.j jVar : qVar.f110808d.values()) {
                    d(new m(jVar));
                }
                HashMap<String, com.ss.android.ugc.aweme.model.d> hashMap2 = com.ss.android.ugc.aweme.model.r.f110815e;
                if (hashMap2 == null) {
                    h.f.b.l.b();
                }
                for (com.ss.android.ugc.aweme.model.d dVar : hashMap2.values()) {
                    com.ss.android.ugc.aweme.model.g i7 = dVar.i();
                    if (!(i7 == null || (eVar2 = i7.f110764b) == null || eVar2.f110760c == null)) {
                        d(new k(this, dVar));
                    }
                    h.f.b.l.b(dVar, "");
                    for (y yVar : com.ss.android.ugc.aweme.common.z.a(dVar)) {
                        d(new n(yVar));
                    }
                }
            }
        }
    }
}
