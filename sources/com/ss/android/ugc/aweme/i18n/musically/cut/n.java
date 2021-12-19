package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.drawee.f.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.o.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.mediachoose.f;
import com.ss.android.ugc.aweme.mediachoose.g;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aa;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.h;
import com.zhiliaoapp.musically.R;
import h.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class n extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    boolean f99877a;

    /* renamed from: b  reason: collision with root package name */
    final List<MediaModel> f99878b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<Integer> f99879c;

    /* renamed from: d  reason: collision with root package name */
    public List<Integer> f99880d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f99881e;

    /* renamed from: f  reason: collision with root package name */
    public a f99882f;

    /* renamed from: g  reason: collision with root package name */
    public int f99883g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f99884h = -1;

    /* renamed from: i  reason: collision with root package name */
    public boolean f99885i;

    /* renamed from: j  reason: collision with root package name */
    List<MediaModel> f99886j;

    /* renamed from: k  reason: collision with root package name */
    t f99887k;

    /* renamed from: l  reason: collision with root package name */
    g f99888l;

    /* renamed from: m  reason: collision with root package name */
    private final Context f99889m;
    private int n = 0;
    private int o;
    private double p;

    public interface a {
        static {
            Covode.recordClassIndex(63676);
        }

        void a(MediaModel mediaModel);
    }

    static {
        Covode.recordClassIndex(63674);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f99878b.size();
    }

    /* access modifiers changed from: package-private */
    public static class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SimpleDraweeView f99893a;

        /* renamed from: b  reason: collision with root package name */
        TextView f99894b;

        /* renamed from: c  reason: collision with root package name */
        TextView f99895c;

        /* renamed from: d  reason: collision with root package name */
        View f99896d;

        /* renamed from: e  reason: collision with root package name */
        FrameLayout f99897e;

        /* renamed from: f  reason: collision with root package name */
        View f99898f;

        static {
            Covode.recordClassIndex(63677);
        }

        public final void a() {
            this.f99895c.setText("");
            this.f99895c.setBackgroundResource(R.drawable.s0);
        }

        b(View view) {
            super(view);
        }

        public final void a(int i2) {
            this.f99895c.setText(String.valueOf(i2 + 1));
            this.f99895c.setBackgroundResource(R.drawable.s1);
        }
    }

    private void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.n) {
            int i2 = layoutParams.height;
            int i3 = this.n;
            double d2 = (double) i3;
            double d3 = this.p;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = i3;
                double d4 = (double) this.n;
                double d5 = this.p;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        List<Integer> list = this.f99880d;
        if (list == null) {
            this.f99880d = new ArrayList();
        } else {
            list.clear();
        }
        List<Integer> list2 = this.f99879c;
        if (list2 == null) {
            this.f99879c = new ArrayList();
        } else {
            list2.clear();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.f99879c.add(-1);
        }
    }

    static /* synthetic */ z a(Context context, f fVar) {
        a(fVar.f109384b, 1, fVar.f109385c, "select");
        q.a("aweme_movie_import_error_rate", 1, new ar().a("errorCode", String.valueOf(fVar.f109387e)).a("errorMsg", fVar.f109388f).a());
        aa.a(context, fVar.f109387e, -1);
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i2) {
        int i3;
        String a2;
        float f2;
        b bVar = (b) viewHolder;
        a(bVar.f99893a);
        a(bVar.f99896d);
        a(bVar.f99898f);
        final MediaModel mediaModel = this.f99878b.get(i2);
        FrameLayout frameLayout = bVar.f99897e;
        if (this.f99881e) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        frameLayout.setVisibility(i3);
        if (this.f99883g != -1) {
            bVar.f99894b.setTextColor(this.f99883g);
        }
        if (this.f99884h != -1) {
            bVar.f99894b.setShadowLayer(6.0f, 0.0f, 3.0f, this.f99884h);
        }
        if (!this.f99885i) {
            bVar.f99894b.setBackgroundResource(0);
        } else {
            e eVar = new e();
            eVar.a(com.bytedance.common.utility.n.b(this.f99889m, 2.0f));
            com.facebook.drawee.f.a a3 = new com.facebook.drawee.f.b(this.f99889m.getResources()).a();
            a3.a(eVar);
            bVar.f99893a.setHierarchy(a3);
            bVar.f99894b.setBackgroundResource(R.drawable.avp);
            Drawable drawable = this.f99889m.getResources().getDrawable(2131235014);
            bVar.f99894b.setCompoundDrawablePadding((int) com.bytedance.common.utility.n.b(this.f99889m, 2.0f));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            bVar.f99894b.setCompoundDrawables(drawable, null, null, null);
        }
        float f3 = 1.0f;
        int round = Math.round((((float) mediaModel.f109396h) * 1.0f) / 1000.0f);
        bVar.f99896d.setVisibility(4);
        TextView textView = bVar.f99894b;
        int i4 = round % 60;
        int i5 = round / 60;
        int i6 = i5 / 60;
        int i7 = i5 % 60;
        if (i6 == 0) {
            a2 = com.a.a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i7), Integer.valueOf(i4)});
        } else {
            a2 = com.a.a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i4)});
        }
        textView.setText(a2);
        int intValue = this.f99879c.get(i2).intValue();
        if (intValue >= 0) {
            bVar.a(intValue);
            bVar.f99898f.setVisibility(0);
            f2 = 1.1f;
        } else {
            bVar.a();
            bVar.f99898f.setVisibility(4);
            if (this.f99880d.size() >= 12) {
                f3 = 0.5f;
            } else {
                f3 = 1.0f;
            }
            f2 = 1.0f;
        }
        if (bVar.f99893a.getAlpha() != f3) {
            bVar.f99893a.setAlpha(f3);
        }
        if (bVar.f99893a.getScaleX() != f2) {
            bVar.f99893a.setScaleX(f2);
            bVar.f99893a.setScaleY(f2);
        }
        c a4 = c.a(h.d(mediaModel.f109390b));
        int i8 = this.n;
        a4.f48447d = new d(i8, i8);
        com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
        b2.f47325m = bVar.f99893a.getController();
        b2.f47315c = (REQUEST) a4.a();
        bVar.f99893a.setController(b2.e());
        bVar.itemView.setOnClickListener(new View.OnClickListener() {
            /* class com.ss.android.ugc.aweme.i18n.musically.cut.n.AnonymousClass1 */

            static {
                Covode.recordClassIndex(63675);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (i2 < n.this.f99879c.size()) {
                    if (n.this.f99879c.get(i2).intValue() >= 0 || n.this.f99880d.size() < 12) {
                        n.this.f99882f.a(mediaModel);
                    }
                }
            }
        });
        bVar.f99897e.setOnClickListener(new o(this, bVar, i2, mediaModel));
    }

    public n(Context context, t tVar, int i2) {
        this.f99889m = context;
        this.f99887k = tVar;
        this.o = i2;
        this.p = 1.0d;
        context.getResources().getDimensionPixelOffset(R.dimen.oj);
        int b2 = (int) com.bytedance.common.utility.n.b(context, 1.5f);
        int a2 = com.bytedance.common.utility.n.a(context);
        int i3 = this.o;
        this.n = ((a2 - ((i3 - 1) * b2)) - 0) / i3;
        com.ss.android.ugc.aweme.mediachoose.c cVar = new com.ss.android.ugc.aweme.mediachoose.c(context);
        this.f99888l = cVar;
        cVar.a();
        this.f99888l.a("enter_from_multi");
    }

    private static RecyclerView.ViewHolder a(n nVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(9805);
        View inflate = LayoutInflater.from(nVar.f99889m).inflate(R.layout.ak9, (ViewGroup) null);
        b bVar = new b(inflate);
        bVar.f99893a = (SimpleDraweeView) inflate.findViewById(R.id.cl_);
        bVar.f99894b = (TextView) inflate.findViewById(R.id.fg0);
        bVar.f99895c = (TextView) inflate.findViewById(R.id.bmg);
        bVar.f99896d = inflate.findViewById(R.id.fc8);
        bVar.f99896d.setVisibility(8);
        bVar.f99898f = inflate.findViewById(R.id.dxc);
        bVar.f99897e = (FrameLayout) inflate.findViewById(R.id.b5m);
        ViewGroup.LayoutParams layoutParams = bVar.f99897e.getLayoutParams();
        layoutParams.height = (int) com.bytedance.common.utility.n.b(bVar.f99897e.getContext(), 48.0f);
        layoutParams.width = (int) com.bytedance.common.utility.n.b(bVar.f99897e.getContext(), 48.0f);
        bVar.f99897e.setLayoutParams(layoutParams);
        inflate.setTag(bVar);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = bVar.getClass().getName();
        MethodCollector.o(9805);
        return bVar;
    }

    private static void a(String str, int i2, long j2, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j2);
            q.a("aweme_video_import_duration", jSONObject, new ar().a("status", String.valueOf(i2)).a("scene_name", str2).a(StringSet.type, str).a());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(b bVar, int i2, MediaModel mediaModel, f fVar) {
        a(fVar.f109384b, 0, fVar.f109385c, "select");
        if (this.f99880d.size() >= 12) {
            new com.bytedance.tux.g.b(bVar.itemView).a(this.f99889m.getString(R.string.adi)).b();
            return null;
        }
        if (this.f99886j == null) {
            this.f99886j = new ArrayList();
        }
        this.f99886j.add(mediaModel);
        this.f99880d.add(Integer.valueOf(i2));
        Arrays.toString(this.f99880d.toArray());
        bVar.a(this.f99880d.size() - 1);
        this.f99879c.set(i2, Integer.valueOf(this.f99880d.size() - 1));
        this.f99877a = true;
        bVar.f99893a.animate().scaleY(1.1f).scaleX(1.1f).setDuration(300).withEndAction(new s(this)).start();
        bVar.f99898f.setAlpha(0.0f);
        bVar.f99898f.setVisibility(0);
        bVar.f99898f.animate().alpha(1.0f).setDuration(300).start();
        return null;
    }
}
