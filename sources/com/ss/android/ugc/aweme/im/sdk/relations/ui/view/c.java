package com.ss.android.ugc.aweme.im.sdk.relations.ui.view;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.b;
import com.bytedance.ies.im.core.api.b.g;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TextContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService;
import com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a;
import com.ss.android.ugc.aweme.im.sdk.share.b.b.a;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.List;

public class c implements View.OnTouchListener {
    public static final a u = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    private TextWatcher f103319a;

    /* renamed from: b  reason: collision with root package name */
    private View.OnClickListener f103320b;

    /* renamed from: c  reason: collision with root package name */
    private a.AbstractC2618a f103321c;

    /* renamed from: g  reason: collision with root package name */
    public SharePackage f103322g;

    /* renamed from: h  reason: collision with root package name */
    public BaseContent f103323h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f103324i;

    /* renamed from: j  reason: collision with root package name */
    protected EditText f103325j;

    /* renamed from: k  reason: collision with root package name */
    protected ImageView f103326k;

    /* renamed from: l  reason: collision with root package name */
    protected TuxStatusView f103327l;

    /* renamed from: m  reason: collision with root package name */
    protected RecyclerView f103328m;
    protected ImTextTitleBar n;
    public com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a o;
    public String p;
    public String q = "";
    public b r;
    public final Activity s;
    public final View t;

    public interface b {
        static {
            Covode.recordClassIndex(66212);
        }

        void a();

        void a(String str);
    }

    static {
        Covode.recordClassIndex(66210);
    }

