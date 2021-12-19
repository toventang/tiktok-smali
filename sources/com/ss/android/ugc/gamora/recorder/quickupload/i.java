package com.ss.android.ugc.gamora.recorder.quickupload;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.d;
import com.bytedance.lighten.a.r;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.utils.gb;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.aweme.utils.hz;
import com.ss.android.ugc.gamora.recorder.quickupload.p;
import com.ss.android.ugc.tools.utils.h;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import f.a.v;
import f.a.w;
import h.a.n;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

public final class i extends RecyclerView.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public List<MediaModel> f148209a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super MediaModel, z> f148210b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f148211c;

    static {
        Covode.recordClassIndex(97683);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ p onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f148209a.size();
    }

    public i(Context context) {
        this.f148211c = context;
    }

    static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f148212a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f148213b;

        static {
            Covode.recordClassIndex(97684);
        }

        a(i iVar, List list) {
            this.f148212a = iVar;
            this.f148213b = list;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            final j.d dVar = (j.d) obj;
            if (hz.a()) {
                this.f148212a.a(dVar, this.f148213b);
            } else {
                hz.a(new h.f.a.a<z>(this) {
                    /* class com.ss.android.ugc.gamora.recorder.quickupload.i.a.AnonymousClass1 */
                    final /* synthetic */ a this$0;

                    static {
                        Covode.recordClassIndex(97685);
                    }

                    {
                        this.this$0 = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // h.f.a.a
                    public final /* synthetic */ z invoke() {
                        this.this$0.f148212a.a(dVar, this.this$0.f148213b);
                        return z.f158842a;
                    }
                });
            }
        }
    }

    static final class b<T> implements w {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f148214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f148215b;

        static {
            Covode.recordClassIndex(97686);
        }

        b(i iVar, List list) {
            this.f148214a = iVar;
            this.f148215b = list;
        }

        @Override // f.a.w
        public final void subscribe(v<j.d> vVar) {
            l.d(vVar, "");
            j.d a2 = j.a(new e(this.f148214a.f148209a, this.f148215b), true);
            l.b(a2, "");
            vVar.a(a2);
        }
    }

    public final void a(List<MediaModel> list) {
        l.d(list, "");
        this.f148209a = list;
        notifyDataSetChanged();
    }

    public final void a(j.d dVar, List<? extends MediaModel> list) {
        if (dVar != null) {
            dVar.a(this);
        }
        a(n.g((Collection) list));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(p pVar, int i2) {
        String a2;
        p pVar2 = pVar;
        l.d(pVar2, "");
        MediaModel mediaModel = this.f148209a.get(i2);
        l.d(mediaModel, "");
        if (gb.a()) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388611;
            layoutParams.gravity = 80;
            pVar2.f148277c.setLayoutParams(layoutParams);
            Context context = pVar2.f148278d;
            if (context != null) {
                pVar2.f148276b.setBackground(androidx.core.content.b.a(context, 2131232321));
            }
        } else {
            Context context2 = pVar2.f148278d;
            if (context2 != null) {
                pVar2.f148276b.setBackground(androidx.core.content.b.a(context2, 2131232320));
            }
        }
        com.bytedance.lighten.a.v a3 = r.a(h.d(mediaModel.f109390b));
        a3.E = pVar2.f148275a;
        a3.v = com.bytedance.lighten.a.w.CENTER_CROP;
        a3.f39916l = R.color.a7;
        a3.u = Bitmap.Config.RGB_565;
        com.bytedance.lighten.a.v a4 = a3.a((int) com.bytedance.common.utility.n.b(pVar2.f148278d, 80.0f), (int) com.bytedance.common.utility.n.b(pVar2.f148278d, 80.0f));
        l.b(a4, "");
        a4.L = true;
        a4.D = d.DEFAULT;
        a4.c();
        if (mediaModel.b()) {
            int a5 = h.g.a.a((((float) mediaModel.f109396h) * 1.0f) / 1000.0f);
            TuxTextView tuxTextView = pVar2.f148277c;
            int i3 = a5 % 60;
            int i4 = a5 / 60;
            int i5 = i4 / 60;
            int i6 = i4 % 60;
            if (i5 == 0) {
                a2 = com.a.a(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
            } else {
                a2 = com.a.a(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
            }
            l.b(a2, "");
            tuxTextView.setText(a2);
            if (cj.a()) {
                pVar2.f148276b.setVisibility(0);
                int a6 = en.a(1.0d, com.ss.android.ugc.aweme.port.in.i.f115645a);
                TuxTextView tuxTextView2 = pVar2.f148277c;
                float f2 = (float) a6;
                Context context3 = pVar2.f148278d;
                if (context3 == null) {
                    l.b();
                }
                tuxTextView2.setShadowLayer(f2, 0.0f, f2, androidx.core.content.b.c(context3, R.color.bo));
            }
            pVar2.f148277c.setVisibility(0);
        } else {
            pVar2.f148276b.setVisibility(8);
            pVar2.f148277c.setVisibility(8);
        }
        pVar2.itemView.setOnClickListener(new p.a(pVar2, mediaModel));
    }

    private static RecyclerView.ViewHolder a(i iVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(9496);
        l.d(viewGroup, "");
        p pVar = new p(iVar.f148211c, viewGroup, iVar.f148210b);
        try {
            if (pVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(pVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) pVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(pVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = pVar.getClass().getName();
        MethodCollector.o(9496);
        return pVar;
    }
}
