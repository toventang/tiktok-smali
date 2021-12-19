package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.client.c;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.List;
import java.util.Objects;

public final class u<T> {

    /* renamed from: a  reason: collision with root package name */
    public final c f42629a;

    /* renamed from: b  reason: collision with root package name */
    public final T f42630b;

    /* renamed from: c  reason: collision with root package name */
    public final TypedInput f42631c;

    /* renamed from: d  reason: collision with root package name */
    public s f42632d;

    static {
        Covode.recordClassIndex(26093);
    }

    public final int a() {
        return this.f42629a.f42474b;
    }

    public final List<b> b() {
        return this.f42629a.f42476d;
    }

    public static <T> u<T> a(TypedInput typedInput, c cVar) {
        Objects.requireNonNull(typedInput, "body == null");
        Objects.requireNonNull(cVar, "rawResponse == null");
        if (!cVar.a()) {
            return new u<>(cVar, null, typedInput);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> u<T> a(T t, c cVar) {
        Objects.requireNonNull(cVar, "rawResponse == null");
        if (cVar.a()) {
            return new u<>(cVar, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    private u(c cVar, T t, TypedInput typedInput) {
        this.f42629a = cVar;
        this.f42630b = t;
        this.f42631c = typedInput;
    }
}
