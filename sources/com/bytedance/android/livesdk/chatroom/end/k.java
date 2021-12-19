package com.bytedance.android.livesdk.chatroom.end;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.b;
import com.bytedance.android.livesdk.chatroom.end.TopFansLayout;
import com.bytedance.android.livesdk.chatroom.g.g;
import com.bytedance.android.livesdk.model.ay;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdk.userservice.u;
import com.bytedance.common.utility.h;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import f.a.d.f;
import java.util.Iterator;
import java.util.List;

final /* synthetic */ class k implements f {

    /* renamed from: a  reason: collision with root package name */
    private final TopFansLayout f15453a;

    /* renamed from: b  reason: collision with root package name */
    private final a f15454b;

    static {
        Covode.recordClassIndex(8534);
    }

    k(TopFansLayout topFansLayout, a aVar) {
        this.f15453a = topFansLayout;
        this.f15454b = aVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        MethodCollector.i(1774);
        TopFansLayout topFansLayout = this.f15453a;
        List list = (List) obj;
        if (this.f15454b.isViewValid() && !h.a(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ay ayVar = (ay) it.next();
                if (ayVar == null || ayVar.f19025a <= 0) {
                    it.remove();
                }
            }
            if (!h.a(list)) {
                TypedArray obtainTypedArray = topFansLayout.getContext().getResources().obtainTypedArray(R.array.aw);
                topFansLayout.f15394b.clear();
                int i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        if (i2 >= obtainTypedArray.length()) {
                            break;
                        }
                        User user = ((ay) list.get(i2)).f19026b;
                        if (user != null) {
                            TopFansLayout.b bVar = new TopFansLayout.b(LayoutInflater.from(topFansLayout.getContext()).inflate(R.layout.baa, (ViewGroup) null), (byte) 0);
                            g.a(bVar.f15413c, user.getAvatarThumb(), 2131234424);
                            if (user.getId() == u.a().b().c() || user.isFollowing() || !topFansLayout.f15403k) {
                                bVar.f15411a.setVisibility(8);
                            } else {
                                bVar.f15411a.setVisibility(0);
                            }
                            ay ayVar2 = (ay) list.get(i2);
                            ayVar2.f19027c = i2 + 1;
                            bVar.f15411a.setTag(R.id.esx, ayVar2);
                            bVar.f15411a.setOnClickListener(topFansLayout.f15404l);
                            bVar.f15413c.setBackgroundResource(obtainTypedArray.getResourceId(i2, 0));
                            bVar.f15413c.setTag(R.id.esx, ayVar2);
                            bVar.f15413c.setOnClickListener(topFansLayout.f15399g);
                            if (ayVar2.f19026b != null) {
                                bVar.f15414d.setText(ayVar2.f19026b.getNickName());
                                bVar.f15415e.setText(topFansLayout.f15396d.getResources().getString(R.string.gwd, b.b(ayVar2.f19025a)));
                            }
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                            layoutParams.weight = 1.0f;
                            bVar.f15412b.setLayoutParams(layoutParams);
                            topFansLayout.f15394b.add(bVar);
                            topFansLayout.addView(bVar.f15412b);
                            if (i2 != list.size() - 1) {
                                View view = new View(topFansLayout.f15396d);
                                view.setBackgroundResource(R.drawable.bww);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) n.b(topFansLayout.f15396d, 0.5f), -1);
                                layoutParams2.topMargin = (int) n.b(topFansLayout.f15396d, 20.0f);
                                layoutParams2.bottomMargin = (int) n.b(topFansLayout.f15396d, 20.0f);
                                topFansLayout.addView(view, layoutParams2);
                            }
                            if (i2 == 0 && list.size() != 2) {
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) bVar.f15413c.getLayoutParams();
                                layoutParams3.topMargin = 0;
                                layoutParams3.width = (int) n.b(topFansLayout.f15396d, 56.0f);
                                layoutParams3.height = (int) n.b(topFansLayout.f15396d, 56.0f);
                                bVar.f15414d.setTextSize(2, 14.0f);
                                ((RelativeLayout.LayoutParams) bVar.f15414d.getLayoutParams()).topMargin = (int) n.b(topFansLayout.f15396d, 24.0f);
                            }
                        }
                        i2++;
                    } else {
                        if (list.size() == 3) {
                            int indexOfChild = topFansLayout.indexOfChild(topFansLayout.f15394b.get(1).f15412b);
                            topFansLayout.removeView(topFansLayout.f15394b.get(0).f15412b);
                            topFansLayout.removeView(topFansLayout.f15394b.get(1).f15412b);
                            topFansLayout.addView(topFansLayout.f15394b.get(1).f15412b, 0);
                            topFansLayout.addView(topFansLayout.f15394b.get(0).f15412b, indexOfChild);
                        }
                        obtainTypedArray.recycle();
                        topFansLayout.postInvalidate();
                        topFansLayout.a();
                    }
                }
            }
        }
        MethodCollector.o(1774);
    }
}
