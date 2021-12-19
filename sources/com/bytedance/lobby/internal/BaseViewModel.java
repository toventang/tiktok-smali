package com.bytedance.lobby.internal;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;

public abstract class BaseViewModel<T> extends AndroidViewModel {

    /* renamed from: b  reason: collision with root package name */
    private t<T> f40229b = new t<>();

    static {
        Covode.recordClassIndex(24796);
    }

    public LiveData<T> g() {
        return this.f40229b;
    }

    public void b(T t) {
        this.f40229b.setValue(t);
    }

    BaseViewModel(Application application) {
        super(application);
    }
}
