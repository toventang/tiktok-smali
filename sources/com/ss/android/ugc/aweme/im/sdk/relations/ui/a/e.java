package com.ss.android.ugc.aweme.im.sdk.relations.ui.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxCheckBox;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;

public final class e extends c {
    static {
        Covode.recordClassIndex(66175);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c
    public final /* synthetic */ a.b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public class a extends a.b {

        /* renamed from: e  reason: collision with root package name */
        public AvatarImageView f103222e;

        /* renamed from: g  reason: collision with root package name */
        private TextView f103224g;

        /* renamed from: h  reason: collision with root package name */
        private TextView f103225h;

        /* renamed from: i  reason: collision with root package name */
        private TextView f103226i;

        /* renamed from: j  reason: collision with root package name */
        private TextView f103227j;

        /* renamed from: k  reason: collision with root package name */
        private ImageView f103228k;

        /* renamed from: l  reason: collision with root package name */
        private ImageView f103229l;

        /* renamed from: m  reason: collision with root package name */
        private TuxIconView f103230m;
        private View n;
        private LinearLayout o;

        static {
            Covode.recordClassIndex(66176);
        }

        @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.b, com.ss.android.ugc.aweme.im.sdk.common.ui.base.a
        public final void b() {
            super.b();
            this.n = this.itemView.findViewById(R.id.ca6);
            this.o = (LinearLayout) this.itemView.findViewById(R.id.emo);
            this.f103225h = (TextView) this.itemView.findViewById(R.id.title_tv);
            this.f103229l = (ImageView) this.itemView.findViewById(R.id.bnv);
            this.f103227j = (TextView) this.itemView.findViewById(R.id.bnx);
            this.f103188a = (TuxCheckBox) this.itemView.findViewById(R.id.a5_);
            this.f103222e = (AvatarImageView) this.itemView.findViewById(R.id.pf);
            this.f103228k = (ImageView) this.itemView.findViewById(R.id.fez);
            this.f103224g = (TextView) this.itemView.findViewById(R.id.csg);
            this.f103226i = (TextView) this.itemView.findViewById(R.id.al5);
            this.f103230m = (TuxIconView) this.itemView.findViewById(R.id.b7o);
        }

        public a(View view) {
            super(view);
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x012f  */
        @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a.b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(com.ss.android.ugc.aweme.im.service.model.IMContact r10, int r11) {
            /*
            // Method dump skipped, instructions count: 668
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.ui.a.e.a.a(com.ss.android.ugc.aweme.im.service.model.IMContact, int):void");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a
    public final void a(int i2) {
        int b2 = i2 - b();
        if (b2 >= 0 && b2 < this.f103175c.size()) {
            Object obj = this.f103175c.get(b2);
            for (int i3 = 0; i3 < this.f103175c.size(); i3++) {
                if (obj.equals(this.f103175c.get(i3))) {
                    notifyItemChanged(b() + i3);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.relations.ui.a.a, com.ss.android.ugc.aweme.im.sdk.relations.ui.a.c
    public final a.b a(ViewGroup viewGroup, int i2) {
        int i3;
        if (i2 == 1 && this.f103179g != null) {
            return super.a(viewGroup, i2);
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 0) {
            i3 = R.layout.a6h;
        } else {
            i3 = R.layout.a6i;
        }
        return new a(com.a.a(from, i3, viewGroup, false));
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6431);
        a.b a3 = eVar.a(viewGroup, i2);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(6431);
        return a3;
    }
}
