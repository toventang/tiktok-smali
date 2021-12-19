package com.ss.android.ugc.aweme.emoji.f;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.b.a;
import com.ss.android.ugc.aweme.emoji.b.e;
import com.ss.android.ugc.aweme.emoji.b.g;
import com.ss.android.ugc.aweme.emoji.b.h;
import com.ss.android.ugc.aweme.emoji.emojichoose.m;
import com.ss.android.ugc.aweme.emoji.emojichoose.n;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public final class b extends e implements g {

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f89315c;

    /* renamed from: d  reason: collision with root package name */
    private a f89316d;

    /* renamed from: e  reason: collision with root package name */
    private d f89317e;

    /* renamed from: f  reason: collision with root package name */
    private RecyclerView.i f89318f = this.f89318f;

    /* renamed from: g  reason: collision with root package name */
    private View f89319g = this.f89319g;

    /* renamed from: h  reason: collision with root package name */
    private final h f89320h;

    static {
        Covode.recordClassIndex(56122);
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final m a() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final void a(int i2) {
    }

    @Override // com.ss.android.ugc.aweme.emoji.b.g
    public final n b() {
        return null;
    }

    public b(h hVar, ViewGroup viewGroup, List<String> list, RecyclerView.h hVar2, int i2) {
        super(viewGroup);
        this.f89320h = hVar;
        View view = this.f89109b;
        this.f89315c = (RecyclerView) view.findViewById(R.id.avf);
        this.f89317e = new d(viewGroup.getContext());
        a aVar = new a(hVar, this.f89319g);
        this.f89316d = aVar;
        this.f89315c.setAdapter(aVar);
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            a aVar2 = new a();
            aVar2.f89105c = str;
            arrayList.add(aVar2);
        }
        a aVar3 = this.f89316d;
        aVar3.f89302a.clear();
        aVar3.f89302a.addAll(arrayList);
        aVar3.notifyDataSetChanged();
        RecyclerView.i iVar = this.f89318f;
        if (iVar == null) {
            view.getContext();
            iVar = new GridLayoutManager(i2);
        }
        this.f89315c.b(hVar2);
        this.f89315c.setLayoutManager(iVar);
    }
}
