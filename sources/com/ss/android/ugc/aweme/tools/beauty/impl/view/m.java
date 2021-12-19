package com.ss.android.ugc.aweme.tools.beauty.impl.view;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.ugc.aweme.tools.beauty.b.a.e;
import com.ss.android.ugc.aweme.tools.beauty.b.c.f;
import com.ss.android.ugc.tools.utils.r;
import com.ss.android.ugc.tools.view.style.StyleTabLayout;
import com.ss.android.ugc.tools.view.style.StyleView;
import com.ss.android.ugc.tools.view.style.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class m implements f {

    /* renamed from: a  reason: collision with root package name */
    public final StyleTabLayout f139131a;

    /* renamed from: b  reason: collision with root package name */
    public Context f139132b;

    /* renamed from: c  reason: collision with root package name */
    public View f139133c;

    /* renamed from: d  reason: collision with root package name */
    public e f139134d;

    /* renamed from: e  reason: collision with root package name */
    public f f139135e;

    /* renamed from: f  reason: collision with root package name */
    private final StyleView f139136f = ((StyleView) this.f139133c.findViewById(R.id.fe7));

    static {
        Covode.recordClassIndex(90991);
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.f
    public final void a() {
        this.f139131a.requestLayout();
    }

    static final class a implements TabLayout.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f139137a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f139138b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f139139c;

        static {
            Covode.recordClassIndex(90992);
        }

        a(m mVar, List list, ArrayList arrayList) {
            this.f139137a = mVar;
            this.f139138b = list;
            this.f139139c = arrayList;
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.b
        public final void a(TabLayout.f fVar) {
            Object obj;
            fVar.a();
            Iterator it = this.f139138b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ArrayList arrayList = this.f139139c;
                l.b(fVar, "");
                if (l.a(arrayList.get(fVar.f130750e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                    break;
                }
            }
            BeautyCategory beautyCategory = (BeautyCategory) obj;
            if (beautyCategory != null) {
                this.f139137a.f139135e.a(beautyCategory);
            }
        }
    }

    private final void b(List<BeautyCategory> list) {
        T t;
        TabLayout.f a2;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getSelected()) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null && (a2 = this.f139131a.a(list.indexOf(t2))) != null) {
            a2.a();
            this.f139135e.a(t2);
        }
    }

    public static final class b implements TabLayout.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f139140a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f139141b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayList f139142c;

        static {
            Covode.recordClassIndex(90993);
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void b(TabLayout.f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void c(TabLayout.f fVar) {
        }

        @Override // com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.c
        public final void a(TabLayout.f fVar) {
            Object obj;
            if (fVar != null) {
                Iterator it = this.f139141b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (l.a(this.f139142c.get(fVar.f130750e), (Object) ((BeautyCategory) obj).getCategoryResponse().getId())) {
                        break;
                    }
                }
                BeautyCategory beautyCategory = (BeautyCategory) obj;
                if (beautyCategory != null) {
                    f fVar2 = this.f139140a.f139135e;
                    l.d(beautyCategory, "");
                    fVar2.f139070a.a(beautyCategory.getCategoryResponse().getId());
                    fVar2.f139073d.a(beautyCategory);
                }
            }
        }

        b(m mVar, List list, ArrayList arrayList) {
            this.f139140a = mVar;
            this.f139141b = list;
            this.f139142c = arrayList;
        }
    }

    private final void c(List<BeautyCategory> list) {
        this.f139131a.b();
        for (T t : list) {
            com.ss.android.ugc.aweme.dependence.beauty.a.c("LJT addTab: " + t.getCategoryResponse().getName());
            Context context = this.f139132b;
            j a2 = com.ss.android.ugc.tools.b.a(context);
            if (TextUtils.isEmpty(t.getCategoryResponse().getIcon_normal_url())) {
                a2.setText(t.getCategoryResponse().getName());
            } else {
                String icon_normal_url = t.getCategoryResponse().getIcon_normal_url();
                if (icon_normal_url == null) {
                    icon_normal_url = "";
                }
                a2.setImage(icon_normal_url);
            }
            a2.setSelectColor(context.getResources().getColor(this.f139134d.f138861e.f138883c));
            a2.setUnSelectColor(context.getResources().getColor(this.f139134d.f138861e.f138884d));
            TabLayout.f a3 = this.f139131a.a().a(a2);
            l.b(a3, "");
            TabLayout.i iVar = a3.f130753h;
            if (iVar != null) {
                iVar.setBackgroundColor(androidx.core.content.b.c(iVar.getContext(), R.color.us));
            }
            this.f139131a.a(a3, false);
        }
        this.f139131a.setSelectedTabIndicatorColor(this.f139132b.getResources().getColor(this.f139134d.f138861e.f138885e));
    }

    @Override // com.ss.android.ugc.aweme.tools.beauty.b.c.f
    public final void a(List<BeautyCategory> list) {
        int i2;
        l.d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getCategoryResponse().getId());
        }
        if (list.size() <= 1) {
            this.f139131a.setHideIndicatorView(true);
        } else {
            this.f139131a.setHideIndicatorView(false);
        }
        if (list.size() == 1) {
            StyleTabLayout styleTabLayout = this.f139131a;
            l.b(styleTabLayout, "");
            styleTabLayout.setTabMode(1);
            StyleTabLayout styleTabLayout2 = this.f139131a;
            l.b(styleTabLayout2, "");
            ViewGroup.LayoutParams layoutParams = styleTabLayout2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = (int) r.a(this.f139132b, 76.0f);
            int i3 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginStart((int) r.a(this.f139132b, 76.0f));
            StyleTabLayout styleTabLayout3 = this.f139131a;
            l.b(styleTabLayout3, "");
            styleTabLayout3.setLayoutParams(layoutParams2);
        } else {
            StyleTabLayout styleTabLayout4 = this.f139131a;
            l.b(styleTabLayout4, "");
            styleTabLayout4.setTabMode(0);
            StyleTabLayout styleTabLayout5 = this.f139131a;
            l.b(styleTabLayout5, "");
            ViewGroup.LayoutParams layoutParams3 = styleTabLayout5.getLayoutParams();
            Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
            if (this.f139134d.f138903m) {
                i2 = (int) r.a(this.f139132b, 56.0f);
            } else {
                i2 = 0;
            }
            layoutParams4.leftMargin = i2;
            int i4 = Build.VERSION.SDK_INT;
            layoutParams4.setMarginStart(i2);
            StyleTabLayout styleTabLayout6 = this.f139131a;
            l.b(styleTabLayout6, "");
            styleTabLayout6.setLayoutParams(layoutParams4);
        }
        c(list);
        this.f139131a.setOnTabClickListener(new a(this, list, arrayList));
        this.f139131a.a(new b(this, list, arrayList));
        b(list);
        if (this.f139134d.f138861e.f138882b) {
            StyleTabLayout styleTabLayout7 = this.f139131a;
            l.b(styleTabLayout7, "");
            styleTabLayout7.setVisibility(0);
        } else {
            StyleTabLayout styleTabLayout8 = this.f139131a;
            l.b(styleTabLayout8, "");
            styleTabLayout8.setVisibility(4);
        }
        if (list.size() > 4) {
            StyleView styleView = this.f139136f;
            l.b(styleView, "");
            styleView.setVisibility(0);
            return;
        }
        StyleView styleView2 = this.f139136f;
        l.b(styleView2, "");
        styleView2.setVisibility(8);
    }

    public m(Context context, View view, e eVar, f fVar) {
        l.d(context, "");
        l.d(view, "");
        l.d(eVar, "");
        l.d(fVar, "");
        this.f139132b = context;
        this.f139133c = view;
        this.f139134d = eVar;
        this.f139135e = fVar;
        this.f139131a = (StyleTabLayout) view.findViewById(R.id.en4);
    }
}
