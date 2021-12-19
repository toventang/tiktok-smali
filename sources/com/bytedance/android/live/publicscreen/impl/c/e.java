package com.bytedance.android.live.publicscreen.impl.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.publicscreen.impl.c.d;
import com.bytedance.android.livesdk.model.FansClubData;
import com.bytedance.android.livesdk.model.FansClubMember;
import com.bytedance.android.livesdk.utils.ae;
import com.bytedance.android.livesdk.widget.f;
import com.bytedance.android.livesdkapi.depend.model.TextImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class e extends RecyclerView.a<b> {

    /* renamed from: d  reason: collision with root package name */
    public static final float f12250d = 3.0f;

    /* renamed from: e  reason: collision with root package name */
    public static final float f12251e = 0.53f;

    /* renamed from: f  reason: collision with root package name */
    public static final float f12252f = 0.47f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f12253g = 0.4f;

    /* renamed from: h  reason: collision with root package name */
    public static final float f12254h = 0.65f;

    /* renamed from: i  reason: collision with root package name */
    public static int f12255i;

    /* renamed from: j  reason: collision with root package name */
    public static final a f12256j = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    LayoutInflater f12257a;

    /* renamed from: b  reason: collision with root package name */
    List<? extends d> f12258b;

    /* renamed from: c  reason: collision with root package name */
    public Room f12259c;

    /* access modifiers changed from: package-private */
    public interface c {
        static {
            Covode.recordClassIndex(6749);
        }

        Room a();
    }

    /* access modifiers changed from: package-private */
    public static final class d extends b {

        /* renamed from: c  reason: collision with root package name */
        public static float f12260c;

        /* renamed from: d  reason: collision with root package name */
        static Paint f12261d = new Paint();

        /* renamed from: e  reason: collision with root package name */
        static Paint f12262e = new Paint();

        /* renamed from: f  reason: collision with root package name */
        public static final a f12263f = new a((byte) 0);

        /* renamed from: a  reason: collision with root package name */
        public TextView f12264a;

        /* renamed from: b  reason: collision with root package name */
        public c f12265b;

        /* renamed from: g  reason: collision with root package name */
        private Spannable f12266g;

        public static final class a {
            static {
                Covode.recordClassIndex(6751);
            }

            private a() {
            }

            public /* synthetic */ a(byte b2) {
                this();
            }
        }

        static final class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f12267a;

            static {
                Covode.recordClassIndex(6752);
            }

            b(d dVar) {
                this.f12267a = dVar;
            }

            public final void run() {
                if (this.f12267a.f12264a != null) {
                    e.f12255i = this.f12267a.f12264a.getHeight();
                }
            }
        }

        static {
            Covode.recordClassIndex(6750);
        }

        private final void a(List<? extends TextImageModel> list) {
            Bitmap a2;
            if (!list.isEmpty()) {
                SparseArray<ImageSpan> sparseArray = new SparseArray<>();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((TextImageModel) list.get(i2)).f22993c == 2) {
                        Context context = this.f12264a.getContext();
                        int i3 = ((TextImageModel) list.get(i2)).f22994d;
                        if ((i3 == ae.f22225a || i3 == ae.f22226b) && (a2 = ae.a(context, i3, context.getResources().getDimensionPixelSize(R.dimen.x6), context.getResources().getDimensionPixelSize(R.dimen.x5))) != null && !a2.isRecycled()) {
                            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f12264a.getResources(), a2);
                            bitmapDrawable.setBounds(0, 0, a2.getWidth(), a2.getHeight());
                            sparseArray.put(i2, new f(bitmapDrawable));
                            a(sparseArray, list);
                        }
                    } else {
                        ((com.bytedance.android.livesdkapi.host.e) com.bytedance.android.live.t.a.a(com.bytedance.android.livesdkapi.host.e.class)).a((ImageModel) list.get(i2), new c(this, sparseArray, i2, list));
                    }
                }
            }
        }

        public static final class c implements e.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ d f12268a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SparseArray f12269b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f12270c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ List f12271d;

            static {
                Covode.recordClassIndex(6753);
            }

            @Override // com.bytedance.android.livesdkapi.host.e.b
            public final void a(Bitmap bitmap) {
                MethodCollector.i(6106);
                if (bitmap == null) {
                    this.f12269b.put(this.f12270c, null);
                    this.f12268a.a(this.f12269b, this.f12271d);
                    MethodCollector.o(6106);
                    return;
                }
                TextImageModel textImageModel = (TextImageModel) this.f12271d.get(this.f12270c);
                Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                float width = ((float) bitmap.getWidth()) * d.f12260c;
                float height = ((float) bitmap.getHeight()) * d.f12260c;
                if (!TextUtils.isEmpty(textImageModel.f22991a) && textImageModel.f22993c == 1) {
                    String str = textImageModel.f22991a;
                    l.b(str, "");
                    l.b(copy, "");
                    float width2 = (float) bitmap.getWidth();
                    float height2 = (float) bitmap.getHeight();
                    d.f12261d.setTextSize(e.f12251e * height2);
                    d.f12262e.setColor(-1);
                    float measureText = d.f12261d.measureText(str);
                    float f2 = width2 - height2;
                    if (measureText > f2) {
                        measureText = f2;
                    }
                    Canvas canvas = new Canvas(copy);
                    Paint.FontMetrics fontMetrics = d.f12261d.getFontMetrics();
                    canvas.drawText(str, height2 + ((f2 - measureText) / 2.0f), ((height2 - (fontMetrics.descent - fontMetrics.ascent)) / 2.0f) + Math.abs(fontMetrics.ascent), d.f12261d);
                } else if (!TextUtils.isEmpty(textImageModel.f22991a) && textImageModel.f22993c == 3) {
                    this.f12268a.f12264a.getContext();
                    String str2 = textImageModel.f22991a;
                    if (!(copy == null || str2 == null)) {
                        com.bytedance.android.livesdk.chatroom.g.l.f15551a.setColor(-1);
                        Typeface a2 = com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33795a);
                        if (a2 != null) {
                            com.bytedance.android.livesdk.chatroom.g.l.f15551a.setTypeface(a2);
                        }
                        float width3 = (float) copy.getWidth();
                        float height3 = (float) copy.getHeight();
                        com.bytedance.android.livesdk.chatroom.g.l.f15551a.setTextSize(0.55f * height3);
                        float measureText2 = com.bytedance.android.livesdk.chatroom.g.l.f15551a.measureText(str2);
                        Canvas canvas2 = new Canvas(copy);
                        Paint.FontMetrics fontMetrics2 = com.bytedance.android.livesdk.chatroom.g.l.f15551a.getFontMetrics();
                        canvas2.drawText(str2, height3 + (((width3 - height3) - measureText2) / 2.0f), ((height3 - (fontMetrics2.bottom - fontMetrics2.top)) / 2.0f) + Math.abs(fontMetrics2.top), com.bytedance.android.livesdk.chatroom.g.l.f15551a);
                    }
                }
                if (textImageModel.f22993c == 4) {
                    String str3 = textImageModel.f22991a;
                    l.b(str3, "");
                    int i2 = textImageModel.f22992b;
                    l.b(copy, "");
                    float width4 = (float) bitmap.getWidth();
                    float height4 = (float) bitmap.getHeight();
                    d.f12262e.setTextSize(e.f12252f * height4);
                    d.f12262e.setColor(i2);
                    float measureText3 = d.f12262e.measureText(str3);
                    float f3 = width4 - height4;
                    if (measureText3 > f3) {
                        measureText3 = f3;
                    }
                    Canvas canvas3 = new Canvas(copy);
                    Paint.FontMetrics fontMetrics3 = d.f12262e.getFontMetrics();
                    canvas3.drawText(str3, height4 + ((f3 - measureText3) * e.f12253g), ((height4 - (fontMetrics3.descent - fontMetrics3.ascent)) * e.f12254h) + Math.abs(fontMetrics3.ascent), d.f12262e);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f12268a.f12264a.getResources(), copy);
                bitmapDrawable.setBounds(0, 0, (int) width, (int) height);
                this.f12269b.put(this.f12270c, new f(bitmapDrawable));
                this.f12268a.a(this.f12269b, this.f12271d);
                MethodCollector.o(6106);
            }

            c(d dVar, SparseArray sparseArray, int i2, List list) {
                this.f12268a = dVar;
                this.f12269b = sparseArray;
                this.f12270c = i2;
                this.f12271d = list;
            }
        }

        @Override // com.bytedance.android.live.publicscreen.impl.c.e.b
        public final void a(d dVar) {
            Spannable spannable;
            User owner;
            FansClubMember fansClub;
            FansClubData fansClubData;
            ImageModel imageModel;
            if (dVar != null) {
                spannable = dVar.b();
            } else {
                spannable = null;
            }
            this.f12266g = spannable;
            this.f12264a.setText(spannable);
            this.f12264a.setBackgroundResource(R.drawable.bsj);
            this.f12264a.setTextColor(y.b((int) R.color.yk));
            if (dVar != null && dVar.a() == d.a.f12248c) {
                ArrayList arrayList = new ArrayList();
                Room a2 = this.f12265b.a();
                if (!(a2 == null || (owner = a2.getOwner()) == null || (fansClub = owner.getFansClub()) == null)) {
                    if (FansClubData.isValid(fansClub.getData())) {
                        fansClubData = fansClub.getData();
                    } else {
                        fansClubData = fansClub.getPreferData().get(1);
                    }
                    if (!(!FansClubData.isValid(fansClubData) || fansClubData == null || (imageModel = fansClubData.badge.icons.get(2)) == null)) {
                        TextImageModel textImageModel = new TextImageModel(imageModel, 1);
                        textImageModel.f22991a = fansClubData.clubName;
                        arrayList.add(textImageModel);
                    }
                }
                a(arrayList);
            }
            this.f12264a.post(new b(this));
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(View view, c cVar) {
            super(view);
            l.d(view, "");
            l.d(cVar, "");
            this.f12265b = cVar;
            View findViewById = view.findViewById(R.id.text);
            l.b(findViewById, "");
            this.f12264a = (TextView) findViewById;
            if (f12260c <= 0.0f) {
                Resources resources = view.getResources();
                l.b(resources, "");
                f12260c = resources.getDisplayMetrics().density / e.f12250d;
            }
            f12261d.setColor(-1);
            f12261d.setStyle(Paint.Style.FILL_AND_STROKE);
            f12261d.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
            f12262e.setStyle(Paint.Style.FILL_AND_STROKE);
            f12262e.setTypeface(com.bytedance.ies.dmt.ui.widget.util.b.a().a(com.bytedance.ies.dmt.ui.widget.util.d.f33801g));
        }

        public final void a(SparseArray<ImageSpan> sparseArray, List<? extends TextImageModel> list) {
            if (sparseArray.size() >= list.size()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int size = sparseArray.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ImageSpan imageSpan = sparseArray.get(sparseArray.keyAt(i2));
                    if (imageSpan != null) {
                        spannableStringBuilder.append((CharSequence) "0");
                        spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                }
                spannableStringBuilder.append((CharSequence) this.f12266g);
                this.f12264a.setText(spannableStringBuilder);
            }
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(6747);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.publicscreen.impl.c.e$e  reason: collision with other inner class name */
    public static final class C0258e implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f12272a;

        static {
            Covode.recordClassIndex(6754);
        }

        @Override // com.bytedance.android.live.publicscreen.impl.c.e.c
        public final Room a() {
            return this.f12272a.f12259c;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C0258e(e eVar) {
            this.f12272a = eVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<? extends d> list = this.f12258b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    static {
        Covode.recordClassIndex(6746);
    }

    public final void a(Room room) {
        l.d(room, "");
        this.f12259c = room;
    }

    public static abstract class b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(6748);
        }

        public abstract void a(d dVar);

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        d dVar;
        List<? extends d> list = this.f12258b;
        if (list == null || (dVar = (d) list.get(i2)) == null) {
            return 0;
        }
        return dVar.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        d dVar;
        b bVar2 = bVar;
        l.d(bVar2, "");
        List<? extends d> list = this.f12258b;
        if (list != null) {
            dVar = (d) list.get(i2);
        } else {
            dVar = null;
        }
        bVar2.a(dVar);
    }

    private static RecyclerView.ViewHolder a(e eVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(7353);
        l.d(viewGroup, "");
        LayoutInflater layoutInflater = eVar.f12257a;
        if (layoutInflater == null) {
            l.b();
        }
        View a3 = com.a.a(layoutInflater, R.layout.b_h, viewGroup, false);
        l.b(a3, "");
        d dVar = new d(a3, new C0258e(eVar));
        try {
            if (dVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(dVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) dVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(dVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = dVar.getClass().getName();
        MethodCollector.o(7353);
        return dVar;
    }
}
