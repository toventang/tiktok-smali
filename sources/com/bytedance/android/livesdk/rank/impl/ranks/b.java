package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.core.f.y;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.model.message.c.d;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f20823a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(12328);
    }

    public static CharSequence a(com.bytedance.android.livesdk.model.message.c.b bVar) {
        l.d(bVar, "");
        try {
            String str = bVar.f19421a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1999756092:
                        if (str.equals("pm_mt_live_onedaytopone")) {
                            String a2 = y.a((int) R.string.eaa);
                            l.b(a2, "");
                            return a2;
                        }
                        break;
                    case -1999751557:
                        if (str.equals("pm_mt_live_onedaytopten")) {
                            return a(R.plurals.g0, bVar);
                        }
                        break;
                    case -1910768516:
                        if (str.equals("pm_mt_live_onedaytopthree")) {
                            return a(R.plurals.g1, bVar);
                        }
                        break;
                    case -1841902718:
                        if (str.equals("pm_mt_live_threemintopone")) {
                            String a3 = y.a((int) R.string.ec1);
                            l.b(a3, "");
                            return a3;
                        }
                        break;
                    case -1841898183:
                        if (str.equals("pm_mt_live_threemintopten")) {
                            return a(R.plurals.g5, bVar);
                        }
                        break;
                    case -1484949167:
                        if (str.equals("pm_mt_live_lastcall")) {
                            ArrayList arrayList = new ArrayList();
                            d dVar = bVar.f19424d.get(0);
                            l.b(dVar, "");
                            String str2 = dVar.f19435c;
                            l.b(str2, "");
                            arrayList.add(new a(str2, String.class));
                            d dVar2 = bVar.f19424d.get(1);
                            l.b(dVar2, "");
                            String str3 = dVar2.f19435c;
                            l.b(str3, "");
                            arrayList.add(new a(str3, Integer.TYPE));
                            d dVar3 = bVar.f19424d.get(2);
                            l.b(dVar3, "");
                            String str4 = dVar3.f19435c;
                            l.b(str4, "");
                            Class cls = Integer.TYPE;
                            arrayList.add(new a(str4, cls, cls));
                            d dVar4 = bVar.f19424d.get(1);
                            l.b(dVar4, "");
                            String str5 = dVar4.f19435c;
                            l.b(str5, "");
                            return a(R.plurals.fz, Integer.parseInt(str5), arrayList);
                        }
                        break;
                    case -537531462:
                        if (str.equals("pm_mt_live_threemintopthree")) {
                            return a(R.plurals.g6, bVar);
                        }
                        break;
                    case 529868629:
                        if (str.equals("pm_mt_live_threemintoptwenty")) {
                            return a(R.plurals.g7, bVar);
                        }
                        break;
                    case 909192915:
                        if (str.equals("pm_mt_live_onedaytoptwenty")) {
                            return a(R.plurals.g2, bVar);
                        }
                        break;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f20824a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f20825b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<?> f20826c;

        static {
            Covode.recordClassIndex(12329);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return l.a(this.f20824a, aVar.f20824a) && l.a(this.f20825b, aVar.f20825b) && l.a(this.f20826c, aVar.f20826c);
        }

        public final int hashCode() {
            String str = this.f20824a;
            int i2 = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Class<?> cls = this.f20825b;
            int hashCode2 = (hashCode + (cls != null ? cls.hashCode() : 0)) * 31;
            Class<?> cls2 = this.f20826c;
            if (cls2 != null) {
                i2 = cls2.hashCode();
            }
            return hashCode2 + i2;
        }

        public final String toString() {
            return "Param(value=" + this.f20824a + ", type=" + this.f20825b + ", toType=" + this.f20826c + ")";
        }

        public /* synthetic */ a(String str, Class cls) {
            this(str, cls, String.class);
        }

        public a(String str, Class<?> cls, Class<?> cls2) {
            l.d(str, "");
            l.d(cls, "");
            l.d(cls2, "");
            this.f20824a = str;
            this.f20825b = cls;
            this.f20826c = cls2;
        }
    }

    private static CharSequence a(int i2, com.bytedance.android.livesdk.model.message.c.b bVar) {
        d dVar = bVar.f19424d.get(0);
        l.b(dVar, "");
        String str = dVar.f19435c;
        l.b(str, "");
        a aVar = new a(str, Integer.TYPE);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aVar);
        d dVar2 = bVar.f19424d.get(0);
        l.b(dVar2, "");
        String str2 = dVar2.f19435c;
        l.b(str2, "");
        return a(i2, Integer.parseInt(str2), arrayList);
    }

    private static CharSequence a(int i2, int i3, List<a> list) {
        Object valueOf;
        int size = list.size();
        Object[] objArr = new Object[size];
        int size2 = list.size();
        String str = null;
        for (int i4 = 0; i4 < size2; i4++) {
            Class<?> cls = list.get(i4).f20825b;
            if (l.a(cls, Integer.TYPE)) {
                str = ((IGiftService) com.bytedance.android.live.t.a.a(IGiftService.class)).getAmountString(Long.parseLong(list.get(i4).f20824a));
            } else if (l.a(cls, String.class)) {
                str = list.get(i4).f20824a;
            }
            Class<?> cls2 = list.get(i4).f20826c;
            if (l.a(cls2, String.class)) {
                valueOf = str;
            } else if (l.a(cls2, Integer.TYPE)) {
                if ((str instanceof String) && str != null) {
                    valueOf = Integer.valueOf(Integer.parseInt(str));
                } else {
                    valueOf = null;
                }
            }
            objArr[i4] = valueOf;
        }
        String a2 = y.a(i2, i3, Arrays.copyOf(objArr, size));
        l.b(a2, "");
        return a2;
    }
}
