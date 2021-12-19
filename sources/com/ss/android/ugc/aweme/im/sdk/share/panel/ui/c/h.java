package com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AnimationImageView;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import com.zhiliaoapp.musically.R;
import h.a.i;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.Set;

public final class h extends RecyclerView.ViewHolder {

    /* renamed from: b  reason: collision with root package name */
    public static final a f103491b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SharePanelViewModel f103492a;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f103493c;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f103494d;

    static {
        Covode.recordClassIndex(66313);
    }

    public final AnimationImageView a() {
        return (AnimationImageView) this.f103493c.getValue();
    }

    public final TuxTextView b() {
        return (TuxTextView) this.f103494d.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(66314);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<AnimationImageView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66315);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimationImageView invoke() {
            return this.$itemView.findViewById(R.id.fci);
        }
    }

    static final class d extends m implements h.f.a.a<TuxTextView> {
        final /* synthetic */ View $itemView;

        static {
            Covode.recordClassIndex(66318);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(View view) {
            super(0);
            this.$itemView = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxTextView invoke() {
            return this.$itemView.findViewById(R.id.fcj);
        }
    }

    public static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f103495a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ IMContact f103496b;

        static {
            Covode.recordClassIndex(66316);
        }

        public c(h hVar, IMContact iMContact) {
            this.f103495a = hVar;
            this.f103496b = iMContact;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SharePackage sharePackage = this.f103495a.f103492a.f103597d;
            if (sharePackage != null) {
                l.b(view, "");
                Context context = view.getContext();
                l.b(context, "");
                sharePackage.a(context, (com.ss.android.ugc.aweme.sharer.b) null, new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.aweme.im.sdk.share.panel.ui.c.h.c.AnonymousClass1 */
                    final /* synthetic */ c this$0;

                    static {
                        Covode.recordClassIndex(66317);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f103495a.f103492a.a(this.this$0.f103496b, true);
                        return z.f158842a;
                    }
                });
                return;
            }
            this.f103495a.f103492a.a(this.f103496b, true);
        }
    }

    public final boolean a(int i2) {
        boolean a2 = i.a(new Integer[]{1, 3}, Integer.valueOf(i2));
        Set<IMContact> b2 = this.f103492a.b();
        if ((b2 == null || b2.isEmpty()) && !a2) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(View view, SharePanelViewModel sharePanelViewModel) {
        super(view);
        l.d(view, "");
        l.d(sharePanelViewModel, "");
        this.f103492a = sharePanelViewModel;
        this.f103493c = h.i.a((h.f.a.a) new b(view));
        this.f103494d = h.i.a((h.f.a.a) new d(view));
    }
}
