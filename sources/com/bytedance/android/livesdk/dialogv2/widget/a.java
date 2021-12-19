package com.bytedance.android.livesdk.dialogv2.widget;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.android.livesdk.bi;
import com.bytedance.android.livesdk.dialogv2.viewmodel.LiveGiftDialogViewModel;
import com.bytedance.android.livesdk.dialogv2.viewmodel.a;
import com.bytedance.android.livesdk.model.w;
import com.bytedance.android.livesdk.olddialog.widget.u;
import com.bytedance.android.livesdk.olddialog.widget.v;
import com.bytedance.android.livesdk.service.b.a;
import com.bytedance.android.livesdk.service.c.a.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class a extends RecyclerView.a<v> {

    /* renamed from: a  reason: collision with root package name */
    public LiveGiftDialogViewModel f17077a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC0358a f17078b;

    /* renamed from: c  reason: collision with root package name */
    View f17079c;

    /* renamed from: d  reason: collision with root package name */
    int f17080d;

    /* renamed from: e  reason: collision with root package name */
    DataChannel f17081e;

    /* renamed from: f  reason: collision with root package name */
    private List<? extends u> f17082f = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.dialogv2.widget.a$a  reason: collision with other inner class name */
    public interface AbstractC0358a {
        static {
            Covode.recordClassIndex(9489);
        }

        void a(boolean z);
    }

    static {
        Covode.recordClassIndex(9488);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ v onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<? extends u> list = this.f17082f;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final int a() {
        List<? extends u> list = this.f17082f;
        if (!(list == null || list.size() == 0)) {
            List<? extends u> list2 = this.f17082f;
            if (list2 == null) {
                l.b();
            }
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<? extends u> list3 = this.f17082f;
                if (list3 == null) {
                    l.b();
                }
                if (((u) list3.get(i2)).f20175b == this.f17080d) {
                    return i2;
                }
            }
        }
        return -1;
    }

    public final void a(List<? extends u> list) {
        int i2;
        t<Integer> tVar;
        Integer value;
        this.f17082f = list;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17077a;
        if (liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f17003a) == null || (value = tVar.getValue()) == null) {
            i2 = 0;
        } else {
            i2 = value.intValue();
        }
        this.f17080d = i2;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        u uVar;
        List<? extends u> list = this.f17082f;
        if (list == null || (uVar = (u) list.get(i2)) == null) {
            return 0;
        }
        return uVar.f20175b;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        t<Integer> tVar;
        LiveGiftDialogViewModel liveGiftDialogViewModel = this.f17077a;
        if (!(liveGiftDialogViewModel == null || (tVar = liveGiftDialogViewModel.f17003a) == null)) {
            tVar.setValue(Integer.valueOf(i2));
        }
        this.f17080d = i2;
        if (i2 == 5) {
            AbstractC0358a aVar = this.f17078b;
            if (aVar != null) {
                aVar.a(false);
            }
        } else {
            AbstractC0358a aVar2 = this.f17078b;
            if (aVar2 != null) {
                aVar2.a(true);
            }
        }
        List<? extends u> list = this.f17082f;
        if (list != null) {
            for (u uVar : list) {
                if (uVar.f20175b == i2) {
                    String str = uVar.f20174a;
                    l.b(str, "");
                    e.b(str);
                    return;
                }
            }
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f17083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ v f17084b;

        static {
            Covode.recordClassIndex(9490);
        }

        b(a aVar, v vVar) {
            this.f17083a = aVar;
            this.f17084b = vVar;
        }

        public final void onClick(View view) {
            l.d(view, "");
            a aVar = this.f17083a;
            w wVar = this.f17084b.f20177a;
            Object tag = view.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) tag).intValue();
            if (intValue != aVar.f17080d) {
                if (aVar.f17079c != null && (aVar.f17079c instanceof TextView)) {
                    View view2 = aVar.f17079c;
                    Objects.requireNonNull(view2, "null cannot be cast to non-null type android.widget.TextView");
                    ((TextView) view2).setTextColor(Color.parseColor("#88FFFFFF"));
                }
                aVar.f17079c = view;
                if (view instanceof TextView) {
                    ((TextView) view).setTextColor(Color.parseColor("#E6FFFFFF"));
                }
                if (wVar == null || !wVar.a()) {
                    DataChannel dataChannel = aVar.f17081e;
                    if (dataChannel != null) {
                        a.EnumC0451a aVar2 = a.EnumC0451a.TAB_EMPTY_EVENT;
                        w wVar2 = w.f19781d;
                        l.b(wVar2, "");
                        dataChannel.c(bi.class, new com.bytedance.android.livesdk.service.b.a(aVar2, wVar2));
                    }
                } else {
                    DataChannel dataChannel2 = aVar.f17081e;
                    if (dataChannel2 != null) {
                        dataChannel2.c(bi.class, new com.bytedance.android.livesdk.service.b.a(a.EnumC0451a.TAB_EVENT, wVar));
                    }
                }
                a.C0355a.C0356a.f17017a.f17011g = intValue;
                aVar.a(intValue);
            }
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(10580);
        l.d(viewGroup, "");
        LiveTextView liveTextView = new LiveTextView(viewGroup.getContext());
        liveTextView.setTextSize(14.0f);
        liveTextView.setGravity(17);
        liveTextView.setTag(Integer.valueOf(i2));
        RecyclerView.j jVar = new RecyclerView.j(-2, -2);
        jVar.rightMargin = y.a(16.0f);
        liveTextView.setLayoutParams(jVar);
        v vVar = new v(liveTextView);
        try {
            if (vVar.itemView.getParent() != null) {
                try {
                    a2 = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a2) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(vVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) vVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(vVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = vVar.getClass().getName();
        MethodCollector.o(10580);
        return vVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0 == null) goto L_0x0076;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.bytedance.android.livesdk.olddialog.widget.v r7, int r8) {
        /*
        // Method dump skipped, instructions count: 183
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.dialogv2.widget.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}
