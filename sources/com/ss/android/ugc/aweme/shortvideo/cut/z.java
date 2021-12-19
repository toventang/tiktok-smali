package com.ss.android.ugc.aweme.shortvideo.cut;

import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.g.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.facebook.drawee.view.SimpleDraweeView;
import com.ss.android.ugc.aweme.ba.d;
import com.ss.android.ugc.aweme.port.in.i;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.f;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtPlusView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.editcut.m;
import com.ss.android.ugc.aweme.shortvideo.en;
import com.ss.android.ugc.aweme.utils.db;
import com.ss.android.ugc.aweme.utils.gg;
import com.ss.android.ugc.tools.utils.h;
import com.ss.android.ugc.tools.utils.k;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class z extends RecyclerView.a<RecyclerView.ViewHolder> implements l {

    /* renamed from: a  reason: collision with root package name */
    public List<ac> f126299a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f126300b = 0;

    /* renamed from: c  reason: collision with root package name */
    public b f126301c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f126302d = true;

    /* renamed from: e  reason: collision with root package name */
    protected VideoEditViewModel f126303e;

    /* renamed from: f  reason: collision with root package name */
    protected CutMultiVideoViewModel f126304f;

    /* renamed from: g  reason: collision with root package name */
    public db f126305g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f126306h = true;

    public interface b {
        static {
            Covode.recordClassIndex(82899);
        }

        void a(int i2, String str);
    }

    static {
        Covode.recordClassIndex(82897);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final void a(List<VideoSegment> list) {
        this.f126299a.clear();
        for (VideoSegment videoSegment : list) {
            this.f126299a.add(new ac(videoSegment.f125477a, videoSegment));
        }
    }

    public final void a(VideoSegment videoSegment) {
        for (int i2 = 0; i2 < this.f126299a.size(); i2++) {
            if (this.f126299a.get(i2).f125450b.a(true).equals(videoSegment.a(true))) {
                this.f126299a.get(i2).f125450b = videoSegment;
                notifyItemChanged(i2);
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l
    public void a(RecyclerView.ViewHolder viewHolder, boolean z) {
        if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            cVar.b();
            f fVar = new f(2, -1, cVar.f126309b.f125477a);
            fVar.f125507a = z;
            fVar.f125509c = viewHolder.getAdapterPosition();
            this.f126304f.a(fVar);
        }
    }

    public class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public SimpleDraweeView f126308a = ((SimpleDraweeView) this.itemView.findViewById(R.id.ffs));

        /* renamed from: b  reason: collision with root package name */
        public VideoSegment f126309b;

        /* renamed from: d  reason: collision with root package name */
        private RelativeLayout f126311d = ((RelativeLayout) this.itemView.findViewById(R.id.dqn));

        /* renamed from: e  reason: collision with root package name */
        private TextView f126312e;

        static {
            Covode.recordClassIndex(82900);
        }

        public final void a() {
            RelativeLayout relativeLayout = this.f126311d;
            if (relativeLayout != null) {
                relativeLayout.setScaleX(1.25f);
                this.f126311d.setScaleY(1.25f);
            }
        }

        public final void b() {
            RelativeLayout relativeLayout = this.f126311d;
            if (relativeLayout != null) {
                relativeLayout.setScaleY(1.0f);
                this.f126311d.setScaleX(1.0f);
            }
        }

        /* access modifiers changed from: protected */
        public void a(c cVar) {
            this.itemView.setOnClickListener(new ab(this, cVar));
        }

        /* access modifiers changed from: protected */
        public void a(c cVar, String str) {
            m.a(cVar.f126308a, str, com.ss.android.ugc.tools.view.a.a(637534207, 637534207, 0, 0), en.a(48.0d, i.f115645a), z.this.f126305g);
        }

        public c(ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.abd, viewGroup, false));
            m.a(this.f126308a);
            this.f126312e = (TextView) this.itemView.findViewById(R.id.dx4);
        }

        public final void a(ac acVar, c cVar) {
            String str;
            this.f126309b = acVar.f125450b;
            if (TextUtils.isEmpty(acVar.f125450b.f125484h)) {
                str = acVar.f125450b.a(false);
            } else {
                str = acVar.f125450b.f125484h;
            }
            a(cVar, str);
            cVar.f126312e.setText(com.a.a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) (acVar.f125450b.e() - acVar.f125450b.d())) / (acVar.f125450b.f() * 1000.0f))}) + "s");
            cVar.f126312e.setShadowLayer(6.0f, 0.0f, 4.0f, this.itemView.getContext().getResources().getColor(R.color.a3));
            a(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        List<ac> list = this.f126299a;
        if (list == null) {
            return 0;
        }
        boolean z = this.f126306h;
        int size = list.size();
        if (z) {
            return size + 1;
        }
        return size;
    }

    public final long b() {
        long j2 = 0;
        if (k.a(this.f126299a)) {
            return 0;
        }
        for (ac acVar : this.f126299a) {
            if (acVar != null && !acVar.f125450b.f125485i) {
                j2 += acVar.f125450b.f125478b;
            }
        }
        return j2;
    }

    public final ArrayList<String> a() {
        ArrayList<String> arrayList = new ArrayList<>();
        if (k.a(this.f126299a)) {
            return arrayList;
        }
        for (ac acVar : this.f126299a) {
            if (acVar != null && !acVar.f125450b.f125485i) {
                if (h.a(acVar.f125450b.a(false), false)) {
                    arrayList.add(acVar.f125450b.f125484h);
                } else {
                    arrayList.add(acVar.f125450b.a(false));
                }
            }
        }
        return arrayList;
    }

    public class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(82898);
        }

        /* access modifiers changed from: package-private */
        public final /* synthetic */ void a(View view) {
            z.this.a(view);
        }

        public a(ViewGroup viewGroup) {
            super(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ab7, viewGroup, false));
            ((DmtPlusView) this.itemView.findViewById(R.id.hp)).setBgColor(Color.parseColor("#FFFFFF"));
        }
    }

    /* access modifiers changed from: protected */
    public void a(View view) {
        b bVar = this.f126301c;
        if (bVar != null) {
            bVar.a(10003, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        if (i2 < this.f126299a.size()) {
            return 10002;
        }
        return 10003;
    }

    public ac a(int i2) {
        if (getItemViewType(i2) != 10002) {
            return null;
        }
        return this.f126299a.get(i2);
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l
    public final ViewPropertyAnimator b(RecyclerView.ViewHolder viewHolder) {
        return viewHolder.itemView.animate().scaleX(1.0f).scaleY(1.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public long getItemId(int i2) {
        if (getItemViewType(i2) == 10003) {
            return 10003;
        }
        return (long) this.f126299a.get(i2).f125449a;
    }

    public void b(VideoSegment videoSegment) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f126299a.size()) {
                break;
            } else if (this.f126299a.get(i2).f125450b.a(true).equals(videoSegment.a(true))) {
                this.f126299a.remove(i2);
                break;
            } else {
                i2++;
            }
        }
        notifyDataSetChanged();
    }

    public final void b(List<VideoSegment> list) {
        if (!k.a(list)) {
            if (this.f126299a == null) {
                this.f126299a = new ArrayList();
            }
            for (VideoSegment videoSegment : list) {
                this.f126299a.add(new ac(videoSegment.f125477a, videoSegment));
            }
            notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l
    public void a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            cVar.a();
            f fVar = new f(0, cVar.f126309b.f125477a, -1);
            fVar.f125508b = viewHolder.getAdapterPosition();
            this.f126304f.a(fVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            cVar.a(a(i2), cVar);
        } else if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            aVar.itemView.setOnClickListener(new aa(aVar));
        }
    }

    public int a(RecyclerView recyclerView, int i2) {
        RecyclerView.ViewHolder f2;
        e<Integer, Integer> a2 = d.a(recyclerView);
        if (i2 < a2.f2397a.intValue() || i2 > a2.f2398b.intValue() || i2 >= getItemCount() || i2 < 0 || (f2 = recyclerView.f(i2)) == null) {
            return -1;
        }
        int[] iArr = new int[2];
        f2.itemView.getLocationOnScreen(iArr);
        return iArr[0] + en.a(23.5d, i.f115645a);
    }

    public final Rect b(RecyclerView recyclerView, int i2) {
        RecyclerView.ViewHolder f2;
        e<Integer, Integer> a2 = d.a(recyclerView);
        if (i2 < a2.f2397a.intValue() || i2 > a2.f2398b.intValue() || i2 >= getItemCount() || i2 < 0 || (f2 = recyclerView.f(i2)) == null || f2.itemView == null) {
            return null;
        }
        int[] iArr = new int[2];
        f2.itemView.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], iArr[0] + f2.itemView.getWidth(), iArr[1] + f2.itemView.getHeight());
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, int i3) {
        this.f126303e.k().add(i3, this.f126303e.k().remove(i2));
        int i4 = 0;
        for (VideoSegment videoSegment : this.f126303e.k()) {
            videoSegment.f125477a = i4;
            i4++;
        }
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.cut.l
    public void a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        int adapterPosition = viewHolder.getAdapterPosition();
        int adapterPosition2 = viewHolder2.getAdapterPosition();
        if (adapterPosition < this.f126299a.size() && adapterPosition2 < this.f126299a.size()) {
            int i2 = ((c) viewHolder).f126309b.f125477a;
            int i3 = ((c) viewHolder2).f126309b.f125477a;
            this.f126299a.add(adapterPosition2, this.f126299a.remove(adapterPosition));
            a(i2, i3);
            notifyItemMoved(adapterPosition, adapterPosition2);
            this.f126304f.a(new f(1, i2, i3));
        }
    }

    public z(VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<VideoSegment> list) {
        this.f126303e = videoEditViewModel;
        this.f126304f = cutMultiVideoViewModel;
        a(list);
        setHasStableIds(true);
    }

    private static RecyclerView.ViewHolder a(z zVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(5347);
        if (i2 == 10003) {
            viewHolder = new a(viewGroup);
        } else {
            viewHolder = new c(viewGroup);
        }
        try {
            if (viewHolder.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
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
        MethodCollector.o(5347);
        return viewHolder;
    }
}
