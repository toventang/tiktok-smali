package com.ss.android.ugc.aweme.shortvideo.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.google.c.a.s;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.ck;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.experiment.dq;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.multi.maker.p;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.MultiAnchorPublishModel;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.utils.aa;
import com.ss.android.ugc.aweme.utils.dg;
import com.ss.android.ugc.aweme.utils.hk;
import com.ss.android.ugc.aweme.utils.in;
import com.ss.android.ugc.aweme.wiki.AddWikiActivity;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.v;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.j;
import org.json.JSONObject;

public final class x implements IAVPublishExtension<MultiAnchorPublishModel>, org.greenrobot.eventbus.i, j {

    /* renamed from: a  reason: collision with root package name */
    public final int f131947a = 2;

    /* renamed from: b  reason: collision with root package name */
    public ck f131948b;

    /* renamed from: c  reason: collision with root package name */
    public Fragment f131949c;

    /* renamed from: d  reason: collision with root package name */
    public ExtensionMisc f131950d;

    /* renamed from: e  reason: collision with root package name */
    public AVPublishContentType f131951e;

    /* renamed from: f  reason: collision with root package name */
    public PublishOutput f131952f;

    /* renamed from: g  reason: collision with root package name */
    public com.ss.android.ugc.aweme.commercialize.b.b f131953g;

    /* renamed from: h  reason: collision with root package name */
    private PublishExtensionModel f131954h;

    /* renamed from: i  reason: collision with root package name */
    private String f131955i;

    /* renamed from: j  reason: collision with root package name */
    private UrlModel f131956j;

