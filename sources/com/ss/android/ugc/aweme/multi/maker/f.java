package com.ss.android.ugc.aweme.multi.maker;

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
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.multi.g;
import com.ss.android.ugc.aweme.multi.ui.ToolsAnchorItem;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class f extends o {

    /* renamed from: d  reason: collision with root package name */
    public AnchorPanelAction f110953d;

    static {
        Covode.recordClassIndex(71186);
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "app_page";
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new e();
    }

    static final class a extends m implements h.f.a.b<AnchorCommonStruct, z> {
        final /* synthetic */ d $eventMapBuilder;
        final /* synthetic */ ViewGroup $parent;
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(71187);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(f fVar, ViewGroup viewGroup, d dVar) {
            super(1);
            this.this$0 = fVar;
            this.$parent = viewGroup;
            this.$eventMapBuilder = dVar;
        }

        static final class b extends m implements h.f.a.a<z> {
            final /* synthetic */ AnchorCommonStruct $this_withAnchor$inlined;
            final /* synthetic */ a this$0;

            static {
                Covode.recordClassIndex(71189);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(a aVar, AnchorCommonStruct anchorCommonStruct) {
                super(0);
                this.this$0 = aVar;
                this.$this_withAnchor$inlined = anchorCommonStruct;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // h.f.a.a
            public final /* synthetic */ z invoke() {
                String id;
                String str;
                f fVar = this.this$0.this$0;
                AnchorCommonStruct anchorCommonStruct = fVar.f110994h;
                if (!(anchorCommonStruct == null || (id = anchorCommonStruct.getId()) == null)) {
                    if (com.ss.android.ugc.aweme.commercialize.e.a.b.U(fVar.o())) {
                        r.a("dou_promote_layer_show", new d().a("enter_from", fVar.p()).a("group_id", fVar.o().getAid()).a("author_id", fVar.o().getAuthorUid()).f66730a);
                        new com.bytedance.tux.g.b(fVar.r()).e(R.string.og).b();
                    } else if (AVExternalServiceImpl.a().publishService().checkIsAlreadyPublished(fVar.r())) {
                        MovieReuseServiceImpl.a().a(fVar.r(), null, id, null, "anchor_combine_mv", "anchor_combine_page");
                        d a2 = new d().a("shoot_way", "anchor_combine_mv").a("enter_from", "anchor_combine_page").a("mv_id", id).a("log_pb", ac.a.f91473a.a(new LogPbBean())).a("group_id", fVar.o().getAid()).a("author_id", fVar.o().getAuthorUid());
                        if (fVar.o().getUploadMiscInfoStruct().mvType == 1) {
                            str = "jianying_mv";
                        } else {
                            str = "mv";
                        }
                        r.a("shoot", a2.a("content_type", str).f66730a);
                    }
                }
                return z.f158842a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.f$a$a  reason: collision with other inner class name */
        static final class View$OnClickListenerC2837a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f110954a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AnchorCommonStruct f110955b;

            static {
                Covode.recordClassIndex(71188);
            }

            View$OnClickListenerC2837a(a aVar, AnchorCommonStruct anchorCommonStruct) {
                this.f110954a = aVar;
                this.f110955b = anchorCommonStruct;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f110954a.this$0.d(this.f110954a.$eventMapBuilder);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(AnchorCommonStruct anchorCommonStruct) {
            UrlModel urlModel;
            MethodCollector.i(4174);
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
            a2.setOnClickListener(new View$OnClickListenerC2837a(this, anchorCommonStruct2));
            AnchorPanelAction anchorPanelAction = this.this$0.f110953d;
            if (anchorPanelAction != null) {
                urlModel = anchorPanelAction.getIcon();
            } else {
                urlModel = null;
            }
            a2.setButtonIcon(urlModel);
            a2.setButtonOnClickListener(new b(this, anchorCommonStruct2));
            this.$parent.addView(a2);
            z zVar = z.f158842a;
            MethodCollector.o(4174);
            return zVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(d dVar) {
        l.d(dVar, "");
        r.a("multi_anchor_entrance_click", e(dVar).f66730a);
        r.a("anchor_entrance_click", e(t()).f66730a);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(d dVar) {
        l.d(dVar, "");
        r.a("multi_anchor_entrance_show", e(dVar).f66730a);
        r.a("anchor_entrance_show", e(t()).f66730a);
    }

    private final d e(d dVar) {
        String str;
        String str2;
        String str3;
        Aweme o = o();
        String optString = s().optString("request_id");
        if (optString == null) {
            optString = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(optString);
        d a2 = dVar.a("log_pb", ac.a.f91473a.a(logPbBean));
        if (o == null || (str = o.getAuthorUid()) == null) {
            str = "";
        }
        d a3 = a2.a("author_id", str);
        if (o == null || (str2 = o.getAid()) == null) {
            str2 = "";
        }
        d a4 = a3.a("group_id", str2).a("enter_from", p());
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            str3 = anchorCommonStruct.getId();
        } else {
            str3 = null;
        }
        d a5 = a4.a("mv_id", str3);
        l.b(a5, "");
        return a5;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final g a(List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        List<AnchorPanelAction> actions;
        l.d(list, "");
        Aweme b2 = a().b();
        if (AVExternalServiceImpl.a().configService().avsettingsConfig().getMvThemeRecordMode()) {
            int i2 = o().getUploadMiscInfoStruct().mvType;
            int mvPlan = AVExternalServiceImpl.a().configService().avsettingsConfig().getMvPlan();
            if ((i2 != 1 || mvPlan >= 2) && b2.getAwemeType() != 61) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    anchorPanelAction = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    T t = next;
                    if (t.getType() == 29 && (actions = t.getActions()) != null) {
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
                this.f110953d = anchorPanelAction;
                this.f110994h = anchorCommonStruct;
                if (arrayList2.size() > 1) {
                    return g.PROCEED;
                }
                return g.DONE;
            }
        }
        return g.NOT_FOUND;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(d dVar) {
        String id;
        String str;
        String str2 = "";
        l.d(dVar, str2);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null && (id = anchorCommonStruct.getId()) != null && !TextUtils.isEmpty(id)) {
            d e2 = e(dVar);
            l.d(e2, str2);
            d a2 = new d().a(new HashMap<>(e2.f66730a));
            l.b(a2, str2);
            r.a("enter_multi_anchor_detail", a2.a("click_type", "app_page").f66730a);
            SmartRoute withParam = SmartRouter.buildRoute(r(), "//movie/detail").withParam("mv_id", id).withParam("enter_from", p());
            String aid = o().getAid();
            if (aid != null) {
                str2 = aid;
            }
            SmartRoute withParam2 = withParam.withParam("group_id", str2);
            AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getId();
            } else {
                str = null;
            }
            withParam2.withParam(StringSet.type, str).open(10086);
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
