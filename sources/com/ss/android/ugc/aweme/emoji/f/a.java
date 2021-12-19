package com.ss.android.ugc.aweme.emoji.f;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.emoji.b.h;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class a extends RecyclerView.a<RecyclerView.ViewHolder> {

    /* renamed from: b  reason: collision with root package name */
    public static int f89301b = 20000;

    /* renamed from: a  reason: collision with root package name */
    ArrayList<com.ss.android.ugc.aweme.emoji.b.a> f89302a;

    /* renamed from: c  reason: collision with root package name */
    private int f89303c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f89304d;

    /* renamed from: e  reason: collision with root package name */
    private h f89305e;

    /* renamed from: f  reason: collision with root package name */
    private final View f89306f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f89307g;

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    static {
        Covode.recordClassIndex(56118);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        int i2;
        int i3 = 0;
        if (this.f89306f == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        ArrayList<com.ss.android.ugc.aweme.emoji.b.a> arrayList = this.f89302a;
        if (arrayList != null) {
            i3 = arrayList.size();
        }
        return i3 + i2;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.f.a$a  reason: collision with other inner class name */
    public static final class View$OnClickListenerC2158a extends RecyclerView.ViewHolder implements View.OnClickListener {
        static {
            Covode.recordClassIndex(56119);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }

        public View$OnClickListenerC2158a(View view) {
            super(view);
        }
    }

    public static final class b extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        RemoteImageView f89308a;

        /* renamed from: b  reason: collision with root package name */
        com.ss.android.ugc.aweme.emoji.b.a f89309b;

        /* renamed from: c  reason: collision with root package name */
        private h f89310c;

        static {
            Covode.recordClassIndex(56120);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.emoji.b.a aVar = this.f89309b;
            if (aVar != null) {
                this.f89310c.a(aVar.f89105c, 2);
            }
        }

        public b(View view, h hVar, int i2, boolean z) {
            super(view);
            RemoteImageView remoteImageView = (RemoteImageView) view.findViewById(R.id.av9);
            this.f89308a = remoteImageView;
            this.f89310c = hVar;
            remoteImageView.setOnClickListener(this);
            if (z) {
                this.f89308a.setOnTouchListener(p.f68444a);
            }
            if (i2 > 0) {
                this.f89308a.getLayoutParams().height = i2;
                this.f89308a.getLayoutParams().width = i2;
            }
        }
    }

    public static final class c extends RecyclerView.ViewHolder implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        TextView f89311a;

        /* renamed from: b  reason: collision with root package name */
        com.ss.android.ugc.aweme.emoji.b.a f89312b;

        /* renamed from: c  reason: collision with root package name */
        private View f89313c;

        /* renamed from: d  reason: collision with root package name */
        private h f89314d;

        static {
            Covode.recordClassIndex(56121);
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            com.ss.android.ugc.aweme.emoji.b.a aVar = this.f89312b;
            if (aVar != null) {
                this.f89314d.a(aVar.f89105c, 2);
            }
        }

        public c(View view, h hVar, int i2, boolean z) {
            super(view);
            this.f89313c = view.findViewById(R.id.av6);
            this.f89311a = (TextView) view.findViewById(R.id.avk);
            this.f89314d = hVar;
            this.f89313c.setOnClickListener(this);
            if (z) {
                this.f89311a.setOnTouchListener(p.f68444a);
            }
            if (i2 > 0) {
                this.f89311a.getLayoutParams().height = i2;
                this.f89311a.getLayoutParams().width = i2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemViewType(int i2) {
        if (this.f89307g) {
            return R.layout.ym;
        }
        if (this.f89306f != null && i2 == this.f89302a.size()) {
            return f89301b;
        }
        return R.layout.yl;
    }

    public a(h hVar, View view) {
        this(hVar, view, -1, false);
        this.f89307g = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof b) {
            b bVar = (b) viewHolder;
            com.ss.android.ugc.aweme.emoji.b.a aVar = this.f89302a.get(i2);
            if (aVar != null) {
                bVar.f89309b = aVar;
                com.ss.android.ugc.aweme.emoji.i.b.b.a(bVar.f89308a, aVar);
                if (!TextUtils.isEmpty(aVar.f89105c)) {
                    bVar.f89308a.setContentDescription(aVar.f89105c);
                }
            }
        } else if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            com.ss.android.ugc.aweme.emoji.b.a aVar2 = this.f89302a.get(i2);
            if (aVar2 != null) {
                cVar.f89312b = aVar2;
                if (!TextUtils.isEmpty(aVar2.f89105c)) {
                    cVar.f89311a.setText(aVar2.f89105c);
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        RecyclerView.ViewHolder viewHolder;
        boolean a2;
        MethodCollector.i(1556);
        if (i2 == R.layout.yl) {
            viewHolder = new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.yl, viewGroup, false), aVar.f89305e, aVar.f89303c, aVar.f89304d);
        } else if (i2 == R.layout.ym) {
            viewHolder = new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.ym, viewGroup, false), aVar.f89305e, aVar.f89303c, aVar.f89304d);
        } else {
            viewHolder = new View$OnClickListenerC2158a(aVar.f89306f);
            viewHolder.setIsRecyclable(false);
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
        MethodCollector.o(1556);
        return viewHolder;
    }

    private a(h hVar, View view, int i2, boolean z) {
        this.f89302a = new ArrayList<>();
        this.f89305e = hVar;
        this.f89306f = view;
        this.f89303c = -1;
        this.f89304d = false;
    }
}
