package com.ss.android.ugc.aweme.notification.h;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerify;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.notification.utils.j;
import com.ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.MutualRelationView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class ba extends RecyclerView.ViewHolder implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.follow.widet.a f113613a;

    /* renamed from: b  reason: collision with root package name */
    public User f113614b;

    /* renamed from: c  reason: collision with root package name */
    private final h f113615c;

    /* renamed from: d  reason: collision with root package name */
    private final h f113616d;

    /* renamed from: e  reason: collision with root package name */
    private final h f113617e;

    /* renamed from: f  reason: collision with root package name */
    private final h f113618f;

    /* renamed from: g  reason: collision with root package name */
    private final h f113619g;

    /* renamed from: h  reason: collision with root package name */
    private final h f113620h;

    /* renamed from: i  reason: collision with root package name */
    private final String f113621i = "notification";

    static {
        Covode.recordClassIndex(73037);
    }

    private final ConstraintLayout e() {
        return (ConstraintLayout) this.f113615c.getValue();
    }

    public final AvatarImageWithVerify a() {
        return (AvatarImageWithVerify) this.f113616d.getValue();
    }

    public final TuxTextView b() {
        return (TuxTextView) this.f113617e.getValue();
    }

    public final TuxTextView c() {
        return (TuxTextView) this.f113618f.getValue();
    }

    public final MutualRelationView d() {
        return (MutualRelationView) this.f113619g.getValue();
    }

    static final class a extends m implements h.f.a.a<AvatarImageWithVerify> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageWithVerify invoke() {
            return this.$itemView.findViewById(R.id.cx6);
        }
    }

    static final class b extends m implements h.f.a.a<NotificationFollowUserBtn> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73039);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationFollowUserBtn invoke() {
            return this.$itemView.findViewById(R.id.cx4);
        }
    }

    static final class c extends m implements h.f.a.a<MutualRelationView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73040);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ MutualRelationView invoke() {
            return this.$itemView.findViewById(R.id.crv);
        }
    }

    static final class d extends m implements h.f.a.a<ConstraintLayout> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ConstraintLayout invoke() {
            return this.$itemView.findViewById(R.id.cxx);
        }
    }

    static final class e extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73042);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.cwx);
        }
    }

    static final class f extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(73043);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.cxm);
        }
    }

    private static boolean f() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ba(View view) {
        super(view);
        l.d(view, "");
        this.f113615c = i.a((h.f.a.a) new d(view));
        this.f113616d = i.a((h.f.a.a) new a(view));
        this.f113617e = i.a((h.f.a.a) new f(view));
        this.f113618f = i.a((h.f.a.a) new e(view));
        this.f113619g = i.a((h.f.a.a) new c(view));
        h a2 = i.a((h.f.a.a) new b(view));
        this.f113620h = a2;
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) a2.getValue();
        l.b(notificationFollowUserBtn, "");
        notificationFollowUserBtn.setVisibility(8);
        ConstraintLayout e2 = e();
        l.b(e2, "");
        j.b(e2);
        e().setOnClickListener(this);
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
    public final void onClick(android.view.View r11) {
        /*
        // Method dump skipped, instructions count: 198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.h.ba.onClick(android.view.View):void");
    }
}
