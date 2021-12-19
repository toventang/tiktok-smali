package com.ss.android.ugc.aweme.sharer.ui.bar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.sharer.b;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import java.util.List;

public final class ShareChannelBar extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    private List<? extends b> f124623a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private f f124624b;

    /* renamed from: c  reason: collision with root package name */
    private d f124625c;

    /* renamed from: d  reason: collision with root package name */
    private final RecyclerView f124626d;

    static {
        Covode.recordClassIndex(81891);
    }

    public final void a(f fVar) {
        l.d(fVar, "");
        this.f124624b = fVar;
    }

    public final void a(List<? extends b> list) {
        l.d(list, "");
        this.f124623a = list;
        this.f124625c.a(list);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.bar.f
    public final void a_(b bVar) {
        l.d(bVar, "");
        f fVar = this.f124624b;
        if (fVar != null) {
            fVar.a_(bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareChannelBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(10466);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.z7});
        l.b(obtainStyledAttributes, "");
        int color = obtainStyledAttributes.getColor(0, androidx.core.content.b.c(getContext(), R.color.a3));
        obtainStyledAttributes.recycle();
        a.a(LayoutInflater.from(getContext()), R.layout.ahh, this, true);
        View findViewById = findViewById(R.id.a4n);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f124626d = recyclerView;
        this.f124625c = new d(context, this, true, false, color);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        this.f124625c.a(this.f124623a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f124625c);
        MethodCollector.o(10466);
    }
}
