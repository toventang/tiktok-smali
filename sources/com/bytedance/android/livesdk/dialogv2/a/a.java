package com.bytedance.android.livesdk.dialogv2.a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.dialogv2.c.a;
import com.bytedance.android.livesdk.dialogv2.c.e;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.z.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import h.f.b.l;
import java.util.LinkedList;

public class a extends RecyclerView.a<com.bytedance.android.livesdk.dialogv2.c.a> implements a.AbstractC0352a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.dialogv2.c.a f16935a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a.b.a f16936b = new f.a.b.a();

    /* renamed from: c  reason: collision with root package name */
    public AbstractC0350a f16937c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> f16938d = new LinkedList<>();

    /* renamed from: e  reason: collision with root package name */
    private final DataChannel f16939e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveGiftDialogViewModel f16940f;

    /* renamed from: com.bytedance.android.livesdk.dialogv2.a.a$a  reason: collision with other inner class name */
    public interface AbstractC0350a {
        static {
            Covode.recordClassIndex(9410);
        }

        int a(Long l2);
    }

    static {
        Covode.recordClassIndex(9409);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ com.bytedance.android.livesdk.dialogv2.c.a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    public final void a() {
        com.bytedance.android.livesdk.dialogv2.c.a aVar = this.f16935a;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemCount() {
        return this.f16938d.size();
    }

    static final class c<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16942a;

        static {
            Covode.recordClassIndex(9412);
        }

        c(a aVar) {
            this.f16942a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar = this.f16942a;
            a.C0498a.f22936a.f22931a = false;
            com.bytedance.android.livesdk.dialogv2.c.a aVar2 = aVar.f16935a;
            if (aVar2 != null) {
                aVar2.g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Long l2) {
        com.bytedance.android.livesdk.dialogv2.c.a aVar = this.f16935a;
        if (aVar != null) {
            aVar.a(l2);
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a.AbstractC0352a
    public final int b(Long l2) {
        AbstractC0350a aVar = this.f16937c;
        if (aVar != null) {
            return aVar.a(l2);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public int getItemViewType(int i2) {
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16938d.get(i2);
        if (bVar != null) {
            return bVar.f17863a;
        }
        return 0;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onViewDetachedFromWindow(com.bytedance.android.livesdk.dialogv2.c.a aVar) {
        com.bytedance.android.livesdk.dialogv2.c.a aVar2 = aVar;
        l.d(aVar2, "");
        super.onViewDetachedFromWindow(aVar2);
        aVar2.h();
    }

    static final class b<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16941a;

        static {
            Covode.recordClassIndex(9411);
        }

        b(a aVar) {
            this.f16941a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            long j2;
            com.bytedance.android.livesdk.z.b.a aVar = (com.bytedance.android.livesdk.z.b.a) obj;
            a aVar2 = this.f16941a;
            if (aVar != null) {
                j2 = aVar.f22930a;
            } else {
                j2 = 0;
            }
            aVar2.a(Long.valueOf(j2));
        }
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f16943a;

        static {
            Covode.recordClassIndex(9413);
        }

        d(a aVar) {
            this.f16943a = aVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            a aVar = this.f16943a;
            a.C0498a.f22936a.f22931a = true;
            com.bytedance.android.livesdk.dialogv2.c.a aVar2 = aVar.f16935a;
            if (aVar2 != null) {
                aVar2.g();
            }
            com.bytedance.android.livesdk.z.c.a aVar3 = a.C0498a.f22936a;
            l.b(aVar3, "");
            aVar.a(Long.valueOf(aVar3.f22933c));
        }
    }

    @Override // com.bytedance.android.livesdk.dialogv2.c.a.AbstractC0352a
    public final void a(com.bytedance.android.livesdk.dialogv2.c.a aVar) {
        l.d(aVar, "");
        com.bytedance.android.livesdk.dialogv2.c.a aVar2 = this.f16935a;
        if (aVar2 != null) {
            aVar2.f();
        }
        com.bytedance.android.livesdk.dialogv2.c.a aVar3 = this.f16935a;
        if (aVar3 != null) {
            aVar3.c();
        }
        this.f16935a = aVar;
    }

    public final void a(LinkedList<com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b>> linkedList) {
        this.f16938d.clear();
        if (linkedList != null) {
            this.f16938d.addAll(linkedList);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        l.d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f16936b.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.z.b.a.class).d(new b(this)));
        this.f16936b.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.z.b.b.class).d(new c(this)));
        this.f16936b.a(com.bytedance.android.livesdk.an.a.a().a(com.bytedance.android.livesdk.z.b.c.class).d(new d(this)));
    }

    public a(DataChannel dataChannel, LiveGiftDialogViewModel liveGiftDialogViewModel) {
        this.f16939e = dataChannel;
        this.f16940f = liveGiftDialogViewModel;
    }

    public com.bytedance.android.livesdk.dialogv2.c.a a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        if (i2 == 1) {
            View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bak, viewGroup, false);
            l.b(a2, "");
            return new com.bytedance.android.livesdk.dialogv2.c.d(a2);
        } else if (i2 == 9) {
            View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.baj, viewGroup, false);
            l.b(a3, "");
            return new com.bytedance.android.livesdk.dialogv2.c.c(a3);
        } else if (i2 != 10) {
            View a4 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ban, viewGroup, false);
            l.b(a4, "");
            return new com.bytedance.android.livesdk.dialogv2.c.b(a4);
        } else {
            View a5 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bao, viewGroup, false);
            l.b(a5, "");
            return new e(a5);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public /* synthetic */ void onBindViewHolder(com.bytedance.android.livesdk.dialogv2.c.a aVar, int i2) {
        Integer num;
        t<Integer> tVar;
        t<Integer> tVar2;
        Integer value;
        Integer num2;
        t<Integer> tVar3;
        com.bytedance.android.livesdk.dialogv2.c.a aVar2 = aVar;
        l.d(aVar2, "");
        com.bytedance.android.livesdk.gift.model.a.b<? extends com.bytedance.android.livesdk.model.b> bVar = this.f16938d.get(i2);
        if (bVar != null) {
            l.b(bVar, "");
            if (bVar.f17863a == 0) {
                View view = aVar2.itemView;
                l.b(view, "");
                view.setVisibility(4);
                return;
            }
            if (bVar.f17863a == 10) {
                LiveGiftDialogViewModel liveGiftDialogViewModel = this.f16940f;
                if (liveGiftDialogViewModel == null || (tVar3 = liveGiftDialogViewModel.f17003a) == null || (num2 = tVar3.getValue()) == null) {
                    num2 = 1;
                }
                l.b(num2, "");
                aVar2.a(bVar, num2.intValue(), this.f16939e);
            }
            if (a.C0355a.C0356a.f17017a.f17010f == bVar.d()) {
                int i3 = a.C0355a.C0356a.f17017a.f17011g;
                LiveGiftDialogViewModel liveGiftDialogViewModel2 = this.f16940f;
                if (!(liveGiftDialogViewModel2 == null || (tVar2 = liveGiftDialogViewModel2.f17003a) == null || (value = tVar2.getValue()) == null || i3 != value.intValue())) {
                    this.f16935a = aVar2;
                }
            }
            if (bVar.f17863a == 9) {
                boolean e2 = com.bytedance.android.livesdk.firstrecharge.d.u.e();
                if (aVar2 instanceof com.bytedance.android.livesdk.dialogv2.c.c) {
                    ((com.bytedance.android.livesdk.dialogv2.c.c) aVar2).f16981m = e2;
                }
            }
            l.d(this, "");
            aVar2.f16968i = this;
            LiveGiftDialogViewModel liveGiftDialogViewModel3 = this.f16940f;
            if (liveGiftDialogViewModel3 == null || (tVar = liveGiftDialogViewModel3.f17003a) == null || (num = tVar.getValue()) == null) {
                num = 1;
            }
            l.b(num, "");
            aVar2.a(bVar, num.intValue(), this.f16939e);
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(12123);
        com.bytedance.android.livesdk.dialogv2.c.a a3 = aVar.a(viewGroup, i2);
        try {
            if (a3.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a3.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a3.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a3.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = a3.getClass().getName();
        MethodCollector.o(12123);
        return a3;
    }
}
