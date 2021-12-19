package com.ss.android.ugc.aweme.discover.helper;

import android.text.Spannable;
import android.text.SpannableString;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final h f81116b = i.a((h.f.a.a) b.f81119a);

    /* renamed from: c  reason: collision with root package name */
    public static final a f81117c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final c f81118a;

    public interface c {
        static {
            Covode.recordClassIndex(50420);
        }

        List<d> a();

        List<Object> a(String str, String str2, Position position);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(50418);
        }

        public static WeakHashMap<Object, Map<String, d>> a() {
            return (WeakHashMap) f.f81116b.getValue();
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b extends m implements h.f.a.a<WeakHashMap<Object, Map<String, d>>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f81119a = new b();

        static {
            Covode.recordClassIndex(50419);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ WeakHashMap<Object, Map<String, d>> invoke() {
            return new WeakHashMap();
        }
    }

    static {
        Covode.recordClassIndex(50417);
    }

    public f(c cVar) {
        l.d(cVar, "");
        this.f81118a = cVar;
    }

    public final SpannableString a(String str, String str2, int i2) {
        l.d(str, "");
        l.d(str2, "");
        SpannableString spannableString = new SpannableString(str);
        a(spannableString, str2, i2);
        return spannableString;
    }

    public final void a(Spannable spannable, String str, int i2) {
        d dVar;
        List<Position> positions;
        List<d> a2;
        l.d(spannable, "");
        l.d(str, "");
        List<d> a3 = this.f81118a.a();
        if (!(a3 == null || a3.isEmpty())) {
            Map<String, d> map = a.a().get(a3);
            if ((map == null || map.isEmpty()) && (a2 = this.f81118a.a()) != null) {
                l.d(a2, "");
                if (!a2.isEmpty()) {
                    Map<String, d> map2 = a.a().get(a2);
                    if (map2 == null) {
                        map2 = new LinkedHashMap<>();
                    }
                    for (T t : a2) {
                        String field = t.getField();
                        if (field != null) {
                            map2.put(field, t);
                        }
                    }
                    a.a().put(a2, map2);
                }
            }
            Map<String, d> map3 = a.a().get(a3);
            if (!(map3 == null || (dVar = map3.get(str)) == null || (positions = dVar.getPositions()) == null)) {
                for (T t2 : positions) {
                    String obj = spannable.toString();
                    int length = obj.length();
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    int codePointCount = obj.codePointCount(0, length);
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                    int codePointCount2 = obj.codePointCount(0, i2);
                    int begin = t2.getBegin() + codePointCount2;
                    int end = t2.getEnd() + codePointCount2;
                    if (begin >= 0 && codePointCount >= begin && end >= 0 && codePointCount >= end) {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        int offsetByCodePoints = obj.offsetByCodePoints(0, begin);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                        int offsetByCodePoints2 = obj.offsetByCodePoints(0, end);
                        c cVar = this.f81118a;
                        Position position = new Position();
                        position.setBegin(offsetByCodePoints);
                        position.setEnd(offsetByCodePoints2);
                        List<Object> a4 = cVar.a(obj, str, position);
                        if (a4 != null) {
                            Iterator<T> it = a4.iterator();
                            while (it.hasNext()) {
                                spannable.setSpan(it.next(), offsetByCodePoints, offsetByCodePoints2, 33);
                            }
                        }
                    }
                }
            }
        }
    }
}
