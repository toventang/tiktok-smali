package com.ss.android.ugc.aweme.kids.commonfeed.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.commonfeed.h.b;
import com.ss.android.ugc.aweme.kids.commonfeed.h.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a extends com.bytedance.ies.uikit.f.a {

    /* renamed from: d  reason: collision with root package name */
    public b f105990d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<Integer, c> f105991e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Fragment f105992f;

    /* renamed from: g  reason: collision with root package name */
    public final String f105993g;

    /* renamed from: h  reason: collision with root package name */
    private final b f105994h = new b();

    /* renamed from: i  reason: collision with root package name */
    private final String f105995i;

    /* renamed from: j  reason: collision with root package name */
    private final View.OnTouchListener f105996j;

    static {
        Covode.recordClassIndex(67810);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f105994h.f105997a.size();
    }

    public final Aweme a(int i2) {
        return this.f105994h.a(i2);
    }

    @Override // com.bytedance.ies.uikit.f.a
    public final void a(View view) {
        Object obj;
        com.ss.android.ugc.aweme.kids.commonfeed.h.a aVar = null;
        if (view != null) {
            obj = view.getTag(R.id.c3o);
        } else {
            obj = null;
        }
        if (obj instanceof com.ss.android.ugc.aweme.kids.commonfeed.h.a) {
            aVar = obj;
        }
        com.ss.android.ugc.aweme.kids.commonfeed.h.a aVar2 = aVar;
        if (aVar2 != null) {
            aVar2.c();
            if (this.f105991e.containsKey(Integer.valueOf(aVar2.h()))) {
                this.f105991e.remove(Integer.valueOf(aVar2.h()));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(List<? extends Aweme> list) {
        b bVar = this.f105994h;
        bVar.f105997a.clear();
        if (list != null) {
            for (Object obj : list) {
                if (obj != null) {
                    bVar.f105997a.add(obj);
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        l.d(obj, "");
        View view = (View) obj;
        Object tag = view != null ? view.getTag(R.id.c3o) : null;
        if (!(tag instanceof com.ss.android.ugc.aweme.kids.commonfeed.h.a)) {
            tag = null;
        }
        com.ss.android.ugc.aweme.kids.commonfeed.h.a aVar = (com.ss.android.ugc.aweme.kids.commonfeed.h.a) tag;
        int count = getCount();
        for (int i2 = 0; i2 < count; i2++) {
            Aweme a2 = a(i2);
            if (aVar != null) {
                String aid = a2 != null ? a2.getAid() : null;
                Aweme b2 = aVar.b();
                if (m.a(aid, b2 != null ? b2.getAid() : null)) {
                    return i2;
                }
            }
        }
        return -2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0155  */
    @Override // com.bytedance.ies.uikit.f.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View a(int r16, android.view.View r17, android.view.ViewGroup r18) {
        /*
        // Method dump skipped, instructions count: 376
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.kids.commonfeed.b.a.a(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, Fragment fragment, String str, String str2, View.OnTouchListener onTouchListener) {
        super(context, LayoutInflater.from(context));
        l.d(fragment, "");
        l.d(str, "");
        l.d(onTouchListener, "");
        this.f105992f = fragment;
        this.f105993g = str;
        this.f105995i = str2;
        this.f105996j = onTouchListener;
    }
}
