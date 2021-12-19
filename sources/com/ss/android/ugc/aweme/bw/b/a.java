package com.ss.android.ugc.aweme.bw.b;

import com.bytedance.covode.number.Covode;

public class a<M> {

    /* renamed from: a  reason: collision with root package name */
    public M f69568a;

    /* renamed from: b  reason: collision with root package name */
    public EnumC1574a f69569b;

    /* renamed from: c  reason: collision with root package name */
    public Throwable f69570c;

    static {
        Covode.recordClassIndex(42913);
    }

    public static <M> a<M> a() {
        a<M> aVar = new a<>();
        aVar.f69569b = EnumC1574a.LOADING;
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.bw.b.a$a  reason: collision with other inner class name */
    public enum EnumC1574a {
        INIT,
        SUCCESS,
        ERROR,
        LOADING,
        PROGRESS;

        static {
            Covode.recordClassIndex(42914);
        }
    }

    public static <M> a<M> a(M m2) {
        a<M> aVar = new a<>();
        aVar.f69569b = EnumC1574a.SUCCESS;
        aVar.f69568a = m2;
        return aVar;
    }

    public static <T extends Throwable, M> a<M> a(T t) {
        a<M> aVar = new a<>();
        aVar.f69569b = EnumC1574a.ERROR;
        aVar.f69570c = t;
        return aVar;
    }

    public static <M> a<M> a(EnumC1574a aVar, M m2) {
        a<M> aVar2 = new a<>();
        aVar2.f69569b = aVar;
        aVar2.f69568a = m2;
        return aVar2;
    }

    public static <T extends Throwable, M> a<M> a(EnumC1574a aVar, T t) {
        a<M> aVar2 = new a<>();
        aVar2.f69569b = aVar;
        aVar2.f69570c = t;
        return aVar2;
    }
}
