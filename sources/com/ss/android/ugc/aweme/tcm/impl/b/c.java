package com.ss.android.ugc.aweme.tcm.impl.b;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.ss.android.ugc.aweme.services.publish.IAVMentionEditText;
import com.ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.ss.android.ugc.aweme.services.publish.PublishOutput;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tcm.impl.d.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;
import org.json.JSONObject;

public final class c implements IAVPublishExtension<StarAtlasPublishModel> {

    /* renamed from: g  reason: collision with root package name */
    public static final a f138571g = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public e f138572a;

    /* renamed from: b  reason: collision with root package name */
    public IAVMentionEditText f138573b;

    /* renamed from: c  reason: collision with root package name */
    public Context f138574c;

    /* renamed from: d  reason: collision with root package name */
    public ExtensionMisc f138575d;

    /* renamed from: e  reason: collision with root package name */
    public float f138576e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public final float f138577f = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    private Fragment f138578h;

    static {
        Covode.recordClassIndex(90663);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final ViewGroup getAnchorListContent() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getName() {
        return "StarAtlasPublishExtension";
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onActivityResult(int i2, int i3, Intent intent) {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onDestroy() {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onPublish(PublishOutput publishOutput) {
        l.d(publishOutput, "");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveInstanceState(Bundle bundle) {
        l.d(bundle, "");
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setLeftIcon(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void setRightIcon(com.bytedance.tux.c.a aVar) {
        l.d(aVar, "");
    }

    public static final class a {
        static {
            Covode.recordClassIndex(90664);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreateFinish() {
        IAVPublishExtension.DefaultImpls.onCreateFinish(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onResume() {
        IAVPublishExtension.DefaultImpls.onResume(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final UrlModel getAnchorIconUrl() {
        return IAVPublishExtension.DefaultImpls.getAnchorIconUrl(this);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final String getAnchorText() {
        return IAVPublishExtension.DefaultImpls.getAnchorText(this);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final /* synthetic */ StarAtlasPublishModel provideExtensionData() {
        return new StarAtlasPublishModel();
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onEnterChildrenMode() {
        e eVar = this.f138572a;
        if (eVar == null) {
            l.a("delegate");
        }
        eVar.setVisibility(8);
    }

    /* renamed from: com.ss.android.ugc.aweme.tcm.impl.b.c$c  reason: collision with other inner class name */
    static final class C3655c extends m implements h.f.a.a<z> {
        final /* synthetic */ ExtensionMisc $extensionMisc;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(90666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3655c(c cVar, ExtensionMisc extensionMisc) {
            super(0);
            this.this$0 = cVar;
            this.$extensionMisc = extensionMisc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            IAVMentionEditText iAVMentionEditText;
            com.ss.android.ugc.aweme.common.a value = this.$extensionMisc.getExtensionDataRepo().getUpdateAnchor().getValue();
            if ((value == null || value.getBusinessType() != 6) && (iAVMentionEditText = this.this$0.f138573b) != null) {
                iAVMentionEditText.removeStarAtlas();
            }
            return z.f158842a;
        }
    }

    static final class b extends m implements h.f.a.a<z> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(90665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
            if (r4 != null) goto L_0x003f;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke() {
            /*
                r10 = this;
                com.ss.android.ugc.aweme.tcm.impl.b.c r0 = r10.this$0
                android.content.Context r2 = r0.f138574c
                com.ss.android.ugc.aweme.tcm.impl.b.c r0 = r10.this$0
                com.ss.android.ugc.aweme.services.publish.IAVMentionEditText r4 = r0.f138573b
                com.ss.android.ugc.aweme.profile.model.TcmConfig r0 = com.ss.android.ugc.aweme.tcm.impl.d.e.a()
                r1 = 0
                if (r0 == 0) goto L_0x005c
                com.ss.android.ugc.aweme.profile.model.BCHashtag r0 = r0.getBcHashtag()
                if (r0 == 0) goto L_0x005c
                java.lang.String r3 = r0.getAd()
            L_0x0019:
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x0056
                if (r4 == 0) goto L_0x0025
                java.util.List r1 = r4.getStarAtlasExtraList()
            L_0x0025:
                boolean r0 = com.bytedance.common.utility.collection.b.a(r1)
                if (r0 == 0) goto L_0x0056
                if (r2 == 0) goto L_0x0059
                android.content.res.Resources r1 = r2.getResources()
                if (r1 == 0) goto L_0x0059
                r0 = 2131099676(0x7f06001c, float:1.7811712E38)
                int r0 = r1.getColor(r0)
                if (r4 == 0) goto L_0x0056
                r4.setStarAtlasMentionTextColor(r0)
            L_0x003f:
                r5 = 1
                if (r3 != 0) goto L_0x0045
                h.f.b.l.b()
            L_0x0045:
                r2 = 0
                java.lang.String r1 = "#"
                java.lang.String r0 = ""
                java.lang.String r6 = h.m.p.a(r3, r1, r0, r2)
                r9 = 1
                java.lang.String r7 = ""
                java.lang.String r8 = ""
                r4.addMentionText(r5, r6, r7, r8, r9)
            L_0x0056:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0059:
                if (r4 == 0) goto L_0x0056
                goto L_0x003f
            L_0x005c:
                r3 = r1
                goto L_0x0019
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tcm.impl.b.c.b.invoke():java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void callbackAnchors(List<CreateAnchorInfo> list) {
        l.d(list, "");
        IAVPublishExtension.DefaultImpls.callbackAnchors(this, list);
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f138579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PublishOutput f138580b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AVPublishContentType f138581c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Fragment f138582d;

        static {
            Covode.recordClassIndex(90667);
        }

        d(c cVar, PublishOutput publishOutput, AVPublishContentType aVPublishContentType, Fragment fragment) {
            this.f138579a = cVar;
            this.f138580b = publishOutput;
            this.f138581c = aVPublishContentType;
            this.f138582d = fragment;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            String str = null;
            if (d.a() || !c.a(this.f138580b, this.f138581c)) {
                b.a(this.f138582d.getActivity(), c.a(this.f138580b, this.f138581c), null);
                return;
            }
            com.bytedance.tux.g.b bVar = new com.bytedance.tux.g.b(this.f138582d);
            Context context = this.f138582d.getContext();
            if (context != null) {
                str = context.getString(R.string.g5d);
            }
            bVar.a(str).b();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onBackPressed(PublishOutput publishOutput) {
        String str;
        l.d(publishOutput, "");
        ExtensionMisc extensionMisc = this.f138575d;
        if (extensionMisc == null) {
            l.a("extensionMisc");
        }
        ax.a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        l.b(fromString, "");
        fromString.isStarAtlas = false;
        fromString.starAtlasContent = "";
        fromString.brandedContentType = "0";
        ExtensionMisc extensionMisc2 = this.f138575d;
        if (extensionMisc2 == null) {
            l.a("extensionMisc");
        }
        ax.a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.a(new f().b(fromString));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onSaveDraft(PublishOutput publishOutput) {
        String str;
        l.d(publishOutput, "");
        ExtensionMisc extensionMisc = this.f138575d;
        if (extensionMisc == null) {
            l.a("extensionMisc");
        }
        ax.a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        fromString.outerStarAtlas = "";
        l.b(fromString, "");
        fromString.isStarAtlas = false;
        fromString.starAtlasContent = "";
        fromString.brandedContentType = "0";
        ExtensionMisc extensionMisc2 = this.f138575d;
        if (extensionMisc2 == null) {
            l.a("extensionMisc");
        }
        ax.a publishExtensionDataContainer2 = extensionMisc2.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer2 != null) {
            publishExtensionDataContainer2.a(new f().b(fromString));
        }
    }

    public static boolean a(PublishOutput publishOutput, AVPublishContentType aVPublishContentType) {
        String musicId = publishOutput.getMusicId();
        if (musicId == null || musicId.length() == 0 || aVPublishContentType != AVPublishContentType.Video || publishOutput.isCommercialMusic() || publishOutput.isOriginalSound()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.d(strArr, "");
        l.d(iArr, "");
        IAVPublishExtension.DefaultImpls.onRequestPermissionsResult(this, i2, strArr, iArr);
    }

    @Override // com.ss.android.ugc.aweme.services.publish.IAVPublishExtension
    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, IAVPublishExtension.Callback callback) {
        View findViewById;
        String str;
        String optString;
        MethodCollector.i(8864);
        l.d(fragment, "");
        l.d(linearLayout, "");
        l.d(aVPublishContentType, "");
        l.d(publishOutput, "");
        l.d(extensionMisc, "");
        l.d(callback, "");
        this.f138575d = extensionMisc;
        this.f138574c = fragment.getContext();
        this.f138578h = fragment;
        View view = fragment.getView();
        if (view == null || (findViewById = view.findViewById(R.id.atp)) == null) {
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.services.publish.IAVMentionEditText");
            MethodCollector.o(8864);
            throw nullPointerException;
        }
        this.f138573b = (IAVMentionEditText) findViewById;
        e eVar = new e(linearLayout.getContext());
        linearLayout.addView(eVar, new LinearLayout.LayoutParams(-1, (int) n.b(linearLayout.getContext(), 52.0f)));
        eVar.setGravity(16);
        eVar.setOrientation(0);
        eVar.setVisibility(8);
        this.f138572a = eVar;
        extensionMisc.getExtensionDataRepo().setAddStarAtlasTag(new b(this));
        extensionMisc.getExtensionDataRepo().setRemoveStarAtlasTag(new C3655c(this, extensionMisc));
        e eVar2 = this.f138572a;
        if (eVar2 == null) {
            l.a("delegate");
        }
        eVar2.setExtensionDataRepo(extensionMisc.getExtensionDataRepo());
        e eVar3 = this.f138572a;
        if (eVar3 == null) {
            l.a("delegate");
        }
        eVar3.setPublishExtensionDataContainer(extensionMisc.getPublishExtensionDataContainer());
        e eVar4 = this.f138572a;
        if (eVar4 == null) {
            l.a("delegate");
        }
        eVar4.setTitle(R.string.g3e);
        e eVar5 = this.f138572a;
        if (eVar5 == null) {
            l.a("delegate");
        }
        eVar5.setSubtitle("");
        e eVar6 = this.f138572a;
        if (eVar6 == null) {
            l.a("delegate");
        }
        eVar6.setOnClickListener(new d(this, publishOutput, aVPublishContentType, fragment));
        ax.a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.a();
        } else {
            str = null;
        }
        PublishExtensionModel fromString = PublishExtensionModel.fromString(str);
        String str2 = fromString.outerStarAtlas;
        if (!(str2 == null || str2.length() == 0)) {
            a.a(true);
        }
        TcmConfig a2 = e.a();
        if (a2 == null || !a2.isTcmCreator()) {
            MethodCollector.o(8864);
            return;
        }
        if (!d.a()) {
            if (a(publishOutput, aVPublishContentType)) {
                e eVar7 = this.f138572a;
                if (eVar7 == null) {
                    l.a("delegate");
                }
                eVar7.setAlpha(this.f138577f);
            } else {
                e eVar8 = this.f138572a;
                if (eVar8 == null) {
                    l.a("delegate");
                }
                eVar8.setAlpha(this.f138576e);
            }
        }
        e eVar9 = this.f138572a;
        if (eVar9 == null) {
            l.a("delegate");
        }
        eVar9.setVisibility(0);
        if (this.f138572a == null) {
            l.a("delegate");
        }
        com.ss.android.ugc.aweme.tcm.api.b.c.b("0");
        com.ss.android.ugc.aweme.tcm.api.b.c.a(null);
        String str3 = fromString.outerStarAtlas;
        if (!(str3 == null || str3.length() == 0)) {
            JSONObject jSONObject = new JSONObject(fromString.outerStarAtlas);
            if (l.a((Object) jSONObject.optString("recordParam"), (Object) "tcm") && (optString = jSONObject.optString("campaignInfo")) != null) {
                e eVar10 = this.f138572a;
                if (eVar10 == null) {
                    l.a("delegate");
                }
                eVar10.setStarAtlasContent(optString);
                e eVar11 = this.f138572a;
                if (eVar11 == null) {
                    l.a("delegate");
                }
                eVar11.setBrandedContentType("1");
                MethodCollector.o(8864);
                return;
            }
        }
        MethodCollector.o(8864);
    }
}
