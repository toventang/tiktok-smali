package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.viewpager.c;
import com.google.android.material.tabs.TabLayout;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;

public final class b extends CoordinatorLayout {

    /* renamed from: h  reason: collision with root package name */
    private HashMap f37501h;

    static {
        Covode.recordClassIndex(22561);
    }

    public final View b(int i2) {
        if (this.f37501h == null) {
            this.f37501h = new HashMap();
        }
        View view = (View) this.f37501h.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i2);
        this.f37501h.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final void d(View view) {
        ((CustomAppBarLayout) b(R.id.l_)).addView(view);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(context);
        l.c(context, "");
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.bku, this, true);
        l.a((Object) a2, "");
        a2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public static final class a implements c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f37502a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f37503b;

        static {
            Covode.recordClassIndex(22562);
        }

        a(b bVar, View view) {
            this.f37502a = bVar;
            this.f37503b = view;
        }

        @Override // com.bytedance.ies.xelement.viewpager.c.d
        public final void a(TabLayout tabLayout, boolean z) {
            l.c(tabLayout, "");
            ((c) this.f37503b).a((View) tabLayout);
            b bVar = this.f37502a;
            l.c(tabLayout, "");
            CustomAppBarLayout customAppBarLayout = (CustomAppBarLayout) bVar.b(R.id.l_);
            l.a((Object) customAppBarLayout, "");
            int childCount = customAppBarLayout.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = ((CustomAppBarLayout) bVar.b(R.id.l_)).getChildAt(i2);
                if (childAt instanceof TabLayout) {
                    TabLayout tabLayout2 = (TabLayout) childAt;
                    if (tabLayout2 != null) {
                        ((CustomAppBarLayout) bVar.b(R.id.l_)).removeView(tabLayout2);
                    }
                } else {
                    i2++;
                }
            }
            bVar.d((View) tabLayout);
            ((CustomAppBarLayout) this.f37502a.findViewById(R.id.l_)).setIsEnableTabbarDrag(z);
        }
    }
}
