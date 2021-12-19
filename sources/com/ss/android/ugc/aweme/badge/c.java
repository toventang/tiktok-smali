package com.ss.android.ugc.aweme.badge;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class c extends RecyclerView.a<b> {

    /* renamed from: c  reason: collision with root package name */
    public static Integer f67892c;

    /* renamed from: d  reason: collision with root package name */
    public static String f67893d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f67894e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public j f67895a;

    /* renamed from: b  reason: collision with root package name */
    public final List<h> f67896b;

    /* renamed from: f  reason: collision with root package name */
    private final User f67897f;

    static {
        Covode.recordClassIndex(41799);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(41800);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<h> list = this.f67896b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        final String f67898a = "EditProfileBadgeAdapter";

        /* renamed from: b  reason: collision with root package name */
        SmartCircleImageView f67899b;

        /* renamed from: c  reason: collision with root package name */
        SmartImageView f67900c;

        /* renamed from: d  reason: collision with root package name */
        TuxTextView f67901d;

        /* renamed from: e  reason: collision with root package name */
        private ConstraintLayout f67902e;

        static {
            Covode.recordClassIndex(41801);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            this.f67899b = (SmartCircleImageView) view.findViewById(R.id.as3);
            this.f67900c = (SmartImageView) view.findViewById(R.id.as6);
            this.f67901d = (TuxTextView) view.findViewById(R.id.as5);
            this.f67902e = (ConstraintLayout) view.findViewById(R.id.as4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.badge.c$c  reason: collision with other inner class name */
    static final class View$OnClickListenerC1535c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f67903a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f67904b;

        static {
            Covode.recordClassIndex(41802);
        }

        View$OnClickListenerC1535c(c cVar, int i2) {
            this.f67903a = cVar;
            this.f67904b = i2;
        }

        public final void onClick(View view) {
            h hVar;
            ClickAgent.onClick(view);
            c.f67892c = Integer.valueOf(this.f67904b);
            j jVar = this.f67903a.f67895a;
            List<h> list = this.f67903a.f67896b;
            if (list != null) {
                hVar = (h) n.b((List) list, this.f67904b);
            } else {
                hVar = null;
            }
            jVar.a(hVar);
            this.f67903a.notifyDataSetChanged();
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(11113);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.azh, viewGroup, false);
        l.b(a3, "");
        b bVar = new b(a3);
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
        MethodCollector.o(11113);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        if (h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) r0) != false) goto L_0x00b3;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void onBindViewHolder(com.ss.android.ugc.aweme.badge.c.b r6, int r7) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.badge.c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if (r0 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(com.ss.android.ugc.aweme.badge.j r3, java.util.List<com.ss.android.ugc.aweme.badge.h> r4, com.ss.android.ugc.aweme.profile.model.User r5) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            h.f.b.l.d(r3, r0)
            h.f.b.l.d(r5, r0)
            r2.<init>()
            r2.f67895a = r3
            r2.f67896b = r4
            r2.f67897f = r5
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            r1 = 0
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r0.getUrl()
            if (r0 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.getShouldShow()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0047
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            if (r0 == 0) goto L_0x005c
            boolean r0 = r0.getShouldShow()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x0041
        L_0x003e:
            h.f.b.l.b()
        L_0x0041:
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0051
        L_0x0047:
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            com.ss.android.ugc.aweme.badge.c.f67892c = r0
        L_0x004e:
            com.ss.android.ugc.aweme.badge.c.f67893d = r1
            return
        L_0x0051:
            com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct r0 = r5.getProfileBadge()
            if (r0 == 0) goto L_0x004e
            java.lang.String r1 = r0.getUrl()
            goto L_0x004e
        L_0x005c:
            r0 = r1
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.badge.c.<init>(com.ss.android.ugc.aweme.badge.j, java.util.List, com.ss.android.ugc.aweme.profile.model.User):void");
    }
}
