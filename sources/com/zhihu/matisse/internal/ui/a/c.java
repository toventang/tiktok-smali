package com.zhihu.matisse.internal.ui.a;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.fragment.app.l;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.entity.Item;
import java.util.ArrayList;
import java.util.List;

public final class c extends l {

    /* renamed from: a  reason: collision with root package name */
    private ArrayList<Item> f156474a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f156475b = null;

    public interface a {
        static {
            Covode.recordClassIndex(103905);
        }
    }

    static {
        Covode.recordClassIndex(103904);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f156474a.size();
    }

    public final void a(List<Item> list) {
        this.f156474a.addAll(list);
    }

    public c(i iVar) {
        super(iVar);
    }

    public final Item c(int i2) {
        return this.f156474a.get(i2);
    }

    @Override // androidx.fragment.app.l
    public final Fragment a(int i2) {
        com.zhihu.matisse.internal.ui.c cVar = new com.zhihu.matisse.internal.ui.c();
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_item", this.f156474a.get(i2));
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.l
    public final void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        super.setPrimaryItem(viewGroup, i2, obj);
    }
}
