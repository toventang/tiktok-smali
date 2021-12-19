package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.j;
import com.bytedance.common.utility.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.a.c.k;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.df.q;
import com.ss.android.ugc.aweme.experiment.fb;
import com.ss.android.ugc.aweme.mediachoose.f;
import com.ss.android.ugc.aweme.mediachoose.g;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.property.dp;
import com.ss.android.ugc.aweme.setting.cj;
import com.ss.android.ugc.aweme.shortvideo.ar;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n;
import com.ss.android.ugc.aweme.shortvideo.util.b;
import com.ss.android.ugc.aweme.shortvideo.util.be;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class MvImageChooseAdapter extends RecyclerView.a<RecyclerView.ViewHolder> implements FastScrollRecyclerView.b, n.c {
    private final boolean A = fb.a();
    private final boolean B = cj.a();
    private boolean C;

    /* renamed from: a  reason: collision with root package name */
    public int f128845a = 12;

    /* renamed from: b  reason: collision with root package name */
    public String f128846b;

    /* renamed from: c  reason: collision with root package name */
    final Context f128847c;

    /* renamed from: d  reason: collision with root package name */
    List<MyMediaModel> f128848d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public int f128849e;

    /* renamed from: f  reason: collision with root package name */
    public d f128850f;

    /* renamed from: g  reason: collision with root package name */
    public c f128851g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f128852h = true;

    /* renamed from: i  reason: collision with root package name */
    public boolean f128853i;

    /* renamed from: j  reason: collision with root package name */
    public int f128854j;

    /* renamed from: k  reason: collision with root package name */
    int f128855k = 1;

    /* renamed from: l  reason: collision with root package name */
    public RecyclerView f128856l;

    /* renamed from: m  reason: collision with root package name */
    List<MyMediaModel> f128857m = new ArrayList();
    public int n = -1;
    public boolean o;
    public final HashSet<RecyclerView.ViewHolder> p = new HashSet<>(48);
    public final boolean q = dp.a();
    boolean r;
    private int s;
    private int t = -1;
    private Map<Long, Float> u = new HashMap();
    private double v;
    private g w;
    private final HashSet<String> x = new HashSet<>();
    private final HashSet<e> y = new HashSet<>(48);
    private final boolean z = com.bytedance.ies.abmock.b.a().a(true, "creative_tools_enable_resized_image_diskcache", false);

    /* access modifiers changed from: package-private */
    public interface a {
        static {
            Covode.recordClassIndex(84567);
        }

        void a();
    }

    public interface c {
        static {
            Covode.recordClassIndex(84569);
        }

        int a(MyMediaModel myMediaModel, boolean z);

        void a();

        void a(MediaModel mediaModel);

        void a(MyMediaModel myMediaModel, View view);

        void a(List<MyMediaModel> list, b bVar, MyMediaModel myMediaModel);

        boolean a(MyMediaModel myMediaModel);

        boolean b();

        boolean b(MediaModel mediaModel);
    }

    public interface d {
        static {
            Covode.recordClassIndex(84570);
        }

        void a(View view, MediaModel mediaModel);
    }

    static {
        Covode.recordClassIndex(84562);
    }

    private static String a(int i2, int i3) {
        return i2 > i3 ? "horizontal" : i2 < i3 ? "vertical" : "square";
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        if (r0 == null) goto L_0x0065;
     */
    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.n.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence a(int r10) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.a(int):java.lang.CharSequence");
    }

    public final void a(boolean z2) {
        f();
        this.f128852h = z2;
        if (!h.a(this.f128848d)) {
            this.f128848d.clear();
            c cVar = this.f128851g;
            if (cVar != null) {
                cVar.a(this.f128848d, null, null);
            }
        }
        notifyDataSetChanged();
    }

    public final void a(List<MyMediaModel> list) {
        this.f128857m.clear();
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.get(i2).u = i2;
            this.f128857m.add(list.get(i2));
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public final void a(j.d dVar, List<MyMediaModel> list) {
        dVar.a(new x(this, this.f128856l));
        this.f128857m = list;
    }

    /* access modifiers changed from: package-private */
    public final void a(MediaModel mediaModel, a aVar) {
        int i2 = this.f128854j;
        if (3 == i2) {
            if (mediaModel.b()) {
                c(mediaModel, aVar);
            } else {
                b(mediaModel, aVar);
            }
        } else if (1 == i2) {
            c(mediaModel, aVar);
        } else {
            b(mediaModel, aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView.b
    public final void a() {
        if (!this.C) {
            this.C = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(MyMediaModel myMediaModel) {
        if (myMediaModel != null) {
            this.f128848d.remove(myMediaModel);
            e();
        }
    }

    public final void a(final e eVar, final int i2) {
        double d2;
        final MyMediaModel myMediaModel = eVar.f128877i;
        myMediaModel.x = a(myMediaModel.f109400l, myMediaModel.f109401m);
        if (com.ss.android.ugc.aweme.setting.i.a.a() == 1) {
            d2 = 0.8d;
        } else {
            d2 = com.ss.android.ugc.aweme.setting.i.a.a() == 2 ? 0.6d : 1.0d;
        }
        AnonymousClass3 r2 = new com.bytedance.lighten.a.c.d() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AnonymousClass3 */

            /* renamed from: a  reason: collision with root package name */
            long f128863a;

            static {
                Covode.recordClassIndex(84565);
            }

            @Override // com.bytedance.lighten.a.c.k
            public final void a(Uri uri, View view, Throwable th) {
            }

            @Override // com.bytedance.lighten.a.c.d, com.bytedance.lighten.a.c.k
            public final void a(Uri uri, View view) {
                super.a(uri, view);
                this.f128863a = System.currentTimeMillis();
            }

            @Override // com.bytedance.lighten.a.c.k
            public final void a(Uri uri, View view, o oVar, Animatable animatable) {
                boolean z;
                boolean z2;
                boolean z3;
                if (MvImageChooseAdapter.this.q) {
                    MvImageChooseAdapter.this.p.add(eVar);
                }
                if (!MvImageChooseAdapter.this.o || i2 != MvImageChooseAdapter.this.c()) {
                    z = false;
                } else {
                    z = true;
                }
                long currentTimeMillis = System.currentTimeMillis() - this.f128863a;
                int i2 = MvImageChooseAdapter.this.f128854j;
                int i3 = i2;
                Long valueOf = Long.valueOf(currentTimeMillis);
                if (valueOf.longValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && valueOf != null) {
                    y.f129195a.add(Long.valueOf(valueOf.longValue()));
                }
                if (y.f129197c == 0) {
                    y.f129197c = System.currentTimeMillis();
                }
                y yVar = y.f129200f;
                if (z && yVar != null && !y.f129196b && y.f129198d != 0) {
                    com.ss.android.ugc.tools.f.b a2 = new com.ss.android.ugc.tools.f.b().a("duration", System.currentTimeMillis() - y.f129198d).a("time_to_first_image", y.f129197c - y.f129198d).a("local_media_type", i2);
                    if (y.f129199e) {
                        y.f129199e = false;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    com.ss.android.ugc.aweme.utils.d.a("tool_performance_loaded_thumbnail_time", a2.a("cold_start", z3).a("size", i3).f149193a);
                    System.currentTimeMillis();
                    y.f129196b = true;
                }
                System.currentTimeMillis();
                if (z) {
                    b.a.f132249a.end(OpenAlbumPanelPerformanceMonitor.f132344a, "imageLoaded");
                    MvImageChooseAdapter.this.o = false;
                }
                if (MvImageChooseAdapter.this.r) {
                    MvImageChooseAdapter.this.r = false;
                    r.a("tool_performance_operation_cost_time", new com.ss.android.ugc.tools.f.b().a(StringSet.type, "tool_performance_load_first_img_switching_tab").a("totaltime", System.currentTimeMillis() - this.f128863a).f149193a);
                }
            }
        };
        if (com.ss.android.ugc.aweme.setting.i.a.a() != 0) {
            com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(com.ss.android.ugc.tools.utils.h.d(myMediaModel.f109390b));
            a2.f48456m = true;
            int i3 = this.f128849e;
            double d3 = (double) i3;
            Double.isNaN(d3);
            int i4 = (int) (d3 * d2);
            double d4 = (double) i3;
            Double.isNaN(d4);
            a2.f48447d = new com.facebook.imagepipeline.common.d(i4, (int) (d4 * d2));
            a2.f48449f = new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.RGB_565).a();
            com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
            b2.f47325m = eVar.f128869a.getController();
            b2.f47315c = (REQUEST) a2.a();
            com.facebook.drawee.c.a c2 = b2.e();
            eVar.f128869a.setPlaceholderImage(R.drawable.q3);
            eVar.f128869a.setActualImageScaleType(w.CENTER_CROP);
            ((com.facebook.drawee.f.a) eVar.f128869a.getHierarchy()).b(10);
            eVar.n = r2;
            eVar.f128881m = c2;
            if (this.C) {
                this.y.add(eVar);
                return;
            }
            eVar.f128869a.setController(c2);
            eVar.f128869a.setImageDisplayListener(r2);
            return;
        }
        v a3 = com.bytedance.lighten.a.r.a(com.ss.android.ugc.tools.utils.h.d(myMediaModel.f109390b));
        a3.E = eVar.f128869a;
        a3.u = Bitmap.Config.RGB_565;
        a3.v = w.CENTER_CROP;
        a3.f39916l = R.drawable.q3;
        int i5 = this.f128849e;
        v a4 = a3.a(i5, i5);
        a4.L = this.z;
        a4.f39917m = 10;
        if (fb.a()) {
            a4.a(new com.ss.android.ugc.aweme.shortvideo.mvtemplate.b());
        }
        a4.a(r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f128857m.size();
    }

    public static class e extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        SmartImageView f128869a;

        /* renamed from: b  reason: collision with root package name */
        TextView f128870b;

        /* renamed from: c  reason: collision with root package name */
        TextView f128871c;

        /* renamed from: d  reason: collision with root package name */
        View f128872d;

        /* renamed from: e  reason: collision with root package name */
        ViewStub f128873e;

        /* renamed from: f  reason: collision with root package name */
        FrameLayout f128874f;

        /* renamed from: g  reason: collision with root package name */
        View f128875g;

        /* renamed from: h  reason: collision with root package name */
        String f128876h;

        /* renamed from: i  reason: collision with root package name */
        MyMediaModel f128877i;

        /* renamed from: j  reason: collision with root package name */
        View f128878j;

        /* renamed from: k  reason: collision with root package name */
        int f128879k;

        /* renamed from: l  reason: collision with root package name */
        int f128880l;

        /* renamed from: m  reason: collision with root package name */
        com.facebook.drawee.h.a f128881m;
        k n;

        static {
            Covode.recordClassIndex(84571);
        }

        private boolean c() {
            if (this.f128880l == 6) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            if (com.ss.android.ugc.aweme.setting.i.a.a() == 0 || !this.f128870b.getText().toString().equals("")) {
                this.f128870b.setText("");
            }
            this.f128870b.setBackgroundResource(R.drawable.s0);
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            MethodCollector.i(7850);
            if (this.f128873e.getParent() != null) {
                this.f128873e.inflate();
                View findViewById = this.itemView.findViewById(R.id.dy4);
                this.f128878j = findViewById;
                findViewById.findViewById(R.id.dy2).setVisibility(8);
            }
            MethodCollector.o(7850);
        }

        public e(View view) {
            super(view);
        }

        public final void a(int i2) {
            if (c()) {
                this.f128870b.setText("");
                this.f128870b.setBackgroundResource(2131230953);
                return;
            }
            this.f128870b.setText(String.valueOf(i2));
            if (fb.a()) {
                this.f128870b.setBackgroundResource(2131230958);
            } else {
                this.f128870b.setBackgroundResource(R.drawable.s1);
            }
        }
    }

    public enum b {
        PREVIEW(1),
        THUMBNAIL(0);
        
        public int value;

        static {
            Covode.recordClassIndex(84568);
        }

        private b(int i2) {
            this.value = i2;
        }
    }

    private void f() {
        for (MyMediaModel myMediaModel : this.f128848d) {
            myMediaModel.v = -1;
        }
        for (MyMediaModel myMediaModel2 : this.f128857m) {
            myMediaModel2.v = -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.FastScrollRecyclerView.b
    public final void b() {
        if (this.C) {
            this.C = false;
            Iterator<e> it = this.y.iterator();
            while (it.hasNext()) {
                e next = it.next();
                it.remove();
                if (next.f128881m != null) {
                    next.f128869a.setController(next.f128881m);
                    next.f128869a.setImageDisplayListener(next.n);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        androidx.core.g.e<Integer, Integer> a2 = com.ss.android.ugc.aweme.ba.d.a(this.f128856l);
        int intValue = a2.f2397a.intValue();
        notifyItemRangeChanged(intValue, (a2.f2398b.intValue() - intValue) + 1, new Object());
    }

    public final int c() {
        if (this.t == -1) {
            this.t = Math.min(this.f128857m.size() - 1, (this.f128856l.getHeight() / this.f128849e) * this.s);
        }
        return this.t;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        int i2 = -1;
        for (MyMediaModel myMediaModel : this.f128857m) {
            i2++;
            for (MyMediaModel myMediaModel2 : this.f128848d) {
                if (myMediaModel.f109390b.equals(myMediaModel2.f109390b)) {
                    if (this.x.isEmpty()) {
                        notifyItemChanged(i2, new Object());
                    } else {
                        notifyItemChanged(i2);
                    }
                }
            }
        }
    }

    public final void c(List<String> list) {
        this.x.addAll(list);
    }

    public static class MyMediaModel extends MediaModel {
        public int u = -1;
        public int v = -1;
        public int w = -1;
        public String x;

        static {
            Covode.recordClassIndex(84566);
        }

        public MyMediaModel(String str) {
            super(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        if (this.q) {
            this.p.remove(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (com.ss.android.ugc.aweme.setting.i.a.a() == 2) {
            this.y.remove(viewHolder);
        }
    }

    private void a(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.f128849e) {
            int i2 = layoutParams.height;
            int i3 = this.f128849e;
            double d2 = (double) i3;
            double d3 = this.v;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = i3;
                double d4 = (double) this.f128849e;
                double d5 = this.v;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    private static String b(int i2) {
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return com.a.a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return com.a.a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    public final void b(List<MyMediaModel> list) {
        t a2 = t.a(new ay(this, list));
        if (this.f128857m.size() != 0) {
            a2 = a2.b(f.a.h.a.a(f.a.k.a.f158005b)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a));
        }
        a2.d(new az(this, list));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        a((e) viewHolder, i2, false);
    }

    private void c(MediaModel mediaModel, a aVar) {
        if (this.w == null) {
            com.ss.android.ugc.aweme.mediachoose.c cVar = new com.ss.android.ugc.aweme.mediachoose.c(this.f128847c);
            this.w = cVar;
            cVar.a("enter_from_multi");
        }
        this.w.a(mediaModel, 1000, -1, new bg(this, aVar, mediaModel), new bh(this, mediaModel));
    }

    static void a(MediaModel mediaModel, boolean z2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaModel);
        com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.e.a(arrayList, new ba(z2));
    }

    private void a(e eVar, boolean z2) {
        float f2;
        float f3;
        int i2;
        if (eVar.f128877i.v >= 0) {
            eVar.a(eVar.f128877i.v);
            f2 = 1.0f;
            f3 = 1.1f;
            i2 = 0;
        } else {
            eVar.a();
            if (this.f128851g.b()) {
                f2 = 0.5f;
            } else {
                f2 = 1.0f;
            }
            f3 = 1.0f;
            i2 = 4;
        }
        if (eVar.f128869a.getAlpha() != f2) {
            eVar.f128869a.setAlpha(f2);
        }
        if (eVar.f128869a.getScaleX() == f3) {
            return;
        }
        if (z2) {
            eVar.f128869a.animate().scaleY(f3).scaleX(f3).setDuration(300).start();
            if (i2 == 4) {
                eVar.f128875g.animate().alpha(0.0f).setDuration(300).withEndAction(new bd(eVar)).start();
                return;
            }
            eVar.f128875g.setVisibility(0);
            eVar.f128875g.animate().alpha(1.0f).setDuration(300).start();
            return;
        }
        eVar.f128869a.setScaleX(f3);
        eVar.f128869a.setScaleY(f3);
        eVar.f128875g.setVisibility(i2);
    }

    private void b(MediaModel mediaModel, a aVar) {
        double d2 = (double) mediaModel.f109400l;
        double d3 = (double) mediaModel.f109401m;
        Double.isNaN(d3);
        if (d2 <= d3 * 2.4d) {
            double d4 = (double) mediaModel.f109401m;
            double d5 = (double) mediaModel.f109400l;
            Double.isNaN(d5);
            if (d4 <= d5 * 2.4d) {
                aVar.a();
                return;
            }
        }
        bt.a(0, 1);
        new com.ss.android.ugc.aweme.tux.a.i.a(this.f128847c).a(R.string.ftk).a();
        q.a("aweme_movie_import_error_rate", 1, new ar().a("errorCode", (Integer) -9).a("errorMsg", "").a());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ z a(MediaModel mediaModel, f fVar) {
        f.a(fVar);
        a(fVar.f109384b, 1, fVar.f109385c, "select");
        q.a("aweme_movie_import_error_rate", 1, new ar().a("errorCode", String.valueOf(fVar.f109387e)).a("errorMsg", fVar.f109388f).a("file_subfix", com.ss.android.ugc.tools.utils.h.g(mediaModel.f109390b)).a());
        bt.a(fVar.f109387e, 0);
        aa.a(this.f128847c, fVar.f109387e, 1000);
        a(mediaModel, false);
        return null;
    }

    static /* synthetic */ z a(a aVar, MediaModel mediaModel, f fVar) {
        f.a(fVar);
        a(fVar.f109384b, 0, fVar.f109385c, "select");
        aVar.a();
        a(mediaModel, true);
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2, List<Object> list) {
        if (list.isEmpty()) {
            a((e) viewHolder, i2, false);
        } else {
            a((e) viewHolder, i2, true);
        }
    }

    private static RecyclerView.ViewHolder a(MvImageChooseAdapter mvImageChooseAdapter, ViewGroup viewGroup, int i2) {
        e poll;
        boolean z2;
        boolean a2;
        MethodCollector.i(9744);
        if (k.f129143b == 0) {
            poll = null;
        } else {
            poll = k.f129142a.poll();
        }
        int i3 = 0;
        if (poll == null) {
            poll = new e(com.a.a(LayoutInflater.from(mvImageChooseAdapter.f128847c), R.layout.a8z, viewGroup, false));
        }
        poll.f128869a = (SmartImageView) poll.itemView.findViewById(R.id.cl_);
        poll.f128870b = (TextView) poll.itemView.findViewById(R.id.bmg);
        poll.f128874f = (FrameLayout) poll.itemView.findViewById(R.id.b5m);
        poll.f128875g = poll.itemView.findViewById(R.id.e08);
        poll.f128871c = (TextView) poll.itemView.findViewById(R.id.ar_);
        TextView textView = poll.f128871c;
        if (!mvImageChooseAdapter.f128853i) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        if (com.ss.android.ugc.aweme.setting.i.a.a() == 0) {
            z2 = cj.a();
        } else {
            z2 = mvImageChooseAdapter.B;
        }
        if (z2) {
            float a3 = (float) en.a(1.0d, i.f115645a);
            poll.f128871c.setShadowLayer(a3, 0.0f, a3, androidx.core.content.b.c(mvImageChooseAdapter.f128847c, R.color.bo));
        }
        poll.f128872d = poll.itemView.findViewById(R.id.ar7);
        poll.f128873e = (ViewStub) poll.itemView.findViewById(R.id.fjx);
        poll.f128880l = mvImageChooseAdapter.n;
        try {
            if (poll.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(poll.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) poll.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(poll.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = poll.getClass().getName();
        MethodCollector.o(9744);
        return poll;
    }

    private void a(final e eVar, int i2, boolean z2) {
        boolean z3;
        int i3;
        boolean z4;
        a(eVar.f128869a);
        a(eVar.f128875g);
        final MyMediaModel myMediaModel = this.f128857m.get(i2);
        if (com.ss.android.ugc.aweme.setting.i.a.a() == 0) {
            z3 = fb.a();
        } else {
            z3 = this.A;
        }
        if (z3) {
            eVar.f128870b.setBackgroundResource(R.drawable.fp);
            eVar.f128870b.setTextColor(androidx.core.content.b.c(this.f128847c, R.color.a9));
        }
        myMediaModel.u = i2;
        eVar.f128877i = myMediaModel;
        eVar.f128879k = i2;
        FrameLayout frameLayout = eVar.f128874f;
        int i4 = 0;
        if (this.f128852h) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        frameLayout.setVisibility(i3);
        a(eVar, z2);
        if (eVar.f128878j != null) {
            eVar.f128878j.setVisibility(8);
        }
        if (this.x.contains(myMediaModel.f109390b)) {
            eVar.b();
            eVar.f128878j.setVisibility(0);
        }
        if (!z2) {
            String str = "file://" + myMediaModel.f109390b;
            if (!TextUtils.equals(eVar.f128876h, str)) {
                eVar.f128876h = str;
                a(eVar, i2);
            }
        }
        eVar.itemView.setOnClickListener(new com.ss.android.ugc.aweme.views.d() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AnonymousClass1 */

            static {
                Covode.recordClassIndex(84563);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                if ((eVar.f128877i.v >= 0 || !MvImageChooseAdapter.this.f128851g.b()) && MvImageChooseAdapter.this.f128850f != null) {
                    MvImageChooseAdapter.this.f128850f.a(view, myMediaModel);
                }
            }
        });
        eVar.f128874f.setOnClickListener(new com.ss.android.ugc.aweme.views.d() {
            /* class com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.AnonymousClass2 */

            static {
                Covode.recordClassIndex(84564);
            }

            @Override // com.ss.android.ugc.aweme.views.d
            public final void a(View view) {
                MvImageChooseAdapter mvImageChooseAdapter = MvImageChooseAdapter.this;
                e eVar = eVar;
                if (eVar.f128877i.v >= 0) {
                    com.ss.android.ugc.tools.utils.q.d("MvImageChooseAdapter handleImageSelected unSelect originIndex " + eVar.f128877i.u + " selectIndex " + eVar.f128877i.v + " stack " + be.a());
                    int i2 = eVar.f128877i.v;
                    int i3 = -1;
                    eVar.f128877i.v = -1;
                    for (int i4 = 0; i4 < mvImageChooseAdapter.f128848d.size(); i4++) {
                        MyMediaModel myMediaModel = mvImageChooseAdapter.f128848d.get(i4);
                        if (TextUtils.equals(myMediaModel.f109389a, eVar.f128877i.f109389a)) {
                            i3 = i4;
                        }
                        if (myMediaModel.v > i2) {
                            myMediaModel.v--;
                        }
                    }
                    if (i3 >= 0) {
                        mvImageChooseAdapter.f128848d.remove(i3);
                    }
                    if (mvImageChooseAdapter.f128848d.size() + 1 == mvImageChooseAdapter.f128845a) {
                        mvImageChooseAdapter.d();
                        mvImageChooseAdapter.notifyItemChanged(eVar.f128879k, new Object());
                    } else {
                        if (eVar.f128879k >= 0) {
                            mvImageChooseAdapter.notifyItemChanged(eVar.f128879k, new Object());
                        }
                        for (MyMediaModel myMediaModel2 : mvImageChooseAdapter.f128848d) {
                            mvImageChooseAdapter.notifyItemChanged(myMediaModel2.u, new Object());
                        }
                    }
                    if (mvImageChooseAdapter.f128851g != null) {
                        mvImageChooseAdapter.f128851g.a(mvImageChooseAdapter.f128848d, b.THUMBNAIL, eVar.f128877i);
                        mvImageChooseAdapter.f128851g.a(eVar.f128877i, false);
                        return;
                    }
                    return;
                }
                com.ss.android.ugc.tools.utils.q.d("MvImageChooseAdapter handleImageSelected select originIndex " + eVar.f128877i.u + " selectIndex " + eVar.f128877i.v);
                com.ss.android.ugc.tools.utils.i.a(eVar.f128877i.f109390b, new be(mvImageChooseAdapter, eVar));
            }
        });
        eVar.f128870b.setOnClickListener(new bc(eVar));
        if (!myMediaModel.b() || !this.f128853i) {
            eVar.f128871c.setVisibility(8);
            eVar.f128872d.setVisibility(8);
        } else {
            eVar.f128871c.setText(b(Math.round((((float) myMediaModel.f109396h) * 1.0f) / 1000.0f)));
            eVar.f128871c.setVisibility(0);
            if (com.ss.android.ugc.aweme.setting.i.a.a() == 0) {
                z4 = cj.a();
            } else {
                z4 = this.B;
            }
            View view = eVar.f128872d;
            if (!z4) {
                i4 = 8;
            }
            view.setVisibility(i4);
        }
        if (i2 == 0 && this.o) {
            b.a.f132249a.step(OpenAlbumPanelPerformanceMonitor.f132344a, "onBindFirst");
        } else if (i2 == c() && this.o) {
            b.a.f132249a.step(OpenAlbumPanelPerformanceMonitor.f132344a, "bindAll");
        }
    }

    public MvImageChooseAdapter(Context context, int i2, int i3, boolean z2) {
        this.f128847c = context;
        this.v = 1.0d;
        this.s = i2;
        this.o = z2;
        context.getResources().getDimensionPixelOffset(R.dimen.oj);
        this.f128849e = ((com.bytedance.common.utility.n.a(context) - ((i2 - 1) * ((int) com.bytedance.common.utility.n.b(context, 1.5f)))) - 0) / i2;
        this.f128846b = context.getString(R.string.adh);
        this.f128854j = i3;
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
}
