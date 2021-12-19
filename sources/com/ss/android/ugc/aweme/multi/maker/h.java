package com.ss.android.ugc.aweme.multi.maker;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.metrics.ai;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.PhotoMvAnchorConfig;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.m.p;
import h.z;
import java.util.List;
import java.util.UUID;

public final class h extends o {

    /* renamed from: d  reason: collision with root package name */
    public final String f110956d;

    static {
        Covode.recordClassIndex(71191);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final boolean j() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "app_page";
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new h();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.PHOTO_MV_ANCHOR.getTYPE();
    }

    static final class a extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(71192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, ViewGroup viewGroup, d dVar) {
            super(1);
            this.this$0 = hVar;
            this.$parent = viewGroup;
            this.$eventMapBuilder = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.h$a$a  reason: collision with other inner class name */
        static final class C2838a extends m implements h.f.a.a<z> {
            final /* synthetic */ ToolsAnchorItem $this_apply$inlined;
            final /* synthetic */ AnchorCommonStruct $this_withAnchor$inlined;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(71193);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2838a(ToolsAnchorItem toolsAnchorItem, a aVar, AnchorCommonStruct anchorCommonStruct) {
                super(0);
                this.$this_apply$inlined = toolsAnchorItem;
                this.this$0 = aVar;
                this.$this_withAnchor$inlined = anchorCommonStruct;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                this.this$0.this$0.e(this.this$0.$eventMapBuilder);
                return z.f158842a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorPanelAction anchorPanelAction;
            MethodCollector.i(4029);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            l.d(anchorCommonStruct2, str);
            Context context = this.$parent.getContext();
            l.b(context, str);
            ToolsAnchorItem a2 = ToolsAnchorItem.a.a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a2.setIcon(thumbnail);
            }
            String keyword = anchorCommonStruct2.getKeyword();
            if (keyword != null) {
                str = keyword;
            }
            a2.setTitle(str);
            a2.setSubTitle(anchorCommonStruct2.getDescription());
            List<AnchorPanelAction> actions = anchorCommonStruct2.getActions();
            if (!(actions == null || (anchorPanelAction = (AnchorPanelAction) n.h((List) actions)) == null)) {
                a2.setButtonIcon(anchorPanelAction.getIcon());
                a2.setButtonOnClickListener(new C2838a(a2, this, anchorCommonStruct2));
            }
            this.$parent.addView(a2);
            z zVar = z.f158842a;
            MethodCollector.o(4029);
            return zVar;
        }
    }

    public h() {
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        this.f110956d = uuid;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        l.d(dVar, "");
        e(dVar);
    }

    public final void e(d dVar) {
        o.a(this, dVar, false, false, 4);
        ai aiVar = new ai();
        aiVar.q = "anchor_combine_page";
        aiVar.f109486a = "anchor_combine_mv";
        aiVar.f109487b = o().getAid();
        aiVar.p = this.f110956d;
        aiVar.f109488c = "sound_sync";
        aiVar.f109489d = "upload";
        aiVar.f109488c = "video";
        aiVar.f();
        a(new b(this));
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(71194);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(h hVar) {
            super(1);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            l.d(anchorCommonStruct2, "");
            final Uri parse = Uri.parse(anchorCommonStruct2.getSchema());
            l.b(parse, "");
            if (p.a("studio", parse.getHost(), true) && p.a("/upload", parse.getPath(), true)) {
                AVExternalServiceImpl.a().asyncService(this.this$0.r(), "upload_anchor", new IExternalService.ServiceLoadCallback(this) {
                    /* class com.ss.android.ugc.aweme.multi.maker.h.b.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ b f110957a;

                    static {
                        Covode.recordClassIndex(71195);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onDismiss() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onFailed() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onOK() {
                        IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                    }

                    {
                        this.f110957a = r1;
                    }

                    @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j2) {
                        MusicModel musicModel;
                        l.d(asyncAVService, "");
                        RecordConfig.Builder shootWay = new RecordConfig.Builder().creationId(this.f110957a.this$0.f110956d).enterFrom("anchor_combine_page").shootWay("anchor_combine_mv");
                        PhotoMvAnchorConfig photoMvAnchorConfig = new PhotoMvAnchorConfig();
                        photoMvAnchorConfig.setSlideshowMvId(parse.getQueryParameter("slideshow_mv_id"));
                        Music music = this.f110957a.this$0.o().getMusic();
                        if (music != null) {
                            musicModel = music.convertToMusicModel();
                        } else {
                            musicModel = null;
                        }
                        photoMvAnchorConfig.setMusicModel(musicModel);
                        photoMvAnchorConfig.setTemplateType(parse.getQueryParameter("template_type"));
                        asyncAVService.uiService().recordService().startRecordSlideShowPhotoMV(this.f110957a.this$0.r(), shootWay.build(), photoMvAnchorConfig);
                    }
                });
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(ViewGroup viewGroup, Dialog dialog, d dVar) {
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        a(new a(this, viewGroup, dVar));
    }
}
