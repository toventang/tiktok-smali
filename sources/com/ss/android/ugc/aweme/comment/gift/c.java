package com.ss.android.ugc.aweme.comment.gift;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.lifecycle.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.comment.gift.model.GiftPage;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResponse;
import com.ss.android.ugc.aweme.comment.gift.model.GiftResult;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.ugc.live.a.a.e;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class c extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final GiftViewModel f71840a;

    /* renamed from: b  reason: collision with root package name */
    private final Fragment f71841b;

    /* renamed from: c  reason: collision with root package name */
    private final e f71842c;

    /* renamed from: d  reason: collision with root package name */
    private final String f71843d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71844e;

    /* renamed from: f  reason: collision with root package name */
    private final String f71845f;

    static {
        Covode.recordClassIndex(44185);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        l.d(view, "");
        l.d(obj, "");
        return view == obj;
    }

    public static final class a extends RecyclerView.n {
        static {
            Covode.recordClassIndex(44186);
        }

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void a(RecyclerView recyclerView, int i2) {
            l.d(recyclerView, "");
            if (i2 != 0) {
                super.a(recyclerView, i2);
            }
        }
    }

    public static final class b extends i {
        static {
            Covode.recordClassIndex(44187);
        }

        b() {
        }

        @Override // com.ss.android.ugc.aweme.comment.gift.j, com.ss.android.ugc.aweme.comment.gift.i
        public final View a(RecyclerView.i iVar) {
            l.d(iVar, "");
            View a2 = super.a(iVar);
            if (a2 == null) {
                return null;
            }
            return a2;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i2) {
        if (i2 == 0) {
            return this.f71842c.getResources().getString(R.string.hb4);
        }
        return this.f71842c.getResources().getString(R.string.hb5);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.gift.c$c  reason: collision with other inner class name */
    static final class C1617c<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f71846a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f71847b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f71848c;

        static {
            Covode.recordClassIndex(44188);
        }

        C1617c(c cVar, g gVar, int i2) {
            this.f71846a = cVar;
            this.f71847b = gVar;
            this.f71848c = i2;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            GiftResult giftPageList;
            List<GiftPage> giftPageList2;
            int i2;
            int i3;
            GiftResponse value = this.f71846a.f71840a.a().getValue();
            if (!(value == null || (giftPageList = value.getGiftPageList()) == null || (giftPageList2 = giftPageList.getGiftPageList()) == null || !(!giftPageList2.isEmpty()))) {
                g gVar = this.f71847b;
                List<GiftStruct> giftList = giftPageList2.get(this.f71848c).getGiftList();
                if (!(giftList == null || giftList.isEmpty())) {
                    int size = (((giftList.size() - 1) / gVar.f71875b) + 1) * gVar.f71875b;
                    GiftStruct[] giftStructArr = new GiftStruct[size];
                    int i4 = 0;
                    for (T t : giftList) {
                        int i5 = i4 / gVar.f71875b;
                        int i6 = i4 % gVar.f71875b;
                        int i7 = gVar.f71875b / 2;
                        if (i6 < i7) {
                            i2 = i6 * 2;
                            i3 = gVar.f71875b;
                        } else {
                            i2 = ((i6 - i7) * 2) + 1;
                            i3 = gVar.f71875b;
                        }
                        int i8 = i2 + (i5 * i3);
                        if (i8 < size) {
                            giftStructArr[i8] = t;
                        }
                        i4++;
                    }
                    gVar.f71874a = giftStructArr;
                    gVar.notifyDataSetChanged();
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final /* synthetic */ Object instantiateItem(ViewGroup viewGroup, int i2) {
        MethodCollector.i(886);
        l.d(viewGroup, "");
        RecyclerView recyclerView = new RecyclerView(this.f71842c);
        recyclerView.setLayoutParams(new RecyclerView.j(-1, -1));
        recyclerView.setLayoutManager(new GridLayoutManager(2, 0, false));
        Fragment fragment = this.f71841b;
        e eVar = this.f71842c;
        GiftViewModel giftViewModel = this.f71840a;
        CharSequence pageTitle = getPageTitle(i2);
        if (pageTitle != null) {
            g gVar = new g(fragment, eVar, giftViewModel, (String) pageTitle, this.f71843d, this.f71844e, this.f71845f);
            recyclerView.setAdapter(gVar);
            b bVar = new b();
            if (((i) bVar).f71898a > 0) {
                ((i) bVar).f71898a = 2;
                if (((i) bVar).f71899b > 0) {
                    ((i) bVar).f71899b = 4;
                    bVar.a(recyclerView);
                    recyclerView.a(new a());
                    this.f71840a.a().observe(this.f71842c, new C1617c(this, gVar, i2));
                    viewGroup.addView(recyclerView);
                    MethodCollector.o(886);
                    return recyclerView;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("column must be greater than zero");
                MethodCollector.o(886);
                throw illegalArgumentException;
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("row must be greater than zero");
            MethodCollector.o(886);
            throw illegalArgumentException2;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type kotlin.String");
        MethodCollector.o(886);
        throw nullPointerException;
    }

    public c(Fragment fragment, e eVar, GiftViewModel giftViewModel, String str, String str2, String str3) {
        l.d(fragment, "");
        l.d(eVar, "");
        l.d(giftViewModel, "");
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f71841b = fragment;
        this.f71842c = eVar;
        this.f71840a = giftViewModel;
        this.f71843d = str;
        this.f71844e = str2;
        this.f71845f = str3;
        if (com.ss.android.ugc.aweme.comment.gift.model.a.f71940f == null) {
            e.a aVar = new e.a(eVar);
            aVar.f154038f = 2;
            aVar.f154035c = 2;
            aVar.f154037e = 5;
            com.ss.ugc.live.a.a.e a2 = aVar.a();
            l.b(a2, "");
            l.d(a2, "");
            com.ss.android.ugc.aweme.comment.gift.model.a.f71940f = a2;
        }
    }
}
