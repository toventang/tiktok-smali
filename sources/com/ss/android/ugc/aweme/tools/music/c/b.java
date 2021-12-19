package com.ss.android.ugc.aweme.tools.music.c;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tools.music.c.a;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<Integer, List<a.AbstractC3709a>> f140425a = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private HashMap f140426b;

    static {
        Covode.recordClassIndex(91743);
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        HashMap hashMap = this.f140426b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Set<Integer> keySet = this.f140425a.keySet();
        l.b(keySet, "");
        Iterator<T> it = keySet.iterator();
        while (it.hasNext()) {
            this.f140425a.remove(it.next());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        List<a.AbstractC3709a> list = this.f140425a.get(Integer.valueOf(i2));
        if (list == null || list.isEmpty()) {
            this.f140425a.remove(Integer.valueOf(i2));
            return;
        }
        a.AbstractC3709a remove = list.remove(list.size() - 1);
        if (list.isEmpty()) {
            this.f140425a.remove(Integer.valueOf(i2));
        }
        if (remove != null) {
            remove.a(i3, intent);
        }
    }
}
