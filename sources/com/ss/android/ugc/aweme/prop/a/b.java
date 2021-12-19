package com.ss.android.ugc.aweme.prop.a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.BaseAdapter;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.prop.b.h;
import com.ss.android.ugc.aweme.sticker.model.g;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class b extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public List<g> f118204a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public int f118205b;

    /* renamed from: c  reason: collision with root package name */
    private Context f118206c;

    /* renamed from: d  reason: collision with root package name */
    private h f118207d;

    static {
        Covode.recordClassIndex(76762);
    }

    public final Object getItem(int i2) {
        return null;
    }

    public final long getItemId(int i2) {
        return 0;
    }

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public View f118208a;

        /* renamed from: b  reason: collision with root package name */
        public RemoteImageView f118209b;

        static {
            Covode.recordClassIndex(76763);
        }

        a() {
        }
    }

    public final int getCount() {
        List<g> list = this.f118204a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public b(Context context, h hVar) {
        this.f118206c = context;
        this.f118207d = hVar;
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        a aVar;
        if (view == null) {
            view = com.a.a(LayoutInflater.from(this.f118206c), R.layout.ab9, viewGroup, false);
            aVar = new a();
            aVar.f118208a = view.findViewById(R.id.bmq);
            aVar.f118209b = (RemoteImageView) view.findViewById(R.id.ebg);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        ((com.facebook.drawee.f.a) aVar.f118209b.getHierarchy()).c(R.drawable.bkj);
        e.a(aVar.f118209b, this.f118204a.get(i2).iconUrl);
        if (this.f118204a.get(i2).mIsSelect) {
            aVar.f118208a.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f118208a, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.start();
        } else {
            aVar.f118208a.setVisibility(4);
        }
        return view;
    }
}
