package com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class c extends RecyclerView.a<a> {

    /* renamed from: a  reason: collision with root package name */
    public float f126240a;

    /* renamed from: b  reason: collision with root package name */
    public List<p<Integer, Integer>> f126241b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public List<VideoSegment> f126242c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public int f126243d;

    /* renamed from: e  reason: collision with root package name */
    public int f126244e;

    /* renamed from: f  reason: collision with root package name */
    public float f126245f;

    /* renamed from: g  reason: collision with root package name */
    public Context f126246g;

    /* renamed from: h  reason: collision with root package name */
    public VEMediaParserProviderV2 f126247h;

    /* renamed from: i  reason: collision with root package name */
    public int f126248i;

    /* renamed from: j  reason: collision with root package name */
    private int f126249j;

    static {
        Covode.recordClassIndex(82874);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        if (this.f126242c.isEmpty()) {
            return 0;
        }
        return this.f126249j;
    }

    public final void a(int i2) {
        this.f126244e = i2;
        this.f126247h.f126206e = i2;
    }

    public final void a(boolean z) {
        this.f126247h.f126202a = z;
    }

    private final int a(float f2) {
        float ceil = (float) Math.ceil((double) (f2 / this.f126240a));
        if (Float.isNaN(ceil)) {
            return 0;
        }
        return h.g.a.a(ceil);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onViewRecycled(a aVar) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        super.onViewRecycled(aVar2);
        aVar2.f126250a.setImageBitmap(null);
        Bitmap bitmap = aVar2.f126251b;
        if (bitmap != null) {
            bitmap.recycle();
        }
        aVar2.f126251b = null;
    }

    public final class a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public ImageView f126250a;

        /* renamed from: b  reason: collision with root package name */
        public Bitmap f126251b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f126252c;

        static {
            Covode.recordClassIndex(82875);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.c$a$a  reason: collision with other inner class name */
        public static final class C3284a implements a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f126253a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f126254b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f126255c;

            static {
                Covode.recordClassIndex(82876);
            }

            @Override // com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.a
            public final void a(Bitmap bitmap) {
                l.d(bitmap, "");
                if (l.a(this.f126254b.f126250a.getTag(), (Object) this.f126255c)) {
                    this.f126253a.f126250a.setImageBitmap(bitmap);
                    Bitmap bitmap2 = this.f126253a.f126251b;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                    }
                    this.f126253a.f126251b = null;
                    this.f126253a.f126251b = bitmap;
                }
            }

            C3284a(a aVar, a aVar2, String str) {
                this.f126253a = aVar;
                this.f126254b = aVar2;
                this.f126255c = str;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, View view) {
            super(view);
            l.d(view, "");
            this.f126252c = cVar;
            this.f126250a = (ImageView) view;
        }
    }

    private final int b(float f2) {
        this.f126241b.clear();
        int i2 = 0;
        if (this.f126248i == 1) {
            for (VideoSegment videoSegment : this.f126242c) {
                int a2 = a(((float) (videoSegment.e() - videoSegment.d())) / videoSegment.f());
                List<p<Integer, Integer>> list = this.f126241b;
                Integer valueOf = Integer.valueOf(i2);
                i2 += a2;
                list.add(new p<>(valueOf, Integer.valueOf(i2 - 1)));
            }
            return i2;
        }
        VideoSegment videoSegment2 = this.f126242c.get(0);
        this.f126245f = videoSegment2.f();
        if (f2 != 0.0f) {
            this.f126245f = f2;
        }
        int a3 = a(((float) videoSegment2.f125478b) / this.f126245f);
        this.f126241b.add(new p<>(0, Integer.valueOf(a3 - 1)));
        return a3;
    }

    public final void a(List<? extends VideoSegment> list) {
        l.d(list, "");
        this.f126242c = new ArrayList(list);
        this.f126249j = b(0.0f);
        this.f126247h.d();
        notifyDataSetChanged();
    }

    public final void a(float f2, float f3) {
        b(f2, f3);
    }

    /* access modifiers changed from: package-private */
    public final void b(float f2, float f3) {
        this.f126240a = f2 * ((float) this.f126243d);
        this.f126249j = b(f3);
        this.f126247h.d();
        notifyDataSetChanged();
    }

    public final void a(float f2, VideoSegment videoSegment) {
        l.d(videoSegment, "");
        this.f126242c.clear();
        this.f126242c.add(videoSegment);
        b(f2, 0.0f);
    }

    public final void a(List<? extends VideoSegment> list, float f2) {
        l.d(list, "");
        this.f126242c = new ArrayList(list);
        b(f2, 0.0f);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(a aVar, int i2) {
        float min;
        float floatValue;
        a aVar2 = aVar;
        l.d(aVar2, "");
        l.d(aVar2, "");
        int size = aVar2.f126252c.f126241b.size();
        for (int i3 = 0; i3 < size; i3++) {
            p<Integer, Integer> pVar = aVar2.f126252c.f126241b.get(i3);
            if (i2 >= pVar.getFirst().intValue() && i2 <= pVar.getSecond().intValue()) {
                p<Integer, Integer> pVar2 = aVar2.f126252c.f126241b.get(i3);
                VideoSegment videoSegment = aVar2.f126252c.f126242c.get(i3);
                if (aVar2.f126252c.f126248i == 1) {
                    min = Math.min((((float) (i2 - pVar2.getFirst().intValue())) * aVar2.f126252c.f126240a * videoSegment.f()) + ((float) videoSegment.d()), (float) videoSegment.e());
                } else {
                    min = Math.min(((float) (i2 - pVar2.getFirst().intValue())) * aVar2.f126252c.f126240a * aVar2.f126252c.f126245f, (float) videoSegment.f125478b);
                }
                String sb = new StringBuilder().append(i3).append('-').append(min).toString();
                aVar2.f126250a.setTag(sb);
                View view = aVar2.itemView;
                l.b(view, "");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                RecyclerView.j jVar = (RecyclerView.j) layoutParams;
                jVar.height = aVar2.f126252c.f126244e;
                jVar.width = aVar2.f126252c.f126243d;
                if (i2 == pVar2.getSecond().intValue()) {
                    if (aVar2.f126252c.f126248i == 1) {
                        floatValue = (((float) (videoSegment.e() - videoSegment.d())) / videoSegment.f()) - (aVar2.f126252c.f126240a * ((float) (pVar2.getSecond().intValue() - pVar2.getFirst().intValue())));
                    } else {
                        floatValue = (((float) videoSegment.f125478b) / aVar2.f126252c.f126245f) - (aVar2.f126252c.f126240a * pVar2.getSecond().floatValue());
                    }
                    if (floatValue >= 0.0f) {
                        jVar.width = h.g.a.a((floatValue / aVar2.f126252c.f126240a) * ((float) aVar2.f126252c.f126243d));
                    }
                }
                View view2 = aVar2.itemView;
                l.b(view2, "");
                view2.setLayoutParams(jVar);
                Bitmap bitmap = aVar2.f126251b;
                if (bitmap != null && bitmap.isRecycled()) {
                    ImageView imageView = aVar2.f126250a;
                    if (aVar2.f126252c.f126248i == 1) {
                        imageView.setBackground(aVar2.f126252c.f126246g.getResources().getDrawable(2131230978));
                    } else {
                        imageView.setBackground(aVar2.f126252c.f126246g.getResources().getDrawable(2131230984));
                    }
                }
                String a2 = aVar2.f126252c.f126242c.get(i3).a(false);
                VEMediaParserProviderV2 vEMediaParserProviderV2 = aVar2.f126252c.f126247h;
                l.b(a2, "");
                a.C3284a aVar3 = new a.C3284a(aVar2, aVar2, sb);
                l.d(a2, "");
                l.d(aVar3, "");
                vEMediaParserProviderV2.a(i2, a2, (int) min, (a) aVar3, true);
                return;
            }
        }
        throw new IllegalArgumentException("unknow pos = ".concat(String.valueOf(i2)));
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(4465);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(cVar.f126246g), R.layout.aa1, viewGroup, false);
        l.b(a3, "");
        a aVar = new a(cVar, a3);
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
        MethodCollector.o(4465);
        return aVar;
    }

    public c(Context context, int[] iArr, float f2, VEMediaParserProviderV2 vEMediaParserProviderV2, int i2) {
        l.d(context, "");
        l.d(iArr, "");
        l.d(vEMediaParserProviderV2, "");
        this.f126246g = context;
        this.f126247h = vEMediaParserProviderV2;
        this.f126248i = i2;
        int i3 = iArr[0];
        this.f126243d = i3;
        this.f126244e = iArr[1];
        this.f126240a = f2 * ((float) i3);
    }
}
