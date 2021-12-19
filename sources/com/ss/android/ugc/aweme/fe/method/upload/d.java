package com.ss.android.ugc.aweme.fe.method.upload;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.h;
import com.zhiliaoapp.musically.R;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class d extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f91357k = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    List<Integer> f91358a;

    /* renamed from: b  reason: collision with root package name */
    public List<Integer> f91359b;

    /* renamed from: c  reason: collision with root package name */
    public List<f> f91360c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f91361d;

    /* renamed from: e  reason: collision with root package name */
    public m<? super View, ? super String, z> f91362e;

    /* renamed from: f  reason: collision with root package name */
    public h.f.a.b<? super List<f>, z> f91363f;

    /* renamed from: g  reason: collision with root package name */
    final Context f91364g;

    /* renamed from: h  reason: collision with root package name */
    public final int f91365h;

    /* renamed from: i  reason: collision with root package name */
    final long f91366i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f91367j;

    /* renamed from: l  reason: collision with root package name */
    private final ArrayList<MediaModel> f91368l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private final int f91369m;
    private final Boolean n;
    private final double o = 1.0d;

    static {
        Covode.recordClassIndex(57505);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final long getItemId(int i2) {
        return (long) i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57506);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f91368l.size();
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public RemoteImageView f91370a;

        /* renamed from: b  reason: collision with root package name */
        public TextView f91371b;

        /* renamed from: c  reason: collision with root package name */
        public FrameLayout f91372c;

        /* renamed from: d  reason: collision with root package name */
        public View f91373d;

        /* renamed from: e  reason: collision with root package name */
        public String f91374e;

        static {
            Covode.recordClassIndex(57507);
        }

        public final void a() {
            TextView textView = this.f91371b;
            if (textView != null) {
                textView.setText("");
            }
            TextView textView2 = this.f91371b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.azw);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
        }

        public final void a(int i2) {
            TextView textView = this.f91371b;
            if (textView != null) {
                textView.setText(String.valueOf(i2 + 1));
            }
            TextView textView2 = this.f91371b;
            if (textView2 != null) {
                textView2.setBackgroundResource(R.drawable.azx);
            }
        }
    }

    static final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f91375a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ d f91376b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f91377c;

        static {
            Covode.recordClassIndex(57508);
        }

        c(View view, d dVar, int i2) {
            this.f91375a = view;
            this.f91376b = dVar;
            this.f91377c = i2;
        }

        public final void run() {
            this.f91375a.setVisibility(4);
            this.f91375a.setAlpha(1.0f);
            this.f91376b.notifyItemChanged(this.f91377c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.upload.d$d  reason: collision with other inner class name */
    static final class RunnableC2204d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f91378a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f91379b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f91380c;

        static {
            Covode.recordClassIndex(57509);
        }

        RunnableC2204d(d dVar, int i2, int i3) {
            this.f91378a = dVar;
            this.f91379b = i2;
            this.f91380c = i3;
        }

        public final void run() {
            if (this.f91379b == this.f91378a.f91365h) {
                this.f91378a.notifyDataSetChanged();
            } else {
                this.f91378a.notifyItemChanged(this.f91380c);
            }
            h.f.a.b<? super List<f>, z> bVar = this.f91378a.f91363f;
            if (bVar != null) {
                bVar.invoke(this.f91378a.f91360c);
            }
        }
    }

    public final void a(Collection<? extends MediaModel> collection) {
        l.d(collection, "");
        this.f91368l.clear();
        this.f91368l.addAll(collection);
        a(this.f91368l.size());
        notifyDataSetChanged();
    }

    static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f91381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f91382b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f91383c;

        static {
            Covode.recordClassIndex(57510);
        }

        e(d dVar, int i2, b bVar) {
            this.f91381a = dVar;
            this.f91382b = i2;
            this.f91383c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f91381a.f91361d) {
                if (this.f91382b < 0) {
                    List<Integer> list = this.f91381a.f91359b;
                    if (list == null) {
                        l.b();
                    }
                    if (list.size() >= this.f91381a.f91365h) {
                        return;
                    }
                }
                m<? super View, ? super String, z> mVar = this.f91381a.f91362e;
                if (mVar != null) {
                    l.b(view, "");
                    mVar.invoke(view, h.d(this.f91383c.f91374e).toString());
                }
            }
        }
    }

    private final void a(int i2) {
        List<Integer> list = this.f91359b;
        if (list == null) {
            this.f91359b = new ArrayList();
        } else {
            list.clear();
        }
        List<Integer> list2 = this.f91358a;
        if (list2 == null) {
            this.f91358a = new ArrayList();
        } else {
            list2.clear();
        }
        for (int i3 = 0; i3 < i2; i3++) {
            List<Integer> list3 = this.f91358a;
            if (list3 != null) {
                list3.add(-1);
            }
        }
    }

    private final void a(View view) {
        ViewGroup.LayoutParams layoutParams;
        if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width != this.f91369m) {
            int i2 = layoutParams.height;
            int i3 = this.f91369m;
            double d2 = (double) i3;
            double d3 = this.o;
            Double.isNaN(d2);
            if (i2 != ((int) (d2 * d3))) {
                layoutParams.width = i3;
                double d4 = (double) this.f91369m;
                double d5 = this.o;
                Double.isNaN(d4);
                layoutParams.height = (int) (d4 * d5);
            }
        }
    }

    static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f91384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f91385b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediaModel f91386c;

        static {
            Covode.recordClassIndex(57511);
        }

        f(d dVar, b bVar, MediaModel mediaModel) {
            this.f91384a = dVar;
            this.f91385b = bVar;
            this.f91386c = mediaModel;
        }

        /* JADX WARNING: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x016f  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x01ad  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x01bd  */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01e0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r16) {
            /*
            // Method dump skipped, instructions count: 521
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fe.method.upload.d.f.onClick(android.view.View):void");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        float f2;
        l.d(viewHolder, "");
        b bVar = (b) viewHolder;
        a(bVar.f91370a);
        a(bVar.f91373d);
        MediaModel mediaModel = this.f91368l.get(i2);
        l.b(mediaModel, "");
        MediaModel mediaModel2 = mediaModel;
        List<Integer> list = this.f91358a;
        if (list == null) {
            l.b();
        }
        int intValue = list.get(i2).intValue();
        int i3 = 0;
        float f3 = 1.0f;
        if (intValue >= 0) {
            bVar.a(intValue);
            View view = bVar.f91373d;
            if (view != null) {
                view.setVisibility(0);
            }
            f2 = 1.1f;
        } else {
            bVar.a();
            View view2 = bVar.f91373d;
            if (view2 != null) {
                view2.setVisibility(4);
            }
            List<Integer> list2 = this.f91359b;
            if (list2 != null) {
                i3 = list2.size();
            }
            if (i3 >= this.f91365h) {
                f3 = 0.5f;
            } else {
                f3 = 1.0f;
            }
            f2 = 1.0f;
        }
        RemoteImageView remoteImageView = bVar.f91370a;
        if (remoteImageView != null) {
            if (remoteImageView.getAlpha() != f3) {
                remoteImageView.setAlpha(f3);
            }
            if (remoteImageView.getScaleX() != f2) {
                remoteImageView.setScaleX(f2);
                remoteImageView.setScaleY(f2);
            }
        }
        if (!TextUtils.equals(bVar.f91374e, mediaModel2.f109390b)) {
            bVar.f91374e = mediaModel2.f109390b;
            RemoteImageView remoteImageView2 = bVar.f91370a;
            String uri = h.d(bVar.f91374e).toString();
            int i4 = this.f91369m;
            com.ss.android.ugc.aweme.base.e.b(remoteImageView2, uri, i4, i4);
        }
        bVar.itemView.setOnClickListener(new e(this, intValue, bVar));
        FrameLayout frameLayout = bVar.f91372c;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new f(this, bVar, mediaModel2));
        }
    }

    private static RecyclerView.ViewHolder a(d dVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(11857);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(dVar.f91364g), R.layout.v7, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3);
        bVar.f91370a = (RemoteImageView) a3.findViewById(R.id.cl_);
        bVar.f91371b = (TextView) a3.findViewById(R.id.bmg);
        bVar.f91372c = (FrameLayout) a3.findViewById(R.id.b5m);
        bVar.f91373d = a3.findViewById(R.id.e08);
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
        MethodCollector.o(11857);
        return bVar;
    }

    public d(Context context, int i2, int i3, long j2, boolean z, Boolean bool) {
        l.d(context, "");
        this.f91364g = context;
        this.f91365h = i3;
        this.f91366i = j2;
        this.f91367j = z;
        this.n = bool;
        context.getResources().getDimensionPixelOffset(R.dimen.gp);
        this.f91369m = ((n.a(context) - ((i2 - 1) * ((int) n.b(context, 1.5f)))) + 0) / i2;
    }
}
