package com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.airbnb.epoxy.s;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.im.core.a.e;
import com.bytedance.im.core.proto.AckConversationApplyRequestBody;
import com.bytedance.im.core.proto.ApplyStatusCode;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.UpdateConversationAuditSwitchRequestBody;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.a.b;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.t;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.v;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel;
import com.ss.android.ugc.aweme.im.sdk.group.a.e;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.z;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class GroupChatController extends Typed2EpoxyController<com.bytedance.ies.im.core.api.b.b, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b> {
    public static final a Companion = new a((byte) 0);
    public t addMemberModel;
    public v approveModel;
    public final Context context;
    public t dividerOne;
    public t dividerThree;
    public t dividerTwo;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r endGroupModel;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i groupMemberHeader;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p groupMemberSeeMore;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.g groupTitleModel;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k inviteModel;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r leaveGroupModel;
    public v muteModel;
    public v pinModel;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k reportModel;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r reportSensitiveModel;
    public com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p requestSeeMore;
    public final GroupChatDetailViewModel viewModel;

    static {
        Covode.recordClassIndex(65061);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65062);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final t getAddMemberModel() {
        t tVar = this.addMemberModel;
        if (tVar == null) {
            h.f.b.l.a("addMemberModel");
        }
        return tVar;
    }

    public final v getApproveModel() {
        v vVar = this.approveModel;
        if (vVar == null) {
            h.f.b.l.a("approveModel");
        }
        return vVar;
    }

    public final t getDividerOne() {
        t tVar = this.dividerOne;
        if (tVar == null) {
            h.f.b.l.a("dividerOne");
        }
        return tVar;
    }

    public final t getDividerThree() {
        t tVar = this.dividerThree;
        if (tVar == null) {
            h.f.b.l.a("dividerThree");
        }
        return tVar;
    }

    public final t getDividerTwo() {
        t tVar = this.dividerTwo;
        if (tVar == null) {
            h.f.b.l.a("dividerTwo");
        }
        return tVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r getEndGroupModel() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar = this.endGroupModel;
        if (rVar == null) {
            h.f.b.l.a("endGroupModel");
        }
        return rVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i getGroupMemberHeader() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i iVar = this.groupMemberHeader;
        if (iVar == null) {
            h.f.b.l.a("groupMemberHeader");
        }
        return iVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p getGroupMemberSeeMore() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p pVar = this.groupMemberSeeMore;
        if (pVar == null) {
            h.f.b.l.a("groupMemberSeeMore");
        }
        return pVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.g getGroupTitleModel() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.g gVar = this.groupTitleModel;
        if (gVar == null) {
            h.f.b.l.a("groupTitleModel");
        }
        return gVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k getInviteModel() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k kVar = this.inviteModel;
        if (kVar == null) {
            h.f.b.l.a("inviteModel");
        }
        return kVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r getLeaveGroupModel() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar = this.leaveGroupModel;
        if (rVar == null) {
            h.f.b.l.a("leaveGroupModel");
        }
        return rVar;
    }

    public final v getMuteModel() {
        v vVar = this.muteModel;
        if (vVar == null) {
            h.f.b.l.a("muteModel");
        }
        return vVar;
    }

    public final v getPinModel() {
        v vVar = this.pinModel;
        if (vVar == null) {
            h.f.b.l.a("pinModel");
        }
        return vVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k getReportModel() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k kVar = this.reportModel;
        if (kVar == null) {
            h.f.b.l.a("reportModel");
        }
        return kVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r getReportSensitiveModel() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar = this.reportSensitiveModel;
        if (rVar == null) {
            h.f.b.l.a("reportSensitiveModel");
        }
        return rVar;
    }

    public final com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p getRequestSeeMore() {
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p pVar = this.requestSeeMore;
        if (pVar == null) {
            h.f.b.l.a("requestSeeMore");
        }
        return pVar;
    }

    /* access modifiers changed from: package-private */
    public static final class b extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b $chatDetail$inlined;
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a $it;
        final /* synthetic */ GroupChatController this$0;

        static {
            Covode.recordClassIndex(65063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar, GroupChatController groupChatController, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            super(0);
            this.$it = aVar;
            this.this$0 = groupChatController;
            this.$chatDetail$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            GroupChatDetailViewModel groupChatDetailViewModel = this.this$0.viewModel;
            com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a aVar = this.$it;
            h.f.b.l.d(aVar, "");
            groupChatDetailViewModel.b(new GroupChatDetailViewModel.af(aVar));
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_member_setting", new h.p[0]);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a $applyInfo;
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b $chatDetail$inlined;
        final /* synthetic */ GroupChatController this$0;

        static {
            Covode.recordClassIndex(65065);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar, GroupChatController groupChatController, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            super(0);
            this.$applyInfo = aVar;
            this.this$0 = groupChatController;
            this.$chatDetail$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            GroupChatDetailViewModel groupChatDetailViewModel = this.this$0.viewModel;
            Long.valueOf(this.$applyInfo.f101517e);
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", groupChatDetailViewModel.f101798d);
            com.ss.android.ugc.aweme.common.r.a("show_group_request", hashMap);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class r extends h.f.b.m implements h.f.a.a<z> {
        final /* synthetic */ GroupChatController this$0;

        static {
            Covode.recordClassIndex(65079);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(GroupChatController groupChatController) {
            super(0);
            this.this$0 = groupChatController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            GroupChatDetailViewModel groupChatDetailViewModel = this.this$0.viewModel;
            String str = groupChatDetailViewModel.f101798d;
            h.f.b.l.d(str, "");
            com.bytedance.im.core.d.h c2 = b.a.a(str).c();
            if (c2 != null && c2.getMemberCount() >= com.ss.android.ugc.aweme.im.sdk.common.controller.e.c.d(c2)) {
                groupChatDetailViewModel.b(new GroupChatDetailViewModel.d(groupChatDetailViewModel));
            } else {
                groupChatDetailViewModel.b(GroupChatDetailViewModel.e.f101818a);
            }
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("click_add_member", new h.p[0]);
            return z.f158842a;
        }
    }

    public final void setAddMemberModel(t tVar) {
        h.f.b.l.d(tVar, "");
        this.addMemberModel = tVar;
    }

    public final void setApproveModel(v vVar) {
        h.f.b.l.d(vVar, "");
        this.approveModel = vVar;
    }

    public final void setDividerOne(t tVar) {
        h.f.b.l.d(tVar, "");
        this.dividerOne = tVar;
    }

    public final void setDividerThree(t tVar) {
        h.f.b.l.d(tVar, "");
        this.dividerThree = tVar;
    }

    public final void setDividerTwo(t tVar) {
        h.f.b.l.d(tVar, "");
        this.dividerTwo = tVar;
    }

    public final void setEndGroupModel(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar) {
        h.f.b.l.d(rVar, "");
        this.endGroupModel = rVar;
    }

    public final void setGroupMemberHeader(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i iVar) {
        h.f.b.l.d(iVar, "");
        this.groupMemberHeader = iVar;
    }

    public final void setGroupMemberSeeMore(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p pVar) {
        h.f.b.l.d(pVar, "");
        this.groupMemberSeeMore = pVar;
    }

    public final void setGroupTitleModel(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.g gVar) {
        h.f.b.l.d(gVar, "");
        this.groupTitleModel = gVar;
    }

    public final void setInviteModel(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k kVar) {
        h.f.b.l.d(kVar, "");
        this.inviteModel = kVar;
    }

    public final void setLeaveGroupModel(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar) {
        h.f.b.l.d(rVar, "");
        this.leaveGroupModel = rVar;
    }

    public final void setMuteModel(v vVar) {
        h.f.b.l.d(vVar, "");
        this.muteModel = vVar;
    }

    public final void setPinModel(v vVar) {
        h.f.b.l.d(vVar, "");
        this.pinModel = vVar;
    }

    public final void setReportModel(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k kVar) {
        h.f.b.l.d(kVar, "");
        this.reportModel = kVar;
    }

    public final void setReportSensitiveModel(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar) {
        h.f.b.l.d(rVar, "");
        this.reportSensitiveModel = rVar;
    }

    public final void setRequestSeeMore(com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p pVar) {
        h.f.b.l.d(pVar, "");
        this.requestSeeMore = pVar;
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101783a;

        static {
            Covode.recordClassIndex(65068);
        }

        g(GroupChatController groupChatController) {
            this.f101783a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101783a.viewModel.a(GroupChatDetailViewModel.aa.f101803a);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class i implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101785a;

        static {
            Covode.recordClassIndex(65070);
        }

        i(GroupChatController groupChatController) {
            this.f101785a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101785a.viewModel.f();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class j implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101786a;

        static {
            Covode.recordClassIndex(65071);
        }

        j(GroupChatController groupChatController) {
            this.f101786a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101786a.viewModel.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class n implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101790a;

        static {
            Covode.recordClassIndex(65075);
        }

        n(GroupChatController groupChatController) {
            this.f101790a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101790a.viewModel.f();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class o implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101791a;

        static {
            Covode.recordClassIndex(65076);
        }

        o(GroupChatController groupChatController) {
            this.f101791a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101791a.viewModel.e();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101782a;

        static {
            Covode.recordClassIndex(65067);
        }

        f(GroupChatController groupChatController) {
            this.f101782a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            b.a.a(this.f101782a.viewModel.f101798d, null);
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.b("group_setting");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class h implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101784a;

        static {
            Covode.recordClassIndex(65069);
        }

        h(GroupChatController groupChatController) {
            this.f101784a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(this.f101784a.context);
            if (a2 != null) {
                this.f101784a.viewModel.a(a2);
                com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("group_chat_setting", "", "im");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class m implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101789a;

        static {
            Covode.recordClassIndex(65074);
        }

        m(GroupChatController groupChatController) {
            this.f101789a = groupChatController;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Activity a2 = com.ss.android.ugc.aweme.share.improve.c.b.a(this.f101789a.context);
            if (a2 != null) {
                this.f101789a.viewModel.a(a2);
                com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("group_chat_setting", "", "im");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class q extends h.f.b.m implements h.f.a.b<IMUser, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final q f101793a = new q();

        static {
            Covode.recordClassIndex(65078);
        }

        q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(IMUser iMUser) {
            IMUser iMUser2 = iMUser;
            if (iMUser2 != null) {
                com.ss.android.ugc.aweme.im.sdk.chatlist.controller.helper.c.a(iMUser2.getUid(), "chat_request");
                com.ss.android.ugc.aweme.im.sdk.chat.a.d.a(iMUser2.getUid(), "chat_request", null);
            }
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101780a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b f101781b;

        static {
            Covode.recordClassIndex(65066);
        }

        e(GroupChatController groupChatController, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            this.f101780a = groupChatController;
            this.f101781b = bVar;
        }

        public final void onClick(View view) {
            int i2;
            List<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a> list;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101780a.viewModel;
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar = this.f101781b.f101533g;
            if (eVar == null || (list = eVar.f101551a) == null) {
                i2 = 0;
            } else {
                i2 = list.size();
            }
            if (i2 < groupChatDetailViewModel.f101795a.f101551a.size()) {
                groupChatDetailViewModel.a(new GroupChatDetailViewModel.ab(groupChatDetailViewModel));
                return;
            }
            com.bytedance.im.a.a.a a2 = com.bytedance.im.a.a.a.a();
            long a3 = groupChatDetailViewModel.a();
            GroupChatDetailViewModel.ac acVar = new GroupChatDetailViewModel.ac(groupChatDetailViewModel);
            boolean z = com.bytedance.im.core.a.d.a().b().aQ;
            com.bytedance.im.core.c.f.a("imsdk", "loadMoreAuditList", (Throwable) null);
            new com.bytedance.im.a.a.a.d(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0055: INVOKE  
                  (wrap: com.bytedance.im.a.a.a.d : 0x0050: CONSTRUCTOR  (r4v1 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$2 : 0x004d: CONSTRUCTOR  (r0v9 com.bytedance.im.a.a.a$2) = 
                  (r3v0 'a2' com.bytedance.im.a.a.a)
                  (r2v0 'acVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac)
                 call: com.bytedance.im.a.a.a.2.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                  (wrap: long : 0x0053: IGET  (r5v1 long) = (r3v0 'a2' com.bytedance.im.a.a.a) com.bytedance.im.a.a.a.c long)
                  (r7v0 'a3' long)
                  (r9v0 'z' boolean)
                 type: VIRTUAL call: com.bytedance.im.a.a.a.d.a(long, long, boolean):void in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController.e.onClick(android.view.View):void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
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
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0050: CONSTRUCTOR  (r4v1 com.bytedance.im.a.a.a.d) = 
                  (wrap: com.bytedance.im.a.a.a$2 : 0x004d: CONSTRUCTOR  (r0v9 com.bytedance.im.a.a.a$2) = 
                  (r3v0 'a2' com.bytedance.im.a.a.a)
                  (r2v0 'acVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac)
                 call: com.bytedance.im.a.a.a.2.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR)
                 call: com.bytedance.im.a.a.a.d.<init>(com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController.e.onClick(android.view.View):void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:87)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:715)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                	... 18 more
                Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: CONSTRUCTOR  (r0v9 com.bytedance.im.a.a.a$2) = 
                  (r3v0 'a2' com.bytedance.im.a.a.a)
                  (r2v0 'acVar' com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac)
                 call: com.bytedance.im.a.a.a.2.<init>(com.bytedance.im.a.a.a, com.bytedance.im.core.a.a.b):void type: CONSTRUCTOR in method: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController.e.onClick(android.view.View):void, file: classes5.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:663)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 24 more
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.im.a.a.a, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                	... 30 more
                */
            /*
                this = this;
                com.bytedance.apm.agent.v2.instrumentation.ClickAgent.onClick(r11)
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController r0 = r10.f101780a
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel r5 = r0.viewModel
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b r0 = r10.f101781b
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e r0 = r0.f101533g
                r4 = 0
                if (r0 == 0) goto L_0x0029
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a> r0 = r0.f101551a
                if (r0 == 0) goto L_0x0029
                int r1 = r0.size()
            L_0x0016:
                com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e r0 = r5.f101795a
                java.util.List<com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a> r0 = r0.f101551a
                int r0 = r0.size()
                if (r1 >= r0) goto L_0x002b
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ab r0 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ab
                r0.<init>(r5)
                r5.a(r0)
                return
            L_0x0029:
                r1 = 0
                goto L_0x0016
            L_0x002b:
                com.bytedance.im.a.a.a r3 = com.bytedance.im.a.a.a.a()
                long r7 = r5.a()
                com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac r2 = new com.ss.android.ugc.aweme.im.sdk.chatdetail.viewmodel.GroupChatDetailViewModel$ac
                r2.<init>(r5)
                com.bytedance.im.core.a.d r0 = com.bytedance.im.core.a.d.a()
                com.bytedance.im.core.a.f r0 = r0.b()
                boolean r9 = r0.aQ
                java.lang.String r1 = "imsdk"
                java.lang.String r0 = "loadMoreAuditList"
                com.bytedance.im.core.c.f.a(r1, r0, r4)
                com.bytedance.im.a.a.a.d r4 = new com.bytedance.im.a.a.a.d
                com.bytedance.im.a.a.a$2 r0 = new com.bytedance.im.a.a.a$2
                r0.<init>(r2)
                r4.<init>(r0)
                long r5 = r3.f37537c
                r4.a(r5, r7, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.epoxy.GroupChatController.e.onClick(android.view.View):void");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101787a;

        static {
            Covode.recordClassIndex(65072);
        }

        k(GroupChatController groupChatController) {
            this.f101787a = groupChatController;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101787a.viewModel;
            groupChatDetailViewModel.i();
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = groupChatDetailViewModel.b().getValue();
            if (value == null || !value.f101528b) {
                z = false;
            } else {
                z = true;
            }
            groupChatDetailViewModel.a(new GroupChatDetailViewModel.ao(z));
            h.p[] pVarArr = new h.p[1];
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            pVarArr[0] = h.v.a(str, "status");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("mute_messages", pVarArr);
            com.bytedance.ies.im.core.api.b.b bVar = groupChatDetailViewModel.f101799e;
            bVar.b(!z, new GroupChatDetailViewModel.an(bVar, groupChatDetailViewModel, z));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class l implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101788a;

        static {
            Covode.recordClassIndex(65073);
        }

        l(GroupChatController groupChatController) {
            this.f101788a = groupChatController;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101788a.viewModel;
            groupChatDetailViewModel.i();
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = groupChatDetailViewModel.b().getValue();
            if (value == null || !value.f101529c) {
                z = false;
            } else {
                z = true;
            }
            groupChatDetailViewModel.a(new GroupChatDetailViewModel.aq(z));
            h.p[] pVarArr = new h.p[1];
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            pVarArr[0] = h.v.a(str, "status");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("pin_to_top", pVarArr);
            com.bytedance.ies.im.core.api.b.b bVar = groupChatDetailViewModel.f101799e;
            bVar.a(!z, new GroupChatDetailViewModel.ap(bVar, groupChatDetailViewModel, z));
        }
    }

    public final void scrollToRequestInfoModel(RecyclerView recyclerView) {
        h.f.b.l.d(recyclerView, "");
        for (s<?> sVar : getAdapter().f5061f.f5017f) {
            if (sVar.f5077a == 15587) {
                Integer valueOf = Integer.valueOf(getAdapter().a(sVar));
                if (!(valueOf.intValue() == -1 || valueOf == null)) {
                    int intValue = valueOf.intValue();
                    RecyclerView.i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.a(recyclerView, (RecyclerView.s) null, intValue);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends h.f.b.m implements h.f.a.b<Boolean, z> {
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a $applyInfo;
        final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b $chatDetail$inlined;
        final /* synthetic */ GroupChatController this$0;

        static {
            Covode.recordClassIndex(65064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar, GroupChatController groupChatController, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar) {
            super(1);
            this.$applyInfo = aVar;
            this.this$0 = groupChatController;
            this.$chatDetail$inlined = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(Boolean bool) {
            String obj;
            ApplyStatusCode applyStatusCode;
            String str;
            Boolean bool2 = bool;
            GroupChatDetailViewModel groupChatDetailViewModel = this.this$0.viewModel;
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a aVar = this.$applyInfo;
            h.f.b.l.b(bool2, "");
            boolean booleanValue = bool2.booleanValue();
            h.f.b.l.d(aVar, "");
            e.a.a();
            long j2 = aVar.f101517e;
            Map<String, String> map = aVar.f101523k;
            if (map == null) {
                map = ag.a();
            }
            GroupChatDetailViewModel.v vVar = new GroupChatDetailViewModel.v(groupChatDetailViewModel, aVar);
            h.f.b.l.d(map, "");
            h.f.b.l.d(vVar, "");
            com.bytedance.im.a.a.a.a();
            com.bytedance.im.a.a.a.a aVar2 = new com.bytedance.im.a.a.a.a(vVar);
            StringBuilder append = new StringBuilder("ACKConversationApplyHandler, applyId = ").append(j2).append(" &status = ").append(booleanValue).append(" &bizExt = ");
            if (map == null) {
                obj = null;
            } else {
                obj = map.toString();
            }
            com.bytedance.im.core.c.f.a("imsdk", append.append(obj).toString(), (Throwable) null);
            AckConversationApplyRequestBody.Builder apply_id = new AckConversationApplyRequestBody.Builder().apply_id(Long.valueOf(j2));
            if (booleanValue) {
                applyStatusCode = ApplyStatusCode.AGREE;
            } else {
                applyStatusCode = ApplyStatusCode.DENY;
            }
            AckConversationApplyRequestBody.Builder apply_status = apply_id.apply_status(applyStatusCode);
            if (map != null && !map.isEmpty()) {
                apply_status.bizExt(map);
            }
            aVar2.a(0, new RequestBody.Builder().addExtension(2025, AckConversationApplyRequestBody.ADAPTER, apply_status.build()).build(), null, new Object[0]);
            HashMap hashMap = new HashMap();
            hashMap.put("conversation_id", groupChatDetailViewModel.f101798d);
            if (booleanValue) {
                str = "accept";
            } else {
                str = "delete";
            }
            hashMap.put("result", str);
            com.ss.android.ugc.aweme.common.r.a("handle_group_request", hashMap);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class p implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GroupChatController f101792a;

        static {
            Covode.recordClassIndex(65077);
        }

        p(GroupChatController groupChatController) {
            this.f101792a = groupChatController;
        }

        public final void onClick(View view) {
            boolean z;
            String str;
            ClickAgent.onClick(view);
            GroupChatDetailViewModel groupChatDetailViewModel = this.f101792a.viewModel;
            groupChatDetailViewModel.i();
            com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b value = groupChatDetailViewModel.b().getValue();
            if (value == null || !value.f101531e) {
                z = false;
            } else {
                z = true;
                if (groupChatDetailViewModel.h()) {
                    groupChatDetailViewModel.b(GroupChatDetailViewModel.ak.f101808a);
                    return;
                }
            }
            groupChatDetailViewModel.a(new GroupChatDetailViewModel.al(z));
            h.p[] pVarArr = new h.p[1];
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            pVarArr[0] = h.v.a(str, "status");
            com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a("approval_require_join", pVarArr);
            com.bytedance.im.a.a.a.a();
            long a2 = groupChatDetailViewModel.a();
            int i2 = e.a.f37582b;
            boolean z2 = !z;
            com.bytedance.im.a.a.a.f fVar = new com.bytedance.im.a.a.a.f(new GroupChatDetailViewModel.am(groupChatDetailViewModel, z));
            com.bytedance.im.core.c.f.a("imsdk", "UpdateConversationAuditSwitchHandler, conversationShortId = " + a2 + " &conversationType = " + i2 + " &openAuditSwitch = " + z2, (Throwable) null);
            fVar.a(0, new RequestBody.Builder().addExtension(2023, UpdateConversationAuditSwitchRequestBody.ADAPTER, new UpdateConversationAuditSwitchRequestBody.Builder().conv_short_id(Long.valueOf(a2)).conversation_type(Integer.valueOf(i2)).switch_status(Boolean.valueOf(z2)).build()).build(), null, new Object[0]);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GroupChatController(GroupChatDetailViewModel groupChatDetailViewModel, Context context2) {
        super(com.airbnb.epoxy.m.a(), com.airbnb.epoxy.m.a());
        h.f.b.l.d(groupChatDetailViewModel, "");
        h.f.b.l.d(context2, "");
        this.viewModel = groupChatDetailViewModel;
        this.context = context2;
    }

    /* access modifiers changed from: protected */
    public final void buildModels(com.bytedance.ies.im.core.api.b.b bVar, com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.b bVar2) {
        int i2;
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(bVar2, "");
        com.bytedance.im.core.d.h c2 = bVar.c();
        if (c2 != null) {
            i2 = c2.getMemberCount();
        } else {
            i2 = 0;
        }
        boolean a2 = com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(bVar2.f101532f);
        String str = this.viewModel.f101798d;
        h.f.b.l.d(str, "");
        com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.f101508c = str;
        com.ss.android.ugc.aweme.im.sdk.chatdetail.a.a.a(a2);
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.g gVar = this.groupTitleModel;
        if (gVar == null) {
            h.f.b.l.a("groupTitleModel");
        }
        gVar.a(bVar).a(bVar2).a(this.viewModel);
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.c.c.a()) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k kVar = this.inviteModel;
            if (kVar == null) {
                h.f.b.l.a("inviteModel");
            }
            kVar.d(R.string.c84).a((View.OnClickListener) new f(this));
        }
        if (!com.ss.android.ugc.aweme.im.service.c.c.a()) {
            v vVar = this.muteModel;
            if (vVar == null) {
                h.f.b.l.a("muteModel");
            }
            vVar.a(bVar2.f101528b).d(R.string.cga).a((View.OnClickListener) new k(this));
            v vVar2 = this.pinModel;
            if (vVar2 == null) {
                h.f.b.l.a("pinModel");
            }
            vVar2.a(bVar2.f101529c).d(R.string.cit).a((View.OnClickListener) new l(this));
        }
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.f()) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar = this.reportSensitiveModel;
            if (rVar == null) {
                h.f.b.l.a("reportSensitiveModel");
            }
            rVar.d(R.string.fcr).a((View.OnClickListener) new m(this));
            com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar2 = this.leaveGroupModel;
            if (rVar2 == null) {
                h.f.b.l.a("leaveGroupModel");
            }
            rVar2.d(R.string.c6q).e(R.string.c6r).a((View.OnClickListener) new n(this));
            if (com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(bVar2.f101532f)) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar3 = this.endGroupModel;
                if (rVar3 == null) {
                    h.f.b.l.a("endGroupModel");
                }
                rVar3.d(R.string.c6s).e(R.string.c6t).a((View.OnClickListener) new o(this));
            }
        }
        if (a2) {
            v vVar3 = this.approveModel;
            if (vVar3 == null) {
                h.f.b.l.a("approveModel");
            }
            vVar3.a(bVar2.f101531e).d(R.string.c6i).a((View.OnClickListener) new p(this));
        }
        com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.e eVar = bVar2.f101533g;
        if (eVar != null) {
            if ((!eVar.f101551a.isEmpty()) || eVar.f101552b) {
                t tVar = this.dividerOne;
                if (tVar == null) {
                    h.f.b.l.a("dividerOne");
                }
                tVar.d(R.layout.a86);
            }
            if (!eVar.f101551a.isEmpty()) {
                new com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i().a(this.context.getString(R.string.c6l)).b(15587L).a((com.airbnb.epoxy.n) this);
                for (T t : eVar.f101551a) {
                    new com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.n().b(t.f101517e).a((com.ss.android.ugc.aweme.im.sdk.chatdetail.b.a.a) t).a((h.f.a.b<? super Boolean, z>) new c(t, this, bVar2)).b((h.f.a.b<? super IMUser, z>) q.f101793a).a((h.f.a.a<z>) new d(t, this, bVar2)).a((com.airbnb.epoxy.n) this);
                }
            }
            if (eVar.f101552b) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p pVar = this.requestSeeMore;
                if (pVar == null) {
                    h.f.b.l.a("requestSeeMore");
                }
                pVar.a(this.context.getString(R.string.c9i)).a((View.OnClickListener) new e(this, bVar2));
            }
        }
        t tVar2 = this.dividerTwo;
        if (tVar2 == null) {
            h.f.b.l.a("dividerTwo");
        }
        tVar2.d(R.layout.a86);
        com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.i iVar = this.groupMemberHeader;
        if (iVar == null) {
            h.f.b.l.a("groupMemberHeader");
        }
        iVar.a(this.context.getString(R.string.c9f, Integer.valueOf(i2)));
        t tVar3 = this.addMemberModel;
        if (tVar3 == null) {
            h.f.b.l.a("addMemberModel");
        }
        tVar3.d(R.layout.a87).a((h.f.a.a<z>) new r(this));
        int i3 = 0;
        for (T t2 : bVar2.f101532f) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h.a.n.a();
            }
            T t3 = t2;
            if (i3 < bVar2.f101527a) {
                new com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.e().b((CharSequence) t3.getUid()).a((com.ss.android.ugc.aweme.im.sdk.chat.feature.group.data.model.a) t3).a((h.f.a.a<z>) new b(t3, this, bVar2)).a((com.airbnb.epoxy.n) this);
            }
            i3 = i4;
        }
        if (bVar2.f101532f.size() > bVar2.f101527a) {
            com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.p pVar2 = this.groupMemberSeeMore;
            if (pVar2 == null) {
                h.f.b.l.a("groupMemberSeeMore");
            }
            pVar2.a(this.context.getString(R.string.c87, Integer.valueOf(bVar2.f101532f.size() - bVar2.f101527a))).a((View.OnClickListener) new g(this));
        }
        if (!com.ss.android.ugc.aweme.im.sdk.common.controller.a.e.f()) {
            t tVar4 = this.dividerThree;
            if (tVar4 == null) {
                h.f.b.l.a("dividerThree");
            }
            tVar4.d(R.layout.a86);
            com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.k kVar2 = this.reportModel;
            if (kVar2 == null) {
                h.f.b.l.a("reportModel");
            }
            kVar2.d(R.string.fcr).a((View.OnClickListener) new h(this));
            com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar4 = this.leaveGroupModel;
            if (rVar4 == null) {
                h.f.b.l.a("leaveGroupModel");
            }
            rVar4.d(R.string.c6q).e(R.string.c6r).a((View.OnClickListener) new i(this));
            if (com.ss.android.ugc.aweme.im.sdk.group.a.a.a.a(bVar2.f101532f)) {
                com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.b.r rVar5 = this.endGroupModel;
                if (rVar5 == null) {
                    h.f.b.l.a("endGroupModel");
                }
                rVar5.d(R.string.c6s).e(R.string.c6t).a((View.OnClickListener) new j(this));
            }
        }
    }
}
