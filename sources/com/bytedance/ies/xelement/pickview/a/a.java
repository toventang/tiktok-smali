package com.bytedance.ies.xelement.pickview.a;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f37371a;

    static {
        Covode.recordClassIndex(22458);
    }

    @Override // com.bytedance.ies.xelement.pickview.a.c
    public final int a() {
        return this.f37371a.size();
    }

    public a(List<String> list) {
        this.f37371a = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.pickview.a.c
    public final /* synthetic */ String a(int i2) {
        if (i2 < 0 || i2 >= this.f37371a.size()) {
            return "";
        }
        return this.f37371a.get(i2);
    }
}
