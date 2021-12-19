package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.viewholder.s;
import com.ss.android.ugc.aweme.music.b.k;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class t extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<s> f70866a = new ArrayList<>(3);

    /* renamed from: b  reason: collision with root package name */
    public s f70867b;

    /* renamed from: c  reason: collision with root package name */
    public k<c> f70868c;

    /* renamed from: d  reason: collision with root package name */
    private int f70869d;

    static {
        Covode.recordClassIndex(43658);
    }

    public final ArrayList<s> getMusicItemViews() {
        return this.f70866a;
    }

    private void a() {
        setOrientation(1);
        int i2 = 0;
        do {
            s sVar = new s(a.a(LayoutInflater.from(getContext()), R.layout.aa2, null, false), this.f70869d);
            sVar.o.setPadding(sVar.o.getPaddingLeft(), 0, 0, 0);
            this.f70866a.add(sVar);
            sVar.a(this.f70867b, this.f70868c);
            addView(sVar.itemView);
            i2++;
        } while (i2 < 3);
    }

    public t(Context context, int i2) {
        super(context);
        MethodCollector.i(4964);
        this.f70869d = i2;
        a();
        MethodCollector.o(4964);
    }
}
