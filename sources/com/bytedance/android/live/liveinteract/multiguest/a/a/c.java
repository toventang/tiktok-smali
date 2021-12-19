package com.bytedance.android.live.liveinteract.multiguest.a.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.f.k;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class c extends RecyclerView.a<b> {

    /* renamed from: a  reason: collision with root package name */
    public a f11040a;

    /* renamed from: b  reason: collision with root package name */
    public String f11041b = "";

    /* renamed from: c  reason: collision with root package name */
    private List<com.bytedance.android.livesdkapi.depend.model.a> f11042c;

    /* renamed from: d  reason: collision with root package name */
    private int f11043d;

    /* renamed from: e  reason: collision with root package name */
    private int f11044e;

    /* renamed from: f  reason: collision with root package name */
    private View.OnClickListener f11045f = new View.OnClickListener() {
        /* class com.bytedance.android.live.liveinteract.multiguest.a.a.c.AnonymousClass1 */

        static {
            Covode.recordClassIndex(5932);
        }

        public final void onClick(View view) {
            if (view.getTag(R.id.bm4) instanceof com.bytedance.android.livesdkapi.depend.model.a) {
                com.bytedance.android.livesdkapi.depend.model.a aVar = (com.bytedance.android.livesdkapi.depend.model.a) view.getTag(R.id.bm4);
                if (!TextUtils.equals(c.this.f11041b, aVar.f22996b)) {
                    c.this.f11041b = aVar.f22996b;
                    c.this.notifyDataSetChanged();
                    if (TextUtils.equals(c.this.f11041b, "")) {
                        c.this.f11040a.b(aVar);
                    } else if (aVar.f23006l) {
                        c.this.f11040a.b(aVar);
                    } else if (!aVar.f23007m) {
                        c.this.f11040a.a(aVar);
                    }
                }
            }
        }
    };

    public interface a {
        static {
            Covode.recordClassIndex(5933);
        }

        void a(com.bytedance.android.livesdkapi.depend.model.a aVar);

        void b(com.bytedance.android.livesdkapi.depend.model.a aVar);
    }

    static {
        Covode.recordClassIndex(5931);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final int getItemCount() {
        List<com.bytedance.android.livesdkapi.depend.model.a> list = this.f11042c;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    public class b extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        View f11047a;

        /* renamed from: b  reason: collision with root package name */
        View f11048b;

        /* renamed from: c  reason: collision with root package name */
        View f11049c;

        /* renamed from: d  reason: collision with root package name */
        HSImageView f11050d;

        /* renamed from: e  reason: collision with root package name */
        View f11051e;

        static {
            Covode.recordClassIndex(5934);
        }

        b(View view) {
            super(view);
            this.f11047a = view.findViewById(R.id.c9x);
            this.f11048b = view.findViewById(R.id.dnk);
            this.f11049c = view.findViewById(R.id.qq);
            this.f11050d = (HSImageView) view.findViewById(R.id.bm4);
            this.f11051e = view.findViewById(R.id.chg);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final /* synthetic */ void onBindViewHolder(b bVar, int i2) {
        boolean z;
        b bVar2 = bVar;
        com.bytedance.android.livesdkapi.depend.model.a aVar = this.f11042c.get(i2);
        if (TextUtils.equals(aVar.f22996b, "")) {
            bVar2.f11050d.setImageResource(2131234457);
        } else {
            k.a(bVar2.f11050d, aVar.f22998d.a());
        }
        if (TextUtils.equals(this.f11041b, aVar.f22996b)) {
            bVar2.f11049c.setVisibility(0);
        } else {
            bVar2.f11049c.setVisibility(8);
        }
        bVar2.f11050d.setTag(R.id.bm4, aVar);
        bVar2.f11050d.setOnClickListener(this.f11045f);
        boolean z2 = true;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i2 != getItemCount() - 1) {
            z2 = false;
        }
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) bVar2.f11047a.getLayoutParams();
        if (aVar2 == null) {
            aVar2 = new ConstraintLayout.a(-2, -1);
        }
        ConstraintLayout.a aVar3 = (ConstraintLayout.a) bVar2.f11048b.getLayoutParams();
        if (aVar3 == null) {
            aVar3 = new ConstraintLayout.a(-2, -1);
        }
        ViewGroup.LayoutParams layoutParams = bVar2.itemView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-2, -1);
        }
        if (z) {
            aVar2.width = this.f11043d;
            aVar3.width = this.f11043d / 2;
        } else if (z2) {
            aVar2.width = this.f11043d / 2;
            aVar3.width = this.f11043d;
        } else {
            aVar2.width = this.f11043d / 2;
            aVar3.width = this.f11043d / 2;
        }
        layoutParams.width = aVar2.width + aVar3.width + this.f11044e;
        bVar2.itemView.setLayoutParams(layoutParams);
        bVar2.f11047a.setLayoutParams(aVar2);
        bVar2.f11048b.setLayoutParams(aVar3);
        if (aVar.f23007m) {
            bVar2.f11051e.setVisibility(0);
        } else {
            bVar2.f11051e.setVisibility(8);
        }
    }

    public c(Context context, List<com.bytedance.android.livesdkapi.depend.model.a> list, a aVar) {
        this.f11042c = list;
        this.f11040a = aVar;
        int a2 = n.a(context);
        int b2 = (int) n.b(context, 56.0f);
        this.f11044e = b2;
        this.f11043d = (a2 - (b2 * 5)) / 6;
    }

    public final void a(String str, com.bytedance.android.livesdkapi.depend.model.a aVar, int i2) {
        if (com.bytedance.android.live.effect.api.a.f9638c.equals(str)) {
            String str2 = aVar.f22996b;
            for (com.bytedance.android.livesdkapi.depend.model.a aVar2 : this.f11042c) {
                if (TextUtils.equals(str2, aVar2.f22996b)) {
                    if (i2 == 2) {
                        aVar2.f23007m = false;
                        aVar2.f23006l = true;
                        if (TextUtils.equals(aVar2.f22996b, this.f11041b)) {
                            this.f11040a.b(aVar2);
                        }
                    } else if (i2 == 3) {
                        aVar2.f23007m = false;
                    } else if (i2 == 1) {
                        aVar2.f23007m = true;
                    }
                    notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    private static RecyclerView.ViewHolder a(c cVar, ViewGroup viewGroup, int i2) {
        boolean a2;
        MethodCollector.i(8792);
        b bVar = new b(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.bf1, viewGroup, false));
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
        MethodCollector.o(8792);
        return bVar;
    }
}
