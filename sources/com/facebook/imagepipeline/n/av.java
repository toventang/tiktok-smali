package com.facebook.imagepipeline.n;

import com.bytedance.covode.number.Covode;
import com.facebook.common.b.h;
import java.util.Map;

public abstract class av<T> extends h<T> {

    /* renamed from: b  reason: collision with root package name */
    private final k<T> f48244b;

    /* renamed from: c  reason: collision with root package name */
    private final an f48245c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48246d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48247e;

    static {
        Covode.recordClassIndex(29126);
    }

    @Override // com.facebook.common.b.h
    public abstract void b(T t);

    /* access modifiers changed from: protected */
    public Map<String, String> c(T t) {
        return null;
    }

    @Override // com.facebook.common.b.h
    public void b() {
        an anVar = this.f48245c;
        String str = this.f48247e;
        String str2 = this.f48246d;
        anVar.requiresExtraMap(str);
        anVar.onProducerFinishWithCancellation(str, str2, null);
        this.f48244b.b();
    }

    @Override // com.facebook.common.b.h
    public void a(Exception exc) {
        an anVar = this.f48245c;
        String str = this.f48247e;
        String str2 = this.f48246d;
        anVar.requiresExtraMap(str);
        anVar.onProducerFinishWithFailure(str, str2, exc, null);
        this.f48244b.b(exc);
    }

    @Override // com.facebook.common.b.h
    public void a(T t) {
        Map<String, String> map;
        an anVar = this.f48245c;
        String str = this.f48247e;
        String str2 = this.f48246d;
        if (anVar.requiresExtraMap(str)) {
            map = c(t);
        } else {
            map = null;
        }
        anVar.onProducerFinishWithSuccess(str, str2, map);
        this.f48244b.b(t, 1);
    }

    public av(k<T> kVar, an anVar, String str, String str2) {
        this.f48244b = kVar;
        this.f48245c = anVar;
        this.f48246d = str;
        this.f48247e = str2;
        anVar.onProducerStart(str2, str);
    }
}
