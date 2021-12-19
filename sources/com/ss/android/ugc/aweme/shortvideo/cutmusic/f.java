package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;

public final class f extends RecyclerView {
    public a O;
    float P;
    public a Q;
    public boolean R;
    public boolean S;
    private RecyclerView.a<?> T;

    public interface a {
        static {
            Covode.recordClassIndex(82916);
        }

        void a(float f2);

        void b(float f2);
    }

    static {
        Covode.recordClassIndex(82915);
    }

    public final float getScrollDx() {
        return this.P;
    }

    static final class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126382a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f126383b;

        static {
            Covode.recordClassIndex(82920);
        }

        e(f fVar, float f2) {
            this.f126382a = fVar;
            this.f126383b = f2;
        }

        public final void run() {
            this.f126382a.scrollBy((int) (((float) f.a(this.f126382a).getViewWidth()) * this.f126383b), 0);
        }
    }

    public final void setScrollDx(float f2) {
        this.P = f2;
    }

    public static final class c extends RecyclerView.a<RecyclerView.ViewHolder> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126380a;

        static {
            Covode.recordClassIndex(82918);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final int getItemCount() {
            return 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
            l.d(viewHolder, "");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
            return a(this, viewGroup, i2);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(f fVar) {
            this.f126380a = fVar;
        }

        private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
            boolean a2;
            MethodCollector.i(2575);
            l.d(viewGroup, "");
            b bVar = new b(f.a(cVar.f126380a));
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
            MethodCollector.o(2575);
            return bVar;
        }
    }

    public static final class d extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f126381a;

        static {
            Covode.recordClassIndex(82919);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        d(f fVar) {
            this.f126381a = fVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (i2 == 0 && this.f126381a.Q != null && this.f126381a.R) {
                a aVar = this.f126381a.Q;
                if (aVar == null) {
                    l.b();
                }
                aVar.a((this.f126381a.getScrollDx() * 1.0f) / ((float) f.a(this.f126381a).getMeasuredWidth()));
                this.f126381a.R = false;
                this.f126381a.S = false;
            }
            super.a(recyclerView, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2, int i3) {
            l.d(recyclerView, "");
            super.a(recyclerView, i2, i3);
            f fVar = this.f126381a;
            fVar.setScrollDx(fVar.getScrollDx() + ((float) i2));
            if (this.f126381a.Q != null && this.f126381a.S) {
                float scrollDx = (this.f126381a.getScrollDx() * 1.0f) / ((float) f.a(this.f126381a).getMeasuredWidth());
                a aVar = this.f126381a.Q;
                if (aVar == null) {
                    l.b();
                }
                aVar.b(scrollDx);
            }
        }
    }

    public final void setScrollListener(a aVar) {
        l.d(aVar, "");
        this.Q = aVar;
    }

    public static final class b extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(82917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
        }
    }

    public static final /* synthetic */ a a(f fVar) {
        a aVar = fVar.O;
        if (aVar == null) {
            l.a("cutMusicView");
        }
        return aVar;
    }

    public final void setProgressMaxWidth(int i2) {
        a aVar = this.O;
        if (aVar == null) {
            l.a("cutMusicView");
        }
        aVar.setProgressMaxWidth(i2);
    }

    public final void setWaveColor(int i2) {
        a aVar = this.O;
        if (aVar == null) {
            l.a("cutMusicView");
        }
        aVar.setColor(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        l.d(motionEvent, "");
        if (motionEvent.getAction() == 1) {
            this.R = true;
        } else if (motionEvent.getAction() == 0) {
            this.S = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setAudioWaveViewData(com.ss.android.ugc.aweme.shortvideo.d dVar) {
        if (dVar != null) {
            a aVar = this.O;
            if (aVar == null) {
                l.a("cutMusicView");
            }
            aVar.setAudioWaveViewData(dVar);
            RecyclerView.a<?> aVar2 = this.T;
            if (aVar2 == null) {
                l.a("adatper");
            }
            setAdapter(aVar2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private f(Context context) {
        super(context, null, 0);
        l.d(context, "");
        setClipToPadding(false);
        this.O = new a(context, (char) 0);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.b(0);
        linearLayoutManager.b(com.ss.android.ugc.aweme.tools.c.a(context));
        setLayoutManager(linearLayoutManager);
        setOverScrollMode(2);
        this.T = new c(this);
        a(new d(this));
        addOnAttachStateChangeListener(new com.bytedance.analytics.a.f());
    }

    public /* synthetic */ f(Context context, byte b2) {
        this(context);
    }
}
