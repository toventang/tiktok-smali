package com.bytedance.android.live.liveinteract.multiguest.opt.b.a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.liveinteract.multiguest.a.f.g;
import com.bytedance.android.live.liveinteract.multiguest.g.a.a;
import com.bytedance.android.live.liveinteract.multiguest.g.a.j;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.l.a;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.android.livesdk.widget.g;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.ArrayList;
import java.util.List;

public final class b extends g implements g.a {
    @com.bytedance.android.live.liveinteract.api.c.d(a = "MULTI_GUEST_DATA_HOLDER")

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.live.liveinteract.multiguest.opt.a.a f11422a;

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.android.live.liveinteract.multiguest.a.a.a f11423b;

    /* renamed from: c  reason: collision with root package name */
    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c f11424c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f11425d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f11426e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView f11427f;

    /* renamed from: g  reason: collision with root package name */
    private View f11428g;

    /* renamed from: h  reason: collision with root package name */
    private final h f11429h;

    /* renamed from: j  reason: collision with root package name */
    private com.bytedance.android.livesdk.l.b f11430j;

    static {
        Covode.recordClassIndex(6156);
    }

    private final com.bytedance.android.livesdk.l.a h() {
        return (com.bytedance.android.livesdk.l.a) this.f11429h.getValue();
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final int b() {
        return R.layout.b75;
    }

    static final class a extends m implements h.f.a.a<com.bytedance.android.livesdk.l.a> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(6157);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.bytedance.android.livesdk.l.a invoke() {
            a.C0382a aVar = new a.C0382a(this.$context);
            aVar.f18266c = false;
            return aVar.a();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.a
    public final void a() {
        i();
        if (isShowing()) {
            dismiss();
        }
    }

    public final com.bytedance.android.live.liveinteract.multiguest.opt.a.a d() {
        com.bytedance.android.live.liveinteract.multiguest.opt.a.a aVar = this.f11422a;
        if (aVar == null) {
            l.a("mDataHolder");
        }
        return aVar;
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f11424c.f11364l = null;
        i();
    }

    private final void i() {
        if (h().isShowing()) {
            h().dismiss();
        }
    }

    public final void dismiss() {
        com.bytedance.android.livesdk.l.b bVar;
        super.dismiss();
        com.bytedance.android.livesdk.l.b bVar2 = this.f11430j;
        if (!(bVar2 == null || !bVar2.isShowing() || (bVar = this.f11430j) == null)) {
            bVar.dismiss();
        }
        i();
    }

    public final void g() {
        if (!h().isShowing()) {
            h().show();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.a
    public final void c() {
        String str;
        Resources resources;
        i();
        TextView textView = this.f11425d;
        if (textView == null) {
            l.a("mActionButton");
        }
        Context context = getContext();
        l.b(context, "");
        textView.setTextColor(context.getResources().getColor(R.color.ws));
        TextView textView2 = this.f11425d;
        if (textView2 == null) {
            l.a("mActionButton");
        }
        textView2.setText(y.a((int) R.string.dwi));
        TextView textView3 = this.f11425d;
        if (textView3 == null) {
            l.a("mActionButton");
        }
        textView3.setBackgroundResource(R.drawable.br3);
        com.bytedance.android.live.liveinteract.multiguest.a.a.a aVar = this.f11423b;
        com.bytedance.android.livesdk.at.f b2 = u.a().b();
        l.b(b2, "");
        aVar.a(b2.c());
        if (this.f11423b.getItemCount() > 0) {
            View view = this.f11428g;
            if (view == null) {
                l.a("mEmptyView");
            }
            view.setVisibility(8);
            RecyclerView recyclerView = this.f11427f;
            if (recyclerView == null) {
                l.a("mRecyclerView");
            }
            recyclerView.setVisibility(0);
        } else {
            View view2 = this.f11428g;
            if (view2 == null) {
                l.a("mEmptyView");
            }
            view2.setVisibility(0);
            RecyclerView recyclerView2 = this.f11427f;
            if (recyclerView2 == null) {
                l.a("mRecyclerView");
            }
            recyclerView2.setVisibility(8);
        }
        TextView textView4 = this.f11426e;
        if (textView4 == null) {
            l.a("mTitleView");
        }
        TextView textView5 = this.f11426e;
        if (textView5 == null) {
            l.a("mTitleView");
        }
        Context context2 = textView5.getContext();
        if (context2 == null || (resources = context2.getResources()) == null || (str = resources.getQuantityString(R.plurals.fm, this.f11423b.getItemCount(), Integer.valueOf(this.f11423b.getItemCount()))) == null) {
            str = "";
        }
        textView4.setText(str);
        if (isShowing()) {
            dismiss();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
        // Method dump skipped, instructions count: 202
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b.e():void");
    }

    public final void f() {
        com.bytedance.android.livesdk.l.b bVar;
        com.bytedance.android.livesdk.l.b bVar2;
        if (this.f22610i) {
            com.bytedance.android.live.liveinteract.api.a.c a2 = com.bytedance.android.live.liveinteract.api.a.c.a();
            l.b(a2, "");
            T t = a2.n;
            if (t != null) {
                if (t.intValue() == 2) {
                    com.bytedance.android.livesdk.l.b bVar3 = this.f11430j;
                    if (!(bVar3 == null || !bVar3.isShowing() || (bVar2 = this.f11430j) == null)) {
                        bVar2.dismiss();
                    }
                    com.bytedance.android.livesdk.l.b a3 = new b.a(getContext()).a(R.string.e08).b(R.string.ei2).a(R.string.e07, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC0224b(this), false).b(R.string.gle, (DialogInterface.OnClickListener) c.f11432a, false).a();
                    this.f11430j = a3;
                    if (a3 != null) {
                        a3.show();
                        return;
                    }
                    return;
                } else if (t.intValue() == 1) {
                    com.bytedance.android.livesdk.l.b bVar4 = this.f11430j;
                    if (!(bVar4 == null || !bVar4.isShowing() || (bVar = this.f11430j) == null)) {
                        bVar.dismiss();
                    }
                    com.bytedance.android.livesdk.l.b a4 = new b.a(getContext()).a(R.string.eqn).b(R.string.eqo).a(R.string.eqm, (DialogInterface.OnClickListener) new d(this), false).b(R.string.ei3, (DialogInterface.OnClickListener) e.f11434a, false).a();
                    this.f11430j = a4;
                    if (a4 != null) {
                        a4.show();
                        return;
                    }
                    return;
                }
            }
            dismiss();
            g.b bVar5 = (g.b) this.f11424c.y;
            if (bVar5 != null) {
                bVar5.a(a.EnumC0216a.SEND_REQUEST);
            }
            this.f11424c.a(0);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11435a;

        static {
            Covode.recordClassIndex(6162);
        }

        f(b bVar) {
            this.f11435a = bVar;
        }

        public final void onClick(View view) {
            this.f11435a.f();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguest.a.f.g.a
    public final void c(Throwable th) {
        i();
        com.bytedance.android.livesdk.utils.f.a(getContext(), th, (int) R.string.grp);
    }

    @Override // com.bytedance.android.livesdk.widget.g
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(R.id.djs);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f11427f = recyclerView;
        if (recyclerView == null) {
            l.a("mRecyclerView");
        }
        recyclerView.a(new j());
        RecyclerView recyclerView2 = this.f11427f;
        if (recyclerView2 == null) {
            l.a("mRecyclerView");
        }
        getContext();
        recyclerView2.setLayoutManager(new SSLinearLayoutManager(0));
        RecyclerView recyclerView3 = this.f11427f;
        if (recyclerView3 == null) {
            l.a("mRecyclerView");
        }
        recyclerView3.setAdapter(this.f11423b);
        View findViewById2 = findViewById(R.id.title);
        l.b(findViewById2, "");
        this.f11426e = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.c4);
        l.b(findViewById3, "");
        this.f11425d = (TextView) findViewById3;
        e();
    }

    /* access modifiers changed from: package-private */
    public static final class c implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final c f11432a = new c();

        static {
            Covode.recordClassIndex(6159);
        }

        c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final e f11434a = new e();

        static {
            Covode.recordClassIndex(6161);
        }

        e() {
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.liveinteract.multiguest.opt.b.a.b$b  reason: collision with other inner class name */
    public static final class DialogInterface$OnClickListenerC0224b implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11431a;

        static {
            Covode.recordClassIndex(6158);
        }

        DialogInterface$OnClickListenerC0224b(b bVar) {
            this.f11431a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f11431a.f11424c.c("leave_normally", false);
            this.f11431a.g();
            com.bytedance.android.live.liveinteract.platform.common.g.g.a("guest_over", this.f11431a.d().q);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d implements DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f11433a;

        static {
            Covode.recordClassIndex(6160);
        }

        d(b bVar) {
            this.f11433a = bVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i2) {
            l.d(dialogInterface, "");
            dialogInterface.dismiss();
            this.f11433a.f11424c.f("leave_source_user_click_cancel");
            this.f11433a.g();
            com.bytedance.android.live.liveinteract.platform.common.g.b.a(this.f11433a.d().q);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context, com.bytedance.android.live.liveinteract.multiguest.opt.a.a.c cVar, List<com.bytedance.android.livesdk.chatroom.model.b.e> list) {
        super(context);
        l.d(context, "");
        l.d(cVar, "");
        l.d(list, "");
        this.f11424c = cVar;
        ArrayList arrayList = new ArrayList();
        for (T t : list) {
            T t2 = t;
            if (t2.f15724e == 1 && t2.f15726g == 2) {
                arrayList.add(t);
            }
        }
        this.f11423b = new com.bytedance.android.live.liveinteract.multiguest.a.a.a(null, arrayList, 1);
        this.f11429h = i.a((h.f.a.a) new a(context));
        this.f11424c.f11364l = this;
        com.bytedance.android.live.liveinteract.api.c.e.f10014a.a(this);
    }
}
