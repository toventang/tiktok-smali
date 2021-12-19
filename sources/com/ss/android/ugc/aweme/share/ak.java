package com.ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.h.v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.i;
import com.ss.android.ugc.aweme.experiment.gk;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.share.b.b.g;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.im.service.j.c;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.ss.android.ugc.aweme.sharer.ui.bar.MicroShareChannelBar;
import com.ss.android.ugc.aweme.sharer.ui.e;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.a.z;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class ak extends m implements com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a {
    public static final a q = new a((byte) 0);
    public final com.ss.android.ugc.aweme.im.service.share.a.b p;
    private com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.b r;
    private TuxTextView s = ((TuxTextView) this.f123424a.findViewById(R.id.eyb));
    private final Activity t;
    private final Aweme u;

    static {
        Covode.recordClassIndex(81011);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(81012);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a, com.ss.android.ugc.aweme.share.d
    public final void a() {
        if (!gk.b()) {
            f();
        }
    }

    @Override // com.bytedance.ies.dmt.ui.frameworkui.a, com.ss.android.ugc.aweme.share.d
    public final void b() {
        if (gk.b()) {
            f();
        }
    }

    static final class b implements com.ss.android.ugc.aweme.im.sdk.share.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ak f123358a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f123359b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f123360c;

        static {
            Covode.recordClassIndex(81013);
        }

        b(ak akVar, String str, List list) {
            this.f123358a = akVar;
            this.f123359b = str;
            this.f123360c = list;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.a
        public final void a() {
            g.a(this.f123359b, this.f123358a.f123433j.f124657i, this.f123360c);
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = this.f123358a.p;
            if (bVar != null) {
                SharePackage sharePackage = this.f123358a.f123433j.f124657i;
                this.f123360c.size();
                bVar.c(sharePackage);
            }
            com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(this.f123358a.f123433j.f124657i, "", n.g((Collection) this.f123360c));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.share.d
    public final void e() {
        if (gk.b()) {
            Activity activity = this.f123426c;
            l.b(activity, "");
            Window window = activity.getWindow();
            l.b(window, "");
            showAtLocation(window.getDecorView(), 80, 0, -i.e(this.t));
            return;
        }
        super.e();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void a(IMContact iMContact) {
        l.d(iMContact, "");
        l.d(iMContact, "");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void b(List<? extends IMContact> list) {
        l.d(list, "");
        l.d(list, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        if (r1.equals(r0) != false) goto L_0x0030;
     */
    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMContact> r4) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.share.ak.a(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final boolean a(IMContact iMContact, boolean z) {
        l.d(iMContact, "");
        if (IMUnder16ProxyImpl.n().c()) {
            IMUnder16ProxyImpl.n().h();
            return false;
        } else if (!(iMContact instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a) || this == null) {
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = this.p;
            if (bVar == null || bVar.a(this.f123433j.f124657i)) {
                List c2 = n.c(iMContact);
                this.f123433j.f124657i.f124595i.putBoolean("is_ad", this.u.isAd());
                com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, this.f123433j.f124657i, iMContact, false, null, 0, null, null, 120);
                String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a();
                SharePackage sharePackage = this.f123433j.f124657i;
                com.ss.android.ugc.aweme.im.service.share.a.b bVar2 = this.p;
                if (bVar2 != null) {
                    bVar2.b(sharePackage);
                }
                com.ss.android.ugc.aweme.im.sdk.share.b.a.a(this.f123433j.f124657i, c2);
                SharePackage sharePackage2 = this.f123433j.f124657i;
                l.d(sharePackage2, "");
                l.d(iMContact, "");
                sharePackage2.f124595i.putInt("is_create_group_chat", 0);
                if (iMContact instanceof IMUser) {
                    sharePackage2.f124595i.putInt("friends_shared_cnt", 1);
                } else if (iMContact instanceof IMConversation) {
                    sharePackage2.f124595i.putInt("friends_shared_cnt", ((IMConversation) iMContact).getConversationMemberCount());
                }
                b bVar3 = new b(this, a2, c2);
                ArrayList arrayList = new ArrayList();
                for (Object obj : c2) {
                    if (obj instanceof IMConversation) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(c2, "", this.f123433j.f124657i, (BaseContent) null, a2, (String) null, bVar3);
                } else {
                    com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a((List<IMContact>) c2, "", this.f123433j.f124657i, a2, false, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) bVar3);
                }
                d();
                return false;
            }
            com.ss.android.ugc.aweme.im.service.m.a.a("ShareSuccessPopWindow", "cancel share by callback");
            return false;
        } else {
            c shareService = IMService.createIIMServicebyMonsterPlugin(false).getShareService();
            if (shareService != null) {
                Activity activity = this.t;
                e.b bVar4 = new e.b();
                bVar4.n = this.f123433j.f124657i;
                Dialog a3 = shareService.a(activity, bVar4.a(), null, 0, this.p);
                if (a3 != null) {
                    a3.show();
                }
            }
            com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, this.f123433j.f124657i, null, true, null, 0, null, null, 120);
            d();
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ak(Activity activity, e eVar, Aweme aweme, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        super(activity, eVar, aweme);
        int i2;
        l.d(activity, "");
        l.d(eVar, "");
        l.d(aweme, "");
        this.t = activity;
        this.u = aweme;
        this.p = bVar;
        RemoteImageView remoteImageView = this.f123425b;
        l.b(remoteImageView, "");
        remoteImageView.setVisibility(8);
        this.f123433j.f124657i.f124595i.putString("enter_method", "publish_then_share");
        this.f123433j.f124657i.f124595i.putString("enter_from", "publish_share_panel");
        if (gk.b()) {
            i2 = R.drawable.bhq;
            setAnimationStyle(R.style.v9);
            setOutsideTouchable(true);
            setFocusable(true);
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R.dimen.sj);
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.sh);
            int dimensionPixelOffset3 = activity.getResources().getDimensionPixelOffset(R.dimen.si);
            LinearLayout linearLayout = this.f123432i;
            if (linearLayout != null) {
                linearLayout.setPadding(0, dimensionPixelOffset3, 0, dimensionPixelOffset);
            }
            p.a(((m) this).n, dimensionPixelOffset);
            MicroShareChannelBar microShareChannelBar = this.f123435l;
            if (microShareChannelBar != null) {
                com.bytedance.tux.h.i.b(microShareChannelBar, 0, Integer.valueOf(dimensionPixelOffset), 0, 0, false, 16);
            }
            TuxTextView tuxTextView = this.s;
            if (tuxTextView != null) {
                com.bytedance.tux.h.i.b(tuxTextView, Integer.valueOf(dimensionPixelOffset2), 0, 0, 0, false, 16);
            }
        } else {
            int dimensionPixelOffset4 = activity.getResources().getDimensionPixelOffset(R.dimen.sj);
            LinearLayout linearLayout2 = this.f123432i;
            l.b(linearLayout2, "");
            com.bytedance.tux.h.i.b(linearLayout2, Integer.valueOf(dimensionPixelOffset4), Integer.valueOf(dimensionPixelOffset4), Integer.valueOf(dimensionPixelOffset4), Integer.valueOf(dimensionPixelOffset4), false, 16);
            i2 = R.drawable.bho;
        }
        v.a(this.f123432i, androidx.core.content.b.a(activity, i2));
        if (gk.a() != 1 && !IMUnder16ProxyImpl.n().d()) {
            SharePanelViewModel a2 = SharePanelViewModel.a.a(this.f123433j.f124657i, this, z.INSTANCE, null, 0, 24);
            a2.d();
            this.r = new com.ss.android.ugc.aweme.share.a.a(activity, a2);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
            RecyclerView recyclerView = ((m) this).n;
            if (recyclerView != null) {
                recyclerView.setAdapter(this.r);
                recyclerView.setLayoutManager(linearLayoutManager);
                return;
            }
            return;
        }
        RecyclerView recyclerView2 = ((m) this).n;
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }
}
