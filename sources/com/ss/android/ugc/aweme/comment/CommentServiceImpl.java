package com.ss.android.ugc.aweme.comment;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.fragment.app.i;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.dialog.a;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.api.CommentViewModel;
import com.ss.android.ugc.aweme.comment.d.g;
import com.ss.android.ugc.aweme.comment.i.h;
import com.ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.ss.android.ugc.aweme.comment.page.tag.VideoTagPage;
import com.ss.android.ugc.aweme.comment.page.tag.m;
import com.ss.android.ugc.aweme.comment.page.tag.viewmodel.SocialVideoTagShareVM;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.ui.bj;
import com.ss.android.ugc.aweme.comment.ui.br;
import com.ss.android.ugc.aweme.comment.ui.k;
import com.ss.android.ugc.aweme.comment.util.d;
import com.ss.android.ugc.aweme.comment.util.f;
import com.ss.android.ugc.aweme.comment.util.l;
import com.ss.android.ugc.aweme.comment.util.u;
import com.ss.android.ugc.aweme.comment.viewmodel.LikeListVM;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

public final class CommentServiceImpl implements CommentService {

    static final class c implements DialogInterface.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f71246a = new c();

        static {
            Covode.recordClassIndex(43856);
        }

        c() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }

    static {
        Covode.recordClassIndex(43853);
    }

    public static final class a implements ad.b {
        static {
            Covode.recordClassIndex(43854);
        }

        a() {
        }

        @Override // androidx.lifecycle.ad.b
        public final <T extends ac> T a(Class<T> cls) {
            l.d(cls, "");
            return new CommentViewModelImpl();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(String str, Integer num, int i2, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        int intValue = num != null ? num.intValue() : -1;
        if (com.ss.android.ugc.aweme.network.a.e.b()) {
            com.bytedance.ies.powerpreload.c.a(new com.ss.android.ugc.aweme.comment.api.a(str2, i2, str, str3, intValue));
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(String str) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aweme_id", str);
        PowerPreloadServiceImpl.a().a("/aweme/v2/comment/list/", linkedHashMap);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a() {
        PowerPreloadServiceImpl.a().a("/aweme/v2/comment/list/", null);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(Context context, QaStruct qaStruct, String str, String str2, String str3) {
        l.d(context, "");
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        u.a(context, qaStruct, str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(Context context, String str, Aweme aweme, int i2, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        ArrayList arrayList;
        l.d(context, "");
        l.d(str, "");
        l.d(onActivityResultCallback, "");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//social/taglist");
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(IMUser.fromInteractionTagUser(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = z.INSTANCE;
        }
        buildRoute.withParam("init_config", new VideoTagPage.b(str, aweme, i2, arrayList)).open(111, onActivityResultCallback);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(androidx.fragment.app.e eVar, Aweme aweme, String str, String str2) {
        List<InteractionTagUserInfo> taggedUsers;
        l.d(eVar, "");
        l.d(aweme, "");
        l.d(str2, "");
        float b2 = ((float) com.bytedance.common.utility.n.b(eVar)) * 0.5f;
        Bundle bundle = new Bundle();
        bundle.putSerializable("aweme", aweme);
        int i2 = (!g.c() || !in.a(aweme.getAuthorUid())) ? 0 : 1;
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (!(interactionTagInfo == null || (taggedUsers = interactionTagInfo.getTaggedUsers()) == null || !(!taggedUsers.isEmpty()))) {
            ArrayList arrayList = new ArrayList(n.a((Iterable) taggedUsers, 10));
            Iterator<T> it = taggedUsers.iterator();
            while (it.hasNext()) {
                arrayList.add(InteractionTagInfoKt.toUser(it.next()));
            }
            bundle.putSerializable("tagged_users", arrayList);
            i2 += taggedUsers.size();
        }
        if (str == null) {
            str = "";
        }
        bundle.putString("enter_from", str);
        bundle.putString("anchor_type", str2);
        float b3 = com.bytedance.common.utility.n.b(eVar, (((float) i2) * 64.0f) + 60.0f);
        if (b3 <= b2) {
            b2 = b3;
        }
        com.ss.android.ugc.aweme.comment.page.tag.d dVar = new com.ss.android.ugc.aweme.comment.page.tag.d();
        dVar.setArguments(bundle);
        b bVar = new b(dVar);
        l.d(bVar, "");
        dVar.f72241g = bVar;
        new a.C1112a().a(1).b((int) b2).b(false).a(dVar).a(c.f71246a).f45299a.show(eVar.getSupportFragmentManager(), "FeedTaggedListFragment");
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(Activity activity, String str, String str2, String str3, int i2) {
        l.d(activity, "");
        l.a.a(activity, str, str2, str3, i2);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(i iVar, CommentRethinkPopup commentRethinkPopup, h.f.a.a<h.z> aVar, h.f.a.a<h.z> aVar2, h.f.a.a<h.z> aVar3, String str) {
        h.f.b.l.d(iVar, "");
        h.f.b.l.d(commentRethinkPopup, "");
        br a2 = br.c.a(commentRethinkPopup);
        a2.f72596a = new d(aVar, aVar2, aVar3);
        a2.show(iVar, str);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(String str, String str2) {
        CommentApi.a(str, 0, 20, null, null, com.ss.android.ugc.aweme.app.c.c.a(str2));
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final boolean a(Context context) {
        bj a2 = bj.a(context);
        return a2 != null && a2.a();
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(String str, Aweme aweme, JSONObject jSONObject, String str2) {
        String str3 = str;
        if (str3.equals("opus")) {
            str3 = "others_homepage";
        }
        JSONObject a2 = ForwardStatisticsServiceImpl.b().a(jSONObject, aweme, str2);
        com.bytedance.ies.ugc.appcontext.d.a();
        r.a(UGCMonitor.EVENT_COMMENT, str3, aweme.getAid(), 0, a2);
        User author = aweme.getAuthor();
        r.a(UGCMonitor.EVENT_COMMENT, new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str3).a("group_id", aweme.getAid()).a("follow_status", author != null ? author.getFollowStatus() : 0).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.comment.services.CommentService
    public final void a(Context context, int i2, String str) {
        if (context != null) {
            a.C0731a aVar = new a.C0731a(context);
            aVar.a(i2);
            aVar.f33402b = str;
            aVar.a(R.string.a7y, (DialogInterface.OnClickListener) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: INVOKE  
                  (r3v0 'aVar' com.bytedance.ies.dmt.ui.dialog.a$a)
                  (wrap: int : ?: SGET   com.zhiliaoapp.musically.R.string.a7y int)
                  (wrap: android.content.DialogInterface$OnClickListener : ?: CAST (android.content.DialogInterface$OnClickListener) (wrap: com.ss.android.ugc.aweme.comment.l.a$1 : 0x000e: CONSTRUCTOR  (r2v0 com.ss.android.ugc.aweme.comment.l.a$1) =  call: com.ss.android.ugc.aweme.comment.l.a.1.<init>():void type: CONSTRUCTOR))
                  false
                 type: VIRTUAL call: com.bytedance.ies.dmt.ui.dialog.a.a.a(int, android.content.DialogInterface$OnClickListener, boolean):com.bytedance.ies.dmt.ui.dialog.a$a in method: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.content.Context, int, java.lang.String):void, file: classes3.dex
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: ?: CAST (android.content.DialogInterface$OnClickListener) (wrap: com.ss.android.ugc.aweme.comment.l.a$1 : 0x000e: CONSTRUCTOR  (r2v0 com.ss.android.ugc.aweme.comment.l.a$1) =  call: com.ss.android.ugc.aweme.comment.l.a.1.<init>():void type: CONSTRUCTOR) in method: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.content.Context, int, java.lang.String):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 21 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CONSTRUCTOR  (r2v0 com.ss.android.ugc.aweme.comment.l.a$1) =  call: com.ss.android.ugc.aweme.comment.l.a.1.<init>():void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.content.Context, int, java.lang.String):void, file: classes3.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:290)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 27 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.ss.android.ugc.aweme.comment.l.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 31 more
                */
            /*
                this = this;
                if (r5 == 0) goto L_0x0023
                com.bytedance.ies.dmt.ui.dialog.a$a r3 = new com.bytedance.ies.dmt.ui.dialog.a$a
                r3.<init>(r5)
                r3.a(r6)
                r3.f33402b = r7
                com.ss.android.ugc.aweme.comment.l.a$1 r2 = new com.ss.android.ugc.aweme.comment.l.a$1
                r2.<init>()
                r0 = 2131821897(0x7f110549, float:1.927655E38)
                r1 = 0
                r3.a(r0, r2, r1)
                com.bytedance.ies.dmt.ui.dialog.a r0 = r3.a()
                android.app.Dialog r0 = r0.b()
                r0.setCancelable(r1)
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.content.Context, int, java.lang.String):void");
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final void a(androidx.fragment.app.e eVar, boolean z, h.f.a.a<h.z> aVar) {
            h.f.b.l.d(aVar, "");
            if (eVar != null) {
                Keva repo = Keva.getRepo("repo_video_tag");
                int a2 = g.a();
                if (a2 != 0 && !repo.getBoolean("key_intro_has_shown", false)) {
                    if ((n.d(1, 2, 5).contains(Integer.valueOf(g.a())) && z) || (a2 == 3 && !z)) {
                        repo.storeBoolean("key_intro_has_shown", true);
                        com.ss.android.ugc.aweme.comment.page.tag.l lVar = new com.ss.android.ugc.aweme.comment.page.tag.l(eVar, (byte) 0);
                        e eVar2 = new e(lVar);
                        h.f.b.l.d(lVar, "");
                        h.f.b.l.d(eVar2, "");
                        ((TuxIconView) lVar.b(R.id.fhc)).setOnClickListener(new m.a(lVar, eVar2));
                        ((TuxButton) lVar.b(R.id.fhd)).setOnClickListener(new m.b(lVar, eVar2));
                        new a.C1112a().a(0).a(lVar).a(new f(aVar, z, lVar)).f45299a.show(eVar.getSupportFragmentManager(), "VideoTagIntroView");
                        r.a("show_tag_introduce_bottom_sheet", new com.ss.android.ugc.aweme.app.f.d().a("page_name", z ? "tag_people_page" : "video_post_page").f66730a);
                    }
                }
            }
        }

        static final class b extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ com.ss.android.ugc.aweme.comment.page.tag.d $fragment;

            static {
                Covode.recordClassIndex(43855);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(com.ss.android.ugc.aweme.comment.page.tag.d dVar) {
                super(0);
                this.$fragment = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                a.b.a(this.$fragment);
                return h.z.f158842a;
            }
        }

        public static final class d implements br.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f71247a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f71248b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f71249c;

            static {
                Covode.recordClassIndex(43857);
            }

            @Override // com.ss.android.ugc.aweme.comment.ui.br.d
            public final void a() {
                h.f.a.a aVar = this.f71247a;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            @Override // com.ss.android.ugc.aweme.comment.ui.br.d
            public final void b() {
                h.f.a.a aVar = this.f71248b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            @Override // com.ss.android.ugc.aweme.comment.ui.br.d
            public final void c() {
                h.f.a.a aVar = this.f71249c;
                if (aVar != null) {
                    aVar.invoke();
                }
            }

            d(h.f.a.a aVar, h.f.a.a aVar2, h.f.a.a aVar3) {
                this.f71247a = aVar;
                this.f71248b = aVar2;
                this.f71249c = aVar3;
            }
        }

        static final class e extends h.f.b.m implements h.f.a.a<h.z> {
            final /* synthetic */ com.ss.android.ugc.aweme.comment.page.tag.l $this_apply;

            static {
                Covode.recordClassIndex(43858);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(com.ss.android.ugc.aweme.comment.page.tag.l lVar) {
                super(0);
                this.$this_apply = lVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                a.b.a(this.$this_apply);
                return h.z.f158842a;
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final void b() {
            k.D = SystemClock.uptimeMillis();
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final w c() {
            if (SettingsManager.a().a("comment_preload_instance_setting_new", 1) == 1) {
                return new CommentPreloadInstanceTask();
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final boolean d() {
            return s.a.f66880a.q().c().booleanValue();
        }

        public static CommentService e() {
            MethodCollector.i(948);
            Object a2 = com.ss.android.ugc.b.a(CommentService.class, false);
            if (a2 != null) {
                CommentService commentService = (CommentService) a2;
                MethodCollector.o(948);
                return commentService;
            }
            if (com.ss.android.ugc.b.ad == null) {
                synchronized (CommentService.class) {
                    try {
                        if (com.ss.android.ugc.b.ad == null) {
                            com.ss.android.ugc.b.ad = new CommentServiceImpl();
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(948);
                        throw th;
                    }
                }
            }
            CommentServiceImpl commentServiceImpl = (CommentServiceImpl) com.ss.android.ugc.b.ad;
            MethodCollector.o(948);
            return commentServiceImpl;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final com.ss.android.ugc.aweme.comment.api.e b(androidx.fragment.app.e eVar) {
            h.f.b.l.d(eVar, "");
            return LikeListVM.a.a(eVar);
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final void c(Context context) {
            bj a2 = bj.a(context);
            if (a2 != null) {
                a2.a(a2.a());
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final CommentViewModel a(androidx.fragment.app.e eVar) {
            h.f.b.l.d(eVar, "");
            ac a2 = ae.a(eVar, new a()).a(CommentViewModelImpl.class);
            h.f.b.l.b(a2, "");
            return (CommentViewModel) a2;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final String b(String str) {
            h.f.b.l.d(str, "");
            String b2 = com.ss.android.ugc.aweme.comment.util.r.b(str);
            h.f.b.l.b(b2, "");
            return b2;
        }

        static final class f implements DialogInterface.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h.f.a.a f71250a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f71251b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.comment.page.tag.l f71252c;

            static {
                Covode.recordClassIndex(43859);
            }

            f(h.f.a.a aVar, boolean z, com.ss.android.ugc.aweme.comment.page.tag.l lVar) {
                this.f71250a = aVar;
                this.f71251b = z;
                this.f71252c = lVar;
            }

            public final void onDismiss(DialogInterface dialogInterface) {
                String str;
                this.f71250a.invoke();
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                if (this.f71251b) {
                    str = "tag_people_page";
                } else {
                    str = "video_post_page";
                }
                r.a("close_tag_introduce_bottom_sheet", dVar.a("page_name", str).a("close_type", this.f71252c.getCloseType()).f66730a);
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final LiveData<Aweme> a(androidx.lifecycle.i iVar) {
            h.f.b.l.d(iVar, "");
            if (iVar.a().compareTo((Enum) i.b.INITIALIZED) > 0) {
                return ((SocialVideoTagShareVM) new SharedViewModelProvider().a(iVar, SocialVideoTagShareVM.class)).f72281a;
            }
            return null;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final String b(com.ss.android.ugc.aweme.commercialize.model.s sVar) {
            h.f.b.l.d(sVar, "");
            h.f.b.l.d(sVar, "");
            StringBuilder sb = new StringBuilder(sVar.getCommentInfo());
            sb.append(" [label]");
            sb.append(" ").append(com.ss.android.ugc.aweme.comment.util.f.a(sVar));
            String sb2 = sb.toString();
            h.f.b.l.b(sb2, "");
            return sb2;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final boolean c(Aweme aweme) {
            if (aweme == null || aweme.getAuthor() == null) {
                return false;
            }
            if (aweme.getAuthor().getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71516d || aweme.getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71516d) {
                return true;
            }
            return false;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final com.ss.android.ugc.aweme.commercialize.model.s a(Aweme aweme) {
            h.f.b.l.d(aweme, "");
            return com.ss.android.ugc.aweme.comment.util.g.a(aweme);
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final void b(Context context) {
            bj a2 = bj.a(context);
            if (a2 != null) {
                a2.b();
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final com.ss.android.ugc.aweme.o.c a(com.ss.android.ugc.aweme.comment.i.b bVar) {
            h.f.b.l.d(bVar, "");
            return new com.ss.android.ugc.aweme.comment.barrage.view.b(bVar);
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final boolean b(Aweme aweme) {
            if (aweme == null || aweme.getAuthor() == null) {
                return true;
            }
            User author = aweme.getAuthor();
            int commentSetting = author.getCommentSetting();
            if (AccountService.a().e().isMe(author.getUid())) {
                if (AccountService.a().e().getCurUser().getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71516d || aweme.getCommentSetting() == com.ss.android.ugc.aweme.comment.b.a.f71516d) {
                    return false;
                }
                return true;
            } else if (commentSetting == com.ss.android.ugc.aweme.comment.b.a.f71513a) {
                return true;
            } else {
                if (commentSetting == com.ss.android.ugc.aweme.comment.b.a.f71514b && com.ss.android.ugc.aweme.utils.z.e(aweme)) {
                    return true;
                }
                if (commentSetting != com.ss.android.ugc.aweme.comment.b.a.f71515c || !com.ss.android.ugc.aweme.utils.z.f(aweme)) {
                    return false;
                }
                return true;
            }
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final List<TextExtraStruct> a(com.ss.android.ugc.aweme.commercialize.model.s sVar) {
            h.f.b.l.d(sVar, "");
            h.f.b.l.d(sVar, "");
            ArrayList arrayList = new ArrayList();
            int length = sVar.getCommentInfo().length() + 1;
            int i2 = length + 7;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            textExtraStruct.setCustomSpan(new com.ss.android.ugc.aweme.feed.widget.c(com.bytedance.ies.ugc.appcontext.d.a(), com.bytedance.ies.ugc.appcontext.d.a().getString(R.string.b6q), "#FFFFFFFF", 2131233132, "#80FFFFFF", "#58161823", 10, 17));
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(i2);
            arrayList.add(textExtraStruct);
            int i3 = i2 + 1;
            int length2 = i2 + com.ss.android.ugc.aweme.comment.util.f.a(sVar).length();
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            textExtraStruct2.setCustomSpan(new d.a(com.ss.android.ugc.aweme.base.utils.n.a(13.0d), com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.c2)));
            textExtraStruct2.setStart(i3);
            textExtraStruct2.setEnd(length2);
            arrayList.add(textExtraStruct2);
            return arrayList;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final com.ss.android.ugc.aweme.comment.f.d a(Activity activity, Aweme aweme, h hVar) {
            h.f.b.l.d(hVar, "");
            return bj.a(activity, aweme, hVar);
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final List<TextExtraStruct> a(Context context, Aweme aweme, com.ss.android.ugc.aweme.commercialize.model.s sVar) {
            h.f.b.l.d(context, "");
            h.f.b.l.d(aweme, "");
            h.f.b.l.d(sVar, "");
            h.f.b.l.d(sVar, "");
            h.f.b.l.d(context, "");
            h.f.b.l.d(aweme, "");
            ArrayList arrayList = new ArrayList();
            int length = sVar.getCommentInfo().length() + 1;
            int i2 = length + 7;
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            textExtraStruct.setCustomSpan(null);
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(i2);
            arrayList.add(textExtraStruct);
            int i3 = i2 + 1;
            int length2 = i2 + com.ss.android.ugc.aweme.comment.util.f.a(sVar).length();
            TextExtraStruct textExtraStruct2 = new TextExtraStruct();
            textExtraStruct2.setType(65281);
            textExtraStruct2.setCustomSpan(new d.a(com.ss.android.ugc.aweme.base.utils.n.a(13.0d), androidx.core.content.b.c(com.bytedance.ies.ugc.appcontext.d.a(), R.color.c2)));
            textExtraStruct2.setStart(i3);
            textExtraStruct2.setEnd(length2);
            arrayList.add(textExtraStruct2);
            return arrayList;
        }

        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        public final List<TextExtraStruct> a(com.ss.android.ugc.aweme.commercialize.model.s sVar, AwemeRawAd awemeRawAd, h.f.a.a<h.z> aVar) {
            h.f.b.l.d(sVar, "");
            h.f.b.l.d(aVar, "");
            h.f.b.l.d(sVar, "");
            h.f.b.l.d(aVar, "");
            ArrayList arrayList = new ArrayList();
            int length = sVar.getCommentInfo().length() + 1;
            int i2 = length + 7;
            f.b bVar = new f.b(aVar);
            TextExtraStruct textExtraStruct = new TextExtraStruct();
            textExtraStruct.setType(65281);
            textExtraStruct.setCustomSpan(bVar);
            textExtraStruct.setStart(length);
            textExtraStruct.setEnd(i2);
            if (!(awemeRawAd == null || awemeRawAd.getButtonText() == null)) {
                TextExtraStruct textExtraStruct2 = new TextExtraStruct();
                textExtraStruct2.setType(65281);
                com.ss.android.ugc.aweme.feed.widget.c cVar = new com.ss.android.ugc.aweme.feed.widget.c(com.bytedance.ies.ugc.appcontext.d.a(), awemeRawAd.getButtonText(), "#80161823", 2131231212, "#80161823", "#0F161823", com.ss.android.ugc.aweme.base.utils.n.b((double) com.ss.android.ugc.aweme.base.utils.n.c(12.0d)), 15);
                cVar.f95256a = com.bytedance.common.utility.n.b(com.bytedance.ies.ugc.appcontext.d.a(), -2.38f);
                textExtraStruct2.setCustomSpan(cVar);
                textExtraStruct2.setStart(length);
                textExtraStruct2.setEnd(i2);
                arrayList.add(textExtraStruct2);
            }
            arrayList.add(textExtraStruct);
            int i3 = i2 + 1;
            int length2 = i2 + com.ss.android.ugc.aweme.comment.util.f.a(sVar).length();
            TextExtraStruct textExtraStruct3 = new TextExtraStruct();
            textExtraStruct3.setType(65281);
            textExtraStruct3.setCustomSpan(new d.a(com.ss.android.ugc.aweme.base.utils.n.a(13.0d), com.bytedance.ies.ugc.appcontext.d.a().getResources().getColor(R.color.c5)));
            textExtraStruct3.setStart(i3);
            textExtraStruct3.setEnd(length2);
            arrayList.add(textExtraStruct3);
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
            if (r1 != null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            if (r0 == null) goto L_0x003a;
         */
        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.comment.e.a a(android.view.View r7, androidx.fragment.app.i r8, java.lang.String r9, com.ss.android.ugc.aweme.comment.services.a r10, com.ss.android.ugc.aweme.comment.g.c r11) {
            /*
                r6 = this;
                r5 = 441(0x1b9, float:6.18E-43)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
                if (r7 == 0) goto L_0x0009
                if (r8 != 0) goto L_0x000e
            L_0x0009:
                r1 = 0
            L_0x000a:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                return r1
            L_0x000e:
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                r4 = 2131367871(0x7f0a17bf, float:1.8355676E38)
                android.view.View r0 = r7.findViewById(r4)
                java.lang.String r3 = "comment_input_tag"
                androidx.fragment.app.Fragment r1 = r8.a(r3)
                if (r1 == 0) goto L_0x002c
                if (r0 == 0) goto L_0x002f
                com.ss.android.ugc.aweme.comment.ui.b r1 = (com.ss.android.ugc.aweme.comment.ui.b) r1
                if (r1 == 0) goto L_0x000a
            L_0x0025:
                r1.v = r9
                r1.s = r10
                r1.u = r11
                goto L_0x000a
            L_0x002c:
                if (r0 != 0) goto L_0x004f
                goto L_0x003a
            L_0x002f:
                androidx.fragment.app.n r0 = r8.a()
                androidx.fragment.app.n r0 = r0.a(r1)
                r0.c()
            L_0x003a:
                android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
                android.content.Context r0 = r7.getContext()
                r2.<init>(r0)
                r2.setId(r4)
                android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
                r0 = -1
                r1.<init>(r0, r0)
                r7.addView(r2, r1)
            L_0x004f:
                com.ss.android.ugc.aweme.comment.ui.b r1 = new com.ss.android.ugc.aweme.comment.ui.b
                r1.<init>()
                androidx.fragment.app.n r0 = r8.a()
                androidx.fragment.app.n r0 = r0.a(r4, r1, r3)
                r0.c()
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.CommentServiceImpl.a(android.view.View, androidx.fragment.app.i, java.lang.String, com.ss.android.ugc.aweme.comment.services.a, com.ss.android.ugc.aweme.comment.g.c):com.ss.android.ugc.aweme.comment.e.a");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            if (r0 == null) goto L_0x003a;
         */
        @Override // com.ss.android.ugc.aweme.comment.services.CommentService
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.comment.e.a b(android.view.View r7, androidx.fragment.app.i r8, java.lang.String r9, com.ss.android.ugc.aweme.comment.services.a r10, com.ss.android.ugc.aweme.comment.g.c r11) {
            /*
                r6 = this;
                r5 = 1016(0x3f8, float:1.424E-42)
                com.bytedance.frameworks.apm.trace.MethodCollector.i(r5)
                if (r7 == 0) goto L_0x0009
                if (r8 != 0) goto L_0x000e
            L_0x0009:
                r1 = 0
            L_0x000a:
                com.bytedance.frameworks.apm.trace.MethodCollector.o(r5)
                return r1
            L_0x000e:
                android.view.ViewGroup r7 = (android.view.ViewGroup) r7
                r4 = 2131367871(0x7f0a17bf, float:1.8355676E38)
                android.view.View r0 = r7.findViewById(r4)
                java.lang.String r3 = "story_comment_input_tag"
                androidx.fragment.app.Fragment r1 = r8.a(r3)
                if (r1 == 0) goto L_0x002c
                if (r0 == 0) goto L_0x002f
                com.ss.android.ugc.aweme.comment.ui.df r1 = (com.ss.android.ugc.aweme.comment.ui.df) r1
            L_0x0023:
                if (r1 == 0) goto L_0x000a
                r1.f72730d = r9
                r1.f72727a = r10
                r1.f72729c = r11
                goto L_0x000a
            L_0x002c:
                if (r0 != 0) goto L_0x004f
                goto L_0x003a
            L_0x002f:
                androidx.fragment.app.n r0 = r8.a()
                androidx.fragment.app.n r0 = r0.a(r1)
                r0.c()
            L_0x003a:
                android.widget.RelativeLayout r2 = new android.widget.RelativeLayout
                android.content.Context r0 = r7.getContext()
                r2.<init>(r0)
                r2.setId(r4)
                android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
                r0 = -1
                r1.<init>(r0, r0)
                r7.addView(r2, r1)
            L_0x004f:
                com.ss.android.ugc.aweme.comment.ui.df r1 = new com.ss.android.ugc.aweme.comment.ui.df
                r1.<init>()
                androidx.fragment.app.n r0 = r8.a()
                androidx.fragment.app.n r0 = r0.a(r4, r1, r3)
                r0.c()
                com.ss.android.ugc.aweme.comment.ui.df r1 = (com.ss.android.ugc.aweme.comment.ui.df) r1
                goto L_0x0023
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.CommentServiceImpl.b(android.view.View, androidx.fragment.app.i, java.lang.String, com.ss.android.ugc.aweme.comment.services.a, com.ss.android.ugc.aweme.comment.g.c):com.ss.android.ugc.aweme.comment.e.a");
        }
    }
