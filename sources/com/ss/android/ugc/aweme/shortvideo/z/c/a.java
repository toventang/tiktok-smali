package com.ss.android.ugc.aweme.shortvideo.z.c;

import android.app.Activity;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.i;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.a.m;
import h.f.b.l;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class a extends h {

    /* renamed from: a  reason: collision with root package name */
    public int f133039a;

    /* renamed from: b  reason: collision with root package name */
    public final List<com.ss.android.ugc.aweme.shortvideo.z.a.a> f133040b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.shortvideo.z.d.a f133041c;

    /* renamed from: d  reason: collision with root package name */
    private final m<Integer, View, z> f133042d = new C3444a(this);

    static {
        Covode.recordClassIndex(86993);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c() {
        return this.f133040b.size();
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        return this.f133040b.get(i2).f133037b;
    }

    public final void a(List<com.ss.android.ugc.aweme.shortvideo.z.a.a> list) {
        l.d(list, "");
        this.f133040b.clear();
        this.f133040b.addAll(list);
        notifyDataSetChanged();
    }

    public a(com.ss.android.ugc.aweme.shortvideo.z.d.a aVar) {
        l.d(aVar, "");
        this.f133041c = aVar;
        registerAdapterDataObserver(new RecyclerView.c(this) {
            /* class com.ss.android.ugc.aweme.shortvideo.z.c.a.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f133043a;

            static {
                Covode.recordClassIndex(86994);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a() {
                a aVar = this.f133043a;
                aVar.f133039a = aVar.getItemCount();
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f133043a = r1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void b(int i2, int i3) {
                a aVar = this.f133043a;
                aVar.f133039a = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void c(int i2, int i3) {
                a aVar = this.f133043a;
                aVar.f133039a = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3) {
                a aVar = this.f133043a;
                aVar.f133039a = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.c
            public final void a(int i2, int i3, int i4) {
                a aVar = this.f133043a;
                aVar.f133039a = aVar.getItemCount();
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        View a2 = com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.f7, viewGroup, false);
        com.ss.android.ugc.aweme.shortvideo.z.d.a aVar = this.f133041c;
        l.b(a2, "");
        d dVar = new d(aVar, a2);
        dVar.f133075a = this.f133042d;
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.z.c.a$a  reason: collision with other inner class name */
    static final class C3444a extends h.f.b.m implements m<Integer, View, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(86995);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3444a(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(Integer num, View view) {
            List<com.ss.android.ugc.aweme.shortvideo.z.a.a> a2;
            int intValue = num.intValue();
            View view2 = view;
            l.d(view2, "");
            Activity a3 = i.a(view2.getContext());
            if ((a3 instanceof e) && a3 != null) {
                com.ss.android.ugc.aweme.shortvideo.z.d.a aVar = this.this$0.f133041c;
                com.ss.android.ugc.aweme.shortvideo.z.a.a aVar2 = this.this$0.f133040b.get(intValue);
                l.d(aVar2, "");
                List<com.ss.android.ugc.aweme.shortvideo.z.a.a> value = aVar.f133087b.getValue();
                if (value != null) {
                    a2 = n.g((Collection) value);
                    if (a2.contains(aVar2)) {
                        a2.remove(aVar2);
                    } else {
                        a2.clear();
                        a2.add(aVar2);
                    }
                } else {
                    a2 = n.a(aVar2);
                }
                aVar.a(a2);
                this.this$0.notifyDataSetChanged();
            }
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        String str;
        if (getItemViewType(i2) == 3) {
            if (!(viewHolder instanceof d)) {
                viewHolder = null;
            }
            d dVar = (d) viewHolder;
            if (dVar != null) {
                com.ss.android.ugc.aweme.shortvideo.z.a.a aVar = this.f133040b.get(i2);
                l.d(aVar, "");
                User user = aVar.f133036a;
                TextView textView = dVar.f133076b;
                String remarkName = user.getRemarkName();
                if (remarkName == null || remarkName.length() == 0) {
                    str = user.getNickname();
                } else {
                    str = user.getRemarkName();
                }
                textView.setText(str);
                dVar.f133077c.setText(user.getUniqueId());
                com.ss.android.ugc.tools.c.a.a(dVar.f133078d, user.getAvatarThumb(), -1, -1);
                ViewGroup.LayoutParams layoutParams = dVar.f133079e.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int i3 = Build.VERSION.SDK_INT;
                marginLayoutParams.setMarginStart(dVar.a());
                marginLayoutParams.leftMargin = dVar.a();
                dVar.f133079e.setLayoutParams(marginLayoutParams);
                List<com.ss.android.ugc.aweme.shortvideo.z.a.a> value = dVar.f133080f.f133087b.getValue();
                if (value == null) {
                    value = h.a.z.INSTANCE;
                }
                dVar.f133079e.setChecked(value.contains(aVar));
            }
        }
    }
}
