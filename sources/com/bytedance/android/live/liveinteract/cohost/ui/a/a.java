package com.bytedance.android.live.liveinteract.cohost.ui.a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.f.p;
import com.bytedance.android.live.core.widget.c;
import com.bytedance.android.live.liveinteract.cohost.ui.view.a;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class a extends com.bytedance.android.live.uikit.d.a {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<ImageModel> f10231a = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f10232e;

    static {
        Covode.recordClassIndex(5386);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return Integer.MAX_VALUE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.cohost.ui.a.a$a  reason: collision with other inner class name */
    public static final class C0167a implements ViewPager.f {

        /* renamed from: a  reason: collision with root package name */
        public ViewPager f10233a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10234b;

        static {
            Covode.recordClassIndex(5387);
        }

        public C0167a(ViewPager viewPager, boolean z) {
            l.d(viewPager, "");
            this.f10233a = viewPager;
            this.f10234b = z;
        }

        @Override // androidx.viewpager.widget.ViewPager.f
        public final void a(View view, float f2) {
            l.d(view, "");
            c cVar = new c((byte) 0);
            View findViewById = view.findViewById(R.id.c09);
            if (findViewById != null) {
                Object tag = view.getTag();
                if (!(tag instanceof Integer)) {
                    tag = null;
                }
                Integer num = (Integer) tag;
                if (num != null) {
                    int intValue = num.intValue();
                    if (intValue - this.f10233a.getCurrentItem() == 2) {
                        findViewById.setPivotX(0.0f);
                    } else if (this.f10233a.getCurrentItem() - intValue == 2) {
                        findViewById.setPivotX((float) findViewById.getWidth());
                    } else {
                        findViewById.setPivotX(((float) findViewById.getWidth()) / 2.0f);
                    }
                }
                findViewById.setPivotY(((float) findViewById.getHeight()) / 2.0f);
                float f3 = 0.7f * f2;
                findViewById.setScaleX(1.0f - cVar.getInterpolation(Math.abs(f3)));
                findViewById.setScaleY(1.0f - cVar.getInterpolation(Math.abs(f3)));
                findViewById.setAlpha(1.0f - Math.abs(f2));
            }
            if (f2 == 0.0f) {
                if (!(view instanceof com.bytedance.android.live.liveinteract.cohost.ui.view.a)) {
                    view = null;
                }
                com.bytedance.android.live.liveinteract.cohost.ui.view.a aVar = (com.bytedance.android.live.liveinteract.cohost.ui.view.a) view;
                if (this.f10234b) {
                    if (aVar != null) {
                        aVar.a();
                    }
                } else if (aVar != null) {
                    aVar.f10453a = b.a(2300, TimeUnit.MILLISECONDS).a(new f()).d(new a.f(aVar));
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater);
        l.d(context, "");
        l.d(layoutInflater, "");
        ArrayList arrayList = new ArrayList();
        arrayList.add(2131234837);
        arrayList.add(2131234835);
        arrayList.add(2131234834);
        arrayList.add(2131234836);
        arrayList.add(2131234837);
        this.f10232e = arrayList;
    }

    @Override // com.bytedance.android.live.uikit.d.a
    public final View a(int i2, View view, ViewGroup viewGroup) {
        if (!(view instanceof com.bytedance.android.live.liveinteract.cohost.ui.view.a)) {
            view = null;
        }
        com.bytedance.android.live.liveinteract.cohost.ui.view.a aVar = (com.bytedance.android.live.liveinteract.cohost.ui.view.a) view;
        if (aVar == null) {
            Context context = this.f12902d;
            l.b(context, "");
            aVar = new com.bytedance.android.live.liveinteract.cohost.ui.view.a(context, (byte) 0);
        }
        aVar.setTag(Integer.valueOf(i2));
        if (this.f10231a.size() >= 10) {
            ImageModel imageModel = this.f10231a.get(Math.abs(i2) % this.f10231a.size());
            l.b(imageModel, "");
            ImageModel imageModel2 = imageModel;
            l.d(imageModel2, "");
            g.a(aVar.getMUserAvatar(), imageModel2, aVar.getMUserAvatar().getWidth(), aVar.getMUserAvatar().getHeight(), 2131234424);
        } else {
            p.a(aVar.getMUserAvatar(), this.f10232e.get(Math.abs(i2) % this.f10232e.size()).intValue(), aVar.getMUserAvatar().getWidth(), aVar.getMUserAvatar().getHeight());
        }
        return aVar;
    }
}
