package com.bytedance.jedi.a.m;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;

final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<a> f39314a = new Comparator<a>() {
        /* class com.bytedance.jedi.a.m.a.AnonymousClass1 */

        static {
            Covode.recordClassIndex(24118);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(a aVar, a aVar2) {
            return (int) Math.abs(aVar.f39318e - aVar2.f39318e);
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<a> f39315b = new Comparator<a>() {
        /* class com.bytedance.jedi.a.m.a.AnonymousClass2 */

        static {
            Covode.recordClassIndex(24119);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(a aVar, a aVar2) {
            return (int) Math.abs(aVar.f39319f - aVar2.f39319f);
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final Comparator<a> f39316c = new Comparator<a>() {
        /* class com.bytedance.jedi.a.m.a.AnonymousClass3 */

        static {
            Covode.recordClassIndex(24120);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(a aVar, a aVar2) {
            return aVar.f39317d.getCanonicalName().compareTo(aVar2.f39317d.getCanonicalName());
        }
    };

    /* renamed from: d  reason: collision with root package name */
    public final Class<?> f39317d;

    /* renamed from: e  reason: collision with root package name */
    public long f39318e;

    /* renamed from: f  reason: collision with root package name */
    public long f39319f;

    static {
        Covode.recordClassIndex(24117);
    }

    public final String toString() {
        return "ClassHistogramElement[class=" + this.f39317d.getCanonicalName() + ", instances=" + this.f39318e + ", bytes=" + this.f39319f + "]";
    }

    public a(Class<?> cls) {
        this.f39317d = cls;
    }

    public final void a(long j2) {
        this.f39318e++;
        this.f39319f += j2;
    }
}
