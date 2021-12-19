package com.ss.android.ugc.aweme.feed.adapter;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.feed.api.k;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class q extends f<k> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91861a = new a((byte) 0);

    static {
        Covode.recordClassIndex(57825);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57826);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public q() {
        d(false);
    }

    private static SlimRoom a(k kVar) {
        if (kVar.getSlimRoom() != null) {
            return kVar.getSlimRoom();
        }
        String str = kVar.getUser().roomData;
        l.b(str, "");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            kVar.setSlimRoom((SlimRoom) dg.a(str, SlimRoom.class));
            return kVar.getSlimRoom();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        SlimRoom.a linkMic;
        List<User> list;
        Object obj = this.f76354l.get(i2);
        l.b(obj, "");
        SlimRoom a2 = a((k) obj);
        if (a2 == null || (linkMic = a2.getLinkMic()) == null || (list = linkMic.f23031a) == null || list.size() < 2) {
            return 1;
        }
        return 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof s) {
            ((s) viewHolder).f91879d.d();
        }
        if (viewHolder instanceof r) {
            r rVar = (r) viewHolder;
            rVar.f91863c.d();
            rVar.f91864d.d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01f1  */
    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r31) {
        /*
        // Method dump skipped, instructions count: 554
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.q.onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (viewGroup == null) {
            l.b();
        }
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i3 = R.layout.a0j;
        if (i2 != 1 && i2 == 2) {
            i3 = R.layout.a0i;
        }
        View a2 = com.a.a(from, i3, viewGroup, false);
        if (i2 == 1) {
            l.b(a2, "");
            return new s(a2);
        } else if (i2 != 2) {
            l.b(a2, "");
            return new s(a2);
        } else {
            l.b(a2, "");
            return new r(a2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof s) {
            s sVar = (s) viewHolder;
            Object obj = this.f76354l.get(i2);
            l.b(obj, "");
            k kVar = (k) obj;
            List e2 = e();
            l.b(e2, "");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : e2) {
                if (obj2 instanceof k) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(n.a((Iterable) arrayList2, 10));
            for (Object obj3 : arrayList2) {
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.api.FollowingInterestUser");
                arrayList3.add(obj3);
            }
            sVar.a(kVar, arrayList3, i2);
        }
        if (viewHolder instanceof r) {
            r rVar = (r) viewHolder;
            Object obj4 = this.f76354l.get(i2);
            l.b(obj4, "");
            k kVar2 = (k) obj4;
            List e3 = e();
            l.b(e3, "");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : e3) {
                if (obj5 instanceof k) {
                    arrayList4.add(obj5);
                }
            }
            ArrayList arrayList5 = arrayList4;
            ArrayList arrayList6 = new ArrayList(n.a((Iterable) arrayList5, 10));
            for (Object obj6 : arrayList5) {
                Objects.requireNonNull(obj6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.api.FollowingInterestUser");
                arrayList6.add(obj6);
            }
            rVar.a(kVar2, arrayList6, i2);
        }
    }
}
