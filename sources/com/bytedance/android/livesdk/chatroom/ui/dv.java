package com.bytedance.android.livesdk.chatroom.ui;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.b.f;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.livesdk.browser.c.d;
import com.bytedance.android.livesdk.chatroom.c.ad;
import com.bytedance.android.livesdk.model.ar;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class dv extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: d  reason: collision with root package name */
    private static final a f16184d = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final List<ar> f16185a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    String f16186b = "";

    /* renamed from: c  reason: collision with root package name */
    private final e f16187c;

    static {
        Covode.recordClassIndex(8951);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    static final class a {
        static {
            Covode.recordClassIndex(8952);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f16185a.size() + 1;
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final ImageView f16188a;

        /* renamed from: b  reason: collision with root package name */
        final ImageView f16189b;

        /* renamed from: c  reason: collision with root package name */
        final TextView f16190c;

        /* renamed from: d  reason: collision with root package name */
        final TextView f16191d;

        static {
            Covode.recordClassIndex(8953);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dv$b$b  reason: collision with other inner class name */
        static final class View$OnClickListenerC0331b implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f16194a;

            static {
                Covode.recordClassIndex(8955);
            }

            View$OnClickListenerC0331b(ar arVar) {
                this.f16194a = arVar;
            }

            public final void onClick(View view) {
                com.bytedance.android.livesdk.an.a.a().a(new ad(this.f16194a));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            this.f16188a = (ImageView) view.findViewById(R.id.eah);
            this.f16189b = (ImageView) view.findViewById(R.id.eaj);
            this.f16190c = (TextView) view.findViewById(R.id.eak);
            this.f16191d = (TextView) view.findViewById(R.id.eai);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ar f16192a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f16193b;

            static {
                Covode.recordClassIndex(8954);
            }

            a(ar arVar, e eVar) {
                this.f16192a = arVar;
                this.f16193b = eVar;
            }

            public final void onClick(View view) {
                String str;
                d webViewManager;
                ar arVar = this.f16192a;
                if (arVar == null || (str = arVar.f18990d) == null) {
                    str = "";
                }
                d.b a2 = com.bytedance.android.livesdk.browser.c.e.a(str).a(0, 0, 0, 0);
                a2.f14310k = -1;
                double b2 = (double) y.b();
                Double.isNaN(b2);
                a2.f14302c = (int) y.e((int) (b2 * 0.7d));
                a2.f14301b = (int) y.e(y.c());
                a2.f14309j = 80;
                f fVar = (f) com.bytedance.android.live.t.a.a(f.class);
                com.bytedance.android.live.core.widget.a aVar = null;
                if (!(fVar == null || (webViewManager = fVar.webViewManager()) == null)) {
                    aVar = webViewManager.a(a2, new com.bytedance.android.livesdk.chatroom.a(a2.f14300a, this.f16192a, null));
                }
                com.bytedance.android.live.core.widget.a.a(this.f16193b, aVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (i2 == getItemCount() - 1) {
            return 2;
        }
        return 1;
    }

    public static final class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final String f16195a = "Tiltify";

        /* renamed from: b  reason: collision with root package name */
        final TextView f16196b;

        static {
            Covode.recordClassIndex(8956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(View view) {
            super(view);
            l.d(view, "");
            this.f16196b = (TextView) view.findViewById(R.id.eam);
        }

        static final class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f16197a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ e f16198b;

            static {
                Covode.recordClassIndex(8957);
            }

            a(String str, e eVar) {
                this.f16197a = str;
                this.f16198b = eVar;
            }

            public final void onClick(View view) {
                d webViewManager;
                String str = this.f16197a;
                if (str == null) {
                    str = "";
                }
                d.b a2 = com.bytedance.android.livesdk.browser.c.e.a(str).a(0, 0, 0, 0);
                a2.f14310k = -1;
                double b2 = (double) y.b();
                Double.isNaN(b2);
                a2.f14302c = (int) y.e((int) (b2 * 0.7d));
                a2.f14301b = (int) y.e(y.c());
                a2.f14309j = 80;
                f fVar = (f) com.bytedance.android.live.t.a.a(f.class);
                com.bytedance.android.live.core.widget.a aVar = null;
                if (!(fVar == null || (webViewManager = fVar.webViewManager()) == null)) {
                    aVar = webViewManager.a(a2, new com.bytedance.android.livesdk.chatroom.a(a2.f14300a, null, null));
                }
                com.bytedance.android.live.core.widget.a.a(this.f16198b, aVar);
            }
        }
    }

    public dv(e eVar) {
        l.d(eVar, "");
        this.f16187c = eVar;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        MethodCollector.i(11349);
        l.d(viewGroup, "");
        boolean z = true;
        if (i2 == 1) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bb0, viewGroup, false);
            l.b(a2, "");
            viewHolder = new b(a2);
        } else if (i2 == 2) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bb1, viewGroup, false);
            l.b(a3, "");
            viewHolder = new c(a3);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("wrong view type");
            MethodCollector.o(11349);
            throw illegalArgumentException;
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(viewHolder.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) viewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(viewHolder.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = viewHolder.getClass().getName();
        MethodCollector.o(11349);
        return viewHolder;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        String str2;
        ImageModel imageModel;
        l.d(viewHolder, "");
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            e eVar = this.f16187c;
            ar arVar = (ar) n.b((List) this.f16185a, i2);
            l.d(eVar, "");
            TextView textView = bVar.f16190c;
            l.b(textView, "");
            if (arVar != null) {
                str = arVar.f18987a;
            } else {
                str = null;
            }
            textView.setText(str);
            TextView textView2 = bVar.f16191d;
            l.b(textView2, "");
            if (arVar != null) {
                str2 = arVar.f18988b;
            } else {
                str2 = null;
            }
            textView2.setText(str2);
            bVar.f16188a.setImageDrawable(null);
            ImageView imageView = bVar.f16188a;
            if (arVar == null || (imageModel = arVar.f18989c) == null) {
                imageModel = new ImageModel();
            }
            p.a(imageView, imageModel);
            bVar.f16189b.setOnClickListener(new b.a(arVar, eVar));
            bVar.itemView.setOnClickListener(new b.View$OnClickListenerC0331b(arVar));
        } else if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            e eVar2 = this.f16187c;
            String str3 = this.f16186b;
            l.d(eVar2, "");
            String a2 = y.a((int) R.string.eik, cVar.f16195a);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a2);
            l.b(a2, "");
            int a3 = h.m.p.a((CharSequence) a2, cVar.f16195a, 0, false, 6);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#FE2C55")), a3, cVar.f16195a.length() + a3, 33);
            TextView textView3 = cVar.f16196b;
            l.b(textView3, "");
            textView3.setText(spannableStringBuilder);
            cVar.f16196b.setOnClickListener(new c.a(str3, eVar2));
        }
    }
}
