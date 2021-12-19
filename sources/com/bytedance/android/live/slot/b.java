package com.bytedance.android.live.slot;

import android.os.Bundle;
import androidx.lifecycle.ac;
import com.bytedance.android.live.slot.ab;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.lang.Enum;
import java.util.List;

public abstract class b<W, VM extends ac, T extends Enum<T>> implements ab<W, VM, T> {

    /* renamed from: a  reason: collision with root package name */
    public ac f12762a;

    /* renamed from: b  reason: collision with root package name */
    public ab.a f12763b;

    static {
        Covode.recordClassIndex(7096);
    }

    @Override // com.bytedance.android.live.slot.ab
    public List<Integer> a() {
        return null;
    }

    @Override // com.bytedance.android.live.slot.ab
    public void a(Bundle bundle) {
    }

    @Override // com.bytedance.android.live.slot.ab
    public void a(IMessage iMessage) {
    }

    @Override // com.bytedance.android.live.slot.ab
    public void a(String str) {
    }

    @Override // com.bytedance.android.live.slot.ab
    public void b() {
    }

    @Override // com.bytedance.android.live.slot.ab
    public void c() {
    }

    @Override // com.bytedance.android.live.slot.ab
    public void d() {
    }

    @Override // com.bytedance.android.live.slot.ab
    public void a(VM vm, ab.a aVar) {
        this.f12762a = vm;
        this.f12763b = aVar;
    }
}
