package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;

public final class a extends RecyclerView.ViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static final C2628a f103421c = new C2628a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final h.h f103422a;

    /* renamed from: b  reason: collision with root package name */
    public final SharePanelViewModel f103423b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f103424d;

    /* renamed from: e  reason: collision with root package name */
    private final h.h f103425e;

    /* renamed from: f  reason: collision with root package name */
    private final h.h f103426f;

    /* renamed from: g  reason: collision with root package name */
    private final h.h f103427g;

    /* renamed from: h  reason: collision with root package name */
    private final h.h f103428h;

    static {
        Covode.recordClassIndex(66274);
    }

    public final AvatarImageView a() {
        return (AvatarImageView) this.f103424d.getValue();
    }

    public final AvatarImageView b() {
        return (AvatarImageView) this.f103425e.getValue();
    }

    public final AvatarImageView c() {
        return (AvatarImageView) this.f103426f.getValue();
    }

    public final View d() {
        return (View) this.f103427g.getValue();
    }

    public final View e() {
        return (View) this.f103428h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.a$a  reason: collision with other inner class name */
    public static final class C2628a {
        static {
            Covode.recordClassIndex(66275);
        }

        private C2628a() {
        }

        public /* synthetic */ C2628a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<View> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.$itemView.findViewById(R.id.pg);
        }
    }

    static final class d extends m implements h.f.a.a<View> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ View invoke() {
            return this.$itemView.findViewById(R.id.b3h);
        }
    }

    static final class e extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.$itemView.findViewById(R.id.pf);
        }
    }

    static final class f extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66280);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.$itemView.findViewById(R.id.b3i);
        }
    }

    static final class g extends m implements h.f.a.a<AvatarImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66281);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AvatarImageView invoke() {
            return this.$itemView.findViewById(R.id.dw6);
        }
    }

    static final class h extends m implements h.f.a.a<TextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66282);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TextView invoke() {
            return this.$itemView.findViewById(R.id.csg);
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f103429a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.im.service.model.f f103430b;

        static {
            Covode.recordClassIndex(66277);
        }

        public c(a aVar, com.ss.android.ugc.aweme.im.service.model.f fVar) {
            this.f103429a = aVar;
            this.f103430b = fVar;
        }

        public final void onClick(View view) {
            Bundle bundle;
            ClickAgent.onClick(view);
            SharePanelViewModel sharePanelViewModel = this.f103429a.f103423b;
            com.ss.android.ugc.aweme.im.service.model.f fVar = this.f103430b;
            l.d(fVar, "");
            SharePackage sharePackage = sharePanelViewModel.f103597d;
            if (!(sharePackage == null || (bundle = sharePackage.f124595i) == null)) {
                bundle.putString("batch_share_type", fVar.getBatchGroupType());
            }
            com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.a aVar = sharePanelViewModel.f103598e;
            if (aVar != null) {
                aVar.a(fVar, true);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        l.d(view, "");
        l.d(sharePanelViewModel, "");
        this.f103423b = sharePanelViewModel;
        this.f103424d = i.a(h.m.NONE, new e(view));
        this.f103422a = i.a(h.m.NONE, new h(view));
        this.f103425e = i.a(h.m.NONE, new f(view));
        this.f103426f = i.a(h.m.NONE, new g(view));
        this.f103427g = i.a(h.m.NONE, new d(view));
        this.f103428h = i.a(h.m.NONE, new b(view));
    }
}
