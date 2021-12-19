package com.ss.android.ugc.aweme.im.sdk.privacy.b.a;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.table.cell.TuxTextCell;
import com.ss.android.ugc.aweme.compliance.api.model.p;
import com.ss.android.ugc.aweme.im.sdk.privacy.viewmodel.MessagingPrivacyViewModel;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class a extends RecyclerView.a<com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a> {

    /* renamed from: d  reason: collision with root package name */
    public static final C2601a f102914d = new C2601a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f102915a = -1;

    /* renamed from: b  reason: collision with root package name */
    public final MessagingPrivacyViewModel f102916b;

    /* renamed from: c  reason: collision with root package name */
    public final List<p> f102917c;

    static {
        Covode.recordClassIndex(65972);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a$a  reason: collision with other inner class name */
    public static final class C2601a {
        static {
            Covode.recordClassIndex(65973);
        }

        private C2601a() {
        }

        public /* synthetic */ C2601a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f102917c.size();
    }

    static final class b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f102918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f102919b;

        static {
            Covode.recordClassIndex(65974);
        }

        b(a aVar, p pVar) {
            this.f102918a = aVar;
            this.f102919b = pVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                MessagingPrivacyViewModel messagingPrivacyViewModel = this.f102918a.f102916b;
                p pVar = this.f102919b;
                l.d(pVar, "");
                messagingPrivacyViewModel.f102945d.setValue(pVar);
            }
        }
    }

    public a(MessagingPrivacyViewModel messagingPrivacyViewModel, List<p> list) {
        l.d(messagingPrivacyViewModel, "");
        l.d(list, "");
        this.f102916b = messagingPrivacyViewModel;
        this.f102917c = list;
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6413);
        l.d(viewGroup, "");
        Context context = viewGroup.getContext();
        l.b(context, "");
        com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a aVar = new com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a(new TuxTextCell(context, null, 0, 6));
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
        MethodCollector.o(6413);
        return aVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (r0 != null) goto L_0x005e;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a r9, int r10) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.privacy.b.a.a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int, java.util.List] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a aVar, int i2, List list) {
        com.ss.android.ugc.aweme.im.sdk.privacy.b.d.a aVar2 = aVar;
        l.d(aVar2, "");
        l.d(list, "");
        if (list.isEmpty()) {
            super.onBindViewHolder(aVar2, i2, list);
            return;
        }
        Object obj = list.get(0);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Boolean");
        aVar2.a(((Boolean) obj).booleanValue());
    }
}
