package com.ss.android.ugc.aweme.comment.supporterpanel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.views.MultiAvatarView;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.z;
import java.util.List;

public final class k extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public g f72426a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super a, z> f72427b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f72428c = h.a.z.INSTANCE;

    /* renamed from: d  reason: collision with root package name */
    private final int f72429d = 4;

    static {
        Covode.recordClassIndex(44650);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return i2 == 0 ? 1 : 0;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (this.f72426a == null) {
            return this.f72428c.size();
        }
        return this.f72428c.size() + 1;
    }

    public final void a(List<a> list) {
        l.d(list, "");
        this.f72428c = list;
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f72442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f72443b;

        static {
            Covode.recordClassIndex(44652);
        }

        b(k kVar, a aVar) {
            this.f72442a = kVar;
            this.f72443b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f72443b;
            if (aVar == null) {
                l.b();
            }
            aVar.a("gift");
            h.f.a.b<? super a, z> bVar = this.f72442a.f72427b;
            if (bVar != null) {
                bVar.invoke(this.f72443b);
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f72444a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f72445b;

        static {
            Covode.recordClassIndex(44653);
        }

        c(k kVar, a aVar) {
            this.f72444a = kVar;
            this.f72445b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f72445b;
            if (aVar == null) {
                l.b();
            }
            aVar.a("gift");
            h.f.a.b<? super a, z> bVar = this.f72444a.f72427b;
            if (bVar != null) {
                bVar.invoke(this.f72445b);
            }
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f72446a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f72447b;

        static {
            Covode.recordClassIndex(44654);
        }

        d(k kVar, a aVar) {
            this.f72446a = kVar;
            this.f72447b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            a aVar = this.f72447b;
            if (aVar == null) {
                l.b();
            }
            aVar.a("avatar");
            h.f.a.b<? super a, z> bVar = this.f72446a.f72427b;
            if (bVar != null) {
                bVar.invoke(this.f72447b);
            }
        }
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final SmartAvatarImageView f72430a;

        /* renamed from: b  reason: collision with root package name */
        public final MultiAvatarView f72431b;

        /* renamed from: c  reason: collision with root package name */
        public final NiceWidthTextView f72432c;

        /* renamed from: d  reason: collision with root package name */
        public final TuxTextView f72433d;

        /* renamed from: e  reason: collision with root package name */
        public final ConstraintLayout f72434e;

        /* renamed from: f  reason: collision with root package name */
        public final AvatarImageView f72435f;

        /* renamed from: g  reason: collision with root package name */
        public final AvatarImageView f72436g;

        /* renamed from: h  reason: collision with root package name */
        public final AvatarImageView f72437h;

        /* renamed from: i  reason: collision with root package name */
        public final SmartAvatarImageView f72438i;

        /* renamed from: j  reason: collision with root package name */
        public final TuxTextView f72439j;

        /* renamed from: k  reason: collision with root package name */
        public final TuxTextView f72440k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ k f72441l;

        static {
            Covode.recordClassIndex(44651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(k kVar, View view) {
            super(view);
            l.d(view, "");
            this.f72441l = kVar;
            this.f72430a = (SmartAvatarImageView) view.findViewById(R.id.d8_);
            this.f72431b = (MultiAvatarView) view.findViewById(R.id.d89);
            this.f72432c = (NiceWidthTextView) view.findViewById(R.id.d8a);
            this.f72433d = (TuxTextView) view.findViewById(R.id.d8b);
            this.f72434e = (ConstraintLayout) view.findViewById(R.id.ef1);
            this.f72435f = (AvatarImageView) view.findViewById(R.id.eey);
            this.f72436g = (AvatarImageView) view.findViewById(R.id.eez);
            this.f72437h = (AvatarImageView) view.findViewById(R.id.ef0);
            this.f72438i = (SmartAvatarImageView) view.findViewById(R.id.bbc);
            this.f72439j = (TuxTextView) view.findViewById(R.id.fe3);
            this.f72440k = (TuxTextView) view.findViewById(R.id.dyw);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0214, code lost:
        if (r0 == null) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x027e, code lost:
        if (r9 != null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r0 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0102, code lost:
        if (r0 == null) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0170  */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.comment.supporterpanel.k.a r13, int r14) {
        /*
        // Method dump skipped, instructions count: 664
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.supporterpanel.k.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    private static RecyclerView.ViewHolder a(k kVar, ViewGroup viewGroup, int i2) {
        View view;
        MethodCollector.i(1896);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 != 1 || kVar.f72426a == null) {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jn, viewGroup, false);
        } else {
            view = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.jo, viewGroup, false);
        }
        l.b(view, "");
        a aVar = new a(kVar, view);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(aVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) aVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(aVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = aVar.getClass().getName();
        MethodCollector.o(1896);
        return aVar;
    }
}
