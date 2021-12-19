package com.bytedance.android.live.design.app.b;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f9401a;

    /* renamed from: b  reason: collision with root package name */
    public int f9402b;

    static {
        Covode.recordClassIndex(4788);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f9403a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public int f9404b = 0;

        static {
            Covode.recordClassIndex(4789);
        }

        public final d a() {
            return new d(this, (byte) 0);
        }

        public final a a(b bVar) {
            if (bVar != null) {
                this.f9403a.add(bVar);
            }
            return this;
        }
    }

    private d(a aVar) {
        ArrayList arrayList = new ArrayList();
        this.f9401a = arrayList;
        arrayList.addAll(aVar.f9403a);
        this.f9402b = aVar.f9404b;
    }

    /* synthetic */ d(a aVar, byte b2) {
        this(aVar);
    }
}
