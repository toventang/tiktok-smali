package com.bytedance.ies.xelement.picker.a;

import com.bytedance.covode.number.Covode;
import java.util.List;

public final class a implements d<String> {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f37239a;

    static {
        Covode.recordClassIndex(22394);
    }

    @Override // com.bytedance.ies.xelement.picker.a.d
    public final int a() {
        return this.f37239a.size();
    }

    public a(List<String> list) {
        this.f37239a = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.ies.xelement.picker.a.d
    public final /* synthetic */ String a(int i2) {
        if (i2 < 0 || i2 >= this.f37239a.size()) {
            return "";
        }
        return this.f37239a.get(i2);
    }
}
