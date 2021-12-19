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

public final class MicroShareChannelBar extends FrameLayout implements f {

    /* renamed from: a  reason: collision with root package name */
    public List<? extends b> f124611a = z.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    public f f124612b;

    /* renamed from: c  reason: collision with root package name */
    public final d f124613c;

    /* renamed from: d  reason: collision with root package name */
    private final RecyclerView f124614d;

    static {
        Covode.recordClassIndex(81886);
    }

    @Override // com.ss.android.ugc.aweme.sharer.ui.bar.f
    public final void a_(b bVar) {
        l.d(bVar, "");
        f fVar = this.f124612b;
        if (fVar != null) {
            fVar.a_(bVar);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MicroShareChannelBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        l.d(attributeSet, "");
        MethodCollector.i(11120);
        boolean z = true;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.vf});
        l.b(obtainStyledAttributes, "");
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        a.a(LayoutInflater.from(getContext()), R.layout.ahj, this, true);
        View findViewById = findViewById(R.id.a4n);
        l.b(findViewById, "");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f124614d = recyclerView;
        d dVar = new d(context, this, com.ss.android.ugc.aweme.sharer.ui.b.a.f124606a == 0 ? false : z, z2);
        this.f124613c = dVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        dVar.a(this.f124611a);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dVar);
        MethodCollector.o(11120);
    }
}
