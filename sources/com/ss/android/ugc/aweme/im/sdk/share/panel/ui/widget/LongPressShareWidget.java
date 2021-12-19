package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtEditText;
import com.bytedance.im.core.d.h;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.u;
import com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget;
import com.ss.android.ugc.aweme.im.sdk.relations.data.b.c;
import com.ss.android.ugc.aweme.im.sdk.share.b.b.g;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.f;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public final class LongPressShareWidget extends Widget implements au, com.ss.android.ugc.aweme.im.sdk.share.b.a.b, com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a {

    /* renamed from: h  reason: collision with root package name */
    public static final a f103521h = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final Context f103522a;

    /* renamed from: b  reason: collision with root package name */
    public final SharePanelViewModel f103523b;

    /* renamed from: c  reason: collision with root package name */
    public RecyclerView f103524c;

    /* renamed from: d  reason: collision with root package name */
    a f103525d;

    /* renamed from: e  reason: collision with root package name */
    DmtEditText f103526e;

    /* renamed from: f  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.share.b.a f103527f;

    /* renamed from: g  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.im.service.share.a.b f103528g;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b f103529i;

    /* renamed from: j  reason: collision with root package name */
    private ViewGroup f103530j;

    /* renamed from: k  reason: collision with root package name */
    private com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a f103531k;

    /* renamed from: l  reason: collision with root package name */
    private List<IMContact> f103532l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    private TuxButton f103533m;
    private RemoteImageView n;
    private final NestedScrollView.b o;

    static {
        Covode.recordClassIndex(66333);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void b(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void c(boolean z) {
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66335);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.base.Widget
    public final void a() {
        super.a();
        getLifecycle().b(this.f103523b);
    }

    private static int b() {
        com.ss.android.ugc.aweme.im.service.model.i iMSetting;
        com.ss.android.ugc.aweme.im.service.e b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
        if (b2 == null || (iMSetting = b2.getIMSetting()) == null) {
            return 10;
        }
        return iMSetting.f103906c;
    }

    private final void c() {
        TextView textView = this.f103527f.f103943f;
        if (textView != null) {
            textView.setVisibility(0);
        }
        ViewGroup viewGroup = this.f103527f.f103939b;
        if (viewGroup == null) {
            l.b();
        }
        this.f103530j = viewGroup;
        d();
    }

    /* access modifiers changed from: package-private */
    public static final class c implements com.ss.android.ugc.aweme.im.sdk.share.b.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LongPressShareWidget f103536a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f103537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ SharePackage f103538c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f103539d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f103540e;

        static {
            Covode.recordClassIndex(66337);
        }

        c(LongPressShareWidget longPressShareWidget, String str, SharePackage sharePackage, List list, String str2) {
            this.f103536a = longPressShareWidget;
            this.f103537b = str;
            this.f103538c = sharePackage;
            this.f103539d = list;
            this.f103540e = str2;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.a
        public final void a() {
            g.a(this.f103537b, this.f103538c, this.f103539d);
            com.ss.android.ugc.aweme.im.service.share.a.b bVar = this.f103536a.f103528g;
            SharePackage sharePackage = this.f103538c;
            this.f103539d.size();
            bVar.c(sharePackage);
            com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(this.f103538c, this.f103540e, n.g((Collection) this.f103539d));
            if (l.a((Object) "live_event", (Object) this.f103538c.f124590d)) {
                for (IMContact iMContact : this.f103539d) {
                    com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, "livesdk_live_event_share", this.f103538c, iMContact);
                }
            }
        }
    }

    private final void e() {
        View view;
        if (com.ss.android.ugc.aweme.im.service.c.i.a() && (view = this.f103524c) != null) {
            while (view.getParent() != null && (view.getParent() instanceof View)) {
                if (view.getParent() instanceof NestedScrollView) {
                    ViewParent parent = view.getParent();
                    Objects.requireNonNull(parent, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
                    NestedScrollView nestedScrollView = (NestedScrollView) parent;
                    if (nestedScrollView != null) {
                        nestedScrollView.setOnScrollChangeListener(this.o);
                        nestedScrollView.scrollBy(0, 1);
                        return;
                    }
                    return;
                }
                ViewParent parent2 = view.getParent();
                Objects.requireNonNull(parent2, "null cannot be cast to non-null type android.view.View");
                view = (View) parent2;
            }
        }
    }

    private final void f() {
        String sb;
        if (!this.f103523b.f103596c) {
            TuxButton tuxButton = this.f103533m;
            if (tuxButton == null) {
                l.a("sendTv");
            }
            if (this.f103523b.b().size() == 1) {
                TuxButton tuxButton2 = this.f103533m;
                if (tuxButton2 == null) {
                    l.a("sendTv");
                }
                sb = tuxButton2.getResources().getString(R.string.ci1);
            } else {
                a aVar = this.f103525d;
                if (aVar == null || !aVar.f103568b) {
                    StringBuilder sb2 = new StringBuilder();
                    TuxButton tuxButton3 = this.f103533m;
                    if (tuxButton3 == null) {
                        l.a("sendTv");
                    }
                    sb = sb2.append(tuxButton3.getResources().getString(R.string.fku)).append('(').append(this.f103523b.b().size()).append(')').toString();
                } else {
                    sb = this.f103522a.getString(R.string.c6y);
                }
            }
            tuxButton.setText(sb);
        }
    }

    private final void d() {
        ViewGroup viewGroup;
        MethodCollector.i(7564);
        ViewGroup viewGroup2 = this.f103527f.f103939b;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
        }
        List<IMContact> list = this.f103532l;
        if (list != null) {
            for (T t : list) {
                if (t instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a) {
                    com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.c cVar = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.c(this.f103527f.f103953j, this.f103523b);
                    cVar.a(t);
                    ViewGroup viewGroup3 = this.f103527f.f103939b;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(cVar);
                    }
                } else {
                    com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b bVar = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.b(this.f103527f.f103953j, this.f103523b, this.f103528g);
                    bVar.a(t);
                    ViewGroup viewGroup4 = this.f103527f.f103939b;
                    if (viewGroup4 != null) {
                        viewGroup4.addView(bVar);
                    }
                }
            }
        }
        List<IMContact> list2 = this.f103532l;
        if (list2 != null && !list2.isEmpty() && ((viewGroup = this.f103527f.f103939b) == null || viewGroup.getVisibility() != 0)) {
            ViewGroup viewGroup5 = this.f103527f.f103939b;
            if (viewGroup5 != null) {
                viewGroup5.setVisibility(0);
            }
            TextView textView = this.f103527f.f103943f;
            if (textView != null) {
                textView.setVisibility(0);
                MethodCollector.o(7564);
                return;
            }
        }
        MethodCollector.o(7564);
    }

    public static final class d implements com.ss.android.ugc.aweme.im.service.share.a.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LongPressShareWidget f103541a;

        static {
            Covode.recordClassIndex(66338);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(LongPressShareWidget longPressShareWidget) {
            this.f103541a = longPressShareWidget;
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.a
        public final void a(SharePackage sharePackage) {
            l.d(sharePackage, "");
            this.f103541a.f103528g.c(sharePackage);
        }

        @Override // com.ss.android.ugc.aweme.im.service.share.a.a
        public final void b(SharePackage sharePackage) {
            l.d(sharePackage, "");
            this.f103541a.f103528g.b(sharePackage);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.b.a.b
    public final void a(boolean z) {
        this.f103523b.f103595b = z;
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a aVar = this.f103531k;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
        f();
    }

    static final class b extends h.f.b.m implements h.f.a.b<h, z> {
        final /* synthetic */ LongPressShareWidget this$0;

        static {
            Covode.recordClassIndex(66336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LongPressShareWidget longPressShareWidget) {
            super(1);
            this.this$0 = longPressShareWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(h hVar) {
            h hVar2 = hVar;
            this.this$0.d(false);
            if (hVar2 != null) {
                this.this$0.f103527f.f103954k.f124595i.putBoolean("is_new_group", true);
                this.this$0.c(n.c(com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.b(hVar2)));
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void a(IMContact iMContact) {
        l.d(iMContact, "");
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a aVar = this.f103531k;
        if (aVar != null) {
            l.d(iMContact, "");
            int i2 = 0;
            for (IMContact iMContact2 : aVar.a()) {
                if (!l.a(iMContact2, iMContact)) {
                    i2++;
                } else if (i2 != -1) {
                    aVar.f103405a.add(Integer.valueOf(i2));
                    aVar.notifyItemChanged(i2, true);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void b(List<? extends IMContact> list) {
        l.d(list, "");
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a aVar = this.f103531k;
        if (aVar != null) {
            l.d(list, "");
            int size = aVar.a().size() - 1;
            IMContact remove = aVar.a().remove(size);
            aVar.a().addAll(list);
            aVar.a().add(remove);
            aVar.notifyItemRangeInserted(size, list.size());
        }
    }

    public final void d(boolean z) {
        this.f103523b.f103596c = z;
        TuxButton tuxButton = this.f103533m;
        if (tuxButton == null) {
            l.a("sendTv");
        }
        tuxButton.setLoading(z);
        if (z) {
            TuxButton tuxButton2 = this.f103533m;
            if (tuxButton2 == null) {
                l.a("sendTv");
            }
            tuxButton2.setBackgroundResource(R.color.bh);
            return;
        }
        a aVar = this.f103525d;
        if (aVar != null) {
            aVar.f103569c = false;
        }
        TuxButton tuxButton3 = this.f103533m;
        if (tuxButton3 == null) {
            l.a("sendTv");
        }
        tuxButton3.setBackgroundResource(R.drawable.ar6);
        f();
    }

    private final void a(f fVar) {
        com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c cVar;
        boolean z;
        this.f103527f.f103938a.dismiss();
        this.f103528g.a("chat_merge", this.f103527f.f103954k);
        d dVar = new d(this);
        String string = this.f103527f.f103954k.f124595i.getString("author_user_name", "");
        int i2 = this.f103527f.f103954k.f124595i.getInt("share_im_limit_tip_type", -1);
        Activity activity = null;
        if (i2 <= 0 || TextUtils.isEmpty(string)) {
            cVar = null;
        } else {
            l.b(string, "");
            cVar = new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c(string, i2);
        }
        Context context = this.f103522a;
        if (context instanceof Activity) {
            activity = context;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            SharePackage sharePackage = this.f103527f.f103954k;
            Set<IMContact> e2 = this.f103523b.e();
            a aVar = this.f103525d;
            if (aVar == null || !aVar.f103568b) {
                z = false;
            } else {
                z = true;
            }
            com.ss.android.ugc.aweme.im.sdk.share.ui.b.a.a(activity2, sharePackage, fVar, (Set<? extends IMContact>) e2, true, (com.ss.android.ugc.aweme.im.service.share.a.a) dVar, z, cVar).show();
            com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.a(this.f103527f.f103954k, "long_press");
        }
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LongPressShareWidget f103542a;

        static {
            Covode.recordClassIndex(66339);
        }

        e(LongPressShareWidget longPressShareWidget) {
            this.f103542a = longPressShareWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f103542a.f103523b.f103596c && !u.a(view, 500)) {
                LongPressShareWidget longPressShareWidget = this.f103542a;
                if (!longPressShareWidget.f103528g.a(longPressShareWidget.f103527f.f103954k)) {
                    com.ss.android.ugc.aweme.im.service.m.a.a("LongPressShareWidget", "cancel share by callback");
                    return;
                }
                List<IMContact> g2 = n.g((Collection) longPressShareWidget.f103523b.b());
                if (!g2.isEmpty()) {
                    DmtEditText dmtEditText = longPressShareWidget.f103526e;
                    if (dmtEditText == null) {
                        l.a("editText");
                    }
                    Editable text = dmtEditText.getText();
                    if (text == null || text.length() <= 6000) {
                        a aVar = longPressShareWidget.f103525d;
                        if (aVar == null || !aVar.f103568b) {
                            longPressShareWidget.c(g2);
                            return;
                        }
                        a aVar2 = longPressShareWidget.f103525d;
                        if (aVar2 != null) {
                            Boolean valueOf = Boolean.valueOf(aVar2.a(new b(longPressShareWidget)));
                            if (valueOf.booleanValue()) {
                                valueOf.booleanValue();
                                longPressShareWidget.d(true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    new com.ss.android.ugc.aweme.tux.a.i.a(longPressShareWidget.f103522a).a(R.string.cfv).a();
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    public final void a(List<? extends IMContact> list) {
        l.d(list, "");
        if (list == null || list.isEmpty()) {
            RecyclerView recyclerView = this.f103524c;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            ViewGroup viewGroup = this.f103530j;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a aVar = this.f103531k;
        Integer num = null;
        if (aVar != null) {
            List<IMContact> a2 = aVar.a();
            if (!(list == null || list.isEmpty() || a2 == null)) {
                a2.clear();
                if (list == null) {
                    l.b();
                }
                a2.addAll(list);
                a2.add(new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a());
                aVar.notifyDataSetChanged();
            }
            StringBuilder sb = new StringBuilder("setData: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
            com.ss.android.ugc.aweme.im.service.m.a.b("LongPressShareListAdapter", sb.append(num).append(", ").append(aVar.a().size()).toString());
            e();
            com.ss.android.ugc.aweme.im.sdk.share.a.a.a(this.f103527f.f103954k);
        } else if (this.f103530j != null) {
            com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a aVar2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.a();
            List<IMContact> list2 = this.f103532l;
            if (list != null && !list.isEmpty() && list2 != null) {
                if (list == null) {
                    l.b();
                }
                if (list.size() > 3) {
                    list = list.subList(0, 3);
                }
                list2.clear();
                if (list == null) {
                    l.b();
                }
                list2.addAll(list);
                list2.add(aVar2);
                d();
            }
        }
    }

    public final void c(List<IMContact> list) {
        SharePackage sharePackage = this.f103527f.f103954k;
        sharePackage.f124595i.putInt("friends_shared_cnt", com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.a.a(list));
        String str = null;
        if (list.size() > 1) {
            com.ss.android.ugc.aweme.im.sdk.share.a.a.a(sharePackage, (BaseContent) null, list.size());
        }
        this.f103528g.b(sharePackage);
        String a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.b.a.a();
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            if (t instanceof IMUser) {
                arrayList.add(t);
            }
        }
        ArrayList<IMUser> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
        for (IMUser iMUser : arrayList2) {
            arrayList3.add(iMUser.getUid());
        }
        String obj = arrayList3.toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        String substring = obj.substring(1, obj.length() - 1);
        l.b(substring, "");
        int size = arrayList2.size();
        Bundle bundle = this.f103527f.f103954k.f124595i;
        bundle.putString("shareIdList", substring);
        bundle.putInt("chat_cnt", size);
        bundle.putInt("group_chat_cnt", list.size() - size);
        DmtEditText dmtEditText = this.f103526e;
        if (dmtEditText == null) {
            l.a("editText");
        }
        Editable text = dmtEditText.getText();
        if (text != null) {
            str = text.toString();
        }
        DmtEditText dmtEditText2 = this.f103526e;
        if (dmtEditText2 == null) {
            l.a("editText");
        }
        KeyboardUtils.c(dmtEditText2);
        c cVar = new c(this, a2, sharePackage, list, str);
        ArrayList arrayList4 = new ArrayList();
        for (T t2 : list) {
            if (t2 instanceof IMConversation) {
                arrayList4.add(t2);
            }
        }
        if (!arrayList4.isEmpty()) {
            com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(list, str, sharePackage, (BaseContent) null, a2, (String) null, cVar);
        } else {
            com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(list, str, sharePackage, a2, false, (com.ss.android.ugc.aweme.im.sdk.share.b.a.a) cVar);
        }
    }

    public LongPressShareWidget(com.ss.android.ugc.aweme.im.service.share.b.a aVar, com.ss.android.ugc.aweme.im.service.share.a.b bVar) {
        SharePackage sharePackage;
        Bundle bundle;
        l.d(aVar, "");
        l.d(bVar, "");
        MethodCollector.i(7753);
        this.f103527f = aVar;
        this.f103528g = bVar;
        Context context = aVar.f103953j;
        this.f103522a = context;
        create();
        aVar.f103954k.f124595i.putString("enter_method", "long_press");
        SharePanelViewModel a2 = SharePanelViewModel.a.a(aVar.f103954k, this, aVar.f103945h, c.b.LONG_PRESS, 0, 16);
        this.f103523b = a2;
        getLifecycle().a(a2);
        if (aVar.f103941d != null) {
            RecyclerView recyclerView = aVar.f103941d;
            if (recyclerView == null) {
                l.b();
            }
            this.f103524c = recyclerView;
            com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a aVar2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.a.a(a2, bVar);
            this.f103531k = aVar2;
            RecyclerView recyclerView2 = this.f103524c;
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(aVar2);
            }
            RecyclerView recyclerView3 = this.f103524c;
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(1, false));
            }
            FrameLayout frameLayout = aVar.f103940c;
            if (!(frameLayout == null || (sharePackage = a2.f103597d) == null || (bundle = sharePackage.f124595i) == null)) {
                String string = bundle.getString("author_user_name", null);
                int i2 = bundle.getInt("share_im_limit_tip_type", -1);
                if (i2 > 0 && !TextUtils.isEmpty(string)) {
                    com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar2 = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b(context, (byte) 0);
                    this.f103529i = bVar2;
                    bVar2.setWidget(this);
                    frameLayout.addView(this.f103529i);
                    com.ss.android.ugc.aweme.im.sdk.share.panel.ui.view.b bVar3 = this.f103529i;
                    if (bVar3 != null) {
                        l.b(string, "");
                        bVar3.a(new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.c(string, i2));
                    }
                }
            }
            if (com.ss.android.ugc.aweme.im.service.c.e.c()) {
                View a3 = com.a.a(LayoutInflater.from(context), R.layout.a7j, aVar.f103942e, true);
                View findViewById = a3.findViewById(R.id.cp4);
                l.b(findViewById, "");
                findViewById.setVisibility(0);
                View findViewById2 = a3.findViewById(R.id.cp3);
                l.b(findViewById2, "");
                this.f103526e = (DmtEditText) findViewById2;
                View findViewById3 = a3.findViewById(R.id.cp2);
                l.b(findViewById3, "");
                this.n = (RemoteImageView) findViewById3;
                DmtEditText dmtEditText = this.f103526e;
                if (dmtEditText == null) {
                    l.a("editText");
                }
                InputFilter[] inputFilterArr = new InputFilter[1];
                DmtEditText dmtEditText2 = this.f103526e;
                if (dmtEditText2 == null) {
                    l.a("editText");
                }
                inputFilterArr[0] = new ad(dmtEditText2);
                dmtEditText.setFilters(inputFilterArr);
                View a4 = com.a.a(LayoutInflater.from(context), R.layout.a7k, aVar.f103942e, true);
                View findViewById4 = a4.findViewById(R.id.dye);
                l.b(findViewById4, "");
                TuxButton tuxButton = (TuxButton) findViewById4;
                this.f103533m = tuxButton;
                if (tuxButton == null) {
                    l.a("sendTv");
                }
                tuxButton.setVisibility(0);
                TuxButton tuxButton2 = this.f103533m;
                if (tuxButton2 == null) {
                    l.a("sendTv");
                }
                tuxButton2.setOnClickListener(new e(this));
                if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.i.a()) {
                    View findViewById5 = a4.findViewById(R.id.bd9);
                    l.b(findViewById5, "");
                    View findViewById6 = a4.findViewById(R.id.a5_);
                    l.b(findViewById6, "");
                    a aVar3 = new a(new com.ss.android.ugc.aweme.im.sdk.share.panel.a.a.b((LinearLayout) findViewById5, (TuxCheckBox) findViewById6), aVar.f103954k, this);
                    aVar3.c();
                    this.f103525d = aVar3;
                }
            }
        } else if (aVar.f103939b != null) {
            c();
        }
        this.o = new NestedScrollView.b(this) {
            /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ LongPressShareWidget f103534a;

            /* renamed from: b  reason: collision with root package name */
            private int f103535b;

            static {
                Covode.recordClassIndex(66334);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f103534a = r1;
            }

            @Override // androidx.core.widget.NestedScrollView.b
            public final void a(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5) {
                com.ss.android.ugc.aweme.social.c.a aVar;
                String str;
                Bundle bundle;
                l.d(nestedScrollView, "");
                NestedScrollView.b bVar = this.f103534a.f103527f.f103946i;
                if (bVar != null) {
                    bVar.a(nestedScrollView, i2, i3, i4, i5);
                }
                RecyclerView recyclerView = this.f103534a.f103524c;
                if (recyclerView != null) {
                    int childCount = recyclerView.getChildCount();
                    for (int i6 = this.f103535b; i6 < childCount; i6++) {
                        RecyclerView.ViewHolder a2 = recyclerView.a(i6, false);
                        if (a2 != null) {
                            int top = recyclerView.getTop();
                            View view = a2.itemView;
                            l.b(view, "");
                            if (top + view.getTop() < nestedScrollView.getHeight() + i3) {
                                if (!(a2 instanceof com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d)) {
                                    a2 = null;
                                }
                                com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d dVar = (com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.d) a2;
                                if (!(dVar == null || (aVar = dVar.f103450a) == null)) {
                                    SharePanelViewModel sharePanelViewModel = this.f103534a.f103523b;
                                    l.d(aVar, "");
                                    com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n nVar = sharePanelViewModel.f103601h;
                                    String uid = aVar.getUid();
                                    if (!TextUtils.isEmpty(uid)) {
                                        nVar.f102428a.edit().putInt("maf_user_show_count_".concat(String.valueOf(uid)), nVar.a(uid) + 1).commit();
                                    }
                                    com.ss.android.ugc.aweme.metrics.u uVar = new com.ss.android.ugc.aweme.metrics.u();
                                    SharePackage sharePackage = sharePanelViewModel.f103597d;
                                    if (sharePackage == null || (bundle = sharePackage.f124595i) == null || (str = bundle.getString("enter_from")) == null) {
                                        str = "";
                                    }
                                    com.ss.android.ugc.aweme.metrics.u a3 = uVar.a(str);
                                    a3.f109596a = u.c.CARD;
                                    com.ss.android.ugc.aweme.metrics.u a4 = a3.a(com.ss.android.ugc.aweme.social.c.b.a(aVar));
                                    a4.f109597b = u.a.SHOW;
                                    a4.o("long_press").f();
                                }
                            } else {
                                this.f103535b = i6;
                                return;
                            }
                        }
                    }
                    this.f103535b = recyclerView.getChildCount();
                }
            }
        };
        a2.d();
        MethodCollector.o(7753);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0028, code lost:
        if (r19 != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00dd  */
    @Override // com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.im.service.model.IMContact r18, boolean r19) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget.a(com.ss.android.ugc.aweme.im.service.model.IMContact, boolean):boolean");
    }
}
