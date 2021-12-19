package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.h;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.experiment.dq;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.x.v;
import com.ss.android.ugc.aweme.multi.g;
import com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.aweme.utils.in;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.j;
import h.f.b.l;
import h.f.b.m;
import h.f.b.z;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public final class p extends o {

    /* renamed from: e  reason: collision with root package name */
    public static final a f110999e = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    public AnchorPanelAction f111000d;

    /* renamed from: f  reason: collision with root package name */
    private final int f111001f;

    static {
        Covode.recordClassIndex(71224);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "app_page";
    }

    public static final class a {
        static {
            Covode.recordClassIndex(71225);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static int a(String str) {
            if (str == null) {
                return 0;
            }
            try {
                return new JSONObject(str).optInt("green_screen_materials_type");
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public /* synthetic */ p() {
        this(0);
    }

    static final class c extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.app.f.d $eventMapBuilder;
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(71227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p pVar, ViewGroup viewGroup, com.ss.android.ugc.aweme.app.f.d dVar) {
            super(1);
            this.this$0 = pVar;
            this.$parent = viewGroup;
            this.$eventMapBuilder = dVar;
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ z.e $anchorTitle$inlined;
            final /* synthetic */ AnchorCommonStruct $this_withAnchor$inlined;
            final /* synthetic */ c this$0;

            static {
                Covode.recordClassIndex(71229);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(c cVar, AnchorCommonStruct anchorCommonStruct, z.e eVar) {
                super(0);
                this.this$0 = cVar;
                this.$this_withAnchor$inlined = anchorCommonStruct;
                this.$anchorTitle$inlined = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ h.z invoke() {
                p pVar = this.this$0.this$0;
                pVar.a(new d(pVar));
                return h.z.f158842a;
            }
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f111002a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AnchorCommonStruct f111003b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ z.e f111004c;

            static {
                Covode.recordClassIndex(71228);
            }

            a(c cVar, AnchorCommonStruct anchorCommonStruct, z.e eVar) {
                this.f111002a = cVar;
                this.f111003b = anchorCommonStruct;
                this.f111004c = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f111002a.this$0.d(this.f111002a.$eventMapBuilder);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(AnchorCommonStruct anchorCommonStruct) {
            T t;
            MethodCollector.i(3591);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            l.d(anchorCommonStruct2, str);
            z.e eVar = new z.e();
            eVar.element = (T) anchorCommonStruct2.getKeyword();
            Context context = this.$parent.getContext();
            l.b(context, str);
            ToolsAnchorItem a2 = ToolsAnchorItem.a.a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a2.setIcon(thumbnail);
            }
            UrlModel urlModel = null;
            if (dq.a() && !in.e() && Aweme.isGreenScreenGiphyAnchor(this.this$0.f110994h)) {
                String b2 = h.b(R.string.c4v);
                if (b2 != null) {
                    t = (T) com.a.a(b2, Arrays.copyOf(new Object[]{anchorCommonStruct2.getKeyword()}, 1));
                    l.b(t, str);
                } else {
                    t = null;
                }
                eVar.element = t;
            }
            T t2 = eVar.element;
            if (t2 != null) {
                str = t2;
            }
            a2.setTitle(str);
            a2.setSubTitle(anchorCommonStruct2.getDescription());
            a2.setOnClickListener(new a(this, anchorCommonStruct2, eVar));
            AnchorPanelAction anchorPanelAction = this.this$0.f111000d;
            if (anchorPanelAction != null) {
                urlModel = anchorPanelAction.getIcon();
            }
            a2.setButtonIcon(urlModel);
            a2.setButtonOnClickListener(new b(this, anchorCommonStruct2, eVar));
            this.$parent.addView(a2);
            h.z zVar = h.z.f158842a;
            MethodCollector.o(3591);
            return zVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final String g() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            return "";
        }
        return keyword;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final com.ss.android.ugc.aweme.multi.c i() {
        return new p(this.f111001f + 1);
    }

    private final String n() {
        String str;
        JSONObject s = s();
        if (s == null || (str = s.optString("request_id")) == null) {
            str = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String a2 = ac.a.f91473a.a(logPbBean);
        l.b(a2, "");
        return a2;
    }

    private p(int i2) {
        this.f111001f = i2;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(dVar, "");
        r.a("multi_anchor_entrance_show", a(dVar, c("")).f66730a);
        r.a("anchor_entrance_show", a(t(), c("")).f66730a);
        if (o().isAd()) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow", o().getAwemeRawAd()).b("refer", "prop_anchor").b();
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(dVar, "");
        r.a("multi_anchor_entrance_click", a(dVar, c("")).f66730a);
        r.a("anchor_entrance_click", a(t(), c("")).f66730a);
        if (o().isAd()) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "otherclick", o().getAwemeRawAd()).b("refer", "prop_anchor").b();
        }
    }

    static final class d extends m implements h.f.a.b<AnchorCommonStruct, h.z> {
        final /* synthetic */ p this$0;

        static {
            Covode.recordClassIndex(71230);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(p pVar) {
            super(1);
            this.this$0 = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(AnchorCommonStruct anchorCommonStruct) {
            String str;
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            l.d(anchorCommonStruct2, "");
            if (!dq.a() || in.e() || !Aweme.isGreenScreenGiphyAnchor(this.this$0.f110994h)) {
                str = null;
            } else {
                str = this.this$0.o().getGiphyGifIds();
            }
            boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            IPropReuseService c2 = PropReuseServiceImpl.c();
            Activity e2 = this.this$0.a().e();
            List<String> a2 = n.a(anchorCommonStruct2.getId());
            if (str == null) {
                str = "";
            }
            Music music = this.this$0.o().getMusic();
            Video video = this.this$0.o().getVideo();
            l.b(video, "");
            c2.a(e2, a2, new com.ss.android.ugc.aweme.model.a.a("anchor_combine_prop", music, "prop_auto", "anchor_combine_page", "anchor_combine_prop", null, null, false, str, Integer.valueOf(video.getVideoLength()), 26449), downloadEffectOrMusicAfterEnterCamera);
            return h.z.f158842a;
        }
    }

    private JSONObject c(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        l.d(str, "");
        Aweme o = o();
        s a2 = new s().a("log_pb", n());
        if (o == null || (str2 = o.getAuthorUid()) == null) {
            str2 = "";
        }
        s a3 = a2.a("author_id", str2);
        if (o == null || (str3 = o.getAid()) == null) {
            str3 = "";
        }
        s a4 = a3.a("group_id", str3).a("enter_from", p());
        if (o == null || !o.isForwardAweme()) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        s a5 = a4.a("is_reposted", str4);
        String str9 = null;
        if (o != null) {
            str5 = o.getRepostFromGroupId();
        } else {
            str5 = null;
        }
        s a6 = a5.a("repost_from_group_id", str5);
        if (o != null) {
            str6 = o.getRepostFromUserId();
        } else {
            str6 = null;
        }
        s a7 = a6.a("repost_from_user_id", str6);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct == null || (str7 = anchorCommonStruct.getId()) == null) {
            str7 = "";
        }
        s a8 = a7.a("prop_id", str7);
        AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
        if (anchorCommonStruct2 != null) {
            str9 = anchorCommonStruct2.getExtra();
        }
        int a9 = a.a(str9);
        if (a9 == 1) {
            str8 = UGCMonitor.TYPE_PHOTO;
        } else if (a9 != 3) {
            str8 = "Unknown";
        } else {
            str8 = "giphy";
        }
        a8.a("media_type", str8);
        if (!TextUtils.isEmpty(str)) {
            a8.a("impr_type", str);
        }
        v.b(p(), new b(a8));
        JSONObject a10 = a8.a();
        l.b(a10, "");
        return a10;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final g a(List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        List<AnchorPanelAction> actions;
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            anchorPanelAction = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t = next;
            if (t.getType() == 28 && (actions = t.getActions()) != null) {
                Iterator<T> it2 = actions.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next2 = it2.next();
                    if (next2.getActionType() == 1) {
                        if (next2 != null) {
                            arrayList.add(next);
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() == 0) {
            return g.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) n.g((List) arrayList2);
        a(anchorCommonStruct);
        b(anchorCommonStruct);
        list.remove(anchorCommonStruct);
        List<AnchorPanelAction> actions2 = anchorCommonStruct.getActions();
        if (actions2 != null) {
            Iterator<T> it3 = actions2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                T next3 = it3.next();
                if (next3.getActionType() == 1) {
                    anchorPanelAction = next3;
                    break;
                }
            }
            anchorPanelAction = anchorPanelAction;
        }
        this.f111000d = anchorPanelAction;
        this.f110994h = anchorCommonStruct;
        if (arrayList2.size() > 1) {
            return g.PROCEED;
        }
        return g.DONE;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(com.ss.android.ugc.aweme.app.f.d dVar) {
        com.ss.android.ugc.aweme.shortvideo.c cVar;
        Music music;
        String str;
        l.d(dVar, "");
        Aweme o = o();
        String str2 = null;
        if (o.getMusic() == null || CommerceMediaServiceImpl.f().b(o.getMusic())) {
            cVar = null;
        } else {
            cVar = MainServiceImpl.createIMainServicebyMonsterPlugin(false).avMusicApply(o.getMusic().convertToMusicModel());
        }
        if (o.getMusic() == null || CommerceMediaServiceImpl.f().b(o.getMusic())) {
            music = null;
        } else {
            music = o.getMusic();
        }
        SmartRoute withParam = SmartRouter.buildRoute(r(), "//stickers/detail").withParam("aweme_id", o.getAid()).withParam("music_model", music).withParam("sticker_music", cVar);
        String[] strArr = new String[1];
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct == null || (str = anchorCommonStruct.getId()) == null) {
            str = "";
        }
        strArr[0] = str;
        SmartRoute withParam2 = withParam.withParam("extra_stickers", n.d(strArr)).withParam("extra_log_pb", n());
        AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        }
        SmartRoute withParam3 = withParam2.withParam("media_type", a.a(str2));
        Video video = o.getVideo();
        l.b(video, "");
        withParam3.withParam("EXTRA_VIDEO_LENGTH", video.getVideoLength()).withParam("extra_previous_page", p()).open();
        String j2 = com.ss.android.ugc.aweme.metrics.ac.j(o);
        l.b(j2, "");
        r.a("enter_prop_detail", c(j2));
        r.a("enter_multi_anchor_detail", a(dVar, c("")).f66730a);
        if (o().isAd()) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("anchor_detail", "otherclick", o().getAwemeRawAd()).b("refer", "prop_anchor").b();
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class b extends j implements h.f.a.m<String, String, s> {
        static {
            Covode.recordClassIndex(71226);
        }

        b(s sVar) {
            super(2, sVar, s.class, "addParam", "addParam(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/common/MobJsonHelper;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ s invoke(String str, String str2) {
            return ((s) this.receiver).a(str, str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(ViewGroup viewGroup, Dialog dialog, com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(viewGroup, "");
        l.d(dialog, "");
        l.d(dVar, "");
        a(new c(this, viewGroup, dVar));
    }
}