    static {
        Covode.recordClassIndex(86453);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return "MultiAnchorPublishExtension";
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(163, new org.greenrobot.eventbus.g(x.class, "onAsyncAnchor", com.ss.android.ugc.aweme.commercialize.b.a.class, ThreadMode.MAIN, 0, false));
        hashMap.put(244, new org.greenrobot.eventbus.g(x.class, "onJsBroacastReceiver", com.ss.android.ugc.aweme.fe.method.j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    static final class h extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f131965a = new h();

        static {
            Covode.recordClassIndex(86462);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return this.f131956j;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return this.f131955i;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreateFinish() {
        IAVPublishExtension.DefaultImpls.onCreateFinish(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        IAVPublishExtension.DefaultImpls.onResume(this);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final /* synthetic */ MultiAnchorPublishModel provideExtensionData() {
        return new MultiAnchorPublishModel();
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ List $list$inlined;
        final /* synthetic */ AnchorPublishStruct $struct;
        final /* synthetic */ View $view$inlined;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(86456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AnchorPublishStruct anchorPublishStruct, List list, x xVar, View view) {
            super(0);
            this.$struct = anchorPublishStruct;
            this.$list$inlined = list;
            this.this$0 = xVar;
            this.$view$inlined = view;
        }

        private static boolean a() {
            try {
                return f.a.f68431a.c();
            } catch (Exception unused) {
                return false;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            this.$view$inlined.getContext();
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                com.ss.android.ugc.aweme.lancet.j.f107226e = a();
            }
            if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                new com.bytedance.tux.g.b(this.$view$inlined).e(R.string.aye).b();
                com.ss.android.ugc.aweme.commercialize.b.b bVar = this.this$0.f131953g;
                if (bVar != null) {
                    bVar.dismiss();
                }
            } else {
                r.a("add_label", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "label_panel").a("business_type", this.$struct.type).a("new_tag", this.$struct.isNew ? 1 : 0).a("anchor_type", AnchorListManager.a(this.$struct)).f66730a);
                com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                String str = "";
                l.b(createIUserServicebyMonsterPlugin, str);
                r.a("tiktokec_video_add_link_click", dVar.a("author_id", createIUserServicebyMonsterPlugin.getCurrentUserID()).a("page_name", "video_add_link").a("EVENT_ORIGIN_FEATURE", "TEMAI").a("button_for", this.$struct.type).f66730a);
                int i2 = this.$struct.type;
                if (i2 == ab.WIKIPEDIA.getTYPE()) {
                    if (!this.$struct.enable) {
                        Context context = x.a(this.this$0).getContext();
                        if (context != null) {
                            new com.bytedance.tux.g.b(x.a(this.this$0)).a(context.getString(R.string.hf8)).b();
                        }
                    } else {
                        Context context2 = x.b(this.this$0).getContext();
                        l.b(context2, str);
                        String str2 = this.$struct.webUrl;
                        if (str2 == null) {
                            str2 = str;
                        }
                        p[] pVarArr = new p[4];
                        pVarArr[0] = v.a("title", x.a(this.this$0).getString(R.string.ayv));
                        String shootWay = this.this$0.a().getMobParam().getShootWay();
                        if (shootWay == null) {
                            shootWay = str;
                        }
                        pVarArr[1] = v.a("shoot_way", shootWay);
                        String creationId = this.this$0.a().getMobParam().getCreationId();
                        if (creationId != null) {
                            str = creationId;
                        }
                        pVarArr[2] = v.a("creation_id", str);
                        pVarArr[3] = v.a("show_keyboard", "true");
                        AddWikiActivity.a.a(context2, str2, ag.a(pVarArr), ag.a());
                        com.ss.android.ugc.aweme.commercialize.b.b bVar2 = this.this$0.f131953g;
                        if (bVar2 != null) {
                            bVar2.dismiss();
                        }
                    }
                } else if (i2 == ab.YELP.getTYPE()) {
                    Context context3 = x.b(this.this$0).getContext();
                    l.b(context3, str);
                    String str3 = this.$struct.webUrl;
                    if (str3 == null) {
                        str3 = str;
                    }
                    p[] pVarArr2 = new p[5];
                    String shootWay2 = this.this$0.a().getMobParam().getShootWay();
                    if (shootWay2 == null) {
                        shootWay2 = str;
                    }
                    pVarArr2[0] = v.a("shoot_way", shootWay2);
                    String creationId2 = this.this$0.a().getMobParam().getCreationId();
                    if (creationId2 != null) {
                        str = creationId2;
                    }
                    pVarArr2[1] = v.a("creation_id", str);
                    pVarArr2[2] = v.a("host_filter", "true");
                    pVarArr2[3] = v.a("anchor_type", "Yelp");
                    pVarArr2[4] = v.a("addButton", "true");
                    AddWikiActivity.a.a(context3, str3, ag.a(pVarArr2), ag.a());
                    com.ss.android.ugc.aweme.commercialize.b.b bVar3 = this.this$0.f131953g;
                    if (bVar3 != null) {
                        bVar3.dismiss();
                    }
                } else if (i2 == ab.TRIP_ADVISOR.getTYPE()) {
                    Context context4 = x.b(this.this$0).getContext();
                    l.b(context4, str);
                    String str4 = this.$struct.webUrl;
                    if (str4 == null) {
                        str4 = str;
                    }
                    p[] pVarArr3 = new p[5];
                    String shootWay3 = this.this$0.a().getMobParam().getShootWay();
                    if (shootWay3 == null) {
                        shootWay3 = str;
                    }
                    pVarArr3[0] = v.a("shoot_way", shootWay3);
                    String creationId3 = this.this$0.a().getMobParam().getCreationId();
                    if (creationId3 != null) {
                        str = creationId3;
                    }
                    pVarArr3[1] = v.a("creation_id", str);
                    pVarArr3[2] = v.a("host_filter", "true");
                    pVarArr3[3] = v.a("anchor_type", "TripAdvisor");
                    pVarArr3[4] = v.a("addButton", "true");
                    AddWikiActivity.a.a(context4, str4, ag.a(pVarArr3), ag.a());
                    com.ss.android.ugc.aweme.commercialize.b.b bVar4 = this.this$0.f131953g;
                    if (bVar4 != null) {
                        bVar4.dismiss();
                    }
                } else if (i2 == ab.NEWS.getTYPE()) {
                    x xVar = this.this$0;
                    Integer valueOf = Integer.valueOf(ab.NEWS.getTYPE());
                    List list = this.$list$inlined;
                    if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            int i3 = ((AnchorPublishStruct) it.next()).type;
                            if (valueOf != null && i3 == valueOf.intValue()) {
                                if (xVar != null) {
                                    Context requireContext = x.a(this.this$0).requireContext();
                                    l.b(requireContext, str);
                                    l.d(requireContext, str);
                                    SmartRouter.buildRoute(requireContext, "//main/link_anchor_add").open();
                                }
                            }
                        }
                    }
                    com.ss.android.ugc.aweme.commercialize.b.b bVar5 = this.this$0.f131953g;
                    if (bVar5 != null) {
                        bVar5.dismiss();
                    }
                } else if (i2 == ab.ANCHOR_SHOP_LINK.getTYPE()) {
                    PublishOutput publishOutput = this.this$0.f131952f;
                    if (publishOutput == null) {
                        l.a("publishOutput");
                    }
                    AVPublishContentType aVPublishContentType = this.this$0.f131951e;
                    if (aVPublishContentType == null) {
                        l.a("contentType");
                    }
                    l.d(publishOutput, str);
                    l.d(aVPublishContentType, str);
                    if (!hk.a(publishOutput.getMusicId()) || aVPublishContentType != AVPublishContentType.Video || publishOutput.isCommercialMusic() || publishOutput.isOriginalSound()) {
                        String str5 = this.$struct.webUrl;
                        if (str5 != null) {
                            t.a(t.a(), x.a(this.this$0).getActivity(), str5);
                        }
                    } else {
                        new com.bytedance.tux.g.b(x.b(this.this$0)).e(R.string.cwh).b();
                    }
                    com.ss.android.ugc.aweme.commercialize.b.b bVar6 = this.this$0.f131953g;
                    if (bVar6 != null) {
                        bVar6.dismiss();
                    }
                } else if (i2 == ab.LIVE_EVENT.getTYPE()) {
                    SmartRouter.buildRoute(x.a(this.this$0).getContext(), this.$struct.scheme).withParam("shoot_way", this.this$0.a().getMobParam().getShootWay()).withParam("creation_id", this.this$0.a().getMobParam().getCreationId()).withParam("title", this.$struct.title).withParam(StringSet.type, this.$struct.type).withParam("subtype", this.$struct.subtype).open();
                    com.ss.android.ugc.aweme.commercialize.b.b bVar7 = this.this$0.f131953g;
                    if (bVar7 != null) {
                        bVar7.dismiss();
                    }
                } else {
                    AnchorPublishStruct anchorPublishStruct = this.$struct;
                    l.d(anchorPublishStruct, str);
                    String str6 = anchorPublishStruct.scheme;
                    if (str6 != null && str6.length() > 0) {
                        if (this.$struct.isNew) {
                            this.$struct.isNew = false;
                            AnchorListManager.f67939d--;
                            com.ss.android.ugc.aweme.commercialize.b.b bVar8 = this.this$0.f131953g;
                            if (bVar8 == null) {
                                l.b();
                            }
                            com.ss.android.ugc.aweme.commercialize.b.a.a aVar = bVar8.f73725b;
                            if (aVar != null) {
                                aVar.notifyDataSetChanged();
                            }
                            AnchorListManager.f67941f.c(this.$struct);
                            this.this$0.c();
                        }
                        SmartRouter.buildRoute(x.a(this.this$0).getContext(), this.$struct.scheme).withParam("shoot_way", this.this$0.a().getMobParam().getShootWay()).withParam("creation_id", this.this$0.a().getMobParam().getCreationId()).withParam("title", this.$struct.title).withParam(StringSet.type, this.$struct.type).withParam("subtype", this.$struct.subtype).open();
                        com.ss.android.ugc.aweme.commercialize.b.b bVar9 = this.this$0.f131953g;
                        if (bVar9 != null) {
                            bVar9.dismiss();
                        }
                    }
                }
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final ViewGroup getAnchorListContent() {
        ck ckVar = this.f131948b;
        if (ckVar == null) {
            l.a("delegate");
        }
        return ckVar.getAnchorListContent();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onEnterChildrenMode() {
        ck ckVar = this.f131948b;
        if (ckVar == null) {
            l.a("delegate");
        }
        ckVar.setVisibility(8);
    }

    static final class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f131962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExtensionMisc f131963b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f131964c;

        static {
            Covode.recordClassIndex(86460);
        }

        f(x xVar, ExtensionMisc extensionMisc, ArrayList arrayList) {
            this.f131962a = xVar;
            this.f131963b = extensionMisc;
            this.f131964c = arrayList;
        }

        public final void run() {
            this.f131963b.getExtensionDataRepo().getUpdateAnchors().setValue(x.a(this.f131964c));
        }
    }

    static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void c() {
        if (AnchorListManager.b()) {
            ck ckVar = this.f131948b;
            if (ckVar == null) {
                l.a("delegate");
            }
            ckVar.b();
            return;
        }
        ck ckVar2 = this.f131948b;
        if (ckVar2 == null) {
            l.a("delegate");
        }
        ckVar2.c();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
        EventBus.a().b(this);
        Map<String, AnchorPublishStruct> c2 = AnchorListManager.c();
        if (c2 != null) {
            for (Map.Entry<String, AnchorPublishStruct> entry : c2.entrySet()) {
                entry.getValue().setOnClickAction(h.f131965a);
            }
        }
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f131957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f131958b;

        static {
            Covode.recordClassIndex(86454);
        }

        a(x xVar, List list) {
            this.f131957a = xVar;
            this.f131958b = list;
        }

        public final void run() {
            boolean z;
            final ArrayList arrayList = new ArrayList();
            for (CreateAnchorInfo createAnchorInfo : this.f131958b) {
                int type = createAnchorInfo.getType();
                String content = createAnchorInfo.getContent();
                String keyword = createAnchorInfo.getKeyword();
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(n.d(createAnchorInfo.getIconUrl()));
                urlModel.setUri(Uri.decode(createAnchorInfo.getIconUrl()));
                String subtype = createAnchorInfo.getSubtype();
                if (createAnchorInfo.getType() == 40) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new com.ss.android.ugc.aweme.common.a(type, content, keyword, null, null, null, urlModel, z, null, createAnchorInfo.getLanguage(), createAnchorInfo.getAddTime(), createAnchorInfo.getExtra(), subtype, 312, null));
            }
            List<com.ss.android.ugc.aweme.common.a> value = this.f131957a.a().getExtensionDataRepo().getUpdateAnchors().getValue();
            if (value != null) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            View view = x.a(this.f131957a).getView();
            if (view != null) {
                view.post(new Runnable(this) {
                    /* class com.ss.android.ugc.aweme.shortvideo.ui.x.a.AnonymousClass1 */

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ a f131959a;

                    static {
                        Covode.recordClassIndex(86455);
                    }

                    {
                        this.f131959a = r1;
                    }

                    public final void run() {
                        this.f131959a.f131957a.a().getExtensionDataRepo().getUpdateAnchors().setValue(x.a(arrayList));
                    }
                });
            }
        }
    }

    public final ExtensionMisc a() {
        ExtensionMisc extensionMisc = this.f131950d;
        if (extensionMisc == null) {
            l.a("extensionMisc");
        }
        return extensionMisc;
    }

    public static final /* synthetic */ Fragment a(x xVar) {
        Fragment fragment = xVar.f131949c;
        if (fragment == null) {
            l.a("fragment");
        }
        return fragment;
    }

    public static final /* synthetic */ ck b(x xVar) {
        ck ckVar = xVar.f131948b;
        if (ckVar == null) {
            l.a("delegate");
        }
        return ckVar;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        l.d(publishOutput, "");
        IAVPublishExtension.DefaultImpls.onBackPressed(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        l.d(publishOutput, "");
        IAVPublishExtension.DefaultImpls.onPublish(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        l.d(publishOutput, "");
        IAVPublishExtension.DefaultImpls.onSaveDraft(this, publishOutput);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
        IAVPublishExtension.DefaultImpls.onSaveInstanceState(this, bundle);
    }

    public static ArrayList<com.ss.android.ugc.aweme.common.a> a(ArrayList<com.ss.android.ugc.aweme.common.a> arrayList) {
        ArrayList<com.ss.android.ugc.aweme.common.a> arrayList2 = new ArrayList<>();
        for (T t : arrayList) {
            if (!a((com.ss.android.ugc.aweme.common.a) t, (List<com.ss.android.ugc.aweme.common.a>) arrayList2)) {
                arrayList2.add(t);
            }
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setLeftIcon(int i2) {
        ck ckVar = this.f131948b;
        if (ckVar == null) {
            l.a("delegate");
        }
        RemoteImageView leftIcon = ckVar.getLeftIcon();
        if (leftIcon != null) {
            leftIcon.setImageResource(i2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setRightIcon(com.bytedance.tux.c.a aVar) {
        l.d(aVar, "");
        ck ckVar = this.f131948b;
        if (ckVar == null) {
            l.a("delegate");
        }
        TuxIconView rightIcon = ckVar.getRightIcon();
        if (rightIcon != null) {
            rightIcon.setTuxIcon(aVar);
        }
    }

    private final List<com.ss.android.ugc.aweme.common.a> a(com.ss.android.ugc.aweme.common.a aVar) {
        ArrayList arrayList = new ArrayList();
        ExtensionMisc extensionMisc = this.f131950d;
        if (extensionMisc == null) {
            l.a("extensionMisc");
        }
        List<com.ss.android.ugc.aweme.common.a> value = extensionMisc.getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        arrayList.add(aVar);
        return a(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        l.d(list, "");
        if (this.f131948b != null) {
            Fragment fragment = this.f131949c;
            if (fragment == null) {
                l.a("fragment");
            }
            androidx.fragment.app.e activity = fragment.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new a(this, list));
            }
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onAsyncAnchor(com.ss.android.ugc.aweme.commercialize.b.a aVar) {
        com.ss.android.ugc.aweme.common.a aVar2;
        if (!(aVar == null || (aVar2 = aVar.f73700a) == null)) {
            aVar2.setAddTime(Long.valueOf(SystemClock.elapsedRealtime()));
            ExtensionMisc extensionMisc = this.f131950d;
            if (extensionMisc == null) {
                l.a("extensionMisc");
            }
            extensionMisc.getExtensionDataRepo().getUpdateAnchors().setValue(a(aVar2));
        }
        com.ss.android.ugc.aweme.commercialize.b.b bVar = this.f131953g;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    static final class g extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {
        final /* synthetic */ Fragment $fragment;

        static {
            Covode.recordClassIndex(86461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(Fragment fragment) {
            super(1);
            this.$fragment = fragment;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_chevron_right_offset_ltr;
            aVar2.f44752d = Integer.valueOf(this.$fragment.getResources().getColor(R.color.c5));
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            aVar2.f44750b = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            aVar2.f44751c = h.g.a.a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    static final /* synthetic */ class e extends h.f.b.j implements h.f.a.b<View, z> {
        static {
            Covode.recordClassIndex(86459);
        }

        e(x xVar) {
            super(1, xVar, x.class, "onAddClick", "onAddClick(Landroid/view/View;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            View view2 = view;
            l.d(view2, "");
            x xVar = (x) this.receiver;
            ExtensionMisc extensionMisc = xVar.f131950d;
            if (extensionMisc == null) {
                l.a("extensionMisc");
            }
            List<com.ss.android.ugc.aweme.common.a> value = extensionMisc.getExtensionDataRepo().getUpdateAnchors().getValue();
            if (value != null) {
                if (value.size() >= 10) {
                    new com.bytedance.tux.g.b(view2).e(R.string.tr).b();
                } else {
                    view2.getContext();
                    if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
                        com.ss.android.ugc.aweme.lancet.j.f107226e = x.b();
                    }
                    if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
                        new com.bytedance.tux.g.b(view2).e(R.string.aye).b();
                    } else {
                        r.a("open_label_panel", new com.ss.android.ugc.aweme.app.f.d().a("awareness_dot", AnchorListManager.b() ? 1 : 0).f66730a);
                        if (xVar.f131953g == null) {
                            List<AnchorPublishStruct> f2 = AnchorListManager.f67941f.f();
                            if (f2 != null) {
                                Iterator<T> it = f2.iterator();
                                while (it.hasNext()) {
                                    it.next().enable = true;
                                }
                                Context context = view2.getContext();
                                l.b(context, "");
                                Fragment fragment = xVar.f131949c;
                                if (fragment == null) {
                                    l.a("fragment");
                                }
                                xVar.f131953g = new com.ss.android.ugc.aweme.commercialize.b.b(context, f2, fragment);
                                for (T t : f2) {
                                    ExtensionMisc extensionMisc2 = xVar.f131950d;
                                    if (extensionMisc2 == null) {
                                        l.a("extensionMisc");
                                    }
                                    t.setExtensionMisc(extensionMisc2);
                                    t.setOnClickAction(new b(t, f2, xVar, view2));
                                }
                            }
                        }
                        com.ss.android.ugc.aweme.commercialize.b.b bVar = xVar.f131953g;
                        if (bVar == null) {
                            l.b();
                        }
                        bVar.show();
                    }
                }
            }
            return z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r(a = ThreadMode.MAIN)
    public final void onJsBroacastReceiver(com.ss.android.ugc.aweme.fe.method.j jVar) {
        l.d(jVar, "");
        try {
            String string = jVar.f91311b.getString("eventName");
            if (string != null && l.a((Object) string, (Object) "anchor_merch_pick_content") && jVar.f91311b.has("data")) {
                String optString = jVar.f91311b.optString("data");
                r.a("rd_tiktokec_shop_anchor_jsb_add_event", new com.ss.android.ugc.aweme.app.f.d().a("jsb_param", optString).a("where", getName()).f66730a);
                JSONObject jSONObject = new JSONObject(optString);
                int optInt = jSONObject.optInt(StringSet.type, ab.ANCHOR_SHOP_LINK.getTYPE());
                String optString2 = jSONObject.optString("keyword", "");
                String optString3 = jSONObject.optString("subtype", "");
                String optString4 = jSONObject.optString("url", "");
                l.b(optString, "");
                com.ss.android.ugc.aweme.common.a aVar = new com.ss.android.ugc.aweme.common.a(optInt, optString, optString2, null, 1, null, null, false, optString4, null, Long.valueOf(SystemClock.elapsedRealtime()), null, optString3, 2792, null);
                ExtensionMisc extensionMisc = this.f131950d;
                if (extensionMisc == null) {
                    l.a("extensionMisc");
                }
                extensionMisc.getExtensionDataRepo().getUpdateAnchors().setValue(a(aVar));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            r.a("rd_tiktokec_shop_anchor_exception", new com.ss.android.ugc.aweme.app.f.d().a("e_stack_trace", s.b(e2)).a("extra_data", jVar.f91311b).a("where", getName()).f66730a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i extends m implements h.f.a.b<View, z> {
        final /* synthetic */ List $anchorList$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.common.a $it;
        final /* synthetic */ x this$0;

        static {
            Covode.recordClassIndex(86463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(com.ss.android.ugc.aweme.common.a aVar, x xVar, List list) {
            super(1);
            this.$it = aVar;
            this.this$0 = xVar;
            this.$anchorList$inlined = list;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(View view) {
            Integer num;
            l.d(view, "");
            List<com.ss.android.ugc.aweme.common.a> value = this.this$0.a().getExtensionDataRepo().getUpdateAnchors().getValue();
            View view2 = null;
            if (!(value instanceof ArrayList)) {
                value = null;
            }
            ArrayList arrayList = (ArrayList) value;
            if (arrayList != null) {
                arrayList.remove(this.$it);
                this.this$0.a(this.$anchorList$inlined, arrayList);
            }
            this.this$0.a().getExtensionDataRepo().getUpdateAnchors().setValue(arrayList);
            if (this.$it.getBusinessType() == ab.ANCHOR_SHOP_LINK.getTYPE() || this.$it.getBusinessType() == ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        com.ss.android.ugc.aweme.common.a aVar = (com.ss.android.ugc.aweme.common.a) obj;
                        if (aVar.getBusinessType() == ab.ANCHOR_SHOP_LINK.getTYPE() || aVar.getBusinessType() == ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                            arrayList2.add(obj);
                        }
                    }
                    num = Integer.valueOf(arrayList2.size());
                } else {
                    num = null;
                }
                if (x.b(this.this$0).getVisibility() == 0 && num != null && num.intValue() == 0) {
                    View view3 = x.a(this.this$0).getView();
                    if (view3 != null) {
                        view2 = view3.findViewById(R.id.atp);
                    }
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.publish.IAVMentionEditText");
                    IAVMentionEditText iAVMentionEditText = (IAVMentionEditText) view2;
                    if (iAVMentionEditText != null) {
                        iAVMentionEditText.removeHashTag();
                    }
                }
                r.a("delete_label", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "video_publish_page").a("shoot_way", this.this$0.a().getMobParam().getShootWay()).a("creation_id", this.this$0.a().getMobParam().getCreationId()).a("business_type", this.$it.getBusinessType()).f66730a);
            }
            return z.f158842a;
        }
    }

    static final class d<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f131961a;

        static {
            Covode.recordClassIndex(86458);
        }

        d(x xVar) {
            this.f131961a = xVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            List<String> urlList;
            JSONObject jSONObject;
            List<String> urlList2;
            String language;
            String str;
            T t;
            List<T> list = (List) obj;
            x xVar = this.f131961a;
            if (list == null) {
                ck ckVar = xVar.f131948b;
                if (ckVar == null) {
                    l.a("delegate");
                }
                ckVar.a();
                return;
            }
            Fragment fragment = xVar.f131949c;
            if (fragment == null) {
                l.a("fragment");
            }
            View view = fragment.getView();
            View findViewById = view != null ? view.findViewById(R.id.atp) : null;
            Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.publish.IAVMentionEditText");
            IAVMentionEditText iAVMentionEditText = (IAVMentionEditText) findViewById;
            List<AnchorPublishStruct> f2 = AnchorListManager.f67941f.f();
            if (f2 != null) {
                Iterator<T> it = f2.iterator();
                loop0:
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    T t2 = t;
                    if (t2.type == ab.ANCHOR_SHOP_LINK.getTYPE() || t2.type == ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                        ck ckVar2 = xVar.f131948b;
                        if (ckVar2 == null) {
                            l.a("delegate");
                        }
                        if (ckVar2.getVisibility() == 0 && (!(list instanceof Collection) || !list.isEmpty())) {
                            for (T t3 : list) {
                                if (t3.getBusinessType() != ab.ANCHOR_SHOP_LINK.getTYPE()) {
                                    if (t3.getBusinessType() == ab.ANCHOR_SHOP_WINDOW.getTYPE()) {
                                        break loop0;
                                    }
                                } else {
                                    break loop0;
                                }
                            }
                            continue;
                        }
                    }
                }
                T t4 = t;
                if (t4 != null) {
                    Fragment fragment2 = xVar.f131949c;
                    if (fragment2 == null) {
                        l.a("fragment");
                    }
                    fragment2.getContext();
                    String str2 = t4.hashtag;
                    if (!(str2 == null || h.m.p.a((CharSequence) str2) || iAVMentionEditText == null)) {
                        iAVMentionEditText.addHashTag(str2);
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (T t5 : list) {
                arrayList.add(t5);
            }
            if (arrayList.size() > 1) {
                n.a((List) arrayList, (Comparator) new c());
            }
            xVar.a(f2, arrayList);
            ExtensionMisc extensionMisc = xVar.f131950d;
            if (extensionMisc == null) {
                l.a("extensionMisc");
            }
            ax.a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
            PublishExtensionModel fromString = PublishExtensionModel.fromString(publishExtensionDataContainer != null ? publishExtensionDataContainer.a() : null);
            ArrayList arrayList2 = new ArrayList();
            for (T t6 : arrayList) {
                String str3 = "";
                if (!t6.getCanDelete()) {
                    int businessType = t6.getBusinessType();
                    String title = t6.getTitle();
                    if (title == null) {
                        title = str3;
                    }
                    String url = t6.getUrl();
                    if (url == null) {
                        url = str3;
                    }
                    String language2 = t6.getLanguage();
                    if (language2 != null) {
                        str3 = language2;
                    }
                    String anchorContent = t6.getAnchorContent();
                    UrlModel anchorIcon = t6.getAnchorIcon();
                    arrayList2.add(new CreateAnchorInfo(businessType, title, url, str3, anchorContent, (anchorIcon == null || (urlList = anchorIcon.getUrlList()) == null) ? null : urlList.get(0), t6.getAddTime(), t6.getExtra(), null, null, t6.getSubtype(), Boolean.valueOf(t6.getCanDelete()), 768, null));
                } else if (t6.getBusinessType() == ab.WIKIPEDIA.getTYPE()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("add_from", xVar.f131947a);
                    String jSONObject3 = jSONObject2.toString();
                    l.b(jSONObject3, str3);
                    com.ss.android.ugc.aweme.commercialize.b.b.a aVar = (com.ss.android.ugc.aweme.commercialize.b.b.a) new com.google.gson.f().a(t6.getAnchorContent(), (Class) com.ss.android.ugc.aweme.commercialize.b.b.a.class);
                    if (aVar == null || (str = aVar.f73733b) == null || str.length() <= 0) {
                        language = t6.getLanguage();
                    } else if (aVar != null) {
                        language = aVar.f73733b;
                    } else {
                        language = null;
                    }
                    int businessType2 = t6.getBusinessType();
                    String title2 = t6.getTitle();
                    if (title2 == null) {
                        title2 = str3;
                    }
                    String url2 = t6.getUrl();
                    if (url2 == null) {
                        url2 = str3;
                    }
                    if (language != null) {
                        str3 = language;
                    }
                    arrayList2.add(new CreateAnchorInfo(businessType2, title2, url2, str3, jSONObject3, "https://p16.tiktokcdn.com/obj/tiktok-obj/wiki_anchor_new.png", t6.getAddTime(), null, null, null, t6.getSubtype(), Boolean.valueOf(t6.getCanDelete()), 896, null));
                } else {
                    if (t6.getAnchorContent().length() == 0) {
                        jSONObject = new JSONObject();
                        jSONObject.put("add_from", xVar.f131947a);
                    } else {
                        jSONObject = new JSONObject(t6.getAnchorContent());
                        if (!jSONObject.has("add_from")) {
                            jSONObject.put("add_from", xVar.f131947a);
                        }
                    }
                    String jSONObject4 = jSONObject.toString();
                    l.b(jSONObject4, str3);
                    t6.setAnchorContent(jSONObject4);
                    int businessType3 = t6.getBusinessType();
                    String title3 = t6.getTitle();
                    if (title3 == null) {
                        title3 = str3;
                    }
                    String url3 = t6.getUrl();
                    if (url3 == null) {
                        url3 = str3;
                    }
                    String language3 = t6.getLanguage();
                    if (language3 != null) {
                        str3 = language3;
                    }
                    String anchorContent2 = t6.getAnchorContent();
                    UrlModel anchorIcon2 = t6.getAnchorIcon();
                    arrayList2.add(new CreateAnchorInfo(businessType3, title3, url3, str3, anchorContent2, (anchorIcon2 == null || (urlList2 = anchorIcon2.getUrlList()) == null) ? null : urlList2.get(0), t6.getAddTime(), t6.getExtra(), null, null, t6.getSubtype(), Boolean.valueOf(t6.getCanDelete()), 768, null));
                }
            }
            fromString.createAnchorInfos = arrayList2;
            ExtensionMisc extensionMisc2 = xVar.f131950d;
            if (extensionMisc2 == null) {
                l.a("extensionMisc");
            }
            ax.a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
            if (publishExtensionDataContainer2 != null) {
                publishExtensionDataContainer2.a(PublishExtensionModel.toString(fromString));
            }
        }
    }

    public static final class c<T> implements Comparator {
        static {
            Covode.recordClassIndex(86457);
        }

        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return h.b.a.a(t.getAddTime(), t2.getAddTime());
        }
    }

    private static boolean a(com.ss.android.ugc.aweme.common.a aVar, List<com.ss.android.ugc.aweme.common.a> list) {
        for (T t : list) {
            if (t != null) {
                if (!dq.a() || in.e()) {
                    if (l.a((Object) aVar.getTitle(), (Object) t.getTitle()) && aVar.getBusinessType() == ab.PROP.getTYPE()) {
                    }
                } else if (!l.a((Object) aVar.getTitle(), (Object) t.getTitle())) {
                    continue;
                } else if ((p.a.a(aVar.getExtra()) == 3 || p.a.a(t.getExtra()) == 3) && !l.a((Object) aVar.getExtra(), (Object) t.getExtra())) {
                }
                return true;
            }
        }
        return false;
    }

    private final void a(String str, String str2) {
        Collection<AnchorPublishStruct> values;
        T t;
        ExtensionMisc extensionMisc = this.f131950d;
        if (extensionMisc == null) {
            l.a("extensionMisc");
        }
        String creationId = extensionMisc.getMobParam().getCreationId();
        Map<String, AnchorPublishStruct> c2 = AnchorListManager.c();
        String str3 = null;
        if (!(c2 == null || (values = c2.values()) == null)) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (t.type == ab.LIVE_EVENT.getTYPE()) {
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                str3 = t2.logExtra;
            }
        }
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        dVar.a("anchor_entry", str).a("enter_from", "video_post_page").a("shoot_way", "live_event").a("creation_id", creationId).a("live_event_id", str2).a("is_auto", 1);
        if (!(str3 == null || str3.length() == 0)) {
            JSONObject jSONObject = new JSONObject(str3);
            Iterator<String> keys = jSONObject.keys();
            l.b(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                dVar.a(next, jSONObject.get(next).toString());
            }
        }
        r.a("choose_anchor", dVar.f66730a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [com.ss.android.ugc.aweme.ck$d] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r0v54, types: [com.ss.android.ugc.aweme.ck$d] */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a8, code lost:
        if (r1 != null) goto L_0x00c8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0133 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x013a  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct> r17, java.util.List<com.ss.android.ugc.aweme.common.a> r18) {
        /*
        // Method dump skipped, instructions count: 978
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.ui.x.a(java.util.List, java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i2, int i3, Intent intent) {
        IAVPublishExtension.DefaultImpls.onActivityResult(this, i2, i3, intent);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.d(strArr, "");
        l.d(iArr, "");
        IAVPublishExtension.DefaultImpls.onRequestPermissionsResult(this, i2, strArr, iArr);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback) {
        String str;
        String str2;
        Map a2;
        String str3;
        String str4;
        String str5;
        boolean z;
        MethodCollector.i(4804);
        l.d(fragment, "");
        l.d(linearLayout, "");
        l.d(aVPublishContentType, "");
        l.d(publishOutput, "");
        l.d(extensionMisc, "");
        l.d(callback, "");
        this.f131949c = fragment;
        this.f131950d = extensionMisc;
        this.f131951e = aVPublishContentType;
        this.f131952f = publishOutput;
        extensionMisc.getExtensionDataRepo().getUpdateAnchors().observe(fragment, new d(this));
        Context context = linearLayout.getContext();
        l.b(context, "");
        ck ckVar = new ck(context);
        linearLayout.addView(ckVar, -1, -2);
        linearLayout.getMinimumHeight();
        com.bytedance.common.utility.n.b(linearLayout.getContext(), 52.0f);
        this.f131948b = ckVar;
        ckVar.setClickable(false);
        ck ckVar2 = this.f131948b;
        if (ckVar2 == null) {
            l.a("delegate");
        }
        ckVar2.setOnAddClickListener(new e(this));
        EventBus.a(EventBus.a(), this);
        Map<String, AnchorPublishStruct> c2 = AnchorListManager.c();
        if (c2 == null || c2.isEmpty()) {
            ck ckVar3 = this.f131948b;
            if (ckVar3 == null) {
                l.a("delegate");
            }
            LinearLayout linearLayout2 = ckVar3.f71095d;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(8);
            }
            LinearLayout linearLayout3 = ckVar3.f71097f;
            if (linearLayout3 != null) {
                linearLayout3.setVisibility(8);
            }
        }
        c();
        ArrayList arrayList = new ArrayList();
        List<com.ss.android.ugc.aweme.common.a> value = extensionMisc.getExtensionDataRepo().getUpdateAnchors().getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        }
        ax.a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        l.b(fromString, "");
        this.f131954h = fromString;
        if (fromString == null) {
            l.a("data");
        }
        List<CreateAnchorInfo> list = fromString.createAnchorInfos;
        if (list != null && !list.isEmpty()) {
            for (T t : list) {
                int type = t.getType();
                String content = t.getContent();
                if (content == null) {
                    content = "";
                }
                String keyword = t.getKeyword();
                if (keyword == null) {
                    keyword = "";
                }
                UrlModel urlModel = new UrlModel();
                urlModel.setUrlList(n.d(t.getIconUrl()));
                urlModel.setUri(Uri.decode(t.getIconUrl()));
                String url = t.getUrl();
                String language = t.getLanguage();
                Long addTime = t.getAddTime();
                String subtype = t.getSubtype();
                Boolean canDelete = t.getCanDelete();
                if (canDelete != null) {
                    z = canDelete.booleanValue();
                } else {
                    z = true;
                }
                arrayList.add(new com.ss.android.ugc.aweme.common.a(type, content, keyword, null, null, null, urlModel, z, url, language, addTime, null, subtype, 2104, null));
            }
        }
        PublishExtensionModel publishExtensionModel = this.f131954h;
        if (publishExtensionModel == null) {
            l.a("data");
        }
        if (publishExtensionModel.anchorBusinessType != ab.NO_TYPE.getTYPE()) {
            try {
                PublishExtensionModel publishExtensionModel2 = this.f131954h;
                if (publishExtensionModel2 == null) {
                    l.a("data");
                }
                String str6 = publishExtensionModel2.anchorContent;
                if (str6 == null) {
                    str6 = "";
                }
                str2 = new JSONObject(str6).optString("url");
                l.b(str2, "");
            } catch (Exception unused) {
                str2 = "";
            }
            PublishExtensionModel publishExtensionModel3 = this.f131954h;
            if (publishExtensionModel3 == null) {
                l.a("data");
            }
            if (publishExtensionModel3.anchorBusinessType == ab.WIKIPEDIA.getTYPE()) {
                com.google.gson.f a3 = dg.a();
                PublishExtensionModel publishExtensionModel4 = this.f131954h;
                if (publishExtensionModel4 == null) {
                    l.a("data");
                }
                com.ss.android.ugc.aweme.commercialize.b.b.a aVar = (com.ss.android.ugc.aweme.commercialize.b.b.a) a3.a(publishExtensionModel4.anchorContent, com.ss.android.ugc.aweme.commercialize.b.b.a.class);
                if (aVar == null || (str5 = aVar.f73733b) == null) {
                    str5 = "";
                }
                PublishExtensionModel publishExtensionModel5 = this.f131954h;
                if (publishExtensionModel5 == null) {
                    l.a("data");
                }
                int i2 = publishExtensionModel5.anchorBusinessType;
                PublishExtensionModel publishExtensionModel6 = this.f131954h;
                if (publishExtensionModel6 == null) {
                    l.a("data");
                }
                String str7 = publishExtensionModel6.anchorContent;
                if (str7 == null) {
                    str7 = "";
                }
                l.b(str7, "");
                PublishExtensionModel publishExtensionModel7 = this.f131954h;
                if (publishExtensionModel7 == null) {
                    l.a("data");
                }
                String str8 = publishExtensionModel7.anchorTitle;
                if (str8 == null) {
                    str8 = "";
                }
                PublishExtensionModel publishExtensionModel8 = this.f131954h;
                if (publishExtensionModel8 == null) {
                    l.a("data");
                }
                String str9 = publishExtensionModel8.anchorTag;
                if (str9 == null) {
                    str9 = "";
                }
                PublishExtensionModel publishExtensionModel9 = this.f131954h;
                if (publishExtensionModel9 == null) {
                    l.a("data");
                }
                Integer valueOf = Integer.valueOf(publishExtensionModel9.source);
                PublishExtensionModel publishExtensionModel10 = this.f131954h;
                if (publishExtensionModel10 == null) {
                    l.a("data");
                }
                String str10 = publishExtensionModel10.anchorId;
                if (str10 == null) {
                    str10 = "";
                }
                PublishExtensionModel publishExtensionModel11 = this.f131954h;
                if (publishExtensionModel11 == null) {
                    l.a("data");
                }
                UrlModel urlModel2 = publishExtensionModel11.anchorIcon;
                Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime());
                PublishExtensionModel publishExtensionModel12 = this.f131954h;
                if (publishExtensionModel12 == null) {
                    l.a("data");
                }
                arrayList.add(new com.ss.android.ugc.aweme.common.a(i2, str7, str8, str9, valueOf, str10, urlModel2, true, null, str5, valueOf2, null, publishExtensionModel12.anchorSubtype, 2304, null));
                PublishExtensionModel publishExtensionModel13 = this.f131954h;
                if (publishExtensionModel13 == null) {
                    l.a("data");
                }
                publishExtensionModel13.anchorBusinessType = ab.NO_TYPE.getTYPE();
                ax.a publishExtensionDataContainer2 = extensionMisc.getPublishExtensionDataContainer();
                if (publishExtensionDataContainer2 != null) {
                    PublishExtensionModel publishExtensionModel14 = this.f131954h;
                    if (publishExtensionModel14 == null) {
                        l.a("data");
                    }
                    publishExtensionDataContainer2.a(PublishExtensionModel.toString(publishExtensionModel14));
                }
            } else {
                PublishExtensionModel publishExtensionModel15 = this.f131954h;
                if (publishExtensionModel15 == null) {
                    l.a("data");
                }
                if (publishExtensionModel15.anchorBusinessType == ab.LIVE_EVENT.getTYPE()) {
                    PublishExtensionModel publishExtensionModel16 = this.f131954h;
                    if (publishExtensionModel16 == null) {
                        l.a("data");
                    }
                    if (hk.a(publishExtensionModel16.anchorContent)) {
                        PublishExtensionModel publishExtensionModel17 = this.f131954h;
                        if (publishExtensionModel17 == null) {
                            l.a("data");
                        }
                        try {
                            str3 = aa.a.d(Long.parseLong(((CreateAnchorInfo) dg.a(publishExtensionModel17.anchorContent, CreateAnchorInfo.class)).getTime()));
                        } catch (Exception unused2) {
                            str3 = "";
                        }
                        try {
                            PublishExtensionModel publishExtensionModel18 = this.f131954h;
                            if (publishExtensionModel18 == null) {
                                l.a("data");
                            }
                            str4 = new JSONObject(publishExtensionModel18.anchorContent).getString("third_id");
                        } catch (Exception unused3) {
                            str4 = "";
                        }
                        String string = fragment.getResources().getString(R.string.bpl);
                        if (string == null) {
                            string = "LIVE Events";
                        }
                        l.b(string, "");
                        PublishExtensionModel publishExtensionModel19 = this.f131954h;
                        if (publishExtensionModel19 == null) {
                            l.a("data");
                        }
                        int i3 = publishExtensionModel19.anchorBusinessType;
                        PublishExtensionModel publishExtensionModel20 = this.f131954h;
                        if (publishExtensionModel20 == null) {
                            l.a("data");
                        }
                        String str11 = publishExtensionModel20.anchorContent;
                        if (str11 == null) {
                            str11 = "";
                        }
                        l.b(str11, "");
                        PublishExtensionModel publishExtensionModel21 = this.f131954h;
                        if (publishExtensionModel21 == null) {
                            l.a("data");
                        }
                        String str12 = publishExtensionModel21.anchorTitle;
                        if (str12 == null) {
                            str12 = string + ": " + str3;
                        }
                        PublishExtensionModel publishExtensionModel22 = this.f131954h;
                        if (publishExtensionModel22 == null) {
                            l.a("data");
                        }
                        String str13 = publishExtensionModel22.anchorTag;
                        if (str13 == null) {
                            str13 = "";
                        }
                        PublishExtensionModel publishExtensionModel23 = this.f131954h;
                        if (publishExtensionModel23 == null) {
                            l.a("data");
                        }
                        Integer valueOf3 = Integer.valueOf(publishExtensionModel23.source);
                        PublishExtensionModel publishExtensionModel24 = this.f131954h;
                        if (publishExtensionModel24 == null) {
                            l.a("data");
                        }
                        String str14 = publishExtensionModel24.anchorId;
                        if (str14 == null) {
                            str14 = "";
                        }
                        PublishExtensionModel publishExtensionModel25 = this.f131954h;
                        if (publishExtensionModel25 == null) {
                            l.a("data");
                        }
                        UrlModel urlModel3 = publishExtensionModel25.anchorIcon;
                        PublishExtensionModel publishExtensionModel26 = this.f131954h;
                        if (publishExtensionModel26 == null) {
                            l.a("data");
                        }
                        arrayList.add(new com.ss.android.ugc.aweme.common.a(i3, str11, str12, str13, valueOf3, str14, urlModel3, false, null, null, null, null, publishExtensionModel26.anchorSubtype, 3968, null));
                        l.b(str4, "");
                        a(string, str4);
                        PublishExtensionModel publishExtensionModel27 = this.f131954h;
                        if (publishExtensionModel27 == null) {
                            l.a("data");
                        }
                        publishExtensionModel27.anchorBusinessType = ab.NO_TYPE.getTYPE();
                        ax.a publishExtensionDataContainer3 = extensionMisc.getPublishExtensionDataContainer();
                        if (publishExtensionDataContainer3 != null) {
                            PublishExtensionModel publishExtensionModel28 = this.f131954h;
                            if (publishExtensionModel28 == null) {
                                l.a("data");
                            }
                            publishExtensionDataContainer3.a(PublishExtensionModel.toString(publishExtensionModel28));
                        }
                    }
                }
                PublishExtensionModel publishExtensionModel29 = this.f131954h;
                if (publishExtensionModel29 == null) {
                    l.a("data");
                }
                String str15 = publishExtensionModel29.anchorContent;
                if (str15 == null || (a2 = (HashMap) dg.a().a(str15, (Class) new HashMap().getClass())) == null) {
                    a2 = ag.a();
                }
                if (!l.a(a2.get("common_type"), (Object) true)) {
                    PublishExtensionModel publishExtensionModel30 = this.f131954h;
                    if (publishExtensionModel30 == null) {
                        l.a("data");
                    }
                    int i4 = publishExtensionModel30.anchorBusinessType;
                    PublishExtensionModel publishExtensionModel31 = this.f131954h;
                    if (publishExtensionModel31 == null) {
                        l.a("data");
                    }
                    String str16 = publishExtensionModel31.anchorContent;
                    if (str16 == null) {
                        str16 = "";
                    }
                    l.b(str16, "");
                    PublishExtensionModel publishExtensionModel32 = this.f131954h;
                    if (publishExtensionModel32 == null) {
                        l.a("data");
                    }
                    String str17 = publishExtensionModel32.anchorTitle;
                    if (str17 == null) {
                        str17 = "";
                    }
                    PublishExtensionModel publishExtensionModel33 = this.f131954h;
                    if (publishExtensionModel33 == null) {
                        l.a("data");
                    }
                    String str18 = publishExtensionModel33.anchorTag;
                    if (str18 == null) {
                        str18 = "";
                    }
                    PublishExtensionModel publishExtensionModel34 = this.f131954h;
                    if (publishExtensionModel34 == null) {
                        l.a("data");
                    }
                    Integer valueOf4 = Integer.valueOf(publishExtensionModel34.source);
                    PublishExtensionModel publishExtensionModel35 = this.f131954h;
                    if (publishExtensionModel35 == null) {
                        l.a("data");
                    }
                    String str19 = publishExtensionModel35.anchorId;
                    if (str19 == null) {
                        str19 = "";
                    }
                    PublishExtensionModel publishExtensionModel36 = this.f131954h;
                    if (publishExtensionModel36 == null) {
                        l.a("data");
                    }
                    UrlModel urlModel4 = publishExtensionModel36.anchorIcon;
                    Long valueOf5 = Long.valueOf(SystemClock.elapsedRealtime());
                    PublishExtensionModel publishExtensionModel37 = this.f131954h;
                    if (publishExtensionModel37 == null) {
                        l.a("data");
                    }
                    arrayList.add(new com.ss.android.ugc.aweme.common.a(i4, str16, str17, str18, valueOf4, str19, urlModel4, true, str2, null, valueOf5, null, publishExtensionModel37.anchorSubtype, 2560, null));
                    PublishExtensionModel publishExtensionModel38 = this.f131954h;
                    if (publishExtensionModel38 == null) {
                        l.a("data");
                    }
                    publishExtensionModel38.anchorBusinessType = ab.NO_TYPE.getTYPE();
                    ax.a publishExtensionDataContainer4 = extensionMisc.getPublishExtensionDataContainer();
                    if (publishExtensionDataContainer4 != null) {
                        PublishExtensionModel publishExtensionModel39 = this.f131954h;
                        if (publishExtensionModel39 == null) {
                            l.a("data");
                        }
                        publishExtensionDataContainer4.a(PublishExtensionModel.toString(publishExtensionModel39));
                    }
                }
            }
        }
        androidx.fragment.app.e activity = fragment.getActivity();
        if (activity != null) {
            activity.runOnUiThread(new f(this, extensionMisc, arrayList));
        }
        if (com.ss.android.ugc.aweme.an.b.a()) {
            setLeftIcon(2131232676);
            setRightIcon(com.bytedance.tux.c.c.a(new g(fragment)));
            ViewGroup anchorListContent = getAnchorListContent();
            if (anchorListContent != null) {
                ViewGroup.LayoutParams layoutParams = anchorListContent.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    layoutParams2.setMarginStart(h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
                    anchorListContent.setLayoutParams(layoutParams2);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                    MethodCollector.o(4804);
                    throw nullPointerException;
                }
            }
        }
        MethodCollector.o(4804);
    }
}
