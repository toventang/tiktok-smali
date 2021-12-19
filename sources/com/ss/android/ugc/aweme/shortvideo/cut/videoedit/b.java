package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.g.e;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.g;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.a.c;
import com.ss.android.ugc.aweme.shortvideo.widget.p;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.d;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class b extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: a  reason: collision with root package name */
    public int f126145a;

    /* renamed from: b  reason: collision with root package name */
    public Context f126146b;

    /* renamed from: c  reason: collision with root package name */
    public HashMap<String, Float> f126147c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public List<e<String, e<Integer, Integer>>> f126148d;

    /* renamed from: e  reason: collision with root package name */
    public g f126149e;

    /* renamed from: f  reason: collision with root package name */
    public List<VideoSegment> f126150f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<VideoSegment> f126151g;

    /* renamed from: h  reason: collision with root package name */
    public t<Bitmap> f126152h;

    /* renamed from: i  reason: collision with root package name */
    public t<Boolean> f126153i;

    /* renamed from: j  reason: collision with root package name */
    public int f126154j;

    /* renamed from: k  reason: collision with root package name */
    public int f126155k;

    /* renamed from: l  reason: collision with root package name */
    public int f126156l;

    /* renamed from: m  reason: collision with root package name */
    public p f126157m;
    public List<Bitmap> n = new ArrayList();
    public boolean o;
    public com.ss.android.ugc.asve.editor.g p;
    private boolean q;

    static {
        Covode.recordClassIndex(82827);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final void a(boolean z) {
        g gVar = this.f126149e;
        if (gVar instanceof com.ss.android.ugc.aweme.shortvideo.widget.a) {
            ((com.ss.android.ugc.aweme.shortvideo.widget.a) gVar).f132889b = z;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        g gVar = this.f126149e;
        if (gVar != null) {
            gVar.b();
        }
    }

    private void b() {
        if (this.o) {
            int a2 = a((int) this.f126150f.get(0).f125478b, this.f126150f.get(0).a(true));
            c a3 = new c().a(this.f126154j, this.f126155k);
            a3.f128791m = this.f126153i;
            a3.f128790l = this.f126152h;
            a3.a(this.f126146b, this.p, a2, new c(this));
        }
        notifyDataSetChanged();
    }

    private void c() {
        int a2;
        List<e<String, e<Integer, Integer>>> list = this.f126148d;
        if (list == null) {
            this.f126148d = new ArrayList();
        } else {
            list.clear();
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f126150f.size(); i3++) {
            VideoSegment videoSegment = this.f126150f.get(i3);
            if (this.f126145a == 1) {
                a2 = a((int) (videoSegment.e() - videoSegment.d()), videoSegment.a(true));
            } else {
                a2 = a((int) videoSegment.f125478b, videoSegment.a(true));
            }
            Integer valueOf = Integer.valueOf(i2);
            i2 += a2;
            this.f126148d.add(e.a(videoSegment.a(true), e.a(valueOf, Integer.valueOf(i2 - 1))));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        int a2;
        if (this.o) {
            return this.n.size();
        }
        p pVar = this.f126157m;
        if (pVar != null) {
            return pVar.f132955a;
        }
        if (d.a(this.f126150f)) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f126150f.size(); i3++) {
            if (this.f126145a == 1) {
                a2 = a((int) (this.f126150f.get(i3).f125480d - this.f126150f.get(i3).f125479c), this.f126150f.get(i3).a(true));
            } else {
                a2 = a((int) this.f126150f.get(i3).f125478b, this.f126150f.get(i3).a(true));
            }
            i2 += a2;
        }
        return i2;
    }

    public final void a(int i2) {
        this.f126155k = i2;
        this.f126149e.a(i2);
    }

    public final void b(boolean z) {
        g gVar = this.f126149e;
        if (gVar instanceof VEMediaParserFrameProviderImpl) {
            ((VEMediaParserFrameProviderImpl) gVar).f125379a = z;
        }
    }

    public final void c(boolean z) {
        if (this.q ^ z) {
            this.q = z;
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof a) {
            com.facebook.common.h.a.c(((a) viewHolder).f126159b);
        }
    }

    private void b(HashMap<String, Float> hashMap) {
        for (String str : hashMap.keySet()) {
            this.f126147c.put(str, Float.valueOf(hashMap.get(str).floatValue() * ((float) this.f126154j)));
        }
    }

    /* access modifiers changed from: package-private */
    public class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        ImageView f126158a = ((ImageView) this.itemView.findViewById(R.id.c22));

        /* renamed from: b  reason: collision with root package name */
        com.facebook.common.h.a<com.facebook.imagepipeline.j.b> f126159b;

        static {
            Covode.recordClassIndex(82828);
        }

        /* access modifiers changed from: package-private */
        public final void a(Bitmap bitmap) {
            MethodCollector.i(6666);
            RecyclerView.j jVar = (RecyclerView.j) this.f126158a.getLayoutParams();
            int i2 = b.this.f126156l % b.this.f126157m.f132956b;
            int width = (bitmap.getWidth() * i2) / b.this.f126157m.f132956b;
            if (i2 == 0 || width <= 0 || width >= bitmap.getWidth()) {
                MethodCollector.o(6666);
                return;
            }
            jVar.width = i2;
            this.f126158a.setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, width, bitmap.getHeight()));
            MethodCollector.o(6666);
        }

        a(ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aa0, viewGroup, false));
        }

        /* access modifiers changed from: package-private */
        public final int a(String str, int i2) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < b.this.f126151g.size() && !str.equals(b.this.f126151g.get(i3).a(true))) {
                i4 = (int) (((long) i4) + b.this.f126151g.get(i3).f125478b);
                i3++;
            }
            return i4 + i2;
        }

        /* access modifiers changed from: package-private */
        public final void a(com.facebook.common.h.a<com.facebook.imagepipeline.j.b> aVar, boolean z) {
            Bitmap d2 = aVar.a().d();
            if (d2 != null && !d2.isRecycled() && this.f126158a != null) {
                com.facebook.common.h.a.c(this.f126159b);
                this.f126159b = aVar;
                this.f126158a.setImageBitmap(d2);
                if (z) {
                    a(d2);
                }
            }
        }
    }

    public final void a(HashMap<String, Float> hashMap) {
        b(hashMap);
        g gVar = this.f126149e;
        if (gVar != null) {
            gVar.b();
        }
        c();
        b();
    }

    public final void a(List<VideoSegment> list) {
        this.f126150f = new ArrayList(list);
        c();
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a(VideoSegment videoSegment, HashMap<String, Float> hashMap) {
        if (!d.a(this.f126150f)) {
            this.f126150f.remove(videoSegment);
            a(hashMap);
        }
    }

    public b(Context context, f fVar) {
        this.f126154j = fVar.f126170a[0];
        this.f126155k = fVar.f126170a[1];
        this.f126156l = fVar.f126170a[2];
        a(context, fVar.f126171b, fVar.f126172c, fVar.f126173d);
        if (fVar.f126174e != null) {
            this.f126157m = fVar.f126174e;
            this.f126149e = new com.ss.android.ugc.aweme.shortvideo.widget.a(fVar.f126174e);
            return;
        }
        this.f126149e = new VEMediaParserFrameProviderImpl(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r3 <= 0.0f) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(int r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.f126147c
            java.lang.Object r0 = r0.get(r6)
            if (r0 == 0) goto L_0x0050
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.f126147c
            java.lang.Object r0 = r0.get(r6)
            java.lang.Float r0 = (java.lang.Float) r0
            float r3 = r0.floatValue()
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0047
        L_0x0019:
            com.ss.android.ugc.tools.utils.j r2 = com.ss.android.ugc.tools.c.f149151f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "duration: "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r0 = " oneFrameDurMap"
            java.lang.StringBuilder r1 = r1.append(r0)
            java.util.HashMap<java.lang.String, java.lang.Float> r0 = r4.f126147c
            java.lang.Object r0 = r0.get(r6)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r0 = " path: "
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            r2.c(r0)
        L_0x0047:
            float r0 = (float) r5
            float r0 = r0 / r3
            double r0 = (double) r0
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            return r0
        L_0x0050:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.b.a(int, java.lang.String):int");
    }

    /* access modifiers changed from: package-private */
    public final void a(HashMap<String, Float> hashMap, VideoSegment videoSegment) {
        this.f126150f.clear();
        this.f126150f.add(videoSegment);
        a(hashMap);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        float min;
        float f2;
        float floatValue;
        int i3 = i2;
        if (viewHolder instanceof a) {
            if (this.q) {
                int itemCount = getItemCount();
                int i4 = (itemCount - i3) - 1;
                if (i4 >= 0 && i4 < itemCount) {
                    i3 = i4;
                }
            }
            if (this.f126157m != null) {
                a aVar = (a) viewHolder;
                RecyclerView.j jVar = (RecyclerView.j) aVar.f126158a.getLayoutParams();
                jVar.height = b.this.f126155k;
                jVar.width = b.this.f126157m.f132956b;
                aVar.f126158a.setLayoutParams(jVar);
                aVar.f126158a.setImageBitmap(null);
                aVar.f126158a.setBackgroundColor(b.this.f126146b.getResources().getColor(R.color.e3));
                if (b.this.o) {
                    aVar.f126158a.setImageBitmap(b.this.n.get(i3));
                    if (i3 == b.this.getItemCount() - 1) {
                        aVar.a(b.this.n.get(i3));
                    }
                } else if (b.this.f126149e != null) {
                    b.this.f126149e.a(i3, "", 0, new d(aVar, i3));
                }
            } else {
                a aVar2 = (a) viewHolder;
                b.this.c();
                b bVar = b.this;
                for (int i5 = 0; i5 < bVar.f126148d.size(); i5++) {
                    S s = bVar.f126148d.get(i5).f2398b;
                    if (i3 >= s.f2397a.intValue() && i3 <= s.f2398b.intValue()) {
                        if (i5 >= 0) {
                            S s2 = b.this.f126148d.get(i5).f2398b;
                            if (b.this.f126145a == 1) {
                                min = Math.min((((float) (i3 - s2.f2397a.intValue())) * b.this.f126147c.get(b.this.f126150f.get(i5).a(true)).floatValue()) + ((float) b.this.f126150f.get(i5).d()), (float) b.this.f126150f.get(i5).e());
                            } else {
                                min = Math.min(((float) (i3 - s2.f2397a.intValue())) * b.this.f126147c.get(b.this.f126150f.get(i5).a(true)).floatValue(), (float) b.this.f126150f.get(i5).f125478b);
                            }
                            int i6 = (int) min;
                            String str = i5 + "-" + i6;
                            aVar2.f126158a.setTag(str);
                            RecyclerView.j jVar2 = (RecyclerView.j) aVar2.f126158a.getLayoutParams();
                            jVar2.height = b.this.f126155k;
                            jVar2.width = b.this.f126154j;
                            if (i3 == s2.f2398b.intValue()) {
                                if (b.this.f126145a == 1) {
                                    f2 = (float) (b.this.f126150f.get(i5).e() - b.this.f126150f.get(i5).d());
                                    floatValue = b.this.f126147c.get(b.this.f126150f.get(i5).a(true)).floatValue();
                                } else {
                                    f2 = (float) b.this.f126150f.get(i5).f125478b;
                                    floatValue = b.this.f126147c.get(b.this.f126150f.get(i5).a(true)).floatValue();
                                }
                                double floatValue2 = (double) ((f2 % floatValue) / b.this.f126147c.get(b.this.f126150f.get(i5).a(true)).floatValue());
                                double d2 = (double) b.this.f126154j;
                                Double.isNaN(floatValue2);
                                Double.isNaN(d2);
                                jVar2.width = (int) (floatValue2 * d2);
                            }
                            aVar2.f126158a.setLayoutParams(jVar2);
                            aVar2.f126158a.setImageBitmap(null);
                            aVar2.f126158a.setBackgroundColor(b.this.f126146b.getResources().getColor(R.color.e3));
                            if (b.this.o) {
                                aVar2.f126158a.setImageBitmap(b.this.n.get(i3));
                                return;
                            } else if (b.this.f126149e != null) {
                                String a2 = b.this.f126150f.get(i5).a(false);
                                g gVar = b.this.f126149e;
                                aVar2.a(b.this.f126150f.get(i5).a(true), i6);
                                gVar.a(i3, a2, i6, new e(aVar2, aVar2, str, i3, s2, a2));
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(List<VideoSegment> list, HashMap<String, Float> hashMap) {
        this.f126150f.clear();
        this.f126150f.addAll(list);
        a(hashMap);
    }

    private static RecyclerView.ViewHolder a(b bVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7145);
        a aVar = new a(viewGroup);
        try {
            if (aVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.o(7145);
        return aVar;
    }

    private void a(Context context, List<VideoSegment> list, HashMap<String, Float> hashMap, int i2) {
        this.f126146b = context;
        this.f126145a = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            VideoSegment videoSegment = list.get(i3);
            this.f126147c.put(videoSegment.a(true), Float.valueOf(hashMap.get(videoSegment.a(true)).floatValue() * ((float) this.f126154j)));
        }
        this.f126151g = list;
    }
}
