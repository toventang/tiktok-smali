package com.ss.android.ugc.playerkit.model;

import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;

public final class x {

    /* renamed from: f  reason: collision with root package name */
    public static final a f148848f = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f148849a = "";

    /* renamed from: b  reason: collision with root package name */
    public long f148850b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<e> f148851c;

    /* renamed from: d  reason: collision with root package name */
    public long f148852d;

    /* renamed from: e  reason: collision with root package name */
    public long f148853e;

    static {
        Covode.recordClassIndex(98020);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(98021);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final void a() {
        ArrayList<e> arrayList = this.f148851c;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList<e> arrayList2 = this.f148851c;
            if (arrayList2 == null) {
                l.a();
            }
            Iterator<e> it = arrayList2.iterator();
            while (it.hasNext()) {
                e next = it.next();
                this.f148852d += (long) next.f148720c;
                this.f148853e += (long) next.f148721d;
            }
        }
    }
}
