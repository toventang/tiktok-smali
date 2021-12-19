package com.ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notification.LikeListDetailActivity;
import com.ss.android.ugc.aweme.notification.bean.k;
import com.ss.android.ugc.aweme.notification.h.h;
import com.ss.android.ugc.aweme.notification.h.i;
import com.ss.android.ugc.aweme.notification.h.y;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class b extends f<User> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f113141f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public UrlModel f113142a;

    /* renamed from: b  reason: collision with root package name */
    public String f113143b;

    /* renamed from: c  reason: collision with root package name */
    public String f113144c;

    /* renamed from: d  reason: collision with root package name */
    public h.f.a.a<z> f113145d;

    /* renamed from: e  reason: collision with root package name */
    public int f113146e;

    static {
        Covode.recordClassIndex(72742);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(72743);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class c extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f113147a = new c();

        static {
            Covode.recordClassIndex(72745);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    private b() {
        this.f113146e = 0;
        this.f113145d = c.f113147a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.b$b  reason: collision with other inner class name */
    public static final class C2889b extends m implements h.f.a.a<z> {
        final /* synthetic */ List $list;
        final /* synthetic */ int $newTitleOffset;
        final /* synthetic */ List $rawList;
        final /* synthetic */ List $result;
        final /* synthetic */ b this$0;

        static {
            Covode.recordClassIndex(72744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2889b(b bVar, List list, List list2, int i2, List list3) {
            super(0);
            this.this$0 = bVar;
            this.$list = list;
            this.$rawList = list2;
            this.$newTitleOffset = i2;
            this.$result = list3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            int i2 = 0;
            while (this.$rawList.size() + i2 < this.this$0.f113146e + this.$newTitleOffset && i2 < this.$list.size()) {
                this.$result.add(this.$list.get(i2));
                i2++;
            }
            if (i2 < this.$list.size()) {
                this.$result.add(new k(1));
                List list = this.$result;
                List list2 = this.$list;
                list.addAll(list2.subList(i2, list2.size()));
            }
            return z.f158842a;
        }
    }

    public /* synthetic */ b(byte b2) {
        this();
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void c(List<User> list) {
        super.c(a(list, true));
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<User> list) {
        List<User> a2 = a(list, false);
        a2.add(0, new com.ss.android.ugc.aweme.notification.h.f());
        super.b_(a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        if (e().get(i2) instanceof com.ss.android.ugc.aweme.notification.h.f) {
            return 15;
        }
        if (e().get(i2) instanceof k) {
            return 14;
        }
        return super.c(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        LikeListDetailActivity likeListDetailActivity = null;
        if (!(viewHolder instanceof i)) {
            viewHolder = null;
        }
        i iVar = (i) viewHolder;
        if (iVar != null) {
            View view = iVar.itemView;
            l.b(view, "");
            Context context = view.getContext();
            if (context instanceof LikeListDetailActivity) {
                likeListDetailActivity = context;
            }
            LikeListDetailActivity likeListDetailActivity2 = likeListDetailActivity;
            if (likeListDetailActivity2 != null) {
                likeListDetailActivity2.a(iVar.getAdapterPosition(), "show", iVar.f113631b);
            }
        }
        j.b();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        int c2 = androidx.core.content.b.c(viewGroup.getContext(), R.color.c5);
        f(c2);
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        Context context = viewGroup.getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c2);
        tuxTextView.setText(R.string.cfo);
        Context context2 = viewGroup.getContext();
        l.b(context2, "");
        TuxTextView tuxTextView2 = new TuxTextView(context2, null, 0, 6);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColor(c2);
        tuxTextView2.setText(R.string.cgj);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.c().b(tuxTextView2));
        l.b(a_, "");
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 == 14) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ld, viewGroup, false);
            l.b(a2, "");
            return new y(a2);
        } else if (i2 != 15) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ku, viewGroup, false);
            l.b(a3, "");
            return new i(a3);
        } else {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.k_, viewGroup, false);
            l.b(a4, "");
            return new h(a4, this.f113142a, this.f113143b, this.f113144c, this.f113145d);
        }
    }

    private final List<User> a(List<User> list, boolean z) {
        int i2;
        boolean z2;
        if (this.f113146e == 0) {
            if (list == null) {
                return new ArrayList();
            }
            return list;
        } else if (list == null || list.isEmpty()) {
            return new ArrayList();
        } else {
            List e2 = e();
            if (e2 == null) {
                e2 = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            Iterator a2 = n.t(e2).a();
            while (true) {
                if (!a2.hasNext()) {
                    i2 = 0;
                    break;
                }
                User user = (User) a2.next();
                if ((user instanceof k) && ((k) user).getType() == 0) {
                    i2 = 1;
                    break;
                }
            }
            Iterator a3 = n.t(e2).a();
            while (true) {
                if (!a3.hasNext()) {
                    z2 = false;
                    break;
                }
                User user2 = (User) a3.next();
                if ((user2 instanceof k) && ((k) user2).getType() == 1) {
                    z2 = true;
                    break;
                }
            }
            C2889b bVar = new C2889b(this, list, e2, i2, arrayList);
            if (!z) {
                if (i2 == 0) {
                    arrayList.add(new k(0));
                }
                bVar.invoke();
            } else if (i2 != 0) {
                if (z2 || e2.size() + list.size() < this.f113146e + i2) {
                    arrayList.addAll(list);
                    return arrayList;
                }
                bVar.invoke();
            }
            return arrayList;
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
    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
        // Method dump skipped, instructions count: 305
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.adapter.b.a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