    public void a(List<Integer> list, List<String> list2) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66211);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public void a(List<? extends IMContact> list) {
        h.f.b.l.d(list, "");
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f.a(this.s)) {
            this.f103324i = false;
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
            if (aVar != null) {
                aVar.a((List<IMContact>) list);
            }
            c();
        }
    }

    public void a(List<? extends IMContact> list, CharSequence charSequence) {
        h.f.b.l.d(list, "");
        h.f.b.l.d(charSequence, "");
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f.a(this.s)) {
            this.f103324i = true;
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
            if (aVar == null) {
                h.f.b.l.b();
            }
            aVar.a((List<IMContact>) list, charSequence);
            c();
        }
    }

    public final boolean a(IMContact iMContact) {
        if (iMContact instanceof IMConversation) {
            return true;
        }
        IMUser a2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.f.a(iMContact);
        if (a2 == null) {
            return false;
        }
        if (!TextUtils.equals(a2.getUid(), com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b()) && a2.getFollowStatus() != 2) {
            SharePackage sharePackage = this.f103322g;
            if (sharePackage == null) {
                h.f.b.l.b();
            }
            int i2 = sharePackage.f124595i.getInt("aweme_type");
            SharePackage sharePackage2 = this.f103322g;
            if (sharePackage2 == null) {
                h.f.b.l.b();
            }
            if (TextUtils.equals(sharePackage2.f124590d, "pic")) {
                RecyclerView recyclerView = this.f103328m;
                if (recyclerView == null) {
                    h.f.b.l.a("mRecyclerView");
                }
                new com.bytedance.tux.g.b(recyclerView).e(R.string.cgo).b();
                return false;
            }
            SharePackage sharePackage3 = this.f103322g;
            if (sharePackage3 == null) {
                h.f.b.l.b();
            }
            if (TextUtils.equals(sharePackage3.f124590d, "gif") && (i2 == 501 || i2 == 502)) {
                RecyclerView recyclerView2 = this.f103328m;
                if (recyclerView2 == null) {
                    h.f.b.l.a("mRecyclerView");
                }
                new com.bytedance.tux.g.b(recyclerView2).e(R.string.cem).b();
                return false;
            }
        }
        return true;
    }

    public static final class j implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103341a;

        static final class b implements a.AbstractC2624a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f103343a = new b();

            static {
                Covode.recordClassIndex(66227);
            }

            b() {
            }

            @Override // com.ss.android.ugc.aweme.im.sdk.share.b.b.a.AbstractC2624a
            public final void a(String str) {
            }
        }

        static {
            Covode.recordClassIndex(66225);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            this.f103341a.k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        j(c cVar) {
            this.f103341a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int i2) {
            IMContact[] iMContactArr;
            if (this.f103341a.o != null) {
                com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.f103341a.o;
                if (aVar == null) {
                    h.f.b.l.b();
                }
                if (aVar.f103178f.size() > 0) {
                    Activity activity = this.f103341a.s;
                    SharePackage sharePackage = this.f103341a.f103322g;
                    com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar2 = this.f103341a.o;
                    if (aVar2 != null) {
                        iMContactArr = aVar2.a();
                    } else {
                        iMContactArr = null;
                    }
                    com.ss.android.ugc.aweme.im.sdk.share.b.b.a.a(activity, sharePackage, iMContactArr, this.f103341a.p, new a(this), b.f103343a);
                }
            }
        }

        static final class a implements a.AbstractC2624a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ j f103342a;

            static {
                Covode.recordClassIndex(66226);
            }

            a(j jVar) {
                this.f103342a = jVar;
            }

            /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
                java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3
                	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
                	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
                	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
                	at java.base/java.util.Objects.checkIndex(Objects.java:359)
                	at java.base/java.util.ArrayList.get(ArrayList.java:427)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
                	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
                */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x0044  */
            /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
            /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            @Override // com.ss.android.ugc.aweme.im.sdk.share.b.b.a.AbstractC2624a
            public final void a(java.lang.String r7) {
                /*
                // Method dump skipped, instructions count: 132
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c.j.a.a(java.lang.String):void");
            }
        }
    }

    public final void g() {
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c$c  reason: collision with other inner class name */
    public static final class RunnableC2622c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103329a;

        static {
            Covode.recordClassIndex(66213);
        }

        RunnableC2622c(c cVar) {
            this.f103329a = cVar;
        }

        public final void run() {
            b bVar = this.f103329a.r;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final EditText d() {
        EditText editText = this.f103325j;
        if (editText == null) {
            h.f.b.l.a("mSearchEt");
        }
        return editText;
    }

    /* access modifiers changed from: protected */
    public final ImageView e() {
        ImageView imageView = this.f103326k;
        if (imageView == null) {
            h.f.b.l.a("mBtnClear");
        }
        return imageView;
    }

    /* access modifiers changed from: protected */
    public final RecyclerView f() {
        RecyclerView recyclerView = this.f103328m;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        return recyclerView;
    }

    public final void l() {
        ImageView imageView = this.f103326k;
        if (imageView == null) {
            h.f.b.l.a("mBtnClear");
        }
        imageView.performClick();
    }

    public static final class d implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103330a;

        static {
            Covode.recordClassIndex(66214);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int i2) {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            com.ss.android.ugc.aweme.common.f.e.a(this.f103330a.s, this.f103330a.d());
            this.f103330a.s.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(c cVar) {
            this.f103330a = cVar;
        }
    }

    public static final class k implements ImTextTitleBar.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103344a;

        static {
            Covode.recordClassIndex(66228);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void c() {
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a() {
            com.ss.android.ugc.aweme.common.f.e.a(this.f103344a.s, this.f103344a.d());
            this.f103344a.s.finish();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        k(c cVar) {
            this.f103344a = cVar;
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ImTextTitleBar.a
        public final void a(int i2) {
            androidx.c.a aVar = new androidx.c.a();
            aVar.put("enter_from", "contact_list");
            aVar.put("enter_method", "click_multi_choose_button");
            r.a("enter_multi_choose_contact", aVar);
            this.f103344a.j();
        }
    }

    public final void m() {
        TextWatcher textWatcher = this.f103319a;
        if (textWatcher != null) {
            EditText editText = this.f103325j;
            if (editText == null) {
                h.f.b.l.a("mSearchEt");
            }
            editText.removeTextChangedListener(textWatcher);
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        boolean z;
        IImplService d2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.d();
        if (this.f103322g != null) {
            z = true;
        } else {
            z = false;
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a relationListAdapter = d2.getRelationListAdapter(z);
        this.o = relationListAdapter;
        if (relationListAdapter != null) {
            relationListAdapter.f103182j = new RunnableC2622c(this);
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar != null) {
            aVar.f103183k = this.f103321c;
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar2 = this.o;
        if (aVar2 != null) {
            aVar2.f103174b = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.h.a(this.f103322g);
        }
        RecyclerView recyclerView = this.f103328m;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView.setAdapter(this.o);
    }

    public final void i() {
        if (this.n != null) {
            if (this.f103322g != null) {
                b();
            }
            if (this.f103322g == null) {
                ImTextTitleBar imTextTitleBar = this.n;
                if (imTextTitleBar == null) {
                    h.f.b.l.a("titleBar");
                }
                imTextTitleBar.setTitle(R.string.chz);
                ImTextTitleBar imTextTitleBar2 = this.n;
                if (imTextTitleBar2 == null) {
                    h.f.b.l.a("titleBar");
                }
                View rightView = imTextTitleBar2.getRightView();
                h.f.b.l.b(rightView, "");
                rightView.setVisibility(8);
                ImTextTitleBar imTextTitleBar3 = this.n;
                if (imTextTitleBar3 == null) {
                    h.f.b.l.a("titleBar");
                }
                imTextTitleBar3.setLeftText(R.string.cdr);
                return;
            }
            ImTextTitleBar imTextTitleBar4 = this.n;
            if (imTextTitleBar4 == null) {
                h.f.b.l.a("titleBar");
            }
            imTextTitleBar4.setTitle(R.string.ci0);
            ImTextTitleBar imTextTitleBar5 = this.n;
            if (imTextTitleBar5 == null) {
                h.f.b.l.a("titleBar");
            }
            View rightView2 = imTextTitleBar5.getRightView();
            h.f.b.l.b(rightView2, "");
            rightView2.setVisibility(0);
            k();
        }
    }

    public void a() {
        View findViewById = this.t.findViewById(R.id.em8);
        h.f.b.l.b(findViewById, "");
        this.n = (ImTextTitleBar) findViewById;
        View findViewById2 = this.t.findViewById(R.id.e_o);
        h.f.b.l.b(findViewById2, "");
        this.f103327l = (TuxStatusView) findViewById2;
        View findViewById3 = this.t.findViewById(R.id.dur);
        h.f.b.l.b(findViewById3, "");
        EditText editText = (EditText) findViewById3;
        this.f103325j = editText;
        if (editText == null) {
            h.f.b.l.a("mSearchEt");
        }
        editText.setTag("relation_search_tag");
        EditText editText2 = this.f103325j;
        if (editText2 == null) {
            h.f.b.l.a("mSearchEt");
        }
        editText2.setHint(R.string.cag);
        View findViewById4 = this.t.findViewById(R.id.y0);
        h.f.b.l.b(findViewById4, "");
        this.f103326k = (ImageView) findViewById4;
        View findViewById5 = this.t.findViewById(R.id.djh);
        h.f.b.l.b(findViewById5, "");
        RecyclerView recyclerView = (RecyclerView) findViewById5;
        this.f103328m = recyclerView;
        if (recyclerView == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = this.f103328m;
        if (recyclerView2 == null) {
            h.f.b.l.a("mRecyclerView");
        }
        recyclerView2.a(new f(this, this.s));
    }

    /* access modifiers changed from: protected */
    public void c() {
        TuxStatusView tuxStatusView = this.f103327l;
        if (tuxStatusView == null) {
            h.f.b.l.a("mStatusView");
        }
        tuxStatusView.setVisibility(8);
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar == null || aVar.getItemCount() != 0) {
            TuxStatusView tuxStatusView2 = this.f103327l;
            if (tuxStatusView2 == null) {
                h.f.b.l.a("mStatusView");
            }
            tuxStatusView2.setVisibility(8);
            return;
        }
        if (this.f103324i) {
            TuxStatusView.c b2 = com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c());
            TuxStatusView tuxStatusView3 = this.f103327l;
            if (tuxStatusView3 == null) {
                h.f.b.l.a("mStatusView");
            }
            tuxStatusView3.setStatus(b2);
        } else {
            TuxStatusView.c a2 = new TuxStatusView.c().a(com.bytedance.tux.c.c.a(l.f103345a));
            String string = this.s.getString(R.string.chb);
            h.f.b.l.b(string, "");
            TuxStatusView.c a3 = a2.a(string);
            String string2 = this.s.getString(R.string.cha);
            h.f.b.l.b(string2, "");
            TuxStatusView.c a4 = a3.a((CharSequence) string2);
            TuxStatusView tuxStatusView4 = this.f103327l;
            if (tuxStatusView4 == null) {
                h.f.b.l.a("mStatusView");
            }
            tuxStatusView4.setStatus(a4);
        }
        TuxStatusView tuxStatusView5 = this.f103327l;
        if (tuxStatusView5 == null) {
            h.f.b.l.a("mStatusView");
        }
        tuxStatusView5.setVisibility(0);
    }

    public final void h() {
        int i2;
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar != null) {
            i2 = aVar.f103178f.size();
        } else {
            i2 = 0;
        }
        if (i2 > 0) {
            ImTextTitleBar imTextTitleBar = this.n;
            if (imTextTitleBar == null) {
                h.f.b.l.a("titleBar");
            }
            StringBuilder append = new StringBuilder().append(this.s.getString(R.string.cer)).append("(");
            com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar2 = this.o;
            if (aVar2 == null) {
                h.f.b.l.b();
            }
            imTextTitleBar.setRightText(append.append(aVar2.f103178f.size()).append(")").toString());
            ImTextTitleBar imTextTitleBar2 = this.n;
            if (imTextTitleBar2 == null) {
                h.f.b.l.a("titleBar");
            }
            View rightView = imTextTitleBar2.getRightView();
            h.f.b.l.b(rightView, "");
            rightView.setEnabled(true);
            ImTextTitleBar imTextTitleBar3 = this.n;
            if (imTextTitleBar3 == null) {
                h.f.b.l.a("titleBar");
            }
            TextView rightTexView = imTextTitleBar3.getRightTexView();
            h.f.b.l.b(rightTexView, "");
            TextPaint paint = rightTexView.getPaint();
            h.f.b.l.b(paint, "");
            paint.setFakeBoldText(true);
            ImTextTitleBar imTextTitleBar4 = this.n;
            if (imTextTitleBar4 == null) {
                h.f.b.l.a("titleBar");
            }
            imTextTitleBar4.setRightTextColor(this.s.getResources().getColor(R.color.bh));
            return;
        }
        ImTextTitleBar imTextTitleBar5 = this.n;
        if (imTextTitleBar5 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar5.setRightText(R.string.cer);
        ImTextTitleBar imTextTitleBar6 = this.n;
        if (imTextTitleBar6 == null) {
            h.f.b.l.a("titleBar");
        }
        View rightView2 = imTextTitleBar6.getRightView();
        h.f.b.l.b(rightView2, "");
        rightView2.setEnabled(false);
        ImTextTitleBar imTextTitleBar7 = this.n;
        if (imTextTitleBar7 == null) {
            h.f.b.l.a("titleBar");
        }
        TextView rightTexView2 = imTextTitleBar7.getRightTexView();
        h.f.b.l.b(rightTexView2, "");
        TextPaint paint2 = rightTexView2.getPaint();
        h.f.b.l.b(paint2, "");
        paint2.setFakeBoldText(false);
        ImTextTitleBar imTextTitleBar8 = this.n;
        if (imTextTitleBar8 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar8.setRightTextColor(this.s.getResources().getColor(R.color.ap));
    }

    public final void j() {
        ImTextTitleBar imTextTitleBar = this.n;
        if (imTextTitleBar == null) {
            h.f.b.l.a("titleBar");
        }
        TextView rightTexView = imTextTitleBar.getRightTexView();
        h.f.b.l.b(rightTexView, "");
        TextPaint paint = rightTexView.getPaint();
        h.f.b.l.b(paint, "");
        paint.setFakeBoldText(false);
        ImTextTitleBar imTextTitleBar2 = this.n;
        if (imTextTitleBar2 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar2.setLeftText(R.string.a9e);
        ImTextTitleBar imTextTitleBar3 = this.n;
        if (imTextTitleBar3 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar3.setRightText(R.string.cer);
        ImTextTitleBar imTextTitleBar4 = this.n;
        if (imTextTitleBar4 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar4.setTitle(R.string.chy);
        ImTextTitleBar imTextTitleBar5 = this.n;
        if (imTextTitleBar5 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar5.setRightTextColor(this.s.getResources().getColor(R.color.ap));
        ImTextTitleBar imTextTitleBar6 = this.n;
        if (imTextTitleBar6 == null) {
            h.f.b.l.a("titleBar");
        }
        View rightView = imTextTitleBar6.getRightView();
        h.f.b.l.b(rightView, "");
        rightView.setEnabled(false);
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar != null) {
            aVar.a(true);
        }
        ImTextTitleBar imTextTitleBar7 = this.n;
        if (imTextTitleBar7 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar7.setOnTitlebarClickListener(new j(this));
    }

    public final void k() {
        ImTextTitleBar imTextTitleBar = this.n;
        if (imTextTitleBar == null) {
            h.f.b.l.a("titleBar");
        }
        TextView rightTexView = imTextTitleBar.getRightTexView();
        h.f.b.l.b(rightTexView, "");
        TextPaint paint = rightTexView.getPaint();
        h.f.b.l.b(paint, "");
        paint.setFakeBoldText(false);
        ImTextTitleBar imTextTitleBar2 = this.n;
        if (imTextTitleBar2 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar2.setLeftText(R.string.cdr);
        ImTextTitleBar imTextTitleBar3 = this.n;
        if (imTextTitleBar3 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar3.setTitle(R.string.ci0);
        ImTextTitleBar imTextTitleBar4 = this.n;
        if (imTextTitleBar4 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar4.setRightText(R.string.chx);
        ImTextTitleBar imTextTitleBar5 = this.n;
        if (imTextTitleBar5 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar5.setRightTextColor(this.s.getResources().getColor(R.color.bx));
        ImTextTitleBar imTextTitleBar6 = this.n;
        if (imTextTitleBar6 == null) {
            h.f.b.l.a("titleBar");
        }
        View rightView = imTextTitleBar6.getRightView();
        h.f.b.l.b(rightView, "");
        rightView.setEnabled(true);
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar != null) {
            aVar.a(false);
        }
        ImTextTitleBar imTextTitleBar7 = this.n;
        if (imTextTitleBar7 == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar7.setOnTitlebarClickListener(new k(this));
    }

    public static final class i implements TextWatcher {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103340a;

        static {
            Covode.recordClassIndex(66224);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        i(c cVar) {
            this.f103340a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            h.f.b.l.d(editable, "");
            String obj = editable.toString();
            b bVar = this.f103340a.r;
            if (bVar != null) {
                bVar.a(obj);
            }
        }

        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            h.f.b.l.d(charSequence, "");
            if (!TextUtils.isEmpty(charSequence) && this.f103340a.e().getVisibility() == 8) {
                this.f103340a.e().setVisibility(0);
            } else if (TextUtils.isEmpty(charSequence) && this.f103340a.e().getVisibility() == 0) {
                this.f103340a.e().setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(EditText editText) {
        h.f.b.l.d(editText, "");
        this.f103325j = editText;
    }

    /* access modifiers changed from: protected */
    public final void a(ImageView imageView) {
        h.f.b.l.d(imageView, "");
        this.f103326k = imageView;
    }

    /* access modifiers changed from: package-private */
    public static final class l extends m implements h.f.a.b<com.bytedance.tux.c.a, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final l f103345a = new l();

        static {
            Covode.recordClassIndex(66229);
        }

        l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.a aVar) {
            com.bytedance.tux.c.a aVar2 = aVar;
            h.f.b.l.d(aVar2, "");
            aVar2.f44749a = R.raw.icon_large_person;
            aVar2.f44753e = Integer.valueOf((int) R.attr.bd);
            return z.f158842a;
        }
    }

    static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103333a;

        static {
            Covode.recordClassIndex(66217);
        }

        g(c cVar) {
            this.f103333a = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.b.l.b(view, "");
            if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f.a(view.getContext()) && h.f.b.l.a(view, this.f103333a.e())) {
                this.f103333a.d().setText("");
                this.f103333a.d().clearFocus();
                com.ss.android.ugc.aweme.common.f.e.a(this.f103333a.s, this.f103333a.d());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(RecyclerView recyclerView) {
        h.f.b.l.d(recyclerView, "");
        this.f103328m = recyclerView;
    }

    /* access modifiers changed from: protected */
    public final void a(TuxStatusView tuxStatusView) {
        h.f.b.l.d(tuxStatusView, "");
        this.f103327l = tuxStatusView;
    }

    public final void b(IMContact iMContact) {
        String str;
        if (this.f103323h == null) {
            str = "chat_list";
        } else {
            str = "chat_forward";
        }
        com.ss.android.ugc.aweme.im.sdk.relations.a.a.a(com.ss.android.ugc.aweme.im.sdk.relations.a.a.f102956a, this.f103322g, iMContact, false, str, 0, null, null, 112);
        if (iMContact instanceof IMUser) {
            String uid = ((IMUser) iMContact).getUid();
            Long valueOf = Long.valueOf(uid);
            h.f.b.l.b(valueOf, "");
            String a2 = b.a.a(valueOf.longValue());
            h.f.b.l.b(uid, "");
            a(a2, uid);
        } else if (iMContact instanceof IMConversation) {
            String conversationId = ((IMConversation) iMContact).getConversationId();
            h.f.b.l.b(conversationId, "");
            a(conversationId, "");
        }
    }

    /* access modifiers changed from: protected */
    public final void a(ImTextTitleBar imTextTitleBar) {
        h.f.b.l.d(imTextTitleBar, "");
        this.n = imTextTitleBar;
    }

    public static final class f extends com.ss.android.ugc.aweme.framework.b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103332a;

        static {
            Covode.recordClassIndex(66216);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(c cVar, Context context) {
            super(context);
            this.f103332a = cVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n, com.ss.android.ugc.aweme.framework.b.a
        public final void a(RecyclerView recyclerView, int i2) {
            h.f.b.l.d(recyclerView, "");
            super.a(recyclerView, i2);
            com.ss.android.ugc.aweme.common.f.e.a(this.f103332a.s, this.f103332a.d());
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 4 out of bounds for length 4
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
        	at java.base/java.util.Objects.checkIndex(Objects.java:359)
        	at java.base/java.util.ArrayList.get(ArrayList.java:427)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
        	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
        */
    private final void a(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent r0 = r2.f103323h
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r0.generateSharePackage()
            java.lang.String r0 = r0.f124590d
            java.lang.String r1 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t.a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x001f
            java.lang.CharSequence r0 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.b()
            java.lang.String r0 = r0.toString()
            com.ss.android.ugc.aweme.im.sdk.share.a.a.a(r1, r3, r4, r0)
        L_0x001f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c.a(java.lang.String, java.lang.String):void");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        h.f.b.l.d(view, "");
        h.f.b.l.d(motionEvent, "");
        EditText editText = this.f103325j;
        if (editText == null) {
            h.f.b.l.a("mSearchEt");
        }
        if (!h.f.b.l.a(view, editText) || motionEvent.getAction() != 1) {
            return false;
        }
        if (this.f103323h != null) {
            str = "forward";
        } else if (this.f103322g != null) {
            str = "share";
        } else {
            str = "contact";
        }
        com.ss.android.ugc.aweme.im.sdk.common.controller.b.b.b(str);
        return false;
    }

    static final class h implements a.AbstractC2618a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103334a;

        static {
            Covode.recordClassIndex(66218);
        }

        h(c cVar) {
            this.f103334a = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:51:0x0102  */
        /* JADX WARNING: Removed duplicated region for block: B:53:0x0107  */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.AbstractC2618a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.view.View r11, int r12) {
            /*
            // Method dump skipped, instructions count: 354
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.view.c.h.a(android.view.View, int):void");
        }
    }

    public final void a(IMContact iMContact, boolean z) {
        String str;
        String str2;
        Bundle bundle;
        String string;
        Bundle bundle2;
        SharePackage sharePackage = this.f103322g;
        String str3 = null;
        if (sharePackage != null) {
            str = sharePackage.f124590d;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, "game")) {
            new com.bytedance.tux.g.b(this.s).e(R.string.ci6).b();
            return;
        }
        SharePackage sharePackage2 = this.f103322g;
        if (sharePackage2 != null) {
            str3 = sharePackage2.f124590d;
        }
        SharePackage sharePackage3 = this.f103322g;
        String str4 = "";
        if (sharePackage3 == null || (bundle2 = sharePackage3.f124595i) == null || (str2 = bundle2.getString("enter_from")) == null) {
            str2 = str4;
        }
        SharePackage sharePackage4 = this.f103322g;
        if (!(sharePackage4 == null || (bundle = sharePackage4.f124595i) == null || (string = bundle.getString("enter_method")) == null)) {
            str4 = string;
        }
        com.ss.android.ugc.d.a.c.a(new com.ss.android.ugc.aweme.im.service.model.j(iMContact, z, str3, str2, str4, this.q));
    }

    public final void a(String str, BaseContent baseContent) {
        h.f.b.l.d(baseContent, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.Companion.obtain(str));
        }
        com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a aVar = this.o;
        if (aVar != null) {
            IMContact[] a2 = aVar.a();
            boolean z = false;
            if (!(a2 == null || a2.length == 0)) {
                for (String str2 : com.ss.android.ugc.aweme.im.sdk.common.controller.e.e.a(a2)) {
                    com.ss.android.ugc.aweme.im.sdk.chat.feature.story.b.a(str2, "");
                    g.a.a().b(str2).a(arrayList).a();
                }
                IMContact iMContact = a2[0];
                if (a2.length > 1) {
                    z = true;
                }
                a(iMContact, z);
            }
        }
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.f.a(this.s)) {
            this.s.finish();
        }
    }

    static final class e implements View.OnKeyListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f103331a;

        static {
            Covode.recordClassIndex(66215);
        }

        e(c cVar) {
            this.f103331a = cVar;
        }

        public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
            if (i2 != 66) {
                return false;
            }
            com.ss.android.ugc.aweme.common.f.e.a(this.f103331a.s, this.f103331a.d());
            return true;
        }
    }

    public c(Activity activity, View view, boolean z) {
        h.f.b.l.d(activity, "");
        h.f.b.l.d(view, "");
        this.s = activity;
        this.t = view;
        a();
        if (this.f103320b == null) {
            this.f103320b = new g(this);
        }
        if (this.f103319a == null) {
            this.f103319a = new i(this);
        }
        if (this.f103321c == null) {
            this.f103321c = new h(this);
        }
        ImTextTitleBar imTextTitleBar = this.n;
        if (imTextTitleBar == null) {
            h.f.b.l.a("titleBar");
        }
        imTextTitleBar.setOnTitlebarClickListener(new d(this));
        ImageView imageView = this.f103326k;
        if (imageView == null) {
            h.f.b.l.a("mBtnClear");
        }
        imageView.setOnClickListener(this.f103320b);
        EditText editText = this.f103325j;
        if (editText == null) {
            h.f.b.l.a("mSearchEt");
        }
        editText.addTextChangedListener(this.f103319a);
        EditText editText2 = this.f103325j;
        if (editText2 == null) {
            h.f.b.l.a("mSearchEt");
        }
        editText2.setOnKeyListener(new e(this));
        EditText editText3 = this.f103325j;
        if (editText3 == null) {
            h.f.b.l.a("mSearchEt");
        }
        editText3.setOnTouchListener(this);
        b();
        if (z) {
            ImTextTitleBar imTextTitleBar2 = this.n;
            if (imTextTitleBar2 == null) {
                h.f.b.l.a("titleBar");
            }
            imTextTitleBar2.setVisibility(8);
        }
    }
}
