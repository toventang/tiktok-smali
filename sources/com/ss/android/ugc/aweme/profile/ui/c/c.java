package com.ss.android.ugc.aweme.profile.ui.c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.badge.TuxAlertBadge;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.profile.widgets.k;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public final class c extends RecyclerView.a<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f117039e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    final List<com.ss.android.ugc.aweme.user.c> f117040a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference<k.b> f117041b;

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.profile.e.a f117042c;

    /* renamed from: d  reason: collision with root package name */
    public final e f117043d;

    static {
        Covode.recordClassIndex(75574);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(viewGroup, i2);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(75575);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        return this.f117040a.size();
    }

    public static final class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final AvatarImageView f117044a;

        /* renamed from: b  reason: collision with root package name */
        public final TextView f117045b;

        /* renamed from: c  reason: collision with root package name */
        public final TextView f117046c;

        /* renamed from: d  reason: collision with root package name */
        public final ImageView f117047d;

        /* renamed from: e  reason: collision with root package name */
        public final TuxAlertBadge f117048e;

        static {
            Covode.recordClassIndex(75576);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            l.d(view, "");
            View findViewById = view.findViewById(R.id.or);
            l.b(findViewById, "");
            this.f117044a = (AvatarImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.ca7);
            l.b(findViewById2, "");
            this.f117045b = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.ca8);
            l.b(findViewById3, "");
            this.f117046c = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ahj);
            l.b(findViewById4, "");
            this.f117047d = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(R.id.clk);
            l.b(findViewById5, "");
            this.f117048e = (TuxAlertBadge) findViewById5;
        }
    }

    private static RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(6998);
        l.d(viewGroup, "");
        View a3 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.aoj, viewGroup, false);
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
        MethodCollector.o(6998);
        return bVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        int i3;
        int a2;
        b bVar2 = bVar;
        l.d(bVar2, "");
        com.ss.android.ugc.aweme.user.c cVar = this.f117040a.get(i2);
        if (l.a((Object) cVar.f142345a, (Object) "-1")) {
            bVar2.f117044a.setImageResource(2131233414);
            bVar2.f117045b.setText(R.string.p0);
            bVar2.f117046c.setVisibility(8);
        } else {
            com.ss.android.ugc.aweme.base.e.b(bVar2.f117044a, cVar.f142349e, -1, -1);
            bVar2.f117045b.setVisibility(0);
            bVar2.f117045b.setText(cVar.a());
            bVar2.f117046c.setText(cVar.f142348d);
        }
        ImageView imageView = bVar2.f117047d;
        String str = cVar.f142345a;
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (l.a((Object) str, (Object) g2.getCurUserId())) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        bVar2.f117048e.setVisibility(8);
        String str2 = cVar.f142345a;
        IAccountUserService g3 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g3, "");
        if ((!l.a((Object) str2, (Object) g3.getCurUserId())) && (a2 = com.ss.android.ugc.aweme.notice.api.b.a(cVar.f142345a)) > 0) {
            bVar2.f117048e.setVisibility(0);
            bVar2.f117048e.setCount(a2);
            bVar2.f117048e.setMaxCount(99);
        }
        View view = bVar2.itemView;
        WeakReference<k.b> weakReference = this.f117041b;
        View view2 = bVar2.itemView;
        l.b(view2, "");
        Context context = view2.getContext();
        l.b(context, "");
        view.setOnClickListener(new k(weakReference, cVar, context, this.f117043d, this.f117042c));
    }

    public c(WeakReference<k.b> weakReference, com.ss.android.ugc.aweme.profile.e.a aVar, e eVar) {
        l.d(weakReference, "");
        l.d(aVar, "");
        l.d(eVar, "");
        this.f117041b = weakReference;
        this.f117042c = aVar;
        this.f117043d = eVar;
    }
}
