package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.zhiliaoapp.musically.R;
import java.util.List;

public final class ay extends BaseAdapter {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f116894a;

    /* renamed from: b  reason: collision with root package name */
    private Context f116895b;

    /* renamed from: c  reason: collision with root package name */
    private List<a> f116896c;

    static {
        Covode.recordClassIndex(75497);
    }

    public final long getItemId(int i2) {
        return 0;
    }

    public final int getCount() {
        return this.f116896c.size();
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f116897a;

        /* renamed from: b  reason: collision with root package name */
        boolean f116898b = false;

        static {
            Covode.recordClassIndex(75498);
        }

        public a(String str) {
            this.f116897a = str;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public a getItem(int i2) {
        return this.f116896c.get(i2);
    }

    public ay(Context context, List<a> list) {
        this.f116895b = context;
        this.f116896c = list;
        this.f116894a = new SparseArray(list.size());
    }

    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i3;
        MethodCollector.i(9194);
        if (view == null) {
            view = View.inflate(this.f116895b, R.layout.anh, null);
        }
        a a2 = getItem(i2);
        this.f116894a.put(i2, a2.f116897a);
        View findViewById = view.findViewById(R.id.coi);
        ((TextView) view.findViewById(R.id.f17)).setText(a2.f116897a);
        if (a2.f116898b) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
        MethodCollector.o(9194);
        return view;
    }
}
