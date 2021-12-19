package com.ss.android.ugc.aweme.view.a;

import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.a.g;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class h extends RecyclerView.a<c> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f144087c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public List<com.ss.android.ugc.aweme.model.api.a.b> f144088a;

    /* renamed from: b  reason: collision with root package name */
    public b f144089b;

    public interface b {
        static {
            Covode.recordClassIndex(94292);
        }

        void a();

        void a(com.ss.android.ugc.aweme.model.api.a.b bVar);
    }

    static {
        Covode.recordClassIndex(94290);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        return i2 == 0 ? 0 : 1;
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ c onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94291);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f144088a.size() + 1;
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        private final SmartImageView f144090a;

        /* renamed from: b  reason: collision with root package name */
        private final FrameLayout f144091b;

        static {
            Covode.recordClassIndex(94293);
        }

        /* access modifiers changed from: package-private */
        public static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f144092a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.ss.android.ugc.aweme.model.api.a.b f144093b;

            static {
                Covode.recordClassIndex(94294);
            }

            a(b bVar, com.ss.android.ugc.aweme.model.api.a.b bVar2) {
                this.f144092a = bVar;
                this.f144093b = bVar2;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f144092a.a(this.f144093b);
            }
        }

        /* access modifiers changed from: package-private */
        public static final class b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ b f144094a;

            static {
                Covode.recordClassIndex(94295);
            }

            b(b bVar) {
                this.f144094a = bVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f144094a.a();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
            this.f144090a = (SmartImageView) view.findViewById(R.id.db0);
            this.f144091b = (FrameLayout) view.findViewById(R.id.db1);
        }

        private final void a(b bVar) {
            View findViewById = this.itemView.findViewById(R.id.day);
            l.b(findViewById, "");
            View view = this.itemView;
            l.b(view, "");
            ((TuxTextView) findViewById).setText(view.getContext().getString(R.string.a0x));
            ((TuxIconView) this.itemView.findViewById(R.id.dax)).setIconRes(R.raw.icon_plus_small);
            this.itemView.setOnClickListener(new b(bVar));
        }

        private final void a(com.ss.android.ugc.aweme.model.api.a.b bVar, b bVar2) {
            UrlModel thumbnailUrl;
            List<String> urlList;
            String str;
            this.itemView.setOnClickListener(new a(bVar2, bVar));
            try {
                String background_color = bVar.getBackground_color();
                if (background_color == null || background_color.length() == 0) {
                    str = "#A5E6FF";
                } else {
                    str = bVar.getBackground_color();
                }
                this.f144091b.setBackgroundColor(Color.parseColor(str));
            } catch (Exception unused) {
            }
            List<g> staticImage = bVar.getStaticImage();
            if (staticImage != null && (true ^ staticImage.isEmpty()) && (thumbnailUrl = staticImage.get(0).getThumbnailUrl()) != null && (urlList = thumbnailUrl.getUrlList()) != null && urlList.size() > 0) {
                v a2 = r.a(Uri.parse(urlList.get(0)));
                SmartImageView smartImageView = this.f144090a;
                l.b(smartImageView, "");
                a2.f39906b = smartImageView.getContext();
                a2.E = this.f144090a;
                a2.v = w.CENTER_INSIDE;
                a2.c();
            }
        }

        public final void a(com.ss.android.ugc.aweme.model.api.a.b bVar, int i2, b bVar2) {
            l.d(bVar2, "");
            if (i2 == 0) {
                a(bVar2);
            } else if (bVar != null) {
                a(bVar, bVar2);
            }
        }
    }

    public h(List<com.ss.android.ugc.aweme.model.api.a.b> list, b bVar) {
        l.d(list, "");
        l.d(bVar, "");
        this.f144088a = list;
        this.f144089b = bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(c cVar, int i2) {
        c cVar2 = cVar;
        l.d(cVar2, "");
        if (getItemViewType(i2) == 0) {
            cVar2.a(null, 0, this.f144089b);
        } else {
            cVar2.a(this.f144088a.get(i2 - 1), 1, this.f144089b);
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        View a2;
        boolean a3;
        MethodCollector.i(1693);
        l.d(viewGroup, "");
        if (i2 == 0) {
            a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aq1, viewGroup, false);
        } else {
            a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aq2, viewGroup, false);
        }
        l.b(a2, "");
        c cVar = new c(a2);
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    a3 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a3) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(1693);
        return cVar;
    }
}
