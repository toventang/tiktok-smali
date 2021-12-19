package com.ss.android.ugc.aweme.kids.choosemusic.h;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.b.b;
import com.ss.android.ugc.aweme.kids.choosemusic.i.o;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

public final class l extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<o> f105717a = new ArrayList<>(3);

    /* renamed from: b  reason: collision with root package name */
    public k f105718b;

    /* renamed from: c  reason: collision with root package name */
    public c<b> f105719c;

    /* renamed from: d  reason: collision with root package name */
    private int f105720d;

    static {
        Covode.recordClassIndex(67693);
    }

    public final ArrayList<o> getMusicItemViews() {
        return this.f105717a;
    }

    private void a() {
        setOrientation(1);
        int i2 = 0;
        do {
            o oVar = new o(a.a(LayoutInflater.from(getContext()), R.layout.adm, null, false), this.f105720d);
            oVar.f105749m.setPadding(oVar.f105749m.getPaddingLeft(), 0, 0, 0);
            this.f105717a.add(oVar);
            oVar.a(this.f105718b, this.f105719c);
            addView(oVar.itemView);
            i2++;
        } while (i2 < 3);
    }

    public l(Context context, int i2) {
        super(context);
        MethodCollector.i(11346);
        this.f105720d = i2;
        a();
        MethodCollector.o(11346);
    }
}
