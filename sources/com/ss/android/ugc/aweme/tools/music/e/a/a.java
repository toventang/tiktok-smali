package com.ss.android.ugc.aweme.tools.music.e.a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.cz.a.j;
import com.ss.android.ugc.aweme.cz.a.k;
import com.ss.android.ugc.aweme.port.in.aa;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.e.c;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class a extends f<MusicModel> implements j, aa.e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f140440a;

    /* renamed from: b  reason: collision with root package name */
    public int f140441b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f140442c;

    /* renamed from: d  reason: collision with root package name */
    public int f140443d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f140444e = -1;

    /* renamed from: f  reason: collision with root package name */
    public RecyclerView f140445f;

    /* renamed from: g  reason: collision with root package name */
    public ImageView f140446g;

    /* renamed from: h  reason: collision with root package name */
    public AnimatorSet f140447h = new AnimatorSet();

    /* renamed from: i  reason: collision with root package name */
    public final List<Animator> f140448i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public int f140449j = 1;

    /* renamed from: k  reason: collision with root package name */
    public Map<String, Boolean> f140450k = new LinkedHashMap();
    public k w;
    public j x;
    private boolean y = true;

    static {
        Covode.recordClassIndex(91746);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.f
    public final int c() {
        if (com.bytedance.common.utility.collection.b.a((Collection) this.f76354l)) {
            return 9;
        }
        return super.c();
    }

    public final MusicModel l() {
        List list = this.f76354l;
        if (list != null) {
            return (MusicModel) n.b(list, this.f140443d);
        }
        return null;
    }

    public final MusicModel m() {
        List list = this.f76354l;
        if (list != null) {
            return (MusicModel) n.b(list, this.f140444e);
        }
        return null;
    }

    public final void n() {
        if (this.f140447h.isRunning()) {
            this.f140447h.cancel();
        }
    }

    public final void p() {
        a(-1);
        this.f140443d = -1;
        this.f140444e = -1;
    }

    private void q() {
        RecyclerView.ViewHolder viewHolder;
        int i2 = this.f140444e;
        if (i2 >= 0) {
            RecyclerView recyclerView = this.f140445f;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof c) {
                ((c) viewHolder).a();
            }
        }
    }

    public final void o() {
        RecyclerView.ViewHolder viewHolder;
        int i2 = this.f140444e;
        if (i2 >= 0) {
            RecyclerView recyclerView = this.f140445f;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i2);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof c) {
                ((c) viewHolder).b();
            } else {
                notifyItemChanged(this.f140444e);
            }
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140452a;

        static {
            Covode.recordClassIndex(91748);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8, types: [androidx.recyclerview.widget.RecyclerView] */
        /* JADX WARN: Type inference failed for: r5v4 */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tools.music.e.a.a.b.run():void");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public b(a aVar) {
            this.f140452a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.e.a.a$a  reason: collision with other inner class name */
    public static final class C3711a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f140451a;

        static {
            Covode.recordClassIndex(91747);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3711a(a aVar) {
            this.f140451a = aVar;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f140451a.f140449j = 3;
            this.f140451a.f140447h.end();
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f140451a.f140449j < 3) {
                this.f140451a.f140447h.start();
            }
        }

        public final void onAnimationStart(Animator animator) {
            this.f140451a.f140449j++;
        }
    }

    private final int d(int i2) {
        if (this.f140440a) {
            return i2 - 1;
        }
        return i2;
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final int c_(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        return (int) com.bytedance.common.utility.n.b(context, 72.0f);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void d(boolean z) {
        ImageView imageView;
        super.d(z);
        if (!z && (imageView = this.f140446g) != null) {
            imageView.clearAnimation();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f140445f = recyclerView;
    }

    public final MusicModel b(int i2) {
        List list = this.f76354l;
        if (list != null) {
            return (MusicModel) n.b(list, d(i2));
        }
        return null;
    }

    public a(j jVar) {
        l.d(jVar, "");
        this.x = jVar;
    }

    @Override // com.ss.android.ugc.aweme.port.in.aa.e
    public final void a(int i2) {
        RecyclerView.ViewHolder viewHolder;
        int itemCount = getItemCount() - 1;
        int i3 = this.f140443d;
        RecyclerView.ViewHolder viewHolder2 = null;
        if (i3 >= 0 && itemCount >= i3) {
            RecyclerView recyclerView = this.f140445f;
            if (recyclerView != null) {
                viewHolder = recyclerView.f(i3);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof c) {
                ((c) viewHolder).a(false);
            } else {
                notifyItemChanged(this.f140443d);
            }
        }
        this.f140443d = i2;
        if (i2 < getItemCount()) {
            RecyclerView recyclerView2 = this.f140445f;
            if (recyclerView2 != null) {
                viewHolder2 = recyclerView2.f(this.f140443d);
            }
            if (viewHolder2 instanceof c) {
                ((c) viewHolder2).a(true);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        Context context;
        Integer num = null;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.agd, viewGroup, false);
        this.f140446g = (ImageView) a2.findViewById(R.id.byw);
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.c().a(a2));
        RecyclerView.j jVar = new RecyclerView.j(c_(viewGroup), c_(viewGroup));
        if (viewGroup == null || (num = Integer.valueOf(viewGroup.getHeight())) == null) {
            l.b();
        }
        jVar.bottomMargin = num.intValue() - c_(viewGroup);
        dmtStatusView.setLayoutParams(jVar);
        l.b(a_, "");
        return a_;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        List list;
        MusicModel musicModel;
        String musicId;
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (viewHolder instanceof c) {
            viewHolder.getLayoutPosition();
            int adapterPosition = viewHolder.getAdapterPosition();
            List list2 = this.f76354l;
            if (list2 != null && !list2.isEmpty() && (list = this.f76354l) != null && (musicModel = (MusicModel) list.get(adapterPosition)) != null && (musicId = musicModel.getMusicId()) != null) {
                if (this.f140450k.get(musicId) == null || l.a((Object) this.f140450k.get(musicId), (Object) false)) {
                    this.f140450k.put(musicId, true);
                    k kVar = this.w;
                    if (kVar != null) {
                        kVar.a(adapterPosition);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final void a(RecyclerView.ViewHolder viewHolder) {
        MethodCollector.i(1576);
        super.a(viewHolder);
        ImageView imageView = this.f140446g;
        if (imageView != null) {
            imageView.startAnimation(AnimationUtils.loadAnimation(imageView.getContext(), R.anim.e6));
            MethodCollector.o(1576);
            return;
        }
        MethodCollector.o(1576);
    }

    public final void a(int i2, boolean z) {
        o();
        this.f140444e = i2;
        if (z) {
            q();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        l.b(from, "");
        return new c(c.a.a(from, viewGroup), this);
    }

    @Override // com.ss.android.ugc.aweme.cz.a.j
    public final void a(View view, int i2) {
        l.d(view, "");
        j jVar = this.x;
        if (jVar != null) {
            jVar.a(view, d(i2));
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        MusicModel musicModel;
        boolean z;
        l.d(viewHolder, "");
        if (viewHolder instanceof c) {
            boolean z2 = false;
            if (i2 >= this.f140441b) {
                this.y = false;
            }
            c cVar = (c) viewHolder;
            List list = this.f76354l;
            if (list != null) {
                musicModel = (MusicModel) n.b(list, d(i2));
            } else {
                musicModel = null;
            }
            int i3 = this.f140443d;
            if (i3 == i2) {
                z = true;
            } else {
                z = false;
            }
            int i4 = this.f140444e;
            if (i3 != i4 && i4 == i2) {
                z2 = true;
            }
            cVar.a(musicModel, z, z2);
        }
    }
}
